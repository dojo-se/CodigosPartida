import unittest

from app import app


class TestCase(unittest.TestCase):
    def setUp(self):
        self.app = app.test_client()

    def test_save(self):
        result = self.app.post('/save', data={'title': 'titulo', 'content': 'test'})
        self.assertEqual(result.data, b'test')
        self.assertEqual(result.status_code, 200)

    def test_fetchall(self):
        result = self.app.get('/fetchall')
        self.assertEqual(result.data, b'')
        self.assertEqual(result.status_code, 200)
        self.app.post('/save', data={'title': 'titulo', 'content': 'test'})
        result = self.app.get('/fetchall')
        self.assertEqual(result.data, b'test')
        self.assertEqual(result.status_code, 200)

    def test_fetchsingle(self):
        result = self.app.get('/fetch/asd')
        self.assertEqual(result.status_code, 404)
        self.app.post('/save', data={'title': 'asd', 'content': 'test'})
        result = self.app.get('/fetch/asd')
        self.assertEqual(result.data, b'test')
        self.assertEqual(result.status_code, 200)

    def test_clear(self):
        self.app.post('/save', data={'title': 'asd', 'content': 'test'})
        result = self.app.get('/clear')
        result = self.app.get('/fetchall')
        self.assertEqual(result.data, b'')
        self.assertEqual(result.status_code, 200)


    def tearDown(self):
        pass




if __name__ == '__main__':
    unittest.main()

# Dicas para utilização do Xcode e XCTest

O XCTest é o framework de testes nativos do Xcode. Existem outras alternativas, mas esta é a oficial.

O XCTest suporta as seguintes operações:

* XCTFail (format…)
* XCTAssertNil (a1, format…)
* XCTAssertNotNil (a1, format…)
* XCTAssert (a1, format…)
* XCTAssertTrue (a1, format…)
* XCTAssertFalse (a1, format…)
* XCTAssertEqualObjects (a1, a2, format…)
* XCTAssertEquals (a1, a2, format…)
* XCTAssertEqualsWithAccuracy (a1, a2, accuracy, format…)
* XCTAssertThrows (expression, format…)
* XCTAssertThrowsSpecific (expression, specificException, format…)
* XCTAssertThrowsSpecificNamed (expression, specificException, exceptionName, format…)
* XCTAssertNoThrow (expression, format…)
* XCTAssertNoThrowSpecific (expression, specificException, format…)
* XCTAssertNoThrowSpecificNamed (expression, specificExcepton, exceptionName, format…)


## Pegando um View Controller do Storyboard

```objective-c
- (void)setUp
{
    [super setUp];
    UIStoryboard *storyboard = [UIStoryboard storyboardWithName:@"Main" bundle:nil];
    self.vc = [storyboard instantiateViewControllerWithIdentifier:@"nomeDoViewController"];
    [self.vc performSelectorOnMainThread:@selector(loadView) withObject:nil waitUntilDone:YES];

    // Put setup code here. This method is called before the invocation of each test method in the class.
}
```

## Exemplos de XCTest

```objective-c
 - (void)testThatViewLoads
{
    // testa se uma view foi carregada
    XCTAssertNotNil(self.vc.view, @"A View não foi iniciar corretamente");
}

- (void)testParentViewHasTableViewSubview
{
    // testa se existe uma tableview como subview
    NSArray *subviews = self.vc.view.subviews;
    XCTAssertTrue([subviews containsObject:self.vc.tableView], @"A view não tem uma tableView");
}

- (void)testThatTableViewLoads
{
    // testa se a tableview foi iniciada
    XCTAssertNotNil(self.vc.tableView, @"TableView não foi iniciada");
}

- (void)testTableViewNumberOfRowsInSection
{
    // testa a quantidade de linhas de uma tabela
    NSInteger expectedRows = 15;
    XCTAssertTrue([self.vc tableView:self.vc.tableView numberOfRowsInSection:0]==expectedRows, @"A tabela tem %ld linhas mas deveria ter %ld", (long)[self.vc tableView:self.vc.tableView numberOfRowsInSection:0], (long)expectedRows);
}
```

## Vídeos, Slides e Tutoriais

<a href="http://www.youtube.com/watch?feature=player_embedded&v=amSApTmxqrc
" target="_blank"><img src="http://img.youtube.com/vi/amSApTmxqrcE/0.jpg"
alt="XCtests" width="240" height="180" border="10" /></a>

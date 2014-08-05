public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {

	MainActivity mActivity;
	TextView mText;
	Button mbutton;

	public MainActivityTest() {
		super(MainActivity.class);
	}

	public void setUp() throws Exception {
		mActivity = getActivity();
		mText = (TextView) findViewById(R.id.label_hello_world);
	}

	public testeSimples(){
		asserEquals(mText.getText(),"Hello world!");
	}
	
	//Teste de eventos após clicar em um botão.
	@UiThreadTest
	public void testeMudancaLabel(){
		mbotao.performClick();
		assertEquals(mtext.getText(), "Good bye world!");
	}
}

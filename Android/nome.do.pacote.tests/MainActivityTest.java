public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {

	MainActivity mActivity;
	TextView mText;

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
}

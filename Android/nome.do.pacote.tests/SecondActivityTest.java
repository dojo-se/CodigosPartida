package com.example.exemplo.tests;

import android.test.ActivityUnitTestCase;
import android.widget.TextView;

import com.example.exemplo.R;
import com.example.exemplo.SecondActivity;

public class SecondActivityTest extends ActivityUnitTestCase<SecondActivity>{
	
	SecondActivity mactivity;
	TextView mtext;
	
	public SecondActivityTest() {
		// TODO Auto-generated constructor stub
		super(SecondActivity.class);
	}
	
	@Override
	protected void setUp() throws Exception {
		// TODO Auto-generated method stub
		super.setUp();
		mactivity = getActivity();
		mtext = (TextView) mactivity.findViewById(R.id.label2);
	}
	
	public void testeSimplesSecond(){
		assertEquals(mtext.getText(), "Good bye world!");
	}

}

package com.example.exemplo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends Activity{
	
	TextView mtext;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		
		mtext = (TextView) findViewById(R.id.label2);
	}
	
	public TextView getMText(){
		return mtext;
	}

}

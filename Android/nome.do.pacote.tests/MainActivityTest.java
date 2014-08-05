package com.example.exemplo.tests;

import android.app.Instrumentation.ActivityMonitor;
import android.test.ActivityInstrumentationTestCase2;
import android.test.TouchUtils;
import android.test.ViewAsserts;
import android.view.KeyEvent;
import android.widget.Button;
import android.widget.TextView;

import com.example.exemplo.MainActivity;
import com.example.exemplo.R;
import com.example.exemplo.SecondActivity;

/*
 * Essa classe permite integração entre diferentes componentes. A comunicação entre
 * diferentes activities é feita através da classe Instrumentation e com ela é 
 * possível enviar eventos IO. Além disso, permite utilizar comandos que afetem o 
 * ciclo de vida da Activity, como onPause() e onDestroy().
 * 
 * Com essa classe, a Activity já é invocada no contexto do programa.
 */

public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity>{

	MainActivity mactivity;
	TextView mtext;
	Button mbotao;
	
	public MainActivityTest() {
		super(MainActivity.class);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected void setUp() throws Exception {
		// TODO Auto-generated method stub
		super.setUp();
		
		mactivity = getActivity();
		mtext = (TextView) mactivity.findViewById(R.id.label);
		mbotao = (Button) mactivity.findViewById(R.id.botao);
	}
	
	
	public void testeMudancaLabel(){
		assertEquals(mtext.getText(), "Hello world!");
		
		ActivityMonitor monitor = getInstrumentation().addMonitor(SecondActivity.class.getName(), null, false);
		
		TouchUtils.clickView(this, mactivity.findViewById(R.id.botao));
		
		//Aqui temos acesso à Activity que será invocada
		SecondActivity startedActivity = (SecondActivity) monitor.waitForActivityWithTimeout(500);
		assertNotNull(startedActivity);
		
		assertEquals(startedActivity.getMText().getText(), "Good bye world!");		
		
		this.sendKeys(KeyEvent.KEYCODE_BACK);
		
		ViewAsserts.assertOnScreen(startedActivity.getWindow().getDecorView(), mtext);
	}
	
}

package com.example.exemplo.tests;

import android.content.Intent;
import android.test.ActivityUnitTestCase;
import android.widget.Button;
import android.widget.TextView;

import com.example.exemplo.MainActivity;
import com.example.exemplo.R;

/*
 * Para testar uma Activity isoladamente deve-se usar a classeActivityUnitTestCase.
 * Essa classe permite que você faça testes com os componentes da classe corrente.
 * 
 * Os intents não são enviados para o sistema mas pode ser usado o método
 * getStartedActivityIntent() para fazer alguma validação do intent invocado. 
 *   
 * Nesse tipo de teste a classe não é iniciada automaticamente, por isso deve ser
 * invocada em setUp(). 
 */

public class MainActivityTest2 extends ActivityUnitTestCase<MainActivity>{

	MainActivity mactivity;
	TextView mtext;
	Button mbotao;
	
	public MainActivityTest2() {
		super(MainActivity.class);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected void setUp() throws Exception {
		// TODO Auto-generated method stub
		super.setUp();
		startActivity(new Intent(getInstrumentation().getTargetContext(),MainActivity.class),null, null);
		
		mactivity = getActivity();
		mtext = (TextView) mactivity.findViewById(R.id.label);
		mbotao = (Button) mactivity.findViewById(R.id.botao);
	}
	
	public void testeSimples(){
		assertEquals(mtext.getText(), "Hello world!");
	}	
	
	public void testeMudancaLabel(){		
		mbotao.performClick();
		
		//Aqui temos acesso apenas ao Intent, não podendo acessar
		//a Activity que é invocada por ele
		assertNotNull("SecondActivity eh null",getStartedActivityIntent());
	}
	
}

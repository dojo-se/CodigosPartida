package com.example.exemplo;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    TextView texto;
    Button botao;
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        texto = (TextView) findViewById(R.id.label);
        
        botao = (Button) findViewById(R.id.botao);
        botao.setOnClickListener(new OnClickListener() {			
			@Override
			public void onClick(View arg0) {
				texto.setText("Good bye world!");
			}
		});
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}

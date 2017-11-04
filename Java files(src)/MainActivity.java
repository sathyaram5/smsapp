package com.example.myapp;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

	EditText user, pass;
	Button login;
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        user=(EditText)findViewById(R.id.editText1);
        pass=(EditText)findViewById(R.id.editText2);
        login=(Button)findViewById(R.id.button1);
        login.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String username= user.getText().toString();
				String password= user.getText().toString();
				if(username.equals("admin")&& password.equals("admin"))
				{
					Toast.makeText(getApplicationContext(), "Login Sucess", Toast.LENGTH_LONG).show();
					Intent inn=new Intent(getApplicationContext(),Success.class);
					startActivity(inn);
				}
				else
				{
					Toast.makeText(getApplicationContext(), "Login Failed", Toast.LENGTH_LONG).show();
					
				}
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

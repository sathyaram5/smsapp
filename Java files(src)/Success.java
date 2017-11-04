package com.example.myapp;

import android.os.Bundle;
import android.app.Activity;
import android.telephony.SmsManager;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Success extends Activity {
	EditText mob, msg;
	Button Send;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_success);
		mob=(EditText)findViewById(R.id.editText1);
		msg=(EditText)findViewById(R.id.editText2);
		Send=(Button)findViewById(R.id.button1);
        Send.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String number=mob.getText().toString();
				String message=msg.getText().toString();
				
				try
				{
					SmsManager sms=SmsManager.getDefault();
					sms.sendTextMessage(number, null, message, null, null);
					Toast.makeText(getApplicationContext(), "SMS sent successfully", Toast.LENGTH_LONG).show();
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}

			}
        	
        	
        });

		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.success, menu);
		return true;
		
		
	}

}

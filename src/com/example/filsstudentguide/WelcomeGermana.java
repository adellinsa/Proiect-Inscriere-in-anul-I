package com.example.filsstudentguide;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class WelcomeGermana extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_welcome_germana);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.welcome_germana, menu);
		return true;
	}
	public void WelcomeDespreGermana(View view) {
	    Intent intent = new Intent(WelcomeGermana.this, DespreGermana.class);
	    startActivity(intent);
	}
	public void WelcomeAdmitereGermana(View view) {
	    Intent intent = new Intent(WelcomeGermana.this, AdmitereGermana.class);
	    startActivity(intent);
	}
	public void WelcomeOrientareGermana(View view) {
	    Intent intent = new Intent(WelcomeGermana.this, OrientareGermana.class);
	    startActivity(intent);
	}
	public void WelcomeTimpGermana(View view) {
	    Intent intent = new Intent(WelcomeGermana.this, TimpGermana.class);
	    startActivity(intent);
	}
	public void WelcomeAlteleGermana(View view) {
	    Intent intent = new Intent(WelcomeGermana.this, AlteleGermana.class);
	    startActivity(intent);
	}
	

}

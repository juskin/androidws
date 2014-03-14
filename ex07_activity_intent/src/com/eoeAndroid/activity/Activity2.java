package com.eoeAndroid.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Activity2 extends Activity {
	OnClickListener listener2 = null;
	Button button;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity2);
		listener2 = new OnClickListener() {
			public void onClick(View v) {
				finish();
			}
		};
		button = (Button) findViewById(R.id.button4);
		button.setOnClickListener(listener2);
		setTitle("现在是在Activity2里");
	}
}
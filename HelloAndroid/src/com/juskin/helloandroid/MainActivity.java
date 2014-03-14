package com.juskin.helloandroid;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
//import android.widget.TextView;

public class MainActivity extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.hello_world);

		Button button = (Button) findViewById(R.id.Button01);
		button.setOnClickListener(new OnClickListener() {
			public void onClick(View arg0) {
				openDialog();
			}
		});
	}

	private void openDialog() {
		AlertDialog.Builder builder = new AlertDialog.Builder(this);
		builder.setTitle("提示窗口");
		builder.setMessage("这是一个提示窗口。");
		builder.setNegativeButton("Exit", null);
		builder.show();
	}
}
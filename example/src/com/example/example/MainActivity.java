package com.example.example;


import viewinjector.ViewInjector;
import viewinjector.annotation.ContentView;
import viewinjector.annotation.ViewInject;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;


@ContentView(R.layout.activity_main)
public class MainActivity extends Activity {

	@ViewInject(R.id.button1)
	Button button;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
//		setContentView(R.layout.activity_main);
		
		ViewInjector.register().inject(this);
		
		button.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Log.e("TAG", "onclick");
				Toast.makeText(MainActivity.this, "hahaha", 1).show();
			}
		});
		
	}
	

}

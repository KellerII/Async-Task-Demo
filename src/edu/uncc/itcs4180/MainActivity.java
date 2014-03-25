/*
 * James Keller
 * In Class 3 (Take Home)
 * 3/11/14
 */

package edu.uncc.itcs4180;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

//Standard MainActivity that creates a button which creates a PhotoActivity where the 
//thumbnails are downloaded using an asynctask
public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		findViewById(R.id.button1).setOnClickListener(new View.OnClickListener() {
			//Begins the PhotoActivity 
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(MainActivity.this, PhotoActivity.class);
				startActivity(intent);
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

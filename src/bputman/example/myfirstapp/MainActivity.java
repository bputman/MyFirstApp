package bputman.example.myfirstapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;


//public class MainActivity extends ActionBarActivity {
public class MainActivity extends Activity {

	public final static String EXTRA_MESSAGE = "bputman.example.myfirstapp.MESSAGE";
	private static final String EXTRA_FLOATDATA = "bputman.example.myfirstapp.FLOATDATA";
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    
    public void sendMessage(View view) {
		// Do something in response to button click
    	Intent intent = new Intent(this, DisplayMessageActivity.class);
    	EditText editText = (EditText) findViewById(R.id.edit_message);
    	
    	// test convert input text into a float.
    	//float test = Float.parseFloat(editText.getText().toString());
    	//
    	String message = editText.getText().toString();
    	//float[] f = new float[3];
    	//f[0]=10f; f[1]=100f; f[2]=1000f;
    	intent.putExtra(EXTRA_MESSAGE, message);
    	//intent.putExtra(EXTRA_FLOATDATA, f);
    	startActivity(intent);
	}
    
//    public void updateImage(View view) {
//    	Intent intent = new Intent(this, DisplayMessageActivity.class);
//    	EditText e = (EditText) findViewById(R.id.seek_bar_freq);
//    	
//    }
}

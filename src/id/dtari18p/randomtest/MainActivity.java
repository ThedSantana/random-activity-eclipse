package id.dtari18p.randomtest;

import java.util.Random;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

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
    
    public void btnrandom(View v){
    	Random rnd = new Random();
    	int x=rnd.nextInt(6)+1;
    	         Intent intent = new Intent();
    	switch(x){
    	 case 1:
    	  intent.setClass(this,FirstActivity.class);
    	  break;
    	 case 2:
    	  intent.setClass(this,SecondActivity.class);
    	  break;
    	 case 3:
    	  intent.setClass(this,ThirdActivity.class);
    	  break;
    	 case 4:
       	  intent.setClass(this,ForthActivity.class);
       	  break;
    	 case 5:
       	  intent.setClass(this,FifthActivity.class);
       	  break;
    	 case 6:
       	  intent.setClass(this,SixthActivity.class);
       	  break;
    	 }
    	 startActivity(intent);        
    	}
    
}

package com.sdastreaming.littlecreekfellowship;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener {

	Button button1, button2, button3, button4, button5; 

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		  button1 = (Button) findViewById(R.id.Buttonls);
	      button2 = (Button) findViewById(R.id.Buttonyt);
	      button3 = (Button) findViewById(R.id.Buttonfb);
	      button4 = (Button) findViewById(R.id.buttondir);
	      button5 = (Button) findViewById(R.id.Buttonbeliefs);
	      

	      button1.setOnClickListener(this);
	      button2.setOnClickListener(this);
	      button3.setOnClickListener(this);
	      button4.setOnClickListener(this);
	      button5.setOnClickListener(this);
	   }

	   public void onClick(View v) {
		   
	       switch(v.getId()) {
	           case R.id.Buttonls:
	        	   Intent intent1 = new Intent(Intent.ACTION_VIEW);
	        	   intent1.setData(Uri.parse("http://m.littlecreekfellowship.com"));
	        	   startActivity(intent1);
	               break;
	           case R.id.Buttonyt:
	        	   Intent intent2 = new Intent(Intent.ACTION_VIEW);
	        	   intent2.setData(Uri.parse("http://www.youtube.com/user/littlecreekvideo"));
	        	   startActivity(intent2);
	               break;
	           case R.id.Buttonfb:
	        	   Intent intent3 = new Intent(Intent.ACTION_VIEW);
	        	   intent3.setData(Uri.parse("http://www.facebook.com/Littlecreeksda"));
	        	   startActivity(intent3);
		           break;
	           case R.id.buttondir:
	        	   Intent intent4 = new Intent(android.content.Intent.ACTION_VIEW, 
	        		  Uri.parse("http://maps.google.com/maps?q=2585+Little+Creek+Church+Road,+Clayton,+NC&hl=en&sll=37.0625,-95.677068&sspn=56.637293,114.169922&oq=2585+little+creek+church&hnear=2585+Little+Creek+Church+Rd,+Clayton,+North+Carolina+27520&t=m&z=17"));
	        	      startActivity(intent4);
		           break;
	           case R.id.Buttonbeliefs:
	        	   Intent intent5 = new Intent(this, StudyActivity.class); 
	         	      startActivity(intent5);
		           break;
	   }
	}
}


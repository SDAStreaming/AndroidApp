package com.sdastreaming.littlecreekfellowship;

import java.util.ArrayList;
import java.util.Arrays;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class StudyActivity extends Activity {
	
	  private ListView mainListView;  
	  private ArrayAdapter<String> listAdapter;  
	    
	  /** Called when the activity is first created. */  
	  @Override  
	  public void onCreate(Bundle savedInstanceState) {  
	    super.onCreate(savedInstanceState); 
	    setContentView(R.layout.activity_study);  

	      
	    // Find the ListView resource.   
	    mainListView = (ListView) findViewById( R.id.mainListView );  
	  
	    // Create and populate a List of Studies.  
	    String[] studies = new String[] { "Word of God", "Signs of the Times", "The Great Controversy", "Salvation",  
	                                      "AntiChrist  Part 1", "AntiChrist Part 2", "Law of God", "Sabbath", "Second Coming", "Millennium", "Hell",  
	                                      "State of the Dead", "Judgement", "Daniel 9", "2300 Days", "Baptism", "Mark of the Beast", "Remnant Church", "Spirit of Prophecy", "Stewartship", "Prayer", "Christian Living", "Health", "Witnessing"};  
	    
	    ArrayList<String> studiesList = new ArrayList<String>();  
	    studiesList.addAll( Arrays.asList(studies) );  
	      
	    // Create ArrayAdapter using the studies list.  
	    listAdapter = new ArrayAdapter<String>(this, R.layout.simplerow, studiesList);  
	    // listAdapter.add( "Extra Study" );  
	    	      
	    // Set the ArrayAdapter as the ListView's adapter.  
	    mainListView.setAdapter( listAdapter );    
	    mainListView.setClickable(true);
	  	mainListView.setOnItemClickListener(new OnItemClickListener(){

				public void onItemClick(AdapterView<?> adapter, View view, int position, long id) { 
			
					  Intent intent = new Intent(StudyActivity.this, bs.class); 
					  intent.putExtra("Position", position);
		         	  startActivity(intent);
				}	  		
		  	}); 	
	  }  
	} 
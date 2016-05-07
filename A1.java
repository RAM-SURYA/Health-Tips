package com.example.healthtips;


import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class A1 extends Activity implements AdapterView.OnItemClickListener {
	ListView l1;
	String[] str={"Cold","Headache","Fever","StoamchPain","Jaundice","SmallPox","Armpain","BackPain",
			"Cavities","Drandruff","Eyealergy","Gumdiseases","HeartAttack","Irondeficienc","Knee pain","LegPain","Migraine","NeckPain"
			,"Oralcare","Pinkeye","Ringworm"};
	
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a1);
        l1=(ListView)findViewById(R.id.listView1);
        l1.setOnItemClickListener((OnItemClickListener) this);
        ArrayAdapter<String> adapt=new ArrayAdapter<String>(A1.this,android.R.layout.simple_list_item_1, str);
        l1.setAdapter(adapt);
    }
	

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.a1, menu);
        return true;
    }


	public void onItemClick(AdapterView<?> parent,View v,int position, long arg3) {
		int itemPosition=position;
		String itemValue=(String)l1.getItemAtPosition(position);
		if(itemPosition==0)
		{
			Bundle bun=new Bundle();
		Intent i1=new Intent(A1.this,A2.class);
		bun.putString("Text","1. Wash your hands often.\n"
				+ "2. Avoid touching your face\n "
				+ "3. Avoid touching your face\n "+"4. Don't smoke.\n" + "5. Keep household surfaces clean");
		  i1.putExtras(bun);
		    Log.i("value sent", "ok");
		startActivity(i1);
		}
		else if(itemPosition==1)
		{
			Bundle bun=new Bundle();
		Intent i1=new Intent(A1.this,A2.class);
		bun.putString("Text","1. Close your eyes and rest.\n"
				+ "2. Massage your neck and temples\n" + "3. Warm up your neck\n" + "4. Watch what you eat and drink.\n"
				+ "5. Minimize stress.");
		  i1.putExtras(bun);
		    Log.i("value sent", "ok");
		startActivity(i1);
		}
		else if(itemPosition==2)
		{
			Bundle bun=new Bundle();
		Intent i1=new Intent(A1.this,A2.class);
		bun.putString("Text","1. Place a cool, damp washcloth on your child's forehead while she rests.\n" +
		"2. Offer your child plenty of fluids and chilled foods, such as ice pops and yogurt, to help cool the body from the inside out and keep her hydrated./n"
		+ "Stay indoors in a cool place. Or, if you're outside, stay in the shade.");
		  i1.putExtras(bun);
		    Log.i("value sent", "ok");
		startActivity(i1);
		}
		else if(itemPosition==3)
		{
			Bundle bun=new Bundle();
		Intent i1=new Intent(A1.this,A2.class);
		bun.putString("Text","1. Drink clear liquids\n."+"2.To make rice water, first rinse the rice with about a cup of water to remove any dirt. \n"+
		"3. Drink apple-cider vinegar.");
		  i1.putExtras(bun);
		    Log.i("value sent", "ok");
		startActivity(i1);
		}
		else if(itemPosition==4)
		{
			Bundle bun=new Bundle();
		Intent i1=new Intent(A1.this,A2.class);
		bun.putString("Text","1. Avoid spicy and fried foods.\n"+"2. Avoid junk and carbohydrate rich foods as liver needs to produce more bile to digest these foods and that may aggravate the condition.\n"+"3. Avoid alcohol, coffee and tea.\n"+"4. Drink boiled water and avoid non-pasteurized milk.\n"
);
		  i1.putExtras(bun);
		    Log.i("value sent", "ok");
		startActivity(i1);
		}
		else if(itemPosition==5)
		{
			Bundle bun=new Bundle();
		Intent i1=new Intent(A1.this,A2.class);
		bun.putString("Text","1. Stay away from, and keep your children away from, anyone who might have smallpox."
+"2. Avoid being in enclosed areas with others who may be sick, such as buses and trains.\n"
+"3. Do not touch the skin area where someone had a smallpox vaccine placed.\n"
+"4. Wash your hands regularly and avoid touching your eyes, nose, and mouth.");
		  i1.putExtras(bun);
		    Log.i("value sent", "ok");
		startActivity(i1);
		}
		else if(itemPosition==6)
		{
			Bundle bun=new Bundle();
		Intent i1=new Intent(A1.this,A2.class);
		bun.putString("Text","1. See if you have a simple sprain\n"+"2. Determine if you have tennis elbow or golfer’s elbow. \n"+"3.  Check for symptoms of bursitis\n"
		+"4. Check for symptoms of angina");
		  i1.putExtras(bun);
		    Log.i("value sent", "ok");
		startActivity(i1);
		}
		else if(itemPosition==7)
		{
			Bundle bun=new Bundle();
		Intent i1=new Intent(A1.this,A2.class);
		bun.putString("Text","1. Get more exercise. /n"+"2. Watch your weight./n"+"3. If you smoke, stop/n"+"4. Sleeping position.");
		  i1.putExtras(bun);
		    Log.i("value sent", "ok");
		startActivity(i1);
		}
		else if(itemPosition==8)
		{
			Bundle bun=new Bundle();
		Intent i1=new Intent(A1.this,A2.class);
		bun.putString("Text","1. Brush regularly. \n"+"2. Use mouthwash.\n"+"3. Make dental visits a routine\n"+"4. Consider dental sealants\n");
		  i1.putExtras(bun);
		    Log.i("value sent", "ok");
		startActivity(i1);
		}
		else if(itemPosition==9)
		{
			Bundle bun=new Bundle();
		Intent i1=new Intent(A1.this,A2.class);
		bun.putString("Text","1. lack of proper hair care\n"+"2. yeast allergy\n"+"3. dry skin\n"+"4. lack of shampooving");
		  i1.putExtras(bun);
		    Log.i("value sent", "ok");
		startActivity(i1);
		}
		else if(itemPosition==10)
		{
			Bundle bun=new Bundle();
		Intent i1=new Intent(A1.this,A2.class);
		bun.putString("Text","1. Avoid eye allergies by reducing your exposure to allergens.\n"+"2. Take your antihistamine.\n"
		+"3. Use allergy eye drops as needed.\n"+"4. Employ comfort measures.");
		  i1.putExtras(bun);
		    Log.i("value sent", "ok");
		startActivity(i1);
		}
		else if(itemPosition==11)
		{
			Bundle bun=new Bundle();
		Intent i1=new Intent(A1.this,A2.class);
		bun.putString("Text","1. Give Your Mouth an Improved Routine\n"+"2. Get a Thorough Cleaning\n"
		+"3. Pick up Medicated Reinforcements\n"+"4. Leave It to the Experts");
		  i1.putExtras(bun);
		    Log.i("value sent", "ok");
		startActivity(i1);
		}
		else if(itemPosition==12)
		{
			Bundle bun=new Bundle();
		Intent i1=new Intent(A1.this,A2.class);
		bun.putString("Text","1. Gingivitis\n"+"2. Gingivitis\n"+"3. Pericoronitis. \n"+"4. Cavities.\n");
		  i1.putExtras(bun);
		    Log.i("value sent", "ok");
		startActivity(i1);
		}
		else if(itemPosition==13)
		{
			Bundle bun=new Bundle();
		Intent i1=new Intent(A1.this,A2.class);
		bun.putString("Text","1. Eat a Healthy Diet that Includes Good Sources of Iron 2\n"+ "2. Eat Foods that Help You Absorb Iron 3\n"
		+"3. Do Not Attempt to Self-Medicate 4\n"+"4.Keep Talking to Your Health Care Provider");
		  i1.putExtras(bun);
		    Log.i("value sent", "ok");
		startActivity(i1);
		}
		else if(itemPosition==14)
		{
			Bundle bun=new Bundle();
		Intent i1=new Intent(A1.this,A2.class);
		bun.putString("Text","1. Wear proper shoes-\n"+"2. Avoid wearing heels for long-\n"+"3.  Do not indulge in an intense physical activity all of a sudden\n"+"4. Keep active, say no to a sedentary lifestyle\n");
		  i1.putExtras(bun);
		    Log.i("value sent", "ok");
		startActivity(i1);
		}
		else if(itemPosition==15)
		{
			Bundle bun=new Bundle();
		Intent i1=new Intent(A1.this,A2.class);
		bun.putString("Text","1. Make sure you are eating enough protein\n"
				+"2.You might have low iron stores. \n "+"3. Food sensitivities\n"+"4. \nCeliac disease,");
		  i1.putExtras(bun);
		    Log.i("value sent", "ok");
		startActivity(i1);
		}
		else if(itemPosition==16)
		{
			Bundle bun=new Bundle();
		Intent i1=new Intent(A1.this,A2.class);
		bun.putString("Text","1. Establish regular sleep hours.\n"+"2.Unwind at the end of the day\n"
		+"3. Minimize distractions.\n"+"4. Don't try to sleep. check your meditation\n");
		  i1.putExtras(bun);
		    Log.i("value sent", "ok");
		startActivity(i1);
		}
		else if(itemPosition==17)
		{
			Bundle bun=new Bundle();
		Intent i1=new Intent(A1.this,A2.class);
		bun.putString("Text","1.Sleep with a cervical pillow.\n"+"2.Sleep on your back.\n"
		+"3.Position your computer screen at eye level.\n"+"4. Stay hydrated.\n");
		  i1.putExtras(bun);
		    Log.i("value sent", "ok");
		startActivity(i1);
		}
		else if(itemPosition==18)
		{
			Bundle bun=new Bundle();
		Intent i1=new Intent(A1.this,A2.class);
		bun.putString("Text","1. Limit Sodas, Coffee and Alcohol\n"
				+"2.Avoid Tobacco\n"+"3.flossing\n"+"4. Consume Calcium and other Vitamins that are good for the body");
		  i1.putExtras(bun);
		    Log.i("value sent", "ok");
		startActivity(i1);
		}
		else if(itemPosition==19)
		{
			Bundle bun=new Bundle();
		Intent i1=new Intent(A1.this,A2.class);
		bun.putString("Text","1. Clean With a Warm Washcloth\n"
				+"2. See a Doctor\n"+"3. Practice Good Hygiene\n"+"4.5. Make Sure the Contagion Has Cleared");
		  i1.putExtras(bun);
		    Log.i("value sent", "ok");
		startActivity(i1);
		}
		else if(itemPosition==20)
		{
			Bundle bun=new Bundle();
		Intent i1=new Intent(A1.this,A2.class);
		bun.putString("Text","1. Wash the rash with soap and water, and dry thoroughly.\n"
				+"2.Apply antifungal cream beyond the edge or border of the rash.\n"
				+"3. Don't stop using the medicine just because your symptoms go away.\n"
				+"4. If symptoms do not improve after 2 weeks, call your doctor.");
		  i1.putExtras(bun);
		    Log.i("value sent", "ok");
		startActivity(i1);
		}
	}


}

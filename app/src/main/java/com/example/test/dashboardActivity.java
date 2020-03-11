package com.example.test;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class dashboardActivity extends Activity  implements View.OnClickListener {
 ViewFlipper v_flipper;
 private CardView Cardcontrol,Cardfiew,Cardnews,Cardhelp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

            Cardcontrol = (CardView)  findViewById(R.id.cardcontrol);
            Cardfiew = (CardView)  findViewById(R.id.cardfiew);
            Cardnews = (CardView) findViewById(R.id.cardnews);
            Cardhelp = (CardView) findViewById(R.id.cardhelp);


            Cardcontrol.setOnClickListener(this);
            Cardfiew.setOnClickListener(this);
            Cardnews.setOnClickListener(this);
            Cardhelp.setOnClickListener(this);


        int images[] = {R.drawable.baner1digitan, R.drawable.banerdigitan2, R.drawable.banerdigitan3, R.drawable.banerdigitan4};

        v_flipper = findViewById(R.id.flipper);
// loop versi for
    //    for (int i =0 ; i < images.length; i++ ){
    //        flipperIamges(images[i]);
      //  }

// lopp versi foreach
        for (int image:images){
            flipperIamges(image);
        }


    }

    public void flipperIamges(int image){
        ImageView imageView =  new ImageView(getBaseContext());
        imageView.setBackgroundResource(image);

        v_flipper.addView(imageView);
        v_flipper.setFlipInterval(4000);
        v_flipper.setAutoStart(true);

        //animasi

        v_flipper.setInAnimation(this, android.R.anim.slide_in_left);
        v_flipper.setOutAnimation(this, android.R.anim.slide_out_right);



    }

    @Override
    public void onClick(View v) {

        Intent i;

         switch (v.getId()) {
             case R.id.cardcontrol : i  = new Intent(this,MainActivity.class);startActivity(i); break;
             case R.id.cardfiew : i = new Intent(this, viewActivity.class);startActivity(i); break;
             case R.id.cardnews : i = new Intent(this, newsActivity.class);startActivity(i); break;
             case R.id.cardhelp : i = new Intent(this, helpActivity.class); startActivity(i);break;
             default:break;

         }
    }
}

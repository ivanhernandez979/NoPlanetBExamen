package com.example.NoPlanetTheme;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class BSplash extends AppCompatActivity {
protected TextView tv_arriba;
TextView tx;
  @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
     // Typeface face=Typeface.createFromAsset(getAssets(),"fonts/bromello.otf");
      //txtV.setTypeface(face);

      setContentView(R.layout.activity_bsplash);
     openApp(true);

   //  TextView tx = (TextView)findViewById(R.id.tv_arriba);

    // Typeface custom_font = Typeface.createFromAsset(getAssets(),  "fonts/abc.ttf");
    //  TV=(TextView)findViewById(R.id.tv_arriba);
    //  String font_path="fonts/bromello.ttf";
   //   Typeface TF = Typeface.createFromAsset(getAssets(), font_path);
    //  TV.setTypeface(TF);

      //tx.setTypeface(custom_font);

  }
 //   TextView myTitle = (TextView)findViewById(R.id.tv_abajo);
 //  TextView mySubtitle = (TextView)findViewById(R.id.tv_arriba);
  //  ImageView myImage = (ImageView)findViewById(R.id.im_cohete);

//        // sets a Pretty Custom Font
//
//        myTitle.setTypeface(myFont);
 /*
    Typeface typeface = getResources().getFont(R.drawable.bromello);
       myTitle.setTypeface(typeface);
        mySubtitle.setTypeface(typeface);
    anim = (AnimationDrawable)container.getBackground();
        anim.setEnterFadeDuration(1000);
        anim.setExitFadeDuration(1000);

    Animation bounce = AnimationUtils.loadAnimation(this, R.anim.anim_top_in);
    Animation fadeIn = AnimationUtils.loadAnimation(this, R.anim.anim_fade_in);

        myImage.startAnimation(bounce);
        myTitle.startAnimation(fadeIn);
        mySubtitle.startAnimation(fadeIn);
    openApp(true);
    @Override
    protected void onResume() {
        super.onResume();
        if (anim != null && !anim.isRunning())
            anim.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (anim != null && anim.isRunning())
            anim.stop();
    }
*/

    private void openApp(boolean locationPermission) {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(BSplash
                        .this, BLogin.class);
                startActivity(intent);
                finish();
            }
        }, 3000);
    }

}


package com.example.fitprogram;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    TextView titlepage,subtitlepage,btnexercise;
    ImageView imgpage;
    Animation animimgpage,bttone,bttwo,btthree,ltr;
    View bgprogress,bgprogresstop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // load animation
        animimgpage = AnimationUtils.loadAnimation(this,R.anim.animimgpage);
        bttone = AnimationUtils.loadAnimation(this, R.anim.bttone);
        bttwo = AnimationUtils.loadAnimation(this, R.anim.bttwo);
        btthree = AnimationUtils.loadAnimation(this, R.anim.btthree);
        ltr = AnimationUtils.loadAnimation(this, R.anim.ltr);

        // import font
        Typeface MLight = Typeface.createFromAsset(getAssets(), "fonts/MLight.ttf");
        Typeface MMedium = Typeface.createFromAsset(getAssets(), "fonts/MMedium.ttf");
        Typeface Vidaloka = Typeface.createFromAsset(getAssets(), "fonts/Vidaloka.ttf");

        titlepage = (TextView) findViewById(R.id.titlepage);
        subtitlepage = (TextView) findViewById(R.id.subtitlepage);
        btnexercise = (TextView) findViewById(R.id.btnexercise);
        imgpage = (ImageView) findViewById(R.id.imgpage);
        bgprogress = (View) findViewById(R.id.bgprogress);
        bgprogresstop = (View) findViewById(R.id.bgprogresstop);

        // customize font
        titlepage.setTypeface(Vidaloka);
        subtitlepage.setTypeface(MLight);
        btnexercise.setTypeface(MMedium);

        // export animate
        imgpage.startAnimation(animimgpage);
        titlepage.startAnimation(bttone);
        subtitlepage.startAnimation(bttone);

        btnexercise.startAnimation(btthree);
        bgprogress.startAnimation(bttwo);
        bgprogresstop.startAnimation(ltr);

        // give an event to another page
        btnexercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(MainActivity.this,WorkoutAct.class);
                a.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(a);
            }
        });
    }
}

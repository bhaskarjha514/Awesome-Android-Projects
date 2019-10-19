package com.example.fitprogram;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.TextView;

public class WorkoutAct extends AppCompatActivity {
   TextView titlepage,subtitlepage,intropage,subintropage,btnexercise,fitonetitle,fitonedesc, fittwotitle,fittwodesc,fitthreetitle,fitthreedesc,fitfourtitle,fitfourdesc;
   Animation bttone,bttwo,btthree,bttfour,bttfive,bttsix,bttseven,btteight;
   View divpage,bgprogress;
   LinearLayout fitone, fittwo, fitthree, fitfour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout);

        // load animation
        bttone = AnimationUtils.loadAnimation(this, R.anim.bttone);
        bttwo = AnimationUtils.loadAnimation(this, R.anim.bttwo);
        btthree = AnimationUtils.loadAnimation(this, R.anim.btthree);
        bttfour = AnimationUtils.loadAnimation(this, R.anim.bttfour);
        bttfive = AnimationUtils.loadAnimation(this, R.anim.bttfive);
        bttsix = AnimationUtils.loadAnimation(this, R.anim.bttsix);
        bttseven = AnimationUtils.loadAnimation(this, R.anim.bttseven);
        btteight = AnimationUtils.loadAnimation(this, R.anim.btteight);

        // import font
        Typeface MLight = Typeface.createFromAsset(getAssets(), "fonts/MLight.ttf");
        Typeface MMedium = Typeface.createFromAsset(getAssets(), "fonts/MMedium.ttf");
        Typeface Vidaloka = Typeface.createFromAsset(getAssets(), "fonts/Vidaloka.ttf");

        titlepage = (TextView) findViewById(R.id.titlepage);
        subtitlepage = (TextView) findViewById(R.id.subtitlepage);
        intropage = (TextView) findViewById(R.id.intropage);
        subintropage = (TextView) findViewById(R.id.subintropage);
        btnexercise = (TextView) findViewById(R.id.btnexercise);
        divpage = (View) findViewById(R.id.divpage);
        bgprogress = (View) findViewById(R.id.bgprogress);

        // give an event to another page
        btnexercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(WorkoutAct.this,StartWorkAct.class);
                a.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(a);
            }
        });

        // item fit layout
        fitone = (LinearLayout) findViewById(R.id.fitone);
        fittwo = (LinearLayout) findViewById(R.id.fittwo);
        fitthree = (LinearLayout) findViewById(R.id.fitthree);
        fitfour = (LinearLayout) findViewById(R.id.fitfour);


        // item fit
        fitonetitle = (TextView) findViewById(R.id.fitonetitle);
        fitonedesc = (TextView) findViewById(R.id.fitonedesc);

        fittwotitle = (TextView) findViewById(R.id.fittwotitle);
        fittwodesc = (TextView) findViewById(R.id.fittwodesc);

        fitthreetitle = (TextView) findViewById(R.id.fitthreetitle);
        fitthreedesc = (TextView) findViewById(R.id.fitthreedesc);

        fitfourtitle = (TextView) findViewById(R.id.fitfourtitle);
        fitfourdesc = (TextView) findViewById(R.id.fitfourdesc);

        // customize font
        titlepage.setTypeface(Vidaloka);
        subtitlepage.setTypeface(MLight);
        intropage.setTypeface(Vidaloka);
        subintropage.setTypeface(MLight);
        btnexercise.setTypeface(MMedium);

        // customize font item
        fitonetitle.setTypeface(MLight);
        fitonedesc.setTypeface(MMedium);

        fittwotitle.setTypeface(MLight);
        fittwodesc.setTypeface(MMedium);

        fitthreetitle.setTypeface(MLight);
        fitthreedesc.setTypeface(MMedium);

        fitfourtitle.setTypeface(MLight);
        fitfourdesc.setTypeface(MMedium);

        // assign the animations
        titlepage.startAnimation(bttone);
        subtitlepage.startAnimation(bttone);
        divpage.startAnimation(bttone);

        intropage.startAnimation(bttwo);
        subintropage.startAnimation(bttwo);

        fitone.startAnimation(bttwo);
        fittwo.startAnimation(bttfour);

        fitthree.startAnimation(bttfive);
        fitfour.startAnimation(bttsix);
//
        btnexercise.startAnimation(btteight);
        bgprogress.startAnimation(bttseven);
    }
}

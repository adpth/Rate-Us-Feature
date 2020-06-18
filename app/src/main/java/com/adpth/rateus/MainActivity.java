package com.adpth.rateus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView ratetitle,rateanswer;
    Button ratesubmit;
    ImageView imageView;
    RatingBar ratingstars;
    String result;

    Animation image_anim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ratetitle = findViewById(R.id.rate_title);
        rateanswer = findViewById(R.id.rate_answer);
        imageView = findViewById(R.id.one);
        ratesubmit = findViewById(R.id.submit_rating);
        ratingstars = findViewById(R.id.rating);

        image_anim = AnimationUtils.loadAnimation(this,R.anim.image_anim);
        imageView.startAnimation(image_anim);

        ratingstars.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {

                result = String.valueOf((int) (ratingstars.getRating()));

                if (result.equals("1")){
                    imageView.setImageResource(R.drawable.one);
                    imageView.startAnimation(image_anim);
                    rateanswer.setText("Sorry for inconvenient Service");
                }
                else if(result.equals("2")){
                    imageView.setImageResource(R.drawable.two);
                    imageView.startAnimation(image_anim);
                    rateanswer.setText("Good");
                }
                else if(result.equals("3")){
                    imageView.setImageResource(R.drawable.three);
                    imageView.startAnimation(image_anim);
                    rateanswer.setText("Great");
                }
                else if(result.equals("4")){
                    imageView.setImageResource(R.drawable.four);
                    imageView.startAnimation(image_anim);
                    rateanswer.setText("Excellent");
                }
                else if(result.equals("5")){
                    imageView.setImageResource(R.drawable.five);
                    imageView.startAnimation(image_anim);
                    rateanswer.setText("Thank you, We just love it");
                }
                else {
                    Toast.makeText(getApplicationContext(),"Give the Rating",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}

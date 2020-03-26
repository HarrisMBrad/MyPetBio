package com.gmail.mypetbio.bmichaelh13;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;



public class BioActivity extends AppCompatActivity {

    private ImageView petImageView;
    private TextView petName;
    private TextView petBio;
    private Bundle extras;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bio2);

        petImageView = findViewById(R.id.petCatImgViewId);
        petName = findViewById(R.id.catTextNameId);
        petBio = findViewById(R.id.catBioTextId);

        extras = getIntent().getExtras();

        if (extras != null) {

            String name = extras.getString("name");
            String bio = extras.getString("bio");


            assert name != null;
            setUp(name, bio);

        }


    }



    public void setUp(String name, String bio) {


        if (name.equals("Mia")) {
            // we show dog stuff...
            petImageView.setImageDrawable(getResources().getDrawable(R.drawable.icon_lg_dog));
            petName.setText(name);
            petBio.setText(bio);



        } else if (name.equals("~mBeaux")) {
            // we show cat stuff...
            petImageView.setImageDrawable(getResources().getDrawable(R.drawable.icon_lg_cat));
            petName.setText(name);
            petBio.setText(bio);

        }

        if  (name.equals("~mBeaux")){
            // we show cat stuff...
            petImageView.setImageDrawable(getResources().getDrawable(R.drawable.icon_lg_cat));
            petName.setText(name);
            petBio.setText(bio);



        } else if (name.equals("Mia")) {
            // we show dog stuff...
            petImageView.setImageDrawable(getResources().getDrawable(R.drawable.icon_lg_dog));
            petName.setText(name);
            petBio.setText(bio);

        }

    }

}

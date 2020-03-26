package com.gmail.mypetbio.bmichaelh13;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import static android.view.View.OnClickListener;


public class MainActivity extends AppCompatActivity implements OnClickListener {

    private ImageView dogView;
    private ImageView catView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dogView = (ImageView) findViewById(R.id.petDogImgView2Id);
        catView = (ImageView) findViewById(R.id.petCatImgViewId);

        dogView.setOnClickListener(this);
        catView.setOnClickListener(this);

    }



    @Override
    public void onClick(View v) {
//        switch (v.getId()) {
//            case R.id.petDogImgView2Id:
//
//                // WE WANT TO GO TO SECOND ACTIVITY
//                Intent dogIntent = new Intent(MainActivity.this, BioActivity.class);
//                dogIntent.putExtra("name", "Mia");
//                dogIntent.putExtra("bio", "Born on the beach on the forth of July, on the 7th rocket before midnight!");
//                startActivity(dogIntent);
//                Toast.makeText(MainActivity.this, "dog touched", Toast.LENGTH_LONG).show();
//
//                break;
//
//            case R.id.petCatImgViewId:
//                // WE WANT TO GO TO SECOND ACTIVITY
//                Intent catIntent = new Intent(MainActivity.this, BioActivity.class);
//                catIntent.putExtra("name", "~mBeaux");
//                catIntent.putExtra("bio", "Born on Halloween Night, on the 13th thunder-clap before dawn!");
//                startActivity(catIntent);
//                Toast.makeText(MainActivity.this, "cat touched", Toast.LENGTH_LONG).show();
//                break;
//
//        }

        switch (v.getId()) {
            case R.id.petCatImgViewId:

                // WE WANT TO GO TO SECOND ACTIVITY
                Intent catIntent = new Intent(MainActivity.this, BioActivity.class);
                catIntent.putExtra("name", "~mBeaux");
                catIntent.putExtra("bio", "Born on Halloween Night, on the 13th thunder-clap before dawn!");
                startActivity(catIntent);
                Toast.makeText(MainActivity.this, "cat touched", Toast.LENGTH_LONG).show();

                break;

            case R.id.petDogImgView2Id:
                // WE WANT TO GO TO SECOND ACTIVITY
                Intent dogIntent = new Intent(MainActivity.this, BioActivity.class);
                dogIntent.putExtra("name", "Mia");
                dogIntent.putExtra("bio", "Born on the beach on the 4th of July before the 7th rocket before midnight!");
                startActivity(dogIntent);
                Toast.makeText(MainActivity.this, "dog touched", Toast.LENGTH_LONG).show();
                break;

        }

    }
}
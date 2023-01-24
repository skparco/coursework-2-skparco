package uk.ac.plymouth.activityswitch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class a11 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a11);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button button_a11_done = (Button) findViewById(R.id.button_a11_Done);
        button_a11_done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Next");
                goToa1();
            }
        });

        Button button_a111 = (Button) findViewById(R.id.button_a111);
        button_a111.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Next");
                goToa111();
            }
        });
        /*
        Button button_a112 = (Button) findViewById(R.id.button_a112);
        button_a112.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Next");
                goToa112();
            }
        });

         */
    }
    protected void goToa1() {
        Intent intent = new Intent(this, a1.class);
        startActivity(intent);
    }
    protected void goToa111() {
        Intent intent = new Intent(this, a111.class);
        startActivity(intent);
    }
    /*
    protected void goToa112() {
        Intent intent = new Intent(this, a112.class);
        startActivity(intent);
    }
    */
}
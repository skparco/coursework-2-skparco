package uk.ac.plymouth.activityswitch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class a12 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a12);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button button_a12_done = (Button) findViewById(R.id.button_a12_done);
        button_a12_done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Next");
                goToa1();
            }
        });


    }
    protected void goToa1() {
        Intent intent = new Intent(this, a1.class);
        startActivity(intent);
    }
}
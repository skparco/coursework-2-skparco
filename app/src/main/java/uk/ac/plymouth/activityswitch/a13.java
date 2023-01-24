package uk.ac.plymouth.activityswitch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class a13 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a13);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button button_a13_done = (Button) findViewById(R.id.button_a13_Done);
        button_a13_done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Next");
                goToa1();
            }
        });
        Button button_a131 = (Button) findViewById(R.id.button_a131);
        button_a131.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Next");
                goToa131();
            }
        });
    }

    protected void goToa1() {
        Intent intent = new Intent(this, a1.class);
        startActivity(intent);
    }

    protected void goToa131() {
        Intent intent = new Intent(this, a131.class);
        startActivity(intent);
    }
}
package uk.ac.plymouth.activityswitch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class u13 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_u13);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Button button_u13_done = (Button) findViewById(R.id.button_u13_Done);
        button_u13_done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Next");
                goTou1();
            }

        });
        Button button_u131 = (Button) findViewById(R.id.button_u131);
        button_u131.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Next");
                goTou131();
            }
        });
        Button button_u132 = (Button) findViewById(R.id.button_u132);
        button_u132.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Next");
                goTou132();
            }
        });
    }
    protected void goTou1() {
        Intent intent = new Intent(this, u1.class);
        startActivity(intent);
    }
    protected void goTou131() {
            Intent intent = new Intent(this, u131.class);
            startActivity(intent);
    }
    protected void goTou132() {
        Intent intent = new Intent(this, u132.class);
        startActivity(intent);
    }
}

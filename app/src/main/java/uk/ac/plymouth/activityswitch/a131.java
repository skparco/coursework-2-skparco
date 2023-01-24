package uk.ac.plymouth.activityswitch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class a131 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a131);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button button_a13_done = (Button) findViewById(R.id.button_a131_done);
        button_a13_done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Next");
                goToa13();
            }
        });
        Button button_a131_cancel = (Button) findViewById(R.id.button_a131_cancel);
        button_a131_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Next");
                goToa1311();
            }
        });
    }

    protected void goToa13() {
        Intent intent = new Intent(this, a13.class);
        startActivity(intent);
    }

    protected void goToa1311() {
        Intent intent = new Intent(this, a1311.class);
        startActivity(intent);
    }
}

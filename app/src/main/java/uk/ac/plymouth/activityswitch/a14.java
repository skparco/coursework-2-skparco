package uk.ac.plymouth.activityswitch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class a14 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a14);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button button_a141 = (Button) findViewById(R.id.button_a141);
        button_a141.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Next");
                goToa141();
            }
        });
    }
    protected void goToa141() {
        Intent intent = new Intent(this, a141.class);
        startActivity(intent);
    }
}
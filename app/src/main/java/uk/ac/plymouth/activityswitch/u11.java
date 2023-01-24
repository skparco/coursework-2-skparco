package uk.ac.plymouth.activityswitch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class u11 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_u11);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Button button_ulogin = (Button) findViewById(R.id.button_u11_done);
        button_ulogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Next");
                goTou1();
            }
        }
        );
    }
    protected void goTou1() {
        Intent intent = new Intent(this, u1.class);
        startActivity(intent);
    }
}

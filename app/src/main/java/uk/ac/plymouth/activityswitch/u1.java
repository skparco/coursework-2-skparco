package uk.ac.plymouth.activityswitch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class u1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_u1);
        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button button_u11 = (Button) findViewById(R.id.button_u1_detail);
        button_u11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Next");
                goTou11();
            }
        });
        Button button_u12 = (Button) findViewById(R.id.button_u1_apply);
        button_u12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Next");
                goTou12();
            }
        });
        Button button_u13 = (Button) findViewById(R.id.button_u1_history);
        button_u13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Next");
                goTou13();
            }
        });
        Button button_u1_signout = (Button) findViewById(R.id.button_u1_signout);
        button_u1_signout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Next");
                goToulogin();
            }
        });
    }
    protected void goToulogin() {
        Intent intent = new Intent(this, uLogin.class);
        startActivity(intent);
    }
    protected void goTou11() {
        Intent intent = new Intent(this, u11.class);
        startActivity(intent);
    }
    protected void goTou12() {
        Intent intent = new Intent(this, u12.class);
        startActivity(intent);
    }
    protected void goTou13() {
        Intent intent = new Intent(this, u13.class);
        startActivity(intent);
    }
}

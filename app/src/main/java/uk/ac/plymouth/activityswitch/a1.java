package uk.ac.plymouth.activityswitch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class a1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a1);

        Button button_a11 = (Button) findViewById(R.id.button_a1_list);
        button_a11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Next");
                goToa11();
            }
        });
        Button button_a12 = (Button) findViewById(R.id.button_a1_add);
        button_a12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Next");
                goToa12();
            }
        });
        Button button_a13 = (Button) findViewById(R.id.button_a1_eStatus);
        button_a13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Next");
                goToa13();
            }
        });
        Button button_a14 = (Button) findViewById(R.id.button_a1_aStatus);
        button_a14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Next");
                goToa14();
            }
        });


        Button button_a1_signout = (Button) findViewById(R.id.button_a1_signout);
        button_a1_signout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Next");
                goToalogin();
            }
        });
    }
    protected void goToalogin() {
        Intent intent = new Intent(this, aLogin.class);
        startActivity(intent);
    }
    protected void goToa11() {
        Intent intent = new Intent(this, a11.class);
        startActivity(intent);
    }

    protected void goToa12() {
        Intent intent = new Intent(this, a12.class);
        startActivity(intent);
    }
    protected void goToa13() {
        Intent intent = new Intent(this, a13.class);
        startActivity(intent);
    }
    protected void goToa14() {
        Intent intent = new Intent(this, a14.class);
        startActivity(intent);
    }

}

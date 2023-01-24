package uk.ac.plymouth.activityswitch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class a111 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a111);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button button_a111_done = (Button) findViewById(R.id.button_a111_done);
        button_a111_done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Next");
                goToa11();
            }
        });
        Button button_a111_remove = (Button) findViewById(R.id.button_a111_remove);
        button_a111_remove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Next");
                goToa1111();
            }
        });
    }
    protected void goToa11() {
        Intent intent = new Intent(this, a11.class);
        startActivity(intent);
    }
    protected void goToa1111() {
        Intent intent = new Intent(this, a1111.class);
        startActivity(intent);
    }
}
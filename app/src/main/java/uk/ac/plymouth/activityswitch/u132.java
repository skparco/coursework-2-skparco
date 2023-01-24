package uk.ac.plymouth.activityswitch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class u132 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_u132);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Button button_u132_done = (Button) findViewById(R.id.button_u132_done);
        button_u132_done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Next");
                goTou13();
            }
        });
    }
    protected void goTou13() {
        Intent intent = new Intent(this, u13.class);
        startActivity(intent);
    }
}

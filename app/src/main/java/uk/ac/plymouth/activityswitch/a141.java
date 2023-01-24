package uk.ac.plymouth.activityswitch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class a141 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a141);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button button_a141_approve = (Button) findViewById(R.id.button_a141_approve);
        button_a141_approve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Next");
                goToa1411();
            }
        });

        Button button_a141_reject = (Button) findViewById(R.id.button_a141_reject);
        button_a141_reject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Next");
                goToa1412();
            }
        });

    }
    protected void goToa1411() {
        Intent intent = new Intent(this, a1411.class);
        startActivity(intent);
    }
    protected void goToa1412() {
        Intent intent = new Intent(this, a1412.class);
        startActivity(intent);
    }

}
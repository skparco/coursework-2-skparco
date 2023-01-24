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

public class a1412 extends AppCompatActivity {
    private NotificationManagerCompat notificationManagerCompat;
    private NotificationCompat.Builder notificationBuilder;

    public static final String CHANNEL_ID = "PU_CHANNEL";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a1412);
        Button button_a141_approve = (Button) findViewById(R.id.button_a1412_and_back);
        button_a141_approve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Next");
                notificationManagerCompat.notify(200, notificationBuilder.build());
                goToa14();
            }
        });
        setAlertViewReject();
    }
    protected void setAlertViewReject() {
        // set up intent
        Intent intent = new Intent(this, AlertActivity.class);
        intent.setAction(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_LAUNCHER);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, intent, PendingIntent.FLAG_IMMUTABLE);

        notificationBuilder = new NotificationCompat.Builder(this, CHANNEL_ID)
                .setSmallIcon(R.drawable.logo)
                .setContentTitle("Notification")
                .setContentText("Rejected")
                .setPriority(NotificationCompat.PRIORITY_DEFAULT)
                .setAutoCancel(true)
                .setContentIntent(pendingIntent);

        NotificationManager notificationManager = getSystemService(NotificationManager.class);

        // Set up a channel for communication
        NotificationChannel channel = new NotificationChannel(CHANNEL_ID, "name", NotificationManager.IMPORTANCE_DEFAULT);
        channel.setDescription("Description...");
        notificationManager.createNotificationChannel(channel);
        notificationManagerCompat = NotificationManagerCompat.from(this);

    }
    protected void goToa14() {
        Intent intent = new Intent(this, a14.class);
        startActivity(intent);
    }
}
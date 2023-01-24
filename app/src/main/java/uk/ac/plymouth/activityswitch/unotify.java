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

public class unotify extends AppCompatActivity {
    private NotificationManagerCompat notificationManagerCompat;
    private NotificationCompat.Builder notificationBuilder;

    public static final String CHANNEL_ID = "PU_CHANNEL";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unotify);

        Button button_unotify = (Button) findViewById(R.id.button_unotify_next);
        button_unotify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Click");
                // notification manager -> notify
                notificationManagerCompat.notify(200, notificationBuilder.build());
            goTou1();
            }
        });
        setAlertView();
    }
    protected void goTou1() {
        Intent intent = new Intent(this, u1.class);
        startActivity(intent);
    }

    protected void setAlertView() {
        // set up intent
        Intent intent = new Intent(this, AlertActivity.class);
        intent.setAction(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_LAUNCHER);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, intent, PendingIntent.FLAG_IMMUTABLE);

        notificationBuilder = new NotificationCompat.Builder(this, CHANNEL_ID)
                .setSmallIcon(R.drawable.logo)
                .setContentTitle("Notification")
                .setContentText("Notification Setup Completed")
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
}
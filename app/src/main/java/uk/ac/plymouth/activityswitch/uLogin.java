package uk.ac.plymouth.activityswitch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class uLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ulogin);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button button_ulogin = (Button) findViewById(R.id.button_uLogin_login);
        button_ulogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Next");
                goTounotify();
            }
            });
        }
    protected void goTounotify() {
        Intent intent = new Intent(this, unotify.class);
        startActivity(intent);
    }
}
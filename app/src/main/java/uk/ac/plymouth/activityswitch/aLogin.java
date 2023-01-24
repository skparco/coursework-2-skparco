package uk.ac.plymouth.activityswitch;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class aLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alogin);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button button_alogin = (Button) findViewById(R.id.button_aLogin_login);
        button_alogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Next");
                goToa1();
            }
            });
        }
    protected void goToa1() {
        Intent intent = new Intent(this, a1.class);
        startActivity(intent);
    }
}
package uk.ac.plymouth.activityswitch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button_user = (Button) findViewById(R.id.button_rolesel_user);
        button_user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Next");
                goToULogin();
            }
        });
        Button button_admin = (Button) findViewById(R.id.button_rolesel_admin);
        button_admin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Next");
                goToALogin();
            }
        });
        /*
        ConstraintLayout layout = (ConstraintLayout) findViewById(R.id.layout);
        Snackbar snackbar = Snackbar.make(layout, "Hello World", Snackbar.LENGTH_INDEFINITE);
        snackbar.setAction("OK", new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Hello");
            }
        });
        snackbar.show();
         */
    }
    /*
    protected void goToSecondPage() {
        Intent intent = new Intent(this, SecondPageActivity.class);
        EditText editText = (EditText)findViewById(R.id.editTextTextPersonName);
        String text = editText.getText().toString();
        intent.putExtra("Name", text);
        intent.putExtra("LuckyNumber", 10);
        startActivity(intent);
    }
    */
    protected void goToULogin() {
        Intent intent = new Intent(this, uLogin.class);
        startActivity(intent);
    }

    protected void goToALogin() {
        Intent intent = new Intent(this, aLogin.class);
        startActivity(intent);

    }
}
package id.ac.polinema.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import static id.ac.polinema.intent.BundleActivity.AGE_KEY;
import static id.ac.polinema.intent.BundleActivity.NAME_KEY;
import static id.ac.polinema.intent.BundleActivity.USERNAME_KEY;

public class ProfileBundleActivity extends AppCompatActivity {
    Intent intent = new Intent(this, ProfileBundleActivity.class);
    String username,name,age;
    private TextView usernameText;
    private TextView nameText;
    private TextView ageText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_bundle);
        intent.putExtra(USERNAME_KEY, username);
        intent.putExtra(NAME_KEY, name);
        intent.putExtra(AGE_KEY, age);
        startActivity(intent);

        usernameText = findViewById(R.id.text_username);
        nameText = findViewById(R.id.text_name);
        ageText = findViewById(R.id.text_age);
        // TODO: bind here
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            // TODO: display value here
        }
    }
}

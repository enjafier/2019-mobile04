package id.ac.polinema.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ExplicitIntentActivity extends AppCompatActivity {
    TextView text_output;
    EditText input_name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explicit_intent);
        text_output = findViewById(R.id.text_output);
        input_name = findViewById(R.id.input_name);
    }

    public void getDataText(View view) {
        text_output.setText(input_name.getText());
    }
}

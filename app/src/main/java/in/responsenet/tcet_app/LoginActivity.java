package in.responsenet.tcet_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.renderscript.Int4;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    EditText editTextName;
    Button click_me;
    String enteredName;
    TextView alert_msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        click_me  = (Button)findViewById(R.id.click_me);
        editTextName = (EditText)findViewById(R.id.editTextName);
        alert_msg = (TextView)findViewById(R.id.alert_msg);

        click_me.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enteredName = editTextName.getText().toString();

                if(enteredName.length()>0) {
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    intent.putExtra("text_data", enteredName);
                    startActivity(intent);
                }else{
                    alert_msg.setVisibility(View.VISIBLE);
                    alert_msg.setText("Plese Enter your Name To continue...");
                }
            }
        });


    }
}

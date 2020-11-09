package in.prestige.greetingmsg;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn1;
    EditText edi1;
    String str;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.button1);
        edi1 = findViewById(R.id.editText1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str = edi1.getText().toString();
                Toast.makeText(getApplicationContext(),"Good Morning "+str,Toast.LENGTH_LONG).show();
            }
        });
    }
}
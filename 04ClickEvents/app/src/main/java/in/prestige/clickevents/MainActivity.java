package in.prestige.clickevents;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText Num1, Num2;
    Button B1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addfunction();
    }

    public void addfunction() {
        Num1 = (EditText) findViewById(R.id.Firstno);
        Num2 = (EditText) findViewById(R.id.Secondno);
        B1 = (Button) findViewById(R.id.Button1);

        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String v1 = Num1.getText().toString();
                String v2 = Num2.getText().toString();
                int a = Integer.parseInt(v1);
                int b = Integer.parseInt(v2);
                int sum = a + b;
                Toast.makeText(getApplicationContext(), String.valueOf(sum), Toast.LENGTH_LONG).show();
            }
        });
    }
}
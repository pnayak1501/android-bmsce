package in.prestige.relative;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText ed1, ed2;
    Button br, bs;
    String e1,e2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1 = findViewById(R.id.email);
        ed2 = findViewById(R.id.password);
        bs = findViewById(R.id.submit);
        bs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1 =ed1.getText().toString();
                e2 =ed2.getText().toString();
                Toast.makeText(MainActivity.this, e1+"\n"+e2, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
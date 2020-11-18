package in.prestige.constraint;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn;
    EditText ed1, ed2;
    String e1, e2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.button1);
        ed1 = findViewById(R.id.editText);
        ed2 = findViewById(R.id.editText2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1 = ed1.getText().toString();
                e2 = ed2.getText().toString();
                Toast.makeText(MainActivity.this, e1+"\n"+e2, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
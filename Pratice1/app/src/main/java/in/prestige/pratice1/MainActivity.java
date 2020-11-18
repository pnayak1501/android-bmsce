package in.prestige.pratice1;

        import androidx.appcompat.app.AppCompatActivity;

        import android.os.Bundle;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.Toast;

        import static android.widget.Toast.*;

public class MainActivity extends AppCompatActivity {
    EditText ed1, ed2;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void addMe(){
        ed1 = findViewById(R.id.ed1);
        ed2 = findViewById(R.id.ed2);
        String a1 = ed1.getText().toString();
        String a2 = ed2.getText().toString();
        int a = Integer.parseInt(a1);
        int b = Integer.parseInt(a2);
        int ans = a+b;
        Toast.makeText(getApplicationContext(),String.valueOf(ans), LENGTH_SHORT).show();
    }

}
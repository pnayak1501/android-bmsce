package in.prestige.practice11;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    RadioButton Dosa, idly, upma, palakpaneer, roti;
    String selectedfood;
    Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Dosa = (RadioButton) findViewById(R.id.Dosa);
        idly = (RadioButton) findViewById(R.id.idly);
        upma = (RadioButton) findViewById(R.id.upma);
        palakpaneer = (RadioButton) findViewById(R.id.palakpaneer);
        roti = (RadioButton) findViewById(R.id.roti);
        submit = (Button) findViewById(R.id.submitButton);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Dosa.isChecked()) {
                    selectedfood = Dosa.getText().toString();
                } else if (idly.isChecked()) {
                    selectedfood = idly.getText().toString();
                } else if (upma.isChecked()) {
                    selectedfood = upma.getText().toString();
                } else if (palakpaneer.isChecked()) {
                    selectedfood = palakpaneer.getText().toString();
                } else if (roti.isChecked()) {
                    selectedfood = roti.getText().toString();
                }
                Toast.makeText(getApplicationContext(), selectedfood,
                        Toast.LENGTH_LONG).show(); // print the value of selected super star
            }
        });
    }
}
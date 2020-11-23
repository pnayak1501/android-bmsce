package in.prestige.practice12;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TimePicker simpleTimePicker;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //  initiate the view's
        simpleTimePicker = (TimePicker) findViewById(R.id.simpleTimePicker);
        btn = findViewById(R.id.btn);
        simpleTimePicker.setIs24HourView(false); // used to display AM/PM mode
        // perform set on time changed listener event
        btn.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),String.valueOf(simpleTimePicker.getHour()),Toast.LENGTH_LONG).show();
            }
        });
    }
}
package in.prestige.practice7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import java.util.Date;

public class MainActivity extends AppCompatActivity {
    DatePicker picker;
    Button btnGet;
    TextView tvw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvw = (TextView)findViewById(R.id.textView);
        picker = (DatePicker)findViewById(R.id.dp);
        btnGet = (Button)findViewById(R.id.btn1);
        btnGet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvw.setText("date:"+picker.getDayOfMonth()+"/"+(picker.getMonth()+1)+"/"+picker.getYear());
            }
        });

    }
}
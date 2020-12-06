package in.prestige.eval2;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText ed1,ed2,ed3;
    DatePicker dt;
    TimePicker tp;
    CheckBox i, l;
    RadioGroup rbg;
    RadioButton rb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    public void clickBtn(View view) {
        ed1 = findViewById(R.id.editTextTextPersonName);
        ed2 = findViewById(R.id.editTextTextPersonName2);
        ed3 = findViewById(R.id.editTextTextPersonName3);
        dt = findViewById(R.id.datePicker);
        i = findViewById(R.id.checkBox);
        l = findViewById(R.id.checkBox2);
        rbg = findViewById(R.id.radioGroup);
        tp = findViewById(R.id.timePicker);
        String ans = "";
        ans = ans+"Name: "+ed1.getText().toString()+"\n";
        ans = ans+"USN: "+ed2.getText()+"\n";
        ans = ans+"Branch: "+ed3.getText().toString()+"\n";
        ans = ans+"Date: "+dt.getDayOfMonth()+"/"+(dt.getMonth()+1)+"/"+dt.getYear()+"\n";
        ans = ans+"Time: "+String.valueOf(tp.getHour())+":"+String.valueOf(tp.getMinute())+"\n";
        ans = ans + "Subjects: ";
        if(i.isChecked()){
            ans = ans + "Android dev";
        }
        if(l.isChecked()){
            ans = ans + " Web dev";
        }
        ans = ans + "\n Semester: ";
        int selectedId = rbg.getCheckedRadioButtonId();
        rb = findViewById(selectedId);
        ans = ans + rb.getText().toString();
        Toast.makeText(getApplicationContext(),ans,Toast.LENGTH_LONG).show();
    }
}
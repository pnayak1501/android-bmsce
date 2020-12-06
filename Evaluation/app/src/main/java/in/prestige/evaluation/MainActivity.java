package in.prestige.evaluation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText ed1,ed2,ed3;
    DatePicker dt;
    CheckBox i, l;
    RadioGroup rbg;
    RadioButton rb;
    AutoCompleteTextView actv;
    String[] city = {"Banglaore","Bharuch","Quetta","New York","New Jersey"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        actv = findViewById(R.id.autoCompleteTextView);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.select_dialog_item,city);
        actv.setThreshold(1);
        actv.setAdapter(adapter);
    }

    public void clickBtn(View view) {
        ed1 = findViewById(R.id.editTextTextPersonName);
        ed2 = findViewById(R.id.editTextTextPersonName2);
        ed3 = findViewById(R.id.editTextTextPersonName3);
        dt = findViewById(R.id.datePicker);
        i = findViewById(R.id.checkBox);
        l = findViewById(R.id.checkBox2);
        rbg = findViewById(R.id.radioGroup);
        String ans = "";
        ans = ans+"Name: "+ed1.getText().toString()+"\n";
        ans = ans+"Bill No.: "+ed2.getText()+"\n";
        ans = ans+"Address: "+ed3.getText().toString()+"\n";
        ans = ans+"Due Date: "+dt.getDayOfMonth()+"/"+(dt.getMonth()+1)+"/"+dt.getYear()+"\n";
        ans = ans + "Services: ";
        if(i.isChecked())
            ans = ans + "Internet";
        if(l.isChecked())
            ans = ans + " Landline";
        ans = ans + "\n Internet Speed: ";
        int selectedId = rbg.getCheckedRadioButtonId();
        rb = findViewById(selectedId);
        ans = ans + rb.getText().toString();
        ans = ans + "\nCity: "+actv.getText().toString();
        Toast.makeText(getApplicationContext(),ans,Toast.LENGTH_LONG).show();
    }
}
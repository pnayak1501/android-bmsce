package in.prestige.examp1;

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
    AutoCompleteTextView a;
    EditText ed1,ed2;
    DatePicker dtp;
    RadioGroup rgrp;
    RadioButton rb;
    CheckBox cb1, cb2;

    String[] clg= {"BMSCE","BMSIT","IITB","IITD"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.select_dialog_item,clg);
        AutoCompleteTextView actv = (AutoCompleteTextView)findViewById(R.id.actv);
        actv.setThreshold(1);
        actv.setAdapter(adapter);
    }

    public void submit(View view) {
        ed1 = findViewById(R.id.ed2);
        ed2 = findViewById(R.id.editTextNumber);
        a = findViewById(R.id.actv);
        dtp = findViewById(R.id.datePicker2);
        rgrp = findViewById(R.id.rgrp);
        cb1 = findViewById(R.id.checkBox);
        cb2 = findViewById(R.id.checkBox2);

        String ans = "";
        ans = ans+ed1.getText()+" ";
        ans = ans+ed2.getText()+" ";
        ans = ans+a.getText()+" ";
        ans = ans+dtp.getDayOfMonth()+"/"+(dtp.getMonth()+1)+"/"+dtp.getYear()+" ";
        int selected = rgrp.getCheckedRadioButtonId();
        rb = findViewById(selected);
        ans = ans+rb.getText()+" ";
        if(cb1.isChecked())
            ans = ans+cb1.getText();
        if(cb2.isChecked())
            ans = ans+cb2.getText();
        Toast.makeText(getApplicationContext(),ans,Toast.LENGTH_LONG).show();
    }
}
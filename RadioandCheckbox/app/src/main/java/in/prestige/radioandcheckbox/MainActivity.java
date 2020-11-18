package in.prestige.radioandcheckbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText num1,num2;
    Button B1;
    TextView s;
    CheckBox e, h, k;
    Button button;
    RadioButton radioButton;
    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addfunction();
        e=(CheckBox)findViewById(R.id.checkbox1);
        h=(CheckBox)findViewById(R.id.checkbox2);
        k=(CheckBox)findViewById(R.id.checkbox3);
        button=(Button)findViewById(R.id.button);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
    }
    public void addfunction()
    {
        num1 = (EditText) findViewById(R.id.Firstnumber);
        num2 = (EditText) findViewById(R.id.secondnumber);
        B1 = (Button) findViewById(R.id.Button1);
        s = findViewById(R.id.ans);

        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String S1 = num1.getText().toString();
                String S2 = num2.getText().toString();
                int a= Integer.parseInt(S1);


                int b= Integer.parseInt(S2);
                int sum= a+b;
                String sa = String.valueOf(sum);
                Toast.makeText(getApplicationContext(),String.valueOf(sum),Toast.LENGTH_LONG).show();
                s.setText(sa);
            }
        });
    }
    public void Check(View v)
    { String sub = "";
        if(e.isChecked())
            sub= sub + " maths ";
        if(h.isChecked())
            sub= sub + " science ";
        if(k.isChecked())
            sub= sub + " social ";
        Toast.makeText(this, sub + "selected",
                Toast.LENGTH_LONG).show();
    }
    public void onclickbuttonMethod(View v){
        int selectedId = radioGroup.getCheckedRadioButtonId();
        radioButton = (RadioButton) findViewById(selectedId);
        if(selectedId==-1){
            Toast.makeText(MainActivity.this,"Nothing selected", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(MainActivity.this,radioButton.getText(), Toast.LENGTH_SHORT).show();
        }

    }
}

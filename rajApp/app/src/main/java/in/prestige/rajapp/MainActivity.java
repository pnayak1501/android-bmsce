package in.prestige.rajapp;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView tvReg;
    EditText etName,etUsn;
    AutoCompleteTextView tvAuto;
    Button btnSubmit;
    String  [] str={"Patna","Amritsar","Suraat","Mangalore","Bangalore","Arrah","Buxar","Mirzapur"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvReg=findViewById(R.id.tvReg);
        etName=findViewById(R.id.etName);
        etUsn=findViewById(R.id.etUsn);
        tvAuto=findViewById(R.id.tvAuto);
        btnSubmit=findViewById(R.id.btnSubmit);

        ArrayAdapter <String> adapter=new ArrayAdapter<>(this,android.R.layout.select_dialog_item,str);
        tvAuto.setThreshold(2);
        tvAuto.setAdapter(adapter);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a = etName.getText().toString();
                String b = etUsn.getText().toString();
                String c = tvAuto.getText().toString();

                Toast.makeText(MainActivity.this,"Name is :"+a,Toast.LENGTH_SHORT ).show();
                Toast.makeText(MainActivity.this,"USN :"+b,Toast.LENGTH_SHORT ).show();
                Toast.makeText(MainActivity.this,"CITY is :"+c,Toast.LENGTH_SHORT ).show();


            }


        });





    }
}
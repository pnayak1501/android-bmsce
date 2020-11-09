package in.prestige.a07login2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText nameEditText ;
    EditText USNEditText ;
    EditText AddressEditText;
    String[] city = {"Bangalore","Belgaum","Belgavi","Bason"};
    AutoCompleteTextView autoCity;

    public void submit(View view){


        String name=nameEditText.getText().toString();
        String usn=USNEditText.getText().toString();
        String address=AddressEditText.getText().toString();
        String cityy=autoCity.getText().toString();

        Toast.makeText(this, "Name = "+name+" USN = "+usn+" Address = "+address+" City = "+cityy, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nameEditText = findViewById(R.id.editTextName);
        USNEditText = findViewById(R.id.editTextUSN);
        AddressEditText = findViewById(R.id.editTextAddress);
        autoCity= findViewById(R.id.city);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.select_dialog_item,city);
        autoCity.setThreshold(2);
        autoCity.setAdapter(arrayAdapter);

    }
}
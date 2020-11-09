package in.prestige.a1applifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate (Bundle savedInstanceState)
    {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);
//        t1 = findViewById(R.id.hello);
//        t1.setText("Prahlad");
        Toast.makeText (this,"ON CREATE", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onStart()
    {
        // TODO Auto-generated method stub
        super.onStart();
        Toast.makeText (this,"ON START", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onResume()
    {
        // TODO Auto-generated method stub
        super.onResume();
        Toast.makeText (this,"ON RESUME", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onPause()
    {
        // TODO Auto-generated method stub
        super.onPause();
        Toast.makeText (this,"ON PAUSE", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onRestart()
    {
        // TODO Auto-generated method stub
        super.onRestart();
        Toast.makeText (this,"ON RESTART", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onStop()
    {
        // TODO Auto-generated method stub
        super.onStop();
        Toast.makeText (this,"ON STOP", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onDestroy()
    {
        // TODO Auto-generated method stub
        super.onDestroy();
        Toast.makeText (this,"ON DESTROY", Toast.LENGTH_SHORT).show();
    }
}
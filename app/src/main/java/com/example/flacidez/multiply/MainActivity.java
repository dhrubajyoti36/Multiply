package com.example.flacidez.multiply;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    Button btn_Multiply;
    TextView txtView;
    EditText eT_FirstValue;
    EditText eT_SecondValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_Multiply = (Button)findViewById(R.id.button_Multiply);
        txtView = (TextView)findViewById(R.id.textView);
        eT_FirstValue = (EditText) findViewById(R.id.editText_FirstValue);
        eT_SecondValue = (EditText)findViewById(R.id.editText_SecondValue);

        btn_Multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Float result = Float.parseFloat(eT_FirstValue.getText().toString()) * Float.parseFloat(eT_SecondValue.getText().toString());
                    txtView.setText(String.valueOf(result));
                }
                catch (Exception ex){
                    txtView.setText("Does not compute");
                }
            }
        });
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

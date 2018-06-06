package com.example.suraj.coffee_layout;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class submit extends AppCompatActivity{
    EditText name;
    EditText quant;
    TextView textView;
    TextView textView1;
    Button button;
    RadioButton radio250,radio350;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.submit);

        name= (EditText) findViewById(R.id.enter_name);
        quant= (EditText) findViewById(R.id.enter_quant);
        textView=(TextView) findViewById(R.id.name);
        textView1=(TextView) findViewById(R.id.quant);
        button=(Button) findViewById(R.id.submit);
        radio250=(RadioButton) findViewById(R.id.radio_250);
        radio350=(RadioButton) findViewById(R.id.radio_350);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent Intent = new Intent(submit.this, test.class);
                startActivity(Intent);

                String name1 = String.valueOf(name.getText());
                int quantity =Integer.parseInt(quant.getText().toString());
                int tp=0;
                if(radio250.isChecked())
                {
                    tp= quantity*250;
                }
                else if(radio350.isChecked()) {
                    tp=quantity*350;
                }
                else {
                    Toast.makeText(getApplicationContext(),"Please Select Capacity",Toast.LENGTH_LONG).show();
                }
                Toast.makeText(getApplicationContext(), "Hello "+name1 + " Quantity Ordered = "+quantity+ " Total Price= "+tp, Toast.LENGTH_SHORT).show();

            }
        });









    }
}

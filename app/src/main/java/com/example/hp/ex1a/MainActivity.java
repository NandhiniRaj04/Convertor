package com.example.hp.ex1a;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Spinner spinner,spinner1,spinner2,spinner4,spinner5,spinner3,spinner6,spinner7,spinner8;
    EditText editText,editText1;

    String string,string1,string2,string3,string4,string5,string6;
    String[] convert={"CURRENCY","TEMPERATURE","WEIGHT"};
    String[] convert1 = {"EURO", "USD", "INR", "BAHT"};
    String[] convert2 = {"EURO", "USD", "INR", "BAHT"};
    String[] convert3 = {"KELVIN", "CELSIUS", "FARENHEIT"};
    String[] convert4 = {"KELVIN", "CELSIUS", "FARENHEIT"};
    String[] convert5={"MILLIGRAM","KILOGRAM","GRAM"};
    String[] convert6={"MILLIGRAM","KILOGRAM","GRAM"};


    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);
        spinner = findViewById(R.id.spinner);
        spinner1 = findViewById(R.id.spinner1);
        spinner2 = findViewById(R.id.spinner2);
        spinner4 = findViewById(R.id.spinner4);
        spinner5 = findViewById(R.id.spinner5);
        spinner3=findViewById(R.id.spinner3);
        spinner6=findViewById(R.id.spinner6);
        spinner7=findViewById(R.id.spinner7);
        spinner8=findViewById(R.id.spinner8);
        editText = findViewById(R.id.editText);
        editText1=findViewById(R.id.editText1);
        Button button=(Button) findViewById(R.id.button);
        ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,convert);
        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner.setAdapter(adapter);
        ArrayAdapter a1=new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,convert1);
        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner1.setAdapter(a1);
        ArrayAdapter adapter2=new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,convert3);
        adapter2.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner2.setAdapter(adapter2);
        ArrayAdapter adapter3=new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,convert2);
        adapter3.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner4.setAdapter(adapter3);
        ArrayAdapter adapter4=new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,convert4);
        adapter4.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
         spinner5.setAdapter(adapter4);
        ArrayAdapter adapter5=new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,convert5);
        adapter5.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner3.setAdapter(adapter5);
        ArrayAdapter adapter6=new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,convert6);
        adapter6.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner6.setAdapter(adapter6);




        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                string=spinner.getSelectedItem().toString();


                if(string.equals("CURRENCY")){

                    spinner1.setVisibility(View.VISIBLE);
                    spinner4.setVisibility(View.VISIBLE);
                    spinner2.setVisibility(View.INVISIBLE);
                    spinner5.setVisibility(View.INVISIBLE);
                    spinner3.setVisibility(View.INVISIBLE);
                    spinner6.setVisibility(View.INVISIBLE);
                    spinner7.setVisibility(View.INVISIBLE);
                    spinner8.setVisibility(View.INVISIBLE);


                    }
                    else if (string.equals("TEMPERATURE")){

                    spinner1.setVisibility(View.INVISIBLE);
                    spinner4.setVisibility(View.INVISIBLE);
                    spinner2.setVisibility(View.VISIBLE);
                    spinner5.setVisibility(View.VISIBLE);
                    spinner3.setVisibility(View.INVISIBLE);
                    spinner6.setVisibility(View.INVISIBLE);
                    spinner7.setVisibility(View.INVISIBLE);
                    spinner8.setVisibility(View.INVISIBLE);



                }
                else if (string.equals("WEIGHT")){

                    spinner1.setVisibility(View.INVISIBLE);
                    spinner4.setVisibility(View.INVISIBLE);
                    spinner2.setVisibility(View.INVISIBLE);
                    spinner5.setVisibility(View.INVISIBLE);
                    spinner3.setVisibility(View.VISIBLE);
                    spinner6.setVisibility(View.VISIBLE);
                    spinner7.setVisibility(View.INVISIBLE);
                    spinner8.setVisibility(View.INVISIBLE);



                }

                else if (string.equals("WEIGHT")){

                    spinner1.setVisibility(View.INVISIBLE);
                    spinner4.setVisibility(View.INVISIBLE);
                    spinner2.setVisibility(View.INVISIBLE);
                    spinner5.setVisibility(View.INVISIBLE);
                    spinner3.setVisibility(View.VISIBLE);
                    spinner6.setVisibility(View.VISIBLE);
                    spinner7.setVisibility(View.INVISIBLE);
                    spinner8.setVisibility(View.INVISIBLE);



                }
                else if (string.equals("LENGTH")){

                    spinner1.setVisibility(View.INVISIBLE);
                    spinner4.setVisibility(View.INVISIBLE);
                    spinner2.setVisibility(View.INVISIBLE);
                    spinner5.setVisibility(View.INVISIBLE);
                    spinner3.setVisibility(View.INVISIBLE);
                    spinner6.setVisibility(View.INVISIBLE);
                    spinner7.setVisibility(View.VISIBLE);
                    spinner8.setVisibility(View.VISIBLE);



                }




            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        }


        );

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Currency c=new Currency();
                Temperature t=new Temperature();
                Weight w=new Weight();
                string=spinner.getSelectedItem().toString();
                string1=spinner1.getSelectedItem().toString();
                string2=spinner4.getSelectedItem().toString();
                string3=spinner2.getSelectedItem().toString();
                string4=spinner5.getSelectedItem().toString();
                string5=spinner3.getSelectedItem().toString();
                string6=spinner6.getSelectedItem().toString();

                if (string.equals("CURRENCY")&&(string1.equals("EURO")) && (string2.equals("EURO"))){
                    spinner1.setVisibility(View.VISIBLE);
                    spinner4.setVisibility(View.VISIBLE);
                    spinner2.setVisibility(View.INVISIBLE);
                    spinner5.setVisibility(View.INVISIBLE);
                    
                    Toast.makeText(getApplicationContext(), "INVALID", Toast.LENGTH_SHORT).show();


                }
               else if (string.equals("CURRENCY")&&(string1.equals("USD")) && (string2.equals("USD"))){
                    spinner1.setVisibility(View.VISIBLE);
                    spinner4.setVisibility(View.VISIBLE);
                    spinner2.setVisibility(View.INVISIBLE);
                    spinner5.setVisibility(View.INVISIBLE);
                    
                    
                    Toast.makeText(getApplicationContext(), "INVALID", Toast.LENGTH_SHORT).show();


                }
               else if (string.equals("CURRENCY")&&(string1.equals("INR")) && (string2.equals("INR"))){
                    spinner1.setVisibility(View.VISIBLE);
                    spinner4.setVisibility(View.VISIBLE);
                    spinner2.setVisibility(View.INVISIBLE);
                    spinner5.setVisibility(View.INVISIBLE);
                    
                    
                    Toast.makeText(getApplicationContext(), "INVALID", Toast.LENGTH_SHORT).show();


                }
              else  if (string.equals("CURRENCY")&&(string1.equals("BAHT")) && (string2.equals("BAHT"))){
                    spinner1.setVisibility(View.VISIBLE);
                    spinner4.setVisibility(View.VISIBLE);
                    spinner2.setVisibility(View.INVISIBLE);
                    spinner5.setVisibility(View.INVISIBLE);
                    
                    
                    Toast.makeText(getApplicationContext(), "INVALID", Toast.LENGTH_SHORT).show();


                }

              else  if(string.equals("CURRENCY")&&(string1.equals("EURO"))&&(string2.equals("USD"))){
                    spinner1.setVisibility(View.VISIBLE);
                    spinner4.setVisibility(View.VISIBLE);
                    spinner2.setVisibility(View.INVISIBLE);
                    spinner5.setVisibility(View.INVISIBLE);
                    editText1.setVisibility(View.VISIBLE);
                    editText.setVisibility(View.VISIBLE);
                    float cur= Float.parseFloat(editText.getText().toString());
                    float op=c.euro_usd(cur);
                    editText1.setText(""+op);


                }

                else if(string1.equals("EURO")&&(string2.equals("INR"))){
                    spinner1.setVisibility(View.VISIBLE);
                    spinner4.setVisibility(View.VISIBLE);
                    spinner2.setVisibility(View.INVISIBLE);
                    spinner5.setVisibility(View.INVISIBLE);
                    editText1.setVisibility(View.VISIBLE);
                    editText.setVisibility(View.VISIBLE);
                    double cur= Double.parseDouble(editText.getText().toString());
                    double res=c.euro_rupee(cur);
                    editText1.setText(""+res);
                }
                else if(string1.equals("EURO")&&(string2.equals("BAHT"))){
                    spinner1.setVisibility(View.VISIBLE);
                    spinner4.setVisibility(View.VISIBLE);
                    spinner2.setVisibility(View.INVISIBLE);
                    spinner5.setVisibility(View.INVISIBLE);
                    editText1.setVisibility(View.VISIBLE);
                    editText.setVisibility(View.VISIBLE);
                    double cur= Double.parseDouble(editText.getText().toString());
                    double res=c.euro_baht(cur);
                    editText1.setText(""+res);
                }
                else if(string1.equals("USD")&&(string2.equals("EURO"))){
                    spinner1.setVisibility(View.VISIBLE);
                    spinner4.setVisibility(View.VISIBLE);
                    spinner2.setVisibility(View.INVISIBLE);
                    spinner5.setVisibility(View.INVISIBLE);
                    editText1.setVisibility(View.VISIBLE);
                    editText.setVisibility(View.VISIBLE);
                    double cur= Double.parseDouble(editText.getText().toString());
                    double res=c.us2euro(cur);
                    editText1.setText(""+res);
                }
                else if(string1.equals("USD")&&(string2.equals("BAHT"))){
                    spinner1.setVisibility(View.VISIBLE);
                    spinner4.setVisibility(View.VISIBLE);
                    spinner2.setVisibility(View.INVISIBLE);
                    spinner5.setVisibility(View.INVISIBLE);
                    editText1.setVisibility(View.VISIBLE);
                    editText.setVisibility(View.VISIBLE);
                    double cur= Double.parseDouble(editText.getText().toString());
                    double res=c.us2bp(cur);
                    editText1.setText(""+res);
                }
                else if(string1.equals("USD")&&(string2.equals("INR"))){
                    spinner1.setVisibility(View.VISIBLE);
                    spinner4.setVisibility(View.VISIBLE);
                    spinner2.setVisibility(View.INVISIBLE);
                    spinner5.setVisibility(View.INVISIBLE);
                    editText1.setVisibility(View.VISIBLE);
                    editText.setVisibility(View.VISIBLE);
                    double cur= Double.parseDouble(editText.getText().toString());
                    double res=c.us2ir(cur);
                    editText1.setText(""+res);


                }
                else if(string1.equals("INR")&&(string2.equals("EURO"))){
                    spinner1.setVisibility(View.VISIBLE);
                    spinner4.setVisibility(View.VISIBLE);
                    spinner2.setVisibility(View.INVISIBLE);
                    spinner5.setVisibility(View.INVISIBLE);
                    editText1.setVisibility(View.VISIBLE);
                    editText.setVisibility(View.VISIBLE);
                    double cur= Double.parseDouble(editText.getText().toString());
                    double res=c.ir2euro(cur);
                    editText1.setText(""+res);
                }
                else if(string1.equals("INR")&&(string2.equals("USD"))){
                    spinner1.setVisibility(View.VISIBLE);
                    spinner4.setVisibility(View.VISIBLE);
                    spinner2.setVisibility(View.INVISIBLE);
                    spinner5.setVisibility(View.INVISIBLE);
                    editText1.setVisibility(View.VISIBLE);
                    editText.setVisibility(View.VISIBLE);
                    double cur= Double.parseDouble(editText.getText().toString());
                    double res=c.ir2usd(cur);
                    editText1.setText(""+res);
                }
                else if(string1.equals("INR")&&(string2.equals("BAHT"))){
                    spinner1.setVisibility(View.VISIBLE);
                    spinner4.setVisibility(View.VISIBLE);
                    spinner2.setVisibility(View.INVISIBLE);
                    spinner5.setVisibility(View.INVISIBLE);
                    editText1.setVisibility(View.VISIBLE);
                    editText.setVisibility(View.VISIBLE);
                    double cur= Double.parseDouble(editText.getText().toString());
                    double res=c.ir2baht(cur);
                    editText1.setText(""+res);
                }

                else if(string1.equals("BAHT")&&(string2.equals("INR"))){
                    spinner1.setVisibility(View.VISIBLE);
                    spinner4.setVisibility(View.VISIBLE);
                    spinner2.setVisibility(View.INVISIBLE);
                    spinner5.setVisibility(View.INVISIBLE);
                    editText1.setVisibility(View.VISIBLE);
                    editText.setVisibility(View.VISIBLE);
                    double cur= Double.parseDouble(editText.getText().toString());
                    double res=c.baht2ir(cur);
                    editText1.setText(""+res);
                }

                else if(string1.equals("BAHT")&&(string2.equals("USD"))){
                    spinner1.setVisibility(View.VISIBLE);
                    spinner4.setVisibility(View.VISIBLE);
                    spinner2.setVisibility(View.INVISIBLE);
                    spinner5.setVisibility(View.INVISIBLE);
                    editText1.setVisibility(View.VISIBLE);
                    editText.setVisibility(View.VISIBLE);
                    double cur= Double.parseDouble(editText.getText().toString());
                    double res=c.baht2usd(cur);
                    editText1.setText(""+res);
                }
                else if(string1.equals("BAHT")&&(string2.equals("EURO"))){
                    spinner1.setVisibility(View.VISIBLE);
                    spinner4.setVisibility(View.VISIBLE);
                    spinner2.setVisibility(View.INVISIBLE);
                    spinner5.setVisibility(View.INVISIBLE);
                    editText1.setVisibility(View.VISIBLE);
                    editText.setVisibility(View.VISIBLE);
                    double cur= Double.parseDouble(editText.getText().toString());
                    double res=c.baht2euro(cur);
                    editText1.setText(""+res);
                }


                if (string.equals("TEMPERATURE")&&(string3.equals("KELVIN"))&&(string4.equals("KELVIN"))){

                    spinner1.setVisibility(View.INVISIBLE);
                    spinner4.setVisibility(View.INVISIBLE);
                    spinner2.setVisibility(View.VISIBLE);
                    spinner5.setVisibility(View.VISIBLE);
                    
                    
                    Toast.makeText(getApplicationContext(), "INVALID", Toast.LENGTH_SHORT).show();


                }

               else if (string.equals("TEMPERATURE")&&(string3.equals("CELSIUS"))&&(string4.equals("CELSIUS"))){

                    spinner1.setVisibility(View.INVISIBLE);
                    spinner4.setVisibility(View.INVISIBLE);
                    spinner2.setVisibility(View.VISIBLE);
                    spinner5.setVisibility(View.VISIBLE);
                    
                    
                    Toast.makeText(getApplicationContext(), "INVALID", Toast.LENGTH_SHORT).show();


                }

               else if (string.equals("TEMPERATURE")&&(string3.equals("FARENHEIT"))&&(string4.equals("FARENHEIT"))){

                    spinner1.setVisibility(View.INVISIBLE);
                    spinner4.setVisibility(View.INVISIBLE);
                    spinner2.setVisibility(View.VISIBLE);
                    spinner5.setVisibility(View.VISIBLE);
                    
                    
                    Toast.makeText(getApplicationContext(), "INVALID", Toast.LENGTH_SHORT).show();


                }
                else if (string.equals("TEMPERATURE")&&(string3.equals("KELVIN"))&&(string4.equals("FARENHEIT"))){

                    spinner1.setVisibility(View.INVISIBLE);
                    spinner4.setVisibility(View.INVISIBLE);
                    spinner2.setVisibility(View.VISIBLE);
                    spinner5.setVisibility(View.VISIBLE);
                    editText1.setVisibility(View.VISIBLE);
                    editText.setVisibility(View.VISIBLE);

                    double cur= Double.parseDouble(editText.getText().toString());
                    double res=t.KelvinToFer(cur);
                    editText1.setText(""+res);


                }

                else if (string.equals("TEMPERATURE")&&(string3.equals("KELVIN"))&&(string4.equals("CELSIUS"))){

                    spinner1.setVisibility(View.INVISIBLE);
                    spinner4.setVisibility(View.INVISIBLE);
                    spinner2.setVisibility(View.VISIBLE);
                    spinner5.setVisibility(View.VISIBLE);
                    editText1.setVisibility(View.VISIBLE);
                    editText.setVisibility(View.VISIBLE);
                    double cur= Double.parseDouble(editText.getText().toString());
                    double res=t.KelvinToCelsi(cur);
                    editText1.setText(""+res);


                }
                else if (string.equals("TEMPERATURE")&&(string3.equals("FARENHEIT"))&&(string4.equals("KELVIN"))){

                    spinner1.setVisibility(View.INVISIBLE);
                    spinner4.setVisibility(View.INVISIBLE);
                    spinner2.setVisibility(View.VISIBLE);
                    spinner5.setVisibility(View.VISIBLE);
                    editText1.setVisibility(View.VISIBLE);
                    editText.setVisibility(View.VISIBLE);
                    double cur= Double.parseDouble(editText.getText().toString());
                    double res=t.FerToKelvin(cur);
                    editText1.setText(""+res);


                }
                else if (string.equals("TEMPERATURE")&&(string3.equals("FARENHEIT"))&&(string4.equals("CELSIUS"))){

                    spinner1.setVisibility(View.INVISIBLE);
                    spinner4.setVisibility(View.INVISIBLE);
                    spinner2.setVisibility(View.VISIBLE);
                    spinner5.setVisibility(View.VISIBLE);
                    editText1.setVisibility(View.VISIBLE);
                    editText.setVisibility(View.VISIBLE);
                    double cur= Double.parseDouble(editText.getText().toString());
                    double res=t.FarToCel(cur);
                    editText1.setText(""+res);


                }
                else if (string.equals("TEMPERATURE")&&(string3.equals("CELSIUS"))&&(string4.equals("FARENHEIT"))){

                    spinner1.setVisibility(View.INVISIBLE);
                    spinner4.setVisibility(View.INVISIBLE);
                    spinner2.setVisibility(View.VISIBLE);
                    spinner5.setVisibility(View.VISIBLE);
                    editText1.setVisibility(View.VISIBLE);
                    editText.setVisibility(View.VISIBLE);
                    double cur= Double.parseDouble(editText.getText().toString());
                    double res=t.CelToFar(cur);
                    editText1.setText(""+res);


                }
                else if (string.equals("TEMPERATURE")&&(string3.equals("CELSIUS"))&&(string4.equals("KELVIN"))){

                    spinner1.setVisibility(View.INVISIBLE);
                    spinner4.setVisibility(View.INVISIBLE);
                    spinner2.setVisibility(View.VISIBLE);
                    spinner5.setVisibility(View.VISIBLE);
                    editText1.setVisibility(View.VISIBLE);
                    editText.setVisibility(View.VISIBLE);
                    double cur= Double.parseDouble(editText.getText().toString());
                    double res=t.CelsiTokelvin(cur);

                    editText1.setText(""+res);


                }
                else if (string.equals("WEIGHT")&&(string5.equals("MILLIGRAM"))&&(string6.equals("MILLIGRAM"))){

                    spinner1.setVisibility(View.INVISIBLE);
                    spinner4.setVisibility(View.INVISIBLE);
                    spinner2.setVisibility(View.INVISIBLE);
                    spinner5.setVisibility(View.INVISIBLE);
                    spinner3.setVisibility(View.VISIBLE);
                    spinner6.setVisibility(View.VISIBLE);
                    editText1.setVisibility(View.VISIBLE);
                    editText.setVisibility(View.VISIBLE);
                    Toast.makeText(getApplicationContext(), "INVALID", Toast.LENGTH_SHORT).show();


                }

                else if (string.equals("WEIGHT")&&(string5.equals("KILOGRAM"))&&(string6.equals("KILOGRAM"))){

                    spinner1.setVisibility(View.INVISIBLE);
                    spinner4.setVisibility(View.INVISIBLE);
                    spinner2.setVisibility(View.INVISIBLE);
                    spinner5.setVisibility(View.INVISIBLE);
                    spinner3.setVisibility(View.VISIBLE);
                    spinner6.setVisibility(View.VISIBLE);
                    editText1.setVisibility(View.VISIBLE);
                    editText.setVisibility(View.VISIBLE);
                    Toast.makeText(getApplicationContext(), "INVALID", Toast.LENGTH_SHORT).show();


                }
                else if (string.equals("WEIGHT")&&(string5.equals("GRAM"))&&(string6.equals("GRAM"))){

                    spinner1.setVisibility(View.INVISIBLE);
                    spinner4.setVisibility(View.INVISIBLE);
                    spinner2.setVisibility(View.INVISIBLE);
                    spinner5.setVisibility(View.INVISIBLE);
                    spinner3.setVisibility(View.VISIBLE);
                    spinner6.setVisibility(View.VISIBLE);
                    editText1.setVisibility(View.VISIBLE);
                    editText.setVisibility(View.VISIBLE);
                    Toast.makeText(getApplicationContext(), "INVALID", Toast.LENGTH_SHORT).show();


                }
                else if (string.equals("WEIGHT")&&(string5.equals("MILLIGRAM"))&&(string6.equals("KILOGRAM"))){

                    spinner1.setVisibility(View.INVISIBLE);
                    spinner4.setVisibility(View.INVISIBLE);
                    spinner2.setVisibility(View.INVISIBLE);
                    spinner5.setVisibility(View.INVISIBLE);
                    spinner3.setVisibility(View.VISIBLE);
                    spinner6.setVisibility(View.VISIBLE);
                    editText1.setVisibility(View.VISIBLE);
                    editText.setVisibility(View.VISIBLE);
                    double cur= Double.parseDouble(editText.getText().toString());
                    double res=w.MilliToKilo(cur);
                    editText1.setText(""+res);


                }
                else if (string.equals("WEIGHT")&&(string5.equals("MILLIGRAM"))&&(string6.equals("GRAM"))){

                    spinner1.setVisibility(View.INVISIBLE);
                    spinner4.setVisibility(View.INVISIBLE);
                    spinner2.setVisibility(View.INVISIBLE);
                    spinner5.setVisibility(View.INVISIBLE);
                    spinner3.setVisibility(View.VISIBLE);
                    spinner6.setVisibility(View.VISIBLE);
                    editText1.setVisibility(View.VISIBLE);
                    editText.setVisibility(View.VISIBLE);
                    double cur= Double.parseDouble(editText.getText().toString());
                    double res=w.MilliToGram(cur);
                    editText1.setText(""+res);


                }
                else if (string.equals("WEIGHT")&&(string5.equals("KILOGRAM"))&&(string6.equals("MILLIGRAM"))){

                    spinner1.setVisibility(View.INVISIBLE);
                    spinner4.setVisibility(View.INVISIBLE);
                    spinner2.setVisibility(View.INVISIBLE);
                    spinner5.setVisibility(View.INVISIBLE);
                    spinner3.setVisibility(View.VISIBLE);
                    spinner6.setVisibility(View.VISIBLE);
                    editText1.setVisibility(View.VISIBLE);
                    editText.setVisibility(View.VISIBLE);
                    double cur= Double.parseDouble(editText.getText().toString());
                    double res=w.KiloToMilli(cur);
                    editText1.setText(""+res);


                }
                else if (string.equals("WEIGHT")&&(string5.equals("KILOGRAM"))&&(string6.equals("GRAM"))){

                    spinner1.setVisibility(View.INVISIBLE);
                    spinner4.setVisibility(View.INVISIBLE);
                    spinner2.setVisibility(View.INVISIBLE);
                    spinner5.setVisibility(View.INVISIBLE);
                    spinner3.setVisibility(View.VISIBLE);
                    spinner6.setVisibility(View.VISIBLE);
                    editText1.setVisibility(View.VISIBLE);
                    editText.setVisibility(View.VISIBLE);
                    double cur= Double.parseDouble(editText.getText().toString());
                    double res=w.KiloToGram(cur);
                    editText1.setText(""+res);


                }
                else if (string.equals("WEIGHT")&&(string5.equals("GRAM"))&&(string6.equals("KILOGRAM"))){

                    spinner1.setVisibility(View.INVISIBLE);
                    spinner4.setVisibility(View.INVISIBLE);
                    spinner2.setVisibility(View.INVISIBLE);
                    spinner5.setVisibility(View.INVISIBLE);
                    spinner3.setVisibility(View.VISIBLE);
                    spinner6.setVisibility(View.VISIBLE);
                    editText1.setVisibility(View.VISIBLE);
                    editText.setVisibility(View.VISIBLE);
                    double cur= Double.parseDouble(editText.getText().toString());
                    double res=w.GramToKilo(cur);
                    editText1.setText(""+res);



                }
                else if (string.equals("WEIGHT")&&(string5.equals("GRAM"))&&(string6.equals("MILLIGRAM"))){

                    spinner1.setVisibility(View.INVISIBLE);
                    spinner4.setVisibility(View.INVISIBLE);
                    spinner2.setVisibility(View.INVISIBLE);
                    spinner5.setVisibility(View.INVISIBLE);
                    spinner3.setVisibility(View.VISIBLE);
                    spinner6.setVisibility(View.VISIBLE);
                    editText1.setVisibility(View.VISIBLE);
                    editText.setVisibility(View.VISIBLE);
                    double cur= Double.parseDouble(editText.getText().toString());
                    double res=w.GramToMili(cur);
                    editText1.setText(""+res);



                }





            }
                });}}





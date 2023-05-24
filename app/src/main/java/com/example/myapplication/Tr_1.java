package com.example.myapplication;



import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class Tr_1 extends AppCompatActivity implements AdapterView.OnItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //базовые переменные

        setContentView(R.layout.activity_tr1);

        TextView out1 = findViewById(R.id.out_1);

         //int a1 = 0;



        // Получаем экземпляр элемента Spinner
        Spinner spinner2 = findViewById(R.id.spinner_2);
        Spinner spinner3 = findViewById(R.id.spinner_3);

        // Настраиваем адаптер
        ArrayAdapter<?> adapter2 =
                ArrayAdapter.createFromResource(this, R.array.KmL,
                        android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //spin3
        ArrayAdapter<?> adapter3 =
                ArrayAdapter.createFromResource(this, R.array.sost,
                        android.R.layout.simple_spinner_item);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Вызываем адаптерs
        spinner2.setAdapter(adapter2);
        spinner3.setAdapter(adapter3);



        // вывод
        Button button1 = findViewById(R.id.button);

        button1.setOnClickListener(v -> {


            //считаем

            //kml
            spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                public void onItemSelected(AdapterView<?> parent,
                                           View itemSelected, int selectedItemPosition, long selectedId) {

                    if("Хина" == String.valueOf(true)){

                        out1.setText("робит");
                    }

                }
                public void onNothingSelected(AdapterView<?> parent) {
                }
            });

            //sost
            spinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                public void onItemSelected(AdapterView<?> parent,
                                           View itemSelected, int selectedItemPosition, long selectedId) {



                }
                public void onNothingSelected(AdapterView<?> parent) {
                }
            });

            //меняем эдиттекст
            // out1.setText(a1[0]);


            //out1.setText("2020");

        });

    }







    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        String text = parent.getItemAtPosition(position).toString();
        Toast.makeText(parent.getContext(),text,Toast.LENGTH_SHORT).show();
    }






}
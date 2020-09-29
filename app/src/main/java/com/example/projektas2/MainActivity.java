package com.example.projektas2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    TextView Ptekstas;
    EditText Stekstas;
    Button Sbutton;
    Spinner Zspinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Ptekstas = (TextView) findViewById(R.id.Ptekstas);
        Stekstas = (EditText) findViewById(R.id.Stekstas);
        Sbutton = (Button) findViewById(R.id.Sbutton);
        Sbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(),
                        "Įrašykite tekstą",
                        Toast.LENGTH_SHORT);
                toast.show();
            }
        });
    }
        /*Stekstas.addTextChangedListener(new TextWatcher() {
            Antroji antroji = new Antroji();
            antroji.onTextChanged();
            antroji.afterTextChanged();
        });
        Spinner Zspinner = (Spinner) findViewById(R.id.Zspinner);
        Zspinner.setOnItemSelectedListener((AdapterView.OnItemSelectedListener) this);

        List<String> categories = new ArrayList<String>();
        categories.add("Žodžiai");
        categories.add("Ženklai");
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories);

        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        Zspinner.setAdapter(dataAdapter);
    }
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        // On selecting a spinner item
        String item = parent.getItemAtPosition(position).toString();
        // Showing selected spinner item
        Toast.makeText(parent.getContext(), "Selected: " + item, Toast.LENGTH_LONG).show();
    }
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub
    }*/
}

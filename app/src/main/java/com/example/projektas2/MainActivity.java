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

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener  {
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

        Stekstas.addTextChangedListener(new TextWatcher() {
            public void beforeTextChanged(CharSequence s, int start, int before, int count) {

            }

            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String text = Stekstas.getText().toString();
                text = text.replace("\n", " ");
                String[] textArray = text.split(" ");
                Ptekstas.setText("Žodžiai: " + textArray.length);
            }

            public void afterTextChanged(Editable editable) {
                String currentText = editable.toString();
                int currentLength = currentText.length();
                Ptekstas.setText("Current length: " + currentLength);
            }
        });
        Spinner spinner = (Spinner) findViewById(R.id.Zspinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.tekstas, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
    }
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String text = parent.getItemAtPosition(position).toString();
        Toast.makeText(parent.getContext(), text, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
}
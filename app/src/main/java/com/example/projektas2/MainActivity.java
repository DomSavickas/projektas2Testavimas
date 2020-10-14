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
    private TextView Ptekstas;
    private EditText Stekstas;
    private Spinner Zspinner;

    public MainActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.Ptekstas = (TextView) findViewById(R.id.Ptekstas);
        this.Stekstas = (EditText) findViewById(R.id.Stekstas);
        this.Zspinner = (Spinner) findViewById(R.id.Zspinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.tekstas, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R. layout.simple_spinner_dropdown_item);
        this.Zspinner.setAdapter(adapter);
    }
    public void onSbuttonClick (View view){
        Toast.makeText(this, this.Zspinner.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();
        if (this.Zspinner.getSelectedItem().toString().equalsIgnoreCase(getString(R.string.Selection_Char))) {
            String currentText = Stekstas.toString();
            Ptekstas.setText("Simboliai: " + CharWordCounter.CharCounter(currentText));
        }
        else {
            String text = Stekstas.getText().toString();
            Ptekstas.setText("Žodžiai: " + CharWordCounter.WordCounter(text));
        }
    };
}
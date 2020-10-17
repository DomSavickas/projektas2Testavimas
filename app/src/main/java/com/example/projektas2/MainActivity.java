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
    private TextView TextViewForResults;
    private EditText EditTextViewForWriting;
    private Spinner DropdownList;

    public MainActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.TextViewForResults = (TextView) findViewById(R.id.TextViewForResults);
        this.EditTextViewForWriting = (EditText) findViewById(R.id.EditTextViewForWriting);
        this.DropdownList = (Spinner) findViewById(R.id.DropdownList);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.tekstas, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R. layout.simple_spinner_dropdown_item);
        this.DropdownList.setAdapter(adapter);
    }
    public void onButtonForCalculationClick (View view){
        Toast.makeText(this, this.DropdownList.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();
        if (this.DropdownList.getSelectedItem().toString().equalsIgnoreCase(getString(R.string.Selection_Char))) {
            String currentText = EditTextViewForWriting.getText().toString();
            int testCharLength = CharWordCounter.CharCounter(currentText);
            if (currentText.matches("")){
                TextViewForResults.setText("");
                Toast.makeText(this, "Įveskite tekstą", Toast.LENGTH_SHORT).show();}
            else {
                TextViewForResults.setText("Simboliai: " + CharWordCounter.CharCounter(currentText));}
        }
        else {
            String text = EditTextViewForWriting.getText().toString();
            int testWordLength = CharWordCounter.WordCounter(text);
            if (text.matches("")){
                TextViewForResults.setText("");
                Toast.makeText(this, "Įveskite tekstą", Toast.LENGTH_SHORT).show();}
            else {
                TextViewForResults.setText("Žodžiai: " + CharWordCounter.WordCounter(text));}
        }
    };
}
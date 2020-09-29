package com.example.projektas2;

import android.text.Editable;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Antroji {
    TextView Ptekstas;
    EditText Stekstas;
    Button Sbutton;

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
}

package com.example.inclassassignment07_yuqingw;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

public class OwnActivity extends AppCompatActivity {

    EditText mName;
    EditText mGender;
    EditText mField;
    CheckBox mStillAlive;
    String name;
    String gender;
    String field;
    boolean stillAlive;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_own);

        mName = (EditText) findViewById(R.id.name);
        mGender = (EditText) findViewById(R.id.gender);
        mField = (EditText) findViewById(R.id.field);
        mStillAlive = (CheckBox) findViewById(R.id.alive);
    }

    public void submitPerson(View view) {
        Intent intent = new Intent();
        Person p = new Person(name,gender,field,stillAlive);
        p.setName(mName.getText().toString());
        p.setGender(mGender.getText().toString());
        p.setField(mField.getText().toString());
        p.setStillAlive(mStillAlive.isChecked());

        intent.putExtra(Keys.PERSON, p);
        setResult(RESULT_OK, intent);
        finish();
    }

}

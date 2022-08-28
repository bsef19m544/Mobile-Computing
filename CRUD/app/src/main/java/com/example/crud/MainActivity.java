package com.example.crud;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    Button buttonAdd, buttonViewAll , delete, update;
    EditText editName, editRollNumber;
    Switch switchIsActive;
    ListView listViewStudent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        buttonAdd = findViewById(R.id.buttonAdd);
        buttonViewAll = findViewById(R.id.buttonViewAll);
        editName = findViewById(R.id.editTextName);
        editRollNumber = findViewById(R.id.editTextRollNumber);
        switchIsActive = findViewById(R.id.switchStudent);
        listViewStudent = findViewById(R.id.listViewStudent);
        delete= findViewById(R.id.delete);


        buttonAdd.setOnClickListener(new View.OnClickListener() {
            StudentModel studentModel;

            @Override
            public void onClick(View v) {
                try {
                    studentModel = new StudentModel(editName.getText().toString(), Integer.parseInt(editRollNumber.getText().toString()), switchIsActive.isChecked());
                    //Toast.makeText(MainActivity.this, studentModel.toString(), Toast.LENGTH_SHORT).show();
                }
                catch (Exception e){
                    Toast.makeText(MainActivity.this, "Error", Toast.LENGTH_SHORT).show();
                }
                DBHelper dbHelper  = new DBHelper(MainActivity.this);
                dbHelper.addStudent(studentModel);
            }
        });

        buttonViewAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DBHelper dbHelper = new DBHelper(MainActivity.this);
                List<StudentModel> list = dbHelper.getAllStudents();
                ArrayAdapter arrayAdapter = new ArrayAdapter<StudentModel>
                        (MainActivity.this, android.R.layout.simple_list_item_1,list);
                listViewStudent.setAdapter(arrayAdapter);

            }
        });
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDeleteDialouge();
            }
        });
        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showupdatedia();
            }
        });

    }
    public void  showDeleteDialouge()
    {
        AlertDialog.Builder al = new AlertDialog.Builder(MainActivity.this);
        View view = getLayoutInflater().inflate(R.layout.delete_dialouge, null);
        al.setView(view);
        final EditText roll_input = view.findViewById(R.id.roll);
        Button delete_btn = view.findViewById(R.id.del);
        final AlertDialog alt= al.show();
        delete_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DBHelper dbHelper = new DBHelper(MainActivity.this);
                dbHelper.Dltstd(roll_input.getText().toString());

            }
        });
    }
    public void showupdatedia()
    {
        AlertDialog.Builder al = new AlertDialog.Builder(MainActivity.this);
        View view = getLayoutInflater().inflate(R.layout.update_dialouge, null);
        al.setView(view);
        final EditText roll = view.findViewById(R.id.rollnumber);
        Button fetch_btn = view.findViewById(R.id.Fetch);
        final  AlertDialog alertDialog = al.show();
        fetch_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showdatadia(roll.getText().toString());
                alertDialog.dismiss();
            }
        });


    }


    public void showdatadia(final String  roll )
    {
        DBHelper  dbHelper = new DBHelper(MainActivity.this);
        StudentModel studentModel = dbHelper.getstd(roll);
       AlertDialog.Builder al = new AlertDialog.Builder(MainActivity.this);
       View view = getLayoutInflater().inflate(R.layout.update_dialouge, null);
       final EditText name = view.findViewById(R.id.name);
       final EditText rol = view.findViewById(R.id.rollno);
       Button update_btn = view.findViewById(R.id.update_dia);
       name.setText(studentModel.getName());
       rol.setText(studentModel.getRollNmber());
       final AlertDialog alertDialog= al.show();
       update_btn.setOnClickListener((new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               studentModel.setName(name.getText().toString());
               studentModel.setRollNmber(rol);
               dbHelper.updateuser(studentModel);
               alertDialog.dismiss();



           }
       }));

    }
}
package com.vaibhavguptammmut.mmmutadmin.faculty;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.vaibhavguptammmut.mmmutadmin.R;

import java.util.ArrayList;
import java.util.List;

public class UpdateFaculty extends AppCompatActivity {

    FloatingActionButton fab;
    private RecyclerView csDepartment,itDepartment,ecDepartment,eeDepartment,meDepartment,ceDepartment,chDepartment,apDepartment,mbaDepartment;
    private LinearLayout csNoData,itNoData,ecNoData,eeNoData,meNoData,ceNoData,chNoData,apNoData,mbaNoData;
    private List<TeacherData> list1,list2,list3,list4,list5,list6,list7,list8,list9;
    private DatabaseReference reference,dbRef;
    private TeacherAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_faculty);

        csDepartment = findViewById(R.id.csDepartment);
        itDepartment = findViewById(R.id.itDepartment);
        ecDepartment = findViewById(R.id.ecDepartment);
        eeDepartment = findViewById(R.id.eeDepartment);
        meDepartment = findViewById(R.id.meDepartment);
        ceDepartment = findViewById(R.id.ceDepartment);
        chDepartment = findViewById(R.id.chDepartment);
        apDepartment = findViewById(R.id.apDepartment);
        mbaDepartment = findViewById(R.id.mbaDepartment);

        csNoData = findViewById(R.id.csNoData);
        itNoData = findViewById(R.id.itNoData);
        ecNoData = findViewById(R.id.ecNoData);
        eeNoData = findViewById(R.id.eeNoData);
        meNoData = findViewById(R.id.meNoData);
        ceNoData = findViewById(R.id.ceNoData);
        chNoData = findViewById(R.id.chNoData);
        apNoData = findViewById(R.id.apNoData);
        mbaNoData = findViewById(R.id.mbaNoData);

        reference = FirebaseDatabase.getInstance("https://mmmut-82969-default-rtdb.firebaseio.com/").getReference().child("teacher");

        csDepartment();
        itDepartment();
        ecDepartment();
        eeDepartment();
        meDepartment();
        ceDepartment();
        chDepartment();
        apDepartment();
        mbaDepartment();




        fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(UpdateFaculty.this,AddTeacher.class));

            }
        });

    }

    private void csDepartment() {
        dbRef = reference.child("Computer Science");
        dbRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull  DataSnapshot dataSnapshot) {
                list1 = new ArrayList<>();
                if(!dataSnapshot.exists()){
                    csNoData.setVisibility(View.VISIBLE);
                    csDepartment.setVisibility(View.GONE);
                }
                else{
                    csNoData.setVisibility(View.GONE);
                    csDepartment.setVisibility(View.VISIBLE);
                    for(DataSnapshot snapshot:dataSnapshot.getChildren()){
                        TeacherData data = snapshot.getValue(TeacherData.class);
                        list1.add(data);
                    }
                    csDepartment.setHasFixedSize(true);
                    csDepartment.setLayoutManager(new LinearLayoutManager(UpdateFaculty.this));
                    adapter = new TeacherAdapter(list1,UpdateFaculty.this,"Computer Science");
                    csDepartment.setAdapter(adapter);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

                Toast.makeText(UpdateFaculty.this, databaseError.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void itDepartment() {
        dbRef = reference.child("Information Technology");
        dbRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull  DataSnapshot dataSnapshot) {
                list2 = new ArrayList<>();
                if(!dataSnapshot.exists()){
                    itNoData.setVisibility(View.VISIBLE);
                    itDepartment.setVisibility(View.GONE);
                }
                else{
                    itNoData.setVisibility(View.GONE);
                    itDepartment.setVisibility(View.VISIBLE);
                    for(DataSnapshot snapshot:dataSnapshot.getChildren()){
                        TeacherData data = snapshot.getValue(TeacherData.class);
                        list2.add(data);
                    }
                    itDepartment.setHasFixedSize(true);
                    itDepartment.setLayoutManager(new LinearLayoutManager(UpdateFaculty.this));
                    adapter = new TeacherAdapter(list2,UpdateFaculty.this,"Information Technology");
                    itDepartment.setAdapter(adapter);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

                Toast.makeText(UpdateFaculty.this, databaseError.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void ecDepartment() {
        dbRef = reference.child("Electronics and Communication");
        dbRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull  DataSnapshot dataSnapshot) {
                list3 = new ArrayList<>();
                if(!dataSnapshot.exists()){
                    ecNoData.setVisibility(View.VISIBLE);
                    ecDepartment.setVisibility(View.GONE);
                }
                else{
                    ecNoData.setVisibility(View.GONE);
                    ecDepartment.setVisibility(View.VISIBLE);
                    for(DataSnapshot snapshot:dataSnapshot.getChildren()){
                        TeacherData data = snapshot.getValue(TeacherData.class);
                        list3.add(data);
                    }
                    ecDepartment.setHasFixedSize(true);
                    ecDepartment.setLayoutManager(new LinearLayoutManager(UpdateFaculty.this));
                    adapter = new TeacherAdapter(list3,UpdateFaculty.this,"Electronics and Communication");
                    ecDepartment.setAdapter(adapter);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

                Toast.makeText(UpdateFaculty.this, databaseError.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void eeDepartment() {
        dbRef = reference.child("Electrical");
        dbRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull  DataSnapshot dataSnapshot) {
                list4 = new ArrayList<>();
                if(!dataSnapshot.exists()){
                    eeNoData.setVisibility(View.VISIBLE);
                    eeDepartment.setVisibility(View.GONE);
                }
                else{
                    eeNoData.setVisibility(View.GONE);
                    eeDepartment.setVisibility(View.VISIBLE);
                    for(DataSnapshot snapshot:dataSnapshot.getChildren()){
                        TeacherData data = snapshot.getValue(TeacherData.class);
                        list4.add(data);
                    }
                    eeDepartment.setHasFixedSize(true);
                    eeDepartment.setLayoutManager(new LinearLayoutManager(UpdateFaculty.this));
                    adapter = new TeacherAdapter(list4,UpdateFaculty.this,"Electrical");
                    eeDepartment.setAdapter(adapter);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

                Toast.makeText(UpdateFaculty.this, databaseError.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void meDepartment() {
        dbRef = reference.child("Mechanical");
        dbRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull  DataSnapshot dataSnapshot) {
                list5 = new ArrayList<>();
                if(!dataSnapshot.exists()){
                    meNoData.setVisibility(View.VISIBLE);
                    meDepartment.setVisibility(View.GONE);
                }
                else{
                    meNoData.setVisibility(View.GONE);
                    meDepartment.setVisibility(View.VISIBLE);
                    for(DataSnapshot snapshot:dataSnapshot.getChildren()){
                        TeacherData data = snapshot.getValue(TeacherData.class);
                        list5.add(data);
                    }
                    meDepartment.setHasFixedSize(true);
                    meDepartment.setLayoutManager(new LinearLayoutManager(UpdateFaculty.this));
                    adapter = new TeacherAdapter(list5,UpdateFaculty.this,"Mechanical");
                    meDepartment.setAdapter(adapter);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

                Toast.makeText(UpdateFaculty.this, databaseError.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void ceDepartment() {
        dbRef = reference.child("Civil");
        dbRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull  DataSnapshot dataSnapshot) {
                list6 = new ArrayList<>();
                if(!dataSnapshot.exists()){
                    ceNoData.setVisibility(View.VISIBLE);
                    ceDepartment.setVisibility(View.GONE);
                }
                else{
                    ceNoData.setVisibility(View.GONE);
                    ceDepartment.setVisibility(View.VISIBLE);
                    for(DataSnapshot snapshot:dataSnapshot.getChildren()){
                        TeacherData data = snapshot.getValue(TeacherData.class);
                        list6.add(data);
                    }
                    ceDepartment.setHasFixedSize(true);
                    ceDepartment.setLayoutManager(new LinearLayoutManager(UpdateFaculty.this));
                    adapter = new TeacherAdapter(list6,UpdateFaculty.this,"Civil");
                    ceDepartment.setAdapter(adapter);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

                Toast.makeText(UpdateFaculty.this, databaseError.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void chDepartment() {
        dbRef = reference.child("Chemical");
        dbRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull  DataSnapshot dataSnapshot) {
                list7 = new ArrayList<>();
                if(!dataSnapshot.exists()){
                    chNoData.setVisibility(View.VISIBLE);
                    chDepartment.setVisibility(View.GONE);
                }
                else{
                    chNoData.setVisibility(View.GONE);
                    chDepartment.setVisibility(View.VISIBLE);
                    for(DataSnapshot snapshot:dataSnapshot.getChildren()){
                        TeacherData data = snapshot.getValue(TeacherData.class);
                        list7.add(data);
                    }
                    chDepartment.setHasFixedSize(true);
                    chDepartment.setLayoutManager(new LinearLayoutManager(UpdateFaculty.this));
                    adapter = new TeacherAdapter(list7,UpdateFaculty.this,"Chemical");
                    chDepartment.setAdapter(adapter);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

                Toast.makeText(UpdateFaculty.this, databaseError.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void apDepartment() {
        dbRef = reference.child("Applied Science");
        dbRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull  DataSnapshot dataSnapshot) {
                list8 = new ArrayList<>();
                if(!dataSnapshot.exists()){
                    apNoData.setVisibility(View.VISIBLE);
                    apDepartment.setVisibility(View.GONE);
                }
                else{
                    apNoData.setVisibility(View.GONE);
                    apDepartment.setVisibility(View.VISIBLE);
                    for(DataSnapshot snapshot:dataSnapshot.getChildren()){
                        TeacherData data = snapshot.getValue(TeacherData.class);
                        list8.add(data);
                    }
                    apDepartment.setHasFixedSize(true);
                    apDepartment.setLayoutManager(new LinearLayoutManager(UpdateFaculty.this));
                    adapter = new TeacherAdapter(list8,UpdateFaculty.this,"Applied Science");
                    apDepartment.setAdapter(adapter);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

                Toast.makeText(UpdateFaculty.this, databaseError.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void mbaDepartment() {
        dbRef = reference.child("MBA");
        dbRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull  DataSnapshot dataSnapshot) {
                list9 = new ArrayList<>();
                if(!dataSnapshot.exists()){
                    mbaNoData.setVisibility(View.VISIBLE);
                    mbaDepartment.setVisibility(View.GONE);
                }
                else{
                    mbaNoData.setVisibility(View.GONE);
                    mbaDepartment.setVisibility(View.VISIBLE);
                    for(DataSnapshot snapshot:dataSnapshot.getChildren()){
                        TeacherData data = snapshot.getValue(TeacherData.class);
                        list9.add(data);
                    }
                    mbaDepartment.setHasFixedSize(true);
                    mbaDepartment.setLayoutManager(new LinearLayoutManager(UpdateFaculty.this));
                    adapter = new TeacherAdapter(list9,UpdateFaculty.this,"MBA");
                    mbaDepartment.setAdapter(adapter);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

                Toast.makeText(UpdateFaculty.this, databaseError.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
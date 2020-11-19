package com.example.foodorderingsystem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChooseOne extends AppCompatActivity {

    Button Chef,Customer,DeliveryPerson;
    Intent intent;
    String type;
    ConstraintLayout bgimage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_one);

        AnimationDrawable animationDrawable=new AnimationDrawable();
        animationDrawable.addFrame(getResources().getDrawable(R.drawable.bg2),3000);
        animationDrawable.addFrame(getResources().getDrawable(R.drawable.img2),3000);
        animationDrawable.addFrame(getResources().getDrawable(R.drawable.img3),3000);
        animationDrawable.addFrame(getResources().getDrawable(R.drawable.img4),3000);
        animationDrawable.addFrame(getResources().getDrawable(R.drawable.img5),3000);
        animationDrawable.addFrame(getResources().getDrawable(R.drawable.img6),3000);
        animationDrawable.addFrame(getResources().getDrawable(R.drawable.img7),3000);
        animationDrawable.addFrame(getResources().getDrawable(R.drawable.img8),3000);
        animationDrawable.addFrame(getResources().getDrawable(R.drawable.bg3),3000);
        animationDrawable.addFrame(getResources().getDrawable(R.drawable.img9),3000);
        animationDrawable.addFrame(getResources().getDrawable(R.drawable.img10),3000);
        animationDrawable.addFrame(getResources().getDrawable(R.drawable.img11),3000);
        animationDrawable.addFrame(getResources().getDrawable(R.drawable.img11),3000);

        animationDrawable.setOneShot(false);
        animationDrawable.setEnterFadeDuration(850);
        animationDrawable.setExitFadeDuration(1600);

        bgimage=findViewById(R.id.back3);
        bgimage.setBackground(animationDrawable);
        animationDrawable.start();

        intent=getIntent();
        type=intent.getStringExtra("Home").toString().trim();
        Chef=(Button)findViewById(R.id.chef);
        Customer=(Button)findViewById(R.id.customer);
        DeliveryPerson=(Button)findViewById(R.id.delivery);

        Chef.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(type.equals("Email"))
                {
                    Intent loginEmail=new Intent(ChooseOne.this,ChefLogin.class);
                    startActivity(loginEmail);
                    finish();
                }

                if(type.equals("Phone"))
                {
                    Intent loginPhone=new Intent(ChooseOne.this,ChefLoginPhone.class);
                    startActivity(loginPhone);
                    finish();
                }

                if(type.equals("SignUp"))
                {
                    Intent Register =new Intent(ChooseOne.this,ChefRegistration.class);
                    startActivity(Register);
                }
            }
        });

        Customer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(type.equals("Email"))
                {
                    Intent loginEmailCust=new Intent(ChooseOne.this,CustomerLogin.class);
                    startActivity(loginEmailCust);
                    finish();
                }

                if(type.equals("Phone"))
                {
                    Intent loginPhoneCust=new Intent(ChooseOne.this,CustomerLoginPhone.class);
                    startActivity(loginPhoneCust);
                    finish();
                }

                if(type.equals("SignUp"))
                {
                    Intent RegisterCust =new Intent(ChooseOne.this,CustomerRegistration.class);
                    startActivity(RegisterCust);
                }
            }
        });

        DeliveryPerson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(type.equals("Email"))
                {
                    Intent loginEmailDelivery=new Intent(ChooseOne.this,DeliveryLogin.class);
                    startActivity(loginEmailDelivery);
                    finish();
                }

                if(type.equals("Phone"))
                {
                    Intent loginPhoneDelivery=new Intent(ChooseOne.this,DeliveryLoginPhone.class);
                    startActivity(loginPhoneDelivery);
                    finish();
                }

                if(type.equals("SignUp"))
                {
                    Intent RegisterDelivery =new Intent(ChooseOne.this,DeliveryRegistration.class);
                    startActivity(RegisterDelivery);
                }
            }
        });

    }
}
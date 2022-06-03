package com.example.learningapp;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.HashMap;
import java.util.Map.Entry;
public class Lessons extends AppCompatActivity implements View.OnClickListener{
    Button a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z;
    HashMap<String, String> hashMap = new HashMap<String, String>();
    String val;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        hashMap.put("a", "Apple");
        hashMap.put("b", "Ball");
        hashMap.put("c", "Cat");
        hashMap.put("d", "Dog");
        hashMap.put("e", "Elephant");
        hashMap.put("f", "Fan");
        hashMap.put("g", "Glass");
        hashMap.put("h", "House");
        hashMap.put("i", "Igloo");
        hashMap.put("j", "Jug");
        hashMap.put("k", "King");
        hashMap.put("l", "Lemon");
        hashMap.put("m", "Moon");
        hashMap.put("n", "Nose");
        hashMap.put("o", "Orange");
        hashMap.put("p", "Park");
        hashMap.put("q", "Queen");
        hashMap.put("r", "Ring");
        hashMap.put("s", "Sun");
        hashMap.put("t", "Table");
        hashMap.put("u", "Umbrella");
        hashMap.put("v", "Van");
        hashMap.put("w", "Watermelon");
        hashMap.put("x", "X-Ray");
        hashMap.put("y", "Yogurt");
        hashMap.put("z", "Zig zag");







        super.onCreate(savedInstanceState);
        setContentView(R.layout.lessons);

        a=findViewById(R.id.a);
        a.setOnClickListener(this); // calling onClick() method
        b=findViewById(R.id.b);
        b.setOnClickListener(this); // calling onClick() method

        c=findViewById(R.id.c);
        c.setOnClickListener(this); // calling onClick() method

        d=findViewById(R.id.d);
        d.setOnClickListener(this); // calling onClick() method

        e=findViewById(R.id.e);
        e.setOnClickListener(this); // calling onClick() method

        f=findViewById(R.id.f);
        f.setOnClickListener(this); // calling onClick() method

        g=findViewById(R.id.g);
        g.setOnClickListener(this); // calling onClick() method

        h=findViewById(R.id.h);
        h.setOnClickListener(this); // calling onClick() method

        i=findViewById(R.id.i);
        i.setOnClickListener(this); // calling onClick() method

        j=findViewById(R.id.j);
        j.setOnClickListener(this); // calling onClick() method

        k=findViewById(R.id.k);
        k.setOnClickListener(this); // calling onClick() method

        l=findViewById(R.id.l);
        l.setOnClickListener(this); // calling onClick() method

        m=findViewById(R.id.m);
        m.setOnClickListener(this); // calling onClick() method

        n=findViewById(R.id.n);
        n.setOnClickListener(this); // calling onClick() method

        o=findViewById(R.id.o);
        o.setOnClickListener(this); // calling onClick() method

        p=findViewById(R.id.p);
        p.setOnClickListener(this); // calling onClick() method

        q=findViewById(R.id.q);
        q.setOnClickListener(this); // calling onClick() method

        r=findViewById(R.id.r);
        r.setOnClickListener(this); // calling onClick() method

        s=findViewById(R.id.s);
        s.setOnClickListener(this); // calling onClick() method

        t=findViewById(R.id.t);
        t.setOnClickListener(this); // calling onClick() method

        u=findViewById(R.id.u);
        u.setOnClickListener(this); // calling onClick() method

        v=findViewById(R.id.v);
        v.setOnClickListener(this); // calling onClick() method

        w=findViewById(R.id.w);
        w.setOnClickListener(this); // calling onClick() method

        x=findViewById(R.id.x);
        x.setOnClickListener(this); // calling onClick() method

        y=findViewById(R.id.y);
        y.setOnClickListener(this); // calling onClick() method

        z=findViewById(R.id.z);
        z.setOnClickListener(this); // calling onClick() method

    }
    public void onClick(View v) {
        Intent in=new Intent(Lessons.this,Pages.class);

        Button btn = (Button) findViewById(v.getId());
        String name = btn.getText().toString();
        // System.out.println(a.get("a")); // Blue
        //String value=(String)a.get("a");
        val=hashMap.get(name.toLowerCase());


        in.putExtra("name",name);
        in.putExtra("value",val);
        startActivity(in);
    }
}

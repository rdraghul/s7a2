package com.example.raghul.contactsopener;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b = (Button)findViewById(R.id.button);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent read1=new Intent();
                read1.setAction(android.content.Intent.ACTION_VIEW);
                read1.setData(ContactsContract.Contacts.CONTENT_URI);
                startActivity(read1);
            }
        });
    }
}

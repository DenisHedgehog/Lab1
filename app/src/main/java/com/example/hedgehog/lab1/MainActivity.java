package com.example.hedgehog.lab1;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText incomingMessage = (EditText) findViewById(R.id.incoming_message_edit_text);
        Button okButton = (Button) findViewById(R.id.ok_button);
        final TextView outcomingMessage = (TextView) findViewById(R.id.outcoming_message_text_view);

        okButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = "";
                Encryption encryption = new Encryption(incomingMessage.getText().toString());
                encryption.messageToCharArray(encryption.getIncomingMessage());
                encryption.createEncryptedMessage(encryption.getCharsArray());
                message = encryption.getOutgoingMessage();
                outcomingMessage.setText(message);
            }
        });


    }
}

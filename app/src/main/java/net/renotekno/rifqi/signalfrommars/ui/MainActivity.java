package net.renotekno.rifqi.signalfrommars.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import net.renotekno.rifqi.signalfrommars.R;

public class MainActivity extends AppCompatActivity {

    private EditText mNameEdit;
    private Button mJourneyButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mNameEdit = (EditText) findViewById(R.id.nameText);
        mJourneyButton = (Button) findViewById(R.id.journeyButton);

        mJourneyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = mNameEdit.getText().toString();
                startJourney(name);
            }
        });
    }
    private void startJourney(String name) {
        Intent intent = new Intent(this, JourneyActivity.class);
        intent.putExtra("name", name);
        startActivity(intent);
    }

    @Override
    protected void onResume() {
        super.onResume();
        mNameEdit.setText("");
    }
}

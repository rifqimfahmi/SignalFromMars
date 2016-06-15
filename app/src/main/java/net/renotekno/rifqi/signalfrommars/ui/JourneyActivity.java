package net.renotekno.rifqi.signalfrommars.ui;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import net.renotekno.rifqi.signalfrommars.R;
import net.renotekno.rifqi.signalfrommars.model.Choice;
import net.renotekno.rifqi.signalfrommars.model.Page;
import net.renotekno.rifqi.signalfrommars.model.Story;

public class JourneyActivity extends AppCompatActivity {

    private String mName;
    private TextView mJourneyText;
    private ImageView mImageJourney;
    private Button mChoice1;
    private Button mChoice2;
    private Story mStory = new Story();
    private Page mPage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_journey);

        Intent intent = getIntent();
        mName = intent.getStringExtra("name");

        if(mName == null || mName.equals("")){
            mName = "Friend";
        }

        mJourneyText = (TextView)findViewById(R.id.journeyTextView);
        mImageJourney = (ImageView)findViewById(R.id.journeyImage);
        mChoice1 = (Button)findViewById(R.id.buttonChoice1);
        mChoice2 = (Button)findViewById(R.id.buttonChoice2);

        loadPage(0);
    }

    public void loadPage(int thePage){
        mPage = mStory.getPage(thePage);

        String theText = mPage.getText();
        theText = String.format(theText, mName);
        mJourneyText.setText(theText);

        Drawable drawable = getResources().getDrawable(mPage.getImageId());
        mImageJourney.setImageDrawable(drawable);

        if(mPage.isFinish()){
            mChoice1.setVisibility(View.INVISIBLE);
            mChoice2.setText("Play again");
            mChoice2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish();
                }
            });

        }else {
            mChoice1.setText(mPage.getChoice1().getText());
            mChoice1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int dstPage = mPage.getChoice1().getNextPage();
                    loadPage(dstPage);
                }
            });

            mChoice2.setText(mPage.getChoice2().getText());
            mChoice2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int dstPage = mPage.getChoice2().getNextPage();
                    loadPage(dstPage);
                }
            });

        }
    }
}

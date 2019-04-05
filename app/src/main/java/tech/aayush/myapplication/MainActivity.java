package tech.aayush.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class MainActivity extends AppCompatActivity {

    private Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b = findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Uri authUri = Uri.parse("https://stackoverflow.com/oauth")
                        .buildUpon()
                        .appendQueryParameter("param1", "14809")
                        .appendQueryParameter("param2", "aayush.tech")
                        .build();
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(String.valueOf(authUri)));
                startActivity(browserIntent);

            }
        });


    }
}

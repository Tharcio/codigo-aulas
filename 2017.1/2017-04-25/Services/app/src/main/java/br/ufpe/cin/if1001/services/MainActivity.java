package br.ufpe.cin.if1001.services;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button btn_NoBindingService = (Button) findViewById(R.id.botao_musicServiceWithoutBinding);
        btn_NoBindingService.setOnClickListener(new View.OnClickListener() {
            public void onClick(View src) {
                startActivity(new Intent(getApplicationContext(),MusicPlayerNoBindingActivity.class));
            }
        });

        final Button btn_BindingService  = (Button) findViewById(R.id.botao_musicServiceWithBinding);
        btn_BindingService.setOnClickListener(new View.OnClickListener() {
            public void onClick(View src) {
                startActivity(new Intent(getApplicationContext(),MusicPlayerWithBindingActivity.class));
            }
        });

        final Button btn_intentService = (Button) findViewById(R.id.botao_downloadService);
        btn_intentService.setOnClickListener(new View.OnClickListener() {
            public void onClick(View src) {
                startActivity(new Intent(getApplicationContext(),DownloadActivity.class));
            }
        });

        final Button btn_broadcast = (Button) findViewById(R.id.botao_enviaBroadcast);
        btn_broadcast.setOnClickListener(new View.OnClickListener() {
            public void onClick(View src) {
                sendBroadcast(new Intent("br.ufpe.cin.if1001.broadcasts.exemplo"));
            }
        });
    }
}
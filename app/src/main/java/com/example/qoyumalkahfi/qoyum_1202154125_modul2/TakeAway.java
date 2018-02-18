package com.example.qoyumalkahfi.qoyum_1202154125_modul2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by qoyumalkahfi on 18/02/2018.
 */

public class TakeAway extends AppCompatActivity {

    // method ketika dijalankan saat activity dibuat
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_take_away);
    }

    // method untuk mengarahkan ke aktivitas selanjutnya
    public void onClickOrder(View view) {
        Intent intent = new Intent(this,Menu.class);
        startActivity(intent);
    }
}

package cn.xiaoniangao.common.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import cn.xiaoniangao.common.mylibrary.ModuleUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String showName = ModuleUtils.getModuleName("test");
        ((TextView)findViewById(R.id.show_name)).setText(showName);

    }
}
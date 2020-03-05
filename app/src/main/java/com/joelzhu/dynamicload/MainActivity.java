package com.joelzhu.dynamicload;

import android.content.Intent;

import com.joelzhu.base.present.IntentKey;
import com.joelzhu.base.view.AbsBaseActivity;
import com.joelzhu.bindview.annotations.OnClick;
import com.joelzhu.bindview.annotations.RootView;

@RootView(R.layout.activity_main)
public class MainActivity extends AbsBaseActivity {
    @OnClick(R.id.loaderPart1)
    public void loadPart1() {
        final String apkName = "part1.apk";
        final String hostClass = "com.joelzhu.part1.MainActivity";

        startHostActivity(apkName, hostClass);
    }

    @OnClick(R.id.loaderPart2)
    public void loadPart2() {
        final String apkName = "part2.apk";
        final String hostClass = "com.joelzhu.part2.MainActivity";

        startHostActivity(apkName, hostClass);
    }

    private void startHostActivity(final String apkName, final String hostClass) {
        Intent intent = new Intent(this, HostActivity.class);
        intent.putExtra(IntentKey.APK_NAME, apkName);
        intent.putExtra(IntentKey.HOME_CLASS, hostClass);
        startActivity(intent);
    }
}
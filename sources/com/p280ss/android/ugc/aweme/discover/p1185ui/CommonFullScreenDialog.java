package com.p280ss.android.ugc.aweme.discover.p1185ui;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p029v7.app.AppCompatDialog;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.CommonFullScreenDialog */
public class CommonFullScreenDialog extends AppCompatDialog {
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (VERSION.SDK_INT >= 21) {
            getWindow().addFlags(67108864);
        }
        getWindow().setLayout(-1, -1);
    }
}

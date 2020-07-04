package com.p280ss.android.ugc.aweme.commercialize.views.bottomdialog;

import android.content.Context;
import android.os.Bundle;
import android.support.p029v7.app.AppCompatDialog;
import android.view.Window;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.bottomdialog.AdBottomDialog */
public abstract class AdBottomDialog extends AppCompatDialog {
    /* renamed from: a */
    public abstract int mo66262a();

    public AdBottomDialog(Context context) {
        super(context, R.style.c);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(mo66262a());
        Window window = getWindow();
        if (window != null) {
            window.setGravity(80);
        }
    }
}

package com.p280ss.caijing.globaliap.p1797h;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.view.Window;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.caijing.globaliap.h.a */
public final class C45866a extends ProgressDialog {
    public C45866a(Context context) {
        super(context, R.style.lv);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.ie);
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawableResource(17170445);
            window.clearFlags(2);
        }
    }
}

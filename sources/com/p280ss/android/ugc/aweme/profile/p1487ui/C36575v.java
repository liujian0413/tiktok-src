package com.p280ss.android.ugc.aweme.profile.p1487ui;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.v */
public final class C36575v extends Dialog {

    /* renamed from: a */
    private TextView f95975a;

    /* renamed from: b */
    private OnClickListener f95976b;

    public final void dismiss() {
        C36591w.m118073a(this);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.k9);
        findViewById(R.id.dyz).setOnClickListener(this.f95976b);
        this.f95975a = (TextView) findViewById(R.id.dsf);
    }
}

package com.p280ss.android.ugc.aweme.account.login;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import com.bytedance.common.utility.C9738o;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.account.login.o */
public final class C21570o extends Dialog {

    /* renamed from: a */
    public C21571a f57904a;

    /* renamed from: com.ss.android.ugc.aweme.account.login.o$a */
    public interface C21571a {
        /* renamed from: c */
        void mo57311c();
    }

    public final void onBackPressed() {
        super.onBackPressed();
        if (this.f57904a != null) {
            this.f57904a.mo57311c();
        }
    }

    public C21570o(Context context) {
        super(context, R.style.vc);
        setContentView(LayoutInflater.from(context).inflate(R.layout.km, null));
        setCanceledOnTouchOutside(false);
        Window window = getWindow();
        LayoutParams attributes = window.getAttributes();
        attributes.height = (int) C9738o.m28708b(context, 57.0f);
        attributes.width = (int) C9738o.m28708b(context, 57.0f);
        window.setAttributes(attributes);
    }
}

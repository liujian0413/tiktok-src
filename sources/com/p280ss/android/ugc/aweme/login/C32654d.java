package com.p280ss.android.ugc.aweme.login;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import com.bytedance.common.utility.C9738o;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.login.d */
public final class C32654d extends Dialog {

    /* renamed from: a */
    public C32655a f85118a;

    /* renamed from: com.ss.android.ugc.aweme.login.d$a */
    public interface C32655a {
        /* renamed from: a */
        void mo84100a();
    }

    public final void onBackPressed() {
        super.onBackPressed();
        if (this.f85118a != null) {
            this.f85118a.mo84100a();
        }
    }

    public C32654d(Context context) {
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

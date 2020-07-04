package com.p280ss.android.ugc.aweme.miniapp.anchor;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.miniapp.anchor.c */
public final class C33337c {

    /* renamed from: a */
    public static final C33337c f87070a = new C33337c();

    private C33337c() {
    }

    /* renamed from: a */
    public static final void m107792a(Context context) {
        if (context != null) {
            context.startActivity(new Intent(context, MicroAppMoreElementsActivity.class));
            if (context instanceof Activity) {
                ((Activity) context).overridePendingTransition(R.anim.bq, R.anim.bs);
            }
        }
    }
}

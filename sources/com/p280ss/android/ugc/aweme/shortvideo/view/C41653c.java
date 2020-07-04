package com.p280ss.android.ugc.aweme.shortvideo.view;

import android.app.Activity;
import android.content.Context;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.view.c */
public final class C41653c extends C41654d {
    private C41653c(Context context, int i) {
        super(context, 3);
    }

    /* renamed from: a */
    public static C41653c m132582a(Context context, String str) {
        if (context == null || !(context instanceof Activity) || ((Activity) context).isFinishing()) {
            return null;
        }
        C41653c cVar = new C41653c(context, 3);
        cVar.setCancelable(false);
        cVar.setIndeterminate(false);
        cVar.setMax(100);
        cVar.show();
        cVar.setContentView(R.layout.a5_);
        cVar.setMessage(str);
        cVar.mo102302a();
        return cVar;
    }
}

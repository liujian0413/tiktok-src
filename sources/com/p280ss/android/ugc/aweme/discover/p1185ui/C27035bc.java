package com.p280ss.android.ugc.aweme.discover.p1185ui;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.bc */
public final class C27035bc {
    /* renamed from: a */
    public static String m88797a(Context context) {
        if (C6399b.m19946v()) {
            return context.getResources().getString(R.string.cbe);
        }
        return "%1$s";
    }

    /* renamed from: a */
    public static boolean m88798a(String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        return TextUtils.isEmpty(str.trim());
    }
}

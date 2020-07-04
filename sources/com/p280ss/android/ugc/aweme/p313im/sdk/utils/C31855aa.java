package com.p280ss.android.ugc.aweme.p313im.sdk.utils;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.common.utility.C9738o;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.utils.aa */
public final class C31855aa {
    /* renamed from: a */
    private static void m103398a(Context context, Intent intent) {
        if (context != null) {
            try {
                context.startActivity(intent);
            } catch (Exception unused) {
                C9738o.m28693a(context, (int) R.string.bqt);
            }
        }
    }

    /* renamed from: b */
    public static void m103400b(Context context, String str) {
        Intent intent = new Intent("android.intent.action.SENDTO");
        intent.setData(Uri.parse(str));
        m103398a(context, intent);
    }

    /* renamed from: a */
    public static void m103399a(Context context, String str) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.DIAL");
        StringBuilder sb = new StringBuilder("tel:");
        sb.append(str);
        intent.setData(Uri.parse(sb.toString()));
        intent.addFlags(268435456);
        m103398a(context, intent);
    }
}

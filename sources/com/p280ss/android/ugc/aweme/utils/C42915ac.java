package com.p280ss.android.ugc.aweme.utils;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* renamed from: com.ss.android.ugc.aweme.utils.ac */
public final class C42915ac {

    /* renamed from: a */
    Context f111446a;

    /* renamed from: b */
    String f111447b;

    /* renamed from: c */
    String f111448c;

    /* renamed from: a */
    public final void mo104636a() {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.DIAL");
        StringBuilder sb = new StringBuilder("tel:");
        sb.append(this.f111447b);
        intent.setData(Uri.parse(sb.toString()));
        this.f111446a.startActivity(intent);
    }

    public C42915ac(Context context, String str, String str2) {
        this.f111447b = str;
        this.f111448c = str2;
        this.f111446a = context;
    }
}

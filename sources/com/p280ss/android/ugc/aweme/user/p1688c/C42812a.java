package com.p280ss.android.ugc.aweme.user.p1688c;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.google.gson.C6600e;
import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import com.p280ss.android.ugc.aweme.p340x.C7285c;

/* renamed from: com.ss.android.ugc.aweme.user.c.a */
public final class C42812a {

    /* renamed from: a */
    private C6600e f111268a = new C6600e();

    /* renamed from: b */
    private SharedPreferences f111269b = C7285c.m22838a(AwemeApplication.m21341a(), "aweme_user", 0);

    /* renamed from: c */
    private Editor f111270c = this.f111269b.edit();

    /* renamed from: a */
    public final int mo104502a(String str) {
        SharedPreferences sharedPreferences = this.f111269b;
        StringBuilder sb = new StringBuilder("ftc_user_mode_prefix_");
        sb.append(str);
        return sharedPreferences.getInt(sb.toString(), 0);
    }
}

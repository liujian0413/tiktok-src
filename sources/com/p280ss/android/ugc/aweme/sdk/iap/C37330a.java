package com.p280ss.android.ugc.aweme.sdk.iap;

import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.support.p029v7.app.AlertDialog.C1081a;
import android.text.TextUtils;

/* renamed from: com.ss.android.ugc.aweme.sdk.iap.a */
public final class C37330a {

    /* renamed from: a */
    int f97484a;

    /* renamed from: b */
    int f97485b;

    /* renamed from: c */
    int f97486c;

    /* renamed from: d */
    int f97487d;

    /* renamed from: e */
    String f97488e;

    /* renamed from: f */
    String f97489f;

    /* renamed from: g */
    String f97490g;

    /* renamed from: h */
    String f97491h;

    /* renamed from: i */
    private OnClickListener f97492i;

    /* renamed from: j */
    private OnClickListener f97493j;

    private C37330a() {
    }

    /* renamed from: a */
    public static C37330a m119843a() {
        return new C37330a();
    }

    /* renamed from: a */
    public final C37330a mo93951a(int i) {
        this.f97485b = i;
        return this;
    }

    /* renamed from: b */
    public final C37330a mo93953b(int i) {
        this.f97487d = i;
        return this;
    }

    /* renamed from: a */
    private String m119844a(Context context) {
        return m119845a(context, this.f97488e, this.f97484a);
    }

    /* renamed from: b */
    private String m119846b(Context context) {
        return m119845a(context, this.f97489f, this.f97485b);
    }

    /* renamed from: c */
    private String m119847c(Context context) {
        return m119845a(context, this.f97490g, this.f97486c);
    }

    /* renamed from: d */
    private String m119848d(Context context) {
        return m119845a(context, this.f97491h, this.f97487d);
    }

    /* renamed from: a */
    public final void mo93952a(C1081a aVar) {
        Context a = aVar.mo4224a();
        aVar.mo4233a((CharSequence) m119844a(a));
        aVar.mo4240b((CharSequence) m119846b(a));
        aVar.mo4234a((CharSequence) m119847c(a), this.f97492i);
        aVar.mo4241b((CharSequence) m119848d(a), this.f97493j);
    }

    /* renamed from: a */
    private static String m119845a(Context context, String str, int i) {
        if (!TextUtils.isEmpty(str) || i == 0) {
            return "";
        }
        return context.getResources().getString(i);
    }
}

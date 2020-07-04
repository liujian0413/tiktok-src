package com.bytedance.ies.dmt.p262ui.p563c;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.common.C10775d;
import com.p280ss.android.common.util.C6776h;

/* renamed from: com.bytedance.ies.dmt.ui.c.a */
public final class C10761a {

    /* renamed from: a */
    private int f28863a;

    /* renamed from: b */
    private int f28864b;

    /* renamed from: c */
    private int f28865c;

    /* renamed from: d */
    private int f28866d;

    /* renamed from: e */
    private String f28867e;

    /* renamed from: f */
    private Context f28868f;

    /* renamed from: a */
    public static C10761a m31383a(Context context, int i) {
        return C10762b.m31414a(context, i);
    }

    /* renamed from: a */
    public static C10761a m31387a(Context context, String str) {
        return C10762b.m31415a(context, str);
    }

    /* renamed from: c */
    public static C10761a m31399c(Context context, int i) {
        return C10762b.m31416b(context, i);
    }

    /* renamed from: c */
    public static C10761a m31403c(Context context, String str) {
        return C10762b.m31417b(context, str);
    }

    /* renamed from: e */
    public static C10761a m31409e(Context context, int i) {
        return C10762b.m31418c(context, i);
    }

    /* renamed from: e */
    public static C10761a m31410e(Context context, String str) {
        return C10762b.m31419c(context, str);
    }

    /* renamed from: a */
    public final void mo25750a() {
        try {
            if (this.f28868f != null && !TextUtils.isEmpty(this.f28867e) && C6776h.m20951c(this.f28868f, this.f28868f.getPackageName())) {
                if (C10775d.m31450a().f28892b) {
                    if (this.f28866d == 1) {
                        C10763c.m31420a(this.f28868f).mo25751a(this.f28867e, this.f28863a, this.f28864b, this.f28865c);
                    } else if (this.f28866d == 2) {
                        C10763c.m31420a(this.f28868f).mo25753b(this.f28867e, this.f28863a, this.f28864b, this.f28865c);
                    } else if (this.f28866d == 3) {
                        C10763c.m31420a(this.f28868f).mo25754c(this.f28867e, this.f28863a, this.f28864b, this.f28865c);
                    }
                    return;
                }
                C9738o.m28697a(this.f28868f, this.f28867e);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: d */
    public static C10761a m31408d(Context context, String str) {
        return m31397b(context, str, 1, 1);
    }

    /* renamed from: f */
    public static C10761a m31412f(Context context, String str) {
        return m31405c(context, str, 1, 1);
    }

    /* renamed from: b */
    public static C10761a m31391b(Context context, int i) {
        return m31389a(context, context.getString(i), 1, 1);
    }

    /* renamed from: d */
    public static C10761a m31407d(Context context, int i) {
        return m31397b(context, context.getString(i), 1, 1);
    }

    /* renamed from: f */
    public static C10761a m31411f(Context context, int i) {
        return m31405c(context, context.getString(i), 1, 1);
    }

    /* renamed from: b */
    public static C10761a m31395b(Context context, String str) {
        return m31389a(context, str, 1, 1);
    }

    /* renamed from: b */
    public static C10761a m31392b(Context context, int i, int i2) {
        return m31393b(context, i, i2, 1);
    }

    /* renamed from: a */
    public static C10761a m31384a(Context context, int i, int i2) {
        return m31385a(context, i, i2, 1);
    }

    /* renamed from: c */
    public static C10761a m31400c(Context context, int i, int i2) {
        return m31401c(context, i, i2, 1);
    }

    /* renamed from: a */
    public static C10761a m31388a(Context context, String str, int i) {
        return m31389a(context, str, i, 1);
    }

    /* renamed from: b */
    public static C10761a m31396b(Context context, String str, int i) {
        return m31397b(context, str, i, 1);
    }

    /* renamed from: c */
    public static C10761a m31404c(Context context, String str, int i) {
        return m31405c(context, str, i, 1);
    }

    /* renamed from: a */
    public static C10761a m31385a(Context context, int i, int i2, int i3) {
        C10761a aVar = new C10761a(context, context.getString(i), i2, 1, i3, 0);
        return aVar;
    }

    /* renamed from: b */
    public static C10761a m31393b(Context context, int i, int i2, int i3) {
        C10761a aVar = new C10761a(context, context.getString(i), i2, 2, i3, 0);
        return aVar;
    }

    /* renamed from: c */
    public static C10761a m31401c(Context context, int i, int i2, int i3) {
        C10761a aVar = new C10761a(context, context.getString(i), i2, 3, i3, 0);
        return aVar;
    }

    /* renamed from: a */
    public static C10761a m31389a(Context context, String str, int i, int i2) {
        C10761a aVar = new C10761a(context, str, i, 1, i2, 0);
        return aVar;
    }

    /* renamed from: b */
    public static C10761a m31397b(Context context, String str, int i, int i2) {
        C10761a aVar = new C10761a(context, str, i, 2, i2, 0);
        return aVar;
    }

    /* renamed from: c */
    public static C10761a m31405c(Context context, String str, int i, int i2) {
        C10761a aVar = new C10761a(context, str, i, 3, i2, 0);
        return aVar;
    }

    /* renamed from: a */
    public static C10761a m31386a(Context context, int i, int i2, int i3, int i4) {
        C10761a aVar = new C10761a(context, context.getString(i), 1, 1, 2, i4);
        return aVar;
    }

    /* renamed from: b */
    public static C10761a m31394b(Context context, int i, int i2, int i3, int i4) {
        C10761a aVar = new C10761a(context, context.getString(i), 1, 2, 2, i4);
        return aVar;
    }

    /* renamed from: c */
    public static C10761a m31402c(Context context, int i, int i2, int i3, int i4) {
        C10761a aVar = new C10761a(context, context.getString(i), 1, 3, 2, i4);
        return aVar;
    }

    /* renamed from: a */
    public static C10761a m31390a(Context context, String str, int i, int i2, int i3) {
        C10761a aVar = new C10761a(context, str, 1, 1, 2, i3);
        return aVar;
    }

    /* renamed from: b */
    public static C10761a m31398b(Context context, String str, int i, int i2, int i3) {
        C10761a aVar = new C10761a(context, str, 1, 2, 2, i3);
        return aVar;
    }

    /* renamed from: c */
    public static C10761a m31406c(Context context, String str, int i, int i2, int i3) {
        C10761a aVar = new C10761a(context, str, 1, 3, 2, i3);
        return aVar;
    }

    private C10761a(Context context, String str, int i, int i2, int i3, int i4) {
        this.f28867e = str;
        this.f28863a = i;
        this.f28866d = i2;
        this.f28868f = context;
        this.f28864b = i3;
        this.f28865c = i4;
    }
}

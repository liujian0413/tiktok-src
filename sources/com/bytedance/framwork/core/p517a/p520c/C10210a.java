package com.bytedance.framwork.core.p517a.p520c;

import android.content.Context;
import com.bytedance.frameworks.baselib.p511a.C10071b;
import com.bytedance.frameworks.baselib.p511a.C10071b.C10072a;
import com.bytedance.frameworks.baselib.p511a.C10071b.C10074c;
import com.bytedance.framwork.core.p517a.p518a.C10206c;
import java.util.List;

/* renamed from: com.bytedance.framwork.core.a.c.a */
public final class C10210a implements C10214b {

    /* renamed from: a */
    C10071b f27779a;

    /* renamed from: b */
    volatile long f27780b;

    /* renamed from: c */
    boolean f27781c;

    /* renamed from: d */
    int f27782d;

    /* renamed from: e */
    Context f27783e;

    /* renamed from: f */
    String f27784f;

    /* renamed from: a */
    public final boolean mo24926a() {
        if (this.f27780b == 1800000) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo24927a(String str) {
        return this.f27779a.mo24727a(str);
    }

    public C10210a(Context context, final String str) {
        this.f27784f = str;
        this.f27783e = context;
        final String str2 = str;
        C102133 r0 = new C10071b(context.getApplicationContext(), new C10072a() {
            /* renamed from: c */
            public final int mo23967c() {
                return C10206c.m30289d(str);
            }

            /* renamed from: d */
            public final long mo23968d() {
                return (long) C10206c.m30290e(str);
            }

            /* renamed from: b */
            public final List<String> mo23966b() {
                return C10206c.m30285a(str, "sdk_monitor");
            }

            /* renamed from: a */
            public final String mo23965a() {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append("sdk_monitor");
                return sb.toString();
            }
        }, new C10074c() {
            /* renamed from: a */
            public final boolean mo23969a() {
                return C10206c.m30292g(str);
            }

            /* renamed from: b */
            public final long mo23970b() {
                return C10210a.this.f27780b;
            }

            /* renamed from: c */
            public final boolean mo23971c() {
                return C10210a.this.f27781c;
            }

            /* renamed from: d */
            public final long mo23972d() {
                return C10206c.m30291f(str);
            }
        }) {
            /* renamed from: a */
            public final boolean mo23973a(String str, byte[] bArr) {
                if (C10216d.m30327a(str2) != null) {
                    C10217e sendLog = C10216d.m30327a(str2).sendLog(33554432, str, bArr, 1, "application/json; charset=utf-8");
                    if (sendLog == null || sendLog.f27793a <= 0) {
                        C10210a.this.f27781c = true;
                    } else {
                        C10210a.this.f27781c = false;
                        if (sendLog.f27793a == 200 && sendLog.f27794b != null) {
                            if (sendLog.f27794b.optInt("is_crash", 0) == 1) {
                                C10210a.this.f27780b = 1800000;
                                C10210a.this.f27782d = 3;
                                return false;
                            } else if (sendLog.f27794b.opt("message").equals("success")) {
                                C10210a.this.f27782d = 0;
                                C10210a.this.f27780b = 0;
                                return true;
                            }
                        }
                        if (500 <= sendLog.f27793a && sendLog.f27793a <= 600) {
                            if (C10210a.this.f27782d == 0) {
                                C10210a.this.f27780b = 300000;
                                C10210a.this.f27782d++;
                            } else if (C10210a.this.f27782d == 1) {
                                C10210a.this.f27780b = 900000;
                                C10210a.this.f27782d++;
                            } else {
                                int i = C10210a.this.f27782d;
                                C10210a.this.f27780b = 1800000;
                                C10210a.this.f27782d++;
                            }
                            return false;
                        }
                    }
                }
                return false;
            }
        };
        this.f27779a = r0;
    }
}

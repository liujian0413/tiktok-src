package com.bytedance.p263im.core.internal.p590db.p591a;

import android.content.ContentValues;
import android.text.TextUtils;
import com.bytedance.p263im.core.internal.p590db.p592b.C11339b;
import com.bytedance.p263im.core.internal.p590db.p592b.C11351d;
import com.bytedance.p263im.core.internal.p590db.p592b.C11354f;
import com.bytedance.p263im.core.internal.utils.C11404d;
import com.bytedance.p263im.core.internal.utils.C11432j;
import com.bytedance.p263im.core.p586b.C11209d;

/* renamed from: com.bytedance.im.core.internal.db.a.d */
public class C11324d {

    /* renamed from: a */
    private static volatile C11324d f30669a;

    /* renamed from: a */
    public static C11324d m33206a() {
        if (f30669a == null) {
            synchronized (C11324d.class) {
                if (f30669a == null) {
                    f30669a = new C11324d();
                }
            }
        }
        return f30669a;
    }

    /* renamed from: c */
    public static boolean m33211c(String str) {
        C11432j.m33707b();
        C11351d a = C11323c.m33202a();
        boolean z = false;
        if (a == null) {
            return false;
        }
        try {
            a.mo27365a(str);
            z = true;
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("execSQL: ");
            sb.append(str);
            C11404d.m33585a(sb.toString(), (Throwable) e);
            C11209d.m32824a(e);
        }
        return z;
    }

    /* renamed from: d */
    public static C11354f m33212d(String str) {
        C11432j.m33707b();
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        C11351d a = C11323c.m33202a();
        if (a == null) {
            return null;
        }
        try {
            return a.mo27367b(str);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("compileStatement: ");
            sb.append(str);
            C11404d.m33585a(sb.toString(), (Throwable) e);
            C11209d.m32824a(e);
            return null;
        }
    }

    /* renamed from: b */
    public static void m33210b(String str) {
        C11432j.m33707b();
        C11351d a = C11323c.m33202a();
        if (a == null) {
            C11404d.m33588b(str, "endTransaction failed by db = null");
        } else if (a.mo27369c()) {
            try {
                a.mo27371e();
                a.mo27372f();
                C11404d.m33588b(str, "endTransaction successfully");
            } catch (Exception e) {
                C11404d.m33585a("endTransaction", (Throwable) e);
                C11209d.m32824a(e);
            }
        } else {
            StringBuilder sb = new StringBuilder("no transaction, current tid=");
            sb.append(Thread.currentThread());
            C11404d.m33585a(sb.toString(), (Throwable) new RuntimeException());
        }
    }

    /* renamed from: a */
    public static void m33208a(String str) {
        C11432j.m33707b();
        C11351d a = C11323c.m33202a();
        if (a == null) {
            C11404d.m33588b(str, "startTransaction failed by db = null");
        } else if (a.mo27369c()) {
            StringBuilder sb = new StringBuilder("is in transaction, current tid=");
            sb.append(Thread.currentThread());
            C11404d.m33585a(sb.toString(), (Throwable) new RuntimeException());
        } else {
            try {
                a.mo27370d();
                C11404d.m33588b(str, "startTransaction successfully");
            } catch (Exception e) {
                C11404d.m33585a("startTransaction", (Throwable) e);
                C11209d.m32824a(e);
            }
        }
    }

    /* renamed from: a */
    public static C11339b m33207a(String str, String[] strArr) {
        C11339b bVar;
        C11432j.m33707b();
        C11351d a = C11323c.m33202a();
        if (a == null) {
            return null;
        }
        try {
            bVar = a.mo27364a(str, strArr);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("rawQuery ");
            sb.append(str);
            C11404d.m33585a(sb.toString(), (Throwable) e);
            C11209d.m32824a(e);
            bVar = null;
        }
        return bVar;
    }

    /* renamed from: a */
    public static long m33205a(String str, String str2, ContentValues contentValues) {
        C11432j.m33707b();
        C11351d a = C11323c.m33202a();
        if (a == null || TextUtils.isEmpty(str)) {
            return -1;
        }
        try {
            return a.mo27363a(str, (String) null, contentValues);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("insert ");
            sb.append(str);
            C11404d.m33585a(sb.toString(), (Throwable) e);
            C11209d.m32824a(e);
            return -1;
        }
    }

    /* renamed from: a */
    public static boolean m33209a(String str, String str2, String[] strArr) {
        C11432j.m33707b();
        C11351d a = C11323c.m33202a();
        if (a == null || TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            if (a.mo27362a(str, str2, strArr) > 0) {
                return true;
            }
            return false;
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("delete sql ");
            sb.append(str);
            sb.append(" ");
            sb.append(str2);
            C11404d.m33585a(sb.toString(), (Throwable) e);
            C11209d.m32824a(e);
            return false;
        }
    }

    /* renamed from: a */
    public static int m33204a(String str, ContentValues contentValues, String str2, String[] strArr) {
        C11432j.m33707b();
        C11351d a = C11323c.m33202a();
        if (a == null || TextUtils.isEmpty(str)) {
            return -1;
        }
        try {
            return a.mo27361a(str, contentValues, str2, strArr);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("update ");
            sb.append(str);
            sb.append(" ");
            sb.append(str2);
            C11404d.m33585a(sb.toString(), (Throwable) e);
            C11209d.m32824a(e);
            return -1;
        }
    }
}

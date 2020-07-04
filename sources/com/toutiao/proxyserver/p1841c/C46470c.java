package com.toutiao.proxyserver.p1841c;

import com.google.p268a.p269a.p270a.p271a.p272a.C6497a;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.UnknownHostException;

/* renamed from: com.toutiao.proxyserver.c.c */
public final class C46470c {

    /* renamed from: a */
    public static boolean f119739a;

    /* renamed from: b */
    private static C46468a f119740b;

    /* renamed from: a */
    public static void m146082a(C46468a aVar) {
        f119740b = aVar;
    }

    /* renamed from: a */
    public static String m146081a(Throwable th) {
        if (th == null) {
            return "";
        }
        for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
            if (th2 instanceof UnknownHostException) {
                return "UnknownHostException";
            }
        }
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        C6497a.m20180a(th, printWriter);
        printWriter.flush();
        return stringWriter.toString();
    }

    /* renamed from: a */
    public static void m146083a(String str, String str2) {
        m146084a(str, str2, null);
    }

    /* renamed from: b */
    public static void m146085b(String str, String str2) {
        m146086b(str, str2, null);
    }

    /* renamed from: c */
    public static void m146087c(String str, String str2) {
        m146088c(str, str2, null);
    }

    /* renamed from: d */
    public static void m146089d(String str, String str2) {
        m146090d(str, str2, null);
    }

    /* renamed from: a */
    public static void m146084a(String str, String str2, String str3) {
        if (f119740b != null && f119739a) {
            f119740b.mo105075a(str, str2, str3);
        }
    }

    /* renamed from: b */
    public static void m146086b(String str, String str2, String str3) {
        if (f119740b != null && f119739a) {
            f119740b.mo105076b(str, str2, str3);
        }
    }

    /* renamed from: c */
    public static void m146088c(String str, String str2, String str3) {
        if (f119740b != null && f119739a) {
            f119740b.mo105077c(str, str2, str3);
        }
    }

    /* renamed from: d */
    public static void m146090d(String str, String str2, String str3) {
        if (f119740b != null && f119739a) {
            f119740b.mo105078d(str, str2, str3);
        }
    }
}

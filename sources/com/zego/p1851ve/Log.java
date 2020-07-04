package com.zego.p1851ve;

import com.google.p268a.p269a.p270a.p271a.p272a.C6497a;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.UnknownHostException;

/* renamed from: com.zego.ve.Log */
public class Log {
    public static native int native_println(String str);

    public static int println(String str) {
        try {
            native_println(str);
        } catch (Throwable unused) {
        }
        return 0;
    }

    public static String getStackTraceString(Throwable th) {
        if (th == null) {
            return "";
        }
        for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
            if (th2 instanceof UnknownHostException) {
                return "";
            }
        }
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        C6497a.m20180a(th, printWriter);
        printWriter.flush();
        return stringWriter.toString();
    }

    /* renamed from: d */
    public static int m147737d(String str, String str2) {
        StringBuilder sb = new StringBuilder("[DEBUG] ");
        sb.append(str);
        sb.append(" -- ");
        sb.append(str2);
        return println(sb.toString());
    }

    /* renamed from: e */
    public static int m147739e(String str, String str2) {
        StringBuilder sb = new StringBuilder("[ERROR] ");
        sb.append(str);
        sb.append(" -- ");
        sb.append(str2);
        return println(sb.toString());
    }

    /* renamed from: i */
    public static int m147741i(String str, String str2) {
        StringBuilder sb = new StringBuilder("[INFO] ");
        sb.append(str);
        sb.append(" -- ");
        sb.append(str2);
        return println(sb.toString());
    }

    /* renamed from: v */
    public static int m147743v(String str, String str2) {
        StringBuilder sb = new StringBuilder("[VERBOSE] ");
        sb.append(str);
        sb.append(" -- ");
        sb.append(str2);
        return println(sb.toString());
    }

    /* renamed from: w */
    public static int m147745w(String str, String str2) {
        StringBuilder sb = new StringBuilder("[WARNING] ");
        sb.append(str);
        sb.append(" -- ");
        sb.append(str2);
        return println(sb.toString());
    }

    /* renamed from: d */
    public static int m147738d(String str, String str2, Throwable th) {
        StringBuilder sb = new StringBuilder("[DEBUG] ");
        sb.append(str);
        sb.append(" -- ");
        sb.append(str2);
        sb.append(10);
        sb.append(getStackTraceString(th));
        return println(sb.toString());
    }

    /* renamed from: e */
    public static int m147740e(String str, String str2, Throwable th) {
        StringBuilder sb = new StringBuilder("[ERROR] ");
        sb.append(str);
        sb.append(" -- ");
        sb.append(str2);
        sb.append(10);
        sb.append(getStackTraceString(th));
        return println(sb.toString());
    }

    /* renamed from: i */
    public static int m147742i(String str, String str2, Throwable th) {
        StringBuilder sb = new StringBuilder("[INFO] ");
        sb.append(str);
        sb.append(" -- ");
        sb.append(str2);
        sb.append(10);
        sb.append(getStackTraceString(th));
        return println(sb.toString());
    }

    /* renamed from: v */
    public static int m147744v(String str, String str2, Throwable th) {
        StringBuilder sb = new StringBuilder("[VERBOSE] ");
        sb.append(str);
        sb.append(" -- ");
        sb.append(str2);
        sb.append(10);
        sb.append(getStackTraceString(th));
        return println(sb.toString());
    }

    /* renamed from: w */
    public static int m147746w(String str, String str2, Throwable th) {
        StringBuilder sb = new StringBuilder("[WARNING] ");
        sb.append(str);
        sb.append(" -- ");
        sb.append(str2);
        sb.append(10);
        sb.append(getStackTraceString(th));
        return println(sb.toString());
    }
}

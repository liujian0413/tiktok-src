package com.p280ss.android.agilelogger.utils;

import com.google.p268a.p269a.p270a.p271a.p272a.C6497a;
import com.p280ss.android.agilelogger.ALog;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.UnknownHostException;

/* renamed from: com.ss.android.agilelogger.utils.k */
public final class C19207k {

    /* renamed from: a */
    private static final String f51870a;

    static {
        String name = ALog.class.getName();
        f51870a = name.substring(0, name.lastIndexOf(46) + 1);
    }

    /* renamed from: a */
    public static String m62944a(Throwable th) {
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
}

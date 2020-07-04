package com.p280ss.video.rtc.base.utils;

import com.google.p268a.p269a.p270a.p271a.p272a.C6497a;
import java.io.PrintWriter;
import java.io.StringWriter;

/* renamed from: com.ss.video.rtc.base.utils.ExceptionUtils */
public class ExceptionUtils {
    public static String cause(Throwable th) {
        String str = null;
        while (th != null && th.getCause() != null) {
            str = th.getCause().toString();
            th = th.getCause();
        }
        return str;
    }

    public static String stackTrace(Throwable th) {
        C6497a.m20180a(th, new PrintWriter(new StringWriter()));
        return th.toString();
    }
}

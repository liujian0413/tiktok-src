package org.webrtc;

import com.google.p268a.p269a.p270a.p271a.p272a.C6497a;
import java.io.PrintWriter;
import java.io.StringWriter;

public class ExceptionUtils {
    public static String stackTrace(Throwable th) {
        C6497a.m20180a(th, new PrintWriter(new StringWriter()));
        return th.toString();
    }
}

package com.facebook.common.internal;

import com.google.p268a.p269a.p270a.p271a.p272a.C6497a;
import java.io.PrintWriter;
import java.io.StringWriter;

/* renamed from: com.facebook.common.internal.l */
public final class C13315l {
    /* renamed from: a */
    public static void m38960a(Throwable th) {
        m38961a(th, Error.class);
        m38961a(th, RuntimeException.class);
    }

    /* renamed from: b */
    public static RuntimeException m38962b(Throwable th) {
        m38960a((Throwable) C13307g.m38940a(th));
        throw new RuntimeException(th);
    }

    /* renamed from: c */
    public static String m38963c(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        C6497a.m20180a(th, new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    /* renamed from: a */
    private static <X extends Throwable> void m38961a(Throwable th, Class<X> cls) throws Throwable {
        if (th != null && cls.isInstance(th)) {
            throw ((Throwable) cls.cast(th));
        }
    }
}

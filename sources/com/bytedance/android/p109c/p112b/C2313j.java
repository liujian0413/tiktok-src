package com.bytedance.android.p109c.p112b;

import android.os.Build.VERSION;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import java.security.AccessController;
import java.security.PrivilegedAction;

/* renamed from: com.bytedance.android.c.b.j */
final class C2313j {

    /* renamed from: a */
    public static Class f7626a;

    /* renamed from: b */
    public static Method f7627b;

    /* renamed from: c */
    public static Class f7628c;

    /* renamed from: d */
    public static Method f7629d;

    /* renamed from: e */
    public static Method f7630e;

    /* renamed from: f */
    public static Class f7631f;

    /* renamed from: g */
    public static Method f7632g;

    /* renamed from: b */
    private static void m9928b(final MappedByteBuffer mappedByteBuffer) {
        AccessController.doPrivileged(new PrivilegedAction<Object>() {
            public final Object run() {
                try {
                    if (C2313j.f7626a == null) {
                        C2313j.f7626a = Class.forName("java.nio.MappedByteBufferAdapter");
                    }
                    if (C2313j.f7627b == null) {
                        C2313j.f7627b = C2313j.f7626a.getMethod("free", new Class[0]);
                    }
                    C2313j.f7627b.setAccessible(true);
                    C2313j.f7627b.invoke(mappedByteBuffer, new Object[0]);
                } catch (Exception e) {
                    StringBuilder sb = new StringBuilder("Unable to unmap MappedByteBuffer! API: ");
                    sb.append(VERSION.SDK_INT);
                    C2286b.m9840a(sb.toString(), e);
                }
                return null;
            }
        });
    }

    /* renamed from: c */
    private static void m9929c(final MappedByteBuffer mappedByteBuffer) {
        AccessController.doPrivileged(new PrivilegedAction<Object>() {
            public final Object run() {
                try {
                    if (C2313j.f7628c == null) {
                        C2313j.f7628c = Class.forName("java.nio.DirectByteBuffer");
                    }
                    if (C2313j.f7629d == null) {
                        C2313j.f7629d = C2313j.f7628c.getMethod("free", new Class[0]);
                    }
                    C2313j.f7629d.setAccessible(true);
                    C2313j.f7629d.invoke(mappedByteBuffer, new Object[0]);
                } catch (Exception e) {
                    StringBuilder sb = new StringBuilder("Unable to unmap MappedByteBuffer! API: ");
                    sb.append(VERSION.SDK_INT);
                    C2286b.m9840a(sb.toString(), e);
                }
                return null;
            }
        });
    }

    /* renamed from: d */
    private static void m9930d(final MappedByteBuffer mappedByteBuffer) {
        AccessController.doPrivileged(new PrivilegedAction<Object>() {
            public final Object run() {
                try {
                    if (C2313j.f7630e == null) {
                        C2313j.f7630e = mappedByteBuffer.getClass().getMethod("cleaner", new Class[0]);
                    }
                    if (C2313j.f7631f == null) {
                        C2313j.f7631f = Class.forName("sun.misc.Cleaner");
                    }
                    if (C2313j.f7632g == null) {
                        C2313j.f7632g = C2313j.f7631f.getMethod("clean", new Class[0]);
                    }
                    C2313j.f7630e.setAccessible(true);
                    C2313j.f7632g.setAccessible(true);
                    C2313j.f7632g.invoke(C2313j.f7630e.invoke(mappedByteBuffer, new Object[0]), new Object[0]);
                } catch (Exception e) {
                    StringBuilder sb = new StringBuilder("Unable to unmap MappedByteBuffer! API: ");
                    sb.append(VERSION.SDK_INT);
                    C2286b.m9840a(sb.toString(), e);
                }
                return null;
            }
        });
    }

    /* renamed from: a */
    static void m9927a(MappedByteBuffer mappedByteBuffer) {
        if (mappedByteBuffer != null) {
            mappedByteBuffer.force();
            if (VERSION.SDK_INT <= 17) {
                m9928b(mappedByteBuffer);
            } else if (VERSION.SDK_INT < 23) {
                m9929c(mappedByteBuffer);
            } else {
                m9930d(mappedByteBuffer);
            }
        }
    }
}

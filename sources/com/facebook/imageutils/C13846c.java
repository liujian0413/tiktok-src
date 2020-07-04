package com.facebook.imageutils;

import com.facebook.common.p686c.C13286a;
import com.facebook.imageformat.C13509c;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: com.facebook.imageutils.c */
public final class C13846c {

    /* renamed from: a */
    private static Class f36708a;

    /* renamed from: b */
    private static Class f36709b;

    /* renamed from: c */
    private static C13509c f36710c;

    /* renamed from: d */
    private static Method f36711d;

    static {
        try {
            f36708a = Class.forName("com.ixigua.image.heif.Heif");
            f36709b = Class.forName("com.bytedance.fresco.heif.HeifDecoder");
        } catch (ClassNotFoundException e) {
            C13286a.m38861c("HeifFormatUtil", "Heif init ", (Throwable) e);
        }
    }

    /* renamed from: a */
    public static C13509c m40889a() {
        if (f36710c != null) {
            return f36710c;
        }
        if (f36709b == null) {
            return null;
        }
        try {
            f36710c = (C13509c) f36709b.getDeclaredField("HEIF_FORMAT").get(null);
        } catch (NoSuchFieldException e) {
            C13286a.m38861c("HeifFormatUtil", "HeifFormat init ", (Throwable) e);
        } catch (IllegalAccessException e2) {
            C13286a.m38861c("HeifFormatUtil", "HeifFormat init ", (Throwable) e2);
        } catch (Exception unused) {
        }
        return f36710c;
    }

    /* renamed from: a */
    public static int[] m40890a(byte[] bArr, int i) {
        if (f36708a == null) {
            return null;
        }
        try {
            if (f36711d == null) {
                f36711d = f36708a.getDeclaredMethod("parseMeta", new Class[]{byte[].class, Integer.TYPE});
            }
            if (f36711d != null) {
                f36711d.setAccessible(true);
                return (int[]) f36711d.invoke(null, new Object[]{bArr, Integer.valueOf(i)});
            }
        } catch (Exception | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
        return null;
    }
}

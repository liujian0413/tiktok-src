package com.twitter.sdk.android.core.internal;

import android.content.Context;
import android.content.res.Resources;
import com.twitter.sdk.android.core.C46940l;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.twitter.sdk.android.core.internal.g */
public final class C46869g {

    /* renamed from: a */
    private static Boolean f120178a;

    /* renamed from: a */
    private static String m146599a(Context context) {
        int i = context.getApplicationContext().getApplicationInfo().icon;
        if (i > 0) {
            return context.getResources().getResourcePackageName(i);
        }
        return context.getPackageName();
    }

    /* renamed from: b */
    private static boolean m146610b(Context context) {
        if (f120178a == null) {
            f120178a = Boolean.valueOf(m146608a(context, "com.twitter.sdk.android.TRACE_ENABLED", false));
        }
        return f120178a.booleanValue();
    }

    /* renamed from: a */
    public static void m146604a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m146602a(Context context, String str) {
        m146610b(context);
    }

    /* renamed from: a */
    public static void m146605a(Closeable closeable, String str) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m146607a(String str, String str2) {
        if (C46940l.m146820c()) {
            throw new IllegalStateException(str2);
        }
    }

    /* renamed from: a */
    public static void m146603a(Context context, String str, Throwable th) {
        m146610b(context);
    }

    /* renamed from: b */
    private static int m146609b(Context context, String str, String str2) {
        return context.getResources().getIdentifier(str, str2, m146599a(context));
    }

    /* renamed from: a */
    public static String m146600a(Context context, String str, String str2) {
        if (context != null) {
            Resources resources = context.getResources();
            if (resources != null) {
                int b = m146609b(context, str, "string");
                if (b > 0) {
                    return resources.getString(b);
                }
            }
        }
        return str2;
    }

    /* renamed from: a */
    public static void m146606a(InputStream inputStream, OutputStream outputStream, byte[] bArr) throws IOException {
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                outputStream.write(bArr, 0, read);
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public static boolean m146608a(Context context, String str, boolean z) {
        if (context != null) {
            Resources resources = context.getResources();
            if (resources != null) {
                int b = m146609b(context, str, "bool");
                if (b > 0) {
                    return resources.getBoolean(b);
                }
                int b2 = m146609b(context, str, "string");
                if (b2 > 0) {
                    return Boolean.parseBoolean(context.getString(b2));
                }
            }
        }
        return z;
    }

    /* renamed from: a */
    public static void m146601a(Context context, int i, String str, String str2) {
        m146610b(context);
    }
}

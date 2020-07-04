package com.bytedance.android.p109c.p112b;

import android.os.Process;
import com.bytedance.android.p109c.p112b.C2307i.C2311b.C2312a;

/* renamed from: com.bytedance.android.c.b.b */
final class C2286b {

    /* renamed from: a */
    public static final String f7575a;

    /* renamed from: b */
    static boolean f7576b = false;

    /* renamed from: c */
    static C2312a f7577c = new C2312a() {
        /* renamed from: a */
        public final void mo8087a(int i, String str) {
        }

        /* renamed from: a */
        public final void mo8088a(int i, String str, Throwable th) {
        }
    };

    static {
        StringBuilder sb = new StringBuilder("TEST_KV@pid:");
        sb.append(Process.myPid());
        f7575a = sb.toString();
    }

    /* renamed from: a */
    static void m9839a(String str) {
        f7577c.mo8087a(2, m9844c(str));
    }

    /* renamed from: b */
    static void m9842b(String str) {
        f7577c.mo8087a(3, m9844c(str));
    }

    /* renamed from: a */
    static void m9841a(Throwable th) {
        String str;
        if (!f7576b) {
            if (th.getMessage() == null) {
                str = "No message.";
            } else {
                str = th.getMessage();
            }
            m9840a(str, th);
            return;
        }
        throw new C2294g(th);
    }

    /* renamed from: c */
    private static String m9844c(String str) {
        StringBuilder sb = new StringBuilder("@Thread: {");
        sb.append(Process.myPid());
        sb.append(",");
        sb.append(Thread.currentThread().getName());
        sb.append("}, msg: ");
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: a */
    static void m9840a(String str, Throwable th) {
        f7577c.mo8088a(3, m9844c(str), th);
    }

    /* renamed from: b */
    static void m9843b(String str, Throwable th) {
        if (!f7576b) {
            m9840a(str, th);
            return;
        }
        throw new C2294g(str, th);
    }
}

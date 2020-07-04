package com.bytedance.common.utility;

import android.os.Looper;
import android.util.Printer;
import com.p280ss.android.ugc.aweme.feed.monitor.C28539a;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.common.utility.i */
public final class C9731i {

    /* renamed from: a */
    public static int f26467a = 5;

    /* renamed from: b */
    public static C9732a f26468b;

    /* renamed from: c */
    private static C9733b f26469c;

    /* renamed from: d */
    private static boolean f26470d;

    /* renamed from: e */
    private static Printer f26471e;

    /* renamed from: com.bytedance.common.utility.i$a */
    public interface C9732a {
    }

    /* renamed from: com.bytedance.common.utility.i$b */
    static class C9733b implements Printer {

        /* renamed from: a */
        List<Printer> f26472a = new ArrayList();

        /* renamed from: b */
        List<Printer> f26473b = new ArrayList();

        /* renamed from: c */
        List<Printer> f26474c = new ArrayList();

        /* renamed from: d */
        boolean f26475d = false;

        /* renamed from: e */
        boolean f26476e = false;

        C9733b() {
        }

        public final void println(String str) {
            long j;
            if (C9731i.f26468b != null) {
                j = System.currentTimeMillis();
            } else {
                j = 0;
            }
            if (str.startsWith(C28539a.f75169d) && this.f26476e) {
                for (Printer printer : this.f26474c) {
                    if (!this.f26472a.contains(printer)) {
                        this.f26472a.add(printer);
                    }
                }
                this.f26474c.clear();
                this.f26476e = false;
            }
            this.f26472a.size();
            for (Printer printer2 : this.f26472a) {
                if (printer2 != null) {
                    printer2.println(str);
                }
            }
            if (str.startsWith(C28539a.f75170e) && this.f26475d) {
                for (Printer printer3 : this.f26473b) {
                    this.f26472a.remove(printer3);
                    this.f26474c.remove(printer3);
                }
                this.f26473b.clear();
                this.f26475d = false;
            }
            if (C9731i.f26468b != null && j > 0) {
                System.currentTimeMillis();
            }
        }
    }

    /* renamed from: b */
    private static Printer m28668b() {
        try {
            Field declaredField = Class.forName("android.os.Looper").getDeclaredField("mLogging");
            declaredField.setAccessible(true);
            return (Printer) declaredField.get(Looper.getMainLooper());
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static void m28666a() {
        if (!f26470d) {
            f26470d = true;
            f26469c = new C9733b();
            Printer b = m28668b();
            f26471e = b;
            if (b != null) {
                f26469c.f26472a.add(f26471e);
            }
            Looper.getMainLooper().setMessageLogging(f26469c);
        }
    }

    /* renamed from: a */
    public static void m28667a(Printer printer) {
        if (printer != null && !f26469c.f26474c.contains(printer)) {
            f26469c.f26474c.add(printer);
            f26469c.f26476e = true;
        }
    }

    /* renamed from: b */
    public static void m28669b(Printer printer) {
        if (printer != null && !f26469c.f26473b.contains(printer)) {
            f26469c.f26473b.add(printer);
            f26469c.f26475d = true;
        }
    }
}

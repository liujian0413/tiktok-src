package org.greenrobot.eventbus;

import com.google.p268a.p269a.p270a.p271a.p272a.C6497a;
import java.io.PrintStream;
import java.util.logging.Level;

/* renamed from: org.greenrobot.eventbus.f */
public interface C48332f {

    /* renamed from: org.greenrobot.eventbus.f$a */
    public static class C48333a implements C48332f {

        /* renamed from: a */
        static final boolean f123408a;

        /* renamed from: b */
        private final String f123409b;

        /* renamed from: a */
        public static boolean m149911a() {
            return f123408a;
        }

        /* renamed from: a */
        public final void mo121773a(Level level, String str) {
        }

        /* renamed from: a */
        public final void mo121774a(Level level, String str, Throwable th) {
        }

        static {
            boolean z = false;
            try {
                if (Class.forName("android.util.Log") != null) {
                    z = true;
                }
            } catch (ClassNotFoundException unused) {
            }
            f123408a = z;
        }

        public C48333a(String str) {
            this.f123409b = str;
        }
    }

    /* renamed from: org.greenrobot.eventbus.f$b */
    public static class C48334b implements C48332f {
        /* renamed from: a */
        public final void mo121773a(Level level, String str) {
            PrintStream printStream = System.out;
            StringBuilder sb = new StringBuilder("[");
            sb.append(level);
            sb.append("] ");
            sb.append(str);
            printStream.println(sb.toString());
        }

        /* renamed from: a */
        public final void mo121774a(Level level, String str, Throwable th) {
            PrintStream printStream = System.out;
            StringBuilder sb = new StringBuilder("[");
            sb.append(level);
            sb.append("] ");
            sb.append(str);
            printStream.println(sb.toString());
            C6497a.m20179a(th, System.out);
        }
    }

    /* renamed from: a */
    void mo121773a(Level level, String str);

    /* renamed from: a */
    void mo121774a(Level level, String str, Throwable th);
}

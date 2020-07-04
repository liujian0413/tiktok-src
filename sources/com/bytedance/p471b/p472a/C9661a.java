package com.bytedance.p471b.p472a;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.b.a.a */
public class C9661a {

    /* renamed from: a */
    private static volatile boolean f26377a;

    /* renamed from: c */
    private static C9664b f26378c;

    /* renamed from: b */
    private C9666b f26379b;

    /* renamed from: com.bytedance.b.a.a$a */
    class C9663a implements C9666b {
        /* renamed from: a */
        public final String mo24005a() {
            return "default";
        }

        /* renamed from: b */
        public final List<String> mo24006b() {
            return new ArrayList();
        }

        private C9663a() {
        }
    }

    /* renamed from: com.bytedance.b.a.a$b */
    public interface C9664b {
    }

    /* renamed from: com.bytedance.b.a.a$c */
    static class C9665c {

        /* renamed from: a */
        public static final C9661a f26381a = new C9661a();
    }

    private C9661a() {
    }

    /* renamed from: a */
    public static C9661a m28558a() {
        return C9665c.f26381a;
    }

    /* renamed from: d */
    private static void m28560d() {
        if (!f26377a) {
            synchronized (C9661a.class) {
                if (!f26377a && f26378c != null) {
                    f26377a = true;
                }
            }
        }
    }

    /* renamed from: b */
    public final C9666b mo24004b() {
        if (this.f26379b != null) {
            return this.f26379b;
        }
        m28559c();
        if (this.f26379b != null) {
            return this.f26379b;
        }
        return new C9663a();
    }

    /* renamed from: c */
    private void m28559c() {
        try {
            Object newInstance = Class.forName("com.bytedance.aweme.f.two.FTwoPlugin").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (newInstance instanceof C9666b) {
                this.f26379b = (C9666b) newInstance;
                m28560d();
                return;
            }
            this.f26379b = null;
        } catch (Throwable unused) {
            this.f26379b = null;
        }
    }
}

package com.bytedance.android.livesdk.user;

import com.bytedance.android.livesdk.user.C8971a.C8972a;

/* renamed from: com.bytedance.android.livesdk.user.b */
public class C8976b extends C8971a {

    /* renamed from: b */
    String f24572b;

    /* renamed from: c */
    String f24573c;

    /* renamed from: d */
    String f24574d;

    /* renamed from: e */
    long f24575e;

    /* renamed from: f */
    String f24576f;

    /* renamed from: com.bytedance.android.livesdk.user.b$a */
    public static abstract class C8977a<T extends C8977a<T>> extends C8972a<C8977a<T>> {

        /* renamed from: b */
        String f24577b = "";

        /* renamed from: c */
        String f24578c = "";

        /* renamed from: d */
        String f24579d = "";

        /* renamed from: e */
        long f24580e;

        /* renamed from: f */
        String f24581f = "";

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public abstract T mo22152a();

        /* renamed from: b */
        public final T mo22156b(long j) {
            this.f24580e = j;
            return mo22152a();
        }

        /* renamed from: c */
        public final T mo22158c(String str) {
            this.f24579d = str;
            return mo22152a();
        }

        /* renamed from: d */
        public final T mo22159d(String str) {
            this.f24581f = str;
            return mo22152a();
        }

        /* renamed from: a */
        public final T mo22154a(String str) {
            this.f24577b = str;
            return mo22152a();
        }

        /* renamed from: b */
        public final T mo22157b(String str) {
            this.f24578c = str;
            return mo22152a();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.user.b$b */
    public static final class C8978b<T extends C8977a<T>> extends C8977a<T> {
        C8978b() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final T mo22152a() {
            return this;
        }

        /* renamed from: c */
        public final C8976b mo22160c() {
            return new C8976b(this);
        }
    }

    C8976b(C8977a aVar) {
        super(aVar);
        this.f24572b = aVar.f24577b;
        this.f24573c = aVar.f24578c;
        this.f24574d = aVar.f24579d;
        this.f24575e = aVar.f24580e;
        this.f24576f = aVar.f24581f;
    }
}

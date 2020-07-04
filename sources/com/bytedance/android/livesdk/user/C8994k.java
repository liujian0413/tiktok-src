package com.bytedance.android.livesdk.user;

import com.bytedance.android.livesdk.user.C8991j.C8992a;

/* renamed from: com.bytedance.android.livesdk.user.k */
public final class C8994k extends C8991j {

    /* renamed from: f */
    String f24610f;

    /* renamed from: g */
    String f24611g;

    /* renamed from: com.bytedance.android.livesdk.user.k$a */
    public static abstract class C8996a<T extends C8996a<T>> extends C8992a<T> {

        /* renamed from: f */
        String f24612f;

        /* renamed from: g */
        String f24613g;

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public abstract T mo22198b();

        /* renamed from: c */
        public final T mo22203c(String str) {
            this.f24613g = str;
            return mo22198b();
        }

        /* renamed from: b */
        public final T mo22201b(String str) {
            this.f24612f = str;
            return mo22198b();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.user.k$b */
    public static final class C8997b<T extends C8997b<T>> extends C8996a<T> {
        C8997b() {
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public T mo22202c() {
            return this;
        }

        /* renamed from: d */
        public final C8994k mo22204d() {
            return new C8994k(this);
        }
    }

    private C8994k(C8996a aVar) {
        super(aVar);
        this.f24610f = aVar.f24612f;
        this.f24611g = aVar.f24613g;
    }
}

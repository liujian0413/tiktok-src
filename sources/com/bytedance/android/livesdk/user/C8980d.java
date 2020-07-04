package com.bytedance.android.livesdk.user;

import android.app.Activity;
import com.bytedance.android.livesdk.user.C8976b.C8977a;

/* renamed from: com.bytedance.android.livesdk.user.d */
public final class C8980d extends C8976b {

    /* renamed from: g */
    Activity f24584g;

    /* renamed from: h */
    String f24585h;

    /* renamed from: i */
    String f24586i;

    /* renamed from: com.bytedance.android.livesdk.user.d$a */
    public static abstract class C8982a<T extends C8977a<T>> extends C8977a<T> {

        /* renamed from: g */
        Activity f24587g;

        /* renamed from: h */
        String f24588h;

        /* renamed from: i */
        String f24589i;

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public abstract T mo22152a();

        /* renamed from: e */
        public final T mo22162e(String str) {
            this.f24588h = str;
            return mo22152a();
        }

        /* renamed from: f */
        public final T mo22163f(String str) {
            this.f24589i = str;
            return mo22152a();
        }

        /* renamed from: a */
        public final T mo22161a(Activity activity) {
            this.f24587g = activity;
            return mo22152a();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.user.d$b */
    public static final class C8983b<T extends C8982a<T>> extends C8982a<T> {
        C8983b() {
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public T mo22155b() {
            return this;
        }

        /* renamed from: c */
        public final C8980d mo22164c() {
            return new C8980d(this);
        }
    }

    private C8980d(C8982a aVar) {
        super(aVar);
        this.f24584g = aVar.f24587g;
        this.f24585h = aVar.f24588h;
        this.f24586i = aVar.f24589i;
    }
}

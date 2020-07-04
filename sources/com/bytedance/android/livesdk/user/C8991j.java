package com.bytedance.android.livesdk.user;

import android.app.Activity;
import com.bytedance.android.livesdk.user.C8971a.C8972a;

/* renamed from: com.bytedance.android.livesdk.user.j */
public class C8991j extends C8971a {

    /* renamed from: b */
    int f24602b;

    /* renamed from: c */
    String f24603c;

    /* renamed from: d */
    Activity f24604d;

    /* renamed from: e */
    long f24605e;

    /* renamed from: com.bytedance.android.livesdk.user.j$a */
    public static abstract class C8992a<T extends C8992a<T>> extends C8972a<T> {

        /* renamed from: b */
        int f24606b;

        /* renamed from: c */
        String f24607c = "";

        /* renamed from: d */
        Activity f24608d;

        /* renamed from: e */
        long f24609e;

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public abstract T mo22152a();

        /* renamed from: b */
        public final T mo22199b(long j) {
            this.f24609e = j;
            return mo22152a();
        }

        /* renamed from: a */
        public final T mo22195a(int i) {
            this.f24606b = i;
            return mo22152a();
        }

        /* renamed from: a */
        public final T mo22196a(Activity activity) {
            this.f24608d = activity;
            return mo22152a();
        }

        /* renamed from: a */
        public final T mo22197a(String str) {
            this.f24607c = str;
            return mo22152a();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.user.j$b */
    public static final class C8993b<T extends C8993b<T>> extends C8992a<T> {
        C8993b() {
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public T mo22198b() {
            return this;
        }

        /* renamed from: c */
        public final C8991j mo22200c() {
            return new C8991j(this);
        }
    }

    C8991j(C8992a aVar) {
        super(aVar);
        this.f24603c = aVar.f24607c;
        this.f24602b = aVar.f24606b;
        this.f24604d = aVar.f24608d;
        this.f24605e = aVar.f24609e;
    }
}

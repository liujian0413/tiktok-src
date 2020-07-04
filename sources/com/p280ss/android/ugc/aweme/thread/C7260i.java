package com.p280ss.android.ugc.aweme.thread;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ss.android.ugc.aweme.thread.i */
public final class C7260i {

    /* renamed from: a */
    public boolean f20307a;

    /* renamed from: b */
    public List<ThreadPoolType> f20308b;

    /* renamed from: c */
    public List<String> f20309c;

    /* renamed from: d */
    public long f20310d;

    /* renamed from: e */
    public long f20311e;

    /* renamed from: f */
    public long f20312f;

    /* renamed from: com.ss.android.ugc.aweme.thread.i$a */
    public static final class C7262a {

        /* renamed from: a */
        public boolean f20313a;

        /* renamed from: b */
        public List<ThreadPoolType> f20314b;

        /* renamed from: c */
        public List<String> f20315c;

        /* renamed from: d */
        public long f20316d;

        /* renamed from: e */
        public long f20317e;

        /* renamed from: f */
        public long f20318f;

        /* renamed from: a */
        public final C7260i mo18989a() {
            return new C7260i(this);
        }

        private C7262a() {
            this.f20314b = Collections.emptyList();
            this.f20315c = Collections.emptyList();
            this.f20316d = TimeUnit.MINUTES.toMillis(5);
            this.f20317e = TimeUnit.MINUTES.toMillis(5);
            this.f20318f = TimeUnit.MINUTES.toMillis(15);
        }

        /* renamed from: a */
        public final C7262a mo18986a(long j) {
            this.f20316d = j;
            return this;
        }

        /* renamed from: b */
        public final C7262a mo18990b(long j) {
            this.f20317e = j;
            return this;
        }

        /* renamed from: c */
        public final C7262a mo18992c(long j) {
            this.f20318f = j;
            return this;
        }

        /* renamed from: a */
        public final C7262a mo18987a(List<ThreadPoolType> list) {
            this.f20314b = list;
            return this;
        }

        /* renamed from: b */
        public final C7262a mo18991b(List<String> list) {
            this.f20315c = list;
            return this;
        }

        /* renamed from: a */
        public final C7262a mo18988a(boolean z) {
            this.f20313a = z;
            return this;
        }
    }

    /* renamed from: a */
    public static C7262a m22746a() {
        return new C7262a();
    }

    private C7260i(C7262a aVar) {
        this.f20307a = aVar.f20313a;
        this.f20308b = aVar.f20314b;
        this.f20309c = aVar.f20315c;
        this.f20310d = aVar.f20316d;
        this.f20311e = aVar.f20317e;
        this.f20312f = aVar.f20318f;
    }
}

package com.p280ss.android.ugc.aweme.thread;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor.AbortPolicy;

/* renamed from: com.ss.android.ugc.aweme.thread.m */
public final class C7265m {

    /* renamed from: a */
    public ThreadPoolType f20320a;

    /* renamed from: b */
    public String f20321b;

    /* renamed from: c */
    public int f20322c;

    /* renamed from: d */
    public BlockingQueue<Runnable> f20323d;

    /* renamed from: e */
    public RejectedExecutionHandler f20324e;

    /* renamed from: f */
    public long f20325f;

    /* renamed from: g */
    public ThreadFactory f20326g;

    /* renamed from: com.ss.android.ugc.aweme.thread.m$a */
    public static final class C7267a {

        /* renamed from: a */
        public ThreadPoolType f20327a;

        /* renamed from: b */
        public String f20328b;

        /* renamed from: c */
        public int f20329c;

        /* renamed from: d */
        public BlockingQueue<Runnable> f20330d;

        /* renamed from: e */
        public RejectedExecutionHandler f20331e;

        /* renamed from: f */
        public long f20332f;

        /* renamed from: g */
        public ThreadFactory f20333g;

        /* renamed from: a */
        public final C7265m mo18996a() {
            return new C7265m(this);
        }

        /* renamed from: a */
        public final C7267a mo18993a(int i) {
            this.f20329c = i;
            return this;
        }

        /* renamed from: a */
        public final C7267a mo18994a(String str) {
            this.f20328b = str;
            return this;
        }

        /* renamed from: a */
        public final C7267a mo18995a(ThreadFactory threadFactory) {
            this.f20333g = threadFactory;
            return this;
        }

        private C7267a(ThreadPoolType threadPoolType) {
            this.f20329c = 1;
            this.f20330d = new LinkedBlockingQueue();
            this.f20331e = new AbortPolicy();
            this.f20332f = -1;
            this.f20327a = threadPoolType;
        }
    }

    /* renamed from: a */
    public static C7267a m22758a(ThreadPoolType threadPoolType) {
        return new C7267a(threadPoolType);
    }

    private C7265m(C7267a aVar) {
        this.f20320a = aVar.f20327a;
        this.f20321b = aVar.f20328b;
        this.f20322c = aVar.f20329c;
        this.f20323d = aVar.f20330d;
        this.f20324e = aVar.f20331e;
        this.f20325f = aVar.f20332f;
        this.f20326g = aVar.f20333g;
    }
}

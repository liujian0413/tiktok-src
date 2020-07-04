package com.p280ss.android.ugc.aweme.p313im.sdk.arch.adpater;

import android.support.p029v7.util.C1143a.C1147c;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.arch.adpater.c */
public final class C30583c<T> {

    /* renamed from: a */
    public final C1147c<T> f80306a;

    /* renamed from: b */
    public final Executor f80307b;

    /* renamed from: c */
    public final Executor f80308c;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.arch.adpater.c$a */
    public static final class C30584a<T> {

        /* renamed from: a */
        public static final C30585a f80309a = new C30585a(null);

        /* renamed from: e */
        private static final Object f80310e = new Object();

        /* renamed from: f */
        private static Executor f80311f;

        /* renamed from: b */
        private Executor f80312b;

        /* renamed from: c */
        private Executor f80313c;

        /* renamed from: d */
        private final C1147c<T> f80314d;

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.arch.adpater.c$a$a */
        public static final class C30585a {
            private C30585a() {
            }

            public /* synthetic */ C30585a(C7571f fVar) {
                this();
            }
        }

        /* renamed from: a */
        public final C30583c<T> mo80358a() {
            if (this.f80313c == null) {
                synchronized (f80310e) {
                    if (f80311f == null) {
                        f80311f = C30586d.m99898a(2);
                    }
                }
                this.f80313c = f80311f;
            }
            C1147c<T> cVar = this.f80314d;
            Executor executor = this.f80313c;
            if (executor == null) {
                C7573i.m23580a();
            }
            return new C30583c<>(cVar, executor, this.f80312b, null);
        }

        /* renamed from: a */
        public final C30584a<T> mo80357a(Executor executor) {
            C7573i.m23587b(executor, "executor");
            this.f80312b = executor;
            return this;
        }

        /* renamed from: b */
        public final C30584a<T> mo80359b(Executor executor) {
            C7573i.m23587b(executor, "executor");
            this.f80313c = executor;
            return this;
        }

        public C30584a(C1147c<T> cVar) {
            C7573i.m23587b(cVar, "mDiffCallback");
            this.f80314d = cVar;
        }
    }

    private C30583c(C1147c<T> cVar, Executor executor, Executor executor2) {
        this.f80306a = cVar;
        this.f80307b = executor;
        this.f80308c = executor2;
    }

    public /* synthetic */ C30583c(C1147c cVar, Executor executor, Executor executor2, C7571f fVar) {
        this(cVar, executor, executor2);
    }
}

package com.bytedance.jedi.arch.ext.list.differ;

import android.support.p029v7.util.C1143a.C1147c;
import com.bytedance.jedi.arch.C11587g;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.bytedance.jedi.arch.ext.list.differ.c */
public final class C11564c<T> {

    /* renamed from: a */
    public final Executor f31234a;

    /* renamed from: b */
    public final C1147c<T> f31235b;

    /* renamed from: c */
    public final Executor f31236c;

    /* renamed from: com.bytedance.jedi.arch.ext.list.differ.c$a */
    public static final class C11565a<T> {

        /* renamed from: a */
        private Executor f31237a;

        /* renamed from: b */
        private final C1147c<T> f31238b;

        /* renamed from: a */
        public final C11564c<T> mo29150a() {
            return new C11564c<>(this.f31238b, this.f31237a, null);
        }

        /* renamed from: a */
        public final C11565a<T> mo29149a(Executor executor) {
            C7573i.m23587b(executor, "executor");
            this.f31237a = executor;
            return this;
        }

        public C11565a(C1147c<T> cVar) {
            C7573i.m23587b(cVar, "mDiffCallback");
            this.f31238b = cVar;
        }
    }

    private C11564c(C1147c<T> cVar, Executor executor) {
        this.f31235b = cVar;
        this.f31236c = executor;
        this.f31234a = (Executor) C11587g.m34062c().invoke();
    }

    public /* synthetic */ C11564c(C1147c cVar, Executor executor, C7571f fVar) {
        this(cVar, executor);
    }
}

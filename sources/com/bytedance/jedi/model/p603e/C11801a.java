package com.bytedance.jedi.model.p603e;

import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C48006q;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;

/* renamed from: com.bytedance.jedi.model.e.a */
public abstract class C11801a<K, V, K1, V1> {

    /* renamed from: a */
    public static final C11805b f31593a = new C11805b(null);

    /* renamed from: com.bytedance.jedi.model.e.a$a */
    public static final class C11802a<K, V, K1, V1> extends C11801a<K, V, K1, V1> {

        /* renamed from: b */
        public C7562b<? super V, ? extends List<? extends Pair<? extends K1, ? extends V1>>> f31594b;

        /* renamed from: c */
        public C7563m<? super V1, ? super V1, ? extends V1> f31595c;

        public C11802a() {
            this(null, null, 3, null);
        }

        /* renamed from: a */
        public final void mo29358a(C7562b<? super V, ? extends List<? extends Pair<? extends K1, ? extends V1>>> bVar) {
            C7573i.m23587b(bVar, "block");
            this.f31594b = bVar;
        }

        private C11802a(C7562b<? super V, ? extends List<? extends Pair<? extends K1, ? extends V1>>> bVar, C7563m<? super V1, ? super V1, ? extends V1> mVar) {
            C7573i.m23587b(bVar, "batch");
            C7573i.m23587b(mVar, "merge");
            super(null);
            this.f31594b = bVar;
            this.f31595c = mVar;
        }

        public /* synthetic */ C11802a(C7562b bVar, C7563m mVar, int i, C7571f fVar) {
            this(C118031.f31596a, C118042.f31597a);
        }
    }

    /* renamed from: com.bytedance.jedi.model.e.a$b */
    public static final class C11805b {

        /* renamed from: com.bytedance.jedi.model.e.a$b$a */
        static final class C11806a extends Lambda implements C7563m<K, V, K1> {

            /* renamed from: a */
            public static final C11806a f31598a = new C11806a();

            C11806a() {
                super(2);
            }

            /* JADX WARNING: Incorrect type for immutable var: ssa=K, code=java.lang.Object, for r1v0, types: [java.lang.Object, K] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final K1 invoke(java.lang.Object r1, V r2) {
                /*
                    r0 = this;
                    boolean r2 = r1 instanceof java.lang.Object
                    if (r2 != 0) goto L_0x0005
                    r1 = 0
                L_0x0005:
                    if (r1 == 0) goto L_0x0008
                    return r1
                L_0x0008:
                    java.lang.RuntimeException r1 = new java.lang.RuntimeException
                    r1.<init>()
                    java.lang.Throwable r1 = (java.lang.Throwable) r1
                    throw r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.jedi.model.p603e.C11801a.C11805b.C11806a.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }

        /* renamed from: com.bytedance.jedi.model.e.a$b$b */
        static final class C11807b extends Lambda implements C7563m<V, V1, Boolean> {

            /* renamed from: a */
            public static final C11807b f31599a = new C11807b();

            C11807b() {
                super(2);
            }

            public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(true);
            }
        }

        private C11805b() {
        }

        public /* synthetic */ C11805b(C7571f fVar) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public static <K, V, K1, V1> C11801a<K, V, K1, V1> m34556a(C7563m<? super V, ? super V1, Boolean> mVar, C7563m<? super V, ? super V1, ? extends V1> mVar2) {
            C7573i.m23587b(mVar, "predicate");
            C7573i.m23587b(mVar2, "merge");
            return new C11811d<>(mVar, mVar2);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public static <K, V, K1, V1> C11801a<K, V, K1, V1> m34557a(C7563m<? super K, ? super V, ? extends K1> mVar, C48006q<? super K, ? super V, ? super V1, ? extends V1> qVar) {
            C7573i.m23587b(mVar, "key");
            C7573i.m23587b(qVar, "merge");
            return new C11808c<>(mVar, qVar);
        }
    }

    /* renamed from: com.bytedance.jedi.model.e.a$c */
    public static final class C11808c<K, V, K1, V1> extends C11801a<K, V, K1, V1> {

        /* renamed from: b */
        public C7563m<? super K, ? super V, ? extends K1> f31600b;

        /* renamed from: c */
        public C48006q<? super K, ? super V, ? super V1, ? extends V1> f31601c;

        public C11808c() {
            this(null, null, 3, null);
        }

        /* renamed from: a */
        public final void mo29359a(C7563m<? super K, ? super V, ? extends K1> mVar) {
            C7573i.m23587b(mVar, "block");
            this.f31600b = mVar;
        }

        /* renamed from: a */
        public final void mo29360a(C48006q<? super K, ? super V, ? super V1, ? extends V1> qVar) {
            C7573i.m23587b(qVar, "block");
            this.f31601c = qVar;
        }

        public C11808c(C7563m<? super K, ? super V, ? extends K1> mVar, C48006q<? super K, ? super V, ? super V1, ? extends V1> qVar) {
            C7573i.m23587b(mVar, "key");
            C7573i.m23587b(qVar, "merge");
            super(null);
            this.f31600b = mVar;
            this.f31601c = qVar;
        }

        public /* synthetic */ C11808c(C7563m mVar, C48006q qVar, int i, C7571f fVar) {
            this(C118091.f31602a, C118102.f31603a);
        }
    }

    /* renamed from: com.bytedance.jedi.model.e.a$d */
    public static final class C11811d<K, V, K1, V1> extends C11801a<K, V, K1, V1> {

        /* renamed from: b */
        public C7563m<? super V, ? super V1, Boolean> f31604b;

        /* renamed from: c */
        public C7563m<? super V, ? super V1, ? extends V1> f31605c;

        public C11811d() {
            this(null, null, 3, null);
        }

        /* renamed from: a */
        public final void mo29361a(C7563m<? super V, ? super V1, Boolean> mVar) {
            C7573i.m23587b(mVar, "block");
            this.f31604b = mVar;
        }

        /* renamed from: b */
        public final void mo29362b(C7563m<? super V, ? super V1, ? extends V1> mVar) {
            C7573i.m23587b(mVar, "block");
            this.f31605c = mVar;
        }

        public C11811d(C7563m<? super V, ? super V1, Boolean> mVar, C7563m<? super V, ? super V1, ? extends V1> mVar2) {
            C7573i.m23587b(mVar, "predicate");
            C7573i.m23587b(mVar2, "merge");
            super(null);
            this.f31604b = mVar;
            this.f31605c = mVar2;
        }

        public /* synthetic */ C11811d(C7563m mVar, C7563m mVar2, int i, C7571f fVar) {
            this(C118121.f31606a, C118132.f31607a);
        }
    }

    private C11801a() {
    }

    public /* synthetic */ C11801a(C7571f fVar) {
        this();
    }
}

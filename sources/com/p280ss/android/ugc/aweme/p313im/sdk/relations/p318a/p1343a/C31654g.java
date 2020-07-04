package com.p280ss.android.ugc.aweme.p313im.sdk.relations.p318a.p1343a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.a.a.g */
public final class C31654g<R> {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f82871a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C31654g.class), "loaders", "getLoaders()Ljava/util/List;"))};

    /* renamed from: b */
    public static final C31655a f82872b = new C31655a(null);

    /* renamed from: c */
    private final C7541d f82873c;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.a.a.g$a */
    public static final class C31655a {
        private C31655a() {
        }

        /* renamed from: a */
        public static <R> C31654g<R> m102868a() {
            return new C31654g<>(null);
        }

        public /* synthetic */ C31655a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.a.a.g$b */
    static final class C31656b extends Lambda implements C7561a<List<C31644f<?, R>>> {

        /* renamed from: a */
        public static final C31656b f82874a = new C31656b();

        C31656b() {
            super(0);
        }

        /* renamed from: a */
        private static List<C31644f<?, R>> m102869a() {
            return new ArrayList<>();
        }

        public final /* synthetic */ Object invoke() {
            return m102869a();
        }
    }

    /* renamed from: c */
    private final List<C31644f<?, R>> m102863c() {
        return (List) this.f82873c.getValue();
    }

    private C31654g() {
        this.f82873c = C7546e.m23569a(C31656b.f82874a);
    }

    /* renamed from: b */
    public final void mo82443b() {
        for (C31644f j : m102863c()) {
            j.mo82432j();
        }
    }

    /* renamed from: a */
    public final List<C31644f<?, R>> mo82442a() {
        return C7525m.m23509d((Collection<? extends T>) m102863c());
    }

    public /* synthetic */ C31654g(C7571f fVar) {
        this();
    }

    /* renamed from: a */
    public final C31654g<R> mo82441a(C31644f<?, R> fVar) {
        C7573i.m23587b(fVar, "loader");
        C31654g<R> gVar = this;
        gVar.m102863c().add(fVar);
        return gVar;
    }

    /* renamed from: a */
    public final C31644f<?, R> mo82440a(boolean z) {
        for (C31644f<?, R> fVar : m102863c()) {
            if (fVar.mo82413d()) {
                return fVar;
            }
        }
        return null;
    }
}

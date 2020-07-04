package com.p280ss.android.ugc.aweme.location;

import android.app.Activity;
import android.content.Context;
import com.p280ss.android.ugc.aweme.location.C32625g.C32626a;
import com.p280ss.android.ugc.aweme.utils.permission.C43152a.C43154a;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.location.p */
public final class C32639p implements C32638o {

    /* renamed from: a */
    public static final C7541d f85087a = C7546e.m23568a(LazyThreadSafetyMode.SYNCHRONIZED, C32641b.f85091a);

    /* renamed from: b */
    public static final C32640a f85088b = new C32640a(null);

    /* renamed from: c */
    private C32625g f85089c;

    /* renamed from: com.ss.android.ugc.aweme.location.p$a */
    public static final class C32640a {

        /* renamed from: a */
        static final /* synthetic */ C7595j[] f85090a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C32640a.class), "INSTANCE", "getINSTANCE()Lcom/ss/android/ugc/aweme/location/SimpleLocationHelper;"))};

        private C32640a() {
        }

        /* renamed from: a */
        public static C32639p m105721a() {
            return (C32639p) C32639p.f85087a.getValue();
        }

        public /* synthetic */ C32640a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static boolean m105723a(Context context) {
            return C32625g.f85058b.mo84010a(context);
        }

        /* renamed from: a */
        public static void m105722a(Activity activity, C43154a aVar) {
            if (activity != null) {
                C32626a.m105685a(activity, aVar);
            }
        }

        /* renamed from: b */
        public static void m105724b(Activity activity, C43154a aVar) {
            if (activity != null) {
                C32626a.m105687b(activity, aVar);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.location.p$b */
    static final class C32641b extends Lambda implements C7561a<C32639p> {

        /* renamed from: a */
        public static final C32641b f85091a = new C32641b();

        C32641b() {
            super(0);
        }

        /* renamed from: a */
        private static C32639p m105725a() {
            return new C32639p(null);
        }

        public final /* synthetic */ Object invoke() {
            return m105725a();
        }
    }

    private C32639p() {
    }

    /* renamed from: a */
    public static final void m105711a(Activity activity, C43154a aVar) {
        C32640a.m105724b(activity, aVar);
    }

    /* renamed from: a */
    public static final boolean m105712a(Context context) {
        return C32640a.m105723a(context);
    }

    /* renamed from: a */
    public final LocationResult mo84021a() {
        C32625g gVar = this.f85089c;
        if (gVar != null) {
            return gVar.mo84003a();
        }
        return null;
    }

    /* renamed from: c */
    public final void mo84028c() {
        C32625g gVar = this.f85089c;
        if (gVar != null) {
            gVar.mo84009c();
        }
    }

    /* renamed from: b */
    public final void mo84027b() {
        C32625g gVar = this.f85089c;
        if (gVar != null) {
            gVar.mo84008b();
        }
    }

    public /* synthetic */ C32639p(C7571f fVar) {
        this();
    }

    /* renamed from: b */
    public final LocationResult mo84026b(C32624f fVar) {
        C32625g gVar = this.f85089c;
        if (gVar != null) {
            return gVar.mo84007b(fVar);
        }
        return null;
    }

    /* renamed from: a */
    public final void mo84024a(C32624f fVar) {
        C7573i.m23587b(fVar, "locationCallback");
        C32625g gVar = this.f85089c;
        if (gVar != null) {
            gVar.mo84005a(fVar);
        }
    }

    /* renamed from: a */
    public final void mo84025a(boolean z) {
        C32625g gVar = this.f85089c;
        if (gVar != null) {
            gVar.mo84006a(z);
        }
    }

    /* renamed from: a */
    public final void mo84022a(int i, C32624f fVar) {
        C7573i.m23587b(fVar, "locationCallback");
        C32625g gVar = this.f85089c;
        if (gVar != null) {
            gVar.mo84004a(i, fVar);
        }
    }

    /* renamed from: a */
    public final void mo84023a(Context context, C32633j jVar, C32620c cVar) {
        C7573i.m23587b(context, "context");
        this.f85089c = new C32625g(context, cVar);
        C32625g gVar = this.f85089c;
        if (gVar != null) {
            gVar.f85059a = jVar;
        }
    }
}

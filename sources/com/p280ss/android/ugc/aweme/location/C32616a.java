package com.p280ss.android.ugc.aweme.location;

import android.app.Activity;
import android.content.Context;
import bolts.C1592h;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.ugc.appcontext.C6405d;
import com.p280ss.android.ugc.aweme.location.C32625g.C32626a;
import com.p280ss.android.ugc.aweme.location.C32639p.C32640a;
import com.p280ss.android.ugc.aweme.poi.LocationBundle;
import com.p280ss.android.ugc.aweme.utils.permission.C43152a.C43154a;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.location.a */
public abstract class C32616a implements C32620c {

    /* renamed from: c */
    public static final C32617a f85049c = new C32617a(null);

    /* renamed from: a */
    public Context f85050a;

    /* renamed from: b */
    public C32639p f85051b;

    /* renamed from: d */
    private C32621d f85052d;

    /* renamed from: com.ss.android.ugc.aweme.location.a$a */
    public static final class C32617a {
        private C32617a() {
        }

        /* renamed from: a */
        public static boolean m105668a() {
            return C32625g.f85058b.mo84010a(C6399b.m19921a());
        }

        public /* synthetic */ C32617a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static void m105667a(Activity activity, C43154a aVar) {
            if (activity != null) {
                C32626a.m105685a(activity, aVar);
            }
        }

        /* renamed from: b */
        public static void m105669b(Activity activity, C43154a aVar) {
            if (activity != null) {
                C32626a.m105687b(activity, aVar);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.location.a$b */
    static final class C32618b<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ C32616a f85053a;

        /* renamed from: b */
        final /* synthetic */ Context f85054b;

        C32618b(C32616a aVar, Context context) {
            this.f85053a = aVar;
            this.f85054b = context;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C32639p call() {
            C32639p pVar = this.f85053a.f85051b;
            if (pVar == null) {
                return null;
            }
            pVar.mo84023a(this.f85054b, this.f85053a.mo83992a((C32638o) pVar, this.f85054b), this.f85053a);
            return pVar;
        }
    }

    /* renamed from: a */
    public static final void m105654a(Activity activity, C43154a aVar) {
        C32617a.m105667a(activity, aVar);
    }

    /* renamed from: b */
    public static final void m105655b(Activity activity, C43154a aVar) {
        C32617a.m105669b(activity, aVar);
    }

    /* renamed from: e */
    public static final boolean m105657e() {
        return C32617a.m105668a();
    }

    /* renamed from: a */
    public C32633j mo83992a(C32638o oVar, Context context) {
        return null;
    }

    /* renamed from: c */
    public abstract boolean mo83999c();

    /* renamed from: d */
    public final void mo84000d() {
        C32639p pVar = this.f85051b;
        if (pVar != null) {
            pVar.mo84028c();
        }
    }

    /* renamed from: a */
    public final LocationBundle mo83993a() {
        C32621d dVar = this.f85052d;
        if (dVar != null) {
            LocationBundle a = dVar.mo84002a();
            if (a != null) {
                return a;
            }
        }
        LocationResult locationResult = null;
        if (!mo83999c()) {
            return null;
        }
        C32639p pVar = this.f85051b;
        if (pVar != null) {
            locationResult = pVar.mo84021a();
        }
        return m105653a(locationResult);
    }

    /* renamed from: b */
    public void mo83998b() {
        boolean h = C6405d.m19987h();
        if (!h && !h) {
            C32639p pVar = this.f85051b;
            if (pVar != null) {
                pVar.mo84027b();
            }
        }
    }

    /* renamed from: b */
    private final void m105656b(Context context) {
        this.f85051b = C32640a.m105721a();
        C1592h.m7853a((Callable<TResult>) new C32618b<TResult>(this, context));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0013, code lost:
        if (r2 == null) goto L_0x0015;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.p280ss.android.ugc.aweme.poi.LocationBundle mo83994a(com.p280ss.android.ugc.aweme.location.C32624f r2) {
        /*
            r1 = this;
            com.ss.android.ugc.aweme.location.d r0 = r1.f85052d
            if (r0 == 0) goto L_0x000b
            com.ss.android.ugc.aweme.poi.LocationBundle r0 = r0.mo84002a()
            if (r0 == 0) goto L_0x000b
            return r0
        L_0x000b:
            com.ss.android.ugc.aweme.location.p r0 = r1.f85051b
            if (r0 == 0) goto L_0x0015
            com.ss.android.ugc.aweme.location.LocationResult r2 = r0.mo84026b(r2)
            if (r2 != 0) goto L_0x0016
        L_0x0015:
            r2 = 0
        L_0x0016:
            com.ss.android.ugc.aweme.poi.LocationBundle r2 = m105653a(r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.location.C32616a.mo83994a(com.ss.android.ugc.aweme.location.f):com.ss.android.ugc.aweme.poi.LocationBundle");
    }

    /* renamed from: a */
    private static LocationBundle m105653a(LocationResult locationResult) {
        if (locationResult == null) {
            return null;
        }
        LocationBundle locationBundle = new LocationBundle();
        locationBundle.time = locationResult.getTime();
        locationBundle.isGaode = locationResult.isGaode();
        locationBundle.latitude = locationResult.getLatitude();
        locationBundle.longitude = locationResult.getLongitude();
        locationBundle.country = locationResult.getCountry();
        locationBundle.province = locationResult.getProvince();
        locationBundle.city = locationResult.getCity();
        locationBundle.district = locationResult.getDistrict();
        locationBundle.address = locationResult.getAddress();
        locationBundle.accuracy = locationResult.getAccuracy();
        return locationBundle;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo83996a(Context context) {
        C7573i.m23587b(context, "context");
        this.f85050a = context;
        m105656b(context);
    }

    /* renamed from: a */
    public final void mo83997a(boolean z) {
        C32639p pVar = this.f85051b;
        if (pVar != null) {
            pVar.mo84025a(z);
        }
    }

    /* renamed from: a */
    public final void mo83995a(int i, C32624f fVar) {
        C7573i.m23587b(fVar, "locationCallback");
        C32639p pVar = this.f85051b;
        if (pVar != null) {
            pVar.mo84022a(i, fVar);
        }
    }
}

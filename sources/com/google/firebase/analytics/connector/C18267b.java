package com.google.firebase.analytics.connector;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.C15267r;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.internal.C16825ay;
import com.google.android.gms.measurement.internal.C16948m;
import com.google.firebase.C18261a;
import com.google.firebase.C18272b;
import com.google.firebase.analytics.connector.internal.C18271b;
import com.google.firebase.p785a.C18262a;
import com.google.firebase.p785a.C18265d;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.firebase.analytics.connector.b */
public class C18267b implements C18266a {

    /* renamed from: b */
    private static volatile C18266a f49649b;

    /* renamed from: a */
    final Map<String, Object> f49650a = new ConcurrentHashMap();

    /* renamed from: c */
    private final AppMeasurement f49651c;

    private C18267b(AppMeasurement appMeasurement) {
        C15267r.m44384a(appMeasurement);
        this.f49651c = appMeasurement;
    }

    /* renamed from: a */
    public static C18266a m60232a(C18272b bVar, Context context, C18265d dVar) {
        C15267r.m44384a(bVar);
        C15267r.m44384a(context);
        C15267r.m44384a(dVar);
        C15267r.m44384a(context.getApplicationContext());
        if (f49649b == null) {
            synchronized (C18267b.class) {
                if (f49649b == null) {
                    Bundle bundle = new Bundle(1);
                    if (bVar.mo47144e()) {
                        dVar.mo47129a(C18261a.class, C18268c.f49652a, C18269d.f49653a);
                        bundle.putBoolean("dataCollectionDefaultEnabled", bVar.mo47143d());
                    }
                    f49649b = new C18267b(C16825ay.m55497a(context, C16948m.m56283a(bundle)).f47011g);
                }
            }
        }
        return f49649b;
    }

    /* renamed from: a */
    public final void mo47134a(String str, String str2, Bundle bundle) {
        if (C18271b.m60238a(str) && C18271b.m60239a(str2, bundle) && C18271b.m60241a(str, str2, bundle)) {
            this.f49651c.logEventInternal(str, str2, bundle);
        }
    }

    /* renamed from: a */
    public final void mo47135a(String str, String str2, Object obj) {
        if (C18271b.m60238a(str) && C18271b.m60240a(str, str2)) {
            this.f49651c.mo43503a(str, str2, obj);
        }
    }

    /* renamed from: a */
    static final /* synthetic */ void m60233a(C18262a aVar) {
        boolean z = ((C18261a) aVar.f49645b).f49643a;
        synchronized (C18267b.class) {
            ((C18267b) f49649b).f49651c.mo43504a(z);
        }
    }
}

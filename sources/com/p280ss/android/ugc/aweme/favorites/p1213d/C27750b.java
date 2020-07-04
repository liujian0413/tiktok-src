package com.p280ss.android.ugc.aweme.favorites.p1213d;

import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.jedi.model.p602d.C11789a;
import com.p280ss.android.ugc.aweme.favorites.api.PoiCollectionJediApi;
import com.p280ss.android.ugc.aweme.favorites.api.PoiCollectionJediApi.C27735a;
import com.p280ss.android.ugc.aweme.favorites.p1210a.C27701f;
import com.p280ss.android.ugc.aweme.favorites.p1210a.C27702g;
import com.p280ss.android.ugc.aweme.location.C32630h;
import com.p280ss.android.ugc.aweme.poi.LocationBundle;
import java.util.List;
import kotlin.jvm.internal.C7573i;
import p346io.reactivex.C7492s;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.ss.android.ugc.aweme.favorites.d.b */
public final class C27750b extends C11789a<Integer, List<? extends C27702g>, C27749a, C27701f> {

    /* renamed from: a */
    private final PoiCollectionJediApi f73185a = C27735a.m90937a();

    /* renamed from: b */
    public final /* synthetic */ Object mo29352b(Object obj) {
        return m90955a((C27749a) obj);
    }

    /* renamed from: a */
    private static Integer m90955a(C27749a aVar) {
        C7573i.m23587b(aVar, "req");
        return Integer.valueOf(aVar.f73183a);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public C7492s<C27701f> mo29350a(C27749a aVar) {
        C7573i.m23587b(aVar, "req");
        LocationBundle a = C32630h.m105696b(C6399b.m19921a()).mo83993a();
        if (a != null) {
            C7492s<C27701f> b = this.f73185a.getPoiCollection(aVar.f73183a, aVar.f73184b, String.valueOf(a.longitude), String.valueOf(a.latitude)).mo19304b(C7333a.m23044b());
            C7573i.m23582a((Object) b, "service.getPoiCollection…scribeOn(Schedulers.io())");
            return b;
        }
        C7492s<C27701f> b2 = this.f73185a.getPoiCollection(aVar.f73183a, aVar.f73184b, "", "").mo19304b(C7333a.m23044b());
        C7573i.m23582a((Object) b2, "service.getPoiCollection…scribeOn(Schedulers.io())");
        return b2;
    }

    /* renamed from: a */
    private static List<C27702g> m90956a(C27749a aVar, C27701f fVar) {
        C7573i.m23587b(aVar, "req");
        C7573i.m23587b(fVar, "resp");
        if (fVar.status_code == 0) {
            return fVar.f73024a;
        }
        return null;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo29351a(Object obj, Object obj2) {
        return m90956a((C27749a) obj, (C27701f) obj2);
    }
}

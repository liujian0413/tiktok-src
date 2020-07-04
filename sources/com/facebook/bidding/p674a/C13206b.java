package com.facebook.bidding.p674a;

import com.facebook.bidding.C13202a;
import com.facebook.bidding.C13202a.C13203a;
import com.facebook.bidding.C13230b;
import com.facebook.bidding.p674a.p676b.C13208a;
import com.facebook.bidding.p674a.p676b.C13209b;
import com.facebook.bidding.p674a.p678d.C13214a;
import com.facebook.bidding.p674a.p679e.C13216b;
import com.facebook.bidding.p674a.p681h.p682a.C13228h;
import org.json.JSONException;

/* renamed from: com.facebook.bidding.a.b */
public final class C13206b {
    /* renamed from: a */
    public static void m38602a(final C13202a aVar, final C13203a aVar2) {
        C13204a.m38594a().execute(new Runnable() {
            public final void run() {
                C13230b bVar;
                try {
                    C13228h a = C13208a.m38606a(aVar.f34986a, aVar.f34990e, C13214a.m38613a(aVar));
                    bVar = a == null ? C13206b.m38603b(aVar) : C13206b.m38604b(aVar, a);
                } catch (JSONException e) {
                    bVar = C13206b.m38605b(aVar, e.getMessage());
                }
                aVar2.mo7903a(bVar);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static C13230b m38603b(C13202a aVar) {
        C13209b.m38609a(aVar.f34986a, aVar.mo32398a(), aVar.f34987b, aVar.f34995j);
        return new C13230b(C13216b.m38619a(aVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static C13230b m38604b(C13202a aVar, C13228h hVar) {
        return new C13230b(C13216b.m38620a(aVar, hVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static C13230b m38605b(C13202a aVar, String str) {
        return new C13230b(C13216b.m38621a(aVar, str));
    }
}

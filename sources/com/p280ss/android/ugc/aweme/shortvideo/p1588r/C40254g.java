package com.p280ss.android.ugc.aweme.shortvideo.p1588r;

import com.google.common.base.C17427g;
import com.google.common.collect.C17795bu;
import com.p280ss.android.ugc.aweme.challenge.model.SearchChallenge;
import com.p280ss.android.ugc.aweme.shortvideo.C39321d;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.r.g */
public final class C40254g implements C17427g<SearchChallenge, C39321d> {
    /* renamed from: b */
    public final /* synthetic */ Object mo44914b(Object obj) {
        return m128609a((SearchChallenge) obj);
    }

    /* renamed from: a */
    public static ArrayList<C39321d> m128610a(List<SearchChallenge> list) {
        if (list == null) {
            return null;
        }
        return C17795bu.m59144a((Iterable<? extends E>) C17795bu.m59147a(list, (C17427g<? super F, ? extends T>) new C40254g<Object,Object>()));
    }

    /* renamed from: a */
    private static C39321d m128609a(SearchChallenge searchChallenge) {
        ArrayList arrayList = null;
        if (searchChallenge == null) {
            return null;
        }
        C39321d dVar = new C39321d();
        new C40248a();
        dVar.f102138a = C40248a.m128593a(searchChallenge.challenge);
        if (searchChallenge.segments != null) {
            arrayList = C40255h.m128613a(searchChallenge.segments);
        }
        dVar.f102139b = arrayList;
        dVar.f102140c = searchChallenge.isFake;
        return dVar;
    }
}

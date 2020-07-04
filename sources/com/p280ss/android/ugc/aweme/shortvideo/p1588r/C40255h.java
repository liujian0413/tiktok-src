package com.p280ss.android.ugc.aweme.shortvideo.p1588r;

import com.google.common.base.C17427g;
import com.google.common.collect.C17795bu;
import com.p280ss.android.ugc.aweme.challenge.model.Segment;
import com.p280ss.android.ugc.aweme.shortvideo.C39365e;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.r.h */
public final class C40255h implements C17427g<Segment, C39365e> {
    /* renamed from: b */
    public final /* synthetic */ Object mo44914b(Object obj) {
        return m128612a((Segment) obj);
    }

    /* renamed from: a */
    private static C39365e m128612a(Segment segment) {
        if (segment == null) {
            return null;
        }
        C39365e eVar = new C39365e();
        eVar.f102264a = segment.begin;
        eVar.f102265b = segment.end;
        return eVar;
    }

    /* renamed from: a */
    public static ArrayList<C39365e> m128613a(List<Segment> list) {
        if (list == null) {
            return null;
        }
        return C17795bu.m59144a((Iterable<? extends E>) C17795bu.m59147a(list, (C17427g<? super F, ? extends T>) new C40255h<Object,Object>()));
    }
}

package com.p280ss.android.ugc.aweme.filter;

import com.google.common.collect.C17862by;
import com.google.common.collect.ImmutableListMultimap;
import com.p280ss.android.ugc.aweme.filter.p1247f.C29293a;
import com.p280ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.filter.t */
public final class C29331t implements C29293a {

    /* renamed from: a */
    private C17862by<EffectCategoryModel, C29324o> f77325a;

    /* renamed from: b */
    private final C17862by<EffectCategoryModel, C29324o> f77326b;

    /* renamed from: c */
    private final C17862by<EffectCategoryModel, C29324o> f77327c;

    /* renamed from: a */
    public final C17862by<EffectCategoryModel, C29324o> mo74973a() {
        return this.f77325a;
    }

    /* renamed from: b */
    public final C17862by<EffectCategoryModel, C29324o> mo74974b() {
        return this.f77326b;
    }

    /* renamed from: c */
    public final C17862by<EffectCategoryModel, C29324o> mo74975c() {
        return this.f77327c;
    }

    /* renamed from: f */
    public final boolean mo75010f() {
        return mo74973a().isEmpty();
    }

    public C29331t() {
        ImmutableListMultimap of = ImmutableListMultimap.m58562of();
        C7573i.m23582a((Object) of, "ImmutableListMultimap.of()");
        this.f77325a = of;
        C29263bs c = C29263bs.m95998c();
        C7573i.m23582a((Object) c, "SpecializedMultimap.create()");
        this.f77326b = c;
        C29263bs c2 = C29263bs.m95998c();
        C7573i.m23582a((Object) c2, "SpecializedMultimap.create()");
        this.f77327c = c2;
    }

    /* renamed from: d */
    public final Set<Integer> mo75008d() {
        Collection values = mo74974b().values();
        C7573i.m23582a((Object) values, "insertedItems.values()");
        Iterable<C29324o> iterable = values;
        Collection arrayList = new ArrayList(C7525m.m23469a(iterable, 10));
        for (C29324o oVar : iterable) {
            C7573i.m23582a((Object) oVar, "it");
            arrayList.add(Integer.valueOf(oVar.f77266a));
        }
        return C7525m.m23520j((Iterable<? extends T>) (List) arrayList);
    }

    /* renamed from: e */
    public final Set<Integer> mo75009e() {
        Collection values = mo74975c().values();
        C7573i.m23582a((Object) values, "removedItems.values()");
        Iterable<C29324o> iterable = values;
        Collection arrayList = new ArrayList(C7525m.m23469a(iterable, 10));
        for (C29324o oVar : iterable) {
            C7573i.m23582a((Object) oVar, "it");
            arrayList.add(Integer.valueOf(oVar.f77266a));
        }
        return C7525m.m23520j((Iterable<? extends T>) (List) arrayList);
    }

    /* renamed from: a */
    public final void mo75005a(C17862by<EffectCategoryModel, C29324o> byVar) {
        C7573i.m23587b(byVar, "<set-?>");
        this.f77325a = byVar;
    }

    /* renamed from: a */
    public final void mo75006a(EffectCategoryModel effectCategoryModel, C29324o oVar) {
        C7573i.m23587b(effectCategoryModel, "category");
        C7573i.m23587b(oVar, "filter");
        mo74974b().put(effectCategoryModel, oVar);
        mo74975c().remove(effectCategoryModel, oVar);
    }

    /* renamed from: b */
    public final void mo75007b(EffectCategoryModel effectCategoryModel, C29324o oVar) {
        C7573i.m23587b(effectCategoryModel, "category");
        C7573i.m23587b(oVar, "filter");
        mo74975c().put(effectCategoryModel, oVar);
        mo74974b().remove(effectCategoryModel, oVar);
    }
}

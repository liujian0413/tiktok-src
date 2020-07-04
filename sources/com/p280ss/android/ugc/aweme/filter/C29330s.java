package com.p280ss.android.ugc.aweme.filter;

import com.google.common.collect.C17794bt;
import com.google.common.collect.C17882cb;
import com.p280ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.p280ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import java.util.Iterator;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.filter.s */
public final class C29330s {
    /* renamed from: a */
    public static final EffectCategoryResponse m96192a(EffectCategoryModel effectCategoryModel) {
        EffectCategoryResponse effectCategoryResponse = new EffectCategoryResponse();
        effectCategoryResponse.f113500id = effectCategoryModel.f113499id;
        effectCategoryResponse.name = effectCategoryModel.name;
        effectCategoryResponse.key = effectCategoryModel.key;
        return effectCategoryResponse;
    }

    /* renamed from: a */
    public static final void m96193a(C17794bt<EffectCategoryResponse, C29296g> btVar, EffectCategoryModel effectCategoryModel, C29296g gVar) {
        Object obj;
        C17882cb keys = btVar.keys();
        C7573i.m23582a((Object) keys, "this.keys()");
        Iterator it = keys.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            EffectCategoryResponse effectCategoryResponse = (EffectCategoryResponse) obj;
            C7573i.m23582a((Object) effectCategoryResponse, "it");
            if (C7573i.m23585a((Object) effectCategoryResponse.f113500id, (Object) effectCategoryModel.f113499id)) {
                break;
            }
        }
        EffectCategoryResponse effectCategoryResponse2 = (EffectCategoryResponse) obj;
        if (effectCategoryResponse2 != null) {
            btVar.remove(effectCategoryResponse2, gVar);
        }
    }
}

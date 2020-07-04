package com.p280ss.android.ugc.aweme.filter;

import com.google.gson.C6600e;
import com.google.gson.C6715r;
import com.google.gson.C6717s;
import com.google.gson.p277b.C6597a;
import com.google.gson.stream.C6718a;
import com.google.gson.stream.C6720b;
import com.p280ss.android.ugc.aweme.effectplatform.FilterEffect;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.filter.FilterEffectTypeAdapterFactory */
public final class FilterEffectTypeAdapterFactory implements C6717s {

    /* renamed from: com.ss.android.ugc.aweme.filter.FilterEffectTypeAdapterFactory$a */
    public static final class C29167a extends C6715r<T> {

        /* renamed from: a */
        final /* synthetic */ C6715r f77009a;

        C29167a(C6715r rVar) {
            this.f77009a = rVar;
        }

        public final T read(C6718a aVar) {
            return this.f77009a.read(aVar);
        }

        public final void write(C6720b bVar, T t) {
            C6715r rVar = this.f77009a;
            if (t != null) {
                rVar.write(bVar, (FilterEffect) t);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.effectplatform.FilterEffect");
        }
    }

    public final <T> C6715r<T> create(C6600e eVar, C6597a<T> aVar) {
        C7573i.m23587b(eVar, "gson");
        C7573i.m23587b(aVar, "type");
        if (!C7573i.m23585a((Object) aVar.rawType, (Object) Effect.class)) {
            return null;
        }
        return new C29167a<>(eVar.mo15966a((C6717s) this, C6597a.get(FilterEffect.class)));
    }
}

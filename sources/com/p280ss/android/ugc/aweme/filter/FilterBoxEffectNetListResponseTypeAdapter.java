package com.p280ss.android.ugc.aweme.filter;

import com.google.gson.C6600e;
import com.google.gson.C6607f;
import com.google.gson.C6715r;
import com.google.gson.C6717s;
import com.google.gson.p277b.C6597a;
import com.google.gson.stream.C6718a;
import com.google.gson.stream.C6720b;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.filter.FilterBoxEffectNetListResponseTypeAdapter */
public final class FilterBoxEffectNetListResponseTypeAdapter implements C6717s {

    /* renamed from: com.ss.android.ugc.aweme.filter.FilterBoxEffectNetListResponseTypeAdapter$a */
    public static final class C29151a extends C6715r<T> {

        /* renamed from: a */
        final /* synthetic */ C6715r f76943a;

        C29151a(C6715r rVar) {
            this.f76943a = rVar;
        }

        public final T read(C6718a aVar) {
            return this.f76943a.read(aVar);
        }

        public final void write(C6720b bVar, T t) {
            C6715r rVar = this.f76943a;
            if (t != null) {
                rVar.write(bVar, (C29323n) t);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.filter.FilterBoxEffectNetListResponse2");
        }
    }

    public final <T> C6715r<T> create(C6600e eVar, C6597a<T> aVar) {
        C7573i.m23587b(aVar, "type");
        if (!C7573i.m23585a((Object) aVar.rawType, (Object) C29320m.class)) {
            return null;
        }
        return new C29151a<>(new C6607f().mo15985a((C6717s) new FilterEffectTypeAdapterFactory()).mo15992f().mo15967a(C29323n.class));
    }
}

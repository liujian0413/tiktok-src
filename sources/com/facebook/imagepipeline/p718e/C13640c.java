package com.facebook.imagepipeline.p718e;

import com.facebook.common.references.C13326a;
import com.facebook.datasource.C13346c;
import com.facebook.imagepipeline.p721h.C13653c;
import com.facebook.imagepipeline.p724k.C13699am;
import com.facebook.imagepipeline.p724k.C13711at;
import com.facebook.imagepipeline.p725l.C13783b;

/* renamed from: com.facebook.imagepipeline.e.c */
public final class C13640c<T> extends C13637a<C13326a<T>> {
    /* access modifiers changed from: private */
    /* renamed from: i */
    public C13326a<T> mo32641d() {
        return C13326a.m39000b((C13326a) super.mo32641d());
    }

    /* renamed from: a */
    private static void m40209a(C13326a<T> aVar) {
        C13326a.m39001c(aVar);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo32634a(Object obj) {
        m40209a((C13326a) obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo33251a(C13326a<T> aVar, int i) {
        super.mo33251a(C13326a.m39000b(aVar), i);
    }

    private C13640c(C13699am<C13326a<T>> amVar, C13711at atVar, C13653c cVar) {
        super(amVar, atVar, cVar);
    }

    /* renamed from: a */
    public static <T> C13346c<C13326a<T>> m40208a(C13699am<C13326a<T>> amVar, C13711at atVar, C13653c cVar) {
        if (C13783b.m40665b()) {
            C13783b.m40664a("CloseableProducerToDataSourceAdapter#create");
        }
        C13640c cVar2 = new C13640c(amVar, atVar, cVar);
        if (C13783b.m40665b()) {
            C13783b.m40663a();
        }
        return cVar2;
    }
}

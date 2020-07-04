package com.p280ss.android.ugc.aweme.utils;

import com.google.gson.C6600e;
import com.google.gson.C6715r;
import com.google.gson.C6717s;
import com.google.gson.p277b.C6597a;
import com.google.gson.stream.C6718a;
import com.google.gson.stream.C6720b;
import java.io.IOException;

/* renamed from: com.ss.android.ugc.aweme.utils.PostConstructTypeAdapterFactory */
public class PostConstructTypeAdapterFactory implements C6717s {

    /* renamed from: com.ss.android.ugc.aweme.utils.PostConstructTypeAdapterFactory$a */
    static class C42903a<T> extends C6715r<T> {

        /* renamed from: a */
        private final C6715r<T> f111423a;

        C42903a(C6715r<T> rVar) {
            this.f111423a = rVar;
        }

        public final T read(C6718a aVar) throws IOException {
            return this.f111423a.read(aVar);
        }

        public final void write(C6720b bVar, T t) throws IOException {
            this.f111423a.write(bVar, t);
        }
    }

    public <T> C6715r<T> create(C6600e eVar, C6597a<T> aVar) {
        return new C42903a(eVar.mo15966a((C6717s) this, aVar));
    }
}

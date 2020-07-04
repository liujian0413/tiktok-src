package com.p280ss.android.ugc.aweme.utils;

import com.google.gson.C6600e;
import com.google.gson.C6715r;
import com.google.gson.C6717s;
import com.google.gson.p277b.C6597a;
import com.google.gson.stream.C6718a;
import com.google.gson.stream.C6720b;
import java.io.IOException;

/* renamed from: com.ss.android.ugc.aweme.utils.StringJsonAdapterFactory */
public class StringJsonAdapterFactory implements C6717s {

    /* renamed from: com.ss.android.ugc.aweme.utils.StringJsonAdapterFactory$a */
    public static class C42905a<T> extends C6715r<T> {

        /* renamed from: a */
        private final C6600e f111428a;

        /* renamed from: b */
        private final C6597a<T> f111429b;

        public final T read(C6718a aVar) throws IOException {
            switch (aVar.mo16088f()) {
                case NULL:
                    aVar.mo16092j();
                    return null;
                case STRING:
                    return this.f111428a.mo15975a(aVar.mo16090h(), this.f111429b.type);
                default:
                    return this.f111428a.mo15972a(aVar, this.f111429b.type);
            }
        }

        public C42905a(C6600e eVar, C6597a<T> aVar) {
            this.f111428a = eVar;
            this.f111429b = aVar;
        }

        public final void write(C6720b bVar, T t) throws IOException {
            bVar.mo16110b(this.f111428a.mo15979b((Object) t));
        }
    }

    public <T> C6715r<T> create(C6600e eVar, C6597a<T> aVar) {
        return new C42905a(eVar, aVar);
    }
}

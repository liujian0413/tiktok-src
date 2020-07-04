package com.facebook.imagepipeline.p724k;

import com.facebook.imagepipeline.p720g.C13647e;
import com.facebook.imagepipeline.p724k.C13767t;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

/* renamed from: com.facebook.imagepipeline.k.ai */
public interface C13683ai<FETCH_STATE extends C13767t> {

    /* renamed from: com.facebook.imagepipeline.k.ai$a */
    public interface C13684a {
        /* renamed from: a */
        void mo33323a();

        /* renamed from: a */
        void mo33324a(InputStream inputStream, int i) throws IOException;

        /* renamed from: a */
        void mo33325a(Throwable th);
    }

    FETCH_STATE createFetchState(C13748k<C13647e> kVar, C13700an anVar);

    void fetch(FETCH_STATE fetch_state, C13684a aVar);

    Map<String, String> getExtraMap(FETCH_STATE fetch_state, int i);

    void onFetchCompletion(FETCH_STATE fetch_state, int i);

    boolean shouldPropagate(FETCH_STATE fetch_state);
}

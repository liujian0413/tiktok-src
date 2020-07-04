package com.p280ss.android.ugc.aweme.app.api;

import android.content.Context;
import com.bytedance.frameworks.baselib.network.http.p512a.p513a.C10107a;
import com.bytedance.frameworks.baselib.network.http.p512a.p513a.C10114e;
import com.bytedance.frameworks.baselib.network.http.util.C10186f;
import com.bytedance.retrofit2.p637a.C12459a;
import com.bytedance.retrofit2.p637a.C12459a.C12460a;
import com.bytedance.retrofit2.p637a.C12462c;
import com.bytedance.retrofit2.p637a.C12465e;
import com.bytedance.ttnet.C12961d;
import com.bytedance.ttnet.p672d.C12971c;
import java.io.IOException;

/* renamed from: com.ss.android.ugc.aweme.app.api.c */
public final class C22817c implements C12460a {

    /* renamed from: com.ss.android.ugc.aweme.app.api.c$a */
    static class C22819a implements C12459a {
        private C22819a() {
        }

        /* renamed from: a */
        public final C12465e mo10452a(C12462c cVar) throws IOException {
            Context a = C12961d.m37772a().mo31461a();
            C10114e a2 = C10114e.m30017a(a);
            if (C10186f.m30256b(a)) {
                C10114e.m30026a((C10107a) C12971c.m37800a());
            }
            return a2.mo10452a(cVar);
        }
    }

    /* renamed from: a */
    public final C12459a mo10453a() {
        return new C22819a();
    }
}

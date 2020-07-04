package com.bytedance.frameworks.baselib.network.http.p512a.p513a;

import com.bytedance.frameworks.baselib.network.http.C10104a;
import com.p280ss.android.ugc.aweme.lancet.network.C32285d;
import com.p280ss.android.ugc.aweme.net.C34068h;
import okhttp3.Response;

/* renamed from: com.bytedance.frameworks.baselib.network.http.a.a.g */
final class C10119g {
    /* renamed from: a */
    static String m30042a(Response response, C10104a aVar) {
        if (response == null || aVar == null) {
            return C10114e.m30032b(response, aVar);
        }
        if (!(aVar instanceof C34068h)) {
            return C10114e.m30032b(response, aVar);
        }
        try {
            ((C34068h) aVar).f88840C = C32285d.m104810a(response);
            ((C34068h) aVar).f88841D = C32285d.m104812b(response);
        } catch (Throwable unused) {
        }
        return C10114e.m30032b(response, aVar);
    }
}

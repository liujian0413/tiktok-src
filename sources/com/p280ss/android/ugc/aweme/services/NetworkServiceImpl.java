package com.p280ss.android.ugc.aweme.services;

import com.bytedance.ies.ugc.aweme.network.C10944e;
import com.google.gson.C6600e;
import com.p280ss.android.p284b.C19223b;
import com.p280ss.android.ugc.aweme.net.C34098r;
import com.p280ss.android.ugc.aweme.port.p1479in.C35534ae;
import kotlin.jvm.internal.C7573i;
import okhttp3.OkHttpClient;

/* renamed from: com.ss.android.ugc.aweme.services.NetworkServiceImpl */
public final class NetworkServiceImpl implements C35534ae {
    public final String getApiHost() {
        String str = C19223b.f51887b;
        C7573i.m23582a((Object) str, "CommonConstants.API_URL_PREFIX_API");
        return str;
    }

    public final C6600e getRetrofitFactoryGson() {
        return C10944e.m32113a();
    }

    public final OkHttpClient getOKHttpClient() {
        C34098r a = C34098r.m109769a();
        C7573i.m23582a((Object) a, "OkHttpManager.getSingleton()");
        OkHttpClient b = a.mo86751b();
        C7573i.m23582a((Object) b, "OkHttpManager.getSingleton().retrofitClient");
        return b;
    }
}

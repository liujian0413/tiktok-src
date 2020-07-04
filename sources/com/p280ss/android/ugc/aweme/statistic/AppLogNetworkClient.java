package com.p280ss.android.ugc.aweme.statistic;

import android.util.Pair;
import com.bytedance.common.utility.C6317k;
import com.bytedance.common.utility.C6317k.C6318a;
import com.bytedance.common.utility.CommonHttpException;
import com.bytedance.frameworks.baselib.network.http.cronet.impl.CronetIOException;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.retrofit2.p264b.C6450ac;
import com.bytedance.retrofit2.p264b.C6451b;
import com.bytedance.retrofit2.p264b.C6455f;
import com.bytedance.retrofit2.p264b.C6456g;
import com.bytedance.retrofit2.p264b.C6457h;
import com.bytedance.retrofit2.p264b.C6461l;
import com.bytedance.retrofit2.p264b.C6463n;
import com.bytedance.retrofit2.p264b.C6468s;
import com.bytedance.retrofit2.p637a.C12461b;
import com.google.common.util.concurrent.C18253l;
import com.p280ss.android.common.applog.NetUtil;
import com.p280ss.android.common.util.NetworkUtils;
import com.p280ss.android.http.legacy.client.HttpResponseException;
import com.p280ss.android.p284b.C19223b;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ExecutionException;

/* renamed from: com.ss.android.ugc.aweme.statistic.AppLogNetworkClient */
public final class AppLogNetworkClient extends C6317k {

    /* renamed from: a */
    private volatile AppLogGetApi f108644a;

    /* renamed from: b */
    private volatile AppLogPostApi f108645b;

    /* renamed from: c */
    private final int f108646c = PreloadTask.BYTE_UNIT_NUMBER;

    /* renamed from: com.ss.android.ugc.aweme.statistic.AppLogNetworkClient$AppLogGetApi */
    interface AppLogGetApi {
        @C6457h
        C18253l<String> getResponse(@C6450ac String str);
    }

    /* renamed from: com.ss.android.ugc.aweme.statistic.AppLogNetworkClient$AppLogPostApi */
    interface AppLogPostApi {
        @C6468s
        C18253l<String> doPost(@C6450ac String str, @C6451b TypedOutput typedOutput, @C6463n int i, @C6461l List<C12461b> list);

        @C6456g
        @C6468s
        C18253l<String> getResponse(@C6450ac String str, @C6455f Map<String, String> map, @C6463n int i);
    }

    /* renamed from: b */
    private AppLogPostApi m132952b() {
        if (this.f108645b == null) {
            this.f108645b = (AppLogPostApi) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(C19223b.f51890e).mo26430a().mo26435a(AppLogPostApi.class);
        }
        return this.f108645b;
    }

    /* renamed from: a */
    public final String mo15153a(String str, Map<String, String> map, C6318a aVar) throws Exception {
        if (str == null) {
            return null;
        }
        try {
            if (this.f108644a == null) {
                this.f108644a = (AppLogGetApi) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(C19223b.f51890e).mo26430a().mo26435a(AppLogGetApi.class);
            }
            return (String) this.f108644a.getResponse(str).get();
        } catch (ExecutionException e) {
            if (e.getCause() instanceof HttpResponseException) {
                throw new CommonHttpException(((HttpResponseException) e.getCause()).getStatusCode(), e.getMessage());
            }
            throw new CommonHttpException(0, e.getMessage());
        } catch (Exception e2) {
            throw new CommonHttpException(0, e2.getMessage());
        }
    }

    /* renamed from: a */
    public final String mo15152a(String str, List<Pair<String, String>> list, Map<String, String> map, C6318a aVar) throws CommonHttpException {
        if (str == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (Pair pair : list) {
            hashMap.put(pair.first, pair.second);
        }
        NetUtil.putCommonParams(hashMap, true);
        try {
            return (String) m132952b().getResponse(str, hashMap, 204800).get();
        } catch (ExecutionException e) {
            if (e.getCause() instanceof HttpResponseException) {
                throw new CommonHttpException(((HttpResponseException) e.getCause()).getStatusCode(), e.getMessage());
            } else if (e.getCause() instanceof CronetIOException) {
                CronetIOException cronetIOException = (CronetIOException) e.getCause();
                throw new CommonHttpException(cronetIOException.getStatusCode(), cronetIOException.getMessage());
            } else {
                throw new CommonHttpException(0, e.getMessage());
            }
        } catch (Exception e2) {
            throw new CommonHttpException(0, e2.getMessage());
        }
    }

    /* renamed from: a */
    public final String mo15154a(String str, byte[] bArr, Map<String, String> map, C6318a aVar) throws CommonHttpException {
        String filterUrl = NetworkUtils.filterUrl(str);
        if (filterUrl == null) {
            return null;
        }
        if (map != null) {
            try {
                String str2 = (String) map.get("Content-Encoding");
                String str3 = (String) map.get("Content-Type");
                ArrayList arrayList = new ArrayList();
                if (str2 != null) {
                    arrayList.add(new C12461b("Content-Encoding", str2));
                }
                if (str3 != null && str3.length() > 0) {
                    arrayList.add(new C12461b("Content-Type", str3));
                }
                for (Entry entry : map.entrySet()) {
                    arrayList.add(new C12461b((String) entry.getKey(), (String) entry.getValue()));
                }
                return (String) m132952b().doPost(filterUrl, new TypedByteArray(str3, bArr, new String[0]), 204800, arrayList).get();
            } catch (ExecutionException e) {
                if (e.getCause() instanceof HttpResponseException) {
                    throw new CommonHttpException(((HttpResponseException) e.getCause()).getStatusCode(), e.getMessage());
                } else if (e.getCause() instanceof CronetIOException) {
                    CronetIOException cronetIOException = (CronetIOException) e.getCause();
                    throw new CommonHttpException(cronetIOException.getStatusCode(), cronetIOException.getMessage());
                } else {
                    throw new CommonHttpException(0, e.getMessage());
                }
            } catch (Exception e2) {
                throw new CommonHttpException(0, e2.getMessage());
            }
        } else {
            return (String) m132952b().doPost(filterUrl, new TypedByteArray(null, bArr, new String[0]), 204800, null).get();
        }
    }
}

package com.bytedance.android.live.network;

import com.bytedance.android.live.base.model.NameValuePair;
import com.bytedance.android.live.network.C3455c.C3456a;
import com.bytedance.android.live.network.api.INetworkService;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdkapi.host.IHostNetwork;
import com.bytedance.android.livesdkapi.p457i.C9477e;
import com.bytedance.android.livesdkapi.p457i.C9479g;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class NetWorkService implements INetworkService {
    private C3455c mCommonParamsInterceptor;
    private IHostNetwork mIHostNetwork;
    private Map<Class, C2265b> protoDecoderMap = new ConcurrentHashMap();

    public String getHostDomain() {
        return this.mIHostNetwork.getHostDomain();
    }

    public Map<String, String> getCommonParams() {
        Map<String, String> commonParams = this.mIHostNetwork.getCommonParams();
        if (this.mCommonParamsInterceptor != null) {
            this.mCommonParamsInterceptor.mo10439a(commonParams);
        }
        return commonParams;
    }

    public void injectProtoDecoders(Map<Class, C2265b> map) {
        this.protoDecoderMap.putAll(map);
    }

    public <T> C2265b<T> getProtoDecoder(Class<T> cls) {
        return (C2265b) this.protoDecoderMap.get(cls);
    }

    public NetWorkService(IHostNetwork iHostNetwork) {
        if (C3596c.m13172a(INetworkService.class) == null) {
            C3596c.m13174a(INetworkService.class, this);
            C3596c.m13174a(IHostNetwork.class, this);
            this.mIHostNetwork = iHostNetwork;
            this.mCommonParamsInterceptor = C3454b.m12793a();
        }
    }

    public C9479g<C9477e> get(String str, List<NameValuePair> list) throws IOException {
        if (this.mCommonParamsInterceptor == null) {
            return this.mIHostNetwork.get(str, list);
        }
        C3456a a = this.mCommonParamsInterceptor.mo10438a(new C3456a(str, list));
        return this.mIHostNetwork.get(a.f10263a, a.f10264b);
    }

    public C9479g<C9477e> post(String str, List<NameValuePair> list, String str2, byte[] bArr) throws IOException {
        if (this.mCommonParamsInterceptor == null) {
            return this.mIHostNetwork.post(str, list, str2, bArr);
        }
        C3456a a = this.mCommonParamsInterceptor.mo10438a(new C3456a(str, list));
        return this.mIHostNetwork.post(a.f10263a, a.f10264b, str2, bArr);
    }

    public C9479g<C9477e> downloadFile(boolean z, int i, String str, List<NameValuePair> list, Object obj) throws IOException {
        if (this.mCommonParamsInterceptor == null) {
            return this.mIHostNetwork.downloadFile(z, i, str, list, obj);
        }
        C3456a a = this.mCommonParamsInterceptor.mo10438a(new C3456a(str, list));
        return this.mIHostNetwork.downloadFile(z, i, a.f10263a, a.f10264b, obj);
    }

    public C9479g<C9477e> uploadFile(int i, String str, List<NameValuePair> list, String str2, byte[] bArr, long j, String str3) throws IOException {
        if (this.mCommonParamsInterceptor != null) {
            String str4 = str;
            List<NameValuePair> list2 = list;
            C3456a a = this.mCommonParamsInterceptor.mo10438a(new C3456a(str, list));
            return this.mIHostNetwork.uploadFile(i, a.f10263a, a.f10264b, str2, bArr, j, str3);
        }
        return this.mIHostNetwork.uploadFile(i, str, list, str2, bArr, j, str3);
    }
}

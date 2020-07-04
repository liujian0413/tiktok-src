package com.bytedance.android.live.network.api;

import com.bytedance.android.live.base.C2324b;
import com.bytedance.android.livesdkapi.host.IHostNetwork;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import java.util.Map;

public interface INetworkService extends C2324b, IHostNetwork {
    <T> C2265b<T> getProtoDecoder(Class<T> cls);

    void injectProtoDecoders(Map<Class, C2265b> map);
}

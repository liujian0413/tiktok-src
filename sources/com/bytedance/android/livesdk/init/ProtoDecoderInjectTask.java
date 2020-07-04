package com.bytedance.android.livesdk.init;

import com.bytedance.android.live.base.model.proto.C2362b;
import com.bytedance.android.live.network.api.INetworkService;
import com.bytedance.android.live.p115a.C2319a;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.p394i.C8306a;

@C2319a(mo8127a = 7)
public class ProtoDecoderInjectTask extends C8306a {
    public void run() {
        ((INetworkService) C3596c.m13172a(INetworkService.class)).injectProtoDecoders(C2362b.m9965a());
    }
}

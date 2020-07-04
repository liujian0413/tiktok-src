package com.p280ss.optimizer.live.sdk.dns;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;

/* renamed from: com.ss.optimizer.live.sdk.dns.e */
public final class C45915e extends C45922k {
    /* access modifiers changed from: private */
    /* renamed from: a */
    public C45921j call() throws Exception {
        try {
            InetAddress[] allByName = InetAddress.getAllByName(this.f117389a);
            ArrayList arrayList = new ArrayList();
            if (allByName != null && allByName.length > 0) {
                for (InetAddress hostAddress : allByName) {
                    String hostAddress2 = hostAddress.getHostAddress();
                    if (m144032a(hostAddress2)) {
                        arrayList.add(hostAddress2);
                    }
                }
            }
            if (C45916f.f117368a) {
                StringBuilder sb = new StringBuilder("succeed, host= ");
                sb.append(this.f117389a);
                sb.append(", ips= ");
                sb.append(arrayList);
            }
            return new C45921j(this.f117389a, arrayList, 0);
        } catch (UnknownHostException unused) {
            if (C45916f.f117368a) {
                new StringBuilder("failed, host= ").append(this.f117389a);
            }
            return new C45921j(this.f117389a, null, 0);
        }
    }

    C45915e(String str) {
        super(str);
    }
}

package com.toutiao.proxyserver.p1842d;

import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.taobao.android.dexposed.ClassUtils;

/* renamed from: com.toutiao.proxyserver.d.b */
public final class C46475b {
    /* renamed from: a */
    private static String m146105a(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(i & NormalGiftView.ALPHA_255);
        sb.append(ClassUtils.PACKAGE_SEPARATOR);
        sb.append((i >> 8) & NormalGiftView.ALPHA_255);
        sb.append(ClassUtils.PACKAGE_SEPARATOR);
        sb.append((i >> 16) & NormalGiftView.ALPHA_255);
        sb.append(ClassUtils.PACKAGE_SEPARATOR);
        sb.append((i >> 24) & NormalGiftView.ALPHA_255);
        return sb.toString();
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m146106a(android.content.Context r4) {
        /*
            r0 = 0
            if (r4 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.lang.String r1 = "connectivity"
            java.lang.Object r1 = r4.getSystemService(r1)     // Catch:{  }
            android.net.ConnectivityManager r1 = (android.net.ConnectivityManager) r1     // Catch:{  }
            android.net.NetworkInfo r1 = r1.getActiveNetworkInfo()     // Catch:{  }
            if (r1 == 0) goto L_0x0071
            boolean r2 = r1.isConnected()     // Catch:{  }
            if (r2 == 0) goto L_0x0071
            int r2 = r1.getType()     // Catch:{  }
            if (r2 != 0) goto L_0x0051
            java.util.Enumeration r4 = java.net.NetworkInterface.getNetworkInterfaces()     // Catch:{ Error -> 0x0071 }
            if (r4 == 0) goto L_0x0071
        L_0x0024:
            boolean r1 = r4.hasMoreElements()     // Catch:{ Error -> 0x0071 }
            if (r1 == 0) goto L_0x0071
            java.lang.Object r1 = r4.nextElement()     // Catch:{ Error -> 0x0071 }
            java.net.NetworkInterface r1 = (java.net.NetworkInterface) r1     // Catch:{ Error -> 0x0071 }
            java.util.Enumeration r1 = r1.getInetAddresses()     // Catch:{ Error -> 0x0071 }
            if (r1 == 0) goto L_0x0024
        L_0x0036:
            boolean r2 = r1.hasMoreElements()     // Catch:{ Error -> 0x0071 }
            if (r2 == 0) goto L_0x0024
            java.lang.Object r2 = r1.nextElement()     // Catch:{ Error -> 0x0071 }
            java.net.InetAddress r2 = (java.net.InetAddress) r2     // Catch:{ Error -> 0x0071 }
            boolean r3 = r2 instanceof java.net.Inet4Address     // Catch:{ Error -> 0x0071 }
            if (r3 == 0) goto L_0x0036
            boolean r3 = r2.isLoopbackAddress()     // Catch:{ Error -> 0x0071 }
            if (r3 != 0) goto L_0x0036
            java.lang.String r4 = r2.getHostAddress()     // Catch:{ Error -> 0x0071 }
            return r4
        L_0x0051:
            int r1 = r1.getType()     // Catch:{  }
            r2 = 1
            if (r1 != r2) goto L_0x0071
            android.content.Context r4 = r4.getApplicationContext()     // Catch:{ Error -> 0x0071 }
            java.lang.String r1 = "wifi"
            java.lang.Object r4 = r4.getSystemService(r1)     // Catch:{ Error -> 0x0071 }
            android.net.wifi.WifiManager r4 = (android.net.wifi.WifiManager) r4     // Catch:{ Error -> 0x0071 }
            android.net.wifi.WifiInfo r4 = r4.getConnectionInfo()     // Catch:{ Error -> 0x0071 }
            int r4 = r4.getIpAddress()     // Catch:{ Error -> 0x0071 }
            java.lang.String r4 = m146105a(r4)     // Catch:{ Error -> 0x0071 }
            return r4
        L_0x0071:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.toutiao.proxyserver.p1842d.C46475b.m146106a(android.content.Context):java.lang.String");
    }
}

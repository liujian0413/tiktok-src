package com.p280ss.android.ugc.aweme.update;

import android.content.Context;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.taobao.android.dexposed.ClassUtils;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.Enumeration;

/* renamed from: com.ss.android.ugc.aweme.update.d */
public final class C42784d {
    /* renamed from: a */
    private static String m135800a() {
        try {
            Enumeration networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                Enumeration inetAddresses = ((NetworkInterface) networkInterfaces.nextElement()).getInetAddresses();
                while (true) {
                    if (inetAddresses.hasMoreElements()) {
                        InetAddress inetAddress = (InetAddress) inetAddresses.nextElement();
                        if (!inetAddress.isLoopbackAddress() && !inetAddress.isLinkLocalAddress()) {
                            return inetAddress.getHostAddress();
                        }
                    }
                }
            }
            return null;
        } catch (SocketException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static String m135803a(String str) {
        try {
            return InetAddress.getByName(new URL(str).getHost()).getHostAddress();
        } catch (MalformedURLException | UnknownHostException unused) {
            return "";
        }
    }

    /* renamed from: a */
    private static String m135801a(int i) {
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

    /* renamed from: a */
    public static String m135802a(Context context) {
        if (context == null) {
            return "";
        }
        WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService("wifi");
        if (wifiManager == null || !wifiManager.isWifiEnabled()) {
            return m135800a();
        }
        String str = "";
        WifiInfo connectionInfo = wifiManager.getConnectionInfo();
        if (connectionInfo != null) {
            str = m135801a(connectionInfo.getIpAddress());
        }
        return str;
    }
}

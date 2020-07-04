package com.p280ss.ttvideoengine.p1813f;

import android.os.SystemClock;
import com.p280ss.ttvideoengine.p1816i.C46115b;
import com.p280ss.ttvideoengine.p1816i.C46123h;
import java.net.InetAddress;
import java.net.UnknownHostException;

/* renamed from: com.ss.ttvideoengine.f.d */
public final class C46092d {

    /* renamed from: a */
    public static volatile String f117957a;

    /* renamed from: b */
    public static volatile long f117958b;

    /* renamed from: b */
    public static String m144462b() {
        m144461a();
        return f117957a;
    }

    /* renamed from: a */
    public static void m144461a() {
        if (SystemClock.elapsedRealtime() - f117958b >= 300000) {
            C46115b.m144501a((Runnable) new Runnable() {
                public final void run() {
                    try {
                        InetAddress byName = InetAddress.getByName("whoami.akamai.net");
                        if (byName != null) {
                            C46092d.f117957a = byName.getHostAddress();
                            C46092d.f117958b = SystemClock.elapsedRealtime();
                            StringBuilder sb = new StringBuilder("update dns server ip:");
                            sb.append(C46092d.f117957a);
                            C46123h.m144545a("DNSServerIP", sb.toString());
                        }
                    } catch (UnknownHostException unused) {
                    }
                }
            });
        }
    }
}

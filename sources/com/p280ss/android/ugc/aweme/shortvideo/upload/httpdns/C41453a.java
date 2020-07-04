package com.p280ss.android.ugc.aweme.shortvideo.upload.httpdns;

import com.google.gson.C6600e;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVAB.Property;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41530am;
import com.p280ss.ttuploader.TTUploadResolver;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.httpdns.a */
public final class C41453a {
    /* renamed from: a */
    public static final void m132107a() {
        HttpDNSConfig b = m132108b();
        if (b != null) {
            TTUploadResolver.setDNSType(b.getVersion(), b.getMainDNSType(), b.getBackDNSType(), b.getBackUpUsedDelayTime(), b.getExpiredTime());
        }
    }

    /* renamed from: b */
    private static final HttpDNSConfig m132108b() {
        HttpDNSConfig httpDNSConfig;
        String e = C35563c.f93231M.mo93309e(Property.TTUploaderHttpDNSConfig);
        StringBuilder sb = new StringBuilder("solveHttpDNSConfig json : ");
        sb.append(e);
        C41530am.m132280a(sb.toString());
        try {
            httpDNSConfig = (HttpDNSConfig) new C6600e().mo15974a(e, HttpDNSConfig.class);
        } catch (Exception unused) {
            StringBuilder sb2 = new StringBuilder("solveHttpDNSConfig failed: ");
            sb2.append(e);
            C41530am.m132283b(sb2.toString());
            httpDNSConfig = null;
        }
        StringBuilder sb3 = new StringBuilder("solveHttpDNSConfig config : ");
        sb3.append(httpDNSConfig);
        C41530am.m132280a(sb3.toString());
        return httpDNSConfig;
    }
}

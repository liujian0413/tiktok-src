package com.p280ss.android.ugc.aweme.video.preload;

import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.video.preload.enginepreloader.EnginePreloader.CDNLog;
import com.toutiao.proxyserver.p1839a.C46455c;
import java.util.HashMap;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.video.preload.f */
public final class C43281f {

    /* renamed from: p */
    public static final String f112032p = f112032p;

    /* renamed from: q */
    public static final String f112033q = f112033q;

    /* renamed from: r */
    public static final C43282a f112034r = new C43282a(null);

    /* renamed from: a */
    public String f112035a;

    /* renamed from: b */
    public String f112036b;

    /* renamed from: c */
    public String f112037c;

    /* renamed from: d */
    public String f112038d;

    /* renamed from: e */
    public String f112039e;

    /* renamed from: f */
    public String f112040f;

    /* renamed from: g */
    public String f112041g;

    /* renamed from: h */
    public String f112042h;

    /* renamed from: i */
    public long f112043i;

    /* renamed from: j */
    public long f112044j;

    /* renamed from: k */
    public Map<String, String> f112045k;

    /* renamed from: l */
    public int f112046l;

    /* renamed from: m */
    public int f112047m;

    /* renamed from: n */
    public int f112048n;

    /* renamed from: o */
    public long f112049o;

    /* renamed from: com.ss.android.ugc.aweme.video.preload.f$a */
    public static final class C43282a {
        private C43282a() {
        }

        /* renamed from: a */
        public static String m137313a() {
            return C43281f.f112032p;
        }

        /* renamed from: b */
        public static String m137314b() {
            return C43281f.f112033q;
        }

        public /* synthetic */ C43282a(C7571f fVar) {
            this();
        }
    }

    public C43281f() {
        this.f112047m = -1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RequestInfo(key=");
        sb.append(this.f112035a);
        sb.append(", hostName=");
        sb.append(this.f112036b);
        sb.append(", dnsAddr=");
        sb.append(this.f112037c);
        sb.append(", originUrl=");
        sb.append(this.f112038d);
        sb.append(", finalUrl=");
        sb.append(this.f112039e);
        sb.append(", localIp=");
        sb.append(this.f112040f);
        sb.append(", remoteIp=");
        sb.append(this.f112041g);
        sb.append(", userAgent=");
        sb.append(this.f112042h);
        sb.append(", duration=");
        sb.append(this.f112043i);
        sb.append(", size=");
        sb.append(this.f112044j);
        sb.append(", headers=");
        sb.append(this.f112045k);
        sb.append(')');
        return sb.toString();
    }

    public C43281f(CDNLog cDNLog) {
        C7573i.m23587b(cDNLog, "cdnLog");
        this();
        this.f112035a = cDNLog.fileKey;
        this.f112036b = cDNLog.host;
        this.f112039e = cDNLog.finalUrl;
        this.f112046l = cDNLog.statusCode;
        this.f112041g = cDNLog.serverIp;
        this.f112044j = cDNLog.contentLength;
        this.f112049o = cDNLog.ttfb;
        this.f112043i = cDNLog.reqEndT - cDNLog.reqStartT;
        this.f112045k = new HashMap();
        if (!TextUtils.isEmpty(cDNLog.xCache)) {
            Map<String, String> map = this.f112045k;
            if (map != null) {
                ((HashMap) map).put(f112032p, cDNLog.xCache);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.String>");
            }
        }
        if (!TextUtils.isEmpty(cDNLog.xMCache)) {
            Map<String, String> map2 = this.f112045k;
            if (map2 != null) {
                ((HashMap) map2).put(f112033q, cDNLog.xMCache);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.String>");
        }
    }

    public C43281f(C46455c cVar) {
        C7573i.m23587b(cVar, "requestModel");
        this();
        this.f112035a = cVar.f119705a;
        this.f112036b = cVar.f119706b;
        this.f112037c = cVar.f119707c;
        this.f112038d = cVar.f119708d;
        this.f112039e = cVar.f119709e;
        this.f112040f = cVar.f119710f;
        this.f112041g = cVar.f119711g;
        this.f112042h = cVar.f119712h;
        this.f112043i = cVar.f119713i;
        this.f112044j = (long) cVar.f119714j;
        this.f112045k = cVar.f119715k;
        this.f112046l = cVar.f119716l;
        this.f112047m = cVar.f119717m;
        this.f112048n = cVar.f119718n;
    }
}

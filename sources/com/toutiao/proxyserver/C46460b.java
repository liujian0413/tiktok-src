package com.toutiao.proxyserver;

import android.os.SystemClock;
import android.text.TextUtils;
import bolts.C1592h;
import com.p280ss.android.ugc.aweme.common.C6909j;
import com.p280ss.android.ugc.aweme.feed.C28580o;
import com.p280ss.android.ugc.aweme.metrics.p1393a.C33221a;
import com.p280ss.android.ugc.aweme.metrics.p1393a.C33225e;
import com.p280ss.android.ugc.aweme.metrics.p1393a.C33225e.C33226a;
import com.toutiao.proxyserver.net.C46517e;
import java.io.IOException;
import java.util.concurrent.Callable;

/* renamed from: com.toutiao.proxyserver.b */
final class C46460b {
    /* renamed from: a */
    static C46517e m146062a(C46447a aVar, String str, int i, int i2, String str2) throws IOException {
        C46447a aVar2 = aVar;
        String str3 = str;
        int i3 = 1;
        boolean z = aVar2.f119664i != null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        String[] strArr = null;
        String str4 = "";
        int lastIndexOf = str3.lastIndexOf("&source_id=");
        if (z && !C33221a.m107195c() && !TextUtils.isEmpty(str)) {
            String str5 = aVar2.f119662g;
            if (lastIndexOf > 0) {
                int i4 = lastIndexOf + 11;
                if (i4 < str.length()) {
                    str4 = str3.substring(i4);
                }
            }
            if (!TextUtils.isEmpty(str5)) {
                strArr = str5.split("_");
            }
            long g = C28580o.m93837g();
            C6909j jVar = new C6909j();
            String str6 = "duration";
            long j = 0;
            if (g > 0) {
                j = SystemClock.elapsedRealtime() - g;
            }
            C1592h.m7853a((Callable<TResult>) new C33226a<TResult>("video_api_request", jVar.mo16966a(str6, Long.toString(j)).mo16966a("is_first", String.valueOf(C33225e.f86484a ? 1 : 0)).mo16966a("group_id", str4).mo16966a("bitRate", (strArr == null || strArr.length <= 3) ? "" : strArr[3]).mo16966a("video_type", (strArr == null || strArr.length <= 2) ? "" : strArr[2]).mo16966a("isH265", (strArr == null || strArr.length <= 1) ? "" : strArr[1]).mo16966a("from_size", String.valueOf(i)).mo16966a("to_size", String.valueOf(i2)).mo16967a()));
            C33225e.f86484a = false;
        }
        if (lastIndexOf > 0 && z && !TextUtils.isEmpty(str)) {
            str3 = str3.substring(0, lastIndexOf);
        }
        C46517e b = aVar2.mo115562b(str3, i, i2, str2);
        if (b != null && b.mo115670a()) {
            try {
                String a = b.mo115668a("Content-Length");
                if (a != null) {
                    Long.parseLong(a);
                }
            } catch (Exception unused) {
            }
        }
        if (z && !C33221a.m107195c()) {
            C6909j a2 = new C6909j().mo16966a("feed_tab", C28580o.m93834d()).mo16966a("duration", String.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime)).mo16966a("is_first", String.valueOf(C33225e.f86485b ? 1 : 0)).mo16966a("group_id", str4).mo16966a("bitRate", (strArr == null || strArr.length <= 3) ? "" : strArr[3]).mo16966a("video_type", (strArr == null || strArr.length <= 2) ? "" : strArr[2]).mo16966a("isH265", (strArr == null || strArr.length <= 1) ? "" : strArr[1]).mo16966a("from_size", String.valueOf(i)).mo16966a("to_size", String.valueOf(i2));
            String str7 = "is_success";
            if (b == null || !b.mo115670a()) {
                i3 = 0;
            }
            C1592h.m7853a((Callable<TResult>) new C33226a<TResult>("video_api_response", a2.mo16966a(str7, String.valueOf(i3)).mo16967a()));
            C33225e.f86485b = false;
            C28580o.m93838h();
        }
        return b;
    }
}

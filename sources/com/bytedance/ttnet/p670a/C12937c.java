package com.bytedance.ttnet.p670a;

import android.content.Context;
import android.location.Address;
import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.bytedance.common.utility.C6319n;
import com.bytedance.frameworks.baselib.network.http.cronet.impl.C10124b;
import com.bytedance.frameworks.baselib.network.http.util.C10190j;
import com.bytedance.ttnet.C12961d;
import com.bytedance.ttnet.p671c.C12954a;
import com.bytedance.ttnet.p671c.C12957c;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.bytedance.ttnet.a.c */
public final class C12937c {
    /* renamed from: a */
    public static void m37685a(Context context) {
        String str;
        C12925a.m37625a(context);
        String[] s = C12925a.m37646s();
        int length = s.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            String str2 = s[i];
            try {
                C12954a aVar = new C12954a();
                aVar.f34299h = true;
                StringBuilder sb = new StringBuilder();
                sb.append("https://");
                sb.append(str2);
                sb.append("/get_domains/v4/");
                Address a = C12961d.m37772a().mo31462a(context);
                C10190j jVar = new C10190j(sb.toString());
                if (a != null && a.hasLatitude() && a.hasLongitude()) {
                    jVar.mo24887a("latitude", a.getLatitude());
                    jVar.mo24887a("longitude", a.getLongitude());
                    String locality = a.getLocality();
                    if (!C6319n.m19593a(locality)) {
                        jVar.mo24890a("city", Uri.encode(locality));
                    }
                }
                try {
                    if (VERSION.SDK_INT < 21) {
                        str = Build.CPU_ABI;
                    } else {
                        str = Build.SUPPORTED_ABIS[0];
                    }
                    jVar.mo24890a("abi", str);
                } catch (Throwable unused) {
                }
                jVar.mo24890a("tnc_src", "7");
                String jVar2 = jVar.toString();
                HashMap hashMap = new HashMap();
                String a2 = C12957c.m37766a(jVar2, null, hashMap, aVar);
                if (!C6319n.m19593a(a2)) {
                    if ("success".equals(new JSONObject(a2).getString("message"))) {
                        String str3 = "";
                        String str4 = "";
                        try {
                            if (hashMap.get("X-Ss-Etag") != null && !TextUtils.isEmpty((CharSequence) ((List) hashMap.get("X-Ss-Etag")).get(0))) {
                                str3 = (String) ((List) hashMap.get("X-Ss-Etag")).get(0);
                            }
                            if (hashMap.get("X-Ss-Canary") != null && !TextUtils.isEmpty((CharSequence) ((List) hashMap.get("X-Ss-Canary")).get(0))) {
                                str4 = (String) ((List) hashMap.get("X-Ss-Canary")).get(0);
                            }
                            C10124b.m30047a(C12961d.m37772a().mo31461a());
                            C10124b.m30057a(str3, str4, a2);
                        } catch (Throwable unused2) {
                            return;
                        }
                    }
                }
            } catch (Throwable unused3) {
            }
            i++;
        }
    }
}

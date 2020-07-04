package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.C14793ay;
import java.util.Map;

@C6505uv
/* renamed from: com.google.android.gms.internal.ads.gz */
public final class C15724gz implements C15742hq<ami> {
    /* renamed from: a */
    public final /* synthetic */ void mo37744a(Object obj, Map map) {
        ami ami = (ami) obj;
        String str = (String) map.get("action");
        if ("tick".equals(str)) {
            String str2 = (String) map.get("label");
            String str3 = (String) map.get("start_label");
            String str4 = (String) map.get("timestamp");
            if (TextUtils.isEmpty(str2)) {
                acd.m45783e("No label given for CSI tick.");
            } else if (TextUtils.isEmpty(str4)) {
                acd.m45783e("No timestamp given for CSI tick.");
            } else {
                try {
                    long b = C14793ay.m42901g().mo38685b() + (Long.parseLong(str4) - C14793ay.m42901g().mo38684a());
                    if (TextUtils.isEmpty(str3)) {
                        str3 = "native:view_load";
                    }
                    ami.mo39471j().mo41453a(str2, str3, b);
                } catch (NumberFormatException e) {
                    acd.m45780c("Malformed timestamp for CSI tick.", e);
                }
            }
        } else if ("experiment".equals(str)) {
            String str5 = (String) map.get("value");
            if (TextUtils.isEmpty(str5)) {
                acd.m45783e("No value given for CSI experiment.");
                return;
            }
            C15600ck ckVar = ami.mo39471j().f44224a;
            if (ckVar == null) {
                acd.m45783e("No ticker for WebView, dropping experiment ID.");
            } else {
                ckVar.mo41458a("e", str5);
            }
        } else {
            if ("extra".equals(str)) {
                String str6 = (String) map.get("name");
                String str7 = (String) map.get("value");
                if (TextUtils.isEmpty(str7)) {
                    acd.m45783e("No value given for CSI extra.");
                } else if (TextUtils.isEmpty(str6)) {
                    acd.m45783e("No name given for CSI extra.");
                } else {
                    C15600ck ckVar2 = ami.mo39471j().f44224a;
                    if (ckVar2 == null) {
                        acd.m45783e("No ticker for WebView, dropping extra parameter.");
                        return;
                    }
                    ckVar2.mo41458a(str6, str7);
                }
            }
        }
    }
}

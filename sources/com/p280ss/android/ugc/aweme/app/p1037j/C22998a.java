package com.p280ss.android.ugc.aweme.app.p1037j;

import android.net.Uri;
import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p280ss.android.ugc.aweme.net.C34090k;
import com.p280ss.android.ugc.aweme.qrcode.p1498d.C37072b;
import com.p280ss.android.ugc.aweme.web.C43442e;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.app.j.a */
public final class C22998a {

    /* renamed from: a */
    public static final C22998a f60777a = new C22998a();

    private C22998a() {
    }

    /* renamed from: a */
    public static String m75641a(String str, String str2) {
        C7573i.m23587b(str, "url");
        String str3 = "qr_code";
        IESSettingsProxy a = C30199h.m98861a();
        C7573i.m23582a((Object) a, "SettingsReader.get()");
        String ugSecLinkUrl = a.getUgSecLinkUrl();
        boolean z = true;
        if (!C7573i.m23585a((Object) "direct_link", (Object) ugSecLinkUrl)) {
            Uri parse = Uri.parse(str);
            C7573i.m23582a((Object) parse, "uri");
            String host = parse.getHost();
            ArrayList arrayList = new ArrayList();
            if (!TextUtils.isEmpty(ugSecLinkUrl)) {
                Uri parse2 = Uri.parse(ugSecLinkUrl);
                C7573i.m23582a((Object) parse2, "tempUri");
                if (!TextUtils.isEmpty(parse2.getHost())) {
                    arrayList.add(parse2.getHost());
                }
            }
            arrayList.addAll(C43442e.f112516a);
            arrayList.addAll(C30199h.m98861a().getShareH5UrlWhitelist());
            Iterator it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (C34090k.m109754a(host, (String) it.next())) {
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
            if (!z) {
                if (TextUtils.equals(str2, str3)) {
                    String a2 = C37072b.m119199a(str, ugSecLinkUrl, "qrcode");
                    C7573i.m23582a((Object) a2, "SecurityLinkHelper.build…elper.ISceneType.QR_CODE)");
                    return a2;
                }
                String a3 = C37072b.m119198a(str, ugSecLinkUrl);
                C7573i.m23582a((Object) a3, "SecurityLinkHelper.buildSecurityUrl(url, seclink)");
                return a3;
            }
        }
        return str;
    }
}

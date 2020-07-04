package com.p280ss.android.downloadlib.addownload.p866d;

import android.text.TextUtils;
import android.util.Base64;
import com.p280ss.android.downloadlib.C19507c;
import com.p280ss.android.downloadlib.addownload.C19491j;
import com.p280ss.android.downloadlib.p868c.C19523h;
import com.p280ss.android.socialbase.downloader.model.DownloadInfo;
import com.p280ss.android.socialbase.downloader.model.HttpHeader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.ss.android.downloadlib.addownload.d.a */
public final class C19473a {
    /* renamed from: a */
    private static String m64070a(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("|");
        sb.append(str2);
        try {
            return Base64.encodeToString(C19523h.m64326a(sb.toString().getBytes(), "596f823f283d4af73ead3ea6".getBytes(), "HmacSHA1"), 2);
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: a */
    public static void m64071a(DownloadInfo downloadInfo, long j, String str, String str2) {
        if (downloadInfo != null && C19491j.m64224e() != null) {
            try {
                final HashMap hashMap = new HashMap();
                String str3 = C19491j.m64229j().f52435b;
                hashMap.put("from", str3);
                String valueOf = String.valueOf(System.currentTimeMillis());
                hashMap.put("timestamp", valueOf);
                hashMap.put("signature", m64070a(str3, valueOf));
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("ad_id", j);
                jSONObject.put("log_extra", str);
                jSONObject.put("download_url", downloadInfo.getUrl());
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("app_name", downloadInfo.getTitle());
                jSONObject2.put("package_name", str2);
                jSONObject2.put("package_size", downloadInfo.getTotalBytes());
                List extraHeaders = downloadInfo.getExtraHeaders();
                if (extraHeaders != null && !extraHeaders.isEmpty()) {
                    Iterator it = extraHeaders.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        HttpHeader httpHeader = (HttpHeader) it.next();
                        if (TextUtils.equals(httpHeader.f54980a, "User-Agent")) {
                            jSONObject2.put("User-Agent", httpHeader.f54981b);
                            break;
                        }
                    }
                }
                jSONObject.put("request_info", jSONObject2.toString());
                hashMap.put("info", jSONObject.toString());
                C19507c.m64274a().mo51638a(new Runnable() {
                    public final void run() {
                        C19491j.m64224e().mo51359a("POST", "https://i.snssdk.com/inspect/aegis/client/app/resend/", hashMap, null);
                    }
                });
            } catch (Exception unused) {
            }
        }
    }
}

package com.p280ss.android.ugc.aweme.app;

import android.net.Uri;
import com.bytedance.common.utility.C6319n;
import com.p280ss.android.newmedia.C19943j;
import com.p280ss.android.ugc.aweme.app.C22689a.C22704b;
import com.p280ss.android.ugc.aweme.feed.p1229e.C28300a;
import com.p280ss.android.ugc.aweme.p1003am.C22494d;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.app.f */
public final class C22974f {
    /* renamed from: a */
    private void m75575a(Uri uri) {
        C22494d.m74385a().mo59062a(m75576b(uri));
        C22494d.m74385a().f59940a = true;
    }

    /* renamed from: c */
    private String m75578c(Uri uri) {
        if (uri == null) {
            return "";
        }
        String path = uri.getPath();
        if (!m75579d(uri) || C6319n.m19593a(path) || !path.startsWith("/detail/")) {
            return "";
        }
        return uri.getLastPathSegment();
    }

    /* renamed from: d */
    private static boolean m75579d(Uri uri) {
        String str;
        boolean z = false;
        if (uri == null) {
            return false;
        }
        if (!"aweme".equals(uri.getHost())) {
            return false;
        }
        try {
            str = uri.getQueryParameter("gd_label");
        } catch (Throwable unused) {
            str = "";
        }
        if ("click_push_recommend".equals(str) || "click_push_newvideo".equals(str) || "click_push_videoat".equals(str)) {
            z = true;
        }
        return z;
    }

    /* renamed from: b */
    private List<String> m75576b(Uri uri) {
        String str;
        ArrayList arrayList = new ArrayList();
        if (uri == null) {
            return arrayList;
        }
        String path = uri.getPath();
        if (m75579d(uri)) {
            if (!C6319n.m19593a(path) && path.startsWith("/detail/")) {
                arrayList.add(uri.getLastPathSegment());
            } else if (!C6319n.m19593a(path) && path.startsWith("/detail_list")) {
                String str2 = "";
                try {
                    str2 = uri.getQueryParameter(C22704b.f60416e);
                } catch (Throwable unused) {
                }
                int i = 0;
                if (!C6319n.m19593a(str2)) {
                    String[] split = str2.split(",");
                    int length = split.length;
                    while (i < length) {
                        arrayList.add(split[i]);
                        i++;
                    }
                } else {
                    try {
                        str = uri.getQueryParameter("push_params");
                    } catch (Throwable unused2) {
                        str = "";
                    }
                    if (!C6319n.m19593a(str)) {
                        try {
                            String optString = new JSONObject(str).optString(C22704b.f60416e);
                            if (!C6319n.m19593a(optString)) {
                                String[] split2 = optString.split(",");
                                int length2 = split2.length;
                                while (i < length2) {
                                    arrayList.add(split2[i]);
                                    i++;
                                }
                            }
                        } catch (Exception | JSONException unused3) {
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo59950a(Uri uri, boolean z) {
        if (m75579d(uri)) {
            m75575a(uri);
            m75577b(uri, z);
        }
    }

    /* renamed from: b */
    private void m75577b(Uri uri, boolean z) {
        try {
            if (C19943j.m65779a()) {
                if (z) {
                    C28300a.m93094a().mo71993a(m75578c(uri));
                }
            }
        } catch (Throwable unused) {
        }
    }
}

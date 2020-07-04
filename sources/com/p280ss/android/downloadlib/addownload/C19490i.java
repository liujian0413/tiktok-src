package com.p280ss.android.downloadlib.addownload;

import android.content.Context;
import android.text.TextUtils;
import com.p280ss.android.download.api.model.C19398d;
import com.p280ss.android.download.api.model.C19398d.C19399a;
import com.p280ss.android.download.api.p857a.C19379h;
import com.p280ss.android.download.api.p858b.C19386b;
import com.p280ss.android.download.api.p858b.C19387c;
import com.p280ss.android.downloadlib.p868c.C19523h;
import com.p280ss.android.p848c.p849a.p850a.C19232c;
import com.p280ss.android.socialbase.appdownloader.AppDownloader;
import com.p280ss.android.socialbase.appdownloader.AppTaskBuilder;
import com.p280ss.android.socialbase.downloader.model.DownloadInfo;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.ss.android.downloadlib.addownload.i */
public final class C19490i {
    /* renamed from: a */
    static boolean m64200a(int i) {
        return i == 0 || i == 1;
    }

    /* renamed from: b */
    static boolean m64203b(int i) {
        return i == 2 || i == 1;
    }

    /* renamed from: c */
    static boolean m64205c(int i) {
        return i == 2;
    }

    /* renamed from: a */
    static boolean m64201a(C19387c cVar) {
        return cVar.mo51008q() && (cVar instanceof C19232c) && cVar.mo51014w() == 1;
    }

    /* renamed from: a */
    static void m64197a(String str, String str2, JSONObject jSONObject, Object obj, boolean z, C19387c cVar) {
        if (C19491j.m64220b() != null) {
            C19398d a = new C19399a().mo51411b(str).mo51413c(str2).mo51412b(cVar.mo51008q()).mo51403a(cVar.mo50995d()).mo51414d(cVar.mo51009r()).mo51410b(cVar.mo50996e()).mo51407a(jSONObject).mo51402a(1).mo51404a(obj).mo51408a(z).mo51409a();
            if (z) {
                C19491j.m64220b().mo51357a(a);
            } else {
                C19491j.m64220b().onEvent(a);
            }
        }
    }

    /* renamed from: a */
    public static void m64198a(String str, String str2, boolean z, long j, String str3, long j2, int i, boolean z2) {
        if (C19491j.m64220b() != null) {
            C19398d a = new C19399a().mo51411b(str).mo51413c(str2).mo51412b(z).mo51403a(j).mo51414d(str3).mo51410b(j2).mo51402a(i).mo51408a(z2).mo51409a();
            if (z2) {
                C19491j.m64220b().mo51357a(a);
            } else {
                C19491j.m64220b().onEvent(a);
            }
        }
    }

    /* renamed from: a */
    public static void m64199a(String str, String str2, boolean z, long j, String str3, long j2, JSONObject jSONObject, int i, boolean z2) {
        if (C19491j.m64220b() != null) {
            C19398d a = new C19399a().mo51411b(str).mo51413c(str2).mo51412b(z).mo51403a(j).mo51414d(str3).mo51410b(j2).mo51407a(jSONObject).mo51402a(i).mo51408a(z2).mo51409a();
            if (z2) {
                C19491j.m64220b().mo51357a(a);
            } else {
                C19491j.m64220b().onEvent(a);
            }
        }
    }

    /* renamed from: a */
    public static long m64191a(DownloadInfo downloadInfo) {
        if (downloadInfo == null) {
            return 0;
        }
        try {
            String extra = downloadInfo.getExtra();
            if (!TextUtils.isEmpty(extra)) {
                return C19523h.m64304a(new JSONObject(extra), "extra");
            }
        } catch (Exception unused) {
        }
        return 0;
    }

    /* renamed from: b */
    public static String m64202b(DownloadInfo downloadInfo) {
        if (downloadInfo == null) {
            return null;
        }
        try {
            String extra = downloadInfo.getExtra();
            if (!TextUtils.isEmpty(extra)) {
                return new JSONObject(extra).optString("notification_jump_url", null);
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* renamed from: b */
    static boolean m64204b(C19387c cVar) {
        if (cVar == null || cVar.mo51014w() != 2) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static void m64192a(Context context, JSONObject jSONObject) {
        if (context != null && jSONObject != null) {
            try {
                String optString = jSONObject.optString("label");
                JSONObject optJSONObject = jSONObject.optJSONObject("ext_json");
                if (!TextUtils.isEmpty(optString)) {
                    m64196a("wap_stat", "app_download", optString, optJSONObject, false);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    static void m64193a(C19387c cVar, C19386b bVar) {
        String str;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("url", cVar.mo50992a()).putOpt("ad_id", Long.valueOf(cVar.mo50995d())).putOpt("ext_value", Long.valueOf(cVar.mo50996e()));
            JSONObject v = cVar.mo51013v();
            if (v != null) {
                Iterator keys = v.keys();
                while (keys.hasNext()) {
                    String str2 = (String) keys.next();
                    jSONObject.put(str2, v.get(str2));
                }
            }
            if (bVar == null || bVar.mo50968v() != 0) {
                str = "browser";
            } else {
                str = bVar.mo50948b();
            }
            m64196a("wap_stat", "app_download", str, jSONObject, false);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static int m64190a(boolean z, boolean z2, JSONObject jSONObject, AppTaskBuilder appTaskBuilder) {
        String str;
        if (appTaskBuilder == null || TextUtils.isEmpty(appTaskBuilder.url) || appTaskBuilder.context == null) {
            return 0;
        }
        m64192a(appTaskBuilder.context, jSONObject);
        int addDownloadTask = AppDownloader.getInstance().addDownloadTask(appTaskBuilder);
        if (z) {
            C19379h d = C19491j.m64223d();
            Context context = appTaskBuilder.context;
            if (z2) {
                str = "已开始下载，可在\"我的\"里查看管理";
            } else {
                str = "已开始下载";
            }
            d.mo51365a(context, str, null, 0);
        }
        return addDownloadTask;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00a2  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m64194a(java.lang.String r2, long r3, com.p280ss.android.download.api.p858b.C19387c r5, com.p280ss.android.download.api.p858b.C19386b r6) {
        /*
            org.json.JSONObject r0 = r5.mo51013v()     // Catch:{ JSONException -> 0x002e }
            if (r0 != 0) goto L_0x0017
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x002e }
            r0.<init>()     // Catch:{ JSONException -> 0x002e }
            java.lang.String r1 = "click_type"
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ JSONException -> 0x0015 }
            r0.putOpt(r1, r3)     // Catch:{ JSONException -> 0x0015 }
            goto L_0x002f
        L_0x0015:
            goto L_0x002f
        L_0x0017:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x002e }
            org.json.JSONObject r1 = r5.mo51013v()     // Catch:{ JSONException -> 0x002e }
            java.lang.String r1 = r1.toString()     // Catch:{ JSONException -> 0x002e }
            r0.<init>(r1)     // Catch:{ JSONException -> 0x002e }
            java.lang.String r1 = "click_type"
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ JSONException -> 0x0015 }
            r0.putOpt(r1, r3)     // Catch:{ JSONException -> 0x0015 }
            goto L_0x002f
        L_0x002e:
            r0 = 0
        L_0x002f:
            java.lang.String r3 = r6.mo50950d()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x003e
            java.lang.String r3 = r6.mo50950d()
            goto L_0x0042
        L_0x003e:
            java.lang.String r3 = r6.mo50948b()
        L_0x0042:
            com.ss.android.download.api.model.d$a r4 = new com.ss.android.download.api.model.d$a
            r4.<init>()
            com.ss.android.download.api.model.d$a r3 = r4.mo51411b(r3)
            com.ss.android.download.api.model.d$a r2 = r3.mo51413c(r2)
            boolean r3 = r5.mo51008q()
            com.ss.android.download.api.model.d$a r2 = r2.mo51412b(r3)
            long r3 = r5.mo50995d()
            com.ss.android.download.api.model.d$a r2 = r2.mo51403a(r3)
            java.lang.String r3 = r5.mo51009r()
            com.ss.android.download.api.model.d$a r2 = r2.mo51414d(r3)
            long r3 = r5.mo50996e()
            com.ss.android.download.api.model.d$a r2 = r2.mo51410b(r3)
            com.ss.android.download.api.model.d$a r2 = r2.mo51407a(r0)
            java.lang.Object r3 = r6.mo50967u()
            com.ss.android.download.api.model.d$a r2 = r2.mo51404a(r3)
            java.util.List r3 = r5.mo51012u()
            com.ss.android.download.api.model.d$a r2 = r2.mo51406a(r3)
            r3 = 1
            com.ss.android.download.api.model.d$a r2 = r2.mo51402a(r3)
            boolean r3 = r6.mo50972z()
            com.ss.android.download.api.model.d$a r2 = r2.mo51408a(r3)
            com.ss.android.download.api.model.d r2 = r2.mo51409a()
            boolean r3 = r6.mo50972z()
            if (r3 == 0) goto L_0x00a2
            com.ss.android.download.api.a.d r3 = com.p280ss.android.downloadlib.addownload.C19491j.m64220b()
            r3.mo51357a(r2)
            return
        L_0x00a2:
            com.ss.android.download.api.a.d r3 = com.p280ss.android.downloadlib.addownload.C19491j.m64220b()
            r3.onEvent(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.downloadlib.addownload.C19490i.m64194a(java.lang.String, long, com.ss.android.download.api.b.c, com.ss.android.download.api.b.b):void");
    }

    /* renamed from: a */
    static void m64195a(String str, String str2, Object obj, boolean z, C19387c cVar) {
        if (C19491j.m64220b() != null) {
            C19398d a = new C19399a().mo51411b(str).mo51413c(str2).mo51412b(cVar.mo51008q()).mo51403a(cVar.mo50995d()).mo51414d(cVar.mo51009r()).mo51410b(cVar.mo50996e()).mo51407a(cVar.mo51013v()).mo51402a(1).mo51404a(obj).mo51408a(z).mo51409a();
            if (z) {
                C19491j.m64220b().mo51357a(a);
            } else {
                C19491j.m64220b().onEvent(a);
            }
        }
    }

    /* renamed from: a */
    private static void m64196a(String str, String str2, String str3, JSONObject jSONObject, boolean z) {
        if (C19491j.m64220b() != null) {
            C19491j.m64220b().onEvent(new C19399a().mo51405a(str).mo51411b(str2).mo51413c(str3).mo51410b(0).mo51407a(jSONObject).mo51408a(false).mo51409a());
        }
    }
}

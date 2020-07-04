package com.p280ss.android.downloadlib.addownload;

import android.content.Context;
import android.text.TextUtils;
import com.p280ss.android.download.api.model.C19393b;
import com.p280ss.android.downloadlib.addownload.exception.OpenAppException;
import com.p280ss.android.downloadlib.addownload.p863a.C19457a;
import com.p280ss.android.downloadlib.addownload.p864b.C19461a;
import com.p280ss.android.downloadlib.p868c.C19518d;
import com.p280ss.android.downloadlib.p868c.C19523h;
import com.p280ss.android.p848c.p849a.p850a.C19232c.C19234a;
import com.p280ss.android.p848c.p849a.p851b.C19236a;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.android.downloadlib.addownload.a */
public class C19456a {

    /* renamed from: a */
    private static C19456a f52670a;

    /* renamed from: b */
    private Map<String, C19393b> f52671b = new HashMap();

    /* renamed from: c */
    private Map<String, C19461a> f52672c;

    /* renamed from: a */
    public final void mo51514a(String str, C19393b bVar) {
        if (!TextUtils.isEmpty(bVar.f52447d)) {
            this.f52671b.put(str, bVar);
        } else {
            this.f52671b.remove(str);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0051, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo51513a(java.lang.String r7, long r8) {
        /*
            r6 = this;
            java.util.Map<java.lang.String, com.ss.android.download.api.model.b> r0 = r6.f52671b     // Catch:{ Exception -> 0x0053 }
            if (r0 == 0) goto L_0x0052
            java.util.Map<java.lang.String, com.ss.android.download.api.model.b> r0 = r6.f52671b     // Catch:{ Exception -> 0x0053 }
            int r0 = r0.size()     // Catch:{ Exception -> 0x0053 }
            if (r0 <= 0) goto L_0x0052
            boolean r0 = r6.m64001b(r7)     // Catch:{ Exception -> 0x0053 }
            if (r0 == 0) goto L_0x0013
            goto L_0x0052
        L_0x0013:
            java.util.Map<java.lang.String, com.ss.android.download.api.model.b> r0 = r6.f52671b     // Catch:{ Exception -> 0x0053 }
            java.util.Set r0 = r0.entrySet()     // Catch:{ Exception -> 0x0053 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x0053 }
        L_0x001d:
            boolean r1 = r0.hasNext()     // Catch:{ Exception -> 0x0053 }
            if (r1 == 0) goto L_0x0051
            java.lang.Object r1 = r0.next()     // Catch:{ Exception -> 0x0053 }
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch:{ Exception -> 0x0053 }
            java.lang.Object r2 = r1.getKey()     // Catch:{ Exception -> 0x0053 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x0053 }
            java.lang.Object r1 = r1.getValue()     // Catch:{ Exception -> 0x0053 }
            com.ss.android.download.api.model.b r1 = (com.p280ss.android.download.api.model.C19393b) r1     // Catch:{ Exception -> 0x0053 }
            if (r1 == 0) goto L_0x001d
            long r3 = r1.f52444a     // Catch:{ Exception -> 0x0053 }
            int r5 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x001d
            boolean r8 = android.text.TextUtils.equals(r7, r2)     // Catch:{ Exception -> 0x0053 }
            if (r8 != 0) goto L_0x0051
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch:{ Exception -> 0x0053 }
            r8.<init>()     // Catch:{ Exception -> 0x0053 }
            r8.put(r7, r2)     // Catch:{ Exception -> 0x0053 }
            java.lang.String r7 = "deeplink_open_fail_for_packagename_no_match"
            m63998a(r1, r7, r8)     // Catch:{ Exception -> 0x0053 }
            goto L_0x0053
        L_0x0051:
            return
        L_0x0052:
            return
        L_0x0053:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.downloadlib.addownload.C19456a.mo51513a(java.lang.String, long):void");
    }

    private C19456a() {
    }

    /* renamed from: a */
    public static C19456a m63995a() {
        if (f52670a == null) {
            synchronized (C19456a.class) {
                if (f52670a == null) {
                    f52670a = new C19456a();
                }
            }
        }
        return f52670a;
    }

    /* renamed from: a */
    private void m63996a(C19393b bVar) {
        m63997a(bVar, "deeplink_url_app");
    }

    /* renamed from: b */
    private void m64000b(C19393b bVar) {
        m63997a(bVar, "deeplink_open_success");
    }

    /* renamed from: c */
    private void m64003c(C19393b bVar) {
        m63997a(bVar, "deeplink_open_fail");
    }

    /* renamed from: b */
    private boolean m64001b(String str) {
        return this.f52671b.containsKey(str);
    }

    /* renamed from: c */
    private C19393b m64002c(String str) {
        C19393b bVar = (C19393b) this.f52671b.get(str);
        if (bVar != null) {
            this.f52671b.remove(str);
        }
        return bVar;
    }

    /* renamed from: a */
    private static void m63999a(C19461a aVar) {
        if (aVar.f52689b > 0) {
            JSONObject a = C19236a.m63066a(C19518d.m64286a(aVar.f52689b));
            try {
                a.putOpt("scene", Integer.valueOf(4));
            } catch (Exception unused) {
            }
            C19490i.m64199a(C19491j.m64232m(), "install_finish", true, aVar.f52689b, aVar.f52693f, aVar.f52690c, a, 2, false);
        }
    }

    /* renamed from: a */
    public final void mo51512a(String str) {
        if (this.f52672c != null && !TextUtils.isEmpty(str) && this.f52672c.containsKey(str)) {
            C19461a aVar = (C19461a) this.f52672c.remove(str);
            aVar.mo51526a();
            C19457a.m64009a().mo51516a(aVar);
            C7285c.m22838a(C19491j.m64206a(), "sp_ad_download_event", 0).edit().remove(String.valueOf(aVar.f52689b)).apply();
            m63999a(aVar);
            this.f52672c.remove(str);
        }
    }

    /* renamed from: a */
    private static void m63997a(C19393b bVar, String str) {
        JSONObject jSONObject;
        if (bVar != null) {
            C19236a a = C19518d.m64286a(bVar.f52444a);
            if (a != null) {
                jSONObject = a.f52031j;
            } else {
                jSONObject = null;
            }
            C19490i.m64199a("embeded_ad", str, true, bVar.f52444a, bVar.f52449f, bVar.f52445b, jSONObject, 2, false);
        }
    }

    /* renamed from: a */
    public final void mo51511a(Context context, String str) {
        if (m64001b(str)) {
            C19393b c = m64002c(str);
            if (c != null) {
                try {
                    m63996a(c);
                    C19523h.m64327b(context, c.f52447d, str);
                } catch (OpenAppException e) {
                    switch (e.getFinalStatus()) {
                        case 1:
                        case 2:
                            m64000b(c);
                            C19491j.m64222c();
                            new C19234a().mo51019a(c.f52444a).mo51027b(c.f52445b).mo51020a(new C19393b(c.f52447d, c.f52446c, c.f52448e)).mo51021a(c.f52449f).mo51026a();
                            return;
                        default:
                            m64003c(c);
                            break;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private static void m63998a(C19393b bVar, String str, JSONObject jSONObject) {
        if (bVar != null) {
            C19490i.m64199a("embeded_ad", str, true, bVar.f52444a, bVar.f52449f, bVar.f52445b, jSONObject, 2, false);
        }
    }

    /* renamed from: a */
    public final void mo51510a(long j, long j2, String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str3)) {
            if (this.f52672c == null) {
                this.f52672c = new HashMap();
            }
            Map<String, C19461a> map = this.f52672c;
            C19461a aVar = new C19461a(0, j, j2, str3, str2, str, "");
            map.put(str3, aVar);
        }
    }
}

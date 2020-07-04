package com.p280ss.android.downloadlib.p868c;

import android.text.TextUtils;
import com.p280ss.android.downloadlib.addownload.p864b.C19462b;
import com.p280ss.android.downloadlib.addownload.p864b.C19462b.C19463a;
import com.p280ss.android.socialbase.downloader.model.DownloadInfo;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.downloadlib.c.c */
public final class C19517c {
    /* renamed from: a */
    public static C19462b m64284a(DownloadInfo downloadInfo) {
        String str;
        long j;
        boolean z;
        long j2;
        String extra = downloadInfo.getExtra();
        String str2 = "";
        long j3 = 0;
        try {
            if (!TextUtils.isEmpty(extra)) {
                JSONObject jSONObject = new JSONObject(extra);
                j2 = C19523h.m64304a(jSONObject, "extra");
                try {
                    str = jSONObject.optString("log_extra");
                } catch (Exception unused) {
                    str = str2;
                    z = false;
                    j = 0;
                    j3 = j2;
                    return new C19463a().mo51528a(j3).mo51529a(str).mo51530a(z).mo51532b(j).mo51531a();
                }
                try {
                    z = jSONObject.optBoolean("is_enable_backdialog");
                } catch (Exception unused2) {
                    z = false;
                    j = 0;
                    j3 = j2;
                    return new C19463a().mo51528a(j3).mo51529a(str).mo51530a(z).mo51532b(j).mo51531a();
                }
                try {
                    j = C19523h.m64304a(jSONObject, "ext_value");
                } catch (Exception unused3) {
                    j = 0;
                    j3 = j2;
                    return new C19463a().mo51528a(j3).mo51529a(str).mo51530a(z).mo51532b(j).mo51531a();
                }
                j3 = j2;
                return new C19463a().mo51528a(j3).mo51529a(str).mo51530a(z).mo51532b(j).mo51531a();
            }
            str = str2;
            j = 0;
            z = false;
            return new C19463a().mo51528a(j3).mo51529a(str).mo51530a(z).mo51532b(j).mo51531a();
        } catch (Exception unused4) {
            str = str2;
            j2 = 0;
            z = false;
            j = 0;
            j3 = j2;
            return new C19463a().mo51528a(j3).mo51529a(str).mo51530a(z).mo51532b(j).mo51531a();
        }
    }

    /* renamed from: a */
    public static String m64285a(String str, long j, int i, String str2, boolean z, JSONObject jSONObject, String str3, JSONObject jSONObject2) {
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject3.put("extra", str);
            jSONObject3.put("ext_value", j);
            jSONObject3.put("position", 0);
            jSONObject3.put("log_extra", str2);
            jSONObject3.put("is_enable_backdialog", z);
            if (jSONObject != null) {
                jSONObject3.put("extra_json", jSONObject.toString());
            }
            if (!TextUtils.isEmpty(str3)) {
                jSONObject3.put("notification_jump_url", str3);
            }
            if (jSONObject2 != null) {
                jSONObject3.put("download_settings_json", jSONObject2.toString());
            }
        } catch (JSONException unused) {
        }
        return jSONObject3.toString();
    }
}

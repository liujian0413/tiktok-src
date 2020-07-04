package com.p280ss.android.ugc.aweme.shortvideo.reaction.p1589a;

import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import com.p280ss.android.ugc.aweme.app.C6877n;
import com.p280ss.android.ugc.aweme.app.p305g.C22983b;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.iesdownload.C44850c;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.reaction.a.c */
public class C40270c extends C40269b {

    /* renamed from: a */
    private String f104621a;

    /* renamed from: b */
    private String f104622b;

    /* renamed from: c */
    private long f104623c;

    /* renamed from: a */
    public final void mo59407a(int i) {
        this.f104623c = System.currentTimeMillis();
    }

    /* renamed from: a */
    public void mo59411a(C44850c cVar) {
        if (C40271d.m128667a(AwemeApplication.m21341a())) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("url", this.f104621a);
                jSONObject.put("from", this.f104622b);
                jSONObject.put("tools_use_downloader", false);
            } catch (JSONException unused) {
            }
            C6877n.m21444a("aweme_download_error_rate", 1, jSONObject);
        }
        C22983b.m75609a("aweme_movie_download_log", "", cVar.f115335b, cVar.f115334a, this.f104621a, this.f104622b);
    }

    /* renamed from: a */
    public void mo59412a(String str) {
        if (C40271d.m128667a(AwemeApplication.m21341a())) {
            C6877n.m21444a("aweme_download_error_rate", 0, new C6869c().mo16886a("duration", Long.valueOf(System.currentTimeMillis() - this.f104623c)).mo16887a("from", this.f104622b).mo16882a("tools_use_downloader", Boolean.valueOf(false)).mo16888b());
        }
    }

    public C40270c(String str, String str2) {
        this.f104621a = str;
        this.f104622b = str2;
    }
}

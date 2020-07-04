package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import org.json.JSONException;
import org.json.JSONObject;

@C6505uv
/* renamed from: com.google.android.gms.internal.ads.te */
public final class C16054te implements C16064to<C15618db> {
    /* renamed from: a */
    public final /* synthetic */ C15636ds mo41978a(C16055tf tfVar, JSONObject jSONObject) throws JSONException, InterruptedException, ExecutionException {
        agj agj;
        JSONObject a = aek.m45692a(jSONObject, "html_containers", "instream");
        if (a == null) {
            agj = tfVar.mo41982a(jSONObject, "video");
        } else {
            agj = tfVar.mo41980a(a.optString("base_url"), a.optString("html"), true);
        }
        ami a2 = C16055tf.m52163a(agj);
        if (a2 != null) {
            return new C15618db(a2);
        }
        acd.m45783e("Can not get video view for instream ad.");
        return null;
    }
}

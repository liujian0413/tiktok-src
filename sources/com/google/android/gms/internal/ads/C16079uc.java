package com.google.android.gms.internal.ads;

import android.support.p022v4.util.C0904k;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@C6505uv
/* renamed from: com.google.android.gms.internal.ads.uc */
public final class C16079uc implements C16064to<C15625di> {

    /* renamed from: a */
    private final boolean f45094a;

    public C16079uc(boolean z) {
        this.f45094a = z;
    }

    /* renamed from: a */
    public final /* synthetic */ C15636ds mo41978a(C16055tf tfVar, JSONObject jSONObject) throws JSONException, InterruptedException, ExecutionException {
        C0904k kVar = new C0904k();
        C0904k kVar2 = new C0904k();
        agj a = tfVar.mo41981a(jSONObject);
        agj a2 = tfVar.mo41982a(jSONObject, "video");
        JSONArray jSONArray = jSONObject.getJSONArray("custom_assets");
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            String string = jSONObject2.getString("type");
            if ("string".equals(string)) {
                kVar2.put(jSONObject2.getString("name"), jSONObject2.getString("string_value"));
            } else if ("image".equals(string)) {
                kVar.put(jSONObject2.getString("name"), tfVar.mo41985a(jSONObject2, "image_value", this.f45094a));
            } else {
                String str = "Unknown custom asset type: ";
                String valueOf = String.valueOf(string);
                acd.m45783e(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            }
        }
        ami a3 = C16055tf.m52163a(a2);
        String string2 = jSONObject.getString("custom_template_id");
        C0904k kVar3 = new C0904k();
        for (int i2 = 0; i2 < kVar.size(); i2++) {
            kVar3.put(kVar.mo3417b(i2), ((Future) kVar.mo3418c(i2)).get());
        }
        C15625di diVar = new C15625di(string2, kVar3, kVar2, (C15612cw) a.get(), a3 != null ? a3.mo39464b() : null, a3 != null ? a3.getView() : null);
        return diVar;
    }
}

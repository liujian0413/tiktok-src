package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import org.json.JSONException;
import org.json.JSONObject;

@C6505uv
/* renamed from: com.google.android.gms.internal.ads.nj */
public final class C15897nj {

    /* renamed from: a */
    public static final C15896ni<JSONObject> f44689a = new C15899nl();

    /* renamed from: b */
    private static final Charset f44690b = Charset.forName("UTF-8");

    /* renamed from: c */
    private static final C15894ng<InputStream> f44691c = C15898nk.f44692a;

    /* renamed from: a */
    static final /* synthetic */ InputStream m51379a(JSONObject jSONObject) throws JSONException {
        return new ByteArrayInputStream(jSONObject.toString().getBytes(f44690b));
    }
}

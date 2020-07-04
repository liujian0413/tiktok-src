package com.linecorp.linesdk.p801a.p802a.p803a;

import java.io.IOException;
import java.io.InputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.linecorp.linesdk.a.a.a.c */
public final class C18570c implements C18571d<JSONObject> {

    /* renamed from: a */
    private final C18572e f50199a = new C18572e();

    /* renamed from: b */
    public final JSONObject mo48729a(InputStream inputStream) {
        try {
            return new JSONObject(this.f50199a.mo48729a(inputStream));
        } catch (JSONException e) {
            throw new IOException(e);
        }
    }
}

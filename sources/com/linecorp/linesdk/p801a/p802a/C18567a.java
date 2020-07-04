package com.linecorp.linesdk.p801a.p802a;

import com.linecorp.linesdk.p801a.p802a.p803a.C18570c;
import com.linecorp.linesdk.p801a.p802a.p803a.C18571d;
import java.io.IOException;
import java.io.InputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.linecorp.linesdk.a.a.a */
abstract class C18567a<T> implements C18571d<T> {

    /* renamed from: a */
    private final C18570c f50193a;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract T mo48730a(JSONObject jSONObject);

    C18567a() {
        this(new C18570c());
    }

    private C18567a(C18570c cVar) {
        this.f50193a = cVar;
    }

    /* renamed from: a */
    public final T mo48729a(InputStream inputStream) {
        try {
            return mo48730a(this.f50193a.mo48729a(inputStream));
        } catch (JSONException e) {
            throw new IOException(e);
        }
    }
}

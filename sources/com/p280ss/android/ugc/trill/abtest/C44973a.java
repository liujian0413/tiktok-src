package com.p280ss.android.ugc.trill.abtest;

import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.trill.abtest.a */
public abstract class C44973a<T> {
    /* renamed from: a */
    public abstract T mo107490a();

    /* renamed from: a */
    public abstract boolean mo107492a(T t);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final T mo107491a(JSONObject jSONObject, String str) {
        T opt = jSONObject.opt(str);
        if (opt == null) {
            return mo107490a();
        }
        return opt;
    }
}

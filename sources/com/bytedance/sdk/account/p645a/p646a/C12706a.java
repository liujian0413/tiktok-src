package com.bytedance.sdk.account.p645a.p646a;

import com.bytedance.sdk.account.p645a.p646a.C12707b;
import com.bytedance.sdk.account.p660d.C12794a;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.account.a.a.a */
public abstract class C12706a<T extends C12707b> extends C12794a {
    public boolean cancel;

    public abstract void onResponse(T t);

    public JSONObject onSendEvent(String str) {
        return null;
    }

    public void cancel() {
        this.cancel = true;
        cancelApi();
    }

    public final void dispatchOnResponse(T t) {
        if (!this.cancel) {
            onResponse(t);
        }
    }
}

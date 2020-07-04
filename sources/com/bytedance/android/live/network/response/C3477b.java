package com.bytedance.android.live.network.response;

import com.bytedance.android.live.base.model.Extra;
import com.google.gson.p276a.C6593c;

/* renamed from: com.bytedance.android.live.network.response.b */
public class C3477b<T, R extends Extra> {
    @C6593c(mo15949a = "data")
    public T data;
    public transient RequestError error;
    @C6593c(mo15949a = "extra")
    public R extra;
    @C6593c(mo15949a = "status_code")
    public int statusCode;
}

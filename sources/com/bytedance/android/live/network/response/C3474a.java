package com.bytedance.android.live.network.response;

import com.bytedance.android.live.base.model.Extra;
import com.google.gson.p276a.C6593c;
import java.util.List;

/* renamed from: com.bytedance.android.live.network.response.a */
public class C3474a<T, R extends Extra> {
    @C6593c(mo15949a = "status_code")

    /* renamed from: a */
    public int f10295a;
    @C6593c(mo15949a = "data")

    /* renamed from: b */
    public List<T> f10296b;
    @C6593c(mo15949a = "extra")

    /* renamed from: c */
    public R f10297c;

    /* renamed from: d */
    public transient RequestError f10298d;
}

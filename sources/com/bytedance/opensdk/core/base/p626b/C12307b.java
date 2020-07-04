package com.bytedance.opensdk.core.base.p626b;

import com.bytedance.opensdk.core.base.p626b.C12306a;
import com.google.gson.p276a.C6593c;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.bytedance.opensdk.core.base.b.b */
public abstract class C12307b<T extends C12306a> {
    @C6593c(mo15949a = "message")

    /* renamed from: b */
    public final String f32667b;
    @C6593c(mo15949a = "data")

    /* renamed from: c */
    public final T f32668c;

    /* renamed from: c */
    public final String mo30109c() {
        return this.f32668c.mo30107a();
    }

    /* renamed from: b */
    public final boolean mo30108b() {
        return C7573i.m23585a((Object) this.f32667b, (Object) "success");
    }

    public C12307b(String str, T t) {
        C7573i.m23587b(str, "message");
        C7573i.m23587b(t, "data");
        this.f32667b = str;
        this.f32668c = t;
    }
}

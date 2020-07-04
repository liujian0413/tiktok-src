package com.bytedance.android.livesdkapi.depend.model.follow;

import com.google.gson.p276a.C6593c;

public class FollowPair {

    /* renamed from: a */
    public long f25593a;

    /* renamed from: b */
    public long f25594b;

    /* renamed from: c */
    public String f25595c;

    /* renamed from: d */
    public String f25596d;
    @C6593c(mo15949a = "follow_status")

    /* renamed from: e */
    public int f25597e;

    /* renamed from: f */
    public Type f25598f = Type.Default;

    /* renamed from: g */
    public boolean f25599g;

    public enum Type {
        Default,
        FromWeb
    }

    /* renamed from: a */
    public final int mo22844a() {
        if (this.f25597e < 0 || this.f25597e > 2) {
            this.f25597e = 0;
        }
        return this.f25597e;
    }
}

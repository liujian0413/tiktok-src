package com.aweme.storage;

import com.google.gson.p276a.C6593c;
import java.util.Arrays;

/* renamed from: com.aweme.storage.a */
public class C1908a {
    @C6593c(mo15949a = "interval")

    /* renamed from: a */
    public int f6898a;
    @C6593c(mo15949a = "force")

    /* renamed from: b */
    public String[] f6899b;
    @C6593c(mo15949a = "file_limit")

    /* renamed from: c */
    public int f6900c;
    @C6593c(mo15949a = "dir_limit")

    /* renamed from: d */
    public int f6901d;
    @C6593c(mo15949a = "non_active_duration")

    /* renamed from: e */
    public int f6902e;
    @C6593c(mo15949a = "non_active_count")

    /* renamed from: f */
    public int f6903f;
    @C6593c(mo15949a = "non_active_times")

    /* renamed from: g */
    public int f6904g;
    @C6593c(mo15949a = "too_large_limit")

    /* renamed from: h */
    public int f6905h;
    @C6593c(mo15949a = "non_active_limit")

    /* renamed from: i */
    public int f6906i;

    public String toString() {
        StringBuilder sb = new StringBuilder("CacheStrategy{interval=");
        sb.append(this.f6898a);
        sb.append(", forceList=");
        sb.append(Arrays.toString(this.f6899b));
        sb.append(", fileLimit=");
        sb.append(this.f6900c);
        sb.append(", dirLimit=");
        sb.append(this.f6901d);
        sb.append(", nonActiveDuration=");
        sb.append(this.f6902e);
        sb.append(", nonActiveLimit=");
        sb.append(this.f6906i);
        sb.append('}');
        return sb.toString();
    }
}

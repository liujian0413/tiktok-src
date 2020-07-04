package com.bytedance.android.livesdk.gift.model;

import android.text.TextUtils;
import com.google.gson.p276a.C6593c;

/* renamed from: com.bytedance.android.livesdk.gift.model.f */
public final class C8151f {
    @C6593c(mo15949a = "group_count")

    /* renamed from: a */
    public int f22261a;
    @C6593c(mo15949a = "group_text")

    /* renamed from: b */
    public String f22262b;

    /* renamed from: c */
    public boolean f22263c;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8151f)) {
            return false;
        }
        C8151f fVar = (C8151f) obj;
        if (fVar.f22261a != this.f22261a || !TextUtils.equals(fVar.f22262b, this.f22262b)) {
            return false;
        }
        return true;
    }
}

package com.bytedance.android.live.base.model.user;

import com.bytedance.android.live.base.model.ImageModel;
import com.google.gson.p276a.C6593c;
import java.util.Objects;

/* renamed from: com.bytedance.android.live.base.model.user.d */
public class C2372d {
    @C6593c(mo15949a = "custom_verify")

    /* renamed from: a */
    public String f7809a;
    @C6593c(mo15949a = "enterprise_verify_reason")

    /* renamed from: b */
    public String f7810b;
    @C6593c(mo15949a = "authentication_badge")

    /* renamed from: c */
    public ImageModel f7811c;

    public int hashCode() {
        return Objects.hash(new Object[]{this.f7809a, this.f7810b, this.f7811c});
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2372d)) {
            return false;
        }
        C2372d dVar = (C2372d) obj;
        if (!Objects.equals(this.f7809a, dVar.f7809a) || !Objects.equals(this.f7810b, dVar.f7810b) || !Objects.equals(this.f7811c, dVar.f7811c)) {
            return false;
        }
        return true;
    }
}

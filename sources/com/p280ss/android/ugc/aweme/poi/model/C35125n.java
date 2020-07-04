package com.p280ss.android.ugc.aweme.poi.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;

/* renamed from: com.ss.android.ugc.aweme.poi.model.n */
public final class C35125n extends BaseResponse {
    @C6593c(mo15949a = "is_suc")

    /* renamed from: a */
    public final boolean f91882a;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C35125n) {
                if (this.f91882a == ((C35125n) obj).f91882a) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.f91882a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PoiUploadImageResponse(isSuc=");
        sb.append(this.f91882a);
        sb.append(")");
        return sb.toString();
    }
}

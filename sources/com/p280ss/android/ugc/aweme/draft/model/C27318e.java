package com.p280ss.android.ugc.aweme.draft.model;

import com.google.gson.p276a.C6593c;
import java.util.Arrays;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.draft.model.e */
public final class C27318e {
    @C6593c(mo15949a = "matrix")

    /* renamed from: a */
    public final String[] f72066a;
    @C6593c(mo15949a = "duration")

    /* renamed from: b */
    public final double[] f72067b;
    @C6593c(mo15949a = "seg_user_cher")

    /* renamed from: c */
    public final boolean[] f72068c;

    public final String toString() {
        StringBuilder sb = new StringBuilder("DraftCherEffectParam(matrix=");
        sb.append(Arrays.toString(this.f72066a));
        sb.append(", duration=");
        sb.append(Arrays.toString(this.f72067b));
        sb.append(", segUseCher=");
        sb.append(Arrays.toString(this.f72068c));
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((Arrays.hashCode(this.f72066a) * 31) + Arrays.hashCode(this.f72067b)) * 31) + Arrays.hashCode(this.f72068c);
    }

    public final boolean equals(Object obj) {
        Class cls;
        if (this == obj) {
            return true;
        }
        Class cls2 = getClass();
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!C7573i.m23585a((Object) cls2, (Object) cls)) {
            return false;
        }
        if (obj != null) {
            C27318e eVar = (C27318e) obj;
            if (Arrays.equals(this.f72066a, eVar.f72066a) && Arrays.equals(this.f72067b, eVar.f72067b) && Arrays.equals(this.f72068c, eVar.f72068c)) {
                return true;
            }
            return false;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.draft.model.DraftCherEffectParam");
    }

    public C27318e(String[] strArr, double[] dArr, boolean[] zArr) {
        C7573i.m23587b(strArr, "matrix");
        C7573i.m23587b(dArr, "duration");
        C7573i.m23587b(zArr, "segUseCher");
        this.f72066a = strArr;
        this.f72067b = dArr;
        this.f72068c = zArr;
    }
}

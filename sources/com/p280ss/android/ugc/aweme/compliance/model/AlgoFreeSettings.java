package com.p280ss.android.ugc.aweme.compliance.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.AlgoFreeInfo;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.compliance.model.AlgoFreeSettings */
public final class AlgoFreeSettings extends BaseResponse implements Serializable {
    @C6593c(mo15949a = "algo_free_enabled")
    private final Boolean algoFreeEnabled;
    @C6593c(mo15949a = "algo_free_info")
    private final AlgoFreeInfo algoFreeInfo;

    public static /* synthetic */ AlgoFreeSettings copy$default(AlgoFreeSettings algoFreeSettings, Boolean bool, AlgoFreeInfo algoFreeInfo2, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = algoFreeSettings.algoFreeEnabled;
        }
        if ((i & 2) != 0) {
            algoFreeInfo2 = algoFreeSettings.algoFreeInfo;
        }
        return algoFreeSettings.copy(bool, algoFreeInfo2);
    }

    public final Boolean component1() {
        return this.algoFreeEnabled;
    }

    public final AlgoFreeInfo component2() {
        return this.algoFreeInfo;
    }

    public final AlgoFreeSettings copy(Boolean bool, AlgoFreeInfo algoFreeInfo2) {
        return new AlgoFreeSettings(bool, algoFreeInfo2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.algoFreeInfo, (java.lang.Object) r3.algoFreeInfo) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.p280ss.android.ugc.aweme.compliance.model.AlgoFreeSettings
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.compliance.model.AlgoFreeSettings r3 = (com.p280ss.android.ugc.aweme.compliance.model.AlgoFreeSettings) r3
            java.lang.Boolean r0 = r2.algoFreeEnabled
            java.lang.Boolean r1 = r3.algoFreeEnabled
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.AlgoFreeInfo r0 = r2.algoFreeInfo
            com.ss.android.ugc.aweme.AlgoFreeInfo r3 = r3.algoFreeInfo
            boolean r3 = kotlin.jvm.internal.C7573i.m23585a(r0, r3)
            if (r3 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r3 = 0
            return r3
        L_0x001f:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.compliance.model.AlgoFreeSettings.equals(java.lang.Object):boolean");
    }

    public final Boolean getAlgoFreeEnabled() {
        return this.algoFreeEnabled;
    }

    public final AlgoFreeInfo getAlgoFreeInfo() {
        return this.algoFreeInfo;
    }

    public final int hashCode() {
        Boolean bool = this.algoFreeEnabled;
        int i = 0;
        int hashCode = (bool != null ? bool.hashCode() : 0) * 31;
        AlgoFreeInfo algoFreeInfo2 = this.algoFreeInfo;
        if (algoFreeInfo2 != null) {
            i = algoFreeInfo2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AlgoFreeSettings(algoFreeEnabled=");
        sb.append(this.algoFreeEnabled);
        sb.append(", algoFreeInfo=");
        sb.append(this.algoFreeInfo);
        sb.append(")");
        return sb.toString();
    }

    public AlgoFreeSettings(Boolean bool, AlgoFreeInfo algoFreeInfo2) {
        this.algoFreeEnabled = bool;
        this.algoFreeInfo = algoFreeInfo2;
    }
}

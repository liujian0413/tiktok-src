package com.p280ss.android.ugc.aweme.setting.model;

import com.google.gson.p276a.C6593c;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.setting.model.VerifyTypeSetting */
public final class VerifyTypeSetting {
    @C6593c(mo15949a = "action")
    public final Map<String, VerifyTypeAction> action;

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.Map, code=java.util.Map<java.lang.String, com.ss.android.ugc.aweme.setting.model.VerifyTypeAction>, for r1v0, types: [java.util.Map] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.p280ss.android.ugc.aweme.setting.model.VerifyTypeSetting copy$default(com.p280ss.android.ugc.aweme.setting.model.VerifyTypeSetting r0, java.util.Map<java.lang.String, com.p280ss.android.ugc.aweme.setting.model.VerifyTypeAction> r1, int r2, java.lang.Object r3) {
        /*
            r2 = r2 & 1
            if (r2 == 0) goto L_0x0006
            java.util.Map<java.lang.String, com.ss.android.ugc.aweme.setting.model.VerifyTypeAction> r1 = r0.action
        L_0x0006:
            com.ss.android.ugc.aweme.setting.model.VerifyTypeSetting r0 = r0.copy(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.setting.model.VerifyTypeSetting.copy$default(com.ss.android.ugc.aweme.setting.model.VerifyTypeSetting, java.util.Map, int, java.lang.Object):com.ss.android.ugc.aweme.setting.model.VerifyTypeSetting");
    }

    public final VerifyTypeSetting copy(Map<String, VerifyTypeAction> map) {
        return new VerifyTypeSetting(map);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r1.action, (java.lang.Object) ((com.p280ss.android.ugc.aweme.setting.model.VerifyTypeSetting) r2).action) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.p280ss.android.ugc.aweme.setting.model.VerifyTypeSetting
            if (r0 == 0) goto L_0x0013
            com.ss.android.ugc.aweme.setting.model.VerifyTypeSetting r2 = (com.p280ss.android.ugc.aweme.setting.model.VerifyTypeSetting) r2
            java.util.Map<java.lang.String, com.ss.android.ugc.aweme.setting.model.VerifyTypeAction> r0 = r1.action
            java.util.Map<java.lang.String, com.ss.android.ugc.aweme.setting.model.VerifyTypeAction> r2 = r2.action
            boolean r2 = kotlin.jvm.internal.C7573i.m23585a(r0, r2)
            if (r2 == 0) goto L_0x0013
            goto L_0x0015
        L_0x0013:
            r2 = 0
            return r2
        L_0x0015:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.setting.model.VerifyTypeSetting.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Map<String, VerifyTypeAction> map = this.action;
        if (map != null) {
            return map.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VerifyTypeSetting(action=");
        sb.append(this.action);
        sb.append(")");
        return sb.toString();
    }

    public VerifyTypeSetting(Map<String, VerifyTypeAction> map) {
        this.action = map;
    }
}

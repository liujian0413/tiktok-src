package com.p280ss.android.ugc.aweme.mvtheme;

import java.io.Serializable;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.mvtheme.AfrFileBean */
public final class AfrFileBean implements Serializable {
    private final List<Pair<String, String>> maskFiles;
    private final String photonPath;

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<kotlin.Pair<java.lang.String, java.lang.String>>, for r2v0, types: [java.util.List] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.p280ss.android.ugc.aweme.mvtheme.AfrFileBean copy$default(com.p280ss.android.ugc.aweme.mvtheme.AfrFileBean r0, java.lang.String r1, java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> r2, int r3, java.lang.Object r4) {
        /*
            r4 = r3 & 1
            if (r4 == 0) goto L_0x0006
            java.lang.String r1 = r0.photonPath
        L_0x0006:
            r3 = r3 & 2
            if (r3 == 0) goto L_0x000c
            java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> r2 = r0.maskFiles
        L_0x000c:
            com.ss.android.ugc.aweme.mvtheme.AfrFileBean r0 = r0.copy(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.mvtheme.AfrFileBean.copy$default(com.ss.android.ugc.aweme.mvtheme.AfrFileBean, java.lang.String, java.util.List, int, java.lang.Object):com.ss.android.ugc.aweme.mvtheme.AfrFileBean");
    }

    public final String component1() {
        return this.photonPath;
    }

    public final List<Pair<String, String>> component2() {
        return this.maskFiles;
    }

    public final AfrFileBean copy(String str, List<Pair<String, String>> list) {
        C7573i.m23587b(str, "photonPath");
        C7573i.m23587b(list, "maskFiles");
        return new AfrFileBean(str, list);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.maskFiles, (java.lang.Object) r3.maskFiles) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.p280ss.android.ugc.aweme.mvtheme.AfrFileBean
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.mvtheme.AfrFileBean r3 = (com.p280ss.android.ugc.aweme.mvtheme.AfrFileBean) r3
            java.lang.String r0 = r2.photonPath
            java.lang.String r1 = r3.photonPath
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x001d
            java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> r0 = r2.maskFiles
            java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> r3 = r3.maskFiles
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
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.mvtheme.AfrFileBean.equals(java.lang.Object):boolean");
    }

    public final List<Pair<String, String>> getMaskFiles() {
        return this.maskFiles;
    }

    public final String getPhotonPath() {
        return this.photonPath;
    }

    public final int hashCode() {
        String str = this.photonPath;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List<Pair<String, String>> list = this.maskFiles;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AfrFileBean(photonPath=");
        sb.append(this.photonPath);
        sb.append(", maskFiles=");
        sb.append(this.maskFiles);
        sb.append(")");
        return sb.toString();
    }

    public AfrFileBean(String str, List<Pair<String, String>> list) {
        C7573i.m23587b(str, "photonPath");
        C7573i.m23587b(list, "maskFiles");
        this.photonPath = str;
        this.maskFiles = list;
    }
}

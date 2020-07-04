package com.p280ss.android.ugc.aweme.beauty;

import com.google.gson.p276a.C6593c;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.beauty.ComposerBeautyBuriedInfo */
public final class ComposerBeautyBuriedInfo {
    public static final C23529a Companion = new C23529a(null);
    public static final int TAG_NO_USED = 0;
    public static final int TAG_USED = 1;
    @C6593c(mo15949a = "beautify_info")
    private final List<BeautifyInfo> beautifyInfo;
    @C6593c(mo15949a = "beautify_used")
    private final int beautifyUsed;
    @C6593c(mo15949a = "is_composer")
    private final int isComposer;

    /* renamed from: com.ss.android.ugc.aweme.beauty.ComposerBeautyBuriedInfo$a */
    public static final class C23529a {
        private C23529a() {
        }

        public /* synthetic */ C23529a(C7571f fVar) {
            this();
        }
    }

    public ComposerBeautyBuriedInfo() {
        this(0, 0, null, 7, null);
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<com.ss.android.ugc.aweme.beauty.BeautifyInfo>, for r3v0, types: [java.util.List] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.p280ss.android.ugc.aweme.beauty.ComposerBeautyBuriedInfo copy$default(com.p280ss.android.ugc.aweme.beauty.ComposerBeautyBuriedInfo r0, int r1, int r2, java.util.List<com.p280ss.android.ugc.aweme.beauty.BeautifyInfo> r3, int r4, java.lang.Object r5) {
        /*
            r5 = r4 & 1
            if (r5 == 0) goto L_0x0006
            int r1 = r0.beautifyUsed
        L_0x0006:
            r5 = r4 & 2
            if (r5 == 0) goto L_0x000c
            int r2 = r0.isComposer
        L_0x000c:
            r4 = r4 & 4
            if (r4 == 0) goto L_0x0012
            java.util.List<com.ss.android.ugc.aweme.beauty.BeautifyInfo> r3 = r0.beautifyInfo
        L_0x0012:
            com.ss.android.ugc.aweme.beauty.ComposerBeautyBuriedInfo r0 = r0.copy(r1, r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.beauty.ComposerBeautyBuriedInfo.copy$default(com.ss.android.ugc.aweme.beauty.ComposerBeautyBuriedInfo, int, int, java.util.List, int, java.lang.Object):com.ss.android.ugc.aweme.beauty.ComposerBeautyBuriedInfo");
    }

    public final int component1() {
        return this.beautifyUsed;
    }

    public final int component2() {
        return this.isComposer;
    }

    public final List<BeautifyInfo> component3() {
        return this.beautifyInfo;
    }

    public final ComposerBeautyBuriedInfo copy(int i, int i2, List<BeautifyInfo> list) {
        C7573i.m23587b(list, "beautifyInfo");
        return new ComposerBeautyBuriedInfo(i, i2, list);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ComposerBeautyBuriedInfo) {
                ComposerBeautyBuriedInfo composerBeautyBuriedInfo = (ComposerBeautyBuriedInfo) obj;
                if (this.beautifyUsed == composerBeautyBuriedInfo.beautifyUsed) {
                    if (!(this.isComposer == composerBeautyBuriedInfo.isComposer) || !C7573i.m23585a((Object) this.beautifyInfo, (Object) composerBeautyBuriedInfo.beautifyInfo)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final List<BeautifyInfo> getBeautifyInfo() {
        return this.beautifyInfo;
    }

    public final int getBeautifyUsed() {
        return this.beautifyUsed;
    }

    public final int hashCode() {
        int i = ((this.beautifyUsed * 31) + this.isComposer) * 31;
        List<BeautifyInfo> list = this.beautifyInfo;
        return i + (list != null ? list.hashCode() : 0);
    }

    public final int isComposer() {
        return this.isComposer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ComposerBeautyBuriedInfo(beautifyUsed=");
        sb.append(this.beautifyUsed);
        sb.append(", isComposer=");
        sb.append(this.isComposer);
        sb.append(", beautifyInfo=");
        sb.append(this.beautifyInfo);
        sb.append(")");
        return sb.toString();
    }

    public ComposerBeautyBuriedInfo(int i, int i2, List<BeautifyInfo> list) {
        C7573i.m23587b(list, "beautifyInfo");
        this.beautifyUsed = i;
        this.isComposer = i2;
        this.beautifyInfo = list;
    }

    public /* synthetic */ ComposerBeautyBuriedInfo(int i, int i2, List list, int i3, C7571f fVar) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            list = new ArrayList();
        }
        this(i, i2, list);
    }
}

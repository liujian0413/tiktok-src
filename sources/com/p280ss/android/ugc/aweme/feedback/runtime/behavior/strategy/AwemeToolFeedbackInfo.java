package com.p280ss.android.ugc.aweme.feedback.runtime.behavior.strategy;

import com.google.gson.p276a.C6593c;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.AwemeToolFeedbackInfo */
public final class AwemeToolFeedbackInfo {
    @C6593c(mo15949a = "cancel_count")
    private final int cancelCount;
    private final int count;
    @C6593c(mo15949a = "e_code")
    private final List<AwemeToolFeedbackECode> eCode;
    private final String name;
    @C6593c(mo15949a = "success_count")
    private final int successCount;

    public AwemeToolFeedbackInfo() {
        this(null, 0, 0, 0, null, 31, null);
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.AwemeToolFeedbackECode>, for r8v0, types: [java.util.List] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.p280ss.android.ugc.aweme.feedback.runtime.behavior.strategy.AwemeToolFeedbackInfo copy$default(com.p280ss.android.ugc.aweme.feedback.runtime.behavior.strategy.AwemeToolFeedbackInfo r3, java.lang.String r4, int r5, int r6, int r7, java.util.List<com.p280ss.android.ugc.aweme.feedback.runtime.behavior.strategy.AwemeToolFeedbackECode> r8, int r9, java.lang.Object r10) {
        /*
            r10 = r9 & 1
            if (r10 == 0) goto L_0x0006
            java.lang.String r4 = r3.name
        L_0x0006:
            r10 = r9 & 2
            if (r10 == 0) goto L_0x000c
            int r5 = r3.count
        L_0x000c:
            r10 = r5
            r5 = r9 & 4
            if (r5 == 0) goto L_0x0013
            int r6 = r3.successCount
        L_0x0013:
            r0 = r6
            r5 = r9 & 8
            if (r5 == 0) goto L_0x001a
            int r7 = r3.cancelCount
        L_0x001a:
            r1 = r7
            r5 = r9 & 16
            if (r5 == 0) goto L_0x0021
            java.util.List<com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.AwemeToolFeedbackECode> r8 = r3.eCode
        L_0x0021:
            r2 = r8
            r5 = r3
            r6 = r4
            r7 = r10
            r8 = r0
            r9 = r1
            r10 = r2
            com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.AwemeToolFeedbackInfo r3 = r5.copy(r6, r7, r8, r9, r10)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.feedback.runtime.behavior.strategy.AwemeToolFeedbackInfo.copy$default(com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.AwemeToolFeedbackInfo, java.lang.String, int, int, int, java.util.List, int, java.lang.Object):com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.AwemeToolFeedbackInfo");
    }

    public final String component1() {
        return this.name;
    }

    public final int component2() {
        return this.count;
    }

    public final int component3() {
        return this.successCount;
    }

    public final int component4() {
        return this.cancelCount;
    }

    public final List<AwemeToolFeedbackECode> component5() {
        return this.eCode;
    }

    public final AwemeToolFeedbackInfo copy(String str, int i, int i2, int i3, List<AwemeToolFeedbackECode> list) {
        C7573i.m23587b(str, "name");
        C7573i.m23587b(list, "eCode");
        AwemeToolFeedbackInfo awemeToolFeedbackInfo = new AwemeToolFeedbackInfo(str, i, i2, i3, list);
        return awemeToolFeedbackInfo;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AwemeToolFeedbackInfo) {
                AwemeToolFeedbackInfo awemeToolFeedbackInfo = (AwemeToolFeedbackInfo) obj;
                if (C7573i.m23585a((Object) this.name, (Object) awemeToolFeedbackInfo.name)) {
                    if (this.count == awemeToolFeedbackInfo.count) {
                        if (this.successCount == awemeToolFeedbackInfo.successCount) {
                            if (!(this.cancelCount == awemeToolFeedbackInfo.cancelCount) || !C7573i.m23585a((Object) this.eCode, (Object) awemeToolFeedbackInfo.eCode)) {
                                return false;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int getCancelCount() {
        return this.cancelCount;
    }

    public final int getCount() {
        return this.count;
    }

    public final List<AwemeToolFeedbackECode> getECode() {
        return this.eCode;
    }

    public final String getName() {
        return this.name;
    }

    public final int getSuccessCount() {
        return this.successCount;
    }

    public final int hashCode() {
        String str = this.name;
        int i = 0;
        int hashCode = (((((((str != null ? str.hashCode() : 0) * 31) + Integer.hashCode(this.count)) * 31) + Integer.hashCode(this.successCount)) * 31) + Integer.hashCode(this.cancelCount)) * 31;
        List<AwemeToolFeedbackECode> list = this.eCode;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AwemeToolFeedbackInfo(name=");
        sb.append(this.name);
        sb.append(", count=");
        sb.append(this.count);
        sb.append(", successCount=");
        sb.append(this.successCount);
        sb.append(", cancelCount=");
        sb.append(this.cancelCount);
        sb.append(", eCode=");
        sb.append(this.eCode);
        sb.append(")");
        return sb.toString();
    }

    public AwemeToolFeedbackInfo(String str, int i, int i2, int i3, List<AwemeToolFeedbackECode> list) {
        C7573i.m23587b(str, "name");
        C7573i.m23587b(list, "eCode");
        this.name = str;
        this.count = i;
        this.successCount = i2;
        this.cancelCount = i3;
        this.eCode = list;
    }

    public /* synthetic */ AwemeToolFeedbackInfo(String str, int i, int i2, int i3, List list, int i4, C7571f fVar) {
        int i5;
        int i6;
        if ((i4 & 1) != 0) {
            str = "";
        }
        int i7 = 0;
        if ((i4 & 2) != 0) {
            i5 = 0;
        } else {
            i5 = i;
        }
        if ((i4 & 4) != 0) {
            i6 = 0;
        } else {
            i6 = i2;
        }
        if ((i4 & 8) == 0) {
            i7 = i3;
        }
        if ((i4 & 16) != 0) {
            list = new ArrayList();
        }
        this(str, i5, i6, i7, list);
    }
}

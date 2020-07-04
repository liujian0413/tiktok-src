package com.p280ss.android.ugc.aweme.discover.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import kotlin.jvm.internal.C7571f;

/* renamed from: com.ss.android.ugc.aweme.discover.model.ChallengeTransform */
public final class ChallengeTransform implements Serializable {
    @C6593c(mo15949a = "action")
    public String action;
    @C6593c(mo15949a = "icon")
    public UrlModel iconUrlModel;
    @C6593c(mo15949a = "text")
    public String text;

    public ChallengeTransform() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ ChallengeTransform copy$default(ChallengeTransform challengeTransform, String str, UrlModel urlModel, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = challengeTransform.text;
        }
        if ((i & 2) != 0) {
            urlModel = challengeTransform.iconUrlModel;
        }
        if ((i & 4) != 0) {
            str2 = challengeTransform.action;
        }
        return challengeTransform.copy(str, urlModel, str2);
    }

    public final String component1() {
        return this.text;
    }

    public final UrlModel component2() {
        return this.iconUrlModel;
    }

    public final String component3() {
        return this.action;
    }

    public final ChallengeTransform copy(String str, UrlModel urlModel, String str2) {
        return new ChallengeTransform(str, urlModel, str2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.action, (java.lang.Object) r3.action) != false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0029
            boolean r0 = r3 instanceof com.p280ss.android.ugc.aweme.discover.model.ChallengeTransform
            if (r0 == 0) goto L_0x0027
            com.ss.android.ugc.aweme.discover.model.ChallengeTransform r3 = (com.p280ss.android.ugc.aweme.discover.model.ChallengeTransform) r3
            java.lang.String r0 = r2.text
            java.lang.String r1 = r3.text
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0027
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r2.iconUrlModel
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = r3.iconUrlModel
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = r2.action
            java.lang.String r3 = r3.action
            boolean r3 = kotlin.jvm.internal.C7573i.m23585a(r0, r3)
            if (r3 == 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r3 = 0
            return r3
        L_0x0029:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.discover.model.ChallengeTransform.equals(java.lang.Object):boolean");
    }

    public final String getAction() {
        return this.action;
    }

    public final UrlModel getIconUrlModel() {
        return this.iconUrlModel;
    }

    public final String getText() {
        return this.text;
    }

    public final int hashCode() {
        String str = this.text;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        UrlModel urlModel = this.iconUrlModel;
        int hashCode2 = (hashCode + (urlModel != null ? urlModel.hashCode() : 0)) * 31;
        String str2 = this.action;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChallengeTransform(text=");
        sb.append(this.text);
        sb.append(", iconUrlModel=");
        sb.append(this.iconUrlModel);
        sb.append(", action=");
        sb.append(this.action);
        sb.append(")");
        return sb.toString();
    }

    public final void setAction(String str) {
        this.action = str;
    }

    public final void setIconUrlModel(UrlModel urlModel) {
        this.iconUrlModel = urlModel;
    }

    public final void setText(String str) {
        this.text = str;
    }

    public ChallengeTransform(String str, UrlModel urlModel, String str2) {
        this.text = str;
        this.iconUrlModel = urlModel;
        this.action = str2;
    }

    public /* synthetic */ ChallengeTransform(String str, UrlModel urlModel, String str2, int i, C7571f fVar) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            urlModel = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        this(str, urlModel, str2);
    }
}

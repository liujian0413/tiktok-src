package com.p280ss.android.ugc.aweme.discover.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.model.DiscoverPlayListStructV4 */
public final class DiscoverPlayListStructV4 {
    public static final Companion Companion = new Companion(null);
    @C6593c(mo15949a = "aweme_list")
    public final List<Aweme> awemes;
    @C6593c(mo15949a = "cell_id")
    public final String cellID;
    public LogPbBean logPb;
    @C6593c(mo15949a = "ref_url")
    public final String refUrl;
    @C6593c(mo15949a = "title")
    public final String title;
    @C6593c(mo15949a = "type")
    public final int type;

    /* renamed from: com.ss.android.ugc.aweme.discover.model.DiscoverPlayListStructV4$Companion */
    public static final class Companion {
        private Companion() {
        }

        public final String getPlayListType(int i) {
            switch (i) {
                case 0:
                    return "tag";
                case 1:
                    return "theme";
                default:
                    return "video";
            }
        }

        public /* synthetic */ Companion(C7571f fVar) {
            this();
        }
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme>, for r8v0, types: [java.util.List] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.p280ss.android.ugc.aweme.discover.model.DiscoverPlayListStructV4 copy$default(com.p280ss.android.ugc.aweme.discover.model.DiscoverPlayListStructV4 r4, java.lang.String r5, java.lang.String r6, int r7, java.util.List<com.p280ss.android.ugc.aweme.feed.model.Aweme> r8, java.lang.String r9, com.p280ss.android.ugc.aweme.feed.model.LogPbBean r10, int r11, java.lang.Object r12) {
        /*
            r12 = r11 & 1
            if (r12 == 0) goto L_0x0006
            java.lang.String r5 = r4.cellID
        L_0x0006:
            r12 = r11 & 2
            if (r12 == 0) goto L_0x000c
            java.lang.String r6 = r4.title
        L_0x000c:
            r12 = r6
            r6 = r11 & 4
            if (r6 == 0) goto L_0x0013
            int r7 = r4.type
        L_0x0013:
            r0 = r7
            r6 = r11 & 8
            if (r6 == 0) goto L_0x001a
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r8 = r4.awemes
        L_0x001a:
            r1 = r8
            r6 = r11 & 16
            if (r6 == 0) goto L_0x0021
            java.lang.String r9 = r4.refUrl
        L_0x0021:
            r2 = r9
            r6 = r11 & 32
            if (r6 == 0) goto L_0x0028
            com.ss.android.ugc.aweme.feed.model.LogPbBean r10 = r4.logPb
        L_0x0028:
            r3 = r10
            r6 = r4
            r7 = r5
            r8 = r12
            r9 = r0
            r10 = r1
            r11 = r2
            r12 = r3
            com.ss.android.ugc.aweme.discover.model.DiscoverPlayListStructV4 r4 = r6.copy(r7, r8, r9, r10, r11, r12)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.discover.model.DiscoverPlayListStructV4.copy$default(com.ss.android.ugc.aweme.discover.model.DiscoverPlayListStructV4, java.lang.String, java.lang.String, int, java.util.List, java.lang.String, com.ss.android.ugc.aweme.feed.model.LogPbBean, int, java.lang.Object):com.ss.android.ugc.aweme.discover.model.DiscoverPlayListStructV4");
    }

    public final DiscoverPlayListStructV4 copy(String str, String str2, int i, List<? extends Aweme> list, String str3, LogPbBean logPbBean) {
        DiscoverPlayListStructV4 discoverPlayListStructV4 = new DiscoverPlayListStructV4(str, str2, i, list, str3, logPbBean);
        return discoverPlayListStructV4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DiscoverPlayListStructV4) {
                DiscoverPlayListStructV4 discoverPlayListStructV4 = (DiscoverPlayListStructV4) obj;
                if (C7573i.m23585a((Object) this.cellID, (Object) discoverPlayListStructV4.cellID) && C7573i.m23585a((Object) this.title, (Object) discoverPlayListStructV4.title)) {
                    if (!(this.type == discoverPlayListStructV4.type) || !C7573i.m23585a((Object) this.awemes, (Object) discoverPlayListStructV4.awemes) || !C7573i.m23585a((Object) this.refUrl, (Object) discoverPlayListStructV4.refUrl) || !C7573i.m23585a((Object) this.logPb, (Object) discoverPlayListStructV4.logPb)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.cellID;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.title;
        int hashCode2 = (((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Integer.hashCode(this.type)) * 31;
        List<Aweme> list = this.awemes;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        String str3 = this.refUrl;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        LogPbBean logPbBean = this.logPb;
        if (logPbBean != null) {
            i = logPbBean.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DiscoverPlayListStructV4(cellID=");
        sb.append(this.cellID);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", awemes=");
        sb.append(this.awemes);
        sb.append(", refUrl=");
        sb.append(this.refUrl);
        sb.append(", logPb=");
        sb.append(this.logPb);
        sb.append(")");
        return sb.toString();
    }

    public final String playListType() {
        switch (this.type) {
            case 0:
                return "tag";
            case 1:
                return "theme";
            default:
                return "video";
        }
    }

    public DiscoverPlayListStructV4(String str, String str2, Aweme aweme, int i) {
        C7573i.m23587b(str, "cellID");
        C7573i.m23587b(str2, "title");
        C7573i.m23587b(aweme, "aweme");
        this(str, str2, i, C7525m.m23457a(aweme), "", null);
    }

    public DiscoverPlayListStructV4(String str, String str2, int i, List<? extends Aweme> list, String str3, LogPbBean logPbBean) {
        this.cellID = str;
        this.title = str2;
        this.type = i;
        this.awemes = list;
        this.refUrl = str3;
        this.logPb = logPbBean;
    }

    public /* synthetic */ DiscoverPlayListStructV4(String str, String str2, int i, List list, String str3, LogPbBean logPbBean, int i2, C7571f fVar) {
        if ((i2 & 32) != 0) {
            logPbBean = null;
        }
        this(str, str2, i, list, str3, logPbBean);
    }
}

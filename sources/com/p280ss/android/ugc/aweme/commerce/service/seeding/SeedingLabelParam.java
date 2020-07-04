package com.p280ss.android.ugc.aweme.commerce.service.seeding;

import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import java.io.Serializable;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commerce.service.seeding.SeedingLabelParam */
public final class SeedingLabelParam implements Serializable {
    private final String authorId;
    private final String awemeId;
    private final String carrierType;
    private final String enterFrom;
    private final String entranceInfo;
    private final String referSeedId;
    private final String referSeedName;
    private final String seedId;
    private final String seedName;
    private final String sourcePage;

    public static /* synthetic */ SeedingLabelParam copy$default(SeedingLabelParam seedingLabelParam, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, Object obj) {
        SeedingLabelParam seedingLabelParam2 = seedingLabelParam;
        int i2 = i;
        return seedingLabelParam.copy((i2 & 1) != 0 ? seedingLabelParam2.seedId : str, (i2 & 2) != 0 ? seedingLabelParam2.awemeId : str2, (i2 & 4) != 0 ? seedingLabelParam2.authorId : str3, (i2 & 8) != 0 ? seedingLabelParam2.enterFrom : str4, (i2 & 16) != 0 ? seedingLabelParam2.sourcePage : str5, (i2 & 32) != 0 ? seedingLabelParam2.referSeedId : str6, (i2 & 64) != 0 ? seedingLabelParam2.referSeedName : str7, (i2 & PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH) != 0 ? seedingLabelParam2.seedName : str8, (i2 & 256) != 0 ? seedingLabelParam2.carrierType : str9, (i2 & 512) != 0 ? seedingLabelParam2.entranceInfo : str10);
    }

    public final String component1() {
        return this.seedId;
    }

    public final String component10() {
        return this.entranceInfo;
    }

    public final String component2() {
        return this.awemeId;
    }

    public final String component3() {
        return this.authorId;
    }

    public final String component4() {
        return this.enterFrom;
    }

    public final String component5() {
        return this.sourcePage;
    }

    public final String component6() {
        return this.referSeedId;
    }

    public final String component7() {
        return this.referSeedName;
    }

    public final String component8() {
        return this.seedName;
    }

    public final String component9() {
        return this.carrierType;
    }

    public final SeedingLabelParam copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        String str11 = str;
        C7573i.m23587b(str, "seedId");
        SeedingLabelParam seedingLabelParam = new SeedingLabelParam(str11, str2, str3, str4, str5, str6, str7, str8, str9, str10);
        return seedingLabelParam;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006a, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.entranceInfo, (java.lang.Object) r3.entranceInfo) != false) goto L_0x006f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x006f
            boolean r0 = r3 instanceof com.p280ss.android.ugc.aweme.commerce.service.seeding.SeedingLabelParam
            if (r0 == 0) goto L_0x006d
            com.ss.android.ugc.aweme.commerce.service.seeding.SeedingLabelParam r3 = (com.p280ss.android.ugc.aweme.commerce.service.seeding.SeedingLabelParam) r3
            java.lang.String r0 = r2.seedId
            java.lang.String r1 = r3.seedId
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x006d
            java.lang.String r0 = r2.awemeId
            java.lang.String r1 = r3.awemeId
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x006d
            java.lang.String r0 = r2.authorId
            java.lang.String r1 = r3.authorId
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x006d
            java.lang.String r0 = r2.enterFrom
            java.lang.String r1 = r3.enterFrom
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x006d
            java.lang.String r0 = r2.sourcePage
            java.lang.String r1 = r3.sourcePage
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x006d
            java.lang.String r0 = r2.referSeedId
            java.lang.String r1 = r3.referSeedId
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x006d
            java.lang.String r0 = r2.referSeedName
            java.lang.String r1 = r3.referSeedName
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x006d
            java.lang.String r0 = r2.seedName
            java.lang.String r1 = r3.seedName
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x006d
            java.lang.String r0 = r2.carrierType
            java.lang.String r1 = r3.carrierType
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x006d
            java.lang.String r0 = r2.entranceInfo
            java.lang.String r3 = r3.entranceInfo
            boolean r3 = kotlin.jvm.internal.C7573i.m23585a(r0, r3)
            if (r3 == 0) goto L_0x006d
            goto L_0x006f
        L_0x006d:
            r3 = 0
            return r3
        L_0x006f:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.commerce.service.seeding.SeedingLabelParam.equals(java.lang.Object):boolean");
    }

    public final String getAuthorId() {
        return this.authorId;
    }

    public final String getAwemeId() {
        return this.awemeId;
    }

    public final String getCarrierType() {
        return this.carrierType;
    }

    public final String getEnterFrom() {
        return this.enterFrom;
    }

    public final String getEntranceInfo() {
        return this.entranceInfo;
    }

    public final String getReferSeedId() {
        return this.referSeedId;
    }

    public final String getReferSeedName() {
        return this.referSeedName;
    }

    public final String getSeedId() {
        return this.seedId;
    }

    public final String getSeedName() {
        return this.seedName;
    }

    public final String getSourcePage() {
        return this.sourcePage;
    }

    public final int hashCode() {
        String str = this.seedId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.awemeId;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.authorId;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.enterFrom;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.sourcePage;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.referSeedId;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.referSeedName;
        int hashCode7 = (hashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.seedName;
        int hashCode8 = (hashCode7 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.carrierType;
        int hashCode9 = (hashCode8 + (str9 != null ? str9.hashCode() : 0)) * 31;
        String str10 = this.entranceInfo;
        if (str10 != null) {
            i = str10.hashCode();
        }
        return hashCode9 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SeedingLabelParam(seedId=");
        sb.append(this.seedId);
        sb.append(", awemeId=");
        sb.append(this.awemeId);
        sb.append(", authorId=");
        sb.append(this.authorId);
        sb.append(", enterFrom=");
        sb.append(this.enterFrom);
        sb.append(", sourcePage=");
        sb.append(this.sourcePage);
        sb.append(", referSeedId=");
        sb.append(this.referSeedId);
        sb.append(", referSeedName=");
        sb.append(this.referSeedName);
        sb.append(", seedName=");
        sb.append(this.seedName);
        sb.append(", carrierType=");
        sb.append(this.carrierType);
        sb.append(", entranceInfo=");
        sb.append(this.entranceInfo);
        sb.append(")");
        return sb.toString();
    }

    public SeedingLabelParam(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        C7573i.m23587b(str, "seedId");
        this.seedId = str;
        this.awemeId = str2;
        this.authorId = str3;
        this.enterFrom = str4;
        this.sourcePage = str5;
        this.referSeedId = str6;
        this.referSeedName = str7;
        this.seedName = str8;
        this.carrierType = str9;
        this.entranceInfo = str10;
    }

    public /* synthetic */ SeedingLabelParam(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, C7571f fVar) {
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        int i2 = i;
        if ((i2 & 2) != 0) {
            str11 = "";
        } else {
            str11 = str2;
        }
        if ((i2 & 4) != 0) {
            str12 = "";
        } else {
            str12 = str3;
        }
        if ((i2 & 8) != 0) {
            str13 = "";
        } else {
            str13 = str4;
        }
        if ((i2 & 16) != 0) {
            str14 = "";
        } else {
            str14 = str5;
        }
        if ((i2 & 32) != 0) {
            str15 = "";
        } else {
            str15 = str6;
        }
        if ((i2 & 64) != 0) {
            str16 = "";
        } else {
            str16 = str7;
        }
        if ((i2 & PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH) != 0) {
            str17 = "";
        } else {
            str17 = str8;
        }
        String str19 = null;
        if ((i2 & 256) != 0) {
            str18 = null;
        } else {
            str18 = str9;
        }
        if ((i2 & 512) == 0) {
            str19 = str10;
        }
        this(str, str11, str12, str13, str14, str15, str16, str17, str18, str19);
    }
}

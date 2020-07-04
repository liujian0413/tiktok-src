package com.p280ss.android.ugc.aweme.challenge.model;

import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import java.io.Serializable;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.challenge.model.ChallengeDetailParam */
public final class ChallengeDetailParam implements Serializable {
    private String awemeId;
    private int challengeType;
    private String cid;
    private int clickReason;
    private String enterFrom;
    private String enterpriseUid;
    private String fromToken;
    private boolean isHashTag;
    private String processId;
    private int showTabIndex;

    public ChallengeDetailParam() {
        this(null, null, null, null, false, 0, 0, null, 0, null, 1023, null);
    }

    public static /* synthetic */ ChallengeDetailParam copy$default(ChallengeDetailParam challengeDetailParam, String str, String str2, String str3, String str4, boolean z, int i, int i2, String str5, int i3, String str6, int i4, Object obj) {
        ChallengeDetailParam challengeDetailParam2 = challengeDetailParam;
        int i5 = i4;
        return challengeDetailParam.copy((i5 & 1) != 0 ? challengeDetailParam2.cid : str, (i5 & 2) != 0 ? challengeDetailParam2.awemeId : str2, (i5 & 4) != 0 ? challengeDetailParam2.enterFrom : str3, (i5 & 8) != 0 ? challengeDetailParam2.fromToken : str4, (i5 & 16) != 0 ? challengeDetailParam2.isHashTag : z, (i5 & 32) != 0 ? challengeDetailParam2.challengeType : i, (i5 & 64) != 0 ? challengeDetailParam2.clickReason : i2, (i5 & PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH) != 0 ? challengeDetailParam2.enterpriseUid : str5, (i5 & 256) != 0 ? challengeDetailParam2.showTabIndex : i3, (i5 & 512) != 0 ? challengeDetailParam2.processId : str6);
    }

    public final String component1() {
        return this.cid;
    }

    public final String component10() {
        return this.processId;
    }

    public final String component2() {
        return this.awemeId;
    }

    public final String component3() {
        return this.enterFrom;
    }

    public final String component4() {
        return this.fromToken;
    }

    public final boolean component5() {
        return this.isHashTag;
    }

    public final int component6() {
        return this.challengeType;
    }

    public final int component7() {
        return this.clickReason;
    }

    public final String component8() {
        return this.enterpriseUid;
    }

    public final int component9() {
        return this.showTabIndex;
    }

    public final ChallengeDetailParam copy(String str, String str2, String str3, String str4, boolean z, int i, int i2, String str5, int i3, String str6) {
        ChallengeDetailParam challengeDetailParam = new ChallengeDetailParam(str, str2, str3, str4, z, i, i2, str5, i3, str6);
        return challengeDetailParam;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ChallengeDetailParam) {
                ChallengeDetailParam challengeDetailParam = (ChallengeDetailParam) obj;
                if (C7573i.m23585a((Object) this.cid, (Object) challengeDetailParam.cid) && C7573i.m23585a((Object) this.awemeId, (Object) challengeDetailParam.awemeId) && C7573i.m23585a((Object) this.enterFrom, (Object) challengeDetailParam.enterFrom) && C7573i.m23585a((Object) this.fromToken, (Object) challengeDetailParam.fromToken)) {
                    if (this.isHashTag == challengeDetailParam.isHashTag) {
                        if (this.challengeType == challengeDetailParam.challengeType) {
                            if ((this.clickReason == challengeDetailParam.clickReason) && C7573i.m23585a((Object) this.enterpriseUid, (Object) challengeDetailParam.enterpriseUid)) {
                                if (!(this.showTabIndex == challengeDetailParam.showTabIndex) || !C7573i.m23585a((Object) this.processId, (Object) challengeDetailParam.processId)) {
                                    return false;
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final String getAwemeId() {
        return this.awemeId;
    }

    public final int getChallengeType() {
        return this.challengeType;
    }

    public final String getCid() {
        return this.cid;
    }

    public final int getClickReason() {
        return this.clickReason;
    }

    public final String getEnterFrom() {
        return this.enterFrom;
    }

    public final String getEnterpriseUid() {
        return this.enterpriseUid;
    }

    public final String getFromToken() {
        return this.fromToken;
    }

    public final String getProcessId() {
        return this.processId;
    }

    public final int getShowTabIndex() {
        return this.showTabIndex;
    }

    public final int hashCode() {
        String str = this.cid;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.awemeId;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.enterFrom;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.fromToken;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        boolean z = this.isHashTag;
        if (z) {
            z = true;
        }
        int i2 = (((((hashCode4 + (z ? 1 : 0)) * 31) + this.challengeType) * 31) + this.clickReason) * 31;
        String str5 = this.enterpriseUid;
        int hashCode5 = (((i2 + (str5 != null ? str5.hashCode() : 0)) * 31) + this.showTabIndex) * 31;
        String str6 = this.processId;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return hashCode5 + i;
    }

    public final boolean isHashTag() {
        return this.isHashTag;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChallengeDetailParam(cid=");
        sb.append(this.cid);
        sb.append(", awemeId=");
        sb.append(this.awemeId);
        sb.append(", enterFrom=");
        sb.append(this.enterFrom);
        sb.append(", fromToken=");
        sb.append(this.fromToken);
        sb.append(", isHashTag=");
        sb.append(this.isHashTag);
        sb.append(", challengeType=");
        sb.append(this.challengeType);
        sb.append(", clickReason=");
        sb.append(this.clickReason);
        sb.append(", enterpriseUid=");
        sb.append(this.enterpriseUid);
        sb.append(", showTabIndex=");
        sb.append(this.showTabIndex);
        sb.append(", processId=");
        sb.append(this.processId);
        sb.append(")");
        return sb.toString();
    }

    public final void setAwemeId(String str) {
        this.awemeId = str;
    }

    public final void setChallengeType(int i) {
        this.challengeType = i;
    }

    public final void setCid(String str) {
        this.cid = str;
    }

    public final void setClickReason(int i) {
        this.clickReason = i;
    }

    public final void setEnterFrom(String str) {
        this.enterFrom = str;
    }

    public final void setEnterpriseUid(String str) {
        this.enterpriseUid = str;
    }

    public final void setFromToken(String str) {
        this.fromToken = str;
    }

    public final void setHashTag(boolean z) {
        this.isHashTag = z;
    }

    public final void setProcessId(String str) {
        this.processId = str;
    }

    public final void setShowTabIndex(int i) {
        this.showTabIndex = i;
    }

    public ChallengeDetailParam(String str, String str2, String str3, String str4, boolean z, int i, int i2, String str5, int i3, String str6) {
        this.cid = str;
        this.awemeId = str2;
        this.enterFrom = str3;
        this.fromToken = str4;
        this.isHashTag = z;
        this.challengeType = i;
        this.clickReason = i2;
        this.enterpriseUid = str5;
        this.showTabIndex = i3;
        this.processId = str6;
    }

    public /* synthetic */ ChallengeDetailParam(String str, String str2, String str3, String str4, boolean z, int i, int i2, String str5, int i3, String str6, int i4, C7571f fVar) {
        String str7;
        String str8;
        String str9;
        String str10;
        boolean z2;
        int i5;
        int i6;
        String str11;
        String str12;
        int i7 = i4;
        if ((i7 & 1) != 0) {
            str7 = "";
        } else {
            str7 = str;
        }
        if ((i7 & 2) != 0) {
            str8 = "";
        } else {
            str8 = str2;
        }
        if ((i7 & 4) != 0) {
            str9 = "";
        } else {
            str9 = str3;
        }
        if ((i7 & 8) != 0) {
            str10 = "";
        } else {
            str10 = str4;
        }
        int i8 = 0;
        if ((i7 & 16) != 0) {
            z2 = false;
        } else {
            z2 = z;
        }
        if ((i7 & 32) != 0) {
            i5 = 0;
        } else {
            i5 = i;
        }
        if ((i7 & 64) != 0) {
            i6 = 0;
        } else {
            i6 = i2;
        }
        if ((i7 & PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH) != 0) {
            str11 = "";
        } else {
            str11 = str5;
        }
        if ((i7 & 256) == 0) {
            i8 = i3;
        }
        if ((i7 & 512) != 0) {
            str12 = "";
        } else {
            str12 = str6;
        }
        this(str7, str8, str9, str10, z2, i5, i6, str11, i8, str12);
    }
}

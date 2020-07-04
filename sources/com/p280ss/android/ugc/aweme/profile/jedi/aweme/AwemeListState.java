package com.p280ss.android.ugc.aweme.profile.jedi.aweme;

import com.bytedance.jedi.arch.C11670t;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.AwemeListState */
public final class AwemeListState implements C11670t {
    private String contentSource;
    private boolean curVisible;
    private String enterAwemeId;
    private String enterFromRequestId;
    private String feedsAwemeId;
    private int followStatus;
    private int isFromPostList;
    private boolean isMyProfile;
    private boolean isPrivateAccount;
    private String label;
    private final ListState<Object, C35968f> listState;
    private String methodFrom;
    private String methodFromLike;
    private String previousPage;
    private String previousPagePosition;
    private int profileListType;
    private String secUserId;
    private boolean showCover;
    private String tabName;
    private String userId;
    private boolean visibleForFavoritesMob;

    public AwemeListState() {
        this(null, null, false, false, 0, false, 0, 0, null, null, null, null, null, null, null, null, null, false, false, null, null, 2097151, null);
    }

    public static /* synthetic */ AwemeListState copy$default(AwemeListState awemeListState, String str, String str2, boolean z, boolean z2, int i, boolean z3, int i2, int i3, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, boolean z4, boolean z5, String str12, ListState listState2, int i4, Object obj) {
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        String str18;
        AwemeListState awemeListState2 = awemeListState;
        int i5 = i4;
        String str19 = (i5 & 1) != 0 ? awemeListState2.userId : str;
        String str20 = (i5 & 2) != 0 ? awemeListState2.secUserId : str2;
        boolean z10 = (i5 & 4) != 0 ? awemeListState2.isMyProfile : z;
        boolean z11 = (i5 & 8) != 0 ? awemeListState2.isPrivateAccount : z2;
        int i6 = (i5 & 16) != 0 ? awemeListState2.followStatus : i;
        boolean z12 = (i5 & 32) != 0 ? awemeListState2.showCover : z3;
        int i7 = (i5 & 64) != 0 ? awemeListState2.profileListType : i2;
        int i8 = (i5 & PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH) != 0 ? awemeListState2.isFromPostList : i3;
        String str21 = (i5 & 256) != 0 ? awemeListState2.tabName : str3;
        String str22 = (i5 & 512) != 0 ? awemeListState2.methodFrom : str4;
        String str23 = (i5 & PreloadTask.BYTE_UNIT_NUMBER) != 0 ? awemeListState2.methodFromLike : str5;
        String str24 = (i5 & 2048) != 0 ? awemeListState2.contentSource : str6;
        String str25 = (i5 & 4096) != 0 ? awemeListState2.label : str7;
        String str26 = (i5 & VideoCacheReadBuffersizeExperiment.DEFAULT) != 0 ? awemeListState2.previousPage : str8;
        String str27 = (i5 & 16384) != 0 ? awemeListState2.previousPagePosition : str9;
        if ((i5 & 32768) != 0) {
            str13 = str27;
            str14 = awemeListState2.enterFromRequestId;
        } else {
            str13 = str27;
            str14 = str10;
        }
        if ((i5 & 65536) != 0) {
            str15 = str14;
            str16 = awemeListState2.feedsAwemeId;
        } else {
            str15 = str14;
            str16 = str11;
        }
        if ((i5 & 131072) != 0) {
            str17 = str16;
            z6 = awemeListState2.visibleForFavoritesMob;
        } else {
            str17 = str16;
            z6 = z4;
        }
        if ((i5 & 262144) != 0) {
            z7 = z6;
            z8 = awemeListState2.curVisible;
        } else {
            z7 = z6;
            z8 = z5;
        }
        if ((i5 & 524288) != 0) {
            z9 = z8;
            str18 = awemeListState2.enterAwemeId;
        } else {
            z9 = z8;
            str18 = str12;
        }
        return awemeListState.copy(str19, str20, z10, z11, i6, z12, i7, i8, str21, str22, str23, str24, str25, str26, str13, str15, str17, z7, z9, str18, (i5 & 1048576) != 0 ? awemeListState2.listState : listState2);
    }

    public final String component1() {
        return this.userId;
    }

    public final String component10() {
        return this.methodFrom;
    }

    public final String component11() {
        return this.methodFromLike;
    }

    public final String component12() {
        return this.contentSource;
    }

    public final String component13() {
        return this.label;
    }

    public final String component14() {
        return this.previousPage;
    }

    public final String component15() {
        return this.previousPagePosition;
    }

    public final String component16() {
        return this.enterFromRequestId;
    }

    public final String component17() {
        return this.feedsAwemeId;
    }

    public final boolean component18() {
        return this.visibleForFavoritesMob;
    }

    public final boolean component19() {
        return this.curVisible;
    }

    public final String component2() {
        return this.secUserId;
    }

    public final String component20() {
        return this.enterAwemeId;
    }

    public final ListState<Object, C35968f> component21() {
        return this.listState;
    }

    public final boolean component3() {
        return this.isMyProfile;
    }

    public final boolean component4() {
        return this.isPrivateAccount;
    }

    public final int component5() {
        return this.followStatus;
    }

    public final boolean component6() {
        return this.showCover;
    }

    public final int component7() {
        return this.profileListType;
    }

    public final int component8() {
        return this.isFromPostList;
    }

    public final String component9() {
        return this.tabName;
    }

    public final AwemeListState copy(String str, String str2, boolean z, boolean z2, int i, boolean z3, int i2, int i3, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, boolean z4, boolean z5, String str12, ListState<Object, C35968f> listState2) {
        String str13 = str2;
        boolean z6 = z;
        boolean z7 = z2;
        int i4 = i;
        boolean z8 = z3;
        int i5 = i2;
        int i6 = i3;
        String str14 = str3;
        String str15 = str4;
        String str16 = str5;
        String str17 = str6;
        String str18 = str7;
        String str19 = str8;
        String str20 = str9;
        String str21 = str10;
        String str22 = str11;
        boolean z9 = z4;
        boolean z10 = z5;
        String str23 = str12;
        ListState<Object, C35968f> listState3 = listState2;
        String str24 = str;
        C7573i.m23587b(listState2, "listState");
        AwemeListState awemeListState = new AwemeListState(str24, str13, z6, z7, i4, z8, i5, i6, str14, str15, str16, str17, str18, str19, str20, str21, str22, z9, z10, str23, listState3);
        return awemeListState;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AwemeListState) {
                AwemeListState awemeListState = (AwemeListState) obj;
                if (C7573i.m23585a((Object) this.userId, (Object) awemeListState.userId) && C7573i.m23585a((Object) this.secUserId, (Object) awemeListState.secUserId)) {
                    if (this.isMyProfile == awemeListState.isMyProfile) {
                        if (this.isPrivateAccount == awemeListState.isPrivateAccount) {
                            if (this.followStatus == awemeListState.followStatus) {
                                if (this.showCover == awemeListState.showCover) {
                                    if (this.profileListType == awemeListState.profileListType) {
                                        if ((this.isFromPostList == awemeListState.isFromPostList) && C7573i.m23585a((Object) this.tabName, (Object) awemeListState.tabName) && C7573i.m23585a((Object) this.methodFrom, (Object) awemeListState.methodFrom) && C7573i.m23585a((Object) this.methodFromLike, (Object) awemeListState.methodFromLike) && C7573i.m23585a((Object) this.contentSource, (Object) awemeListState.contentSource) && C7573i.m23585a((Object) this.label, (Object) awemeListState.label) && C7573i.m23585a((Object) this.previousPage, (Object) awemeListState.previousPage) && C7573i.m23585a((Object) this.previousPagePosition, (Object) awemeListState.previousPagePosition) && C7573i.m23585a((Object) this.enterFromRequestId, (Object) awemeListState.enterFromRequestId) && C7573i.m23585a((Object) this.feedsAwemeId, (Object) awemeListState.feedsAwemeId)) {
                                            if (this.visibleForFavoritesMob == awemeListState.visibleForFavoritesMob) {
                                                if (!(this.curVisible == awemeListState.curVisible) || !C7573i.m23585a((Object) this.enterAwemeId, (Object) awemeListState.enterAwemeId) || !C7573i.m23585a((Object) this.listState, (Object) awemeListState.listState)) {
                                                    return false;
                                                }
                                            }
                                        }
                                    }
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

    public final String getContentSource() {
        return this.contentSource;
    }

    public final boolean getCurVisible() {
        return this.curVisible;
    }

    public final String getEnterAwemeId() {
        return this.enterAwemeId;
    }

    public final String getEnterFromRequestId() {
        return this.enterFromRequestId;
    }

    public final String getFeedsAwemeId() {
        return this.feedsAwemeId;
    }

    public final int getFollowStatus() {
        return this.followStatus;
    }

    public final String getLabel() {
        return this.label;
    }

    public final ListState<Object, C35968f> getListState() {
        return this.listState;
    }

    public final String getMethodFrom() {
        return this.methodFrom;
    }

    public final String getMethodFromLike() {
        return this.methodFromLike;
    }

    public final String getPreviousPage() {
        return this.previousPage;
    }

    public final String getPreviousPagePosition() {
        return this.previousPagePosition;
    }

    public final int getProfileListType() {
        return this.profileListType;
    }

    public final String getSecUserId() {
        return this.secUserId;
    }

    public final boolean getShowCover() {
        return this.showCover;
    }

    public final String getTabName() {
        return this.tabName;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final boolean getVisibleForFavoritesMob() {
        return this.visibleForFavoritesMob;
    }

    public final int hashCode() {
        String str = this.userId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.secUserId;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        boolean z = this.isMyProfile;
        if (z) {
            z = true;
        }
        int i2 = (hashCode2 + (z ? 1 : 0)) * 31;
        boolean z2 = this.isPrivateAccount;
        if (z2) {
            z2 = true;
        }
        int i3 = (((i2 + (z2 ? 1 : 0)) * 31) + this.followStatus) * 31;
        boolean z3 = this.showCover;
        if (z3) {
            z3 = true;
        }
        int i4 = (((((i3 + (z3 ? 1 : 0)) * 31) + this.profileListType) * 31) + this.isFromPostList) * 31;
        String str3 = this.tabName;
        int hashCode3 = (i4 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.methodFrom;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.methodFromLike;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.contentSource;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.label;
        int hashCode7 = (hashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.previousPage;
        int hashCode8 = (hashCode7 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.previousPagePosition;
        int hashCode9 = (hashCode8 + (str9 != null ? str9.hashCode() : 0)) * 31;
        String str10 = this.enterFromRequestId;
        int hashCode10 = (hashCode9 + (str10 != null ? str10.hashCode() : 0)) * 31;
        String str11 = this.feedsAwemeId;
        int hashCode11 = (hashCode10 + (str11 != null ? str11.hashCode() : 0)) * 31;
        boolean z4 = this.visibleForFavoritesMob;
        if (z4) {
            z4 = true;
        }
        int i5 = (hashCode11 + (z4 ? 1 : 0)) * 31;
        boolean z5 = this.curVisible;
        if (z5) {
            z5 = true;
        }
        int i6 = (i5 + (z5 ? 1 : 0)) * 31;
        String str12 = this.enterAwemeId;
        int hashCode12 = (i6 + (str12 != null ? str12.hashCode() : 0)) * 31;
        ListState<Object, C35968f> listState2 = this.listState;
        if (listState2 != null) {
            i = listState2.hashCode();
        }
        return hashCode12 + i;
    }

    public final int isFromPostList() {
        return this.isFromPostList;
    }

    public final boolean isMyProfile() {
        return this.isMyProfile;
    }

    public final boolean isPrivateAccount() {
        return this.isPrivateAccount;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AwemeListState(userId=");
        sb.append(this.userId);
        sb.append(", secUserId=");
        sb.append(this.secUserId);
        sb.append(", isMyProfile=");
        sb.append(this.isMyProfile);
        sb.append(", isPrivateAccount=");
        sb.append(this.isPrivateAccount);
        sb.append(", followStatus=");
        sb.append(this.followStatus);
        sb.append(", showCover=");
        sb.append(this.showCover);
        sb.append(", profileListType=");
        sb.append(this.profileListType);
        sb.append(", isFromPostList=");
        sb.append(this.isFromPostList);
        sb.append(", tabName=");
        sb.append(this.tabName);
        sb.append(", methodFrom=");
        sb.append(this.methodFrom);
        sb.append(", methodFromLike=");
        sb.append(this.methodFromLike);
        sb.append(", contentSource=");
        sb.append(this.contentSource);
        sb.append(", label=");
        sb.append(this.label);
        sb.append(", previousPage=");
        sb.append(this.previousPage);
        sb.append(", previousPagePosition=");
        sb.append(this.previousPagePosition);
        sb.append(", enterFromRequestId=");
        sb.append(this.enterFromRequestId);
        sb.append(", feedsAwemeId=");
        sb.append(this.feedsAwemeId);
        sb.append(", visibleForFavoritesMob=");
        sb.append(this.visibleForFavoritesMob);
        sb.append(", curVisible=");
        sb.append(this.curVisible);
        sb.append(", enterAwemeId=");
        sb.append(this.enterAwemeId);
        sb.append(", listState=");
        sb.append(this.listState);
        sb.append(")");
        return sb.toString();
    }

    public final void setContentSource(String str) {
        this.contentSource = str;
    }

    public final void setCurVisible(boolean z) {
        this.curVisible = z;
    }

    public final void setEnterAwemeId(String str) {
        this.enterAwemeId = str;
    }

    public final void setEnterFromRequestId(String str) {
        this.enterFromRequestId = str;
    }

    public final void setFeedsAwemeId(String str) {
        this.feedsAwemeId = str;
    }

    public final void setFollowStatus(int i) {
        this.followStatus = i;
    }

    public final void setFromPostList(int i) {
        this.isFromPostList = i;
    }

    public final void setLabel(String str) {
        this.label = str;
    }

    public final void setMethodFrom(String str) {
        this.methodFrom = str;
    }

    public final void setMethodFromLike(String str) {
        this.methodFromLike = str;
    }

    public final void setMyProfile(boolean z) {
        this.isMyProfile = z;
    }

    public final void setPreviousPage(String str) {
        this.previousPage = str;
    }

    public final void setPreviousPagePosition(String str) {
        this.previousPagePosition = str;
    }

    public final void setPrivateAccount(boolean z) {
        this.isPrivateAccount = z;
    }

    public final void setProfileListType(int i) {
        this.profileListType = i;
    }

    public final void setSecUserId(String str) {
        this.secUserId = str;
    }

    public final void setShowCover(boolean z) {
        this.showCover = z;
    }

    public final void setTabName(String str) {
        this.tabName = str;
    }

    public final void setUserId(String str) {
        this.userId = str;
    }

    public final void setVisibleForFavoritesMob(boolean z) {
        this.visibleForFavoritesMob = z;
    }

    public AwemeListState(String str, String str2, boolean z, boolean z2, int i, boolean z3, int i2, int i3, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, boolean z4, boolean z5, String str12, ListState<Object, C35968f> listState2) {
        ListState<Object, C35968f> listState3 = listState2;
        C7573i.m23587b(listState3, "listState");
        this.userId = str;
        this.secUserId = str2;
        this.isMyProfile = z;
        this.isPrivateAccount = z2;
        this.followStatus = i;
        this.showCover = z3;
        this.profileListType = i2;
        this.isFromPostList = i3;
        this.tabName = str3;
        this.methodFrom = str4;
        this.methodFromLike = str5;
        this.contentSource = str6;
        this.label = str7;
        this.previousPage = str8;
        this.previousPagePosition = str9;
        this.enterFromRequestId = str10;
        this.feedsAwemeId = str11;
        this.visibleForFavoritesMob = z4;
        this.curVisible = z5;
        this.enterAwemeId = str12;
        this.listState = listState3;
    }

    public /* synthetic */ AwemeListState(String str, String str2, boolean z, boolean z2, int i, boolean z3, int i2, int i3, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, boolean z4, boolean z5, String str12, ListState listState2, int i4, C7571f fVar) {
        String str13;
        String str14;
        boolean z6;
        boolean z7;
        int i5;
        boolean z8;
        int i6;
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        String str21;
        String str22;
        String str23;
        boolean z9;
        boolean z10;
        String str24;
        ListState listState3;
        int i7 = i4;
        if ((i7 & 1) != 0) {
            str13 = null;
        } else {
            str13 = str;
        }
        if ((i7 & 2) != 0) {
            str14 = null;
        } else {
            str14 = str2;
        }
        int i8 = 0;
        if ((i7 & 4) != 0) {
            z6 = false;
        } else {
            z6 = z;
        }
        if ((i7 & 8) != 0) {
            z7 = false;
        } else {
            z7 = z2;
        }
        if ((i7 & 16) != 0) {
            i5 = 0;
        } else {
            i5 = i;
        }
        if ((i7 & 32) != 0) {
            z8 = true;
        } else {
            z8 = z3;
        }
        if ((i7 & 64) != 0) {
            i6 = 0;
        } else {
            i6 = i2;
        }
        if ((i7 & PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH) == 0) {
            i8 = i3;
        }
        if ((i7 & 256) != 0) {
            str15 = null;
        } else {
            str15 = str3;
        }
        if ((i7 & 512) != 0) {
            str16 = null;
        } else {
            str16 = str4;
        }
        if ((i7 & PreloadTask.BYTE_UNIT_NUMBER) != 0) {
            str17 = null;
        } else {
            str17 = str5;
        }
        if ((i7 & 2048) != 0) {
            str18 = null;
        } else {
            str18 = str6;
        }
        if ((i7 & 4096) != 0) {
            str19 = null;
        } else {
            str19 = str7;
        }
        if ((i7 & VideoCacheReadBuffersizeExperiment.DEFAULT) != 0) {
            str20 = null;
        } else {
            str20 = str8;
        }
        if ((i7 & 16384) != 0) {
            str21 = null;
        } else {
            str21 = str9;
        }
        if ((i7 & 32768) != 0) {
            str22 = null;
        } else {
            str22 = str10;
        }
        if ((i7 & 65536) != 0) {
            str23 = null;
        } else {
            str23 = str11;
        }
        if ((i7 & 131072) != 0) {
            z9 = true;
        } else {
            z9 = z4;
        }
        if ((i7 & 262144) != 0) {
            z10 = true;
        } else {
            z10 = z5;
        }
        if ((i7 & 524288) != 0) {
            str24 = null;
        } else {
            str24 = str12;
        }
        if ((i7 & 1048576) != 0) {
            C35968f fVar2 = new C35968f(false, 0, 0, 7, null);
            listState3 = new ListState(fVar2, null, null, null, null, 30, null);
        } else {
            listState3 = listState2;
        }
        this(str13, str14, z6, z7, i5, z8, i6, i8, str15, str16, str17, str18, str19, str20, str21, str22, str23, z9, z10, str24, listState3);
    }
}

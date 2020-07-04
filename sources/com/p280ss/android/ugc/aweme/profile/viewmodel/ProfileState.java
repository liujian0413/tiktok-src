package com.p280ss.android.ugc.aweme.profile.viewmodel;

import com.bytedance.jedi.arch.C11491a;
import com.bytedance.jedi.arch.C11496ae;
import com.bytedance.jedi.arch.C11670t;
import com.bytedance.lighten.core.C12131l;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import kotlin.Pair;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.profile.viewmodel.ProfileState */
public final class ProfileState implements C11670t {
    public static final C36791a Companion = new C36791a(null);
    private final int avatarClickCount;
    private final int curTabType;
    private final Integer currentDownloadSetting;
    private final String enterFrom;
    private final String from;
    private final String fromSearch;
    private final boolean isAvatarClicked;
    private final boolean isBackgroundCoverClicked;
    private final Boolean isPostAwemeEmpty;
    private final String livePreviousPage;
    private final C11491a<Pair<UrlModel, C12131l>> loadAvatar;
    private final boolean needShowProfileCollectionGuide;
    private final String needUpdateAvatarUrl;
    private final boolean onHiddenChanged;
    private final Aweme sourceAweme;
    private final String suid;
    private final String uid;
    private final User user;
    private final boolean userVisibleHint;

    /* renamed from: com.ss.android.ugc.aweme.profile.viewmodel.ProfileState$a */
    public static final class C36791a {
        private C36791a() {
        }

        public /* synthetic */ C36791a(C7571f fVar) {
            this();
        }
    }

    public ProfileState() {
        this(null, null, null, null, null, 0, 0, false, null, null, null, null, null, false, false, false, null, false, null, 524287, null);
    }

    public static /* synthetic */ ProfileState copy$default(ProfileState profileState, String str, String str2, User user2, Aweme aweme, C11491a aVar, int i, int i2, boolean z, String str3, String str4, String str5, String str6, Boolean bool, boolean z2, boolean z3, boolean z4, Integer num, boolean z5, String str7, int i3, Object obj) {
        boolean z6;
        boolean z7;
        boolean z8;
        Integer num2;
        Integer num3;
        boolean z9;
        ProfileState profileState2 = profileState;
        int i4 = i3;
        String str8 = (i4 & 1) != 0 ? profileState2.uid : str;
        String str9 = (i4 & 2) != 0 ? profileState2.suid : str2;
        User user3 = (i4 & 4) != 0 ? profileState2.user : user2;
        Aweme aweme2 = (i4 & 8) != 0 ? profileState2.sourceAweme : aweme;
        C11491a aVar2 = (i4 & 16) != 0 ? profileState2.loadAvatar : aVar;
        int i5 = (i4 & 32) != 0 ? profileState2.avatarClickCount : i;
        int i6 = (i4 & 64) != 0 ? profileState2.curTabType : i2;
        boolean z10 = (i4 & PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH) != 0 ? profileState2.userVisibleHint : z;
        String str10 = (i4 & 256) != 0 ? profileState2.needUpdateAvatarUrl : str3;
        String str11 = (i4 & 512) != 0 ? profileState2.livePreviousPage : str4;
        String str12 = (i4 & PreloadTask.BYTE_UNIT_NUMBER) != 0 ? profileState2.from : str5;
        String str13 = (i4 & 2048) != 0 ? profileState2.enterFrom : str6;
        Boolean bool2 = (i4 & 4096) != 0 ? profileState2.isPostAwemeEmpty : bool;
        boolean z11 = (i4 & VideoCacheReadBuffersizeExperiment.DEFAULT) != 0 ? profileState2.needShowProfileCollectionGuide : z2;
        boolean z12 = (i4 & 16384) != 0 ? profileState2.isAvatarClicked : z3;
        if ((i4 & 32768) != 0) {
            z6 = z12;
            z7 = profileState2.isBackgroundCoverClicked;
        } else {
            z6 = z12;
            z7 = z4;
        }
        if ((i4 & 65536) != 0) {
            z8 = z7;
            num2 = profileState2.currentDownloadSetting;
        } else {
            z8 = z7;
            num2 = num;
        }
        if ((i4 & 131072) != 0) {
            num3 = num2;
            z9 = profileState2.onHiddenChanged;
        } else {
            num3 = num2;
            z9 = z5;
        }
        return profileState.copy(str8, str9, user3, aweme2, aVar2, i5, i6, z10, str10, str11, str12, str13, bool2, z11, z6, z8, num3, z9, (i4 & 262144) != 0 ? profileState2.fromSearch : str7);
    }

    public final String component1() {
        return this.uid;
    }

    public final String component10() {
        return this.livePreviousPage;
    }

    public final String component11() {
        return this.from;
    }

    public final String component12() {
        return this.enterFrom;
    }

    public final Boolean component13() {
        return this.isPostAwemeEmpty;
    }

    public final boolean component14() {
        return this.needShowProfileCollectionGuide;
    }

    public final boolean component15() {
        return this.isAvatarClicked;
    }

    public final boolean component16() {
        return this.isBackgroundCoverClicked;
    }

    public final Integer component17() {
        return this.currentDownloadSetting;
    }

    public final boolean component18() {
        return this.onHiddenChanged;
    }

    public final String component19() {
        return this.fromSearch;
    }

    public final String component2() {
        return this.suid;
    }

    public final User component3() {
        return this.user;
    }

    public final Aweme component4() {
        return this.sourceAweme;
    }

    public final C11491a<Pair<UrlModel, C12131l>> component5() {
        return this.loadAvatar;
    }

    public final int component6() {
        return this.avatarClickCount;
    }

    public final int component7() {
        return this.curTabType;
    }

    public final boolean component8() {
        return this.userVisibleHint;
    }

    public final String component9() {
        return this.needUpdateAvatarUrl;
    }

    public final ProfileState copy(String str, String str2, User user2, Aweme aweme, C11491a<? extends Pair<? extends UrlModel, ? extends C12131l>> aVar, int i, int i2, boolean z, String str3, String str4, String str5, String str6, Boolean bool, boolean z2, boolean z3, boolean z4, Integer num, boolean z5, String str7) {
        String str8 = str2;
        User user3 = user2;
        Aweme aweme2 = aweme;
        C11491a<? extends Pair<? extends UrlModel, ? extends C12131l>> aVar2 = aVar;
        int i3 = i;
        int i4 = i2;
        boolean z6 = z;
        String str9 = str3;
        String str10 = str4;
        String str11 = str5;
        String str12 = str6;
        Boolean bool2 = bool;
        boolean z7 = z2;
        boolean z8 = z3;
        boolean z9 = z4;
        Integer num2 = num;
        boolean z10 = z5;
        String str13 = str7;
        String str14 = str;
        C7573i.m23587b(aVar, "loadAvatar");
        ProfileState profileState = new ProfileState(str14, str8, user3, aweme2, aVar2, i3, i4, z6, str9, str10, str11, str12, bool2, z7, z8, z9, num2, z10, str13);
        return profileState;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ProfileState) {
                ProfileState profileState = (ProfileState) obj;
                if (C7573i.m23585a((Object) this.uid, (Object) profileState.uid) && C7573i.m23585a((Object) this.suid, (Object) profileState.suid) && C7573i.m23585a((Object) this.user, (Object) profileState.user) && C7573i.m23585a((Object) this.sourceAweme, (Object) profileState.sourceAweme) && C7573i.m23585a((Object) this.loadAvatar, (Object) profileState.loadAvatar)) {
                    if (this.avatarClickCount == profileState.avatarClickCount) {
                        if (this.curTabType == profileState.curTabType) {
                            if ((this.userVisibleHint == profileState.userVisibleHint) && C7573i.m23585a((Object) this.needUpdateAvatarUrl, (Object) profileState.needUpdateAvatarUrl) && C7573i.m23585a((Object) this.livePreviousPage, (Object) profileState.livePreviousPage) && C7573i.m23585a((Object) this.from, (Object) profileState.from) && C7573i.m23585a((Object) this.enterFrom, (Object) profileState.enterFrom) && C7573i.m23585a((Object) this.isPostAwemeEmpty, (Object) profileState.isPostAwemeEmpty)) {
                                if (this.needShowProfileCollectionGuide == profileState.needShowProfileCollectionGuide) {
                                    if (this.isAvatarClicked == profileState.isAvatarClicked) {
                                        if ((this.isBackgroundCoverClicked == profileState.isBackgroundCoverClicked) && C7573i.m23585a((Object) this.currentDownloadSetting, (Object) profileState.currentDownloadSetting)) {
                                            if (!(this.onHiddenChanged == profileState.onHiddenChanged) || !C7573i.m23585a((Object) this.fromSearch, (Object) profileState.fromSearch)) {
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
            return false;
        }
        return true;
    }

    public final int getAvatarClickCount() {
        return this.avatarClickCount;
    }

    public final int getCurTabType() {
        return this.curTabType;
    }

    public final Integer getCurrentDownloadSetting() {
        return this.currentDownloadSetting;
    }

    public final String getEnterFrom() {
        return this.enterFrom;
    }

    public final String getFrom() {
        return this.from;
    }

    public final String getFromSearch() {
        return this.fromSearch;
    }

    public final String getLivePreviousPage() {
        return this.livePreviousPage;
    }

    public final C11491a<Pair<UrlModel, C12131l>> getLoadAvatar() {
        return this.loadAvatar;
    }

    public final boolean getNeedShowProfileCollectionGuide() {
        return this.needShowProfileCollectionGuide;
    }

    public final String getNeedUpdateAvatarUrl() {
        return this.needUpdateAvatarUrl;
    }

    public final boolean getOnHiddenChanged() {
        return this.onHiddenChanged;
    }

    public final Aweme getSourceAweme() {
        return this.sourceAweme;
    }

    public final String getSuid() {
        return this.suid;
    }

    public final String getUid() {
        return this.uid;
    }

    public final User getUser() {
        return this.user;
    }

    public final boolean getUserVisibleHint() {
        return this.userVisibleHint;
    }

    public final int hashCode() {
        String str = this.uid;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.suid;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        User user2 = this.user;
        int hashCode3 = (hashCode2 + (user2 != null ? user2.hashCode() : 0)) * 31;
        Aweme aweme = this.sourceAweme;
        int hashCode4 = (hashCode3 + (aweme != null ? aweme.hashCode() : 0)) * 31;
        C11491a<Pair<UrlModel, C12131l>> aVar = this.loadAvatar;
        int hashCode5 = (((((hashCode4 + (aVar != null ? aVar.hashCode() : 0)) * 31) + this.avatarClickCount) * 31) + this.curTabType) * 31;
        boolean z = this.userVisibleHint;
        if (z) {
            z = true;
        }
        int i2 = (hashCode5 + (z ? 1 : 0)) * 31;
        String str3 = this.needUpdateAvatarUrl;
        int hashCode6 = (i2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.livePreviousPage;
        int hashCode7 = (hashCode6 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.from;
        int hashCode8 = (hashCode7 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.enterFrom;
        int hashCode9 = (hashCode8 + (str6 != null ? str6.hashCode() : 0)) * 31;
        Boolean bool = this.isPostAwemeEmpty;
        int hashCode10 = (hashCode9 + (bool != null ? bool.hashCode() : 0)) * 31;
        boolean z2 = this.needShowProfileCollectionGuide;
        if (z2) {
            z2 = true;
        }
        int i3 = (hashCode10 + (z2 ? 1 : 0)) * 31;
        boolean z3 = this.isAvatarClicked;
        if (z3) {
            z3 = true;
        }
        int i4 = (i3 + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.isBackgroundCoverClicked;
        if (z4) {
            z4 = true;
        }
        int i5 = (i4 + (z4 ? 1 : 0)) * 31;
        Integer num = this.currentDownloadSetting;
        int hashCode11 = (i5 + (num != null ? num.hashCode() : 0)) * 31;
        boolean z5 = this.onHiddenChanged;
        if (z5) {
            z5 = true;
        }
        int i6 = (hashCode11 + (z5 ? 1 : 0)) * 31;
        String str7 = this.fromSearch;
        if (str7 != null) {
            i = str7.hashCode();
        }
        return i6 + i;
    }

    public final boolean isAvatarClicked() {
        return this.isAvatarClicked;
    }

    public final boolean isBackgroundCoverClicked() {
        return this.isBackgroundCoverClicked;
    }

    public final Boolean isPostAwemeEmpty() {
        return this.isPostAwemeEmpty;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProfileState(uid=");
        sb.append(this.uid);
        sb.append(", suid=");
        sb.append(this.suid);
        sb.append(", user=");
        sb.append(this.user);
        sb.append(", sourceAweme=");
        sb.append(this.sourceAweme);
        sb.append(", loadAvatar=");
        sb.append(this.loadAvatar);
        sb.append(", avatarClickCount=");
        sb.append(this.avatarClickCount);
        sb.append(", curTabType=");
        sb.append(this.curTabType);
        sb.append(", userVisibleHint=");
        sb.append(this.userVisibleHint);
        sb.append(", needUpdateAvatarUrl=");
        sb.append(this.needUpdateAvatarUrl);
        sb.append(", livePreviousPage=");
        sb.append(this.livePreviousPage);
        sb.append(", from=");
        sb.append(this.from);
        sb.append(", enterFrom=");
        sb.append(this.enterFrom);
        sb.append(", isPostAwemeEmpty=");
        sb.append(this.isPostAwemeEmpty);
        sb.append(", needShowProfileCollectionGuide=");
        sb.append(this.needShowProfileCollectionGuide);
        sb.append(", isAvatarClicked=");
        sb.append(this.isAvatarClicked);
        sb.append(", isBackgroundCoverClicked=");
        sb.append(this.isBackgroundCoverClicked);
        sb.append(", currentDownloadSetting=");
        sb.append(this.currentDownloadSetting);
        sb.append(", onHiddenChanged=");
        sb.append(this.onHiddenChanged);
        sb.append(", fromSearch=");
        sb.append(this.fromSearch);
        sb.append(")");
        return sb.toString();
    }

    public ProfileState(String str, String str2, User user2, Aweme aweme, C11491a<? extends Pair<? extends UrlModel, ? extends C12131l>> aVar, int i, int i2, boolean z, String str3, String str4, String str5, String str6, Boolean bool, boolean z2, boolean z3, boolean z4, Integer num, boolean z5, String str7) {
        C11491a<? extends Pair<? extends UrlModel, ? extends C12131l>> aVar2 = aVar;
        C7573i.m23587b(aVar, "loadAvatar");
        this.uid = str;
        this.suid = str2;
        this.user = user2;
        this.sourceAweme = aweme;
        this.loadAvatar = aVar2;
        this.avatarClickCount = i;
        this.curTabType = i2;
        this.userVisibleHint = z;
        this.needUpdateAvatarUrl = str3;
        this.livePreviousPage = str4;
        this.from = str5;
        this.enterFrom = str6;
        this.isPostAwemeEmpty = bool;
        this.needShowProfileCollectionGuide = z2;
        this.isAvatarClicked = z3;
        this.isBackgroundCoverClicked = z4;
        this.currentDownloadSetting = num;
        this.onHiddenChanged = z5;
        this.fromSearch = str7;
    }

    public /* synthetic */ ProfileState(String str, String str2, User user2, Aweme aweme, C11491a aVar, int i, int i2, boolean z, String str3, String str4, String str5, String str6, Boolean bool, boolean z2, boolean z3, boolean z4, Integer num, boolean z5, String str7, int i3, C7571f fVar) {
        String str8;
        String str9;
        User user3;
        Aweme aweme2;
        C11491a aVar2;
        int i4;
        int i5;
        boolean z6;
        String str10;
        String str11;
        String str12;
        String str13;
        Boolean bool2;
        boolean z7;
        boolean z8;
        boolean z9;
        Integer num2;
        boolean z10;
        String str14;
        int i6 = i3;
        if ((i6 & 1) != 0) {
            str8 = null;
        } else {
            str8 = str;
        }
        if ((i6 & 2) != 0) {
            str9 = null;
        } else {
            str9 = str2;
        }
        if ((i6 & 4) != 0) {
            user3 = null;
        } else {
            user3 = user2;
        }
        if ((i6 & 8) != 0) {
            aweme2 = null;
        } else {
            aweme2 = aweme;
        }
        if ((i6 & 16) != 0) {
            aVar2 = C11496ae.f31094a;
        } else {
            aVar2 = aVar;
        }
        if ((i6 & 32) != 0) {
            i4 = 0;
        } else {
            i4 = i;
        }
        if ((i6 & 64) != 0) {
            i5 = 0;
        } else {
            i5 = i2;
        }
        if ((i6 & PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH) != 0) {
            z6 = true;
        } else {
            z6 = z;
        }
        if ((i6 & 256) != 0) {
            str10 = null;
        } else {
            str10 = str3;
        }
        if ((i6 & 512) != 0) {
            str11 = "";
        } else {
            str11 = str4;
        }
        if ((i6 & PreloadTask.BYTE_UNIT_NUMBER) != 0) {
            str12 = "";
        } else {
            str12 = str5;
        }
        if ((i6 & 2048) != 0) {
            str13 = "";
        } else {
            str13 = str6;
        }
        if ((i6 & 4096) != 0) {
            bool2 = null;
        } else {
            bool2 = bool;
        }
        if ((i6 & VideoCacheReadBuffersizeExperiment.DEFAULT) != 0) {
            z7 = false;
        } else {
            z7 = z2;
        }
        if ((i6 & 16384) != 0) {
            z8 = false;
        } else {
            z8 = z3;
        }
        if ((i6 & 32768) != 0) {
            z9 = false;
        } else {
            z9 = z4;
        }
        if ((i6 & 65536) != 0) {
            num2 = null;
        } else {
            num2 = num;
        }
        if ((i6 & 131072) != 0) {
            z10 = false;
        } else {
            z10 = z5;
        }
        if ((i6 & 262144) != 0) {
            str14 = "";
        } else {
            str14 = str7;
        }
        this(str8, str9, user3, aweme2, aVar2, i4, i5, z6, str10, str11, str12, str13, bool2, z7, z8, z9, num2, z10, str14);
    }
}

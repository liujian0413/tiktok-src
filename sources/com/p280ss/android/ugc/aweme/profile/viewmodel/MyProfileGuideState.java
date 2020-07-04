package com.p280ss.android.ugc.aweme.profile.viewmodel;

import com.bytedance.jedi.arch.C11670t;
import com.p280ss.android.ugc.aweme.p1049ay.C23142a;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.p280ss.android.ugc.aweme.profile.model.UsedPhoneNoticeMsg;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.profile.viewmodel.MyProfileGuideState */
public final class MyProfileGuideState implements C11670t {
    public static final C36790a Companion = new C36790a(null);
    private final boolean avatarHasLoaded;
    private final Integer currentDownloadSetting;
    private final boolean hasGuideShowed;
    private final boolean hasSurveyDetermined;
    private final Boolean hasUsedPhoneWarnMsg;
    private final Boolean needShowDiskManagerGuide;
    private final boolean postListHasLoaded;
    private final C23142a surveyData;
    private final UsedPhoneNoticeMsg usedPhoneNoticeMsg;

    /* renamed from: com.ss.android.ugc.aweme.profile.viewmodel.MyProfileGuideState$a */
    public static final class C36790a {
        private C36790a() {
        }

        public /* synthetic */ C36790a(C7571f fVar) {
            this();
        }
    }

    public MyProfileGuideState() {
        this(false, false, false, false, null, null, null, null, null, 511, null);
    }

    public static /* synthetic */ MyProfileGuideState copy$default(MyProfileGuideState myProfileGuideState, boolean z, boolean z2, boolean z3, boolean z4, C23142a aVar, Boolean bool, Boolean bool2, UsedPhoneNoticeMsg usedPhoneNoticeMsg2, Integer num, int i, Object obj) {
        MyProfileGuideState myProfileGuideState2 = myProfileGuideState;
        int i2 = i;
        return myProfileGuideState.copy((i2 & 1) != 0 ? myProfileGuideState2.hasGuideShowed : z, (i2 & 2) != 0 ? myProfileGuideState2.postListHasLoaded : z2, (i2 & 4) != 0 ? myProfileGuideState2.avatarHasLoaded : z3, (i2 & 8) != 0 ? myProfileGuideState2.hasSurveyDetermined : z4, (i2 & 16) != 0 ? myProfileGuideState2.surveyData : aVar, (i2 & 32) != 0 ? myProfileGuideState2.needShowDiskManagerGuide : bool, (i2 & 64) != 0 ? myProfileGuideState2.hasUsedPhoneWarnMsg : bool2, (i2 & PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH) != 0 ? myProfileGuideState2.usedPhoneNoticeMsg : usedPhoneNoticeMsg2, (i2 & 256) != 0 ? myProfileGuideState2.currentDownloadSetting : num);
    }

    public final boolean component1() {
        return this.hasGuideShowed;
    }

    public final boolean component2() {
        return this.postListHasLoaded;
    }

    public final boolean component3() {
        return this.avatarHasLoaded;
    }

    public final boolean component4() {
        return this.hasSurveyDetermined;
    }

    public final C23142a component5() {
        return this.surveyData;
    }

    public final Boolean component6() {
        return this.needShowDiskManagerGuide;
    }

    public final Boolean component7() {
        return this.hasUsedPhoneWarnMsg;
    }

    public final UsedPhoneNoticeMsg component8() {
        return this.usedPhoneNoticeMsg;
    }

    public final Integer component9() {
        return this.currentDownloadSetting;
    }

    public final MyProfileGuideState copy(boolean z, boolean z2, boolean z3, boolean z4, C23142a aVar, Boolean bool, Boolean bool2, UsedPhoneNoticeMsg usedPhoneNoticeMsg2, Integer num) {
        MyProfileGuideState myProfileGuideState = new MyProfileGuideState(z, z2, z3, z4, aVar, bool, bool2, usedPhoneNoticeMsg2, num);
        return myProfileGuideState;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MyProfileGuideState) {
                MyProfileGuideState myProfileGuideState = (MyProfileGuideState) obj;
                if (this.hasGuideShowed == myProfileGuideState.hasGuideShowed) {
                    if (this.postListHasLoaded == myProfileGuideState.postListHasLoaded) {
                        if (this.avatarHasLoaded == myProfileGuideState.avatarHasLoaded) {
                            if (!(this.hasSurveyDetermined == myProfileGuideState.hasSurveyDetermined) || !C7573i.m23585a((Object) this.surveyData, (Object) myProfileGuideState.surveyData) || !C7573i.m23585a((Object) this.needShowDiskManagerGuide, (Object) myProfileGuideState.needShowDiskManagerGuide) || !C7573i.m23585a((Object) this.hasUsedPhoneWarnMsg, (Object) myProfileGuideState.hasUsedPhoneWarnMsg) || !C7573i.m23585a((Object) this.usedPhoneNoticeMsg, (Object) myProfileGuideState.usedPhoneNoticeMsg) || !C7573i.m23585a((Object) this.currentDownloadSetting, (Object) myProfileGuideState.currentDownloadSetting)) {
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

    public final boolean getAvatarHasLoaded() {
        return this.avatarHasLoaded;
    }

    public final Integer getCurrentDownloadSetting() {
        return this.currentDownloadSetting;
    }

    public final boolean getHasGuideShowed() {
        return this.hasGuideShowed;
    }

    public final boolean getHasSurveyDetermined() {
        return this.hasSurveyDetermined;
    }

    public final Boolean getHasUsedPhoneWarnMsg() {
        return this.hasUsedPhoneWarnMsg;
    }

    public final Boolean getNeedShowDiskManagerGuide() {
        return this.needShowDiskManagerGuide;
    }

    public final boolean getPostListHasLoaded() {
        return this.postListHasLoaded;
    }

    public final C23142a getSurveyData() {
        return this.surveyData;
    }

    public final UsedPhoneNoticeMsg getUsedPhoneNoticeMsg() {
        return this.usedPhoneNoticeMsg;
    }

    public final int hashCode() {
        boolean z = this.hasGuideShowed;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = (z ? 1 : 0) * true;
        boolean z2 = this.postListHasLoaded;
        if (z2) {
            z2 = true;
        }
        int i3 = (i2 + (z2 ? 1 : 0)) * 31;
        boolean z3 = this.avatarHasLoaded;
        if (z3) {
            z3 = true;
        }
        int i4 = (i3 + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.hasSurveyDetermined;
        if (!z4) {
            i = z4;
        }
        int i5 = (i4 + i) * 31;
        C23142a aVar = this.surveyData;
        int i6 = 0;
        int hashCode = (i5 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        Boolean bool = this.needShowDiskManagerGuide;
        int hashCode2 = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.hasUsedPhoneWarnMsg;
        int hashCode3 = (hashCode2 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        UsedPhoneNoticeMsg usedPhoneNoticeMsg2 = this.usedPhoneNoticeMsg;
        int hashCode4 = (hashCode3 + (usedPhoneNoticeMsg2 != null ? usedPhoneNoticeMsg2.hashCode() : 0)) * 31;
        Integer num = this.currentDownloadSetting;
        if (num != null) {
            i6 = num.hashCode();
        }
        return hashCode4 + i6;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MyProfileGuideState(hasGuideShowed=");
        sb.append(this.hasGuideShowed);
        sb.append(", postListHasLoaded=");
        sb.append(this.postListHasLoaded);
        sb.append(", avatarHasLoaded=");
        sb.append(this.avatarHasLoaded);
        sb.append(", hasSurveyDetermined=");
        sb.append(this.hasSurveyDetermined);
        sb.append(", surveyData=");
        sb.append(this.surveyData);
        sb.append(", needShowDiskManagerGuide=");
        sb.append(this.needShowDiskManagerGuide);
        sb.append(", hasUsedPhoneWarnMsg=");
        sb.append(this.hasUsedPhoneWarnMsg);
        sb.append(", usedPhoneNoticeMsg=");
        sb.append(this.usedPhoneNoticeMsg);
        sb.append(", currentDownloadSetting=");
        sb.append(this.currentDownloadSetting);
        sb.append(")");
        return sb.toString();
    }

    public MyProfileGuideState(boolean z, boolean z2, boolean z3, boolean z4, C23142a aVar, Boolean bool, Boolean bool2, UsedPhoneNoticeMsg usedPhoneNoticeMsg2, Integer num) {
        this.hasGuideShowed = z;
        this.postListHasLoaded = z2;
        this.avatarHasLoaded = z3;
        this.hasSurveyDetermined = z4;
        this.surveyData = aVar;
        this.needShowDiskManagerGuide = bool;
        this.hasUsedPhoneWarnMsg = bool2;
        this.usedPhoneNoticeMsg = usedPhoneNoticeMsg2;
        this.currentDownloadSetting = num;
    }

    public /* synthetic */ MyProfileGuideState(boolean z, boolean z2, boolean z3, boolean z4, C23142a aVar, Boolean bool, Boolean bool2, UsedPhoneNoticeMsg usedPhoneNoticeMsg2, Integer num, int i, C7571f fVar) {
        boolean z5;
        boolean z6;
        boolean z7;
        C23142a aVar2;
        Boolean bool3;
        Boolean bool4;
        UsedPhoneNoticeMsg usedPhoneNoticeMsg3;
        int i2 = i;
        boolean z8 = false;
        if ((i2 & 1) != 0) {
            z5 = false;
        } else {
            z5 = z;
        }
        if ((i2 & 2) != 0) {
            z6 = false;
        } else {
            z6 = z2;
        }
        if ((i2 & 4) != 0) {
            z7 = false;
        } else {
            z7 = z3;
        }
        if ((i2 & 8) == 0) {
            z8 = z4;
        }
        Integer num2 = null;
        if ((i2 & 16) != 0) {
            aVar2 = null;
        } else {
            aVar2 = aVar;
        }
        if ((i2 & 32) != 0) {
            bool3 = null;
        } else {
            bool3 = bool;
        }
        if ((i2 & 64) != 0) {
            bool4 = null;
        } else {
            bool4 = bool2;
        }
        if ((i2 & PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH) != 0) {
            usedPhoneNoticeMsg3 = null;
        } else {
            usedPhoneNoticeMsg3 = usedPhoneNoticeMsg2;
        }
        if ((i2 & 256) == 0) {
            num2 = num;
        }
        this(z5, z6, z7, z8, aVar2, bool3, bool4, usedPhoneNoticeMsg3, num2);
    }
}

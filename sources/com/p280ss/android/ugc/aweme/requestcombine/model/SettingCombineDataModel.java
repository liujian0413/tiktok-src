package com.p280ss.android.ugc.aweme.requestcombine.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.requestcombine.model.SettingCombineDataModel */
public final class SettingCombineDataModel {
    @C6593c(mo15949a = "/aweme/v1/abtest/param/")
    private AbTestCombineModel abTestCombineModel;
    @C6593c(mo15949a = "/aweme/v1/settings/")
    private AwemeSettingCombineModel awemeSetting;
    @C6593c(mo15949a = "/aweme/v1/commerce/settings/")
    private CommerceSettingCombineModel commerceSettingCombineModel;
    @C6593c(mo15949a = "/aweme/v1/compliance/settings/")
    private ComplianceSettingCombineModel complianceSetting;
    @C6593c(mo15949a = "/webcast/setting/")
    private LiveSettingCombineModel liveSetting;
    @C6593c(mo15949a = "/aweme/v1/notice/count/")
    private NoticeCountCombineModel noticeCountModel;
    @C6593c(mo15949a = "/aweme/v1/rate/settings/")
    private RateSettingCombineModel rateSettingCombineModel;
    @C6593c(mo15949a = "/aweme/v1/poi/samecity/active/")
    private SameCityCombineModel sameCityModel;
    @C6593c(mo15949a = "/aweme/v2/platform/share/settings/")
    private ShareSettingCombineModel shareSettingCombineModel;
    @C6593c(mo15949a = "/aweme/v1/user/settings/")
    private UserSettingCombineModel userSettingCombineModel;
    @C6593c(mo15949a = "/aweme/v1/user/yellow_point/")
    private YellowPointCombineModel yellowPointModel;

    public static /* synthetic */ SettingCombineDataModel copy$default(SettingCombineDataModel settingCombineDataModel, AwemeSettingCombineModel awemeSettingCombineModel, UserSettingCombineModel userSettingCombineModel2, CommerceSettingCombineModel commerceSettingCombineModel2, AbTestCombineModel abTestCombineModel2, ShareSettingCombineModel shareSettingCombineModel2, RateSettingCombineModel rateSettingCombineModel2, SameCityCombineModel sameCityCombineModel, NoticeCountCombineModel noticeCountCombineModel, LiveSettingCombineModel liveSettingCombineModel, ComplianceSettingCombineModel complianceSettingCombineModel, YellowPointCombineModel yellowPointCombineModel, int i, Object obj) {
        SettingCombineDataModel settingCombineDataModel2 = settingCombineDataModel;
        int i2 = i;
        return settingCombineDataModel.copy((i2 & 1) != 0 ? settingCombineDataModel2.awemeSetting : awemeSettingCombineModel, (i2 & 2) != 0 ? settingCombineDataModel2.userSettingCombineModel : userSettingCombineModel2, (i2 & 4) != 0 ? settingCombineDataModel2.commerceSettingCombineModel : commerceSettingCombineModel2, (i2 & 8) != 0 ? settingCombineDataModel2.abTestCombineModel : abTestCombineModel2, (i2 & 16) != 0 ? settingCombineDataModel2.shareSettingCombineModel : shareSettingCombineModel2, (i2 & 32) != 0 ? settingCombineDataModel2.rateSettingCombineModel : rateSettingCombineModel2, (i2 & 64) != 0 ? settingCombineDataModel2.sameCityModel : sameCityCombineModel, (i2 & PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH) != 0 ? settingCombineDataModel2.noticeCountModel : noticeCountCombineModel, (i2 & 256) != 0 ? settingCombineDataModel2.liveSetting : liveSettingCombineModel, (i2 & 512) != 0 ? settingCombineDataModel2.complianceSetting : complianceSettingCombineModel, (i2 & PreloadTask.BYTE_UNIT_NUMBER) != 0 ? settingCombineDataModel2.yellowPointModel : yellowPointCombineModel);
    }

    public final AwemeSettingCombineModel component1() {
        return this.awemeSetting;
    }

    public final ComplianceSettingCombineModel component10() {
        return this.complianceSetting;
    }

    public final YellowPointCombineModel component11() {
        return this.yellowPointModel;
    }

    public final UserSettingCombineModel component2() {
        return this.userSettingCombineModel;
    }

    public final CommerceSettingCombineModel component3() {
        return this.commerceSettingCombineModel;
    }

    public final AbTestCombineModel component4() {
        return this.abTestCombineModel;
    }

    public final ShareSettingCombineModel component5() {
        return this.shareSettingCombineModel;
    }

    public final RateSettingCombineModel component6() {
        return this.rateSettingCombineModel;
    }

    public final SameCityCombineModel component7() {
        return this.sameCityModel;
    }

    public final NoticeCountCombineModel component8() {
        return this.noticeCountModel;
    }

    public final LiveSettingCombineModel component9() {
        return this.liveSetting;
    }

    public final SettingCombineDataModel copy(AwemeSettingCombineModel awemeSettingCombineModel, UserSettingCombineModel userSettingCombineModel2, CommerceSettingCombineModel commerceSettingCombineModel2, AbTestCombineModel abTestCombineModel2, ShareSettingCombineModel shareSettingCombineModel2, RateSettingCombineModel rateSettingCombineModel2, SameCityCombineModel sameCityCombineModel, NoticeCountCombineModel noticeCountCombineModel, LiveSettingCombineModel liveSettingCombineModel, ComplianceSettingCombineModel complianceSettingCombineModel, YellowPointCombineModel yellowPointCombineModel) {
        AwemeSettingCombineModel awemeSettingCombineModel2 = awemeSettingCombineModel;
        C7573i.m23587b(awemeSettingCombineModel, "awemeSetting");
        UserSettingCombineModel userSettingCombineModel3 = userSettingCombineModel2;
        C7573i.m23587b(userSettingCombineModel2, "userSettingCombineModel");
        CommerceSettingCombineModel commerceSettingCombineModel3 = commerceSettingCombineModel2;
        C7573i.m23587b(commerceSettingCombineModel3, "commerceSettingCombineModel");
        AbTestCombineModel abTestCombineModel3 = abTestCombineModel2;
        C7573i.m23587b(abTestCombineModel3, "abTestCombineModel");
        ShareSettingCombineModel shareSettingCombineModel3 = shareSettingCombineModel2;
        C7573i.m23587b(shareSettingCombineModel3, "shareSettingCombineModel");
        RateSettingCombineModel rateSettingCombineModel3 = rateSettingCombineModel2;
        C7573i.m23587b(rateSettingCombineModel3, "rateSettingCombineModel");
        SameCityCombineModel sameCityCombineModel2 = sameCityCombineModel;
        C7573i.m23587b(sameCityCombineModel2, "sameCityModel");
        NoticeCountCombineModel noticeCountCombineModel2 = noticeCountCombineModel;
        C7573i.m23587b(noticeCountCombineModel2, "noticeCountModel");
        LiveSettingCombineModel liveSettingCombineModel2 = liveSettingCombineModel;
        C7573i.m23587b(liveSettingCombineModel2, "liveSetting");
        ComplianceSettingCombineModel complianceSettingCombineModel2 = complianceSettingCombineModel;
        C7573i.m23587b(complianceSettingCombineModel2, "complianceSetting");
        YellowPointCombineModel yellowPointCombineModel2 = yellowPointCombineModel;
        C7573i.m23587b(yellowPointCombineModel2, "yellowPointModel");
        SettingCombineDataModel settingCombineDataModel = new SettingCombineDataModel(awemeSettingCombineModel2, userSettingCombineModel3, commerceSettingCombineModel3, abTestCombineModel3, shareSettingCombineModel3, rateSettingCombineModel3, sameCityCombineModel2, noticeCountCombineModel2, liveSettingCombineModel2, complianceSettingCombineModel2, yellowPointCombineModel2);
        return settingCombineDataModel;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0074, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.yellowPointModel, (java.lang.Object) r3.yellowPointModel) != false) goto L_0x0079;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0079
            boolean r0 = r3 instanceof com.p280ss.android.ugc.aweme.requestcombine.model.SettingCombineDataModel
            if (r0 == 0) goto L_0x0077
            com.ss.android.ugc.aweme.requestcombine.model.SettingCombineDataModel r3 = (com.p280ss.android.ugc.aweme.requestcombine.model.SettingCombineDataModel) r3
            com.ss.android.ugc.aweme.requestcombine.model.AwemeSettingCombineModel r0 = r2.awemeSetting
            com.ss.android.ugc.aweme.requestcombine.model.AwemeSettingCombineModel r1 = r3.awemeSetting
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0077
            com.ss.android.ugc.aweme.requestcombine.model.UserSettingCombineModel r0 = r2.userSettingCombineModel
            com.ss.android.ugc.aweme.requestcombine.model.UserSettingCombineModel r1 = r3.userSettingCombineModel
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0077
            com.ss.android.ugc.aweme.requestcombine.model.CommerceSettingCombineModel r0 = r2.commerceSettingCombineModel
            com.ss.android.ugc.aweme.requestcombine.model.CommerceSettingCombineModel r1 = r3.commerceSettingCombineModel
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0077
            com.ss.android.ugc.aweme.requestcombine.model.AbTestCombineModel r0 = r2.abTestCombineModel
            com.ss.android.ugc.aweme.requestcombine.model.AbTestCombineModel r1 = r3.abTestCombineModel
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0077
            com.ss.android.ugc.aweme.requestcombine.model.ShareSettingCombineModel r0 = r2.shareSettingCombineModel
            com.ss.android.ugc.aweme.requestcombine.model.ShareSettingCombineModel r1 = r3.shareSettingCombineModel
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0077
            com.ss.android.ugc.aweme.requestcombine.model.RateSettingCombineModel r0 = r2.rateSettingCombineModel
            com.ss.android.ugc.aweme.requestcombine.model.RateSettingCombineModel r1 = r3.rateSettingCombineModel
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0077
            com.ss.android.ugc.aweme.requestcombine.model.SameCityCombineModel r0 = r2.sameCityModel
            com.ss.android.ugc.aweme.requestcombine.model.SameCityCombineModel r1 = r3.sameCityModel
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0077
            com.ss.android.ugc.aweme.requestcombine.model.NoticeCountCombineModel r0 = r2.noticeCountModel
            com.ss.android.ugc.aweme.requestcombine.model.NoticeCountCombineModel r1 = r3.noticeCountModel
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0077
            com.ss.android.ugc.aweme.requestcombine.model.LiveSettingCombineModel r0 = r2.liveSetting
            com.ss.android.ugc.aweme.requestcombine.model.LiveSettingCombineModel r1 = r3.liveSetting
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0077
            com.ss.android.ugc.aweme.requestcombine.model.ComplianceSettingCombineModel r0 = r2.complianceSetting
            com.ss.android.ugc.aweme.requestcombine.model.ComplianceSettingCombineModel r1 = r3.complianceSetting
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0077
            com.ss.android.ugc.aweme.requestcombine.model.YellowPointCombineModel r0 = r2.yellowPointModel
            com.ss.android.ugc.aweme.requestcombine.model.YellowPointCombineModel r3 = r3.yellowPointModel
            boolean r3 = kotlin.jvm.internal.C7573i.m23585a(r0, r3)
            if (r3 == 0) goto L_0x0077
            goto L_0x0079
        L_0x0077:
            r3 = 0
            return r3
        L_0x0079:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.requestcombine.model.SettingCombineDataModel.equals(java.lang.Object):boolean");
    }

    public final AbTestCombineModel getAbTestCombineModel() {
        return this.abTestCombineModel;
    }

    public final AwemeSettingCombineModel getAwemeSetting() {
        return this.awemeSetting;
    }

    public final CommerceSettingCombineModel getCommerceSettingCombineModel() {
        return this.commerceSettingCombineModel;
    }

    public final ComplianceSettingCombineModel getComplianceSetting() {
        return this.complianceSetting;
    }

    public final LiveSettingCombineModel getLiveSetting() {
        return this.liveSetting;
    }

    public final NoticeCountCombineModel getNoticeCountModel() {
        return this.noticeCountModel;
    }

    public final RateSettingCombineModel getRateSettingCombineModel() {
        return this.rateSettingCombineModel;
    }

    public final SameCityCombineModel getSameCityModel() {
        return this.sameCityModel;
    }

    public final ShareSettingCombineModel getShareSettingCombineModel() {
        return this.shareSettingCombineModel;
    }

    public final UserSettingCombineModel getUserSettingCombineModel() {
        return this.userSettingCombineModel;
    }

    public final YellowPointCombineModel getYellowPointModel() {
        return this.yellowPointModel;
    }

    public final int hashCode() {
        AwemeSettingCombineModel awemeSettingCombineModel = this.awemeSetting;
        int i = 0;
        int hashCode = (awemeSettingCombineModel != null ? awemeSettingCombineModel.hashCode() : 0) * 31;
        UserSettingCombineModel userSettingCombineModel2 = this.userSettingCombineModel;
        int hashCode2 = (hashCode + (userSettingCombineModel2 != null ? userSettingCombineModel2.hashCode() : 0)) * 31;
        CommerceSettingCombineModel commerceSettingCombineModel2 = this.commerceSettingCombineModel;
        int hashCode3 = (hashCode2 + (commerceSettingCombineModel2 != null ? commerceSettingCombineModel2.hashCode() : 0)) * 31;
        AbTestCombineModel abTestCombineModel2 = this.abTestCombineModel;
        int hashCode4 = (hashCode3 + (abTestCombineModel2 != null ? abTestCombineModel2.hashCode() : 0)) * 31;
        ShareSettingCombineModel shareSettingCombineModel2 = this.shareSettingCombineModel;
        int hashCode5 = (hashCode4 + (shareSettingCombineModel2 != null ? shareSettingCombineModel2.hashCode() : 0)) * 31;
        RateSettingCombineModel rateSettingCombineModel2 = this.rateSettingCombineModel;
        int hashCode6 = (hashCode5 + (rateSettingCombineModel2 != null ? rateSettingCombineModel2.hashCode() : 0)) * 31;
        SameCityCombineModel sameCityCombineModel = this.sameCityModel;
        int hashCode7 = (hashCode6 + (sameCityCombineModel != null ? sameCityCombineModel.hashCode() : 0)) * 31;
        NoticeCountCombineModel noticeCountCombineModel = this.noticeCountModel;
        int hashCode8 = (hashCode7 + (noticeCountCombineModel != null ? noticeCountCombineModel.hashCode() : 0)) * 31;
        LiveSettingCombineModel liveSettingCombineModel = this.liveSetting;
        int hashCode9 = (hashCode8 + (liveSettingCombineModel != null ? liveSettingCombineModel.hashCode() : 0)) * 31;
        ComplianceSettingCombineModel complianceSettingCombineModel = this.complianceSetting;
        int hashCode10 = (hashCode9 + (complianceSettingCombineModel != null ? complianceSettingCombineModel.hashCode() : 0)) * 31;
        YellowPointCombineModel yellowPointCombineModel = this.yellowPointModel;
        if (yellowPointCombineModel != null) {
            i = yellowPointCombineModel.hashCode();
        }
        return hashCode10 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SettingCombineDataModel(awemeSetting=");
        sb.append(this.awemeSetting);
        sb.append(", userSettingCombineModel=");
        sb.append(this.userSettingCombineModel);
        sb.append(", commerceSettingCombineModel=");
        sb.append(this.commerceSettingCombineModel);
        sb.append(", abTestCombineModel=");
        sb.append(this.abTestCombineModel);
        sb.append(", shareSettingCombineModel=");
        sb.append(this.shareSettingCombineModel);
        sb.append(", rateSettingCombineModel=");
        sb.append(this.rateSettingCombineModel);
        sb.append(", sameCityModel=");
        sb.append(this.sameCityModel);
        sb.append(", noticeCountModel=");
        sb.append(this.noticeCountModel);
        sb.append(", liveSetting=");
        sb.append(this.liveSetting);
        sb.append(", complianceSetting=");
        sb.append(this.complianceSetting);
        sb.append(", yellowPointModel=");
        sb.append(this.yellowPointModel);
        sb.append(")");
        return sb.toString();
    }

    public final void setAbTestCombineModel(AbTestCombineModel abTestCombineModel2) {
        C7573i.m23587b(abTestCombineModel2, "<set-?>");
        this.abTestCombineModel = abTestCombineModel2;
    }

    public final void setAwemeSetting(AwemeSettingCombineModel awemeSettingCombineModel) {
        C7573i.m23587b(awemeSettingCombineModel, "<set-?>");
        this.awemeSetting = awemeSettingCombineModel;
    }

    public final void setCommerceSettingCombineModel(CommerceSettingCombineModel commerceSettingCombineModel2) {
        C7573i.m23587b(commerceSettingCombineModel2, "<set-?>");
        this.commerceSettingCombineModel = commerceSettingCombineModel2;
    }

    public final void setComplianceSetting(ComplianceSettingCombineModel complianceSettingCombineModel) {
        C7573i.m23587b(complianceSettingCombineModel, "<set-?>");
        this.complianceSetting = complianceSettingCombineModel;
    }

    public final void setLiveSetting(LiveSettingCombineModel liveSettingCombineModel) {
        C7573i.m23587b(liveSettingCombineModel, "<set-?>");
        this.liveSetting = liveSettingCombineModel;
    }

    public final void setNoticeCountModel(NoticeCountCombineModel noticeCountCombineModel) {
        C7573i.m23587b(noticeCountCombineModel, "<set-?>");
        this.noticeCountModel = noticeCountCombineModel;
    }

    public final void setRateSettingCombineModel(RateSettingCombineModel rateSettingCombineModel2) {
        C7573i.m23587b(rateSettingCombineModel2, "<set-?>");
        this.rateSettingCombineModel = rateSettingCombineModel2;
    }

    public final void setSameCityModel(SameCityCombineModel sameCityCombineModel) {
        C7573i.m23587b(sameCityCombineModel, "<set-?>");
        this.sameCityModel = sameCityCombineModel;
    }

    public final void setShareSettingCombineModel(ShareSettingCombineModel shareSettingCombineModel2) {
        C7573i.m23587b(shareSettingCombineModel2, "<set-?>");
        this.shareSettingCombineModel = shareSettingCombineModel2;
    }

    public final void setUserSettingCombineModel(UserSettingCombineModel userSettingCombineModel2) {
        C7573i.m23587b(userSettingCombineModel2, "<set-?>");
        this.userSettingCombineModel = userSettingCombineModel2;
    }

    public final void setYellowPointModel(YellowPointCombineModel yellowPointCombineModel) {
        C7573i.m23587b(yellowPointCombineModel, "<set-?>");
        this.yellowPointModel = yellowPointCombineModel;
    }

    public SettingCombineDataModel(AwemeSettingCombineModel awemeSettingCombineModel, UserSettingCombineModel userSettingCombineModel2, CommerceSettingCombineModel commerceSettingCombineModel2, AbTestCombineModel abTestCombineModel2, ShareSettingCombineModel shareSettingCombineModel2, RateSettingCombineModel rateSettingCombineModel2, SameCityCombineModel sameCityCombineModel, NoticeCountCombineModel noticeCountCombineModel, LiveSettingCombineModel liveSettingCombineModel, ComplianceSettingCombineModel complianceSettingCombineModel, YellowPointCombineModel yellowPointCombineModel) {
        C7573i.m23587b(awemeSettingCombineModel, "awemeSetting");
        C7573i.m23587b(userSettingCombineModel2, "userSettingCombineModel");
        C7573i.m23587b(commerceSettingCombineModel2, "commerceSettingCombineModel");
        C7573i.m23587b(abTestCombineModel2, "abTestCombineModel");
        C7573i.m23587b(shareSettingCombineModel2, "shareSettingCombineModel");
        C7573i.m23587b(rateSettingCombineModel2, "rateSettingCombineModel");
        C7573i.m23587b(sameCityCombineModel, "sameCityModel");
        C7573i.m23587b(noticeCountCombineModel, "noticeCountModel");
        C7573i.m23587b(liveSettingCombineModel, "liveSetting");
        C7573i.m23587b(complianceSettingCombineModel, "complianceSetting");
        C7573i.m23587b(yellowPointCombineModel, "yellowPointModel");
        this.awemeSetting = awemeSettingCombineModel;
        this.userSettingCombineModel = userSettingCombineModel2;
        this.commerceSettingCombineModel = commerceSettingCombineModel2;
        this.abTestCombineModel = abTestCombineModel2;
        this.shareSettingCombineModel = shareSettingCombineModel2;
        this.rateSettingCombineModel = rateSettingCombineModel2;
        this.sameCityModel = sameCityCombineModel;
        this.noticeCountModel = noticeCountCombineModel;
        this.liveSetting = liveSettingCombineModel;
        this.complianceSetting = complianceSettingCombineModel;
        this.yellowPointModel = yellowPointCombineModel;
    }
}

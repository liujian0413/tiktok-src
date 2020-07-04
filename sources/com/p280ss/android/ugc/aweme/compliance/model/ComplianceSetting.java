package com.p280ss.android.ugc.aweme.compliance.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.AlgoFreeInfo;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.C7571f;

/* renamed from: com.ss.android.ugc.aweme.compliance.model.ComplianceSetting */
public final class ComplianceSetting extends BaseResponse implements Serializable {
    @C6593c(mo15949a = "algo_free_enabled")
    private final Boolean algoFreeEnabled;
    @C6593c(mo15949a = "algo_free_info")
    private final AlgoFreeInfo algoFreeInfo;
    @C6593c(mo15949a = "settings_black_menu_list")
    private final List<String> blackSetting;
    @C6593c(mo15949a = "default_vpa_content_choice")
    private final Integer defaultVpaContentChoice;
    @C6593c(mo15949a = "enable_do_not_sell_data")
    private final Integer enableDoNotSell;
    @C6593c(mo15949a = "enable_impressum")
    private final Integer enableImpressum;
    @C6593c(mo15949a = "enable_vpa")
    private final Boolean enableVpa;
    @C6593c(mo15949a = "impressum_url")
    private final String impressumUrl;
    @C6593c(mo15949a = "about_privacy_policy_url")
    private final String privacyPolicyUrl;
    @C6593c(mo15949a = "teens_mode_alert_count")
    private final Integer teensModeAlertCount;
    @C6593c(mo15949a = "vpa_info_bar_url")
    private final String vpaInfoBarUrl;

    public static /* synthetic */ ComplianceSetting copy$default(ComplianceSetting complianceSetting, List list, Integer num, String str, String str2, Integer num2, String str3, Boolean bool, Integer num3, Integer num4, Boolean bool2, AlgoFreeInfo algoFreeInfo2, int i, Object obj) {
        ComplianceSetting complianceSetting2 = complianceSetting;
        int i2 = i;
        return complianceSetting.copy((i2 & 1) != 0 ? complianceSetting2.blackSetting : list, (i2 & 2) != 0 ? complianceSetting2.enableImpressum : num, (i2 & 4) != 0 ? complianceSetting2.impressumUrl : str, (i2 & 8) != 0 ? complianceSetting2.privacyPolicyUrl : str2, (i2 & 16) != 0 ? complianceSetting2.enableDoNotSell : num2, (i2 & 32) != 0 ? complianceSetting2.vpaInfoBarUrl : str3, (i2 & 64) != 0 ? complianceSetting2.enableVpa : bool, (i2 & PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH) != 0 ? complianceSetting2.defaultVpaContentChoice : num3, (i2 & 256) != 0 ? complianceSetting2.teensModeAlertCount : num4, (i2 & 512) != 0 ? complianceSetting2.algoFreeEnabled : bool2, (i2 & PreloadTask.BYTE_UNIT_NUMBER) != 0 ? complianceSetting2.algoFreeInfo : algoFreeInfo2);
    }

    public final List<String> component1() {
        return this.blackSetting;
    }

    public final Boolean component10() {
        return this.algoFreeEnabled;
    }

    public final AlgoFreeInfo component11() {
        return this.algoFreeInfo;
    }

    public final Integer component2() {
        return this.enableImpressum;
    }

    public final String component3() {
        return this.impressumUrl;
    }

    public final String component4() {
        return this.privacyPolicyUrl;
    }

    public final Integer component5() {
        return this.enableDoNotSell;
    }

    public final String component6() {
        return this.vpaInfoBarUrl;
    }

    public final Boolean component7() {
        return this.enableVpa;
    }

    public final Integer component8() {
        return this.defaultVpaContentChoice;
    }

    public final Integer component9() {
        return this.teensModeAlertCount;
    }

    public final ComplianceSetting copy(List<String> list, Integer num, String str, String str2, Integer num2, String str3, Boolean bool, Integer num3, Integer num4, Boolean bool2, AlgoFreeInfo algoFreeInfo2) {
        ComplianceSetting complianceSetting = new ComplianceSetting(list, num, str, str2, num2, str3, bool, num3, num4, bool2, algoFreeInfo2);
        return complianceSetting;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0074, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.algoFreeInfo, (java.lang.Object) r3.algoFreeInfo) != false) goto L_0x0079;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0079
            boolean r0 = r3 instanceof com.p280ss.android.ugc.aweme.compliance.model.ComplianceSetting
            if (r0 == 0) goto L_0x0077
            com.ss.android.ugc.aweme.compliance.model.ComplianceSetting r3 = (com.p280ss.android.ugc.aweme.compliance.model.ComplianceSetting) r3
            java.util.List<java.lang.String> r0 = r2.blackSetting
            java.util.List<java.lang.String> r1 = r3.blackSetting
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0077
            java.lang.Integer r0 = r2.enableImpressum
            java.lang.Integer r1 = r3.enableImpressum
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0077
            java.lang.String r0 = r2.impressumUrl
            java.lang.String r1 = r3.impressumUrl
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0077
            java.lang.String r0 = r2.privacyPolicyUrl
            java.lang.String r1 = r3.privacyPolicyUrl
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0077
            java.lang.Integer r0 = r2.enableDoNotSell
            java.lang.Integer r1 = r3.enableDoNotSell
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0077
            java.lang.String r0 = r2.vpaInfoBarUrl
            java.lang.String r1 = r3.vpaInfoBarUrl
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0077
            java.lang.Boolean r0 = r2.enableVpa
            java.lang.Boolean r1 = r3.enableVpa
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0077
            java.lang.Integer r0 = r2.defaultVpaContentChoice
            java.lang.Integer r1 = r3.defaultVpaContentChoice
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0077
            java.lang.Integer r0 = r2.teensModeAlertCount
            java.lang.Integer r1 = r3.teensModeAlertCount
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0077
            java.lang.Boolean r0 = r2.algoFreeEnabled
            java.lang.Boolean r1 = r3.algoFreeEnabled
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0077
            com.ss.android.ugc.aweme.AlgoFreeInfo r0 = r2.algoFreeInfo
            com.ss.android.ugc.aweme.AlgoFreeInfo r3 = r3.algoFreeInfo
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
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.compliance.model.ComplianceSetting.equals(java.lang.Object):boolean");
    }

    public final Boolean getAlgoFreeEnabled() {
        return this.algoFreeEnabled;
    }

    public final AlgoFreeInfo getAlgoFreeInfo() {
        return this.algoFreeInfo;
    }

    public final List<String> getBlackSetting() {
        return this.blackSetting;
    }

    public final Integer getDefaultVpaContentChoice() {
        return this.defaultVpaContentChoice;
    }

    public final Integer getEnableDoNotSell() {
        return this.enableDoNotSell;
    }

    public final Integer getEnableImpressum() {
        return this.enableImpressum;
    }

    public final Boolean getEnableVpa() {
        return this.enableVpa;
    }

    public final String getImpressumUrl() {
        return this.impressumUrl;
    }

    public final String getPrivacyPolicyUrl() {
        return this.privacyPolicyUrl;
    }

    public final Integer getTeensModeAlertCount() {
        return this.teensModeAlertCount;
    }

    public final String getVpaInfoBarUrl() {
        return this.vpaInfoBarUrl;
    }

    public final int hashCode() {
        List<String> list = this.blackSetting;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        Integer num = this.enableImpressum;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        String str = this.impressumUrl;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.privacyPolicyUrl;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Integer num2 = this.enableDoNotSell;
        int hashCode5 = (hashCode4 + (num2 != null ? num2.hashCode() : 0)) * 31;
        String str3 = this.vpaInfoBarUrl;
        int hashCode6 = (hashCode5 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Boolean bool = this.enableVpa;
        int hashCode7 = (hashCode6 + (bool != null ? bool.hashCode() : 0)) * 31;
        Integer num3 = this.defaultVpaContentChoice;
        int hashCode8 = (hashCode7 + (num3 != null ? num3.hashCode() : 0)) * 31;
        Integer num4 = this.teensModeAlertCount;
        int hashCode9 = (hashCode8 + (num4 != null ? num4.hashCode() : 0)) * 31;
        Boolean bool2 = this.algoFreeEnabled;
        int hashCode10 = (hashCode9 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        AlgoFreeInfo algoFreeInfo2 = this.algoFreeInfo;
        if (algoFreeInfo2 != null) {
            i = algoFreeInfo2.hashCode();
        }
        return hashCode10 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ComplianceSetting(blackSetting=");
        sb.append(this.blackSetting);
        sb.append(", enableImpressum=");
        sb.append(this.enableImpressum);
        sb.append(", impressumUrl=");
        sb.append(this.impressumUrl);
        sb.append(", privacyPolicyUrl=");
        sb.append(this.privacyPolicyUrl);
        sb.append(", enableDoNotSell=");
        sb.append(this.enableDoNotSell);
        sb.append(", vpaInfoBarUrl=");
        sb.append(this.vpaInfoBarUrl);
        sb.append(", enableVpa=");
        sb.append(this.enableVpa);
        sb.append(", defaultVpaContentChoice=");
        sb.append(this.defaultVpaContentChoice);
        sb.append(", teensModeAlertCount=");
        sb.append(this.teensModeAlertCount);
        sb.append(", algoFreeEnabled=");
        sb.append(this.algoFreeEnabled);
        sb.append(", algoFreeInfo=");
        sb.append(this.algoFreeInfo);
        sb.append(")");
        return sb.toString();
    }

    public ComplianceSetting(List<String> list, Integer num, String str, String str2, Integer num2, String str3, Boolean bool, Integer num3, Integer num4, Boolean bool2, AlgoFreeInfo algoFreeInfo2) {
        this.blackSetting = list;
        this.enableImpressum = num;
        this.impressumUrl = str;
        this.privacyPolicyUrl = str2;
        this.enableDoNotSell = num2;
        this.vpaInfoBarUrl = str3;
        this.enableVpa = bool;
        this.defaultVpaContentChoice = num3;
        this.teensModeAlertCount = num4;
        this.algoFreeEnabled = bool2;
        this.algoFreeInfo = algoFreeInfo2;
    }

    public /* synthetic */ ComplianceSetting(List list, Integer num, String str, String str2, Integer num2, String str3, Boolean bool, Integer num3, Integer num4, Boolean bool2, AlgoFreeInfo algoFreeInfo2, int i, C7571f fVar) {
        Integer num5;
        Boolean bool3;
        int i2 = i;
        if ((i2 & PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH) != 0) {
            num5 = Integer.valueOf(1);
        } else {
            num5 = num3;
        }
        if ((i2 & 512) != 0) {
            bool3 = Boolean.valueOf(false);
        } else {
            bool3 = bool2;
        }
        this(list, num, str, str2, num2, str3, bool, num5, num4, bool3, algoFreeInfo2);
    }
}

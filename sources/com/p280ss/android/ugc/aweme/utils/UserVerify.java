package com.p280ss.android.ugc.aweme.utils;

import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import kotlin.jvm.internal.C7571f;

/* renamed from: com.ss.android.ugc.aweme.utils.UserVerify */
public final class UserVerify {
    private final UrlModel avatarThumb;
    private final String customVerify;
    private final String enterpriseVerifyReason;
    private final Integer verificationType;
    private final String weiboVerify;

    public UserVerify() {
        this(null, null, null, null, null, 31, null);
    }

    public final UrlModel getAvatarThumb() {
        return this.avatarThumb;
    }

    public final String getCustomVerify() {
        return this.customVerify;
    }

    public final String getEnterpriseVerifyReason() {
        return this.enterpriseVerifyReason;
    }

    public final Integer getVerificationType() {
        return this.verificationType;
    }

    public final String getWeiboVerify() {
        return this.weiboVerify;
    }

    public UserVerify(UrlModel urlModel, String str, String str2, Integer num, String str3) {
        this.avatarThumb = urlModel;
        this.customVerify = str;
        this.enterpriseVerifyReason = str2;
        this.verificationType = num;
        this.weiboVerify = str3;
    }

    public /* synthetic */ UserVerify(UrlModel urlModel, String str, String str2, Integer num, String str3, int i, C7571f fVar) {
        UrlModel urlModel2;
        String str4;
        String str5;
        String str6;
        if ((i & 1) != 0) {
            urlModel2 = null;
        } else {
            urlModel2 = urlModel;
        }
        if ((i & 2) != 0) {
            str4 = null;
        } else {
            str4 = str;
        }
        if ((i & 4) != 0) {
            str5 = null;
        } else {
            str5 = str2;
        }
        if ((i & 8) != 0) {
            num = Integer.valueOf(-1);
        }
        Integer num2 = num;
        if ((i & 16) != 0) {
            str6 = null;
        } else {
            str6 = str3;
        }
        this(urlModel2, str4, str5, num2, str6);
    }
}

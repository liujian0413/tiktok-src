package com.p280ss.android.ugc.aweme.account.login.p975v2.p977ui;

import com.p280ss.android.ugc.aweme.account.login.p975v2.base.BaseAccountFlowFragment;
import com.p280ss.android.ugc.aweme.account.login.p975v2.base.Step;
import com.p280ss.android.ugc.aweme.account.login.p975v2.p977ui.fragments.AgeGateFragment;
import com.p280ss.android.ugc.aweme.account.login.p975v2.p977ui.fragments.CreatePasswordFragment;
import com.p280ss.android.ugc.aweme.account.login.p975v2.p977ui.fragments.EmailPasswordLoginFragment;
import com.p280ss.android.ugc.aweme.account.login.p975v2.p977ui.fragments.EmailSignUpFragment;
import com.p280ss.android.ugc.aweme.account.login.p975v2.p977ui.fragments.InputCodeFragment;
import com.p280ss.android.ugc.aweme.account.login.p975v2.p977ui.fragments.InputEmailFragment;
import com.p280ss.android.ugc.aweme.account.login.p975v2.p977ui.fragments.InputPasswordFragment;
import com.p280ss.android.ugc.aweme.account.login.p975v2.p977ui.fragments.InputPhoneFragment;
import com.p280ss.android.ugc.aweme.account.login.p975v2.p977ui.fragments.PhoneEmailLoginFragment;
import com.p280ss.android.ugc.aweme.account.login.p975v2.p977ui.fragments.PhoneEmailSignUpFragment;
import com.p280ss.android.ugc.aweme.account.login.p975v2.p977ui.fragments.PhoneLoginFragment;
import com.p280ss.android.ugc.aweme.account.login.p975v2.p977ui.fragments.PhoneSignUpFragment;
import com.p280ss.android.ugc.aweme.account.login.p975v2.p977ui.fragments.SetUserNameFragment;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.j */
public final class C22151j {

    /* renamed from: a */
    public static final C22151j f59188a = new C22151j();

    private C22151j() {
    }

    /* renamed from: b */
    public static int m73595b(Step step) {
        C7573i.m23587b(step, "step");
        switch (C22152k.f59190b[step.ordinal()]) {
            case 1:
                return 4;
            case 2:
                return 7;
            case 3:
                return 1;
            case 4:
                return 0;
            default:
                throw new IllegalArgumentException("此step暂不支持");
        }
    }

    /* renamed from: a */
    public static BaseAccountFlowFragment m73594a(Step step) {
        C7573i.m23587b(step, "step");
        switch (C22152k.f59189a[step.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                return new CreatePasswordFragment();
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                return new InputCodeFragment();
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                return new AgeGateFragment();
            case 18:
            case 19:
            case 20:
                return new InputPhoneFragment();
            case 21:
                return new InputEmailFragment();
            case 22:
                return new InputPasswordFragment();
            case 23:
                return new PhoneEmailLoginFragment();
            case 24:
                return new PhoneEmailSignUpFragment();
            case 25:
                return new SetUserNameFragment();
            case BaseNotice.STORY_NOTICE_COMMENT /*26*/:
            case BaseNotice.STORY_NOTICE_UPDATE /*27*/:
                return new EmailPasswordLoginFragment();
            case 28:
                return new PhoneLoginFragment();
            case 29:
                return new PhoneSignUpFragment();
            case 30:
                return new EmailSignUpFragment();
            default:
                throw new IllegalArgumentException("此step暂不支持");
        }
    }
}

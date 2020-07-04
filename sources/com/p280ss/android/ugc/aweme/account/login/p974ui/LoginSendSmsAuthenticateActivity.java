package com.p280ss.android.ugc.aweme.account.login.p974ui;

import android.app.Activity;
import com.facebook.ads.AdError;
import com.p280ss.android.ugc.aweme.account.base.activity.AmeBaseActivity;
import com.p280ss.android.ugc.aweme.account.login.utils.PhoneNumberUtil.PhoneNumber;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.account.login.ui.LoginSendSmsAuthenticateActivity */
public final class LoginSendSmsAuthenticateActivity extends AmeBaseActivity {

    /* renamed from: k */
    public static final C21832a f58445k = new C21832a(null);

    /* renamed from: com.ss.android.ugc.aweme.account.login.ui.LoginSendSmsAuthenticateActivity$a */
    public static final class C21832a {
        private C21832a() {
        }

        /* renamed from: a */
        public static void m72969a(Activity activity, PhoneNumber phoneNumber, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i) {
            C7573i.m23587b(activity, "activity");
            C7573i.m23587b(phoneNumber, "smsUseMobile");
            C7573i.m23587b(str7, "profileKey");
        }

        public /* synthetic */ C21832a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: a */
    public static final void m72968a(Activity activity, PhoneNumber phoneNumber, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i) {
        C21832a.m72969a(activity, phoneNumber, str, str2, str3, str4, str5, str6, str7, AdError.INTERNAL_ERROR_CODE);
    }
}

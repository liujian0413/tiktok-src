package com.p280ss.android.mobilelib;

import com.p280ss.android.p284b.C19223b;

/* renamed from: com.ss.android.mobilelib.MobileApiPath */
public final class MobileApiPath {
    public static final String USER_BIND_MOBILE = m65702si("/passport/mobile/bind/v2/");
    public static final String USER_CHANGE_MOBILE = m65702si("/passport/mobile/change/");
    public static final String USER_CHANGE_PASSWORD = m65702si("/passport/password/change/");
    public static final String USER_LOGIN = m65702si("/passport/mobile/login/");
    public static final String USER_REFRESH_CAPTCHA = m65702si("/passport/mobile/refresh_captcha/");
    public static final String USER_REGISTER = m65702si("/passport/mobile/register/");
    public static final String USER_RESET_PASSWORD = m65702si("/passport/password/reset/");
    public static final String USER_SEND_CODE = m65702si("/passport/mobile/send_code/");
    public static final String USER_UNBIND_MOBILE = m65702si("/user/mobile/unbind_mobile/");

    /* renamed from: si */
    static String m65702si(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(C19223b.f51890e);
        sb.append(str);
        return sb.toString();
    }
}

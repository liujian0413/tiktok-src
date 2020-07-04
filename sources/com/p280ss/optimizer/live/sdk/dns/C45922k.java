package com.p280ss.optimizer.live.sdk.dns;

import android.text.TextUtils;
import java.util.concurrent.Callable;
import java.util.regex.Pattern;

/* renamed from: com.ss.optimizer.live.sdk.dns.k */
abstract class C45922k implements Callable<C45921j> {

    /* renamed from: b */
    private static Pattern f117388b;

    /* renamed from: a */
    protected final String f117389a;

    C45922k(String str) {
        this.f117389a = str;
    }

    /* renamed from: a */
    static boolean m144032a(String str) {
        if (f117388b == null) {
            f117388b = Pattern.compile("^(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)\\.(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)\\.(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)\\.(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)$");
        }
        if (TextUtils.isEmpty(str) || str.length() < 7 || str.length() > 15 || !f117388b.matcher(str).matches()) {
            return false;
        }
        return true;
    }
}

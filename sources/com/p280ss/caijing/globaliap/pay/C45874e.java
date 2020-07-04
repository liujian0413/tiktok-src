package com.p280ss.caijing.globaliap.pay;

import android.os.Bundle;

/* renamed from: com.ss.caijing.globaliap.pay.e */
public final class C45874e {
    /* renamed from: c */
    public static Bundle m143964c() {
        Bundle bundle = new Bundle();
        bundle.putInt("pay_result_code", 1);
        Bundle bundle2 = new Bundle();
        bundle2.putInt("pay_result_detail_code", 5);
        bundle.putBundle("pay_result_extra", bundle2);
        return bundle;
    }

    /* renamed from: a */
    public static Bundle m143958a() {
        Bundle bundle = new Bundle();
        bundle.putInt("pay_result_code", 1);
        Bundle bundle2 = new Bundle();
        bundle2.putInt("pay_result_detail_code", 1);
        bundle2.putString("pay_result_msg", "cancel");
        bundle.putBundle("pay_result_extra", bundle2);
        return bundle;
    }

    /* renamed from: b */
    public static Bundle m143962b() {
        Bundle bundle = new Bundle();
        bundle.putInt("pay_result_code", 1);
        Bundle bundle2 = new Bundle();
        bundle2.putInt("pay_result_detail_code", 3);
        bundle2.putString("pay_result_msg", "inner error");
        bundle.putBundle("pay_result_extra", bundle2);
        return bundle;
    }

    /* renamed from: b */
    public static Bundle m143963b(String str) {
        Bundle bundle = new Bundle();
        bundle.putInt("pay_result_code", 1);
        Bundle bundle2 = new Bundle();
        bundle2.putInt("pay_result_detail_code", 194);
        bundle2.putString("pay_result_msg", str);
        bundle.putBundle("pay_result_extra", bundle2);
        return bundle;
    }

    /* renamed from: a */
    public static Bundle m143960a(String str) {
        Bundle bundle = new Bundle();
        bundle.putInt("pay_result_code", 1);
        Bundle bundle2 = new Bundle();
        bundle2.putInt("pay_result_detail_code", 2);
        bundle2.putString("pay_result_msg", str);
        bundle.putBundle("pay_result_extra", bundle2);
        return bundle;
    }

    /* renamed from: a */
    public static Bundle m143961a(String str, Bundle bundle) {
        Bundle a = m143959a(197, str);
        Bundle bundle2 = a.getBundle("pay_result_extra");
        if (bundle2 != null) {
            bundle2.putBundle("pay_result_bundle", bundle);
        }
        return a;
    }

    /* renamed from: a */
    public static Bundle m143959a(int i, String str) {
        if (i == 101) {
            return m143958a();
        }
        Bundle bundle = new Bundle();
        bundle.putInt("pay_result_code", 1);
        Bundle bundle2 = new Bundle();
        bundle2.putInt("pay_result_detail_code", i);
        bundle2.putString("pay_result_msg", str);
        bundle.putBundle("pay_result_extra", bundle2);
        return bundle;
    }
}

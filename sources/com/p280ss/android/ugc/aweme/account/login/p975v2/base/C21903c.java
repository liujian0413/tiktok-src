package com.p280ss.android.ugc.aweme.account.login.p975v2.base;

import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import com.p280ss.android.ugc.aweme.account.login.utils.PhoneNumberUtil.PhoneNumber;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.base.c */
public final class C21903c {

    /* renamed from: a */
    public static final C21903c f58624a = new C21903c();

    private C21903c() {
    }

    /* renamed from: a */
    public static String m73113a(Bundle bundle) {
        C7573i.m23587b(bundle, "data");
        String string = bundle.getString("args_email");
        if (string == null) {
            return "";
        }
        return string;
    }

    /* renamed from: b */
    public static PhoneNumber m73116b(Bundle bundle) {
        C7573i.m23587b(bundle, "data");
        return (PhoneNumber) bundle.getSerializable("args_phone_number");
    }

    /* renamed from: b */
    public final PhoneNumber mo58353b(Fragment fragment) {
        C7573i.m23587b(fragment, "fragment");
        Bundle arguments = fragment.getArguments();
        if (arguments == null) {
            C7573i.m23580a();
        }
        C7573i.m23582a((Object) arguments, "fragment.arguments!!");
        return m73116b(arguments);
    }

    /* renamed from: a */
    public final String mo58352a(Fragment fragment) {
        C7573i.m23587b(fragment, "fragment");
        Bundle arguments = fragment.getArguments();
        if (arguments == null) {
            C7573i.m23580a();
        }
        C7573i.m23582a((Object) arguments, "fragment.arguments!!");
        return m73113a(arguments);
    }

    /* renamed from: a */
    public static void m73114a(Fragment fragment, PhoneNumber phoneNumber) {
        C7573i.m23587b(fragment, "fragment");
        C7573i.m23587b(phoneNumber, "phone");
        Bundle arguments = fragment.getArguments();
        if (arguments == null) {
            C7573i.m23580a();
        }
        arguments.putSerializable("args_phone_number", phoneNumber);
    }

    /* renamed from: a */
    public static void m73115a(Fragment fragment, String str) {
        C7573i.m23587b(fragment, "fragment");
        C7573i.m23587b(str, "email");
        Bundle arguments = fragment.getArguments();
        if (arguments == null) {
            C7573i.m23580a();
        }
        arguments.putString("args_email", str);
    }
}

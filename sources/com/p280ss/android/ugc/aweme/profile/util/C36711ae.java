package com.p280ss.android.ugc.aweme.profile.util;

import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.profile.model.User;

/* renamed from: com.ss.android.ugc.aweme.profile.util.ae */
public class C36711ae {

    /* renamed from: a */
    private static final boolean f96354a = C7163a.m22363a();

    /* renamed from: b */
    private static volatile C36711ae f96355b;

    private C36711ae() {
        if (f96355b != null) {
            throw new RuntimeException("Illegal access.");
        }
    }

    /* renamed from: a */
    public static C36711ae m118365a() {
        if (f96355b == null) {
            synchronized (C36711ae.class) {
                if (f96355b == null) {
                    f96355b = new C36711ae();
                }
            }
        }
        return f96355b;
    }

    /* renamed from: a */
    public static boolean m118366a(User user) {
        if (user == null || user.getUserRate() < 2 || user.getUserRate() > 6) {
            return false;
        }
        return true;
    }
}

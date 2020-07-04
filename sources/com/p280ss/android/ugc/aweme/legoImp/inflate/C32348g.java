package com.p280ss.android.ugc.aweme.legoImp.inflate;

import android.content.SharedPreferences;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.p340x.C7285c;

/* renamed from: com.ss.android.ugc.aweme.legoImp.inflate.g */
public final class C32348g {

    /* renamed from: a */
    private static SharedPreferences f84456a;

    /* renamed from: b */
    private static int f84457b;

    /* renamed from: a */
    public static int m104915a() {
        return f84457b;
    }

    static {
        SharedPreferences a = C7285c.m22838a(C6399b.m19921a(), "aweme-app", 0);
        f84456a = a;
        f84457b = a.getInt("x2c_switch", 2);
    }

    /* renamed from: a */
    public static void m104916a(int i) {
        f84457b = i;
        f84456a.edit().putInt("x2c_switch", i).commit();
    }
}

package com.p280ss.android.ugc.aweme.account.util;

import com.bytedance.sdk.account.p645a.p646a.C12707b;
import com.p280ss.android.ugc.aweme.C21671bd;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.account.util.o */
public final class C22338o {

    /* renamed from: a */
    public static final C22338o f59605a = new C22338o();

    private C22338o() {
    }

    /* renamed from: a */
    private static boolean m73947a(Integer num) {
        if (num == null || num.intValue() < 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static final String m73945a(C12707b bVar) {
        Integer num;
        String str = null;
        if (bVar != null) {
            num = Integer.valueOf(bVar.f33702b);
        } else {
            num = null;
        }
        if (bVar != null) {
            str = bVar.f33703c;
        }
        return m73946a(num, str);
    }

    /* renamed from: a */
    public static final String m73946a(Integer num, String str) {
        String str2;
        boolean z;
        if (!m73947a(num)) {
            CharSequence charSequence = str;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return str;
            }
        }
        if (C21671bd.m72532b() == null) {
            str2 = "Sorry, error occurred";
        } else {
            str2 = C21671bd.m72532b().getString(R.string.cjs);
        }
        C7573i.m23582a((Object) str2, "if (ModuleStore.getAppli…navailable)\n            }");
        return str2;
    }
}

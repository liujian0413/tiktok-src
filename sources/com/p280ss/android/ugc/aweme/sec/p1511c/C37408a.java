package com.p280ss.android.ugc.aweme.sec.p1511c;

import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.sec.c.a */
public final class C37408a {

    /* renamed from: a */
    public static final C37408a f97698a = new C37408a();

    private C37408a() {
    }

    /* renamed from: a */
    public static boolean m120034a(String str) {
        boolean z;
        C7573i.m23587b(str, "url");
        CharSequence charSequence = str;
        if (charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z || (!C7634n.m23776c(charSequence, (CharSequence) "/passport/", false) && !C7634n.m23776c(charSequence, (CharSequence) "/login/", false))) {
            return false;
        }
        return true;
    }
}

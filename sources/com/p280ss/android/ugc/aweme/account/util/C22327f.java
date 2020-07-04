package com.p280ss.android.ugc.aweme.account.util;

import android.os.Bundle;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.account.util.f */
public final class C22327f {

    /* renamed from: a */
    public static final C22327f f59599a = new C22327f();

    private C22327f() {
    }

    /* renamed from: a */
    public static final void m73923a(String str, Bundle bundle) {
        C7573i.m23587b(str, "logTag");
        if (bundle != null) {
            Set keySet = bundle.keySet();
            if (keySet != null) {
                Iterator it = keySet.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        }
    }
}

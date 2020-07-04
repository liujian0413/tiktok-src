package com.p280ss.android.ugc.aweme.router;

import android.app.Activity;
import android.view.View;
import com.p280ss.android.ugc.aweme.router.C7195s.C7202b;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.router.o */
public final class C37281o implements C37273j {

    /* renamed from: a */
    private final C7202b f97399a;

    public C37281o(C7202b bVar) {
        C7573i.m23587b(bVar, "routerOpen");
        this.f97399a = bVar;
    }

    /* renamed from: b */
    private final String m119737b(String str) {
        if (str == null) {
            return null;
        }
        return this.f97399a.mo18692a(str);
    }

    /* renamed from: a */
    public final boolean mo59315a(String str) {
        boolean z;
        String b = m119737b(str);
        CharSequence charSequence = b;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return false;
        }
        return C7195s.m22438a().mo18682a(b);
    }

    /* renamed from: a */
    public final boolean mo59313a(Activity activity, String str) {
        boolean z;
        String b = m119737b(str);
        CharSequence charSequence = b;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return false;
        }
        return C7195s.m22438a().mo18679a(activity, b);
    }

    /* renamed from: a */
    public final boolean mo59314a(Activity activity, String str, View view) {
        boolean z;
        String b = m119737b(str);
        CharSequence charSequence = b;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return false;
        }
        return C7195s.m22438a().mo18681a(activity, b, view);
    }
}

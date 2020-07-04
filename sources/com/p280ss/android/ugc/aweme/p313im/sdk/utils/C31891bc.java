package com.p280ss.android.ugc.aweme.p313im.sdk.utils;

import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C31085i;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.router.C7203u;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.utils.bc */
public final class C31891bc {

    /* renamed from: a */
    public static final C31891bc f83361a = new C31891bc();

    private C31891bc() {
    }

    /* renamed from: a */
    public static void m103605a(String str) {
        boolean z;
        CharSequence charSequence = str;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            C7195s a = C7195s.m22438a();
            StringBuilder sb = new StringBuilder("aweme://user/profile/");
            sb.append(str);
            a.mo18682a(C7203u.m22460a(sb.toString()).mo18694a("sec_user_id", C31085i.f81578a.mo81569a(str)).mo18694a("previous_page_position", "other_places").mo18694a("previous_page", "message").mo18694a("enter_from", "chat").mo18695a());
        }
    }

    /* renamed from: a */
    public final void mo82730a(String str, String str2) {
        boolean z;
        CharSequence charSequence = str2;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            m103605a(str);
            return;
        }
        C7195s a = C7195s.m22438a();
        StringBuilder sb = new StringBuilder("aweme://user/profile/");
        sb.append(str);
        a.mo18682a(C7203u.m22460a(sb.toString()).mo18694a("sec_user_id", str2).mo18694a("previous_page_position", "other_places").mo18694a("previous_page", "message").mo18694a("enter_from", "chat").mo18695a());
    }
}

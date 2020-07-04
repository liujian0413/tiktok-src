package com.p280ss.android.ugc.aweme.commercialize.utils.p1134a.p1135a;

import android.net.Uri;
import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.app.C22909c;
import com.p280ss.android.ugc.aweme.app.C22912d;
import com.p280ss.android.ugc.aweme.commercialize.utils.p1137c.C25340d;
import com.p280ss.android.ugc.aweme.miniapp_api.C33447f;
import com.p280ss.android.ugc.aweme.qrcode.p1498d.C37073c;
import com.p280ss.android.ugc.aweme.router.C7195s;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.a.a.c */
public final class C25185c extends C25183a {
    /* renamed from: e */
    private final String m82853e() {
        return mo65816d().f66432c.f66459a;
    }

    /* renamed from: a */
    public final boolean mo65817a() {
        String str;
        if (TextUtils.isEmpty(m82853e()) || C33447f.m108191d(m82853e())) {
            return false;
        }
        Uri parse = Uri.parse(m82853e());
        C7573i.m23582a((Object) parse, "Uri.parse(openUrl)");
        String scheme = parse.getScheme();
        if (scheme == null) {
            str = null;
        } else if (scheme != null) {
            str = scheme.toLowerCase();
            C7573i.m23582a((Object) str, "(this as java.lang.String).toLowerCase()");
        } else {
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
        if (m82852a(str) || C37073c.m119203c(m82853e())) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo65818b() {
        String str;
        Uri parse = Uri.parse(m82853e());
        C7573i.m23582a((Object) parse, "Uri.parse(openUrl)");
        String scheme = parse.getScheme();
        if (scheme == null) {
            str = null;
        } else if (scheme != null) {
            str = scheme.toLowerCase();
            C7573i.m23582a((Object) str, "(this as java.lang.String).toLowerCase()");
        } else {
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
        if (m82852a(str)) {
            C25340d.m83270a(m82853e());
            return C22912d.f60645e.mo59887a(mo65815c(), m82853e(), (String) null);
        } else if (C37073c.m119203c(m82853e())) {
            return C7195s.m22438a().mo18682a(m82853e());
        } else {
            return false;
        }
    }

    /* renamed from: a */
    private static boolean m82852a(String str) {
        CharSequence charSequence = str;
        if (TextUtils.isEmpty(charSequence)) {
            return false;
        }
        if (TextUtils.equals(C22909c.f60637a, charSequence) || TextUtils.equals(C22909c.f60639c, charSequence)) {
            return true;
        }
        return false;
    }
}

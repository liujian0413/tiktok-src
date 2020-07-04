package com.p280ss.android.ugc.aweme.router;

import android.net.Uri;
import android.net.Uri.Builder;
import com.p280ss.android.ugc.aweme.router.C7195s.C7202b;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;
import kotlin.sequences.C7605h;

/* renamed from: com.ss.android.ugc.aweme.router.e */
public final class C37263e implements C7202b {

    /* renamed from: a */
    public static final C37263e f97390a = new C37263e();

    /* renamed from: com.ss.android.ugc.aweme.router.e$a */
    static final class C37264a extends Lambda implements C7562b<String, Boolean> {

        /* renamed from: a */
        public static final C37264a f97391a = new C37264a();

        C37264a() {
            super(1);
        }

        /* renamed from: a */
        private static boolean m119726a(String str) {
            return !C7573i.m23585a((Object) str, (Object) "cid");
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(m119726a((String) obj));
        }
    }

    private C37263e() {
    }

    /* renamed from: a */
    public static final C37273j m119724a() {
        return new C37281o(f97390a);
    }

    /* renamed from: a */
    public final String mo18692a(String str) {
        boolean z;
        if (str == null) {
            return "";
        }
        Uri parse = Uri.parse(str);
        String queryParameter = parse.getQueryParameter("cid");
        CharSequence charSequence = queryParameter;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "";
        }
        StringBuilder sb = new StringBuilder("aweme://challenge/detail/");
        sb.append(queryParameter);
        Builder buildUpon = Uri.parse(sb.toString()).buildUpon();
        C7573i.m23582a((Object) parse, "uri");
        Set queryParameterNames = parse.getQueryParameterNames();
        C7573i.m23582a((Object) queryParameterNames, "uri.queryParameterNames");
        Iterator a = C7605h.m23653a(C7525m.m23526p(queryParameterNames), (C7562b<? super T, Boolean>) C37264a.f97391a).mo19416a();
        while (a.hasNext()) {
            String str2 = (String) a.next();
            buildUpon.appendQueryParameter(str2, parse.getQueryParameter(str2));
        }
        String builder = buildUpon.toString();
        C7573i.m23582a((Object) builder, "clientUriBuilder.toString()");
        return builder;
    }
}

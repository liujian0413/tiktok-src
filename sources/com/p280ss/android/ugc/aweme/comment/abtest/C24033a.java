package com.p280ss.android.ugc.aweme.comment.abtest;

import com.p280ss.android.ugc.aweme.app.C6877n;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;

/* renamed from: com.ss.android.ugc.aweme.comment.abtest.a */
public final class C24033a {
    /* renamed from: a */
    public static void m78867a(String str) {
        C6877n.m21447a("comment_not_show", new C6869c().mo16887a("comment_not_show_message", str).mo16888b());
    }

    /* renamed from: b */
    public static void m78868b(String str) {
        StringBuilder sb = new StringBuilder("NOTICE:");
        sb.append(str);
        m78867a(sb.toString());
    }
}

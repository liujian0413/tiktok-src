package com.p280ss.android.ugc.aweme.comment.p1098e;

import com.p280ss.android.ugc.aweme.comment.api.CommentApi;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.comment.e.r */
final /* synthetic */ class C24122r implements Callable {

    /* renamed from: a */
    private final String f63772a;

    /* renamed from: b */
    private final String f63773b;

    /* renamed from: c */
    private final boolean f63774c;

    C24122r(String str, String str2, boolean z) {
        this.f63772a = str;
        this.f63773b = str2;
        this.f63774c = z;
    }

    public final Object call() {
        return CommentApi.m79009a(this.f63772a, this.f63773b, this.f63774c);
    }
}

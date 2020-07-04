package com.p280ss.android.ugc.aweme.comment.p1098e;

import com.p280ss.android.ugc.aweme.comment.api.CommentApi;
import com.p280ss.android.ugc.aweme.comment.p1101h.C24151g;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.comment.e.k */
final /* synthetic */ class C24114k implements Callable {

    /* renamed from: a */
    private final Object[] f63754a;

    C24114k(Object[] objArr) {
        this.f63754a = objArr;
    }

    public final Object call() {
        return CommentApi.m79014a(this.f63754a[0], C24151g.m79362a() ? 1 : 0);
    }
}

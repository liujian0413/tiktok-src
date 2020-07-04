package com.p280ss.android.ugc.aweme.comment.p1098e;

import com.p280ss.android.ugc.aweme.app.p1029d.C22915b;
import com.p280ss.android.ugc.aweme.base.C23397p;
import com.p280ss.android.ugc.aweme.comment.api.CommentApi;
import com.p280ss.android.ugc.aweme.comment.model.BaseCommentResponse;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.comment.e.e */
public final class C24106e extends C24102b<BaseCommentResponse> {

    /* renamed from: b */
    public String f63738b = "";

    /* renamed from: c */
    public String f63739c = "";

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo62511a(Object obj) {
    }

    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length != 4) {
            return false;
        }
        return true;
    }

    public final boolean sendRequest(final Object... objArr) {
        if (!super.sendRequest(objArr)) {
            return false;
        }
        C23397p.m76735a().mo60807a(this.mHandler, new Callable() {
            public final Object call() throws Exception {
                C24106e.this.f63738b = (String) objArr[0];
                C24106e.this.f63739c = (String) objArr[1];
                return CommentApi.m79011a((String) objArr[0], (String) objArr[1], (String) objArr[2], C22915b.m75418a((String) objArr[3]));
            }
        }, 0);
        return true;
    }
}

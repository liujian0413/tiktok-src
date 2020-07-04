package com.p280ss.android.ugc.aweme.comment.p1098e;

import com.p280ss.android.ugc.aweme.base.C23397p;
import com.p280ss.android.ugc.aweme.comment.api.CommentApi;
import com.p280ss.android.ugc.aweme.comment.model.BaseCommentResponse;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.comment.e.c */
public final class C24103c extends C24102b<BaseCommentResponse> {

    /* renamed from: b */
    public String f63734b = "";

    /* renamed from: c */
    public String f63735c = "";

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo62511a(Object obj) {
    }

    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length != 1) {
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
                C24103c.this.f63734b = (String) objArr[0];
                return CommentApi.m79010a((String) objArr[0]);
            }
        }, 0);
        return true;
    }
}

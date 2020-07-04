package com.p280ss.android.ugc.aweme.comment.p1098e;

import com.p280ss.android.ugc.aweme.base.C23397p;
import com.p280ss.android.ugc.aweme.comment.model.CommentResponse;

/* renamed from: com.ss.android.ugc.aweme.comment.e.j */
public final class C24113j extends C24102b<CommentResponse> {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo62511a(Object obj) {
    }

    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length != 1) {
            return false;
        }
        return true;
    }

    public final boolean sendRequest(Object... objArr) {
        if (!super.sendRequest(objArr)) {
            return false;
        }
        C23397p.m76735a().mo60807a(this.mHandler, new C24114k(objArr), 0);
        return true;
    }
}

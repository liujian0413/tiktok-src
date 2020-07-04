package com.p280ss.android.ugc.aweme.comment.p1098e;

import com.p280ss.android.ugc.aweme.base.C23397p;
import com.p280ss.android.ugc.aweme.comment.api.CommentApi;
import com.p280ss.android.ugc.aweme.comment.model.CommentShareableResponse;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.comment.e.o */
public final class C24118o extends C24102b<CommentShareableResponse> {

    /* renamed from: b */
    public String f63765b = "";

    /* renamed from: c */
    public String f63766c = "";

    /* renamed from: d */
    public int f63767d;

    /* renamed from: e */
    public String f63768e = "";

    /* renamed from: f */
    public String f63769f = "";

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo62511a(CommentShareableResponse commentShareableResponse) {
        if (commentShareableResponse != null) {
            this.f63767d = commentShareableResponse.shareStatus;
            this.f63768e = commentShareableResponse.toast;
            this.f63769f = commentShareableResponse.status_msg;
        }
    }

    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length != 2) {
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
                C24118o.this.f63765b = (String) objArr[0];
                return CommentApi.m79015a((String) objArr[0], (String) objArr[1]);
            }
        }, 0);
        return true;
    }
}

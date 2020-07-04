package com.p280ss.android.ugc.aweme.comment.p1098e;

import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException;
import com.p280ss.android.ugc.aweme.common.C25652b;
import kotlin.jvm.internal.C7571f;

/* renamed from: com.ss.android.ugc.aweme.comment.e.s */
public final class C24123s extends C25652b<C24121q, C24128w> {

    /* renamed from: a */
    public static final C24124a f63775a = new C24124a(null);

    /* renamed from: com.ss.android.ugc.aweme.comment.e.s$a */
    public static final class C24124a {
        private C24124a() {
        }

        public /* synthetic */ C24124a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: b */
    public final void mo56977b() {
        String str;
        if (this.f67572c != null) {
            C24128w wVar = (C24128w) this.f67572c;
            if (wVar != null) {
                C24121q qVar = (C24121q) this.f67571b;
                if (qVar != null) {
                    BaseResponse baseResponse = (BaseResponse) qVar.getData();
                    if (baseResponse != null) {
                        str = baseResponse.status_msg;
                        wVar.mo62543c(str);
                    }
                }
                str = null;
                wVar.mo62543c(str);
            }
        }
    }

    /* renamed from: a */
    public final void mo57296a(Exception exc) {
        if (this.f67572c != null && (exc instanceof ApiServerException)) {
            ApiServerException apiServerException = (ApiServerException) exc;
            if (apiServerException.getErrorCode() == 13) {
                C24128w wVar = (C24128w) this.f67572c;
                if (wVar != null) {
                    wVar.mo62543c(apiServerException.getErrorMsg());
                }
            }
        }
    }
}

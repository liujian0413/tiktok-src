package com.p280ss.android.ugc.trill.share.api;

import com.p280ss.android.ugc.aweme.base.C23397p;
import com.p280ss.android.ugc.aweme.common.C25640a;
import com.p280ss.android.ugc.aweme.common.C25652b;
import com.p280ss.android.ugc.aweme.share.C38242l;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.trill.share.api.a */
public final class C45079a extends C25652b<C25640a<AutoShare>, C38242l> {
    public C45079a() {
        mo66536a(new C25640a<AutoShare>() {
            public final boolean checkParams(Object... objArr) {
                if (objArr == null || objArr.length != 10) {
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
                        return ShareApi.m142195a((String) objArr[0], (String) objArr[1], (String) objArr[2], (String) objArr[3], (String) objArr[4], (String) objArr[5], (String) objArr[6], (String) objArr[7], (String) objArr[8], (String) objArr[9]);
                    }
                }, 0);
                return true;
            }
        });
    }

    /* renamed from: b */
    public final void mo56977b() {
        AutoShare autoShare;
        if (this.f67571b == null) {
            autoShare = null;
        } else {
            autoShare = (AutoShare) this.f67571b.getData();
        }
        if (autoShare != null && this.f67572c != null) {
            ((C38242l) this.f67572c).mo95578a();
        }
    }

    /* renamed from: a */
    public final void mo57296a(Exception exc) {
        if (this.f67572c != null) {
            ((C38242l) this.f67572c).mo95580b();
        }
    }
}

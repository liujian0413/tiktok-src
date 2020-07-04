package com.p280ss.android.ugc.aweme.notification.p1435d;

import com.p280ss.android.ugc.aweme.notice.repo.list.bean.NoticeResponse;
import com.p280ss.android.ugc.aweme.notification.C34441f.C34442a;
import com.p280ss.android.ugc.aweme.notification.api.NoticeApiManager;
import com.p280ss.android.ugc.aweme.p1355k.p1356a.C32263a;
import com.p280ss.android.ugc.aweme.p313im.service.p326f.C7102a;
import p346io.reactivex.C7498y;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.ss.android.ugc.aweme.notification.d.d */
public abstract class C34427d extends C7102a {
    /* renamed from: g */
    public int mo87750g() {
        return -1;
    }

    /* renamed from: f */
    public void mo87749f() {
        int g = mo87750g();
        if (g == 16 || g == 19 || g == 47 || g == 60) {
            C32263a.m104774a().markSessionInMsgHelperRead(mo87750g(), this.f19946j);
        }
    }

    /* renamed from: i */
    public final void mo87752i() {
        NoticeApiManager.m111259a(Integer.valueOf(mo87750g())).mo19304b(C7333a.m23046d()).mo19294a(C47549a.m148327a()).mo19189a((C7498y<? super T>) new C7498y<NoticeResponse>() {
            public final void onComplete() {
            }

            public final void onError(Throwable th) {
            }

            public final /* bridge */ /* synthetic */ void onNext(Object obj) {
            }

            public final void onSubscribe(C7321c cVar) {
                C34442a.m111399b(C34427d.this.mo87750g(), C34427d.this.f19945i / 1000);
                C32263a.m104774a().deleteNoticeSession(C34427d.this);
            }
        });
    }
}

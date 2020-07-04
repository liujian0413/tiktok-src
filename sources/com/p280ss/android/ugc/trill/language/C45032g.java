package com.p280ss.android.ugc.trill.language;

import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.setting.serverpush.model.ContentLanguage;
import com.p280ss.android.ugc.aweme.unlogin.C42760d;
import com.p280ss.android.ugc.trill.language.api.C45018a;
import com.p280ss.android.ugc.trill.language.api.LanguageApi;
import p346io.reactivex.C7498y;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C47562b;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.ss.android.ugc.trill.language.g */
public final class C45032g {

    /* renamed from: a */
    public C47562b f115741a = new C47562b();

    /* renamed from: b */
    public C45034a f115742b;

    /* renamed from: c */
    private LanguageApi f115743c = C45018a.m142011a();

    /* renamed from: com.ss.android.ugc.trill.language.g$a */
    public interface C45034a {
        /* renamed from: a */
        void mo107515a();

        /* renamed from: a */
        void mo107518a(Throwable th);
    }

    /* renamed from: a */
    public final void mo107553a() {
        this.f115741a.mo119660a();
    }

    /* renamed from: b */
    private void m142038b(ContentLanguage contentLanguage, int i) {
        if (i == 0) {
            C42760d.m135712a(contentLanguage.getLanguageCode());
        } else {
            C42760d.m135710a(contentLanguage);
        }
        this.f115742b.mo107515a();
    }

    /* renamed from: a */
    public final void mo107554a(ContentLanguage contentLanguage, int i) {
        if (!C6861a.m21337f().isLogin()) {
            m142038b(contentLanguage, i);
        } else {
            this.f115743c.setContentLanguage("content_language", contentLanguage.getLanguageCode(), i).mo19304b(C7333a.m23044b()).mo19294a(C47549a.m148327a()).mo19189a((C7498y<? super T>) new C7498y<BaseResponse>() {
                public final void onComplete() {
                }

                public final void onSubscribe(C7321c cVar) {
                }

                public final void onError(Throwable th) {
                    if (C45032g.this.f115742b != null) {
                        C45032g.this.f115742b.mo107518a(th);
                    }
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public void onNext(BaseResponse baseResponse) {
                    if (baseResponse != null && baseResponse.status_code == 0 && C45032g.this.f115742b != null) {
                        C45032g.this.f115742b.mo107515a();
                    }
                }
            });
        }
    }
}

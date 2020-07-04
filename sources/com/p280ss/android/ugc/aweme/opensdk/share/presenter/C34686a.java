package com.p280ss.android.ugc.aweme.opensdk.share.presenter;

import android.arch.lifecycle.C0043i;
import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.opensdk.share.api.C34679a;
import com.p280ss.android.ugc.aweme.opensdk.share.api.ClientScopesApi;
import com.p280ss.android.ugc.aweme.opensdk.share.data.ClientKeyScopesResponse;
import com.p280ss.android.ugc.aweme.opensdk.share.data.ClientKeyScopesResponse.DataBean.ScopesBean;
import p346io.reactivex.C7498y;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C47562b;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.ss.android.ugc.aweme.opensdk.share.presenter.a */
public final class C34686a {

    /* renamed from: a */
    public C47562b f90464a = new C47562b();

    /* renamed from: b */
    public ClientKeyScopesResponse f90465b;

    /* renamed from: c */
    private ClientScopesApi f90466c = C34679a.m111976a();

    /* renamed from: com.ss.android.ugc.aweme.opensdk.share.presenter.a$a */
    public interface C34688a {
        /* renamed from: a */
        void mo88013a();

        /* renamed from: a */
        void mo88014a(String str);

        /* renamed from: b */
        void mo88015b();
    }

    /* renamed from: a */
    public final boolean mo88012a() {
        if (this.f90465b == null || this.f90465b.getData() == null || this.f90465b.getData().getScopes() == null) {
            return false;
        }
        for (ScopesBean name : this.f90465b.getData().getScopes()) {
            if (TextUtils.equals(name.getName(), "hashtag")) {
                return true;
            }
        }
        return false;
    }

    public C34686a(C0043i iVar) {
        iVar.getLifecycle().mo55a(new ClientKeyScopesPresenter$1(this));
    }

    /* renamed from: a */
    public static boolean m111986a(ClientKeyScopesResponse clientKeyScopesResponse) {
        if (clientKeyScopesResponse == null || clientKeyScopesResponse.getData() == null || clientKeyScopesResponse.getData().getScopes() == null) {
            return false;
        }
        for (ScopesBean name : clientKeyScopesResponse.getData().getScopes()) {
            if (TextUtils.equals(name.getName(), "aweme.share")) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo88011a(String str, String str2, final C34688a aVar) {
        this.f90466c.getClientScopes(str, str2).mo19304b(C7333a.m23044b()).mo19294a(C47549a.m148327a()).mo19189a((C7498y<? super T>) new C7498y<ClientKeyScopesResponse>() {
            public final void onComplete() {
            }

            public final void onError(Throwable th) {
                aVar.mo88015b();
            }

            public final void onSubscribe(C7321c cVar) {
                C34686a.this.f90464a.mo119661a(cVar);
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onNext(ClientKeyScopesResponse clientKeyScopesResponse) {
                C34686a.this.f90465b = clientKeyScopesResponse;
                if (C34686a.m111986a(clientKeyScopesResponse)) {
                    aVar.mo88014a(clientKeyScopesResponse.getData().getAppName());
                } else {
                    aVar.mo88013a();
                }
            }
        });
    }
}

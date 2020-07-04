package com.p280ss.android.ugc.aweme.policy;

import android.app.Activity;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.base.C23397p;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.Collection;
import p346io.reactivex.C7498y;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.ss.android.ugc.aweme.policy.c */
public final class C35495c implements C6310a {

    /* renamed from: a */
    private C6309f f93143a = new C6309f(Looper.getMainLooper(), this);

    /* renamed from: b */
    private Activity f93144b;

    /* renamed from: c */
    public final void mo90300c() {
        if (this.f93143a != null) {
            this.f93143a.removeCallbacksAndMessages(null);
        }
    }

    /* renamed from: a */
    public final void mo90297a() {
        if (this.f93144b != null) {
            C23397p.m76735a().mo60807a(this.f93143a, C35497d.f93146a, 0);
        }
    }

    /* renamed from: b */
    public final void mo90299b() {
        if (this.f93144b != null) {
            PolicyApi.m114654b().mo19304b(C7333a.m23044b()).mo19294a(C47549a.m148327a()).mo19189a((C7498y<? super T>) new C7498y<BaseResponse>() {
                public final void onComplete() {
                }

                public final void onError(Throwable th) {
                }

                public final void onSubscribe(C7321c cVar) {
                }

                public final /* synthetic */ void onNext(Object obj) {
                    m114663a((BaseResponse) obj);
                }

                /* renamed from: a */
                private static void m114663a(BaseResponse baseResponse) {
                    if (baseResponse != null && baseResponse.status_code == 0) {
                        C6861a.m21337f().getCurUser().setAcceptPrivatePolicy(true);
                    }
                }
            });
        }
    }

    public C35495c(Activity activity) {
        this.f93144b = activity;
    }

    /* renamed from: b */
    private void m114658b(int i) {
        if (this.f93144b != null) {
            C23397p.m76735a().mo60807a(this.f93143a, new C35498e(i), 1);
        }
    }

    public final void handleMsg(Message message) {
        if (message.what != 0) {
            if (message.what == 2 && message.obj != null && (message.obj instanceof BaseResponse) && ((BaseResponse) message.obj).status_code == 0) {
                C21115b.m71197a().queryUser();
            }
        } else if (message.obj != null && (message.obj instanceof Policy)) {
            try {
                Policy policy = (Policy) message.obj;
                if (policy.isDisplay() && !this.f93144b.isFinishing() && !C6307b.m19566a((Collection<T>) policy.getConfigs())) {
                    new PolicyDialog(this.f93144b, (C35491b) policy.getConfigs().get(0), new C35499f(this, policy)).show();
                }
            } catch (Exception unused) {
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo90298a(Policy policy, View view) {
        m114658b(((C35491b) policy.getConfigs().get(0)).f93135c);
    }
}

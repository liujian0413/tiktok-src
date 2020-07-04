package com.p280ss.android.ugc.aweme.profile.viewmodel;

import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.Lifecycle.Event;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.p1487ui.C36337ai;
import com.p280ss.android.ugc.aweme.userservice.api.C42846a;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;
import kotlin.reflect.C7585d;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.ss.android.ugc.aweme.profile.viewmodel.FollowViewModel */
public final class FollowViewModel implements C0042h {

    /* renamed from: a */
    public final C0043i f96512a;

    /* renamed from: b */
    private C7321c f96513b;

    /* renamed from: com.ss.android.ugc.aweme.profile.viewmodel.FollowViewModel$a */
    static final class C36773a<T> implements C7326g<BaseResponse> {

        /* renamed from: a */
        final /* synthetic */ C7326g f96514a;

        /* renamed from: com.ss.android.ugc.aweme.profile.viewmodel.FollowViewModel$a$a */
        static final /* synthetic */ class C36775a extends FunctionReference implements C7561a<Integer> {
            C36775a(User user) {
                super(0, user);
            }

            public final String getName() {
                return "getFansCount";
            }

            public final C7585d getOwner() {
                return C7575l.m23595a(User.class);
            }

            public final String getSignature() {
                return "getFansCount()I";
            }

            /* renamed from: a */
            private int m118533a() {
                return ((User) this.receiver).getFansCount();
            }

            public final /* synthetic */ Object invoke() {
                return Integer.valueOf(m118533a());
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.profile.viewmodel.FollowViewModel$a$b */
        static final /* synthetic */ class C36776b extends FunctionReference implements C7562b<Integer, C7581n> {
            C36776b(User user) {
                super(1, user);
            }

            public final String getName() {
                return "setFansCount";
            }

            public final C7585d getOwner() {
                return C7575l.m23595a(User.class);
            }

            public final String getSignature() {
                return "setFansCount(I)V";
            }

            /* renamed from: a */
            private void m118534a(int i) {
                ((User) this.receiver).setFansCount(i);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                m118534a(((Number) obj).intValue());
                return C7581n.f20898a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.profile.viewmodel.FollowViewModel$a$c */
        static final /* synthetic */ class C36777c extends FunctionReference implements C7561a<Integer> {
            C36777c(User user) {
                super(0, user);
            }

            public final String getName() {
                return "getFollowerCount";
            }

            public final C7585d getOwner() {
                return C7575l.m23595a(User.class);
            }

            public final String getSignature() {
                return "getFollowerCount()I";
            }

            /* renamed from: a */
            private int m118535a() {
                return ((User) this.receiver).getFollowerCount();
            }

            public final /* synthetic */ Object invoke() {
                return Integer.valueOf(m118535a());
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.profile.viewmodel.FollowViewModel$a$d */
        static final /* synthetic */ class C36778d extends FunctionReference implements C7562b<Integer, C7581n> {
            C36778d(User user) {
                super(1, user);
            }

            public final String getName() {
                return "setFollowerCount";
            }

            public final C7585d getOwner() {
                return C7575l.m23595a(User.class);
            }

            public final String getSignature() {
                return "setFollowerCount(I)V";
            }

            /* renamed from: a */
            private void m118536a(int i) {
                ((User) this.receiver).setFollowerCount(i);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                m118536a(((Number) obj).intValue());
                return C7581n.f20898a;
            }
        }

        C36773a(C7326g gVar) {
            this.f96514a = gVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(BaseResponse baseResponse) {
            IAccountUserService a = C21115b.m71197a();
            C7573i.m23582a((Object) a, "AccountUserProxyService.get()");
            User curUser = a.getCurUser();
            C7563m mVar = C367741.f96515a;
            if (C36337ai.m117567a(curUser)) {
                mVar.invoke(new C36775a(curUser), new C36776b(curUser));
            } else {
                mVar.invoke(new C36777c(curUser), new C36778d(curUser));
            }
            this.f96514a.accept(baseResponse);
        }
    }

    @C0054q(mo125a = Event.ON_DESTROY)
    public final void onDestroy() {
        C7321c cVar = this.f96513b;
        if (cVar != null) {
            cVar.dispose();
        }
    }

    public FollowViewModel(C0043i iVar) {
        C7573i.m23587b(iVar, "lifecycleOwner");
        this.f96512a = iVar;
        this.f96512a.getLifecycle().mo55a(this);
    }

    /* renamed from: a */
    public final void mo93105a(String str, C7326g<BaseResponse> gVar, C7326g<Throwable> gVar2) {
        C7573i.m23587b(gVar, "onNext");
        C7573i.m23587b(gVar2, "onError");
        C7321c cVar = this.f96513b;
        if (cVar != null) {
            cVar.dispose();
        }
        this.f96513b = ((C42846a) ServiceManager.get().getService(C42846a.class)).mo104557b(str).mo19304b(C7333a.m23044b()).mo19294a(C47549a.m148327a()).mo19280a((C7326g<? super T>) new C36773a<Object>(gVar), gVar2);
    }
}

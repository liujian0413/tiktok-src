package com.p280ss.android.ugc.aweme.account;

import android.os.Bundle;
import bolts.C1591g;
import bolts.C1592h;
import com.p280ss.android.ugc.aweme.C21671bd;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.login.bean.C21350a;
import com.p280ss.android.ugc.aweme.account.util.C22352y;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.account.c */
public final class C21151c {

    /* renamed from: a */
    public static final C21151c f56820a = new C21151c();

    /* renamed from: com.ss.android.ugc.aweme.account.c$a */
    static final class C21152a<TTaskResult, TContinuationResult> implements C1591g<TResult, C1592h<TContinuationResult>> {

        /* renamed from: a */
        final /* synthetic */ Bundle f56821a;

        C21152a(Bundle bundle) {
            this.f56821a = bundle;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C1592h<Bundle> then(C1592h<C21350a> hVar) {
            return C22352y.m74019b(this.f56821a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.c$b */
    static final class C21153b<TTaskResult, TContinuationResult> implements C1591g<TResult, C1592h<TContinuationResult>> {

        /* renamed from: a */
        public static final C21153b f56822a = new C21153b();

        C21153b() {
        }

        /* renamed from: a */
        private static C1592h<C21350a> m71293a(C1592h<Bundle> hVar) {
            return C22352y.m74011a();
        }

        public final /* synthetic */ Object then(C1592h hVar) {
            return m71293a(hVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.c$c */
    static final class C21154c<TTaskResult, TContinuationResult> implements C1591g<C21350a, C1592h<Bundle>> {

        /* renamed from: a */
        final /* synthetic */ Bundle f56823a;

        C21154c(Bundle bundle) {
            this.f56823a = bundle;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C1592h<Bundle> then(C1592h<C21350a> hVar) {
            return C21671bd.m72537e().mo56855a(this.f56823a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.c$d */
    static final class C21155d<TTaskResult, TContinuationResult> implements C1591g<TResult, C1592h<TContinuationResult>> {

        /* renamed from: a */
        final /* synthetic */ Bundle f56824a;

        C21155d(Bundle bundle) {
            this.f56824a = bundle;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C1592h<Bundle> then(C1592h<C21350a> hVar) {
            return C22352y.m74019b(this.f56824a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.c$e */
    static final class C21156e<TTaskResult, TContinuationResult> implements C1591g<TResult, C1592h<TContinuationResult>> {

        /* renamed from: a */
        public static final C21156e f56825a = new C21156e();

        C21156e() {
        }

        /* renamed from: a */
        private static C1592h<C21350a> m71296a(C1592h<Bundle> hVar) {
            return C22352y.m74011a();
        }

        public final /* synthetic */ Object then(C1592h hVar) {
            return m71296a(hVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.c$f */
    static final class C21157f<TTaskResult, TContinuationResult> implements C1591g<TResult, C1592h<TContinuationResult>> {

        /* renamed from: a */
        final /* synthetic */ IAccountUserService f56826a;

        /* renamed from: b */
        final /* synthetic */ Bundle f56827b;

        C21157f(IAccountUserService iAccountUserService, Bundle bundle) {
            this.f56826a = iAccountUserService;
            this.f56827b = bundle;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C1592h<Bundle> then(C1592h<C21350a> hVar) {
            IAccountUserService iAccountUserService = this.f56826a;
            C7573i.m23582a((Object) iAccountUserService, "userService");
            C21671bd.m72531a(true, iAccountUserService.getCurUser());
            return C21671bd.m72537e().mo56857b(this.f56827b);
        }
    }

    private C21151c() {
    }

    /* renamed from: c */
    public static final void m71291c(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        C21671bd.m72541i();
        C21671bd.m72537e().mo56858c(bundle2);
    }

    /* renamed from: a */
    public static final C1592h<Bundle> m71289a(Bundle bundle) {
        if (bundle == null) {
            C1592h<Bundle> a = C1592h.m7850a(new Exception("Bundle is empty"));
            C7573i.m23582a((Object) a, "Task.forError(Exception(\"Bundle is empty\"))");
            return a;
        }
        C1592h<Bundle> b = C22352y.m74012a(bundle).mo6879b((C1591g<TResult, C1592h<TContinuationResult>>) new C21152a<TResult,C1592h<TContinuationResult>>(bundle)).mo6879b((C1591g<TResult, C1592h<TContinuationResult>>) C21153b.f56822a).mo6880b(new C21154c(bundle), C1592h.f5958b);
        C7573i.m23582a((Object) b, "UserUtils.uploadUserMode… Task.UI_THREAD_EXECUTOR)");
        return b;
    }

    /* renamed from: b */
    public static final C1592h<Bundle> m71290b(Bundle bundle) {
        if (bundle == null) {
            C1592h<Bundle> a = C1592h.m7850a(new Exception("Bundle is empty"));
            C7573i.m23582a((Object) a, "Task.forError(Exception(\"Bundle is empty\"))");
            return a;
        }
        C1592h<Bundle> b = C22352y.m74012a(bundle).mo6879b((C1591g<TResult, C1592h<TContinuationResult>>) new C21155d<TResult,C1592h<TContinuationResult>>(bundle)).mo6879b((C1591g<TResult, C1592h<TContinuationResult>>) C21156e.f56825a).mo6879b((C1591g<TResult, C1592h<TContinuationResult>>) new C21157f<TResult,C1592h<TContinuationResult>>(C21671bd.m72520a(), bundle));
        C7573i.m23582a((Object) b, "UserUtils.uploadUserMode…bundle)\n                }");
        return b;
    }
}

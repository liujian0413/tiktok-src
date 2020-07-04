package com.p280ss.android.ugc.aweme.compliance;

import com.p280ss.android.ugc.aweme.AlgoFreeInfo;
import com.p280ss.android.ugc.aweme.C21649ai;
import com.p280ss.android.ugc.aweme.C21762l;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.app.C6877n;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.compliance.api.ComplianceApi.C25787a;
import com.p280ss.android.ugc.aweme.compliance.model.ComplianceSetting;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7561a;
import p346io.reactivex.C7498y;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.ss.android.ugc.aweme.compliance.c */
public final class C25793c implements C21649ai {

    /* renamed from: com.ss.android.ugc.aweme.compliance.c$a */
    public static final class C25794a implements C7498y<BaseResponse> {

        /* renamed from: a */
        final /* synthetic */ C7561a f68204a;

        /* renamed from: b */
        final /* synthetic */ int f68205b;

        /* renamed from: c */
        final /* synthetic */ C7561a f68206c;

        public final void onComplete() {
        }

        public final void onSubscribe(C7321c cVar) {
            C7573i.m23587b(cVar, "d");
        }

        public final void onError(Throwable th) {
            C7573i.m23587b(th, "e");
            C25789b.m84753a().mo66973b(this.f68205b);
            C6877n.m21407a("opt_out_failed", "", null);
            this.f68206c.invoke();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onNext(BaseResponse baseResponse) {
            C7573i.m23587b(baseResponse, "t");
            if (baseResponse.error_code == 0) {
                C25789b.m84753a().mo66973b(3);
                this.f68204a.invoke();
                return;
            }
            C25789b.m84753a().mo66973b(this.f68205b);
            C6877n.m21407a("opt_out_failed", "", null);
            this.f68206c.invoke();
        }

        C25794a(C7561a aVar, int i, C7561a aVar2) {
            this.f68204a = aVar;
            this.f68205b = i;
            this.f68206c = aVar2;
        }
    }

    /* renamed from: a */
    public final String mo57881a() {
        return C25789b.m84759e();
    }

    /* renamed from: c */
    public final AlgoFreeInfo mo57885c() {
        ComplianceSetting b = C25789b.m84753a().mo66972b();
        if (b != null) {
            return b.getAlgoFreeInfo();
        }
        return null;
    }

    /* renamed from: d */
    public final boolean mo57886d() {
        ComplianceSetting b = C25789b.m84753a().mo66972b();
        if (b != null) {
            Boolean algoFreeEnabled = b.getAlgoFreeEnabled();
            if (algoFreeEnabled != null) {
                return algoFreeEnabled.booleanValue();
            }
        }
        return false;
    }

    /* renamed from: b */
    public final int mo57884b() {
        if (C25789b.m84753a().mo66974c() != 0) {
            return C25789b.m84753a().mo66974c();
        }
        ComplianceSetting b = C25789b.m84753a().mo66972b();
        if (b != null) {
            Integer defaultVpaContentChoice = b.getDefaultVpaContentChoice();
            if (defaultVpaContentChoice != null) {
                return defaultVpaContentChoice.intValue();
            }
        }
        return 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0020, code lost:
        if (r1 == null) goto L_0x0022;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo57887e() {
        /*
            r15 = this;
            com.ss.android.ugc.aweme.compliance.a.a r0 = com.p280ss.android.ugc.aweme.compliance.C25789b.m84753a()
            com.ss.android.ugc.aweme.compliance.model.ComplianceSetting r1 = r0.mo66972b()
            r0 = 0
            if (r1 == 0) goto L_0x0022
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r0)
            r12 = 0
            r13 = 511(0x1ff, float:7.16E-43)
            r14 = 0
            com.ss.android.ugc.aweme.compliance.model.ComplianceSetting r1 = com.p280ss.android.ugc.aweme.compliance.model.ComplianceSetting.copy$default(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            if (r1 != 0) goto L_0x0036
        L_0x0022:
            com.ss.android.ugc.aweme.compliance.model.ComplianceSetting r1 = new com.ss.android.ugc.aweme.compliance.model.ComplianceSetting
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r0)
            r13 = 0
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
        L_0x0036:
            com.p280ss.android.ugc.aweme.compliance.C25789b.m84755a(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.compliance.C25793c.mo57887e():void");
    }

    /* renamed from: a */
    public final void mo57882a(C21762l lVar) {
        C7573i.m23587b(lVar, "listener");
        C25789b.m84756a(lVar);
    }

    /* renamed from: a */
    public final void mo57883a(C7561a<C7581n> aVar, C7561a<C7581n> aVar2) {
        C7573i.m23587b(aVar, "success");
        C7573i.m23587b(aVar2, "failed");
        int c = C25789b.m84753a().mo66974c();
        IAccountUserService f = C6861a.m21337f();
        C7573i.m23582a((Object) f, "AccountProxyService.userService()");
        if (!f.isLogin()) {
            C25789b.m84753a().mo66973b(3);
            aVar.invoke();
            return;
        }
        C25787a.m84751a().setVPAContentChoice("vpa_content_choice", 3).mo19304b(C7333a.m23044b()).mo19294a(C47549a.m148327a()).mo19189a((C7498y<? super T>) new C25794a<Object>(aVar, c, aVar2));
    }
}

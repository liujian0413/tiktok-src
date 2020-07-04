package com.p280ss.android.ugc.aweme.compliance.p1150b;

import com.google.android.gms.common.api.ApiException;
import com.p280ss.android.ugc.aweme.C21762l;
import com.p280ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.p280ss.android.ugc.aweme.app.C22977g;
import com.p280ss.android.ugc.aweme.compliance.C25789b;
import com.p280ss.android.ugc.aweme.compliance.api.ComplianceApi;
import com.p280ss.android.ugc.aweme.compliance.api.ComplianceApi.C25787a;
import com.p280ss.android.ugc.aweme.compliance.model.AlgoFreeSettings;
import com.p280ss.android.ugc.aweme.compliance.model.ComplianceSetting;
import com.p280ss.android.ugc.aweme.framework.services.IUserService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.C7573i;
import p346io.reactivex.C7498y;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.ss.android.ugc.aweme.compliance.b.a */
public final class C25790a {

    /* renamed from: a */
    private final ComplianceApi f68202a = C25787a.m84751a();

    /* renamed from: com.ss.android.ugc.aweme.compliance.b.a$a */
    public static final class C25791a implements C7498y<AlgoFreeSettings> {

        /* renamed from: a */
        final /* synthetic */ C21762l f68203a;

        public final void onComplete() {
        }

        public final void onSubscribe(C7321c cVar) {
            C7573i.m23587b(cVar, "d");
        }

        C25791a(C21762l lVar) {
            this.f68203a = lVar;
        }

        public final void onError(Throwable th) {
            int i;
            C7573i.m23587b(th, "e");
            C21762l lVar = this.f68203a;
            if (th instanceof ApiException) {
                i = ((ApiException) th).getStatusCode();
            } else {
                i = -1;
            }
            lVar.mo58110a(i);
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0055, code lost:
            if (r2 == null) goto L_0x0057;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onNext(com.p280ss.android.ugc.aweme.compliance.model.AlgoFreeSettings r18) {
            /*
                r17 = this;
                r0 = r17
                r1 = r18
                java.lang.String r2 = "t"
                kotlin.jvm.internal.C7573i.m23587b(r1, r2)
                int r2 = r1.status_code
                if (r2 != 0) goto L_0x0077
                com.ss.android.ugc.aweme.compliance.a.a r2 = com.p280ss.android.ugc.aweme.compliance.C25789b.m84753a()
                com.ss.android.ugc.aweme.compliance.model.ComplianceSetting r3 = r2.mo66972b()
                if (r3 == 0) goto L_0x0057
                r4 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                r12 = 0
                java.lang.Boolean r2 = r18.getAlgoFreeEnabled()
                r13 = 0
                if (r2 != 0) goto L_0x0037
                com.ss.android.ugc.aweme.compliance.a.a r2 = com.p280ss.android.ugc.aweme.compliance.C25789b.m84753a()
                com.ss.android.ugc.aweme.compliance.model.ComplianceSetting r2 = r2.mo66972b()
                if (r2 == 0) goto L_0x0036
                java.lang.Boolean r2 = r2.getAlgoFreeEnabled()
                goto L_0x0037
            L_0x0036:
                r2 = r13
            L_0x0037:
                com.ss.android.ugc.aweme.AlgoFreeInfo r14 = r18.getAlgoFreeInfo()
                if (r14 != 0) goto L_0x004c
                com.ss.android.ugc.aweme.compliance.a.a r14 = com.p280ss.android.ugc.aweme.compliance.C25789b.m84753a()
                com.ss.android.ugc.aweme.compliance.model.ComplianceSetting r14 = r14.mo66972b()
                if (r14 == 0) goto L_0x004b
                com.ss.android.ugc.aweme.AlgoFreeInfo r13 = r14.getAlgoFreeInfo()
            L_0x004b:
                r14 = r13
            L_0x004c:
                r15 = 511(0x1ff, float:7.16E-43)
                r16 = 0
                r13 = r2
                com.ss.android.ugc.aweme.compliance.model.ComplianceSetting r2 = com.p280ss.android.ugc.aweme.compliance.model.ComplianceSetting.copy$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
                if (r2 != 0) goto L_0x006e
            L_0x0057:
                com.ss.android.ugc.aweme.compliance.model.ComplianceSetting r2 = new com.ss.android.ugc.aweme.compliance.model.ComplianceSetting
                r4 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                r12 = 0
                java.lang.Boolean r13 = r18.getAlgoFreeEnabled()
                com.ss.android.ugc.aweme.AlgoFreeInfo r14 = r18.getAlgoFreeInfo()
                r3 = r2
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            L_0x006e:
                com.p280ss.android.ugc.aweme.compliance.C25789b.m84755a(r2)
                com.ss.android.ugc.aweme.l r1 = r0.f68203a
                r1.mo58109a()
                return
            L_0x0077:
                com.ss.android.ugc.aweme.l r2 = r0.f68203a
                int r1 = r1.status_code
                r2.mo58110a(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.compliance.p1150b.C25790a.C25791a.onNext(com.ss.android.ugc.aweme.compliance.model.AlgoFreeSettings):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.b.a$b */
    public static final class C25792b implements C7498y<ComplianceSetting> {
        C25792b() {
        }

        public final void onComplete() {
        }

        public final void onError(Throwable th) {
            C7573i.m23587b(th, "e");
        }

        public final void onSubscribe(C7321c cVar) {
            C7573i.m23587b(cVar, "d");
        }

        public final /* synthetic */ void onNext(Object obj) {
            m84774a((ComplianceSetting) obj);
        }

        /* renamed from: a */
        private static void m84774a(ComplianceSetting complianceSetting) {
            C7573i.m23587b(complianceSetting, "setting");
            C25789b.m84755a(complianceSetting);
        }
    }

    /* renamed from: b */
    private static int m84770b() {
        User user;
        IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
        if (iUserService != null) {
            user = iUserService.getCurrentUser();
        } else {
            user = null;
        }
        if (user != null) {
            return user.getUserMode();
        }
        return 0;
    }

    /* renamed from: a */
    public final void mo66980a() {
        if (!C22977g.f60742b.m75598c("")) {
            this.f68202a.getComplianceSetting(TimeLockRuler.getTeenageModeStatus(), m84770b()).mo19304b(C7333a.m23044b()).mo19294a(C47549a.m148327a()).mo19189a((C7498y<? super T>) new C25792b<Object>());
        }
    }

    /* renamed from: a */
    public final void mo66981a(C21762l lVar) {
        C7573i.m23587b(lVar, "listener");
        this.f68202a.getAlgoFreeSettings().mo19304b(C7333a.m23044b()).mo19294a(C47549a.m148327a()).mo19189a((C7498y<? super T>) new C25791a<Object>(lVar));
    }
}

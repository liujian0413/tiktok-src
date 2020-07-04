package com.p280ss.android.ugc.aweme.requestcombine.p1503a;

import com.p280ss.android.ugc.aweme.antiaddic.p1011b.C22560b;
import com.p280ss.android.ugc.aweme.compliance.C25789b;
import com.p280ss.android.ugc.aweme.lego.C7121a.C7126d;
import com.p280ss.android.ugc.aweme.requestcombine.model.BaseCombineMode;
import com.p280ss.android.ugc.aweme.requestcombine.model.ComplianceSettingCombineModel;
import com.p280ss.android.ugc.aweme.requesttask.idle.C37246f;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import java.util.concurrent.Callable;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.requestcombine.a.b */
public final class C37206b extends C37205a {

    /* renamed from: a */
    private final String f97333a = "/aweme/v1/compliance/settings/";

    /* renamed from: b */
    private BaseCombineMode f97334b;

    /* renamed from: com.ss.android.ugc.aweme.requestcombine.a.b$a */
    static final class C37207a<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ ComplianceSettingCombineModel f97335a;

        C37207a(ComplianceSettingCombineModel complianceSettingCombineModel) {
            this.f97335a = complianceSettingCombineModel;
        }

        public final /* synthetic */ Object call() {
            m119596a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m119596a() {
            C25789b.m84755a(this.f97335a.getComplianceSetting());
            C42961az.m136381b(new C22560b());
        }
    }

    /* renamed from: b */
    public final BaseCombineMode mo93741b() {
        return this.f97334b;
    }

    /* renamed from: a */
    public final String mo93737a() {
        return this.f97333a;
    }

    /* renamed from: a */
    private void m119591a(BaseCombineMode baseCombineMode) {
        this.f97334b = baseCombineMode;
    }

    /* renamed from: a */
    public final void mo93739a(C7126d dVar) {
        C7573i.m23587b(dVar, "transaction");
        dVar.mo18551a(new C37246f());
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0011  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo93740a(com.p280ss.android.ugc.aweme.requestcombine.model.SettingCombineModel r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L_0x000d
            com.ss.android.ugc.aweme.requestcombine.model.SettingCombineDataModel r3 = r3.getData()
            if (r3 == 0) goto L_0x000d
            com.ss.android.ugc.aweme.requestcombine.model.ComplianceSettingCombineModel r3 = r3.getComplianceSetting()
            goto L_0x000e
        L_0x000d:
            r3 = 0
        L_0x000e:
            r0 = 0
            if (r3 == 0) goto L_0x003d
            com.ss.android.ugc.aweme.compliance.model.ComplianceSetting r1 = r3.getComplianceSetting()
            if (r1 == 0) goto L_0x003d
            int r1 = r1.status_code
            if (r1 == 0) goto L_0x001c
            goto L_0x003d
        L_0x001c:
            r1 = r3
            com.ss.android.ugc.aweme.requestcombine.model.BaseCombineMode r1 = (com.p280ss.android.ugc.aweme.requestcombine.model.BaseCombineMode) r1
            r2.m119591a(r1)
            com.ss.android.ugc.aweme.requestcombine.a.b$a r1 = new com.ss.android.ugc.aweme.requestcombine.a.b$a
            r1.<init>(r3)
            java.util.concurrent.Callable r1 = (java.util.concurrent.Callable) r1
            bolts.C1592h.m7853a(r1)
            com.ss.android.ugc.aweme.requestcombine.model.BaseCombineMode r3 = r2.mo93741b()
            if (r3 == 0) goto L_0x003c
            int r3 = r3.getHttpCode()
            r1 = 200(0xc8, float:2.8E-43)
            if (r3 != r1) goto L_0x003c
            r3 = 1
            return r3
        L_0x003c:
            return r0
        L_0x003d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.requestcombine.p1503a.C37206b.mo93740a(com.ss.android.ugc.aweme.requestcombine.model.SettingCombineModel):boolean");
    }
}

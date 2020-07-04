package com.p280ss.android.ugc.aweme.compliance;

import com.p280ss.android.ugc.aweme.compliance.model.ComplianceSetting;
import com.p280ss.android.ugc.aweme.compliance.p1149a.C25785a;
import com.p280ss.android.ugc.aweme.setting.serverpush.C37703a.C37704a;
import com.p280ss.android.ugc.aweme.setting.serverpush.model.C37723b;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.compliance.d */
public final class C25795d implements C37704a {

    /* renamed from: a */
    public static final C25795d f68207a = new C25795d();

    private C25795d() {
    }

    /* renamed from: a */
    public final void mo59220a(Exception exc) {
        C7573i.m23587b(exc, "e");
    }

    /* renamed from: a */
    public final void mo59219a(C37723b bVar) {
        int i;
        C7573i.m23587b(bVar, "settings");
        C25785a a = C25789b.m84753a();
        if (bVar.f98258P == 0) {
            ComplianceSetting b = a.mo66972b();
            if (b != null) {
                Integer defaultVpaContentChoice = b.getDefaultVpaContentChoice();
                if (defaultVpaContentChoice != null) {
                    i = defaultVpaContentChoice.intValue();
                }
            }
            i = 1;
        } else {
            i = bVar.f98258P;
        }
        a.mo66973b(i);
    }
}

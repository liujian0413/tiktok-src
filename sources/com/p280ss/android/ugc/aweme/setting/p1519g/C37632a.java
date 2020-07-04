package com.p280ss.android.ugc.aweme.setting.p1519g;

import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.setting.serverpush.C37703a.C37704a;
import com.p280ss.android.ugc.aweme.setting.serverpush.model.C37722a;
import com.p280ss.android.ugc.aweme.setting.serverpush.model.C37723b;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.setting.g.a */
public final class C37632a implements C37704a {

    /* renamed from: a */
    public static final C37632a f98102a = new C37632a();

    /* renamed from: b */
    private static C37722a f98103b;

    private C37632a() {
    }

    /* renamed from: a */
    public static C37722a m120438a() {
        return f98103b;
    }

    /* renamed from: a */
    public final void mo59220a(Exception exc) {
        C7573i.m23587b(exc, "e");
        f98103b = null;
    }

    /* renamed from: a */
    public final void mo59219a(C37723b bVar) {
        C7573i.m23587b(bVar, "settings");
        if (C6399b.m19944t()) {
            f98103b = bVar.f98263U;
        }
    }
}

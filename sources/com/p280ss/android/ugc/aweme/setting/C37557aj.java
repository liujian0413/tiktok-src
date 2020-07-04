package com.p280ss.android.ugc.aweme.setting;

import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.base.p1062f.C23336d;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.playerkit.model.PlayerConfig.Type;

/* renamed from: com.ss.android.ugc.aweme.setting.aj */
public final class C37557aj {

    /* renamed from: a */
    static boolean f97961a;

    /* renamed from: a */
    public static Type m120314a() {
        if (!C7163a.m22363a()) {
            return Type.Ijk;
        }
        return Type.values()[((C37556ai) C23336d.m76560a(C6399b.m19921a(), C37556ai.class)).mo60385a()];
    }

    /* renamed from: a */
    public static void m120315a(Type type) {
        f97961a = true;
        ((C37556ai) C23336d.m76560a(C6399b.m19921a(), C37556ai.class)).mo60386a(type.ordinal());
    }
}

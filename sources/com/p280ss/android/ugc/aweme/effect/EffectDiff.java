package com.p280ss.android.ugc.aweme.effect;

import android.support.p029v7.util.C1143a.C1145a;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.effect.EffectDiff */
public final class EffectDiff extends C1145a {

    /* renamed from: a */
    private final List<EffectModel> f72116a;

    /* renamed from: b */
    private final List<EffectModel> f72117b;

    /* renamed from: a */
    public final int mo248a() {
        return this.f72116a.size();
    }

    /* renamed from: b */
    public final int mo250b() {
        return this.f72117b.size();
    }

    public EffectDiff(List<? extends EffectModel> list, List<? extends EffectModel> list2) {
        C7573i.m23587b(list, "old");
        C7573i.m23587b(list2, "new");
        this.f72116a = list;
        this.f72117b = list2;
    }

    /* renamed from: b */
    public final boolean mo251b(int i, int i2) {
        return C7573i.m23585a((Object) ((EffectModel) this.f72116a.get(i)).name, (Object) ((EffectModel) this.f72117b.get(i2)).name);
    }

    /* renamed from: c */
    public final boolean mo252c(int i, int i2) {
        return C7573i.m23585a((Object) (EffectModel) this.f72116a.get(i), (Object) (EffectModel) this.f72117b.get(i2));
    }
}

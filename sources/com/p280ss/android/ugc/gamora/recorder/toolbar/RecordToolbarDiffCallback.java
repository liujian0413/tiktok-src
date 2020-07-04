package com.p280ss.android.ugc.gamora.recorder.toolbar;

import android.support.p029v7.util.C1143a.C1145a;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.gamora.recorder.toolbar.RecordToolbarDiffCallback */
public final class RecordToolbarDiffCallback extends C1145a {

    /* renamed from: a */
    private final List<C44779b> f115174a;

    /* renamed from: b */
    private final List<C44779b> f115175b;

    /* renamed from: a */
    public final int mo248a() {
        return this.f115174a.size();
    }

    /* renamed from: b */
    public final int mo250b() {
        return this.f115175b.size();
    }

    public RecordToolbarDiffCallback(List<? extends C44779b> list, List<? extends C44779b> list2) {
        C7573i.m23587b(list, "old");
        C7573i.m23587b(list2, "new");
        this.f115174a = list;
        this.f115175b = list2;
    }

    /* renamed from: b */
    public final boolean mo251b(int i, int i2) {
        if (((C44779b) this.f115174a.get(i)).f115192a == ((C44779b) this.f115175b.get(i2)).f115192a) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final boolean mo252c(int i, int i2) {
        return C7573i.m23585a((Object) (C44779b) this.f115174a.get(i), (Object) (C44779b) this.f115175b.get(i2));
    }
}

package com.p280ss.android.ugc.aweme.scene;

import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.Lifecycle.Event;
import com.bytedance.scene.C12629j;
import com.bytedance.scene.group.C12604b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Triple;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.aweme.scene.SceneEx$withChildren$1 */
public final class SceneEx$withChildren$1 implements C0042h {

    /* renamed from: a */
    final /* synthetic */ C12604b f97427a;

    /* renamed from: b */
    final /* synthetic */ C7562b f97428b;

    @C0054q(mo125a = Event.ON_CREATE)
    public final void oActivityCreated() {
        List<Triple> arrayList = new ArrayList<>();
        this.f97428b.invoke(arrayList);
        for (Triple triple : arrayList) {
            this.f97427a.mo30925a(((Number) triple.getFirst()).intValue(), (C12629j) triple.getSecond(), (String) triple.getThird());
        }
    }
}

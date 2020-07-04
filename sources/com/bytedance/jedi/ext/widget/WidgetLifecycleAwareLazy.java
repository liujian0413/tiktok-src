package com.bytedance.jedi.ext.widget;

import android.arch.lifecycle.C0037e;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0063u;
import android.support.p022v4.app.Fragment;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.bytedance.widget.Widget;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7561a;

public final class WidgetLifecycleAwareLazy<T extends C0063u> extends lifecycleAwareLazy<T> {
    public WidgetLifecycleAwareLazy(C0043i iVar, C7561a<String> aVar, C7561a<? extends T> aVar2) {
        C7573i.m23587b(iVar, "owner");
        C7573i.m23587b(aVar2, "initializer");
        super(iVar, aVar, aVar2);
    }

    public final void ensureViewModel(C0043i iVar, T t, C7561a<String> aVar) {
        C7573i.m23587b(iVar, "owner");
        C7573i.m23587b(t, "value");
        C7573i.m23587b(aVar, "keyFactory");
        Object n = ((Widget) iVar).mo31589n();
        if (!(n instanceof Fragment)) {
            n = null;
        }
        Fragment fragment = (Fragment) n;
        if (fragment != null) {
            C0037e.m84a(fragment, t, aVar);
        }
    }

    public /* synthetic */ WidgetLifecycleAwareLazy(C0043i iVar, C7561a aVar, C7561a aVar2, int i, C7571f fVar) {
        if ((i & 2) != 0) {
            aVar = null;
        }
        this(iVar, aVar, aVar2);
    }
}

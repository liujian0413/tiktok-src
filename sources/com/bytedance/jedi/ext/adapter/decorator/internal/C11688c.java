package com.bytedance.jedi.ext.adapter.decorator.internal;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.bytedance.jedi.ext.adapter.decorator.internal.c */
public final class C11688c {
    /* access modifiers changed from: private */
    /* renamed from: a */
    public static View m34257a(ViewGroup viewGroup, int i, boolean z) {
        C7573i.m23587b(viewGroup, "$this$inflate");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, z);
        C7573i.m23582a((Object) inflate, "LayoutInflater.from(cont…yout, this, attachToRoot)");
        return inflate;
    }
}

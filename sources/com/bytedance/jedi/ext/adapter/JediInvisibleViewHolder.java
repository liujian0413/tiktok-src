package com.bytedance.jedi.ext.adapter;

import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.C7573i;

final class JediInvisibleViewHolder extends JediSimpleViewHolder<Object> {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo29209a(Object obj) {
        C7573i.m23587b(obj, "item");
    }

    public JediInvisibleViewHolder(ViewGroup viewGroup) {
        C7573i.m23587b(viewGroup, "parent");
        super(new View(viewGroup.getContext()));
    }
}

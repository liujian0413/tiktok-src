package com.bytedance.jedi.ext.adapter;

import android.arch.lifecycle.C0065w.C0067b;
import android.view.View;
import com.bytedance.jedi.arch.C11497af;
import java.util.List;
import kotlin.jvm.internal.C7573i;

public abstract class JediSimpleViewHolder<ITEM> extends JediViewHolder<JediSimpleViewHolder<ITEM>, ITEM> implements C11497af<C0067b> {

    /* renamed from: f */
    private final C0067b f31370f = C11681d.f31380a;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo29209a(ITEM item);

    /* renamed from: f */
    public final C0067b mo29056f() {
        return this.f31370f;
    }

    public JediSimpleViewHolder(View view) {
        C7573i.m23587b(view, "view");
        super(view);
    }

    /* renamed from: a */
    public final void mo29211a(List<Object> list) {
        mo29210a(mo29309o(), this.f31526i, list);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo29210a(ITEM item, int i, List<Object> list) {
        mo29209a(item);
    }
}

package com.bytedance.jedi.ext.adapter.decorator.internal;

import android.support.p029v7.widget.RecyclerView;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import kotlin.C7581n;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.bytedance.jedi.ext.adapter.decorator.internal.j */
public final class C11699j implements OnAttachStateChangeListener {

    /* renamed from: a */
    public RecyclerView f31436a;

    /* renamed from: b */
    private final C7562b<RecyclerView, C7581n> f31437b;

    /* renamed from: c */
    private final C7562b<RecyclerView, C7581n> f31438c;

    public C11699j() {
        this(null, null, 3, null);
    }

    /* renamed from: a */
    public final void mo29258a(RecyclerView recyclerView) {
        C7573i.m23587b(recyclerView, "recyclerView");
        this.f31436a = recyclerView;
        recyclerView.addOnAttachStateChangeListener(this);
    }

    /* renamed from: b */
    public final void mo29259b(RecyclerView recyclerView) {
        C7573i.m23587b(recyclerView, "recyclerView");
        this.f31436a = null;
        recyclerView.removeOnAttachStateChangeListener(this);
    }

    public final void onViewAttachedToWindow(View view) {
        C7573i.m23587b(view, "v");
        this.f31436a = (RecyclerView) view;
        C7562b<RecyclerView, C7581n> bVar = this.f31437b;
        if (bVar != null) {
            bVar.invoke(view);
        }
    }

    public final void onViewDetachedFromWindow(View view) {
        C7573i.m23587b(view, "v");
        this.f31436a = null;
        C7562b<RecyclerView, C7581n> bVar = this.f31438c;
        if (bVar != null) {
            bVar.invoke((RecyclerView) view);
        }
    }

    private C11699j(C7562b<? super RecyclerView, C7581n> bVar, C7562b<? super RecyclerView, C7581n> bVar2) {
        this.f31437b = bVar;
        this.f31438c = bVar2;
    }

    public /* synthetic */ C11699j(C7562b bVar, C7562b bVar2, int i, C7571f fVar) {
        this(null, null);
    }
}

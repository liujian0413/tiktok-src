package com.bytedance.jedi.ext.adapter.multitype;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.util.SparseArray;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import java.util.List;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

public abstract class MultiTypeViewHolder<ITEM> extends C1293v {

    /* renamed from: h */
    static final /* synthetic */ C7595j[] f31523h = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(MultiTypeViewHolder.class), "itemViewMap", "getItemViewMap$ext_adapter_release()Landroid/util/SparseArray;"))};

    /* renamed from: a */
    private final C7541d f31524a = C7546e.m23569a(C11734a.f31528a);

    /* renamed from: b */
    private ITEM f31525b;

    /* renamed from: i */
    public int f31526i;

    /* renamed from: com.bytedance.jedi.ext.adapter.multitype.MultiTypeViewHolder$a */
    static final class C11734a extends Lambda implements C7561a<SparseArray<View>> {

        /* renamed from: a */
        public static final C11734a f31528a = new C11734a();

        C11734a() {
            super(0);
        }

        /* renamed from: a */
        private static SparseArray<View> m34416a() {
            return new SparseArray<>();
        }

        public final /* synthetic */ Object invoke() {
            return m34416a();
        }
    }

    /* renamed from: a */
    public abstract void mo29214a(ITEM item, int i);

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo29222h() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo29223i() {
    }

    /* renamed from: o */
    public final ITEM mo29309o() {
        ITEM item = this.f31525b;
        if (item == null) {
            C7573i.m23580a();
        }
        return item;
    }

    public MultiTypeViewHolder(View view) {
        C7573i.m23587b(view, "view");
        super(view);
        this.itemView.addOnAttachStateChangeListener(new OnAttachStateChangeListener(this) {

            /* renamed from: a */
            final /* synthetic */ MultiTypeViewHolder f31527a;

            {
                this.f31527a = r1;
            }

            public final void onViewAttachedToWindow(View view) {
                this.f31527a.mo29222h();
            }

            public final void onViewDetachedFromWindow(View view) {
                this.f31527a.mo29223i();
            }
        });
    }

    /* renamed from: b */
    public void mo29215b(ITEM item, int i, List<Object> list) {
        this.f31526i = i;
        this.f31525b = item;
        mo29214a(item, i);
    }
}

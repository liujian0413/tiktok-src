package com.bytedance.jedi.ext.adapter.internal;

import android.support.p029v7.widget.C1337ac;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1273i;
import android.support.p029v7.widget.RecyclerView.C1282n;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.support.p029v7.widget.StaggeredGridLayoutManager;
import com.bytedance.jedi.arch.C11501d;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.bytedance.jedi.ext.adapter.decorator.internal.C11699j;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.bytedance.jedi.ext.adapter.internal.a */
public final class C11721a {

    /* renamed from: a */
    public boolean f31492a = true;

    /* renamed from: b */
    private int f31493b = -241;

    /* renamed from: c */
    private final C11699j f31494c = new C11699j(null, null, 3, null);

    /* renamed from: d */
    private C11731h f31495d;

    /* renamed from: e */
    private boolean f31496e;

    /* renamed from: f */
    private Method f31497f;

    /* renamed from: a */
    public final void mo29284a() {
        if (this.f31492a) {
            RecyclerView recyclerView = this.f31494c.f31436a;
            if (recyclerView != null) {
                C1273i layoutManager = recyclerView.getLayoutManager();
                if (layoutManager instanceof LinearLayoutManager) {
                    this.f31493b = ((LinearLayoutManager) layoutManager).mo5445j();
                    return;
                }
                if (layoutManager instanceof StaggeredGridLayoutManager) {
                    StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
                    this.f31493b = staggeredGridLayoutManager.mo6009a(new int[staggeredGridLayoutManager.f5123a])[0];
                }
            }
        }
    }

    /* renamed from: b */
    public final <VH extends JediViewHolder<? extends C11501d, ?>> VH mo29288b(int i) {
        C11731h hVar = this.f31495d;
        if (hVar != null) {
            return (JediViewHolder) hVar.mo29307a(i);
        }
        return null;
    }

    /* renamed from: a */
    public final void mo29286a(RecyclerView recyclerView) {
        C7573i.m23587b(recyclerView, "recyclerView");
        this.f31494c.mo29258a(recyclerView);
        this.f31495d = new C11731h();
    }

    /* renamed from: b */
    public final void mo29289b(RecyclerView recyclerView) {
        C7573i.m23587b(recyclerView, "recyclerView");
        this.f31494c.mo29259b(recyclerView);
        this.f31495d = null;
    }

    /* renamed from: a */
    public final void mo29285a(int i) {
        if (this.f31492a) {
            RecyclerView recyclerView = this.f31494c.f31436a;
            if (recyclerView != null && this.f31493b != -241 && this.f31493b >= i) {
                C1273i layoutManager = recyclerView.getLayoutManager();
                if (layoutManager instanceof LinearLayoutManager) {
                    layoutManager.mo5437e(this.f31493b);
                    return;
                }
                if (layoutManager instanceof StaggeredGridLayoutManager) {
                    layoutManager.mo5437e(this.f31493b);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo29287a(JediViewHolder<? extends C11501d, ?> jediViewHolder) {
        int i;
        C7573i.m23587b(jediViewHolder, "holder");
        C11731h hVar = this.f31495d;
        if (hVar != null) {
            RecyclerView recyclerView = this.f31494c.f31436a;
            if (recyclerView != null) {
                int i2 = jediViewHolder.mItemViewType;
                if (this.f31496e) {
                    i = C1337ac.m6609a(recyclerView, i2);
                } else if (this.f31497f == null) {
                    try {
                        i = C1337ac.m6609a(recyclerView, i2);
                        this.f31496e = true;
                    } catch (IllegalAccessError unused) {
                        i = m34360a(recyclerView, i2);
                    }
                } else {
                    i = m34360a(recyclerView, i2);
                }
                int a = recyclerView.getRecycledViewPool().mo5819a(i2);
                if (i != -1 && i <= a) {
                    C1293v vVar = jediViewHolder;
                    hVar.mo29308a(vVar);
                    Method method = this.f31497f;
                    if (method == null) {
                        C1337ac.m6610a(vVar);
                        return;
                    }
                    method.invoke(jediViewHolder, new Object[0]);
                }
            }
        }
    }

    /* renamed from: a */
    private final int m34360a(RecyclerView recyclerView, int i) {
        C1282n recycledViewPool = recyclerView.getRecycledViewPool();
        C7573i.m23582a((Object) recycledViewPool, "recyclerView.recycledViewPool");
        Method b = C11722b.m34368b();
        Field c = C11722b.m34369c();
        this.f31497f = C11722b.m34367a();
        Object obj = c.get(b.invoke(recycledViewPool, new Object[]{Integer.valueOf(i)}));
        if (obj != null) {
            return ((Integer) obj).intValue();
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
    }
}

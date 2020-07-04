package com.p280ss.android.ugc.aweme.mix;

import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1284o;
import android.support.p029v7.widget.RecyclerView.C1290s;
import com.p280ss.android.ugc.aweme.profile.p1487ui.WrapStaggeredGridLayoutManager;
import com.p280ss.android.vesdk.C45323k;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.mix.MixCellStyleExperiment$createLayoutManager$1 */
public final class MixCellStyleExperiment$createLayoutManager$1 extends WrapStaggeredGridLayoutManager {

    /* renamed from: l */
    final /* synthetic */ RecyclerView f87432l;

    /* renamed from: m */
    private Method f87433m;

    /* renamed from: n */
    private boolean f87434n;

    /* renamed from: E */
    public final void mo5748E() {
        super.mo5748E();
        if (this.f87433m != null) {
            try {
                Method method = this.f87433m;
                if (method != null) {
                    method.invoke(this.f87432l, new Object[0]);
                }
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException unused2) {
            }
        }
    }

    /* renamed from: c */
    public final void mo5385c(C1284o oVar, C1290s sVar) {
        C7573i.m23587b(oVar, "recycler");
        C7573i.m23587b(sVar, "state");
        if (this.f87433m == null && !this.f87434n) {
            try {
                this.f87433m = RecyclerView.class.getDeclaredMethod(C45323k.f116730a, new Class[0]);
                Method method = this.f87433m;
                if (method != null) {
                    method.setAccessible(true);
                }
            } catch (NoSuchMethodException unused) {
                this.f87434n = true;
            }
        }
        if (this.f87433m != null && sVar.f5013j) {
            try {
                Method method2 = this.f87433m;
                if (method2 != null) {
                    method2.invoke(this.f87432l, new Object[0]);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
        super.mo5385c(oVar, sVar);
    }

    MixCellStyleExperiment$createLayoutManager$1(RecyclerView recyclerView, int i, int i2) {
        this.f87432l = recyclerView;
        super(2, 1);
    }
}

package com.bytedance.jedi.ext.adapter;

import android.arch.lifecycle.C0043i;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.view.ViewGroup;
import com.bytedance.jedi.arch.C11501d;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.bytedance.jedi.ext.adapter.internal.C11724d;
import com.bytedance.jedi.ext.adapter.internal.C11728f;
import com.bytedance.jedi.ext.adapter.multitype.C11738c;
import com.bytedance.jedi.ext.adapter.multitype.MultiTypeViewHolder;
import com.bytedance.widget.Widget;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.bytedance.jedi.ext.adapter.f */
public final class C11713f<VH extends JediViewHolder<? extends C11501d, ?>> extends C11738c<VH> {

    /* renamed from: a */
    public final C11728f f31468a = new C11728f(m34320a(this.f31469c));

    /* renamed from: c */
    private final C0043i f31469c;

    /* access modifiers changed from: private */
    /* renamed from: c */
    public VH mo29264a(int i) {
        return this.f31531b.mo29288b(i);
    }

    /* renamed from: b */
    private static VH m34321b(ViewGroup viewGroup) {
        C7573i.m23587b(viewGroup, "parent");
        return (JediViewHolder) new JediInvisibleViewHolder(viewGroup);
    }

    /* renamed from: a */
    public final /* synthetic */ MultiTypeViewHolder mo29265a(ViewGroup viewGroup) {
        return m34321b(viewGroup);
    }

    public C11713f(C0043i iVar) {
        C7573i.m23587b(iVar, "owner");
        this.f31469c = iVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public VH mo29266a(VH vh) {
        C7573i.m23587b(vh, "holder");
        VH vh2 = (JediViewHolder) super.mo29266a((MultiTypeViewHolder) vh);
        vh2.mo29212a(this.f31469c);
        vh2.mo29213a(this.f31468a);
        vh2.mo29220e();
        return vh2;
    }

    /* renamed from: a */
    public final void mo29267a(VH vh) {
        C7573i.m23587b(vh, "holder");
        this.f31531b.mo29287a((JediViewHolder<? extends C11501d, ?>) vh);
    }

    /* renamed from: a */
    private final C11724d m34320a(C0043i iVar) {
        if (iVar instanceof Fragment) {
            return C11724d.f31502d.mo29298a((Fragment) iVar);
        }
        if (iVar instanceof FragmentActivity) {
            return C11724d.f31502d.mo29299a((FragmentActivity) iVar);
        }
        if (iVar instanceof Widget) {
            return C11724d.f31502d.mo29300a((Widget) iVar);
        }
        if (iVar instanceof JediViewHolder) {
            StringBuilder sb = new StringBuilder("JediViewHolder:");
            sb.append(this.f31469c);
            sb.append(" is not support for now");
            throw new IllegalStateException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder("owner:");
        sb2.append(this.f31469c);
        sb2.append(" is not in support list ([FragmentActivity, Fragment, Widget])");
        throw new IllegalStateException(sb2.toString());
    }
}

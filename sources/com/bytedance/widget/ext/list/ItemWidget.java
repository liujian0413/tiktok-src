package com.bytedance.widget.ext.list;

import android.arch.lifecycle.C0038f;
import com.bytedance.widget.Widget;
import com.bytedance.widget.ext.list.ItemWidgetViewHolder;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7561a;

public abstract class ItemWidget<ITEM, VH extends ItemWidgetViewHolder<ITEM>> extends Widget {

    /* renamed from: g */
    private final C7541d<C0038f> f34488g = C7546e.m23569a(C13037a.f34489a);

    /* renamed from: com.bytedance.widget.ext.list.ItemWidget$a */
    static final class C13037a extends Lambda implements C7561a<C0038f> {

        /* renamed from: a */
        public static final C13037a f34489a = new C13037a();

        C13037a() {
            super(0);
        }

        /* renamed from: a */
        private static C0038f m38047a() {
            return new C0038f();
        }

        public final /* synthetic */ Object invoke() {
            return m38047a();
        }
    }

    /* renamed from: a */
    public final C0038f mo31610a() {
        return (C0038f) this.f34488g.getValue();
    }

    /* renamed from: m */
    public final void mo31588m() {
        super.mo31588m();
        if (this.f34488g.isInitialized()) {
            mo31610a().mo110a();
        }
    }
}

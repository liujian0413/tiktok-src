package com.bytedance.jedi.ext.adapter.extension;

import android.view.ViewGroup;
import com.bytedance.jedi.ext.adapter.decorator.internal.C11688c;
import com.bytedance.jedi.ext.adapter.multitype.MultiTypeViewHolder;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C48006q;
import kotlin.jvm.p357a.C48007r;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.bytedance.jedi.ext.adapter.extension.c */
public final class C11705c<T> extends C11703a<T, C11705c<T>, MultiTypeViewHolder<T>> {

    /* renamed from: b */
    public static final C11706a f31458b = new C11706a(null);

    /* renamed from: com.bytedance.jedi.ext.adapter.extension.c$a */
    public static final class C11706a {
        private C11706a() {
        }

        public /* synthetic */ C11706a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.bytedance.jedi.ext.adapter.extension.c$b */
    static final class C11707b extends Lambda implements C7562b<ViewGroup, DiffableAdapterBuilder$viewHolder$factory$1$1> {

        /* renamed from: a */
        final /* synthetic */ C48006q f31459a;

        /* renamed from: b */
        final /* synthetic */ int f31460b;

        /* access modifiers changed from: private */
        /* renamed from: a */
        public DiffableAdapterBuilder$viewHolder$factory$1$1 invoke(ViewGroup viewGroup) {
            C7573i.m23587b(viewGroup, "it");
            return new DiffableAdapterBuilder$viewHolder$factory$1$1(this, viewGroup, C11688c.m34257a(viewGroup, this.f31460b, false));
        }
    }

    /* renamed from: com.bytedance.jedi.ext.adapter.extension.c$c */
    static final class C11708c extends Lambda implements C7562b<ViewGroup, DiffableAdapterBuilder$viewHolder$factory$2$1> {

        /* renamed from: a */
        final /* synthetic */ C48007r f31461a;

        /* renamed from: b */
        final /* synthetic */ int f31462b;

        /* access modifiers changed from: private */
        /* renamed from: a */
        public DiffableAdapterBuilder$viewHolder$factory$2$1 invoke(ViewGroup viewGroup) {
            C7573i.m23587b(viewGroup, "it");
            return new DiffableAdapterBuilder$viewHolder$factory$2$1(this, viewGroup, C11688c.m34257a(viewGroup, this.f31462b, false));
        }
    }
}

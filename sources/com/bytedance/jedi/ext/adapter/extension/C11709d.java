package com.bytedance.jedi.ext.adapter.extension;

import android.view.ViewGroup;
import com.bytedance.jedi.arch.C11501d;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.bytedance.jedi.ext.adapter.decorator.internal.C11688c;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C48006q;
import kotlin.jvm.p357a.C48007r;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.bytedance.jedi.ext.adapter.extension.d */
public final class C11709d<T, RECEIVER extends C11501d> extends C11703a<T, C11709d<T, RECEIVER>, JediViewHolder<? extends C11501d, T>> {

    /* renamed from: b */
    public static final C11710a f31463b = new C11710a(null);

    /* renamed from: com.bytedance.jedi.ext.adapter.extension.d$a */
    public static final class C11710a {
        private C11710a() {
        }

        public /* synthetic */ C11710a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.bytedance.jedi.ext.adapter.extension.d$b */
    static final class C11711b extends Lambda implements C7562b<ViewGroup, JediAdapterBuilder$viewHolder$factory$1$1> {

        /* renamed from: a */
        final /* synthetic */ C48006q f31464a;

        /* renamed from: b */
        final /* synthetic */ int f31465b;

        /* access modifiers changed from: private */
        /* renamed from: a */
        public JediAdapterBuilder$viewHolder$factory$1$1 invoke(ViewGroup viewGroup) {
            C7573i.m23587b(viewGroup, "it");
            return new JediAdapterBuilder$viewHolder$factory$1$1(this, viewGroup, C11688c.m34257a(viewGroup, this.f31465b, false));
        }
    }

    /* renamed from: com.bytedance.jedi.ext.adapter.extension.d$c */
    static final class C11712c extends Lambda implements C7562b<ViewGroup, JediAdapterBuilder$viewHolder$factory$2$1> {

        /* renamed from: a */
        final /* synthetic */ C48007r f31466a;

        /* renamed from: b */
        final /* synthetic */ int f31467b;

        /* access modifiers changed from: private */
        /* renamed from: a */
        public JediAdapterBuilder$viewHolder$factory$2$1 invoke(ViewGroup viewGroup) {
            C7573i.m23587b(viewGroup, "it");
            return new JediAdapterBuilder$viewHolder$factory$2$1(this, viewGroup, C11688c.m34257a(viewGroup, this.f31467b, false));
        }
    }
}

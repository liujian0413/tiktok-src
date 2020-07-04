package com.bytedance.viewholder.typesafe;

import android.support.p029v7.widget.RecyclerView.C1262a;
import com.bytedance.viewholder.typesafe.TypeSafeViewHolder;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

public abstract class TypeSafeAdapter<VH extends TypeSafeViewHolder<?>> extends C1262a<VH> {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f34451a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(TypeSafeAdapter.class), "manager", "getManager()Lcom/bytedance/viewholder/typesafe/ViewHolderFactoryManager;"))};

    /* renamed from: b */
    private final C7541d f34452b = C7546e.m23568a(LazyThreadSafetyMode.NONE, new C13026a(this));

    /* renamed from: com.bytedance.viewholder.typesafe.TypeSafeAdapter$a */
    static final class C13026a extends Lambda implements C7561a<C13027a<VH>> {

        /* renamed from: a */
        final /* synthetic */ TypeSafeAdapter f34453a;

        C13026a(TypeSafeAdapter typeSafeAdapter) {
            this.f34453a = typeSafeAdapter;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C13027a<VH> invoke() {
            return new C13027a<>();
        }
    }
}

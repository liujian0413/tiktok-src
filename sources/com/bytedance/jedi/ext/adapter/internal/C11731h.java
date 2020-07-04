package com.bytedance.jedi.ext.adapter.internal;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.util.SparseArray;
import java.util.ArrayList;
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

/* renamed from: com.bytedance.jedi.ext.adapter.internal.h */
public final class C11731h {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f31517a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C11731h.class), "trashStation", "getTrashStation()Landroid/util/SparseArray;"))};

    /* renamed from: b */
    private final C7541d f31518b = C7546e.m23569a(C11732a.f31519a);

    /* renamed from: com.bytedance.jedi.ext.adapter.internal.h$a */
    static final class C11732a extends Lambda implements C7561a<SparseArray<List<C1293v>>> {

        /* renamed from: a */
        public static final C11732a f31519a = new C11732a();

        C11732a() {
            super(0);
        }

        /* renamed from: a */
        private static SparseArray<List<C1293v>> m34398a() {
            return new SparseArray<>();
        }

        public final /* synthetic */ Object invoke() {
            return m34398a();
        }
    }

    /* renamed from: a */
    private final SparseArray<List<C1293v>> m34395a() {
        return (SparseArray) this.f31518b.getValue();
    }

    /* renamed from: a */
    public final <VH> VH mo29307a(int i) {
        List list = (List) m34395a().get(i);
        if (list == null || !(!list.isEmpty())) {
            return null;
        }
        VH vh = (C1293v) list.remove(list.size() - 1);
        if (!(vh instanceof Object)) {
            vh = null;
        }
        return (Object) vh;
    }

    /* renamed from: a */
    public final void mo29308a(C1293v vVar) {
        C7573i.m23587b(vVar, "trash");
        int i = vVar.mItemViewType;
        List list = (List) m34395a().get(i);
        if (list == null) {
            list = new ArrayList();
            m34395a().put(i, list);
        }
        list.add(vVar);
    }
}

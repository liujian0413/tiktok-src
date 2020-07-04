package com.bytedance.jedi.ext.adapter.multitype;

import android.support.p029v7.widget.RecyclerView;
import android.view.ViewGroup;
import com.bytedance.jedi.ext.adapter.multitype.MultiTypeViewHolder;
import kotlin.C7581n;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;

/* renamed from: com.bytedance.jedi.ext.adapter.multitype.d */
public interface C11743d<VH extends MultiTypeViewHolder<?>> {

    /* renamed from: com.bytedance.jedi.ext.adapter.multitype.d$a */
    public static final class C11744a {

        /* renamed from: com.bytedance.jedi.ext.adapter.multitype.d$a$a */
        static final class C11745a extends Lambda implements C7562b<Integer, Boolean> {

            /* renamed from: a */
            public static final C11745a f31541a = new C11745a();

            C11745a() {
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                ((Number) obj).intValue();
                return Boolean.valueOf(true);
            }
        }

        /* renamed from: a */
        public static /* synthetic */ C11743d m34438a(C11743d dVar, C7562b bVar, C7563m mVar, C7562b bVar2, int i, Object obj) {
            if ((i & 1) != 0) {
                bVar = C11745a.f31541a;
            }
            return dVar.mo29315a(bVar, null, bVar2);
        }
    }

    /* renamed from: a */
    C11743d<VH> mo29314a(int i, C7563m<? super Integer, ? super RecyclerView, C7581n> mVar, C7562b<? super ViewGroup, ? extends VH> bVar);

    /* renamed from: a */
    C11743d<VH> mo29315a(C7562b<? super Integer, Boolean> bVar, C7563m<? super Integer, ? super RecyclerView, C7581n> mVar, C7562b<? super ViewGroup, ? extends VH> bVar2);
}

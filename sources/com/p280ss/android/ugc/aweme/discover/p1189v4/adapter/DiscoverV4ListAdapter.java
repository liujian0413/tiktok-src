package com.p280ss.android.ugc.aweme.discover.p1189v4.adapter;

import android.arch.lifecycle.C0043i;
import android.support.p029v7.util.C1143a.C1147c;
import android.view.ViewGroup;
import com.bytedance.jedi.arch.C11501d;
import com.bytedance.jedi.arch.ext.list.differ.C11567e.C11569b;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.bytedance.jedi.ext.adapter.multitype.C11743d;
import com.p280ss.android.ugc.aweme.base.arch.JediBaseMultiTypeAdapter;
import com.p280ss.android.ugc.aweme.discover.model.DiscoverCategoryStructV4;
import com.p280ss.android.ugc.aweme.discover.p1189v4.viewholder.DiscoverV4ListViewHolder;
import com.p280ss.android.ugc.aweme.discover.p1189v4.viewholder.DiscoverV4TopicViewHolder;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.aweme.discover.v4.adapter.DiscoverV4ListAdapter */
public final class DiscoverV4ListAdapter extends JediBaseMultiTypeAdapter<DiscoverCategoryStructV4> {

    /* renamed from: c */
    public static final C27153a f71578c = new C27153a(null);

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.adapter.DiscoverV4ListAdapter$a */
    public static final class C27153a {
        private C27153a() {
        }

        public /* synthetic */ C27153a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.adapter.DiscoverV4ListAdapter$b */
    static final class C27154b extends Lambda implements C7562b<ViewGroup, DiscoverV4TopicViewHolder> {

        /* renamed from: a */
        public static final C27154b f71579a = new C27154b();

        C27154b() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return m89034a((ViewGroup) obj);
        }

        /* renamed from: a */
        private static DiscoverV4TopicViewHolder m89034a(ViewGroup viewGroup) {
            C7573i.m23587b(viewGroup, "it");
            return new DiscoverV4TopicViewHolder(viewGroup);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.adapter.DiscoverV4ListAdapter$c */
    static final class C27155c extends Lambda implements C7562b<ViewGroup, DiscoverV4ListViewHolder> {

        /* renamed from: a */
        public static final C27155c f71580a = new C27155c();

        C27155c() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return m89035a((ViewGroup) obj);
        }

        /* renamed from: a */
        private static DiscoverV4ListViewHolder m89035a(ViewGroup viewGroup) {
            C7573i.m23587b(viewGroup, "it");
            return new DiscoverV4ListViewHolder(viewGroup);
        }
    }

    /* renamed from: a */
    public final int mo58029a(int i) {
        return i != 0 ? 1 : 0;
    }

    /* renamed from: a */
    public final void mo60560a(C11743d<JediViewHolder<? extends C11501d, ?>> dVar) {
        C7573i.m23587b(dVar, "registry");
        C11743d<JediViewHolder<? extends C11501d, ?>> dVar2 = dVar;
        dVar2.mo29314a(0, null, (C7562b<? super ViewGroup, ? extends VH>) C27154b.f71579a);
        dVar2.mo29314a(1, null, (C7562b<? super ViewGroup, ? extends VH>) C27155c.f71580a);
    }

    public DiscoverV4ListAdapter(C0043i iVar, C11569b bVar) {
        C7573i.m23587b(iVar, "parent");
        C7573i.m23587b(bVar, "fetcher");
        super(iVar, (C1147c<T>) new EqualsItemCallback<T>(), bVar);
    }
}

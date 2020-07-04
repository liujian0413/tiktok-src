package com.p280ss.android.ugc.aweme.favorites.adapter;

import android.arch.lifecycle.C0043i;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.jedi.arch.C11501d;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.bytedance.jedi.ext.adapter.multitype.C11743d;
import com.p280ss.android.ugc.aweme.base.arch.JediBaseMultiTypeAdapter;
import com.p280ss.android.ugc.aweme.favorites.viewholder.PoiCollectListBottomViewHolder;
import com.p280ss.android.ugc.aweme.favorites.viewholder.PoiCollectListItemViewHolder;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.aweme.favorites.adapter.PoiCollectListAdapter */
public final class PoiCollectListAdapter extends JediBaseMultiTypeAdapter<C27733b> {

    /* renamed from: d */
    public static final C27716a f73092d = new C27716a(null);

    /* renamed from: c */
    public final C0043i f73093c;

    /* renamed from: com.ss.android.ugc.aweme.favorites.adapter.PoiCollectListAdapter$a */
    public static final class C27716a {
        private C27716a() {
        }

        public /* synthetic */ C27716a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.adapter.PoiCollectListAdapter$b */
    static final class C27717b extends Lambda implements C7562b<ViewGroup, PoiCollectListItemViewHolder> {

        /* renamed from: a */
        public static final C27717b f73094a = new C27717b();

        C27717b() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return m90885a((ViewGroup) obj);
        }

        /* renamed from: a */
        private static PoiCollectListItemViewHolder m90885a(ViewGroup viewGroup) {
            C7573i.m23587b(viewGroup, "it");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a0k, viewGroup, false);
            C7573i.m23582a((Object) inflate, "LayoutInflater.from(it.c…m_poi_in_list, it, false)");
            return new PoiCollectListItemViewHolder(inflate);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.adapter.PoiCollectListAdapter$c */
    static final class C27718c extends Lambda implements C7562b<ViewGroup, PoiCollectListItemViewHolder> {

        /* renamed from: a */
        public static final C27718c f73095a = new C27718c();

        C27718c() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return m90886a((ViewGroup) obj);
        }

        /* renamed from: a */
        private static PoiCollectListItemViewHolder m90886a(ViewGroup viewGroup) {
            C7573i.m23587b(viewGroup, "it");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a0k, viewGroup, false);
            C7573i.m23582a((Object) inflate, "LayoutInflater.from(it.c…m_poi_in_list, it, false)");
            return new PoiCollectListItemViewHolder(inflate);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.adapter.PoiCollectListAdapter$d */
    static final class C27719d extends Lambda implements C7562b<ViewGroup, PoiCollectListHeadViewHolder> {

        /* renamed from: a */
        public static final C27719d f73096a = new C27719d();

        C27719d() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return m90887a((ViewGroup) obj);
        }

        /* renamed from: a */
        private static PoiCollectListHeadViewHolder m90887a(ViewGroup viewGroup) {
            C7573i.m23587b(viewGroup, "it");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a0f, viewGroup, false);
            C7573i.m23582a((Object) inflate, "LayoutInflater.from(it.c…_collect_head, it, false)");
            return new PoiCollectListHeadViewHolder(inflate);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.adapter.PoiCollectListAdapter$e */
    static final class C27720e extends Lambda implements C7562b<ViewGroup, PoiCollectListBottomViewHolder> {

        /* renamed from: a */
        public static final C27720e f73097a = new C27720e();

        C27720e() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return m90888a((ViewGroup) obj);
        }

        /* renamed from: a */
        private static PoiCollectListBottomViewHolder m90888a(ViewGroup viewGroup) {
            C7573i.m23587b(viewGroup, "it");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a0e, viewGroup, false);
            C7573i.m23582a((Object) inflate, "LayoutInflater.from(it.c…ollect_bottom, it, false)");
            return new PoiCollectListBottomViewHolder(inflate);
        }
    }

    public PoiCollectListAdapter(C0043i iVar) {
        C7573i.m23587b(iVar, "parent");
        super(iVar, null, null, 6, null);
        this.f73093c = iVar;
    }

    /* renamed from: a */
    public final int mo58029a(int i) {
        C27733b bVar = (C27733b) mo29135a(i, false);
        if (bVar != null) {
            return bVar.f73161a;
        }
        return super.mo58029a(i);
    }

    /* renamed from: a */
    public final void mo60560a(C11743d<JediViewHolder<? extends C11501d, ?>> dVar) {
        C7573i.m23587b(dVar, "registry");
        C11743d<JediViewHolder<? extends C11501d, ?>> dVar2 = dVar;
        dVar2.mo29314a(1, null, (C7562b<? super ViewGroup, ? extends VH>) C27717b.f73094a);
        dVar2.mo29314a(0, null, (C7562b<? super ViewGroup, ? extends VH>) C27718c.f73095a);
        dVar2.mo29314a(2, null, (C7562b<? super ViewGroup, ? extends VH>) C27719d.f73096a);
        dVar2.mo29314a(3, null, (C7562b<? super ViewGroup, ? extends VH>) C27720e.f73097a);
    }
}

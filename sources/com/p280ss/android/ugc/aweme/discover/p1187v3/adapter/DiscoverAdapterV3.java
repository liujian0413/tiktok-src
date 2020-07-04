package com.p280ss.android.ugc.aweme.discover.p1187v3.adapter;

import android.arch.lifecycle.C0043i;
import android.support.p029v7.util.C1143a.C1147c;
import android.view.ViewGroup;
import com.bytedance.jedi.arch.C11501d;
import com.bytedance.jedi.arch.ext.list.differ.C11567e.C11569b;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.bytedance.jedi.ext.adapter.multitype.C11743d;
import com.p280ss.android.ugc.aweme.base.arch.JediBaseMultiTypeAdapter;
import com.p280ss.android.ugc.aweme.discover.model.DiscoveryCellStructV3;
import com.p280ss.android.ugc.aweme.discover.p1187v3.viewholder.DiscoveryV3CoverViewHolder;
import com.p280ss.android.ugc.aweme.discover.p1187v3.viewholder.DiscoveryV3PlaylistViewHolder;
import com.p280ss.android.ugc.aweme.setting.C7213d;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.aweme.discover.v3.adapter.DiscoverAdapterV3 */
public final class DiscoverAdapterV3 extends JediBaseMultiTypeAdapter<DiscoveryCellStructV3> {

    /* renamed from: c */
    public static final C27107a f71485c = new C27107a(null);

    /* renamed from: com.ss.android.ugc.aweme.discover.v3.adapter.DiscoverAdapterV3$a */
    public static final class C27107a {
        private C27107a() {
        }

        public /* synthetic */ C27107a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v3.adapter.DiscoverAdapterV3$b */
    static final class C27108b extends Lambda implements C7562b<ViewGroup, DiscoveryV3CoverViewHolder> {

        /* renamed from: a */
        public static final C27108b f71486a = new C27108b();

        C27108b() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return m88921a((ViewGroup) obj);
        }

        /* renamed from: a */
        private static DiscoveryV3CoverViewHolder m88921a(ViewGroup viewGroup) {
            C7573i.m23587b(viewGroup, "it");
            return new DiscoveryV3CoverViewHolder(viewGroup);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v3.adapter.DiscoverAdapterV3$c */
    static final class C27109c extends Lambda implements C7562b<ViewGroup, DiscoveryV3PlaylistViewHolder> {

        /* renamed from: a */
        public static final C27109c f71487a = new C27109c();

        C27109c() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return m88922a((ViewGroup) obj);
        }

        /* renamed from: a */
        private static DiscoveryV3PlaylistViewHolder m88922a(ViewGroup viewGroup) {
            C7573i.m23587b(viewGroup, "it");
            return new DiscoveryV3PlaylistViewHolder(viewGroup);
        }
    }

    /* renamed from: a */
    public final void mo60560a(C11743d<JediViewHolder<? extends C11501d, ?>> dVar) {
        C7573i.m23587b(dVar, "registry");
        C11743d<JediViewHolder<? extends C11501d, ?>> dVar2 = dVar;
        dVar2.mo29314a(0, null, (C7562b<? super ViewGroup, ? extends VH>) C27108b.f71486a);
        dVar2.mo29314a(1, null, (C7562b<? super ViewGroup, ? extends VH>) C27109c.f71487a);
    }

    /* renamed from: a */
    public final int mo58029a(int i) {
        DiscoveryCellStructV3 discoveryCellStructV3 = (DiscoveryCellStructV3) mo29135a(i, false);
        if (discoveryCellStructV3 != null && discoveryCellStructV3.type == 3) {
            C7573i.m23582a((Object) C7213d.m22500a(), "AbTestManager.getInstance()");
            if (C7213d.m22501aV() != 2) {
                return 0;
            }
        }
        return 1;
    }

    public DiscoverAdapterV3(C0043i iVar, C11569b bVar) {
        C7573i.m23587b(iVar, "parent");
        C7573i.m23587b(bVar, "fetcher");
        super(iVar, (C1147c<T>) new EqualsItemCallback<T>(), bVar);
    }
}

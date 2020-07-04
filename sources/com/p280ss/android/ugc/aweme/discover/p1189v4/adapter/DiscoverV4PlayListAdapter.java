package com.p280ss.android.ugc.aweme.discover.p1189v4.adapter;

import android.arch.lifecycle.C0043i;
import android.support.p029v7.util.C1143a.C1147c;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.jedi.arch.C11501d;
import com.bytedance.jedi.arch.ext.list.differ.C11567e.C11569b;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.bytedance.jedi.ext.adapter.multitype.C11743d;
import com.p280ss.android.ugc.aweme.base.arch.JediBaseMultiTypeAdapter;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.discover.model.DiscoverPlayListStructV4;
import com.p280ss.android.ugc.aweme.discover.model.DiscoverV4PlayListDataCenter;
import com.p280ss.android.ugc.aweme.discover.p1189v4.viewholder.DiscoverV4CoverViewHolder;
import com.p280ss.android.ugc.aweme.discover.p1189v4.viewholder.DiscoverV4PlayListViewHolder;
import com.p280ss.android.ugc.aweme.discover.p1189v4.viewholder.DiscoverV4TrendingViewHolder;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;
import kotlin.p1878b.C47891a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.discover.v4.adapter.DiscoverV4PlayListAdapter */
public final class DiscoverV4PlayListAdapter extends JediBaseMultiTypeAdapter<DiscoverPlayListStructV4> {

    /* renamed from: c */
    static final /* synthetic */ C7595j[] f71581c = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(DiscoverV4PlayListAdapter.class), "screenWidth", "getScreenWidth()I")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(DiscoverV4PlayListAdapter.class), "cellHeight", "getCellHeight()F")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(DiscoverV4PlayListAdapter.class), "trendingCellHeight", "getTrendingCellHeight()F"))};

    /* renamed from: f */
    public static final C27156a f71582f = new C27156a(null);

    /* renamed from: d */
    public final String f71583d;

    /* renamed from: e */
    public final String f71584e;

    /* renamed from: g */
    private final C7541d f71585g = C7546e.m23569a(C27161f.f71592a);

    /* renamed from: h */
    private final C7541d f71586h = C7546e.m23569a(new C27157b(this));

    /* renamed from: i */
    private final C7541d f71587i = C7546e.m23569a(new C27162g(this));

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.adapter.DiscoverV4PlayListAdapter$a */
    public static final class C27156a {
        private C27156a() {
        }

        public /* synthetic */ C27156a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.adapter.DiscoverV4PlayListAdapter$b */
    static final class C27157b extends Lambda implements C7561a<Float> {

        /* renamed from: a */
        final /* synthetic */ DiscoverV4PlayListAdapter f71588a;

        C27157b(DiscoverV4PlayListAdapter discoverV4PlayListAdapter) {
            this.f71588a = discoverV4PlayListAdapter;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Float.valueOf(m89043a());
        }

        /* renamed from: a */
        private float m89043a() {
            return ((((float) this.f71588a.mo69921f()) / 2.0f) * 4.0f) / 3.0f;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.adapter.DiscoverV4PlayListAdapter$c */
    static final class C27158c extends Lambda implements C7562b<ViewGroup, DiscoverV4TrendingViewHolder> {

        /* renamed from: a */
        final /* synthetic */ DiscoverV4PlayListAdapter f71589a;

        C27158c(DiscoverV4PlayListAdapter discoverV4PlayListAdapter) {
            this.f71589a = discoverV4PlayListAdapter;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public DiscoverV4TrendingViewHolder invoke(ViewGroup viewGroup) {
            C7573i.m23587b(viewGroup, "it");
            return new DiscoverV4TrendingViewHolder(viewGroup, C47891a.m148821a(this.f71589a.mo69923j()), this.f71589a.f71583d, this.f71589a.f71584e);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.adapter.DiscoverV4PlayListAdapter$d */
    static final class C27159d extends Lambda implements C7562b<ViewGroup, DiscoverV4PlayListViewHolder> {

        /* renamed from: a */
        final /* synthetic */ DiscoverV4PlayListAdapter f71590a;

        C27159d(DiscoverV4PlayListAdapter discoverV4PlayListAdapter) {
            this.f71590a = discoverV4PlayListAdapter;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public DiscoverV4PlayListViewHolder invoke(ViewGroup viewGroup) {
            C7573i.m23587b(viewGroup, "it");
            return new DiscoverV4PlayListViewHolder(viewGroup, C47891a.m148821a(this.f71590a.mo69922g()), this.f71590a.f71583d, this.f71590a.f71584e);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.adapter.DiscoverV4PlayListAdapter$e */
    static final class C27160e extends Lambda implements C7562b<ViewGroup, DiscoverV4CoverViewHolder> {

        /* renamed from: a */
        final /* synthetic */ DiscoverV4PlayListAdapter f71591a;

        C27160e(DiscoverV4PlayListAdapter discoverV4PlayListAdapter) {
            this.f71591a = discoverV4PlayListAdapter;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public DiscoverV4CoverViewHolder invoke(ViewGroup viewGroup) {
            C7573i.m23587b(viewGroup, "it");
            return new DiscoverV4CoverViewHolder(viewGroup, C47891a.m148821a(this.f71591a.mo69922g()), this.f71591a.f71583d, this.f71591a.f71584e);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.adapter.DiscoverV4PlayListAdapter$f */
    static final class C27161f extends Lambda implements C7561a<Integer> {

        /* renamed from: a */
        public static final C27161f f71592a = new C27161f();

        C27161f() {
            super(0);
        }

        /* renamed from: a */
        private static int m89047a() {
            return C9738o.m28691a(C6399b.m19921a());
        }

        public final /* synthetic */ Object invoke() {
            return Integer.valueOf(m89047a());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.adapter.DiscoverV4PlayListAdapter$g */
    static final class C27162g extends Lambda implements C7561a<Float> {

        /* renamed from: a */
        final /* synthetic */ DiscoverV4PlayListAdapter f71593a;

        C27162g(DiscoverV4PlayListAdapter discoverV4PlayListAdapter) {
            this.f71593a = discoverV4PlayListAdapter;
            super(0);
        }

        /* renamed from: a */
        private float m89048a() {
            return (((float) this.f71593a.mo69921f()) * 11.0f) / 10.0f;
        }

        public final /* synthetic */ Object invoke() {
            return Float.valueOf(m89048a());
        }
    }

    /* renamed from: f */
    public final int mo69921f() {
        return ((Number) this.f71585g.getValue()).intValue();
    }

    /* renamed from: g */
    public final float mo69922g() {
        return ((Number) this.f71586h.getValue()).floatValue();
    }

    /* renamed from: j */
    public final float mo69923j() {
        return ((Number) this.f71587i.getValue()).floatValue();
    }

    /* renamed from: k */
    public final float mo69924k() {
        return mo69922g() + ((float) C23486n.m77122a(1.0d));
    }

    /* renamed from: l */
    public final float mo69925l() {
        return mo69923j() + ((float) C23486n.m77122a(1.0d));
    }

    /* renamed from: a */
    public final int mo58029a(int i) {
        int i2 = 0;
        if (!TextUtils.equals(this.f71583d, DiscoverV4PlayListDataCenter.Companion.getTRENDING_PLAYLIST())) {
            int i3 = i % 4;
            if (i3 == 1 || i3 == 2) {
                return 1;
            }
        } else if (i == 0) {
            return 2;
        } else {
            if (!(i == 1 || i == 2)) {
                int i4 = (i - 3) % 4;
                if (i4 != 1 && i4 != 2) {
                    return 0;
                }
                i2 = 1;
            }
        }
        return i2;
    }

    /* renamed from: a */
    public final void mo60560a(C11743d<JediViewHolder<? extends C11501d, ?>> dVar) {
        C7573i.m23587b(dVar, "registry");
        C11743d<JediViewHolder<? extends C11501d, ?>> dVar2 = dVar;
        dVar2.mo29314a(2, null, (C7562b<? super ViewGroup, ? extends VH>) new C27158c<Object,Object>(this));
        dVar2.mo29314a(1, null, (C7562b<? super ViewGroup, ? extends VH>) new C27159d<Object,Object>(this));
        dVar2.mo29314a(0, null, (C7562b<? super ViewGroup, ? extends VH>) new C27160e<Object,Object>(this));
    }

    public DiscoverV4PlayListAdapter(C0043i iVar, C11569b bVar, String str, String str2) {
        C7573i.m23587b(iVar, "parent");
        C7573i.m23587b(bVar, "fetcher");
        C7573i.m23587b(str, "tabName");
        C7573i.m23587b(str2, "tabText");
        super(iVar, (C1147c<T>) new PlayListEqualsItemCallback<T>(), bVar);
        this.f71583d = str;
        this.f71584e = str2;
    }
}

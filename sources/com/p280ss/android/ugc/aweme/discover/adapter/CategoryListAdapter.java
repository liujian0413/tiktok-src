package com.p280ss.android.ugc.aweme.discover.adapter;

import android.content.Context;
import android.support.p022v4.app.Fragment;
import android.support.p029v7.util.C1143a.C1147c;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.view.View;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.jedi.arch.ext.list.differ.C11561b;
import com.bytedance.jedi.arch.ext.list.differ.C11567e.C11569b;
import com.p280ss.android.ugc.aweme.commercialize.loft.model.C24877b;
import com.p280ss.android.ugc.aweme.commercialize.loft.model.C24891f;
import com.p280ss.android.ugc.aweme.common.p1147h.C25692c;
import com.p280ss.android.ugc.aweme.common.p1147h.C25692c.C25694b;
import com.p280ss.android.ugc.aweme.discover.base.MultiTypeAdapter;
import com.p280ss.android.ugc.aweme.discover.delegate.C26615a;
import com.p280ss.android.ugc.aweme.discover.delegate.C26616b;
import com.p280ss.android.ugc.aweme.discover.delegate.C26617c;
import com.p280ss.android.ugc.aweme.discover.delegate.C26618d;
import com.p280ss.android.ugc.aweme.discover.delegate.C26619e;
import com.p280ss.android.ugc.aweme.discover.delegate.C26620f;
import com.p280ss.android.ugc.aweme.discover.delegate.C26621g;
import com.p280ss.android.ugc.aweme.discover.delegate.FallbackDelegate;
import com.p280ss.android.ugc.aweme.discover.helper.C26654b;
import com.p280ss.android.ugc.aweme.discover.model.DiscoverItemData;
import com.p280ss.android.ugc.aweme.experiment.StopAnimWhenInvisibleExperiment;
import java.io.Serializable;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.CategoryListAdapter */
public final class CategoryListAdapter extends MultiTypeAdapter<DiscoverItemData> implements C25694b {

    /* renamed from: b */
    public static final int f69433b = f69433b;

    /* renamed from: c */
    public static final int f69434c = f69434c;

    /* renamed from: d */
    public static final int f69435d = f69435d;

    /* renamed from: e */
    public static final int f69436e = f69436e;

    /* renamed from: f */
    public static final String f69437f = f69437f;

    /* renamed from: g */
    public static final C26375a f69438g = new C26375a(null);

    /* renamed from: a */
    public final C11561b<Object> f69439a;

    /* renamed from: i */
    private RecyclerView f69440i;

    /* renamed from: j */
    private final C26620f f69441j;

    /* renamed from: k */
    private final C26615a f69442k;

    /* renamed from: l */
    private C26618d f69443l;

    /* renamed from: m */
    private C26617c f69444m;

    /* renamed from: n */
    private final C26621g f69445n;

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.CategoryListAdapter$a */
    public static final class C26375a {
        private C26375a() {
        }

        /* renamed from: a */
        public static int m86755a() {
            return CategoryListAdapter.f69433b;
        }

        /* renamed from: b */
        public static int m86756b() {
            return CategoryListAdapter.f69434c;
        }

        /* renamed from: c */
        public static int m86757c() {
            return CategoryListAdapter.f69436e;
        }

        public /* synthetic */ C26375a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.CategoryListAdapter$b */
    public interface C26376b {
        /* renamed from: a */
        void mo67924a(View view);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.CategoryListAdapter$c */
    static final class C26377c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ RecyclerView f69446a;

        C26377c(RecyclerView recyclerView) {
            this.f69446a = recyclerView;
        }

        public final void run() {
            C25692c.m84439a(this.f69446a);
        }
    }

    public CategoryListAdapter() {
        this(null, 1, null);
    }

    /* renamed from: a */
    private final void m86745a() {
        RecyclerView recyclerView = this.f69440i;
        if (recyclerView != null) {
            recyclerView.post(new C26377c(recyclerView));
        }
    }

    /* renamed from: b */
    private int m86746b() {
        int size = this.f70134h.size();
        for (int i = 0; i < size; i++) {
            if (((DiscoverItemData) this.f70134h.get(i)).getType() == 5) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: c */
    private int m86748c() {
        int size = this.f70134h.size();
        for (int i = 0; i < size; i++) {
            if (((DiscoverItemData) this.f70134h.get(i)).getType() == 1) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public final void mo67920a(C26376b bVar) {
        C26615a aVar = this.f69442k;
        if (aVar != null) {
            aVar.f70195b = bVar;
        }
    }

    /* renamed from: b */
    public final boolean mo67923b(int i) {
        int b = m86746b();
        if (b < 0 || i < b) {
            return false;
        }
        return true;
    }

    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        C7573i.m23587b(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        this.f69440i = recyclerView;
    }

    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        C7573i.m23587b(recyclerView, "recyclerView");
        super.onDetachedFromRecyclerView(recyclerView);
        this.f69440i = null;
    }

    /* renamed from: b */
    private final void m86747b(boolean z) {
        if (this.f69444m != null) {
            C26617c cVar = this.f69444m;
            if (cVar == null) {
                C7573i.m23580a();
            }
            cVar.f70197a = z;
        }
        C26615a aVar = this.f69442k;
        if (aVar != null) {
            aVar.f70194a = z;
        }
        if (this.f69443l != null) {
            C26618d dVar = this.f69443l;
            if (dVar == null) {
                C7573i.m23580a();
            }
            dVar.f70198a = z;
        }
    }

    /* renamed from: a */
    public final Object mo66583a(int i) {
        int b = m86746b();
        if (i < 0 || i < b || i >= this.f70134h.size()) {
            return Integer.valueOf(i);
        }
        return (Serializable) this.f70134h.get(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003c, code lost:
        if (r0 != null) goto L_0x003e;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo67921a(java.util.List<com.p280ss.android.ugc.aweme.discover.model.DiscoverItemData> r4) {
        /*
            r3 = this;
            if (r4 != 0) goto L_0x0003
            return
        L_0x0003:
            java.util.List<T> r0 = r3.f70134h
            r0.clear()
            java.util.List<T> r0 = r3.f70134h
            r1 = r4
            java.util.Collection r1 = (java.util.Collection) r1
            r0.addAll(r1)
            java.util.Iterator r4 = r4.iterator()
        L_0x0014:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0043
            java.lang.Object r0 = r4.next()
            com.ss.android.ugc.aweme.discover.model.DiscoverItemData r0 = (com.p280ss.android.ugc.aweme.discover.model.DiscoverItemData) r0
            int r1 = r0.getType()
            r2 = 2
            if (r1 != r2) goto L_0x0014
            com.ss.android.ugc.aweme.discover.model.RankingListCover r4 = r0.getRankingListCover()
            r0 = 0
            if (r4 == 0) goto L_0x0033
            com.ss.android.ugc.aweme.commerce.service.models.DiscoveryTopGoods r1 = r4.getTopGoods()
            goto L_0x0034
        L_0x0033:
            r1 = r0
        L_0x0034:
            if (r1 != 0) goto L_0x003e
            if (r4 == 0) goto L_0x003c
            com.ss.android.ugc.aweme.music.model.BrandBillboard r0 = r4.getTopBrand()
        L_0x003c:
            if (r0 == 0) goto L_0x0043
        L_0x003e:
            com.ss.android.ugc.aweme.discover.delegate.g r4 = r3.f69445n
            r0 = 1
            r4.f70201a = r0
        L_0x0043:
            r3.notifyDataSetChanged()
            r3.m86745a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.discover.adapter.CategoryListAdapter.mo67921a(java.util.List):void");
    }

    public CategoryListAdapter(Fragment fragment) {
        this.f69439a = new C11561b<>((C1262a<?>) this, (C1147c<T>) new Differ<T>(), (C11569b) null);
        this.f69441j = new C26620f(fragment);
        mo68272a(this.f69441j);
        this.f69445n = new C26621g(fragment);
        mo68272a(this.f69445n);
        mo68271a(f69436e, new C26619e());
        this.f69442k = new C26615a();
        mo68272a(this.f69442k);
        if (C26654b.m87574b()) {
            mo68273b(new FallbackDelegate());
            this.f69443l = new C26618d();
            int i = f69434c;
            C26618d dVar = this.f69443l;
            if (dVar == null) {
                C7573i.m23580a();
            }
            mo68271a(i, dVar);
            mo68272a(new C26616b());
            return;
        }
        this.f69444m = new C26617c();
        int i2 = f69433b;
        C26617c cVar = this.f69444m;
        if (cVar == null) {
            C7573i.m23580a();
        }
        mo68271a(i2, cVar);
    }

    /* renamed from: a */
    public final void mo67922a(boolean z) {
        if (C6384b.m19835a().mo15292a(StopAnimWhenInvisibleExperiment.class, true, "stop_main_anim_when_invisible", C6384b.m19835a().mo15295d().stop_main_anim_when_invisible, false)) {
            m86747b(!z);
        }
        if (this.f69442k != null) {
            this.f69442k.mo68313a(!z);
            this.f69442k.mo68314b(!z);
        }
    }

    /* renamed from: a */
    public final void mo67919a(C24891f fVar, Context context) {
        C7573i.m23587b(context, "context");
        ((C24877b) C24877b.f65602l.mo65136a(context)).f65605c = fVar;
        int c = m86748c();
        if (c >= 0) {
            notifyItemChanged(c, fVar);
        }
    }

    private /* synthetic */ CategoryListAdapter(Fragment fragment, int i, C7571f fVar) {
        this(null);
    }
}

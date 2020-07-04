package com.p280ss.android.ugc.aweme.p313im.sdk.share.panel.adapter;

import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.p313im.sdk.share.panel.model.FakeMoreIMContact;
import com.p280ss.android.ugc.aweme.p313im.sdk.share.panel.viewholder.SharePanelHeadMoreViewHolder;
import com.p280ss.android.ugc.aweme.p313im.sdk.share.panel.viewholder.SharePanelHeadMoreViewHolder.C31837a;
import com.p280ss.android.ugc.aweme.p313im.sdk.share.panel.viewholder.SharePanelHeadViewHolder;
import com.p280ss.android.ugc.aweme.p313im.sdk.share.panel.viewholder.SharePanelHeadViewHolder.C31839a;
import com.p280ss.android.ugc.aweme.p313im.sdk.share.panel.viewmodel.SharePanelViewModel;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMContact;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.adapter.SharePanelHeadAdapter */
public final class SharePanelHeadAdapter extends C1262a<C1293v> {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f83272a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(SharePanelHeadAdapter.class), "data", "getData()Ljava/util/List;"))};

    /* renamed from: b */
    public static final C31831a f83273b = new C31831a(null);

    /* renamed from: c */
    private final C7541d f83274c = C7546e.m23569a(C31832b.f83276a);

    /* renamed from: d */
    private final SharePanelViewModel f83275d;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.adapter.SharePanelHeadAdapter$a */
    public static final class C31831a {
        private C31831a() {
        }

        public /* synthetic */ C31831a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.adapter.SharePanelHeadAdapter$b */
    static final class C31832b extends Lambda implements C7561a<List<IMContact>> {

        /* renamed from: a */
        public static final C31832b f83276a = new C31832b();

        C31832b() {
            super(0);
        }

        /* renamed from: a */
        private static List<IMContact> m103303a() {
            return new ArrayList<>();
        }

        public final /* synthetic */ Object invoke() {
            return m103303a();
        }
    }

    /* renamed from: a */
    private final List<IMContact> m103300a() {
        return (List) this.f83274c.getValue();
    }

    /* renamed from: b */
    private static IMContact m103301b() {
        return new FakeMoreIMContact();
    }

    public final int getItemCount() {
        return m103300a().size();
    }

    public final int getItemViewType(int i) {
        if (m103300a().get(i) instanceof FakeMoreIMContact) {
            return 2;
        }
        return 1;
    }

    public SharePanelHeadAdapter(SharePanelViewModel sharePanelViewModel) {
        C7573i.m23587b(sharePanelViewModel, "viewModel");
        this.f83275d = sharePanelViewModel;
    }

    /* renamed from: a */
    public final void mo82651a(List<IMContact> list) {
        boolean z;
        List a = m103300a();
        Collection collection = list;
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        Integer num = null;
        if (z) {
            a = null;
        }
        if (a != null) {
            a.clear();
            if (list == null) {
                C7573i.m23580a();
            }
            a.addAll(collection);
            a.add(m103301b());
            notifyDataSetChanged();
        }
        StringBuilder sb = new StringBuilder("setData: ");
        if (list != null) {
            num = Integer.valueOf(list.size());
        }
        sb.append(num);
        sb.append(", ");
        sb.append(m103300a().size());
    }

    public final C1293v onCreateViewHolder(ViewGroup viewGroup, int i) {
        C7573i.m23587b(viewGroup, "parent");
        if (i != 2) {
            return C31839a.m103328a(viewGroup, this.f83275d);
        }
        return C31837a.m103321a(viewGroup, this.f83275d);
    }

    public final void onBindViewHolder(C1293v vVar, int i) {
        C7573i.m23587b(vVar, "viewHolder");
        if (vVar instanceof SharePanelHeadMoreViewHolder) {
            ((SharePanelHeadMoreViewHolder) vVar).mo82661a((IMContact) m103300a().get(i));
            return;
        }
        if (vVar instanceof SharePanelHeadViewHolder) {
            ((SharePanelHeadViewHolder) vVar).mo82663a((IMContact) m103300a().get(i));
        }
    }
}

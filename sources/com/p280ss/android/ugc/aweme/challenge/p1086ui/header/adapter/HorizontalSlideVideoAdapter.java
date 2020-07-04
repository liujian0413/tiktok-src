package com.p280ss.android.ugc.aweme.challenge.p1086ui.header.adapter;

import android.support.p029v7.widget.RecyclerView.C1262a;
import android.view.ViewGroup;
import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.ugc.aweme.challenge.p1086ui.header.adapter.HorizontalSlideVideoViewHolder.C23762a;
import com.p280ss.android.ugc.aweme.challenge.p1086ui.header.adapter.HorizontalSlideVideoViewHolder.C23763b;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.challenge.ui.header.adapter.HorizontalSlideVideoAdapter */
public final class HorizontalSlideVideoAdapter extends C1262a<HorizontalSlideVideoViewHolder> {

    /* renamed from: a */
    public final C23763b f62707a;

    /* renamed from: b */
    private final List<Aweme> f62708b = new ArrayList();

    public final int getItemCount() {
        return this.f62708b.size();
    }

    public HorizontalSlideVideoAdapter(C23763b bVar) {
        C7573i.m23587b(bVar, "listener");
        this.f62707a = bVar;
    }

    /* renamed from: a */
    public final void mo61798a(List<? extends Aweme> list) {
        Collection collection = list;
        if (!C6307b.m19566a(collection)) {
            this.f62708b.clear();
            List<Aweme> list2 = this.f62708b;
            if (list == null) {
                C7573i.m23580a();
            }
            list2.addAll(collection);
            notifyDataSetChanged();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public HorizontalSlideVideoViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C7573i.m23587b(viewGroup, "parent");
        return C23762a.m77911a(viewGroup, this.f62707a);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onBindViewHolder(HorizontalSlideVideoViewHolder horizontalSlideVideoViewHolder, int i) {
        C7573i.m23587b(horizontalSlideVideoViewHolder, "viewHolder");
        horizontalSlideVideoViewHolder.mo61799a((Aweme) this.f62708b.get(i));
    }
}

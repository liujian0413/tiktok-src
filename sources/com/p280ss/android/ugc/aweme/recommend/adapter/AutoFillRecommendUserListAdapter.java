package com.p280ss.android.ugc.aweme.recommend.adapter;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.recommend.viewholder.FeedAutoFillRecommendUserItemHolder;
import java.util.HashSet;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.recommend.adapter.AutoFillRecommendUserListAdapter */
public final class AutoFillRecommendUserListAdapter extends RecommendListAdapter {

    /* renamed from: a */
    private final HashSet<String> f97160a;

    /* renamed from: a */
    public final int mo58029a(int i) {
        return 5;
    }

    public AutoFillRecommendUserListAdapter(HashSet<String> hashSet) {
        C7573i.m23587b(hashSet, "mImpressionMap");
        super(5);
        this.f97160a = hashSet;
    }

    /* renamed from: a */
    public final C1293v mo58032a(ViewGroup viewGroup, int i) {
        C7573i.m23587b(viewGroup, "parent");
        return new FeedAutoFillRecommendUserItemHolder(viewGroup, this.f97160a);
    }

    /* renamed from: a */
    public final void mo58033a(C1293v vVar, int i) {
        C1293v vVar2;
        boolean z;
        C7573i.m23587b(vVar, "holder");
        if (!(vVar instanceof FeedAutoFillRecommendUserItemHolder)) {
            vVar2 = null;
        } else {
            vVar2 = vVar;
        }
        FeedAutoFillRecommendUserItemHolder feedAutoFillRecommendUserItemHolder = (FeedAutoFillRecommendUserItemHolder) vVar2;
        if (feedAutoFillRecommendUserItemHolder != null) {
            User b = mo93605b(i);
            boolean z2 = false;
            if (i == 0) {
                z = true;
            } else {
                z = false;
            }
            if (i == mo60557c() - 1) {
                z2 = true;
            }
            feedAutoFillRecommendUserItemHolder.mo93631a(b, z, z2);
            if (i < mo60557c() - 1) {
                ((FeedAutoFillRecommendUserItemHolder) vVar).mo93625c();
            } else {
                ((FeedAutoFillRecommendUserItemHolder) vVar).mo93627d();
            }
        }
    }
}

package com.p280ss.android.ugc.aweme.follow.recommend.follow.view;

import android.arch.lifecycle.C0043i;
import android.content.Context;
import android.support.p029v7.util.C1143a.C1147c;
import android.view.ViewGroup;
import com.bytedance.jedi.arch.C11501d;
import com.bytedance.jedi.arch.ext.list.differ.C11567e.C11569b;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.p280ss.android.ugc.aweme.base.arch.JediBaseSingleTypeAdapter;
import com.p280ss.android.ugc.aweme.follow.recommend.follow.repo.C29480e;
import com.p280ss.android.ugc.aweme.following.p1265ui.view.ConnectedRelationItemView;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.follow.recommend.follow.view.RecommendFollowAdapter */
public final class RecommendFollowAdapter extends JediBaseSingleTypeAdapter<C29480e> {
    /* renamed from: a */
    public final JediViewHolder<? extends C11501d, C29480e> mo60559a(ViewGroup viewGroup) {
        C7573i.m23587b(viewGroup, "parent");
        Context context = viewGroup.getContext();
        C7573i.m23582a((Object) context, "parent.context");
        ConnectedRelationItemView connectedRelationItemView = new ConnectedRelationItemView(context, null, 0, 6, null);
        return new RecommendFollowViewHolder<>(connectedRelationItemView);
    }

    private RecommendFollowAdapter(C0043i iVar, C11569b bVar) {
        C7573i.m23587b(iVar, "parent");
        super(iVar, (C1147c<T>) new RecommendFollowDiff<T>(), bVar);
    }

    public /* synthetic */ RecommendFollowAdapter(C0043i iVar, C11569b bVar, int i, C7571f fVar) {
        this(iVar, null);
    }
}

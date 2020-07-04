package com.p280ss.android.ugc.aweme.discover.p1189v4.viewholder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.p280ss.android.ugc.aweme.discover.model.DiscoverCategoryStructV4;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.v4.viewholder.DiscoverV4TopicViewHolder */
public final class DiscoverV4TopicViewHolder extends JediSimpleViewHolder<DiscoverCategoryStructV4> {

    /* renamed from: f */
    public final ViewGroup f71699f;

    /* renamed from: a */
    private static void m89187a(DiscoverCategoryStructV4 discoverCategoryStructV4) {
        C7573i.m23587b(discoverCategoryStructV4, "item");
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo29209a(Object obj) {
        m89187a((DiscoverCategoryStructV4) obj);
    }

    public DiscoverV4TopicViewHolder(ViewGroup viewGroup) {
        C7573i.m23587b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.ul, viewGroup, false);
        C7573i.m23582a((Object) inflate, "LayoutInflater.from(pare…_v4_topic, parent, false)");
        super(inflate);
        this.f71699f = viewGroup;
    }
}

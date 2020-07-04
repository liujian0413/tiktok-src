package com.p280ss.android.ugc.aweme.feed.adapter;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.p280ss.android.ugc.aweme.common.p1142c.C25664e;
import com.p280ss.android.ugc.aweme.feed.adapter.SuperRecommendViewHolder.C28083a;
import com.p280ss.android.ugc.aweme.feed.adapter.SuperRecommendViewHolder.C28084b;
import com.p280ss.android.ugc.aweme.feed.guide.GalleryLayoutManager;
import com.p280ss.android.ugc.aweme.friends.model.UserWithAweme;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.p1487ui.widget.RecommendUserAdapter.C36630b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.SuperRecommendAdapter */
public final class SuperRecommendAdapter extends BaseAdapter<UserWithAweme> implements C28083a, C28084b {

    /* renamed from: a */
    public String f74033a = "";

    /* renamed from: b */
    private C25664e<SuperRecommendViewHolder> f74034b;

    /* renamed from: c */
    private C36630b f74035c;

    /* renamed from: d */
    private final GalleryLayoutManager f74036d;

    /* renamed from: a */
    public final void mo71610a(C25664e<SuperRecommendViewHolder> eVar) {
        C7573i.m23587b(eVar, "onViewFirstShowListener");
        this.f74034b = eVar;
    }

    /* renamed from: b */
    public final void mo71614b(int i) {
        this.f74036d.mo5427b(i + 1);
    }

    public SuperRecommendAdapter(GalleryLayoutManager galleryLayoutManager) {
        C7573i.m23587b(galleryLayoutManager, "mLayoutManager");
        this.f74036d = galleryLayoutManager;
    }

    /* renamed from: a */
    public final void mo71612a(C36630b bVar) {
        C7573i.m23587b(bVar, "onItemOperationListener");
        this.f74035c = bVar;
    }

    /* renamed from: c */
    private final UserWithAweme m91958c(int i) {
        if (this.f67539l == null || i < 0 || i >= this.f67539l.size()) {
            return null;
        }
        return (UserWithAweme) this.f67539l.get(i);
    }

    /* renamed from: a */
    public final void mo71613a(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.f74033a = str;
    }

    /* renamed from: a */
    public final void mo58033a(C1293v vVar, int i) {
        C7573i.m23587b(vVar, "viewHolder");
        SuperRecommendViewHolder superRecommendViewHolder = (SuperRecommendViewHolder) vVar;
        C36630b bVar = this.f74035c;
        C25664e<SuperRecommendViewHolder> eVar = this.f74034b;
        UserWithAweme c = m91958c(i);
        if (c == null) {
            C7573i.m23580a();
        }
        superRecommendViewHolder.mo71618a(bVar, eVar, c, this.f74033a);
    }

    /* renamed from: a */
    public final C1293v mo58032a(ViewGroup viewGroup, int i) {
        C7573i.m23587b(viewGroup, "viewGroup");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.b39, viewGroup, false);
        C7573i.m23582a((Object) inflate, "LayoutInflater.from(view…d_card, viewGroup, false)");
        return new SuperRecommendViewHolder(inflate, this, this, this.f74036d);
    }

    /* renamed from: a */
    public final void mo71611a(User user, int i) {
        C7573i.m23587b(user, "user");
        if (this.f74036d.mo5368a(i)) {
            mo62312a().remove(this.f74036d.f74738a);
            notifyItemRemoved(this.f74036d.f74738a);
        }
    }
}

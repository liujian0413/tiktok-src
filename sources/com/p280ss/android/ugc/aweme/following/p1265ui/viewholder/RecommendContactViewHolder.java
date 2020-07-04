package com.p280ss.android.ugc.aweme.following.p1265ui.viewholder;

import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.p280ss.android.ugc.aweme.friends.model.RecommendContact;
import com.p280ss.android.ugc.aweme.friends.p1285ui.RecommendContactItemView;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.recommend.viewmodel.RecommendUserListState;
import com.p280ss.android.ugc.aweme.recommend.viewmodel.RecommendUserListViewModel;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;
import kotlin.reflect.C7584c;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.following.ui.viewholder.RecommendContactViewHolder */
public final class RecommendContactViewHolder extends JediSimpleViewHolder<RecommendContact> {

    /* renamed from: f */
    static final /* synthetic */ C7595j[] f78330f = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(RecommendContactViewHolder.class), "mRecommendListViewModel", "getMRecommendListViewModel()Lcom/ss/android/ugc/aweme/recommend/viewmodel/RecommendUserListViewModel;"))};

    /* renamed from: g */
    private final C7541d f78331g;

    /* renamed from: j */
    private final RecommendContactItemView f78332j;

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewholder.RecommendContactViewHolder$a */
    static final class C29787a extends Lambda implements C7563m<RecommendContact, Integer, C7581n> {

        /* renamed from: a */
        final /* synthetic */ RecommendContactViewHolder f78333a;

        C29787a(RecommendContactViewHolder recommendContactViewHolder) {
            this.f78333a = recommendContactViewHolder;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m97530a((RecommendContact) obj, ((Number) obj2).intValue());
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m97530a(RecommendContact recommendContact, int i) {
            C7573i.m23587b(recommendContact, "contact");
            this.f78333a.mo62390p().mo93672a((User) recommendContact);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewholder.RecommendContactViewHolder$b */
    static final class C29788b extends Lambda implements C7562b<RecommendUserListState, String> {

        /* renamed from: a */
        public static final C29788b f78334a = new C29788b();

        C29788b() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return m97531a((RecommendUserListState) obj);
        }

        /* renamed from: a */
        private static String m97531a(RecommendUserListState recommendUserListState) {
            C7573i.m23587b(recommendUserListState, "it");
            return recommendUserListState.getRecommendMobParams().f97284a;
        }
    }

    /* renamed from: p */
    public final RecommendUserListViewModel mo62390p() {
        return (RecommendUserListViewModel) this.f78331g.getValue();
    }

    public final void bA_() {
        super.bA_();
        this.f78332j.setEnterFrom((String) mo29066a(mo62390p(), (C7562b<? super S1, ? extends R>) C29788b.f78334a));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo29209a(RecommendContact recommendContact) {
        C7573i.m23587b(recommendContact, "item");
        this.f78332j.mo76565a(recommendContact, getAdapterPosition());
        this.f78332j.setDislikeListener(new C29787a(this));
    }

    public RecommendContactViewHolder(RecommendContactItemView recommendContactItemView) {
        C7573i.m23587b(recommendContactItemView, "recommendView");
        super(recommendContactItemView);
        this.f78332j = recommendContactItemView;
        C7584c a = C7575l.m23595a(RecommendUserListViewModel.class);
        this.f78331g = C7546e.m23569a(new RecommendContactViewHolder$$special$$inlined$hostViewModel$1(this, a, a));
    }
}

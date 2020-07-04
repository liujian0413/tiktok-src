package com.p280ss.android.ugc.aweme.following.p1265ui.viewholder;

import com.bytedance.jedi.arch.C11664n;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.internal.C11640h;
import com.bytedance.jedi.ext.adapter.C11679b;
import com.bytedance.jedi.ext.adapter.C11714g;
import com.bytedance.jedi.ext.adapter.C11714g.C11715a;
import com.p280ss.android.ugc.aweme.base.arch.JediBaseViewHolder;
import com.p280ss.android.ugc.aweme.following.p1265ui.viewmodel.ConnectedRelationListViewModel;
import com.p280ss.android.ugc.aweme.friends.model.RecommendContact;
import com.p280ss.android.ugc.aweme.friends.p1285ui.RecommendContactItemView;
import com.p280ss.android.ugc.aweme.friends.recommendlist.viewmodel.RecommendContactState;
import com.p280ss.android.ugc.aweme.friends.recommendlist.viewmodel.RecommendContactViewModel;
import com.p280ss.android.ugc.aweme.profile.model.User;
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

/* renamed from: com.ss.android.ugc.aweme.following.ui.viewholder.ConnectedRelationContactViewHolder */
public final class ConnectedRelationContactViewHolder extends JediBaseViewHolder<ConnectedRelationContactViewHolder, RecommendContact> {

    /* renamed from: g */
    static final /* synthetic */ C7595j[] f78316g = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(ConnectedRelationContactViewHolder.class), "mConnectedRelationViewModel", "getMConnectedRelationViewModel()Lcom/ss/android/ugc/aweme/following/ui/viewmodel/ConnectedRelationListViewModel;"))};

    /* renamed from: j */
    public final RecommendContactItemView f78317j;

    /* renamed from: k */
    private final C7541d f78318k;

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewholder.ConnectedRelationContactViewHolder$a */
    static final class C29779a extends Lambda implements C7562b<RecommendContactState, RecommendContactState> {

        /* renamed from: a */
        final /* synthetic */ ConnectedRelationContactViewHolder f78319a;

        C29779a(ConnectedRelationContactViewHolder connectedRelationContactViewHolder) {
            this.f78319a = connectedRelationContactViewHolder;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public RecommendContactState invoke(RecommendContactState recommendContactState) {
            C7573i.m23587b(recommendContactState, "$receiver");
            return recommendContactState.copy((RecommendContact) this.f78319a.mo29309o());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewholder.ConnectedRelationContactViewHolder$b */
    static final class C29780b extends Lambda implements C7563m<ConnectedRelationContactViewHolder, RecommendContactState, C7581n> {

        /* renamed from: a */
        public static final C29780b f78320a = new C29780b();

        /* renamed from: com.ss.android.ugc.aweme.following.ui.viewholder.ConnectedRelationContactViewHolder$b$a */
        static final class C29781a extends Lambda implements C7563m<RecommendContact, Integer, C7581n> {

            /* renamed from: a */
            final /* synthetic */ ConnectedRelationContactViewHolder f78321a;

            C29781a(ConnectedRelationContactViewHolder connectedRelationContactViewHolder) {
                this.f78321a = connectedRelationContactViewHolder;
                super(2);
            }

            public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                m97515a((RecommendContact) obj, ((Number) obj2).intValue());
                return C7581n.f20898a;
            }

            /* renamed from: a */
            private void m97515a(RecommendContact recommendContact, int i) {
                C7573i.m23587b(recommendContact, "contact");
                this.f78321a.mo62390p().mo75768a((User) recommendContact);
            }
        }

        C29780b() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m97514a((ConnectedRelationContactViewHolder) obj, (RecommendContactState) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private static void m97514a(ConnectedRelationContactViewHolder connectedRelationContactViewHolder, RecommendContactState recommendContactState) {
            C7573i.m23587b(connectedRelationContactViewHolder, "$receiver");
            C7573i.m23587b(recommendContactState, "state");
            RecommendContact contact = recommendContactState.getContact();
            if (contact != null) {
                connectedRelationContactViewHolder.f78317j.mo76565a(contact, connectedRelationContactViewHolder.getAdapterPosition());
                connectedRelationContactViewHolder.f78317j.setDislikeListener(new C29781a(connectedRelationContactViewHolder));
            }
        }
    }

    /* renamed from: p */
    public final ConnectedRelationListViewModel mo62390p() {
        return (ConnectedRelationListViewModel) this.f78318k.getValue();
    }

    public final void bA_() {
        super.bA_();
        mo29061a(m97511q(), C11640h.m34110a(), C29780b.f78320a);
        this.f78317j.getEnterFrom();
    }

    /* renamed from: q */
    private final RecommendContactViewModel m97511q() {
        C7562b aVar = new C29779a(this);
        Class<RecommendContactViewModel> cls = RecommendContactViewModel.class;
        C11679b d = mo29218d();
        if (d != null) {
            C11714g a = C11715a.m34329a(mo29056f(), d.mo29232b());
            StringBuilder sb = new StringBuilder();
            sb.append(getClass().getName());
            sb.append('_');
            sb.append(cls.getName());
            JediViewModel jediViewModel = (JediViewModel) a.mo29268a(sb.toString(), cls);
            C11664n a2 = jediViewModel.f31065b.mo29189a(RecommendContactViewModel.class);
            if (a2 != null) {
                a2.binding(jediViewModel);
            }
            jediViewModel.mo29034a(aVar);
            return (RecommendContactViewModel) jediViewModel;
        }
        throw new IllegalStateException("proxy not bound to viewHolder yet");
    }

    public ConnectedRelationContactViewHolder(RecommendContactItemView recommendContactItemView) {
        C7573i.m23587b(recommendContactItemView, "recommendView");
        super(recommendContactItemView);
        this.f78317j = recommendContactItemView;
        C7584c a = C7575l.m23595a(ConnectedRelationListViewModel.class);
        this.f78318k = C7546e.m23569a(new C29782x3e3dc063(this, a, a));
    }
}

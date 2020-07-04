package com.p280ss.android.ugc.aweme.following.p1265ui.viewholder;

import android.view.View;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.jedi.arch.C11502e.C11503a;
import com.bytedance.jedi.arch.C11664n;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.internal.C11640h;
import com.bytedance.jedi.ext.adapter.C11679b;
import com.bytedance.jedi.ext.adapter.C11714g;
import com.bytedance.jedi.ext.adapter.C11714g.C11715a;
import com.p280ss.android.ugc.aweme.app.api.p1023b.C22814a;
import com.p280ss.android.ugc.aweme.base.arch.JediBaseViewHolder;
import com.p280ss.android.ugc.aweme.following.model.C29575j;
import com.p280ss.android.ugc.aweme.following.p1265ui.viewmodel.ConnectedRelationListViewModel;
import com.p280ss.android.ugc.aweme.friends.p1285ui.RecommendUserItemView;
import com.p280ss.android.ugc.aweme.friends.p1285ui.RecommendUserItemView.C30136a;
import com.p280ss.android.ugc.aweme.metrics.C33238ak;
import com.p280ss.android.ugc.aweme.metrics.C33276r;
import com.p280ss.android.ugc.aweme.metrics.C33280v;
import com.p280ss.android.ugc.aweme.newfollow.util.C34202f;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.p1487ui.UserProfileActivity;
import com.p280ss.android.ugc.aweme.profile.presenter.C36030i;
import com.p280ss.android.ugc.aweme.profile.presenter.C36031j.C36034a;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.router.C7203u;
import com.p280ss.android.ugc.aweme.user.repository.UserState;
import com.p280ss.android.ugc.aweme.user.repository.UserViewModel;
import com.p280ss.android.ugc.aweme.utils.C42914ab;
import com.zhiliaoapp.musically.df_live_zego_link.R;
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

/* renamed from: com.ss.android.ugc.aweme.following.ui.viewholder.ConnectedRelationViewHolder */
public final class ConnectedRelationViewHolder extends JediBaseViewHolder<ConnectedRelationViewHolder, C29575j> {

    /* renamed from: g */
    static final /* synthetic */ C7595j[] f78322g = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(ConnectedRelationViewHolder.class), "mRelationListViewMode", "getMRelationListViewMode()Lcom/ss/android/ugc/aweme/following/ui/viewmodel/ConnectedRelationListViewModel;"))};

    /* renamed from: j */
    private final C7541d f78323j;

    /* renamed from: k */
    private final RecommendUserItemView f78324k;

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewholder.ConnectedRelationViewHolder$a */
    static final class C29783a extends Lambda implements C7563m<Integer, String, C7581n> {

        /* renamed from: a */
        final /* synthetic */ ConnectedRelationViewHolder f78325a;

        /* renamed from: b */
        final /* synthetic */ User f78326b;

        C29783a(ConnectedRelationViewHolder connectedRelationViewHolder, User user) {
            this.f78325a = connectedRelationViewHolder;
            this.f78326b = user;
            super(2);
        }

        /* renamed from: a */
        private void m97523a(int i, String str) {
            C7573i.m23587b(str, "extra");
            this.f78325a.mo75762a(this.f78326b, i, str);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m97523a(((Number) obj).intValue(), (String) obj2);
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewholder.ConnectedRelationViewHolder$b */
    static final class C29784b extends Lambda implements C7562b<UserState, UserState> {

        /* renamed from: a */
        final /* synthetic */ ConnectedRelationViewHolder f78327a;

        C29784b(ConnectedRelationViewHolder connectedRelationViewHolder) {
            this.f78327a = connectedRelationViewHolder;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public UserState invoke(UserState userState) {
            C7573i.m23587b(userState, "$receiver");
            return UserState.copy$default(userState, ((C29575j) this.f78327a.mo29309o()).f77949b, false, null, null, 14, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewholder.ConnectedRelationViewHolder$c */
    static final class C29785c extends Lambda implements C7563m<ConnectedRelationViewHolder, User, C7581n> {

        /* renamed from: a */
        public static final C29785c f78328a = new C29785c();

        C29785c() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m97525a((ConnectedRelationViewHolder) obj, (User) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private static void m97525a(ConnectedRelationViewHolder connectedRelationViewHolder, User user) {
            C7573i.m23587b(connectedRelationViewHolder, "$receiver");
            C7573i.m23587b(user, "user");
            if (((C29575j) connectedRelationViewHolder.mo29309o()).f77948a == 5) {
                User clone = user.clone();
                C7573i.m23582a((Object) clone, "it");
                clone.setRecommendReason(((C29575j) connectedRelationViewHolder.mo29309o()).f77949b.getRecommendReason());
                C7573i.m23582a((Object) clone, "user.clone().also { it.r…em.user.recommendReason }");
                connectedRelationViewHolder.mo75761a(clone);
                return;
            }
            user.setRecommendReason(((C29575j) connectedRelationViewHolder.mo29309o()).f77949b.getRecommendReason());
            user.setFollowerCount(((C29575j) connectedRelationViewHolder.mo29309o()).f77949b.getFollowerCount());
            user.setAwemeCount(((C29575j) connectedRelationViewHolder.mo29309o()).f77949b.getAwemeCount());
            connectedRelationViewHolder.mo75761a(user);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewholder.ConnectedRelationViewHolder$d */
    static final class C29786d extends Lambda implements C7563m<ConnectedRelationViewHolder, Throwable, C7581n> {

        /* renamed from: a */
        public static final C29786d f78329a = new C29786d();

        C29786d() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m97526a((ConnectedRelationViewHolder) obj, (Throwable) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private static void m97526a(ConnectedRelationViewHolder connectedRelationViewHolder, Throwable th) {
            C7573i.m23587b(connectedRelationViewHolder, "$receiver");
            C7573i.m23587b(th, "throwable");
            View view = connectedRelationViewHolder.itemView;
            C7573i.m23582a((Object) view, "itemView");
            C22814a.m75245a(view.getContext(), th, R.string.b82);
        }
    }

    /* renamed from: q */
    private final ConnectedRelationListViewModel m97520q() {
        return (ConnectedRelationListViewModel) this.f78323j.getValue();
    }

    public final void bA_() {
        super.bA_();
        mo29062a(m97519p(), C29801a.f78358a, C11640h.m34110a(), C29785c.f78328a);
        C11503a.m33919a(this, m97519p(), C29802b.f78359a, null, C29786d.f78329a, null, null, 26, null);
        mo75762a(((C29575j) mo29309o()).f77949b, C30136a.m98753e(), "");
    }

    /* renamed from: p */
    private final UserViewModel m97519p() {
        C7562b bVar = new C29784b(this);
        Class<UserViewModel> cls = UserViewModel.class;
        C11679b d = mo29218d();
        if (d != null) {
            C11714g a = C11715a.m34329a(mo29056f(), d.mo29232b());
            StringBuilder sb = new StringBuilder();
            sb.append(getClass().getName());
            sb.append('_');
            sb.append(cls.getName());
            JediViewModel jediViewModel = (JediViewModel) a.mo29268a(sb.toString(), cls);
            C11664n a2 = jediViewModel.f31065b.mo29189a(UserViewModel.class);
            if (a2 != null) {
                a2.binding(jediViewModel);
            }
            jediViewModel.mo29034a(bVar);
            return (UserViewModel) jediViewModel;
        }
        throw new IllegalStateException("proxy not bound to viewHolder yet");
    }

    /* renamed from: a */
    public final void mo75761a(User user) {
        this.f78324k.mo75741a(user);
        this.f78324k.setAdapterPosition(getAdapterPosition());
        this.f78324k.setActionEventListener(new C29783a(this, user));
    }

    public ConnectedRelationViewHolder(RecommendUserItemView recommendUserItemView) {
        C7573i.m23587b(recommendUserItemView, "recommendView");
        super(recommendUserItemView);
        this.f78324k = recommendUserItemView;
        C7584c a = C7575l.m23595a(ConnectedRelationListViewModel.class);
        this.f78323j = C7546e.m23569a(new ConnectedRelationViewHolder$$special$$inlined$hostViewModel$1(this, a, a));
    }

    /* renamed from: b */
    private static void m97517b(User user) {
        new C33276r().mo85322o(user.getUid()).mo85310b("common_relation").mo85319i("others_homepage").mo85318g("1044").mo85252e();
    }

    /* renamed from: c */
    private static void m97518c(User user) {
        String str;
        String str2;
        if (user.getFollowStatus() == 0) {
            str = "follow";
        } else {
            str = "follow_cancel";
        }
        C33280v c = new C33280v(str).mo85345e("others_homepage").mo85341b("common_relation").mo85343c("follow_button");
        if (user.getFollowStatus() == 0) {
            str2 = "1007";
        } else {
            str2 = "1036";
        }
        c.mo85340a(str2).mo85348g(user.getUid()).mo85252e();
    }

    /* renamed from: a */
    private final void m97516a(User user, String str, int i) {
        if (((C29575j) mo29309o()).f77948a == 2) {
            new C33238ak(null, 1, null).mo85095a(user.getUid()).mo85097b("common_relation").mo85098c(str).mo85093a(i).mo85099d(user.getRequestId()).mo85100e(user.getRecommendReason()).mo85101f("total").mo85102g("nonempty").mo85103i("1007").mo85252e();
        }
    }

    /* renamed from: a */
    public final void mo75762a(User user, int i, String str) {
        String str2;
        user.setRequestId(((C29575j) mo29309o()).f77951d);
        if (i != C30136a.m98753e()) {
            int i2 = 0;
            if (i == 0 || i == C30136a.m98749a()) {
                if (((C29575j) mo29309o()).f77948a == 2) {
                    i2 = 1;
                }
                View view = this.itemView;
                C7573i.m23582a((Object) view, "itemView");
                UserProfileActivity.m117386a(view.getContext(), C42914ab.m136242a().mo104633a("uid", user.getUid()).mo104633a("sec_user_id", user.getSecUid()).mo104633a("enter_from", "common_relation").mo104633a("enter_from_request_id", user.getRequestId()).mo104630a("need_track_compare_recommend_reason", 1).mo104630a("from_recommend_card", i2).mo104633a("previous_recommend_reason", user.getRecommendReason()).mo104633a("recommend_from_type", "list").f111445a);
                m97517b(user);
                m97516a(user, "enter_profile", ((C29575j) mo29309o()).f77950c);
            } else if (i == C30136a.m98750b()) {
                if (user.getFollowStatus() == 0) {
                    i2 = 1;
                }
                UserViewModel p = m97519p();
                C36030i a = new C36034a().mo91684a(user.getUid()).mo91686b(user.getSecUid()).mo91682a(i2).mo91688c("common_relation").mo91685b(12).mo91681a();
                C7573i.m23582a((Object) a, "FollowPresenter.FollowPa…                 .build()");
                p.mo104547a(a);
                m97518c(user);
                if (user.getFollowStatus() == 0) {
                    str2 = "follow";
                } else {
                    str2 = "follow_cancel";
                }
                m97516a(user, str2, ((C29575j) mo29309o()).f77950c);
            } else if (i == C30136a.m98751c()) {
                m97520q().mo75768a(((C29575j) mo29309o()).f77949b);
                View view2 = this.itemView;
                C7573i.m23582a((Object) view2, "itemView");
                C10761a.m31409e(view2.getContext(), (int) R.string.tu).mo25750a();
                m97516a(user, "delete", ((C29575j) mo29309o()).f77950c);
            } else if (i == C30136a.m98752d()) {
                C7195s a2 = C7195s.m22438a();
                StringBuilder sb = new StringBuilder("aweme://aweme/detail/");
                sb.append(str);
                a2.mo18682a(C7203u.m22460a(sb.toString()).mo18694a("refer", "find_friends").mo18695a());
            }
        } else if (((C29575j) mo29309o()).f77948a == 2) {
            m97516a(user, "impression", ((C29575j) mo29309o()).f77950c);
            C34202f.m110435a().mo86948a(3, user.getUid());
            ConnectedRelationListViewModel q = m97520q();
            C34202f a3 = C34202f.m110435a();
            C7573i.m23582a((Object) a3, "RecUserImpressionReporter.getInstance()");
            String b = a3.mo86949b();
            C7573i.m23582a((Object) b, "RecUserImpressionReporte…getInstance().toReportIds");
            q.mo75769a(b);
        }
    }
}

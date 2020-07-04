package com.p280ss.android.ugc.aweme.following.p1265ui.adapter;

import android.app.Dialog;
import android.arch.lifecycle.C0043i;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.C1642a;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a.C10741a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.jedi.arch.C11491a;
import com.bytedance.jedi.arch.C11496ae;
import com.bytedance.jedi.arch.C11500c;
import com.bytedance.jedi.arch.C11501d;
import com.bytedance.jedi.arch.C11664n;
import com.bytedance.jedi.arch.C11674x;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.internal.C11640h;
import com.bytedance.jedi.ext.adapter.C11679b;
import com.bytedance.jedi.ext.adapter.C11714g;
import com.bytedance.jedi.ext.adapter.C11714g.C11715a;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.bytedance.jedi.ext.adapter.multitype.C11743d;
import com.bytedance.jedi.ext.adapter.multitype.C11743d.C11744a;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.app.C22903bl;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.app.api.p1023b.C22814a;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException;
import com.p280ss.android.ugc.aweme.base.arch.JediBaseMultiTypeAdapter;
import com.p280ss.android.ugc.aweme.base.arch.JediBaseViewHolder;
import com.p280ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.p280ss.android.ugc.aweme.base.p308ui.AvatarImageWithVerify;
import com.p280ss.android.ugc.aweme.captcha.C23637b;
import com.p280ss.android.ugc.aweme.captcha.p1080c.C23645b;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.p1148ui.C25712a;
import com.p280ss.android.ugc.aweme.following.model.C29573h;
import com.p280ss.android.ugc.aweme.following.model.C29574i;
import com.p280ss.android.ugc.aweme.following.model.C29575j;
import com.p280ss.android.ugc.aweme.following.p1265ui.view.FollowUserBtn;
import com.p280ss.android.ugc.aweme.following.p1265ui.viewholder.RecommendContactViewHolder;
import com.p280ss.android.ugc.aweme.following.p1265ui.viewholder.RecommendRelationTitleViewHolder;
import com.p280ss.android.ugc.aweme.following.p1265ui.viewholder.RecommendRelationUserViewHolder;
import com.p280ss.android.ugc.aweme.following.p1265ui.viewholder.RelationStatusViewHolder;
import com.p280ss.android.ugc.aweme.following.p1265ui.viewmodel.FollowRelationTabViewModel;
import com.p280ss.android.ugc.aweme.following.p1265ui.viewmodel.FollowerRelationViewModel;
import com.p280ss.android.ugc.aweme.friends.model.RecommendContact;
import com.p280ss.android.ugc.aweme.friends.p1285ui.RecommendContactItemView;
import com.p280ss.android.ugc.aweme.friends.p1285ui.RecommendUserItemView;
import com.p280ss.android.ugc.aweme.metrics.C33276r;
import com.p280ss.android.ugc.aweme.metrics.C33280v;
import com.p280ss.android.ugc.aweme.p313im.C30553b;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMUser;
import com.p280ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.p1487ui.C36337ai;
import com.p280ss.android.ugc.aweme.profile.p1487ui.UserProfileActivity;
import com.p280ss.android.ugc.aweme.profile.presenter.C36030i;
import com.p280ss.android.ugc.aweme.profile.presenter.C36031j.C36034a;
import com.p280ss.android.ugc.aweme.profile.util.C36694aa.C36698b;
import com.p280ss.android.ugc.aweme.user.repository.UserState;
import com.p280ss.android.ugc.aweme.user.repository.UserViewModel;
import com.p280ss.android.ugc.aweme.utils.C42914ab;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import com.p280ss.android.ugc.aweme.utils.C43126fg;
import com.p280ss.android.ugc.aweme.utils.UserVerify;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;
import kotlin.reflect.C7584c;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter */
public final class FollowListAdapter extends JediBaseMultiTypeAdapter<Object> {

    /* renamed from: h */
    public static final C29730a f78200h = new C29730a(null);

    /* renamed from: c */
    public final Map<String, Boolean> f78201c = new LinkedHashMap();

    /* renamed from: d */
    public final boolean f78202d;

    /* renamed from: e */
    public final C0043i f78203e;

    /* renamed from: f */
    public final String f78204f;

    /* renamed from: g */
    public final boolean f78205g;

    /* renamed from: com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter$FollowItemViewHolder */
    public final class FollowItemViewHolder extends JediBaseViewHolder<FollowItemViewHolder, C29575j> {

        /* renamed from: g */
        static final /* synthetic */ C7595j[] f78206g = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(FollowItemViewHolder.class), "followRelationTabViewModel", "getFollowRelationTabViewModel()Lcom/ss/android/ugc/aweme/following/ui/viewmodel/FollowRelationTabViewModel;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(FollowItemViewHolder.class), "followerRelationViewModel", "getFollowerRelationViewModel()Lcom/ss/android/ugc/aweme/following/ui/viewmodel/FollowerRelationViewModel;"))};

        /* renamed from: j */
        public final ImageView f78207j;

        /* renamed from: k */
        final /* synthetic */ FollowListAdapter f78208k;

        /* renamed from: l */
        private final AvatarImageWithVerify f78209l;

        /* renamed from: m */
        private final TextView f78210m;

        /* renamed from: n */
        private final TextView f78211n;

        /* renamed from: o */
        private final FollowUserBtn f78212o;

        /* renamed from: p */
        private final ImageView f78213p;

        /* renamed from: q */
        private final C7541d f78214q;

        /* renamed from: r */
        private final C7541d f78215r;

        /* renamed from: com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter$FollowItemViewHolder$a */
        public static final class C29721a implements C36698b {

            /* renamed from: a */
            final /* synthetic */ FollowItemViewHolder f78216a;

            /* renamed from: b */
            final /* synthetic */ User f78217b;

            /* renamed from: b */
            public final void mo75709b() {
            }

            /* renamed from: a */
            public final void mo71634a() {
                this.f78216a.mo75708a(this.f78217b, this.f78217b.getFollowStatus());
            }

            C29721a(FollowItemViewHolder followItemViewHolder, User user) {
                this.f78216a = followItemViewHolder;
                this.f78217b = user;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter$FollowItemViewHolder$b */
        static final class C29722b implements OnClickListener {

            /* renamed from: a */
            final /* synthetic */ FollowItemViewHolder f78218a;

            /* renamed from: b */
            final /* synthetic */ User f78219b;

            C29722b(FollowItemViewHolder followItemViewHolder, User user) {
                this.f78218a = followItemViewHolder;
                this.f78219b = user;
            }

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (this.f78218a.f78208k.f78202d) {
                    C7573i.m23582a((Object) view, "it");
                    UserProfileActivity.m117386a(view.getContext(), C42914ab.m136242a().mo104633a("uid", this.f78219b.getUid()).mo104633a("sec_user_id", this.f78219b.getSecUid()).mo104633a("enter_from", this.f78218a.f78208k.mo75705f()).mo104630a("need_track_compare_recommend_reason", 1).mo104633a("previous_recommend_reason", this.f78219b.getRecommendReason()).mo104633a("recommend_from_type", "list").f111445a);
                } else {
                    C7573i.m23582a((Object) view, "it");
                    UserProfileActivity.m117388a(view.getContext(), this.f78219b, this.f78218a.f78208k.mo75705f());
                }
                this.f78218a.f78208k.mo75703a(this.f78219b);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter$FollowItemViewHolder$c */
        static final class C29723c implements OnClickListener {

            /* renamed from: a */
            final /* synthetic */ FollowItemViewHolder f78220a;

            /* renamed from: b */
            final /* synthetic */ User f78221b;

            C29723c(FollowItemViewHolder followItemViewHolder, User user) {
                this.f78220a = followItemViewHolder;
                this.f78221b = user;
            }

            public final void onClick(View view) {
                int i;
                ClickInstrumentation.onClick(view);
                this.f78220a.f78208k.mo75704b(this.f78221b);
                if (this.f78221b.getFollowStatus() == 0) {
                    i = 1;
                } else {
                    i = 0;
                }
                UserViewModel q = this.f78220a.mo69905q();
                C36030i a = new C36034a().mo91684a(this.f78221b.getUid()).mo91686b(this.f78221b.getSecUid()).mo91682a(i).mo91688c(this.f78220a.f78208k.mo75705f()).mo91685b(this.f78220a.f78208k.mo75706g()).mo91681a();
                C7573i.m23582a((Object) a, "FollowPresenter.FollowPa…                 .build()");
                q.mo104547a(a);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter$FollowItemViewHolder$d */
        static final class C29724d implements OnClickListener {

            /* renamed from: a */
            final /* synthetic */ FollowItemViewHolder f78222a;

            /* renamed from: b */
            final /* synthetic */ User f78223b;

            C29724d(FollowItemViewHolder followItemViewHolder, User user) {
                this.f78222a = followItemViewHolder;
                this.f78223b = user;
            }

            public final void onClick(final View view) {
                ClickInstrumentation.onClick(view);
                final Resources resources = this.f78222a.f78207j.getResources();
                String string = resources.getString(R.string.def);
                C7573i.m23582a((Object) string, "res.getString(R.string.r…ove_follower_alert_title)");
                String string2 = resources.getString(R.string.w_);
                C7573i.m23582a((Object) string2, "res.getString(R.string.cancel)");
                CharSequence[] charSequenceArr = {string, string2};
                C7573i.m23582a((Object) view, "v");
                C25712a aVar = new C25712a(view.getContext());
                aVar.mo66614a(charSequenceArr, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener(this) {

                    /* renamed from: a */
                    final /* synthetic */ C29724d f78224a;

                    /* renamed from: com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter$FollowItemViewHolder$d$1$a */
                    static final class C29726a implements DialogInterface.OnClickListener {

                        /* renamed from: a */
                        final /* synthetic */ C297251 f78227a;

                        C29726a(C297251 r1) {
                            this.f78227a = r1;
                        }

                        public final void onClick(DialogInterface dialogInterface, int i) {
                            C6907h.m21524a("remove_fans", (Map) C22984d.m75611a().mo59973a("enter_from", "fans").f60753a);
                            UserViewModel q = this.f78227a.f78224a.f78222a.mo69905q();
                            String uid = this.f78227a.f78224a.f78223b.getUid();
                            C7573i.m23582a((Object) uid, "item.uid");
                            q.mo104546a(uid);
                        }
                    }

                    {
                        this.f78224a = r1;
                    }

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        String str;
                        if (i == 0) {
                            C6907h.m21524a("click_remove_fans", (Map) C22984d.m75611a().mo59973a("enter_from", "fans").f60753a);
                            View view = view;
                            C7573i.m23582a((Object) view, "v");
                            C10741a a = new C10741a(view.getContext()).mo25649a((int) R.string.def);
                            if (C6399b.m19944t()) {
                                View view2 = view;
                                C7573i.m23582a((Object) view2, "v");
                                String string = view2.getResources().getString(R.string.dee);
                                C7573i.m23582a((Object) string, "v.resources.getString(R.…emove_follower_alert_msg)");
                                str = C1642a.m8034a(string, Arrays.copyOf(new Object[]{C43122ff.m136777h(this.f78224a.f78223b)}, 1));
                                C7573i.m23582a((Object) str, "java.lang.String.format(format, *args)");
                            } else {
                                View view3 = view;
                                C7573i.m23582a((Object) view3, "v");
                                str = view3.getResources().getString(R.string.dee);
                            }
                            Dialog b = a.mo25660b(str).mo25658b((int) R.string.w_, (DialogInterface.OnClickListener) null).mo25650a((int) R.string.ded, (DialogInterface.OnClickListener) new C29726a(this)).mo25656a().mo25638b();
                            if (b.findViewById(R.id.e0u) instanceof TextView) {
                                View findViewById = b.findViewById(R.id.e0u);
                                if (findViewById != null) {
                                    ((TextView) findViewById).setTextColor(resources.getColor(R.color.lk));
                                    return;
                                }
                                throw new TypeCastException("null cannot be cast to non-null type android.widget.TextView");
                            }
                        }
                    }
                });
                aVar.mo66615b();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter$FollowItemViewHolder$e */
        static final class C29727e extends Lambda implements C7563m<FollowItemViewHolder, UserState, C7581n> {

            /* renamed from: a */
            final /* synthetic */ FollowItemViewHolder f78228a;

            C29727e(FollowItemViewHolder followItemViewHolder) {
                this.f78228a = followItemViewHolder;
                super(2);
            }

            public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                m97439a((FollowItemViewHolder) obj, (UserState) obj2);
                return C7581n.f20898a;
            }

            /* renamed from: a */
            private void m97439a(final FollowItemViewHolder followItemViewHolder, final UserState userState) {
                C7573i.m23587b(followItemViewHolder, "$receiver");
                C7573i.m23587b(userState, "it");
                C11491a followStatus = userState.getFollowStatus();
                if (followStatus instanceof C11674x) {
                    Map<String, Boolean> map = this.f78228a.f78208k.f78201c;
                    String uid = userState.getUser().getUid();
                    C7573i.m23582a((Object) uid, "it.user.uid");
                    map.put(uid, Boolean.valueOf(FollowItemViewHolder.m97430a(((FollowStatus) ((C11674x) userState.getFollowStatus()).mo29046a()).followStatus)));
                    followItemViewHolder.mo75707a(userState.getUser());
                    C30553b.m99810g().updateIMUser(IMUser.fromUser(userState.getUser()));
                } else if (followStatus instanceof C11500c) {
                    Throwable th = ((C11500c) userState.getFollowStatus()).f31096a;
                    if (!(th instanceof ApiServerException) || !(this.f78228a.f78208k.f78203e instanceof AmeBaseFragment) || !C23645b.m77551a((Exception) th)) {
                        View view = followItemViewHolder.itemView;
                        C7573i.m23582a((Object) view, "itemView");
                        C22814a.m75245a(view.getContext(), ((C11500c) userState.getFollowStatus()).f31096a, R.string.b82);
                    } else {
                        C0043i iVar = this.f78228a.f78208k.f78203e;
                        if (iVar != null) {
                            C23645b.m77550a(((AmeBaseFragment) iVar).getChildFragmentManager(), (ApiServerException) th, new C23637b(this) {

                                /* renamed from: a */
                                final /* synthetic */ C29727e f78229a;

                                /* renamed from: b */
                                public final void mo57593b() {
                                    View view = followItemViewHolder.itemView;
                                    C7573i.m23582a((Object) view, "itemView");
                                    C22814a.m75245a(view.getContext(), ((C11500c) userState.getFollowStatus()).f31096a, R.string.b82);
                                }

                                /* renamed from: a */
                                public final void mo57592a() {
                                    int i;
                                    if (userState.getUser().getFollowStatus() == 0) {
                                        i = 1;
                                    } else {
                                        i = 0;
                                    }
                                    UserViewModel q = followItemViewHolder.mo69905q();
                                    C36030i a = new C36034a().mo91684a(userState.getUser().getUid()).mo91686b(userState.getUser().getSecUid()).mo91682a(i).mo91688c(this.f78229a.f78228a.f78208k.mo75705f()).mo91685b(this.f78229a.f78228a.f78208k.mo75706g()).mo91681a();
                                    C7573i.m23582a((Object) a, "FollowPresenter.FollowPa…                 .build()");
                                    q.mo104547a(a);
                                }

                                {
                                    this.f78229a = r1;
                                }
                            });
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment");
                        }
                    }
                } else if (followStatus instanceof C11496ae) {
                    followItemViewHolder.mo75707a(userState.getUser());
                }
                if (userState.getFollowerIsRemoved()) {
                    FollowerRelationViewModel r = followItemViewHolder.mo69906r();
                    String uid2 = userState.getUser().getUid();
                    C7573i.m23582a((Object) uid2, "it.user.uid");
                    r.mo75811a(uid2);
                    IAccountUserService a = C21115b.m71197a();
                    C7573i.m23582a((Object) a, "AccountUserProxyService.get()");
                    if (C36337ai.m117567a(a.getCurUser())) {
                        FollowRelationTabViewModel p = followItemViewHolder.mo62390p();
                        IAccountUserService a2 = C21115b.m71197a();
                        C7573i.m23582a((Object) a2, "AccountUserProxyService.get()");
                        User curUser = a2.getCurUser();
                        C7573i.m23582a((Object) curUser, "AccountUserProxyService.get().curUser");
                        p.mo75797b(curUser.getFansCount());
                        return;
                    }
                    FollowRelationTabViewModel p2 = followItemViewHolder.mo62390p();
                    IAccountUserService a3 = C21115b.m71197a();
                    C7573i.m23582a((Object) a3, "AccountUserProxyService.get()");
                    User curUser2 = a3.getCurUser();
                    C7573i.m23582a((Object) curUser2, "AccountUserProxyService.get().curUser");
                    p2.mo75797b(curUser2.getFollowerCount());
                }
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter$FollowItemViewHolder$f */
        static final class C29729f extends Lambda implements C7562b<UserState, UserState> {

            /* renamed from: a */
            final /* synthetic */ FollowItemViewHolder f78232a;

            C29729f(FollowItemViewHolder followItemViewHolder) {
                this.f78232a = followItemViewHolder;
                super(1);
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public UserState invoke(UserState userState) {
                C7573i.m23587b(userState, "$receiver");
                return UserState.copy$default(userState, ((C29575j) this.f78232a.mo29309o()).f77949b, false, null, null, 14, null);
            }
        }

        /* renamed from: a */
        public static boolean m97430a(int i) {
            return i == 1 || i == 2;
        }

        /* renamed from: p */
        public final FollowRelationTabViewModel mo62390p() {
            return (FollowRelationTabViewModel) this.f78214q.getValue();
        }

        /* renamed from: r */
        public final FollowerRelationViewModel mo69906r() {
            return (FollowerRelationViewModel) this.f78215r.getValue();
        }

        public final void bA_() {
            super.bA_();
            mo29061a(mo69905q(), C11640h.m34110a(), new C29727e(this));
        }

        /* renamed from: q */
        public final UserViewModel mo69905q() {
            C7562b fVar = new C29729f(this);
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
                jediViewModel.mo29034a(fVar);
                return (UserViewModel) jediViewModel;
            }
            throw new IllegalStateException("proxy not bound to viewHolder yet");
        }

        /* renamed from: a */
        public final void mo75707a(User user) {
            UserVerify userVerify = new UserVerify(user.getAvatarThumb(), user.getCustomVerify(), user.getEnterpriseVerifyReason(), Integer.valueOf(user.getVerificationType()), user.getWeiboVerify());
            this.f78209l.setUserData(userVerify);
            if (C6399b.m19944t()) {
                this.f78209l.mo60896b();
            }
            this.itemView.setOnClickListener(new C29722b(this, user));
            CharSequence uid = user.getUid();
            IAccountUserService a = C21115b.m71197a();
            C7573i.m23582a((Object) a, "AccountUserProxyService.get()");
            if (TextUtils.equals(uid, a.getCurUserId())) {
                this.f78212o.setVisibility(8);
            } else {
                this.f78212o.setVisibility(0);
                FollowUserBtn followUserBtn = this.f78212o;
                int followStatus = user.getFollowStatus();
                int i = 1;
                if (user.getFollowerStatus() != 1) {
                    i = 0;
                }
                followUserBtn.mo75747a(followStatus, i);
            }
            this.f78212o.setOnClickListener(new C29723c(this, user));
            SharePrefCache inst = SharePrefCache.inst();
            C7573i.m23582a((Object) inst, "SharePrefCache.inst()");
            C22903bl removeFollowerSwitch = inst.getRemoveFollowerSwitch();
            C7573i.m23582a((Object) removeFollowerSwitch, "SharePrefCache.inst().removeFollowerSwitch");
            Object d = removeFollowerSwitch.mo59877d();
            C7573i.m23582a(d, "SharePrefCache.inst().removeFollowerSwitch.cache");
            if (!((Boolean) d).booleanValue() || !this.f78208k.f78205g || !C7573i.m23585a((Object) this.f78208k.f78204f, (Object) "follower_relation")) {
                this.f78207j.getLayoutParams().width = 0;
            } else {
                this.f78207j.setOnClickListener(new C29724d(this, user));
                if (C6399b.m19945u()) {
                    this.f78207j.setAlpha(0.5f);
                }
                this.f78207j.getLayoutParams().width = -2;
            }
            mo75708a(user, user.getFollowStatus());
            m97431b(user, user.getFollowStatus());
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x001e, code lost:
            if (r0.mo18785ax() == 3) goto L_0x0020;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final void m97431b(com.p280ss.android.ugc.aweme.profile.model.User r8, int r9) {
            /*
                r7 = this;
                com.ss.android.ugc.aweme.setting.d r0 = com.p280ss.android.ugc.aweme.setting.C7213d.m22500a()
                java.lang.String r1 = "AbTestManager.getInstance()"
                kotlin.jvm.internal.C7573i.m23582a(r0, r1)
                int r0 = r0.mo18785ax()
                r1 = 2
                if (r0 == r1) goto L_0x0020
                com.ss.android.ugc.aweme.setting.d r0 = com.p280ss.android.ugc.aweme.setting.C7213d.m22500a()
                java.lang.String r1 = "AbTestManager.getInstance()"
                kotlin.jvm.internal.C7573i.m23582a(r0, r1)
                int r0 = r0.mo18785ax()
                r1 = 3
                if (r0 != r1) goto L_0x0076
            L_0x0020:
                com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter r0 = r7.f78208k
                java.util.Map<java.lang.String, java.lang.Boolean> r0 = r0.f78201c
                java.lang.String r1 = r8.getUid()
                java.lang.Object r0 = r0.get(r1)
                if (r0 == 0) goto L_0x006f
                android.widget.ImageView r0 = r7.f78213p
                r3 = r0
                android.view.View r3 = (android.view.View) r3
                java.lang.String r4 = "fans"
                com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter r0 = r7.f78208k
                java.util.Map<java.lang.String, java.lang.Boolean> r0 = r0.f78201c
                java.lang.String r1 = r8.getUid()
                java.lang.Object r0 = r0.get(r1)
                if (r0 != 0) goto L_0x0046
                kotlin.jvm.internal.C7573i.m23580a()
            L_0x0046:
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r5 = r0.booleanValue()
                com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter$FollowItemViewHolder$a r0 = new com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter$FollowItemViewHolder$a
                r0.<init>(r7, r8)
                r6 = r0
                com.ss.android.ugc.aweme.profile.util.aa$b r6 = (com.p280ss.android.ugc.aweme.profile.util.C36694aa.C36698b) r6
                r1 = r8
                r2 = r9
                com.p280ss.android.ugc.aweme.profile.util.C36694aa.m118342a(r1, r2, r3, r4, r5, r6)
                com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter r9 = r7.f78208k
                java.util.Map<java.lang.String, java.lang.Boolean> r9 = r9.f78201c
                java.lang.String r8 = r8.getUid()
                java.lang.String r0 = "user.uid"
                kotlin.jvm.internal.C7573i.m23582a(r8, r0)
                r0 = 0
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                r9.put(r8, r0)
                return
            L_0x006f:
                android.widget.ImageView r8 = r7.f78213p
                r9 = 8
                r8.setVisibility(r9)
            L_0x0076:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.following.p1265ui.adapter.FollowListAdapter.FollowItemViewHolder.m97431b(com.ss.android.ugc.aweme.profile.model.User, int):void");
        }

        public FollowItemViewHolder(FollowListAdapter followListAdapter, ViewGroup viewGroup) {
            C7573i.m23587b(viewGroup, "parent");
            this.f78208k = followListAdapter;
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.w4, viewGroup, false);
            C7573i.m23582a((Object) inflate, "LayoutInflater.from(pare…wing_item, parent, false)");
            super(inflate);
            View findViewById = this.itemView.findViewById(R.id.b64);
            C7573i.m23582a((Object) findViewById, "itemView.findViewById(R.id.iv_avatar)");
            this.f78209l = (AvatarImageWithVerify) findViewById;
            View findViewById2 = this.itemView.findViewById(R.id.e7f);
            C7573i.m23582a((Object) findViewById2, "itemView.findViewById(R.id.txt_user_name)");
            this.f78210m = (TextView) findViewById2;
            View findViewById3 = this.itemView.findViewById(R.id.e6j);
            C7573i.m23582a((Object) findViewById3, "itemView.findViewById(R.id.txt_desc)");
            this.f78211n = (TextView) findViewById3;
            View findViewById4 = this.itemView.findViewById(R.id.e6o);
            C7573i.m23582a((Object) findViewById4, "itemView.findViewById(R.id.txt_follow)");
            this.f78212o = (FollowUserBtn) findViewById4;
            View findViewById5 = this.itemView.findViewById(R.id.b8s);
            C7573i.m23582a((Object) findViewById5, "itemView.findViewById(R.id.iv_edit_remark)");
            this.f78213p = (ImageView) findViewById5;
            View findViewById6 = this.itemView.findViewById(R.id.bzu);
            C7573i.m23582a((Object) findViewById6, "itemView.findViewById(R.id.more)");
            this.f78207j = (ImageView) findViewById6;
            C7584c a = C7575l.m23595a(FollowRelationTabViewModel.class);
            this.f78214q = C7546e.m23569a(new C29741xda841ea9(this, a, a));
            C7584c a2 = C7575l.m23595a(FollowerRelationViewModel.class);
            this.f78215r = C7546e.m23569a(new C29742x841cddf0(this, a2, a2));
        }

        /* renamed from: a */
        public final void mo75708a(User user, int i) {
            boolean z;
            boolean z2;
            this.f78211n.setVisibility(0);
            if (C6399b.m19944t()) {
                this.f78210m.setText(C43122ff.m136777h(user));
                this.f78211n.setText(user.getNickname());
                View view = this.itemView;
                C7573i.m23582a((Object) view, "itemView");
                C43126fg.m136801a(view.getContext(), user.getCustomVerify(), user.getEnterpriseVerifyReason(), this.f78210m);
                return;
            }
            if (!TextUtils.isEmpty(user.getRemarkName())) {
                this.f78210m.setText(user.getRemarkName());
                TextView textView = this.f78211n;
                View view2 = this.itemView;
                C7573i.m23582a((Object) view2, "itemView");
                Context context = view2.getContext();
                C7573i.m23582a((Object) context, "itemView.context");
                textView.setText(context.getResources().getString(R.string.b8j, new Object[]{user.getNickname()}));
                z2 = false;
                z = true;
            } else {
                this.f78210m.setText(user.getNickname());
                if (TextUtils.isEmpty(user.getSignature())) {
                    if (!C6399b.m19944t()) {
                        this.f78211n.setVisibility(8);
                    } else {
                        this.f78211n.setText(R.string.dum);
                    }
                    z2 = false;
                } else {
                    this.f78211n.setText(user.getSignature());
                    z2 = true;
                }
                z = false;
            }
            if (this.f78208k.f78202d) {
                boolean isEmpty = true ^ TextUtils.isEmpty(user.getRecommendReason());
                if (m97430a(i) || !isEmpty) {
                    this.f78211n.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                    if (!isEmpty || this.f78208k.f78201c.get(user.getUid()) == null) {
                        if (z2) {
                            this.f78211n.setText("");
                            this.f78211n.setVisibility(8);
                        }
                    } else if (!z) {
                        this.f78211n.setText(user.getRecommendReason());
                        this.f78211n.setCompoundDrawablesWithIntrinsicBounds(R.drawable.aza, 0, 0, 0);
                        C9738o.m28712b((View) this.f78211n, 0);
                    }
                } else {
                    this.f78211n.setText(user.getRecommendReason());
                    this.f78211n.setCompoundDrawablesWithIntrinsicBounds(R.drawable.aza, 0, 0, 0);
                    C9738o.m28712b((View) this.f78211n, 0);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter$a */
    public static final class C29730a {
        private C29730a() {
        }

        public /* synthetic */ C29730a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter$b */
    static final class C29731b extends Lambda implements C7562b<ViewGroup, FollowItemViewHolder> {

        /* renamed from: a */
        final /* synthetic */ FollowListAdapter f78233a;

        C29731b(FollowListAdapter followListAdapter) {
            this.f78233a = followListAdapter;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public FollowItemViewHolder invoke(ViewGroup viewGroup) {
            C7573i.m23587b(viewGroup, "parent");
            return new FollowItemViewHolder(this.f78233a, viewGroup);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter$c */
    static final class C29732c extends Lambda implements C7562b<ViewGroup, FollowItemViewHolder> {

        /* renamed from: a */
        final /* synthetic */ FollowListAdapter f78234a;

        C29732c(FollowListAdapter followListAdapter) {
            this.f78234a = followListAdapter;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public FollowItemViewHolder invoke(ViewGroup viewGroup) {
            C7573i.m23587b(viewGroup, "parent");
            return new FollowItemViewHolder(this.f78234a, viewGroup);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter$d */
    static final class C29733d extends Lambda implements C7562b<ViewGroup, RelationStatusViewHolder> {

        /* renamed from: a */
        public static final C29733d f78235a = new C29733d();

        C29733d() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return m97445a((ViewGroup) obj);
        }

        /* renamed from: a */
        private static RelationStatusViewHolder m97445a(ViewGroup viewGroup) {
            C7573i.m23587b(viewGroup, "parent");
            return new RelationStatusViewHolder(viewGroup);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter$e */
    static final class C29734e extends Lambda implements C7562b<ViewGroup, RelationStatusViewHolder> {

        /* renamed from: a */
        public static final C29734e f78236a = new C29734e();

        C29734e() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return m97446a((ViewGroup) obj);
        }

        /* renamed from: a */
        private static RelationStatusViewHolder m97446a(ViewGroup viewGroup) {
            C7573i.m23587b(viewGroup, "parent");
            return new RelationStatusViewHolder(viewGroup);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter$f */
    static final class C29735f extends Lambda implements C7562b<ViewGroup, RelationStatusViewHolder> {

        /* renamed from: a */
        public static final C29735f f78237a = new C29735f();

        C29735f() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return m97447a((ViewGroup) obj);
        }

        /* renamed from: a */
        private static RelationStatusViewHolder m97447a(ViewGroup viewGroup) {
            C7573i.m23587b(viewGroup, "parent");
            return new RelationStatusViewHolder(viewGroup);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter$g */
    static final class C29736g extends Lambda implements C7562b<ViewGroup, RelationStatusViewHolder> {

        /* renamed from: a */
        public static final C29736g f78238a = new C29736g();

        C29736g() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return m97448a((ViewGroup) obj);
        }

        /* renamed from: a */
        private static RelationStatusViewHolder m97448a(ViewGroup viewGroup) {
            C7573i.m23587b(viewGroup, "parent");
            return new RelationStatusViewHolder(viewGroup);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter$h */
    static final class C29737h extends Lambda implements C7562b<ViewGroup, RecommendRelationTitleViewHolder> {

        /* renamed from: a */
        public static final C29737h f78239a = new C29737h();

        C29737h() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return m97449a((ViewGroup) obj);
        }

        /* renamed from: a */
        private static RecommendRelationTitleViewHolder m97449a(ViewGroup viewGroup) {
            C7573i.m23587b(viewGroup, "parent");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.w1, viewGroup, false);
            C7573i.m23582a((Object) inflate, "view");
            return new RecommendRelationTitleViewHolder(inflate);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter$i */
    static final class C29738i extends Lambda implements C7562b<ViewGroup, RecommendContactViewHolder> {

        /* renamed from: a */
        public static final C29738i f78240a = new C29738i();

        C29738i() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return m97450a((ViewGroup) obj);
        }

        /* renamed from: a */
        private static RecommendContactViewHolder m97450a(ViewGroup viewGroup) {
            C7573i.m23587b(viewGroup, "parent");
            Context context = viewGroup.getContext();
            C7573i.m23582a((Object) context, "parent.context");
            RecommendContactItemView recommendContactItemView = new RecommendContactItemView(context, null, 0, 6, null);
            return new RecommendContactViewHolder(recommendContactItemView);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter$j */
    static final class C29739j extends Lambda implements C7562b<ViewGroup, RecommendRelationUserViewHolder> {

        /* renamed from: a */
        public static final C29739j f78241a = new C29739j();

        C29739j() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return m97451a((ViewGroup) obj);
        }

        /* renamed from: a */
        private static RecommendRelationUserViewHolder m97451a(ViewGroup viewGroup) {
            C7573i.m23587b(viewGroup, "parent");
            Context context = viewGroup.getContext();
            C7573i.m23582a((Object) context, "parent.context");
            RecommendUserItemView recommendUserItemView = new RecommendUserItemView(context, null, 0, 6, null);
            return new RecommendRelationUserViewHolder(recommendUserItemView);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter$k */
    static final class C29740k extends Lambda implements C7562b<Integer, Boolean> {

        /* renamed from: a */
        final /* synthetic */ FollowListAdapter f78242a;

        /* renamed from: b */
        final /* synthetic */ int f78243b;

        C29740k(FollowListAdapter followListAdapter, int i) {
            this.f78242a = followListAdapter;
            this.f78243b = i;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(m97452a(((Number) obj).intValue()));
        }

        /* renamed from: a */
        private boolean m97452a(int i) {
            int i2;
            int i3 = this.f78243b;
            Object a = this.f78242a.mo29135a(i, false);
            if (a instanceof C29574i) {
                i2 = ((C29574i) a).f77946a;
            } else if (a instanceof C29575j) {
                i2 = ((C29575j) a).f77948a;
            } else if (a instanceof C29573h) {
                i2 = ((C29573h) a).f77944a;
            } else if (a instanceof RecommendContact) {
                i2 = 3;
            } else {
                i2 = 0;
            }
            if (i3 == i2) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: f */
    public final String mo75705f() {
        if (TextUtils.equals(this.f78204f, "following_relation")) {
            if (this.f78205g) {
                return "following";
            }
            return "other_following";
        } else if (!TextUtils.equals(this.f78204f, "follower_relation")) {
            return "";
        } else {
            if (this.f78205g) {
                return "fans";
            }
            return "other_fans";
        }
    }

    /* renamed from: g */
    public final int mo75706g() {
        if (!this.f78205g && TextUtils.equals(this.f78204f, "follower_relation")) {
            return 11;
        }
        if (!this.f78205g && TextUtils.equals(this.f78204f, "following_relation")) {
            return 10;
        }
        if (!this.f78205g || !TextUtils.equals(this.f78204f, "follower_relation")) {
            return 0;
        }
        return 9;
    }

    /* renamed from: b */
    private final C7562b<Integer, Boolean> m97423b(int i) {
        return new C29740k<>(this, i);
    }

    /* renamed from: a */
    public final int mo58029a(int i) {
        int a = super.mo58029a(i);
        if (a != 0) {
            return a;
        }
        return this.f61299a.mo29318b(i - mo60563e());
    }

    /* renamed from: a */
    public final void mo75703a(User user) {
        String str;
        C33276r b = new C33276r().mo85322o(user.getUid()).mo85310b(mo75705f());
        if (this.f78205g) {
            str = "personal_homepage";
        } else {
            str = "others_homepage";
        }
        b.mo85319i(str).mo85318g("1044").mo85252e();
    }

    /* renamed from: b */
    public final void mo75704b(User user) {
        String str;
        String str2;
        String str3;
        if (user.getFollowStatus() == 0) {
            str = "follow";
        } else {
            str = "follow_cancel";
        }
        C33280v vVar = new C33280v(str);
        if (this.f78205g) {
            str2 = "personal_homepage";
        } else {
            str2 = "others_homepage";
        }
        C33280v c = vVar.mo85345e(str2).mo85341b(mo75705f()).mo85343c("follow_button");
        if (user.getFollowStatus() == 0) {
            str3 = "1007";
        } else {
            str3 = "1036";
        }
        c.mo85340a(str3).mo85348g(user.getUid()).mo85252e();
    }

    /* renamed from: a */
    public final void mo60560a(C11743d<JediViewHolder<? extends C11501d, ?>> dVar) {
        C7573i.m23587b(dVar, "registry");
        C11743d<JediViewHolder<? extends C11501d, ?>> dVar2 = dVar;
        C11744a.m34438a((C11743d) dVar2, m97423b(0), (C7563m) null, (C7562b) new C29731b(this), 2, (Object) null);
        C11744a.m34438a((C11743d) dVar2, m97423b(1), (C7563m) null, (C7562b) new C29732c(this), 2, (Object) null);
        C11744a.m34438a((C11743d) dVar2, m97423b(7), (C7563m) null, (C7562b) C29733d.f78235a, 2, (Object) null);
        C11744a.m34438a((C11743d) dVar2, m97423b(8), (C7563m) null, (C7562b) C29734e.f78236a, 2, (Object) null);
        C11744a.m34438a((C11743d) dVar2, m97423b(9), (C7563m) null, (C7562b) C29735f.f78237a, 2, (Object) null);
        C11744a.m34438a((C11743d) dVar2, m97423b(10), (C7563m) null, (C7562b) C29736g.f78238a, 2, (Object) null);
        C11744a.m34438a((C11743d) dVar2, m97423b(4), (C7563m) null, (C7562b) C29737h.f78239a, 2, (Object) null);
        C11744a.m34438a((C11743d) dVar2, m97423b(3), (C7563m) null, (C7562b) C29738i.f78240a, 2, (Object) null);
        C11744a.m34438a((C11743d) dVar2, m97423b(2), (C7563m) null, (C7562b) C29739j.f78241a, 2, (Object) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0068, code lost:
        if (com.bytedance.ies.ugc.appcontext.C6399b.m19944t() == false) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0050, code lost:
        if (android.text.TextUtils.equals(r7.f78204f, "follower_relation") != false) goto L_0x006a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public FollowListAdapter(android.arch.lifecycle.C0043i r8, java.lang.String r9, boolean r10) {
        /*
            r7 = this;
            java.lang.String r0 = "parent"
            kotlin.jvm.internal.C7573i.m23587b(r8, r0)
            java.lang.String r0 = "relationType"
            kotlin.jvm.internal.C7573i.m23587b(r9, r0)
            com.ss.android.ugc.aweme.following.model.RelationDiff r0 = new com.ss.android.ugc.aweme.following.model.RelationDiff
            r0.<init>()
            r3 = r0
            android.support.v7.util.a$c r3 = (android.support.p029v7.util.C1143a.C1147c) r3
            r4 = 0
            r5 = 4
            r6 = 0
            r1 = r7
            r2 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            r7.f78203e = r8
            r7.f78204f = r9
            r7.f78205g = r10
            java.util.LinkedHashMap r8 = new java.util.LinkedHashMap
            r8.<init>()
            java.util.Map r8 = (java.util.Map) r8
            r7.f78201c = r8
            boolean r8 = r7.f78205g
            r9 = 1
            r10 = 0
            if (r8 == 0) goto L_0x0055
            com.ss.android.ugc.aweme.setting.d r8 = com.p280ss.android.ugc.aweme.setting.C7213d.m22500a()
            java.lang.String r0 = "AbTestManager.getInstance()"
            kotlin.jvm.internal.C7573i.m23582a(r8, r0)
            boolean r8 = r8.mo18786ay()
            if (r8 == 0) goto L_0x0053
            boolean r8 = com.bytedance.ies.ugc.appcontext.C6399b.m19944t()
            if (r8 != 0) goto L_0x0053
            java.lang.String r8 = r7.f78204f
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            java.lang.String r0 = "follower_relation"
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r8 = android.text.TextUtils.equals(r8, r0)
            if (r8 == 0) goto L_0x0053
            goto L_0x006a
        L_0x0053:
            r9 = 0
            goto L_0x006a
        L_0x0055:
            com.ss.android.ugc.aweme.setting.d r8 = com.p280ss.android.ugc.aweme.setting.C7213d.m22500a()
            java.lang.String r0 = "AbTestManager.getInstance()"
            kotlin.jvm.internal.C7573i.m23582a(r8, r0)
            boolean r8 = r8.mo18786ay()
            if (r8 == 0) goto L_0x0053
            boolean r8 = com.bytedance.ies.ugc.appcontext.C6399b.m19944t()
            if (r8 != 0) goto L_0x0053
        L_0x006a:
            r7.f78202d = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.following.p1265ui.adapter.FollowListAdapter.<init>(android.arch.lifecycle.i, java.lang.String, boolean):void");
    }
}

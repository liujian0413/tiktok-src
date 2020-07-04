package com.p280ss.android.ugc.aweme.following.p1265ui;

import android.app.Activity;
import android.arch.lifecycle.C0043i;
import android.content.Context;
import android.os.Bundle;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1281m;
import android.text.Editable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.dmt.p262ui.widget.C10805b.C10806a;
import com.bytedance.ies.dmt.p262ui.widget.DmtEditText;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.dmt.p262ui.widget.MtEmptyView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.jedi.arch.C11502e;
import com.bytedance.jedi.arch.C11502e.C11503a;
import com.bytedance.jedi.arch.C11585f;
import com.bytedance.jedi.arch.ext.list.C11556b;
import com.bytedance.jedi.arch.ext.list.C11557c;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.bytedance.jedi.arch.internal.C11640h;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.opensourcemodified.android.support.p1064v4.widget.SwipeRefreshLayout;
import com.p280ss.android.ugc.aweme.base.p1058c.C23281a;
import com.p280ss.android.ugc.aweme.base.utils.C23481i;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter.C6905a;
import com.p280ss.android.ugc.aweme.common.p1148ui.C25713b;
import com.p280ss.android.ugc.aweme.discover.p1185ui.NoticeView;
import com.p280ss.android.ugc.aweme.experiment.EnablePushGuideExperiment;
import com.p280ss.android.ugc.aweme.following.model.C29574i;
import com.p280ss.android.ugc.aweme.following.model.C29575j;
import com.p280ss.android.ugc.aweme.following.p1265ui.adapter.FollowListAdapter;
import com.p280ss.android.ugc.aweme.following.p1265ui.adapter.FollowingSearchAdapter;
import com.p280ss.android.ugc.aweme.following.p1265ui.viewmodel.C29853f;
import com.p280ss.android.ugc.aweme.following.p1265ui.viewmodel.FollowRelationState;
import com.p280ss.android.ugc.aweme.following.p1265ui.viewmodel.FollowRelationTabViewModel;
import com.p280ss.android.ugc.aweme.following.p1265ui.viewmodel.FollowingRelationState;
import com.p280ss.android.ugc.aweme.following.p1265ui.viewmodel.FollowingRelationViewModel;
import com.p280ss.android.ugc.aweme.following.repository.C29607i;
import com.p280ss.android.ugc.aweme.friends.model.RecommendContact;
import com.p280ss.android.ugc.aweme.friends.p1285ui.CustomItemAnimator;
import com.p280ss.android.ugc.aweme.newfollow.p1423ui.NotificationPushGuide;
import com.p280ss.android.ugc.aweme.newfollow.p1423ui.NotificationPushGuide.C34161a;
import com.p280ss.android.ugc.aweme.newfollow.p1423ui.NotificationPushGuide.EnterFrom;
import com.p280ss.android.ugc.aweme.profile.expriment.RecUserExpansionAB;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.recommend.viewmodel.C37182a;
import com.p280ss.android.ugc.aweme.recommend.viewmodel.RecommendUserListState;
import com.p280ss.android.ugc.aweme.recommend.viewmodel.RecommendUserListViewModel;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.utils.C43033cw;
import com.p280ss.android.ugc.aweme.utils.C43034cx;
import com.p280ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Ref.BooleanRef;
import kotlin.jvm.p357a.C48006q;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;
import kotlin.reflect.C7584c;
import kotlin.reflect.C7595j;
import kotlin.text.C7634n;
import org.greenrobot.eventbus.C7709l;

/* renamed from: com.ss.android.ugc.aweme.following.ui.FollowingRelationFragment */
public final class FollowingRelationFragment extends BaseRelationFragment {

    /* renamed from: k */
    static final /* synthetic */ C7595j[] f78116k = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(FollowingRelationFragment.class), "mFollowingRelationViewModel", "getMFollowingRelationViewModel()Lcom/ss/android/ugc/aweme/following/ui/viewmodel/FollowingRelationViewModel;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(FollowingRelationFragment.class), "mRecommendUserLisViewModel", "getMRecommendUserLisViewModel()Lcom/ss/android/ugc/aweme/recommend/viewmodel/RecommendUserListViewModel;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(FollowingRelationFragment.class), "mFollowRelationTabViewModel", "getMFollowRelationTabViewModel()Lcom/ss/android/ugc/aweme/following/ui/viewmodel/FollowRelationTabViewModel;"))};

    /* renamed from: l */
    public FollowListAdapter f78117l;

    /* renamed from: m */
    public final C29853f f78118m = new C29853f();

    /* renamed from: n */
    public final FollowingSearchAdapter f78119n = new FollowingSearchAdapter();

    /* renamed from: o */
    public String f78120o = "";

    /* renamed from: p */
    public C10803a f78121p;

    /* renamed from: q */
    public boolean f78122q = true;

    /* renamed from: r */
    private final lifecycleAwareLazy f78123r;

    /* renamed from: s */
    private final lifecycleAwareLazy f78124s;

    /* renamed from: t */
    private final C7541d f78125t;

    /* renamed from: u */
    private boolean f78126u = true;

    /* renamed from: v */
    private NotificationPushGuide f78127v;

    /* renamed from: w */
    private HashMap f78128w;

    /* renamed from: com.ss.android.ugc.aweme.following.ui.FollowingRelationFragment$a */
    static final class C29670a implements C6905a {

        /* renamed from: a */
        final /* synthetic */ FollowingRelationFragment f78129a;

        C29670a(FollowingRelationFragment followingRelationFragment) {
            this.f78129a = followingRelationFragment;
        }

        public final void bd_() {
            this.f78129a.mo29066a(this.f78129a.mo75630t(), new C7562b<FollowingRelationState, C7581n>(this) {

                /* renamed from: a */
                final /* synthetic */ C29670a f78130a;

                {
                    this.f78130a = r1;
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    m97343a((FollowingRelationState) obj);
                    return C7581n.f20898a;
                }

                /* renamed from: a */
                private void m97343a(FollowingRelationState followingRelationState) {
                    C7573i.m23587b(followingRelationState, "it");
                    if (((C29607i) followingRelationState.getListState().getPayload()).f77976c != 0) {
                        this.f78130a.f78129a.mo75683w();
                    }
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.FollowingRelationFragment$aa */
    static final class C29672aa extends Lambda implements C7562b<FollowingRelationState, Boolean> {

        /* renamed from: a */
        public static final C29672aa f78131a = new C29672aa();

        C29672aa() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(m97344a((FollowingRelationState) obj));
        }

        /* renamed from: a */
        private static boolean m97344a(FollowingRelationState followingRelationState) {
            boolean z;
            boolean z2;
            C7573i.m23587b(followingRelationState, "it");
            Collection collection = (Collection) followingRelationState.getListState().getRefresh().mo29046a();
            if (collection == null || collection.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                Collection collection2 = (Collection) followingRelationState.getListState().getLoadMore().mo29046a();
                if (collection2 == null || collection2.isEmpty()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.FollowingRelationFragment$ab */
    static final class C29673ab extends Lambda implements C7563m<FollowingRelationState, Bundle, FollowingRelationState> {

        /* renamed from: a */
        final /* synthetic */ FollowingRelationFragment f78132a;

        C29673ab(FollowingRelationFragment followingRelationFragment) {
            this.f78132a = followingRelationFragment;
            super(2);
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0018, code lost:
            if (r10 == null) goto L_0x001d;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.p280ss.android.ugc.aweme.following.p1265ui.viewmodel.FollowingRelationState invoke(com.p280ss.android.ugc.aweme.following.p1265ui.viewmodel.FollowingRelationState r9, android.os.Bundle r10) {
            /*
                r8 = this;
                java.lang.String r10 = "$receiver"
                kotlin.jvm.internal.C7573i.m23587b(r9, r10)
                com.ss.android.ugc.aweme.following.ui.FollowingRelationFragment r10 = r8.f78132a
                java.lang.String r10 = r10.f77981f
                if (r10 != 0) goto L_0x000d
                java.lang.String r10 = ""
            L_0x000d:
                r1 = r10
                com.ss.android.ugc.aweme.following.ui.FollowingRelationFragment r10 = r8.f78132a
                com.ss.android.ugc.aweme.profile.model.User r10 = r10.f77982g
                if (r10 == 0) goto L_0x001d
                java.lang.String r10 = r10.getSecUid()
                if (r10 != 0) goto L_0x001b
                goto L_0x001d
            L_0x001b:
                r2 = r10
                goto L_0x0020
            L_0x001d:
                java.lang.String r10 = ""
                goto L_0x001b
            L_0x0020:
                com.ss.android.ugc.aweme.following.ui.FollowingRelationFragment r10 = r8.f78132a
                boolean r3 = r10.mo75620k()
                r4 = 0
                r5 = 0
                r6 = 24
                r7 = 0
                r0 = r9
                com.ss.android.ugc.aweme.following.ui.viewmodel.FollowingRelationState r9 = com.p280ss.android.ugc.aweme.following.p1265ui.viewmodel.FollowingRelationState.copy$default(r0, r1, r2, r3, r4, r5, r6, r7)
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.following.p1265ui.FollowingRelationFragment.C29673ab.invoke(com.ss.android.ugc.aweme.following.ui.viewmodel.FollowingRelationState, android.os.Bundle):com.ss.android.ugc.aweme.following.ui.viewmodel.FollowingRelationState");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.FollowingRelationFragment$ac */
    static final class C29674ac extends Lambda implements C7563m<RecommendUserListState, Bundle, RecommendUserListState> {

        /* renamed from: a */
        final /* synthetic */ FollowingRelationFragment f78133a;

        C29674ac(FollowingRelationFragment followingRelationFragment) {
            this.f78133a = followingRelationFragment;
            super(2);
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0018, code lost:
            if (r12 == null) goto L_0x001d;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.p280ss.android.ugc.aweme.recommend.viewmodel.RecommendUserListState invoke(com.p280ss.android.ugc.aweme.recommend.viewmodel.RecommendUserListState r11, android.os.Bundle r12) {
            /*
                r10 = this;
                java.lang.String r12 = "$receiver"
                kotlin.jvm.internal.C7573i.m23587b(r11, r12)
                com.ss.android.ugc.aweme.following.ui.FollowingRelationFragment r12 = r10.f78133a
                java.lang.String r12 = r12.f77981f
                if (r12 != 0) goto L_0x000d
                java.lang.String r12 = ""
            L_0x000d:
                r1 = r12
                com.ss.android.ugc.aweme.following.ui.FollowingRelationFragment r12 = r10.f78133a
                com.ss.android.ugc.aweme.profile.model.User r12 = r12.f77982g
                if (r12 == 0) goto L_0x001d
                java.lang.String r12 = r12.getSecUid()
                if (r12 != 0) goto L_0x001b
                goto L_0x001d
            L_0x001b:
                r2 = r12
                goto L_0x0020
            L_0x001d:
                java.lang.String r12 = ""
                goto L_0x001b
            L_0x0020:
                com.ss.android.ugc.aweme.following.ui.FollowingRelationFragment r12 = r10.f78133a
                boolean r3 = r12.mo75620k()
                r4 = 13
                r5 = 0
                com.ss.android.ugc.aweme.recommend.viewmodel.a r6 = new com.ss.android.ugc.aweme.recommend.viewmodel.a
                com.ss.android.ugc.aweme.following.ui.FollowingRelationFragment r12 = r10.f78133a
                java.lang.String r12 = r12.mo75622m()
                com.ss.android.ugc.aweme.following.ui.FollowingRelationFragment r0 = r10.f78133a
                java.lang.String r0 = r0.mo75623n()
                java.lang.String r7 = "empty"
                r6.<init>(r12, r0, r7)
                r7 = 0
                r8 = 80
                r9 = 0
                r0 = r11
                com.ss.android.ugc.aweme.recommend.viewmodel.RecommendUserListState r11 = com.p280ss.android.ugc.aweme.recommend.viewmodel.RecommendUserListState.copy$default(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.following.p1265ui.FollowingRelationFragment.C29674ac.invoke(com.ss.android.ugc.aweme.recommend.viewmodel.RecommendUserListState, android.os.Bundle):com.ss.android.ugc.aweme.recommend.viewmodel.RecommendUserListState");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.FollowingRelationFragment$ad */
    static final class C29675ad extends Lambda implements C7562b<FollowingRelationState, C7581n> {

        /* renamed from: a */
        final /* synthetic */ FollowingRelationFragment f78134a;

        C29675ad(FollowingRelationFragment followingRelationFragment) {
            this.f78134a = followingRelationFragment;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m97347a((FollowingRelationState) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m97347a(FollowingRelationState followingRelationState) {
            boolean z;
            C7573i.m23587b(followingRelationState, "it");
            Collection recommendList = followingRelationState.getRecommendList();
            if (recommendList == null || recommendList.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f78134a.mo75630t().f78408e.mo29085c();
            } else {
                this.f78134a.mo75681u().mo29117l();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.FollowingRelationFragment$ae */
    static final class C29676ae extends Lambda implements C7562b<FollowingRelationState, Boolean> {

        /* renamed from: a */
        public static final C29676ae f78135a = new C29676ae();

        C29676ae() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(m97348a((FollowingRelationState) obj));
        }

        /* renamed from: a */
        private static boolean m97348a(FollowingRelationState followingRelationState) {
            C7573i.m23587b(followingRelationState, "it");
            if (!followingRelationState.getListState().getHasMore().f31214a) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.FollowingRelationFragment$b */
    static final class C29677b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ FollowingRelationFragment f78136a;

        C29677b(FollowingRelationFragment followingRelationFragment) {
            this.f78136a = followingRelationFragment;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            DmtEditText dmtEditText = (DmtEditText) this.f78136a.mo60553a((int) R.id.agn);
            if (dmtEditText != null) {
                dmtEditText.setText("");
                this.f78136a.mo75685y();
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.widget.TextView");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.FollowingRelationFragment$c */
    static final class C29678c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ FollowingRelationFragment f78137a;

        C29678c(FollowingRelationFragment followingRelationFragment) {
            this.f78137a = followingRelationFragment;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f78137a.mo29066a(this.f78137a.mo75682v(), new C7562b<FollowRelationState, C7581n>(this) {

                /* renamed from: a */
                final /* synthetic */ C29678c f78138a;

                {
                    this.f78138a = r1;
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    m97349a((FollowRelationState) obj);
                    return C7581n.f20898a;
                }

                /* renamed from: a */
                private void m97349a(FollowRelationState followRelationState) {
                    C7573i.m23587b(followRelationState, "it");
                    if (followRelationState.isSearching()) {
                        this.f78138a.f78137a.mo75682v().mo75796a(false);
                    }
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.FollowingRelationFragment$d */
    static final class C29680d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ FollowingRelationFragment f78139a;

        C29680d(FollowingRelationFragment followingRelationFragment) {
            this.f78139a = followingRelationFragment;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f78139a.mo29066a(this.f78139a.mo75682v(), new C7562b<FollowRelationState, C7581n>(this) {

                /* renamed from: a */
                final /* synthetic */ C29680d f78140a;

                {
                    this.f78140a = r1;
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    m97350a((FollowRelationState) obj);
                    return C7581n.f20898a;
                }

                /* renamed from: a */
                private void m97350a(FollowRelationState followRelationState) {
                    C7573i.m23587b(followRelationState, "it");
                    if (followRelationState.isSearching()) {
                        this.f78140a.f78139a.mo75682v().mo75796a(false);
                    }
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.FollowingRelationFragment$e */
    static final class C29682e implements OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ FollowingRelationFragment f78141a;

        C29682e(FollowingRelationFragment followingRelationFragment) {
            this.f78141a = followingRelationFragment;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            C7573i.m23582a((Object) motionEvent, "event");
            if (motionEvent.getAction() == 1) {
                this.f78141a.mo29066a(this.f78141a.mo75682v(), new C7562b<FollowRelationState, C7581n>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C29682e f78142a;

                    {
                        this.f78142a = r1;
                    }

                    public final /* synthetic */ Object invoke(Object obj) {
                        m97351a((FollowRelationState) obj);
                        return C7581n.f20898a;
                    }

                    /* renamed from: a */
                    private void m97351a(FollowRelationState followRelationState) {
                        C7573i.m23587b(followRelationState, "it");
                        if (!followRelationState.isSearching()) {
                            if (C6399b.m19945u()) {
                                this.f78142a.f78141a.mo75682v().mo75796a(true);
                                return;
                            }
                            DmtEditText dmtEditText = (DmtEditText) this.f78142a.f78141a.mo60553a((int) R.id.agn);
                            C7573i.m23582a((Object) dmtEditText, "et_search_kw");
                            dmtEditText.setCursorVisible(true);
                        }
                    }
                });
            }
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.FollowingRelationFragment$f */
    public static final class C29684f implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ FollowingRelationFragment f78143a;

        /* renamed from: com.ss.android.ugc.aweme.following.ui.FollowingRelationFragment$f$a */
        static final class C29685a extends Lambda implements C7562b<FollowRelationState, C7581n> {

            /* renamed from: a */
            final /* synthetic */ C29684f f78144a;

            /* renamed from: b */
            final /* synthetic */ CharSequence f78145b;

            C29685a(C29684f fVar, CharSequence charSequence) {
                this.f78144a = fVar;
                this.f78145b = charSequence;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                m97352a((FollowRelationState) obj);
                return C7581n.f20898a;
            }

            /* renamed from: a */
            private void m97352a(FollowRelationState followRelationState) {
                C7573i.m23587b(followRelationState, "it");
                if (TextUtils.isEmpty(this.f78145b) || followRelationState.isSearching()) {
                    if (TextUtils.isEmpty(this.f78145b) && followRelationState.isSearching()) {
                        this.f78144a.f78143a.mo75682v().mo75796a(false);
                    }
                    return;
                }
                this.f78144a.f78143a.mo75682v().mo75796a(true);
            }
        }

        public final void afterTextChanged(Editable editable) {
            C7573i.m23587b(editable, "s");
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C7573i.m23587b(charSequence, "s");
        }

        C29684f(FollowingRelationFragment followingRelationFragment) {
            this.f78143a = followingRelationFragment;
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C7573i.m23587b(charSequence, "s");
            if (C6399b.m19944t()) {
                this.f78143a.mo29066a(this.f78143a.mo75682v(), new C29685a(this, charSequence));
            }
            if (!TextUtils.isEmpty(charSequence)) {
                ImageButton imageButton = (ImageButton) this.f78143a.mo60553a((int) R.id.pw);
                C7573i.m23582a((Object) imageButton, "btn_clear");
                imageButton.setVisibility(0);
                this.f78143a.f78120o = charSequence.toString();
                if (this.f78143a.f78122q) {
                    C6907h.m21524a("search_friends", (Map) C22984d.m75611a().f60753a);
                    this.f78143a.f78122q = false;
                }
                this.f78143a.mo75684x();
                return;
            }
            this.f78143a.mo75685y();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.FollowingRelationFragment$g */
    static final class C29686g implements OnEditorActionListener {

        /* renamed from: a */
        final /* synthetic */ FollowingRelationFragment f78146a;

        C29686g(FollowingRelationFragment followingRelationFragment) {
            this.f78146a = followingRelationFragment;
        }

        public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i != 3) {
                return false;
            }
            this.f78146a.mo75684x();
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.FollowingRelationFragment$h */
    public static final class C29687h implements C34161a {
        C29687h() {
        }

        /* renamed from: a */
        public final void mo75676a(Context context) {
            C43033cw.m136552b(context);
        }

        /* renamed from: b */
        public final boolean mo75677b(Context context) {
            return C43034cx.m136550a(context);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.FollowingRelationFragment$i */
    public static final class C29688i implements C11557c<Object, C11585f> {

        /* renamed from: a */
        final /* synthetic */ C7562b f78147a;

        /* renamed from: b */
        final /* synthetic */ C7563m f78148b;

        /* renamed from: c */
        final /* synthetic */ C7563m f78149c;

        /* renamed from: d */
        private final C7562b<C11585f, C7581n> f78150d;

        /* renamed from: e */
        private final C7563m<C11585f, Throwable, C7581n> f78151e;

        /* renamed from: f */
        private final C7563m<C11585f, List<? extends Object>, C7581n> f78152f;

        /* renamed from: a */
        public final C7562b<C11585f, C7581n> mo29138a() {
            return this.f78150d;
        }

        /* renamed from: b */
        public final C7563m<C11585f, Throwable, C7581n> mo29139b() {
            return this.f78151e;
        }

        /* renamed from: c */
        public final C7563m<C11585f, List<? extends Object>, C7581n> mo29140c() {
            return this.f78152f;
        }

        public C29688i(C7562b bVar, C7563m mVar, C7563m mVar2) {
            this.f78147a = bVar;
            this.f78148b = mVar;
            this.f78149c = mVar2;
            this.f78150d = bVar;
            this.f78151e = mVar;
            this.f78152f = mVar2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.FollowingRelationFragment$j */
    public static final class C29689j implements C11557c<Object, C11585f> {

        /* renamed from: a */
        final /* synthetic */ C7562b f78153a;

        /* renamed from: b */
        final /* synthetic */ C7563m f78154b;

        /* renamed from: c */
        final /* synthetic */ C7563m f78155c;

        /* renamed from: d */
        private final C7562b<C11585f, C7581n> f78156d;

        /* renamed from: e */
        private final C7563m<C11585f, Throwable, C7581n> f78157e;

        /* renamed from: f */
        private final C7563m<C11585f, List<? extends Object>, C7581n> f78158f;

        /* renamed from: a */
        public final C7562b<C11585f, C7581n> mo29138a() {
            return this.f78156d;
        }

        /* renamed from: b */
        public final C7563m<C11585f, Throwable, C7581n> mo29139b() {
            return this.f78157e;
        }

        /* renamed from: c */
        public final C7563m<C11585f, List<? extends Object>, C7581n> mo29140c() {
            return this.f78158f;
        }

        public C29689j(C7562b bVar, C7563m mVar, C7563m mVar2) {
            this.f78153a = bVar;
            this.f78154b = mVar;
            this.f78155c = mVar2;
            this.f78156d = bVar;
            this.f78157e = mVar;
            this.f78158f = mVar2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.FollowingRelationFragment$k */
    static final class C29690k extends Lambda implements C48006q<C11585f, ListState<Object, C29607i>, List<? extends Object>, C7581n> {

        /* renamed from: a */
        final /* synthetic */ FollowingRelationFragment f78159a;

        C29690k(FollowingRelationFragment followingRelationFragment) {
            this.f78159a = followingRelationFragment;
            super(3);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            m97361a((C11585f) obj, (ListState) obj2, (List) obj3);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m97361a(C11585f fVar, ListState<Object, C29607i> listState, List<? extends Object> list) {
            C7573i.m23587b(fVar, "$receiver");
            C7573i.m23587b(listState, "listState");
            C7573i.m23587b(list, "recommendList");
            FollowingRelationFragment.m97322a(this.f78159a).mo60555a(C7525m.m23506c((Collection<? extends T>) listState.getList(), (Iterable<? extends T>) list));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.FollowingRelationFragment$l */
    static final class C29691l extends Lambda implements C7562b<C11585f, C7581n> {

        /* renamed from: a */
        final /* synthetic */ FollowingRelationFragment f78160a;

        C29691l(FollowingRelationFragment followingRelationFragment) {
            this.f78160a = followingRelationFragment;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m97362a((C11585f) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m97362a(C11585f fVar) {
            C7573i.m23587b(fVar, "$receiver");
            if (this.f78160a.mo75679B()) {
                ((DmtStatusView) this.f78160a.mo60553a((int) R.id.dav)).mo25942f();
            } else {
                FollowingRelationFragment.m97322a(this.f78160a).ag_();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.FollowingRelationFragment$m */
    static final class C29692m extends Lambda implements C7563m<C11585f, Throwable, C7581n> {

        /* renamed from: a */
        final /* synthetic */ FollowingRelationFragment f78161a;

        C29692m(FollowingRelationFragment followingRelationFragment) {
            this.f78161a = followingRelationFragment;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m97363a((C11585f) obj, (Throwable) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m97363a(C11585f fVar, Throwable th) {
            C7573i.m23587b(fVar, "$receiver");
            C7573i.m23587b(th, "error");
            if (!this.f78161a.mo75679B()) {
                FollowingRelationFragment.m97322a(this.f78161a).ah_();
            } else {
                ((DmtStatusView) this.f78161a.mo60553a((int) R.id.dav)).mo25943g();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.FollowingRelationFragment$n */
    static final class C29693n extends Lambda implements C7563m<C11585f, List<? extends User>, C7581n> {

        /* renamed from: a */
        final /* synthetic */ FollowingRelationFragment f78162a;

        C29693n(FollowingRelationFragment followingRelationFragment) {
            this.f78162a = followingRelationFragment;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m97364a((C11585f) obj, (List) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m97364a(C11585f fVar, List<? extends User> list) {
            C7573i.m23587b(fVar, "$receiver");
            C7573i.m23587b(list, "data");
            if (!list.isEmpty() || !this.f78162a.mo75679B()) {
                if (this.f78162a.mo75679B()) {
                    ((DmtStatusView) this.f78162a.mo60553a((int) R.id.dav)).mo25939d();
                    this.f78162a.mo75630t().mo29069f();
                }
                return;
            }
            ((DmtStatusView) this.f78162a.mo60553a((int) R.id.dav)).mo25943g();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.FollowingRelationFragment$o */
    static final class C29694o extends Lambda implements C7562b<C11585f, C7581n> {

        /* renamed from: a */
        final /* synthetic */ FollowingRelationFragment f78163a;

        C29694o(FollowingRelationFragment followingRelationFragment) {
            this.f78163a = followingRelationFragment;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m97365a((C11585f) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m97365a(C11585f fVar) {
            C7573i.m23587b(fVar, "$receiver");
            FollowingRelationFragment.m97322a(this.f78163a).ag_();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.FollowingRelationFragment$p */
    static final class C29695p extends Lambda implements C7563m<C11585f, Throwable, C7581n> {

        /* renamed from: a */
        final /* synthetic */ FollowingRelationFragment f78164a;

        C29695p(FollowingRelationFragment followingRelationFragment) {
            this.f78164a = followingRelationFragment;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m97366a((C11585f) obj, (Throwable) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m97366a(C11585f fVar, Throwable th) {
            C7573i.m23587b(fVar, "$receiver");
            C7573i.m23587b(th, "it");
            FollowingRelationFragment.m97322a(this.f78164a).mo66508i();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.FollowingRelationFragment$q */
    static final class C29696q extends Lambda implements C7563m<C11585f, Boolean, C7581n> {

        /* renamed from: a */
        final /* synthetic */ FollowingRelationFragment f78165a;

        C29696q(FollowingRelationFragment followingRelationFragment) {
            this.f78165a = followingRelationFragment;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m97367a((C11585f) obj, ((Boolean) obj2).booleanValue());
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m97367a(C11585f fVar, boolean z) {
            C7573i.m23587b(fVar, "$receiver");
            if (z) {
                DmtEditText dmtEditText = (DmtEditText) this.f78165a.mo60553a((int) R.id.agn);
                C7573i.m23582a((Object) dmtEditText, "et_search_kw");
                dmtEditText.setCursorVisible(true);
                if (C6399b.m19945u()) {
                    DmtTextView dmtTextView = (DmtTextView) this.f78165a.mo60553a((int) R.id.dr6);
                    C7573i.m23582a((Object) dmtTextView, "tv_cancel_btn");
                    dmtTextView.setVisibility(0);
                }
                RecyclerView recyclerView = (RecyclerView) this.f78165a.mo60553a((int) R.id.cxi);
                C7573i.m23582a((Object) recyclerView, "rv_list");
                recyclerView.setAdapter(this.f78165a.f78119n);
                ((DmtStatusView) this.f78165a.mo60553a((int) R.id.dav)).setBuilder(this.f78165a.f78121p);
                ((DmtStatusView) this.f78165a.mo60553a((int) R.id.dav)).mo25939d();
                this.f78165a.f78118m.mo75833a();
                return;
            }
            DmtEditText dmtEditText2 = (DmtEditText) this.f78165a.mo60553a((int) R.id.agn);
            C7573i.m23582a((Object) dmtEditText2, "et_search_kw");
            dmtEditText2.setCursorVisible(false);
            ((DmtEditText) this.f78165a.mo60553a((int) R.id.agn)).clearFocus();
            DmtEditText dmtEditText3 = (DmtEditText) this.f78165a.mo60553a((int) R.id.agn);
            if (dmtEditText3 != null) {
                dmtEditText3.setText("");
                DmtTextView dmtTextView2 = (DmtTextView) this.f78165a.mo60553a((int) R.id.dr6);
                C7573i.m23582a((Object) dmtTextView2, "tv_cancel_btn");
                dmtTextView2.setVisibility(8);
                C25713b.m84474a((Activity) this.f78165a.getActivity(), (View) (DmtEditText) this.f78165a.mo60553a((int) R.id.agn));
                RecyclerView recyclerView2 = (RecyclerView) this.f78165a.mo60553a((int) R.id.cxi);
                C7573i.m23582a((Object) recyclerView2, "rv_list");
                recyclerView2.setAdapter(FollowingRelationFragment.m97322a(this.f78165a));
                ((DmtStatusView) this.f78165a.mo60553a((int) R.id.dav)).setBuilder(this.f78165a.mo69896i());
                this.f78165a.mo75685y();
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.widget.TextView");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.FollowingRelationFragment$r */
    static final class C29697r extends Lambda implements C7563m<C11585f, List<? extends User>, C7581n> {

        /* renamed from: a */
        final /* synthetic */ FollowingRelationFragment f78166a;

        C29697r(FollowingRelationFragment followingRelationFragment) {
            this.f78166a = followingRelationFragment;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m97368a((C11585f) obj, (List) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m97368a(C11585f fVar, List<? extends User> list) {
            C7573i.m23587b(fVar, "$receiver");
            C7573i.m23587b(list, "list");
            List arrayList = new ArrayList();
            int i = 0;
            int i2 = 0;
            for (Object next : list) {
                int i3 = i + 1;
                if (i < 0) {
                    C7525m.m23465b();
                }
                User user = (User) next;
                if (user instanceof RecommendContact) {
                    arrayList.add(user);
                } else {
                    String requestId = user.getRequestId();
                    C7573i.m23582a((Object) requestId, "user.requestId");
                    arrayList.add(new C29575j(2, user, i2, requestId));
                    i2++;
                }
                i = i3;
            }
            if (!list.isEmpty()) {
                String string = this.f78166a.getResources().getString(R.string.ag_);
                C7573i.m23582a((Object) string, "resources.getString(R.st…relation_recommend_title)");
                arrayList.add(0, new C29574i(4, string));
            }
            this.f78166a.mo75630t().mo75829a(arrayList);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.FollowingRelationFragment$s */
    static final class C29698s extends Lambda implements C48006q<C11585f, List<? extends User>, C11556b, C7581n> {

        /* renamed from: a */
        final /* synthetic */ FollowingRelationFragment f78167a;

        C29698s(FollowingRelationFragment followingRelationFragment) {
            this.f78167a = followingRelationFragment;
            super(3);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            m97369a((C11585f) obj, (List) obj2, (C11556b) obj3);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m97369a(C11585f fVar, List<? extends User> list, C11556b bVar) {
            C7573i.m23587b(fVar, "$receiver");
            C7573i.m23587b(list, "list");
            C7573i.m23587b(bVar, "hasMore");
            if (bVar.f31214a) {
                FollowingRelationFragment.m97322a(this.f78167a).ai_();
                return;
            }
            if (!this.f78167a.mo75679B() || !list.isEmpty()) {
                FollowingRelationFragment.m97322a(this.f78167a).ah_();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.FollowingRelationFragment$t */
    static final class C29699t extends Lambda implements C7562b<C11585f, C7581n> {

        /* renamed from: a */
        final /* synthetic */ FollowingRelationFragment f78168a;

        C29699t(FollowingRelationFragment followingRelationFragment) {
            this.f78168a = followingRelationFragment;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m97370a((C11585f) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m97370a(C11585f fVar) {
            C7573i.m23587b(fVar, "$receiver");
            ((DmtStatusView) this.f78168a.mo60553a((int) R.id.dav)).mo25942f();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.FollowingRelationFragment$u */
    static final class C29700u extends Lambda implements C7563m<C11585f, Throwable, C7581n> {

        /* renamed from: a */
        final /* synthetic */ FollowingRelationFragment f78169a;

        C29700u(FollowingRelationFragment followingRelationFragment) {
            this.f78169a = followingRelationFragment;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m97371a((C11585f) obj, (Throwable) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m97371a(C11585f fVar, Throwable th) {
            C7573i.m23587b(fVar, "$receiver");
            C7573i.m23587b(th, "error");
            FollowingRelationFragment followingRelationFragment = this.f78169a;
            DmtStatusView dmtStatusView = (DmtStatusView) this.f78169a.mo60553a((int) R.id.dav);
            C7573i.m23582a((Object) dmtStatusView, "status_view");
            followingRelationFragment.mo75618a(dmtStatusView, (Exception) th);
            ((DmtStatusView) this.f78169a.mo60553a((int) R.id.dav)).mo25944h();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.FollowingRelationFragment$v */
    static final class C29701v extends Lambda implements C7563m<C11585f, List<? extends Object>, C7581n> {

        /* renamed from: a */
        final /* synthetic */ FollowingRelationFragment f78170a;

        C29701v(FollowingRelationFragment followingRelationFragment) {
            this.f78170a = followingRelationFragment;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m97372a((C11585f) obj, (List) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m97372a(C11585f fVar, List<? extends Object> list) {
            C7573i.m23587b(fVar, "$receiver");
            C7573i.m23587b(list, "data");
            if (!C6307b.m19566a((Collection<T>) list)) {
                ((DmtStatusView) this.f78170a.mo60553a((int) R.id.dav)).mo25939d();
                this.f78170a.mo75686z();
            }
            fVar.mo29066a(this.f78170a.mo75630t(), new C7562b<FollowingRelationState, C7581n>(this) {

                /* renamed from: a */
                final /* synthetic */ C29701v f78171a;

                {
                    this.f78171a = r1;
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    m97373a((FollowingRelationState) obj);
                    return C7581n.f20898a;
                }

                /* renamed from: a */
                private void m97373a(FollowingRelationState followingRelationState) {
                    C7573i.m23587b(followingRelationState, "it");
                    if (!this.f78171a.f78170a.mo75630t().mo75830a(((C29607i) followingRelationState.getListState().getPayload()).f31254a.f31214a, ((C29607i) followingRelationState.getListState().getPayload()).f77978e, ((C29607i) followingRelationState.getListState().getPayload()).f77979f)) {
                        if (this.f78171a.f78170a.mo75679B()) {
                            if (!this.f78171a.f78170a.mo75678A()) {
                                ((DmtStatusView) this.f78171a.f78170a.mo60553a((int) R.id.dav)).mo25943g();
                            } else {
                                ((DmtStatusView) this.f78171a.f78170a.mo60553a((int) R.id.dav)).mo25939d();
                            }
                        } else if (C6399b.m19944t() && this.f78171a.f78170a.mo75620k()) {
                            LinearLayout linearLayout = (LinearLayout) this.f78171a.f78170a.mo60553a((int) R.id.d0y);
                            if (linearLayout != null) {
                                linearLayout.setVisibility(0);
                            }
                        }
                    }
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.FollowingRelationFragment$w */
    static final class C29703w extends Lambda implements C7562b<C11585f, C7581n> {

        /* renamed from: a */
        final /* synthetic */ FollowingRelationFragment f78172a;

        C29703w(FollowingRelationFragment followingRelationFragment) {
            this.f78172a = followingRelationFragment;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m97374a((C11585f) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m97374a(C11585f fVar) {
            C7573i.m23587b(fVar, "$receiver");
            DmtStatusView dmtStatusView = (DmtStatusView) this.f78172a.mo60553a((int) R.id.dav);
            C7573i.m23582a((Object) dmtStatusView, "status_view");
            if (!dmtStatusView.mo25945i()) {
                FollowingRelationFragment.m97322a(this.f78172a).ag_();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.FollowingRelationFragment$x */
    static final class C29704x extends Lambda implements C7563m<C11585f, Throwable, C7581n> {

        /* renamed from: a */
        final /* synthetic */ FollowingRelationFragment f78173a;

        C29704x(FollowingRelationFragment followingRelationFragment) {
            this.f78173a = followingRelationFragment;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m97375a((C11585f) obj, (Throwable) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m97375a(C11585f fVar, Throwable th) {
            C7573i.m23587b(fVar, "$receiver");
            C7573i.m23587b(th, "it");
            FollowingRelationFragment.m97322a(this.f78173a).mo66508i();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.FollowingRelationFragment$y */
    static final class C29705y extends Lambda implements C7563m<C11585f, List<? extends Object>, C7581n> {

        /* renamed from: a */
        final /* synthetic */ FollowingRelationFragment f78174a;

        C29705y(FollowingRelationFragment followingRelationFragment) {
            this.f78174a = followingRelationFragment;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m97376a((C11585f) obj, (List) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m97376a(C11585f fVar, List<? extends Object> list) {
            C7573i.m23587b(fVar, "$receiver");
            C7573i.m23587b(list, "it");
            fVar.mo29066a(this.f78174a.mo75630t(), new C7562b<FollowingRelationState, C7581n>(this) {

                /* renamed from: a */
                final /* synthetic */ C29705y f78175a;

                {
                    this.f78175a = r1;
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    m97377a((FollowingRelationState) obj);
                    return C7581n.f20898a;
                }

                /* renamed from: a */
                private void m97377a(FollowingRelationState followingRelationState) {
                    C7573i.m23587b(followingRelationState, "it");
                    if (!this.f78175a.f78174a.mo75630t().mo75830a(((C29607i) followingRelationState.getListState().getPayload()).f31254a.f31214a, ((C29607i) followingRelationState.getListState().getPayload()).f77978e, ((C29607i) followingRelationState.getListState().getPayload()).f77979f)) {
                        if (!this.f78175a.f78174a.mo75679B() || this.f78175a.f78174a.mo75678A()) {
                            ((DmtStatusView) this.f78175a.f78174a.mo60553a((int) R.id.dav)).mo25939d();
                        } else {
                            ((DmtStatusView) this.f78175a.f78174a.mo60553a((int) R.id.dav)).mo25943g();
                        }
                    }
                    this.f78175a.f78174a.mo75686z();
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.FollowingRelationFragment$z */
    static final class C29707z extends Lambda implements C7563m<C11585f, Boolean, C7581n> {

        /* renamed from: a */
        final /* synthetic */ FollowingRelationFragment f78176a;

        /* renamed from: com.ss.android.ugc.aweme.following.ui.FollowingRelationFragment$z$a */
        static final class C29708a extends Lambda implements C7562b<RecommendUserListState, C37182a> {

            /* renamed from: a */
            public static final C29708a f78177a = new C29708a();

            C29708a() {
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                return m97379a((RecommendUserListState) obj);
            }

            /* renamed from: a */
            private static C37182a m97379a(RecommendUserListState recommendUserListState) {
                C7573i.m23587b(recommendUserListState, "state");
                return recommendUserListState.getRecommendMobParams();
            }
        }

        C29707z(FollowingRelationFragment followingRelationFragment) {
            this.f78176a = followingRelationFragment;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m97378a((C11585f) obj, ((Boolean) obj2).booleanValue());
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m97378a(C11585f fVar, boolean z) {
            C7573i.m23587b(fVar, "$receiver");
            if (z) {
                FollowingRelationFragment.m97322a(this.f78176a).ai_();
            } else if (this.f78176a.mo75678A()) {
                if (!this.f78176a.mo75679B()) {
                    this.f78176a.mo75681u().mo93673a(C37182a.m119514a(((C37182a) fVar.mo29066a(this.f78176a.mo75681u(), C29708a.f78177a)).f97284a, ((C37182a) fVar.mo29066a(this.f78176a.mo75681u(), C29708a.f78177a)).f97285b, "nonempty"));
                }
                this.f78176a.mo75681u().mo29116k();
            } else if (this.f78176a.mo75624o()) {
                this.f78176a.mo75630t().mo75831g();
                FollowingRelationFragment.m97322a(this.f78176a).ai_();
            } else {
                FollowingRelationFragment.m97322a(this.f78176a).ah_();
            }
        }
    }

    /* renamed from: Y_ */
    public final boolean mo16933Y_() {
        return true;
    }

    /* renamed from: a */
    public final View mo60553a(int i) {
        if (this.f78128w == null) {
            this.f78128w = new HashMap();
        }
        View view = (View) this.f78128w.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f78128w.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: g */
    public final void mo60554g() {
        if (this.f78128w != null) {
            this.f78128w.clear();
        }
    }

    /* renamed from: j */
    public final int mo75619j() {
        return R.layout.oa;
    }

    /* renamed from: l */
    public final int mo75621l() {
        return R.string.d7s;
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo60554g();
    }

    /* renamed from: t */
    public final FollowingRelationViewModel mo75630t() {
        return (FollowingRelationViewModel) this.f78123r.getValue();
    }

    /* renamed from: u */
    public final RecommendUserListViewModel mo75681u() {
        return (RecommendUserListViewModel) this.f78124s.getValue();
    }

    /* renamed from: v */
    public final FollowRelationTabViewModel mo75682v() {
        return (FollowRelationTabViewModel) this.f78125t.getValue();
    }

    /* renamed from: I */
    private final int m97321I() {
        User user = this.f77982g;
        if (user != null) {
            return user.getFollowingCount();
        }
        return 0;
    }

    /* renamed from: m */
    public final String mo75622m() {
        if (mo75620k()) {
            return "following";
        }
        return "other_following";
    }

    /* renamed from: p */
    public final void mo75625p() {
        mo75630t().f78408e.mo29082b();
    }

    /* renamed from: q */
    public final int mo75626q() {
        if (C6399b.m19944t()) {
            return R.drawable.ax1;
        }
        return R.drawable.b7d;
    }

    /* renamed from: B */
    public final boolean mo75679B() {
        return ((Boolean) mo29066a(mo75630t(), C29672aa.f78131a)).booleanValue();
    }

    /* renamed from: s */
    public final int mo75628s() {
        if (mo75620k()) {
            if (C6399b.m19944t()) {
                return R.string.b9e;
            }
            return R.string.fi8;
        } else if (C6399b.m19944t()) {
            return R.string.b9e;
        } else {
            return R.string.fik;
        }
    }

    /* renamed from: w */
    public final void mo75683w() {
        mo29066a(mo75630t(), new C29675ad(this));
    }

    /* renamed from: A */
    public final boolean mo75678A() {
        if (mo75620k()) {
            if (C6399b.m19944t() || !RecUserExpansionAB.INSTANCE.enableFollowRelationRec() || m97321I() > 5) {
                return false;
            }
            return true;
        } else if (C6399b.m19944t() || !RecUserExpansionAB.INSTANCE.enableFollowRelationRec()) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: o */
    public final boolean mo75624o() {
        if (C6399b.m19944t() || !RecUserExpansionAB.INSTANCE.enableFollowRelationRec() || !mo75620k() || m97321I() <= 5) {
            return false;
        }
        return ((Boolean) mo29066a(mo75630t(), C29676ae.f78135a)).booleanValue();
    }

    /* renamed from: r */
    public final int mo75627r() {
        if (mo75620k()) {
            if (C6399b.m19944t()) {
                return R.string.b9f;
            }
            return R.string.fi9;
        } else if (C6399b.m19944t()) {
            return R.string.b9g;
        } else {
            return R.string.fil;
        }
    }

    /* renamed from: x */
    public final void mo75684x() {
        List a = this.f78118m.mo75832a(this.f78120o);
        if (C6307b.m19566a((Collection<T>) a)) {
            ((DmtStatusView) mo60553a((int) R.id.dav)).mo25943g();
        } else {
            ((DmtStatusView) mo60553a((int) R.id.dav)).mo25939d();
        }
        this.f78119n.mo58045a(a);
        this.f78119n.f78265b = this.f78120o;
    }

    /* renamed from: y */
    public final void mo75685y() {
        ((DmtStatusView) mo60553a((int) R.id.dav)).mo25939d();
        this.f78120o = "";
        ImageButton imageButton = (ImageButton) mo60553a((int) R.id.pw);
        C7573i.m23582a((Object) imageButton, "btn_clear");
        imageButton.setVisibility(8);
        this.f78119n.mo58045a(new ArrayList());
        this.f78119n.f78265b = this.f78120o;
    }

    /* renamed from: z */
    public final void mo75686z() {
        if (mo75620k() && C6384b.m19835a().mo15287a(EnablePushGuideExperiment.class, true, "push_guide_type", C6384b.m19835a().mo15295d().push_guide_type, 0) == 1) {
            if (this.f78126u) {
                NotificationPushGuide notificationPushGuide = this.f78127v;
                if (notificationPushGuide != null) {
                    notificationPushGuide.mo86880a();
                }
                this.f78126u = false;
                return;
            }
            NotificationPushGuide notificationPushGuide2 = this.f78127v;
            if (notificationPushGuide2 != null) {
                notificationPushGuide2.mo86883b();
            }
        }
    }

    public FollowingRelationFragment() {
        C7563m abVar = new C29673ab(this);
        C7584c a = C7575l.m23595a(FollowingRelationViewModel.class);
        C7561a followingRelationFragment$$special$$inlined$viewModel$1 = new FollowingRelationFragment$$special$$inlined$viewModel$1(a);
        C0043i iVar = this;
        this.f78123r = new lifecycleAwareLazy(iVar, followingRelationFragment$$special$$inlined$viewModel$1, new FollowingRelationFragment$$special$$inlined$viewModel$2(this, followingRelationFragment$$special$$inlined$viewModel$1, a, abVar));
        C7563m acVar = new C29674ac(this);
        C7584c a2 = C7575l.m23595a(RecommendUserListViewModel.class);
        C7561a followingRelationFragment$$special$$inlined$viewModel$3 = new FollowingRelationFragment$$special$$inlined$viewModel$3(a2);
        this.f78124s = new lifecycleAwareLazy(iVar, followingRelationFragment$$special$$inlined$viewModel$3, new FollowingRelationFragment$$special$$inlined$viewModel$4(this, followingRelationFragment$$special$$inlined$viewModel$3, a2, acVar));
        C7584c a3 = C7575l.m23595a(FollowRelationTabViewModel.class);
        this.f78125t = C7546e.m23569a(new FollowingRelationFragment$$special$$inlined$activityViewModel$1(this, a3, a3));
    }

    /* renamed from: D */
    private final void m97316D() {
        m97317E();
        this.f78117l = new FollowListAdapter(this, "following_relation", mo75620k());
        if (C6399b.m19944t()) {
            FollowListAdapter followListAdapter = this.f78117l;
            if (followListAdapter == null) {
                C7573i.m23583a("mFollowingListAdapter");
            }
            followListAdapter.f67550q = getResources().getColor(R.color.a3z);
        }
        RecyclerView recyclerView = (RecyclerView) mo60553a((int) R.id.cxi);
        C7573i.m23582a((Object) recyclerView, "rv_list");
        FollowListAdapter followListAdapter2 = this.f78117l;
        if (followListAdapter2 == null) {
            C7573i.m23583a("mFollowingListAdapter");
        }
        recyclerView.setAdapter(followListAdapter2);
        FollowListAdapter followListAdapter3 = this.f78117l;
        if (followListAdapter3 == null) {
            C7573i.m23583a("mFollowingListAdapter");
        }
        followListAdapter3.mo66504a((C6905a) new C29670a(this));
        if (mo75620k()) {
            m97319G();
        }
        m97320H();
    }

    /* renamed from: E */
    private final void m97317E() {
        if (!C6399b.m19945u() || !mo75620k()) {
            LinearLayout linearLayout = (LinearLayout) mo60553a((int) R.id.d0y);
            C7573i.m23582a((Object) linearLayout, "search_group");
            linearLayout.setVisibility(8);
        } else {
            LinearLayout linearLayout2 = (LinearLayout) mo60553a((int) R.id.d0y);
            C7573i.m23582a((Object) linearLayout2, "search_group");
            linearLayout2.setVisibility(0);
        }
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) mo60553a((int) R.id.d9t);
        C7573i.m23582a((Object) swipeRefreshLayout, "srl_refresh");
        swipeRefreshLayout.setEnabled(false);
        DmtStatusView dmtStatusView = (DmtStatusView) mo60553a((int) R.id.dav);
        C7573i.m23582a((Object) dmtStatusView, "status_view");
        mo75617a(dmtStatusView);
        WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager(getActivity());
        wrapLinearLayoutManager.mo5427b(1);
        RecyclerView recyclerView = (RecyclerView) mo60553a((int) R.id.cxi);
        C7573i.m23582a((Object) recyclerView, "rv_list");
        recyclerView.setLayoutManager(wrapLinearLayoutManager);
        RecyclerView recyclerView2 = (RecyclerView) mo60553a((int) R.id.cxi);
        C7573i.m23582a((Object) recyclerView2, "rv_list");
        recyclerView2.setItemAnimator(new CustomItemAnimator());
        if (C6399b.m19944t() && mo75620k()) {
            BooleanRef booleanRef = new BooleanRef();
            booleanRef.element = true;
            ((RecyclerView) mo60553a((int) R.id.cxi)).mo5528a((C1281m) new FollowingRelationFragment$initView$1(this, wrapLinearLayoutManager, booleanRef));
        }
        if (mo75620k()) {
            m97318F();
            this.f78127v = new NotificationPushGuide((NoticeView) mo60553a((int) R.id.asi), new C29687h());
            NotificationPushGuide notificationPushGuide = this.f78127v;
            if (notificationPushGuide != null) {
                notificationPushGuide.f89060c = EnterFrom.Follow;
            }
        }
    }

    /* renamed from: F */
    private final void m97318F() {
        ((NoticeView) mo60553a((int) R.id.asi)).setIconImage((int) R.drawable.adu);
        SpannableString spannableString = new SpannableString(C23481i.m77091b(R.string.b9h));
        String b = C23481i.m77091b(R.string.b9i);
        StringBuilder sb = new StringBuilder();
        sb.append(b);
        sb.append(" ");
        SpannableString spannableString2 = new SpannableString(sb.toString());
        Context context = getContext();
        if (context == null) {
            C7573i.m23580a();
        }
        C7573i.m23582a((Object) context, "getContext()!!");
        spannableString2.setSpan(new ForegroundColorSpan(context.getResources().getColor(R.color.a1f)), 0, spannableString2.length(), 34);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(spannableString2);
        if (getContext() != null) {
            Context context2 = getContext();
            if (context2 == null) {
                C7573i.m23580a();
            }
            C7573i.m23582a((Object) context2, "getContext()!!");
            spannableString.setSpan(new ForegroundColorSpan(context2.getResources().getColor(R.color.a1g)), 0, spannableString.length(), 34);
            spannableStringBuilder.append(spannableString);
        }
        ((NoticeView) mo60553a((int) R.id.asi)).setTitleText((CharSequence) spannableStringBuilder);
    }

    /* renamed from: G */
    private final void m97319G() {
        if (!C6399b.m19944t()) {
            this.f78121p = C10803a.m31631a(getContext()).mo25961a(new C10806a(getContext()).mo25985a((int) R.drawable.b7c).mo25990b((int) R.string.fic).mo25993c(R.string.fid).f29135a);
        } else {
            this.f78121p = C10803a.m31631a(getContext());
            MtEmptyView a = MtEmptyView.m31657a(getContext());
            a.setStatus(new C10806a(getContext()).mo25985a((int) R.drawable.ax3).mo25990b((int) R.string.fic).mo25993c(R.string.fid).f29135a);
            C10803a aVar = this.f78121p;
            if (aVar != null) {
                aVar.mo25963b((View) a);
            }
            DmtEditText dmtEditText = (DmtEditText) mo60553a((int) R.id.agn);
            if (dmtEditText != null) {
                dmtEditText.setHint(getResources().getString(R.string.b9d));
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.widget.TextView");
            }
        }
        if (C6399b.m19945u()) {
            ((ImageButton) mo60553a((int) R.id.pw)).setOnClickListener(new C29677b(this));
            ((DmtTextView) mo60553a((int) R.id.dr6)).setOnClickListener(new C29678c(this));
        } else {
            ((ImageButton) mo60553a((int) R.id.pw)).setOnClickListener(new C29680d(this));
        }
        ((DmtEditText) mo60553a((int) R.id.agn)).setOnTouchListener(new C29682e(this));
        ((DmtEditText) mo60553a((int) R.id.agn)).addTextChangedListener(new C29684f(this));
        ((DmtEditText) mo60553a((int) R.id.agn)).setOnEditorActionListener(new C29686g(this));
        this.f78118m.mo75833a();
    }

    /* renamed from: H */
    private final void m97320H() {
        mo29062a(mo75682v(), C29766k.f78301a, C11640h.m34110a(), new C29696q(this));
        ListMiddleware<FollowingRelationState, Object, C29607i> listMiddleware = mo75630t().f78408e;
        C11502e eVar = this;
        FollowListAdapter followListAdapter = this.f78117l;
        if (followListAdapter == null) {
            C7573i.m23583a("mFollowingListAdapter");
        }
        ListMiddleware.m33938a(listMiddleware, eVar, followListAdapter, false, false, new C29688i(new C29699t(this), new C29700u(this), new C29701v(this)), new C29689j(new C29703w(this), new C29704x(this), new C29705y(this)), new C29707z(this), null, null, null, 908, null);
        mo29064a(mo75630t(), C29767l.f78302a, C29768m.f78303a, C11640h.m34110a(), new C29690k(this));
        C11503a.m33919a(this, mo75681u(), C29769n.f78304a, null, new C29692m(this), new C29691l(this), new C29693n(this), 2, null);
        C11503a.m33919a(this, mo75681u(), C29770o.f78305a, null, new C29695p(this), new C29694o(this), null, 18, null);
        mo29062a(mo75681u(), C29771p.f78306a, C11640h.m34110a(), new C29697r(this));
        mo29064a(mo75681u(), C29772q.f78307a, C29773r.f78308a, C11640h.m34110a(), new C29698s(this));
        if (!this.f77983h) {
            mo75630t().f78408e.mo29082b();
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ FollowListAdapter m97322a(FollowingRelationFragment followingRelationFragment) {
        FollowListAdapter followListAdapter = followingRelationFragment.f78117l;
        if (followListAdapter == null) {
            C7573i.m23583a("mFollowingListAdapter");
        }
        return followListAdapter;
    }

    public final void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (!z && ((DmtEditText) mo60553a((int) R.id.agn)) != null) {
            C25713b.m84474a((Activity) getActivity(), (View) (DmtEditText) mo60553a((int) R.id.agn));
        }
    }

    @C7709l
    public final void onAntiCrawlerEvent(C23281a aVar) {
        C7573i.m23587b(aVar, "event");
        String str = aVar.f61317a;
        if (str != null) {
            CharSequence charSequence = str;
            if (C7634n.m23776c(charSequence, (CharSequence) "/aweme/v1/user/follower/list/?", false) || C7634n.m23776c(charSequence, (CharSequence) "/aweme/v1/user/following/list/?", false)) {
                C42961az.m136385f(aVar);
                mo75625p();
            }
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C7573i.m23587b(view, "view");
        super.onViewCreated(view, bundle);
        m97316D();
    }
}

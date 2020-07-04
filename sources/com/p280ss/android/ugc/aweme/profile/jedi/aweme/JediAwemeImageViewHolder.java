package com.p280ss.android.ugc.aweme.profile.jedi.aweme;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.p022v4.app.C0598c;
import android.support.p022v4.content.C0683b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.jedi.arch.C11664n;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.internal.C11640h;
import com.bytedance.jedi.ext.adapter.C11679b;
import com.bytedance.jedi.ext.adapter.C11714g;
import com.bytedance.jedi.ext.adapter.C11714g.C11715a;
import com.bytedance.lighten.core.C12128i;
import com.bytedance.lighten.core.C12133n;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.router.SmartRouter;
import com.p280ss.android.ugc.aweme.app.C22903bl;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.C23400r;
import com.p280ss.android.ugc.aweme.base.widget.FixedRatioFrameLayout;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.p1144e.C25673a;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.p280ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.p280ss.android.ugc.aweme.feed.model.ImageInfo;
import com.p280ss.android.ugc.aweme.feed.p1226b.C28229b;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28482e;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28503s;
import com.p280ss.android.ugc.aweme.p1192e.p1193a.C27326a;
import com.p280ss.android.ugc.aweme.profile.adapter.AwemeAdapter;
import com.p280ss.android.ugc.aweme.profile.jedi.aweme.C35957c.C35961a;
import com.p280ss.android.ugc.aweme.profile.p1487ui.AwemeListFragmentImpl;
import com.p280ss.android.ugc.aweme.profile.service.C36071g;
import com.p280ss.android.ugc.aweme.profile.util.C36735h;
import com.p280ss.android.ugc.aweme.profile.util.C36743n;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import java.util.Map;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.collections.C7525m;
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

/* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.JediAwemeImageViewHolder */
public final class JediAwemeImageViewHolder extends JediAnimatedViewHolder<JediAwemeImageViewHolder, Object> {

    /* renamed from: m */
    static final /* synthetic */ C7595j[] f93897m = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(JediAwemeImageViewHolder.class), "awemeListViewModel", "getAwemeListViewModel()Lcom/ss/android/ugc/aweme/profile/jedi/aweme/JediAwemeListViewModel;"))};

    /* renamed from: t */
    public static final C35840a f93898t = new C35840a(null);

    /* renamed from: n */
    public final FixedRatioFrameLayout f93899n;

    /* renamed from: o */
    public final View f93900o;

    /* renamed from: p */
    public final DmtTextView f93901p;

    /* renamed from: q */
    public final DmtTextView f93902q;

    /* renamed from: r */
    public final LinearLayout f93903r;

    /* renamed from: s */
    public String f93904s;

    /* renamed from: u */
    private final C7541d f93905u;

    /* renamed from: v */
    private final ImageView f93906v;

    /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.JediAwemeImageViewHolder$a */
    public static final class C35840a {
        private C35840a() {
        }

        public /* synthetic */ C35840a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.JediAwemeImageViewHolder$b */
    static final class C35841b extends Lambda implements C7562b<AwemeListState, C7581n> {

        /* renamed from: a */
        final /* synthetic */ JediAwemeImageViewHolder f93907a;

        /* renamed from: b */
        final /* synthetic */ Aweme f93908b;

        C35841b(JediAwemeImageViewHolder jediAwemeImageViewHolder, Aweme aweme) {
            this.f93907a = jediAwemeImageViewHolder;
            this.f93908b = aweme;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m115686a((AwemeListState) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m115686a(AwemeListState awemeListState) {
            C7573i.m23587b(awemeListState, "awemeListState");
            C36071g.f94309a.mo91802a(awemeListState.getEnterAwemeId(), this.f93908b.getAid(), this.f93907a.f93899n, this.f93907a.f93900o, this.f93907a.mo62390p().getContext());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.JediAwemeImageViewHolder$c */
    static final class C35842c extends Lambda implements C7562b<AwemeListState, C7581n> {

        /* renamed from: a */
        final /* synthetic */ JediAwemeImageViewHolder f93909a;

        /* renamed from: b */
        final /* synthetic */ Aweme f93910b;

        /* renamed from: c */
        final /* synthetic */ AwemeStatistics f93911c;

        C35842c(JediAwemeImageViewHolder jediAwemeImageViewHolder, Aweme aweme, AwemeStatistics awemeStatistics) {
            this.f93909a = jediAwemeImageViewHolder;
            this.f93910b = aweme;
            this.f93911c = awemeStatistics;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m115687a((AwemeListState) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m115687a(AwemeListState awemeListState) {
            int i;
            C7573i.m23587b(awemeListState, "it");
            this.f93909a.mo90808a(this.f93910b, awemeListState.isMyProfile(), awemeListState.getProfileListType());
            if (awemeListState.isMyProfile() && awemeListState.getProfileListType() == 0) {
                DmtTextView dmtTextView = this.f93909a.f93902q;
                C7573i.m23582a((Object) dmtTextView, "tvPlayCount");
                dmtTextView.setVisibility(0);
            }
            AwemeStatus status = this.f93910b.getStatus();
            if (status != null && status.isInReviewing() && !C6399b.m19944t()) {
                View view = this.f93909a.itemView;
                C7573i.m23582a((Object) view, "itemView");
                Drawable a = C0683b.m2903a(view.getContext(), (int) R.drawable.axp);
                DmtTextView dmtTextView2 = this.f93909a.f93902q;
                dmtTextView2.setCompoundDrawablesWithIntrinsicBounds(a, null, null, null);
                dmtTextView2.setText(R.string.pd);
                View view2 = this.f93909a.itemView;
                C7573i.m23582a((Object) view2, "itemView");
                dmtTextView2.setTextColor(view2.getContext().getResources().getColor(R.color.a5e));
                dmtTextView2.setTypeface(Typeface.DEFAULT);
                View view3 = this.f93909a.itemView;
                C7573i.m23582a((Object) view3, "itemView");
                dmtTextView2.setContentDescription(view3.getContext().getString(R.string.pd));
            } else if (this.f93911c != null) {
                AwemeStatistics statistics = this.f93910b.getStatistics();
                C7573i.m23582a((Object) statistics, "aweme.statistics");
                String a2 = C36735h.m118415a(statistics.getPlayCount());
                View view4 = this.f93909a.itemView;
                C7573i.m23582a((Object) view4, "itemView");
                Drawable a3 = C0683b.m2903a(view4.getContext(), (int) R.drawable.av3);
                DmtTextView dmtTextView3 = this.f93909a.f93902q;
                dmtTextView3.setCompoundDrawablesWithIntrinsicBounds(a3, null, null, null);
                dmtTextView3.setText(a2);
                View view5 = this.f93909a.itemView;
                C7573i.m23582a((Object) view5, "itemView");
                Context context = view5.getContext();
                C7573i.m23582a((Object) context, "itemView.context");
                dmtTextView3.setTextColor(context.getResources().getColor(R.color.zg));
                dmtTextView3.setTypeface(Typeface.SANS_SERIF, 2);
                View view6 = this.f93909a.itemView;
                C7573i.m23582a((Object) view6, "itemView");
                dmtTextView3.setContentDescription(view6.getContext().getString(R.string.d6k, new Object[]{a2}));
            } else {
                View view7 = this.f93909a.itemView;
                C7573i.m23582a((Object) view7, "itemView");
                Drawable a4 = C0683b.m2903a(view7.getContext(), (int) R.drawable.aut);
                DmtTextView dmtTextView4 = this.f93909a.f93902q;
                C7573i.m23582a((Object) dmtTextView4, "tvPlayCount");
                dmtTextView4.setVisibility(0);
                this.f93909a.f93902q.setCompoundDrawablesWithIntrinsicBounds(a4, null, null, null);
                AwemeStatistics statistics2 = this.f93910b.getStatistics();
                if (statistics2 != null) {
                    i = statistics2.getDiggCount();
                } else {
                    i = 0;
                }
                String a5 = C36735h.m118415a(i);
                DmtTextView dmtTextView5 = this.f93909a.f93902q;
                C7573i.m23582a((Object) dmtTextView5, "tvPlayCount");
                dmtTextView5.setText(a5);
                DmtTextView dmtTextView6 = this.f93909a.f93902q;
                C7573i.m23582a((Object) dmtTextView6, "tvPlayCount");
                View view8 = this.f93909a.itemView;
                C7573i.m23582a((Object) view8, "itemView");
                dmtTextView6.setContentDescription(view8.getContext().getString(R.string.d6h, new Object[]{a5}));
                if (!C36743n.m118431b(awemeListState.getProfileListType(), awemeListState.isMyProfile()) || !this.f93910b.isDelete()) {
                    LinearLayout linearLayout = this.f93909a.f93903r;
                    if (linearLayout != null) {
                        View view9 = this.f93909a.itemView;
                        C7573i.m23582a((Object) view9, "itemView");
                        linearLayout.setBackground(C0683b.m2903a(view9.getContext(), (int) R.drawable.l0));
                    }
                } else {
                    LinearLayout linearLayout2 = this.f93909a.f93903r;
                    if (linearLayout2 != null) {
                        linearLayout2.setBackground(null);
                    }
                }
            }
            if (this.f93910b.getIsTop() == 1) {
                DmtTextView dmtTextView7 = this.f93909a.f93901p;
                C7573i.m23582a((Object) dmtTextView7, "tvTop");
                dmtTextView7.setVisibility(0);
            } else {
                DmtTextView dmtTextView8 = this.f93909a.f93901p;
                C7573i.m23582a((Object) dmtTextView8, "tvTop");
                dmtTextView8.setVisibility(8);
            }
            if (awemeListState.getShowCover()) {
                this.f93909a.mo90809b(this.f93910b);
            }
            SmartImageView p = this.f93909a.mo62390p();
            View view10 = this.f93909a.itemView;
            C7573i.m23582a((Object) view10, "itemView");
            p.setContentDescription(view10.getContext().getString(R.string.d6j, new Object[]{Integer.valueOf(this.f93909a.getPosition() + 1)}));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.JediAwemeImageViewHolder$d */
    static final class C35843d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ JediAwemeImageViewHolder f93912a;

        /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.JediAwemeImageViewHolder$d$a */
        static final class C35845a extends Lambda implements C7562b<AwemeState, Aweme> {

            /* renamed from: a */
            public static final C35845a f93916a = new C35845a();

            C35845a() {
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                return m115689a((AwemeState) obj);
            }

            /* renamed from: a */
            private static Aweme m115689a(AwemeState awemeState) {
                C7573i.m23587b(awemeState, "it");
                return awemeState.getAweme();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.JediAwemeImageViewHolder$d$b */
        static final class C35846b extends Lambda implements C7562b<AwemeListState, Integer> {

            /* renamed from: a */
            public static final C35846b f93917a = new C35846b();

            C35846b() {
                super(1);
            }

            /* renamed from: a */
            private static int m115690a(AwemeListState awemeListState) {
                C7573i.m23587b(awemeListState, "it");
                return awemeListState.getProfileListType();
            }

            public final /* synthetic */ Object invoke(Object obj) {
                return Integer.valueOf(m115690a((AwemeListState) obj));
            }
        }

        C35843d(JediAwemeImageViewHolder jediAwemeImageViewHolder) {
            this.f93912a = jediAwemeImageViewHolder;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (!C27326a.m89578a(view)) {
                if (!C35969g.m115915a(this.f93912a.mo62390p().getContext())) {
                    C10761a.m31399c(this.f93912a.mo62390p().getContext(), (int) R.string.cjs).mo25750a();
                } else if (this.f93912a.mo69909u()) {
                    C28503s.m93679a((C25673a) C35961a.m115904a(this.f93912a.mo69908t(), ((Number) this.f93912a.mo29066a(this.f93912a.mo69908t(), (C7562b<? super S1, ? extends R>) C35846b.f93917a)).intValue()));
                    final Bundle bundle = new Bundle();
                    final Aweme aweme = (Aweme) this.f93912a.mo29066a(this.f93912a.mo69907s(), (C7562b<? super S1, ? extends R>) C35845a.f93916a);
                    bundle.putString("id", aweme.getAid());
                    this.f93912a.mo29066a(this.f93912a.mo69908t(), (C7562b<? super S1, ? extends R>) new C7562b<AwemeListState, C7581n>(this) {

                        /* renamed from: a */
                        final /* synthetic */ C35843d f93913a;

                        {
                            this.f93913a = r1;
                        }

                        public final /* synthetic */ Object invoke(Object obj) {
                            m115688a((AwemeListState) obj);
                            return C7581n.f20898a;
                        }

                        /* renamed from: a */
                        private void m115688a(AwemeListState awemeListState) {
                            String str;
                            C7573i.m23587b(awemeListState, "it");
                            if (!C36743n.m118431b(awemeListState.getProfileListType(), awemeListState.isMyProfile()) || !aweme.isDelete()) {
                                Bundle bundle = bundle;
                                String str2 = "video_from";
                                if (awemeListState.isMyProfile()) {
                                    str = "from_profile_self";
                                } else {
                                    str = "from_profile_other";
                                }
                                bundle.putString(str2, str);
                                bundle.putInt("video_type", awemeListState.getProfileListType());
                                bundle.putString("userid", awemeListState.getUserId());
                                bundle.putInt("profile_enterprise_type", aweme.getEnterpriseType());
                                bundle.putString("tab_name", awemeListState.getTabName());
                                bundle.putInt("from_post_list", awemeListState.isFromPostList());
                                bundle.putString("enter_method", awemeListState.getMethodFrom());
                                bundle.putString("like_enter_method", awemeListState.getMethodFromLike());
                                bundle.putString("content_source", awemeListState.getContentSource());
                                bundle.putString("refer", awemeListState.getLabel());
                                bundle.putString("previous_page", awemeListState.getPreviousPage());
                                bundle.putString("extra_previous_page_position", awemeListState.getPreviousPagePosition());
                                bundle.putString("enter_from_request_id", awemeListState.getEnterFromRequestId());
                                bundle.putString("feeds_aweme_id", awemeListState.getFeedsAwemeId());
                                C0598c b = C0598c.m2487b(this.f93913a.f93912a.mo62390p(), 0, 0, this.f93913a.f93912a.mo62390p().getWidth(), this.f93913a.f93912a.mo62390p().getHeight());
                                C7573i.m23582a((Object) b, "ActivityOptionsCompat.ma…), coverView.getHeight())");
                                Context context = this.f93913a.f93912a.mo62390p().getContext();
                                if (context != null) {
                                    SmartRouter.buildRoute((Context) (Activity) context, "aweme://aweme/detail/").withParam(bundle).withBundleAnimation(b.mo2580a()).open();
                                    if (AwemeListFragmentImpl.m116370c(awemeListState.getProfileListType())) {
                                        C6907h.m21524a("click_personal_collection", (Map) C22984d.m75611a().mo59973a("enter_from", "collection_video").mo59973a(C38347c.f99553h, "video").mo59973a("video_id", aweme.getAid()).f60753a);
                                    }
                                    return;
                                }
                                throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
                            }
                            C36743n nVar = C36743n.f96432a;
                            Context context2 = this.f93913a.f93912a.mo62390p().getContext();
                            C7573i.m23582a((Object) context2, "coverView.context");
                            C36743n.m118428a(context2, aweme, null);
                        }
                    });
                    C28229b.m92772a(aweme);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.JediAwemeImageViewHolder$e */
    static final class C35847e extends Lambda implements C7562b<AwemeState, AwemeState> {

        /* renamed from: a */
        final /* synthetic */ JediAwemeImageViewHolder f93918a;

        C35847e(JediAwemeImageViewHolder jediAwemeImageViewHolder) {
            this.f93918a = jediAwemeImageViewHolder;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public AwemeState invoke(AwemeState awemeState) {
            C7573i.m23587b(awemeState, "$receiver");
            Object o = this.f93918a.mo29309o();
            if (o != null) {
                return awemeState.copy((Aweme) o);
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.model.Aweme");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.JediAwemeImageViewHolder$f */
    static final class C35848f extends Lambda implements C7563m<JediAwemeImageViewHolder, Aweme, C7581n> {

        /* renamed from: a */
        public static final C35848f f93919a = new C35848f();

        C35848f() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m115692a((JediAwemeImageViewHolder) obj, (Aweme) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private static void m115692a(JediAwemeImageViewHolder jediAwemeImageViewHolder, final Aweme aweme) {
            C7573i.m23587b(jediAwemeImageViewHolder, "$receiver");
            C7573i.m23587b(aweme, "it");
            jediAwemeImageViewHolder.mo90807a(aweme);
            jediAwemeImageViewHolder.mo29066a(jediAwemeImageViewHolder.mo69908t(), (C7562b<? super S1, ? extends R>) new C7562b<AwemeListState, C7581n>() {
                public final /* synthetic */ Object invoke(Object obj) {
                    m115693a((AwemeListState) obj);
                    return C7581n.f20898a;
                }

                /* renamed from: a */
                private void m115693a(AwemeListState awemeListState) {
                    C7573i.m23587b(awemeListState, "awemeListState");
                    AwemeAdapter.m115279a(awemeListState.getProfileListType(), awemeListState.getVisibleForFavoritesMob(), aweme);
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.JediAwemeImageViewHolder$g */
    static final class C35850g extends Lambda implements C7562b<AwemeState, C7581n> {

        /* renamed from: a */
        final /* synthetic */ JediAwemeImageViewHolder f93921a;

        C35850g(JediAwemeImageViewHolder jediAwemeImageViewHolder) {
            this.f93921a = jediAwemeImageViewHolder;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m115694a((AwemeState) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m115694a(AwemeState awemeState) {
            C7573i.m23587b(awemeState, "it");
            this.f93921a.mo90809b(awemeState.getAweme());
        }
    }

    /* renamed from: t */
    public final JediAwemeListViewModel mo69908t() {
        return (JediAwemeListViewModel) this.f93905u.getValue();
    }

    /* renamed from: u */
    public final boolean mo69909u() {
        try {
            mo69908t();
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public final void bA_() {
        super.bA_();
        mo29062a(mo69907s(), C35970h.f94144a, C11640h.m34110a(), C35848f.f93919a);
    }

    public final void bB_() {
        mo29066a(mo69907s(), (C7562b<? super S1, ? extends R>) new C35850g<Object,Object>(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final SmartImageView mo69905q() {
        View view = this.itemView;
        C7573i.m23582a((Object) view, "itemView");
        ((SmartImageView) view.findViewById(R.id.a4g)).setOnClickListener(new C35843d(this));
        View view2 = this.itemView;
        C7573i.m23582a((Object) view2, "itemView");
        ((SmartImageView) view2.findViewById(R.id.a4g)).setAnimationListener(this.f93885l);
        View view3 = this.itemView;
        C7573i.m23582a((Object) view3, "itemView");
        SmartImageView smartImageView = (SmartImageView) view3.findViewById(R.id.a4g);
        C7573i.m23582a((Object) smartImageView, "itemView.cover");
        return smartImageView;
    }

    /* renamed from: s */
    public final JediAwemeViewModel mo69907s() {
        C7562b eVar = new C35847e(this);
        Class<JediAwemeViewModel> cls = JediAwemeViewModel.class;
        C11679b d = mo29218d();
        if (d != null) {
            C11714g a = C11715a.m34329a(mo29056f(), d.mo29232b());
            StringBuilder sb = new StringBuilder();
            sb.append(getClass().getName());
            sb.append('_');
            sb.append(cls.getName());
            JediViewModel jediViewModel = (JediViewModel) a.mo29268a(sb.toString(), cls);
            C11664n a2 = jediViewModel.f31065b.mo29189a(JediAwemeViewModel.class);
            if (a2 != null) {
                a2.binding(jediViewModel);
            }
            jediViewModel.mo29034a(eVar);
            return (JediAwemeViewModel) jediViewModel;
        }
        throw new IllegalStateException("proxy not bound to viewHolder yet");
    }

    /* renamed from: a */
    public final void mo90807a(Aweme aweme) {
        if (aweme != null) {
            mo29066a(mo69908t(), (C7562b<? super S1, ? extends R>) new C35841b<Object,Object>(this, aweme));
            mo29066a(mo69908t(), (C7562b<? super S1, ? extends R>) new C35842c<Object,Object>(this, aweme, aweme.getStatistics()));
        }
    }

    /* renamed from: b */
    public final void mo90809b(Aweme aweme) {
        ImageInfo imageInfo;
        if (aweme != null) {
            List imageInfos = aweme.getImageInfos();
            if (imageInfos != null) {
                imageInfo = (ImageInfo) C7525m.m23504c(imageInfos, 0);
            } else {
                imageInfo = null;
            }
            if (imageInfo != null) {
                C12133n.m35299a(C23400r.m76741a(imageInfo.getLabelThumb())).mo29845a("JediAwemeImageViewHolder").mo29836a(mo62390p().getWidth(), mo62390p().getHeight()).mo29844a((C12128i) mo62390p()).mo29848a();
            }
        }
    }

    private JediAwemeImageViewHolder(ViewGroup viewGroup, String str) {
        C7573i.m23587b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.wq, viewGroup, false);
        C7573i.m23582a((Object) inflate, "LayoutInflater.from(pare…tem_image, parent, false)");
        super(inflate);
        this.f93904s = str;
        C7584c a = C7575l.m23595a(JediAwemeListViewModel.class);
        this.f93905u = C7546e.m23569a(new JediAwemeImageViewHolder$$special$$inlined$hostViewModel$1(this, a, a));
        View view = this.itemView;
        C7573i.m23582a((Object) view, "itemView");
        this.f93899n = (FixedRatioFrameLayout) view.findViewById(R.id.a19);
        View view2 = this.itemView;
        C7573i.m23582a((Object) view2, "itemView");
        this.f93900o = view2.findViewById(R.id.cie);
        View view3 = this.itemView;
        C7573i.m23582a((Object) view3, "itemView");
        this.f93901p = (DmtTextView) view3.findViewById(R.id.e3t);
        View view4 = this.itemView;
        C7573i.m23582a((Object) view4, "itemView");
        this.f93902q = (DmtTextView) view4.findViewById(R.id.dzn);
        View view5 = this.itemView;
        C7573i.m23582a((Object) view5, "itemView");
        this.f93906v = (ImageView) view5.findViewById(R.id.eaw);
        View view6 = this.itemView;
        C7573i.m23582a((Object) view6, "itemView");
        this.f93903r = (LinearLayout) view6.findViewById(R.id.ayb);
    }

    /* renamed from: a */
    public final void mo90808a(Aweme aweme, boolean z, int i) {
        SharePrefCache inst = SharePrefCache.inst();
        C7573i.m23582a((Object) inst, "SharePrefCache.inst()");
        C22903bl isPrivateAvailable = inst.getIsPrivateAvailable();
        C7573i.m23582a((Object) isPrivateAvailable, "SharePrefCache.inst().isPrivateAvailable");
        Boolean bool = (Boolean) isPrivateAvailable.mo59877d();
        C7573i.m23582a((Object) bool, "isPrivate");
        if (bool.booleanValue() && ((z && i == 0) || C28482e.m93606a(aweme))) {
            AwemeStatus status = aweme.getStatus();
            C7573i.m23582a((Object) status, "data.status");
            if (status.getPrivateStatus() != 0) {
                ImageView imageView = this.f93906v;
                C7573i.m23582a((Object) imageView, "videoLocked");
                imageView.setVisibility(0);
                AwemeStatus status2 = aweme.getStatus();
                C7573i.m23582a((Object) status2, "data.status");
                if (status2.getPrivateStatus() == 1) {
                    this.f93906v.setImageResource(R.drawable.auz);
                    return;
                }
                AwemeStatus status3 = aweme.getStatus();
                C7573i.m23582a((Object) status3, "data.status");
                if (status3.getPrivateStatus() == 2) {
                    this.f93906v.setImageResource(R.drawable.aur);
                }
                return;
            }
        }
        ImageView imageView2 = this.f93906v;
        C7573i.m23582a((Object) imageView2, "videoLocked");
        imageView2.setVisibility(8);
    }

    public /* synthetic */ JediAwemeImageViewHolder(ViewGroup viewGroup, String str, int i, C7571f fVar) {
        this(viewGroup, null);
    }
}

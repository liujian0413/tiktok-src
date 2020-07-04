package com.p280ss.android.ugc.aweme.profile.jedi.aweme;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.p022v4.app.C0598c;
import android.support.p022v4.content.C0683b;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
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
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.widget.FixedRatioFrameLayout;
import com.p280ss.android.ugc.aweme.commercialize.log.C24945an;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.p1144e.C25673a;
import com.p280ss.android.ugc.aweme.experiment.C27690d;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.p280ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.p280ss.android.ugc.aweme.feed.model.Video;
import com.p280ss.android.ugc.aweme.feed.p1226b.C28229b;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28482e;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28503s;
import com.p280ss.android.ugc.aweme.image.C32029b;
import com.p280ss.android.ugc.aweme.login.utils.C32698a;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.p1192e.p1193a.C27326a;
import com.p280ss.android.ugc.aweme.profile.adapter.AwemeAdapter;
import com.p280ss.android.ugc.aweme.profile.adapter.AwemeViewHolder;
import com.p280ss.android.ugc.aweme.profile.jedi.aweme.C35957c.C35961a;
import com.p280ss.android.ugc.aweme.profile.service.C36071g;
import com.p280ss.android.ugc.aweme.profile.util.C36735h;
import com.p280ss.android.ugc.aweme.profile.util.C36743n;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import com.zhiliaoapp.musically.df_live_zego_link.R;
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
import kotlin.jvm.internal.Ref.BooleanRef;
import kotlin.jvm.internal.Ref.IntRef;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;
import kotlin.reflect.C7584c;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.JediAwemeVideoViewHolder */
public final class JediAwemeVideoViewHolder extends JediAnimatedViewHolder<JediAwemeVideoViewHolder, Object> {

    /* renamed from: m */
    static final /* synthetic */ C7595j[] f94049m = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(JediAwemeVideoViewHolder.class), "awemeListViewModel", "getAwemeListViewModel()Lcom/ss/android/ugc/aweme/profile/jedi/aweme/JediAwemeListViewModel;"))};

    /* renamed from: q */
    public static final C35919a f94050q = new C35919a(null);

    /* renamed from: A */
    private final FrameLayout f94051A;

    /* renamed from: B */
    private final DmtTextView f94052B;

    /* renamed from: C */
    private final LinearLayout f94053C;

    /* renamed from: D */
    private final DmtTextView f94054D;

    /* renamed from: E */
    private final DmtTextView f94055E;

    /* renamed from: F */
    private final ImageView f94056F;

    /* renamed from: n */
    public final FixedRatioFrameLayout f94057n;

    /* renamed from: o */
    public final View f94058o;

    /* renamed from: p */
    public String f94059p;

    /* renamed from: r */
    private Drawable f94060r;

    /* renamed from: s */
    private Drawable f94061s;

    /* renamed from: t */
    private Drawable f94062t;

    /* renamed from: u */
    private final C7541d f94063u;

    /* renamed from: v */
    private final SmartImageView f94064v;

    /* renamed from: w */
    private final DmtTextView f94065w;

    /* renamed from: x */
    private final LinearLayout f94066x;

    /* renamed from: y */
    private final View f94067y;

    /* renamed from: z */
    private final DmtTextView f94068z;

    /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.JediAwemeVideoViewHolder$a */
    public static final class C35919a {
        private C35919a() {
        }

        public /* synthetic */ C35919a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.JediAwemeVideoViewHolder$b */
    static final class C35920b extends Lambda implements C7562b<AwemeListState, C7581n> {

        /* renamed from: a */
        final /* synthetic */ JediAwemeVideoViewHolder f94069a;

        /* renamed from: b */
        final /* synthetic */ Aweme f94070b;

        C35920b(JediAwemeVideoViewHolder jediAwemeVideoViewHolder, Aweme aweme) {
            this.f94069a = jediAwemeVideoViewHolder;
            this.f94070b = aweme;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m115846a((AwemeListState) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m115846a(AwemeListState awemeListState) {
            C7573i.m23587b(awemeListState, "awemeListState");
            C36071g gVar = C36071g.f94309a;
            String enterAwemeId = awemeListState.getEnterAwemeId();
            String aid = this.f94070b.getAid();
            View view = this.f94069a.f94057n;
            View view2 = this.f94069a.f94058o;
            View view3 = this.f94069a.itemView;
            C7573i.m23582a((Object) view3, "itemView");
            gVar.mo91802a(enterAwemeId, aid, view, view2, view3.getContext());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.JediAwemeVideoViewHolder$c */
    static final class C35921c extends Lambda implements C7562b<AwemeListState, C7581n> {

        /* renamed from: a */
        final /* synthetic */ IntRef f94071a;

        /* renamed from: b */
        final /* synthetic */ BooleanRef f94072b;

        C35921c(IntRef intRef, BooleanRef booleanRef) {
            this.f94071a = intRef;
            this.f94072b = booleanRef;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m115847a((AwemeListState) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m115847a(AwemeListState awemeListState) {
            C7573i.m23587b(awemeListState, "it");
            this.f94071a.element = awemeListState.getProfileListType();
            this.f94072b.element = awemeListState.isMyProfile();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.JediAwemeVideoViewHolder$d */
    static final class C35922d extends Lambda implements C7562b<AwemeListState, C7581n> {

        /* renamed from: a */
        final /* synthetic */ JediAwemeVideoViewHolder f94073a;

        /* renamed from: b */
        final /* synthetic */ Aweme f94074b;

        C35922d(JediAwemeVideoViewHolder jediAwemeVideoViewHolder, Aweme aweme) {
            this.f94073a = jediAwemeVideoViewHolder;
            this.f94074b = aweme;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m115848a((AwemeListState) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m115848a(AwemeListState awemeListState) {
            C7573i.m23587b(awemeListState, "it");
            if (awemeListState.getShowCover()) {
                this.f94073a.mo90884b(this.f94074b);
                if (!C24945an.m81853a().mo65226d(this.f94074b.getAid())) {
                    C24945an.m81853a().mo65227e(this.f94074b.getAid());
                    View view = this.f94073a.itemView;
                    C7573i.m23582a((Object) view, "itemView");
                    AwemeViewHolder.m115305a(view.getContext(), this.f94074b);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.JediAwemeVideoViewHolder$e */
    static final class C35923e extends Lambda implements C7562b<AwemeState, C7581n> {

        /* renamed from: a */
        final /* synthetic */ ObjectRef f94075a;

        C35923e(ObjectRef objectRef) {
            this.f94075a = objectRef;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m115849a((AwemeState) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m115849a(AwemeState awemeState) {
            C7573i.m23587b(awemeState, "it");
            this.f94075a.element = awemeState.getAweme();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.JediAwemeVideoViewHolder$f */
    static final class C35924f implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ JediAwemeVideoViewHolder f94076a;

        /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.JediAwemeVideoViewHolder$f$a */
        static final class C35926a extends Lambda implements C7562b<AwemeState, Aweme> {

            /* renamed from: a */
            public static final C35926a f94080a = new C35926a();

            C35926a() {
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                return m115851a((AwemeState) obj);
            }

            /* renamed from: a */
            private static Aweme m115851a(AwemeState awemeState) {
                C7573i.m23587b(awemeState, "it");
                return awemeState.getAweme();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.JediAwemeVideoViewHolder$f$b */
        static final class C35927b extends Lambda implements C7562b<AwemeListState, Integer> {

            /* renamed from: a */
            public static final C35927b f94081a = new C35927b();

            C35927b() {
                super(1);
            }

            /* renamed from: a */
            private static int m115852a(AwemeListState awemeListState) {
                C7573i.m23587b(awemeListState, "it");
                return awemeListState.getProfileListType();
            }

            public final /* synthetic */ Object invoke(Object obj) {
                return Integer.valueOf(m115852a((AwemeListState) obj));
            }
        }

        C35924f(JediAwemeVideoViewHolder jediAwemeVideoViewHolder) {
            this.f94076a = jediAwemeVideoViewHolder;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (!C27326a.m89578a(view)) {
                View view2 = this.f94076a.itemView;
                C7573i.m23582a((Object) view2, "itemView");
                if (!C35988p.m115950a(view2.getContext())) {
                    View view3 = this.f94076a.itemView;
                    C7573i.m23582a((Object) view3, "itemView");
                    C10761a.m31399c(view3.getContext(), (int) R.string.cjs).mo25750a();
                    return;
                }
                C28503s.m93679a((C25673a) C35961a.m115904a(this.f94076a.mo69908t(), ((Number) this.f94076a.mo29066a(this.f94076a.mo69908t(), (C7562b<? super S1, ? extends R>) C35927b.f94081a)).intValue()));
                final Bundle bundle = new Bundle();
                final Aweme aweme = (Aweme) this.f94076a.mo29066a(this.f94076a.mo69907s(), (C7562b<? super S1, ? extends R>) C35926a.f94080a);
                bundle.putString("id", aweme.getAid());
                this.f94076a.mo29066a(this.f94076a.mo69908t(), (C7562b<? super S1, ? extends R>) new C7562b<AwemeListState, C7581n>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C35924f f94077a;

                    {
                        this.f94077a = r1;
                    }

                    public final /* synthetic */ Object invoke(Object obj) {
                        m115850a((AwemeListState) obj);
                        return C7581n.f20898a;
                    }

                    /* renamed from: a */
                    private void m115850a(AwemeListState awemeListState) {
                        String str;
                        int i;
                        String str2;
                        C7573i.m23587b(awemeListState, "it");
                        if (!C36743n.m118431b(awemeListState.getProfileListType(), awemeListState.isMyProfile()) || !aweme.isDelete()) {
                            if (JediAwemeVideoViewHolder.m115839a(awemeListState.getProfileListType())) {
                                awemeListState.setLabel("collection_video");
                            }
                            Bundle bundle = bundle;
                            String str3 = "video_from";
                            if (awemeListState.isMyProfile()) {
                                str = "from_profile_self";
                            } else {
                                str = "from_profile_other";
                            }
                            bundle.putString(str3, str);
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
                            Bundle bundle2 = bundle;
                            String str4 = "from_post_list";
                            if (awemeListState.getProfileListType() == 0) {
                                i = 1;
                            } else {
                                i = 0;
                            }
                            bundle2.putInt(str4, i);
                            C0598c b = C0598c.m2487b(this.f94077a.f94076a.mo62390p(), 0, 0, this.f94077a.f94076a.mo62390p().getWidth(), this.f94077a.f94076a.mo62390p().getHeight());
                            C7573i.m23582a((Object) b, "ActivityOptionsCompat.ma…), coverView.getHeight())");
                            View view = this.f94077a.f94076a.itemView;
                            C7573i.m23582a((Object) view, "itemView");
                            Context context = view.getContext();
                            if (context != null) {
                                SmartRouter.buildRoute((Context) (Activity) context, "aweme://aweme/detail/").withParam(bundle).withBundleAnimation(b.mo2580a()).open();
                                if (JediAwemeVideoViewHolder.m115839a(awemeListState.getProfileListType())) {
                                    String str5 = "click_personal_collection";
                                    C22984d a = C22984d.m75611a().mo59973a("enter_from", "collection_video").mo59973a(C38347c.f99553h, "video");
                                    String str6 = "video_id";
                                    Aweme aweme = aweme;
                                    if (aweme != null) {
                                        str2 = aweme.getAid();
                                    } else {
                                        str2 = null;
                                    }
                                    C6907h.m21524a(str5, (Map) a.mo59973a(str6, str2).f60753a);
                                }
                                return;
                            }
                            throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
                        }
                        C36743n nVar = C36743n.f96432a;
                        Context context2 = this.f94077a.f94076a.mo62390p().getContext();
                        C7573i.m23582a((Object) context2, "coverView.context");
                        C36743n.m118428a(context2, aweme, null);
                    }
                });
                C28229b.m92772a(aweme);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.JediAwemeVideoViewHolder$g */
    static final class C35928g extends Lambda implements C7562b<AwemeState, AwemeState> {

        /* renamed from: a */
        final /* synthetic */ JediAwemeVideoViewHolder f94082a;

        C35928g(JediAwemeVideoViewHolder jediAwemeVideoViewHolder) {
            this.f94082a = jediAwemeVideoViewHolder;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public AwemeState invoke(AwemeState awemeState) {
            C7573i.m23587b(awemeState, "$receiver");
            Object o = this.f94082a.mo29309o();
            if (o != null) {
                return awemeState.copy((Aweme) o);
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.model.Aweme");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.JediAwemeVideoViewHolder$h */
    static final class C35929h extends Lambda implements C7563m<JediAwemeVideoViewHolder, Aweme, C7581n> {

        /* renamed from: a */
        public static final C35929h f94083a = new C35929h();

        C35929h() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m115854a((JediAwemeVideoViewHolder) obj, (Aweme) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private static void m115854a(final JediAwemeVideoViewHolder jediAwemeVideoViewHolder, final Aweme aweme) {
            C7573i.m23587b(jediAwemeVideoViewHolder, "$receiver");
            C7573i.m23587b(aweme, "it");
            jediAwemeVideoViewHolder.mo90883a(aweme);
            jediAwemeVideoViewHolder.mo29066a(jediAwemeVideoViewHolder.mo69908t(), (C7562b<? super S1, ? extends R>) new C7562b<AwemeListState, C7581n>() {
                public final /* synthetic */ Object invoke(Object obj) {
                    m115855a((AwemeListState) obj);
                    return C7581n.f20898a;
                }

                /* renamed from: a */
                private void m115855a(AwemeListState awemeListState) {
                    C7573i.m23587b(awemeListState, "awemeListState");
                    jediAwemeVideoViewHolder.mo90805c(awemeListState.getCurVisible());
                    AwemeAdapter.m115279a(awemeListState.getProfileListType(), awemeListState.getVisibleForFavoritesMob(), aweme);
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.JediAwemeVideoViewHolder$i */
    static final class C35931i extends Lambda implements C7562b<AwemeState, C7581n> {

        /* renamed from: a */
        final /* synthetic */ JediAwemeVideoViewHolder f94086a;

        C35931i(JediAwemeVideoViewHolder jediAwemeVideoViewHolder) {
            this.f94086a = jediAwemeVideoViewHolder;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m115856a((AwemeState) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m115856a(AwemeState awemeState) {
            C7573i.m23587b(awemeState, "it");
            this.f94086a.mo90884b(awemeState.getAweme());
        }
    }

    /* renamed from: a */
    public static boolean m115839a(int i) {
        return i == 4;
    }

    /* renamed from: t */
    public final JediAwemeListViewModel mo69908t() {
        return (JediAwemeListViewModel) this.f94063u.getValue();
    }

    public final void bA_() {
        super.bA_();
        mo29062a(mo69907s(), C35989q.f94170a, C11640h.m34110a(), C35929h.f94083a);
    }

    public final void bB_() {
        mo29066a(mo69907s(), (C7562b<? super S1, ? extends R>) new C35931i<Object,Object>(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final SmartImageView mo69905q() {
        View view = this.itemView;
        C7573i.m23582a((Object) view, "itemView");
        ((SmartImageView) view.findViewById(R.id.a4g)).setOnClickListener(new C35924f(this));
        View view2 = this.itemView;
        C7573i.m23582a((Object) view2, "itemView");
        ((SmartImageView) view2.findViewById(R.id.a4g)).setAnimationListener(this.f93885l);
        View view3 = this.itemView;
        C7573i.m23582a((Object) view3, "itemView");
        SmartImageView smartImageView = (SmartImageView) view3.findViewById(R.id.a4g);
        C7573i.m23582a((Object) smartImageView, "itemView.cover");
        return smartImageView;
    }

    /* renamed from: u */
    public final Aweme mo69909u() {
        ObjectRef objectRef = new ObjectRef();
        objectRef.element = null;
        mo29066a(mo69907s(), (C7562b<? super S1, ? extends R>) new C35923e<Object,Object>(objectRef));
        Aweme aweme = (Aweme) objectRef.element;
        if (aweme == null) {
            C7573i.m23580a();
        }
        return aweme;
    }

    /* renamed from: s */
    public final JediAwemeViewModel mo69907s() {
        C7562b gVar = new C35928g(this);
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
            jediViewModel.mo29034a(gVar);
            return (JediAwemeViewModel) jediViewModel;
        }
        throw new IllegalStateException("proxy not bound to viewHolder yet");
    }

    /* renamed from: b */
    public final void mo90884b(Aweme aweme) {
        if (aweme != null) {
            Video video = aweme.getVideo();
            if (video != null) {
                C32029b bVar = C32029b.f83787a;
                SmartImageView p = mo62390p();
                Video video2 = aweme.getVideo();
                C7573i.m23582a((Object) video2, "aweme.video");
                if (bVar.mo83005a(p, video2, "JediAwemeVideoViewHolder")) {
                    this.f93883j = true;
                } else {
                    if (video.getCover() != null) {
                        UrlModel cover = video.getCover();
                        C7573i.m23582a((Object) cover, "cover");
                        if (cover.getUrlList() != null) {
                            UrlModel cover2 = video.getCover();
                            C7573i.m23582a((Object) cover2, "cover");
                            if (cover2.getUrlList().size() != 0) {
                                UrlModel cover3 = video.getCover();
                                C7573i.m23582a((Object) cover3, "cover");
                                if (!TextUtils.isEmpty((CharSequence) cover3.getUrlList().get(0))) {
                                    C12133n.m35299a(C23400r.m76741a(video.getCover())).mo29845a("JediAwemeVideoViewHolder").mo29844a((C12128i) mo62390p()).mo29848a();
                                }
                            }
                        }
                    }
                    SmartImageView p2 = mo62390p();
                    if (p2 != null) {
                        p2.setImageResource(R.color.a5q);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo90883a(Aweme aweme) {
        int i;
        int i2;
        int i3;
        C7573i.m23587b(aweme, "aweme");
        mo29066a(mo69908t(), (C7562b<? super S1, ? extends R>) new C35920b<Object,Object>(this, aweme));
        if (!aweme.isProhibited() || !C33230ac.m107241p(aweme)) {
            DmtTextView dmtTextView = this.f94065w;
            C7573i.m23582a((Object) dmtTextView, "prohibitedInfo");
            dmtTextView.setVisibility(8);
            LinearLayout linearLayout = this.f94066x;
            C7573i.m23582a((Object) linearLayout, "videoInfoContainer");
            linearLayout.setVisibility(0);
            View view = this.f94067y;
            C7573i.m23582a((Object) view, "mask");
            if (view.getVisibility() == 0) {
                View view2 = this.f94067y;
                C7573i.m23582a((Object) view2, "mask");
                view2.setVisibility(8);
            }
        } else {
            DmtTextView dmtTextView2 = this.f94065w;
            C7573i.m23582a((Object) dmtTextView2, "prohibitedInfo");
            dmtTextView2.setVisibility(0);
            LinearLayout linearLayout2 = this.f94066x;
            C7573i.m23582a((Object) linearLayout2, "videoInfoContainer");
            linearLayout2.setVisibility(8);
            if (C6399b.m19946v()) {
                View view3 = this.f94067y;
                C7573i.m23582a((Object) view3, "mask");
                view3.setVisibility(0);
            }
        }
        IntRef intRef = new IntRef();
        intRef.element = 0;
        BooleanRef booleanRef = new BooleanRef();
        booleanRef.element = true;
        mo29066a(mo69908t(), (C7562b<? super S1, ? extends R>) new C35921c<Object,Object>(intRef, booleanRef));
        if (aweme.getIsTop() == 1 && intRef.element == 0) {
            DmtTextView dmtTextView3 = this.f94068z;
            C7573i.m23582a((Object) dmtTextView3, "tvTop");
            dmtTextView3.setVisibility(0);
        } else {
            DmtTextView dmtTextView4 = this.f94068z;
            C7573i.m23582a((Object) dmtTextView4, "tvTop");
            dmtTextView4.setVisibility(8);
        }
        CharSequence starRecommendTag = aweme.getStarRecommendTag();
        if (!TextUtils.isEmpty(starRecommendTag)) {
            FrameLayout frameLayout = this.f94051A;
            C7573i.m23582a((Object) frameLayout, "starLabelLl");
            frameLayout.setVisibility(0);
            DmtTextView dmtTextView5 = this.f94052B;
            C7573i.m23582a((Object) dmtTextView5, "starLabelTv");
            dmtTextView5.setText(starRecommendTag);
        }
        SharePrefCache inst = SharePrefCache.inst();
        C7573i.m23582a((Object) inst, "SharePrefCache.inst()");
        C22903bl isPrivateAvailable = inst.getIsPrivateAvailable();
        C7573i.m23582a((Object) isPrivateAvailable, "SharePrefCache.inst().isPrivateAvailable");
        Boolean bool = (Boolean) isPrivateAvailable.mo59877d();
        boolean z = booleanRef.element;
        int i4 = intRef.element;
        C7573i.m23582a((Object) bool, "isPrivate");
        m115838a(aweme, z, i4, bool.booleanValue());
        AwemeStatistics statistics = aweme.getStatistics();
        if (booleanRef.element && intRef.element == 0) {
            DmtTextView dmtTextView6 = this.f94055E;
            C7573i.m23582a((Object) dmtTextView6, "tvPlayCount");
            dmtTextView6.setVisibility(0);
            AwemeStatus status = aweme.getStatus();
            if (status == null || !status.isInReviewing() || C6399b.m19944t()) {
                if (statistics != null) {
                    i3 = statistics.getPlayCount();
                } else {
                    i3 = 0;
                }
                String a = C36735h.m118415a(i3);
                if (this.f94061s == null) {
                    View view4 = this.itemView;
                    C7573i.m23582a((Object) view4, "itemView");
                    this.f94061s = C0683b.m2903a(view4.getContext(), (int) R.drawable.auy);
                }
                this.f94055E.setCompoundDrawablesWithIntrinsicBounds(this.f94061s, null, null, null);
                DmtTextView dmtTextView7 = this.f94055E;
                C7573i.m23582a((Object) dmtTextView7, "tvPlayCount");
                dmtTextView7.setText(a);
                DmtTextView dmtTextView8 = this.f94055E;
                View view5 = this.itemView;
                C7573i.m23582a((Object) view5, "itemView");
                Context context = view5.getContext();
                C7573i.m23582a((Object) context, "itemView.context");
                dmtTextView8.setTextColor(context.getResources().getColor(R.color.zg));
                DmtTextView dmtTextView9 = this.f94055E;
                C7573i.m23582a((Object) dmtTextView9, "tvPlayCount");
                View view6 = this.itemView;
                C7573i.m23582a((Object) view6, "itemView");
                dmtTextView9.setContentDescription(view6.getContext().getString(R.string.d6k, new Object[]{a}));
            } else {
                if (this.f94060r == null) {
                    View view7 = this.itemView;
                    C7573i.m23582a((Object) view7, "itemView");
                    this.f94060r = C0683b.m2903a(view7.getContext(), (int) R.drawable.axp);
                }
                this.f94055E.setCompoundDrawablesWithIntrinsicBounds(this.f94060r, null, null, null);
                this.f94055E.setText(R.string.pd);
                DmtTextView dmtTextView10 = this.f94055E;
                View view8 = this.itemView;
                C7573i.m23582a((Object) view8, "itemView");
                Context context2 = view8.getContext();
                C7573i.m23582a((Object) context2, "itemView.context");
                dmtTextView10.setTextColor(context2.getResources().getColor(R.color.a5e));
                DmtTextView dmtTextView11 = this.f94055E;
                C7573i.m23582a((Object) dmtTextView11, "tvPlayCount");
                dmtTextView11.setTypeface(Typeface.DEFAULT);
                DmtTextView dmtTextView12 = this.f94055E;
                C7573i.m23582a((Object) dmtTextView12, "tvPlayCount");
                View view9 = this.itemView;
                C7573i.m23582a((Object) view9, "itemView");
                dmtTextView12.setContentDescription(view9.getContext().getString(R.string.pd));
            }
        } else if (booleanRef.element || intRef.element != 0 || !C6399b.m19944t() || C27690d.m90843a() <= 0) {
            DmtTextView dmtTextView13 = this.f94055E;
            C7573i.m23582a((Object) dmtTextView13, "tvPlayCount");
            dmtTextView13.setVisibility(0);
            if (this.f94062t == null) {
                View view10 = this.itemView;
                C7573i.m23582a((Object) view10, "itemView");
                this.f94062t = C0683b.m2903a(view10.getContext(), (int) R.drawable.aut);
            }
            this.f94055E.setCompoundDrawablesWithIntrinsicBounds(this.f94062t, null, null, null);
            if (statistics != null) {
                i = statistics.getDiggCount();
            } else {
                i = 0;
            }
            String a2 = C36735h.m118415a(i);
            DmtTextView dmtTextView14 = this.f94055E;
            C7573i.m23582a((Object) dmtTextView14, "tvPlayCount");
            dmtTextView14.setText(a2);
            DmtTextView dmtTextView15 = this.f94055E;
            C7573i.m23582a((Object) dmtTextView15, "tvPlayCount");
            View view11 = this.itemView;
            C7573i.m23582a((Object) view11, "itemView");
            dmtTextView15.setContentDescription(view11.getContext().getString(R.string.d6h, new Object[]{a2}));
            if (!C36743n.m118431b(intRef.element, booleanRef.element) || !aweme.isDelete()) {
                LinearLayout linearLayout3 = this.f94066x;
                if (linearLayout3 != null) {
                    View view12 = this.itemView;
                    C7573i.m23582a((Object) view12, "itemView");
                    linearLayout3.setBackground(C0683b.m2903a(view12.getContext(), (int) R.drawable.l0));
                }
            } else {
                LinearLayout linearLayout4 = this.f94066x;
                if (linearLayout4 != null) {
                    linearLayout4.setBackground(null);
                }
            }
        } else {
            DmtTextView dmtTextView16 = this.f94055E;
            C7573i.m23582a((Object) dmtTextView16, "tvPlayCount");
            dmtTextView16.setVisibility(0);
            View view13 = this.itemView;
            C7573i.m23582a((Object) view13, "itemView");
            this.f94055E.setCompoundDrawablesWithIntrinsicBounds(C0683b.m2903a(view13.getContext(), (int) R.drawable.auy), null, null, null);
            if (statistics != null) {
                i2 = statistics.getPlayCount();
            } else {
                i2 = 0;
            }
            String a3 = C36735h.m118415a(i2);
            DmtTextView dmtTextView17 = this.f94055E;
            C7573i.m23582a((Object) dmtTextView17, "tvPlayCount");
            dmtTextView17.setText(a3);
            DmtTextView dmtTextView18 = this.f94055E;
            C7573i.m23582a((Object) dmtTextView18, "tvPlayCount");
            View view14 = this.itemView;
            C7573i.m23582a((Object) view14, "itemView");
            dmtTextView18.setContentDescription(view14.getContext().getString(R.string.d6k, new Object[]{a3}));
        }
        if (AwemeViewHolder.m115309a(aweme, this.f94053C, this.f94054D) || (C6399b.m19946v() && C32698a.m105818a(aweme))) {
            DmtTextView dmtTextView19 = this.f94055E;
            C7573i.m23582a((Object) dmtTextView19, "tvPlayCount");
            dmtTextView19.setVisibility(8);
        }
        mo29066a(mo69908t(), (C7562b<? super S1, ? extends R>) new C35922d<Object,Object>(this, aweme));
        SmartImageView smartImageView = this.f94064v;
        C7573i.m23582a((Object) smartImageView, "cover");
        View view15 = this.itemView;
        C7573i.m23582a((Object) view15, "itemView");
        smartImageView.setContentDescription(view15.getContext().getString(R.string.d6l, new Object[]{Integer.valueOf(getPosition() + 1)}));
    }

    private JediAwemeVideoViewHolder(ViewGroup viewGroup, String str) {
        C7573i.m23587b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.tg, viewGroup, false);
        C7573i.m23582a((Object) inflate, "LayoutInflater.from(pare…tem_aweme, parent, false)");
        super(inflate);
        this.f94059p = str;
        C7584c a = C7575l.m23595a(JediAwemeListViewModel.class);
        this.f94063u = C7546e.m23569a(new JediAwemeVideoViewHolder$$special$$inlined$hostViewModel$1(this, a, a));
        View view = this.itemView;
        C7573i.m23582a((Object) view, "itemView");
        this.f94064v = (SmartImageView) view.findViewById(R.id.a4g);
        View view2 = this.itemView;
        C7573i.m23582a((Object) view2, "itemView");
        this.f94057n = (FixedRatioFrameLayout) view2.findViewById(R.id.a19);
        View view3 = this.itemView;
        C7573i.m23582a((Object) view3, "itemView");
        this.f94058o = view3.findViewById(R.id.cie);
        View view4 = this.itemView;
        C7573i.m23582a((Object) view4, "itemView");
        this.f94065w = (DmtTextView) view4.findViewById(R.id.clg);
        View view5 = this.itemView;
        C7573i.m23582a((Object) view5, "itemView");
        this.f94066x = (LinearLayout) view5.findViewById(R.id.eas);
        View view6 = this.itemView;
        C7573i.m23582a((Object) view6, "itemView");
        this.f94067y = view6.findViewById(R.id.bwy);
        View view7 = this.itemView;
        C7573i.m23582a((Object) view7, "itemView");
        this.f94068z = (DmtTextView) view7.findViewById(R.id.e3t);
        View view8 = this.itemView;
        C7573i.m23582a((Object) view8, "itemView");
        this.f94051A = (FrameLayout) view8.findViewById(R.id.d_m);
        View view9 = this.itemView;
        C7573i.m23582a((Object) view9, "itemView");
        this.f94052B = (DmtTextView) view9.findViewById(R.id.d_n);
        View view10 = this.itemView;
        C7573i.m23582a((Object) view10, "itemView");
        this.f94053C = (LinearLayout) view10.findViewById(R.id.d_g);
        View view11 = this.itemView;
        C7573i.m23582a((Object) view11, "itemView");
        this.f94054D = (DmtTextView) view11.findViewById(R.id.d_d);
        View view12 = this.itemView;
        C7573i.m23582a((Object) view12, "itemView");
        this.f94055E = (DmtTextView) view12.findViewById(R.id.dzn);
        View view13 = this.itemView;
        C7573i.m23582a((Object) view13, "itemView");
        this.f94056F = (ImageView) view13.findViewById(R.id.eaw);
    }

    public /* synthetic */ JediAwemeVideoViewHolder(ViewGroup viewGroup, String str, int i, C7571f fVar) {
        this(viewGroup, null);
    }

    /* renamed from: a */
    private final void m115838a(Aweme aweme, boolean z, int i, boolean z2) {
        if (z2 && (((z && i == 0) || C28482e.m93606a(aweme)) && aweme.getStatus() != null)) {
            AwemeStatus status = aweme.getStatus();
            C7573i.m23582a((Object) status, "aweme.status");
            if (status.getPrivateStatus() != 0) {
                ImageView imageView = this.f94056F;
                C7573i.m23582a((Object) imageView, "videoLocked");
                imageView.setVisibility(0);
                AwemeStatus status2 = aweme.getStatus();
                C7573i.m23582a((Object) status2, "aweme.status");
                if (status2.getPrivateStatus() == 1) {
                    this.f94056F.setImageResource(R.drawable.auz);
                    return;
                }
                AwemeStatus status3 = aweme.getStatus();
                C7573i.m23582a((Object) status3, "aweme.status");
                if (status3.getPrivateStatus() == 2) {
                    this.f94056F.setImageResource(R.drawable.aur);
                }
                return;
            }
        }
        ImageView imageView2 = this.f94056F;
        C7573i.m23582a((Object) imageView2, "videoLocked");
        imageView2.setVisibility(8);
    }
}

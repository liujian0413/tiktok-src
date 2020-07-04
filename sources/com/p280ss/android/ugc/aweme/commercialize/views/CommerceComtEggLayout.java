package com.p280ss.android.ugc.aweme.commercialize.views;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.FrameLayout.LayoutParams;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.facebook.drawee.backends.pipeline.C13380c;
import com.facebook.drawee.backends.pipeline.C13382e;
import com.facebook.drawee.controller.C13400c;
import com.facebook.drawee.controller.C13401d;
import com.facebook.drawee.drawable.C13421p.C13423b;
import com.facebook.drawee.generic.C13438a;
import com.facebook.drawee.generic.C13439b;
import com.facebook.drawee.p698c.C13386a;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.fresco.animation.p702a.C13460a;
import com.facebook.fresco.animation.p707c.C13480a;
import com.facebook.fresco.animation.p707c.C13485b;
import com.facebook.imagepipeline.p720g.C13648f;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.comment.list.ICommerceComtEggLayout;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25371n;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.feed.experiment.DouPlusShareGuideExperiment;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.CommentEggDataManager;
import com.p280ss.android.ugc.aweme.feed.model.ItemCommentEggData;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.splash.C41747l.C41750a;
import com.p280ss.android.ugc.aweme.util.C42880h;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.CommerceComtEggLayout */
public final class CommerceComtEggLayout extends ICommerceComtEggLayout {

    /* renamed from: c */
    public static final C25458a f67030c = new C25458a(null);

    /* renamed from: a */
    public long f67031a;

    /* renamed from: b */
    public final Runnable f67032b;

    /* renamed from: d */
    private SimpleDraweeView f67033d;

    /* renamed from: e */
    private Aweme f67034e;

    /* renamed from: f */
    private final Runnable f67035f;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.CommerceComtEggLayout$a */
    public static final class C25458a {
        private C25458a() {
        }

        public /* synthetic */ C25458a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.CommerceComtEggLayout$b */
    static final class C25459b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ CommerceComtEggLayout f67036a;

        C25459b(CommerceComtEggLayout commerceComtEggLayout) {
            this.f67036a = commerceComtEggLayout;
        }

        public final void run() {
            this.f67036a.mo62617a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.CommerceComtEggLayout$c */
    public static final class C25460c extends C13400c<C13648f> {

        /* renamed from: a */
        final /* synthetic */ CommerceComtEggLayout f67037a;

        /* renamed from: com.ss.android.ugc.aweme.commercialize.views.CommerceComtEggLayout$c$a */
        public static final class C25461a implements C13485b {

            /* renamed from: a */
            final /* synthetic */ C25460c f67038a;

            /* renamed from: a */
            public final void mo33033a(C13480a aVar) {
                C7573i.m23587b(aVar, "drawable");
            }

            /* renamed from: a */
            public final void mo33034a(C13480a aVar, int i) {
                C7573i.m23587b(aVar, "drawable");
            }

            /* renamed from: c */
            public final void mo33036c(C13480a aVar) {
                C7573i.m23587b(aVar, "drawable");
            }

            C25461a(C25460c cVar) {
                this.f67038a = cVar;
            }

            /* renamed from: b */
            public final void mo33035b(C13480a aVar) {
                C7573i.m23587b(aVar, "drawable");
                aVar.setAlpha(0);
                this.f67038a.f67037a.getHandler().removeCallbacks(this.f67038a.f67037a.f67032b);
                this.f67038a.f67037a.mo62617a();
            }
        }

        C25460c(CommerceComtEggLayout commerceComtEggLayout) {
            this.f67037a = commerceComtEggLayout;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onFinalImageSet(String str, C13648f fVar, Animatable animatable) {
            if (animatable != null) {
                try {
                    if (animatable instanceof C13480a) {
                        C13480a aVar = (C13480a) animatable;
                        aVar.mo33016a((C13460a) new C41750a(aVar.f35749a, 1));
                        aVar.mo33017a((C13485b) new C25461a(this));
                        animatable.start();
                    }
                } catch (Throwable th) {
                    StringBuilder sb = new StringBuilder("frescoOpenGifSplashError: e = ");
                    sb.append(th);
                    C42880h.m136156a(sb.toString());
                    C6921a.m21559a(th);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.CommerceComtEggLayout$d */
    static final class C25462d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ CommerceComtEggLayout f67039a;

        C25462d(CommerceComtEggLayout commerceComtEggLayout) {
            this.f67039a = commerceComtEggLayout;
        }

        public final void run() {
            this.f67039a.mo62617a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.CommerceComtEggLayout$e */
    public static final class C25463e implements OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ CommerceComtEggLayout f67040a;

        C25463e(CommerceComtEggLayout commerceComtEggLayout) {
            this.f67040a = commerceComtEggLayout;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            this.f67040a.mo62617a();
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.CommerceComtEggLayout$f */
    static final class C25464f implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CommerceComtEggLayout f67041a;

        /* renamed from: b */
        final /* synthetic */ Context f67042b;

        /* renamed from: c */
        final /* synthetic */ ItemCommentEggData f67043c;

        /* renamed from: d */
        final /* synthetic */ String f67044d;

        /* renamed from: e */
        final /* synthetic */ String f67045e;

        C25464f(CommerceComtEggLayout commerceComtEggLayout, Context context, ItemCommentEggData itemCommentEggData, String str, String str2) {
            this.f67041a = commerceComtEggLayout;
            this.f67042b = context;
            this.f67043c = itemCommentEggData;
            this.f67044d = str;
            this.f67045e = str2;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (!C25371n.m83463a(this.f67042b, this.f67043c.getOpenUrl(), false)) {
                C25371n.m83459a(this.f67042b, this.f67043c.getWebUrl(), "");
            }
            int currentTimeMillis = (int) (System.currentTimeMillis() - this.f67041a.f67031a);
            CommerceComtEggLayout commerceComtEggLayout = this.f67041a;
            String str = this.f67044d;
            String str2 = this.f67045e;
            String eggId = this.f67043c.getEggId();
            C7573i.m23582a((Object) eggId, "eggData.eggId");
            commerceComtEggLayout.mo66132a(str, currentTimeMillis, str2, eggId);
        }
    }

    public CommerceComtEggLayout(Context context) {
        this(context, null, 0, 6, null);
    }

    public CommerceComtEggLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: a */
    public final void mo62618a(String str, Aweme aweme, String str2) {
        Animatable animatable;
        C7573i.m23587b(str, "commetText");
        C7573i.m23587b(aweme, "aweme");
        C7573i.m23587b(str2, "enterFrom");
        ItemCommentEggData eggData = CommentEggDataManager.getEggData(aweme.getAid(), str);
        if (eggData != null) {
            mo62617a();
            this.f67034e = aweme;
            Context context = getContext();
            C7573i.m23582a((Object) context, "context");
            m83766a(context, eggData, str2, str);
            if (this.f67033d != null) {
                setVisibility(0);
                m83770b();
                bringToFront();
                if (TextUtils.equals(eggData.getFileType(), "gif") || TextUtils.equals(eggData.getFileType(), "webp")) {
                    SimpleDraweeView simpleDraweeView = this.f67033d;
                    if (simpleDraweeView != null) {
                        C13386a controller = simpleDraweeView.getController();
                        if (controller != null) {
                            animatable = controller.mo32721j();
                            if (animatable != null && !animatable.isRunning()) {
                                animatable.start();
                            }
                            getHandler().postDelayed(this.f67032b, DouPlusShareGuideExperiment.MIN_VALID_DURATION);
                        }
                    }
                    animatable = null;
                    animatable.start();
                    getHandler().postDelayed(this.f67032b, DouPlusShareGuideExperiment.MIN_VALID_DURATION);
                } else {
                    getHandler().postDelayed(this.f67035f, 3000);
                }
                this.f67031a = System.currentTimeMillis();
                String eggId = eggData.getEggId();
                C7573i.m23582a((Object) eggId, "eggData.eggId");
                m83768a(str2, str, eggId);
                return;
            }
            String eggId2 = eggData.getEggId();
            C7573i.m23582a((Object) eggId2, "eggData.eggId");
            m83769a(str2, "load_fail", str, eggId2);
        }
    }

    /* renamed from: b */
    private final void m83770b() {
        setOnTouchListener(new C25463e(this));
    }

    private final LayoutParams getImageLayout() {
        double measuredWidth = (double) getMeasuredWidth();
        Double.isNaN(measuredWidth);
        int i = (int) (measuredWidth * 0.64d);
        LayoutParams layoutParams = new LayoutParams(i, i);
        layoutParams.gravity = 17;
        return layoutParams;
    }

    /* renamed from: a */
    public final void mo62617a() {
        removeAllViews();
        setVisibility(4);
        this.f67031a = 0;
        this.f67034e = null;
        if (this.f67033d != null) {
            SimpleDraweeView simpleDraweeView = this.f67033d;
            if (simpleDraweeView != null) {
                simpleDraweeView.setVisibility(8);
            }
            this.f67033d = null;
        }
    }

    /* renamed from: a */
    private final C13400c<C13648f> m83764a(ItemCommentEggData itemCommentEggData) {
        return new C25460c<>(this);
    }

    /* renamed from: a */
    private final SimpleDraweeView m83765a(Context context, ItemCommentEggData itemCommentEggData) {
        SimpleDraweeView simpleDraweeView = new SimpleDraweeView(context);
        C13438a a = new C13439b(getResources()).mo32927e(C13423b.f35595c).mo32908a();
        if (TextUtils.equals(itemCommentEggData.getFileType(), "gif") || TextUtils.equals(itemCommentEggData.getFileType(), "webp")) {
            simpleDraweeView.setController(((C13382e) ((C13382e) C13380c.m39166a().mo32711a(itemCommentEggData.getMaterialUrl()).mo32743a((C13401d<? super INFO>) m83764a(itemCommentEggData))).mo32751c(true)).mo32730f());
        } else {
            simpleDraweeView.setImageURI(itemCommentEggData.getMaterialUrl());
        }
        simpleDraweeView.setLayoutParams(getImageLayout());
        simpleDraweeView.setHierarchy(a);
        return simpleDraweeView;
    }

    public CommerceComtEggLayout(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
        this.f67032b = new C25459b(this);
        this.f67035f = new C25462d(this);
    }

    /* renamed from: a */
    private final void m83768a(String str, String str2, String str3) {
        String str4;
        String str5 = "show_egg_ad";
        C22984d a = C22984d.m75611a().mo59973a("egg_ad_id", str3).mo59973a("comment_text", str2).mo59973a("scene_id", "1003").mo59973a("enter_from", str);
        String str6 = "group_id";
        Aweme aweme = this.f67034e;
        String str7 = null;
        if (aweme != null) {
            str4 = aweme.getAid();
        } else {
            str4 = null;
        }
        C22984d a2 = a.mo59973a(str6, str4);
        String str8 = "author_id";
        Aweme aweme2 = this.f67034e;
        if (aweme2 != null) {
            User author = aweme2.getAuthor();
            if (author != null) {
                str7 = author.getUid();
            }
        }
        C6907h.m21524a(str5, (Map) a2.mo59973a(str8, str7).f60753a);
    }

    /* renamed from: a */
    private final void m83766a(Context context, ItemCommentEggData itemCommentEggData, String str, String str2) {
        if (this.f67033d == null) {
            this.f67033d = m83765a(context, itemCommentEggData);
            SimpleDraweeView simpleDraweeView = this.f67033d;
            if (simpleDraweeView != null) {
                m83767a(simpleDraweeView, context, itemCommentEggData, str, str2);
                addView(this.f67033d);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.View");
        }
    }

    /* renamed from: a */
    private final void m83769a(String str, String str2, String str3, String str4) {
        String str5;
        String str6 = "show_egg_ad_fail";
        C22984d a = C22984d.m75611a().mo59973a("egg_ad_id", str4).mo59973a("comment_text", str3).mo59973a("scene_id", "1003").mo59973a("enter_from", str);
        String str7 = "group_id";
        Aweme aweme = this.f67034e;
        String str8 = null;
        if (aweme != null) {
            str5 = aweme.getAid();
        } else {
            str5 = null;
        }
        C22984d a2 = a.mo59973a(str7, str5);
        String str9 = "author_id";
        Aweme aweme2 = this.f67034e;
        if (aweme2 != null) {
            User author = aweme2.getAuthor();
            if (author != null) {
                str8 = author.getUid();
            }
        }
        C6907h.m21524a(str6, (Map) a2.mo59973a(str9, str8).mo59973a("fail_type", str2).f60753a);
    }

    /* renamed from: a */
    public final void mo66132a(String str, int i, String str2, String str3) {
        String str4;
        String str5 = "click_egg_ad";
        C22984d a = C22984d.m75611a().mo59973a("egg_ad_id", str3).mo59973a("comment_text", str2).mo59973a("scene_id", "1003").mo59973a("enter_from", str);
        String str6 = "group_id";
        Aweme aweme = this.f67034e;
        String str7 = null;
        if (aweme != null) {
            str4 = aweme.getAid();
        } else {
            str4 = null;
        }
        C22984d a2 = a.mo59973a(str6, str4);
        String str8 = "author_id";
        Aweme aweme2 = this.f67034e;
        if (aweme2 != null) {
            User author = aweme2.getAuthor();
            if (author != null) {
                str7 = author.getUid();
            }
        }
        C6907h.m21524a(str5, (Map) a2.mo59973a(str8, str7).mo59970a("duration", i).f60753a);
    }

    public /* synthetic */ CommerceComtEggLayout(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }

    /* renamed from: a */
    private final void m83767a(View view, Context context, ItemCommentEggData itemCommentEggData, String str, String str2) {
        if (view == null) {
            return;
        }
        if (!TextUtils.isEmpty(itemCommentEggData.getWebUrl()) || !TextUtils.isEmpty(itemCommentEggData.getOpenUrl())) {
            C25464f fVar = new C25464f(this, context, itemCommentEggData, str, str2);
            view.setOnClickListener(fVar);
        }
    }
}

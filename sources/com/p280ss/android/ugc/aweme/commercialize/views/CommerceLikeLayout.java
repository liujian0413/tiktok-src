package com.p280ss.android.ugc.aweme.commercialize.views;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView.ScaleType;
import bolts.C1592h;
import com.airbnb.lottie.C1757f;
import com.airbnb.lottie.C1761g;
import com.airbnb.lottie.C1783l;
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
import com.p280ss.android.agilelogger.ALog;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.AnimationImageView;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25354g;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25354g.C25356a;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.ItemLikeEggData;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.lancet.CommerceException;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.splash.C41747l.C41750a;
import com.p280ss.android.ugc.aweme.util.C42880h;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.C7581n;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.CommerceLikeLayout */
public final class CommerceLikeLayout extends FrameLayout {

    /* renamed from: d */
    public static final C25465a f67046d = new C25465a(null);

    /* renamed from: a */
    public ItemLikeEggData f67047a;

    /* renamed from: b */
    public final AtomicBoolean f67048b;

    /* renamed from: c */
    public C1757f f67049c;

    /* renamed from: e */
    private AnimationImageView f67050e;

    /* renamed from: f */
    private AnimationImageView f67051f;

    /* renamed from: g */
    private SimpleDraweeView f67052g;

    /* renamed from: h */
    private String f67053h;

    /* renamed from: i */
    private Aweme f67054i;

    /* renamed from: j */
    private long f67055j;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.CommerceLikeLayout$a */
    public static final class C25465a {
        private C25465a() {
        }

        public /* synthetic */ C25465a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.CommerceLikeLayout$b */
    public static final class C25466b extends C13400c<C13648f> {

        /* renamed from: a */
        final /* synthetic */ CommerceLikeLayout f67056a;

        /* renamed from: com.ss.android.ugc.aweme.commercialize.views.CommerceLikeLayout$b$a */
        public static final class C25467a implements C13485b {

            /* renamed from: a */
            final /* synthetic */ C25466b f67057a;

            /* renamed from: a */
            public final void mo33034a(C13480a aVar, int i) {
                C7573i.m23587b(aVar, "drawable");
            }

            /* renamed from: c */
            public final void mo33036c(C13480a aVar) {
                C7573i.m23587b(aVar, "drawable");
            }

            C25467a(C25466b bVar) {
                this.f67057a = bVar;
            }

            /* renamed from: a */
            public final void mo33033a(C13480a aVar) {
                C7573i.m23587b(aVar, "drawable");
                this.f67057a.f67056a.mo66139b();
            }

            /* renamed from: b */
            public final void mo33035b(C13480a aVar) {
                C7573i.m23587b(aVar, "drawable");
                aVar.setAlpha(0);
            }
        }

        C25466b(CommerceLikeLayout commerceLikeLayout) {
            this.f67056a = commerceLikeLayout;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onFinalImageSet(String str, C13648f fVar, Animatable animatable) {
            if (animatable != null) {
                try {
                    if (animatable instanceof C13480a) {
                        C13480a aVar = (C13480a) animatable;
                        aVar.mo33016a((C13460a) new C41750a(aVar.f35749a, 1));
                        aVar.mo33017a((C13485b) new C25467a(this));
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

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.CommerceLikeLayout$c */
    public static final class C25468c extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ AnimationImageView f67058a;

        C25468c(AnimationImageView animationImageView) {
            this.f67058a = animationImageView;
        }

        public final void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            this.f67058a.setLayerType(0, null);
            this.f67058a.setVisibility(8);
        }

        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            this.f67058a.setLayerType(0, null);
            this.f67058a.setVisibility(8);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.CommerceLikeLayout$d */
    static final class C25469d<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ CommerceLikeLayout f67059a;

        /* renamed from: b */
        final /* synthetic */ String f67060b;

        C25469d(CommerceLikeLayout commerceLikeLayout, String str) {
            this.f67059a = commerceLikeLayout;
            this.f67060b = str;
        }

        public final /* synthetic */ Object call() {
            m83798a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m83798a() {
            if (TextUtils.isEmpty(this.f67060b)) {
                this.f67059a.f67048b.set(false);
            } else if (C25354g.m83380a(Uri.parse(this.f67060b))) {
                this.f67059a.f67048b.set(true);
            } else {
                C25354g.m83379a(this.f67060b, (C25356a) new C25356a(this) {

                    /* renamed from: a */
                    final /* synthetic */ C25469d f67061a;

                    public final void onFailureImpl() {
                        this.f67061a.f67059a.f67048b.set(false);
                    }

                    public final void onNewResultImpl() {
                        this.f67061a.f67059a.f67048b.set(true);
                    }

                    {
                        this.f67061a = r1;
                    }
                });
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.CommerceLikeLayout$e */
    static final class C25471e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ CommerceLikeLayout f67062a;

        C25471e(CommerceLikeLayout commerceLikeLayout) {
            this.f67062a = commerceLikeLayout;
        }

        public final void run() {
            String str;
            try {
                StringBuilder sb = new StringBuilder("CommerceLikeLayout:setCommerceDigg url = ");
                ItemLikeEggData itemLikeEggData = this.f67062a.f67047a;
                String str2 = null;
                if (itemLikeEggData != null) {
                    str = itemLikeEggData.getMaterialUrl();
                } else {
                    str = null;
                }
                sb.append(str);
                C6921a.m21555a(sb.toString());
                Context context = this.f67062a.getContext();
                ItemLikeEggData itemLikeEggData2 = this.f67062a.f67047a;
                if (itemLikeEggData2 != null) {
                    str2 = itemLikeEggData2.getMaterialUrl();
                }
                final C1783l b = C1761g.m8403b(context, str2);
                C7573i.m23582a((Object) b, "task");
                if (b.f6425b == null && b.f6424a != null) {
                    C6726a.m20844b(new Runnable(this) {

                        /* renamed from: a */
                        final /* synthetic */ C25471e f67063a;

                        {
                            this.f67063a = r1;
                        }

                        public final void run() {
                            this.f67063a.f67062a.f67048b.set(true);
                            CommerceLikeLayout commerceLikeLayout = this.f67063a.f67062a;
                            C1783l lVar = b;
                            C7573i.m23582a((Object) lVar, "task");
                            commerceLikeLayout.f67049c = (C1757f) lVar.f6424a;
                        }
                    });
                }
            } catch (Exception e) {
                C6921a.m21559a((Throwable) new CommerceException(e));
            }
        }
    }

    public CommerceLikeLayout(Context context) {
        this(context, null, 0, 6, null);
    }

    public CommerceLikeLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final C13400c<C13648f> getControllerListener() {
        return new C25466b<>(this);
    }

    /* renamed from: c */
    private final void m83784c() {
        AnimationImageView animationImageView = this.f67050e;
        if (animationImageView != null) {
            animationImageView.mo7085f();
        }
        AnimationImageView animationImageView2 = this.f67051f;
        if (animationImageView2 != null) {
            animationImageView2.mo7085f();
        }
        this.f67050e = null;
        this.f67051f = null;
    }

    /* renamed from: d */
    private final void m83786d() {
        if (this.f67052g != null) {
            SimpleDraweeView simpleDraweeView = this.f67052g;
            if (simpleDraweeView != null) {
                simpleDraweeView.setVisibility(8);
            }
            this.f67052g = null;
        }
    }

    private final LayoutParams getImageLayout() {
        Resources resources = getResources();
        C7573i.m23582a((Object) resources, "resources");
        double d = (double) resources.getDisplayMetrics().widthPixels;
        Double.isNaN(d);
        double d2 = d * 0.64d;
        Resources resources2 = getResources();
        C7573i.m23582a((Object) resources2, "resources");
        double d3 = (double) resources2.getDisplayMetrics().heightPixels;
        Double.isNaN(d3);
        LayoutParams layoutParams = new LayoutParams((int) d2, (int) (d3 * 0.64d));
        layoutParams.gravity = 17;
        return layoutParams;
    }

    /* renamed from: b */
    public final void mo66139b() {
        String str;
        String str2 = "show_egg_ad";
        C22984d a = C22984d.m75611a().mo59973a("enter_from", this.f67053h);
        String str3 = "group_id";
        Aweme aweme = this.f67054i;
        String str4 = null;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        C22984d a2 = a.mo59973a(str3, str);
        String str5 = "author_id";
        Aweme aweme2 = this.f67054i;
        if (aweme2 != null) {
            User author = aweme2.getAuthor();
            if (author != null) {
                str4 = author.getUid();
            }
        }
        C6907h.m21524a(str2, (Map) a2.mo59973a(str5, str4).f60753a);
    }

    /* renamed from: e */
    private final void m83787e() {
        String str;
        ItemLikeEggData itemLikeEggData = this.f67047a;
        Animatable animatable = null;
        if (itemLikeEggData != null) {
            str = itemLikeEggData.getMaterialUrl();
        } else {
            str = null;
        }
        if (C23323e.m76518a(Uri.parse(str))) {
            Context context = getContext();
            C7573i.m23582a((Object) context, "context");
            m83782b(context);
            if (this.f67052g != null) {
                SimpleDraweeView simpleDraweeView = this.f67052g;
                if (simpleDraweeView != null) {
                    C13386a controller = simpleDraweeView.getController();
                    if (controller != null) {
                        animatable = controller.mo32721j();
                    }
                }
                if (animatable != null && !animatable.isRunning()) {
                    animatable.start();
                }
            }
        } else {
            m83789g();
        }
    }

    /* renamed from: g */
    private final void m83789g() {
        String str;
        String str2 = "show_egg_ad_fail";
        C22984d a = C22984d.m75611a().mo59973a("fail_type", "load_fail").mo59973a("enter_from", this.f67053h);
        String str3 = "group_id";
        Aweme aweme = this.f67054i;
        String str4 = null;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        C22984d a2 = a.mo59973a(str3, str);
        String str5 = "author_id";
        Aweme aweme2 = this.f67054i;
        if (aweme2 != null) {
            User author = aweme2.getAuthor();
            if (author != null) {
                str4 = author.getUid();
            }
        }
        C6907h.m21524a(str2, (Map) a2.mo59973a(str5, str4).f60753a);
    }

    /* renamed from: a */
    public final void mo66137a() {
        String str;
        removeAllViews();
        if (m83781a(this.f67047a)) {
            ItemLikeEggData itemLikeEggData = this.f67047a;
            if (itemLikeEggData != null) {
                str = itemLikeEggData.getFileType();
            } else {
                str = null;
            }
            if (str != null) {
                int hashCode = str.hashCode();
                if (hashCode != 102340) {
                    if (hashCode != 120609) {
                        if (hashCode == 3645340 && str.equals("webp")) {
                            m83786d();
                        }
                    } else if (str.equals("zip")) {
                        m83784c();
                    }
                } else if (str.equals("gif")) {
                    m83786d();
                }
            }
        }
        this.f67048b.set(false);
    }

    /* renamed from: f */
    private final void m83788f() {
        boolean z;
        CommerceLikeLayout commerceLikeLayout;
        if (this.f67049c != null) {
            Context context = getContext();
            C7573i.m23582a((Object) context, "context");
            m83779a(context);
            if (this.f67055j == 0 || System.currentTimeMillis() - this.f67055j > 800) {
                if (this.f67050e == null || this.f67051f == null) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    commerceLikeLayout = this;
                } else {
                    commerceLikeLayout = null;
                }
                if (commerceLikeLayout != null) {
                    AnimationImageView animationImageView = this.f67050e;
                    if (animationImageView == null) {
                        C7573i.m23580a();
                    }
                    if (!animationImageView.mo7084e()) {
                        AnimationImageView animationImageView2 = this.f67050e;
                        if (animationImageView2 != null) {
                            animationImageView2.setVisibility(0);
                        }
                        AnimationImageView animationImageView3 = this.f67050e;
                        if (animationImageView3 != null) {
                            C1757f fVar = this.f67049c;
                            if (fVar == null) {
                                C7573i.m23580a();
                            }
                            animationImageView3.setComposition(fVar);
                        }
                        AnimationImageView animationImageView4 = this.f67050e;
                        if (animationImageView4 != null) {
                            animationImageView4.mo7078b();
                        }
                        mo66139b();
                        this.f67055j = System.currentTimeMillis();
                    } else {
                        AnimationImageView animationImageView5 = this.f67051f;
                        if (animationImageView5 == null) {
                            C7573i.m23580a();
                        }
                        if (!animationImageView5.mo7084e()) {
                            AnimationImageView animationImageView6 = this.f67051f;
                            if (animationImageView6 != null) {
                                animationImageView6.setVisibility(0);
                            }
                            AnimationImageView animationImageView7 = this.f67051f;
                            if (animationImageView7 != null) {
                                C1757f fVar2 = this.f67049c;
                                if (fVar2 == null) {
                                    C7573i.m23580a();
                                }
                                animationImageView7.setComposition(fVar2);
                            }
                            AnimationImageView animationImageView8 = this.f67051f;
                            if (animationImageView8 != null) {
                                animationImageView8.mo7078b();
                            }
                            mo66139b();
                            this.f67055j = System.currentTimeMillis();
                        }
                    }
                }
            }
        } else {
            m83789g();
        }
    }

    /* renamed from: a */
    private void m83780a(String str) {
        C1592h.m7853a((Callable<TResult>) new C25469d<TResult>(this, str));
    }

    /* renamed from: a */
    private static boolean m83781a(ItemLikeEggData itemLikeEggData) {
        if (itemLikeEggData != null && !TextUtils.isEmpty(itemLikeEggData.getFileType()) && !TextUtils.isEmpty(itemLikeEggData.getMaterialUrl())) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private final void m83782b(Context context) {
        if (this.f67052g == null) {
            this.f67052g = m83783c(context);
            addView(this.f67052g);
        }
    }

    /* renamed from: d */
    private static AnimationImageView m83785d(Context context) {
        AnimationImageView animationImageView = new AnimationImageView(context);
        animationImageView.setScaleType(ScaleType.CENTER_CROP);
        animationImageView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        animationImageView.mo7076a((AnimatorListener) new C25468c(animationImageView));
        return animationImageView;
    }

    /* renamed from: a */
    private final void m83779a(Context context) {
        if (this.f67050e == null) {
            this.f67050e = m83785d(context);
            addView(this.f67050e);
        }
        if (this.f67051f == null) {
            this.f67051f = m83785d(context);
            addView(this.f67051f);
        }
    }

    /* renamed from: c */
    private final SimpleDraweeView m83783c(Context context) {
        String str;
        SimpleDraweeView simpleDraweeView = new SimpleDraweeView(context);
        C13438a a = new C13439b(getResources()).mo32927e(C13423b.f35595c).mo32908a();
        C13382e a2 = C13380c.m39166a();
        ItemLikeEggData itemLikeEggData = this.f67047a;
        if (itemLikeEggData != null) {
            str = itemLikeEggData.getMaterialUrl();
        } else {
            str = null;
        }
        simpleDraweeView.setController(((C13382e) ((C13382e) a2.mo32711a(str).mo32743a((C13401d<? super INFO>) getControllerListener())).mo32751c(true)).mo32730f());
        simpleDraweeView.setLayoutParams(getImageLayout());
        simpleDraweeView.setHierarchy(a);
        return simpleDraweeView;
    }

    public final void setCommerceDigg(Aweme aweme) {
        ItemLikeEggData itemLikeEggData;
        ItemLikeEggData itemLikeEggData2;
        String str;
        String str2 = null;
        if (aweme != null) {
            itemLikeEggData = aweme.getCommerceAdLikeDigg();
        } else {
            itemLikeEggData = null;
        }
        if (m83781a(itemLikeEggData)) {
            this.f67054i = aweme;
            if (aweme != null) {
                itemLikeEggData2 = aweme.getCommerceAdLikeDigg();
            } else {
                itemLikeEggData2 = null;
            }
            this.f67047a = itemLikeEggData2;
            ItemLikeEggData itemLikeEggData3 = this.f67047a;
            if (itemLikeEggData3 != null) {
                str = itemLikeEggData3.getFileType();
            } else {
                str = null;
            }
            if (str != null) {
                int hashCode = str.hashCode();
                if (hashCode != 102340) {
                    if (hashCode != 120609) {
                        if (hashCode == 3645340 && str.equals("webp")) {
                            ItemLikeEggData itemLikeEggData4 = this.f67047a;
                            if (itemLikeEggData4 != null) {
                                str2 = itemLikeEggData4.getMaterialUrl();
                            }
                            m83780a(str2);
                            return;
                        }
                    } else if (str.equals("zip")) {
                        C6726a.m20842a(new C25471e(this));
                        return;
                    }
                } else if (str.equals("gif")) {
                    ItemLikeEggData itemLikeEggData5 = this.f67047a;
                    if (itemLikeEggData5 != null) {
                        str2 = itemLikeEggData5.getMaterialUrl();
                    }
                    m83780a(str2);
                    return;
                }
            }
            this.f67048b.set(false);
        }
    }

    /* renamed from: a */
    public final void mo66138a(String str, String str2) {
        CharSequence charSequence;
        C7573i.m23587b(str, "enterFrom");
        if (m83781a(this.f67047a) && this.f67048b.get()) {
            Aweme aweme = this.f67054i;
            String str3 = null;
            if (aweme != null) {
                charSequence = aweme.getAid();
            } else {
                charSequence = null;
            }
            if (!TextUtils.equals(charSequence, str2)) {
                String str4 = "CommerceLikeLayout";
                StringBuilder sb = new StringBuilder("点赞视频与彩蛋所属视频不同; 点赞视频ID : ");
                sb.append(str2);
                sb.append(" 彩蛋所属视频ID : ");
                Aweme aweme2 = this.f67054i;
                if (aweme2 != null) {
                    str3 = aweme2.getAid();
                }
                sb.append(str3);
                ALog.m20871e(str4, sb.toString());
                return;
            }
            this.f67053h = str;
            ItemLikeEggData itemLikeEggData = this.f67047a;
            if (itemLikeEggData == null) {
                C7573i.m23580a();
            }
            String fileType = itemLikeEggData.getFileType();
            if (fileType != null) {
                int hashCode = fileType.hashCode();
                if (hashCode != 102340) {
                    if (hashCode != 120609) {
                        if (hashCode == 3645340 && fileType.equals("webp")) {
                            m83787e();
                        }
                    } else if (fileType.equals("zip")) {
                        m83788f();
                    }
                } else if (fileType.equals("gif")) {
                    m83787e();
                }
            }
        }
    }

    public CommerceLikeLayout(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
        this.f67048b = new AtomicBoolean(false);
    }

    public /* synthetic */ CommerceLikeLayout(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}

package com.bytedance.android.livesdk.coupon;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.commerce.coupon.C5843a;
import com.bytedance.android.livesdk.p397k.C8349c;
import com.bytedance.android.livesdk.p397k.C8362l;
import com.bytedance.android.livesdk.utils.C9051ar;
import com.bytedance.android.livesdkapi.depend.p440c.C9301a;
import com.bytedance.android.livesdkapi.depend.p440c.C9301a.C9302a;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

public final class LiveCouponView extends RelativeLayout implements OnClickListener, C9302a {

    /* renamed from: a */
    private final int f17310a;

    /* renamed from: b */
    private final int f17311b;

    /* renamed from: c */
    private final int f17312c;

    /* renamed from: d */
    private final int f17313d;

    /* renamed from: e */
    private final C9301a f17314e;

    /* renamed from: f */
    private C5882f f17315f;

    /* renamed from: g */
    private C5843a f17316g;

    /* renamed from: h */
    private RelativeLayout f17317h;

    /* renamed from: i */
    private TextView f17318i;

    /* renamed from: j */
    private TextView f17319j;

    /* renamed from: k */
    private LottieAnimationView f17320k;

    /* renamed from: l */
    private LottieAnimationView f17321l;

    /* renamed from: m */
    private C5866a f17322m;

    /* renamed from: n */
    private FrameLayout f17323n;

    /* renamed from: o */
    private ImageView f17324o;

    /* renamed from: p */
    private ImageView f17325p;

    /* renamed from: q */
    private int f17326q;

    /* renamed from: r */
    private C5871c f17327r;

    /* renamed from: s */
    private C8362l f17328s;

    /* renamed from: t */
    private String f17329t;

    /* renamed from: u */
    private ImageView f17330u;

    /* renamed from: v */
    private ImageView f17331v;

    /* renamed from: w */
    private AnimatorListener f17332w;

    /* renamed from: com.bytedance.android.livesdk.coupon.LiveCouponView$a */
    public interface C5866a {
        /* renamed from: a */
        void mo14398a();

        /* renamed from: a */
        void mo14399a(String str);

        /* renamed from: b */
        void mo14400b();
    }

    /* renamed from: com.bytedance.android.livesdk.coupon.LiveCouponView$b */
    public static final class C5867b implements AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ LiveCouponView f17333a;

        public final void onAnimationCancel(Animator animator) {
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        C5867b(LiveCouponView liveCouponView) {
            this.f17333a = liveCouponView;
        }

        public final void onAnimationEnd(Animator animator) {
            this.f17333a.mo14359b();
        }

        public final void onAnimationStart(Animator animator) {
            this.f17333a.getMDoubleCoupon().setVisibility(4);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.coupon.LiveCouponView$c */
    public static final class C5868c {

        /* renamed from: a */
        final /* synthetic */ LiveCouponView f17334a;

        C5868c(LiveCouponView liveCouponView) {
            this.f17334a = liveCouponView;
        }
    }

    public final int getBUTTON_APPLY_STATE() {
        return this.f17312c;
    }

    public final int getBUTTON_ORDER_STATE() {
        return this.f17313d;
    }

    public final ImageView getMBehindView() {
        return this.f17331v;
    }

    public final int getMButtonState() {
        return this.f17326q;
    }

    public final RelativeLayout getMCenterArea() {
        return this.f17317h;
    }

    public final ImageView getMCloseView() {
        return this.f17324o;
    }

    public final C5866a getMCouponClick() {
        return this.f17322m;
    }

    public final C5871c getMCouponMsg() {
        return this.f17327r;
    }

    public final C5882f getMCouponResourcePath() {
        return this.f17315f;
    }

    public final FrameLayout getMCouponView() {
        return this.f17323n;
    }

    public final TextView getMDescView() {
        return this.f17319j;
    }

    public final ImageView getMDoubleCoupon() {
        return this.f17325p;
    }

    public final LottieAnimationView getMDoubleCouponLottie() {
        return this.f17320k;
    }

    public final ImageView getMFrontView() {
        return this.f17330u;
    }

    public final LottieAnimationView getMHappyLottie() {
        return this.f17321l;
    }

    public final C8362l getMHideLottieEntity() {
        return this.f17328s;
    }

    public final C5843a getMLottieHelper() {
        return this.f17316g;
    }

    public final String getMMetaId() {
        return this.f17329t;
    }

    public final TextView getMTryGetButton() {
        return this.f17318i;
    }

    /* renamed from: c */
    public final void mo14360c() {
        this.f17326q = this.f17312c;
    }

    /* renamed from: e */
    private final void m18346e() {
        String str;
        if (this.f17315f != null) {
            Handler handler = this.f17314e;
            C5882f fVar = this.f17315f;
            if (fVar != null) {
                str = fVar.f17411b;
            } else {
                str = null;
            }
            C8349c.m25447a(handler, str, 5, this.f17310a);
        }
    }

    /* renamed from: b */
    public final void mo14359b() {
        String str;
        if (this.f17315f != null) {
            Handler handler = this.f17314e;
            C5882f fVar = this.f17315f;
            if (fVar != null) {
                str = fVar.f17412c;
            } else {
                str = null;
            }
            C8349c.m25447a(handler, str, 5, this.f17311b);
        }
    }

    /* renamed from: d */
    private final void m18345d() {
        this.f17323n.setVisibility(0);
        float translationY = this.f17323n.getTranslationY();
        float height = (translationY - ((float) this.f17323n.getHeight())) + C9051ar.m27035b(getContext(), 2.0f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f17323n, View.TRANSLATION_Y, new float[]{translationY, height});
        C7573i.m23582a((Object) ofFloat, "animator");
        ofFloat.setDuration(600);
        ofFloat.start();
    }

    /* renamed from: a */
    public final void mo14356a() {
        m18346e();
        float b = ((float) (C9051ar.m27036b(getContext()) / 2)) + C9051ar.m27035b(getContext(), 125.0f);
        float b2 = C9051ar.m27035b(getContext(), 30.0f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f17317h, View.TRANSLATION_Y, new float[]{-b, 0.0f});
        C7573i.m23582a((Object) ofFloat, "animatora");
        ofFloat.setInterpolator(new AccelerateInterpolator());
        ofFloat.setDuration(300);
        float f = -b2;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f17317h, View.TRANSLATION_Y, new float[]{0.0f, f});
        C7573i.m23582a((Object) ofFloat2, "animatorb");
        ofFloat2.setInterpolator(new DecelerateInterpolator());
        ofFloat2.setDuration(120);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f17317h, View.TRANSLATION_Y, new float[]{f, 0.0f});
        C7573i.m23582a((Object) ofFloat3, "animatorc");
        ofFloat3.setInterpolator(new AccelerateInterpolator());
        ofFloat3.setDuration(120);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(new Animator[]{ofFloat, ofFloat2, ofFloat3});
        animatorSet.start();
    }

    public final void setMButtonState(int i) {
        this.f17326q = i;
    }

    public final void setMCouponClick(C5866a aVar) {
        this.f17322m = aVar;
    }

    public final void setMCouponMsg(C5871c cVar) {
        this.f17327r = cVar;
    }

    public final void setMCouponResourcePath(C5882f fVar) {
        this.f17315f = fVar;
    }

    public final void setMHideLottieEntity(C8362l lVar) {
        this.f17328s = lVar;
    }

    public final void setMLottieHelper(C5843a aVar) {
        this.f17316g = aVar;
    }

    public final void setMMetaId(String str) {
        this.f17329t = str;
    }

    public final void setMBehindView(ImageView imageView) {
        C7573i.m23587b(imageView, "<set-?>");
        this.f17331v = imageView;
    }

    public final void setMCenterArea(RelativeLayout relativeLayout) {
        C7573i.m23587b(relativeLayout, "<set-?>");
        this.f17317h = relativeLayout;
    }

    public final void setMCloseView(ImageView imageView) {
        C7573i.m23587b(imageView, "<set-?>");
        this.f17324o = imageView;
    }

    public final void setMCouponView(FrameLayout frameLayout) {
        C7573i.m23587b(frameLayout, "<set-?>");
        this.f17323n = frameLayout;
    }

    public final void setMDescView(TextView textView) {
        C7573i.m23587b(textView, "<set-?>");
        this.f17319j = textView;
    }

    public final void setMDoubleCoupon(ImageView imageView) {
        C7573i.m23587b(imageView, "<set-?>");
        this.f17325p = imageView;
    }

    public final void setMDoubleCouponLottie(LottieAnimationView lottieAnimationView) {
        C7573i.m23587b(lottieAnimationView, "<set-?>");
        this.f17320k = lottieAnimationView;
    }

    public final void setMFrontView(ImageView imageView) {
        C7573i.m23587b(imageView, "<set-?>");
        this.f17330u = imageView;
    }

    public final void setMHappyLottie(LottieAnimationView lottieAnimationView) {
        C7573i.m23587b(lottieAnimationView, "<set-?>");
        this.f17321l = lottieAnimationView;
    }

    public final void setMTryGetButton(TextView textView) {
        C7573i.m23587b(textView, "<set-?>");
        this.f17318i = textView;
    }

    /* renamed from: c */
    private final void m18344c(C8362l lVar) {
        if (lVar != null && lVar.f22919a == 5) {
            m18345d();
            C5843a aVar = this.f17316g;
            if (aVar != null) {
                aVar.mo14349a(lVar, this.f17321l, true);
            }
        }
    }

    /* renamed from: a */
    private final void m18342a(C8362l lVar) {
        if (lVar != null && lVar.f22919a == 5) {
            this.f17328s = lVar;
            this.f17320k.mo7085f();
            this.f17320k.setProgress(0.0f);
            this.f17320k.setVisibility(0);
            this.f17325p.setVisibility(8);
            C5843a aVar = this.f17316g;
            if (aVar != null) {
                aVar.mo14349a(lVar, this.f17320k, false);
            }
        }
    }

    /* renamed from: b */
    private final void m18343b(C8362l lVar) {
        if (lVar != null && lVar.f22919a == 5) {
            this.f17320k.mo7079b(this.f17332w);
            this.f17320k.mo7076a(this.f17332w);
            C5843a aVar = this.f17316g;
            if (aVar != null) {
                aVar.mo14349a(lVar, this.f17320k, true);
            }
        }
    }

    /* renamed from: a */
    public final void mo12403a(Message message) {
        Integer num;
        Object obj = null;
        if (message != null) {
            num = Integer.valueOf(message.what);
        } else {
            num = null;
        }
        if (message != null) {
            obj = message.obj;
        }
        int i = this.f17310a;
        if (num == null || num.intValue() != i) {
            int i2 = this.f17311b;
            if (num != null && num.intValue() == i2 && (obj instanceof C8362l)) {
                m18344c((C8362l) obj);
            }
        } else if (obj instanceof C8362l) {
            m18342a((C8362l) obj);
        }
    }

    public final void onClick(View view) {
        if (view == null || view.getId() != R.id.dnp) {
            if (view != null && view.getId() == R.id.xr) {
                C5866a aVar = this.f17322m;
                if (aVar != null) {
                    aVar.mo14398a();
                }
            }
        } else if (this.f17326q == this.f17312c) {
            this.f17326q = this.f17313d;
            C5866a aVar2 = this.f17322m;
            if (aVar2 != null) {
                aVar2.mo14399a(this.f17329t);
            }
        } else {
            if (this.f17326q == this.f17313d && this.f17327r != null) {
                if (TTLiveSDKContext.getHostService().mo22369j() != null) {
                    getContext();
                    new C5868c(this);
                }
                C5866a aVar3 = this.f17322m;
                if (aVar3 != null) {
                    aVar3.mo14400b();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo14357a(C5871c cVar) {
        String str;
        if (cVar != null) {
            this.f17327r = cVar;
            this.f17326q = this.f17313d;
            this.f17319j.setText(C3358ac.m12515a((int) R.string.etj));
            this.f17318i.setText(C3358ac.m12515a((int) R.string.f54));
            C5884g gVar = new C5884g(cVar.f17364m, this.f17323n);
            ImageView imageView = gVar.f17417a;
            if (imageView != null) {
                C5882f fVar = this.f17315f;
                if (fVar != null) {
                    str = fVar.f17416g;
                } else {
                    str = null;
                }
                imageView.setImageURI(Uri.parse(str));
            }
            gVar.mo14417a(cVar);
            m18343b(this.f17328s);
        }
    }

    /* renamed from: a */
    public final void mo14358a(C5882f fVar) {
        this.f17315f = fVar;
        try {
            C5882f fVar2 = this.f17315f;
            if (fVar2 != null) {
                this.f17331v.setImageURI(Uri.parse(fVar2.f17414e));
                this.f17330u.setImageURI(Uri.parse(fVar2.f17413d));
                this.f17325p.setImageURI(Uri.parse(fVar2.f17415f));
            }
        } catch (Exception unused) {
        }
    }

    public LiveCouponView(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
        this.f17310a = C34943c.f91127w;
        this.f17311b = C34943c.f91128x;
        this.f17313d = 1;
        this.f17314e = new C9301a(Looper.getMainLooper(), this);
        this.f17326q = this.f17312c;
        LayoutInflater.from(context).inflate(R.layout.am_, this);
        View findViewById = findViewById(R.id.tz);
        C7573i.m23582a((Object) findViewById, "findViewById(R.id.center_area)");
        this.f17317h = (RelativeLayout) findViewById;
        View findViewById2 = findViewById(R.id.dnp);
        C7573i.m23582a((Object) findViewById2, "findViewById(R.id.try_get_coupon)");
        this.f17318i = (TextView) findViewById2;
        View findViewById3 = findViewById(R.id.a7l);
        C7573i.m23582a((Object) findViewById3, "findViewById(R.id.desc_view)");
        this.f17319j = (TextView) findViewById3;
        View findViewById4 = findViewById(R.id.aa3);
        C7573i.m23582a((Object) findViewById4, "findViewById(R.id.double_coupon_lottie)");
        this.f17320k = (LottieAnimationView) findViewById4;
        View findViewById5 = findViewById(R.id.au0);
        C7573i.m23582a((Object) findViewById5, "findViewById(R.id.happy_lottie)");
        this.f17321l = (LottieAnimationView) findViewById5;
        View findViewById6 = findViewById(R.id.coi);
        C7573i.m23582a((Object) findViewById6, "findViewById(R.id.real_coupon_container)");
        this.f17323n = (FrameLayout) findViewById6;
        View findViewById7 = findViewById(R.id.xr);
        C7573i.m23582a((Object) findViewById7, "findViewById(R.id.close_view)");
        this.f17324o = (ImageView) findViewById7;
        View findViewById8 = findViewById(R.id.aa2);
        C7573i.m23582a((Object) findViewById8, "findViewById(R.id.double_coupon)");
        this.f17325p = (ImageView) findViewById8;
        View findViewById9 = findViewById(R.id.l6);
        C7573i.m23582a((Object) findViewById9, "findViewById(R.id.behind_view)");
        this.f17331v = (ImageView) findViewById9;
        View findViewById10 = findViewById(R.id.apl);
        C7573i.m23582a((Object) findViewById10, "findViewById(R.id.front_view)");
        this.f17330u = (ImageView) findViewById10;
        this.f17318i.setTextColor(C3358ac.m12521b((int) R.color.ark));
        OnClickListener onClickListener = this;
        this.f17318i.setOnClickListener(onClickListener);
        this.f17324o.setOnClickListener(onClickListener);
        this.f17332w = new C5867b(this);
    }

    public /* synthetic */ LiveCouponView(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        this(context, null, 0);
    }
}

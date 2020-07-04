package com.p280ss.android.ugc.aweme.themechange.base;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap.Config;
import android.graphics.Color;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.support.p022v4.view.C0991u;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.facebook.drawee.drawable.C13421p.C13423b;
import com.facebook.drawee.generic.C13438a;
import com.facebook.drawee.generic.C13439b;
import com.facebook.drawee.generic.RoundingParams;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.shortvideo.C38501ax;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.StickerImageView;
import com.p280ss.android.ugc.aweme.tools.avdmtview.R$styleable;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.themechange.base.AVDmtImageTextView */
public final class AVDmtImageTextView extends FrameLayout {

    /* renamed from: I */
    private static final int f109537I = C42111b.m134053b();

    /* renamed from: J */
    private static final int f109538J = C42111b.m134048a();

    /* renamed from: K */
    private static final int f109539K = Color.parseColor("#80000000");

    /* renamed from: a */
    public static final C42106a f109540a = new C42106a(null);

    /* renamed from: A */
    private int f109541A;

    /* renamed from: B */
    private Drawable f109542B;

    /* renamed from: C */
    private Drawable f109543C;

    /* renamed from: D */
    private boolean f109544D;

    /* renamed from: E */
    private boolean f109545E;

    /* renamed from: F */
    private int f109546F;

    /* renamed from: G */
    private int f109547G;

    /* renamed from: H */
    private LinearLayout f109548H;

    /* renamed from: b */
    private StickerImageView f109549b;

    /* renamed from: c */
    private AVDmtTextView f109550c;

    /* renamed from: d */
    private LinearLayout f109551d;

    /* renamed from: e */
    private ImageView f109552e;

    /* renamed from: f */
    private View f109553f;

    /* renamed from: g */
    private View f109554g;

    /* renamed from: h */
    private FrameLayout f109555h;

    /* renamed from: i */
    private ImageView f109556i;

    /* renamed from: j */
    private int f109557j;

    /* renamed from: k */
    private int f109558k;

    /* renamed from: l */
    private boolean f109559l;

    /* renamed from: m */
    private int f109560m;

    /* renamed from: n */
    private boolean f109561n;

    /* renamed from: o */
    private boolean f109562o;

    /* renamed from: p */
    private boolean f109563p;

    /* renamed from: q */
    private boolean f109564q;

    /* renamed from: r */
    private int f109565r;

    /* renamed from: s */
    private boolean f109566s;

    /* renamed from: t */
    private boolean f109567t;

    /* renamed from: u */
    private boolean f109568u;

    /* renamed from: v */
    private Animation f109569v;

    /* renamed from: w */
    private boolean f109570w;

    /* renamed from: x */
    private boolean f109571x;

    /* renamed from: y */
    private Drawable f109572y;

    /* renamed from: z */
    private String f109573z;

    /* renamed from: com.ss.android.ugc.aweme.themechange.base.AVDmtImageTextView$a */
    public static final class C42106a {
        private C42106a() {
        }

        public /* synthetic */ C42106a(C7571f fVar) {
            this();
        }
    }

    public AVDmtImageTextView(Context context) {
        this(context, null, 0, 6, null);
    }

    public AVDmtImageTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: a */
    public final boolean mo103504a() {
        View view = this.f109554g;
        if (view == null) {
            C7573i.m23583a("dotView");
        }
        return view.getVisibility() == 0;
    }

    /* renamed from: a */
    public final void mo103501a(boolean z) {
        if (this.f109562o) {
            AVDmtTextView aVDmtTextView = this.f109550c;
            if (aVDmtTextView == null) {
                C7573i.m23583a("dmtTextView");
            }
            aVDmtTextView.mo103532a(z);
            AVDmtTextView aVDmtTextView2 = this.f109550c;
            if (aVDmtTextView2 == null) {
                C7573i.m23583a("dmtTextView");
            }
            aVDmtTextView2.setSelected(z);
        }
        if (this.f109561n) {
            View view = this.f109553f;
            if (view == null) {
                C7573i.m23583a("borderView");
            }
            view.setVisibility(z ? 0 : 8);
        }
        if (!z || !this.f109544D) {
            AVDmtTextView aVDmtTextView3 = this.f109550c;
            if (aVDmtTextView3 == null) {
                C7573i.m23583a("dmtTextView");
            }
            aVDmtTextView3.setEllipsize(null);
            return;
        }
        AVDmtTextView aVDmtTextView4 = this.f109550c;
        if (aVDmtTextView4 == null) {
            C7573i.m23583a("dmtTextView");
        }
        aVDmtTextView4.setEllipsize(TruncateAt.MARQUEE);
    }

    /* renamed from: a */
    public final void mo103499a(String str) {
        if (!TextUtils.isEmpty(str)) {
            StickerImageView stickerImageView = this.f109549b;
            if (stickerImageView == null) {
                C7573i.m23583a("imageView");
            }
            stickerImageView.mo100254a(str);
        }
    }

    /* renamed from: a */
    public final void mo103498a(UrlModel urlModel) {
        if (urlModel != null) {
            StickerImageView stickerImageView = this.f109549b;
            if (stickerImageView == null) {
                C7573i.m23583a("imageView");
            }
            stickerImageView.mo100253a(urlModel);
        }
    }

    /* renamed from: a */
    public final void mo103500a(String str, Config config) {
        C7573i.m23587b(str, "url");
        if (!TextUtils.isEmpty(str) && config != null) {
            StickerImageView stickerImageView = this.f109549b;
            if (stickerImageView == null) {
                C7573i.m23583a("imageView");
            }
            stickerImageView.mo100255a(str, config);
        }
    }

    /* renamed from: a */
    public final void mo103503a(boolean z, boolean z2) {
        StickerImageView stickerImageView = this.f109549b;
        if (stickerImageView == null) {
            C7573i.m23583a("imageView");
        }
        stickerImageView.mo100257a(true, false);
    }

    /* renamed from: a */
    public final void mo103502a(boolean z, int i) {
        ImageView imageView = this.f109552e;
        if (imageView == null) {
            C7573i.m23583a("loadingImageView");
        }
        LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.gravity = 8388693;
            layoutParams2.rightMargin = (int) C9738o.m28708b(getContext(), 4.0f);
            layoutParams2.bottomMargin = (int) C9738o.m28708b(getContext(), 4.0f);
            layoutParams2.topMargin = (int) C9738o.m28708b(getContext(), 4.0f);
            layoutParams2.leftMargin = (int) C9738o.m28708b(getContext(), 4.0f);
            if (z) {
                ImageView imageView2 = this.f109552e;
                if (imageView2 == null) {
                    C7573i.m23583a("loadingImageView");
                }
                if (imageView2.getVisibility() != 0) {
                    ImageView imageView3 = this.f109552e;
                    if (imageView3 == null) {
                        C7573i.m23583a("loadingImageView");
                    }
                    imageView3.clearAnimation();
                    ImageView imageView4 = this.f109552e;
                    if (imageView4 == null) {
                        C7573i.m23583a("loadingImageView");
                    }
                    imageView4.setVisibility(0);
                    ImageView imageView5 = this.f109552e;
                    if (imageView5 == null) {
                        C7573i.m23583a("loadingImageView");
                    }
                    imageView5.startAnimation(this.f109569v);
                    return;
                }
            }
            ImageView imageView6 = this.f109552e;
            if (imageView6 == null) {
                C7573i.m23583a("loadingImageView");
            }
            imageView6.setVisibility(8);
            ImageView imageView7 = this.f109552e;
            if (imageView7 == null) {
                C7573i.m23583a("loadingImageView");
            }
            imageView7.clearAnimation();
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
    }

    /* renamed from: c */
    public final void mo103507c() {
        StickerImageView stickerImageView = this.f109549b;
        if (stickerImageView == null) {
            C7573i.m23583a("imageView");
        }
        stickerImageView.setBackground(this.f109543C);
    }

    /* renamed from: d */
    public final void mo103509d() {
        StickerImageView stickerImageView = this.f109549b;
        if (stickerImageView == null) {
            C7573i.m23583a("imageView");
        }
        stickerImageView.mo100249a();
    }

    /* renamed from: e */
    public final void mo103511e() {
        StickerImageView stickerImageView = this.f109549b;
        if (stickerImageView == null) {
            C7573i.m23583a("imageView");
        }
        stickerImageView.mo100258b();
    }

    /* renamed from: f */
    public final void mo103513f() {
        StickerImageView stickerImageView = this.f109549b;
        if (stickerImageView == null) {
            C7573i.m23583a("imageView");
        }
        stickerImageView.mo100260c();
    }

    private final int getPlaceHolderImgDrawableColor() {
        if (this.f109567t) {
            return f109539K;
        }
        if (C42111b.m134057j()) {
            return f109538J;
        }
        if (!C6399b.m19946v() || this.f109566s) {
            return f109538J;
        }
        return f109537I;
    }

    /* renamed from: b */
    public final void mo103505b() {
        this.f109544D = true;
        AVDmtTextView aVDmtTextView = this.f109550c;
        if (aVDmtTextView == null) {
            C7573i.m23583a("dmtTextView");
        }
        aVDmtTextView.setSingleLine();
        AVDmtTextView aVDmtTextView2 = this.f109550c;
        if (aVDmtTextView2 == null) {
            C7573i.m23583a("dmtTextView");
        }
        aVDmtTextView2.setHorizontalFadingEdgeEnabled(true);
        AVDmtTextView aVDmtTextView3 = this.f109550c;
        if (aVDmtTextView3 == null) {
            C7573i.m23583a("dmtTextView");
        }
        aVDmtTextView3.setFadingEdgeLength((int) C9738o.m28708b(getContext(), 4.0f));
    }

    /* renamed from: g */
    private final void m133992g() {
        Drawable drawable;
        int i;
        int i2;
        RoundingParams roundingParams = new RoundingParams();
        C13438a a = new C13439b(getResources()).mo32908a();
        int placeHolderImgDrawableColor = getPlaceHolderImgDrawableColor();
        int color = getResources().getColor(R.color.a76);
        if (this.f109559l) {
            roundingParams.mo32884a(true);
            C7573i.m23582a((Object) a, "hierarchy");
            a.mo32897a(roundingParams);
            drawable = C38501ax.m123065a(color, 0, this.f109565r);
            C7573i.m23582a((Object) drawable, "DmtDesignDrawableFactory…TRANSPARENT, borderWidth)");
            if (this.f109542B == null) {
                this.f109542B = C38501ax.m123065a(placeHolderImgDrawableColor, placeHolderImgDrawableColor, 0);
            }
            this.f109543C = C38501ax.m123065a(placeHolderImgDrawableColor, placeHolderImgDrawableColor, 0);
        } else {
            roundingParams.mo32884a(false);
            roundingParams.mo32879a((float) this.f109560m);
            if (this.f109567t) {
                i2 = this.f109560m + this.f109565r;
            } else {
                i2 = this.f109560m;
            }
            drawable = C38501ax.m123066a(color, 0, this.f109565r, i2);
            C7573i.m23582a((Object) drawable, "DmtDesignDrawableFactory…orderWidth, borderRadius)");
            if (this.f109542B == null) {
                this.f109542B = C38501ax.m123066a(placeHolderImgDrawableColor, placeHolderImgDrawableColor, 0, this.f109560m);
            }
            this.f109543C = C38501ax.m123066a(placeHolderImgDrawableColor, placeHolderImgDrawableColor, 0, this.f109560m);
        }
        C7573i.m23582a((Object) a, "hierarchy");
        a.mo32897a(roundingParams);
        a.mo32900b(this.f109542B);
        a.mo32904c(this.f109542B);
        StickerImageView stickerImageView = this.f109549b;
        if (stickerImageView == null) {
            C7573i.m23583a("imageView");
        }
        stickerImageView.setImageHierarchy(a);
        StickerImageView stickerImageView2 = this.f109549b;
        if (stickerImageView2 == null) {
            C7573i.m23583a("imageView");
        }
        stickerImageView2.mo100259b(this.f109570w);
        StickerImageView stickerImageView3 = this.f109549b;
        if (stickerImageView3 == null) {
            C7573i.m23583a("imageView");
        }
        stickerImageView3.setPadding(this.f109541A, this.f109541A, this.f109541A, this.f109541A);
        if (this.f109545E) {
            StickerImageView stickerImageView4 = this.f109549b;
            if (stickerImageView4 == null) {
                C7573i.m23583a("imageView");
            }
            stickerImageView4.setBackground(this.f109543C);
        }
        View view = this.f109553f;
        if (view == null) {
            C7573i.m23583a("borderView");
        }
        view.setBackground(drawable);
        View view2 = this.f109553f;
        if (view2 == null) {
            C7573i.m23583a("borderView");
        }
        int i3 = 8;
        view2.setVisibility(8);
        ImageView imageView = this.f109552e;
        if (imageView == null) {
            C7573i.m23583a("loadingImageView");
        }
        imageView.setVisibility(8);
        LinearLayout linearLayout = this.f109551d;
        if (linearLayout == null) {
            C7573i.m23583a("textLayout");
        }
        if (this.f109562o) {
            i = 0;
        } else {
            i = 8;
        }
        linearLayout.setVisibility(i);
        AVDmtTextView aVDmtTextView = this.f109550c;
        if (aVDmtTextView == null) {
            C7573i.m23583a("dmtTextView");
        }
        if (this.f109562o) {
            i3 = 0;
        }
        aVDmtTextView.setVisibility(i3);
        if (this.f109544D) {
            mo103505b();
        }
        AVDmtTextView aVDmtTextView2 = this.f109550c;
        if (aVDmtTextView2 == null) {
            C7573i.m23583a("dmtTextView");
        }
        aVDmtTextView2.mo1061a();
        AVDmtTextView aVDmtTextView3 = this.f109550c;
        if (aVDmtTextView3 == null) {
            C7573i.m23583a("dmtTextView");
        }
        aVDmtTextView3.setOldPanelStyle(this.f109566s);
        Drawable a2 = C38501ax.m123065a(color, color, this.f109565r);
        View view3 = this.f109554g;
        if (view3 == null) {
            C7573i.m23583a("dotView");
        }
        view3.setBackground(a2);
        mo103510d(false);
        if (this.f109572y != null) {
            this.f109572y = C42111b.f109618a.mo103545a(this.f109572y, this.f109566s);
            StickerImageView stickerImageView5 = this.f109549b;
            if (stickerImageView5 == null) {
                C7573i.m23583a("imageView");
            }
            stickerImageView5.setIconImageViewScaleType(C13423b.f35599g);
            StickerImageView stickerImageView6 = this.f109549b;
            if (stickerImageView6 == null) {
                C7573i.m23583a("imageView");
            }
            stickerImageView6.mo100252a(this.f109572y);
            StickerImageView stickerImageView7 = this.f109549b;
            if (stickerImageView7 == null) {
                C7573i.m23583a("imageView");
            }
            stickerImageView7.setBackground(this.f109543C);
        }
        if (!TextUtils.isEmpty(this.f109573z)) {
            setText(this.f109573z);
        }
        mo103512e(this.f109563p);
    }

    /* renamed from: a */
    private static boolean m133990a(View view) {
        if (view != null && C0991u.m4220h(view) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final void mo103506b(boolean z) {
        StickerImageView stickerImageView = this.f109549b;
        if (stickerImageView == null) {
            C7573i.m23583a("imageView");
        }
        stickerImageView.mo100256a(z);
    }

    public final void setShowDownloadIcon(boolean z) {
        StickerImageView stickerImageView = this.f109549b;
        if (stickerImageView == null) {
            C7573i.m23583a("imageView");
        }
        stickerImageView.setShowDownloadIcon(z);
    }

    public final void setShowDownloadStateIcon(boolean z) {
        StickerImageView stickerImageView = this.f109549b;
        if (stickerImageView == null) {
            C7573i.m23583a("imageView");
        }
        stickerImageView.mo100259b(z);
    }

    /* renamed from: a */
    public final void mo103493a(float f) {
        StickerImageView stickerImageView = this.f109549b;
        if (stickerImageView == null) {
            C7573i.m23583a("imageView");
        }
        stickerImageView.setAlpha(f);
    }

    /* renamed from: d */
    public final void mo103510d(boolean z) {
        int i;
        View view = this.f109554g;
        if (view == null) {
            C7573i.m23583a("dotView");
        }
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
    }

    /* renamed from: e */
    public final void mo103512e(boolean z) {
        int i;
        FrameLayout frameLayout = this.f109555h;
        if (frameLayout == null) {
            C7573i.m23583a("bottomDotLayout");
        }
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        frameLayout.setVisibility(i);
    }

    public final void setEnableUI(boolean z) {
        StickerImageView stickerImageView = this.f109549b;
        if (stickerImageView == null) {
            C7573i.m23583a("imageView");
        }
        stickerImageView.setEnableUI(z);
        AVDmtTextView aVDmtTextView = this.f109550c;
        if (aVDmtTextView == null) {
            C7573i.m23583a("dmtTextView");
        }
        aVDmtTextView.setEnableUI(z);
        m133991f(z);
    }

    /* renamed from: f */
    private final void m133991f(boolean z) {
        if (z) {
            ImageView imageView = this.f109556i;
            if (imageView == null) {
                C7573i.m23583a("bottomDotView");
            }
            imageView.clearColorFilter();
            return;
        }
        ImageView imageView2 = this.f109556i;
        if (imageView2 == null) {
            C7573i.m23583a("bottomDotView");
        }
        imageView2.setColorFilter(R.color.dp, Mode.DST_IN);
    }

    /* renamed from: a */
    public final void mo103494a(int i) {
        StickerImageView stickerImageView = this.f109549b;
        if (stickerImageView == null) {
            C7573i.m23583a("imageView");
        }
        stickerImageView.mo100250a(i);
    }

    /* renamed from: c */
    public final void mo103508c(boolean z) {
        if (z) {
            ImageView imageView = this.f109552e;
            if (imageView == null) {
                C7573i.m23583a("loadingImageView");
            }
            imageView.clearAnimation();
            ImageView imageView2 = this.f109552e;
            if (imageView2 == null) {
                C7573i.m23583a("loadingImageView");
            }
            imageView2.setVisibility(0);
            ImageView imageView3 = this.f109552e;
            if (imageView3 == null) {
                C7573i.m23583a("loadingImageView");
            }
            imageView3.startAnimation(this.f109569v);
            return;
        }
        ImageView imageView4 = this.f109552e;
        if (imageView4 == null) {
            C7573i.m23583a("loadingImageView");
        }
        imageView4.setVisibility(8);
        ImageView imageView5 = this.f109552e;
        if (imageView5 == null) {
            C7573i.m23583a("loadingImageView");
        }
        imageView5.clearAnimation();
    }

    public final void setText(String str) {
        int i;
        CharSequence charSequence = str;
        if (!TextUtils.isEmpty(charSequence)) {
            AVDmtTextView aVDmtTextView = this.f109550c;
            if (aVDmtTextView == null) {
                C7573i.m23583a("dmtTextView");
            }
            int measureText = (int) aVDmtTextView.getPaint().measureText(str);
            if (this.f109564q) {
                i = (int) C42109a.f109609b.mo103540c();
            } else {
                i = this.f109557j;
            }
            if (measureText <= i) {
                AVDmtTextView aVDmtTextView2 = this.f109550c;
                if (aVDmtTextView2 == null) {
                    C7573i.m23583a("dmtTextView");
                }
                aVDmtTextView2.setGravity(17);
            } else if (this.f109544D) {
                AVDmtTextView aVDmtTextView3 = this.f109550c;
                if (aVDmtTextView3 == null) {
                    C7573i.m23583a("dmtTextView");
                }
                aVDmtTextView3.setGravity(8388611);
            } else {
                AVDmtTextView aVDmtTextView4 = this.f109550c;
                if (aVDmtTextView4 == null) {
                    C7573i.m23583a("dmtTextView");
                }
                aVDmtTextView4.setGravity(17);
            }
            LinearLayout linearLayout = this.f109551d;
            if (linearLayout == null) {
                C7573i.m23583a("textLayout");
            }
            linearLayout.setVisibility(0);
            AVDmtTextView aVDmtTextView5 = this.f109550c;
            if (aVDmtTextView5 == null) {
                C7573i.m23583a("dmtTextView");
            }
            aVDmtTextView5.setVisibility(0);
            AVDmtTextView aVDmtTextView6 = this.f109550c;
            if (aVDmtTextView6 == null) {
                C7573i.m23583a("dmtTextView");
            }
            aVDmtTextView6.setText(charSequence);
        }
    }

    /* renamed from: a */
    public final void mo103496a(Drawable drawable) {
        if (drawable != null) {
            StickerImageView stickerImageView = this.f109549b;
            if (stickerImageView == null) {
                C7573i.m23583a("imageView");
            }
            stickerImageView.mo100252a(drawable);
        }
    }

    /* renamed from: a */
    private final void m133988a(Context context) {
        int i;
        int i2;
        LinearLayout.LayoutParams layoutParams;
        this.f109548H = new LinearLayout(context);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        LinearLayout linearLayout = this.f109548H;
        if (linearLayout == null) {
            C7573i.m23583a("rootViewLayout");
        }
        linearLayout.setLayoutParams(layoutParams2);
        LinearLayout linearLayout2 = this.f109548H;
        if (linearLayout2 == null) {
            C7573i.m23583a("rootViewLayout");
        }
        linearLayout2.setOrientation(1);
        Context context2 = context;
        StickerImageView stickerImageView = new StickerImageView(context2, null, this.f109567t, this.f109568u, this.f109564q);
        this.f109549b = stickerImageView;
        AVDmtTextView aVDmtTextView = new AVDmtTextView(context2, null, 0, 6, null);
        this.f109550c = aVDmtTextView;
        this.f109553f = new View(context);
        FrameLayout frameLayout = new FrameLayout(context);
        if (this.f109561n) {
            i2 = (this.f109565r * 2) + this.f109557j;
            i = (this.f109565r * 2) + this.f109558k;
        } else {
            i2 = this.f109557j;
            i = this.f109558k;
        }
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(i2, i);
        layoutParams3.gravity = 1;
        frameLayout.setLayoutParams(layoutParams3);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(this.f109557j, this.f109558k);
        layoutParams4.gravity = 17;
        StickerImageView stickerImageView2 = this.f109549b;
        if (stickerImageView2 == null) {
            C7573i.m23583a("imageView");
        }
        stickerImageView2.setLayoutParams(layoutParams4);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(i2, i);
        View view = this.f109553f;
        if (view == null) {
            C7573i.m23583a("borderView");
        }
        view.setLayoutParams(layoutParams5);
        this.f109552e = new ImageView(context);
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams6.gravity = 17;
        ImageView imageView = this.f109552e;
        if (imageView == null) {
            C7573i.m23583a("loadingImageView");
        }
        imageView.setImageDrawable(getResources().getDrawable(R.drawable.a29));
        ImageView imageView2 = this.f109552e;
        if (imageView2 == null) {
            C7573i.m23583a("loadingImageView");
        }
        imageView2.setLayoutParams(layoutParams6);
        StickerImageView stickerImageView3 = this.f109549b;
        if (stickerImageView3 == null) {
            C7573i.m23583a("imageView");
        }
        frameLayout.addView(stickerImageView3);
        View view2 = this.f109553f;
        if (view2 == null) {
            C7573i.m23583a("borderView");
        }
        frameLayout.addView(view2);
        ImageView imageView3 = this.f109552e;
        if (imageView3 == null) {
            C7573i.m23583a("loadingImageView");
        }
        frameLayout.addView(imageView3);
        if (this.f109564q) {
            layoutParams = new LinearLayout.LayoutParams((int) C42109a.f109609b.mo103540c(), -2);
        } else {
            layoutParams = new LinearLayout.LayoutParams(this.f109557j, -2);
        }
        layoutParams.gravity = 1;
        layoutParams.topMargin = this.f109546F;
        this.f109551d = new LinearLayout(context);
        LinearLayout linearLayout3 = this.f109551d;
        if (linearLayout3 == null) {
            C7573i.m23583a("textLayout");
        }
        linearLayout3.setLayoutParams(layoutParams);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams7.weight = 1.0f;
        layoutParams7.gravity = 1;
        AVDmtTextView aVDmtTextView2 = this.f109550c;
        if (aVDmtTextView2 == null) {
            C7573i.m23583a("dmtTextView");
        }
        aVDmtTextView2.setLayoutParams(layoutParams7);
        AVDmtTextView aVDmtTextView3 = this.f109550c;
        if (aVDmtTextView3 == null) {
            C7573i.m23583a("dmtTextView");
        }
        aVDmtTextView3.setGravity(17);
        LinearLayout linearLayout4 = this.f109551d;
        if (linearLayout4 == null) {
            C7573i.m23583a("textLayout");
        }
        AVDmtTextView aVDmtTextView4 = this.f109550c;
        if (aVDmtTextView4 == null) {
            C7573i.m23583a("dmtTextView");
        }
        linearLayout4.addView(aVDmtTextView4);
        this.f109554g = new View(context);
        int b = (int) C9738o.m28708b(context, 6.0f);
        if (this.f109571x) {
            FrameLayout.LayoutParams layoutParams8 = new FrameLayout.LayoutParams(b, b);
            layoutParams8.gravity = 8388661;
            if (this.f109567t) {
                int b2 = (int) C9738o.m28708b(context, 4.0f);
                View view3 = this.f109554g;
                if (view3 == null) {
                    C7573i.m23583a("dotView");
                }
                if (m133990a(view3)) {
                    layoutParams8.leftMargin = b2;
                } else {
                    layoutParams8.rightMargin = b2;
                }
                layoutParams8.topMargin = b2;
                View view4 = this.f109554g;
                if (view4 == null) {
                    C7573i.m23583a("dotView");
                }
                view4.setLayoutParams(layoutParams8);
                StickerImageView stickerImageView4 = this.f109549b;
                if (stickerImageView4 == null) {
                    C7573i.m23583a("imageView");
                }
                View view5 = this.f109554g;
                if (view5 == null) {
                    C7573i.m23583a("dotView");
                }
                stickerImageView4.addView(view5);
            } else {
                View view6 = this.f109554g;
                if (view6 == null) {
                    C7573i.m23583a("dotView");
                }
                view6.setLayoutParams(layoutParams8);
                View view7 = this.f109554g;
                if (view7 == null) {
                    C7573i.m23583a("dotView");
                }
                frameLayout.addView(view7);
            }
        } else {
            LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(b, b);
            layoutParams9.gravity = 8388661;
            layoutParams9.weight = 0.0f;
            View view8 = this.f109554g;
            if (view8 == null) {
                C7573i.m23583a("dotView");
            }
            view8.setLayoutParams(layoutParams9);
            LinearLayout linearLayout5 = this.f109551d;
            if (linearLayout5 == null) {
                C7573i.m23583a("textLayout");
            }
            View view9 = this.f109554g;
            if (view9 == null) {
                C7573i.m23583a("dotView");
            }
            linearLayout5.addView(view9);
        }
        LinearLayout.LayoutParams layoutParams10 = new LinearLayout.LayoutParams(this.f109557j, -2);
        layoutParams10.gravity = 1;
        layoutParams10.topMargin = this.f109547G;
        this.f109555h = new FrameLayout(context);
        FrameLayout frameLayout2 = this.f109555h;
        if (frameLayout2 == null) {
            C7573i.m23583a("bottomDotLayout");
        }
        frameLayout2.setLayoutParams(layoutParams10);
        this.f109556i = new ImageView(context);
        ImageView imageView4 = this.f109556i;
        if (imageView4 == null) {
            C7573i.m23583a("bottomDotView");
        }
        imageView4.setImageResource(R.drawable.ea);
        int b3 = (int) C9738o.m28708b(context, 4.0f);
        FrameLayout.LayoutParams layoutParams11 = new FrameLayout.LayoutParams(b3, b3);
        layoutParams11.gravity = 1;
        ImageView imageView5 = this.f109556i;
        if (imageView5 == null) {
            C7573i.m23583a("bottomDotView");
        }
        imageView5.setLayoutParams(layoutParams11);
        FrameLayout frameLayout3 = this.f109555h;
        if (frameLayout3 == null) {
            C7573i.m23583a("bottomDotLayout");
        }
        ImageView imageView6 = this.f109556i;
        if (imageView6 == null) {
            C7573i.m23583a("bottomDotView");
        }
        frameLayout3.addView(imageView6);
        LinearLayout linearLayout6 = this.f109548H;
        if (linearLayout6 == null) {
            C7573i.m23583a("rootViewLayout");
        }
        linearLayout6.addView(frameLayout);
        LinearLayout linearLayout7 = this.f109548H;
        if (linearLayout7 == null) {
            C7573i.m23583a("rootViewLayout");
        }
        LinearLayout linearLayout8 = this.f109551d;
        if (linearLayout8 == null) {
            C7573i.m23583a("textLayout");
        }
        linearLayout7.addView(linearLayout8);
        LinearLayout linearLayout9 = this.f109548H;
        if (linearLayout9 == null) {
            C7573i.m23583a("rootViewLayout");
        }
        FrameLayout frameLayout4 = this.f109555h;
        if (frameLayout4 == null) {
            C7573i.m23583a("bottomDotLayout");
        }
        linearLayout9.addView(frameLayout4);
        LinearLayout linearLayout10 = this.f109548H;
        if (linearLayout10 == null) {
            C7573i.m23583a("rootViewLayout");
        }
        addView(linearLayout10);
    }

    /* renamed from: a */
    public final void mo103495a(int i, int i2) {
        StickerImageView stickerImageView = this.f109549b;
        if (stickerImageView == null) {
            C7573i.m23583a("imageView");
        }
        stickerImageView.mo100251a(i, i2);
    }

    /* renamed from: a */
    private final void m133989a(Context context, AttributeSet attributeSet) {
        this.f109565r = (int) C9738o.m28708b(context, 2.0f);
        this.f109569v = AnimationUtils.loadAnimation(context, R.anim.av);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.AVDmtView);
            this.f109557j = (int) obtainStyledAttributes.getDimension(18, 0.0f);
            this.f109558k = (int) obtainStyledAttributes.getDimension(17, 0.0f);
            this.f109559l = obtainStyledAttributes.getBoolean(8, false);
            this.f109560m = (int) obtainStyledAttributes.getDimension(29, 0.0f);
            this.f109561n = obtainStyledAttributes.getBoolean(11, true);
            this.f109562o = obtainStyledAttributes.getBoolean(15, true);
            this.f109563p = obtainStyledAttributes.getBoolean(12, false);
            this.f109570w = obtainStyledAttributes.getBoolean(14, true);
            this.f109571x = obtainStyledAttributes.getBoolean(13, true);
            this.f109573z = obtainStyledAttributes.getString(39);
            this.f109572y = obtainStyledAttributes.getDrawable(23);
            this.f109541A = (int) obtainStyledAttributes.getDimension(27, 0.0f);
            this.f109566s = obtainStyledAttributes.getBoolean(26, false);
            this.f109567t = obtainStyledAttributes.getBoolean(25, false);
            this.f109568u = obtainStyledAttributes.getBoolean(24, false);
            this.f109544D = obtainStyledAttributes.getBoolean(35, true);
            this.f109545E = obtainStyledAttributes.getBoolean(33, false);
            this.f109542B = obtainStyledAttributes.getDrawable(28);
            this.f109542B = C42111b.m134051a(this.f109542B, C42111b.f109618a.mo103541a(this.f109566s));
            this.f109564q = obtainStyledAttributes.getBoolean(41, false);
            this.f109546F = (int) obtainStyledAttributes.getDimension(36, C9738o.m28708b(context, 4.0f));
            this.f109547G = (int) obtainStyledAttributes.getDimension(1, C9738o.m28708b(context, 4.0f));
            obtainStyledAttributes.recycle();
        }
        m133988a(context);
        m133992g();
    }

    public AVDmtImageTextView(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
        this.f109571x = true;
        this.f109544D = true;
        m133989a(context, attributeSet);
    }

    /* renamed from: a */
    public final void mo103497a(Drawable drawable, boolean z, int i) {
        if (drawable != null) {
            Drawable a = C42111b.f109618a.mo103545a(drawable, false);
            StickerImageView stickerImageView = this.f109549b;
            if (stickerImageView == null) {
                C7573i.m23583a("imageView");
            }
            stickerImageView.mo100252a(a);
            StickerImageView stickerImageView2 = this.f109549b;
            if (stickerImageView2 == null) {
                C7573i.m23583a("imageView");
            }
            stickerImageView2.setPadding(i, i, i, i);
        }
    }

    public /* synthetic */ AVDmtImageTextView(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}

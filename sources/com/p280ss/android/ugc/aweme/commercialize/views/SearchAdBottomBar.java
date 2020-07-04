package com.p280ss.android.ugc.aweme.commercialize.views;

import android.animation.Animator;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.common.util.C6776h;
import com.p280ss.android.downloadlib.C19535g;
import com.p280ss.android.ugc.aweme.app.download.config.DownloaderManagerHolder;
import com.p280ss.android.ugc.aweme.app.download.p1032c.C22942a;
import com.p280ss.android.ugc.aweme.app.download.p1032c.C22943b;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.challenge.p1086ui.header.C23764b;
import com.p280ss.android.ugc.aweme.commercialize.log.C24939aj;
import com.p280ss.android.ugc.aweme.commercialize.log.C24958f;
import com.p280ss.android.ugc.aweme.commercialize.log.C24958f.C24961b;
import com.p280ss.android.ugc.aweme.commercialize.log.C24962g;
import com.p280ss.android.ugc.aweme.commercialize.log.C24976t;
import com.p280ss.android.ugc.aweme.commercialize.utils.p1134a.C25193b;
import com.p280ss.android.ugc.aweme.commercialize.utils.p1134a.C25196d;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import com.p280ss.android.ugc.aweme.utils.C43081e;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.SearchAdBottomBar */
public final class SearchAdBottomBar extends LinearLayout {

    /* renamed from: a */
    private final int f67160a;

    /* renamed from: b */
    private int f67161b;

    /* renamed from: c */
    private Aweme f67162c;

    /* renamed from: d */
    private View f67163d;

    /* renamed from: e */
    private ImageView f67164e;

    /* renamed from: f */
    private DmtTextView f67165f;

    /* renamed from: g */
    private Animator f67166g;

    /* renamed from: h */
    private Animator f67167h;

    /* renamed from: i */
    private Animator f67168i;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.SearchAdBottomBar$a */
    static final class C25504a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SearchAdBottomBar f67169a;

        /* renamed from: b */
        final /* synthetic */ Aweme f67170b;

        /* renamed from: c */
        final /* synthetic */ AwemeRawAd f67171c;

        C25504a(SearchAdBottomBar searchAdBottomBar, Aweme aweme, AwemeRawAd awemeRawAd) {
            this.f67169a = searchAdBottomBar;
            this.f67170b = aweme;
            this.f67171c = awemeRawAd;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            Context context = this.f67169a.getContext();
            C7573i.m23582a((Object) context, "context");
            C25196d.m82879a(context, C25193b.m82872a(this.f67170b, "button")).mo65822a();
            if (this.f67171c.isAppAd() && !DownloaderManagerHolder.m75524a().mo51673b(this.f67171c.getDownloadUrl())) {
                C19535g a = DownloaderManagerHolder.m75524a();
                String downloadUrl = this.f67171c.getDownloadUrl();
                Long adId = this.f67171c.getAdId();
                C7573i.m23582a((Object) adId, "rawAd.adId");
                a.mo51670a(downloadUrl, adId.longValue(), 2, C22943b.m75511a("result_ad", this.f67171c, "button"), C22942a.m75508a(this.f67171c));
            }
            if (!this.f67171c.isAppAd() || C6776h.m20948b(this.f67169a.getContext(), this.f67171c.getPackageName()) || DownloaderManagerHolder.m75524a().mo51673b(this.f67171c.getDownloadUrl())) {
                C24976t.m82162b(this.f67169a.getContext(), this.f67171c.getCreativeIdStr(), "button", this.f67171c.getLogExtra());
                this.f67169a.mo66231a(this.f67171c, "button");
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.SearchAdBottomBar$b */
    static final class C25505b implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ SearchAdBottomBar f67172a;

        C25505b(SearchAdBottomBar searchAdBottomBar) {
            this.f67172a = searchAdBottomBar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C7573i.m23582a((Object) valueAnimator, "animation");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                this.f67172a.setBackgroundColor(((Integer) animatedValue).intValue());
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.SearchAdBottomBar$c */
    static final class C25506c implements C24939aj {

        /* renamed from: a */
        final /* synthetic */ SearchAdBottomBar f67173a;

        /* renamed from: b */
        final /* synthetic */ AwemeRawAd f67174b;

        /* renamed from: c */
        final /* synthetic */ String f67175c;

        C25506c(SearchAdBottomBar searchAdBottomBar, AwemeRawAd awemeRawAd, String str) {
            this.f67173a = searchAdBottomBar;
            this.f67174b = awemeRawAd;
            this.f67175c = str;
        }

        /* renamed from: a */
        public final void mo63403a(String str, String str2, long j) {
            C24961b a = C24958f.m81906a(str, str2, j).mo65276b("track_url").mo65266a("track_ad").mo65285g("click").mo65263a(this.f67174b);
            if (C23764b.m77913a(this.f67175c)) {
                a.mo65283e(this.f67175c);
            }
            a.mo65270a(this.f67173a.getContext());
        }
    }

    public SearchAdBottomBar(Context context) {
        this(context, null, 0, 6, null);
    }

    public SearchAdBottomBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: c */
    private static int m83859c(boolean z) {
        return z ? R.drawable.ah8 : R.drawable.ah9;
    }

    private final int getBottomMargin() {
        LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            return ((MarginLayoutParams) layoutParams).bottomMargin;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Animator animator = this.f67166g;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.f67167h;
        if (animator2 != null) {
            animator2.cancel();
        }
        Animator animator3 = this.f67168i;
        if (animator3 != null) {
            animator3.cancel();
        }
    }

    /* renamed from: a */
    private final void m83854a() {
        Aweme aweme = this.f67162c;
        if (aweme != null) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null) {
                C7573i.m23582a((Object) awemeRawAd, "mAweme?.awemeRawAd ?: return");
                C24976t.m82200d(getContext(), awemeRawAd.getCreativeIdStr(), "button", awemeRawAd.getLogExtra());
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        int i;
        super.onAttachedToWindow();
        Aweme aweme = this.f67162c;
        if (aweme != null) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null) {
                C7573i.m23582a((Object) awemeRawAd, "mAweme?.awemeRawAd ?: return");
                if (awemeRawAd.getShowButtonSeconds() <= 0) {
                    i = 0;
                } else {
                    i = C23486n.m77122a(-40.0d);
                }
                setBottomMargin(i);
                setBackgroundColor(this.f67160a);
                View view = this.f67163d;
                if (view == null) {
                    C7573i.m23583a("bottomBarContent");
                }
                view.setAlpha(0.5f);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        View findViewById = findViewById(R.id.a1q);
        C7573i.m23582a((Object) findViewById, "findViewById(R.id.content)");
        this.f67163d = findViewById;
        View findViewById2 = findViewById(R.id.ax9);
        C7573i.m23582a((Object) findViewById2, "findViewById(R.id.icon)");
        this.f67164e = (ImageView) findViewById2;
        View findViewById3 = findViewById(R.id.text);
        C7573i.m23582a((Object) findViewById3, "findViewById(R.id.text)");
        this.f67165f = (DmtTextView) findViewById3;
    }

    private final void setBottomMargin(int i) {
        LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
            marginLayoutParams.bottomMargin = i;
            setLayoutParams(marginLayoutParams);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    /* renamed from: b */
    public final void mo66233b(boolean z) {
        if (z) {
            setBackgroundColor(this.f67161b);
            View view = this.f67163d;
            if (view == null) {
                C7573i.m23583a("bottomBarContent");
            }
            view.setAlpha(1.0f);
            return;
        }
        m83856a(this.f67160a, this.f67161b, 300);
        m83855a(0.5f, 1.0f, 300);
    }

    /* renamed from: a */
    public final void mo66230a(Aweme aweme) {
        int i;
        if (aweme != null) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null) {
                C7573i.m23582a((Object) awemeRawAd, "aweme?.awemeRawAd ?: return");
                this.f67162c = aweme;
                boolean z = false;
                setVisibility(0);
                ImageView imageView = this.f67164e;
                if (imageView == null) {
                    C7573i.m23583a("bottomBarIcon");
                }
                imageView.setImageResource(m83859c(awemeRawAd.isAppAd()));
                String buttonText = awemeRawAd.getButtonText();
                if (buttonText != null) {
                    DmtTextView dmtTextView = this.f67165f;
                    if (dmtTextView == null) {
                        C7573i.m23583a("bottomBarText");
                    }
                    dmtTextView.setText(buttonText);
                }
                setOnClickListener(new C25504a(this, aweme, awemeRawAd));
                try {
                    CharSequence learnMoreBgColor = awemeRawAd.getLearnMoreBgColor();
                    if (learnMoreBgColor == null || learnMoreBgColor.length() == 0) {
                        z = true;
                    }
                    if (!z) {
                        i = Color.parseColor(awemeRawAd.getLearnMoreBgColor());
                    } else {
                        i = Color.parseColor("#F1683D");
                    }
                } catch (Exception unused) {
                    i = Color.parseColor("#F1683D");
                }
                this.f67161b = i;
            }
        }
    }

    /* renamed from: a */
    public final void mo66232a(boolean z) {
        if (z) {
            setBottomMargin(0);
        } else {
            this.f67166g = C43081e.m136668a((View) this, getBottomMargin(), 0, (int) C34943c.f91128x);
            Animator animator = this.f67166g;
            if (animator != null) {
                animator.start();
            }
        }
        m83854a();
    }

    /* renamed from: a */
    public final void mo66231a(AwemeRawAd awemeRawAd, String str) {
        C24962g.m81952a((C24939aj) new C25506c(this, awemeRawAd, str), awemeRawAd.getClickTrackUrlList(), true);
    }

    public SearchAdBottomBar(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
        this.f67160a = Color.parseColor("#4D3A3A3A");
        this.f67161b = Color.parseColor("#F1683D");
    }

    /* renamed from: a */
    private final void m83855a(float f, float f2, long j) {
        View view = this.f67163d;
        if (view == null) {
            C7573i.m23583a("bottomBarContent");
        }
        this.f67168i = ObjectAnimator.ofFloat(view, "alpha", new float[]{0.5f, 1.0f}).setDuration(300);
        Animator animator = this.f67168i;
        if (animator != null) {
            animator.start();
        }
    }

    /* renamed from: a */
    private final void m83856a(int i, int i2, long j) {
        if (i != i2) {
            ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), new Object[]{Integer.valueOf(i), Integer.valueOf(i2)});
            ofObject.addUpdateListener(new C25505b(this));
            C7573i.m23582a((Object) ofObject, "colorAnimator");
            ofObject.setDuration(300);
            ofObject.start();
            this.f67167h = ofObject;
        }
    }

    public /* synthetic */ SearchAdBottomBar(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}

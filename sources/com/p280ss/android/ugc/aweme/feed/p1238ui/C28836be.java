package com.p280ss.android.ugc.aweme.feed.p1238ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.arch.lifecycle.C0053p;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Build.VERSION;
import android.support.p022v4.p026d.C0705a;
import android.support.p022v4.view.C0991u;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import bolts.C1592h;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.router.SmartRouter;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.arch.widgets.base.C23083a;
import com.p280ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.commercialize.C24671f;
import com.p280ss.android.ugc.aweme.commercialize.feed.C24723e;
import com.p280ss.android.ugc.aweme.commercialize.p1114a.C24507b.C24508a;
import com.p280ss.android.ugc.aweme.commercialize.p1115ad.C24509a;
import com.p280ss.android.ugc.aweme.commercialize.p1115ad.C24511c;
import com.p280ss.android.ugc.aweme.commercialize.p1121d.C24613b;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25242ao;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25300bx;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25329c;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.feed.C28580o;
import com.p280ss.android.ugc.aweme.feed.PAGE;
import com.p280ss.android.ugc.aweme.feed.event.C28318an;
import com.p280ss.android.ugc.aweme.feed.experiment.C28345b;
import com.p280ss.android.ugc.aweme.feed.experiment.CaptionEnableSeeMoreExperiment;
import com.p280ss.android.ugc.aweme.feed.experiment.CompleteVideoDescExperiment;
import com.p280ss.android.ugc.aweme.feed.model.AwemeTextLabelModel;
import com.p280ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28482e;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28511z;
import com.p280ss.android.ugc.aweme.feed.param.FeedParam;
import com.p280ss.android.ugc.aweme.feed.param.FeedParamProvider;
import com.p280ss.android.ugc.aweme.feed.widget.C29048a;
import com.p280ss.android.ugc.aweme.feed.widget.C29049b;
import com.p280ss.android.ugc.aweme.feed.widget.C29051d;
import com.p280ss.android.ugc.aweme.feed.widget.C29053f;
import com.p280ss.android.ugc.aweme.feed.widget.C29054g;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.lego.C7121a;
import com.p280ss.android.ugc.aweme.legoImp.inflate.C32346e;
import com.p280ss.android.ugc.aweme.legoImp.inflate.X2CItemFeed;
import com.p280ss.android.ugc.aweme.login.utils.C32698a;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.metrics.C33275q;
import com.p280ss.android.ugc.aweme.metrics.C33276r;
import com.p280ss.android.ugc.aweme.metrics.C33277s;
import com.p280ss.android.ugc.aweme.model.TextExtraStruct;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.router.C7203u;
import com.p280ss.android.ugc.aweme.shortvideo.view.C41656f;
import com.p280ss.android.ugc.aweme.translation.p1682ui.TranslationStatusView;
import com.p280ss.android.ugc.aweme.utils.C43081e;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import com.p280ss.android.ugc.aweme.utils.C43127fh;
import com.p280ss.android.ugc.aweme.views.MentionTextView;
import com.p280ss.android.ugc.aweme.views.MentionTextView.C43346d;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.be */
public final class C28836be extends C28894e implements C0053p<C23083a> {

    /* renamed from: A */
    private boolean f76030A;

    /* renamed from: B */
    private int f76031B;

    /* renamed from: a */
    public MentionTextView f76032a;

    /* renamed from: b */
    public TextView f76033b;

    /* renamed from: c */
    public TranslationStatusView f76034c;

    /* renamed from: d */
    public SpannableStringBuilder f76035d;

    /* renamed from: e */
    public int f76036e;

    /* renamed from: f */
    public SpannableStringBuilder f76037f;

    /* renamed from: r */
    public int f76038r;

    /* renamed from: s */
    private LinearLayout f76039s;

    /* renamed from: t */
    private C28818aw f76040t;

    /* renamed from: u */
    private C24723e f76041u;

    /* renamed from: v */
    private C24613b f76042v;

    /* renamed from: w */
    private C28768aa f76043w;

    /* renamed from: x */
    private boolean f76044x;

    /* renamed from: y */
    private boolean f76045y;

    /* renamed from: z */
    private boolean f76046z;

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.be$a */
    static class C28839a extends ClickableSpan {

        /* renamed from: a */
        private WeakReference<C28836be> f76051a;

        /* renamed from: b */
        private SpannableStringBuilder f76052b;

        /* renamed from: c */
        private boolean f76053c;

        public final void updateDrawState(TextPaint textPaint) {
            textPaint.setColor(-1);
            textPaint.setUnderlineText(false);
        }

        public final void onClick(View view) {
            C28836be beVar = (C28836be) this.f76051a.get();
            if (beVar != null) {
                beVar.mo74091a(this.f76052b, this.f76053c);
            }
        }

        C28839a(C28836be beVar, SpannableStringBuilder spannableStringBuilder, boolean z) {
            this.f76051a = new WeakReference<>(beVar);
            this.f76052b = spannableStringBuilder;
            this.f76053c = z;
        }
    }

    /* renamed from: a */
    public final void mo72018a() {
    }

    /* renamed from: a */
    public final void mo72019a(View view) {
        View view2 = ((X2CItemFeed) C7121a.m22249b(X2CItemFeed.class)).getView(this.f76175m, R.layout.layout_video_desc);
        if (view instanceof FrameLayout) {
            ((FrameLayout) view).addView(view2);
        }
        this.f76032a = (MentionTextView) view2.findViewById(R.id.a7e);
        if (this.f76032a == null) {
            view2 = C32346e.m104913a(getClass().getName(), view2, this.f76175m, R.layout.layout_video_desc);
        }
        this.f76033b = (TextView) view2.findViewById(R.id.e3q);
        this.f76033b.setTypeface(Typeface.defaultFromStyle(1));
        this.f76033b.setOnClickListener(new C28840bf(this));
        this.f76034c = (TranslationStatusView) view2.findViewById(R.id.dnl);
        this.f76039s = (LinearLayout) view2.findViewById(R.id.a7o);
    }

    /* renamed from: a */
    public final void mo72021a(VideoItemParams videoItemParams) {
        SpannableString spannableString;
        super.mo72021a(videoItemParams);
        if (!C6399b.m19944t() && !this.f76169g.isHashTag()) {
            this.f76169g.convertChallengeToHashTag();
        }
        this.f76044x = false;
        this.f76033b.setVisibility(4);
        this.f76033b.setText(this.f76175m.getString(C6399b.m19944t() ? R.string.b53 : R.string.b2o));
        this.f76032a.setMaxLines(C28511z.m93721b());
        mo74093a((CharSequence) "");
        C6921a.m21563c(4, "VideoDescView", "start to bind aweme des");
        if (this.f76032a != null) {
            this.f76032a.setFilters(m94884a(this.f76032a.getFilters()));
        }
        if (m94894t()) {
            C6921a.m21563c(4, "VideoDescView", "shouldShowLinkLogo");
            this.f76176n.setVisibility(0);
            if (TextUtils.isEmpty(this.f76169g.getDesc())) {
                this.f76169g.setDesc("");
            }
            StringBuilder sb = new StringBuilder();
            sb.append(this.f76169g.getDesc());
            sb.append(m94890l());
            SpannableString spannableString2 = new SpannableString(sb.toString());
            AwemeTextLabelModel label = this.f76169g.getAwemeRawAd().getLabel();
            if (this.f76169g.isAd() && this.f76169g.getAwemeRawAd().isRightStyle() && label != null) {
                C29048a aVar = new C29048a(this.f76175m, label.getBgColor(), label.getLabelName(), label.getTextColor());
                aVar.f76574a = label.isAdHollowText();
                spannableString2.setSpan(aVar, this.f76169g.getDesc().length() + 1, this.f76169g.getDesc().length() + m94890l().length(), 17);
            } else if (TextUtils.isEmpty(this.f76169g.getAwemeRawAd().getAdMoreTextual())) {
                spannableString2.setSpan(new C24509a(this.f76175m, R.drawable.a8f), this.f76169g.getDesc().length() + 1, this.f76169g.getDesc().length() + m94890l().length(), 17);
            } else {
                spannableString2.setSpan(new C29053f(this.f76175m, R.color.en, this.f76169g.getAwemeRawAd().getAdMoreTextual(), R.drawable.aod), this.f76169g.getDesc().length() + 1, this.f76169g.getDesc().length() + m94890l().length(), 17);
            }
            mo74093a((CharSequence) spannableString2);
            this.f76032a.setSpanColor(this.f76032a.getCurrentTextColor());
            C43081e.m136670a(this.f76039s);
            m94893s();
        } else if (m94891q()) {
            this.f76176n.setVisibility(0);
            CharSequence desc = this.f76169g.getDesc();
            try {
                if (mo74101m()) {
                    String b = m94885b(this.f76169g.getDesc());
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(b);
                    sb2.append(m94890l());
                    desc = mo74087a((CharSequence) sb2.toString(), b.length());
                }
            } catch (Exception e) {
                C6921a.m21556a("init ad label", e);
            }
            mo74093a(desc);
            this.f76032a.setSpanColor(this.f76032a.getCurrentTextColor());
            m94893s();
        } else {
            StringBuilder sb3 = new StringBuilder("don't show desc,empty?");
            sb3.append(TextUtils.isEmpty(this.f76169g.getDesc()));
            C6921a.m21552a(4, "VideoDescView", sb3.toString());
            this.f76176n.setVisibility(8);
        }
        if (m94892r()) {
            this.f76176n.setVisibility(0);
            if (TextUtils.isEmpty(this.f76169g.getDesc())) {
                this.f76169g.setDesc("");
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (this.f76032a.getText() == null || TextUtils.isEmpty(this.f76032a.getText().toString().trim())) {
                spannableString = C6903bc.m21487f().mo84743a(this.f76175m, this.f76169g.getDesc(), this.f76169g, this.f76170h, this.f76173k);
            } else {
                spannableStringBuilder.append(this.f76032a.getText());
                spannableString = C6903bc.m21487f().mo84743a(this.f76175m, "", this.f76169g, this.f76170h, this.f76173k);
            }
            m94881a(spannableStringBuilder, spannableString);
            mo74093a((CharSequence) spannableStringBuilder);
            this.f76032a.setSpanColor(this.f76032a.getCurrentTextColor());
            m94893s();
        }
        if (C6399b.m19944t()) {
            if (this.f76040t == null) {
                this.f76040t = new C28818aw(this.f76175m, this.f76034c, this.f76032a, this.f76033b);
                this.f76040t.mo74053a(this.f76170h, this.f76173k);
            }
            this.f76040t.mo74047a(this.f76169g);
            this.f76040t.f75983l = false;
        }
        this.f76039s.setOnClickListener(new C28841bg(this));
        if (!FeedParamProvider.m94273a(this.f76175m).isHotSpot() && C6903bc.m21489h().mo85871a(this.f76169g, this.f76179q, this.f76170h)) {
            if (TextUtils.isEmpty(this.f76169g.getDesc())) {
                m94893s();
            }
            C6903bc.m21489h().mo85869a(this.f76175m, this.f76169g, (TextView) this.f76032a);
            this.f76176n.setVisibility(0);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo74092a(View view, TextExtraStruct textExtraStruct) {
        if (!C6399b.m19944t()) {
            m94883a(textExtraStruct);
        } else if (textExtraStruct.isClickable()) {
            m94887b(textExtraStruct);
        }
    }

    /* JADX WARNING: type inference failed for: r6v3, types: [java.lang.CharSequence] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo74088a(int r8) {
        /*
            r7 = this;
            com.ss.android.ugc.aweme.views.MentionTextView r0 = r7.f76032a
            r0.setMaxLines(r8)
            com.ss.android.ugc.aweme.views.MentionTextView r0 = r7.f76032a
            r0.setLines(r8)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f76169g
            r0.setAdDescMaxLines(r8)
            android.text.SpannableStringBuilder r6 = new android.text.SpannableStringBuilder
            com.ss.android.ugc.aweme.feed.model.Aweme r8 = r7.f76169g
            java.lang.String r8 = r8.getDesc()
            r6.<init>(r8)
            boolean r8 = r7.mo74101m()
            if (r8 == 0) goto L_0x0027
            java.lang.String r8 = m94890l()
            r6.append(r8)
        L_0x0027:
            com.ss.android.ugc.aweme.main.i r8 = com.p280ss.android.ugc.aweme.C6903bc.m21487f()
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f76169g
            boolean r8 = r8.mo84746a(r0)
            if (r8 == 0) goto L_0x0048
            java.lang.String r8 = " [r]"
            r6.append(r8)
            com.ss.android.ugc.aweme.main.i r1 = com.p280ss.android.ugc.aweme.C6903bc.m21487f()
            android.content.Context r2 = r7.f76175m
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r7.f76169g
            java.lang.String r4 = r7.f76170h
            int r5 = r7.f76173k
            android.text.SpannableStringBuilder r6 = r1.mo84744a(r2, r3, r4, r5, r6)
        L_0x0048:
            boolean r8 = r7.mo74101m()
            if (r8 == 0) goto L_0x006f
            int r8 = r6.length()
            com.ss.android.ugc.aweme.main.i r0 = com.p280ss.android.ugc.aweme.C6903bc.m21487f()
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r7.f76169g
            boolean r0 = r0.mo84746a(r1)
            if (r0 == 0) goto L_0x0060
            r0 = 4
            goto L_0x0061
        L_0x0060:
            r0 = 0
        L_0x0061:
            int r8 = r8 - r0
            java.lang.String r0 = m94890l()
            int r0 = r0.length()
            int r8 = r8 - r0
            java.lang.CharSequence r6 = r7.mo74087a(r6, r8)
        L_0x006f:
            r7.mo74093a(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.mo74088a(int):void");
    }

    /* renamed from: a */
    public final void mo74094a(boolean z) {
        if (C6399b.m19944t() && this.f76175m != null && this.f76169g != null && this.f76169g.getDesc() != null) {
            boolean a = C43127fh.m136806a(this.f76175m);
            boolean a2 = C0705a.m2998a().mo2851a(this.f76169g.getDesc());
            boolean z2 = false;
            boolean z3 = a != a2;
            try {
                LayoutParams layoutParams = (LayoutParams) this.f76032a.getLayoutParams();
                if (z) {
                    if (!this.f76030A && (!z3 || this.f76046z)) {
                        if (z3 || !this.f76046z) {
                            return;
                        }
                    }
                    this.f76030A = false;
                    this.f76046z = !this.f76046z;
                    C0991u.m4209d((View) this.f76032a, a2 ? 1 : 0);
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f76033b.getLayoutParams();
                    layoutParams2.gravity = a2 ? 83 : 85;
                    layoutParams2.leftMargin = C23486n.m77122a(15.0d);
                    if (VERSION.SDK_INT >= 17) {
                        layoutParams2.setMarginStart((int) C9738o.m28708b(this.f76175m, 15.0f));
                    }
                    this.f76033b.setLayoutParams(layoutParams2);
                    z2 = z3;
                } else if (C0991u.m4220h(this.f76032a) != a) {
                    this.f76030A = true;
                    C0991u.m4209d((View) this.f76032a, a ? 1 : 0);
                } else {
                    return;
                }
                if (z2) {
                    layoutParams.rightMargin = C23486n.m77122a(15.0d);
                    layoutParams.leftMargin = C23486n.m77122a(0.0d);
                    if (VERSION.SDK_INT >= 17) {
                        layoutParams.setMarginEnd((int) C9738o.m28708b(this.f76175m, 15.0f));
                        layoutParams.setMarginStart((int) C9738o.m28708b(this.f76175m, 0.0f));
                    }
                } else {
                    layoutParams.leftMargin = C23486n.m77122a(15.0d);
                    layoutParams.rightMargin = C23486n.m77122a(0.0d);
                    if (VERSION.SDK_INT >= 17) {
                        layoutParams.setMarginStart((int) C9738o.m28708b(this.f76175m, 15.0f));
                        layoutParams.setMarginEnd((int) C9738o.m28708b(this.f76175m, 0.0f));
                    }
                }
                this.f76032a.setLayoutParams(layoutParams);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo74090a(SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2, boolean z) {
        this.f76044x = true;
        this.f76033b.setVisibility(0);
        this.f76031B = this.f76033b.getHeight();
        if (this.f76045y) {
            C6907h.m21524a("video_title", m94880a("show"));
        }
        if (!z) {
            m94886b(spannableStringBuilder, spannableStringBuilder2, true);
            m94886b(spannableStringBuilder2, spannableStringBuilder, false);
        }
    }

    /* renamed from: a */
    public final void mo74091a(SpannableStringBuilder spannableStringBuilder, final boolean z) {
        final int i;
        ValueAnimator valueAnimator;
        int i2 = this.f76036e;
        if (this.f76034c.getVisibility() == 0 && this.f76034c.getStatus() == 2 && this.f76169g.getTransDesc() != null) {
            i2 = (this.f76038r * this.f76169g.getTransDescLines()) / mo74100k();
            if (z) {
                spannableStringBuilder = new SpannableStringBuilder(this.f76169g.getTransDesc());
            } else {
                spannableStringBuilder = new SpannableStringBuilder(this.f76169g.getEllipsizeTransDesc());
            }
        }
        C6907h.m21524a("video_title", m94880a(z ? "spread" : "fold"));
        if (z) {
            i = 12;
        } else {
            i = mo74100k();
        }
        mo74093a((CharSequence) spannableStringBuilder);
        if (z) {
            valueAnimator = ValueAnimator.ofInt(new int[]{this.f76038r, i2});
        } else {
            valueAnimator = ValueAnimator.ofInt(new int[]{i2, this.f76038r});
        }
        valueAnimator.addUpdateListener(new C28846bl(this));
        valueAnimator.addListener(new AnimatorListenerAdapter() {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final /* synthetic */ void mo74108a() {
                C28836be.this.f76032a.setLines(C28836be.this.f76032a.getLineCount());
            }

            public final void onAnimationStart(Animator animator) {
                TextView textView;
                int i;
                if (!C6399b.m19944t()) {
                    textView = C28836be.this.f76033b;
                    if (z) {
                        i = R.string.b7q;
                    } else {
                        i = R.string.b2o;
                    }
                } else if (z) {
                    textView = C28836be.this.f76033b;
                    i = R.string.b52;
                } else {
                    textView = C28836be.this.f76033b;
                    i = R.string.b53;
                }
                textView.setText(i);
                C28836be.this.f76033b.setVisibility(4);
            }

            public final void onAnimationEnd(Animator animator) {
                if (!C6399b.m19944t()) {
                    C28836be.this.f76032a.setMaxLines(i);
                } else if (z) {
                    if (C28836be.this.f76169g.getTransDescLines() != 0 && C28836be.this.f76034c.getVisibility() == 0 && C28836be.this.f76034c.getStatus() == 2) {
                        C28836be.this.f76032a.setLines(C28836be.this.f76169g.getTransDescLines());
                    } else {
                        C28836be.this.f76032a.post(new C28850bp(this));
                    }
                } else if (C28836be.this.f76032a.getText().length() > 0) {
                    C28836be.this.f76032a.setLines(C28836be.this.mo74100k());
                } else {
                    C28836be.this.f76032a.setMaxLines(i);
                }
                C28836be.this.f76033b.setVisibility(0);
            }
        });
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{0, this.f76031B});
        ofInt.addUpdateListener(new C28847bm(this));
        ofInt.setDuration(100);
        ofInt.setStartDelay(150);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{valueAnimator, ofInt});
        animatorSet.start();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo74089a(ValueAnimator valueAnimator) {
        this.f76033b.setVisibility(0);
        this.f76033b.setHeight(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    /* renamed from: a */
    public final void mo74093a(CharSequence charSequence) {
        try {
            if (C28345b.m93124a()) {
                StringBuilder sb = new StringBuilder("VideoDescView_setDescSafely desc:");
                sb.append(charSequence);
                C6921a.m21552a(4, "VideoDescView", sb.toString());
            }
            this.f76032a.setText(charSequence);
        } catch (Exception e) {
            C6921a.m21554a(e);
        }
    }

    /* renamed from: l */
    public static String m94890l() {
        if (C6399b.m19944t()) {
            return " [sponsor]";
        }
        return " [t]";
    }

    /* renamed from: r */
    private boolean m94892r() {
        return C6903bc.m21487f().mo84746a(this.f76169g);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public final /* synthetic */ Object mo74102n() throws Exception {
        C6907h.m21524a("video_title", m94880a("show"));
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: p */
    public final /* synthetic */ void mo74104p() {
        if (this.f76039s != null) {
            this.f76039s.invalidate();
        }
    }

    /* renamed from: q */
    private boolean m94891q() {
        if (TextUtils.isEmpty(this.f76169g.getDesc()) || C43122ff.m136767b() || C32698a.m105818a(this.f76169g)) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    public final int mo74100k() {
        if (C25329c.m83221d(this.f76169g)) {
            return this.f76169g.getAdDescMaxLines();
        }
        return C28511z.m93721b();
    }

    /* renamed from: t */
    private boolean m94894t() {
        if (!this.f76169g.isAd() || this.f76169g.getAwemeRawAd().isDisableAdLink() || ((TextUtils.isEmpty(this.f76169g.getAwemeRawAd().getWebUrl()) && !this.f76169g.getAwemeRawAd().isRightStyle()) || !this.f76169g.isCanPlay())) {
            return false;
        }
        return true;
    }

    /* renamed from: u */
    private int m94895u() {
        if (C25329c.m83221d(this.f76169g)) {
            return C24508a.f64681a;
        }
        if (!m94889j()) {
            return C28511z.m93720a();
        }
        if (C6384b.m19835a().mo15287a(CaptionEnableSeeMoreExperiment.class, true, "caption_enable_see_more_mt", C6384b.m19835a().mo15295d().caption_enable_see_more_mt, 1) == 1) {
            return C34943c.f91127w;
        }
        return 100;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final boolean mo74098e() {
        if (super.mo74098e() || (C25300bx.m83125a(this.f76169g, 3) && TextUtils.isEmpty(this.f76169g.getAwemeRawAd().getWebUrl()))) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public final String mo74099i() {
        if (!m94889j()) {
            return "...";
        }
        if (!C6399b.m19944t()) {
            return this.f76175m.getString(R.string.fp1);
        }
        StringBuilder sb = new StringBuilder("... ");
        sb.append(this.f76175m.getString(R.string.b53));
        return sb.toString();
    }

    /* renamed from: m */
    public final boolean mo74101m() {
        if (!this.f76169g.isAd() || this.f76169g.getAwemeRawAd().getLabel() == null || !this.f76169g.getAwemeRawAd().isRightStyle()) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public static boolean m94889j() {
        if ((C6399b.m19944t() || !C6384b.m19835a().mo15292a(CompleteVideoDescExperiment.class, true, "enable_full_screen_aweme_title_expand", C6384b.m19835a().mo15295d().enable_full_screen_aweme_title_expand, false)) && (!C6399b.m19944t() || C6384b.m19835a().mo15287a(CaptionEnableSeeMoreExperiment.class, true, "caption_enable_see_more_mt", C6384b.m19835a().mo15295d().caption_enable_see_more_mt, 1) != 1)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: o */
    public final /* synthetic */ Object mo74103o() throws Exception {
        if (this.f76169g != null && this.f76040t.f75979h == 2) {
            C6907h.m21524a("see_original_show", (Map) C22984d.m75611a().mo59973a("enter_from", this.f76170h).mo59973a("group_id", this.f76169g.getAid()).f60753a);
        } else if (this.f76169g != null && this.f76040t.f75979h == 0) {
            C6907h.m21524a("see_translation_show", (Map) C22984d.m75611a().mo59973a("enter_from", this.f76170h).mo59973a("group_id", this.f76169g.getAid()).f60753a);
        }
        return null;
    }

    /* renamed from: s */
    private void m94893s() {
        if (VERSION.SDK_INT < 21) {
            this.f76039s.post(new C28842bh(this));
        }
        if (this.f76169g.getTextExtra() != null && this.f76169g.getTextExtra().size() > 0) {
            for (TextExtraStruct textExtraStruct : this.f76169g.getTextExtra()) {
                if (textExtraStruct != null) {
                    if (textExtraStruct.getStart() < 0) {
                        textExtraStruct.setStart(0);
                    }
                    if (textExtraStruct.getEnd() > this.f76169g.getDesc().length()) {
                        textExtraStruct.setEnd(this.f76169g.getDesc().length());
                    }
                }
            }
        }
        if (this.f76175m != null) {
            this.f76032a.setMaxSize(m94895u());
            this.f76032a.setSpanSize((float) C23486n.m77127c(15.0d));
            this.f76032a.setSpanColor(this.f76032a.getCurrentTextColor());
            this.f76032a.setSpanStyle(1);
            this.f76032a.setOnSpanClickListener(new C28843bi(this));
            this.f76032a.mo105184a(this.f76169g.getTextExtra(), (C43346d) new C41656f(true));
            if (C6399b.m19944t() && this.f76169g != null && this.f76169g.getTextExtra() != null && !TextUtils.isEmpty(this.f76169g.getDesc())) {
                Iterator it = this.f76169g.getTextExtra().iterator();
                while (true) {
                    if (it.hasNext()) {
                        TextExtraStruct textExtraStruct2 = (TextExtraStruct) it.next();
                        if (m94888c(textExtraStruct2) && textExtraStruct2.getType() == 0 && !TextUtils.isEmpty(textExtraStruct2.getAwemeId()) && this.f76169g.getDesc().charAt(textExtraStruct2.getStart()) == '@') {
                            C24511c cVar = new C24511c(this.f76175m, (float) Math.round(((float) C9738o.m28691a(this.f76175m)) - (C9738o.m28708b(this.f76175m, 100.0f) + this.f76175m.getResources().getDimension(R.dimen.xc))), this.f76175m.getResources().getColor(R.color.lf), -1, textExtraStruct2);
                            cVar.f64695b = C9738o.m28708b(this.f76175m, 12.0f);
                            cVar.f64696c = C9738o.m28708b(this.f76175m, 2.0f);
                            cVar.f64694a = C9738o.m28708b(this.f76175m, 13.0f);
                            this.f76032a.mo105183a(textExtraStruct2.getStart(), textExtraStruct2.getEnd(), cVar);
                            break;
                        }
                    }
                }
            }
            try {
                if (!C6399b.m19944t() || !C43127fh.m136806a(this.f76175m)) {
                    if (m94892r()) {
                        this.f76032a.setMovementMethod(C29051d.m95330a());
                    } else {
                        this.f76032a.setMovementMethod(C29049b.m95321a());
                    }
                    this.f76032a.getViewTreeObserver().addOnGlobalLayoutListener(new OnGlobalLayoutListener() {
                        /* access modifiers changed from: 0000 */
                        /* renamed from: a */
                        public final /* synthetic */ void mo74105a() {
                            if (C28836be.this.f76032a.getLineCount() != 0) {
                                C28836be.this.f76032a.setLines(C28836be.this.f76032a.getLineCount());
                                C28836be.this.mo74094a(false);
                            }
                        }

                        /* JADX WARNING: type inference failed for: r5v4, types: [android.text.SpannableStringBuilder, java.lang.CharSequence] */
                        /* JADX WARNING: type inference failed for: r5v5, types: [android.text.SpannableStringBuilder, java.lang.CharSequence] */
                        /* JADX WARNING: type inference failed for: r5v6, types: [java.lang.CharSequence] */
                        /* JADX WARNING: type inference failed for: r5v7, types: [java.lang.CharSequence] */
                        /* JADX WARNING: type inference failed for: r5v8, types: [android.text.SpannableStringBuilder] */
                        /* JADX WARNING: type inference failed for: r8v18, types: [java.lang.CharSequence] */
                        /* JADX WARNING: type inference failed for: r0v31, types: [android.text.SpannableStringBuilder] */
                        /* JADX WARNING: type inference failed for: r5v10 */
                        /* JADX WARNING: type inference failed for: r8v19 */
                        /* JADX WARNING: type inference failed for: r8v20 */
                        /* JADX WARNING: type inference failed for: r8v25 */
                        /* JADX WARNING: type inference failed for: r8v26, types: [java.lang.CharSequence] */
                        /* JADX WARNING: type inference failed for: r10v14, types: [java.lang.CharSequence] */
                        /* JADX WARNING: type inference failed for: r8v27 */
                        /* JADX WARNING: type inference failed for: r8v32 */
                        /* JADX WARNING: type inference failed for: r22v0 */
                        /* JADX WARNING: type inference failed for: r8v41 */
                        /* JADX WARNING: type inference failed for: r14v12, types: [android.text.SpannableStringBuilder] */
                        /* JADX WARNING: type inference failed for: r14v13, types: [android.text.SpannableStringBuilder, java.lang.CharSequence] */
                        /* JADX WARNING: type inference failed for: r0v48, types: [java.lang.CharSequence] */
                        /* JADX WARNING: type inference failed for: r0v54 */
                        /* JADX WARNING: type inference failed for: r0v56, types: [java.lang.CharSequence] */
                        /* JADX WARNING: type inference failed for: r14v14, types: [android.text.SpannableStringBuilder] */
                        /* JADX WARNING: type inference failed for: r14v15, types: [android.text.SpannableStringBuilder] */
                        /* JADX WARNING: type inference failed for: r5v27 */
                        /* JADX WARNING: type inference failed for: r5v28 */
                        /* JADX WARNING: type inference failed for: r8v75 */
                        /* JADX WARNING: type inference failed for: r8v76 */
                        /* JADX WARNING: type inference failed for: r8v77 */
                        /* JADX WARNING: type inference failed for: r14v16 */
                        /* JADX WARNING: type inference failed for: r0v81 */
                        /* JADX WARNING: type inference failed for: r14v17 */
                        /* JADX WARNING: type inference failed for: r14v18 */
                        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r5v4, types: [android.text.SpannableStringBuilder, java.lang.CharSequence]
                          assigns: [android.text.SpannableStringBuilder, ?[OBJECT, ARRAY], java.lang.CharSequence]
                          uses: [android.text.SpannableStringBuilder, java.lang.CharSequence, ?[OBJECT, ARRAY]]
                          mth insns count: 617
                        	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                        	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
                        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
                        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
                        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
                        	at jadx.core.ProcessClass.process(ProcessClass.java:30)
                        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
                        	at jadx.core.ProcessClass.process(ProcessClass.java:35)
                        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
                        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
                        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
                         */
                        /* JADX WARNING: Removed duplicated region for block: B:106:0x03ec  */
                        /* JADX WARNING: Removed duplicated region for block: B:109:0x0420  */
                        /* JADX WARNING: Removed duplicated region for block: B:110:0x0433  */
                        /* JADX WARNING: Removed duplicated region for block: B:113:0x044a  */
                        /* JADX WARNING: Removed duplicated region for block: B:125:0x0495  */
                        /* JADX WARNING: Removed duplicated region for block: B:128:0x04a7  */
                        /* JADX WARNING: Removed duplicated region for block: B:161:0x05a5  */
                        /* JADX WARNING: Removed duplicated region for block: B:165:0x05d5  */
                        /* JADX WARNING: Removed duplicated region for block: B:168:0x0605  */
                        /* JADX WARNING: Unknown variable types count: 15 */
                        /* Code decompiled incorrectly, please refer to instructions dump. */
                        public final void onGlobalLayout() {
                            /*
                                r23 = this;
                                r1 = r23
                                com.ss.android.ugc.aweme.feed.ui.be r0 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                                int r0 = r0.mo74100k()
                                com.ss.android.ugc.aweme.feed.ui.be r2 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                                com.ss.android.ugc.aweme.views.MentionTextView r2 = r2.f76032a
                                android.view.ViewTreeObserver r2 = r2.getViewTreeObserver()
                                com.ss.android.ugc.aweme.feed.ui.be r3 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                                com.ss.android.ugc.aweme.feed.model.Aweme r3 = r3.f76169g
                                boolean r3 = r3.isAd()
                                r4 = 4
                                r5 = 1
                                r6 = 0
                                if (r3 == 0) goto L_0x012a
                                com.ss.android.ugc.aweme.feed.ui.be r3 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                                com.ss.android.ugc.aweme.views.MentionTextView r3 = r3.f76032a
                                int r3 = r3.getLineCount()
                                if (r3 <= r0) goto L_0x012a
                                com.ss.android.ugc.aweme.feed.ui.be r3 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                                com.ss.android.ugc.aweme.feed.model.Aweme r3 = r3.f76169g
                                boolean r3 = r3.isAdDescHandle()
                                if (r3 == 0) goto L_0x012a
                                com.ss.android.ugc.aweme.feed.ui.be r3 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                                com.ss.android.ugc.aweme.views.MentionTextView r3 = r3.f76032a
                                java.lang.CharSequence r3 = r3.getText()
                                com.ss.android.ugc.aweme.feed.ui.be r7 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                                com.ss.android.ugc.aweme.feed.model.Aweme r7 = r7.f76169g
                                java.lang.String r7 = r7.getDesc()
                                com.ss.android.ugc.aweme.feed.ui.be r8 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                                r8.mo74093a(r7)
                                com.ss.android.ugc.aweme.feed.ui.be r7 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                                com.ss.android.ugc.aweme.views.MentionTextView r7 = r7.f76032a
                                android.text.Layout r7 = r7.getLayout()
                                if (r7 != 0) goto L_0x0093
                                com.ss.android.ugc.aweme.feed.ui.be r0 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                                com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.f76169g
                                r0.setAdDescHandle(r6)
                                com.ss.android.ugc.aweme.feed.ui.be r0 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                                r0.mo74093a(r3)
                                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                                java.lang.String r2 = "VideoDescView_onGlobalLayout_null + aid = "
                                r0.<init>(r2)
                                com.ss.android.ugc.aweme.feed.ui.be r2 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                                com.ss.android.ugc.aweme.feed.model.Aweme r2 = r2.f76169g
                                java.lang.String r2 = r2.getAid()
                                r0.append(r2)
                                java.lang.String r2 = "desc = "
                                r0.append(r2)
                                com.ss.android.ugc.aweme.feed.ui.be r2 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                                com.ss.android.ugc.aweme.feed.model.Aweme r2 = r2.f76169g
                                java.lang.String r2 = r2.getDesc()
                                r0.append(r2)
                                java.lang.String r0 = r0.toString()
                                com.p280ss.android.ugc.aweme.framework.p312a.C6921a.m21555a(r0)
                                com.ss.android.ugc.aweme.lancet.CommerceException r0 = new com.ss.android.ugc.aweme.lancet.CommerceException
                                java.lang.Throwable r2 = new java.lang.Throwable
                                r2.<init>()
                                r0.<init>(r2)
                                com.p280ss.android.ugc.aweme.framework.p312a.C6921a.m21559a(r0)
                                return
                            L_0x0093:
                                com.ss.android.ugc.aweme.feed.ui.be r7 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                                com.ss.android.ugc.aweme.views.MentionTextView r7 = r7.f76032a
                                android.text.Layout r7 = r7.getLayout()
                                if (r7 == 0) goto L_0x00b5
                                com.ss.android.ugc.aweme.feed.ui.be r7 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                                com.ss.android.ugc.aweme.views.MentionTextView r7 = r7.f76032a
                                android.text.Layout r7 = r7.getLayout()
                                int r7 = r7.getLineCount()
                                if (r7 > r0) goto L_0x00b5
                                int r0 = r0 + r5
                                com.ss.android.ugc.aweme.feed.ui.be r3 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                                r3.mo74088a(r0)
                                r2.removeOnGlobalLayoutListener(r1)
                                return
                            L_0x00b5:
                                int r7 = r3.length()
                                java.lang.String r8 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.m94890l()
                                int r8 = r8.length()
                                int r7 = r7 - r8
                                com.ss.android.ugc.aweme.main.i r8 = com.p280ss.android.ugc.aweme.C6903bc.m21487f()
                                com.ss.android.ugc.aweme.feed.ui.be r9 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                                com.ss.android.ugc.aweme.feed.model.Aweme r9 = r9.f76169g
                                boolean r8 = r8.mo84746a(r9)
                                if (r8 == 0) goto L_0x00d2
                                r8 = 4
                                goto L_0x00d3
                            L_0x00d2:
                                r8 = 0
                            L_0x00d3:
                                int r7 = r7 - r8
                                int r8 = com.p280ss.android.ugc.aweme.commercialize.p1114a.C24507b.C24508a.f64682b
                                if (r7 >= r8) goto L_0x00e0
                                int r0 = r0 + 1
                                com.ss.android.ugc.aweme.feed.ui.be r3 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                                r3.mo74088a(r0)
                                goto L_0x012a
                            L_0x00e0:
                                com.ss.android.ugc.aweme.feed.ui.be r7 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                                r7.mo74093a(r3)
                                boolean r7 = r3 instanceof android.text.SpannableString
                                if (r7 == 0) goto L_0x012a
                                boolean r7 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.m94889j()
                                if (r7 == 0) goto L_0x012a
                                com.ss.android.ugc.aweme.feed.ui.be r7 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                                com.ss.android.ugc.aweme.views.MentionTextView r7 = r7.f76032a
                                android.text.Layout r7 = r7.getLayout()
                                if (r7 == 0) goto L_0x012a
                                com.ss.android.ugc.aweme.feed.ui.be r7 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                                com.ss.android.ugc.aweme.views.MentionTextView r7 = r7.f76032a
                                android.text.Layout r7 = r7.getLayout()
                                int r8 = r0 + -2
                                int r7 = r7.getLineEnd(r8)
                                java.lang.CharSequence r3 = r3.subSequence(r6, r7)
                                com.ss.android.ugc.aweme.feed.ui.be r7 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                                com.ss.android.ugc.aweme.feed.model.Aweme r7 = r7.f76169g
                                java.lang.String r7 = r7.getDesc()
                                int r7 = r7.length()
                                int r8 = com.p280ss.android.ugc.aweme.commercialize.p1114a.C24507b.C24508a.f64682b
                                if (r7 <= r8) goto L_0x012a
                                int r3 = r3.length()
                                int r7 = com.p280ss.android.ugc.aweme.commercialize.p1114a.C24507b.C24508a.f64682b
                                if (r3 >= r7) goto L_0x012a
                                int r0 = r0 + 1
                                com.ss.android.ugc.aweme.feed.ui.be r3 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                                r3.mo74088a(r0)
                            L_0x012a:
                                r3 = r0
                                r2.removeOnGlobalLayoutListener(r1)
                                com.ss.android.ugc.aweme.feed.ui.be r0 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                                java.lang.String r0 = r0.mo74099i()
                                com.ss.android.ugc.aweme.feed.ui.be r2 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                                boolean r2 = r2.mo74101m()
                                if (r2 == 0) goto L_0x014f
                                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                                r2.<init>()
                                java.lang.String r7 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.m94890l()
                                r2.append(r7)
                                r2.append(r0)
                                java.lang.String r0 = r2.toString()
                            L_0x014f:
                                int r2 = r0.length()
                                int r7 = r2 + 1
                                com.ss.android.ugc.aweme.main.i r8 = com.p280ss.android.ugc.aweme.C6903bc.m21487f()
                                com.ss.android.ugc.aweme.feed.ui.be r9 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                                com.ss.android.ugc.aweme.feed.model.Aweme r9 = r9.f76169g
                                boolean r8 = r8.mo84746a(r9)
                                r9 = 3
                                r10 = 2131823087(0x7f1109ef, float:1.9278964E38)
                                if (r8 == 0) goto L_0x0321
                                java.lang.String r8 = "VideoDescView"
                                java.lang.String r11 = "long video set desc"
                                com.p280ss.android.ugc.aweme.framework.p312a.C6921a.m21552a(r4, r8, r11)
                                com.ss.android.ugc.aweme.feed.ui.be r8 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                                com.ss.android.ugc.aweme.views.MentionTextView r8 = r8.f76032a
                                int r8 = r8.getLineCount()
                                if (r8 <= r3) goto L_0x02d4
                                com.ss.android.ugc.aweme.feed.ui.be r8 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                                android.content.Context r8 = r8.f76175m
                                boolean r9 = com.bytedance.ies.ugc.appcontext.C6399b.m19944t()
                                if (r9 == 0) goto L_0x0183
                                goto L_0x0186
                            L_0x0183:
                                r10 = 2131829400(0x7f112298, float:1.9291768E38)
                            L_0x0186:
                                r8.getString(r10)
                                com.ss.android.ugc.aweme.feed.ui.be r8 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                                com.ss.android.ugc.aweme.views.MentionTextView r8 = r8.f76032a
                                java.lang.CharSequence r8 = r8.getText()
                                boolean r9 = r8 instanceof android.text.SpannableString
                                if (r9 == 0) goto L_0x02d3
                                boolean r9 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.m94889j()
                                if (r9 == 0) goto L_0x01ae
                                com.ss.android.ugc.aweme.feed.ui.be r2 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                                com.ss.android.ugc.aweme.views.MentionTextView r2 = r2.f76032a
                                android.text.Layout r2 = r2.getLayout()
                                int r3 = r3 + -2
                                int r2 = r2.getLineEnd(r3)
                                java.lang.CharSequence r2 = r8.subSequence(r6, r2)
                                goto L_0x01e8
                            L_0x01ae:
                                com.ss.android.ugc.aweme.feed.ui.be r9 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                                com.ss.android.ugc.aweme.views.MentionTextView r9 = r9.f76032a
                                android.text.Layout r9 = r9.getLayout()
                                int r3 = r3 - r5
                                int r3 = r9.getLineEnd(r3)
                                if (r3 < r7) goto L_0x01de
                                int r5 = r3 - r7
                                int r9 = r5 + 2
                                java.lang.CharSequence r5 = r8.subSequence(r5, r9)
                                java.lang.String r5 = r5.toString()
                                boolean r9 = com.bytedance.ies.ugc.appcontext.C6399b.m19944t()
                                boolean r5 = com.p280ss.android.ugc.aweme.video.hashtag.C43230c.m137142c(r5, r9)
                                if (r5 == 0) goto L_0x01de
                                int r7 = r7 + r4
                                int r3 = r3 - r7
                                int r2 = java.lang.Math.max(r6, r3)
                                java.lang.CharSequence r2 = r8.subSequence(r6, r2)
                                goto L_0x01e8
                            L_0x01de:
                                int r2 = r2 + r4
                                int r3 = r3 - r2
                                int r2 = java.lang.Math.max(r6, r3)
                                java.lang.CharSequence r2 = r8.subSequence(r6, r2)
                            L_0x01e8:
                                android.text.SpannableStringBuilder r14 = new android.text.SpannableStringBuilder
                                r14.<init>(r2)
                                com.ss.android.ugc.aweme.feed.ui.be r3 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                                com.ss.android.ugc.aweme.feed.model.Aweme r3 = r3.f76169g
                                boolean r3 = r3.isAd()
                                if (r3 == 0) goto L_0x020c
                                java.lang.String r3 = r2.toString()
                                java.lang.String r4 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.m94890l()
                                boolean r3 = r3.contains(r4)
                                if (r3 != 0) goto L_0x020c
                                java.lang.String r3 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.m94890l()
                                r14.append(r3)
                            L_0x020c:
                                java.lang.String r3 = r2.toString()
                                java.lang.String r4 = " [r]"
                                boolean r3 = r3.contains(r4)
                                if (r3 != 0) goto L_0x0295
                                boolean r3 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.m94889j()
                                if (r3 == 0) goto L_0x0273
                                java.lang.String r0 = " [r]"
                                r14.append(r0)
                                com.ss.android.ugc.aweme.main.i r9 = com.p280ss.android.ugc.aweme.C6903bc.m21487f()
                                com.ss.android.ugc.aweme.feed.ui.be r0 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                                android.content.Context r10 = r0.f76175m
                                com.ss.android.ugc.aweme.feed.ui.be r0 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                                com.ss.android.ugc.aweme.feed.model.Aweme r11 = r0.f76169g
                                com.ss.android.ugc.aweme.feed.ui.be r0 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                                java.lang.String r12 = r0.f76170h
                                com.ss.android.ugc.aweme.feed.ui.be r0 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                                int r13 = r0.f76173k
                                android.text.SpannableStringBuilder r0 = r9.mo84744a(r10, r11, r12, r13, r14)
                                java.lang.String r3 = "..."
                                android.text.SpannableStringBuilder r14 = r0.append(r3)
                                com.ss.android.ugc.aweme.main.i r15 = com.p280ss.android.ugc.aweme.C6903bc.m21487f()
                                com.ss.android.ugc.aweme.feed.ui.be r0 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                                android.content.Context r0 = r0.f76175m
                                com.ss.android.ugc.aweme.feed.ui.be r3 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                                com.ss.android.ugc.aweme.feed.model.Aweme r3 = r3.f76169g
                                com.ss.android.ugc.aweme.feed.ui.be r4 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                                java.lang.String r4 = r4.f76170h
                                com.ss.android.ugc.aweme.feed.ui.be r5 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                                int r5 = r5.f76173k
                                android.text.SpannableStringBuilder r20 = android.text.SpannableStringBuilder.valueOf(r8)
                                r16 = r0
                                r17 = r3
                                r18 = r4
                                r19 = r5
                                android.text.SpannableStringBuilder r0 = r15.mo84744a(r16, r17, r18, r19, r20)
                                com.ss.android.ugc.aweme.feed.ui.be r3 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                                com.ss.android.ugc.aweme.feed.ui.be r4 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                                com.ss.android.ugc.aweme.feed.model.Aweme r4 = r4.f76169g
                                boolean r4 = r4.isAd()
                                r3.mo74090a(r14, r0, r4)
                                goto L_0x0298
                            L_0x0273:
                                android.text.SpannableStringBuilder r0 = r14.append(r0)
                                java.lang.String r3 = " [r]"
                                r0.append(r3)
                                com.ss.android.ugc.aweme.main.i r9 = com.p280ss.android.ugc.aweme.C6903bc.m21487f()
                                com.ss.android.ugc.aweme.feed.ui.be r0 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                                android.content.Context r10 = r0.f76175m
                                com.ss.android.ugc.aweme.feed.ui.be r0 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                                com.ss.android.ugc.aweme.feed.model.Aweme r11 = r0.f76169g
                                com.ss.android.ugc.aweme.feed.ui.be r0 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                                java.lang.String r12 = r0.f76170h
                                com.ss.android.ugc.aweme.feed.ui.be r0 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                                int r13 = r0.f76173k
                                android.text.SpannableStringBuilder r14 = r9.mo84744a(r10, r11, r12, r13, r14)
                                goto L_0x0298
                            L_0x0295:
                                r14.append(r0)
                            L_0x0298:
                                com.ss.android.ugc.aweme.feed.ui.be r0 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                                boolean r0 = r0.mo74101m()
                                if (r0 == 0) goto L_0x02ab
                                com.ss.android.ugc.aweme.feed.ui.be r0 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                                int r2 = r2.length()
                                java.lang.CharSequence r0 = r0.mo74087a(r14, r2)
                                goto L_0x02ac
                            L_0x02ab:
                                r0 = r14
                            L_0x02ac:
                                com.ss.android.ugc.aweme.feed.ui.be r2 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                                r2.mo74093a(r0)
                                com.ss.android.ugc.aweme.feed.ui.be r0 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                                com.ss.android.ugc.aweme.views.MentionTextView r0 = r0.f76032a
                                com.ss.android.ugc.aweme.feed.ui.be r2 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                                com.ss.android.ugc.aweme.views.MentionTextView r2 = r2.f76032a
                                int r2 = r2.getCurrentTextColor()
                                r0.setSpanColor(r2)
                                boolean r0 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.m94889j()
                                if (r0 == 0) goto L_0x02d3
                                com.ss.android.ugc.aweme.feed.ui.be r0 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                                r0.f76037f = r14
                                com.ss.android.ugc.aweme.feed.ui.be r0 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                                android.text.SpannableStringBuilder r2 = new android.text.SpannableStringBuilder
                                r2.<init>(r8)
                                r0.f76035d = r2
                            L_0x02d3:
                                return
                            L_0x02d4:
                                boolean r0 = com.bytedance.ies.ugc.appcontext.C6399b.m19944t()
                                if (r0 != 0) goto L_0x0320
                                com.ss.android.ugc.aweme.feed.ui.be r0 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                                com.ss.android.ugc.aweme.views.MentionTextView r0 = r0.f76032a
                                int r0 = r0.getLineCount()
                                if (r0 != r4) goto L_0x0320
                                com.ss.android.ugc.aweme.feed.ui.be r2 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                                com.ss.android.ugc.aweme.views.MentionTextView r2 = r2.f76032a
                                java.lang.CharSequence r2 = r2.getText()
                                com.ss.android.ugc.aweme.feed.ui.be r3 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                                com.ss.android.ugc.aweme.views.MentionTextView r3 = r3.f76032a
                                android.text.Layout r3 = r3.getLayout()
                                int r0 = r0 - r5
                                int r0 = r3.getLineStart(r0)
                                com.ss.android.ugc.aweme.feed.ui.be r3 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                                com.ss.android.ugc.aweme.views.MentionTextView r3 = r3.f76032a
                                java.lang.CharSequence r3 = r3.getText()
                                int r3 = r3.length()
                                java.lang.CharSequence r0 = r2.subSequence(r0, r3)
                                java.lang.String r2 = "[r]"
                                boolean r2 = android.text.TextUtils.equals(r2, r0)
                                if (r2 != 0) goto L_0x0320
                                java.lang.String r2 = "[r]"
                                boolean r0 = r2.contains(r0)
                                if (r0 == 0) goto L_0x0320
                                com.ss.android.ugc.aweme.feed.ui.be r0 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                                com.ss.android.ugc.aweme.views.MentionTextView r0 = r0.f76032a
                                r0.setMaxLines(r9)
                            L_0x0320:
                                return
                            L_0x0321:
                                com.ss.android.ugc.aweme.feed.ui.be r4 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                                com.ss.android.ugc.aweme.views.MentionTextView r4 = r4.f76032a
                                int r4 = r4.getLineCount()
                                if (r4 != 0) goto L_0x032d
                                r4 = r3
                                goto L_0x0335
                            L_0x032d:
                                com.ss.android.ugc.aweme.feed.ui.be r4 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                                com.ss.android.ugc.aweme.views.MentionTextView r4 = r4.f76032a
                                int r4 = r4.getLineCount()
                            L_0x0335:
                                if (r4 <= r3) goto L_0x0647
                                boolean r8 = com.bytedance.ies.ugc.appcontext.C6399b.m19944t()
                                if (r8 == 0) goto L_0x0354
                                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                                java.lang.String r11 = " "
                                r8.<init>(r11)
                                com.ss.android.ugc.aweme.feed.ui.be r11 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                                android.content.Context r11 = r11.f76175m
                                java.lang.String r10 = r11.getString(r10)
                                r8.append(r10)
                                java.lang.String r8 = r8.toString()
                                goto L_0x035f
                            L_0x0354:
                                com.ss.android.ugc.aweme.feed.ui.be r8 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                                android.content.Context r8 = r8.f76175m
                                r10 = 2131829399(0x7f112297, float:1.9291766E38)
                                java.lang.String r8 = r8.getString(r10)
                            L_0x035f:
                                com.ss.android.ugc.aweme.feed.ui.be r10 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                                com.ss.android.ugc.aweme.views.MentionTextView r10 = r10.f76032a
                                android.text.Layout r10 = r10.getLayout()
                                if (r10 == 0) goto L_0x0378
                                com.ss.android.ugc.aweme.feed.ui.be r10 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                                com.ss.android.ugc.aweme.views.MentionTextView r10 = r10.f76032a
                                android.text.Layout r10 = r10.getLayout()
                                int r11 = r3 + -1
                                int r10 = r10.getLineEnd(r11)
                                goto L_0x0379
                            L_0x0378:
                                r10 = 0
                            L_0x0379:
                                com.ss.android.ugc.aweme.feed.ui.be r11 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                                com.ss.android.ugc.aweme.views.MentionTextView r11 = r11.f76032a
                                java.lang.CharSequence r11 = r11.getText()
                                java.lang.String r12 = "VideoDescView"
                                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                                java.lang.String r14 = "Desc more than 4 lines, lineCount is "
                                r13.<init>(r14)
                                com.ss.android.ugc.aweme.feed.ui.be r14 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                                com.ss.android.ugc.aweme.views.MentionTextView r14 = r14.f76032a
                                int r14 = r14.getLineCount()
                                r13.append(r14)
                                java.lang.String r14 = "content is "
                                r13.append(r14)
                                r13.append(r11)
                                java.lang.String r13 = r13.toString()
                                com.p280ss.android.ugc.aweme.framework.p312a.C6921a.m21552a(r9, r12, r13)
                                com.ss.android.ugc.aweme.feed.ui.be r9 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                                com.ss.android.ugc.aweme.feed.ui.be r12 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                                com.ss.android.ugc.aweme.views.MentionTextView r12 = r12.f76032a
                                int r12 = r12.getHeight()
                                r9.f76036e = r12
                                com.ss.android.ugc.aweme.feed.ui.be r9 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                                com.ss.android.ugc.aweme.views.MentionTextView r9 = r9.f76032a
                                android.text.TextPaint r9 = r9.getPaint()
                                float r8 = r9.measureText(r8)
                                r9 = 12
                                if (r4 < r9) goto L_0x03e0
                                r4 = 11
                                com.ss.android.ugc.aweme.feed.ui.be r9 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                                com.ss.android.ugc.aweme.views.MentionTextView r9 = r9.f76032a
                                android.text.Layout r9 = r9.getLayout()
                                if (r9 == 0) goto L_0x03e0
                                com.ss.android.ugc.aweme.feed.ui.be r9 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                                com.ss.android.ugc.aweme.views.MentionTextView r9 = r9.f76032a
                                android.text.Layout r9 = r9.getLayout()
                                r12 = 10
                                int r9 = r9.getLineEnd(r12)
                                java.lang.CharSequence r11 = r11.subSequence(r6, r9)
                                r9 = 1
                                goto L_0x03e1
                            L_0x03e0:
                                r9 = 0
                            L_0x03e1:
                                r12 = 0
                                com.ss.android.ugc.aweme.feed.ui.be r13 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                                com.ss.android.ugc.aweme.views.MentionTextView r13 = r13.f76032a
                                android.text.Layout r13 = r13.getLayout()
                                if (r13 == 0) goto L_0x041c
                                com.ss.android.ugc.aweme.feed.ui.be r12 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                                com.ss.android.ugc.aweme.views.MentionTextView r12 = r12.f76032a
                                int r12 = r12.getWidth()
                                float r12 = (float) r12
                                com.ss.android.ugc.aweme.feed.ui.be r13 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                                com.ss.android.ugc.aweme.views.MentionTextView r13 = r13.f76032a
                                android.text.TextPaint r13 = r13.getPaint()
                                com.ss.android.ugc.aweme.feed.ui.be r14 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                                com.ss.android.ugc.aweme.views.MentionTextView r14 = r14.f76032a
                                android.text.Layout r14 = r14.getLayout()
                                int r15 = r4 + -1
                                int r14 = r14.getLineStart(r15)
                                com.ss.android.ugc.aweme.feed.ui.be r5 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                                com.ss.android.ugc.aweme.views.MentionTextView r5 = r5.f76032a
                                android.text.Layout r5 = r5.getLayout()
                                int r5 = r5.getLineEnd(r15)
                                float r5 = r13.measureText(r11, r14, r5)
                                float r12 = r12 - r5
                            L_0x041c:
                                int r5 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
                                if (r5 >= 0) goto L_0x0433
                                com.ss.android.ugc.aweme.feed.ui.be r5 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                                com.ss.android.ugc.aweme.feed.ui.be r8 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                                int r8 = r8.f76036e
                                com.ss.android.ugc.aweme.feed.ui.be r12 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                                int r12 = r12.f76036e
                                int r12 = r12 / r4
                                int r8 = r8 + r12
                                r5.f76036e = r8
                                int r4 = r4 + 1
                                r21 = 1
                                goto L_0x0435
                            L_0x0433:
                                r21 = 0
                            L_0x0435:
                                com.ss.android.ugc.aweme.feed.ui.be r5 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                                com.ss.android.ugc.aweme.feed.ui.be r8 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                                int r8 = r8.mo74100k()
                                com.ss.android.ugc.aweme.feed.ui.be r12 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                                int r12 = r12.f76036e
                                int r8 = r8 * r12
                                int r8 = r8 / r4
                                r5.f76038r = r8
                                boolean r5 = r11 instanceof android.text.SpannableString
                                if (r5 == 0) goto L_0x0646
                                if (r10 != 0) goto L_0x0452
                                int r5 = r11.length()
                                int r10 = r5 / 2
                            L_0x0452:
                                if (r10 < r7) goto L_0x0473
                                int r5 = r10 - r7
                                int r7 = r5 + 2
                                java.lang.CharSequence r7 = r11.subSequence(r5, r7)
                                java.lang.String r7 = r7.toString()
                                boolean r8 = com.bytedance.ies.ugc.appcontext.C6399b.m19944t()
                                boolean r7 = com.p280ss.android.ugc.aweme.video.hashtag.C43230c.m137142c(r7, r8)
                                if (r7 == 0) goto L_0x0473
                                int r2 = java.lang.Math.max(r6, r5)
                                java.lang.CharSequence r2 = r11.subSequence(r6, r2)
                                goto L_0x0488
                            L_0x0473:
                                boolean r5 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.m94889j()
                                if (r5 == 0) goto L_0x047f
                                com.ss.android.ugc.aweme.feed.ui.be r5 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                                int r2 = r5.mo74086a(r11, r0, r2, r10)
                            L_0x047f:
                                int r10 = r10 - r2
                                int r2 = java.lang.Math.max(r6, r10)
                                java.lang.CharSequence r2 = r11.subSequence(r6, r2)
                            L_0x0488:
                                android.text.SpannableStringBuilder r5 = new android.text.SpannableStringBuilder
                                r5.<init>(r2)
                                com.ss.android.ugc.aweme.feed.ui.be r2 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                                boolean r2 = r2.mo74101m()
                                if (r2 == 0) goto L_0x049c
                                java.lang.String r2 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.m94890l()
                                r5.append(r2)
                            L_0x049c:
                                java.lang.String r2 = "..."
                                r5.append(r2)
                                boolean r7 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.m94889j()
                                if (r7 == 0) goto L_0x05c6
                                android.text.SpannableStringBuilder r7 = new android.text.SpannableStringBuilder
                                android.text.SpannableString r8 = android.text.SpannableString.valueOf(r11)
                                r7.<init>(r8)
                                if (r21 == 0) goto L_0x04b7
                                java.lang.String r8 = "\n"
                                r7.append(r8)
                            L_0x04b7:
                                if (r9 == 0) goto L_0x04be
                                java.lang.String r8 = "..."
                                r7.append(r8)
                            L_0x04be:
                                boolean r8 = com.bytedance.ies.ugc.appcontext.C6399b.m19944t()
                                if (r8 == 0) goto L_0x04d1
                                com.ss.android.ugc.aweme.feed.ui.be r8 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                                com.ss.android.ugc.aweme.views.MentionTextView r8 = r8.f76032a
                                com.ss.android.ugc.aweme.feed.ui.be r9 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                                int r9 = r9.mo74100k()
                                r8.setLines(r9)
                            L_0x04d1:
                                com.ss.android.ugc.aweme.feed.ui.be r8 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                                r8.mo74093a(r5)
                                com.ss.android.ugc.aweme.feed.ui.be r8 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                                com.ss.android.ugc.aweme.views.MentionTextView r8 = r8.f76032a
                                int r8 = r8.getLineCount()
                                if (r8 != r3) goto L_0x05b1
                                com.ss.android.ugc.aweme.feed.ui.be r8 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                                com.ss.android.ugc.aweme.feed.model.Aweme r8 = r8.f76169g
                                boolean r8 = r8.isAd()
                                if (r8 != 0) goto L_0x05b1
                                com.ss.android.ugc.aweme.feed.ui.be r8 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this     // Catch:{ Exception -> 0x059a }
                                com.ss.android.ugc.aweme.views.MentionTextView r8 = r8.f76032a     // Catch:{ Exception -> 0x059a }
                                android.text.Layout r8 = r8.getLayout()     // Catch:{ Exception -> 0x059a }
                                int r9 = r3 + -1
                                int r8 = r8.getLineEnd(r9)     // Catch:{ Exception -> 0x059a }
                                com.ss.android.ugc.aweme.feed.ui.be r10 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this     // Catch:{ Exception -> 0x059a }
                                com.ss.android.ugc.aweme.views.MentionTextView r10 = r10.f76032a     // Catch:{ Exception -> 0x059a }
                                int r10 = r10.getWidth()     // Catch:{ Exception -> 0x059a }
                                float r10 = (float) r10     // Catch:{ Exception -> 0x059a }
                                com.ss.android.ugc.aweme.feed.ui.be r11 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this     // Catch:{ Exception -> 0x059a }
                                com.ss.android.ugc.aweme.views.MentionTextView r11 = r11.f76032a     // Catch:{ Exception -> 0x059a }
                                android.text.TextPaint r11 = r11.getPaint()     // Catch:{ Exception -> 0x059a }
                                com.ss.android.ugc.aweme.feed.ui.be r12 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this     // Catch:{ Exception -> 0x059a }
                                com.ss.android.ugc.aweme.views.MentionTextView r12 = r12.f76032a     // Catch:{ Exception -> 0x059a }
                                java.lang.CharSequence r12 = r12.getText()     // Catch:{ Exception -> 0x059a }
                                com.ss.android.ugc.aweme.feed.ui.be r13 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this     // Catch:{ Exception -> 0x059a }
                                com.ss.android.ugc.aweme.views.MentionTextView r13 = r13.f76032a     // Catch:{ Exception -> 0x059a }
                                android.text.Layout r13 = r13.getLayout()     // Catch:{ Exception -> 0x059a }
                                int r13 = r13.getLineStart(r9)     // Catch:{ Exception -> 0x059a }
                                float r11 = r11.measureText(r12, r13, r8)     // Catch:{ Exception -> 0x059a }
                                float r10 = r10 - r11
                                com.ss.android.ugc.aweme.feed.ui.be r11 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this     // Catch:{ Exception -> 0x059a }
                                com.ss.android.ugc.aweme.views.MentionTextView r11 = r11.f76032a     // Catch:{ Exception -> 0x059a }
                                android.text.TextPaint r11 = r11.getPaint()     // Catch:{ Exception -> 0x059a }
                                float r11 = r11.measureText(r0)     // Catch:{ Exception -> 0x059a }
                                r12 = r8
                                r8 = r5
                            L_0x0530:
                                int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
                                if (r10 >= 0) goto L_0x059f
                                int r10 = r0.length()     // Catch:{ Exception -> 0x0598 }
                                int r12 = r12 - r10
                                java.lang.CharSequence r10 = r8.subSequence(r6, r12)     // Catch:{ Exception -> 0x0598 }
                                com.ss.android.ugc.aweme.feed.ui.be r8 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this     // Catch:{ Exception -> 0x0595 }
                                android.text.SpannableStringBuilder r12 = new android.text.SpannableStringBuilder     // Catch:{ Exception -> 0x0595 }
                                r12.<init>(r10)     // Catch:{ Exception -> 0x0595 }
                                java.lang.String r13 = "..."
                                android.text.SpannableStringBuilder r12 = r12.append(r13)     // Catch:{ Exception -> 0x0595 }
                                r8.mo74093a(r12)     // Catch:{ Exception -> 0x0595 }
                                com.ss.android.ugc.aweme.feed.ui.be r8 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this     // Catch:{ Exception -> 0x0595 }
                                com.ss.android.ugc.aweme.views.MentionTextView r8 = r8.f76032a     // Catch:{ Exception -> 0x0595 }
                                int r8 = r8.getLineCount()     // Catch:{ Exception -> 0x0595 }
                                if (r8 != r3) goto L_0x0593
                                com.ss.android.ugc.aweme.feed.ui.be r8 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this     // Catch:{ Exception -> 0x0595 }
                                com.ss.android.ugc.aweme.views.MentionTextView r8 = r8.f76032a     // Catch:{ Exception -> 0x0595 }
                                android.text.Layout r8 = r8.getLayout()     // Catch:{ Exception -> 0x0595 }
                                int r12 = r8.getLineEnd(r9)     // Catch:{ Exception -> 0x0595 }
                                com.ss.android.ugc.aweme.feed.ui.be r8 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this     // Catch:{ Exception -> 0x0595 }
                                com.ss.android.ugc.aweme.views.MentionTextView r8 = r8.f76032a     // Catch:{ Exception -> 0x0595 }
                                int r8 = r8.getWidth()     // Catch:{ Exception -> 0x0595 }
                                float r8 = (float) r8     // Catch:{ Exception -> 0x0595 }
                                com.ss.android.ugc.aweme.feed.ui.be r13 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this     // Catch:{ Exception -> 0x0595 }
                                com.ss.android.ugc.aweme.views.MentionTextView r13 = r13.f76032a     // Catch:{ Exception -> 0x0595 }
                                android.text.TextPaint r13 = r13.getPaint()     // Catch:{ Exception -> 0x0595 }
                                com.ss.android.ugc.aweme.feed.ui.be r14 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this     // Catch:{ Exception -> 0x0595 }
                                com.ss.android.ugc.aweme.views.MentionTextView r14 = r14.f76032a     // Catch:{ Exception -> 0x0595 }
                                java.lang.CharSequence r14 = r14.getText()     // Catch:{ Exception -> 0x0595 }
                                com.ss.android.ugc.aweme.feed.ui.be r15 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this     // Catch:{ Exception -> 0x0595 }
                                com.ss.android.ugc.aweme.views.MentionTextView r15 = r15.f76032a     // Catch:{ Exception -> 0x0595 }
                                android.text.Layout r15 = r15.getLayout()     // Catch:{ Exception -> 0x0595 }
                                int r15 = r15.getLineStart(r9)     // Catch:{ Exception -> 0x0595 }
                                float r13 = r13.measureText(r14, r15, r12)     // Catch:{ Exception -> 0x0595 }
                                float r8 = r8 - r13
                                r22 = r10
                                r10 = r8
                                r8 = r22
                                goto L_0x0530
                            L_0x0593:
                                r8 = r10
                                goto L_0x059f
                            L_0x0595:
                                r0 = move-exception
                                r8 = r10
                                goto L_0x059c
                            L_0x0598:
                                r0 = move-exception
                                goto L_0x059c
                            L_0x059a:
                                r0 = move-exception
                                r8 = r5
                            L_0x059c:
                                com.p280ss.android.ugc.aweme.framework.p312a.C6921a.m21554a(r0)
                            L_0x059f:
                                boolean r0 = android.text.TextUtils.equals(r8, r5)
                                if (r0 != 0) goto L_0x05b1
                                android.text.SpannableStringBuilder r0 = new android.text.SpannableStringBuilder
                                r0.<init>(r8)
                                java.lang.String r5 = "..."
                                android.text.SpannableStringBuilder r0 = r0.append(r5)
                                r5 = r0
                            L_0x05b1:
                                com.ss.android.ugc.aweme.feed.ui.be r0 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                                com.ss.android.ugc.aweme.feed.ui.be r6 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                                com.ss.android.ugc.aweme.feed.model.Aweme r6 = r6.f76169g
                                boolean r6 = r6.isAd()
                                r0.mo74090a(r5, r7, r6)
                                com.ss.android.ugc.aweme.feed.ui.be r0 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                                r0.f76037f = r5
                                com.ss.android.ugc.aweme.feed.ui.be r0 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                                r0.f76035d = r7
                            L_0x05c6:
                                com.ss.android.ugc.aweme.feed.ui.be r0 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                                com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.f76169g
                                r0.setEllipsizeDesc(r5)
                                com.ss.android.ugc.aweme.feed.ui.be r0 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                                boolean r0 = r0.mo74101m()
                                if (r0 == 0) goto L_0x05f6
                                com.ss.android.ugc.aweme.feed.ui.be r0 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                                int r6 = r5.length()
                                java.lang.String r7 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.m94890l()
                                int r7 = r7.length()
                                int r6 = r6 - r7
                                int r2 = r2.length()
                                int r6 = r6 - r2
                                java.lang.CharSequence r5 = r0.mo74087a(r5, r6)
                                com.ss.android.ugc.aweme.feed.ui.be r0 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                                android.text.SpannableStringBuilder r2 = new android.text.SpannableStringBuilder
                                r2.<init>(r5)
                                r0.f76037f = r2
                            L_0x05f6:
                                com.ss.android.ugc.aweme.feed.ui.be r0 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                                r0.mo74093a(r5)
                                com.ss.android.ugc.aweme.feed.ui.be r0 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                                com.ss.android.ugc.aweme.views.MentionTextView r0 = r0.f76032a
                                android.text.Layout r0 = r0.getLayout()
                                if (r0 == 0) goto L_0x062b
                                com.ss.android.ugc.aweme.feed.ui.be r0 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                                com.ss.android.ugc.aweme.views.MentionTextView r0 = r0.f76032a
                                android.text.Layout r0 = r0.getLayout()
                                int r0 = r0.getLineCount()
                                com.ss.android.ugc.aweme.feed.ui.be r2 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                                com.ss.android.ugc.aweme.feed.model.Aweme r2 = r2.f76169g
                                boolean r2 = r2.isAd()
                                if (r2 == 0) goto L_0x062b
                                if (r0 <= r3) goto L_0x062b
                                com.ss.android.ugc.aweme.feed.ui.be r2 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                                com.ss.android.ugc.aweme.views.MentionTextView r2 = r2.f76032a
                                r2.setLines(r0)
                                com.ss.android.ugc.aweme.feed.ui.be r2 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                                com.ss.android.ugc.aweme.feed.model.Aweme r2 = r2.f76169g
                                r2.setAdDescMaxLines(r0)
                            L_0x062b:
                                com.ss.android.ugc.aweme.feed.ui.be r0 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                                com.ss.android.ugc.aweme.views.MentionTextView r0 = r0.f76032a
                                com.ss.android.ugc.aweme.feed.ui.be r2 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                                com.ss.android.ugc.aweme.views.MentionTextView r2 = r2.f76032a
                                int r2 = r2.getCurrentTextColor()
                                r0.setSpanColor(r2)
                                com.ss.android.ugc.aweme.feed.ui.be r0 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                                com.ss.android.ugc.aweme.views.MentionTextView r0 = r0.f76032a
                                com.ss.android.ugc.aweme.feed.ui.bn r2 = new com.ss.android.ugc.aweme.feed.ui.bn
                                r2.<init>(r1, r4)
                                r0.post(r2)
                            L_0x0646:
                                return
                            L_0x0647:
                                com.ss.android.ugc.aweme.feed.ui.be r0 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                                com.ss.android.ugc.aweme.views.MentionTextView r0 = r0.f76032a
                                com.ss.android.ugc.aweme.feed.ui.bo r2 = new com.ss.android.ugc.aweme.feed.ui.bo
                                r2.<init>(r1)
                                r0.post(r2)
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.C288371.onGlobalLayout():void");
                        }

                        /* access modifiers changed from: 0000 */
                        /* renamed from: a */
                        public final /* synthetic */ void mo74106a(int i) {
                            C28836be.this.f76038r = C28836be.this.f76032a.getHeight();
                            C28836be.this.f76036e = (C28836be.this.f76038r * i) / C28836be.this.mo74100k();
                            C28836be.this.mo74094a(true);
                        }
                    });
                }
                this.f76032a.setMovementMethod(C29054g.m95349a());
                this.f76032a.getViewTreeObserver().addOnGlobalLayoutListener(new OnGlobalLayoutListener() {
                    /* access modifiers changed from: 0000 */
                    /* renamed from: a */
                    public final /* synthetic */ void mo74105a() {
                        if (C28836be.this.f76032a.getLineCount() != 0) {
                            C28836be.this.f76032a.setLines(C28836be.this.f76032a.getLineCount());
                            C28836be.this.mo74094a(false);
                        }
                    }

                    /* JADX WARNING: type inference failed for: r5v4, types: [android.text.SpannableStringBuilder, java.lang.CharSequence] */
                    /* JADX WARNING: type inference failed for: r5v5, types: [android.text.SpannableStringBuilder, java.lang.CharSequence] */
                    /* JADX WARNING: type inference failed for: r5v6, types: [java.lang.CharSequence] */
                    /* JADX WARNING: type inference failed for: r5v7, types: [java.lang.CharSequence] */
                    /* JADX WARNING: type inference failed for: r5v8, types: [android.text.SpannableStringBuilder] */
                    /* JADX WARNING: type inference failed for: r8v18, types: [java.lang.CharSequence] */
                    /* JADX WARNING: type inference failed for: r0v31, types: [android.text.SpannableStringBuilder] */
                    /* JADX WARNING: type inference failed for: r5v10 */
                    /* JADX WARNING: type inference failed for: r8v19 */
                    /* JADX WARNING: type inference failed for: r8v20 */
                    /* JADX WARNING: type inference failed for: r8v25 */
                    /* JADX WARNING: type inference failed for: r8v26, types: [java.lang.CharSequence] */
                    /* JADX WARNING: type inference failed for: r10v14, types: [java.lang.CharSequence] */
                    /* JADX WARNING: type inference failed for: r8v27 */
                    /* JADX WARNING: type inference failed for: r8v32 */
                    /* JADX WARNING: type inference failed for: r22v0 */
                    /* JADX WARNING: type inference failed for: r8v41 */
                    /* JADX WARNING: type inference failed for: r14v12, types: [android.text.SpannableStringBuilder] */
                    /* JADX WARNING: type inference failed for: r14v13, types: [android.text.SpannableStringBuilder, java.lang.CharSequence] */
                    /* JADX WARNING: type inference failed for: r0v48, types: [java.lang.CharSequence] */
                    /* JADX WARNING: type inference failed for: r0v54 */
                    /* JADX WARNING: type inference failed for: r0v56, types: [java.lang.CharSequence] */
                    /* JADX WARNING: type inference failed for: r14v14, types: [android.text.SpannableStringBuilder] */
                    /* JADX WARNING: type inference failed for: r14v15, types: [android.text.SpannableStringBuilder] */
                    /* JADX WARNING: type inference failed for: r5v27 */
                    /* JADX WARNING: type inference failed for: r5v28 */
                    /* JADX WARNING: type inference failed for: r8v75 */
                    /* JADX WARNING: type inference failed for: r8v76 */
                    /* JADX WARNING: type inference failed for: r8v77 */
                    /* JADX WARNING: type inference failed for: r14v16 */
                    /* JADX WARNING: type inference failed for: r0v81 */
                    /* JADX WARNING: type inference failed for: r14v17 */
                    /* JADX WARNING: type inference failed for: r14v18 */
                    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r5v4, types: [android.text.SpannableStringBuilder, java.lang.CharSequence]
                      assigns: [android.text.SpannableStringBuilder, ?[OBJECT, ARRAY], java.lang.CharSequence]
                      uses: [android.text.SpannableStringBuilder, java.lang.CharSequence, ?[OBJECT, ARRAY]]
                      mth insns count: 617
                    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
                    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
                    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
                    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
                    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
                    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
                    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
                    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
                    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
                    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
                     */
                    /* JADX WARNING: Removed duplicated region for block: B:106:0x03ec  */
                    /* JADX WARNING: Removed duplicated region for block: B:109:0x0420  */
                    /* JADX WARNING: Removed duplicated region for block: B:110:0x0433  */
                    /* JADX WARNING: Removed duplicated region for block: B:113:0x044a  */
                    /* JADX WARNING: Removed duplicated region for block: B:125:0x0495  */
                    /* JADX WARNING: Removed duplicated region for block: B:128:0x04a7  */
                    /* JADX WARNING: Removed duplicated region for block: B:161:0x05a5  */
                    /* JADX WARNING: Removed duplicated region for block: B:165:0x05d5  */
                    /* JADX WARNING: Removed duplicated region for block: B:168:0x0605  */
                    /* JADX WARNING: Unknown variable types count: 15 */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final void onGlobalLayout() {
                        /*
                            r23 = this;
                            r1 = r23
                            com.ss.android.ugc.aweme.feed.ui.be r0 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                            int r0 = r0.mo74100k()
                            com.ss.android.ugc.aweme.feed.ui.be r2 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                            com.ss.android.ugc.aweme.views.MentionTextView r2 = r2.f76032a
                            android.view.ViewTreeObserver r2 = r2.getViewTreeObserver()
                            com.ss.android.ugc.aweme.feed.ui.be r3 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r3.f76169g
                            boolean r3 = r3.isAd()
                            r4 = 4
                            r5 = 1
                            r6 = 0
                            if (r3 == 0) goto L_0x012a
                            com.ss.android.ugc.aweme.feed.ui.be r3 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                            com.ss.android.ugc.aweme.views.MentionTextView r3 = r3.f76032a
                            int r3 = r3.getLineCount()
                            if (r3 <= r0) goto L_0x012a
                            com.ss.android.ugc.aweme.feed.ui.be r3 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r3.f76169g
                            boolean r3 = r3.isAdDescHandle()
                            if (r3 == 0) goto L_0x012a
                            com.ss.android.ugc.aweme.feed.ui.be r3 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                            com.ss.android.ugc.aweme.views.MentionTextView r3 = r3.f76032a
                            java.lang.CharSequence r3 = r3.getText()
                            com.ss.android.ugc.aweme.feed.ui.be r7 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                            com.ss.android.ugc.aweme.feed.model.Aweme r7 = r7.f76169g
                            java.lang.String r7 = r7.getDesc()
                            com.ss.android.ugc.aweme.feed.ui.be r8 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                            r8.mo74093a(r7)
                            com.ss.android.ugc.aweme.feed.ui.be r7 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                            com.ss.android.ugc.aweme.views.MentionTextView r7 = r7.f76032a
                            android.text.Layout r7 = r7.getLayout()
                            if (r7 != 0) goto L_0x0093
                            com.ss.android.ugc.aweme.feed.ui.be r0 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.f76169g
                            r0.setAdDescHandle(r6)
                            com.ss.android.ugc.aweme.feed.ui.be r0 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                            r0.mo74093a(r3)
                            java.lang.StringBuilder r0 = new java.lang.StringBuilder
                            java.lang.String r2 = "VideoDescView_onGlobalLayout_null + aid = "
                            r0.<init>(r2)
                            com.ss.android.ugc.aweme.feed.ui.be r2 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r2.f76169g
                            java.lang.String r2 = r2.getAid()
                            r0.append(r2)
                            java.lang.String r2 = "desc = "
                            r0.append(r2)
                            com.ss.android.ugc.aweme.feed.ui.be r2 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r2.f76169g
                            java.lang.String r2 = r2.getDesc()
                            r0.append(r2)
                            java.lang.String r0 = r0.toString()
                            com.p280ss.android.ugc.aweme.framework.p312a.C6921a.m21555a(r0)
                            com.ss.android.ugc.aweme.lancet.CommerceException r0 = new com.ss.android.ugc.aweme.lancet.CommerceException
                            java.lang.Throwable r2 = new java.lang.Throwable
                            r2.<init>()
                            r0.<init>(r2)
                            com.p280ss.android.ugc.aweme.framework.p312a.C6921a.m21559a(r0)
                            return
                        L_0x0093:
                            com.ss.android.ugc.aweme.feed.ui.be r7 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                            com.ss.android.ugc.aweme.views.MentionTextView r7 = r7.f76032a
                            android.text.Layout r7 = r7.getLayout()
                            if (r7 == 0) goto L_0x00b5
                            com.ss.android.ugc.aweme.feed.ui.be r7 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                            com.ss.android.ugc.aweme.views.MentionTextView r7 = r7.f76032a
                            android.text.Layout r7 = r7.getLayout()
                            int r7 = r7.getLineCount()
                            if (r7 > r0) goto L_0x00b5
                            int r0 = r0 + r5
                            com.ss.android.ugc.aweme.feed.ui.be r3 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                            r3.mo74088a(r0)
                            r2.removeOnGlobalLayoutListener(r1)
                            return
                        L_0x00b5:
                            int r7 = r3.length()
                            java.lang.String r8 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.m94890l()
                            int r8 = r8.length()
                            int r7 = r7 - r8
                            com.ss.android.ugc.aweme.main.i r8 = com.p280ss.android.ugc.aweme.C6903bc.m21487f()
                            com.ss.android.ugc.aweme.feed.ui.be r9 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                            com.ss.android.ugc.aweme.feed.model.Aweme r9 = r9.f76169g
                            boolean r8 = r8.mo84746a(r9)
                            if (r8 == 0) goto L_0x00d2
                            r8 = 4
                            goto L_0x00d3
                        L_0x00d2:
                            r8 = 0
                        L_0x00d3:
                            int r7 = r7 - r8
                            int r8 = com.p280ss.android.ugc.aweme.commercialize.p1114a.C24507b.C24508a.f64682b
                            if (r7 >= r8) goto L_0x00e0
                            int r0 = r0 + 1
                            com.ss.android.ugc.aweme.feed.ui.be r3 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                            r3.mo74088a(r0)
                            goto L_0x012a
                        L_0x00e0:
                            com.ss.android.ugc.aweme.feed.ui.be r7 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                            r7.mo74093a(r3)
                            boolean r7 = r3 instanceof android.text.SpannableString
                            if (r7 == 0) goto L_0x012a
                            boolean r7 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.m94889j()
                            if (r7 == 0) goto L_0x012a
                            com.ss.android.ugc.aweme.feed.ui.be r7 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                            com.ss.android.ugc.aweme.views.MentionTextView r7 = r7.f76032a
                            android.text.Layout r7 = r7.getLayout()
                            if (r7 == 0) goto L_0x012a
                            com.ss.android.ugc.aweme.feed.ui.be r7 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                            com.ss.android.ugc.aweme.views.MentionTextView r7 = r7.f76032a
                            android.text.Layout r7 = r7.getLayout()
                            int r8 = r0 + -2
                            int r7 = r7.getLineEnd(r8)
                            java.lang.CharSequence r3 = r3.subSequence(r6, r7)
                            com.ss.android.ugc.aweme.feed.ui.be r7 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                            com.ss.android.ugc.aweme.feed.model.Aweme r7 = r7.f76169g
                            java.lang.String r7 = r7.getDesc()
                            int r7 = r7.length()
                            int r8 = com.p280ss.android.ugc.aweme.commercialize.p1114a.C24507b.C24508a.f64682b
                            if (r7 <= r8) goto L_0x012a
                            int r3 = r3.length()
                            int r7 = com.p280ss.android.ugc.aweme.commercialize.p1114a.C24507b.C24508a.f64682b
                            if (r3 >= r7) goto L_0x012a
                            int r0 = r0 + 1
                            com.ss.android.ugc.aweme.feed.ui.be r3 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                            r3.mo74088a(r0)
                        L_0x012a:
                            r3 = r0
                            r2.removeOnGlobalLayoutListener(r1)
                            com.ss.android.ugc.aweme.feed.ui.be r0 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                            java.lang.String r0 = r0.mo74099i()
                            com.ss.android.ugc.aweme.feed.ui.be r2 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                            boolean r2 = r2.mo74101m()
                            if (r2 == 0) goto L_0x014f
                            java.lang.StringBuilder r2 = new java.lang.StringBuilder
                            r2.<init>()
                            java.lang.String r7 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.m94890l()
                            r2.append(r7)
                            r2.append(r0)
                            java.lang.String r0 = r2.toString()
                        L_0x014f:
                            int r2 = r0.length()
                            int r7 = r2 + 1
                            com.ss.android.ugc.aweme.main.i r8 = com.p280ss.android.ugc.aweme.C6903bc.m21487f()
                            com.ss.android.ugc.aweme.feed.ui.be r9 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                            com.ss.android.ugc.aweme.feed.model.Aweme r9 = r9.f76169g
                            boolean r8 = r8.mo84746a(r9)
                            r9 = 3
                            r10 = 2131823087(0x7f1109ef, float:1.9278964E38)
                            if (r8 == 0) goto L_0x0321
                            java.lang.String r8 = "VideoDescView"
                            java.lang.String r11 = "long video set desc"
                            com.p280ss.android.ugc.aweme.framework.p312a.C6921a.m21552a(r4, r8, r11)
                            com.ss.android.ugc.aweme.feed.ui.be r8 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                            com.ss.android.ugc.aweme.views.MentionTextView r8 = r8.f76032a
                            int r8 = r8.getLineCount()
                            if (r8 <= r3) goto L_0x02d4
                            com.ss.android.ugc.aweme.feed.ui.be r8 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                            android.content.Context r8 = r8.f76175m
                            boolean r9 = com.bytedance.ies.ugc.appcontext.C6399b.m19944t()
                            if (r9 == 0) goto L_0x0183
                            goto L_0x0186
                        L_0x0183:
                            r10 = 2131829400(0x7f112298, float:1.9291768E38)
                        L_0x0186:
                            r8.getString(r10)
                            com.ss.android.ugc.aweme.feed.ui.be r8 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                            com.ss.android.ugc.aweme.views.MentionTextView r8 = r8.f76032a
                            java.lang.CharSequence r8 = r8.getText()
                            boolean r9 = r8 instanceof android.text.SpannableString
                            if (r9 == 0) goto L_0x02d3
                            boolean r9 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.m94889j()
                            if (r9 == 0) goto L_0x01ae
                            com.ss.android.ugc.aweme.feed.ui.be r2 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                            com.ss.android.ugc.aweme.views.MentionTextView r2 = r2.f76032a
                            android.text.Layout r2 = r2.getLayout()
                            int r3 = r3 + -2
                            int r2 = r2.getLineEnd(r3)
                            java.lang.CharSequence r2 = r8.subSequence(r6, r2)
                            goto L_0x01e8
                        L_0x01ae:
                            com.ss.android.ugc.aweme.feed.ui.be r9 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                            com.ss.android.ugc.aweme.views.MentionTextView r9 = r9.f76032a
                            android.text.Layout r9 = r9.getLayout()
                            int r3 = r3 - r5
                            int r3 = r9.getLineEnd(r3)
                            if (r3 < r7) goto L_0x01de
                            int r5 = r3 - r7
                            int r9 = r5 + 2
                            java.lang.CharSequence r5 = r8.subSequence(r5, r9)
                            java.lang.String r5 = r5.toString()
                            boolean r9 = com.bytedance.ies.ugc.appcontext.C6399b.m19944t()
                            boolean r5 = com.p280ss.android.ugc.aweme.video.hashtag.C43230c.m137142c(r5, r9)
                            if (r5 == 0) goto L_0x01de
                            int r7 = r7 + r4
                            int r3 = r3 - r7
                            int r2 = java.lang.Math.max(r6, r3)
                            java.lang.CharSequence r2 = r8.subSequence(r6, r2)
                            goto L_0x01e8
                        L_0x01de:
                            int r2 = r2 + r4
                            int r3 = r3 - r2
                            int r2 = java.lang.Math.max(r6, r3)
                            java.lang.CharSequence r2 = r8.subSequence(r6, r2)
                        L_0x01e8:
                            android.text.SpannableStringBuilder r14 = new android.text.SpannableStringBuilder
                            r14.<init>(r2)
                            com.ss.android.ugc.aweme.feed.ui.be r3 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r3.f76169g
                            boolean r3 = r3.isAd()
                            if (r3 == 0) goto L_0x020c
                            java.lang.String r3 = r2.toString()
                            java.lang.String r4 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.m94890l()
                            boolean r3 = r3.contains(r4)
                            if (r3 != 0) goto L_0x020c
                            java.lang.String r3 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.m94890l()
                            r14.append(r3)
                        L_0x020c:
                            java.lang.String r3 = r2.toString()
                            java.lang.String r4 = " [r]"
                            boolean r3 = r3.contains(r4)
                            if (r3 != 0) goto L_0x0295
                            boolean r3 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.m94889j()
                            if (r3 == 0) goto L_0x0273
                            java.lang.String r0 = " [r]"
                            r14.append(r0)
                            com.ss.android.ugc.aweme.main.i r9 = com.p280ss.android.ugc.aweme.C6903bc.m21487f()
                            com.ss.android.ugc.aweme.feed.ui.be r0 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                            android.content.Context r10 = r0.f76175m
                            com.ss.android.ugc.aweme.feed.ui.be r0 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                            com.ss.android.ugc.aweme.feed.model.Aweme r11 = r0.f76169g
                            com.ss.android.ugc.aweme.feed.ui.be r0 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                            java.lang.String r12 = r0.f76170h
                            com.ss.android.ugc.aweme.feed.ui.be r0 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                            int r13 = r0.f76173k
                            android.text.SpannableStringBuilder r0 = r9.mo84744a(r10, r11, r12, r13, r14)
                            java.lang.String r3 = "..."
                            android.text.SpannableStringBuilder r14 = r0.append(r3)
                            com.ss.android.ugc.aweme.main.i r15 = com.p280ss.android.ugc.aweme.C6903bc.m21487f()
                            com.ss.android.ugc.aweme.feed.ui.be r0 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                            android.content.Context r0 = r0.f76175m
                            com.ss.android.ugc.aweme.feed.ui.be r3 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r3.f76169g
                            com.ss.android.ugc.aweme.feed.ui.be r4 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                            java.lang.String r4 = r4.f76170h
                            com.ss.android.ugc.aweme.feed.ui.be r5 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                            int r5 = r5.f76173k
                            android.text.SpannableStringBuilder r20 = android.text.SpannableStringBuilder.valueOf(r8)
                            r16 = r0
                            r17 = r3
                            r18 = r4
                            r19 = r5
                            android.text.SpannableStringBuilder r0 = r15.mo84744a(r16, r17, r18, r19, r20)
                            com.ss.android.ugc.aweme.feed.ui.be r3 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                            com.ss.android.ugc.aweme.feed.ui.be r4 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r4.f76169g
                            boolean r4 = r4.isAd()
                            r3.mo74090a(r14, r0, r4)
                            goto L_0x0298
                        L_0x0273:
                            android.text.SpannableStringBuilder r0 = r14.append(r0)
                            java.lang.String r3 = " [r]"
                            r0.append(r3)
                            com.ss.android.ugc.aweme.main.i r9 = com.p280ss.android.ugc.aweme.C6903bc.m21487f()
                            com.ss.android.ugc.aweme.feed.ui.be r0 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                            android.content.Context r10 = r0.f76175m
                            com.ss.android.ugc.aweme.feed.ui.be r0 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                            com.ss.android.ugc.aweme.feed.model.Aweme r11 = r0.f76169g
                            com.ss.android.ugc.aweme.feed.ui.be r0 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                            java.lang.String r12 = r0.f76170h
                            com.ss.android.ugc.aweme.feed.ui.be r0 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                            int r13 = r0.f76173k
                            android.text.SpannableStringBuilder r14 = r9.mo84744a(r10, r11, r12, r13, r14)
                            goto L_0x0298
                        L_0x0295:
                            r14.append(r0)
                        L_0x0298:
                            com.ss.android.ugc.aweme.feed.ui.be r0 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                            boolean r0 = r0.mo74101m()
                            if (r0 == 0) goto L_0x02ab
                            com.ss.android.ugc.aweme.feed.ui.be r0 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                            int r2 = r2.length()
                            java.lang.CharSequence r0 = r0.mo74087a(r14, r2)
                            goto L_0x02ac
                        L_0x02ab:
                            r0 = r14
                        L_0x02ac:
                            com.ss.android.ugc.aweme.feed.ui.be r2 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                            r2.mo74093a(r0)
                            com.ss.android.ugc.aweme.feed.ui.be r0 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                            com.ss.android.ugc.aweme.views.MentionTextView r0 = r0.f76032a
                            com.ss.android.ugc.aweme.feed.ui.be r2 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                            com.ss.android.ugc.aweme.views.MentionTextView r2 = r2.f76032a
                            int r2 = r2.getCurrentTextColor()
                            r0.setSpanColor(r2)
                            boolean r0 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.m94889j()
                            if (r0 == 0) goto L_0x02d3
                            com.ss.android.ugc.aweme.feed.ui.be r0 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                            r0.f76037f = r14
                            com.ss.android.ugc.aweme.feed.ui.be r0 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                            android.text.SpannableStringBuilder r2 = new android.text.SpannableStringBuilder
                            r2.<init>(r8)
                            r0.f76035d = r2
                        L_0x02d3:
                            return
                        L_0x02d4:
                            boolean r0 = com.bytedance.ies.ugc.appcontext.C6399b.m19944t()
                            if (r0 != 0) goto L_0x0320
                            com.ss.android.ugc.aweme.feed.ui.be r0 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                            com.ss.android.ugc.aweme.views.MentionTextView r0 = r0.f76032a
                            int r0 = r0.getLineCount()
                            if (r0 != r4) goto L_0x0320
                            com.ss.android.ugc.aweme.feed.ui.be r2 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                            com.ss.android.ugc.aweme.views.MentionTextView r2 = r2.f76032a
                            java.lang.CharSequence r2 = r2.getText()
                            com.ss.android.ugc.aweme.feed.ui.be r3 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                            com.ss.android.ugc.aweme.views.MentionTextView r3 = r3.f76032a
                            android.text.Layout r3 = r3.getLayout()
                            int r0 = r0 - r5
                            int r0 = r3.getLineStart(r0)
                            com.ss.android.ugc.aweme.feed.ui.be r3 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                            com.ss.android.ugc.aweme.views.MentionTextView r3 = r3.f76032a
                            java.lang.CharSequence r3 = r3.getText()
                            int r3 = r3.length()
                            java.lang.CharSequence r0 = r2.subSequence(r0, r3)
                            java.lang.String r2 = "[r]"
                            boolean r2 = android.text.TextUtils.equals(r2, r0)
                            if (r2 != 0) goto L_0x0320
                            java.lang.String r2 = "[r]"
                            boolean r0 = r2.contains(r0)
                            if (r0 == 0) goto L_0x0320
                            com.ss.android.ugc.aweme.feed.ui.be r0 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                            com.ss.android.ugc.aweme.views.MentionTextView r0 = r0.f76032a
                            r0.setMaxLines(r9)
                        L_0x0320:
                            return
                        L_0x0321:
                            com.ss.android.ugc.aweme.feed.ui.be r4 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                            com.ss.android.ugc.aweme.views.MentionTextView r4 = r4.f76032a
                            int r4 = r4.getLineCount()
                            if (r4 != 0) goto L_0x032d
                            r4 = r3
                            goto L_0x0335
                        L_0x032d:
                            com.ss.android.ugc.aweme.feed.ui.be r4 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                            com.ss.android.ugc.aweme.views.MentionTextView r4 = r4.f76032a
                            int r4 = r4.getLineCount()
                        L_0x0335:
                            if (r4 <= r3) goto L_0x0647
                            boolean r8 = com.bytedance.ies.ugc.appcontext.C6399b.m19944t()
                            if (r8 == 0) goto L_0x0354
                            java.lang.StringBuilder r8 = new java.lang.StringBuilder
                            java.lang.String r11 = " "
                            r8.<init>(r11)
                            com.ss.android.ugc.aweme.feed.ui.be r11 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                            android.content.Context r11 = r11.f76175m
                            java.lang.String r10 = r11.getString(r10)
                            r8.append(r10)
                            java.lang.String r8 = r8.toString()
                            goto L_0x035f
                        L_0x0354:
                            com.ss.android.ugc.aweme.feed.ui.be r8 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                            android.content.Context r8 = r8.f76175m
                            r10 = 2131829399(0x7f112297, float:1.9291766E38)
                            java.lang.String r8 = r8.getString(r10)
                        L_0x035f:
                            com.ss.android.ugc.aweme.feed.ui.be r10 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                            com.ss.android.ugc.aweme.views.MentionTextView r10 = r10.f76032a
                            android.text.Layout r10 = r10.getLayout()
                            if (r10 == 0) goto L_0x0378
                            com.ss.android.ugc.aweme.feed.ui.be r10 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                            com.ss.android.ugc.aweme.views.MentionTextView r10 = r10.f76032a
                            android.text.Layout r10 = r10.getLayout()
                            int r11 = r3 + -1
                            int r10 = r10.getLineEnd(r11)
                            goto L_0x0379
                        L_0x0378:
                            r10 = 0
                        L_0x0379:
                            com.ss.android.ugc.aweme.feed.ui.be r11 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                            com.ss.android.ugc.aweme.views.MentionTextView r11 = r11.f76032a
                            java.lang.CharSequence r11 = r11.getText()
                            java.lang.String r12 = "VideoDescView"
                            java.lang.StringBuilder r13 = new java.lang.StringBuilder
                            java.lang.String r14 = "Desc more than 4 lines, lineCount is "
                            r13.<init>(r14)
                            com.ss.android.ugc.aweme.feed.ui.be r14 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                            com.ss.android.ugc.aweme.views.MentionTextView r14 = r14.f76032a
                            int r14 = r14.getLineCount()
                            r13.append(r14)
                            java.lang.String r14 = "content is "
                            r13.append(r14)
                            r13.append(r11)
                            java.lang.String r13 = r13.toString()
                            com.p280ss.android.ugc.aweme.framework.p312a.C6921a.m21552a(r9, r12, r13)
                            com.ss.android.ugc.aweme.feed.ui.be r9 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                            com.ss.android.ugc.aweme.feed.ui.be r12 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                            com.ss.android.ugc.aweme.views.MentionTextView r12 = r12.f76032a
                            int r12 = r12.getHeight()
                            r9.f76036e = r12
                            com.ss.android.ugc.aweme.feed.ui.be r9 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                            com.ss.android.ugc.aweme.views.MentionTextView r9 = r9.f76032a
                            android.text.TextPaint r9 = r9.getPaint()
                            float r8 = r9.measureText(r8)
                            r9 = 12
                            if (r4 < r9) goto L_0x03e0
                            r4 = 11
                            com.ss.android.ugc.aweme.feed.ui.be r9 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                            com.ss.android.ugc.aweme.views.MentionTextView r9 = r9.f76032a
                            android.text.Layout r9 = r9.getLayout()
                            if (r9 == 0) goto L_0x03e0
                            com.ss.android.ugc.aweme.feed.ui.be r9 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                            com.ss.android.ugc.aweme.views.MentionTextView r9 = r9.f76032a
                            android.text.Layout r9 = r9.getLayout()
                            r12 = 10
                            int r9 = r9.getLineEnd(r12)
                            java.lang.CharSequence r11 = r11.subSequence(r6, r9)
                            r9 = 1
                            goto L_0x03e1
                        L_0x03e0:
                            r9 = 0
                        L_0x03e1:
                            r12 = 0
                            com.ss.android.ugc.aweme.feed.ui.be r13 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                            com.ss.android.ugc.aweme.views.MentionTextView r13 = r13.f76032a
                            android.text.Layout r13 = r13.getLayout()
                            if (r13 == 0) goto L_0x041c
                            com.ss.android.ugc.aweme.feed.ui.be r12 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                            com.ss.android.ugc.aweme.views.MentionTextView r12 = r12.f76032a
                            int r12 = r12.getWidth()
                            float r12 = (float) r12
                            com.ss.android.ugc.aweme.feed.ui.be r13 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                            com.ss.android.ugc.aweme.views.MentionTextView r13 = r13.f76032a
                            android.text.TextPaint r13 = r13.getPaint()
                            com.ss.android.ugc.aweme.feed.ui.be r14 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                            com.ss.android.ugc.aweme.views.MentionTextView r14 = r14.f76032a
                            android.text.Layout r14 = r14.getLayout()
                            int r15 = r4 + -1
                            int r14 = r14.getLineStart(r15)
                            com.ss.android.ugc.aweme.feed.ui.be r5 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                            com.ss.android.ugc.aweme.views.MentionTextView r5 = r5.f76032a
                            android.text.Layout r5 = r5.getLayout()
                            int r5 = r5.getLineEnd(r15)
                            float r5 = r13.measureText(r11, r14, r5)
                            float r12 = r12 - r5
                        L_0x041c:
                            int r5 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
                            if (r5 >= 0) goto L_0x0433
                            com.ss.android.ugc.aweme.feed.ui.be r5 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                            com.ss.android.ugc.aweme.feed.ui.be r8 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                            int r8 = r8.f76036e
                            com.ss.android.ugc.aweme.feed.ui.be r12 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                            int r12 = r12.f76036e
                            int r12 = r12 / r4
                            int r8 = r8 + r12
                            r5.f76036e = r8
                            int r4 = r4 + 1
                            r21 = 1
                            goto L_0x0435
                        L_0x0433:
                            r21 = 0
                        L_0x0435:
                            com.ss.android.ugc.aweme.feed.ui.be r5 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                            com.ss.android.ugc.aweme.feed.ui.be r8 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                            int r8 = r8.mo74100k()
                            com.ss.android.ugc.aweme.feed.ui.be r12 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                            int r12 = r12.f76036e
                            int r8 = r8 * r12
                            int r8 = r8 / r4
                            r5.f76038r = r8
                            boolean r5 = r11 instanceof android.text.SpannableString
                            if (r5 == 0) goto L_0x0646
                            if (r10 != 0) goto L_0x0452
                            int r5 = r11.length()
                            int r10 = r5 / 2
                        L_0x0452:
                            if (r10 < r7) goto L_0x0473
                            int r5 = r10 - r7
                            int r7 = r5 + 2
                            java.lang.CharSequence r7 = r11.subSequence(r5, r7)
                            java.lang.String r7 = r7.toString()
                            boolean r8 = com.bytedance.ies.ugc.appcontext.C6399b.m19944t()
                            boolean r7 = com.p280ss.android.ugc.aweme.video.hashtag.C43230c.m137142c(r7, r8)
                            if (r7 == 0) goto L_0x0473
                            int r2 = java.lang.Math.max(r6, r5)
                            java.lang.CharSequence r2 = r11.subSequence(r6, r2)
                            goto L_0x0488
                        L_0x0473:
                            boolean r5 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.m94889j()
                            if (r5 == 0) goto L_0x047f
                            com.ss.android.ugc.aweme.feed.ui.be r5 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                            int r2 = r5.mo74086a(r11, r0, r2, r10)
                        L_0x047f:
                            int r10 = r10 - r2
                            int r2 = java.lang.Math.max(r6, r10)
                            java.lang.CharSequence r2 = r11.subSequence(r6, r2)
                        L_0x0488:
                            android.text.SpannableStringBuilder r5 = new android.text.SpannableStringBuilder
                            r5.<init>(r2)
                            com.ss.android.ugc.aweme.feed.ui.be r2 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                            boolean r2 = r2.mo74101m()
                            if (r2 == 0) goto L_0x049c
                            java.lang.String r2 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.m94890l()
                            r5.append(r2)
                        L_0x049c:
                            java.lang.String r2 = "..."
                            r5.append(r2)
                            boolean r7 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.m94889j()
                            if (r7 == 0) goto L_0x05c6
                            android.text.SpannableStringBuilder r7 = new android.text.SpannableStringBuilder
                            android.text.SpannableString r8 = android.text.SpannableString.valueOf(r11)
                            r7.<init>(r8)
                            if (r21 == 0) goto L_0x04b7
                            java.lang.String r8 = "\n"
                            r7.append(r8)
                        L_0x04b7:
                            if (r9 == 0) goto L_0x04be
                            java.lang.String r8 = "..."
                            r7.append(r8)
                        L_0x04be:
                            boolean r8 = com.bytedance.ies.ugc.appcontext.C6399b.m19944t()
                            if (r8 == 0) goto L_0x04d1
                            com.ss.android.ugc.aweme.feed.ui.be r8 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                            com.ss.android.ugc.aweme.views.MentionTextView r8 = r8.f76032a
                            com.ss.android.ugc.aweme.feed.ui.be r9 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                            int r9 = r9.mo74100k()
                            r8.setLines(r9)
                        L_0x04d1:
                            com.ss.android.ugc.aweme.feed.ui.be r8 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                            r8.mo74093a(r5)
                            com.ss.android.ugc.aweme.feed.ui.be r8 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                            com.ss.android.ugc.aweme.views.MentionTextView r8 = r8.f76032a
                            int r8 = r8.getLineCount()
                            if (r8 != r3) goto L_0x05b1
                            com.ss.android.ugc.aweme.feed.ui.be r8 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                            com.ss.android.ugc.aweme.feed.model.Aweme r8 = r8.f76169g
                            boolean r8 = r8.isAd()
                            if (r8 != 0) goto L_0x05b1
                            com.ss.android.ugc.aweme.feed.ui.be r8 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this     // Catch:{ Exception -> 0x059a }
                            com.ss.android.ugc.aweme.views.MentionTextView r8 = r8.f76032a     // Catch:{ Exception -> 0x059a }
                            android.text.Layout r8 = r8.getLayout()     // Catch:{ Exception -> 0x059a }
                            int r9 = r3 + -1
                            int r8 = r8.getLineEnd(r9)     // Catch:{ Exception -> 0x059a }
                            com.ss.android.ugc.aweme.feed.ui.be r10 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this     // Catch:{ Exception -> 0x059a }
                            com.ss.android.ugc.aweme.views.MentionTextView r10 = r10.f76032a     // Catch:{ Exception -> 0x059a }
                            int r10 = r10.getWidth()     // Catch:{ Exception -> 0x059a }
                            float r10 = (float) r10     // Catch:{ Exception -> 0x059a }
                            com.ss.android.ugc.aweme.feed.ui.be r11 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this     // Catch:{ Exception -> 0x059a }
                            com.ss.android.ugc.aweme.views.MentionTextView r11 = r11.f76032a     // Catch:{ Exception -> 0x059a }
                            android.text.TextPaint r11 = r11.getPaint()     // Catch:{ Exception -> 0x059a }
                            com.ss.android.ugc.aweme.feed.ui.be r12 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this     // Catch:{ Exception -> 0x059a }
                            com.ss.android.ugc.aweme.views.MentionTextView r12 = r12.f76032a     // Catch:{ Exception -> 0x059a }
                            java.lang.CharSequence r12 = r12.getText()     // Catch:{ Exception -> 0x059a }
                            com.ss.android.ugc.aweme.feed.ui.be r13 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this     // Catch:{ Exception -> 0x059a }
                            com.ss.android.ugc.aweme.views.MentionTextView r13 = r13.f76032a     // Catch:{ Exception -> 0x059a }
                            android.text.Layout r13 = r13.getLayout()     // Catch:{ Exception -> 0x059a }
                            int r13 = r13.getLineStart(r9)     // Catch:{ Exception -> 0x059a }
                            float r11 = r11.measureText(r12, r13, r8)     // Catch:{ Exception -> 0x059a }
                            float r10 = r10 - r11
                            com.ss.android.ugc.aweme.feed.ui.be r11 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this     // Catch:{ Exception -> 0x059a }
                            com.ss.android.ugc.aweme.views.MentionTextView r11 = r11.f76032a     // Catch:{ Exception -> 0x059a }
                            android.text.TextPaint r11 = r11.getPaint()     // Catch:{ Exception -> 0x059a }
                            float r11 = r11.measureText(r0)     // Catch:{ Exception -> 0x059a }
                            r12 = r8
                            r8 = r5
                        L_0x0530:
                            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
                            if (r10 >= 0) goto L_0x059f
                            int r10 = r0.length()     // Catch:{ Exception -> 0x0598 }
                            int r12 = r12 - r10
                            java.lang.CharSequence r10 = r8.subSequence(r6, r12)     // Catch:{ Exception -> 0x0598 }
                            com.ss.android.ugc.aweme.feed.ui.be r8 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this     // Catch:{ Exception -> 0x0595 }
                            android.text.SpannableStringBuilder r12 = new android.text.SpannableStringBuilder     // Catch:{ Exception -> 0x0595 }
                            r12.<init>(r10)     // Catch:{ Exception -> 0x0595 }
                            java.lang.String r13 = "..."
                            android.text.SpannableStringBuilder r12 = r12.append(r13)     // Catch:{ Exception -> 0x0595 }
                            r8.mo74093a(r12)     // Catch:{ Exception -> 0x0595 }
                            com.ss.android.ugc.aweme.feed.ui.be r8 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this     // Catch:{ Exception -> 0x0595 }
                            com.ss.android.ugc.aweme.views.MentionTextView r8 = r8.f76032a     // Catch:{ Exception -> 0x0595 }
                            int r8 = r8.getLineCount()     // Catch:{ Exception -> 0x0595 }
                            if (r8 != r3) goto L_0x0593
                            com.ss.android.ugc.aweme.feed.ui.be r8 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this     // Catch:{ Exception -> 0x0595 }
                            com.ss.android.ugc.aweme.views.MentionTextView r8 = r8.f76032a     // Catch:{ Exception -> 0x0595 }
                            android.text.Layout r8 = r8.getLayout()     // Catch:{ Exception -> 0x0595 }
                            int r12 = r8.getLineEnd(r9)     // Catch:{ Exception -> 0x0595 }
                            com.ss.android.ugc.aweme.feed.ui.be r8 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this     // Catch:{ Exception -> 0x0595 }
                            com.ss.android.ugc.aweme.views.MentionTextView r8 = r8.f76032a     // Catch:{ Exception -> 0x0595 }
                            int r8 = r8.getWidth()     // Catch:{ Exception -> 0x0595 }
                            float r8 = (float) r8     // Catch:{ Exception -> 0x0595 }
                            com.ss.android.ugc.aweme.feed.ui.be r13 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this     // Catch:{ Exception -> 0x0595 }
                            com.ss.android.ugc.aweme.views.MentionTextView r13 = r13.f76032a     // Catch:{ Exception -> 0x0595 }
                            android.text.TextPaint r13 = r13.getPaint()     // Catch:{ Exception -> 0x0595 }
                            com.ss.android.ugc.aweme.feed.ui.be r14 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this     // Catch:{ Exception -> 0x0595 }
                            com.ss.android.ugc.aweme.views.MentionTextView r14 = r14.f76032a     // Catch:{ Exception -> 0x0595 }
                            java.lang.CharSequence r14 = r14.getText()     // Catch:{ Exception -> 0x0595 }
                            com.ss.android.ugc.aweme.feed.ui.be r15 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this     // Catch:{ Exception -> 0x0595 }
                            com.ss.android.ugc.aweme.views.MentionTextView r15 = r15.f76032a     // Catch:{ Exception -> 0x0595 }
                            android.text.Layout r15 = r15.getLayout()     // Catch:{ Exception -> 0x0595 }
                            int r15 = r15.getLineStart(r9)     // Catch:{ Exception -> 0x0595 }
                            float r13 = r13.measureText(r14, r15, r12)     // Catch:{ Exception -> 0x0595 }
                            float r8 = r8 - r13
                            r22 = r10
                            r10 = r8
                            r8 = r22
                            goto L_0x0530
                        L_0x0593:
                            r8 = r10
                            goto L_0x059f
                        L_0x0595:
                            r0 = move-exception
                            r8 = r10
                            goto L_0x059c
                        L_0x0598:
                            r0 = move-exception
                            goto L_0x059c
                        L_0x059a:
                            r0 = move-exception
                            r8 = r5
                        L_0x059c:
                            com.p280ss.android.ugc.aweme.framework.p312a.C6921a.m21554a(r0)
                        L_0x059f:
                            boolean r0 = android.text.TextUtils.equals(r8, r5)
                            if (r0 != 0) goto L_0x05b1
                            android.text.SpannableStringBuilder r0 = new android.text.SpannableStringBuilder
                            r0.<init>(r8)
                            java.lang.String r5 = "..."
                            android.text.SpannableStringBuilder r0 = r0.append(r5)
                            r5 = r0
                        L_0x05b1:
                            com.ss.android.ugc.aweme.feed.ui.be r0 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                            com.ss.android.ugc.aweme.feed.ui.be r6 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                            com.ss.android.ugc.aweme.feed.model.Aweme r6 = r6.f76169g
                            boolean r6 = r6.isAd()
                            r0.mo74090a(r5, r7, r6)
                            com.ss.android.ugc.aweme.feed.ui.be r0 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                            r0.f76037f = r5
                            com.ss.android.ugc.aweme.feed.ui.be r0 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                            r0.f76035d = r7
                        L_0x05c6:
                            com.ss.android.ugc.aweme.feed.ui.be r0 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.f76169g
                            r0.setEllipsizeDesc(r5)
                            com.ss.android.ugc.aweme.feed.ui.be r0 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                            boolean r0 = r0.mo74101m()
                            if (r0 == 0) goto L_0x05f6
                            com.ss.android.ugc.aweme.feed.ui.be r0 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                            int r6 = r5.length()
                            java.lang.String r7 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.m94890l()
                            int r7 = r7.length()
                            int r6 = r6 - r7
                            int r2 = r2.length()
                            int r6 = r6 - r2
                            java.lang.CharSequence r5 = r0.mo74087a(r5, r6)
                            com.ss.android.ugc.aweme.feed.ui.be r0 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                            android.text.SpannableStringBuilder r2 = new android.text.SpannableStringBuilder
                            r2.<init>(r5)
                            r0.f76037f = r2
                        L_0x05f6:
                            com.ss.android.ugc.aweme.feed.ui.be r0 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                            r0.mo74093a(r5)
                            com.ss.android.ugc.aweme.feed.ui.be r0 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                            com.ss.android.ugc.aweme.views.MentionTextView r0 = r0.f76032a
                            android.text.Layout r0 = r0.getLayout()
                            if (r0 == 0) goto L_0x062b
                            com.ss.android.ugc.aweme.feed.ui.be r0 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                            com.ss.android.ugc.aweme.views.MentionTextView r0 = r0.f76032a
                            android.text.Layout r0 = r0.getLayout()
                            int r0 = r0.getLineCount()
                            com.ss.android.ugc.aweme.feed.ui.be r2 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r2.f76169g
                            boolean r2 = r2.isAd()
                            if (r2 == 0) goto L_0x062b
                            if (r0 <= r3) goto L_0x062b
                            com.ss.android.ugc.aweme.feed.ui.be r2 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                            com.ss.android.ugc.aweme.views.MentionTextView r2 = r2.f76032a
                            r2.setLines(r0)
                            com.ss.android.ugc.aweme.feed.ui.be r2 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r2.f76169g
                            r2.setAdDescMaxLines(r0)
                        L_0x062b:
                            com.ss.android.ugc.aweme.feed.ui.be r0 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                            com.ss.android.ugc.aweme.views.MentionTextView r0 = r0.f76032a
                            com.ss.android.ugc.aweme.feed.ui.be r2 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                            com.ss.android.ugc.aweme.views.MentionTextView r2 = r2.f76032a
                            int r2 = r2.getCurrentTextColor()
                            r0.setSpanColor(r2)
                            com.ss.android.ugc.aweme.feed.ui.be r0 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                            com.ss.android.ugc.aweme.views.MentionTextView r0 = r0.f76032a
                            com.ss.android.ugc.aweme.feed.ui.bn r2 = new com.ss.android.ugc.aweme.feed.ui.bn
                            r2.<init>(r1, r4)
                            r0.post(r2)
                        L_0x0646:
                            return
                        L_0x0647:
                            com.ss.android.ugc.aweme.feed.ui.be r0 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.this
                            com.ss.android.ugc.aweme.views.MentionTextView r0 = r0.f76032a
                            com.ss.android.ugc.aweme.feed.ui.bo r2 = new com.ss.android.ugc.aweme.feed.ui.bo
                            r2.<init>(r1)
                            r0.post(r2)
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.C288371.onGlobalLayout():void");
                    }

                    /* access modifiers changed from: 0000 */
                    /* renamed from: a */
                    public final /* synthetic */ void mo74106a(int i) {
                        C28836be.this.f76038r = C28836be.this.f76032a.getHeight();
                        C28836be.this.f76036e = (C28836be.this.f76038r * i) / C28836be.this.mo74100k();
                        C28836be.this.mo74094a(true);
                    }
                });
            } catch (IndexOutOfBoundsException e) {
                C6921a.m21554a((Exception) e);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo74095b(ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        if (intValue > 0) {
            this.f76032a.setHeight(intValue);
        }
    }

    /* renamed from: a */
    private Map<String, String> m94880a(String str) {
        return C22984d.m75611a().mo59973a("enter_from", this.f76170h).mo59973a("group_id", this.f76169g.getAid()).mo59973a("author_id", this.f76169g.getAuthorUid()).mo59973a("action_type", str).f60753a;
    }

    /* renamed from: b */
    private String m94885b(String str) {
        if (str == null || str.length() <= m94895u() - m94890l().length()) {
            return str;
        }
        return this.f76169g.getDesc().substring(0, (m94895u() - m94890l().length()) - mo74099i().length());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo74097c(View view) {
        int i;
        if (!(this.f76035d == null || this.f76037f == null)) {
            CharSequence text = this.f76033b.getText();
            Context context = this.f76175m;
            if (C6399b.m19944t()) {
                i = R.string.b53;
            } else {
                i = R.string.b2o;
            }
            boolean equals = text.equals(context.getString(i));
            if (equals) {
                mo74091a(this.f76035d, equals);
                return;
            }
            mo74091a(this.f76037f, equals);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onChanged(C23083a aVar) {
        if (aVar != null) {
            String str = aVar.f60948a;
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != 350216171) {
                if (hashCode == 1628582276 && str.equals("on_page_unselected")) {
                    c = 1;
                }
            } else if (str.equals("on_page_selected")) {
                c = 0;
            }
            switch (c) {
                case 0:
                    if (this.f76040t != null) {
                        this.f76040t.f75983l = true;
                        C1592h.m7855a((Callable<TResult>) new C28844bj<TResult>(this), (Executor) C6907h.m21516a());
                    }
                    this.f76045y = true;
                    if (this.f76044x) {
                        C1592h.m7855a((Callable<TResult>) new C28845bk<TResult>(this), (Executor) C6907h.m21516a());
                        return;
                    }
                    break;
                case 1:
                    if (this.f76040t != null) {
                        this.f76040t.f75983l = false;
                    }
                    this.f76045y = false;
                    break;
            }
        }
    }

    /* renamed from: c */
    private boolean m94888c(TextExtraStruct textExtraStruct) {
        if (this.f76169g == null || this.f76169g.getDesc() == null || textExtraStruct.getStart() < 0 || textExtraStruct.getEnd() < 0 || textExtraStruct.getEnd() > this.f76169g.getDesc().length() || textExtraStruct.getStart() >= this.f76169g.getDesc().length() || textExtraStruct.getStart() >= textExtraStruct.getEnd()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo74096b(View view) {
        int i;
        if (!(mo74167d() || this.f76042v == null || this.f76041u == null)) {
            if (C25329c.m83217a(this.f76170h)) {
                i = 34;
            } else {
                i = 1;
            }
            C24671f.m80853c().mo64686a(this.f76175m, this.f76169g, this.f76041u, i, this.f76042v);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.text.InputFilter[] m94884a(android.text.InputFilter[] r7) {
        /*
            int r0 = r7.length
            int r1 = r7.length
            r2 = 4
            r3 = 0
            if (r1 == 0) goto L_0x0043
            r1 = -1
            r4 = 0
        L_0x0008:
            if (r4 >= r0) goto L_0x0015
            r5 = r7[r4]
            boolean r5 = r5 instanceof android.text.InputFilter.LengthFilter
            if (r5 == 0) goto L_0x0012
            r1 = r4
            goto L_0x0015
        L_0x0012:
            int r4 = r4 + 1
            goto L_0x0008
        L_0x0015:
            java.lang.String r4 = "VideoDescView"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "descView,InputFilter size:"
            r5.<init>(r6)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            com.p280ss.android.ugc.aweme.framework.p312a.C6921a.m21552a(r2, r4, r5)
            if (r1 < 0) goto L_0x0043
            java.lang.Class<android.text.InputFilter> r4 = android.text.InputFilter.class
            int r5 = r0 + -1
            java.lang.Object r4 = java.lang.reflect.Array.newInstance(r4, r5)
            java.lang.System.arraycopy(r7, r3, r4, r3, r1)
            if (r1 >= r5) goto L_0x0040
            int r5 = r1 + 1
            int r6 = r0 - r1
            int r6 = r6 + -1
            java.lang.System.arraycopy(r7, r5, r4, r1, r6)
        L_0x0040:
            android.text.InputFilter[] r4 = (android.text.InputFilter[]) r4
            goto L_0x0044
        L_0x0043:
            r4 = 0
        L_0x0044:
            if (r4 != 0) goto L_0x005b
            java.lang.String r7 = "VideoDescView"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "not find InputFilter.LengthFilter,size:"
            r1.<init>(r4)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.p280ss.android.ugc.aweme.framework.p312a.C6921a.m21552a(r2, r7, r0)
            android.text.InputFilter[] r4 = new android.text.InputFilter[r3]
        L_0x005b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.feed.p1238ui.C28836be.m94884a(android.text.InputFilter[]):android.text.InputFilter[]");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo72022b(DataCenter dataCenter) {
        if (dataCenter != null) {
            dataCenter.mo60132a("on_page_selected", (C0053p<C23083a>) this);
            dataCenter.mo60132a("on_page_unselected", (C0053p<C23083a>) this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo73803b(VideoItemParams videoItemParams) {
        super.mo73803b(videoItemParams);
        if (videoItemParams != null) {
            this.f76042v = videoItemParams.mAdOpenCallBack;
            this.f76041u = videoItemParams.mAdViewController;
        }
    }

    /* renamed from: a */
    private void m94883a(TextExtraStruct textExtraStruct) {
        if (textExtraStruct != null) {
            if (textExtraStruct.getType() == 1) {
                C25242ao.m82973a(textExtraStruct);
                SmartRouter.buildRoute(this.f76175m, "//challenge/detail").withParam("aweme_id", this.f76169g.getAid()).withParam("id", textExtraStruct.getHashTagName()).withParam("extra_challenge_from", this.f76170h).withParam("com.ss.android.ugc.aweme.intent.extra.EXTRA_CHALLENGE_TYPE", 0).withParam("extra_challenge_is_hashtag", true).open(10086);
                if (this.f76174l != null) {
                    this.f76174l.mo60134a("feed_internal_event", (Object) new C28318an(34, this.f76169g));
                }
                C6907h.onEvent(MobClick.obtain().setEventName("challenge_click").setLabelName(this.f76170h).setValue(this.f76169g.getAid()).setExtValueString(textExtraStruct.getCid()));
                C24671f.m80851a().mo64673d(this.f76175m, this.f76169g);
                if (this.f76169g.getCommerceVideoAuthInfo() != null && this.f76169g.getCommerceVideoAuthInfo().getAdSource() == 1) {
                    C24671f.m80851a().mo64670b(this.f76175m, this.f76169g, "topic");
                }
                FeedParam a = FeedParamProvider.m94273a(this.f76175m);
                String str = "";
                if (a != null) {
                    str = a.getSearchKeyword();
                }
                ((C33277s) ((C33277s) new C33277s().mo85330f(this.f76170h).mo85071g(this.f76169g).mo85325b(FeedParamProvider.m94273a(this.f76175m).getPreviousPage()).mo85334k(textExtraStruct.getCid()).mo85282a(Boolean.valueOf(C28482e.m93609b(this.f76169g)))).mo85048a("click_in_video_name")).mo85336p(C33230ac.m107206a(this.f76169g, this.f76173k)).mo85337q(str).mo85252e();
                return;
            }
            C6907h.m21520a(this.f76175m, "name", "video_at", this.f76169g.getAid(), textExtraStruct.getUserId());
            if (this.f76169g.getCommerceVideoAuthInfo() != null && this.f76169g.getCommerceVideoAuthInfo().getAdSource() == 1) {
                C24671f.m80851a().mo64670b(this.f76175m, this.f76169g, "name");
            }
            ((C33276r) ((C33276r) ((C33276r) new C33276r().mo85312c(this.f76169g, this.f76173k).mo85310b(this.f76170h).mo85319i(FeedParamProvider.m94273a(this.f76175m).getPreviousPage()).mo85322o(textExtraStruct.getUserId()).mo85282a(Boolean.valueOf(C28482e.m93609b(this.f76169g)))).mo85048a("video_at")).mo85047a(this.f76175m)).mo85252e();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("group_id", "");
                jSONObject.put("request_id", this.f76171i.get("request_id"));
                jSONObject.put("enter_from", this.f76170h);
                jSONObject.put("enter_method", "click_head");
                jSONObject.put("enter_type", "normal_way");
            } catch (Exception unused) {
            }
            if (this.f76169g.getAuthor() != null) {
                C6907h.onEvent(MobClick.obtain().setEventName("enter_detail").setLabelName("personal_homepage").setValue(this.f76169g.getAuthor().getUid()).setJsonObject(jSONObject));
                new C33275q().mo85309f(this.f76169g).mo85307c("personal_homepage").mo85306b(this.f76169g.getAuthorUid()).mo85308d(this.f76170h).mo85252e();
            }
            C7195s a2 = C7195s.m22438a();
            Activity activity = (Activity) this.f76175m;
            StringBuilder sb = new StringBuilder("aweme://user/profile/");
            sb.append(textExtraStruct.getUserId());
            a2.mo18679a(activity, C7203u.m22460a(sb.toString()).mo18694a("sec_user_id", textExtraStruct.getSecUid()).mo18694a("profile_from", "video_at").mo18694a("video_id", this.f76169g.getAid()).mo18694a("enter_from", this.f76170h).mo18693a("profile_enterprise_type", this.f76169g.getEnterpriseType()).mo18695a());
        }
    }

    /* renamed from: b */
    private void m94887b(TextExtraStruct textExtraStruct) {
        String str;
        if (textExtraStruct != null) {
            if (textExtraStruct.getType() == 1) {
                C25242ao.m82973a(textExtraStruct);
                String uuid = UUID.randomUUID().toString();
                SmartRouter.buildRoute(this.f76175m, "//challenge/detail").withParam("aweme_id", this.f76169g.getAid()).withParam("id", textExtraStruct.getHashTagName()).withParam("extra_challenge_is_hashtag", true).withParam("process_id", uuid).withParam("extra_challenge_from", this.f76170h).open(10086);
                C6907h.onEvent(MobClick.obtain().setEventName("challenge_click").setLabelName(this.f76170h).setValue(this.f76169g.getAid()).setExtValueString(textExtraStruct.getCid()));
                C24671f.m80851a().mo64673d(this.f76175m, this.f76169g);
                C33277s sVar = (C33277s) new C33277s().mo85330f(this.f76170h).mo85047a(this.f76175m);
                if (this.f76169g.getAuthor() != null) {
                    str = this.f76169g.getAuthor().getUid();
                } else {
                    str = "";
                }
                ((C33277s) ((C33277s) ((C33277s) sVar.mo85333j(str).mo85331g(this.f76169g.getAid()).mo85071g(this.f76169g).mo85335o(uuid).mo85326c((String) this.f76174l.mo60136b("playlist_type", "")).mo85328e((String) this.f76174l.mo60136b("playlist_id", "")).mo85327d((String) this.f76174l.mo60136b("playlist_id_key", "")).mo85283l((String) this.f76174l.mo60136b("tab_name", ""))).mo85284m(C33230ac.m107216b(this.f76169g, this.f76173k))).mo85334k(textExtraStruct.getCid()).mo85048a("click_in_video_name")).mo85336p(C33230ac.m107206a(this.f76169g, this.f76173k)).mo85252e();
                C28580o.m93830a(PAGE.CHALLENGE);
            } else if (!C6399b.m19944t() || textExtraStruct.getType() != 0 || TextUtils.isEmpty(textExtraStruct.getAwemeId()) || !m94888c(textExtraStruct) || this.f76169g.getDesc().charAt(textExtraStruct.getStart()) != '@') {
                C6907h.m21520a(this.f76175m, "name", "video_at", this.f76169g.getAid(), textExtraStruct.getUserId());
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("group_id", "");
                    jSONObject.put("request_id", this.f76171i.get("request_id"));
                    jSONObject.put("enter_from", this.f76170h);
                    jSONObject.put("enter_method", "click_head");
                } catch (Exception unused) {
                }
                if (this.f76169g.getAuthor() != null) {
                    C6907h.onEvent(MobClick.obtain().setEventName("enter_detail").setLabelName("personal_homepage").setValue(this.f76169g.getAuthor().getUid()).setJsonObject(jSONObject));
                    C6907h.m21524a("enter_personal_detail", (Map) C22984d.m75611a().mo59973a("enter_from", this.f76170h).mo59973a("to_user_id", textExtraStruct.getUserId()).mo59973a("group_id", this.f76169g.getAid()).mo59973a("author_id", this.f76169g.getAuthorUid()).mo59973a("enter_method", "video_at").f60753a);
                }
                C7195s a = C7195s.m22438a();
                Activity activity = (Activity) this.f76175m;
                StringBuilder sb = new StringBuilder("aweme://user/profile/");
                sb.append(textExtraStruct.getUserId());
                a.mo18679a(activity, C7203u.m22460a(sb.toString()).mo18694a("sec_user_id", textExtraStruct.getSecUid()).mo18694a("profile_from", "video_at").mo18694a("enter_from", this.f76170h).mo18694a("video_id", this.f76169g.getAid()).mo18695a());
            } else {
                if (this.f76169g.getAwemeType() == 51) {
                    C6907h.m21524a("click_duet_icon", (Map) C22984d.m75611a().mo59973a("enter_from", this.f76170h).mo59973a("group_id", this.f76169g.getAid()).mo59973a("author_id", this.f76169g.getAuthorUid()).mo59973a("to_group_id", textExtraStruct.getAwemeId()).f60753a);
                } else if (this.f76169g.getAwemeType() == 52) {
                    C6907h.m21524a("click_react_icon", (Map) C22984d.m75611a().mo59973a("enter_from", this.f76170h).mo59973a("group_id", this.f76169g.getAid()).mo59973a("author_id", this.f76169g.getAuthorUid()).mo59973a("to_group_id", textExtraStruct.getAwemeId()).f60753a);
                }
                if (!C28851bq.m94924a(this.f76175m)) {
                    C10761a.m31399c(this.f76175m, (int) R.string.cjs).mo25750a();
                } else {
                    SmartRouter.buildRoute(this.f76175m, "//aweme/detail").withParam("id", textExtraStruct.getAwemeId()).withParam("refer", this.f76170h).withParam("isChain", true).open();
                }
            }
        }
    }

    public C28836be(View view, C28768aa aaVar) {
        super(view);
        this.f76043w = aaVar;
    }

    /* renamed from: a */
    private static void m94881a(SpannableStringBuilder spannableStringBuilder, SpannableString spannableString) {
        if (TextUtils.equals(Build.BRAND.toLowerCase(), "gionee")) {
            try {
                spannableStringBuilder.append(spannableString);
            } catch (Exception e) {
                C6921a.m21559a((Throwable) e);
            }
        } else {
            spannableStringBuilder.append(spannableString);
        }
    }

    /* renamed from: a */
    public final CharSequence mo74087a(CharSequence charSequence, int i) {
        SpannableStringBuilder spannableStringBuilder;
        int length = m94890l().length() + i;
        if (charSequence == null || i < 0 || charSequence.length() < length || !TextUtils.equals(charSequence.subSequence(i, length).toString(), m94890l())) {
            return charSequence;
        }
        AwemeTextLabelModel label = this.f76169g.getAwemeRawAd().getLabel();
        if (label == null) {
            return charSequence;
        }
        if (charSequence instanceof SpannableStringBuilder) {
            spannableStringBuilder = (SpannableStringBuilder) charSequence;
        } else {
            spannableStringBuilder = new SpannableStringBuilder(charSequence);
        }
        C29048a aVar = new C29048a(this.f76175m, label.getBgColor(), label.getLabelName(), label.getTextColor());
        aVar.f76574a = label.isAdHollowText();
        spannableStringBuilder.setSpan(aVar, i + 1, i + m94890l().length(), 17);
        return spannableStringBuilder;
    }

    /* renamed from: b */
    private void m94886b(SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2, boolean z) {
        spannableStringBuilder.setSpan(new C28839a(this, spannableStringBuilder2, z), 0, spannableStringBuilder.length(), 33);
    }

    /* renamed from: a */
    public final int mo74086a(CharSequence charSequence, String str, int i, int i2) {
        try {
            float measureText = this.f76032a.getPaint().measureText(str);
            int i3 = i;
            while (i3 >= 3) {
                if (this.f76032a.getPaint().measureText(charSequence, i2 - i3, i2) < measureText) {
                    return i3 + 1;
                }
                i3--;
            }
            return i3 + 1;
        } catch (Exception unused) {
            return i;
        }
    }
}

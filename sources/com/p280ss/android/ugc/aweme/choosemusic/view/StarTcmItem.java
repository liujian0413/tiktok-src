package com.p280ss.android.ugc.aweme.choosemusic.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.music.p1409c.C33781b.C33782a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.view.StarTcmItem */
public final class StarTcmItem extends LinearLayout {

    /* renamed from: a */
    private View f63284a;

    /* renamed from: b */
    private ValueAnimator f63285b;

    /* renamed from: c */
    private HashMap f63286c;

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.view.StarTcmItem$a */
    static final class C23952a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ StarTcmItem f63287a;

        /* renamed from: com.ss.android.ugc.aweme.choosemusic.view.StarTcmItem$a$a */
        static final class C23953a implements AnimatorUpdateListener {

            /* renamed from: a */
            final /* synthetic */ C23952a f63288a;

            /* renamed from: b */
            final /* synthetic */ MarginLayoutParams f63289b;

            /* renamed from: c */
            final /* synthetic */ int f63290c;

            C23953a(C23952a aVar, MarginLayoutParams marginLayoutParams, int i) {
                this.f63288a = aVar;
                this.f63289b = marginLayoutParams;
                this.f63290c = i;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C7573i.m23582a((Object) valueAnimator, "it");
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (animatedValue != null) {
                    float floatValue = ((Float) animatedValue).floatValue();
                    StarTcmItem starTcmItem = this.f63288a.f63287a;
                    float f = 0.0f;
                    if (floatValue >= 0.0f && floatValue <= 200.0f) {
                        f = 1.0f - (floatValue / 200.0f);
                    }
                    starTcmItem.setAlpha(f);
                    if (floatValue >= 100.0f && floatValue <= 300.0f) {
                        View underView = this.f63288a.f63287a.getUnderView();
                        if (underView != null) {
                            float height = ((floatValue - 100.0f) / 200.0f) * (((float) this.f63288a.f63287a.getHeight()) + ((float) this.f63289b.topMargin) + ((float) this.f63289b.bottomMargin));
                            LayoutParams layoutParams = underView.getLayoutParams();
                            if (layoutParams != null) {
                                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                                marginLayoutParams.topMargin = this.f63290c - ((int) height);
                                underView.setLayoutParams(marginLayoutParams);
                                return;
                            }
                            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        }
                    }
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.choosemusic.view.StarTcmItem$a$b */
        public static final class C23954b extends AnimatorListenerAdapter {

            /* renamed from: a */
            final /* synthetic */ C23952a f63291a;

            /* renamed from: b */
            final /* synthetic */ MarginLayoutParams f63292b;

            /* renamed from: c */
            final /* synthetic */ int f63293c;

            public final void onAnimationStart(Animator animator) {
                View underView = this.f63291a.f63287a.getUnderView();
                if (underView != null) {
                    LayoutParams layoutParams = underView.getLayoutParams();
                    layoutParams.height = underView.getMeasuredHeight() + this.f63291a.f63287a.getHeight() + this.f63292b.topMargin + this.f63292b.bottomMargin;
                    underView.setLayoutParams(layoutParams);
                }
            }

            C23954b(C23952a aVar, MarginLayoutParams marginLayoutParams, int i) {
                this.f63291a = aVar;
                this.f63292b = marginLayoutParams;
                this.f63293c = i;
            }
        }

        C23952a(StarTcmItem starTcmItem) {
            this.f63287a = starTcmItem;
        }

        public final void onClick(View view) {
            LayoutParams layoutParams;
            ClickInstrumentation.onClick(view);
            C33782a.m108914a("show_tcm_info", Boolean.valueOf(false), "music_sp");
            LayoutParams layoutParams2 = this.f63287a.getLayoutParams();
            if (layoutParams2 != null) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams2;
                View underView = this.f63287a.getUnderView();
                if (underView != null) {
                    layoutParams = underView.getLayoutParams();
                } else {
                    layoutParams = null;
                }
                if (layoutParams != null) {
                    int i = ((MarginLayoutParams) layoutParams).topMargin;
                    StarTcmItem starTcmItem = this.f63287a;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 300.0f});
                    ofFloat.addUpdateListener(new C23953a(this, marginLayoutParams, i));
                    ofFloat.addListener(new C23954b(this, marginLayoutParams, i));
                    ofFloat.setDuration(300);
                    ofFloat.setInterpolator(new LinearInterpolator());
                    starTcmItem.setCurrentAnimator(ofFloat);
                    ValueAnimator currentAnimator = this.f63287a.getCurrentAnimator();
                    if (currentAnimator != null) {
                        currentAnimator.start();
                        return;
                    }
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }

    public StarTcmItem(Context context) {
        this(context, null, 0, 6, null);
    }

    public StarTcmItem(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: a */
    private View m78625a(int i) {
        if (this.f63286c == null) {
            this.f63286c = new HashMap();
        }
        View view = (View) this.f63286c.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f63286c.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final ValueAnimator getCurrentAnimator() {
        return this.f63285b;
    }

    public final View getUnderView() {
        return this.f63284a;
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f63285b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    /* renamed from: a */
    public final void mo62143a() {
        View a = m78625a(R.id.dgp);
        C7573i.m23582a((Object) a, "tcmSpace");
        a.setVisibility(8);
    }

    /* renamed from: b */
    public final void mo62144b() {
        View a = m78625a(R.id.dgp);
        C7573i.m23582a((Object) a, "tcmSpace");
        a.setVisibility(0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0029, code lost:
        if (r2.intValue() == 0) goto L_0x002b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006b  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m78626c() {
        /*
            r6 = this;
            r0 = 2131302003(0x7f091673, float:1.822208E38)
            android.view.View r0 = r6.m78625a(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            com.ss.android.ugc.aweme.choosemusic.view.StarTcmItem$a r1 = new com.ss.android.ugc.aweme.choosemusic.view.StarTcmItem$a
            r1.<init>(r6)
            android.view.View$OnClickListener r1 = (android.view.View.OnClickListener) r1
            r0.setOnClickListener(r1)
            r0 = 0
            r1 = 1
            com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy r2 = com.p280ss.android.ugc.aweme.global.config.settings.C30199h.m98861a()     // Catch:{ Exception -> 0x002b }
            java.lang.String r3 = "SettingsReader.get()"
            kotlin.jvm.internal.C7573i.m23582a(r2, r3)     // Catch:{ Exception -> 0x002b }
            java.lang.Integer r2 = r2.getTcmCtrySettings()     // Catch:{ Exception -> 0x002b }
            if (r2 != 0) goto L_0x0025
            goto L_0x002d
        L_0x0025:
            int r2 = r2.intValue()     // Catch:{ Exception -> 0x002b }
            if (r2 != 0) goto L_0x002d
        L_0x002b:
            r2 = 1
            goto L_0x002e
        L_0x002d:
            r2 = 0
        L_0x002e:
            com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy r3 = com.p280ss.android.ugc.aweme.global.config.settings.C30199h.m98861a()     // Catch:{ Exception -> 0x003c }
            java.lang.String r4 = "SettingsReader.get()"
            kotlin.jvm.internal.C7573i.m23582a(r3, r4)     // Catch:{ Exception -> 0x003c }
            java.lang.String r3 = r3.getTcmNameCtry()     // Catch:{ Exception -> 0x003c }
            goto L_0x003e
        L_0x003c:
            java.lang.String r3 = "TCM"
        L_0x003e:
            r4 = 2131301737(0x7f091569, float:1.822154E38)
            android.view.View r4 = r6.m78625a(r4)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            if (r2 == 0) goto L_0x004d
            r5 = 2131233118(0x7f08095e, float:1.8082364E38)
            goto L_0x0050
        L_0x004d:
            r5 = 2131233117(0x7f08095d, float:1.8082362E38)
        L_0x0050:
            r4.setImageResource(r5)
            r4 = 2131301738(0x7f09156a, float:1.8221542E38)
            android.view.View r4 = r6.m78625a(r4)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r4 = (com.bytedance.ies.dmt.p262ui.widget.DmtTextView) r4
            java.lang.String r5 = "star_atlas_toast"
            kotlin.jvm.internal.C7573i.m23582a(r4, r5)
            android.content.Context r5 = r6.getContext()
            if (r2 == 0) goto L_0x006b
            r2 = 2131824942(0x7f11112e, float:1.9282726E38)
            goto L_0x006e
        L_0x006b:
            r2 = 2131824941(0x7f11112d, float:1.9282724E38)
        L_0x006e:
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r3
            java.lang.String r0 = r5.getString(r2, r1)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r4.setText(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.choosemusic.view.StarTcmItem.m78626c():void");
    }

    public final void setCurrentAnimator(ValueAnimator valueAnimator) {
        this.f63285b = valueAnimator;
    }

    public final void setUnderView(View view) {
        this.f63284a = view;
    }

    public StarTcmItem(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
        View.inflate(context, R.layout.b4h, this);
        setOrientation(1);
        m78626c();
        setLayerType(1, null);
    }

    public /* synthetic */ StarTcmItem(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}

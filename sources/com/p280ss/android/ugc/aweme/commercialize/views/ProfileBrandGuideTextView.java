package com.p280ss.android.ugc.aweme.commercialize.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.profile.p1487ui.BaseDTProfileFragment;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.ProfileBrandGuideTextView */
public final class ProfileBrandGuideTextView extends FrameLayout {

    /* renamed from: a */
    public static final C25488a f67109a = new C25488a(null);

    /* renamed from: c */
    private static final int f67110c = (BaseDTProfileFragment.m116450m() - C23486n.m77122a(16.0d));

    /* renamed from: d */
    private static final int f67111d = (-C23486n.m77122a(100.0d));

    /* renamed from: e */
    private static final int f67112e = (-C23486n.m77122a(110.0d));

    /* renamed from: b */
    private DmtTextView f67113b;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.ProfileBrandGuideTextView$a */
    public static final class C25488a {
        private C25488a() {
        }

        public /* synthetic */ C25488a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static ProfileBrandGuideTextView m83816a(FrameLayout frameLayout) {
            C7573i.m23587b(frameLayout, "parent");
            View inflate = LayoutInflater.from(frameLayout.getContext()).inflate(R.layout.a0y, frameLayout, false);
            if (inflate != null) {
                return (ProfileBrandGuideTextView) inflate;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.commercialize.views.ProfileBrandGuideTextView");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.ProfileBrandGuideTextView$b */
    static final class C25489b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ProfileBrandGuideTextView f67114a;

        C25489b(ProfileBrandGuideTextView profileBrandGuideTextView) {
            this.f67114a = profileBrandGuideTextView;
        }

        public final void run() {
            this.f67114a.setVisibility(8);
        }
    }

    public ProfileBrandGuideTextView(Context context) {
        this(context, null, 0, 6, null);
    }

    public ProfileBrandGuideTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final void dismiss() {
        animate().alpha(0.0f).withEndAction(new C25489b(this)).setDuration(200).start();
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        View findViewById = findViewById(R.id.ck8);
        C7573i.m23582a((Object) findViewById, "findViewById(R.id.profile_brand_guide_text)");
        this.f67113b = (DmtTextView) findViewById;
        setAlpha(0.0f);
    }

    /* renamed from: a */
    public final void mo66185a(int i) {
        animate().cancel();
        setVisibility(0);
        m83814b(i);
    }

    /* renamed from: b */
    private final void m83814b(int i) {
        float f;
        if (i > f67111d) {
            f = 0.0f;
        } else {
            int i2 = f67112e;
            int i3 = f67111d;
            if (i2 <= i && i3 >= i) {
                f = ((float) (i - f67111d)) / ((float) (f67112e - f67111d));
            } else {
                f = 1.0f;
            }
        }
        setAlpha(f);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0017, code lost:
        if (r1 == true) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setup(java.lang.String r4) {
        /*
            r3 = this;
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r3.f67113b
            if (r0 != 0) goto L_0x0009
            java.lang.String r1 = "guideText"
            kotlin.jvm.internal.C7573i.m23583a(r1)
        L_0x0009:
            if (r4 == 0) goto L_0x001a
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            int r1 = r4.length()
            r2 = 1
            if (r1 <= 0) goto L_0x0016
            r1 = 1
            goto L_0x0017
        L_0x0016:
            r1 = 0
        L_0x0017:
            if (r1 != r2) goto L_0x001a
            goto L_0x001e
        L_0x001a:
            java.lang.String r4 = "松开手指查看完整视频"
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
        L_0x001e:
            r0.setText(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.commercialize.views.ProfileBrandGuideTextView.setup(java.lang.String):void");
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (getMeasuredHeight() > 0) {
            LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                int i3 = f67110c;
                DmtTextView dmtTextView = this.f67113b;
                if (dmtTextView == null) {
                    C7573i.m23583a("guideText");
                }
                layoutParams2.topMargin = i3 - dmtTextView.getMeasuredHeight();
                setLayoutParams(layoutParams2);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
    }

    public ProfileBrandGuideTextView(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
    }

    public /* synthetic */ ProfileBrandGuideTextView(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}

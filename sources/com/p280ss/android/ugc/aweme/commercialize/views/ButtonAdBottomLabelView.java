package com.p280ss.android.ugc.aweme.commercialize.views;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.support.p022v4.content.C0683b;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.ugc.aweme.commercialize.C24671f;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25329c;
import com.p280ss.android.ugc.aweme.utils.C43081e;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.ButtonAdBottomLabelView */
public class ButtonAdBottomLabelView extends BaseAdBottomLabelView {
    /* access modifiers changed from: 0000 */
    public int getLayoutId() {
        return R.layout.afk;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final boolean mo66102b() {
        return C25329c.m83199A(this.f67003g);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: p */
    public final /* synthetic */ void mo66127p() {
        C24671f.m80851a().mo64679j(getContext(), this.f67003g);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final boolean mo66103c() {
        if (this.f67003g == null || this.f67003g.getAwemeRawAd() == null || (this.f67003g.getAwemeRawAd().getAnimationType() != 1 && this.f67003g.getAwemeRawAd().getAnimationType() != 3)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo66098a() {
        if (this.f67003g == null || !this.f67003g.isAd() || this.f67003g.getAwemeRawAd().getButtonStyle() != 1 || TextUtils.isEmpty(this.f67003g.getAwemeRawAd().getWebUrl())) {
            return false;
        }
        return true;
    }

    /* renamed from: o */
    public final void mo66126o() {
        if (mo66098a()) {
            mo66104d();
            if (mo66102b()) {
                C24671f.m80855e().mo65851a(this, 0, 0, true);
                mo66099b((View) this, (Runnable) new C25585g(this));
            } else {
                C24671f.m80855e().mo65851a(this, getResources().getDimensionPixelOffset(R.dimen.ke), 0, false);
            }
            int defaultColor = getDefaultColor();
            if (!mo66103c()) {
                defaultColor = Color.parseColor(C25329c.m83242y(this.f67003g));
            }
            mo66092a(defaultColor, 0);
        }
    }

    /* access modifiers changed from: 0000 */
    public void setLabelVisibility(int i) {
        setVisibility(i);
    }

    public ButtonAdBottomLabelView(Context context) {
        this(context, null);
    }

    public ButtonAdBottomLabelView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo66092a(int i, int i2) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(C9738o.m28708b(getContext(), 4.0f));
        if (i2 == 0) {
            gradientDrawable.setColor(i);
            setBackground(gradientDrawable);
            return;
        }
        gradientDrawable.setColor(getBackGroundColor());
        C43081e.m136673a(this, gradientDrawable, getBackGroundColor(), i, (long) i2);
    }

    public ButtonAdBottomLabelView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setDefaultColor(C0683b.m2912c(context, R.color.a7c));
    }
}

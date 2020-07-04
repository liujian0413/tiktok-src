package com.p280ss.android.ugc.aweme.commercialize.views;

import android.content.Context;
import android.graphics.Color;
import android.support.p022v4.content.C0683b;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.p280ss.android.ugc.aweme.commercialize.C24671f;
import com.p280ss.android.ugc.aweme.commercialize.feed.C24723e;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25329c;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import com.p280ss.android.ugc.aweme.utils.C43081e;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.StripAdBottomLabelView */
public class StripAdBottomLabelView extends BaseAdBottomLabelView {

    /* renamed from: h */
    private View f67213h;

    /* renamed from: i */
    private int f67214i;

    /* renamed from: j */
    private Runnable f67215j;

    /* access modifiers changed from: 0000 */
    public int getLayoutId() {
        return R.layout.ag6;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final boolean mo66102b() {
        return C25329c.m83199A(this.f67003g);
    }

    /* renamed from: i */
    public final void mo66115i() {
        super.mo66115i();
        this.f66999c.setText(R.string.avr);
    }

    /* renamed from: k */
    public final void mo66117k() {
        super.mo66117k();
        if (this.f67215j != null) {
            removeCallbacks(this.f67215j);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: p */
    public final /* synthetic */ void mo66127p() {
        C24671f.m80855e().mo65851a(this.f67213h, 0, C34943c.f91128x, true);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: q */
    public final /* synthetic */ void mo66259q() {
        C24671f.m80851a().mo64679j(getContext(), this.f67003g);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final boolean mo66103c() {
        if (this.f67003g == null || this.f67003g.getAwemeRawAd() == null || this.f67003g.getAwemeRawAd().getAnimationType() != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public final void mo66116j() {
        super.mo66116j();
        int showSeconds = getShowSeconds();
        if (this.f67215j == null) {
            this.f67215j = new C25590l(this);
        }
        postDelayed(this.f67215j, (long) (showSeconds - 100));
    }

    /* renamed from: h */
    public final void mo66114h() {
        super.mo66114h();
        this.f66999c.setText("");
        this.f66998b.setVisibility(0);
        this.f66998b.setText(R.string.bt1);
        this.f66998b.setTextColor(C0683b.m2912c(getContext(), R.color.az3));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo66098a() {
        if (this.f67003g == null || !this.f67003g.isAd() || this.f67003g.getAwemeRawAd().getButtonStyle() != 0 || TextUtils.isEmpty(this.f67003g.getAwemeRawAd().getWebUrl())) {
            return false;
        }
        return true;
    }

    /* renamed from: o */
    public final void mo66126o() {
        boolean z;
        int i;
        int i2;
        if (!mo66098a()) {
            setLabelVisibility(8);
            return;
        }
        mo66104d();
        setLabelVisibility(0);
        if (mo66102b()) {
            this.f67214i = Color.parseColor(C25329c.m83242y(this.f67003g));
            i2 = getDefaultColor();
            mo66099b((View) this, (Runnable) new C25589k(this));
            i = 0;
            z = true;
        } else {
            this.f67214i = getContext().getResources().getColor(R.color.w0);
            i2 = this.f67214i;
            i = getResources().getDimensionPixelOffset(R.dimen.bl);
            z = false;
        }
        mo66092a(i2, 0);
        C24671f.m80855e().mo65851a(this, i, 0, z);
        C24671f.m80855e().mo65851a(this.f67213h, i, 0, z);
    }

    public StripAdBottomLabelView(Context context) {
        this(context, null);
    }

    public void setBackgroundColor(int i) {
        mo66092a(i, 0);
    }

    /* access modifiers changed from: 0000 */
    public void setLabelVisibility(int i) {
        setVisibility(i);
        if (this.f67213h != null) {
            this.f67213h.setVisibility(i);
        }
    }

    public StripAdBottomLabelView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo66092a(int i, int i2) {
        if (i2 > 0) {
            C43081e.m136672a((View) this, getBackGroundColor(), i, (long) i2);
            return;
        }
        super.setBackgroundColor(i);
        if (this.f67213h != null) {
            this.f67213h.setBackgroundColor(i);
        }
        float f = 1.0f;
        if (i == getDefaultColor()) {
            f = 0.6f;
        }
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            getChildAt(i3).setAlpha(f);
        }
    }

    /* renamed from: a */
    public final void mo66258a(Aweme aweme, C24723e eVar, View view) {
        this.f67213h = view;
        mo66095a(aweme, eVar);
    }

    public StripAdBottomLabelView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setDefaultColor(C0683b.m2912c(context, R.color.a5u));
    }
}

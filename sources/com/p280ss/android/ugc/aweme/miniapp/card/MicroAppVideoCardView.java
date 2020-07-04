package com.p280ss.android.ugc.aweme.miniapp.card;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.base.p308ui.AnimatedImageView;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.miniapp.card.MicroAppVideoCardView */
public class MicroAppVideoCardView extends ConstraintLayout {

    /* renamed from: g */
    public boolean f87197g;

    /* renamed from: h */
    private View f87198h;

    /* renamed from: i */
    private AnimatedImageView f87199i;

    /* renamed from: j */
    private DmtTextView f87200j;

    /* renamed from: k */
    private DmtTextView f87201k;

    /* renamed from: l */
    private DmtTextView f87202l;

    /* renamed from: m */
    private ImageView f87203m;

    /* renamed from: n */
    private C33373a f87204n;

    /* renamed from: com.ss.android.ugc.aweme.miniapp.card.MicroAppVideoCardView$a */
    interface C33373a {
    }

    /* renamed from: b */
    public final void mo20984b() {
        m107941c();
    }

    /* renamed from: c */
    private void m107941c() {
        setAlpha(0.0f);
        setVisibility(8);
        setTranslationX(0.0f);
        setTranslationY(0.0f);
    }

    public void setOnClickCloseListener(C33373a aVar) {
        this.f87204n = aVar;
    }

    public MicroAppVideoCardView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public final void mo85553a(boolean z, Aweme aweme) {
        this.f87197g = z;
        setVisibility(8);
    }

    public MicroAppVideoCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MicroAppVideoCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f87198h = LayoutInflater.from(context).inflate(R.layout.adl, this);
        this.f87199i = (AnimatedImageView) this.f87198h.findViewById(R.id.byw);
        this.f87203m = (ImageView) this.f87198h.findViewById(R.id.byu);
        this.f87201k = (DmtTextView) this.f87198h.findViewById(R.id.byv);
        this.f87200j = (DmtTextView) this.f87198h.findViewById(R.id.byx);
        this.f87202l = (DmtTextView) this.f87198h.findViewById(R.id.byt);
    }
}

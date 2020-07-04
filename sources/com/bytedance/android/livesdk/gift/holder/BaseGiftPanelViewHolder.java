package com.bytedance.android.livesdk.gift.holder;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import com.C1642a;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.utils.C3393m;
import com.bytedance.android.live.core.utils.C3404s.C3405a;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.gift.combo.ComboTarget;
import com.bytedance.android.livesdk.gift.model.C8149d;
import com.bytedance.android.livesdk.gift.model.p390a.C8134a;
import com.bytedance.android.livesdk.widget.SpecialCombView;
import com.bytedance.android.livesdkapi.host.C9456c;
import com.bytedance.common.utility.C6311g;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Locale;

public abstract class BaseGiftPanelViewHolder<T extends C8134a> extends BasePanelViewHolder<T> {

    /* renamed from: a */
    protected HSImageView f22027a;

    /* renamed from: b */
    protected ImageView f22028b;

    /* renamed from: c */
    protected View f22029c;

    /* renamed from: d */
    protected View f22030d;

    /* renamed from: n */
    private View f22031n;

    /* renamed from: o */
    private SpecialCombView f22032o;

    /* renamed from: p */
    private ComboTarget f22033p;

    /* renamed from: a */
    public ComboTarget mo21165a() {
        return this.f22033p;
    }

    /* renamed from: a */
    public void mo21168a(boolean z) {
        int i;
        if (this.f22030d != null) {
            View view = this.f22030d;
            if (z) {
                i = R.drawable.bqr;
            } else {
                i = 0;
            }
            view.setBackgroundResource(i);
        }
    }

    public BaseGiftPanelViewHolder(View view) {
        super(view);
        this.f22029c = view.findViewById(R.id.d25);
        this.f22030d = view.findViewById(R.id.ar8);
        this.f22028b = (ImageView) view.findViewById(R.id.a8k);
        this.f22027a = (HSImageView) view.findViewById(R.id.a8l);
        this.f22031n = view.findViewById(R.id.kt);
        this.f22032o = (SpecialCombView) view.findViewById(R.id.d3e);
    }

    /* renamed from: a */
    public void mo21167a(T t) {
        boolean z;
        super.mo21167a(t);
        if (!(t.f22206d instanceof C8149d) || ((C8149d) t.f22206d).f22234e != 9) {
            String string = this.f22035e.getString(R.string.eha);
            if (string.contains("%d")) {
                String replace = string.replace("%d", "%s");
                this.f22039i.setText(C1642a.m8035a(Locale.getDefault(), replace, new Object[]{String.valueOf(t.mo21260a())}));
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                this.f22039i.setText(this.f22035e.getString(R.string.eha, new Object[]{Integer.valueOf(t.mo21260a())}));
            }
        } else {
            this.f22039i.setVisibility(8);
        }
        this.f22040j.setVisibility(8);
        this.f22027a.setVisibility(8);
        if (t.mo21276q() != null && C6311g.m19574b(t.mo21276q().getUrls())) {
            this.f22027a.setVisibility(0);
            C3393m.m12621a(this.f22027a, t.mo21276q(), (C3405a) new C3405a() {
                /* renamed from: a */
                public final void mo10308a(ImageModel imageModel) {
                }

                /* renamed from: a */
                public final void mo10310a(ImageModel imageModel, Exception exc) {
                    BaseGiftPanelViewHolder.this.f22027a.setVisibility(8);
                }

                /* renamed from: a */
                public final void mo10309a(ImageModel imageModel, int i, int i2, boolean z) {
                    LayoutParams layoutParams = BaseGiftPanelViewHolder.this.f22027a.getLayoutParams();
                    layoutParams.width = (int) (((float) layoutParams.height) * (((float) i) / ((float) i2)));
                    BaseGiftPanelViewHolder.this.f22027a.setLayoutParams(layoutParams);
                    BaseGiftPanelViewHolder.this.f22027a.setVisibility(0);
                }
            });
        }
        if (t.mo21261b() && (t.mo21273n() == null || TextUtils.isEmpty(t.mo21273n().getUri()))) {
            ((Integer) LiveSettingKeys.LIVE_GIFT_DIALOG_STYLE.mo10240a()).intValue();
        }
        this.f22029c.setVisibility(8);
        mo21168a(t.f22204b);
        if (!t.f22205c || t.mo21262c() || !((C9456c) C3596c.m13172a(C9456c.class)).mo23195a(t.mo21274o())) {
            this.f22038h.setAlpha(1.0f);
        } else {
            this.f22038h.setAlpha(0.32f);
        }
        if (this.f22033p == null) {
            this.f22033p = new ComboTarget(this.f22032o, this.f22031n);
        }
        this.f22033p.hideAll();
    }
}

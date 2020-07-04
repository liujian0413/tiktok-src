package com.bytedance.android.livesdk.gift.holder;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.android.livesdk.gift.combo.ComboTarget;
import com.bytedance.android.livesdk.gift.model.C8149d;
import com.bytedance.android.livesdk.gift.model.p390a.C8134a;
import com.bytedance.android.livesdk.widget.SendGiftAnimationView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

public class XgPanelViewHolder extends BaseGiftPanelViewHolder<C8134a> implements OnClickListener {

    /* renamed from: n */
    private View f22057n;

    /* renamed from: o */
    private C8134a f22058o;

    /* renamed from: p */
    private SendGiftAnimationView f22059p;

    /* renamed from: q */
    private boolean f22060q;

    /* renamed from: a */
    public final ComboTarget mo21165a() {
        return null;
    }

    /* renamed from: a */
    public final void mo21167a(C8134a aVar) {
        this.f22058o = aVar;
        this.f22057n = this.f22038h.findViewById(R.id.a20);
        this.f22059p = (SendGiftAnimationView) this.f22038h.findViewById(R.id.gf);
        super.mo21167a(aVar);
        if (this.f22060q) {
            if (getAdapterPosition() == 0) {
                aVar.f22204b = true;
                mo21168a(true);
                return;
            }
            this.f22038h.setAlpha(0.3f);
            this.f22038h.setEnabled(false);
        }
    }

    public void onClick(View view) {
        if (view.getId() == R.id.gf && (view instanceof SendGiftAnimationView)) {
            ((SendGiftAnimationView) view).mo22588a(0.7f);
            if (this.f22042l != null) {
                this.f22042l.mo21171a(this, this.f22058o);
            }
        }
    }

    /* renamed from: a */
    public final void mo21168a(boolean z) {
        if (this.f22058o != null && (this.f22058o.f22206d instanceof C8149d)) {
            if (z) {
                this.f22059p.mo22587a();
                this.f22059p.mo22589a((C8149d) this.f22058o.f22206d);
                this.f22057n.setVisibility(8);
                this.f22059p.setVisibility(0);
                this.f22059p.mo22588a(1.08f);
                this.f22059p.setOnClickListener(this);
                return;
            }
            this.f22057n.setVisibility(0);
            this.f22059p.setVisibility(8);
        }
    }

    public XgPanelViewHolder(View view, boolean z) {
        super(view);
        this.f22060q = z;
    }
}

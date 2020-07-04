package com.bytedance.android.livesdk.gift.holder;

import android.support.constraint.ConstraintLayout.LayoutParams;
import android.view.View;
import com.bytedance.android.livesdk.gift.combo.ComboTarget;
import com.bytedance.android.livesdk.gift.model.p390a.C8142i;
import com.bytedance.android.livesdk.utils.C9051ar;
import com.zhiliaoapp.musically.df_live_zego_link.R;

public class RedPacketPanelViewHolder extends BaseGiftPanelViewHolder<C8142i> {

    /* renamed from: n */
    private final View f22055n;

    /* renamed from: a */
    public final ComboTarget mo21165a() {
        return null;
    }

    public RedPacketPanelViewHolder(View view) {
        super(view);
        this.f22055n = view.findViewById(R.id.dv5);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo21167a(C8142i iVar) {
        super.mo21167a(iVar);
        this.f22036f.setText(iVar.mo21271l());
        this.f22055n.setVisibility(8);
        this.f22039i.setVisibility(8);
        this.f22040j.setVisibility(8);
        if (this.f22036f.getLayoutParams() instanceof LayoutParams) {
            LayoutParams layoutParams = (LayoutParams) this.f22036f.getLayoutParams();
            layoutParams.bottomMargin = (int) C9051ar.m27035b(this.f22035e, 5.0f);
            this.f22036f.setLayoutParams(layoutParams);
        }
    }
}

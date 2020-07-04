package com.bytedance.android.livesdk.gift.panel.widget;

import android.arch.lifecycle.C0043i;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.livesdk.chatroom.event.C4450t;
import com.bytedance.android.livesdk.chatroom.event.UserProfileEvent;
import com.bytedance.android.livesdk.chatroom.widget.AvatarIconView;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.gift.model.p390a.C8134a;
import com.bytedance.android.livesdk.gift.panel.p391a.C8169b;
import com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel.SendToType;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.zhiliaoapp.musically.df_live_zego_link.R;

public class GiftPanelGuestInfoWidget extends LiveWidget implements OnClickListener {

    /* renamed from: a */
    private AvatarIconView f22519a;

    /* renamed from: b */
    private TextView f22520b;

    /* renamed from: c */
    private View f22521c;

    /* renamed from: d */
    private View f22522d;

    /* renamed from: e */
    private GiftDialogViewModel f22523e;

    /* renamed from: f */
    private SendToType f22524f;

    public int getLayoutId() {
        return R.layout.anl;
    }

    public void onDestroy() {
        super.onDestroy();
        this.f22523e.mo21338a((C0043i) this);
    }

    public void onCreate() {
        super.onCreate();
        this.f22523e = (GiftDialogViewModel) this.dataCenter.get("data_gift_dialog_view_model");
        this.f22524f = this.f22523e.f22455c;
        m25165a();
        this.f22523e.f22470r.observe(this, new C8252t(this));
        this.f22523e.f22471s.observe(this, new C8253u(this));
    }

    /* renamed from: a */
    private void m25165a() {
        this.containerView.setVisibility(0);
        this.f22519a = (AvatarIconView) this.contentView.findViewById(R.id.ic);
        this.f22520b = (TextView) this.contentView.findViewById(R.id.dkx);
        this.f22521c = this.contentView.findViewById(R.id.e9x);
        this.f22522d = this.contentView.findViewById(R.id.e_0);
        if (((Boolean) LiveSettingKeys.LIVE_MT_GUEST_LINK_ENABLE_GUEST_CONTRIBUTION_LIST.mo10240a()) != Boolean.TRUE) {
            this.f22522d.setVisibility(8);
        }
        User user = this.f22523e.f22458f;
        if (user != null) {
            this.f22519a.setAvatar(user.getAvatarThumb());
            this.f22520b.setText(C3358ac.m12517a((int) R.string.cwu, user.getNickName()));
        }
        this.f22519a.setOnClickListener(this);
        this.f22521c.setOnClickListener(this);
        this.f22522d.setOnClickListener(this);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo21364a(C8134a aVar) {
        boolean z;
        if (aVar == null || !aVar.mo21262c()) {
            z = true;
        } else {
            z = false;
        }
        m25166a(z);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo21365a(C8169b bVar) {
        boolean z;
        if (bVar == null) {
            z = true;
        } else {
            z = false;
        }
        m25166a(z);
    }

    public void onClick(View view) {
        if (view.getId() == R.id.ic || view.getId() == R.id.e9x) {
            this.f22523e.f22469q.postValue(Boolean.valueOf(true));
            C9097a.m27146a().mo22267a((Object) new UserProfileEvent(this.f22523e.f22458f, "guest_connection"));
            return;
        }
        if (view.getId() == R.id.e_0) {
            C4450t tVar = new C4450t(6);
            tVar.f12910b = Long.valueOf(this.f22523e.f22458f.getId());
            this.dataCenter.lambda$put$1$DataCenter("cmd_interact_state_change", tVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003f, code lost:
        if (r5 != false) goto L_0x0044;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m25166a(boolean r5) {
        /*
            r4 = this;
            com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel$SendToType r0 = r4.f22524f
            com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel$SendToType r1 = com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel.SendToType.GUEST
            if (r0 == r1) goto L_0x0007
            return
        L_0x0007:
            com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel r0 = r4.f22523e
            android.arch.lifecycle.o<com.bytedance.android.livesdk.gift.model.a.a> r0 = r0.f22470r
            java.lang.Object r0 = r0.getValue()
            com.bytedance.android.livesdk.gift.model.a.a r0 = (com.bytedance.android.livesdk.gift.model.p390a.C8134a) r0
            r1 = 0
            r2 = 8
            if (r0 == 0) goto L_0x0025
            boolean r0 = r0.mo21262c()
            if (r0 == 0) goto L_0x0025
            android.view.View r5 = r4.f22521c
            r5.setVisibility(r2)
            android.view.View r5 = r4.f22522d
            r0 = r5
            goto L_0x0042
        L_0x0025:
            android.view.View r0 = r4.f22521c
            if (r5 == 0) goto L_0x002b
            r3 = 0
            goto L_0x002d
        L_0x002b:
            r3 = 8
        L_0x002d:
            r0.setVisibility(r3)
            com.bytedance.android.live.core.setting.l<java.lang.Boolean> r0 = com.bytedance.android.livesdk.config.LiveSettingKeys.LIVE_MT_GUEST_LINK_ENABLE_GUEST_CONTRIBUTION_LIST
            java.lang.Object r0 = r0.mo10240a()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            if (r0 == r3) goto L_0x003d
            r5 = 0
        L_0x003d:
            android.view.View r0 = r4.f22522d
            if (r5 == 0) goto L_0x0042
            goto L_0x0044
        L_0x0042:
            r1 = 8
        L_0x0044:
            r0.setVisibility(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.gift.panel.widget.GiftPanelGuestInfoWidget.m25166a(boolean):void");
    }
}

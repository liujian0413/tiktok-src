package com.bytedance.android.livesdk.gift.dialog.view;

import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0053p;
import android.graphics.Point;
import android.support.constraint.ConstraintLayout.LayoutParams;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.WindowManager;
import com.bytedance.android.livesdk.chatroom.event.C4423ao;
import com.bytedance.android.livesdk.gift.dialog.C7897b;
import com.bytedance.android.livesdk.gift.dialog.view.topbar.LiveGiftTopWidget;
import com.bytedance.android.livesdk.gift.dialog.viewmodel.C7938a;
import com.bytedance.android.livesdk.gift.dialog.viewmodel.C7939b;
import com.bytedance.android.livesdk.gift.dialog.viewmodel.GiftViewModel;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.zhiliaoapp.musically.df_live_zego_link.R;

public class LiveBaseGiftPanelWidget extends LiveRecyclableWidget implements OnClickListener {

    /* renamed from: a */
    private View f21320a;

    /* renamed from: b */
    private final GiftViewModel f21321b;

    /* renamed from: c */
    private View f21322c;

    /* renamed from: d */
    private View f21323d;

    /* renamed from: e */
    private View f21324e;

    /* renamed from: f */
    private boolean f21325f;

    /* renamed from: g */
    private boolean f21326g;

    public int getLayoutId() {
        return R.layout.apc;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo20711a() {
        this.f21321b.mo20792a(new C7938a(12, null));
    }

    /* renamed from: b */
    private void m24210b() {
        if (this.f21325f) {
            C7897b.m24204b();
            this.f21326g = true;
            this.f21324e.setVisibility(8);
            this.f21324e.post(new C7915c(this));
        }
    }

    public void onUnload() {
        this.f21321b.mo20783a((C0043i) this);
        C9097a.m27146a().mo22267a((Object) new C4423ao(this.f21326g));
    }

    /* renamed from: d */
    private void m24213d() {
        enableSubWidgetManager();
        this.subWidgetManager.load(R.id.dmg, new LiveGiftTopWidget(this.f21321b));
        this.subWidgetManager.load(R.id.ar_, new LiveGiftListWidget(this.f21321b));
        this.subWidgetManager.load(R.id.no, new LiveGiftBottomWidget(this.f21321b));
        this.subWidgetManager.load(R.id.al_, new LiveGiftFirstChargeWidget(this.f21321b));
    }

    /* renamed from: c */
    private void m24212c() {
        if (!((Boolean) this.dataCenter.get("data_is_portrait", Boolean.valueOf(true))).booleanValue()) {
            WindowManager windowManager = (WindowManager) this.context.getSystemService("window");
            Point point = new Point();
            windowManager.getDefaultDisplay().getSize(point);
            int i = 375 - point.y;
            if (this.f21322c.getLayoutParams() instanceof LayoutParams) {
                LayoutParams layoutParams = (LayoutParams) this.f21322c.getLayoutParams();
                layoutParams.height += i / 2;
                this.f21322c.setLayoutParams(layoutParams);
            }
            if (this.f21323d.getLayoutParams() instanceof LayoutParams) {
                LayoutParams layoutParams2 = (LayoutParams) this.f21323d.getLayoutParams();
                layoutParams2.height += i / 2;
                this.f21323d.setLayoutParams(layoutParams2);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo20712a(View view) {
        m24210b();
    }

    public void onClick(View view) {
        if (view.getId() == R.id.a9l) {
            this.f21321b.mo20792a(new C7938a(1, null));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void mo20713a(C7939b bVar) {
        boolean z;
        if (bVar != null) {
            boolean z2 = bVar.f21502j;
            if (bVar.f21493a == 2) {
                z = true;
            } else {
                z = false;
            }
            m24209a(z2, z);
        }
    }

    public void onInit(Object[] objArr) {
        this.f21320a = findViewById(R.id.a9l);
        this.f21322c = findViewById(R.id.dmg);
        this.f21323d = findViewById(R.id.no);
        this.f21324e = findViewById(R.id.aqq);
    }

    public void onLoad(Object[] objArr) {
        m24212c();
        m24213d();
        this.f21320a.setOnClickListener(this);
        this.f21321b.mo20792a(new C7938a(2, null));
        this.f21321b.mo20792a(new C7938a(4, null));
        this.f21321b.mo20792a(new C7938a(3, null));
        this.f21321b.mo20784a((C0043i) this, (C0053p<C7939b>) new C7913a<C7939b>(this));
        this.f21324e.setOnClickListener(new C7914b(this));
    }

    /* renamed from: a */
    private void m24209a(boolean z, boolean z2) {
        this.f21325f = z;
        if (z) {
            if (z2) {
                C7897b.m24195a();
            }
            this.f21324e.setVisibility(0);
            C9097a.m27146a().mo22267a((Object) new C4423ao(true));
            return;
        }
        this.f21324e.setVisibility(8);
        C9097a.m27146a().mo22267a((Object) new C4423ao(false));
    }
}

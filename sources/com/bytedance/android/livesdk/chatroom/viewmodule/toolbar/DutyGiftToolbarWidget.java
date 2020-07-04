package com.bytedance.android.livesdk.chatroom.viewmodule.toolbar;

import android.arch.lifecycle.C0053p;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C5738d.C5739a;
import com.bytedance.android.livesdk.log.C8444d;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.zhiliaoapp.musically.df_live_zego_link.R;

public class DutyGiftToolbarWidget extends LiveRecyclableWidget implements C0053p<KVData>, OnClickListener {

    /* renamed from: a */
    static final int f16833a = 2131495214;

    /* renamed from: b */
    private C5746i f16834b;

    /* renamed from: c */
    private ViewGroup f16835c;

    /* renamed from: d */
    private View f16836d;

    public int getLayoutId() {
        return R.layout.awc;
    }

    public void onUnload() {
    }

    public void onClick(View view) {
        if (view.getId() == R.id.ab) {
            this.dataCenter.lambda$put$1$DataCenter("cmd_stop_duty_gift", Boolean.valueOf(true));
        }
    }

    public void onInit(Object... objArr) {
        this.f16835c = (ViewGroup) this.contentView.findViewById(R.id.ac);
        this.contentView.findViewById(R.id.ab).setOnClickListener(this);
    }

    public void onLoad(Object... objArr) {
        this.f16834b = (C5746i) C5747j.m18103a();
        this.dataCenter.observeForever("tool_bar_button_load", this).observeForever("tool_bar_button_unload", this);
        m18062a(ToolbarButton.GIFT);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onChanged(KVData kVData) {
        if (!(kVData == null || kVData.getKey() == null || kVData.getData() == null || !"tool_bar_button_load".equals(kVData.getKey()) || !((ToolbarButton) kVData.getData()).equals(ToolbarButton.GIFT))) {
            C5739a b = this.f16834b.mo14178b(ToolbarButton.GIFT);
            if (b != null) {
                this.f16836d.setVisibility(0);
                this.f16836d.setOnClickListener(b);
            }
        }
    }

    /* renamed from: a */
    private void m18062a(ToolbarButton toolbarButton) {
        View inflate = LayoutInflater.from(this.context).inflate(toolbarButton.getLayoutId(), this.f16835c, false);
        inflate.setTag(toolbarButton);
        if (toolbarButton.getLayoutId() == f16833a) {
            inflate.setBackgroundResource(toolbarButton.getDrawableUnfolded());
        }
        inflate.setVisibility(8);
        C8444d.m25673b();
        C8444d.m11971b("ttlive_gift", "Gift icon status changed, visiable:false, reason:DutyGiftToolbarWidget#configToolbarViews");
        ViewParent parent = inflate.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(inflate);
        }
        this.f16835c.addView(inflate);
        this.f16834b.mo14176a(toolbarButton, inflate);
        this.f16836d = inflate;
    }
}

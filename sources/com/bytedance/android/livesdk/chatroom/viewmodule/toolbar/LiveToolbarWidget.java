package com.bytedance.android.livesdk.chatroom.viewmodule.toolbar;

import android.arch.lifecycle.C0053p;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.android.live.core.p147c.C3166a;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.chatroom.utils.C5343e;
import com.bytedance.android.livesdk.chatroom.viewmodule.p221a.p222a.C5572e;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.p428w.C9178j;
import com.bytedance.common.utility.C6311g;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LiveToolbarWidget extends LiveRecyclableWidget implements C0053p<KVData> {

    /* renamed from: a */
    static final int f16837a = 2131495214;

    /* renamed from: b */
    private List<ToolbarButton> f16838b = new ArrayList();

    /* renamed from: c */
    private Map<ToolbarButton, View> f16839c;

    /* renamed from: d */
    private C5746i f16840d;

    /* renamed from: e */
    private Map<ToolbarButton, View> f16841e = new HashMap();

    /* renamed from: f */
    private List<View> f16842f = new ArrayList();

    /* renamed from: g */
    private ViewGroup f16843g;

    /* renamed from: h */
    private boolean f16844h;

    public int getLayoutId() {
        return R.layout.axi;
    }

    public void onClear() {
        super.onClear();
        C5747j.m18107e();
    }

    /* renamed from: b */
    private void m18068b() {
        for (ToolbarButton toolbarButton : this.f16838b) {
            View view = (View) this.f16839c.get(toolbarButton);
            if (view != null) {
                this.f16843g.removeView(view);
                this.f16840d.mo14179b(toolbarButton, view);
            }
        }
    }

    public void onUnload() {
        C5747j.m18105c().mo14164a(ToolbarButton.GOODS, (C5735a) new C5572e(8));
        this.dataCenter.removeObserver(this);
        m18068b();
        this.f16838b.clear();
        C5747j.m18106d();
    }

    /* renamed from: a */
    private void m18064a() {
        LayoutInflater from = LayoutInflater.from(this.context);
        for (ToolbarButton toolbarButton : this.f16838b) {
            View view = (View) this.f16841e.get(toolbarButton);
            if (view == null) {
                view = from.inflate(toolbarButton.getLayoutId(), this.f16843g, false);
                if (toolbarButton.getLayoutId() == f16837a) {
                    this.f16841e.put(toolbarButton, view);
                }
            }
            if (toolbarButton.getLayoutId() == f16837a) {
                view.setBackgroundResource(toolbarButton.getDrawableUnfolded());
            }
            if (toolbarButton == ToolbarButton.TURNTABLE) {
                m18065a(view);
            }
            view.setTag(toolbarButton);
            view.setVisibility(8);
            this.f16839c.put(toolbarButton, view);
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view);
            }
            this.f16843g.addView(view);
            this.f16840d.mo14176a(toolbarButton, view);
        }
    }

    public void onInit(Object... objArr) {
        this.f16843g = (ViewGroup) this.contentView.findViewById(R.id.ac);
    }

    /* renamed from: a */
    private static void m18065a(View view) {
        HSImageView hSImageView = (HSImageView) view.findViewById(R.id.dpr);
        String str = (String) LiveSettingKeys.TURNTABLE_ICON_URL.mo10240a();
        if (str == null || str.isEmpty()) {
            C5343e.m17037a(hSImageView, (int) R.drawable.c73);
        } else {
            C5343e.m17040a(hSImageView, str);
        }
    }

    /* renamed from: a */
    private static void m18067a(List<ToolbarButton> list) {
        boolean z;
        if (C6311g.m19573a(list) || !list.contains(ToolbarButton.TURNTABLE)) {
            z = false;
        } else {
            z = true;
        }
        StringBuilder sb = new StringBuilder("toolbarButton list contain TurnTable : ");
        sb.append(z);
        C3166a.m11964c("LiveToolbarWidget", sb.toString());
    }

    public void onLoad(Object... objArr) {
        this.f16840d = (C5746i) C5747j.m18103a();
        this.f16839c = this.f16840d.f16853b;
        this.f16840d.f16852a = this.dataCenter;
        ((C5746i) C5747j.m18104b()).f16852a = this.dataCenter;
        this.dataCenter.observe("data_screen_record_is_open", this).observe("data_keyboard_status", this).observe("cmd_hide_other_toolbar", this).observeForever("cmd_hide_in_douyin_commerce", this);
        if (TextUtils.isEmpty((CharSequence) LiveConfigSettingKeys.LIVE_TURNTABLE_URL.mo10240a())) {
            ((IGiftService) C3596c.m13172a(IGiftService.class)).onTurnTableUrlEmpty("LiveConfigSettingKeys取出为空");
        }
        C9178j.m27302j().mo22377f().mo14169a(this.dataCenter, this.f16838b);
        m18067a(this.f16838b);
        m18064a();
        C9178j.m27302j().mo22377f().mo14168a(this.dataCenter, this.context);
        this.dataCenter.get("data_room");
        ((Boolean) this.dataCenter.get("data_is_anchor")).booleanValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onChanged(KVData kVData) {
        if (kVData != null && kVData.getKey() != null && kVData.getData() != null) {
            String key = kVData.getKey();
            char c = 65535;
            int hashCode = key.hashCode();
            if (hashCode != -1755796428) {
                if (hashCode != -1548871708) {
                    if (hashCode != 1060055221) {
                        if (hashCode == 1939188655 && key.equals("data_screen_record_is_open")) {
                            c = 0;
                        }
                    } else if (key.equals("data_keyboard_status")) {
                        c = 1;
                    }
                } else if (key.equals("cmd_hide_in_douyin_commerce")) {
                    c = 2;
                }
            } else if (key.equals("cmd_hide_other_toolbar")) {
                c = 3;
            }
            int i = 4;
            switch (c) {
                case 0:
                    if (!((Boolean) kVData.getData()).booleanValue() && !this.f16844h) {
                        i = 0;
                    }
                    this.contentView.setVisibility(i);
                    return;
                case 1:
                    if (((Boolean) kVData.getData()).booleanValue()) {
                        this.contentView.setVisibility(4);
                        return;
                    }
                    this.contentView.setVisibility(0);
                    this.f16844h = false;
                    return;
                case 2:
                    if (((Boolean) kVData.getData()).booleanValue()) {
                        this.contentView.setVisibility(4);
                        return;
                    } else {
                        this.contentView.setVisibility(0);
                        return;
                    }
                case 3:
                    if (!((Boolean) kVData.getData(Boolean.valueOf(false))).booleanValue()) {
                        for (View visibility : this.f16842f) {
                            visibility.setVisibility(0);
                        }
                        this.f16842f.clear();
                        break;
                    } else {
                        this.f16842f.clear();
                        for (ToolbarButton toolbarButton : this.f16838b) {
                            View view = (View) this.f16839c.get(toolbarButton);
                            if (!(view == null || toolbarButton == ToolbarButton.INCOME_MORE || view.getVisibility() != 0)) {
                                view.setVisibility(8);
                                this.f16842f.add(view);
                            }
                        }
                        return;
                    }
            }
        }
    }
}

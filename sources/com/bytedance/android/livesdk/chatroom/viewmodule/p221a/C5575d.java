package com.bytedance.android.livesdk.chatroom.viewmodule.p221a;

import android.arch.lifecycle.C0053p;
import android.content.Context;
import android.view.View;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.event.C4427as;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C5735a;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C5738d.C5739a;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C5740e;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C5748k;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.ToolbarButton;
import com.bytedance.android.livesdk.log.C8448g;
import com.bytedance.android.livesdk.p428w.C9178j;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.C6311g;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.KVData;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.a.d */
public final class C5575d implements C0053p<KVData>, C5739a {

    /* renamed from: a */
    private Room f16632a;

    /* renamed from: b */
    private List<ToolbarButton> f16633b = new ArrayList();

    /* renamed from: c */
    private C5740e f16634c;

    /* renamed from: d */
    private View f16635d;

    /* renamed from: e */
    private Context f16636e;

    /* renamed from: f */
    private View f16637f;

    /* renamed from: a */
    public final void mo8812a(C5735a aVar) {
    }

    /* renamed from: c */
    private static boolean m18000c() {
        return C5748k.m18109a().mo14183b();
    }

    /* renamed from: d */
    private static boolean m18001d() {
        if (((IBroadcastService) C3596c.m13172a(IBroadcastService.class)).haveNewFilter()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private List<String> m17996a() {
        if (this.f16633b == null || this.f16633b.size() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(this.f16633b.size());
        for (ToolbarButton name : this.f16633b) {
            arrayList.add(name.name());
        }
        return arrayList;
    }

    /* renamed from: b */
    private void m17999b() {
        if (this.f16637f == null || (!m18001d() && !m18000c())) {
            if (this.f16637f != null) {
                this.f16637f.setVisibility(8);
            }
            return;
        }
        this.f16637f.setVisibility(0);
    }

    public C5575d(Context context) {
        this.f16636e = context;
    }

    public final void onClick(View view) {
        if (!C6311g.m19573a(this.f16633b)) {
            this.f16634c = new C5740e(this.f16636e, this.f16633b);
            this.f16634c.mo14172a(this.f16635d);
        }
        C8448g.m25682a(C3358ac.m12528e());
        TTLiveSDKContext.getHostService().mo22367h().mo22179b();
        this.f16632a.getId();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onChanged(KVData kVData) {
        if (kVData != null && kVData.getData() != null) {
            String key = kVData.getKey();
            char c = 65535;
            int hashCode = key.hashCode();
            if (hashCode != 982604344) {
                if (hashCode == 1631824572 && key.equals("cmd_video_orientation_changed")) {
                    c = 0;
                }
            } else if (key.equals("cmd_toolbar_click_filter")) {
                c = 1;
            }
            switch (c) {
                case 0:
                    m17998a(((C4427as) kVData.getData()).f12860a);
                    if (!C6311g.m19573a(this.f16633b)) {
                        this.f16635d.setVisibility(0);
                        return;
                    }
                    break;
                case 1:
                    m17999b();
                    break;
            }
        }
    }

    /* renamed from: a */
    private void m17998a(boolean z) {
        if (z) {
            this.f16633b.add(ToolbarButton.SWITCH_SCREEN_ORIENTATION);
        }
        if (this.f16632a.getStreamUrl().mo23054e().size() > 1) {
            this.f16633b.add(ToolbarButton.SWITCH_VIDEO_QUALITY);
        }
    }

    /* renamed from: b */
    public final void mo8813b(View view, DataCenter dataCenter) {
        dataCenter.removeObserver(this);
        if (this.f16634c != null) {
            this.f16634c.dismiss();
        }
    }

    /* renamed from: a */
    public final void mo8811a(View view, DataCenter dataCenter) {
        this.f16632a = (Room) dataCenter.get("data_room");
        this.f16635d = view;
        this.f16637f = view.findViewById(R.id.ed_);
        if (((Boolean) dataCenter.get("data_is_anchor")).booleanValue()) {
            m17999b();
            dataCenter.observeForever("cmd_toolbar_click_filter", this);
            C9178j.m27302j().mo22377f().mo14170b(dataCenter, this.f16633b);
            C5748k.m18109a().mo14180a(m17996a());
            return;
        }
        this.f16635d.setVisibility(8);
        this.f16635d.setBackgroundResource(R.drawable.cgc);
        dataCenter.observe("cmd_video_orientation_changed", this, true);
    }
}

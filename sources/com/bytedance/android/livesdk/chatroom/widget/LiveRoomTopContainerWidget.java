package com.bytedance.android.livesdk.chatroom.widget;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.livesdk.chatroom.view.C5374d;
import com.bytedance.android.livesdk.chatroom.viewmodule.TopLeftLuckyBoxWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.VoteWidget;
import com.bytedance.android.livesdk.config.C5865c;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;

public class LiveRoomTopContainerWidget extends LiveRecyclableWidget {

    /* renamed from: a */
    private static final String f16932a = "com.bytedance.android.livesdk.chatroom.widget.LiveRoomTopContainerWidget";

    /* renamed from: b */
    private LinearLayout f16933b;

    /* renamed from: c */
    private List<C5770a> f16934c = new ArrayList();

    /* renamed from: d */
    private int f16935d;

    /* renamed from: e */
    private int f16936e;

    /* renamed from: f */
    private int f16937f;

    /* renamed from: g */
    private boolean f16938g = false;

    /* renamed from: h */
    private LiveWidget f16939h;

    /* renamed from: com.bytedance.android.livesdk.chatroom.widget.LiveRoomTopContainerWidget$a */
    class C5770a {

        /* renamed from: a */
        Class f16940a;

        /* renamed from: b */
        int f16941b;

        /* renamed from: c */
        int f16942c;

        /* renamed from: d */
        int f16943d = 0;

        /* renamed from: e */
        int f16944e = 0;

        C5770a(Class cls, int i, int i2, int i3, int i4) {
            this.f16940a = cls;
            this.f16941b = i;
            this.f16942c = i2;
        }
    }

    public int getLayoutId() {
        return R.layout.aum;
    }

    /* renamed from: b */
    private boolean m18159b() {
        if (this.dataCenter == null || this.dataCenter.get("data_room") == null) {
            return false;
        }
        return ((Room) this.dataCenter.get("data_room")).isKoiRoom();
    }

    public void onUnload() {
        if (this.f16934c != null) {
            this.f16934c.clear();
        }
        if (this.f16933b != null) {
            this.f16933b.removeAllViews();
        }
        this.f16939h = null;
    }

    /* renamed from: c */
    private void m18160c() {
        if (this.f16938g) {
            if (this.f16933b != null) {
                this.f16933b.setPadding((int) C9738o.m28708b(C3358ac.m12528e(), 3.0f), 0, 0, 0);
            }
            return;
        }
        C5374d dVar = new C5374d(getContext());
        LayoutParams layoutParams = new LayoutParams(this.f16935d, 1);
        dVar.addView(new View(getContext()), new LayoutParams(this.f16936e, 1));
        this.f16933b.addView(dVar, layoutParams);
    }

    /* renamed from: a */
    private void m18157a() {
        int i;
        if (this.f16934c == null) {
            this.f16934c = new ArrayList();
        }
        if (this.dataCenter != null) {
            Room room = (Room) this.dataCenter.get("data_room", null);
            if (room != null && !room.isStar() && !m18159b()) {
                List<C5770a> list = this.f16934c;
                Class<TopLeftLuckyBoxWidget> cls = TopLeftLuckyBoxWidget.class;
                if (this.f16938g) {
                    i = 0;
                } else {
                    i = -14;
                }
                C5770a aVar = new C5770a(cls, i, 0, 0, 0);
                list.add(aVar);
                if (((C5865c) LiveConfigSettingKeys.LIVE_VOTE_CONFIG.mo10240a()).f17307a > 0 && ((Integer) LiveSettingKeys.LIVE_OPTIMIZE_STYLE_V1.mo10240a()).intValue() == 1 && room != null && !room.isThirdParty && !room.isScreenshot) {
                    List<C5770a> list2 = this.f16934c;
                    C5770a aVar2 = new C5770a(VoteWidget.class, (int) C9738o.m28708b(getContext(), 4.0f), (int) C9738o.m28708b(getContext(), 2.0f), 0, 0);
                    list2.add(aVar2);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo14235a(ViewGroup viewGroup) {
        if (this.f16939h instanceof TopLeftLuckyBoxWidget) {
            ((TopLeftLuckyBoxWidget) this.f16939h).mo14021a(viewGroup);
        }
    }

    /* renamed from: a */
    private void m18158a(LiveWidget liveWidget) {
        if ((liveWidget instanceof TopLeftLuckyBoxWidget) && this.containerView != null) {
            this.f16939h = liveWidget;
            mo14235a((ViewGroup) this.containerView.getParent());
        }
    }

    public void onInit(Object... objArr) {
        this.f16933b = (LinearLayout) this.contentView.findViewById(R.id.eh5);
        boolean z = true;
        if (((Integer) LiveSettingKeys.LIVE_OPTIMIZE_STYLE_V1.mo10240a()).intValue() <= 1) {
            z = false;
        }
        this.f16938g = z;
        this.f16935d = (int) C9738o.m28708b(getContext(), 24.0f);
        this.f16936e = (int) C9738o.m28708b(getContext(), 30.0f);
        this.f16937f = (int) C9738o.m28708b(getContext(), 44.0f);
    }

    public void onLoad(Object... objArr) {
        m18157a();
        this.f16933b.removeAllViews();
        enableSubWidgetManager();
        m18160c();
        for (C5770a aVar : this.f16934c) {
            C5374d dVar = new C5374d(getContext());
            LiveRecyclableWidget load = ((RecyclableWidgetManager) this.subWidgetManager).load((ViewGroup) dVar, aVar.f16940a, false, (Object[]) null);
            LayoutParams layoutParams = new LayoutParams(-2, -2);
            layoutParams.rightMargin = aVar.f16942c;
            layoutParams.leftMargin = aVar.f16941b;
            layoutParams.topMargin = aVar.f16943d;
            layoutParams.bottomMargin = aVar.f16944e;
            layoutParams.gravity = 1;
            this.f16933b.addView(dVar, layoutParams);
            m18158a((LiveWidget) load);
        }
    }
}

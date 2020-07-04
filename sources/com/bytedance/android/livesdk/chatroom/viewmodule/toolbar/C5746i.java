package com.bytedance.android.livesdk.chatroom.viewmodule.toolbar;

import android.view.View;
import com.bytedance.android.live.core.p147c.C3166a;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C5738d.C5739a;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.sdk.widgets.DataCenter;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.i */
final class C5746i implements C5738d {

    /* renamed from: a */
    public DataCenter f16852a;

    /* renamed from: b */
    public Map<ToolbarButton, View> f16853b = new HashMap();

    /* renamed from: c */
    private Map<ToolbarButton, C5739a> f16854c = new HashMap();

    C5746i() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final C5739a mo14178b(ToolbarButton toolbarButton) {
        return (C5739a) this.f16854c.get(toolbarButton);
    }

    /* renamed from: a */
    public final boolean mo14166a(ToolbarButton toolbarButton) {
        View view = (View) this.f16853b.get(toolbarButton);
        if (view == null || view.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo14177a(boolean z) {
        for (Entry entry : this.f16853b.entrySet()) {
            if (((View) this.f16853b.get(entry.getKey())) != null) {
                mo14179b((ToolbarButton) entry.getKey(), (View) entry.getValue());
            }
        }
        this.f16853b.clear();
        if (z) {
            this.f16854c.clear();
        }
    }

    /* renamed from: a */
    public final void mo14163a(ToolbarButton toolbarButton, int i) {
        if (toolbarButton != null) {
            C9738o.m28712b((View) this.f16853b.get(toolbarButton), i);
        }
    }

    /* renamed from: a */
    public final void mo14164a(ToolbarButton toolbarButton, C5735a aVar) {
        C5739a aVar2 = (C5739a) this.f16854c.get(toolbarButton);
        if (aVar2 != null) {
            aVar2.mo8812a(aVar);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo14179b(ToolbarButton toolbarButton, View view) {
        C5739a aVar = (C5739a) this.f16854c.get(toolbarButton);
        if (aVar != null) {
            aVar.mo8813b(view, this.f16852a);
            view.setVisibility(8);
            view.setOnClickListener(null);
        }
    }

    /* renamed from: b */
    public final void mo14167b(ToolbarButton toolbarButton, C5739a aVar) {
        View view = (View) this.f16853b.get(toolbarButton);
        if (view != null) {
            mo14179b(toolbarButton, view);
        }
        this.f16854c.remove(toolbarButton);
        if (this.f16852a != null) {
            this.f16852a.lambda$put$1$DataCenter("tool_bar_button_unload", toolbarButton);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo14176a(ToolbarButton toolbarButton, View view) {
        C5739a aVar = (C5739a) this.f16854c.get(toolbarButton);
        boolean z = false;
        if (aVar != null) {
            view.setVisibility(0);
            view.setOnClickListener(aVar);
            aVar.mo8811a(view, this.f16852a);
        }
        if (toolbarButton == ToolbarButton.TURNTABLE) {
            String str = "ToolbarManager";
            StringBuilder sb = new StringBuilder("TurnTable onConfigReady(), and behavior is valid: ");
            if (aVar != null) {
                z = true;
            }
            sb.append(z);
            C3166a.m11964c(str, sb.toString());
        } else if (toolbarButton == ToolbarButton.GIFT) {
            String str2 = "ToolbarManager";
            StringBuilder sb2 = new StringBuilder("Gift onConfigReady(), and behavior is valid: ");
            if (aVar != null) {
                z = true;
            }
            sb2.append(z);
            C3166a.m11964c(str2, sb2.toString());
        } else {
            if (toolbarButton == ToolbarButton.FAST_GIFT) {
                String str3 = "ToolbarManager";
                StringBuilder sb3 = new StringBuilder("FastGift onConfigReady(), and behavior is valid: ");
                if (aVar != null) {
                    z = true;
                }
                sb3.append(z);
                C3166a.m11964c(str3, sb3.toString());
            }
        }
    }

    /* renamed from: a */
    public final void mo14165a(ToolbarButton toolbarButton, C5739a aVar) {
        if (toolbarButton == ToolbarButton.TURNTABLE) {
            C3166a.m11964c("ttlive_gift", "load TurnTable");
        } else if (toolbarButton == ToolbarButton.GIFT) {
            C3166a.m11964c("ttlive_gift", "load Gift icon");
        } else if (toolbarButton == ToolbarButton.FAST_GIFT) {
            C3166a.m11964c("ttlive_gift", "load FastGift icon");
        }
        View view = (View) this.f16853b.get(toolbarButton);
        if (view != null) {
            mo14179b(toolbarButton, view);
        }
        this.f16854c.put(toolbarButton, aVar);
        if (view != null) {
            mo14176a(toolbarButton, view);
        }
        if (this.f16852a != null) {
            this.f16852a.lambda$put$1$DataCenter("tool_bar_button_load", toolbarButton);
        }
    }
}

package com.bytedance.android.livesdk.p428w;

import com.bytedance.android.livesdk.gift.panel.widget.FakeMtGiftPanelBottomWidget;
import com.bytedance.android.livesdk.gift.panel.widget.MtGiftPanelBottomWidget;
import com.bytedance.ies.sdk.widgets.Widget;
import java.util.WeakHashMap;

/* renamed from: com.bytedance.android.livesdk.w.b */
public class C9165b {

    /* renamed from: b */
    private static volatile C9165b f24882b;

    /* renamed from: a */
    private final WeakHashMap<Class, Widget> f24883a = new WeakHashMap<>();

    /* renamed from: c */
    public final void mo22359c() {
        this.f24883a.clear();
    }

    private C9165b() {
    }

    /* renamed from: b */
    public final void mo22358b() {
        this.f24883a.put(FakeMtGiftPanelBottomWidget.class, new MtGiftPanelBottomWidget());
    }

    /* renamed from: a */
    public static C9165b m27243a() {
        if (f24882b == null) {
            synchronized (C9165b.class) {
                if (f24882b == null) {
                    f24882b = new C9165b();
                }
            }
        }
        return f24882b;
    }

    /* renamed from: a */
    public final Widget mo22357a(Class cls) {
        return (Widget) this.f24883a.get(cls);
    }
}

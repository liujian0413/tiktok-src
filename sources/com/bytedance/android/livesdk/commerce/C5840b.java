package com.bytedance.android.livesdk.commerce;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.p447e.C9398c;
import com.bytedance.android.livesdkapi.p447e.C9400e;
import com.bytedance.android.livesdkapi.p447e.C9401f;
import com.bytedance.ies.sdk.widgets.DataCenter;
import java.lang.ref.WeakReference;

/* renamed from: com.bytedance.android.livesdk.commerce.b */
public final class C5840b {

    /* renamed from: a */
    public C9400e f17188a;

    /* renamed from: b */
    private C9401f f17189b = new C9401f() {
    };

    /* renamed from: c */
    private Room f17190c;

    /* renamed from: d */
    private String f17191d;

    /* renamed from: e */
    private boolean f17192e;

    /* renamed from: f */
    private boolean f17193f;

    /* renamed from: g */
    private C9398c f17194g;

    /* renamed from: h */
    private WeakReference<DataCenter> f17195h;

    /* renamed from: i */
    private boolean f17196i;

    /* renamed from: j */
    private boolean f17197j;

    public C5840b(boolean z, boolean z2, DataCenter dataCenter, Room room, C9398c cVar, C9400e eVar) {
        this.f17195h = new WeakReference<>(dataCenter);
        this.f17196i = z2;
        if (room != null) {
            this.f17190c = room;
            this.f17192e = this.f17190c.hasCommerceGoods();
            if (this.f17190c.getOwner() != null) {
                this.f17191d = this.f17190c.getOwner().getSecUid();
                this.f17193f = this.f17190c.getOwner().isWithCommercePermission();
            }
        }
        this.f17194g = cVar;
        this.f17197j = z;
        this.f17188a = eVar;
    }
}

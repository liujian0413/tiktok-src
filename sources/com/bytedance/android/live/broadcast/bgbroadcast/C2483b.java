package com.bytedance.android.live.broadcast.bgbroadcast;

import android.app.Activity;
import android.view.View;
import com.bytedance.android.live.broadcast.dialog.C2522a;
import com.bytedance.android.live.room.C3495l;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.chatroom.event.C4452v;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C5735a;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C5738d.C5739a;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C5747j;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.ToolbarButton;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.DataCenter;
import java.util.HashMap;

/* renamed from: com.bytedance.android.live.broadcast.bgbroadcast.b */
public abstract class C2483b {

    /* renamed from: a */
    protected final Room f8064a;

    /* renamed from: b */
    public final C2501m f8065b;

    /* renamed from: c */
    public final Activity f8066c;

    /* renamed from: d */
    public C2522a f8067d;

    /* renamed from: com.bytedance.android.live.broadcast.bgbroadcast.b$a */
    class C2485a implements C5739a {
        /* renamed from: a */
        public final void mo8811a(View view, DataCenter dataCenter) {
        }

        /* renamed from: a */
        public final void mo8812a(C5735a aVar) {
        }

        /* renamed from: b */
        public final void mo8813b(View view, DataCenter dataCenter) {
        }

        private C2485a() {
        }

        public final void onClick(View view) {
            long j;
            if (C2483b.this.f8067d == null) {
                C2483b.this.f8067d = new C2522a(C2483b.this.f8066c);
            }
            if (!C2483b.this.f8067d.isShowing()) {
                C2483b.this.f8067d.show();
            }
            Room currentRoom = ((C3495l) C3596c.m13172a(C3495l.class)).getCurrentRoom();
            if (currentRoom != null) {
                j = currentRoom.getId();
            } else {
                j = -1;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("event_belong", "live_function");
            hashMap.put("event_type", "show");
            hashMap.put("event_page", "live_take_detail");
            if (j != -1) {
                hashMap.put("room_id", String.valueOf(j));
            }
            C8443c.m25663a().mo21606a("auto_reply_show", hashMap, new Object[0]);
        }
    }

    /* renamed from: b */
    public abstract void mo9033b();

    /* renamed from: c */
    public abstract void mo9034c();

    /* renamed from: e */
    public abstract void mo9036e();

    /* renamed from: f */
    public abstract void mo9037f();

    /* renamed from: g */
    public abstract boolean mo9038g();

    /* renamed from: h */
    public abstract boolean mo9039h();

    /* renamed from: i */
    public void mo9040i() {
    }

    public abstract void onEvent(C4452v vVar);

    /* renamed from: a */
    public void mo9029a() {
        C5747j.m18104b().mo14165a(ToolbarButton.AUTO_REPLY, (C5739a) new C2485a());
    }

    /* renamed from: d */
    public void mo9035d() {
        if (this.f8067d != null) {
            this.f8067d.dismiss();
        }
    }

    public C2483b(Room room, C2501m mVar) {
        this.f8064a = room;
        this.f8065b = mVar;
        if (mVar != null) {
            this.f8066c = mVar.mo8990m();
        } else {
            this.f8066c = null;
        }
    }
}

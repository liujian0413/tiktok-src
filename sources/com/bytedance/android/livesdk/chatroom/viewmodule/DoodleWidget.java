package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.app.Activity;
import android.support.p022v4.app.FragmentActivity;
import com.bytedance.android.live.gift.C3436f;
import com.bytedance.android.live.user.C3592a;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.chatroom.event.UserProfileEvent;
import com.bytedance.android.livesdk.gift.effect.doodle.DoodleGiftDialogFragment;
import com.bytedance.android.livesdk.gift.effect.doodle.view.C7999a;
import com.bytedance.android.livesdk.gift.p371a.C7863d;
import com.bytedance.android.livesdk.message.model.C8696z;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.p451g.C9409a;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import p346io.reactivex.p347b.C47562b;
import p346io.reactivex.p348d.C7326g;

public class DoodleWidget extends LiveRecyclableWidget implements C3436f {

    /* renamed from: a */
    private C7999a f15866a;

    /* renamed from: b */
    private Room f15867b;

    /* renamed from: c */
    private boolean f15868c;

    /* renamed from: d */
    private boolean f15869d;

    /* renamed from: e */
    private boolean f15870e;

    /* renamed from: f */
    private DoodleGiftDialogFragment f15871f;

    /* renamed from: g */
    private C47562b f15872g = new C47562b();

    /* renamed from: a */
    public final void mo13747a() {
        if (this.f15866a != null) {
            this.f15866a.mo20909b();
        }
    }

    public void onUnload() {
        this.containerView.removeView(this.f15866a);
        if (this.f15871f != null && this.f15871f.f11448j) {
            this.f15871f.dismiss();
        }
        if (this.f15872g != null) {
            this.f15872g.mo119660a();
        }
    }

    /* renamed from: a */
    public final void mo13748a(C8696z zVar) {
        m17273b(zVar);
    }

    public void onInit(Object... objArr) {
        this.f15866a = new C7999a(this.context);
        this.f15866a.setUserEventListener(this);
    }

    /* renamed from: a */
    private <T> void m17272a(Class<T> cls) {
        this.f15872g.mo119661a(C9097a.m27146a().mo22266a(cls).mo19325f((C7326g<? super T>) new C7326g<T>() {
            public final void accept(T t) throws Exception {
                if (t instanceof C9409a) {
                    DoodleWidget.this.onEvent((C9409a) t);
                    return;
                }
                if (t instanceof C7863d) {
                    DoodleWidget.this.onEvent((C7863d) t);
                }
            }
        }));
    }

    public void onEvent(C9409a aVar) {
        if (aVar.f25901b == 3) {
            this.f15868c = true;
            return;
        }
        if (aVar.f25901b == 4) {
            this.f15868c = false;
        }
    }

    /* renamed from: a */
    public final void mo10403a(long j) {
        if (j != 0) {
            if (this.f15867b != null && this.f15867b.isStar()) {
                return;
            }
            if (this.f15867b == null || !this.f15867b.isKoiRoom()) {
                this.dataCenter.lambda$put$1$DataCenter("cmd_show_user_profile", new UserProfileEvent(j));
            }
        }
    }

    /* renamed from: b */
    private void m17273b(C8696z zVar) {
        if (isViewValid() && zVar != null && this.f15866a != null) {
            if (zVar.f23701b == null || 0 == zVar.f23701b.getId() || zVar.f23701b.getId() == this.f15867b.getOwner().getId()) {
                this.dataCenter.lambda$put$1$DataCenter("data_anchor_ticket_count", Long.valueOf(zVar.f23704e));
                this.dataCenter.lambda$put$1$DataCenter("data_current_room_ticket_count", Long.valueOf(zVar.f23705f));
            }
            if (this.f15869d || !this.f15868c) {
                this.f15866a.mo20908a(zVar);
                return;
            }
            if (zVar.f23700a != null && zVar.f23700a.getId() == ((C3592a) C3596c.m13172a(C3592a.class)).user().mo22179b()) {
                this.f15866a.mo20908a(zVar);
            }
        }
    }

    public void onEvent(C7863d dVar) {
        if (this.f15871f != null && this.f15871f.mo11345g()) {
            this.f15871f.dismiss();
            this.f15871f = null;
        }
        this.f15871f = DoodleGiftDialogFragment.m24415a((Activity) this.context, dVar.f21249b, this.f15870e, this.f15869d, this.dataCenter, this.f15867b, dVar.f21248a, dVar.f21250c);
        if (this.context instanceof FragmentActivity) {
            this.f15871f.show(((FragmentActivity) this.context).getSupportFragmentManager(), "DoodleGiftDialogFragment");
        }
    }

    public void onLoad(Object... objArr) {
        this.containerView.addView(this.f15866a);
        this.f15867b = (Room) this.dataCenter.get("data_room");
        this.f15869d = ((Boolean) this.dataCenter.get("data_is_portrait", Boolean.valueOf(true))).booleanValue();
        this.f15870e = ((Boolean) this.dataCenter.get("data_is_anchor", Boolean.valueOf(false))).booleanValue();
        m17272a(C9409a.class);
        m17272a(C7863d.class);
    }
}

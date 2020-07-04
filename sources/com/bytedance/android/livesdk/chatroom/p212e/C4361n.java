package com.bytedance.android.livesdk.chatroom.p212e;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.room.C3495l;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.chatroom.event.C4416ah;
import com.bytedance.android.livesdk.message.model.C8535by;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.bytedance.android.livesdk.chatroom.e.n */
public final class C4361n extends C4340a<C8535by> {
    /* renamed from: a */
    public final ImageModel mo12060a() {
        return null;
    }

    /* renamed from: b */
    public final int mo12062b() {
        return R.drawable.c82;
    }

    /* renamed from: d */
    public final boolean mo12064d() {
        return true;
    }

    /* renamed from: g */
    public final String mo12067g() {
        return "#ff8533";
    }

    /* renamed from: e */
    public final User mo12065e() {
        return ((C8535by) this.f12647a).f23462a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final Spannable mo12069l() {
        long j;
        String str;
        String str2;
        Room currentRoom = ((C3495l) C3596c.m13172a(C3495l.class)).getCurrentRoom();
        if (Room.isValid(currentRoom)) {
            j = currentRoom.getOwner().getId();
        } else {
            j = 0;
        }
        if (((C8535by) this.f12647a).f23462a == null) {
            str = null;
        } else if (((C8535by) this.f12647a).f23462a.getId() == j) {
            str = C3358ac.m12515a((int) R.string.ebf);
        } else {
            str = ((C8535by) this.f12647a).f23462a.getNickName();
            if (str == null) {
                str = "";
            }
        }
        int i = ((C8535by) this.f12647a).f23464c;
        int a = ((C8535by) this.f12647a).mo21668a();
        if (((C8535by) this.f12647a).f23471j || a <= 0) {
            str2 = C3358ac.m12517a((int) R.string.f6x, str, Integer.valueOf(i));
        } else if (a < 60) {
            str2 = C3358ac.m12517a((int) R.string.f6w, str, Integer.valueOf(a));
        } else {
            str2 = C3358ac.m12517a((int) R.string.f6v, str, Integer.valueOf(a / 60));
        }
        return new SpannableString(str2);
    }

    C4361n(C8535by byVar) {
        super(byVar);
    }

    /* renamed from: a */
    public final void mo12061a(Context context, Room room) {
        C4416ah ahVar = new C4416ah(1);
        ahVar.f12837b = this.f12647a;
        C9097a.m27146a().mo22267a((Object) ahVar);
    }
}

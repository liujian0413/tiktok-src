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
import com.bytedance.android.livesdk.message.model.C8512bh;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.bytedance.android.livesdk.chatroom.e.o */
public final class C4362o extends C4340a<C8512bh> {
    /* renamed from: a */
    public final ImageModel mo12060a() {
        return null;
    }

    /* renamed from: b */
    public final int mo12062b() {
        return R.drawable.c_a;
    }

    /* renamed from: d */
    public final boolean mo12064d() {
        return true;
    }

    /* renamed from: g */
    public final String mo12067g() {
        return "#ff4e33";
    }

    /* renamed from: e */
    public final User mo12065e() {
        return ((C8512bh) this.f12647a).f23362a;
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
        if (((C8512bh) this.f12647a).f23362a == null) {
            str = null;
        } else if (((C8512bh) this.f12647a).f23362a.getId() == j) {
            str = C3358ac.m12515a((int) R.string.ebf);
        } else {
            str = ((C8512bh) this.f12647a).f23362a.getNickName();
            if (str == null) {
                str = "";
            }
        }
        int i = ((C8512bh) this.f12647a).f23368g;
        int a = ((int) ((C8512bh) this.f12647a).mo21657a()) / 1000;
        if (((C8512bh) this.f12647a).f23383v || a <= 0) {
            str2 = C3358ac.m12517a((int) R.string.fbh, str, Integer.valueOf(i), ((C8512bh) this.f12647a).f23367f);
        } else if (a < 60) {
            str2 = C3358ac.m12517a((int) R.string.fbg, str, Integer.valueOf(i), ((C8512bh) this.f12647a).f23367f, Integer.valueOf(a));
        } else {
            str2 = C3358ac.m12517a((int) R.string.fbf, str, Integer.valueOf(i), ((C8512bh) this.f12647a).f23367f, Integer.valueOf(a / 60));
        }
        return new SpannableString(str2);
    }

    public C4362o(C8512bh bhVar) {
        super(bhVar);
    }

    /* renamed from: a */
    public final void mo12061a(Context context, Room room) {
        C4416ah ahVar = new C4416ah(1);
        ahVar.f12837b = this.f12647a;
        C9097a.m27146a().mo22267a((Object) ahVar);
    }
}

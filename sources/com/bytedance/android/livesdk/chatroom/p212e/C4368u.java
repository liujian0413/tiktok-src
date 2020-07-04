package com.bytedance.android.livesdk.chatroom.p212e;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.event.C4435e;
import com.bytedance.android.livesdk.message.model.C8541cc;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;

/* renamed from: com.bytedance.android.livesdk.chatroom.e.u */
public final class C4368u extends C4340a<C8541cc> {

    /* renamed from: i */
    private static final String[] f12665i = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "cmd_pk_mvp_show_list", "cmd_show_gift_task_info", "cmd_show_steal_tower_info"};

    /* renamed from: j */
    private final boolean f12666j;

    /* renamed from: d */
    public final boolean mo12064d() {
        return this.f12666j;
    }

    /* renamed from: e */
    public final User mo12065e() {
        return null;
    }

    /* renamed from: a */
    public final ImageModel mo12060a() {
        return ((C8541cc) this.f12647a).f23505d;
    }

    /* renamed from: b */
    public final int mo12062b() {
        return ((C8541cc) this.f12647a).f23512k;
    }

    /* renamed from: c */
    public final ImageModel mo12063c() {
        return ((C8541cc) this.f12647a).f23509h;
    }

    /* renamed from: g */
    public final String mo12067g() {
        return ((C8541cc) this.f12647a).f23503b;
    }

    /* renamed from: h */
    public final ImageModel mo12068h() {
        return ((C8541cc) this.f12647a).f23510i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final Spannable mo12069l() {
        CharSequence charSequence = ((C8541cc) this.f12647a).f23511j;
        if (TextUtils.isEmpty(charSequence) || !(charSequence instanceof Spannable)) {
            return new SpannableString(((C8541cc) this.f12647a).f23502a);
        }
        return (Spannable) charSequence;
    }

    public C4368u(C8541cc ccVar) {
        super(ccVar);
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= f12665i.length) {
                break;
            } else if (TextUtils.equals(f12665i[i], ccVar.f23507f)) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        this.f12666j = z;
    }

    /* renamed from: a */
    public final void mo12061a(Context context, Room room) {
        C9097a.m27146a().mo22267a((Object) new C4435e((C8541cc) this.f12647a));
    }
}

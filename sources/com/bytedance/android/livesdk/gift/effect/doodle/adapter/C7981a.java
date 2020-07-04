package com.bytedance.android.livesdk.gift.effect.doodle.adapter;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.gift.C7859a;
import com.bytedance.android.livesdk.gift.GiftManager;
import com.bytedance.android.livesdk.gift.effect.doodle.p378b.C7984b;
import com.bytedance.android.livesdk.gift.model.C8149d;
import com.bytedance.android.livesdk.message.model.C8473aa;
import com.bytedance.android.livesdk.message.model.C8474ab;
import com.bytedance.android.livesdk.message.model.C8696z;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.gift.effect.doodle.adapter.a */
public final class C7981a {
    /* renamed from: a */
    public static C7984b m24499a(Object... objArr) {
        C8696z zVar = objArr[0];
        C8473aa aaVar = zVar.f23706g;
        User user = null;
        if (aaVar == null || aaVar.f23193a == null || aaVar.f23193a.isEmpty()) {
            return null;
        }
        C7984b bVar = new C7984b(zVar.baseMessage.f25994d);
        bVar.mo20885a((float) aaVar.f23194b, (float) aaVar.f23195c);
        List<C8474ab> list = aaVar.f23193a;
        float a = (float) ((C8474ab) list.get(0)).mo21649a();
        float b = (float) ((C8474ab) list.get(0)).mo21650b();
        float b2 = (float) ((C8474ab) list.get(0)).mo21650b();
        float a2 = (float) ((C8474ab) list.get(0)).mo21649a();
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            C8474ab abVar = (C8474ab) list.get(i2);
            bVar.mo20886a(abVar.mo21649a(), abVar.mo21650b(), C7859a.m24102a(abVar.f23198c));
            if (((float) abVar.mo21649a()) > a) {
                a = (float) abVar.mo21649a();
            } else if (((float) abVar.mo21649a()) < a2) {
                a2 = (float) abVar.mo21649a();
            }
            if (((float) abVar.mo21650b()) > b) {
                b = (float) abVar.mo21650b();
            } else if (((float) abVar.mo21650b()) < b2) {
                b2 = (float) abVar.mo21650b();
            }
            C8149d findGiftById = GiftManager.inst().findGiftById(abVar.f23198c);
            if (findGiftById != null && findGiftById.f22235f > 0) {
                i += findGiftById.f22235f;
            }
        }
        bVar.f21666h = i;
        if (zVar.f23701b != null && zVar.f23701b.getId() > 0) {
            user = zVar.f23701b;
        }
        float f = a - a2;
        if (f > 0.0f) {
            bVar.f21662d = f;
        }
        float f2 = b - b2;
        if (f2 > 0.0f) {
            bVar.f21663e = f2;
        }
        bVar.mo20887b(a2, b2);
        bVar.f21925k = zVar.baseMessage.f25996f;
        bVar.f21926l = zVar.f23700a;
        bVar.f21927m = user;
        return bVar;
    }
}

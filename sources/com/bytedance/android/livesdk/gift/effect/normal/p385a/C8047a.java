package com.bytedance.android.livesdk.gift.effect.normal.p385a;

import com.bytedance.android.live.C2317a;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.livesdk.gift.effect.normal.model.NormalGiftMessage;
import com.bytedance.android.livesdk.gift.effect.normal.model.NormalGiftMessage.GiftType;
import com.bytedance.android.livesdk.gift.model.C8149d;
import com.bytedance.android.livesdk.message.model.C8489ao;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.bytedance.android.livesdk.gift.effect.normal.a.a */
public final class C8047a {
    /* renamed from: a */
    public final NormalGiftMessage mo20995a(Object... objArr) {
        String str;
        boolean z;
        GiftType giftType;
        boolean z2 = false;
        C8489ao aoVar = objArr[0];
        C8149d dVar = objArr[1];
        User user = objArr[2];
        String str2 = dVar.f22232c;
        int i = aoVar.f23259h;
        int i2 = aoVar.f23260i;
        String str3 = null;
        if (aoVar.f23258g == 1) {
            str3 = C2317a.m9932a().mo15979b((Object) aoVar.f23252a);
            str = aoVar.baseMessage.f25996f;
            if (str != null) {
                String[] split = str.split(":");
                if (split.length > 1) {
                    str = split[1];
                }
            }
        } else {
            str = null;
        }
        if (str3 == null) {
            str3 = "";
        }
        if (str == null) {
            str = "";
        }
        if (aoVar.f23253b == null || aoVar.f23253b.getId() <= 0 || (user != null && aoVar.f23253b.getId() == user.getId())) {
            z = true;
        } else {
            user = aoVar.f23253b;
            str2 = m24658a(R.string.emo, user.getNickName());
            z = false;
        }
        long j = aoVar.baseMessage.f25994d;
        if (aoVar.f23260i > 1) {
            giftType = GiftType.group;
        } else {
            giftType = GiftType.normal;
        }
        boolean z3 = dVar.f22228G;
        C8149d dVar2 = dVar;
        NormalGiftMessage normalGiftMessage = new NormalGiftMessage(j, aoVar.f23254c);
        normalGiftMessage.f21918h = str3;
        normalGiftMessage.f21917g = str;
        if (aoVar.f23258g == 1) {
            z2 = true;
        }
        normalGiftMessage.f21916f = z2;
        normalGiftMessage.f21913c = i;
        normalGiftMessage.f21911a = i2;
        normalGiftMessage.f21912b = aoVar.f23261j;
        C8149d dVar3 = dVar2;
        normalGiftMessage.f21915e = dVar3.f22231b;
        normalGiftMessage.f21925k = str2;
        normalGiftMessage.f21926l = aoVar.f23252a;
        normalGiftMessage.f21927m = user;
        normalGiftMessage.f21929o = dVar3.f22235f;
        normalGiftMessage.f21928n = z;
        normalGiftMessage.f21921r = giftType;
        normalGiftMessage.f21919p = dVar3.f22246q;
        normalGiftMessage.f21920q = aoVar;
        normalGiftMessage.f21922s = z3;
        return normalGiftMessage;
    }

    /* renamed from: a */
    private static String m24658a(int i, Object... objArr) {
        return C3358ac.m12528e().getResources().getString(R.string.emo, objArr);
    }
}

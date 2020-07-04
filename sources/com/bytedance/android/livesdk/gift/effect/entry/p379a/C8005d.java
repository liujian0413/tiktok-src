package com.bytedance.android.livesdk.gift.effect.entry.p379a;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.NobleLevelInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.gift.effect.entry.p383e.C8028c;
import com.bytedance.android.livesdk.message.model.C8514bj;
import com.bytedance.android.livesdk.message.model.C8514bj.C8515a;

/* renamed from: com.bytedance.android.livesdk.gift.effect.entry.a.d */
public final class C8005d {
    /* renamed from: a */
    public static C8028c m24541a(C8514bj bjVar) {
        int i;
        User user = bjVar.f23390b;
        if (user == null) {
            return null;
        }
        NobleLevelInfo nobleLevelInfo = user.getNobleLevelInfo();
        ImageModel avatarThumb = user.getAvatarThumb();
        C8515a aVar = bjVar.f23399k;
        if (aVar == null) {
            return null;
        }
        ImageModel imageModel = aVar.f23407e;
        if (user.getUserHonor() != null) {
            i = user.getUserHonor().mo8710n();
        } else {
            i = 0;
        }
        C8028c cVar = new C8028c(user.getNickName(), avatarThumb, nobleLevelInfo, imageModel, bjVar.baseMessage.f26000j, i);
        return cVar;
    }
}

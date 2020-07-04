package com.bytedance.android.live.broadcast.effect.sticker;

import com.bytedance.android.livesdkapi.depend.model.C9355c;
import java.util.List;

/* renamed from: com.bytedance.android.live.broadcast.effect.sticker.a */
public final class C2652a {
    /* renamed from: a */
    public static String[] m10809a(List<C9355c> list) {
        String[] strArr = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            strArr[i] = ((C9355c) list.get(i)).f25581t;
        }
        return strArr;
    }
}

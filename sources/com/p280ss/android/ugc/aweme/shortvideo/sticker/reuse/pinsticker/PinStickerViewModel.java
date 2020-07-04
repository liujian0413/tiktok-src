package com.p280ss.android.ugc.aweme.shortvideo.sticker.reuse.pinsticker;

import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.C0063u;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.reuse.pinsticker.PinStickerViewModel */
public final class PinStickerViewModel extends C0063u {

    /* renamed from: a */
    private final HashMap<String, C0052o<List<C40912c>>> f106389a = new HashMap<>();

    /* renamed from: a */
    public final C0052o<List<C40912c>> mo101189a(String str) {
        C7573i.m23587b(str, "panel");
        C0052o<List<C40912c>> oVar = (C0052o) this.f106389a.get(str);
        if (oVar != null) {
            return oVar;
        }
        C0052o<List<C40912c>> oVar2 = new C0052o<>();
        this.f106389a.put(str, oVar2);
        return oVar2;
    }
}

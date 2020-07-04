package com.p280ss.android.ugc.aweme.shortvideo.sticker;

import android.arch.lifecycle.C0053p;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43760j;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.am */
final /* synthetic */ class C40388am implements C0053p {

    /* renamed from: a */
    private final String f104978a;

    /* renamed from: b */
    private final Map f104979b;

    /* renamed from: c */
    private final C43760j f104980c;

    C40388am(String str, Map map, C43760j jVar) {
        this.f104978a = str;
        this.f104979b = map;
        this.f104980c = jVar;
    }

    public final void onChanged(Object obj) {
        StickerModule.m128947a(this.f104978a, this.f104979b, this.f104980c, (C40949u) obj);
    }
}

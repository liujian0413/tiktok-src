package com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.controller;

import com.bytedance.common.utility.collection.C6307b;
import com.google.gson.JsonIOException;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.sticker.data.BaseTrackTimeStamp;
import com.p280ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.controller.d */
public final class C39612d {
    /* renamed from: a */
    public static final void m126773a(InteractStickerStruct interactStickerStruct, List<? extends BaseTrackTimeStamp> list) {
        C7573i.m23587b(interactStickerStruct, "struct");
        C7573i.m23587b(list, "listData");
        if (C6307b.m19566a((Collection<T>) list)) {
            interactStickerStruct.setTrackList("");
            return;
        }
        try {
            interactStickerStruct.setTrackList(C35563c.f93220B.getRetrofitFactoryGson().mo15979b((Object) list));
        } catch (JsonIOException unused) {
        }
    }
}

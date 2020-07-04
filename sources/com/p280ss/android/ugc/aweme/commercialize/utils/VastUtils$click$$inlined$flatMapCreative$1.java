package com.p280ss.android.ugc.aweme.commercialize.utils;

import com.bytedance.vast.model.Creative;
import com.bytedance.vast.model.VideoClick;
import java.util.List;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;
import kotlin.sequences.C7604g;
import kotlin.sequences.C7605h;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.VastUtils$click$$inlined$flatMapCreative$1 */
public final class VastUtils$click$$inlined$flatMapCreative$1 extends Lambda implements C7562b<Creative, C7604g<? extends VideoClick>> {
    public VastUtils$click$$inlined$flatMapCreative$1() {
        super(1);
    }

    public final C7604g<VideoClick> invoke(Creative creative) {
        C7604g<VideoClick> gVar;
        if (creative != null) {
            List<VideoClick> list = creative.clickList;
            if (list != null) {
                gVar = C7525m.m23526p(list);
            } else {
                gVar = null;
            }
            if (gVar != null) {
                return gVar;
            }
        }
        return C7605h.m23635a();
    }
}

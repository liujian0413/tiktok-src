package com.p280ss.android.ugc.aweme.shortvideo.p1588r;

import com.google.common.base.C17427g;
import com.google.common.collect.C17795bu;
import com.p280ss.android.ugc.aweme.model.TextExtraStruct;
import com.p280ss.android.ugc.aweme.shortvideo.model.AVTextExtraStruct;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.r.j */
public final class C40257j implements C17427g<TextExtraStruct, AVTextExtraStruct> {
    /* renamed from: b */
    public final /* synthetic */ Object mo44914b(Object obj) {
        return m128618a((TextExtraStruct) obj);
    }

    /* renamed from: a */
    public static ArrayList<AVTextExtraStruct> m128619a(List<TextExtraStruct> list) {
        if (list == null) {
            return null;
        }
        return C17795bu.m59144a((Iterable<? extends E>) C17795bu.m59147a(list, (C17427g<? super F, ? extends T>) new C40257j<Object,Object>()));
    }

    /* renamed from: a */
    private static AVTextExtraStruct m128618a(TextExtraStruct textExtraStruct) {
        AVTextExtraStruct aVTextExtraStruct = new AVTextExtraStruct();
        aVTextExtraStruct.setStarAtlasTag(textExtraStruct.isStarAtlasTag());
        aVTextExtraStruct.setCid(textExtraStruct.getCid());
        aVTextExtraStruct.setHashTagName(textExtraStruct.getHashTagName());
        aVTextExtraStruct.setUserId(textExtraStruct.getUserId());
        aVTextExtraStruct.setAtUserType(textExtraStruct.getAtUserType());
        aVTextExtraStruct.setType(textExtraStruct.getType());
        aVTextExtraStruct.setStart(textExtraStruct.getStart());
        aVTextExtraStruct.setEnd(textExtraStruct.getEnd());
        aVTextExtraStruct.setAwemeId(textExtraStruct.getAwemeId());
        return aVTextExtraStruct;
    }
}

package com.p280ss.android.ugc.aweme.shortvideo.p1588r;

import com.google.common.base.C17427g;
import com.google.common.collect.C17795bu;
import com.p280ss.android.ugc.aweme.model.TextExtraStruct;
import com.p280ss.android.ugc.aweme.shortvideo.model.AVTextExtraStruct;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.r.i */
public final class C40256i implements C17427g<AVTextExtraStruct, TextExtraStruct> {
    /* renamed from: b */
    public final /* synthetic */ Object mo44914b(Object obj) {
        return m128615a((AVTextExtraStruct) obj);
    }

    /* renamed from: a */
    public static ArrayList<TextExtraStruct> m128616a(List<AVTextExtraStruct> list) {
        if (list == null) {
            return null;
        }
        return C17795bu.m59144a((Iterable<? extends E>) C17795bu.m59147a(list, (C17427g<? super F, ? extends T>) new C40256i<Object,Object>()));
    }

    /* renamed from: a */
    private static TextExtraStruct m128615a(AVTextExtraStruct aVTextExtraStruct) {
        TextExtraStruct textExtraStruct = new TextExtraStruct();
        textExtraStruct.setCid(aVTextExtraStruct.getCid());
        textExtraStruct.setHashTagName(aVTextExtraStruct.getHashTagName());
        textExtraStruct.setUserId(aVTextExtraStruct.getUserId());
        textExtraStruct.setAtUserType(aVTextExtraStruct.getAtUserType());
        textExtraStruct.setType(aVTextExtraStruct.getType());
        textExtraStruct.setStart(aVTextExtraStruct.getStart());
        textExtraStruct.setEnd(aVTextExtraStruct.getEnd());
        textExtraStruct.setAwemeId(aVTextExtraStruct.getAwemeId());
        return textExtraStruct;
    }
}

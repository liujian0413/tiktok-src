package com.p280ss.android.ugc.aweme.music.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.music.model.MusicCollectionFilterKt */
public final class MusicCollectionFilterKt {
    public static final List<MusicCollectionItem> distinctByName(List<? extends MusicCollectionItem> list) {
        C7573i.m23587b(list, "src");
        Iterable iterable = list;
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object next : iterable) {
            if (hashSet.add(((MusicCollectionItem) next).mcName)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }
}

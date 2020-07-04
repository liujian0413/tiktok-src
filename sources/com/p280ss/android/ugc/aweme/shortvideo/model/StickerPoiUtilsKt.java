package com.p280ss.android.ugc.aweme.shortvideo.model;

import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.StickerPoi;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.TimeSpeedModelExtension;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.model.StickerPoiUtilsKt */
public final class StickerPoiUtilsKt {
    public static final StickerPoi findLastDoorplateLevelPoi(ArrayList<TimeSpeedModelExtension> arrayList) {
        Object obj;
        boolean z;
        C7573i.m23587b(arrayList, "segments");
        List list = arrayList;
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            StickerPoi stickerPoi = ((TimeSpeedModelExtension) obj).getStickerPoi();
            if (stickerPoi != null) {
                z = stickerPoi.isDoorplateLevel();
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        TimeSpeedModelExtension timeSpeedModelExtension = (TimeSpeedModelExtension) obj;
        if (timeSpeedModelExtension != null) {
            return timeSpeedModelExtension.getStickerPoi();
        }
        return null;
    }
}

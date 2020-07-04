package com.p280ss.android.ugc.aweme.tools.music.aichoosemusic;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.tools.music.aichoosemusic.b */
public final class C42429b {
    /* renamed from: a */
    public static final <E> List<E> m134868a(List<E> list, int i) {
        C7573i.m23587b(list, "$this$filterDesireAverage");
        if (list.size() <= i) {
            return list;
        }
        List<E> arrayList = new ArrayList<>();
        float size = (((float) (list.size() - 1)) * 1.0f) / ((float) (i - 1));
        int i2 = 0;
        int i3 = i - 2;
        if (i3 >= 0) {
            while (true) {
                arrayList.add(list.get(Math.round(((float) i2) * size)));
                if (i2 == i3) {
                    break;
                }
                i2++;
            }
        }
        arrayList.add(C7525m.m23515h(list));
        return arrayList;
    }

    /* renamed from: a */
    public static final Bitmap m134867a(Bitmap bitmap, float f, float f2) {
        C7573i.m23587b(bitmap, "$this$resizeToAIfNeed");
        float width = 256.0f / ((float) bitmap.getWidth());
        float height = 256.0f / ((float) bitmap.getHeight());
        Matrix matrix = new Matrix();
        matrix.postScale(width, height);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        if (!bitmap.isRecycled()) {
            bitmap.recycle();
        }
        C7573i.m23582a((Object) createBitmap, "result");
        return createBitmap;
    }
}

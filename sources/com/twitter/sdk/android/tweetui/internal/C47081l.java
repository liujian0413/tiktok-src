package com.twitter.sdk.android.tweetui.internal;

import android.os.Build.VERSION;
import com.twitter.sdk.android.core.models.C46959o;
import com.twitter.sdk.android.core.models.C46961q;
import com.twitter.sdk.android.core.models.MediaEntity;
import com.twitter.sdk.android.core.models.VideoInfo.Variant;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.twitter.sdk.android.tweetui.internal.l */
public final class C47081l {
    /* renamed from: a */
    static boolean m147194a(MediaEntity mediaEntity) {
        return "photo".equals(mediaEntity.type);
    }

    /* renamed from: b */
    public static boolean m147197b(C46959o oVar) {
        if (m147202e(oVar) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m147201d(C46959o oVar) {
        MediaEntity c = m147198c(oVar);
        if (c == null || m147199c(c) == null) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public static boolean m147203e(MediaEntity mediaEntity) {
        if (!"animated_gif".equals(mediaEntity.type)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m147195a(Variant variant) {
        if ((VERSION.SDK_INT < 21 || !"application/x-mpegURL".equals(variant.contentType)) && !"video/mp4".equals(variant.contentType)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    static boolean m147196b(MediaEntity mediaEntity) {
        if ("video".equals(mediaEntity.type) || "animated_gif".equals(mediaEntity.type)) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static Variant m147199c(MediaEntity mediaEntity) {
        for (Variant variant : mediaEntity.videoInfo.variants) {
            if (m147195a(variant)) {
                return variant;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static List<MediaEntity> m147193a(C46959o oVar) {
        ArrayList arrayList = new ArrayList();
        C46961q qVar = oVar.f120431e;
        if (qVar == null || qVar.f120490d == null || qVar.f120490d.size() <= 0) {
            return arrayList;
        }
        for (int i = 0; i <= qVar.f120490d.size() - 1; i++) {
            MediaEntity mediaEntity = (MediaEntity) qVar.f120490d.get(i);
            if (mediaEntity.type != null && m147194a(mediaEntity)) {
                arrayList.add(mediaEntity);
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public static MediaEntity m147198c(C46959o oVar) {
        for (MediaEntity mediaEntity : m147204f(oVar)) {
            if (mediaEntity.type != null && m147196b(mediaEntity)) {
                return mediaEntity;
            }
        }
        return null;
    }

    /* renamed from: d */
    public static boolean m147200d(MediaEntity mediaEntity) {
        if ("animated_gif".equals(mediaEntity.type) || ("video".endsWith(mediaEntity.type) && mediaEntity.videoInfo.durationMillis < 6500)) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    private static MediaEntity m147202e(C46959o oVar) {
        List f = m147204f(oVar);
        for (int size = f.size() - 1; size >= 0; size--) {
            MediaEntity mediaEntity = (MediaEntity) f.get(size);
            if (mediaEntity.type != null && m147194a(mediaEntity)) {
                return mediaEntity;
            }
        }
        return null;
    }

    /* renamed from: f */
    private static List<MediaEntity> m147204f(C46959o oVar) {
        ArrayList arrayList = new ArrayList();
        if (!(oVar.f120430d == null || oVar.f120430d.f120490d == null)) {
            arrayList.addAll(oVar.f120430d.f120490d);
        }
        if (!(oVar.f120431e == null || oVar.f120431e.f120490d == null)) {
            arrayList.addAll(oVar.f120431e.f120490d);
        }
        return arrayList;
    }
}

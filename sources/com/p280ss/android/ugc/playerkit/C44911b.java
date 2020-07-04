package com.p280ss.android.ugc.playerkit;

import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.p280ss.android.ugc.lib.video.bitrate.regulator.p1746a.C44863c;
import com.p280ss.android.ugc.playerkit.model.C44917a;
import com.p280ss.android.ugc.playerkit.model.PlayerConfig.Type;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.ugc.playerkit.b */
public final class C44911b {
    /* renamed from: a */
    public static int m141670a(VideoUrlModel videoUrlModel) {
        Integer num;
        if (videoUrlModel == null) {
            return -1;
        }
        C44863c hitBitrate = videoUrlModel.getHitBitrate();
        if (hitBitrate == null) {
            num = null;
        } else {
            num = Integer.valueOf(hitBitrate.getQualityType());
        }
        if (num == null) {
            num = Integer.valueOf(-1);
        }
        return num.intValue();
    }

    /* renamed from: a */
    public static boolean m141671a(UrlModel urlModel) {
        if (urlModel == null) {
            return false;
        }
        List urlList = urlModel.getUrlList();
        if (urlList == null || urlList.isEmpty()) {
            return false;
        }
        Iterator it = urlList.iterator();
        while (it.hasNext()) {
            if (TextUtils.isEmpty((String) it.next())) {
                it.remove();
            }
        }
        if (urlList.isEmpty() || TextUtils.isEmpty(urlModel.getUri())) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m141672a(Type type) {
        if (!C44917a.m141692r().mo105101d()) {
            return false;
        }
        if (Type.TT.equals(type) || Type.TT_HARDWARE.equals(type)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m141673a(Object obj, Object obj2) {
        if (obj == obj2 || (obj != null && obj.equals(obj2))) {
            return true;
        }
        return false;
    }
}

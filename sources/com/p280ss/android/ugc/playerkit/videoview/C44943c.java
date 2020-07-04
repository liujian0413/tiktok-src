package com.p280ss.android.ugc.playerkit.videoview;

import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.feed.model.Video;
import com.p280ss.android.ugc.playerkit.C44911b;
import com.p280ss.android.ugc.playerkit.model.PlayerConfig.Type;

/* renamed from: com.ss.android.ugc.playerkit.videoview.c */
public final class C44943c {

    /* renamed from: a */
    public static boolean f115608a = true;

    /* renamed from: a */
    public static boolean m141815a(Video video, Type type) {
        if (!f115608a || !C44911b.m141671a((UrlModel) video.getPlayAddrH265()) || !C44911b.m141672a(type)) {
            return false;
        }
        return true;
    }
}

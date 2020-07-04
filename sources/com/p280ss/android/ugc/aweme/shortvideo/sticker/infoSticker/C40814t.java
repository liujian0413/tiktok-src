package com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker;

import com.p280ss.android.ugc.effectmanager.effect.model.Effect;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.t */
public final class C40814t {
    /* renamed from: b */
    public static boolean m130426b(Effect effect) {
        if (effect.getTags().contains("weather")) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m130427c(Effect effect) {
        if (effect.getTags().contains("poisticker")) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m130428d(Effect effect) {
        if (effect.getTags().contains("pollsticker")) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static boolean m130429e(Effect effect) {
        if (effect.getTags().contains("LyricsSticker")) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static int m130425a(Effect effect) {
        if (effect.getTags().contains("weather")) {
            return 2;
        }
        if (effect.getTags().contains("time")) {
            return 3;
        }
        if (effect.getTags().contains("date")) {
            return 4;
        }
        return 1;
    }
}

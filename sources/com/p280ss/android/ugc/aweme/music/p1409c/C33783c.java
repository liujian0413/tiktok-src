package com.p280ss.android.ugc.aweme.music.p1409c;

import android.media.MediaPlayer;

/* renamed from: com.ss.android.ugc.aweme.music.c.c */
public class C33783c {

    /* renamed from: a */
    private static volatile MediaPlayer f88143a;

    /* renamed from: b */
    public static void m108917b() {
        if (f88143a != null) {
            f88143a.release();
            f88143a = null;
        }
    }

    /* renamed from: a */
    public static MediaPlayer m108916a() {
        if (f88143a == null) {
            synchronized (C33783c.class) {
                if (f88143a == null) {
                    f88143a = new MediaPlayer();
                }
            }
        }
        return f88143a;
    }
}

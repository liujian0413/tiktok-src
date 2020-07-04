package com.p280ss.android.ugc.aweme.shortvideo.p1617ui;

import com.p280ss.android.ugc.aweme.shortvideo.AVMusic;
import java.util.HashMap;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.h */
public final class C41363h {

    /* renamed from: a */
    public static final C41363h f107646a = new C41363h();

    /* renamed from: b */
    private static HashMap<String, AVMusic> f107647b = new HashMap<>();

    /* renamed from: c */
    private static HashMap<String, String> f107648c = new HashMap<>();

    private C41363h() {
    }

    /* renamed from: a */
    public static void m131934a() {
        f107647b.clear();
        f107648c.clear();
    }

    /* renamed from: b */
    public static AVMusic m131937b(String str) {
        C7573i.m23587b(str, "effectId");
        return (AVMusic) f107647b.get(str);
    }

    /* renamed from: c */
    public static String m131938c(String str) {
        C7573i.m23587b(str, "effectId");
        return (String) f107648c.get(str);
    }

    /* renamed from: d */
    public static boolean m131939d(String str) {
        C7573i.m23587b(str, "effectId");
        return f107647b.containsKey(str);
    }

    /* renamed from: a */
    public static void m131935a(String str) {
        C7573i.m23587b(str, "effectId");
        f107647b.put(str, null);
    }

    /* renamed from: a */
    public static void m131936a(String str, AVMusic aVMusic, String str2) {
        C7573i.m23587b(str, "effectId");
        if (aVMusic != null) {
            aVMusic.setMusicPriority(-1);
        }
        f107647b.put(str, aVMusic);
        f107648c.put(str, str2);
    }
}

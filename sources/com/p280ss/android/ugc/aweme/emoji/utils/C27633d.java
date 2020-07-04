package com.p280ss.android.ugc.aweme.emoji.utils;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.emoji.model.Emoji;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.emoji.utils.d */
public final class C27633d {

    /* renamed from: a */
    private static C27633d f72813a;

    /* renamed from: b */
    private static volatile long f72814b;

    /* renamed from: c */
    private SharedPreferences f72815c;

    /* renamed from: d */
    private SharedPreferences f72816d = C7285c.m22838a(C6399b.m19921a(), "aweme_emoji", 0);

    /* renamed from: c */
    public final boolean mo71032c() {
        return this.f72815c.getBoolean("hint_weshine_search", true);
    }

    /* renamed from: d */
    public final String mo71033d() {
        return this.f72816d.getString("key_small_emoji_md5", "");
    }

    /* renamed from: f */
    public final String mo71035f() {
        return this.f72816d.getString("last_login_user_id", "");
    }

    /* renamed from: b */
    public final List<Emoji> mo71031b() {
        return C27639h.m90622b(this.f72815c.getString("recent_gif_emojis", ""), Emoji[].class);
    }

    /* renamed from: e */
    public final void mo71034e() {
        this.f72816d.edit().putString("last_login_user_id", C27630a.m90584b().toString()).commit();
    }

    private C27633d() {
        f72814b = C27630a.m90585c();
        Context a = C6399b.m19921a();
        StringBuilder sb = new StringBuilder("aweme_emoji_");
        sb.append(f72814b);
        this.f72815c = C7285c.m22838a(a, sb.toString(), 0);
    }

    /* renamed from: a */
    public static synchronized C27633d m90594a() {
        C27633d dVar;
        synchronized (C27633d.class) {
            long c = C27630a.m90585c();
            if (f72813a == null || c != f72814b) {
                synchronized (C27633d.class) {
                    if (f72813a == null || c != f72814b) {
                        f72813a = new C27633d();
                    }
                }
            }
            dVar = f72813a;
        }
        return dVar;
    }

    /* renamed from: a */
    public final void mo71029a(String str) {
        this.f72816d.edit().putString("key_small_emoji_md5", str).commit();
    }

    /* renamed from: a */
    public final void mo71030a(boolean z) {
        this.f72815c.edit().putBoolean("hint_weshine_search", false).commit();
    }

    /* renamed from: a */
    public final void mo71028a(Emoji emoji) {
        List b = C27639h.m90622b(this.f72815c.getString("recent_gif_emojis", ""), Emoji[].class);
        if (b.isEmpty()) {
            b.add(emoji);
        } else {
            b.remove(emoji);
            b.add(0, emoji);
            if (b.size() > 8) {
                b = b.subList(0, 8);
            }
        }
        this.f72815c.edit().putString("recent_gif_emojis", C27639h.m90621a(b)).commit();
    }
}

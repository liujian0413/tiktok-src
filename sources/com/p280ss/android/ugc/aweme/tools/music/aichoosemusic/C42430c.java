package com.p280ss.android.ugc.aweme.tools.music.aichoosemusic;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.services.IAVServiceProxy;

/* renamed from: com.ss.android.ugc.aweme.tools.music.aichoosemusic.c */
public final class C42430c {

    /* renamed from: a */
    static SharedPreferences f110324a = C7285c.m22838a(((IAVServiceProxy) ServiceManager.get().getService(IAVServiceProxy.class)).getApplicationService().mo83136c(), "ai_music", 0);

    /* renamed from: b */
    public static long m134873b() {
        return f110324a.getLong("ai_music_time", 0);
    }

    /* renamed from: c */
    public static String m134874c() {
        return f110324a.getString("ai_music_url", "");
    }

    /* renamed from: d */
    public static String m134875d() {
        return f110324a.getString("ai_music_list", "");
    }

    /* renamed from: e */
    public static String m134876e() {
        return f110324a.getString("ai_music_setting", "");
    }

    /* renamed from: f */
    public static void m134877f() {
        Editor edit = f110324a.edit();
        edit.remove("ai_music_time");
        edit.remove("ai_music_list");
        edit.remove("ai_music_url");
        edit.commit();
    }

    /* renamed from: a */
    public static boolean m134872a() {
        if (((IAVService) ServiceManager.get().getService(IAVService.class)).avSettingsService().getEditPagePrompt()) {
            return ((IAVService) ServiceManager.get().getService(IAVService.class)).promptService().hasPromptShownMusic();
        }
        return f110324a.getBoolean("ai_music_guide_show", false);
    }

    /* renamed from: a */
    public static void m134869a(String str) {
        Editor edit = f110324a.edit();
        edit.putString("ai_music_setting", str);
        edit.commit();
    }

    /* renamed from: a */
    public static void m134871a(boolean z) {
        if (((IAVService) ServiceManager.get().getService(IAVService.class)).avSettingsService().getEditPagePrompt()) {
            ((IAVService) ServiceManager.get().getService(IAVService.class)).promptService().editPromptShownMusic(true);
            return;
        }
        Editor edit = f110324a.edit();
        edit.putBoolean("ai_music_guide_show", z);
        edit.commit();
    }

    /* renamed from: a */
    public static void m134870a(String str, String str2) {
        Editor edit = f110324a.edit();
        edit.putLong("ai_music_time", System.currentTimeMillis());
        edit.putString("ai_music_list", str);
        edit.putString("ai_music_url", str2);
        edit.commit();
    }
}

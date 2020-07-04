package com.p280ss.android.ugc.aweme.p971p;

import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.EPlatformSettings;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import java.util.List;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.p.a */
public final class C21766a {

    /* renamed from: a */
    public static final C21766a f58281a = new C21766a();

    private C21766a() {
    }

    /* renamed from: a */
    public static final String m72782a() {
        String str = "aweme://webview/?url=https%3A%2F%2Faweme.snssdk.com%2Finsights%2Flite%3Fhide_nav_bar%3D0%26from%3DrnToWeb%26title%3D%25E4%25BC%2581%25E4%25B8%259A%25E5%258F%25B7%25E7%25AE%25A1%25E7%2590%2586&hide_nav_bar=0&from=rnToWeb&title=%E4%BC%81%E4%B8%9A%E5%8F%B7%E7%AE%A1%E7%90%86&rn_schema=aweme%3A%2F%2Freactnative%2F%3Fchannel_name%3Drn_patch%26bundle_name%3Dbusiness%26module_name%3Dpage_e_lite%26force_h5%3D1%26hide_nav_bar%3D0%26bundle_url%3D%26title%3D%25E4%25BC%2581%25E4%25B8%259A%25E5%258F%25B7%25E7%25AE%25A1%25E7%2590%2586";
        try {
            IESSettingsProxy a = C30199h.m98861a();
            C7573i.m23582a((Object) a, "SettingsReader.get()");
            EPlatformSettings ePlatformSettings = a.getEPlatformSettings();
            C7573i.m23582a((Object) ePlatformSettings, "SettingsReader.get().ePlatformSettings");
            String liteLink = ePlatformSettings.getLiteLink();
            C7573i.m23582a((Object) liteLink, "SettingsReader.get().ePlatformSettings.liteLink");
            return liteLink;
        } catch (Exception unused) {
            return str;
        }
    }

    /* renamed from: c */
    public static final String m72784c() {
        try {
            IESSettingsProxy a = C30199h.m98861a();
            C7573i.m23582a((Object) a, "SettingsReader.get()");
            EPlatformSettings ePlatformSettings = a.getEPlatformSettings();
            C7573i.m23582a((Object) ePlatformSettings, "SettingsReader.get().ePlatformSettings");
            return ePlatformSettings.getBlockHint();
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: d */
    public static final String m72785d() {
        try {
            IESSettingsProxy a = C30199h.m98861a();
            C7573i.m23582a((Object) a, "SettingsReader.get()");
            EPlatformSettings ePlatformSettings = a.getEPlatformSettings();
            C7573i.m23582a((Object) ePlatformSettings, "SettingsReader.get().ePlatformSettings");
            return ePlatformSettings.getJumpRedirectUrl();
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: b */
    public static final List<String> m72783b() {
        try {
            IESSettingsProxy a = C30199h.m98861a();
            C7573i.m23582a((Object) a, "SettingsReader.get()");
            EPlatformSettings ePlatformSettings = a.getEPlatformSettings();
            C7573i.m23582a((Object) ePlatformSettings, "SettingsReader.get().ePlatformSettings");
            List<String> jumpBlockList = ePlatformSettings.getJumpBlockList();
            C7573i.m23582a((Object) jumpBlockList, "SettingsReader.get().ePl…ormSettings.jumpBlockList");
            return jumpBlockList;
        } catch (Exception unused) {
            return C7525m.m23461a();
        }
    }

    /* renamed from: e */
    public static final int m72786e() {
        try {
            IESSettingsProxy a = C30199h.m98861a();
            C7573i.m23582a((Object) a, "SettingsReader.get()");
            EPlatformSettings ePlatformSettings = a.getEPlatformSettings();
            C7573i.m23582a((Object) ePlatformSettings, "SettingsReader.get().ePlatformSettings");
            Integer blockMode = ePlatformSettings.getBlockMode();
            C7573i.m23582a((Object) blockMode, "SettingsReader.get().ePlatformSettings.blockMode");
            return blockMode.intValue();
        } catch (Exception unused) {
            return 1;
        }
    }
}

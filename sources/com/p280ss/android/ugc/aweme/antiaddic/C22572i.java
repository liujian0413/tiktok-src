package com.p280ss.android.ugc.aweme.antiaddic;

import android.text.TextUtils;
import com.bytedance.ies.abmock.C10292j;
import com.bytedance.ies.abmock.C6384b;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.antiaddic.i */
public final class C22572i {

    /* renamed from: a */
    public static final C22572i f60132a = new C22572i();

    private C22572i() {
    }

    /* renamed from: b */
    public static final String m74611b() {
        String a = C10292j.m30480a().mo25015a(TiktokAntiAddictionPopupTextSetting.class, "anti_addiction_pop_up_text", C6384b.m19835a().mo15294c().getAntiAddictionPopUpText());
        C7573i.m23582a((Object) a, "SettingsManager.getInsta…pTextSetting::class.java)");
        return a;
    }

    /* renamed from: a */
    public static final boolean m74610a() {
        IESSettingsProxy a = C30199h.m98861a();
        C7573i.m23582a((Object) a, "SettingsReader.get()");
        Integer antiAddictionDayTime = a.getAntiAddictionDayTime();
        IESSettingsProxy a2 = C30199h.m98861a();
        C7573i.m23582a((Object) a2, "SettingsReader.get()");
        Integer antiAddictionNightTime = a2.getAntiAddictionNightTime();
        String a3 = C10292j.m30480a().mo25015a(TiktokAntiAddictionPopupTextSetting.class, "anti_addiction_pop_up_text", C6384b.m19835a().mo15294c().getAntiAddictionPopUpText());
        C7573i.m23582a((Object) a3, "SettingsManager.getInsta…pTextSetting::class.java)");
        if (C7573i.m23576a(antiAddictionDayTime.intValue(), 0) <= 0 || C7573i.m23576a(antiAddictionNightTime.intValue(), 0) <= 0 || TextUtils.isEmpty(a3)) {
            return false;
        }
        return true;
    }
}

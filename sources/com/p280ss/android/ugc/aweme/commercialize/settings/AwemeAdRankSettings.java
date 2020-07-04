package com.p280ss.android.ugc.aweme.commercialize.settings;

import com.bytedance.ies.abmock.C10292j;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.abmock.p260a.C6382b;
import com.bytedance.ies.abmock.settings.SettingsKey;
import com.p280ss.android.ugc.aweme.commercialize.model.AwemeAdRankSettingsModel;
import com.p280ss.android.ugc.aweme.commercialize.model.AwemeAdRankSettingsModel.C24985a;
import kotlin.jvm.internal.C7573i;

@SettingsKey
/* renamed from: com.ss.android.ugc.aweme.commercialize.settings.AwemeAdRankSettings */
public final class AwemeAdRankSettings {
    @C6382b(mo15285a = true)
    private static final AwemeAdRankSettingsModel DISABLE = C24985a.m82299a();
    public static final AwemeAdRankSettings INSTANCE = new AwemeAdRankSettings();

    private AwemeAdRankSettings() {
    }

    public final AwemeAdRankSettingsModel getDISABLE() {
        return DISABLE;
    }

    public static final AwemeAdRankSettingsModel get() {
        try {
            Object a = C10292j.m30480a().mo25014a(AwemeAdRankSettings.class, "aweme_ad_rank", C6384b.m19835a().mo15294c().getAwemeAdRank(), "com.ss.android.ugc.aweme.commercialize.model.AwemeAdRankSettingsModel", AwemeAdRankSettingsModel.class);
            C7573i.m23582a(a, "SettingsManager.getInsta…RankSettings::class.java)");
            return (AwemeAdRankSettingsModel) a;
        } catch (Throwable unused) {
            return DISABLE;
        }
    }
}

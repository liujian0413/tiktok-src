package com.p280ss.android.ugc.aweme.video.p1698b;

import com.p280ss.android.ugc.aweme.video.VideoBitRateABManager;
import com.p280ss.android.ugc.aweme.video.bitrate.bean.RateSettingsResponse;
import com.p280ss.android.ugc.lib.video.bitrate.regulator.p1746a.C44861a;
import com.p280ss.android.ugc.lib.video.bitrate.regulator.p1747b.C44871c.C44873a;
import com.p280ss.android.ugc.lib.video.bitrate.regulator.p1747b.C44875d.C44877a;
import com.p280ss.android.ugc.lib.video.bitrate.regulator.p1747b.C44879e;
import com.p280ss.android.ugc.playerkit.model.C44917a;
import com.p280ss.android.ugc.playerkit.session.C44926b;
import com.p280ss.android.ugc.playerkit.videoview.p1753b.C44939b;

/* renamed from: com.ss.android.ugc.aweme.video.b.a */
public final class C43194a implements C44939b {

    /* renamed from: a */
    private C44879e f111834a;

    /* renamed from: a */
    public final C44879e mo104827a(C44926b bVar) {
        if (this.f111834a == null && VideoBitRateABManager.m22786c().f20347b) {
            RateSettingsResponse rateSettingsResponse = VideoBitRateABManager.m22786c().f20346a;
            if (rateSettingsResponse != null) {
                if (C44917a.m141692r().mo105104g() != -1.0d) {
                    this.f111834a = new C44873a(rateSettingsResponse.getAdaptiveGearGroup()).mo107317a(rateSettingsResponse.getGearSet()).mo107319b(rateSettingsResponse.getBandwidthSet()).mo107316a((C44861a) rateSettingsResponse.getAutoBitrateSet()).mo107318a();
                } else {
                    this.f111834a = new C44877a(rateSettingsResponse.getAdaptiveGearGroup()).mo107317a(rateSettingsResponse.getGearSet()).mo107319b(rateSettingsResponse.getBandwidthSet()).mo107316a((C44861a) rateSettingsResponse.getAutoBitrateSet()).mo107318a();
                }
            }
        }
        return this.f111834a;
    }
}

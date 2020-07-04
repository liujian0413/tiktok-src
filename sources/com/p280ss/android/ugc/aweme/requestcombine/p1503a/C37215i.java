package com.p280ss.android.ugc.aweme.requestcombine.p1503a;

import com.p280ss.android.ugc.aweme.lego.C7121a.C7126d;
import com.p280ss.android.ugc.aweme.requestcombine.model.BaseCombineMode;
import com.p280ss.android.ugc.aweme.requestcombine.model.RateSettingCombineModel;
import com.p280ss.android.ugc.aweme.requestcombine.model.SettingCombineDataModel;
import com.p280ss.android.ugc.aweme.requestcombine.model.SettingCombineModel;
import com.p280ss.android.ugc.aweme.video.VideoBitRateABManager;
import com.p280ss.android.ugc.aweme.video.bitrate.bean.RateSettingsResponse;
import com.p280ss.android.ugc.aweme.video.experiment.C43220a;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.requestcombine.a.i */
public final class C37215i extends C37205a {

    /* renamed from: a */
    private VideoBitRateABManager f97342a;

    /* renamed from: b */
    private BaseCombineMode f97343b;

    /* renamed from: b */
    public final BaseCombineMode mo93741b() {
        return this.f97343b;
    }

    public C37215i() {
        if (mo93737a() != null) {
            this.f97342a = VideoBitRateABManager.m22786c();
        }
    }

    /* renamed from: a */
    public final String mo93737a() {
        if (C43220a.m137076e()) {
            return "/aweme/v1/rate/settings/";
        }
        return null;
    }

    /* renamed from: a */
    private void m119632a(BaseCombineMode baseCombineMode) {
        this.f97343b = baseCombineMode;
    }

    /* renamed from: a */
    public final void mo93739a(C7126d dVar) {
        C7573i.m23587b(dVar, "transaction");
        this.f97342a = null;
    }

    /* renamed from: a */
    public final boolean mo93740a(SettingCombineModel settingCombineModel) {
        RateSettingCombineModel rateSettingCombineModel = null;
        this.f97342a = null;
        if (settingCombineModel != null) {
            SettingCombineDataModel data = settingCombineModel.getData();
            if (data != null) {
                rateSettingCombineModel = data.getRateSettingCombineModel();
            }
        }
        boolean z = false;
        if (rateSettingCombineModel != null) {
            RateSettingsResponse rateSetting = rateSettingCombineModel.getRateSetting();
            if (rateSetting != null && rateSetting.status_code == 0) {
                m119632a((BaseCombineMode) rateSettingCombineModel);
                if (rateSettingCombineModel.getHttpCode() == 200) {
                    z = true;
                }
                return z;
            }
        }
        return false;
    }
}

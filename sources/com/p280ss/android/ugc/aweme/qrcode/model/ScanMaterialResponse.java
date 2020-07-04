package com.p280ss.android.ugc.aweme.qrcode.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.commercialize.model.EasterEggInfo;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.qrcode.model.ScanMaterialResponse */
public final class ScanMaterialResponse extends BaseResponse implements Serializable {
    @C6593c(mo15949a = "easter_egg")
    private EasterEggInfo easterEgg;

    public final EasterEggInfo getEasterEgg() {
        return this.easterEgg;
    }

    public final void setEasterEgg(EasterEggInfo easterEggInfo) {
        this.easterEgg = easterEggInfo;
    }
}

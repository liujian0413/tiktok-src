package com.bytedance.ies.ugc.aweme.ttsetting;

import com.bytedance.retrofit2.C12466b;
import com.bytedance.retrofit2.p264b.C6457h;
import com.bytedance.retrofit2.p264b.C6474y;
import com.google.gson.C6709k;

public final class TTSettingDataApi {

    public interface SettingApi {
        @C6457h(mo15740a = "/service/settings/v2/")
        C12466b<C6709k> getResponse(@C6474y(mo15757a = "has_local_cache") boolean z, @C6474y(mo15757a = "app") int i, @C6474y(mo15757a = "default") int i2);
    }
}

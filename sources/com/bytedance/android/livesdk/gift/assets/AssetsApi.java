package com.bytedance.android.livesdk.gift.assets;

import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.retrofit2.p264b.C6457h;
import com.bytedance.retrofit2.p264b.C6472w;
import com.bytedance.retrofit2.p264b.C6474y;
import p346io.reactivex.C7492s;

public interface AssetsApi {
    @C6457h(mo15740a = "/webcast/assets/{panel}/")
    C7492s<C3479d<C7865b>> getAssets(@C6472w(mo15754a = "panel") String str, @C6474y(mo15757a = "download_assets_from") int i);
}

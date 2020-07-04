package com.p280ss.android.ugc.aweme.services.publish;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.services.publish.PoiPublishModel */
public interface PoiPublishModel {
    String getLatitude();

    String getLongitude();

    Map<String, String> getMobParams();

    String getPoiContext();

    HashMap<String, String> getServerMobParams();
}

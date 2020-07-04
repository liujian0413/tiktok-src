package com.p280ss.android.ugc.effectmanager.effect.model.net;

import com.p280ss.android.ugc.effectmanager.common.model.BaseNetResponse;
import com.p280ss.android.ugc.effectmanager.effect.model.PlatformEffect;
import java.util.List;

/* renamed from: com.ss.android.ugc.effectmanager.effect.model.net.ScanQRCodeResponse */
public class ScanQRCodeResponse extends BaseNetResponse {
    public DataNode data;

    /* renamed from: com.ss.android.ugc.effectmanager.effect.model.net.ScanQRCodeResponse$DataNode */
    public static class DataNode {
        public PlatformEffect effect;
        public List<String> url_prefix;
    }

    public boolean checkValue() {
        if (this.data != null) {
            return true;
        }
        return false;
    }
}

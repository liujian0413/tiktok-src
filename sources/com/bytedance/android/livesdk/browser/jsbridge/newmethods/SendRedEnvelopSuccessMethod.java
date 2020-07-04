package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import com.bytedance.android.live.core.p147c.C3166a;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.ies.web.jsbridge2.C11155d;
import com.bytedance.ies.web.jsbridge2.CallContext;
import com.google.gson.p276a.C6593c;

public class SendRedEnvelopSuccessMethod extends C11155d<Params, Object> {
    private static final String TAG = "SendRedEnvelopSuccessMe";

    static final class Params {
        @C6593c(mo15949a = "delay_time")
        String delayTime;
        @C6593c(mo15949a = "envelope_diamond")
        String envelopeDiamond;
        @C6593c(mo15949a = "envelope_id")
        String envelopeId;
        @C6593c(mo15949a = "envelope_type")
        String envelopeType;
        @C6593c(mo15949a = "left_diamond")
        String leftDiamond;

        Params() {
        }
    }

    public Object invoke(Params params, CallContext callContext) throws Exception {
        try {
            ((IWalletService) C3596c.m13172a(IWalletService.class)).walletCenter().mo11154a((long) Integer.parseInt(params.leftDiamond));
        } catch (Exception e) {
            C3166a.m11963b(TAG, (Throwable) e);
        }
        TTLiveSDKContext.getHostService().mo22367h().mo22177a(true);
        return null;
    }
}

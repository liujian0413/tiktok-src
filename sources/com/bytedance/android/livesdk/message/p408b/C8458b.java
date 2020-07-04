package com.bytedance.android.livesdk.message.p408b;

import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.log.C8449h;
import com.bytedance.android.livesdk.message.model.C8680m;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import com.p280ss.ugc.live.sdk.message.data.IMessage;
import com.p280ss.ugc.live.sdk.message.interfaces.IInterceptor;

/* renamed from: com.bytedance.android.livesdk.message.b.b */
public final class C8458b implements IInterceptor {

    /* renamed from: a */
    private long f23149a;

    public final boolean onMessage(IMessage iMessage) {
        if (!(iMessage instanceof C8680m)) {
            return false;
        }
        C8680m mVar = (C8680m) iMessage;
        if (this.f23149a <= 0) {
            this.f23149a = TTLiveSDKContext.getHostService().mo22367h().mo22179b();
        }
        if (mVar.f23626c == null) {
            new C8449h().mo21613a(C38347c.f99553h, (Object) mVar.f23625b).mo21613a("is_visiable_to_senter", (Object) String.valueOf(mVar.f23627d)).mo21613a("support_display_text", (Object) String.valueOf(mVar.supportDisplayText())).mo21613a("client_user_id", (Object) String.valueOf(this.f23149a)).mo21616a("chat_message_exception_log", 0);
            return true;
        } else if (mVar.f23627d || mVar.f23626c == null || this.f23149a <= 0 || this.f23149a != mVar.f23626c.getId()) {
            return false;
        } else {
            return true;
        }
    }
}

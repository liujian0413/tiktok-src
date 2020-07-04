package com.p280ss.android.ugc.aweme.sdk.iap.model.response;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.sdk.bean.C37321a;
import com.p280ss.android.ugc.aweme.sdk.bean.DiamondStruct;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.sdk.iap.model.response.a */
public final class C37357a extends BaseResponse {
    @C6593c(mo15949a = "my_wallet")

    /* renamed from: a */
    public C37321a f97553a;
    @C6593c(mo15949a = "diamonds")

    /* renamed from: b */
    public List<DiamondStruct> f97554b = new ArrayList();

    public final String toString() {
        StringBuilder sb = new StringBuilder("MyWalletResponse{myWallet=");
        sb.append(this.f97553a);
        sb.append(", diamonds=");
        sb.append(this.f97554b);
        sb.append('}');
        return sb.toString();
    }
}

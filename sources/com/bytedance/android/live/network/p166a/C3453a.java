package com.bytedance.android.live.network.p166a;

import com.bytedance.android.live.C2317a;
import com.bytedance.android.live.base.model.Extra;
import com.bytedance.android.live.core.network.p149a.C3174b;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.network.model.CustomApiServerException;
import com.bytedance.android.live.network.response.RequestError;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.bytedance.android.live.network.a.a */
public final class C3453a {
    /* renamed from: a */
    public static void m12790a(int i, C3174b bVar, String str) throws Exception {
        throw new CustomApiServerException(i, bVar.f9761c, str).setPrompt(bVar.f9760b);
    }

    /* renamed from: a */
    public static void m12791a(int i, RequestError requestError, Extra extra, String str) throws Exception {
        m12792a(i, requestError, C2317a.m9932a().mo15979b((Object) extra), str);
    }

    /* renamed from: a */
    public static void m12792a(int i, RequestError requestError, String str, String str2) throws Exception {
        if (requestError == null) {
            requestError = new RequestError();
            requestError.prompts = C3358ac.m12515a((int) R.string.f80);
        }
        throw new CustomApiServerException(i, requestError.url, str2).setErrorMsg(requestError.message).setPrompt(requestError.prompts).setAlert(requestError.alert).setExtra(str);
    }
}

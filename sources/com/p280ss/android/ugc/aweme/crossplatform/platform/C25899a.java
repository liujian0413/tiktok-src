package com.p280ss.android.ugc.aweme.crossplatform.platform;

import com.p280ss.android.ugc.aweme.app.C6877n;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.a */
public final class C25899a {

    /* renamed from: a */
    public static final C25899a f68533a = new C25899a();

    private C25899a() {
    }

    /* renamed from: a */
    public static final void m85177a(String str, boolean z) {
        C6877n.m21444a("h5_block_app_url", 0, new JSONObject().put("jump_url", str).put("jump_has_click", z).put("jump_block_by", "blocked"));
    }

    /* renamed from: b */
    public static final void m85178b(String str, boolean z) {
        C6877n.m21444a("h5_block_app_url", 0, new JSONObject().put("jump_url", str).put("jump_has_click", z).put("jump_block_by", "apk_download"));
    }

    /* renamed from: c */
    public static final void m85179c(String str, boolean z) {
        C6877n.m21444a("h5_block_app_url", 1, new JSONObject().put("jump_url", str).put("jump_has_click", z));
    }
}

package com.p280ss.android.ugc.aweme.p313im.sdk.chat.net;

import android.text.TextUtils;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.net.ab */
public class C30925ab implements Runnable {

    /* renamed from: f */
    public String f81000f;

    /* renamed from: g */
    public Map<String, C30925ab> f81001g;

    public void run() {
    }

    /* renamed from: e */
    public final void mo81276e() {
        if (this.f81001g != null && TextUtils.isEmpty(this.f81000f)) {
            this.f81001g.remove(this.f81000f);
        }
    }
}

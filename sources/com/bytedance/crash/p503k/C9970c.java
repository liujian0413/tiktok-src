package com.bytedance.crash.p503k;

import android.os.Handler;
import android.text.TextUtils;
import com.bytedance.crash.C9918j;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1593ar.backgroundvideo.C40413c;

/* renamed from: com.bytedance.crash.k.c */
public final class C9970c extends C9968a {
    public final void run() {
        String c = C9918j.m29332a().mo24527c();
        if (TextUtils.isEmpty(c) || "0".equals(c)) {
            mo24601a(this.f27205c);
            return;
        }
        C9918j.m29338c().mo24594a(c);
        new StringBuilder("[DeviceIdTask] did is ").append(c);
    }

    C9970c(Handler handler, long j, long j2) {
        super(handler, 0, C40413c.f105051b);
    }
}

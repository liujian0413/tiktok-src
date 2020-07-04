package com.bytedance.crash.p503k;

import android.content.Context;
import android.os.Handler;
import com.bytedance.crash.C9918j;
import com.bytedance.crash.p501j.C9919a;
import com.bytedance.crash.p501j.C9957i;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1593ar.backgroundvideo.C40413c;
import java.util.Map;

/* renamed from: com.bytedance.crash.k.b */
public final class C9969b extends C9968a {

    /* renamed from: d */
    private Context f27206d;

    public final void run() {
        Map map;
        try {
            map = C9918j.m29332a().f27069a.mo24478a();
        } catch (Throwable unused) {
            map = null;
        }
        if (map != null) {
            try {
                if (!C9919a.m29354a(map)) {
                    C9957i.m29466a().mo24584a(map);
                    return;
                }
            } catch (Throwable unused2) {
            }
        }
        mo24601a(this.f27205c);
    }

    C9969b(Handler handler, long j, long j2, Context context) {
        super(handler, 0, C40413c.f105051b);
        this.f27206d = context;
    }
}

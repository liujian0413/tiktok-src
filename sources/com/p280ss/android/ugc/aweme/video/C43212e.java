package com.p280ss.android.ugc.aweme.video;

import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.base.p1062f.C23336d;
import com.p280ss.android.ugc.aweme.util.C42880h;
import com.p280ss.android.ugc.aweme.video.hashtag.C43230c;

/* renamed from: com.ss.android.ugc.aweme.video.e */
public final class C43212e {

    /* renamed from: com.ss.android.ugc.aweme.video.e$a */
    public interface C43213a {
        /* renamed from: a */
        String mo60409a(String str);

        /* renamed from: b */
        void mo60410b(String str);
    }

    /* renamed from: a */
    public static void m137013a(String str) {
        if (TextUtils.isEmpty(str)) {
            String str2 = "";
            try {
                str2 = ((C43213a) C23336d.m76560a(C6399b.m19921a(), C43213a.class)).mo60409a("");
            } catch (Throwable th) {
                StringBuilder sb = new StringBuilder("HashTagPreferences getSP failed ");
                sb.append(th.getMessage());
                C42880h.m136156a(sb.toString());
            }
            if (!TextUtils.isEmpty(str2)) {
                C43230c.m137139a(str2);
                return;
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder("#(");
        sb2.append(str);
        sb2.append(")+");
        C43230c.m137139a(sb2.toString());
        try {
            C43213a aVar = (C43213a) C23336d.m76560a(C6399b.m19921a(), C43213a.class);
            StringBuilder sb3 = new StringBuilder("#(");
            sb3.append(str);
            sb3.append(")+");
            aVar.mo60410b(sb3.toString());
        } catch (Throwable th2) {
            StringBuilder sb4 = new StringBuilder("HashTagPreferences getSP failed ");
            sb4.append(th2.getMessage());
            C42880h.m136156a(sb4.toString());
        }
    }
}

package com.p280ss.android.ugc.aweme.shortvideo.upload;

import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.shortvideo.C39966gm;
import com.p280ss.android.ugc.aweme.shortvideo.net.C40199b;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41530am;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.a */
public final class C41434a {
    /* renamed from: a */
    private static final int m132072a(C39966gm gmVar) {
        if (!gmVar.f103837w) {
            return -1;
        }
        if (C40199b.m128499a(C35574k.m114861b())) {
            return 1;
        }
        return 0;
    }

    /* renamed from: a */
    public static final int m132073a(C39966gm gmVar, String str) {
        C7573i.m23587b(gmVar, "config");
        C7573i.m23587b(str, "scene");
        int a = m132072a(gmVar);
        StringBuilder sb = new StringBuilder("TTUploader ");
        sb.append(str);
        sb.append(" checkNetState: ");
        sb.append(a);
        C41530am.m132280a(sb.toString());
        return a;
    }
}

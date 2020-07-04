package com.p280ss.android.ugc.aweme.emoji.p1207e;

import com.p280ss.android.ugc.aweme.emoji.emojichoose.model.Resources;
import com.p280ss.android.ugc.aweme.emoji.utils.C27635f;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.emoji.e.j */
public final class C27566j {
    /* renamed from: a */
    public static List<Resources> m90342a(String str) {
        StringBuilder sb = new StringBuilder("im_resources_");
        sb.append(str);
        return C27635f.m90605a(sb.toString(), Resources.class);
    }

    /* renamed from: a */
    public static void m90343a(String str, List<Resources> list) {
        StringBuilder sb = new StringBuilder("im_resources_");
        sb.append(str);
        C27635f.m90606a(sb.toString(), list);
    }
}

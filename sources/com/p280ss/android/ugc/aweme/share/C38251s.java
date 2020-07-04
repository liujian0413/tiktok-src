package com.p280ss.android.ugc.aweme.share;

import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.music.model.Music;
import com.p280ss.android.vesdk.VEUtils;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.share.s */
public final class C38251s {

    /* renamed from: a */
    public static final C38251s f99409a = new C38251s();

    /* renamed from: b */
    private static List<String> f99410b;

    private C38251s() {
    }

    /* renamed from: a */
    public static void m122193a(List<String> list) {
        f99410b = list;
    }

    /* renamed from: a */
    public static final int m122192a(String str, String str2) {
        C7573i.m23587b(str, "inFilePath");
        C7573i.m23587b(str2, "outFilePath");
        return VEUtils.extractVideo(str, str2);
    }

    /* renamed from: a */
    public static final boolean m122194a(Aweme aweme, String str) {
        if (!(aweme == null || str == null || f99410b == null || aweme.getMusic() == null)) {
            Music music = aweme.getMusic();
            C7573i.m23582a((Object) music, "aweme.music");
            if (music.isMuteShare()) {
                List<String> list = f99410b;
                if (list == null) {
                    C7573i.m23580a();
                }
                String lowerCase = str.toLowerCase();
                C7573i.m23582a((Object) lowerCase, "(this as java.lang.String).toLowerCase()");
                if (list.contains(lowerCase)) {
                    return true;
                }
            }
        }
        return false;
    }
}

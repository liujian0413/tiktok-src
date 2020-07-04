package com.p280ss.android.ugc.aweme.app.download;

import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.Video;
import com.p280ss.android.ugc.aweme.share.C37974ak.C37975a;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;
import okhttp3.HttpUrl;
import okhttp3.HttpUrl.Builder;

/* renamed from: com.ss.android.ugc.aweme.app.download.d */
public final class C22968d {

    /* renamed from: a */
    public static final C22968d f60737a = new C22968d();

    private C22968d() {
    }

    /* renamed from: a */
    public static final boolean m75565a(String str) {
        if (str == null || TextUtils.isEmpty(str)) {
            return false;
        }
        HttpUrl parse = HttpUrl.parse(str);
        if (parse == null || !TextUtils.equals(parse.queryParameter("ss_is_p_v_ss"), "1")) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static final String m75564a(Aweme aweme, String str) {
        if (!(aweme == null || aweme.getVideo() == null)) {
            Video video = aweme.getVideo();
            C7573i.m23582a((Object) video, "aweme.video");
            if (video.isNeedSetCookie() && str != null && !TextUtils.isEmpty(str)) {
                Video video2 = aweme.getVideo();
                C7573i.m23582a((Object) video2, "aweme.video");
                if (!video2.isNeedSetCookie() || !C7634n.m23721b(str, "http://", false)) {
                    HttpUrl parse = HttpUrl.parse(str);
                    if (parse == null || parse.queryParameter("ss_is_p_v_ss") != null) {
                        return str;
                    }
                    Builder newBuilder = parse.newBuilder();
                    newBuilder.setQueryParameter("ss_is_p_v_ss", "1");
                    return newBuilder.toString();
                }
                C37975a.m121289b(str);
                return str;
            }
        }
        return str;
    }
}

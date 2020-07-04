package com.p280ss.android.ugc.aweme.video.p1699c;

import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.p280ss.android.ugc.aweme.video.preload.C43271b;
import com.p280ss.android.ugc.playerkit.videoview.p1755d.C44950d;
import com.p280ss.android.ugc.playerkit.videoview.p1755d.C44951e;
import com.p280ss.android.ugc.playerkit.videoview.p1755d.C44953g;
import com.p280ss.android.ugc.playerkit.videoview.p1755d.C44953g.C44955a;

/* renamed from: com.ss.android.ugc.aweme.video.c.e */
public final class C43205e implements C44953g {

    /* renamed from: a */
    private final C43271b f111850a;

    public C43205e(C43271b bVar) {
        this.f111850a = bVar;
    }

    /* renamed from: a */
    public final C44951e mo104868a(C44955a aVar) {
        C44950d a = aVar.mo107470a();
        VideoUrlModel videoUrlModel = a.f115620a;
        String[] strArr = a.f115622c;
        if (strArr != null) {
            for (int i = 0; i < strArr.length; i++) {
                StringBuilder sb = new StringBuilder();
                sb.append(strArr[i]);
                sb.append(m136995a(strArr[i], videoUrlModel.getSourceId()));
                strArr[i] = sb.toString();
            }
        }
        return new C44951e(this.f111850a.mo105021a(videoUrlModel, a.f115621b, strArr));
    }

    /* renamed from: a */
    private static String m136995a(String str, String str2) {
        String str3 = "";
        if (TextUtils.isEmpty(str)) {
            return str3;
        }
        if (str.contains("?")) {
            StringBuilder sb = new StringBuilder("&source_id=");
            sb.append(str2);
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder("?&source_id=");
        sb2.append(str2);
        return sb2.toString();
    }
}

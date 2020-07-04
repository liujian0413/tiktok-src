package com.p280ss.android.ugc.gamora.recorder;

import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.gamora.recorder.aj */
public final class C44460aj {
    /* renamed from: a */
    public static final JSONObject m140631a(ShortVideoContextViewModel shortVideoContextViewModel) {
        String str;
        C7573i.m23587b(shortVideoContextViewModel, "viewModel");
        C6869c a = C6869c.m21381a().mo16887a("creation_id", shortVideoContextViewModel.f99791a.f99787w).mo16887a("shoot_way", shortVideoContextViewModel.f99791a.f99788x).mo16887a("route", "1");
        String str2 = "is_photo";
        if (shortVideoContextViewModel.mo96169c()) {
            str = "1";
        } else {
            str = "0";
        }
        JSONObject b = a.mo16887a(str2, str).mo16887a("position", "shoot_page").mo16888b();
        C7573i.m23582a((Object) b, "builder.build()");
        return b;
    }
}

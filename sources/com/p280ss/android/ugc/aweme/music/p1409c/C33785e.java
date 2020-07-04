package com.p280ss.android.ugc.aweme.music.p1409c;

import com.bytedance.common.utility.C6306c;
import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.Collection;

/* renamed from: com.ss.android.ugc.aweme.music.c.e */
public final class C33785e {

    /* renamed from: a */
    public static final String f88148a;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(((IAVService) ServiceManager.get().getService(IAVService.class)).shortVideoConfig().musicDir());
        sb.append("rhythm/");
        f88148a = sb.toString();
    }

    /* renamed from: a */
    public static String m108938a(MusicModel musicModel) {
        UrlModel strongBeatUrl = musicModel.getStrongBeatUrl();
        if (strongBeatUrl == null || C6307b.m19566a((Collection<T>) strongBeatUrl.getUrlList())) {
            return null;
        }
        return (String) strongBeatUrl.getUrlList().get(0);
    }

    /* renamed from: b */
    private static String m108940b(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(C6306c.m19561a(str));
        sb.append(".json");
        return sb.toString();
    }

    /* renamed from: a */
    public static String m108939a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(f88148a);
        sb.append(m108940b(str));
        return sb.toString();
    }
}

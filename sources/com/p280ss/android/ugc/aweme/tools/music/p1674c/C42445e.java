package com.p280ss.android.ugc.aweme.tools.music.p1674c;

import com.p280ss.android.ugc.aweme.music.model.Music;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C7571f;

/* renamed from: com.ss.android.ugc.aweme.tools.music.c.e */
public final class C42445e {

    /* renamed from: a */
    public static final C42446a f110338a = new C42446a(null);

    /* renamed from: com.ss.android.ugc.aweme.tools.music.c.e$a */
    public static final class C42446a {
        private C42446a() {
        }

        public /* synthetic */ C42446a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static List<MusicModel> m134902a(List<? extends Music> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Music music : list) {
                if (music != null) {
                    arrayList.add(music.convertToMusicModel());
                }
            }
            return arrayList;
        }
    }
}

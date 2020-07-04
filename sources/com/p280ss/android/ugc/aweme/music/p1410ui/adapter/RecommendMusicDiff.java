package com.p280ss.android.ugc.aweme.music.p1410ui.adapter;

import android.support.p029v7.util.C1143a.C1147c;
import com.p280ss.android.ugc.aweme.music.model.Music;
import com.p280ss.android.ugc.aweme.music.p1410ui.viewmodel.C34015d;
import java.util.Objects;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.music.ui.adapter.RecommendMusicDiff */
public final class RecommendMusicDiff extends C1147c<C34015d> {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo4549a(Object obj, Object obj2) {
        return m109345a((C34015d) obj, (C34015d) obj2);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo4550b(Object obj, Object obj2) {
        return m109346b((C34015d) obj, (C34015d) obj2);
    }

    /* renamed from: a */
    private static boolean m109345a(C34015d dVar, C34015d dVar2) {
        Object obj;
        C7573i.m23587b(dVar, "p0");
        C7573i.m23587b(dVar2, "p1");
        Music music = dVar.f88717a;
        String str = null;
        if (music != null) {
            obj = music.getMid();
        } else {
            obj = null;
        }
        Music music2 = dVar2.f88717a;
        if (music2 != null) {
            str = music2.getMid();
        }
        return Objects.equals(obj, str);
    }

    /* renamed from: b */
    private static boolean m109346b(C34015d dVar, C34015d dVar2) {
        Object obj;
        C7573i.m23587b(dVar, "p0");
        C7573i.m23587b(dVar2, "p1");
        Music music = dVar.f88717a;
        String str = null;
        if (music != null) {
            obj = music.getMid();
        } else {
            obj = null;
        }
        Music music2 = dVar2.f88717a;
        if (music2 != null) {
            str = music2.getMid();
        }
        return Objects.equals(obj, str);
    }
}

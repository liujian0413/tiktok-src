package com.p280ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed;

import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import java.util.Map;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.e */
public final class C40177e {

    /* renamed from: a */
    public static final C40177e f104448a = new C40177e();

    /* renamed from: b */
    private static String f104449b;

    /* renamed from: c */
    private static String f104450c;

    private C40177e() {
    }

    /* renamed from: b */
    public final void mo99946b(boolean z) {
        C6907h.m21524a("edit_clip_delete", (Map) m128369d(z).f60753a);
    }

    /* renamed from: a */
    public final void mo99945a(boolean z) {
        C6907h.m21524a("edit_clips_order", (Map) m128369d(z).mo59973a("edit_way", "press").f60753a);
    }

    /* renamed from: c */
    public final void mo99947c(boolean z) {
        C6907h.m21524a("edit_clip_preview", (Map) m128369d(z).mo59973a("edit_way", "click").f60753a);
    }

    /* renamed from: d */
    private static C22984d m128369d(boolean z) {
        String str;
        C22984d a = C22984d.m75611a().mo59973a("shoot_way", f104450c).mo59973a("creation_id", f104449b).mo59973a("content_source", "upload").mo59973a("enter_from", "album_panel");
        String str2 = "content_type";
        if (z) {
            str = "video";
        } else {
            str = "photo";
        }
        C22984d a2 = a.mo59973a(str2, str);
        C7573i.m23582a((Object) a2, "EventMapBuilder.newBuild…eo) \"video\" else \"photo\")");
        return a2;
    }

    /* renamed from: a */
    public static void m128368a(String str, String str2) {
        f104449b = str;
        f104450c = str2;
    }
}

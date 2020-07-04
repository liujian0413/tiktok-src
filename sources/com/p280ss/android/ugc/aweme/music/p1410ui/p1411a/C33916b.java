package com.p280ss.android.ugc.aweme.music.p1410ui.p1411a;

import com.facebook.network.connectionclass.C14143b;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import java.util.Map;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.music.ui.a.b */
public final class C33916b {

    /* renamed from: a */
    public static final C33916b f88506a = new C33916b();

    private C33916b() {
    }

    /* renamed from: a */
    public static void m109329a(String str, String str2, String str3) {
        C6907h.m21524a("download_music", (Map) new C22984d().mo59973a("music_id", str).mo59973a("enter_from", str2).mo59973a("url", str3).mo59970a("download_strategy", C33915a.m109326a()).f60753a);
    }

    /* renamed from: a */
    public static void m109331a(String str, String str2, String str3, String str4) {
        C14143b a = C14143b.m41756a();
        C7573i.m23582a((Object) a, "ConnectionClassManager.getInstance()");
        C6907h.m21524a("download_music_failed", (Map) new C22984d().mo59973a("music_id", str).mo59973a("enter_from", str2).mo59973a("url", str3).mo59970a("download_strategy", C33915a.m109326a()).mo59973a("fail_reason", str4).mo59970a("net_speed", (int) a.mo33902c()).f60753a);
    }

    /* renamed from: a */
    public static void m109330a(String str, String str2, String str3, Long l, Long l2) {
        C6907h.m21524a("download_music_succeed", (Map) new C22984d().mo59973a("music_id", str).mo59973a("enter_from", str2).mo59973a("url", str3).mo59972a("time", (Object) l).mo59972a("size", (Object) l2).mo59970a("download_strategy", C33915a.m109326a()).f60753a);
    }
}

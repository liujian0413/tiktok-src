package com.p280ss.android.ugc.aweme.music.p1406ab;

import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.ugc.aweme.network.C10944e;
import com.bytedance.keva.Keva;
import com.google.gson.C6709k;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.music.ab.a */
public final class C33703a {

    /* renamed from: a */
    public static final C33703a f87967a = new C33703a();

    /* renamed from: b */
    private static MusicAbTestModel f87968b;

    private C33703a() {
    }

    /* renamed from: a */
    public static int m108716a() {
        return f87968b.getMusicListType();
    }

    /* renamed from: b */
    public static int m108718b() {
        return f87968b.getMusicListType2();
    }

    /* renamed from: c */
    public static boolean m108719c() {
        return f87968b.isMusicInstantSearchEnabled();
    }

    /* renamed from: d */
    public static int m108720d() {
        return f87968b.getLocalSoundEntranceStyle();
    }

    /* renamed from: f */
    public static int m108722f() {
        return f87968b.getNonStdMusicList();
    }

    /* renamed from: g */
    public static boolean m108723g() {
        return f87968b.isRemove15sCapMusic();
    }

    /* renamed from: e */
    public static int m108721e() {
        if (!C6399b.m19944t()) {
            return 0;
        }
        return f87968b.getMtCopywritingSaveOrDownload();
    }

    static {
        f87968b = new MusicAbTestModel();
        String string = Keva.getRepo("music_sp").getString("music_ab_test", "");
        if (!C7573i.m23585a((Object) string, (Object) "")) {
            Object a = C10944e.m32113a().mo15974a(string, MusicAbTestModel.class);
            C7573i.m23582a(a, "Network.getGson().fromJs…cAbTestModel::class.java)");
            f87968b = (MusicAbTestModel) a;
        }
    }

    /* renamed from: a */
    public static void m108717a(C6709k kVar) {
        C7573i.m23587b(kVar, "jsonElement");
        Object a = C10944e.m32113a().mo15970a(kVar.mo16136m().mo16149b("data"), MusicAbTestModel.class);
        C7573i.m23582a(a, "Network.getGson().fromJs…cAbTestModel::class.java)");
        f87968b = (MusicAbTestModel) a;
        Keva.getRepo("music_sp").storeString("music_ab_test", C10944e.m32113a().mo15979b((Object) f87968b));
    }
}

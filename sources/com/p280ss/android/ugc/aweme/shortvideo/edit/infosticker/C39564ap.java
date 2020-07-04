package com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.ap */
public final class C39564ap {

    /* renamed from: a */
    public static final C39565a f102730a = new C39565a(null);

    /* renamed from: b */
    private final Keva f102731b;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.ap$a */
    public static final class C39565a {
        private C39565a() {
        }

        public /* synthetic */ C39565a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: d */
    public final boolean mo98511d() {
        return this.f102731b.getBoolean("lyric_sticker_hint_set", false);
    }

    public C39564ap() {
        Keva repo = Keva.getRepo("text_sticker_keva");
        C7573i.m23582a((Object) repo, "Keva.getRepo(REPO_NAME)");
        this.f102731b = repo;
    }

    /* renamed from: a */
    public final boolean mo98505a() {
        return this.f102731b.getBoolean("info_sticker_hint_set", false);
    }

    /* renamed from: b */
    public final boolean mo98507b() {
        return this.f102731b.getBoolean("text_sticker_hint_set", false);
    }

    /* renamed from: c */
    public final boolean mo98509c() {
        return this.f102731b.getBoolean("interact_sticker_hint_set", false);
    }

    /* renamed from: d */
    public final void mo98510d(boolean z) {
        this.f102731b.storeBoolean("lyric_sticker_hint_set", z);
    }

    /* renamed from: a */
    public final void mo98504a(boolean z) {
        this.f102731b.storeBoolean("info_sticker_hint_set", true);
    }

    /* renamed from: b */
    public final void mo98506b(boolean z) {
        this.f102731b.storeBoolean("text_sticker_hint_set", true);
    }

    /* renamed from: c */
    public final void mo98508c(boolean z) {
        this.f102731b.storeBoolean("interact_sticker_hint_set", true);
    }
}

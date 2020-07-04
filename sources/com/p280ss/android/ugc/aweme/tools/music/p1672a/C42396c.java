package com.p280ss.android.ugc.aweme.tools.music.p1672a;

import android.text.TextUtils;
import bolts.C1591g;
import bolts.C1592h;
import com.p280ss.android.ugc.aweme.base.utils.C23477d;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.music.model.Music;
import com.p280ss.android.ugc.aweme.music.service.IMusicService;
import com.p280ss.android.ugc.aweme.shortvideo.AVMusic;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p280ss.android.ugc.aweme.tools.music.p1673b.C42437a;
import com.p280ss.android.ugc.aweme.tools.music.p1674c.C42440b;
import com.p280ss.android.ugc.aweme.toolsport.p1679a.C42608f;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.C7581n;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.tools.music.a.c */
public final class C42396c {

    /* renamed from: c */
    public static final C42396c f110248c = C42398b.m134793a();

    /* renamed from: d */
    public static final C42397a f110249d = new C42397a(null);

    /* renamed from: a */
    public C42437a f110250a;

    /* renamed from: b */
    public C42608f f110251b;

    /* renamed from: com.ss.android.ugc.aweme.tools.music.a.c$a */
    public static final class C42397a {
        private C42397a() {
        }

        /* renamed from: a */
        public static C42396c m134792a() {
            return C42396c.f110248c;
        }

        public /* synthetic */ C42397a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.a.c$b */
    static final class C42398b {

        /* renamed from: a */
        public static final C42398b f110252a = new C42398b();

        /* renamed from: b */
        private static final C42396c f110253b = new C42396c();

        private C42398b() {
        }

        /* renamed from: a */
        public static C42396c m134793a() {
            return f110253b;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.a.c$c */
    static final class C42399c<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ String f110254a;

        C42399c(String str) {
            this.f110254a = str;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Music call() {
            return ((IMusicService) ServiceManager.get().getService(IMusicService.class)).fetchMusicById(this.f110254a, 0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.a.c$d */
    static final class C42400d<TTaskResult, TContinuationResult> implements C1591g<Music, Object> {

        /* renamed from: a */
        final /* synthetic */ C42396c f110255a;

        C42400d(C42396c cVar) {
            this.f110255a = cVar;
        }

        public final /* synthetic */ Object then(C1592h hVar) {
            m134795a(hVar);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m134795a(C1592h<Music> hVar) {
            if (this.f110255a.f110250a != null) {
                C7573i.m23582a((Object) hVar, "it");
                boolean z = false;
                AVMusic aVMusic = null;
                if (hVar.mo6890e() != null) {
                    MusicModel convertToMusicModel = ((Music) hVar.mo6890e()).convertToMusicModel();
                    C42608f fVar = this.f110255a.f110251b;
                    if (fVar != null) {
                        aVMusic = fVar.mo97931b();
                    }
                    if (aVMusic == null) {
                        z = true;
                    }
                    if (convertToMusicModel != null) {
                        convertToMusicModel.setMvThemeMusic(true);
                        if (z) {
                            C42608f fVar2 = this.f110255a.f110251b;
                            if (fVar2 != null) {
                                new C42440b();
                                fVar2.mo97928a(C42440b.m134896a(convertToMusicModel));
                            }
                        }
                    }
                    C42437a aVar = this.f110255a.f110250a;
                    if (aVar == null) {
                        C7573i.m23580a();
                    }
                    aVar.mo103873a(convertToMusicModel, z);
                    return;
                }
                C42437a aVar2 = this.f110255a.f110250a;
                if (aVar2 == null) {
                    C7573i.m23580a();
                }
                aVar2.mo103873a(null, false);
            }
        }
    }

    /* renamed from: a */
    public final C42396c mo103913a(C42437a aVar) {
        this.f110250a = aVar;
        return this;
    }

    /* renamed from: a */
    public final C42396c mo103914a(C42608f fVar) {
        this.f110251b = fVar;
        return this;
    }

    /* renamed from: a */
    public final C42396c mo103915a(List<String> list) {
        if (C23477d.m77081a((Collection<T>) list) || list == null) {
            if (this.f110250a != null) {
                C42437a aVar = this.f110250a;
                if (aVar == null) {
                    C7573i.m23580a();
                }
                aVar.mo103873a(null, false);
            }
            return this;
        }
        String str = (String) list.get(0);
        if (TextUtils.isEmpty(str)) {
            if (this.f110250a != null) {
                C42437a aVar2 = this.f110250a;
                if (aVar2 == null) {
                    C7573i.m23580a();
                }
                aVar2.mo103873a(null, false);
            }
            return this;
        }
        C1592h.m7853a((Callable<TResult>) new C42399c<TResult>(str)).mo6876a((C1591g<TResult, TContinuationResult>) new C42400d<TResult,TContinuationResult>(this), C1592h.f5958b);
        return this;
    }
}

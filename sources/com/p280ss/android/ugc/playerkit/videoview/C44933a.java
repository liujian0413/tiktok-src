package com.p280ss.android.ugc.playerkit.videoview;

import android.arch.lifecycle.C0043i;
import com.p280ss.android.ugc.aweme.feed.model.Video;
import com.p280ss.android.ugc.aweme.player.sdk.api.C34976f;
import com.p280ss.android.ugc.aweme.player.sdk.api.IPlayer.C34970f;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.ss.android.ugc.playerkit.videoview.a */
public final class C44933a implements C44960f {

    /* renamed from: a */
    private WeakReference<VideoViewComponent> f115597a;

    /* renamed from: b */
    private Set<C0043i> f115598b;

    /* renamed from: com.ss.android.ugc.playerkit.videoview.a$a */
    static final class C44935a {

        /* renamed from: a */
        static final C44933a f115599a = new C44933a();
    }

    /* renamed from: a */
    public static C44933a m141791a() {
        return C44935a.f115599a;
    }

    private C44933a() {
        this.f115597a = new WeakReference<>(null);
        this.f115598b = Collections.newSetFromMap(new WeakHashMap());
    }

    /* renamed from: ab */
    public final void mo71670ab() {
        if (this.f115597a != null) {
            VideoViewComponent videoViewComponent = (VideoViewComponent) this.f115597a.get();
            if (videoViewComponent != null) {
                videoViewComponent.mo71670ab();
            }
        }
    }

    /* renamed from: ac */
    public final void mo71671ac() {
        if (this.f115597a != null) {
            VideoViewComponent videoViewComponent = (VideoViewComponent) this.f115597a.get();
            if (videoViewComponent != null) {
                videoViewComponent.mo71671ac();
            }
        }
    }

    /* renamed from: ad */
    public final void mo71672ad() {
        if (this.f115597a != null) {
            VideoViewComponent videoViewComponent = (VideoViewComponent) this.f115597a.get();
            if (videoViewComponent != null) {
                videoViewComponent.mo71672ad();
            }
        }
    }

    /* renamed from: ae */
    public final void mo71673ae() {
        if (this.f115597a != null) {
            VideoViewComponent videoViewComponent = (VideoViewComponent) this.f115597a.get();
            if (videoViewComponent != null) {
                videoViewComponent.mo71673ae();
            }
        }
    }

    /* renamed from: af */
    public final long mo71674af() {
        if (this.f115597a != null) {
            VideoViewComponent videoViewComponent = (VideoViewComponent) this.f115597a.get();
            if (videoViewComponent != null) {
                return videoViewComponent.mo71674af();
            }
        }
        return 0;
    }

    /* renamed from: ag */
    public final void mo71675ag() {
        if (this.f115597a != null) {
            VideoViewComponent videoViewComponent = (VideoViewComponent) this.f115597a.get();
            if (videoViewComponent != null) {
                videoViewComponent.mo71675ag();
            }
        }
    }

    /* renamed from: ah */
    public final C34970f mo71676ah() {
        if (this.f115597a != null) {
            VideoViewComponent videoViewComponent = (VideoViewComponent) this.f115597a.get();
            if (videoViewComponent != null) {
                return videoViewComponent.mo71676ah();
            }
        }
        return null;
    }

    /* renamed from: c */
    public final void mo107443c() {
        if (this.f115597a != null) {
            VideoViewComponent videoViewComponent = (VideoViewComponent) this.f115597a.get();
            if (videoViewComponent != null) {
                videoViewComponent.mo107435b();
            }
        }
    }

    /* renamed from: d */
    public final long mo107444d() {
        if (this.f115597a != null) {
            VideoViewComponent videoViewComponent = (VideoViewComponent) this.f115597a.get();
            if (videoViewComponent != null) {
                return videoViewComponent.mo107437c();
            }
        }
        return 0;
    }

    /* renamed from: b */
    public final boolean mo107442b() {
        if (this.f115597a != null) {
            VideoViewComponent videoViewComponent = (VideoViewComponent) this.f115597a.get();
            if (videoViewComponent != null) {
                return videoViewComponent.mo107438d();
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo71660a(Video video) {
        if (this.f115597a != null) {
            VideoViewComponent videoViewComponent = (VideoViewComponent) this.f115597a.get();
            if (videoViewComponent != null) {
                videoViewComponent.mo71660a(video);
            }
        }
    }

    /* renamed from: b */
    public final void mo71692b(C34976f fVar) {
        if (this.f115597a != null) {
            VideoViewComponent videoViewComponent = (VideoViewComponent) this.f115597a.get();
            if (videoViewComponent != null) {
                videoViewComponent.mo71692b(fVar);
            }
        }
    }

    /* renamed from: a */
    public final void mo71663a(C34976f fVar) {
        if (this.f115597a != null) {
            VideoViewComponent videoViewComponent = (VideoViewComponent) this.f115597a.get();
            if (videoViewComponent != null) {
                videoViewComponent.mo71663a(fVar);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo107441a(VideoViewComponent videoViewComponent) {
        VideoViewComponent videoViewComponent2 = (VideoViewComponent) this.f115597a.get();
        if (videoViewComponent2 != null) {
            for (C0043i iVar : this.f115598b) {
                if (iVar != null) {
                    iVar.getLifecycle().mo56b(videoViewComponent2);
                }
            }
        }
        this.f115597a = new WeakReference<>(videoViewComponent);
    }

    /* renamed from: a */
    public final void mo71661a(Video video, boolean z, int i) {
        if (this.f115597a != null) {
            VideoViewComponent videoViewComponent = (VideoViewComponent) this.f115597a.get();
            if (videoViewComponent != null) {
                videoViewComponent.mo71661a(video, z, i);
            }
        }
    }
}

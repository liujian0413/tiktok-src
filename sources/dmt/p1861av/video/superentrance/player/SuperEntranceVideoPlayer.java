package dmt.p1861av.video.superentrance.player;

import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.Lifecycle.Event;
import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.feed.model.Video;
import com.p280ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.p280ss.android.ugc.aweme.player.sdk.api.C34976f;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41530am;
import com.p280ss.android.ugc.playerkit.videoview.C44961g;
import com.p280ss.android.ugc.playerkit.videoview.C44962h;
import com.p280ss.android.ugc.playerkit.videoview.KeepSurfaceTextureView;
import com.p280ss.android.ugc.playerkit.videoview.VideoViewComponent;
import dmt.p1861av.video.superentrance.C47507e;
import java.util.Map;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7561a;

/* renamed from: dmt.av.video.superentrance.player.SuperEntranceVideoPlayer */
public final class SuperEntranceVideoPlayer extends C47513a implements C0042h {

    /* renamed from: a */
    public final KeepSurfaceTextureView f121973a;

    /* renamed from: b */
    public final C7561a<C7581n> f121974b;

    /* renamed from: c */
    private VideoViewComponent f121975c;

    /* renamed from: d */
    private C44961g f121976d;

    /* renamed from: a */
    private void m148278a() {
        C41530am.m132280a("called SuperEntranceVideoPlayer release()");
        this.f121975c.mo107435b();
    }

    @C0054q(mo125a = Event.ON_DESTROY)
    public final void onDestroy() {
        C41530am.m132280a("called SuperEntranceVideoPlayer onDestroy()");
        m148278a();
    }

    @C0054q(mo125a = Event.ON_RESUME)
    public final void resume() {
        C41530am.m132280a("called SuperEntranceVideoPlayer resume()");
        this.f121975c.mo71671ac();
    }

    @C0054q(mo125a = Event.ON_PAUSE)
    public final void stop() {
        C41530am.m132280a("called SuperEntranceVideoPlayer stop()");
        this.f121975c.mo71672ad();
    }

    /* renamed from: a */
    private void m148279a(Video video) {
        C7573i.m23587b(video, "video");
        C41530am.m132280a("called SuperEntranceVideoPlayer startPlay()");
        this.f121975c.mo71660a(video);
    }

    /* renamed from: e */
    public final void mo64953e(String str) {
        super.mo64949c(str);
        m148279a(C47507e.m148255a(true));
        CharSequence charSequence = str;
        String str2 = null;
        VideoUrlModel playAddrH264 = C47507e.m148255a(false).getPlayAddrH264();
        if (playAddrH264 != null) {
            str2 = playAddrH264.getSourceId();
        }
        if (TextUtils.equals(charSequence, str2)) {
            C41530am.m132280a("called SuperEntranceVideoPlayer onFirstParagraphPlayCompleted()");
            this.f121974b.invoke();
        }
    }

    public SuperEntranceVideoPlayer(C0043i iVar, KeepSurfaceTextureView keepSurfaceTextureView, C7561a<C7581n> aVar) {
        C7573i.m23587b(iVar, "lifecycleOwner");
        C7573i.m23587b(keepSurfaceTextureView, "surface");
        C7573i.m23587b(aVar, "onFirstParagraphPlayCompleted");
        this.f121973a = keepSurfaceTextureView;
        this.f121974b = aVar;
        iVar.getLifecycle().mo55a(this);
        C44962h a = C44962h.m141885a(this.f121973a);
        C7573i.m23582a((Object) a, "VideoSurfaceHolderImpl.wrap(surface)");
        this.f121976d = a;
        VideoViewComponent videoViewComponent = new VideoViewComponent();
        videoViewComponent.mo107433a(this.f121973a);
        videoViewComponent.mo71663a((C34976f) this);
        this.f121975c = videoViewComponent;
        m148279a(C47507e.m148255a(false));
        C6907h.m21524a("super_entrance_splash_play", (Map) C22984d.m75611a().f60753a);
    }
}

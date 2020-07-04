package dmt.p1861av.video.superentrance.player;

import com.p280ss.android.ugc.aweme.player.sdk.api.C34976f;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41530am;
import com.p280ss.android.ugc.playerkit.model.C44919c;
import com.p280ss.android.ugc.playerkit.model.C44920d;
import com.p280ss.android.ugc.playerkit.model.C44921e;

/* renamed from: dmt.av.video.superentrance.player.a */
public class C47513a implements C34976f {
    /* renamed from: a */
    public final void mo63043a(C44919c cVar) {
        StringBuilder sb = new StringBuilder("BaseVideoPlayerListener onPlayFailed ");
        sb.append(String.valueOf(cVar));
        C41530am.m132280a(sb.toString());
    }

    /* renamed from: b */
    public final void mo64944b(float f) {
        StringBuilder sb = new StringBuilder("BaseVideoPlayerListener onPlayProgressChange ");
        sb.append(f);
        C41530am.m132280a(sb.toString());
    }

    /* renamed from: c */
    public final void mo64949c(String str) {
        StringBuilder sb = new StringBuilder("BaseVideoPlayerListener onPreparePlay ");
        sb.append(str);
        C41530am.m132280a(sb.toString());
    }

    /* renamed from: d */
    public final void mo64951d(String str) {
        StringBuilder sb = new StringBuilder("BaseVideoPlayerListener onPausePlay ");
        sb.append(str);
        C41530am.m132280a(sb.toString());
    }

    /* renamed from: e */
    public void mo64953e(String str) {
        StringBuilder sb = new StringBuilder("BaseVideoPlayerListener onPlayCompletedFirstTime ");
        sb.append(str);
        C41530am.m132280a(sb.toString());
    }

    /* renamed from: e_ */
    public final void mo64954e_(boolean z) {
        StringBuilder sb = new StringBuilder("BaseVideoPlayerListener onBuffering ");
        sb.append(z);
        C41530am.m132280a(sb.toString());
    }

    /* renamed from: a */
    public final void mo63044a(C44920d dVar) {
        String str;
        StringBuilder sb = new StringBuilder("BaseVideoPlayerListener onRenderReady ");
        if (dVar != null) {
            str = dVar.f115529a;
        } else {
            str = null;
        }
        sb.append(str);
        C41530am.m132280a(sb.toString());
    }

    /* renamed from: b */
    public final void mo64946b(C44919c cVar) {
        StringBuilder sb = new StringBuilder("BaseVideoPlayerListener onRetryOnError ");
        sb.append(String.valueOf(cVar));
        C41530am.m132280a(sb.toString());
    }

    /* renamed from: a */
    public final void mo63045a(C44921e eVar) {
        String str;
        StringBuilder sb = new StringBuilder("BaseVideoPlayerListener onRenderFirstFrame ");
        if (eVar != null) {
            str = eVar.f115532a;
        } else {
            str = null;
        }
        sb.append(str);
        C41530am.m132280a(sb.toString());
    }

    /* renamed from: b */
    public final void mo63047b(String str) {
        StringBuilder sb = new StringBuilder("BaseVideoPlayerListener onPlayCompleted ");
        sb.append(str);
        C41530am.m132280a(sb.toString());
    }

    /* renamed from: a */
    public final void mo63046a(String str) {
        StringBuilder sb = new StringBuilder("BaseVideoPlayerListener onResumePlay ");
        sb.append(str);
        C41530am.m132280a(sb.toString());
    }

    /* renamed from: b */
    public final void mo64947b(boolean z) {
        StringBuilder sb = new StringBuilder("BaseVideoPlayerListener onDecoderBuffering  ");
        sb.append(z);
        C41530am.m132280a(sb.toString());
    }
}

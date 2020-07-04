package com.p280ss.android.ugc.aweme.feed.p1238ui.seekbar.detailvideo;

import android.view.MotionEvent;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import com.p280ss.android.ugc.aweme.feed.p1238ui.seekbar.C29001a;
import com.p280ss.android.ugc.aweme.feed.p1238ui.seekbar.C29004c;
import com.p280ss.android.ugc.aweme.feed.p1238ui.seekbar.C29005d;
import com.p280ss.android.ugc.aweme.feed.p1238ui.seekbar.C29013e;
import com.p280ss.android.ugc.aweme.feed.p1238ui.seekbar.C29016g;
import com.p280ss.android.ugc.aweme.feed.p1238ui.seekbar.VideoSeekBar;
import com.p280ss.android.ugc.aweme.feed.panel.C28648x;
import com.p280ss.android.ugc.aweme.longvideonew.C32803k;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import kotlin.jvm.internal.C7573i;
import org.greenrobot.eventbus.C7709l;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.seekbar.detailvideo.b */
public final class C29012b extends C32803k {
    /* renamed from: a */
    public final void mo74339a() {
        C42961az.m136383d(this);
    }

    @C7709l
    public final void onVideoProgressVolumeKeyEvent(C29016g gVar) {
        C7573i.m23587b(gVar, "event");
        super.onVideoProgressVolumeKeyEvent(gVar);
    }

    /* renamed from: b */
    public final void mo74324b(SeekBar seekBar) {
        super.mo74324b(seekBar);
        C42961az.m136380a(new C29011a(false, this.f85560a, this.f85568i));
    }

    @C7709l
    public final void onPlayerControllerRenderFirstFrameEvent(C29004c cVar) {
        C7573i.m23587b(cVar, "event");
        if (C7573i.m23585a((Object) this.f85568i, (Object) cVar.f76401e)) {
            super.onPlayerControllerRenderFirstFrameEvent(cVar);
        }
    }

    @C7709l
    public final void onPlayerControllerVideoPlayProgressChange(C29005d dVar) {
        C7573i.m23587b(dVar, "event");
        if (C7573i.m23585a((Object) this.f85568i, (Object) dVar.f76406e)) {
            super.onPlayerControllerVideoPlayProgressChange(dVar);
        }
    }

    @C7709l
    public final void onPlayerControllerVideoStatusEvent(C29013e eVar) {
        C7573i.m23587b(eVar, "event");
        if (C7573i.m23585a((Object) this.f85568i, (Object) eVar.f76431e)) {
            super.onPlayerControllerVideoStatusEvent(eVar);
        }
    }

    /* renamed from: a */
    public final void mo74321a(MotionEvent motionEvent) {
        Integer num;
        super.mo74321a(motionEvent);
        if (motionEvent != null) {
            num = Integer.valueOf(motionEvent.getAction());
        } else {
            num = null;
        }
        if (num != null && num.intValue() == 0) {
            C42961az.m136380a(new C29011a(true, this.f85560a, this.f85568i));
        }
    }

    @C7709l
    public final void onFullFeedVideoChangeEvent(C29001a aVar) {
        C7573i.m23587b(aVar, "event");
        if (C7573i.m23585a((Object) this.f85568i, (Object) aVar.f76390d)) {
            super.onFullFeedVideoChangeEvent(aVar);
            mo84326b();
        } else {
            this.f85578s.setVisibility(8);
            this.f85579t.setVisibility(8);
        }
        this.f85578s.removeCallbacks(this.f85577r);
    }

    public C29012b(VideoSeekBar videoSeekBar, LinearLayout linearLayout, C28648x xVar) {
        C7573i.m23587b(videoSeekBar, "videoSeekBar");
        C7573i.m23587b(linearLayout, "videoSeekDuration");
        super(videoSeekBar, linearLayout);
        C42961az.m136382c(this);
        this.f85568i = xVar;
    }
}

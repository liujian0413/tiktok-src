package com.p280ss.android.ugc.aweme.shortvideo.game;

import android.util.Pair;
import android.widget.FrameLayout;
import com.p280ss.android.ugc.asve.recorder.view.ASCameraView;
import com.p280ss.android.ugc.aweme.shortvideo.game.p1574a.C39922a;
import com.p280ss.android.ugc.aweme.shortvideo.p1550b.C38505a;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.VideoRecordNewActivity;
import com.p280ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.p280ss.android.ugc.aweme.tools.C42149ap;
import com.p280ss.android.ugc.aweme.tools.C42151ar;
import com.p280ss.android.ugc.aweme.tools.C42155av;
import com.p280ss.android.ugc.aweme.tools.C42569o;
import com.p280ss.android.ugc.aweme.tools.C42570p;
import com.p280ss.android.ugc.aweme.tools.C42589y;
import com.p280ss.android.ugc.aweme.tools.RecordingSpeed;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.game.a */
public final class C39918a {

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.game.a$a */
    static class C39920a implements C39932i {

        /* renamed from: a */
        private final VideoRecordNewActivity f103693a;

        /* renamed from: b */
        public final void mo99327b() {
            this.f103693a.f107327m.mo100089h();
        }

        /* renamed from: a */
        public final int mo99325a() {
            return this.f103693a.f107327m.mo100087f();
        }

        /* renamed from: c */
        public final void mo99328c() {
            this.f103693a.f107324j.mo100282a((FaceStickerBean) null);
        }

        private C39920a(VideoRecordNewActivity videoRecordNewActivity) {
            this.f103693a = videoRecordNewActivity;
        }

        /* renamed from: a */
        public final void mo99326a(int i) {
            C38505a.m123074a(1);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.game.a$b */
    static class C39921b implements C39933j {

        /* renamed from: a */
        private final VideoRecordNewActivity f103694a;

        /* renamed from: a */
        public final void mo99329a() {
            this.f103694a.mo97896J().mo103594a((Object) this, (C42155av) new C42569o());
        }

        /* renamed from: c */
        public final void mo99332c() {
            this.f103694a.mo97896J().mo103594a((Object) this, (C42155av) new C42569o());
        }

        /* renamed from: d */
        public final void mo99333d() {
            this.f103694a.mo97896J().mo103594a((Object) this, (C42155av) new C42570p());
        }

        /* renamed from: e */
        public final void mo99334e() {
            this.f103694a.mo97896J().mo103594a((Object) this, (C42155av) new C42151ar());
        }

        /* renamed from: b */
        public final void mo99331b() {
            this.f103694a.mo97896J().mo103594a((Object) this.f103694a, (C42155av) new C42149ap(RecordingSpeed.NORMAL));
        }

        private C39921b(VideoRecordNewActivity videoRecordNewActivity) {
            this.f103694a = videoRecordNewActivity;
        }

        /* renamed from: a */
        public final void mo99330a(Pair<Boolean, Integer> pair) {
            this.f103694a.mo97896J().mo103594a((Object) this, (C42155av) new C42151ar());
            this.f103694a.f107337w.mo103594a((Object) this, (C42155av) new C42589y("record_full"));
        }
    }

    /* renamed from: a */
    public static C39934k m127695a(VideoRecordNewActivity videoRecordNewActivity, ASCameraView aSCameraView, FrameLayout frameLayout, C39922a aVar) {
        C39924b bVar = new C39924b(videoRecordNewActivity, videoRecordNewActivity, aSCameraView, new C39929f(frameLayout), new C39920a(videoRecordNewActivity), new C39921b(videoRecordNewActivity), aVar);
        return bVar;
    }
}

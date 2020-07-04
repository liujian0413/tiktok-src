package com.p280ss.android.ugc.aweme.shortvideo;

import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import com.p280ss.android.ugc.asve.recorder.view.ASCameraView;
import com.p280ss.android.ugc.aweme.shortvideo.gesture.defult.C39954b;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.VideoRecordNewActivity;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41530am;
import com.p280ss.android.ugc.aweme.tools.C42138ae;
import com.p280ss.android.ugc.aweme.tools.C42155av;
import com.p280ss.android.ugc.aweme.tools.C42344i;
import com.p280ss.android.ugc.aweme.tools.C42584t;
import com.p280ss.android.ugc.aweme.tools.C42586v;
import com.p280ss.android.ugc.gamora.jedi.C44403b;
import com.p280ss.android.ugc.gamora.p1486a.C36113b;
import com.p280ss.android.ugc.gamora.recorder.C44820v;
import com.p280ss.android.ugc.gamora.recorder.control.C44535a;
import com.p280ss.android.ugc.gamora.recorder.toolbar.RecordToolbarViewModel;
import com.p280ss.android.ugc.gamora.recorder.toolbar.RecordToolbarViewState;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.av */
public final class C38496av {

    /* renamed from: a */
    public C39336dd f100093a;

    /* renamed from: b */
    public C39954b f100094b = new C38498a();

    /* renamed from: c */
    public ASCameraView f100095c;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.av$a */
    class C38498a implements C39954b {

        /* renamed from: b */
        private C44535a f100097b;

        /* renamed from: a */
        public final boolean mo96469a(ScaleGestureDetector scaleGestureDetector) {
            return true;
        }

        /* renamed from: b */
        public final boolean mo96471b(float f) {
            return false;
        }

        /* renamed from: b */
        public final void mo96470b() {
            C38496av.this.f100093a.mo97896J().mo103594a((Object) this, (C42155av) C42344i.m134637a());
        }

        /* renamed from: c */
        private void m123052c() {
            if (this.f100097b == null) {
                this.f100097b = (C44535a) C38496av.this.f100093a.f102274D.mo30924a("RecordControlScene");
            }
        }

        /* renamed from: a */
        public final void mo96465a() {
            C42586v vVar;
            m123052c();
            VideoRecordNewActivity videoRecordNewActivity = (VideoRecordNewActivity) C38496av.this.f100093a.f33526d_;
            C44403b enableReverseCamera = ((RecordToolbarViewState) ((RecordToolbarViewModel) C36113b.m116288a(videoRecordNewActivity).mo91871a(RecordToolbarViewModel.class)).mo106825a(C38496av.this.f100093a)).getEnableReverseCamera();
            if (enableReverseCamera == null || ((Boolean) enableReverseCamera.f114666b).booleanValue()) {
                ((RecordToolbarViewModel) C36113b.m116288a(videoRecordNewActivity).mo91871a(RecordToolbarViewModel.class)).mo107188e(false);
                if (videoRecordNewActivity.f107327m.mo100089h() == 1) {
                    vVar = C42586v.m135306a();
                } else {
                    vVar = C42586v.m135307b();
                }
                vVar.f110739b = true;
                C38496av.this.f100093a.mo97896J().mo103594a((Object) C38496av.this.f100093a, (C42155av) vVar);
                return;
            }
            C41530am.m132280a("switchFrontRearCamera not allow");
        }

        private C38498a() {
        }

        /* renamed from: a */
        public final void mo96466a(float f) {
            m123052c();
            C38496av.this.f100093a.mo97896J().mo103594a((Object) C38496av.this.f100093a, (C42155av) C42584t.m135304a(f));
        }

        /* renamed from: b */
        public final boolean mo96472b(ScaleGestureDetector scaleGestureDetector) {
            if (!C38496av.this.f100095c.mo56255g()) {
                return false;
            }
            m123052c();
            if (this.f100097b.mo107013R() == 1) {
                return true;
            }
            C42344i a = C42344i.m134639a(scaleGestureDetector);
            C38496av.this.f100093a.mo97896J().mo103594a((Object) C38496av.this.f100093a, (C42155av) a);
            return a.f110146e;
        }

        /* renamed from: c */
        public final void mo96473c(float f) {
            m123052c();
            C42138ae aeVar = new C42138ae();
            aeVar.f109660b = ((C44820v) C38496av.this.f100093a.f102274D.mo30924a("RecordBottomTabScene")).mo30920G();
            aeVar.f109659a = this.f100097b.mo107012Q();
            aeVar.f109661c = this.f100097b.mo107013R();
            C38496av.this.f100093a.mo97896J().mo103594a((Object) this, (C42155av) aeVar);
            this.f100097b.mo107015e(0);
        }

        /* renamed from: a */
        public final void mo96468a(MotionEvent motionEvent) {
            if (C38496av.this.f100095c.mo56255g()) {
                m123052c();
                C38496av.this.f100093a.mo97896J().mo103594a((Object) C38496av.this.f100093a, (C42155av) C42344i.m134638a(motionEvent.getX(), motionEvent.getY()));
            }
        }

        /* renamed from: a */
        public final void mo96467a(float f, float f2) {
            m123052c();
            C38496av.this.f100093a.mo97896J().mo103594a((Object) C38496av.this.f100093a, (C42155av) C42584t.m135305a(f, f2));
        }
    }

    public C38496av(C39336dd ddVar, ASCameraView aSCameraView) {
        this.f100093a = ddVar;
        this.f100095c = aSCameraView;
    }
}

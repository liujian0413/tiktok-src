package com.p280ss.android.ugc.aweme.shortvideo;

import android.arch.lifecycle.C0069x;
import android.support.p022v4.app.FragmentActivity;
import com.p280ss.android.ugc.asve.recorder.view.ASCameraView;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVAB.Property;
import com.p280ss.android.ugc.aweme.shortvideo.p1550b.C38505a;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.TimeSpeedModelExtension;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.VideoRecordNewActivity;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1593ar.backgroundvideo.C40413c;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1593ar.backgroundvideo.C40414d;
import com.p280ss.android.ugc.aweme.status.RecordStatusViewModel;
import com.p280ss.android.ugc.aweme.tools.C42141ah;
import com.p280ss.android.ugc.aweme.tools.C42142ai;
import com.p280ss.android.ugc.aweme.tools.C42146am;
import com.p280ss.android.ugc.aweme.tools.C42153at;
import com.p280ss.android.ugc.aweme.tools.C42155av;
import com.p280ss.android.ugc.aweme.tools.C42156aw;
import com.p280ss.android.ugc.aweme.tools.C42159az;
import com.p280ss.android.ugc.aweme.tools.C42161ba;
import com.p280ss.android.ugc.aweme.tools.C42250d;
import com.p280ss.android.ugc.aweme.tools.C42583s;
import com.p280ss.android.ugc.gamora.p1486a.C36113b;
import com.p280ss.android.ugc.gamora.recorder.toolbar.RecordToolbarViewModel;
import java.lang.reflect.Type;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.aw */
public final class C38499aw implements C42161ba {

    /* renamed from: a */
    public VideoRecordNewActivity f100098a;

    /* renamed from: b */
    public RecordStatusViewModel f100099b;

    /* renamed from: c */
    public ASCameraView f100100c;

    /* renamed from: a */
    public final void mo96474a(ShortVideoContext shortVideoContext) {
        long j;
        if (C39360dw.m125725a().mo97931b() != null) {
            AVMusic b = C39360dw.m125725a().mo97931b();
            if (shortVideoContext.f99745af) {
                j = C41711y.f108574a;
            } else {
                j = C40413c.f105051b;
            }
            if (C35563c.f93231M.mo93305a(Property.EnableRemove15sCapMusic)) {
                if (b == null || (((long) b.shootDuration) <= j && Math.abs(b.shootDuration - b.duration) < 1000)) {
                    ((RecordToolbarViewModel) C36113b.m116288a(this.f100098a).mo91871a(RecordToolbarViewModel.class)).mo107187d(false);
                } else {
                    ((RecordToolbarViewModel) C36113b.m116288a(this.f100098a).mo91871a(RecordToolbarViewModel.class)).mo107187d(true);
                }
            } else if (b == null || ((long) b.duration) <= j) {
                ((RecordToolbarViewModel) C36113b.m116288a(this.f100098a).mo91871a(RecordToolbarViewModel.class)).mo107187d(false);
            } else {
                ((RecordToolbarViewModel) C36113b.m116288a(this.f100098a).mo91871a(RecordToolbarViewModel.class)).mo107187d(true);
            }
        }
    }

    /* renamed from: a */
    public final <T extends C42155av> C42159az<T> mo96095a(C42156aw awVar, Type type) {
        if (type != C42583s.class) {
            return null;
        }
        return new C42159az<T>() {
            /* renamed from: a */
            public final void mo96096a(Object obj, T t) {
                ShortVideoContext shortVideoContext = ((ShortVideoContextViewModel) C0069x.m159a((FragmentActivity) C38499aw.this.f100098a).mo147a(ShortVideoContextViewModel.class)).f99791a;
                ShortVideoSegments m = shortVideoContext.mo96152m();
                if (!m.isEmpty()) {
                    C40414d.m129222a(m, shortVideoContext.f99782r);
                    m.removeLast();
                    C38499aw.this.f100098a.f107266G = false;
                    C38499aw.this.f100100c.mo56293m();
                    C38499aw.this.f100098a.f107264E.mo103796c();
                    C38499aw.this.f100098a.f107286a.mo96138a((long) TimeSpeedModelExtension.calculateRealTime(m));
                    C42141ah a = C42141ah.m134103a(m, C38499aw.this.f100098a.f107286a.mo96150k());
                    C38499aw.this.f100098a.f107337w.mo103594a((Object) C38499aw.this.f100098a, (C42155av) a);
                    C38499aw.this.f100098a.f107337w.mo103594a((Object) C38499aw.this.f100098a, (C42155av) new C42142ai());
                    C38499aw.this.f100098a.f107337w.mo103594a((Object) C38499aw.this.f100098a, (C42155av) new C42146am(4));
                    a.mo103576a();
                    shortVideoContext.f99720Y.removeLastArray();
                    shortVideoContext.f99721Z.removeLastArray();
                    shortVideoContext.f99740aa.removeLast();
                    shortVideoContext.f99741ab.removeLast();
                    shortVideoContext.f99743ad.removeLast();
                    shortVideoContext.f99742ac.removeLast();
                    if (shortVideoContext.f99705J != null) {
                        shortVideoContext.f99705J.removeReactionWindowInfo();
                    }
                    shortVideoContext.mo96145f();
                    shortVideoContext.mo96147h();
                }
                if (m.isEmpty() && shortVideoContext.mo96144e()) {
                    C38505a.m123073a();
                    C38499aw.this.f100098a.f107337w.mo103594a((Object) C38499aw.this.f100098a, (C42155av) new C42146am(3));
                    C38499aw.this.f100098a.f107337w.mo103594a((Object) C38499aw.this.f100098a, (C42155av) new C42153at(shortVideoContext.f99745af, false));
                } else if (m.isEmpty() && !shortVideoContext.mo96142d() && !shortVideoContext.mo96144e()) {
                    ((RecordToolbarViewModel) C36113b.m116288a(C38499aw.this.f100098a).mo91871a(RecordToolbarViewModel.class)).mo107187d(!shortVideoContext.f99779o);
                    C38499aw.this.f100098a.f107337w.mo103594a((Object) C38499aw.this.f100098a, (C42155av) new C42153at(shortVideoContext.f99745af, false));
                    C38499aw.this.f100099b.mo102542m().setValue(Boolean.valueOf(false));
                }
                if (shortVideoContext.f99738aP.size() > 0) {
                    shortVideoContext.f99738aP.remove(shortVideoContext.f99738aP.size() - 1);
                }
                C38499aw.this.f100098a.f107338x.mo103594a((Object) C38499aw.this.f100098a, (C42155av) new C42250d());
                C38499aw.this.mo96474a(shortVideoContext);
            }
        };
    }

    public C38499aw(VideoRecordNewActivity videoRecordNewActivity, ASCameraView aSCameraView) {
        this.f100098a = videoRecordNewActivity;
        this.f100099b = (RecordStatusViewModel) C0069x.m159a((FragmentActivity) videoRecordNewActivity).mo147a(RecordStatusViewModel.class);
        this.f100100c = aSCameraView;
    }
}

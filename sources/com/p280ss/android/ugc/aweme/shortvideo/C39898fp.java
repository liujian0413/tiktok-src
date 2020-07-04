package com.p280ss.android.ugc.aweme.shortvideo;

import android.arch.lifecycle.C0069x;
import android.support.p022v4.app.FragmentActivity;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ttve.editorInfo.C20455a;
import com.p280ss.android.ugc.asve.recorder.view.ASCameraView;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.base.C6893q;
import com.p280ss.android.ugc.aweme.filter.C29296g;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVAB.Property;
import com.p280ss.android.ugc.aweme.property.C36964i;
import com.p280ss.android.ugc.aweme.shortvideo.p1550b.C38505a;
import com.p280ss.android.ugc.aweme.shortvideo.p1558e.C39377i;
import com.p280ss.android.ugc.aweme.shortvideo.p1586p.C40207a;
import com.p280ss.android.ugc.aweme.shortvideo.p1586p.C40208b;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.TimeSpeedModelExtension;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.VideoRecordNewActivity;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.C40496bh;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.viewmodel.CurUseStickerViewModel;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41530am;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41536ap;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41545b;
import com.p280ss.android.ugc.aweme.sticker.model.BackgroundVideo;
import com.p280ss.android.ugc.aweme.tools.C42141ah;
import com.p280ss.android.ugc.aweme.tools.C42151ar;
import com.p280ss.android.ugc.aweme.tools.C42155av;
import com.p280ss.android.ugc.aweme.tools.C42156aw;
import com.p280ss.android.ugc.aweme.tools.C42159az;
import com.p280ss.android.ugc.aweme.tools.C42161ba;
import com.p280ss.android.ugc.aweme.tools.C42583s;
import com.p280ss.android.ugc.aweme.util.C42880h;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import com.p280ss.android.ugc.gamora.p1486a.C36113b;
import com.p280ss.android.ugc.gamora.recorder.progress.RecordModeViewModel;
import java.io.File;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import kotlin.C7581n;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.fp */
public final class C39898fp implements C42161ba {

    /* renamed from: a */
    public final VideoRecordNewActivity f103658a;

    /* renamed from: b */
    public final ASCameraView f103659b;

    /* renamed from: a */
    public final Effect mo99311a() {
        if (this.f103658a != null) {
            return (Effect) ((CurUseStickerViewModel) C0069x.m159a((FragmentActivity) this.f103658a).mo147a(CurUseStickerViewModel.class)).mo101274a().getValue();
        }
        return null;
    }

    /* renamed from: b */
    public final BackgroundVideo mo99312b() {
        if (this.f103658a != null) {
            return ((ShortVideoContextViewModel) C0069x.m159a((FragmentActivity) this.f103658a).mo147a(ShortVideoContextViewModel.class)).f99791a.f99782r;
        }
        return null;
    }

    public C39898fp(VideoRecordNewActivity videoRecordNewActivity, ASCameraView aSCameraView) {
        this.f103658a = videoRecordNewActivity;
        this.f103659b = aSCameraView;
    }

    /* renamed from: a */
    public final <T extends C42155av> C42159az<T> mo96095a(C42156aw awVar, Type type) {
        if (type != C42151ar.class) {
            return null;
        }
        return new C42159az<T>() {

            /* renamed from: b */
            private RecordModeViewModel f103661b;

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final /* synthetic */ C7581n mo99313a(ShortVideoContext shortVideoContext, Integer num) {
                C41530am.m132285d("MultiEditlog: stopRecordAsync ret = ret");
                C41545b.m132307a().mo102190c("av_video_stop_record");
                if (num.intValue() <= 0) {
                    m127657a("stop_record", (long) num.intValue(), shortVideoContext);
                }
                return C7581n.f20898a;
            }

            /* renamed from: a */
            public final void mo96096a(Object obj, T t) {
                List list;
                List list2;
                ShortVideoContextViewModel shortVideoContextViewModel = (ShortVideoContextViewModel) C0069x.m159a((FragmentActivity) C39898fp.this.f103658a).mo147a(ShortVideoContextViewModel.class);
                if (!shortVideoContextViewModel.mo96173e()) {
                    ShortVideoContext shortVideoContext = shortVideoContextViewModel.f99791a;
                    if (shortVideoContext.mo96144e() && C39898fp.this.f103658a.f107328n != null) {
                        C39898fp.this.f103658a.f107328n.mo100115e();
                    }
                    C42880h.m136156a("set hasStopped to true");
                    shortVideoContextViewModel.mo96170d(true);
                    C39898fp.this.f103658a.f107264E.mo103794a(false);
                    C41545b.m132307a().mo102188a("av_video_stop_record");
                    C39898fp.this.f103659b.mo56248d((C7562b<? super Integer, C7581n>) new C39900fq<Object,C7581n>(this, shortVideoContext));
                    C42880h.m136156a("stopRecord() called");
                    shortVideoContextViewModel.mo96164a(0);
                    if (shortVideoContext.f99779o) {
                        if (this.f103661b == null) {
                            this.f103661b = (RecordModeViewModel) C36113b.m116288a(C39898fp.this.f103658a).mo91871a(RecordModeViewModel.class);
                        }
                        this.f103661b.mo107123a(0);
                    }
                    long endFrameTimeUS = C39898fp.this.f103659b.getEndFrameTimeUS() / 1000;
                    if (endFrameTimeUS >= 0) {
                        ShortVideoSegments m = shortVideoContext.mo96152m();
                        if (C40496bh.m129461g(C39898fp.this.mo99311a())) {
                            list = C39898fp.this.f103658a.f107291ab;
                        } else {
                            list = null;
                        }
                        if (C40496bh.m129463h(C39898fp.this.mo99311a())) {
                            list2 = C39898fp.this.f103658a.f107291ab;
                        } else {
                            list2 = null;
                        }
                        shortVideoContext.mo96138a(shortVideoContext.mo96150k() + m.end(endFrameTimeUS, null, list, list2, C39898fp.this.mo99312b()));
                    } else {
                        m127657a("end_duration", endFrameTimeUS, shortVideoContext);
                    }
                    C29296g g = ((C39377i) C39898fp.this.f103658a.f107326l.mo74909j()).mo74906g();
                    if (g.f77268c != null) {
                        shortVideoContext.f99720Y.addIndex();
                    }
                    if (String.valueOf(g.f77266a) != null) {
                        shortVideoContext.f99721Z.addIndex();
                    }
                    if (((C42151ar) t).f109678a == 1) {
                        C39898fp.this.f103658a.f107338x.mo103594a((Object) C39898fp.this.f103658a, (C42155av) new C42583s());
                        C36964i.m118919a(shortVideoContext.mo96152m().isEmpty());
                        shortVideoContext.f99783s = C36964i.m118920a() ? 1 : 0;
                    } else {
                        if (endFrameTimeUS <= 10 && endFrameTimeUS >= 0) {
                            C39898fp.this.f103658a.f107338x.mo103594a((Object) C39898fp.this.f103658a, (C42155av) new C42583s());
                        }
                        C42141ah a = C42141ah.m134103a(shortVideoContext.mo96152m(), shortVideoContext.mo96150k());
                        C39898fp.this.f103658a.f107337w.mo103594a((Object) C39898fp.this.f103658a, (C42155av) a);
                        a.mo103576a();
                        if (true ^ C6399b.m19946v()) {
                            shortVideoContext.f99740aa.add(Integer.toString(C39898fp.this.f103658a.f107269J.mo96490a()));
                            shortVideoContext.f99743ad.add(Integer.toString(0));
                            shortVideoContext.f99742ac.add(Integer.toString(C39898fp.this.f103658a.f107269J.mo96504c()));
                            shortVideoContext.f99741ab.add(Integer.toString(C39898fp.this.f103658a.f107269J.mo96499b()));
                        } else {
                            shortVideoContext.f99740aa.add(Integer.toString((int) (C36964i.m118916a(C39898fp.this.f103658a.f107269J.mo96490a()) * 100.0f)));
                            int b = (int) (C36964i.m118924b(C39898fp.this.f103658a.f107269J.mo96499b()) * 100.0f);
                            shortVideoContext.f99741ab.add(Integer.toString(b));
                            shortVideoContext.f99742ac.add(Integer.toString(b));
                            shortVideoContext.f99743ad.add(Integer.toString(0));
                        }
                        C38505a.m123075a(shortVideoContext.f99767c);
                        C38505a.m123088b(shortVideoContext.f99700E, shortVideoContext.f99701F);
                        C38505a.m123078a(shortVideoContext.f99705J);
                        C38505a.m123089c(shortVideoContext.f99784t ? 1 : 0);
                        C38505a.m123086b(shortVideoContext.f99783s);
                        C38505a.m123080a(shortVideoContext.f99769e, C39360dw.m125725a().mo97931b(), shortVideoContext.f99770f);
                        C38505a.m123082a((ArrayList<TimeSpeedModelExtension>) shortVideoContext.f99776l);
                        C38505a.m123077a(C39898fp.this.f103658a.f107264E.mo103798e());
                        C38505a.m123081a(shortVideoContext.f99720Y.toString(), shortVideoContext.f99721Z.toString());
                        if (C35563c.f93231M.mo93305a(Property.EnableUploadMetadata)) {
                            shortVideoContext.f99786v = C20455a.m67874b();
                            C38505a.m123083a(shortVideoContext.f99786v);
                        }
                    }
                    if (C40207a.m128516a(C39898fp.this.f103659b)) {
                        new C40208b(C39898fp.this.f103658a).mo100003b(null);
                    }
                }
            }

            /* renamed from: a */
            private static void m127657a(String str, long j, ShortVideoContext shortVideoContext) {
                C6869c a = C6869c.m21381a();
                a.mo16887a("error_type", str);
                a.mo16886a("error_duration", Long.valueOf(j));
                a.mo16885a("segment_count", Integer.valueOf(shortVideoContext.f99776l.size()));
                File g = shortVideoContext.f99775k.mo96319g();
                if (g.isDirectory()) {
                    a.mo16887a("file_path", C41536ap.m132295a(g.list(), ","));
                }
                C6893q.m21447a("aweme_draft_edit_error", a.mo16888b());
            }
        };
    }
}

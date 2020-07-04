package com.p280ss.android.ugc.aweme.shortvideo;

import android.arch.lifecycle.C0069x;
import android.arch.lifecycle.LiveData;
import android.content.Context;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import android.text.TextUtils;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.p280ss.android.ttve.nativePort.TEVideoRecorder;
import com.p280ss.android.ugc.asve.recorder.view.ASCameraView;
import com.p280ss.android.ugc.aweme.filter.C29296g;
import com.p280ss.android.ugc.aweme.property.C36964i;
import com.p280ss.android.ugc.aweme.shortvideo.p1558e.C39377i;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.VideoRecordNewActivity;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.VideoRecordNewActivity.C41211b;
import com.p280ss.android.ugc.aweme.shortvideo.record.C40312g;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41530am;
import com.p280ss.android.ugc.aweme.tools.C42149ap;
import com.p280ss.android.ugc.aweme.tools.C42151ar;
import com.p280ss.android.ugc.aweme.tools.C42155av;
import com.p280ss.android.ugc.aweme.tools.C42156aw;
import com.p280ss.android.ugc.aweme.tools.C42159az;
import com.p280ss.android.ugc.aweme.tools.C42161ba;
import com.p280ss.android.ugc.aweme.tools.C42589y;
import com.p280ss.android.ugc.aweme.util.C42880h;
import com.p280ss.android.ugc.aweme.utils.C43072du;
import com.p280ss.android.ugc.gamora.p1486a.C36113b;
import com.p280ss.android.ugc.gamora.recorder.progress.RecordModeViewModel;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.lang.reflect.Type;
import kotlin.C7581n;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.fh */
public final class C39887fh implements C42161ba {

    /* renamed from: a */
    public final VideoRecordNewActivity f103635a;

    /* renamed from: b */
    public final ASCameraView f103636b;

    public C39887fh(VideoRecordNewActivity videoRecordNewActivity, ASCameraView aSCameraView) {
        this.f103635a = videoRecordNewActivity;
        this.f103636b = aSCameraView;
    }

    /* renamed from: a */
    public final <T extends C42155av> C42159az<T> mo96095a(C42156aw awVar, Type type) {
        if (type != C42149ap.class) {
            return null;
        }
        return new C42159az<T>() {

            /* renamed from: b */
            private RecordModeViewModel f103638b;

            /* renamed from: a */
            private void m127639a(int i) {
                StringBuilder sb = new StringBuilder("start Record ret :");
                sb.append(i);
                C41530am.m132283b(sb.toString());
                StringBuilder sb2 = new StringBuilder("start failed , ve result = ");
                sb2.append(i);
                C43072du.m136632a("record_error", "2", sb2.toString());
                C10761a.m31399c((Context) C39887fh.this.f103635a, (int) R.string.dgw).mo25750a();
                C39887fh.this.f103635a.mo97896J().mo103594a((Object) this, (C42155av) new C42151ar());
            }

            /* renamed from: a */
            private void m127640a(ShortVideoContext shortVideoContext, C42149ap apVar) {
                Bundle bundle = new Bundle();
                String c = C39887fh.this.f103635a.f107324j.mo100305c();
                if (!TextUtils.isEmpty(c)) {
                    bundle.putString("faceId", c);
                }
                bundle.putInt("cameraId", C39887fh.this.f103635a.f107327m.mo100087f());
                shortVideoContext.mo96152m().begin(apVar.f109674a, C39887fh.this.f103635a.f107324j.mo100301b(), C39887fh.this.f103635a.f107324j.mo100309d(), bundle);
                StringBuilder sb = new StringBuilder("set hasStopped to false, cur Speed: ");
                sb.append(apVar.f109674a);
                C42880h.m136156a(sb.toString());
                if (shortVideoContext.f99779o) {
                    if (this.f103638b == null) {
                        this.f103638b = (RecordModeViewModel) C36113b.m116288a(C39887fh.this.f103635a).mo91871a(RecordModeViewModel.class);
                    }
                    this.f103638b.mo107123a(1);
                }
                VideoRecordNewActivity videoRecordNewActivity = C39887fh.this.f103635a;
                videoRecordNewActivity.getClass();
                new C41211b().run();
                LiveData b = C39887fh.this.f103635a.f107326l.mo74898b();
                C29296g g = ((C39377i) C39887fh.this.f103635a.f107326l.mo74909j()).mo74906g();
                String str = g.f77268c;
                if (str != null) {
                    shortVideoContext.f99720Y.add(str);
                }
                String valueOf = String.valueOf(g.f77266a);
                if (b.getValue() == null || !((Boolean) b.getValue()).booleanValue()) {
                    shortVideoContext.f99721Z.add(valueOf);
                } else {
                    shortVideoContext.f99721Z.add(TEVideoRecorder.FACE_BEAUTY_NULL);
                }
                C39887fh.this.f103635a.mo101864t();
                shortVideoContext.mo96137a(apVar.f109675b);
            }

            /* renamed from: a */
            public final void mo96096a(Object obj, T t) {
                if (C39887fh.this.f103635a.f107286a.mo96150k() >= C39887fh.this.f103635a.f107286a.mo96155p()) {
                    C39887fh.this.f103635a.f107337w.mo103594a((Object) C39887fh.this.f103635a, (C42155av) new C42589y("record_full"));
                } else if (!C39887fh.this.f103636b.mo56295o()) {
                    ShortVideoContext shortVideoContext = ((ShortVideoContextViewModel) C0069x.m159a((FragmentActivity) C39887fh.this.f103635a).mo147a(ShortVideoContextViewModel.class)).f99791a;
                    if (!shortVideoContext.f99775k.mo96319g().exists()) {
                        shortVideoContext.f99775k.mo96319g().mkdirs();
                    }
                    C39887fh.this.f103635a.f107264E.mo103792a(C39889fi.f103639a);
                    if (shortVideoContext.mo96144e() && C39887fh.this.f103635a.f107328n != null) {
                        C39887fh.this.f103635a.f107328n.mo100114d();
                    }
                    C42149ap apVar = (C42149ap) t;
                    C39887fh.this.f103636b.mo56226a(shortVideoContext.mo96149j(), C39887fh.this.f103635a.f107286a.mo96151l(), shortVideoContext.mo96150k());
                    C39887fh.this.f103636b.setVideoQuality(C36964i.m118931g());
                    boolean z = false;
                    ((ShortVideoContextViewModel) C0069x.m159a((FragmentActivity) C39887fh.this.f103635a).mo147a(ShortVideoContextViewModel.class)).mo96170d(false);
                    ASCameraView aSCameraView = C39887fh.this.f103636b;
                    if (shortVideoContext.f99783s == 1) {
                        z = true;
                    }
                    C40312g.m128762a(aSCameraView, z, apVar.f109674a, new C39890fj(this, shortVideoContext, apVar));
                }
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final /* synthetic */ C7581n mo99306a(ShortVideoContext shortVideoContext, C42149ap apVar, Integer num) {
                C39887fh.this.f103635a.runOnUiThread(new C39891fk(this, num, shortVideoContext, apVar));
                return C7581n.f20898a;
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final /* synthetic */ void mo99307a(Integer num, ShortVideoContext shortVideoContext, C42149ap apVar) {
                if (num.intValue() != 0) {
                    m127639a(num.intValue());
                } else if (!((ShortVideoContextViewModel) C0069x.m159a((FragmentActivity) C39887fh.this.f103635a).mo147a(ShortVideoContextViewModel.class)).mo96173e()) {
                    m127640a(shortVideoContext, apVar);
                }
            }
        };
    }
}

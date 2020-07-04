package com.p280ss.android.ugc.aweme.shortvideo.record;

import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.C0069x;
import android.arch.lifecycle.Lifecycle.Event;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.support.p022v4.app.FragmentActivity;
import android.util.SparseIntArray;
import android.view.ScaleGestureDetector;
import android.view.View;
import com.C1642a;
import com.bytedance.common.utility.C6311g;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.uikit.base.AbsActivity;
import com.google.common.base.C17454q;
import com.p280ss.android.medialib.camera.C19662d;
import com.p280ss.android.medialib.presenter.C19761a;
import com.p280ss.android.ugc.asve.recorder.camera.C20713c;
import com.p280ss.android.ugc.asve.recorder.camera.p923a.C20705b;
import com.p280ss.android.ugc.asve.recorder.camera.p925c.C20719d;
import com.p280ss.android.ugc.asve.recorder.view.ASCameraView;
import com.p280ss.android.ugc.aweme.base.C6893q;
import com.p280ss.android.ugc.aweme.base.p1059d.p1060a.C23321d;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVAB.Property;
import com.p280ss.android.ugc.aweme.property.AVSettings;
import com.p280ss.android.ugc.aweme.shortvideo.C38510bb;
import com.p280ss.android.ugc.aweme.shortvideo.C38511bc;
import com.p280ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p280ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.p280ss.android.ugc.aweme.shortvideo.p1551c.C38557d;
import com.p280ss.android.ugc.aweme.shortvideo.p1551c.C38558e;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41530am;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41545b;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41558k;
import com.p280ss.android.ugc.aweme.utils.C42962b;
import com.p280ss.android.ugc.gamora.p1486a.C36113b;
import com.p280ss.android.ugc.gamora.recorder.toolbar.RecordToolbarViewModel;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import dmt.p1861av.video.p1863b.C47450e;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.record.CameraModule */
public class CameraModule implements C0042h, C20713c {

    /* renamed from: i */
    public static SparseIntArray f104638i;

    /* renamed from: a */
    public final AbsActivity f104639a;

    /* renamed from: b */
    public final C40288a f104640b;

    /* renamed from: c */
    public final C23321d<JSONObject> f104641c;

    /* renamed from: d */
    public C38557d f104642d = new C38558e();

    /* renamed from: e */
    public boolean f104643e = false;

    /* renamed from: f */
    public C20705b f104644f;

    /* renamed from: g */
    public ASCameraView f104645g;

    /* renamed from: h */
    public int f104646h;

    /* renamed from: j */
    private boolean f104647j = false;

    /* renamed from: k */
    private boolean f104648k = false;

    /* renamed from: l */
    private boolean f104649l = false;

    /* renamed from: m */
    private C19761a f104650m = new C19761a() {
        /* renamed from: b */
        public final void mo52872b(int i, int i2) {
            CameraModule.this.f104640b.mo100100a(i, i2);
        }
    };

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.record.CameraModule$a */
    public interface C40288a {
        /* renamed from: a */
        void mo100099a(int i);

        /* renamed from: a */
        void mo100100a(int i, int i2);

        /* renamed from: a */
        void mo100101a(int i, int i2, String str);

        /* renamed from: b */
        void mo100102b(int i);
    }

    /* renamed from: a */
    public final boolean mo100080a(boolean z) {
        return this.f104645g.mo56241b(z);
    }

    /* renamed from: a */
    public final boolean mo100079a(View view, float f, float f2) {
        return this.f104645g.mo56231a(view.getWidth(), view.getHeight(), this.f104639a.getResources().getDisplayMetrics().density, new float[]{f, f2});
    }

    /* renamed from: a */
    public final void mo100074a() {
        m128674a((Handler) null);
    }

    /* renamed from: c */
    public final boolean mo100084c() {
        return this.f104645g.mo56291k();
    }

    /* renamed from: g */
    public final void mo100088g() {
        this.f104645g.mo56290j();
    }

    /* renamed from: j */
    public final int mo100091j() {
        return this.f104645g.getCameraPreviewWidth();
    }

    /* renamed from: k */
    public final int mo100092k() {
        return this.f104645g.getCameraPreviewHeight();
    }

    /* renamed from: l */
    public final void mo100093l() {
        m128676b((Handler) null);
    }

    /* renamed from: m */
    public final void mo100094m() {
        this.f104645g.mo56242c();
    }

    /* renamed from: n */
    public final int mo100095n() {
        return this.f104645g.getFlashMode();
    }

    /* renamed from: o */
    public final int mo100096o() {
        return this.f104645g.getNextFlashMode();
    }

    @C0054q(mo125a = Event.ON_STOP)
    public void onStop() {
        mo100082b(0);
    }

    /* renamed from: b */
    public final C20719d mo100081b() {
        return this.f104645g.getCameraController().mo55962i();
    }

    /* renamed from: d */
    public final boolean mo100085d() {
        if (mo100087f() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final void mo100086e() {
        this.f104645g.mo56244c(0.0f);
        mo100075a(0.0f);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: p */
    public final /* synthetic */ void mo100098p() {
        C41545b.m132307a().mo102190c("av_video_record_change_camera");
        this.f104645g.setOnFirstFrameRefreshListener(null);
    }

    /* renamed from: r */
    private boolean m128678r() {
        if (this.f104645g.mo56253f()) {
            return false;
        }
        if (!this.f104647j) {
            C10761a.m31392b((Context) this.f104639a, (int) R.string.fsh, 1).mo25750a();
            this.f104647j = true;
        }
        return true;
    }

    /* renamed from: h */
    public final int mo100089h() {
        C41545b.m132307a().mo102188a("av_video_record_change_camera");
        this.f104642d.mo96549b(this.f104642d.mo96547a() ^ 1);
        return mo100090i();
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(4);
        f104638i = sparseIntArray;
        sparseIntArray.put(0, R.drawable.aq6);
        f104638i.put(1, R.drawable.aq7);
        f104638i.put(2, R.drawable.aq7);
        f104638i.put(3, R.drawable.aq5);
    }

    /* renamed from: f */
    public final int mo100087f() {
        Intent intent = this.f104639a.getIntent();
        if (intent == null || !intent.hasExtra("extra_camera_facing")) {
            return this.f104642d.mo96547a();
        }
        int a = this.f104642d.mo96548a(intent.getIntExtra("extra_camera_facing", 1));
        intent.removeExtra("extra_camera_facing");
        this.f104642d.mo96549b(a);
        return a;
    }

    /* renamed from: i */
    public final int mo100090i() {
        boolean z;
        int i;
        if (mo100087f() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = this.f104645g.getBackCameraPos();
        } else {
            i = this.f104645g.getFrontCameraPos();
        }
        this.f104644f.mo55996b(!z);
        m128675a(z, i);
        return i;
    }

    /* renamed from: q */
    private void m128677q() {
        switch (this.f104646h) {
            case 0:
                if (!this.f104645g.mo56251e() && !this.f104649l) {
                    this.f104649l = true;
                    C10761a.m31392b((Context) this.f104639a, (int) R.string.vx, 1).mo25750a();
                    return;
                }
            case 1:
                if (!this.f104645g.mo56251e() && !this.f104648k) {
                    this.f104648k = true;
                    C10761a.m31392b((Context) this.f104639a, (int) R.string.vx, 1).mo25750a();
                    break;
                }
        }
    }

    /* renamed from: b */
    public final void mo100082b(int i) {
        this.f104645g.mo56211a(i);
    }

    /* renamed from: a */
    public final void mo100075a(float f) {
        this.f104647j = false;
        this.f104643e = false;
        this.f104645g.mo56246d();
    }

    /* renamed from: b */
    public final synchronized void mo100083b(boolean z) {
        this.f104645g.mo56228a(z);
    }

    /* renamed from: a */
    private void m128674a(Handler handler) {
        final boolean z;
        int i;
        this.f104645g.mo56234b();
        this.f104645g.setCameraPreviewSizeInterface(this.f104650m);
        this.f104645g.mo56222a((C20713c) this);
        if (mo100087f() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = this.f104645g.getBackCameraPos();
        } else {
            i = this.f104645g.getFrontCameraPos();
        }
        this.f104644f.mo55993a(z);
        C41530am.m132280a("CameraModule => open camera");
        this.f104645g.mo56214a(i, (C19662d) new C19662d() {
            /* renamed from: a */
            public final void mo52271a(int i) {
                C41530am.m132280a("CameraModule => onOpenSuccess");
                C41545b.m132307a().mo102189b("av_video_record_init");
                C35563c.f93258u.mo83198b(!z);
                CameraModule.this.f104640b.mo100099a(CameraModule.this.mo100087f());
                C41558k.m132343a(i);
                C6893q.m21444a("aweme_open_camera_error_rate", 0, new C38510bb().mo96477a("useVERecoder", Boolean.valueOf(C47450e.m148163a())).mo96482b());
                CameraModule.this.f104646h = i;
                CameraModule.this.f104645g.mo56245c(C35563c.f93231M.mo93305a(Property.EnableSoftEncodeAcc));
            }

            /* renamed from: a */
            public final void mo52272a(int i, int i2, String str) {
                CameraModule.this.f104640b.mo100101a(i, i2, str);
                C6893q.m21444a("aweme_open_camera_error_rate", i2, new C38510bb().mo96477a("useVERecoder", Boolean.valueOf(C47450e.m148163a())).mo96481a("errorDesc", str).mo96482b());
            }
        });
    }

    /* renamed from: b */
    private void m128676b(Handler handler) {
        C41530am.m132285d("camera release");
        if (this.f104645g.mo56255g()) {
            mo100082b(0);
            this.f104645g.mo56242c();
        }
        this.f104645g.setCameraPreviewSizeInterface(null);
        this.f104645g.mo56238b((C20713c) this);
    }

    /* renamed from: a */
    public final synchronized void mo100077a(int i) {
        this.f104645g.setBodyBeautyLevel(100);
    }

    /* renamed from: a */
    public final boolean mo100078a(ScaleGestureDetector scaleGestureDetector) {
        C6893q.m21447a("zoom_info_log", new C38510bb().mo96477a("isDragEnable", Boolean.valueOf(this.f104643e)).mo96478a("mMaxZoom", Float.valueOf(this.f104645g.getMaxCameraZoom())).mo96477a("mCameraZoomList", Boolean.valueOf(C6311g.m19574b(this.f104645g.getCameraZoomList()))).mo96482b());
        if (this.f104643e) {
            return true;
        }
        m128677q();
        if (m128678r()) {
            return true;
        }
        this.f104645g.mo56230a(scaleGestureDetector.getCurrentSpan() - scaleGestureDetector.getPreviousSpan());
        return true;
    }

    /* renamed from: a */
    private void m128675a(final boolean z, int i) {
        try {
            final C17454q b = C17454q.m58004b();
            this.f104645g.mo56235b(i, (C19662d) new C19662d() {
                /* renamed from: a */
                public final void mo52271a(int i) {
                    String str;
                    ShortVideoContext shortVideoContext = ((ShortVideoContextViewModel) C0069x.m159a((FragmentActivity) CameraModule.this.f104639a).mo147a(ShortVideoContextViewModel.class)).f99791a;
                    if (shortVideoContext != null && b.f48412a) {
                        b.mo44943d();
                        String a = C1642a.m8035a(Locale.US, "%d", new Object[]{Long.valueOf(b.mo44941a(TimeUnit.MILLISECONDS))});
                        C42962b bVar = C42962b.f111525a;
                        String str2 = "flip_camera";
                        C38511bc a2 = C38511bc.m123103a().mo96485a("creation_id", shortVideoContext.f99787w).mo96485a("shoot_way", shortVideoContext.f99788x).mo96483a("draft_id", shortVideoContext.f99790z);
                        String str3 = "to_status";
                        if (CameraModule.this.mo100087f() == 0) {
                            str = "front";
                        } else {
                            str = "back";
                        }
                        bVar.mo104671a(str2, a2.mo96485a(str3, str).mo96485a("enter_from", "video_shoot_page").mo96485a("camera_type", C41558k.m132345b(i)).mo96485a("duration", a).f100112a);
                    }
                    CameraModule.this.f104642d.mo96549b(CameraModule.this.mo100087f());
                    C35563c.f93258u.mo83198b(!z);
                    if (CameraModule.this.mo100087f() == 0) {
                        C42962b.f111525a.onEvent(MobClick.obtain().setEventName("rear_to_back").setLabelName("shoot_page").setJsonObject((JSONObject) CameraModule.this.f104641c.mo60607a()));
                    } else {
                        C42962b.f111525a.onEvent(MobClick.obtain().setEventName("rear_to_front").setLabelName("shoot_page").setJsonObject((JSONObject) CameraModule.this.f104641c.mo60607a()));
                    }
                    CameraModule.this.f104645g.setPreviewSizeRatio((((float) CameraModule.this.f104645g.getCameraPreviewWidth()) * 1.0f) / ((float) CameraModule.this.f104645g.getCameraPreviewHeight()));
                    CameraModule.this.f104640b.mo100102b(CameraModule.this.mo100087f());
                    C6893q.m21444a("aweme_open_camera_error_rate", 0, new C38510bb().mo96477a("useVERecoder", Boolean.valueOf(C47450e.m148163a())).mo96482b());
                    CameraModule.this.f104646h = i;
                    C41545b.m132307a().mo102189b("av_video_record_change_camera");
                    ((RecordToolbarViewModel) C36113b.m116288a(CameraModule.this.f104639a).mo91871a(RecordToolbarViewModel.class)).mo107188e(true);
                }

                /* renamed from: a */
                public final void mo52272a(int i, int i2, String str) {
                    b.mo44944e();
                    ((RecordToolbarViewModel) C36113b.m116288a(CameraModule.this.f104639a).mo91871a(RecordToolbarViewModel.class)).mo107188e(true);
                    C6893q.m21444a("aweme_open_camera_error_rate", i2, new C38510bb().mo96477a("useVERecoder", Boolean.valueOf(C47450e.m148163a())).mo96481a("errorDesc", str).mo96482b());
                }
            });
        } catch (Exception unused) {
        }
        this.f104645g.setOnFirstFrameRefreshListener(new C40307d(this));
    }

    /* renamed from: a */
    public final void mo100076a(float f, float f2) {
        this.f104643e = true;
        m128677q();
        if (!m128678r()) {
            this.f104645g.mo56240b(f);
        }
    }

    /* renamed from: a */
    public final void mo56008a(int i, float f, boolean z) {
        StringBuilder sb = new StringBuilder(" size = ");
        sb.append(f);
        C6893q.m21447a("zoom_info_log", new C38510bb().mo96481a("camera_zoom_size", sb.toString()).mo96482b());
    }

    public CameraModule(AbsActivity absActivity, C40288a aVar, C23321d<JSONObject> dVar, ASCameraView aSCameraView) {
        this.f104639a = absActivity;
        this.f104645g = aSCameraView;
        this.f104640b = aVar;
        this.f104641c = dVar;
        this.f104644f = new C20705b(absActivity, aSCameraView.getCameraController(), C35563c.f93230L.mo93343b(AVSettings.Property.ShakeFreeWhiteList));
    }

    /* renamed from: a */
    public final void mo56009a(int i, boolean z, boolean z2, float f, List<Integer> list) {
        String str;
        String str2 = "zoom_info_log";
        C38510bb a = new C38510bb().mo96479a("cameraType", Integer.valueOf(i)).mo96477a("supportZoom", Boolean.valueOf(z)).mo96477a("supportSmooth", Boolean.valueOf(z2)).mo96478a("maxZoom", Float.valueOf(f));
        String str3 = "ratios";
        if (C6311g.m19574b(list)) {
            StringBuilder sb = new StringBuilder();
            sb.append(list.get(0));
            str = sb.toString();
        } else {
            str = " ";
        }
        C6893q.m21447a(str2, a.mo96481a(str3, str).mo96482b());
    }
}

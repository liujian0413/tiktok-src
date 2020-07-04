package com.p280ss.android.ugc.aweme.shortvideo.p1548ar;

import android.arch.lifecycle.C0043i;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import android.os.Build.VERSION;
import com.p280ss.android.ugc.asve.recorder.camera.C20707b;
import com.p280ss.android.ugc.asve.recorder.p922b.C20676a;
import com.p280ss.android.ugc.aweme.location.model.AVLocationBundle;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.port.p1479in.C35603z;
import com.p280ss.android.ugc.aweme.port.p1479in.C35603z.C35604a;
import com.p280ss.android.ugc.aweme.port.p1479in.C35603z.C35606c;
import com.p280ss.android.ugc.aweme.shortvideo.senor.BaseSenorPresenter;
import com.p280ss.android.ugc.aweme.shortvideo.senor.C40328a;
import com.p280ss.android.vesdk.C45253ad;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ar.LandmarkARPresenter */
public final class LandmarkARPresenter extends BaseSenorPresenter {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f99982a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(LandmarkARPresenter.class), "holder", "getHolder()Lcom/ss/android/vesdk/VESensorInfoHolder;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(LandmarkARPresenter.class), "locationService", "getLocationService()Lcom/ss/android/ugc/aweme/port/in/ILocationService;"))};

    /* renamed from: c */
    private C38459a f99983c;

    /* renamed from: d */
    private boolean f99984d;

    /* renamed from: e */
    private final C7541d f99985e = C7546e.m23569a(C38460b.f99992a);

    /* renamed from: f */
    private final C7541d f99986f = C7546e.m23569a(C38461c.f99993a);

    /* renamed from: g */
    private final C20676a f99987g;

    /* renamed from: h */
    private final C20707b f99988h;

    /* renamed from: i */
    private final boolean f99989i;

    /* renamed from: j */
    private final boolean f99990j;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ar.LandmarkARPresenter$a */
    static final class C38459a extends C40328a {

        /* renamed from: b */
        private final C45253ad f99991b;

        public final void onAccuracyChanged(Sensor sensor, int i) {
        }

        public final void onSensorChanged(SensorEvent sensorEvent) {
            C7573i.m23587b(sensorEvent, "event");
            double a = m128808a(sensorEvent);
            if (this.f104736a) {
                this.f99991b.mo108197a(sensorEvent.values, a);
            }
        }

        public C38459a(C20676a aVar, boolean z, C45253ad adVar) {
            C7573i.m23587b(aVar, "mediaController");
            C7573i.m23587b(adVar, "holder");
            super(z);
            this.f99991b = adVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ar.LandmarkARPresenter$b */
    static final class C38460b extends Lambda implements C7561a<C45253ad> {

        /* renamed from: a */
        public static final C38460b f99992a = new C38460b();

        C38460b() {
            super(0);
        }

        /* renamed from: a */
        private static C45253ad m122949a() {
            return C45253ad.m142779a();
        }

        public final /* synthetic */ Object invoke() {
            return m122949a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ar.LandmarkARPresenter$c */
    static final class C38461c extends Lambda implements C7561a<C35603z> {

        /* renamed from: a */
        public static final C38461c f99993a = new C38461c();

        C38461c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return m122950a();
        }

        /* renamed from: a */
        private static C35603z m122950a() {
            return C35574k.m114859a().mo70107v();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ar.LandmarkARPresenter$d */
    static final class C38462d extends Lambda implements C7562b<float[], C7581n> {

        /* renamed from: a */
        final /* synthetic */ LandmarkARPresenter f99994a;

        C38462d(LandmarkARPresenter landmarkARPresenter) {
            this.f99994a = landmarkARPresenter;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m122951a((float[]) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m122951a(float[] fArr) {
            C7573i.m23587b(fArr, "fovAngle");
            this.f99994a.mo96374a().f116434h = fArr;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ar.LandmarkARPresenter$e */
    static final class C38463e implements C35606c {

        /* renamed from: a */
        final /* synthetic */ LandmarkARPresenter f99995a;

        C38463e(LandmarkARPresenter landmarkARPresenter) {
            this.f99995a = landmarkARPresenter;
        }

        /* renamed from: a */
        public final void mo90412a(AVLocationBundle aVLocationBundle) {
            this.f99995a.mo96374a().mo108196a((float) aVLocationBundle.getLatitude(), (float) aVLocationBundle.getLongitude(), aVLocationBundle.getAccuracy(), C40328a.m128809a(Long.valueOf(aVLocationBundle.getLocateTime())));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ar.LandmarkARPresenter$f */
    public static final class C38464f implements C35604a {

        /* renamed from: a */
        final /* synthetic */ LandmarkARPresenter f99996a;

        C38464f(LandmarkARPresenter landmarkARPresenter) {
            this.f99996a = landmarkARPresenter;
        }

        /* renamed from: a */
        public final void mo90409a(float f) {
            this.f99996a.mo96374a().f116432f = f;
        }
    }

    /* renamed from: f */
    private final C35603z m122945f() {
        return (C35603z) this.f99986f.getValue();
    }

    /* renamed from: a */
    public final C45253ad mo96374a() {
        return (C45253ad) this.f99985e.getValue();
    }

    /* renamed from: g */
    private void m122946g() {
        this.f99984d = m122945f().mo83213e();
        this.f99987g.mo55915d(this.f99984d);
        if (this.f99984d) {
            m122945f().mo83203a(mo100159e(), 3, new C38463e(this));
            m122945f().mo83204a(mo100159e(), (C35604a) new C38464f(this));
        }
    }

    public final void unRegister() {
        super.unRegister();
        mo96374a().f116435i = false;
        if (this.f99984d) {
            m122945f().mo83210c(mo100159e());
            m122945f().mo83211d(mo100159e());
        }
    }

    /* renamed from: b */
    public final void mo96375b() {
        Sensor sensor;
        super.mo96375b();
        if (VERSION.SDK_INT >= 18) {
            sensor = mo100158d().getDefaultSensor(15);
        } else {
            sensor = null;
        }
        if (sensor == null) {
            sensor = mo100158d().getDefaultSensor(11);
        }
        if (sensor != null) {
            mo96374a().f116435i = true;
            this.f99988h.mo55939a((C7562b<? super float[], C7581n>) new C38462d<Object,C7581n>(this));
            if (this.f99990j) {
                m122946g();
            } else {
                this.f99987g.mo55915d(false);
            }
            this.f99983c = new C38459a(this.f99987g, this.f99989i, mo96374a());
            SensorManager d = mo100158d();
            if (d == null) {
                C7573i.m23580a();
            }
            d.registerListener(this.f99983c, sensor, mo100156b(sensor.getType(), 0));
            mo100154a((C40328a) this.f99983c);
        }
    }

    public LandmarkARPresenter(Context context, C0043i iVar, C20676a aVar, C20707b bVar, boolean z, boolean z2) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(iVar, "lifecycleOwner");
        C7573i.m23587b(aVar, "mediaController");
        C7573i.m23587b(bVar, "cameraService");
        super(context, iVar);
        this.f99987g = aVar;
        this.f99988h = bVar;
        this.f99989i = z;
        this.f99990j = z2;
    }
}

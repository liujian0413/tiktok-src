package com.p280ss.android.ugc.aweme.shortvideo.p1548ar.senor;

import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.Lifecycle.Event;
import android.content.Context;
import android.hardware.Sensor;
import android.os.Build.VERSION;
import com.p280ss.android.ugc.asve.recorder.camera.C20707b;
import com.p280ss.android.ugc.asve.recorder.effect.C20749b;
import com.p280ss.android.ugc.aweme.shortvideo.senor.BaseSenorPresenter;
import com.p280ss.android.ugc.aweme.shortvideo.senor.C40328a;
import com.p280ss.android.ugc.aweme.shortvideo.senor.defult.C40329a;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ar.senor.ARSenorPresenter */
public class ARSenorPresenter extends BaseSenorPresenter {

    /* renamed from: a */
    private C40329a f100027a;

    /* renamed from: c */
    private final C20707b f100028c;

    /* renamed from: d */
    private final C20749b f100029d;

    /* renamed from: e */
    private boolean f100030e;

    /* access modifiers changed from: 0000 */
    @C0054q(mo125a = Event.ON_PAUSE)
    public void onPause() {
    }

    /* access modifiers changed from: 0000 */
    @C0054q(mo125a = Event.ON_RESUME)
    public void onResume() {
    }

    public void unRegister() {
        super.unRegister();
        if (this.f100027a != null) {
            this.f100027a.disable();
        }
    }

    /* renamed from: b */
    public final void mo96375b() {
        super.mo96375b();
        this.f100029d.mo56072a(false, 0, m122991h(), m122988a(), m122990g(), m122989f(), "");
    }

    /* renamed from: a */
    private boolean m122988a() {
        Sensor defaultSensor = mo100158d().getDefaultSensor(4);
        if (defaultSensor == null) {
            return false;
        }
        C38469c cVar = new C38469c(this.f100029d, this.f100030e);
        mo100158d().registerListener(cVar, defaultSensor, mo100156b(defaultSensor.getType(), 0));
        mo100154a((C40328a) cVar);
        return true;
    }

    /* renamed from: g */
    private boolean m122990g() {
        Sensor defaultSensor = mo100158d().getDefaultSensor(9);
        if (defaultSensor == null) {
            this.f100027a = new C40329a(mo100159e(), this.f100028c);
            this.f100027a.enable();
            return false;
        }
        C38468b bVar = new C38468b(this.f100029d, this.f100030e);
        mo100158d().registerListener(bVar, defaultSensor, mo100156b(defaultSensor.getType(), 0));
        mo100154a((C40328a) bVar);
        return true;
    }

    /* renamed from: h */
    private boolean m122991h() {
        Sensor defaultSensor = mo100158d().getDefaultSensor(1);
        if (defaultSensor == null) {
            return false;
        }
        C38467a aVar = new C38467a(this.f100029d, this.f100030e);
        mo100158d().registerListener(aVar, defaultSensor, mo100156b(defaultSensor.getType(), 0));
        mo100154a((C40328a) aVar);
        return true;
    }

    /* renamed from: f */
    private boolean m122989f() {
        Sensor sensor;
        if (VERSION.SDK_INT >= 18) {
            sensor = mo100158d().getDefaultSensor(15);
        } else {
            sensor = null;
        }
        if (sensor == null) {
            sensor = mo100158d().getDefaultSensor(11);
            if (sensor == null) {
                return false;
            }
        }
        C38470d dVar = new C38470d(mo100158d(), this.f100029d, this.f100030e);
        mo100158d().registerListener(dVar, sensor, mo100156b(sensor.getType(), 0));
        mo100154a((C40328a) dVar);
        return true;
    }

    public ARSenorPresenter(Context context, C0043i iVar, C20707b bVar, C20749b bVar2, boolean z) {
        super(context, iVar);
        this.f100029d = bVar2;
        this.f100028c = bVar;
        this.f100030e = z;
    }
}

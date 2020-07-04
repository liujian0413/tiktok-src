package com.p280ss.android.ugc.aweme.shortvideo.senor.defult;

import android.arch.lifecycle.C0043i;
import android.content.Context;
import android.hardware.Sensor;
import android.os.Build.VERSION;
import com.p280ss.android.ugc.asve.recorder.camera.C20707b;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.property.AVSettings.Property;
import com.p280ss.android.ugc.aweme.shortvideo.senor.BaseSenorPresenter;
import com.p280ss.android.ugc.aweme.shortvideo.senor.C40328a;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.senor.defult.DefaultSenorPresenter */
public class DefaultSenorPresenter extends BaseSenorPresenter {

    /* renamed from: a */
    private C40329a f104737a;

    /* renamed from: c */
    private C20707b f104738c;

    /* renamed from: d */
    private boolean f104739d;

    /* renamed from: b */
    public final void mo96375b() {
        super.mo96375b();
        m128810a();
        m128811f();
    }

    public void unRegister() {
        super.unRegister();
        if (this.f104737a != null) {
            this.f104737a.disable();
        }
    }

    /* renamed from: a */
    private void m128810a() {
        Sensor defaultSensor = mo100158d().getDefaultSensor(9);
        if (defaultSensor == null) {
            this.f104737a = new C40329a(mo100159e(), this.f104738c);
            this.f104737a.enable();
            return;
        }
        C40330b bVar = new C40330b(this.f104738c, this.f104739d);
        mo100158d().registerListener(bVar, defaultSensor, mo100156b(defaultSensor.getType(), 100000));
        mo100154a((C40328a) bVar);
    }

    /* renamed from: f */
    private void m128811f() {
        Sensor sensor;
        if (VERSION.SDK_INT < 18 || !C35574k.m114859a().mo70091f().mo93342a(Property.EnableUseGameRotationSensor)) {
            sensor = null;
        } else {
            sensor = mo100158d().getDefaultSensor(15);
        }
        if (sensor == null) {
            sensor = mo100158d().getDefaultSensor(11);
        }
        if (sensor != null) {
            C40331c cVar = new C40331c(this.f104738c, this.f104739d);
            mo100158d().registerListener(cVar, sensor, mo100156b(sensor.getType(), 100000));
            mo100154a((C40328a) cVar);
        }
    }

    public DefaultSenorPresenter(Context context, C0043i iVar, C20707b bVar, boolean z) {
        super(context, iVar);
        this.f104738c = bVar;
        this.f104739d = z;
    }
}

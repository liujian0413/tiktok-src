package com.p280ss.android.vesdk;

import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.Lifecycle.Event;
import android.text.TextUtils;
import com.p280ss.android.ttve.audio.C20441b;
import com.p280ss.android.ttve.audio.TEDubWriter;
import com.p280ss.android.ttve.monitor.C20477e;
import com.p280ss.android.ttve.nativePort.TEVideoUtils;
import com.p280ss.android.vesdk.p1776d.C45306a;
import com.p280ss.android.vesdk.runtime.VERuntime;

/* renamed from: com.ss.android.vesdk.VEAudioRecorder */
public class VEAudioRecorder implements C0042h {

    /* renamed from: a */
    public long f116092a;

    /* renamed from: b */
    private VERuntime f116093b = VERuntime.m143285a();

    /* renamed from: c */
    private VEAudioEncodeSettings f116094c;

    /* renamed from: d */
    private String f116095d;

    /* renamed from: e */
    private boolean f116096e;

    /* renamed from: f */
    private C20441b f116097f = new C20441b(new TEDubWriter());

    @C0054q(mo125a = Event.ON_DESTROY)
    public void destory() {
        this.f116097f.mo55022a();
    }

    /* renamed from: b */
    public final String mo107769b() throws VEException {
        if (!this.f116096e) {
            return this.f116095d;
        }
        throw new VEException(-105, "audio is recording");
    }

    /* renamed from: a */
    public final long mo107768a() {
        if (!this.f116096e) {
            return -105;
        }
        this.f116092a = ((TEDubWriter) this.f116097f.f55200k).f55189b;
        this.f116097f.mo55025b();
        StringBuilder sb = new StringBuilder("Stop record ,current time is ");
        sb.append(this.f116092a);
        C45372t.m143403a("VEAudioRecorder", sb.toString());
        this.f116096e = false;
        C20477e.m67936a("iesve_veaudiorecorder_audio_record", 1, (C45306a) null);
        return this.f116092a;
    }

    /* renamed from: a */
    public final int mo107766a(String str, VEAudioEncodeSettings vEAudioEncodeSettings) {
        this.f116094c = vEAudioEncodeSettings;
        this.f116096e = false;
        this.f116095d = str;
        this.f116097f.mo55023a(1);
        return 0;
    }

    /* renamed from: a */
    public final int mo107765a(int i, int i2) {
        if (i >= i2 || i < 0) {
            return -100;
        }
        C20477e.m67936a("iesve_veaudiorecorder_audio_delete", 1, (C45306a) null);
        return TEVideoUtils.clearWavSeg(this.f116095d, i, i2);
    }

    /* renamed from: a */
    public final int mo107764a(float f, int i, int i2) {
        if (this.f116096e) {
            return -105;
        }
        this.f116097f.mo55024a(this.f116095d, (double) f, i, i2);
        this.f116096e = true;
        return 0;
    }

    /* renamed from: a */
    public final int mo107767a(String str, VEAudioEncodeSettings vEAudioEncodeSettings, int i) {
        this.f116094c = vEAudioEncodeSettings;
        this.f116096e = false;
        if (TextUtils.isEmpty(str)) {
            C45372t.m143403a("VEAudioRecorder", "Empty directory use default path");
            this.f116095d = this.f116093b.f116765d.mo108581a();
        } else {
            StringBuilder sb = new StringBuilder("Use wav save path ");
            sb.append(str);
            C45372t.m143403a("VEAudioRecorder", sb.toString());
            this.f116095d = str;
        }
        this.f116097f.mo55023a(1);
        TEVideoUtils.generateMuteWav(this.f116095d, this.f116097f.f55195f, 2, i);
        return 0;
    }
}

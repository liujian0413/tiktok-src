package com.p280ss.android.ugc.aweme.shortvideo.edit.audiorecord;

import com.p280ss.android.vesdk.VEAudioEncodeSettings;
import com.p280ss.android.vesdk.VEAudioEncodeSettings.C45170a;
import com.p280ss.android.vesdk.VEAudioRecorder;
import com.p280ss.android.vesdk.VEException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.e */
public final class C39499e {

    /* renamed from: a */
    private final VEAudioRecorder f102553a = new VEAudioRecorder();

    /* renamed from: a */
    public final long mo98349a() {
        return this.f102553a.mo107768a();
    }

    /* renamed from: c */
    public final void mo98352c() {
        this.f102553a.destory();
    }

    /* renamed from: b */
    public final String mo98351b() {
        try {
            String b = this.f102553a.mo107769b();
            C7573i.m23582a((Object) b, "mVEAudioRecorder.wavFilePath");
            return b;
        } catch (VEException unused) {
            return "";
        }
    }

    /* renamed from: a */
    private void m126126a(String str, VEAudioEncodeSettings vEAudioEncodeSettings) {
        C7573i.m23587b(str, "url");
        C7573i.m23587b(vEAudioEncodeSettings, "settings");
        this.f102553a.mo107766a(str, vEAudioEncodeSettings);
    }

    /* renamed from: a */
    public final void mo98350a(int i, int i2) {
        this.f102553a.mo107765a(i, i2);
    }

    /* renamed from: a */
    private void m126125a(String str, int i, VEAudioEncodeSettings vEAudioEncodeSettings) {
        C7573i.m23587b(str, "wavPath");
        C7573i.m23587b(vEAudioEncodeSettings, "settings");
        this.f102553a.mo107767a(str, vEAudioEncodeSettings, i);
    }

    /* renamed from: a */
    public final int mo98348a(float f, int i, int i2) {
        return this.f102553a.mo107764a(1.0f, i, i2);
    }

    /* renamed from: a */
    public static /* synthetic */ void m126124a(C39499e eVar, String str, VEAudioEncodeSettings vEAudioEncodeSettings, int i, Object obj) {
        VEAudioEncodeSettings a = new C45170a().mo107763a();
        C7573i.m23582a((Object) a, "VEAudioEncodeSettings.Builder().Build()");
        eVar.m126126a(str, a);
    }

    /* renamed from: a */
    public static /* synthetic */ void m126123a(C39499e eVar, String str, int i, VEAudioEncodeSettings vEAudioEncodeSettings, int i2, Object obj) {
        VEAudioEncodeSettings a = new C45170a().mo107763a();
        C7573i.m23582a((Object) a, "VEAudioEncodeSettings.Builder().Build()");
        eVar.m126125a(str, i, a);
    }
}

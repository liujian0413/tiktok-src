package com.p280ss.android.vesdk;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.opengl.EGLContext;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.SparseArray;
import android.view.Surface;
import android.view.View;
import com.bef.effectsdk.message.MessageCenter.C1944a;
import com.p280ss.android.medialib.model.EnigmaResult;
import com.p280ss.android.medialib.presenter.IStickerRequestCallback;
import com.p280ss.android.ttve.model.VEFrame;
import com.p280ss.android.ttve.model.VEFrame.C20460a;
import com.p280ss.android.ttve.model.VEFrame.ETEPixelFormat;
import com.p280ss.android.ttve.monitor.C20469a;
import com.p280ss.android.ttve.monitor.C20477e;
import com.p280ss.android.ttvecamera.C20652m;
import com.p280ss.android.vesdk.VEListener.C45210f;
import com.p280ss.android.vesdk.VEListener.C45214j;
import com.p280ss.android.vesdk.VEListener.C45226v;
import com.p280ss.android.vesdk.faceinfo.C45314b;
import com.p280ss.android.vesdk.faceinfo.C45317d;
import com.p280ss.android.vesdk.model.BefTextLayout;
import com.p280ss.android.vesdk.model.BefTextLayoutResult;
import com.p280ss.android.vesdk.p1773a.C45248a;
import com.p280ss.android.vesdk.p1773a.C45249b;
import com.p280ss.android.vesdk.p1776d.C45306a;
import com.p280ss.android.vesdk.p1777e.C45308a;
import com.p280ss.android.vesdk.p1777e.C45309b;
import com.p280ss.android.vesdk.p1777e.C45310c;
import com.p280ss.android.vesdk.p1777e.C45311d;
import com.p280ss.android.vesdk.runtime.C45362d;
import com.p280ss.android.vesdk.runtime.VERuntime;
import com.p280ss.android.vesdk.utils.C45375b;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.vesdk.z */
public final class C45382z {

    /* renamed from: a */
    public C45362d f116902a;

    /* renamed from: b */
    protected C45319g f116903b;

    /* renamed from: c */
    private VERuntime f116904c;

    /* renamed from: com.ss.android.vesdk.z$a */
    public interface C45389a {
    }

    /* renamed from: com.ss.android.vesdk.z$b */
    public interface C45390b {
        /* renamed from: a */
        void mo55927a(int i);
    }

    /* renamed from: com.ss.android.vesdk.z$c */
    public interface C45391c {
        /* renamed from: a */
        BefTextLayoutResult mo38739a(String str, BefTextLayout befTextLayout);
    }

    /* renamed from: com.ss.android.vesdk.z$d */
    public interface C45392d {
        /* renamed from: a */
        void mo56129a(int i);

        /* renamed from: a */
        void mo56130a(String[] strArr);
    }

    /* renamed from: com.ss.android.vesdk.z$e */
    public interface C45393e {
        /* renamed from: a */
        void mo56382a(EGLContext eGLContext, int i, int i2, int i3, int i4, long j);

        /* renamed from: a */
        boolean mo56383a();
    }

    /* renamed from: com.ss.android.vesdk.z$f */
    public interface C45394f {

        /* renamed from: com.ss.android.vesdk.z$f$a */
        public static class C45395a {

            /* renamed from: a */
            public boolean f116916a;

            /* renamed from: b */
            public ETEPixelFormat f116917b = ETEPixelFormat.TEPixFmt_OpenGL_RGBA8;
        }

        /* renamed from: a */
        C45395a mo108751a();

        /* renamed from: a */
        void mo108752a(VEFrame vEFrame);
    }

    /* renamed from: com.ss.android.vesdk.z$g */
    public interface C45396g {
        /* renamed from: a */
        void mo55983a(int i, float f, boolean z);

        /* renamed from: a */
        void mo55984a(int i, boolean z, boolean z2, float f, List<Integer> list);

        /* renamed from: a */
        boolean mo55985a();
    }

    /* renamed from: com.ss.android.vesdk.z$h */
    public interface C45397h {
        /* renamed from: a */
        void mo56128a(String[] strArr, double[] dArr, boolean[] zArr);
    }

    /* renamed from: com.ss.android.vesdk.z$i */
    public interface C45398i {
        /* renamed from: a */
        void mo56379a(SparseArray<Long> sparseArray, float f);
    }

    /* renamed from: com.ss.android.vesdk.z$j */
    public interface C45399j {
        /* renamed from: a */
        void mo56381a(C45314b bVar, C45317d dVar);
    }

    /* renamed from: com.ss.android.vesdk.z$k */
    public interface C45400k {
    }

    /* renamed from: com.ss.android.vesdk.z$l */
    public interface C45401l {
    }

    /* renamed from: com.ss.android.vesdk.z$m */
    public interface C45402m {
        /* renamed from: a */
        void mo55990a(int i, float f);
    }

    /* renamed from: com.ss.android.vesdk.z$n */
    public interface C45403n {
    }

    /* renamed from: com.ss.android.vesdk.z$o */
    public interface C45404o {
        /* renamed from: a */
        void mo56377a(boolean z);
    }

    /* renamed from: a */
    public final void mo108659a(C45226v vVar) {
        this.f116903b.f116678B = vVar;
    }

    /* renamed from: a */
    public final int mo108623a(C45248a aVar, VEVideoEncodeSettings vEVideoEncodeSettings, VEAudioEncodeSettings vEAudioEncodeSettings, C45378w wVar) {
        try {
            return this.f116903b.mo108344a((C45248a) null, vEVideoEncodeSettings, vEAudioEncodeSettings, wVar, this.f116902a.mo56149a(), this.f116904c.f116766e.mo108564a());
        } catch (NullPointerException unused) {
            throw new VEException(-1, "init failed: VESDK need to be init");
        }
    }

    /* renamed from: a */
    public final int mo108624a(C45362d dVar) {
        int a = this.f116903b.mo108345a(dVar);
        if (a == 0) {
            this.f116902a = dVar;
        }
        return a;
    }

    /* renamed from: a */
    public final void mo108655a(VECameraSettings vECameraSettings) {
        this.f116903b.f116695S = vECameraSettings;
    }

    /* renamed from: a */
    public final void mo108678a(boolean z) {
        this.f116903b.f116699W = z;
    }

    /* renamed from: a */
    public final void mo108663a(C45330m mVar) {
        this.f116903b.mo108493a(mVar);
        try {
            C20469a.m67906a("vesdk_event_recorder_init_duet", new JSONObject(mVar.toString()), "behavior");
        } catch (JSONException unused) {
        }
    }

    /* renamed from: a */
    public final boolean mo108681a() {
        return this.f116903b.mo108300k();
    }

    /* renamed from: a */
    public final void mo108665a(C45381y yVar) {
        this.f116903b.mo108494a(yVar);
    }

    /* renamed from: a */
    public final void mo108647a(int i, int i2) {
        this.f116903b.mo108275c(i, -1);
    }

    /* renamed from: a */
    public final void mo108648a(int i, int i2, int i3, int i4) {
        this.f116903b.mo108232a(i, i2, i3, i4);
    }

    /* renamed from: b */
    public final int[] mo108701b() {
        return this.f116903b.mo108302l();
    }

    /* renamed from: a */
    public final int[] mo108682a(int i, int i2, int i3, int i4, float f) {
        return this.f116903b.mo108254a(i, i2, i3, i4, f);
    }

    /* renamed from: b */
    public final boolean mo108700b(int i, int i2) {
        return this.f116903b.mo108283d(i, i2);
    }

    /* renamed from: a */
    public final void mo108642a(double d) {
        this.f116903b.mo108227a(d);
    }

    /* renamed from: a */
    public final void mo108676a(String str, String str2, String str3) {
        this.f116903b.mo108251a(str, str2, str3);
    }

    /* renamed from: a */
    public final int mo108630a(String str, int i, int i2, int i3) {
        return this.f116903b.mo108218a(str, (long) i, -1, 2);
    }

    /* renamed from: a */
    public final int mo108634a(List<C45254ae> list, String str, int i, int i2) {
        return this.f116903b.mo108221a(list, str, i, 2);
    }

    /* renamed from: a */
    public final void mo108677a(List<C45254ae> list, String str, int i, int i2, C45210f fVar) {
        this.f116903b.mo108350a(list, str, i, 2, fVar);
    }

    /* renamed from: a */
    public final void mo108645a(float f, C45210f fVar) {
        this.f116903b.mo108230a(f, fVar);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("speed", (double) f);
            C20469a.m67906a("vesdk_event_recorder_start_record_async", jSONObject, "behavior");
        } catch (JSONException unused) {
        }
    }

    /* renamed from: a */
    public final void mo108657a(C45210f fVar) {
        this.f116903b.mo108265b(fVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x003c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String[] mo108683a(int r8, java.lang.String r9, java.lang.String r10) throws com.p280ss.android.vesdk.VEException {
        /*
            r7 = this;
            com.ss.android.vesdk.runtime.d r8 = r7.f116902a
            r8.mo108579e()
            com.ss.android.vesdk.runtime.d r8 = r7.f116902a
            r8.mo108580f()
            com.ss.android.vesdk.runtime.d r8 = r7.f116902a
            java.lang.String r8 = r8.mo56151b()
            com.ss.android.vesdk.runtime.d r0 = r7.f116902a
            java.lang.String r0 = r0.mo56153c()
            com.p280ss.android.vesdk.C45331n.m143270a(r8)
            com.p280ss.android.vesdk.C45331n.m143270a(r0)
            com.ss.android.vesdk.VERecordMode r1 = r7.m143430r()
            com.ss.android.vesdk.VERecordMode r2 = com.p280ss.android.vesdk.VERecordMode.DUET
            if (r1 != r2) goto L_0x002e
            com.ss.android.vesdk.g r1 = r7.f116903b
            java.lang.String r1 = r1.mo108226a()
            if (r1 == 0) goto L_0x002e
            r6 = r1
            goto L_0x002f
        L_0x002e:
            r6 = r0
        L_0x002f:
            com.ss.android.vesdk.g r0 = r7.f116903b
            r3 = 0
            r1 = r8
            r2 = r6
            r4 = r9
            r5 = r10
            int r9 = r0.mo108219a(r1, r2, r3, r4, r5)
            if (r9 < 0) goto L_0x0046
            r9 = 2
            java.lang.String[] r9 = new java.lang.String[r9]
            r10 = 0
            r9[r10] = r8
            r8 = 1
            r9[r8] = r6
            return r9
        L_0x0046:
            com.ss.android.vesdk.VEException r8 = new com.ss.android.vesdk.VEException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r0 = "concat failed: "
            r10.<init>(r0)
            r10.append(r9)
            java.lang.String r10 = r10.toString()
            r8.<init>(r9, r10)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.vesdk.C45382z.mo108683a(int, java.lang.String, java.lang.String):java.lang.String[]");
    }

    /* renamed from: a */
    public final void mo108658a(C45214j jVar) {
        mo108650a(0, "", "", jVar);
    }

    /* renamed from: a */
    public final void mo108650a(int i, String str, String str2, final C45214j jVar) {
        try {
            this.f116902a.mo108579e();
            this.f116902a.mo108580f();
            final String b = this.f116902a.mo56151b();
            final String c = this.f116902a.mo56153c();
            C45331n.m143270a(b);
            C45331n.m143270a(c);
            this.f116903b.mo108349a(b, c, 0, str, str2, (C45210f) new C45210f() {
                /* renamed from: a */
                public final void mo55926a(int i) {
                    if (jVar != null) {
                        jVar.mo55925a(i, b, c);
                    }
                }
            });
        } catch (VEException e) {
            StringBuilder sb = new StringBuilder("No need to concat because: ");
            sb.append(e.getMsgDes());
            C20652m.m68437d("VERecorder", sb.toString());
            if (jVar != null) {
                jVar.mo55925a(-108, "", "");
            }
        }
    }

    /* renamed from: a */
    public final void mo108672a(String str, int i, int i2, boolean z, boolean z2, CompressFormat compressFormat, C45390b bVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            int i3 = i;
            try {
                jSONObject.put("width", i);
                int i4 = i2;
                try {
                    jSONObject.put("height", i2);
                    C20469a.m67906a("vesdk_event_recorder_shot_screen", jSONObject, "behavior");
                } catch (JSONException unused) {
                }
            } catch (JSONException unused2) {
                int i5 = i2;
                this.f116903b.mo108217a(str, i, i2, false, z2, compressFormat, bVar, false);
            }
        } catch (JSONException unused3) {
            int i6 = i;
            int i52 = i2;
            this.f116903b.mo108217a(str, i, i2, false, z2, compressFormat, bVar, false);
        }
        this.f116903b.mo108217a(str, i, i2, false, z2, compressFormat, bVar, false);
    }

    /* renamed from: a */
    public final void mo108661a(C45249b bVar) {
        this.f116903b.mo108347a(bVar);
    }

    /* renamed from: a */
    public final void mo108651a(Surface surface) {
        this.f116903b.mo108276c(surface);
        C20469a.m67906a("vesdk_event_recorder_start_preview", (JSONObject) null, "behavior");
    }

    /* renamed from: a */
    public final void mo108652a(Surface surface, C45210f fVar) {
        this.f116903b.mo108237a(surface, fVar);
        C20469a.m67906a("vesdk_event_recorder_start_preview_async", (JSONObject) null, "behavior");
    }

    /* renamed from: b */
    public final void mo108697b(C45210f fVar) {
        this.f116903b.mo108241a(fVar);
    }

    /* renamed from: b */
    public final void mo108696b(Surface surface) {
        this.f116903b.mo108279d(surface);
    }

    /* renamed from: a */
    public final void mo108662a(C45256ag agVar) {
        this.f116903b.mo108242a(agVar);
    }

    /* renamed from: a */
    public final int mo108628a(String str, float f) {
        C45306a aVar = new C45306a();
        String str2 = "";
        if (!TextUtils.isEmpty(str)) {
            String[] split = str.split(File.separator);
            if (split.length > 0) {
                str2 = split[split.length - 1];
            }
        }
        float min = Math.min(1.0f, Math.max(f, 0.0f));
        if (min < 0.0f) {
            min = -1.0f;
        }
        aVar.mo108381a("iesve_verecorder_set_filter_click_idfilter_id", str2).mo108380a("old", 1);
        C20477e.m67936a("iesve_verecorder_set_filter_click", 1, aVar);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("filterId", str2);
            jSONObject.put("intensity", String.valueOf(min));
            C20469a.m67906a("vesdk_event_recorder_single_filter_new", jSONObject, "behavior");
        } catch (JSONException unused) {
        }
        return this.f116903b.mo108212a(str, min);
    }

    /* renamed from: a */
    public final int mo108627a(String str) {
        return m143427a(str, 0.0f, true);
    }

    /* renamed from: a */
    public final void mo108674a(String str, String str2, float f) {
        C45306a aVar = new C45306a();
        String str3 = "";
        String str4 = "";
        if (!TextUtils.isEmpty(str)) {
            String[] split = str.split(File.separator);
            if (split.length > 0) {
                str3 = split[split.length - 1];
            }
        }
        if (!TextUtils.isEmpty(str2)) {
            String[] split2 = str2.split(File.separator);
            if (split2.length > 0) {
                str4 = split2[split2.length - 1];
            }
        }
        aVar.mo108381a("iesve_verecorder_set_filter_slide_left_id", str3).mo108381a("iesve_verecorder_set_filter_slide_right_id", str4).mo108380a("old", 1);
        C20477e.m67936a("iesve_verecorder_set_filter_slide", 1, aVar);
        this.f116903b.mo108249a(str, str2, f);
    }

    /* renamed from: a */
    public final void mo108675a(String str, String str2, float f, float f2, float f3) {
        C45306a aVar = new C45306a();
        String str3 = "";
        String str4 = "";
        if (!TextUtils.isEmpty(str)) {
            String str5 = str;
            String[] split = str.split(File.separator);
            if (split.length > 0) {
                str3 = split[split.length - 1];
            }
        } else {
            String str6 = str;
        }
        if (!TextUtils.isEmpty(str2)) {
            String str7 = str2;
            String[] split2 = str2.split(File.separator);
            if (split2.length > 0) {
                str4 = split2[split2.length - 1];
            }
        } else {
            String str8 = str2;
        }
        float f4 = 1.0f;
        float f5 = f2 > 1.0f ? 1.0f : f2;
        if (f3 <= 1.0f) {
            f4 = f3;
        }
        float f6 = f5 < 0.0f ? -1.0f : f5;
        if (f4 < 0.0f) {
            f4 = -1.0f;
        }
        aVar.mo108381a("iesve_verecorder_set_filter_slide_left_id", str3).mo108381a("iesve_verecorder_set_filter_slide_right_id", str4).mo108380a("old", 1);
        C20477e.m67936a("iesve_verecorder_set_filter_slide", 1, aVar);
        this.f116903b.mo108250a(str, str2, f, f6, f4);
    }

    /* renamed from: a */
    public final int mo108621a(int i, String str) {
        C45306a aVar = new C45306a();
        aVar.mo108380a("iesve_verecorder_set_beauty_algorithm", i).mo108380a("old", 1);
        C20477e.m67936a("iesve_verecorder_set_beauty_algorithm", 1, aVar);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("beautyFaceType", String.valueOf(i));
            jSONObject.put("strBeautyFaceRes", str);
            C20469a.m67906a("vesdk_event_recorder_beauty_face", jSONObject, "behavior");
        } catch (JSONException unused) {
        }
        return this.f116903b.mo108207a(i, str);
    }

    /* renamed from: a */
    public final int mo108629a(String str, float f, float f2) {
        C45306a aVar = new C45306a();
        aVar.mo108379a("iesve_verecorder_set_bigeyes_smallface_level", f).mo108380a("old", 1);
        C20477e.m67936a("iesve_verecorder_set_bigeyes_smallface", 1, aVar);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("strResPath", str);
            jSONObject.put("fEyeIntensity", String.valueOf(f));
            jSONObject.put("fCheekIntensity", String.valueOf(f2));
            C20469a.m67906a("vesdk_event_recorder_face_reshape", jSONObject, "behavior");
        } catch (JSONException unused) {
        }
        return this.f116903b.mo108213a(str, f, f2);
    }

    /* renamed from: a */
    public final int mo108635a(Map<Integer, Float> map) {
        return this.f116903b.mo108222a(map);
    }

    /* renamed from: a */
    public final int mo108633a(String str, Map<Integer, Float> map) {
        return this.f116903b.mo108220a(str, map);
    }

    /* renamed from: a */
    public final void mo108660a(VEPreviewRadio vEPreviewRadio, VESize vESize, VESize vESize2, VESize vESize3, int i, Context context) {
        final View view;
        float f;
        int b = C45375b.m143418b(context);
        int a = C45375b.m143417a(context);
        if (b * 16 == a * 9) {
            if (vEPreviewRadio == VEPreviewRadio.RADIO_FULL) {
                vEPreviewRadio = VEPreviewRadio.RADIO_9_16;
            }
            if (this.f116903b.f116707ae == VEPreviewRadio.RADIO_FULL.ordinal()) {
                this.f116903b.f116707ae = VEPreviewRadio.RADIO_9_16.ordinal();
            }
        }
        if (vEPreviewRadio.ordinal() != this.f116903b.f116707ae || this.f116903b.f116695S == null) {
            VESize vESize4 = new VESize(vESize.f116385a, vESize.f116386b);
            boolean z = true;
            if (!(this.f116903b.f116707ae == VEPreviewRadio.RADIO_9_16.ordinal() || vEPreviewRadio == VEPreviewRadio.RADIO_9_16 || this.f116903b.f116707ae == VEPreviewRadio.RADIO_FULL.ordinal() || vEPreviewRadio == VEPreviewRadio.RADIO_FULL)) {
                z = false;
            }
            if (this.f116903b.f116709ag) {
                z = false;
            }
            if (this.f116903b.f116726z instanceof C45308a) {
                view = ((C45308a) this.f116903b.f116726z).f116618a;
            } else if (this.f116903b.f116726z instanceof C45309b) {
                view = ((C45309b) this.f116903b.f116726z).f116619a;
            } else {
                throw new AndroidRuntimeException("renderView not support!");
            }
            switch (vEPreviewRadio) {
                case RADIO_9_16:
                    f = 0.5625f;
                    if (vESize.f116385a * 16 == vESize.f116386b * 9) {
                        view.getLayoutParams().width = b;
                        view.getLayoutParams().height = (int) ((((float) b) / 9.0f) * 16.0f);
                        break;
                    } else {
                        C45372t.m143409d("VERecorder", "previewSize is not fit with PREVIEW_RADIO!");
                        return;
                    }
                case RADIO_3_4:
                case RADIO_1_1:
                case RADIO_ROUND:
                    f = 0.75f;
                    if (vESize.f116385a * 4 == vESize.f116386b * 3) {
                        view.getLayoutParams().width = b;
                        view.getLayoutParams().height = (int) ((((float) b) / 3.0f) * 4.0f);
                        break;
                    } else {
                        C45372t.m143409d("VERecorder", "previewSize is not fit with PREVIEW_RADIO!");
                        return;
                    }
                case RADIO_FULL:
                    f = (((float) b) * 1.0f) / ((float) a);
                    view.getLayoutParams().width = b;
                    view.getLayoutParams().height = -1;
                    break;
                default:
                    f = 1.0f;
                    break;
            }
            if (vEPreviewRadio == VEPreviewRadio.RADIO_1_1 || vEPreviewRadio == VEPreviewRadio.RADIO_ROUND) {
                vESize4.f116386b = vESize4.f116385a;
            }
            int i2 = 720;
            if (vESize4.f116385a >= 720) {
                float f2 = (((float) vESize4.f116386b) * 1.0f) / ((float) vESize4.f116385a);
                if (this.f116903b.f116726z.f116622c < 720) {
                    i2 = this.f116903b.f116726z.f116622c;
                }
                vESize4.f116385a = i2;
                vESize4.f116386b = (int) (((float) vESize4.f116385a) * f2);
            }
            if (this.f116903b.f116695S == null) {
                z = false;
            }
            if (z) {
                this.f116903b.mo108231a(vEPreviewRadio.ordinal(), f, vESize, vESize4);
                this.f116903b.f116726z.mo108390a((C45311d) new C45311d() {
                    /* renamed from: a */
                    public final void mo108235a(Surface surface) {
                    }

                    /* renamed from: b */
                    public final void mo108264b(Surface surface) {
                    }

                    /* renamed from: a */
                    public final void mo108236a(Surface surface, int i, int i2, int i3) {
                        C45382z.this.f116903b.mo108237a(surface, (C45210f) null);
                        C45382z.this.f116903b.f116726z.mo108391b((C45311d) this);
                    }
                });
                this.f116903b.mo108241a((C45210f) new C45210f() {
                    /* renamed from: a */
                    public final void mo55926a(int i) {
                        view.post(new Runnable() {
                            public final void run() {
                                view.requestLayout();
                            }
                        });
                    }
                });
            } else {
                if ((this.f116903b.f116707ae == VEPreviewRadio.RADIO_9_16.ordinal() && vEPreviewRadio == VEPreviewRadio.RADIO_FULL) || ((this.f116903b.f116707ae == VEPreviewRadio.RADIO_FULL.ordinal() && vEPreviewRadio == VEPreviewRadio.RADIO_9_16) || this.f116903b.f116709ag)) {
                    view.requestLayout();
                }
                if (!this.f116903b.f116709ag) {
                    this.f116903b.mo108231a(vEPreviewRadio.ordinal(), 0.0f, (VESize) null, vESize4);
                }
                this.f116903b.f116709ag = false;
            }
            this.f116903b.f116707ae = vEPreviewRadio.ordinal();
        }
    }

    /* renamed from: a */
    public final int mo108632a(String str, int i, int i2, boolean z) {
        return mo108631a(str, i, i2, "");
    }

    /* renamed from: a */
    public final int mo108631a(String str, int i, int i2, String str2) {
        C45306a aVar = new C45306a();
        if (str2 == null) {
            str2 = "";
        }
        String str3 = str2;
        String str4 = "";
        if (!TextUtils.isEmpty(str)) {
            String[] split = str.split(File.separator);
            if (split.length > 0) {
                str4 = split[split.length - 1];
            }
        }
        aVar.mo108381a("iesve_verecorder_set_sticker_id", TextUtils.isEmpty(str4) ? "0" : str4).mo108380a("old", 1);
        C20477e.m67936a("iesve_verecorder_set_sticker", 1, aVar);
        try {
            JSONObject jSONObject = new JSONObject();
            String str5 = "stickerId";
            if (TextUtils.isEmpty(str4)) {
                str4 = "0";
            }
            jSONObject.put(str5, str4);
            jSONObject.put("needReload", 0);
            C20469a.m67906a("vesdk_event_recorder_switch_effect", jSONObject, "behavior");
        } catch (JSONException unused) {
        }
        return this.f116903b.mo108216a(str, i, i2, false, str3);
    }

    /* renamed from: a */
    public final void mo108654a(IStickerRequestCallback iStickerRequestCallback) {
        this.f116903b.mo108239a(iStickerRequestCallback);
    }

    /* renamed from: a */
    public final void mo108669a(C45399j jVar) {
        this.f116903b.mo108246a(jVar);
    }

    /* renamed from: a */
    public final void mo108668a(C45398i iVar) {
        this.f116903b.mo108245a(iVar);
    }

    /* renamed from: a */
    public final void mo108667a(C45397h hVar) {
        this.f116903b.mo108244a(hVar);
    }

    /* renamed from: a */
    public final void mo108656a(VECherEffectParam vECherEffectParam) {
        this.f116903b.mo108240a(vECherEffectParam);
    }

    /* renamed from: a */
    public final void mo108649a(int i, long j, long j2, String str) {
        this.f116903b.mo108234a(i, j, j2, str);
    }

    /* renamed from: a */
    public final void mo108653a(C1944a aVar) {
        this.f116903b.mo108238a(aVar);
    }

    /* renamed from: a */
    public final void mo108680a(float[] fArr, double d) {
        this.f116903b.mo108351a(fArr, d);
    }

    /* renamed from: a */
    public final void mo108671a(Runnable runnable) {
        this.f116903b.mo108247a(runnable);
    }

    /* renamed from: a */
    public final void mo108643a(float f, float f2, float f3) {
        this.f116903b.mo108228a(f, f2, f3);
    }

    /* renamed from: a */
    public final void mo108670a(C45404o oVar) {
        this.f116903b.mo108495a(oVar);
    }

    /* renamed from: b */
    public final void mo108699b(C45404o oVar) {
        this.f116903b.mo108496b(oVar);
    }

    /* renamed from: a */
    public final int mo108636a(boolean z, int i, boolean z2, boolean z3, boolean z4, boolean z5, String str) {
        return mo108637a(z2, z3, z4, z5);
    }

    /* renamed from: a */
    public final int mo108637a(boolean z, boolean z2, boolean z3, boolean z4) {
        return this.f116903b.mo108223a(z, z2, z3, z4);
    }

    /* renamed from: a */
    public final int mo108638a(double[] dArr, double d) {
        return this.f116903b.mo108224a(dArr, d);
    }

    /* renamed from: a */
    public final int mo108626a(C45392d dVar) {
        return this.f116903b.mo108210a(dVar);
    }

    /* renamed from: a */
    public final int mo108625a(C45391c cVar) {
        return this.f116903b.mo108209a(cVar);
    }

    /* renamed from: a */
    public final int mo108622a(Bitmap bitmap) {
        return this.f116903b.mo108343a(bitmap);
    }

    /* renamed from: a */
    public final void mo108646a(int i) {
        this.f116903b.mo108352b(i);
    }

    /* renamed from: a */
    public final void mo108664a(C45336r rVar) {
        this.f116903b.mo108348a(rVar);
    }

    /* renamed from: b */
    public final void mo108698b(C45336r rVar) {
        this.f116903b.mo108353b(rVar);
    }

    /* renamed from: b */
    public final void mo108695b(int i) {
        this.f116903b.mo108355d(i);
    }

    /* renamed from: a */
    public final void mo108666a(final C45393e eVar) {
        m143429a(eVar == null ? null : new C45394f() {
            /* renamed from: a */
            public final C45395a mo108751a() {
                boolean z;
                C45395a aVar = new C45395a();
                aVar.f116917b = ETEPixelFormat.TEPixFmt_OpenGL_RGBA8;
                if (eVar == null || !eVar.mo56383a()) {
                    z = false;
                } else {
                    z = true;
                }
                aVar.f116916a = z;
                return aVar;
            }

            /* renamed from: a */
            public final void mo108752a(VEFrame vEFrame) {
                if (eVar != null) {
                    if (vEFrame == null || vEFrame.getFormat() != ETEPixelFormat.TEPixFmt_OpenGL_RGBA8) {
                        eVar.mo56382a(null, 0, 10, 0, 0, 0);
                        return;
                    }
                    C20460a aVar = (C20460a) vEFrame.getFrame();
                    eVar.mo56382a(aVar.f55265a, aVar.f55266b, 10, vEFrame.getWidth(), vEFrame.getHeight(), vEFrame.getTimeStamp());
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo108673a(String str, String str2) {
        this.f116903b.mo108248a(str, str2);
    }

    /* renamed from: a */
    public final int mo108639a(String[] strArr, int i) {
        return this.f116903b.mo108225a(strArr, 0);
    }

    /* renamed from: b */
    public final int mo108693b(String[] strArr, int i) {
        return this.f116903b.mo108262b(strArr, i);
    }

    /* renamed from: a */
    public final int mo108640a(String[] strArr, int i, String[] strArr2) {
        VEEffectParams vEEffectParams = new VEEffectParams();
        vEEffectParams.TYPE = VEEffectParams.EFFECT_TYPE_SET_COMPOSER_WITH_TAG;
        vEEffectParams.intValueOne = i;
        vEEffectParams.stringArrayOne = new ArrayList<>(Arrays.asList(strArr));
        vEEffectParams.stringArrayTwo = new ArrayList<>(Arrays.asList(strArr2));
        C45372t.m143407c("VERecorder", "setComposerNodesWithTag...");
        return this.f116903b.mo108208a(vEEffectParams);
    }

    /* renamed from: b */
    public final int mo108694b(String[] strArr, int i, String[] strArr2) {
        VEEffectParams vEEffectParams = new VEEffectParams();
        vEEffectParams.TYPE = VEEffectParams.EFFECT_TYPE_APPEND_COMPOSER_WITH_TAG;
        vEEffectParams.intValueOne = i;
        vEEffectParams.stringArrayOne = new ArrayList<>(Arrays.asList(strArr));
        vEEffectParams.stringArrayTwo = new ArrayList<>(Arrays.asList(strArr2));
        C45372t.m143407c("VERecorder", "appendComposerNodes...");
        return this.f116903b.mo108208a(vEEffectParams);
    }

    /* renamed from: a */
    public final int mo108641a(String[] strArr, int i, String[] strArr2, int i2, String[] strArr3) {
        VEEffectParams vEEffectParams = new VEEffectParams();
        vEEffectParams.TYPE = VEEffectParams.EFFECT_TYPE_REPLACE_COMPOSER_WITH_TAG;
        vEEffectParams.intValueOne = i;
        vEEffectParams.intValueTwo = i2;
        vEEffectParams.stringArrayOne = new ArrayList<>(Arrays.asList(strArr));
        vEEffectParams.stringArrayTwo = new ArrayList<>(Arrays.asList(strArr2));
        vEEffectParams.stringArrayThree = new ArrayList<>(Arrays.asList(strArr3));
        C45372t.m143407c("VERecorder", "replaceComposerNodes...");
        return this.f116903b.mo108208a(vEEffectParams);
    }

    /* renamed from: b */
    public final int[] mo108702b(String str, String str2) {
        if (str == null || str2 == null) {
            return new int[]{-1, 0};
        }
        return this.f116903b.mo108267b(str, str2);
    }

    /* renamed from: a */
    public final void mo108644a(float f, float f2, float f3, float f4) {
        this.f116903b.mo108229a(f, f2, f3, f4);
    }

    /* renamed from: a */
    public final void mo108679a(boolean z, long j) {
        this.f116903b.mo108252a(z, j);
    }

    /* renamed from: r */
    private VERecordMode m143430r() {
        return this.f116903b.f116702Z;
    }

    /* renamed from: d */
    public final float mo108711d() {
        return this.f116903b.mo108305n();
    }

    /* renamed from: e */
    public final int mo108715e() {
        return this.f116903b.mo108356e();
    }

    /* renamed from: f */
    public final int mo108719f() {
        return this.f116903b.mo108295i();
    }

    /* renamed from: g */
    public final long mo108723g() {
        return this.f116903b.mo108361r();
    }

    /* renamed from: h */
    public final long mo108726h() {
        return this.f116903b.mo108281d();
    }

    /* renamed from: i */
    public final void mo108728i() throws VEException {
        this.f116903b.mo108263b();
    }

    /* renamed from: j */
    public final void mo108730j() {
        this.f116903b.mo108290g();
    }

    /* renamed from: k */
    public final void mo108732k() {
        this.f116903b.mo108293h();
    }

    /* renamed from: l */
    public final void mo108734l() {
        this.f116903b.mo108273c();
    }

    /* renamed from: m */
    public final void mo108736m() {
        this.f116903b.mo108297j();
    }

    /* renamed from: o */
    public final void mo108740o() {
        this.f116903b.mo108307o();
    }

    /* renamed from: q */
    public final EnigmaResult mo108744q() {
        return this.f116903b.mo108312q();
    }

    /* renamed from: p */
    public final void mo108743p() {
        this.f116903b.mo108310p();
    }

    /* renamed from: n */
    public final void mo108738n() {
        C45372t.m143407c("VERecorder", "onDestroy...");
        if (this.f116903b != null) {
            this.f116903b.mo108288f();
        }
        if (this.f116902a != null) {
            this.f116902a.mo108578d();
        }
    }

    /* renamed from: c */
    public final int[] mo108710c() {
        return this.f116903b.mo108304m();
    }

    /* renamed from: q */
    public final void mo108745q(boolean z) {
        mo108746r(z);
    }

    /* renamed from: n */
    public final void mo108739n(boolean z) {
        this.f116903b.mo108306n(z);
    }

    /* renamed from: p */
    public final int mo108742p(boolean z) {
        return this.f116903b.mo108301l(z);
    }

    /* renamed from: s */
    public final void mo108747s(boolean z) {
        this.f116903b.mo108308o(z);
    }

    /* renamed from: t */
    public final void mo108748t(boolean z) {
        this.f116903b.mo108311p(z);
    }

    /* renamed from: u */
    public final void mo108749u(boolean z) {
        this.f116903b.mo108365t(z);
    }

    /* renamed from: a */
    private void m143429a(C45394f fVar) {
        this.f116903b.mo108243a(fVar);
    }

    /* renamed from: b */
    public final float mo108684b(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1.0f;
        }
        return this.f116903b.mo108269c(str);
    }

    /* renamed from: g */
    public final void mo108724g(String str) {
        this.f116903b.mo108358f(str);
    }

    /* renamed from: j */
    public final void mo108731j(boolean z) {
        this.f116903b.mo108282d(z);
    }

    /* renamed from: l */
    public final void mo108735l(boolean z) {
        this.f116903b.mo108277c(z);
    }

    /* renamed from: m */
    public final void mo108737m(boolean z) {
        this.f116903b.mo108299k(z);
    }

    /* renamed from: o */
    public final void mo108741o(boolean z) {
        this.f116903b.mo108363s(z);
    }

    /* renamed from: r */
    public final void mo108746r(boolean z) {
        this.f116903b.mo108303m(z);
    }

    /* renamed from: d */
    public final void mo108714d(boolean z) {
        this.f116903b.mo108296i(true);
    }

    /* renamed from: e */
    public final void mo108718e(boolean z) {
        this.f116903b.mo108298j(z);
    }

    /* renamed from: f */
    public final int mo108721f(String str) {
        return this.f116903b.mo108286e(str);
    }

    /* renamed from: g */
    public final void mo108725g(boolean z) {
        this.f116903b.mo108292g_(z);
    }

    /* renamed from: h */
    public final void mo108727h(boolean z) {
        StringBuilder sb = new StringBuilder("enableSceneRecognition:");
        sb.append(z);
        C45372t.m143403a("VERecorder", sb.toString());
        this.f116903b.mo108287e(z);
    }

    /* renamed from: i */
    public final void mo108729i(boolean z) {
        StringBuilder sb = new StringBuilder("enableExpressDetect:");
        sb.append(z);
        C45372t.m143403a("VERecorder", sb.toString());
        this.f116903b.mo108289f(z);
    }

    /* renamed from: a */
    public final int mo108616a(float f) {
        int a = this.f116903b.mo108202a(f);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("speed", (double) f);
            jSONObject.put("resultCode", a);
            C20469a.m67906a("vesdk_event_recorder_start_record", jSONObject, "behavior");
        } catch (JSONException unused) {
        }
        return a;
    }

    /* renamed from: b */
    public final int mo108686b(float f) {
        int b = this.f116903b.mo108256b(f);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("intensity", (double) f);
            jSONObject.put("resultCode", b);
            C20469a.m67906a("vesdk_event_recorder_skintone_intensity", jSONObject, "behavior");
        } catch (JSONException unused) {
        }
        return b;
    }

    /* renamed from: c */
    public final int mo108706c(String str) {
        return this.f116903b.mo108211a(str);
    }

    /* renamed from: d */
    public final int mo108713d(String str) {
        StringBuilder sb = new StringBuilder("setFaceMakeUp: ");
        sb.append(str);
        C45372t.m143403a("VERecorder", sb.toString());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("strResPath", str);
            C20469a.m67906a("vesdk_event_recorder_face_make_up", jSONObject, "behavior");
        } catch (JSONException unused) {
        }
        return this.f116903b.mo108259b(str);
    }

    /* renamed from: e */
    public final int mo108717e(String str) {
        int d = this.f116903b.mo108280d(str);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("skinToneResPath", str);
            jSONObject.put("resultCode", String.valueOf(d));
            C20469a.m67906a("vesdk_event_recorder_skintone", jSONObject, "behavior");
        } catch (JSONException unused) {
        }
        return d;
    }

    /* renamed from: f */
    public final void mo108722f(boolean z) {
        this.f116903b.mo108291g(z);
    }

    /* renamed from: k */
    public final boolean mo108733k(boolean z) {
        C45306a aVar = new C45306a();
        StringBuilder sb = new StringBuilder();
        sb.append(z);
        aVar.mo108381a("iesve_verecorder_use_sharedtexture", sb.toString()).mo108380a("old", 1);
        C20477e.m67936a("iesve_verecorder_use_sharedtexture", 1, aVar);
        return this.f116903b.mo108266b(z);
    }

    /* renamed from: b */
    public final int mo108688b(C45392d dVar) {
        return this.f116903b.mo108258b(dVar);
    }

    /* renamed from: c */
    public final void mo108708c(int i) {
        this.f116903b.mo108274c(i);
    }

    /* renamed from: c */
    public final void mo108709c(boolean z) {
        this.f116903b.mo108294h(z);
    }

    /* renamed from: b */
    public final int mo108692b(boolean z) {
        return this.f116903b.mo108360r(z);
    }

    public C45382z(C45362d dVar, Context context) {
        this(dVar, context, null);
    }

    /* renamed from: a */
    private C45319g m143428a(Context context, C45310c cVar) {
        return C45312f.m143102a(context, this.f116902a, cVar);
    }

    /* renamed from: b */
    public final int mo108687b(float f, float f2) {
        return this.f116903b.mo108257b(f, f2);
    }

    /* renamed from: c */
    public final int mo108704c(float f, float f2) {
        return mo108687b(f, f2);
    }

    /* renamed from: d */
    public final int mo108712d(float f, float f2) {
        return this.f116903b.mo108271c(f, f2);
    }

    /* renamed from: e */
    public final int mo108716e(float f, float f2) {
        return this.f116903b.mo108278d(f, f2);
    }

    /* renamed from: f */
    public final int mo108720f(float f, float f2) {
        return this.f116903b.mo108284e(f, f2);
    }

    /* renamed from: c */
    public final int mo108705c(int i, int i2) {
        return this.f116903b.mo108285e(i, 0);
    }

    /* renamed from: c */
    public final int mo108707c(String str, String str2) {
        if (str2 != null) {
            return this.f116903b.mo108272c(str, str2);
        }
        C45372t.m143409d("VERecorder", "Illegal argument. imagePath can't be null. Consider using empty string to cancel.");
        return -100;
    }

    /* renamed from: a */
    public final int mo108617a(float f, float f2) {
        C45306a aVar = new C45306a();
        aVar.mo108379a("iesve_verecorder_set_beauty_level", f).mo108380a("old", 1);
        C20477e.m67936a("iesve_verecorder_set_beauty_level", 1, aVar);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fSmoothIntensity", String.valueOf(f));
            jSONObject.put("fWhiteIntensity", String.valueOf(f));
            C20469a.m67906a("vesdk_event_recorder_beauty_face_intensity", jSONObject, "behavior");
        } catch (JSONException unused) {
        }
        return this.f116903b.mo108203a(f, f2);
    }

    /* renamed from: a */
    public final int mo108619a(int i, float f) {
        C45306a aVar = new C45306a();
        StringBuilder sb = new StringBuilder("iesve_verecorder_");
        sb.append(C45322j.m143234a(i));
        sb.append("_level");
        aVar.mo108379a(sb.toString(), f).mo108380a("old", 1);
        StringBuilder sb2 = new StringBuilder("iesve_verecorder_");
        sb2.append(C45322j.m143234a(i));
        sb2.append("_level");
        C20477e.m67936a(sb2.toString(), 1, aVar);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("beautyType", String.valueOf(i));
            jSONObject.put("fIntensity", String.valueOf(f));
            C20469a.m67906a("vesdk_event_recorder_beauty_single_intensity", jSONObject, "behavior");
        } catch (JSONException unused) {
        }
        return this.f116903b.mo108205a(i, f);
    }

    private C45382z(C45362d dVar, Context context, C45310c cVar) {
        this.f116902a = dVar;
        this.f116904c = VERuntime.m143285a();
        this.f116903b = m143428a(context, (C45310c) null);
    }

    /* renamed from: a */
    private int m143427a(String str, float f, boolean z) {
        C45306a aVar = new C45306a();
        String str2 = "";
        if (!TextUtils.isEmpty(str)) {
            String[] split = str.split(File.separator);
            if (split.length > 0) {
                str2 = split[split.length - 1];
            }
        }
        float min = Math.min(1.0f, Math.max(0.0f, 0.0f));
        aVar.mo108381a("iesve_verecorder_set_filter_click_idfilter_id", str2).mo108380a("old", 1);
        C20477e.m67936a("iesve_verecorder_set_filter_click", 1, aVar);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("filterId", str2);
            jSONObject.put("intensity", String.valueOf(min));
            C20469a.m67906a("vesdk_event_recorder_single_filter", jSONObject, "behavior");
        } catch (JSONException unused) {
        }
        return this.f116903b.mo108214a(str, min, true);
    }

    /* renamed from: b */
    public final int mo108689b(String str, float f, float f2) {
        C45306a aVar = new C45306a();
        aVar.mo108379a("iesve_verecorder_set_lipstick_and_blusher_level", f).mo108380a("old", 1);
        C20477e.m67936a("iesve_verecorder_set_lipstick_and_blusher_level", 1, aVar);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("strResPath", str);
            jSONObject.put("fLipstickIntensity", String.valueOf(f));
            jSONObject.put("fBlusherIntensity", String.valueOf(f));
            C20469a.m67906a("vesdk_event_recorder_face_make_up_intensity", jSONObject, "behavior");
        } catch (JSONException unused) {
        }
        return this.f116903b.mo108260b(str, f, f2);
    }

    /* renamed from: b */
    public final int mo108691b(String str, String str2, float f) {
        int b = this.f116903b.mo108261b(str, str2, f);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("path", str);
            jSONObject.put("nodeTag", str2);
            jSONObject.put("nodeValue", String.valueOf(f));
            jSONObject.put("resultCode", String.valueOf(b));
            C20469a.m67906a("vesdk_event_recorder_composer", jSONObject, "behavior");
        } catch (JSONException unused) {
        }
        return b;
    }

    /* renamed from: c */
    public final int mo108703c(double d, double d2, double d3, double d4) {
        return this.f116903b.mo108270c(d, d2, d3, d4);
    }

    /* renamed from: a */
    public final int mo108615a(double d, double d2, double d3, double d4) {
        return this.f116903b.mo108201a(d, d2, d3, d4);
    }

    /* renamed from: b */
    public final int mo108685b(double d, double d2, double d3, double d4) {
        return this.f116903b.mo108255b(d, d2, d3, d4);
    }

    /* renamed from: b */
    public final int mo108690b(String str, int i, int i2, String str2) {
        return this.f116903b.mo108215a(str, i, i2, str2);
    }

    /* renamed from: a */
    public final int mo108620a(int i, float f, float f2, int i2) {
        return this.f116903b.mo108206a(i, f, f2, i2);
    }

    /* renamed from: a */
    public final int mo108618a(float f, float f2, float f3, float f4, float f5) {
        return this.f116903b.mo108204a(f, f2, f3, f4, f5);
    }
}

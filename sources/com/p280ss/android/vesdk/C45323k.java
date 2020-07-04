package com.p280ss.android.vesdk;

import android.content.Context;
import android.os.Bundle;
import com.p280ss.android.medialib.log.C19752b;
import com.p280ss.android.ttve.monitor.C20469a;
import com.p280ss.android.ttve.monitor.C20479f;
import com.p280ss.android.ttve.nativePort.TELogcat;
import com.p280ss.android.ttvecamera.C20621g;
import com.p280ss.android.ttvecamera.C20621g.C20622a;
import com.p280ss.android.ttvecamera.C20621g.C20624c;
import com.p280ss.android.ttvecamera.C20630h.C20631a;
import com.p280ss.android.ttvecamera.C20632i;
import com.p280ss.android.ttvecamera.C20632i.C20634b;
import com.p280ss.android.ttvecamera.C20632i.C20638f;
import com.p280ss.android.ttvecamera.C20632i.C20639g;
import com.p280ss.android.ttvecamera.C20632i.C20640h;
import com.p280ss.android.ttvecamera.C20632i.C20641i;
import com.p280ss.android.ttvecamera.C20652m;
import com.p280ss.android.ttvecamera.C20652m.C20653a;
import com.p280ss.android.ttvecamera.TECameraFrame;
import com.p280ss.android.ttvecamera.TECameraFrame.ETEPixelFormat;
import com.p280ss.android.ttvecamera.TEFrameSizei;
import com.p280ss.android.ttvecamera.p919f.C20610b.C20612a;
import com.p280ss.android.ttvecamera.p919f.C20613c.C20614a;
import com.p280ss.android.vesdk.C45382z.C45396g;
import com.p280ss.android.vesdk.C45382z.C45402m;
import com.p280ss.android.vesdk.VECameraSettings.C45180a;
import com.p280ss.android.vesdk.VECameraSettings.CAMERA_FACING_ID;
import com.p280ss.android.vesdk.VECameraSettings.CAMERA_FLASH_MODE;
import com.p280ss.android.vesdk.VECameraSettings.CAMERA_TYPE;
import com.p280ss.android.vesdk.VEListener.C45211g;
import com.p280ss.android.vesdk.VEListener.C45223s;
import com.p280ss.android.vesdk.p1773a.C45248a;
import com.p280ss.android.vesdk.p1774b.C45272a;
import com.p280ss.android.vesdk.p1774b.C45273b;
import com.p280ss.android.vesdk.p1774b.C45275c;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.vesdk.k */
public class C45323k implements C20622a, C20640h, C20641i, C45248a {

    /* renamed from: a */
    public static final String f116730a = "k";

    /* renamed from: b */
    protected VECameraSettings f116731b;

    /* renamed from: c */
    protected C20632i f116732c;

    /* renamed from: d */
    protected Context f116733d;

    /* renamed from: e */
    protected VESize f116734e = new VESize(1280, 720);

    /* renamed from: f */
    protected C45396g f116735f;

    /* renamed from: g */
    protected C45402m f116736g;

    /* renamed from: h */
    protected C45211g f116737h;

    /* renamed from: i */
    protected C45223s f116738i;

    /* renamed from: j */
    public C45273b f116739j;

    /* renamed from: k */
    public boolean f116740k;

    /* renamed from: l */
    public C20624c f116741l = new C20624c() {
        /* renamed from: a */
        public final TEFrameSizei mo55793a(List<TEFrameSizei> list, List<TEFrameSizei> list2) {
            if (C45323k.this.f116738i == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (TEFrameSizei tEFrameSizei : list) {
                arrayList.add(new VESize(tEFrameSizei.f55535a, tEFrameSizei.f55536b));
            }
            for (TEFrameSizei tEFrameSizei2 : list2) {
                arrayList2.add(new VESize(tEFrameSizei2.f55535a, tEFrameSizei2.f55536b));
            }
            VESize a = C45323k.this.f116738i.mo108038a(arrayList, arrayList2);
            if (a == null) {
                return null;
            }
            TEFrameSizei tEFrameSizei3 = new TEFrameSizei();
            tEFrameSizei3.f55535a = a.f116385a;
            tEFrameSizei3.f55536b = a.f116386b;
            return tEFrameSizei3;
        }
    };

    /* renamed from: m */
    public C20639g f116742m = new C20639g() {
        /* renamed from: a */
        public final void mo55816a(int i, float f) {
            if (C45323k.this.f116736g != null) {
                C45323k.this.f116736g.mo55990a(i, f);
            }
        }
    };

    /* renamed from: n */
    private C45247a<C45273b> f116743n;

    /* renamed from: o */
    private C20621g f116744o = new C20621g(this, this.f116741l);

    /* renamed from: p */
    private AtomicBoolean f116745p = new AtomicBoolean(false);

    /* renamed from: q */
    private C20612a f116746q = new C20612a() {
        public final void onFrameCaptured(TECameraFrame tECameraFrame) {
            C45273b bVar = C45323k.this.f116739j;
            if (!(bVar == null || bVar.f116501d == null)) {
                bVar.f116501d.onFrameCaptured(tECameraFrame);
            }
            if (!C45323k.this.f116740k) {
                C45211g gVar = C45323k.this.f116737h;
                if (gVar != null) {
                    gVar.mo55988a(3, 0, "Camera first frame captured");
                }
                C45323k.this.f116740k = true;
                C45372t.m143403a(C45323k.f116730a, "Camera first frame captured!!");
            }
        }
    };

    /* renamed from: i */
    public final VECameraSettings mo108193i() {
        return this.f116731b;
    }

    /* renamed from: j */
    public final VESize mo108195j() {
        return this.f116734e;
    }

    /* renamed from: a */
    public final synchronized VESize mo108502a(float f, VESize vESize) {
        TEFrameSizei a = this.f116744o.mo55778a(1.0f / f, vESize != null ? new TEFrameSizei(vESize.f116386b, vESize.f116385a) : null);
        if (a == null) {
            return null;
        }
        this.f116734e.f116385a = a.f55535a;
        this.f116734e.f116386b = a.f55536b;
        this.f116732c.f55731j.f55535a = this.f116734e.f116385a;
        this.f116732c.f55731j.f55536b = this.f116734e.f116386b;
        this.f116731b = new C45180a(this.f116731b).mo107820a(this.f116734e.f116386b, this.f116734e.f116385a).f116145a;
        return this.f116734e;
    }

    /* renamed from: a */
    public final void mo108505a(C45396g gVar) {
        this.f116735f = gVar;
    }

    /* renamed from: a */
    public final void mo108506a(C45402m mVar) {
        this.f116736g = mVar;
        if (this.f116744o != null) {
            C20621g.m68341a(this.f116742m);
        }
    }

    /* renamed from: a */
    public final boolean mo55819a() {
        return this.f116735f != null && this.f116735f.mo55985a();
    }

    /* renamed from: a */
    public final void mo55818a(int i, boolean z, boolean z2, float f, List<Integer> list) {
        if (this.f116735f != null) {
            this.f116735f.mo55984a(i, z, z2, f, list);
        }
    }

    /* renamed from: a */
    public final void mo55817a(int i, float f, boolean z) {
        if (this.f116735f != null) {
            this.f116735f.mo55983a(i, f, z);
        }
    }

    /* renamed from: a */
    public final float[] mo108507a(C20634b bVar) {
        return this.f116744o.mo55780a(bVar);
    }

    /* renamed from: a */
    public final void mo108503a(Bundle bundle) {
        this.f116744o.mo55779a(bundle);
    }

    /* renamed from: d */
    public final int mo108190d() {
        return this.f116744o.mo55784c();
    }

    /* renamed from: g */
    public final boolean mo108508g() {
        return this.f116744o.mo55788f();
    }

    /* renamed from: h */
    public final int mo108509h() {
        return this.f116744o.mo55775a((C20641i) this);
    }

    /* renamed from: e */
    public final int mo108191e() {
        this.f116745p.set(false);
        return this.f116744o.mo55769a();
    }

    /* renamed from: f */
    public final void mo108192f() {
        this.f116735f = null;
        this.f116737h = null;
        this.f116733d = null;
        if (this.f116732c != null) {
            this.f116732c.mo55811a();
            this.f116732c = null;
        }
    }

    /* renamed from: b */
    public final int mo108188b() {
        if (this.f116732c == null || this.f116731b == null) {
            C20652m.m68437d(f116730a, "mCameraParams == null, please init VECameraCapture!");
            return -105;
        } else if (this.f116732c.f55731j.f55535a <= 0 || this.f116732c.f55731j.f55536b <= 0) {
            return -100;
        } else {
            if (this.f116745p.get()) {
                C19752b.f53602a = System.currentTimeMillis();
            }
            this.f116745p.set(true);
            if (this.f116732c.f55724c != this.f116731b.f116129i.ordinal()) {
                this.f116732c = m143237b(this.f116731b);
            }
            return this.f116744o.mo55776a(this.f116732c);
        }
    }

    /* renamed from: c */
    public final int mo108189c() {
        C20612a aVar;
        C20614a aVar2;
        if (this.f116743n == null || this.f116743n.mo108183a()) {
            C45372t.m143409d(f116730a, "start with empty TECapturePipeline list");
            return -100;
        } else if (!this.f116745p.get()) {
            C45372t.m143407c(f116730a, "startPreview when camera is closed!");
            return -105;
        } else {
            boolean z = false;
            boolean equals = "landscape".equals(this.f116731b.f116132l);
            for (C45273b bVar : this.f116743n.mo108185b()) {
                if (bVar == null || !bVar.mo108314b()) {
                    C45372t.m143407c(f116730a, "pipeline is not valid");
                } else {
                    if (bVar.f116502e) {
                        aVar = this.f116746q;
                        this.f116739j = bVar;
                    } else {
                        aVar = bVar.f116501d;
                    }
                    C20612a aVar3 = aVar;
                    if (bVar.f116499b == ETEPixelFormat.PIXEL_FORMAT_OpenGL_OES) {
                        C45275c cVar = (C45275c) bVar;
                        aVar2 = new C20614a(cVar.f116500c, aVar3, cVar.f116502e, cVar.mo108313a(), cVar.f116505a);
                    } else {
                        C45272a aVar4 = (C45272a) bVar;
                        C20614a aVar5 = new C20614a(aVar4.f116500c, aVar3, aVar4.f116502e, aVar4.mo108313a(), aVar4.f116499b, aVar4.f116497a);
                        aVar2 = aVar5;
                    }
                    this.f116744o.mo55774a(aVar2);
                    z = true;
                    bVar.f116503f = equals;
                }
            }
            if (z) {
                return this.f116744o.mo55781b();
            }
            return -1;
        }
    }

    /* renamed from: a */
    public final void mo108504a(C45211g gVar) {
        this.f116737h = gVar;
    }

    /* renamed from: a */
    public final int mo108497a(float f) {
        return this.f116744o.mo55770a(f, (C20641i) this);
    }

    public void onCaptureStopped(int i) {
        if (this.f116737h != null) {
            this.f116737h.mo55988a(5, i, "Camera is closed!");
        }
    }

    /* renamed from: a */
    private static CAMERA_FACING_ID m143235a(int i) {
        if (i == 0) {
            return CAMERA_FACING_ID.FACING_BACK;
        }
        if (i == 1) {
            return CAMERA_FACING_ID.FACING_FRONT;
        }
        if (i == 2) {
            return CAMERA_FACING_ID.FACING_WIDE_ANGLE;
        }
        if (i == 3) {
            return CAMERA_FACING_ID.FACING_TELEPHOTO;
        }
        return CAMERA_FACING_ID.FACING_BACK;
    }

    /* renamed from: b */
    private C20632i m143237b(VECameraSettings vECameraSettings) {
        if (vECameraSettings == null) {
            return null;
        }
        C20632i iVar = new C20632i(this.f116733d);
        iVar.f55724c = vECameraSettings.f116129i.ordinal();
        iVar.f55726e = vECameraSettings.f116130j.ordinal();
        iVar.f55744w = vECameraSettings.f116131k;
        iVar.f55739r = vECameraSettings.f116128h.ordinal();
        iVar.f55731j.f55535a = vECameraSettings.f116126f.f116386b;
        iVar.f55731j.f55536b = vECameraSettings.f116126f.f116385a;
        iVar.f55747z = vECameraSettings.f116125e;
        iVar.f55720A = vECameraSettings.f116133m;
        iVar.f55740s = vECameraSettings.f116144x;
        iVar.f55736o = vECameraSettings.f116134n;
        iVar.f55734m = vECameraSettings.f116135o;
        iVar.f55737p = vECameraSettings.f116141u.ordinal();
        this.f116734e.f116385a = iVar.f55731j.f55535a;
        this.f116734e.f116386b = iVar.f55731j.f55536b;
        iVar.f55746y = vECameraSettings.f116140t;
        iVar.f55730i = vECameraSettings.f116142v;
        iVar.f55735n = vECameraSettings.f116143w;
        iVar.f55740s = vECameraSettings.f116144x;
        return iVar;
    }

    /* renamed from: a */
    public final int mo108500a(CAMERA_FLASH_MODE camera_flash_mode) {
        int i;
        if (camera_flash_mode == CAMERA_FLASH_MODE.CAMERA_FLASH_OFF) {
            i = 0;
        } else if (camera_flash_mode == CAMERA_FLASH_MODE.CAMERA_FLASH_ON) {
            i = 1;
        } else if (camera_flash_mode == CAMERA_FLASH_MODE.CAMERA_FLASH_AUTO) {
            i = 3;
        } else if (camera_flash_mode == CAMERA_FLASH_MODE.CAMERA_FLASH_TORCH) {
            i = 2;
        } else if (camera_flash_mode != CAMERA_FLASH_MODE.CAMERA_FLASH_RED_EYE) {
            return -100;
        } else {
            i = 4;
        }
        return this.f116744o.mo55785c(i);
    }

    /* renamed from: a */
    public final int mo108501a(VECameraSettings vECameraSettings) {
        this.f116731b = vECameraSettings;
        this.f116732c = m143237b(vECameraSettings);
        int b = this.f116744o.mo55782b(this.f116732c);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("currentCamera", vECameraSettings.f116130j.name());
            jSONObject.put("resultCode", b);
            C20469a.m67906a("vesdk_event_recorder_change_camera", jSONObject, "behavior");
        } catch (JSONException unused) {
        }
        return b;
    }

    /* renamed from: a */
    public final int mo108194a(C45247a<C45273b> aVar) {
        this.f116743n = aVar;
        if (this.f116743n != null && !this.f116743n.mo108183a()) {
            return mo108189c();
        }
        C45372t.m143409d(f116730a, "start with empty TECapturePipeline list");
        return -100;
    }

    public void onError(int i, String str) {
        if (this.f116737h != null) {
            this.f116737h.mo55989a(i, str);
        }
    }

    public void onCaptureStarted(int i, int i2) {
        synchronized (this) {
            C20632i iVar = this.f116732c;
            if (iVar != null) {
                this.f116731b.f116130j = m143235a(iVar.f55726e);
            }
        }
        C45211g gVar = this.f116737h;
        if (i2 == 0) {
            mo108189c();
            if (gVar != null) {
                gVar.mo55986a();
                StringBuilder sb = new StringBuilder("Camera type: ");
                sb.append(i);
                gVar.mo55988a(2, i, sb.toString());
            }
        } else if (gVar != null) {
            gVar.mo55987a(i);
        }
    }

    /* renamed from: a */
    public final int mo108499a(Context context, VECameraSettings vECameraSettings) {
        this.f116733d = context;
        this.f116731b = vECameraSettings;
        this.f116732c = m143237b(vECameraSettings);
        C20621g.m68338a(C45372t.m143400a(), (C20653a) new C20653a() {
            /* renamed from: a */
            public final void mo55832a(byte b, String str, String str2) {
                TELogcat.Log(b, str, str2);
            }
        });
        C20621g.m68340a((C20631a) new C20631a() {
            /* renamed from: a */
            public final void mo55808a(String str, double d) {
                C20479f.m67947a(0, str, d);
            }

            /* renamed from: a */
            public final void mo55809a(String str, long j) {
                C20479f.m67948a(0, str, j);
            }

            /* renamed from: a */
            public final void mo55810a(String str, String str2) {
                C20479f.m67949a(0, str, str2);
            }
        });
        return 0;
    }

    /* renamed from: a */
    public static void m143236a(Context context, CAMERA_TYPE camera_type, Bundle bundle) {
        C20621g.m68339a(context, camera_type.ordinal(), bundle);
    }

    /* renamed from: a */
    public final int mo108187a(int i, int i2, C20638f fVar) {
        return this.f116744o.mo55773a(i2, i, fVar);
    }

    public void onInfo(int i, int i2, String str) {
        if (this.f116737h != null) {
            this.f116737h.mo55988a(i, i2, str);
        }
        if (i == 0) {
            this.f116740k = false;
            return;
        }
        if (i == 5 && str != null) {
            String[] split = str.split("x");
            if (split != null && split.length == 2) {
                TEFrameSizei tEFrameSizei = new TEFrameSizei(Integer.valueOf(split[0]).intValue(), Integer.valueOf(split[1]).intValue());
                C45273b bVar = this.f116739j;
                if (!(bVar == null || bVar.f116501d == null)) {
                    bVar.f116501d.mo108315a(tEFrameSizei);
                }
            }
        }
    }

    /* renamed from: a */
    public final int mo108498a(int i, int i2, float f, int i3, int i4) {
        return this.f116744o.mo55772a(i, i2, f, i3, i4);
    }
}

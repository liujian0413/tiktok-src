package com.p280ss.android.ttvecamera;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.os.Bundle;
import com.p280ss.android.ttvecamera.C20630h.C20631a;
import com.p280ss.android.ttvecamera.C20632i.C20633a;
import com.p280ss.android.ttvecamera.C20632i.C20634b;
import com.p280ss.android.ttvecamera.C20632i.C20638f;
import com.p280ss.android.ttvecamera.C20632i.C20639g;
import com.p280ss.android.ttvecamera.C20632i.C20641i;
import com.p280ss.android.ttvecamera.C20652m.C20653a;
import com.p280ss.android.ttvecamera.p917d.C20590c;
import com.p280ss.android.ttvecamera.p917d.C20592e;
import com.p280ss.android.ttvecamera.p919f.C20613c.C20614a;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.ss.android.ttvecamera.g */
public final class C20621g {

    /* renamed from: a */
    protected C20632i f55697a;

    /* renamed from: b */
    protected C20622a f55698b = C20623b.m68366a();

    /* renamed from: c */
    protected C20624c f55699c;

    /* renamed from: com.ss.android.ttvecamera.g$a */
    public interface C20622a {
        void onCaptureStarted(int i, int i2);

        void onCaptureStopped(int i);

        void onError(int i, String str);

        void onInfo(int i, int i2, String str);
    }

    /* renamed from: com.ss.android.ttvecamera.g$b */
    protected static class C20623b implements C20622a {

        /* renamed from: a */
        private static volatile C20623b f55700a;

        protected C20623b() {
        }

        public void onCaptureStarted(int i, int i2) {
        }

        public void onCaptureStopped(int i) {
        }

        public void onError(int i, String str) {
        }

        public void onInfo(int i, int i2, String str) {
        }

        /* renamed from: a */
        public static C20623b m68366a() {
            C20623b bVar;
            synchronized (C20623b.class) {
                if (f55700a == null) {
                    synchronized (C20623b.class) {
                        f55700a = new C20623b();
                    }
                }
                bVar = f55700a;
            }
            return bVar;
        }
    }

    /* renamed from: com.ss.android.ttvecamera.g$c */
    public interface C20624c {
        /* renamed from: a */
        TEFrameSizei mo55793a(List<TEFrameSizei> list, List<TEFrameSizei> list2);
    }

    /* renamed from: a */
    private static boolean m68342a(Context context, int i) {
        return i != 3;
    }

    /* renamed from: d */
    private static int m68345d(int i) {
        return i == 0 ? 1 : 0;
    }

    /* renamed from: a */
    public final int mo55776a(C20632i iVar) {
        this.f55697a = iVar;
        return TECameraServer.INSTANCE.connect(this, this.f55698b, this.f55697a, this.f55699c);
    }

    /* renamed from: a */
    public final int mo55774a(C20614a aVar) {
        return TECameraServer.INSTANCE.addCameraProvider(this, aVar);
    }

    /* renamed from: a */
    public final TEFrameSizei mo55778a(float f, TEFrameSizei tEFrameSizei) {
        return TECameraServer.INSTANCE.getBestPreviewSize(this, f, tEFrameSizei);
    }

    /* renamed from: a */
    public final float[] mo55780a(C20634b bVar) {
        return TECameraServer.INSTANCE.getFOV(this, bVar);
    }

    /* renamed from: a */
    public final int mo55775a(C20641i iVar) {
        return TECameraServer.INSTANCE.queryZoomAbility(this, iVar);
    }

    /* renamed from: a */
    public final int mo55777a(boolean z) {
        return TECameraServer.INSTANCE.toggleTorch(this, z);
    }

    /* renamed from: a */
    public final void mo55779a(Bundle bundle) {
        TECameraServer.INSTANCE.setFeatureParameters(this, bundle);
    }

    /* renamed from: b */
    public final int mo55781b() {
        return TECameraServer.INSTANCE.start(this);
    }

    /* renamed from: c */
    public final int mo55784c() {
        return TECameraServer.INSTANCE.stop(this);
    }

    /* renamed from: e */
    public final C20633a mo55787e() {
        return TECameraServer.INSTANCE.getCameraECInfo(this);
    }

    /* renamed from: f */
    public final boolean mo55788f() {
        return TECameraServer.INSTANCE.isTorchSupported(this);
    }

    /* renamed from: d */
    public final int mo55786d() {
        return TECameraServer.INSTANCE.cancelFocus(this);
    }

    /* renamed from: a */
    public final int mo55769a() {
        return TECameraServer.INSTANCE.disConnect(this);
    }

    /* renamed from: a */
    public static void m68340a(C20631a aVar) {
        C20630h.m68388a(aVar);
    }

    /* renamed from: a */
    public static void m68341a(C20639g gVar) {
        TECameraServer.INSTANCE.setSATZoomCallback(gVar);
    }

    public C20621g(C20622a aVar) {
        this.f55698b = aVar;
    }

    /* renamed from: b */
    public final int mo55782b(C20632i iVar) {
        this.f55697a = iVar;
        return TECameraServer.INSTANCE.switchCamera(this, iVar);
    }

    /* renamed from: c */
    public final int mo55785c(int i) {
        return TECameraServer.INSTANCE.switchFlashMode(this, i);
    }

    /* renamed from: b */
    public final void mo55783b(int i) {
        TECameraServer.INSTANCE.setExposureCompensation(this, i);
    }

    /* renamed from: a */
    public final int mo55771a(int i) {
        return TECameraServer.INSTANCE.switchCamera(this, i);
    }

    /* renamed from: a */
    public static void m68338a(byte b, C20653a aVar) {
        C20652m.m68432a(aVar);
        C20652m.m68433a("VESDK", b);
    }

    public C20621g(C20622a aVar, C20624c cVar) {
        this.f55698b = aVar;
        this.f55699c = cVar;
    }

    /* renamed from: a */
    public final int mo55770a(float f, C20641i iVar) {
        return TECameraServer.INSTANCE.startZoom(this, f, iVar);
    }

    /* renamed from: a */
    public static void m68339a(Context context, int i, Bundle bundle) {
        if (m68342a(context, i) && m68343b(context, i, bundle)) {
            m68344c(context, i, bundle);
        }
    }

    /* renamed from: b */
    private static boolean m68343b(Context context, int i, Bundle bundle) {
        boolean z = false;
        for (String str : bundle.keySet()) {
            if ("device_support_camera".equals(str)) {
                bundle.putBoolean("device_support_camera", m68342a(context, i));
            } else if (!"device_support_wide_angle".equals(str) || i == 1) {
                z = true;
            } else {
                Long valueOf = Long.valueOf(System.currentTimeMillis());
                bundle.putBoolean("device_support_wide_angle", C20590c.m68175a(context, i).mo55725a());
                StringBuilder sb = new StringBuilder("Get wide angle info cost ");
                sb.append(System.currentTimeMillis() - valueOf.longValue());
                sb.append("ms");
                C20652m.m68435b("TECameraCapture", sb.toString());
            }
        }
        return z;
    }

    /* renamed from: c */
    private static void m68344c(Context context, int i, Bundle bundle) {
        String[] cameraIdList;
        try {
            CameraManager cameraManager = (CameraManager) context.getSystemService("camera");
            HashMap hashMap = null;
            for (String str : cameraManager.getCameraIdList()) {
                Integer num = (Integer) cameraManager.getCameraCharacteristics(str).get(CameraCharacteristics.LENS_FACING);
                if (num == null || num.intValue() == 0 || num.intValue() == 1) {
                    for (String equals : bundle.keySet()) {
                        if ("support_anti_shake".equals(equals) && i == 5) {
                            if (hashMap == null) {
                                hashMap = new HashMap();
                            }
                            hashMap.put(Integer.valueOf(m68345d(num.intValue())), Boolean.valueOf(C20592e.m68190b(context, Integer.parseInt(str))));
                            bundle.putSerializable("support_anti_shake", hashMap);
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final int mo55773a(int i, int i2, C20638f fVar) {
        return TECameraServer.INSTANCE.takePicture(this, i, i2, fVar);
    }

    /* renamed from: a */
    public final int mo55772a(int i, int i2, float f, int i3, int i4) {
        return TECameraServer.INSTANCE.focusAtPoint(this, i, i2, f, i3, i4);
    }
}

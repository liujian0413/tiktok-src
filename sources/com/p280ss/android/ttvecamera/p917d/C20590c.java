package com.p280ss.android.ttvecamera.p917d;

import android.content.Context;
import android.graphics.Rect;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureRequest.Builder;
import android.os.Build.VERSION;
import android.util.Range;
import com.p280ss.android.ttvecamera.C20630h;
import com.p280ss.android.ttvecamera.C20642j;
import com.p280ss.android.ttvecamera.C20651l;
import com.p280ss.android.ttvecamera.C20652m;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ttvecamera.d.c */
public class C20590c {

    /* renamed from: a */
    protected static C20590c f55628a;

    /* renamed from: b */
    protected Context f55629b;

    /* renamed from: c */
    private int f55630c;

    /* renamed from: a */
    public boolean mo55728a(int i) {
        return false;
    }

    /* renamed from: a */
    public boolean mo55725a() {
        if (!mo55726b().equals("0")) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public String mo55726b() {
        CameraManager cameraManager = (CameraManager) this.f55629b.getSystemService("camera");
        try {
            return m68177a(cameraManager.getCameraIdList(), cameraManager);
        } catch (CameraAccessException unused) {
            return "0";
        }
    }

    public C20590c(Context context) {
        this.f55629b = context;
    }

    /* renamed from: b */
    public static boolean m68179b(CameraCharacteristics cameraCharacteristics) {
        return ((Boolean) cameraCharacteristics.get(CameraCharacteristics.FLASH_INFO_AVAILABLE)).booleanValue();
    }

    /* renamed from: d */
    public static boolean m68180d(CameraCharacteristics cameraCharacteristics) {
        if (cameraCharacteristics == null) {
            return false;
        }
        int[] iArr = (int[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES);
        if (iArr == null || iArr.length <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public static boolean m68181e(CameraCharacteristics cameraCharacteristics) {
        if (cameraCharacteristics == null || ((Integer) cameraCharacteristics.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AF)).intValue() <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public static boolean m68182f(CameraCharacteristics cameraCharacteristics) {
        if (cameraCharacteristics == null || ((Integer) cameraCharacteristics.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AE)).intValue() <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    private static boolean m68183g(CameraCharacteristics cameraCharacteristics) {
        int[] iArr = (int[]) cameraCharacteristics.get(CameraCharacteristics.LENS_INFO_AVAILABLE_OPTICAL_STABILIZATION);
        if (iArr != null) {
            for (int i : iArr) {
                if (i == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public static float m68174a(CameraCharacteristics cameraCharacteristics) {
        float floatValue = ((Float) cameraCharacteristics.get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM)).floatValue();
        Rect rect = (Rect) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        return Float.valueOf(new DecimalFormat("0.00").format((double) ((((float) (rect.width() - ((int) (((float) rect.width()) / floatValue)))) / floatValue) / ((float) rect.width())))).floatValue();
    }

    /* renamed from: c */
    public boolean mo55730c(CameraCharacteristics cameraCharacteristics) {
        int d = m68180d(cameraCharacteristics);
        if (m68183g(cameraCharacteristics)) {
            d |= 2;
        }
        StringBuilder sb = new StringBuilder("Stabilization type: ");
        sb.append(Integer.toBinaryString(d));
        C20652m.m68434a("TECameraHardware2Proxy", sb.toString());
        C20630h.m68390a("te_record_camera_stabilization", (long) d);
        if (d > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static float m68178b(CameraCharacteristics cameraCharacteristics, int i) {
        float floatValue = ((Float) cameraCharacteristics.get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM)).floatValue();
        if (i != 7) {
            return floatValue / 2.0f;
        }
        return floatValue;
    }

    /* renamed from: a */
    public static String m68177a(String[] strArr, CameraManager cameraManager) {
        String str = "0";
        try {
            int length = strArr.length;
            String str2 = str;
            int i = 0;
            float f = Float.MAX_VALUE;
            while (i < length) {
                try {
                    String str3 = strArr[i];
                    CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str3);
                    Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
                    if (num == null || num.intValue() != 0) {
                        float f2 = ((float[]) cameraCharacteristics.get(CameraCharacteristics.LENS_INFO_AVAILABLE_FOCAL_LENGTHS))[0];
                        if (f2 < f) {
                            str2 = str3;
                            f = f2;
                        }
                    }
                    i++;
                } catch (CameraAccessException unused) {
                    return str2;
                }
            }
            return str2;
        } catch (CameraAccessException unused2) {
            return str;
        }
    }

    /* renamed from: a */
    public static C20590c m68175a(Context context, int i) {
        StringBuilder sb = new StringBuilder("getDeviceProxy:getDeviceProxy  ");
        sb.append(i);
        C20652m.m68434a("TECameraHardware2Proxy", sb.toString());
        if (f55628a == null) {
            synchronized (C20590c.class) {
                if (f55628a == null) {
                    if (i == 4) {
                        f55628a = new C20595g(context);
                    } else if (i == 5) {
                        f55628a = new C20596h(context);
                    } else {
                        if (i != 3) {
                            if (i != 6) {
                                if (i == 7) {
                                    f55628a = new C20598i(context);
                                } else if (C20589b.m68171a()) {
                                    f55628a = new C20594f(context);
                                } else if (C20589b.m68172b()) {
                                    f55628a = new C20591d(context);
                                } else if (C20589b.m68173c()) {
                                    f55628a = new C20588a(context);
                                } else {
                                    C20652m.m68437d("TECameraHardware2Proxy", "Unknown platform");
                                    f55628a = new C20590c(context);
                                }
                            }
                        }
                        f55628a = new C20588a(context);
                    }
                }
            }
        }
        return f55628a;
    }

    /* renamed from: a */
    public final boolean mo55729a(CameraCharacteristics cameraCharacteristics, int i) {
        if (cameraCharacteristics == null) {
            return false;
        }
        int intValue = ((Integer) cameraCharacteristics.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL)).intValue();
        if (intValue < 0 || intValue > 3) {
            StringBuilder sb = new StringBuilder("Invalid hardware level = ");
            sb.append(intValue);
            C20652m.m68437d("TECameraHardware2Proxy", sb.toString());
            return false;
        }
        this.f55630c = C20589b.f55627b[intValue];
        C20630h.m68390a("te_record_camera_hardware_level", (long) this.f55630c);
        if (VERSION.SDK_INT < 22 && intValue == 2) {
            return false;
        }
        if (this.f55630c >= i) {
            StringBuilder sb2 = new StringBuilder("Camera hardware level supported, deviceLevel = ");
            sb2.append(this.f55630c);
            sb2.append(", require = ");
            sb2.append(i);
            C20652m.m68434a("TECameraHardware2Proxy", sb2.toString());
            return true;
        }
        StringBuilder sb3 = new StringBuilder("Camera hardware level not supported, deviceLevel = ");
        sb3.append(this.f55630c);
        sb3.append(", require = ");
        sb3.append(i);
        C20652m.m68437d("TECameraHardware2Proxy", sb3.toString());
        return false;
    }

    /* renamed from: a */
    public static C20651l m68176a(CameraCharacteristics cameraCharacteristics, int i, int i2) {
        C20651l lVar = new C20651l(1, 30);
        if (cameraCharacteristics == null) {
            return lVar;
        }
        Range[] rangeArr = (Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        if (rangeArr == null) {
            return lVar;
        }
        ArrayList arrayList = new ArrayList(rangeArr.length);
        int i3 = lVar.f55777c;
        int i4 = 0;
        for (Range range : rangeArr) {
            int[] iArr = {((Integer) range.getLower()).intValue() * i3, ((Integer) range.getUpper()).intValue() * i3};
            arrayList.add(iArr);
            if (i4 < iArr[1]) {
                i4 = iArr[1];
            }
            StringBuilder sb = new StringBuilder("Fps Range: [");
            sb.append(iArr[0]);
            sb.append(", ");
            sb.append(iArr[1]);
            sb.append("]");
            C20652m.m68435b("TECameraHardware2Proxy", sb.toString());
        }
        C20630h.m68390a("te_record_camera_max_fps", (long) i4);
        int[] a = C20642j.m68418a(lVar.mo55827a(), (List<int[]>) arrayList);
        lVar.f55775a = a[0];
        lVar.f55776b = a[1];
        return lVar;
    }

    /* renamed from: a */
    public int mo55727a(CameraCharacteristics cameraCharacteristics, Builder builder, boolean z) {
        if (cameraCharacteristics == null || builder == null) {
            return -100;
        }
        if (!z) {
            builder.set(CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE, Integer.valueOf(0));
            builder.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, Integer.valueOf(0));
            return 0;
        }
        int[] iArr = (int[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES);
        if (iArr != null) {
            for (int i : iArr) {
                StringBuilder sb = new StringBuilder("EIS mode: ");
                sb.append(i);
                C20652m.m68434a("TECameraHardware2Proxy", sb.toString());
                if (i == 1) {
                    builder.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, Integer.valueOf(1));
                    builder.set(CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE, Integer.valueOf(0));
                    C20652m.m68434a("TECameraHardware2Proxy", "Enable EIS");
                    return 0;
                }
            }
        } else {
            C20652m.m68434a("TECameraHardware2Proxy", "Don't supported EIS");
        }
        int[] iArr2 = (int[]) cameraCharacteristics.get(CameraCharacteristics.LENS_INFO_AVAILABLE_OPTICAL_STABILIZATION);
        if (iArr2 != null) {
            for (int i2 : iArr2) {
                StringBuilder sb2 = new StringBuilder("OIS mode: ");
                sb2.append(i2);
                C20652m.m68434a("TECameraHardware2Proxy", sb2.toString());
                if (i2 == 1) {
                    builder.set(CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE, Integer.valueOf(1));
                    builder.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, Integer.valueOf(0));
                    C20652m.m68434a("TECameraHardware2Proxy", "Enable OIS");
                    return 0;
                }
            }
        } else {
            C20652m.m68434a("TECameraHardware2Proxy", "Don't supported OIS");
        }
        return -200;
    }
}

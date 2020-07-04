package com.p280ss.android.ttvecamera.p914a;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Handler;
import com.p280ss.android.ttvecamera.C20599e;
import com.p280ss.android.ttvecamera.C20630h;
import com.p280ss.android.ttvecamera.C20642j;
import com.p280ss.android.ttvecamera.C20652m;
import com.p280ss.android.ttvecamera.p916c.C20581b;
import com.p280ss.android.ttvecamera.p917d.C20590c;
import com.p280ss.android.ttvecamera.p917d.C20595g;

/* renamed from: com.ss.android.ttvecamera.a.b */
public abstract class C20553b extends C20581b {

    /* renamed from: a */
    protected CameraManager f55543a;

    /* renamed from: b */
    protected CameraDevice f55544b;

    /* renamed from: a */
    public final Object mo55624a() {
        return this.f55544b;
    }

    /* renamed from: a */
    public final void mo55626a(Object obj) throws ClassCastException {
        this.f55544b = (CameraDevice) obj;
    }

    /* renamed from: a */
    public String mo55625a(int i) throws CameraAccessException {
        int i2;
        String[] cameraIdList = this.f55543a.getCameraIdList();
        String str = null;
        if (cameraIdList == null) {
            C20652m.m68436c("TECamera2Mode", "cameraList is null");
            return null;
        }
        C20630h.m68390a("te_record_camera_size", (long) cameraIdList.length);
        StringBuilder sb = new StringBuilder("selectCamera cameraList.size: ");
        sb.append(cameraIdList.length);
        C20652m.m68434a("TECamera2Mode", sb.toString());
        if (i != 2) {
            if (i >= cameraIdList.length || i < 0) {
                i = 1;
            }
            this.f55602h.f55726e = i;
            int length = cameraIdList.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                }
                String str2 = cameraIdList[i3];
                if (((Integer) this.f55543a.getCameraCharacteristics(str2).get(CameraCharacteristics.LENS_FACING)).intValue() == 1) {
                    i2 = 0;
                } else {
                    i2 = 1;
                }
                if (i2 == i) {
                    str = str2;
                    break;
                }
                i3++;
            }
        } else if (this.f55602h.f55724c == 4) {
            str = C20595g.m68191b(21);
        } else if (this.f55602h.f55744w.length() <= 0 || this.f55602h.f55744w.equals("-1")) {
            str = C20590c.m68177a(cameraIdList, this.f55543a);
        } else {
            StringBuilder sb2 = new StringBuilder("Wide-angle camera id: ");
            sb2.append(this.f55602h.f55744w);
            C20652m.m68434a("TECamera2Mode", sb2.toString());
            if (C20642j.m68417a(cameraIdList, this.f55602h.f55744w)) {
                str = this.f55602h.f55744w;
            } else {
                StringBuilder sb3 = new StringBuilder("Maybe this is not validate camera id: ");
                sb3.append(this.f55602h.f55744w);
                C20652m.m68436c("TECamera2Mode", sb3.toString());
            }
        }
        if (str == null) {
            C20652m.m68436c("TECamera2Mode", "selectCamera: camera tag is null, set 0 for default");
            str = "0";
            this.f55602h.f55726e = 0;
        }
        StringBuilder sb4 = new StringBuilder("selectCamera mCameraSettings.mFacing: ");
        sb4.append(this.f55602h.f55726e);
        C20652m.m68434a("TECamera2Mode", sb4.toString());
        StringBuilder sb5 = new StringBuilder("selectCamera cameraTag: ");
        sb5.append(str);
        C20652m.m68434a("TECamera2Mode", sb5.toString());
        this.f55605k = this.f55543a.getCameraCharacteristics(str);
        return str;
    }

    public C20553b(C20599e eVar, Context context, CameraManager cameraManager, Handler handler) {
        super(eVar, context, handler);
        this.f55543a = cameraManager;
    }
}

package com.p280ss.android.ttvecamera.p918e;

import android.content.Context;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.view.Surface;
import com.p280ss.android.ttvecamera.C20599e;
import com.p280ss.android.ttvecamera.C20652m;
import com.p280ss.android.ttvecamera.p914a.C20554c;
import com.p280ss.android.ttvecamera.p919f.C20613c;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.ss.android.ttvecamera.e.b */
public final class C20602b extends C20554c {
    /* renamed from: f */
    public final int mo55635f() throws Exception {
        mo55636g();
        C20613c cVar = this.f55601g.f55654n;
        if (this.f55544b == null || cVar == null) {
            C20652m.m68435b("TEImage2Mode", "CameraDevice or ProviderManager is null!");
            return -100;
        }
        int k = super.mo55710k();
        if (k != 0) {
            return k;
        }
        mo55627a(this.f55602h.f55732k.f55535a, this.f55602h.f55732k.f55536b);
        this.f55608n = this.f55544b.createCaptureRequest(1);
        ArrayList<Surface> arrayList = new ArrayList<>();
        if (cVar.f55676b.mo55748c() == 8) {
            arrayList.addAll(Arrays.asList(cVar.mo55761d()));
        } else {
            arrayList.add(cVar.mo55760c());
        }
        for (Surface addTarget : arrayList) {
            this.f55608n.addTarget(addTarget);
        }
        arrayList.add(this.f55546d.getSurface());
        if (this.f55602h.f55720A) {
            ((C20601a) this.f55601g).mo55735f(arrayList.size());
        }
        this.f55608n.set(CaptureRequest.CONTROL_AF_MODE, Integer.valueOf(4));
        this.f55544b.createCaptureSession(arrayList, this.f55617w, this.f55604j);
        return 0;
    }

    public C20602b(C20599e eVar, Context context, CameraManager cameraManager, Handler handler) {
        super(eVar, context, cameraManager, handler);
    }
}

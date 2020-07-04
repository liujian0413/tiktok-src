package com.p280ss.android.ttvecamera.p914a;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.view.Surface;
import com.p280ss.android.ttvecamera.C20599e;
import com.p280ss.android.ttvecamera.C20604f.C20605a;
import com.p280ss.android.ttvecamera.C20652m;
import com.p280ss.android.ttvecamera.p915b.C20570e;
import com.p280ss.android.ttvecamera.p919f.C20613c;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.ss.android.ttvecamera.a.d */
public class C20561d extends C20553b {

    /* renamed from: c */
    private static final String f55557c = "d";

    /* renamed from: i */
    public final int mo55638i() {
        if (this.f55608n == null || this.f55616v == null) {
            this.f55600f.mo55580a(this.f55602h.f55724c, -100, "rollbackNormalSessionRequest : param is null.");
            return -100;
        }
        this.f55608n.set(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(1));
        this.f55607m = this.f55608n.build();
        try {
            this.f55616v.setRepeatingRequest(this.f55607m, this.f55618x, this.f55604j);
        } catch (CameraAccessException unused) {
        }
        return 0;
    }

    /* renamed from: f */
    public int mo55635f() throws Exception {
        C20613c cVar = this.f55601g.f55654n;
        if (this.f55544b == null || cVar == null) {
            C20652m.m68435b(f55557c, "CameraDevice or ProviderManager is null!");
            return -100;
        }
        int k = super.mo55710k();
        if (k != 0) {
            return k;
        }
        this.f55608n = this.f55544b.createCaptureRequest(3);
        ArrayList<Surface> arrayList = new ArrayList<>();
        if (cVar.f55676b.mo55748c() == 8) {
            arrayList.addAll(Arrays.asList(cVar.mo55761d()));
        } else {
            arrayList.add(cVar.mo55760c());
        }
        for (Surface addTarget : arrayList) {
            this.f55608n.addTarget(addTarget);
        }
        this.f55544b.createCaptureSession(arrayList, this.f55617w, this.f55604j);
        return 0;
    }

    /* renamed from: h */
    public final int mo55637h() {
        if (this.f55608n == null || this.f55616v == null) {
            this.f55600f.mo55580a(this.f55602h.f55724c, -100, "rollbackNormalSessionRequest : param is null.");
            return -100;
        }
        this.f55608n.set(CaptureRequest.CONTROL_AF_TRIGGER, Integer.valueOf(2));
        this.f55608n.set(CaptureRequest.CONTROL_AF_MODE, Integer.valueOf(3));
        this.f55608n.set(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(1));
        this.f55607m = this.f55608n.build();
        try {
            this.f55616v.setRepeatingRequest(this.f55607m, this.f55618x, this.f55604j);
        } catch (CameraAccessException unused) {
        }
        return 0;
    }

    /* renamed from: b */
    public final void mo55631b(int i) {
        if (this.f55608n == null || this.f55616v == null) {
            String str = "Capture Session is null";
            String str2 = f55557c;
            StringBuilder sb = new StringBuilder("switchFlashMode: ");
            sb.append(str);
            C20652m.m68437d(str2, sb.toString());
            C20605a aVar = this.f55600f;
            int i2 = this.f55602h.f55724c;
            StringBuilder sb2 = new StringBuilder("switchFlashMode:");
            sb2.append(str);
            aVar.mo55580a(i2, -100, sb2.toString());
            return;
        }
        if (i == 0) {
            this.f55608n.set(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(1));
            this.f55608n.set(CaptureRequest.FLASH_MODE, Integer.valueOf(0));
        } else if (i != 2) {
            String str3 = f55557c;
            StringBuilder sb3 = new StringBuilder("Video Mode not support this mode : ");
            sb3.append(i);
            C20652m.m68436c(str3, sb3.toString());
            return;
        } else {
            this.f55608n.set(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(1));
            this.f55608n.set(CaptureRequest.FLASH_MODE, Integer.valueOf(2));
        }
        try {
            this.f55602h.f55721B = i;
            this.f55607m = this.f55608n.build();
            this.f55616v.setRepeatingRequest(this.f55607m, this.f55618x, this.f55604j);
        } catch (CameraAccessException unused) {
            this.f55600f.mo55580a(this.f55602h.f55724c, -418, "switch flash failed.");
        }
    }

    public C20561d(C20599e eVar, Context context, CameraManager cameraManager, Handler handler) {
        super(eVar, context, cameraManager, handler);
        this.f55615u = new C20570e(this);
    }
}

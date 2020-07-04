package com.p280ss.android.ttvecamera.p919f;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.hardware.Camera.PreviewCallback;
import android.view.Surface;
import com.p280ss.android.ttvecamera.C20604f;
import com.p280ss.android.ttvecamera.C20642j;
import com.p280ss.android.ttvecamera.TECameraFrame;
import com.p280ss.android.ttvecamera.TECameraFrame.ETEPixelFormat;
import com.p280ss.android.ttvecamera.TEFrameSizei;
import com.p280ss.android.ttvecamera.p919f.C20613c.C20614a;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import java.lang.reflect.Array;
import java.util.List;

/* renamed from: com.ss.android.ttvecamera.f.a */
public class C20608a extends C20610b {

    /* renamed from: h */
    private static final String f55662h = "a";

    /* renamed from: a */
    public PreviewCallback f55663a;

    /* renamed from: i */
    private int f55664i;

    /* renamed from: j */
    private SurfaceTexture f55665j;

    /* renamed from: a */
    public final Surface mo55744a() {
        return null;
    }

    /* renamed from: b */
    public final SurfaceTexture mo55747b() {
        return this.f55665j;
    }

    /* renamed from: c */
    public final int mo55748c() {
        return 4;
    }

    /* renamed from: a */
    public final byte[][] mo55746a(int i) {
        return (byte[][]) Array.newInstance(byte.class, new int[]{3, ((this.f55670d.f55535a * this.f55670d.f55536b) * 3) / 2});
    }

    /* renamed from: a */
    public final boolean mo55745a(byte[] bArr) {
        int i;
        boolean z;
        if (bArr != null) {
            i = bArr.length;
        } else {
            i = 0;
        }
        if (i > 0 && this.f55670d != null && this.f55664i < 3) {
            this.f55664i++;
            int i2 = this.f55670d.f55535a * this.f55670d.f55536b;
            int i3 = i2 / C34943c.f91128x;
            int i4 = i3 / 2;
            byte b = bArr[0];
            byte b2 = bArr[i2];
            int i5 = 0;
            while (true) {
                if (i5 >= 300) {
                    z = false;
                    break;
                } else if (b == bArr[i5 * i3] && b2 == bArr[(i5 * i4) + i2]) {
                    i5++;
                } else {
                    z = true;
                }
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    public C20608a(C20614a aVar, C20604f fVar) {
        super(aVar, fVar);
        this.f55665j = aVar.f55680d;
    }

    /* renamed from: a */
    public final int mo55743a(List<TEFrameSizei> list, TEFrameSizei tEFrameSizei) {
        if (list != null && list.size() > 0) {
            this.f55670d = C20642j.m68410a(list, tEFrameSizei);
        }
        this.f55665j.setDefaultBufferSize(this.f55670d.f55535a, this.f55670d.f55536b);
        this.f55663a = new PreviewCallback() {
            public final void onPreviewFrame(byte[] bArr, Camera camera) {
                if (C20608a.this.mo55745a(bArr)) {
                    TECameraFrame tECameraFrame = new TECameraFrame(C20608a.this.f55670d.f55535a, C20608a.this.f55670d.f55536b, System.currentTimeMillis() * 1000);
                    tECameraFrame.mo55506a(bArr, C20608a.this.f55671e.mo55739r(), ETEPixelFormat.PIXEL_FORMAT_NV21, C20608a.this.f55671e.f55648h.f55726e);
                    C20608a.this.mo55751a(tECameraFrame);
                }
                if (camera != null) {
                    camera.addCallbackBuffer(bArr);
                }
            }
        };
        return 0;
    }
}

package com.p280ss.android.ttvecamera.p919f;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.Image;
import android.media.ImageReader;
import android.media.ImageReader.OnImageAvailableListener;
import android.view.Surface;
import com.p280ss.android.ttvecamera.C20604f;
import com.p280ss.android.ttvecamera.C20642j;
import com.p280ss.android.ttvecamera.C20654n;
import com.p280ss.android.ttvecamera.TECameraFrame;
import com.p280ss.android.ttvecamera.TECameraFrame.ETEPixelFormat;
import com.p280ss.android.ttvecamera.TEFrameSizei;
import com.p280ss.android.ttvecamera.p919f.C20613c.C20614a;
import java.util.List;

/* renamed from: com.ss.android.ttvecamera.f.d */
public final class C20615d extends C20610b {

    /* renamed from: a */
    ImageReader f55684a;

    /* renamed from: b */
    public final SurfaceTexture mo55747b() {
        return null;
    }

    /* renamed from: c */
    public final int mo55748c() {
        return 2;
    }

    /* renamed from: a */
    public final Surface mo55744a() {
        if (this.f55684a != null) {
            return this.f55684a.getSurface();
        }
        return null;
    }

    /* renamed from: d */
    public final void mo55752d() {
        super.mo55752d();
        if (this.f55684a != null) {
            this.f55684a.close();
            this.f55684a = null;
        }
    }

    public C20615d(C20614a aVar, C20604f fVar) {
        super(aVar, fVar);
    }

    /* renamed from: a */
    public final int mo55750a(StreamConfigurationMap streamConfigurationMap, TEFrameSizei tEFrameSizei) {
        int[] outputFormats = streamConfigurationMap.getOutputFormats();
        int a = TECameraFrame.m68015a(this.f55669c);
        int length = outputFormats.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            int i3 = outputFormats[i2];
            if (i3 == a) {
                i = i3;
                break;
            }
            i2++;
        }
        if (i == 0) {
            i = 35;
            this.f55669c = ETEPixelFormat.PIXEL_FORMAT_YUV420;
        }
        return mo55743a(m68298a(streamConfigurationMap.getOutputSizes(i)), tEFrameSizei);
    }

    /* renamed from: a */
    public final int mo55743a(List<TEFrameSizei> list, TEFrameSizei tEFrameSizei) {
        if (list != null && list.size() > 0) {
            this.f55670d = C20642j.m68410a(list, this.f55670d);
        }
        this.f55684a = ImageReader.newInstance(this.f55670d.f55535a, this.f55670d.f55536b, TECameraFrame.m68015a(this.f55669c), 1);
        this.f55684a.setOnImageAvailableListener(new OnImageAvailableListener() {
            public final void onImageAvailable(ImageReader imageReader) {
                Image acquireLatestImage = imageReader.acquireLatestImage();
                if (acquireLatestImage != null) {
                    try {
                        TECameraFrame tECameraFrame = new TECameraFrame(acquireLatestImage.getWidth(), acquireLatestImage.getHeight(), System.currentTimeMillis() * 1000);
                        tECameraFrame.mo55505a(new C20654n(acquireLatestImage.getPlanes()), C20615d.this.f55671e.mo55739r(), C20615d.this.f55669c, C20615d.this.f55671e.f55655o);
                        C20615d.this.mo55751a(tECameraFrame);
                    } catch (Exception unused) {
                    } finally {
                        acquireLatestImage.close();
                    }
                }
            }
        }, this.f55671e.f55651k);
        return 0;
    }
}

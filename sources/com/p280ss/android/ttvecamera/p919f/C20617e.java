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

/* renamed from: com.ss.android.ttvecamera.f.e */
public final class C20617e extends C20610b {

    /* renamed from: a */
    SurfaceTexture f55686a;

    /* renamed from: h */
    float[] f55687h = new float[16];

    /* renamed from: i */
    int f55688i;

    /* renamed from: j */
    ImageReader[] f55689j;

    /* renamed from: k */
    Surface[] f55690k;

    /* renamed from: b */
    public final SurfaceTexture mo55747b() {
        return this.f55686a;
    }

    /* renamed from: c */
    public final int mo55748c() {
        return 8;
    }

    /* renamed from: e */
    public final Surface[] mo55753e() {
        return this.f55690k;
    }

    /* renamed from: a */
    public final Surface mo55744a() {
        if (this.f55690k != null) {
            return this.f55690k[0];
        }
        return null;
    }

    /* renamed from: d */
    public final void mo55752d() {
        super.mo55752d();
        if (this.f55689j != null) {
            for (ImageReader close : this.f55689j) {
                close.close();
            }
            this.f55689j = null;
        }
        if (this.f55686a != null && this.f55690k != null && this.f55690k[0] != null) {
            this.f55690k[0].release();
        }
    }

    public C20617e(C20614a aVar, C20604f fVar) {
        int i;
        super(aVar, fVar);
        this.f55686a = aVar.f55680d;
        this.f55688i = aVar.f55681e;
        this.f55689j = new ImageReader[this.f55673g];
        if (this.f55686a != null) {
            i = this.f55673g + 1;
        } else {
            i = this.f55673g;
        }
        this.f55690k = new Surface[i];
        if (this.f55686a != null) {
            this.f55690k[0] = new Surface(this.f55686a);
        }
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
        if (this.f55686a != null) {
            this.f55686a.setDefaultBufferSize(this.f55670d.f55535a, this.f55670d.f55536b);
        }
        for (int i = 0; i < this.f55673g; i++) {
            this.f55689j[i] = ImageReader.newInstance(this.f55670d.f55535a, this.f55670d.f55536b, TECameraFrame.m68015a(this.f55669c), 1);
            this.f55689j[i].setOnImageAvailableListener(new OnImageAvailableListener() {
                public final void onImageAvailable(ImageReader imageReader) {
                    Image acquireNextImage = imageReader.acquireNextImage();
                    if (acquireNextImage != null) {
                        TECameraFrame tECameraFrame = new TECameraFrame(acquireNextImage.getWidth(), acquireNextImage.getHeight(), System.currentTimeMillis() * 1000);
                        tECameraFrame.mo55505a(new C20654n(acquireNextImage.getPlanes()), C20617e.this.f55671e.mo55739r(), C20617e.this.f55669c, C20617e.this.f55671e.f55655o);
                        C20617e.this.mo55751a(tECameraFrame);
                        acquireNextImage.close();
                    }
                }
            }, this.f55671e.f55651k);
            if (this.f55686a != null) {
                this.f55690k[i + 1] = this.f55689j[i].getSurface();
            } else {
                this.f55690k[i] = this.f55689j[i].getSurface();
            }
        }
        return 0;
    }
}

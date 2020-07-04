package com.p280ss.android.ttve.nativePort;

import android.media.Image;
import android.media.ImageReader;
import android.media.ImageReader.OnImageAvailableListener;
import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaCodec.Callback;
import android.media.MediaCodec.CodecException;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.HandlerThread;
import com.p280ss.android.ttve.common.C20443a;
import com.p280ss.android.ttve.common.TEImageUtils;
import com.p280ss.android.ttve.model.C20466f;
import com.p280ss.android.ttve.model.VEFrame;
import com.p280ss.android.ttve.model.VEFrame.ByteBufferFrame;
import com.p280ss.android.ttve.model.VEFrame.ETEPixelFormat;
import com.p280ss.android.ttve.model.VEFrame.Operation;
import com.p280ss.android.vesdk.C45332o;
import com.p280ss.android.vesdk.C45372t;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.ttve.nativePort.a */
public final class C20490a {

    /* renamed from: y */
    private static String f55372y;

    /* renamed from: z */
    private static String f55373z;

    /* renamed from: a */
    public String f55374a = "HwFrameExtractor_";

    /* renamed from: b */
    String f55375b;

    /* renamed from: c */
    int[] f55376c;

    /* renamed from: d */
    int f55377d;

    /* renamed from: e */
    int f55378e;

    /* renamed from: f */
    boolean f55379f;

    /* renamed from: g */
    int f55380g;

    /* renamed from: h */
    C45332o f55381h;

    /* renamed from: i */
    VEFrame f55382i;

    /* renamed from: j */
    VEFrame f55383j;

    /* renamed from: k */
    VEFrame f55384k;

    /* renamed from: l */
    VEFrame f55385l;

    /* renamed from: m */
    MediaCodec f55386m = null;

    /* renamed from: n */
    long f55387n;

    /* renamed from: o */
    int f55388o;

    /* renamed from: p */
    public int f55389p;

    /* renamed from: q */
    public int f55390q;

    /* renamed from: r */
    HandlerThread f55391r;

    /* renamed from: s */
    HandlerThread f55392s;

    /* renamed from: t */
    ImageReader f55393t;

    /* renamed from: u */
    int f55394u;

    /* renamed from: v */
    boolean f55395v;

    /* renamed from: w */
    boolean f55396w;

    /* renamed from: x */
    private long f55397x = Thread.currentThread().getId();

    /* renamed from: d */
    private void m67995d() {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(this.f55377d * this.f55378e * 4);
        allocateDirect.clear();
        this.f55382i = VEFrame.createByteBufferFrame(allocateDirect, this.f55377d, this.f55378e, 0, 0, ETEPixelFormat.TEPixFmt_ARGB8);
    }

    /* renamed from: b */
    public final void mo55462b() {
        try {
            C45372t.m143403a(this.f55374a, "stop begin");
            if (this.f55393t != null) {
                this.f55386m.reset();
                this.f55386m.release();
            }
            if (this.f55393t != null) {
                this.f55393t.close();
            }
            if (this.f55392s != null) {
                this.f55392s.quitSafely();
            }
            if (this.f55391r != null) {
                this.f55391r.quitSafely();
            }
        } catch (Exception unused) {
            C45372t.m143403a(this.f55374a, "stop crash");
            mo55463c();
        }
    }

    /* renamed from: e */
    private static void m67996e() {
        if (f55372y == null || f55373z == null) {
            String lowerCase = C20443a.m67835a().toLowerCase();
            if (lowerCase.contains("qualcomm")) {
                f55372y = "qualcomm";
                if (lowerCase.contains("sdm660")) {
                    f55373z = "sdm660";
                } else if (lowerCase.contains("msm8994")) {
                    f55373z = "msm8994";
                } else if (lowerCase.contains("sdm845")) {
                    f55373z = "sdm845";
                } else if (lowerCase.contains("sm8150")) {
                    f55373z = "sm8150";
                } else {
                    f55373z = "";
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo55463c() {
        this.f55395v = true;
        String str = this.f55374a;
        StringBuilder sb = new StringBuilder("processFrameLast begin hasProcessCount:");
        sb.append(this.f55394u);
        sb.append(" ptsMsLength: ");
        sb.append(this.f55376c.length);
        C45372t.m143403a(str, sb.toString());
        while (this.f55394u < this.f55376c.length * this.f55380g) {
            String str2 = this.f55374a;
            StringBuilder sb2 = new StringBuilder("processFrameLast processing hasProcxessCount:");
            sb2.append(this.f55394u);
            sb2.append(" ptsMsLength: ");
            sb2.append(this.f55376c.length);
            C45372t.m143403a(str2, sb2.toString());
            if (!this.f55381h.processFrame(null, this.f55377d, this.f55378e, 0)) {
                String str3 = this.f55374a;
                StringBuilder sb3 = new StringBuilder("processFrameLast stop hasProcxessCount:");
                sb3.append(this.f55394u);
                sb3.append(" ptsMsLength: ");
                sb3.append(this.f55376c.length);
                C45372t.m143403a(str3, sb3.toString());
                return;
            }
            this.f55394u += this.f55380g;
        }
    }

    /* renamed from: a */
    public final void mo55460a() {
        boolean z;
        try {
            C45372t.m143403a(this.f55374a, "method start begin");
            if (this.f55376c.length <= 0) {
                String str = this.f55374a;
                StringBuilder sb = new StringBuilder("ptsMs.length is wrong: ");
                sb.append(this.f55376c.length);
                C45372t.m143403a(str, sb.toString());
                return;
            }
            m67996e();
            this.f55387n = System.currentTimeMillis();
            final MediaExtractor mediaExtractor = new MediaExtractor();
            mediaExtractor.setDataSource(this.f55375b);
            int i = this.f55377d;
            int i2 = this.f55378e;
            MediaFormat mediaFormat = null;
            for (int i3 = 0; i3 < mediaExtractor.getTrackCount(); i3++) {
                MediaFormat trackFormat = mediaExtractor.getTrackFormat(i3);
                if (trackFormat.getString("mime").startsWith("video")) {
                    this.f55389p = trackFormat.getInteger("width");
                    this.f55390q = trackFormat.getInteger("height");
                    this.f55388o = trackFormat.getInteger("rotation-degrees");
                    if (this.f55388o != 0) {
                        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(((this.f55377d * this.f55378e) * 3) / 2);
                        allocateDirect.clear();
                        this.f55385l = VEFrame.createByteBufferFrame(allocateDirect, this.f55377d, this.f55378e, 0, 0, ETEPixelFormat.TEPixFmt_YUV420P);
                        if (this.f55388o == 90 || this.f55388o == 270) {
                            i = this.f55378e;
                            i2 = this.f55377d;
                        }
                    }
                    mediaExtractor.selectTrack(i3);
                    mediaFormat = trackFormat;
                }
            }
            if (this.f55383j == null) {
                ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(((i * i2) * 3) / 2);
                allocateDirect2.clear();
                this.f55383j = VEFrame.createByteBufferFrame(allocateDirect2, i, i2, this.f55388o, 0, ETEPixelFormat.TEPixFmt_YUV420P);
            }
            this.f55386m = MediaCodec.createDecoderByType("video/avc");
            final ArrayList arrayList = new ArrayList();
            mediaExtractor.seekTo((long) this.f55376c[0], 2);
            ArrayList arrayList2 = new ArrayList();
            int i4 = this.f55380g;
            while (true) {
                long sampleTime = mediaExtractor.getSampleTime();
                if (sampleTime < 0 && mediaExtractor.advance()) {
                    this.f55396w = true;
                    break;
                }
                arrayList2.add(Long.valueOf(sampleTime));
                if (mediaExtractor.getSampleFlags() == 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    arrayList.add(Long.valueOf(sampleTime));
                }
                if (sampleTime > ((long) this.f55376c[this.f55376c.length - 1]) && z) {
                    i4--;
                }
                if (mediaExtractor.advance()) {
                    if (i4 <= 0) {
                        break;
                    }
                } else {
                    break;
                }
            }
            if (this.f55396w) {
                C45372t.m143403a(this.f55374a, "start wrong");
                mo55463c();
                return;
            }
            Collections.sort(arrayList2);
            final List[] listArr = new List[this.f55376c.length];
            int size = arrayList2.size();
            int i5 = 0;
            int i6 = 0;
            while (i5 < size && i6 < this.f55376c.length) {
                if (((Long) arrayList2.get(i5)).longValue() < ((long) this.f55376c[i6])) {
                    i5++;
                } else {
                    if (listArr[i6] == null) {
                        listArr[i6] = new ArrayList();
                    }
                    for (int i7 = 0; i7 < this.f55380g; i7++) {
                        int i8 = i5 + i7;
                        if (i8 < size) {
                            listArr[i6].add(arrayList2.get(i8));
                        }
                    }
                    i5++;
                    i6++;
                }
            }
            if (listArr[this.f55376c.length - 1] != null && listArr[this.f55376c.length - 1].size() == 1) {
                listArr[this.f55376c.length - 1].add(listArr[this.f55376c.length - 1].get(0));
                listArr[this.f55376c.length - 1].set(0, arrayList2.get(arrayList2.size() - 2));
            }
            for (int i9 = 0; i9 < arrayList2.size(); i9++) {
                String str2 = this.f55374a;
                StringBuilder sb2 = new StringBuilder("pts value:");
                sb2.append(arrayList2.get(i9));
                C45372t.m143403a(str2, sb2.toString());
            }
            for (List list : listArr) {
                for (int i10 = 0; i10 < list.size(); i10++) {
                    String str3 = this.f55374a;
                    StringBuilder sb3 = new StringBuilder("sensArray i: ");
                    sb3.append(i10);
                    sb3.append(" value: ");
                    sb3.append(list.get(i10).toString());
                    C45372t.m143403a(str3, sb3.toString());
                }
            }
            mediaExtractor.seekTo((long) this.f55376c[0], 0);
            this.f55391r = new HandlerThread("MediaCodec Callback");
            this.f55391r.start();
            this.f55386m.setCallback(new Callback() {

                /* renamed from: a */
                int f55398a;

                /* renamed from: b */
                int f55399b;

                /* renamed from: c */
                List<Long> f55400c = new ArrayList();

                /* renamed from: d */
                List<Long> f55401d = new ArrayList();

                /* renamed from: e */
                long f55402e = 0;

                public final void onError(MediaCodec mediaCodec, CodecException codecException) {
                }

                public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
                }

                public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
                    long j;
                    try {
                        if (this.f55398a >= C20490a.this.f55376c.length) {
                            C20490a.this.f55386m.queueInputBuffer(i, 0, 0, 0, 4);
                            C45372t.m143403a(C20490a.this.f55374a, "onInputBufferAvailable end");
                            return;
                        }
                        int readSampleData = mediaExtractor.readSampleData(C20490a.this.f55386m.getInputBuffer(i), 0);
                        long sampleTime = mediaExtractor.getSampleTime();
                        if (mediaExtractor.getSampleFlags() == 1) {
                            this.f55402e = sampleTime;
                        }
                        this.f55400c.add(Long.valueOf(sampleTime));
                        if (readSampleData <= 0 || sampleTime < 0) {
                            String str = C20490a.this.f55374a;
                            StringBuilder sb = new StringBuilder("onInputBufferAvailable sampSize<0 or time<0 sampSize");
                            sb.append(readSampleData);
                            sb.append(" time: ");
                            sb.append(sampleTime);
                            C45372t.m143403a(str, sb.toString());
                            C20490a.this.mo55463c();
                            C20490a.this.mo55462b();
                            return;
                        }
                        C20490a.this.f55386m.queueInputBuffer(i, 0, readSampleData, sampleTime, 0);
                        if (!this.f55400c.containsAll(listArr[this.f55398a])) {
                            mediaExtractor.advance();
                        } else {
                            this.f55400c.clear();
                            this.f55398a++;
                            if (this.f55398a < C20490a.this.f55376c.length) {
                                int indexOf = arrayList.indexOf(Long.valueOf(this.f55402e));
                                long longValue = ((Long) listArr[this.f55398a].get(0)).longValue();
                                if (indexOf != -1) {
                                    if (indexOf < arrayList.size() - 1) {
                                        j = ((Long) arrayList.get(indexOf + 1)).longValue();
                                        if (longValue > sampleTime || longValue >= j) {
                                            mediaExtractor.seekTo(longValue, 0);
                                        } else {
                                            mediaExtractor.advance();
                                            return;
                                        }
                                    }
                                }
                                j = Long.MAX_VALUE;
                                if (longValue > sampleTime) {
                                }
                                mediaExtractor.seekTo(longValue, 0);
                            } else {
                                C45372t.m143403a(C20490a.this.f55374a, "timer begin");
                                new Handler().postDelayed(new Runnable() {
                                    public final void run() {
                                        C20490a.this.mo55463c();
                                        C20490a.this.mo55462b();
                                    }
                                }, 1000);
                            }
                        }
                    } catch (Exception unused) {
                        C45372t.m143403a(C20490a.this.f55374a, "onInputBufferAvailable crash");
                        C20490a.this.mo55463c();
                        C20490a.this.mo55462b();
                    }
                }

                public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, BufferInfo bufferInfo) {
                    try {
                        if (this.f55399b >= C20490a.this.f55376c.length || !listArr[this.f55399b].contains(Long.valueOf(bufferInfo.presentationTimeUs))) {
                            mediaCodec.releaseOutputBuffer(i, false);
                        } else {
                            this.f55401d.add(Long.valueOf(bufferInfo.presentationTimeUs));
                            synchronized (C20490a.this) {
                                if (VERSION.SDK_INT >= 23) {
                                    mediaCodec.releaseOutputBuffer(i, true);
                                } else {
                                    mediaCodec.releaseOutputBuffer(i, bufferInfo.presentationTimeUs * 1000);
                                }
                                C20490a.this.wait(0);
                            }
                            if (this.f55401d.containsAll(listArr[this.f55399b])) {
                                this.f55399b++;
                                this.f55401d.clear();
                            }
                            if (this.f55399b >= C20490a.this.f55376c.length) {
                                C20490a.this.mo55462b();
                            }
                        }
                    } catch (Exception unused) {
                        C20490a.this.mo55463c();
                        C20490a.this.mo55462b();
                    }
                }
            }, new Handler(this.f55391r.getLooper()));
            this.f55392s = new HandlerThread("ImageReader Callback");
            this.f55392s.start();
            Handler handler = new Handler(this.f55392s.getLooper());
            this.f55393t = ImageReader.newInstance(this.f55389p, this.f55390q, 35, 2);
            this.f55393t.setOnImageAvailableListener(new OnImageAvailableListener() {

                /* renamed from: a */
                int f55408a;

                /* renamed from: b */
                List<Long> f55409b = new ArrayList();

                public final void onImageAvailable(ImageReader imageReader) {
                    VEFrame vEFrame;
                    VEFrame vEFrame2;
                    try {
                        synchronized (C20490a.this) {
                            Image acquireNextImage = imageReader.acquireNextImage();
                            long timestamp = acquireNextImage.getTimestamp() / 1000;
                            if (listArr[this.f55408a].contains(Long.valueOf(timestamp))) {
                                if (C20490a.this.f55381h != null) {
                                    if (acquireNextImage.getFormat() == 35) {
                                        if (acquireNextImage.getPlanes() == null || acquireNextImage.getPlanes()[1].getPixelStride() <= 1) {
                                            vEFrame = VEFrame.createYUVPlanFrame(new C20466f(acquireNextImage.getPlanes()), C20490a.this.f55389p, C20490a.this.f55390q, C20490a.this.f55388o, 0, ETEPixelFormat.TEPixFmt_YUV420P);
                                        } else {
                                            vEFrame = VEFrame.createYUVPlanFrame(new C20466f(acquireNextImage.getPlanes()), C20490a.this.f55389p, C20490a.this.f55390q, C20490a.this.f55388o, 0, ETEPixelFormat.TEPixFmt_NV12);
                                            if (C20490a.this.f55384k == null) {
                                                ByteBuffer allocateDirect = ByteBuffer.allocateDirect(((C20490a.this.f55389p * C20490a.this.f55390q) * 3) / 2);
                                                allocateDirect.clear();
                                                C20490a.this.f55384k = VEFrame.createByteBufferFrame(allocateDirect, C20490a.this.f55389p, C20490a.this.f55390q, C20490a.this.f55388o, 0, ETEPixelFormat.TEPixFmt_YUV420P);
                                                TEImageUtils.m67829a(vEFrame, C20490a.this.f55384k, Operation.OP_CONVERT);
                                                vEFrame = C20490a.this.f55384k;
                                            }
                                        }
                                        if (C20490a.this.f55383j != null) {
                                            TEImageUtils.m67829a(vEFrame, C20490a.this.f55383j, Operation.OP_SCALE);
                                        }
                                        if (C20490a.this.f55388o != 0) {
                                            vEFrame2 = C20490a.this.f55385l;
                                            TEImageUtils.m67829a(C20490a.this.f55383j, vEFrame2, Operation.OP_ROTATION);
                                        } else {
                                            vEFrame2 = C20490a.this.f55383j;
                                        }
                                        TEImageUtils.m67829a(vEFrame2, C20490a.this.f55382i, Operation.OP_CONVERT);
                                        ((ByteBufferFrame) C20490a.this.f55382i.getFrame()).getByteBuffer().clear();
                                    }
                                    C20490a aVar = C20490a.this;
                                    ByteBuffer byteBuffer = ((ByteBufferFrame) C20490a.this.f55382i.getFrame()).getByteBuffer();
                                    int width = C20490a.this.f55382i.getWidth();
                                    int height = C20490a.this.f55382i.getHeight();
                                    double timestamp2 = (double) acquireNextImage.getTimestamp();
                                    Double.isNaN(timestamp2);
                                    aVar.mo55461a(byteBuffer, width, height, (int) (timestamp2 / 1000000.0d));
                                }
                                this.f55409b.add(Long.valueOf(timestamp));
                                if (this.f55409b.containsAll(listArr[this.f55408a])) {
                                    this.f55409b.clear();
                                    this.f55408a++;
                                }
                                C20490a.this.notify();
                            }
                            acquireNextImage.close();
                        }
                    } catch (OutOfMemoryError unused) {
                        Runtime.getRuntime().gc();
                        C20490a.this.mo55463c();
                        C20490a.this.notify();
                        C20490a.this.mo55462b();
                    } catch (Exception unused2) {
                        C20490a.this.mo55463c();
                        C20490a.this.notify();
                        C20490a.this.mo55462b();
                    }
                }
            }, handler);
            mediaFormat.setInteger("color-format", 2135033992);
            int a = (((C20443a.m67834a(f55373z) * 1080) * 1920) / this.f55389p) / this.f55390q;
            if (a > 0) {
                mediaFormat.setInteger("operating-rate", a);
            }
            this.f55386m.configure(mediaFormat, this.f55393t.getSurface(), null, 0);
            this.f55386m.start();
        } catch (OutOfMemoryError unused) {
            C45372t.m143403a(this.f55374a, "start crash oom");
            Runtime.getRuntime().gc();
            mo55463c();
            mo55462b();
        } catch (Exception unused2) {
            C45372t.m143403a(this.f55374a, "start crash");
            mo55463c();
            mo55462b();
        }
    }

    /* renamed from: a */
    public final void mo55461a(ByteBuffer byteBuffer, int i, int i2, int i3) {
        String str = this.f55374a;
        StringBuilder sb = new StringBuilder("processFrame right begin hasProcxessCount:");
        sb.append(this.f55394u);
        sb.append(" ptsMsLength: ");
        sb.append(this.f55376c.length);
        C45372t.m143403a(str, sb.toString());
        if (this.f55394u < this.f55376c.length * this.f55380g && !this.f55395v) {
            String str2 = this.f55374a;
            StringBuilder sb2 = new StringBuilder("processFrame right process hasProcxessCount:");
            sb2.append(this.f55394u);
            sb2.append(" ptsMsLength: ");
            sb2.append(this.f55376c.length);
            sb2.append(" width ");
            sb2.append(i);
            sb2.append(" height ");
            sb2.append(i2);
            sb2.append("ptsMs:");
            sb2.append(i3);
            C45372t.m143403a(str2, sb2.toString());
            if (!this.f55381h.processFrame(byteBuffer, i, i2, i3)) {
                String str3 = this.f55374a;
                StringBuilder sb3 = new StringBuilder("processFrame right stop hasProcxessCount:");
                sb3.append(this.f55394u);
                sb3.append(" ptsMsLength: ");
                sb3.append(this.f55376c.length);
                C45372t.m143403a(str3, sb3.toString());
                this.f55395v = true;
                mo55462b();
            }
            this.f55394u++;
        }
    }

    public C20490a(String str, int[] iArr, int i, int i2, boolean z, int i3, int i4, C45332o oVar) {
        this.f55394u = 0;
        this.f55395v = false;
        this.f55396w = false;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f55374a);
        sb.append(i4);
        sb.append("_");
        sb.append(this.f55397x);
        this.f55374a = sb.toString();
        this.f55375b = str;
        this.f55376c = iArr;
        this.f55377d = i;
        this.f55378e = i2;
        this.f55379f = false;
        this.f55380g = i3;
        this.f55381h = oVar;
        try {
            m67995d();
        } catch (OutOfMemoryError unused) {
            C45372t.m143403a(this.f55374a, "init alloc oom");
            Runtime.getRuntime().gc();
            try {
                m67995d();
            } catch (Exception unused2) {
                mo55463c();
                return;
            }
        }
        for (int i5 = 0; i5 < iArr.length; i5++) {
            iArr[i5] = iArr[i5] * 1000;
            String str2 = this.f55374a;
            StringBuilder sb2 = new StringBuilder("ptsMS: ");
            sb2.append(iArr[i5]);
            C45372t.m143403a(str2, sb2.toString());
        }
    }
}

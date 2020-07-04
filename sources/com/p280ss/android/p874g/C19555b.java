package com.p280ss.android.p874g;

import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaCodec.Callback;
import android.media.MediaCodec.CodecException;
import android.media.MediaCodecInfo;
import android.media.MediaCodecInfo.CodecCapabilities;
import android.media.MediaCodecInfo.CodecProfileLevel;
import android.media.MediaCodecList;
import android.media.MediaFormat;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import com.p280ss.android.ttve.monitor.C20479f;
import com.p280ss.android.vesdk.C45372t;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.ss.android.g.b */
public final class C19555b {

    /* renamed from: a */
    public MediaCodec f52891a;

    /* renamed from: b */
    public Surface f52892b;

    /* renamed from: c */
    public boolean f52893c;

    /* renamed from: d */
    public LinkedBlockingQueue<C19559c> f52894d = new LinkedBlockingQueue<>();

    /* renamed from: e */
    public LinkedBlockingQueue<C19558b> f52895e = new LinkedBlockingQueue<>();

    /* renamed from: f */
    public LinkedBlockingQueue<Long> f52896f = new LinkedBlockingQueue<>();

    /* renamed from: g */
    public LinkedBlockingQueue<Integer> f52897g = new LinkedBlockingQueue<>();

    /* renamed from: h */
    public int f52898h = 0;

    /* renamed from: i */
    public boolean f52899i = false;

    /* renamed from: j */
    public MediaFormat f52900j;

    /* renamed from: k */
    public byte[] f52901k;

    /* renamed from: l */
    private String f52902l = "video/avc";

    /* renamed from: m */
    private MediaCodecInfo f52903m;

    /* renamed from: n */
    private int f52904n = 30;

    /* renamed from: o */
    private int f52905o;

    /* renamed from: p */
    private int f52906p;

    /* renamed from: q */
    private int f52907q;

    /* renamed from: r */
    private int f52908r;

    /* renamed from: s */
    private int f52909s = 1;

    /* renamed from: t */
    private int f52910t;

    /* renamed from: u */
    private int f52911u = 1;

    /* renamed from: v */
    private HandlerThread f52912v = new HandlerThread("HWEncodeThread");

    /* renamed from: w */
    private Handler f52913w;

    /* renamed from: x */
    private C19557a f52914x;

    /* renamed from: y */
    private int f52915y;

    /* renamed from: com.ss.android.g.b$a */
    class C19557a extends Callback implements Runnable {
        public final void run() {
            while (!C19555b.this.f52899i) {
                try {
                    if (C19555b.this.f52894d.isEmpty() || C19555b.this.f52897g.isEmpty()) {
                        Thread.sleep(10);
                    } else {
                        C19555b.this.mo51695a((C19559c) C19555b.this.f52894d.take(), ((Integer) C19555b.this.f52897g.take()).intValue());
                    }
                } catch (InterruptedException e) {
                    StringBuilder sb = new StringBuilder("feedEncode error ");
                    sb.append(e.getMessage());
                    C45372t.m143409d("TEHwEncoder", sb.toString());
                }
            }
        }

        private C19557a() {
        }

        public final void onError(MediaCodec mediaCodec, CodecException codecException) {
            StringBuilder sb = new StringBuilder("onError: ");
            sb.append(codecException.getMessage());
            C45372t.m143409d("TEHwEncoder", sb.toString());
        }

        public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
            StringBuilder sb = new StringBuilder("onOutputFormatChanged: ");
            sb.append(mediaFormat.toString());
            C45372t.m143405b("TEHwEncoder", sb.toString());
            C19555b.this.f52900j = mediaFormat;
        }

        public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
            try {
                if (!C19555b.this.f52893c) {
                    C19555b.this.f52897g.put(Integer.valueOf(i));
                }
            } catch (InterruptedException e) {
                StringBuilder sb = new StringBuilder("onInputBufferAvailable is error: ");
                sb.append(e.getMessage());
                C45372t.m143409d("TEHwEncoder", sb.toString());
            }
        }

        public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, BufferInfo bufferInfo) {
            if ((bufferInfo.flags & 2) != 0) {
                ByteBuffer outputBuffer = mediaCodec.getOutputBuffer(i);
                C19555b.this.f52901k = new byte[bufferInfo.size];
                outputBuffer.position(bufferInfo.offset);
                outputBuffer.limit(bufferInfo.offset + bufferInfo.size);
                outputBuffer.get(C19555b.this.f52901k);
                C19555b.this.f52891a.releaseOutputBuffer(i, false);
                return;
            }
            try {
                C19558b bVar = new C19558b();
                bVar.f52917a = i;
                bVar.f52919c = ((Long) C19555b.this.f52896f.take()).longValue();
                bVar.f52918b = bufferInfo;
                C19555b.this.f52895e.put(bVar);
            } catch (InterruptedException e) {
                StringBuilder sb = new StringBuilder("get out put buffer failed: ");
                sb.append(e.getMessage());
                C45372t.m143409d("TEHwEncoder", sb.toString());
            }
        }
    }

    /* renamed from: com.ss.android.g.b$b */
    class C19558b {

        /* renamed from: a */
        public int f52917a;

        /* renamed from: b */
        public BufferInfo f52918b;

        /* renamed from: c */
        public long f52919c;

        private C19558b() {
        }
    }

    /* renamed from: a */
    public static C19555b m64430a() {
        return new C19555b();
    }

    /* renamed from: c */
    public final void mo51697c() {
        C45372t.m143405b("TEHwEncoder", "stop encode...");
        if (this.f52891a != null) {
            this.f52891a.stop();
        }
        this.f52898h = 3;
    }

    /* renamed from: g */
    private int m64432g() {
        int[] h = m64433h();
        if (h == null) {
            return C19554a.f52887e;
        }
        for (int i = 0; i < h.length; i++) {
            if (this.f52893c) {
                if (h[i] == 2130708361) {
                    C45372t.m143403a("TEHwEncoder", "====== mColorFormat support COLOR_FormatSurface ======");
                    return h[i];
                }
            } else if (h[i] == 2135033992) {
                C45372t.m143403a("TEHwEncoder", "====== mColorFormat support COLOR_FormatYUV420Flexible ======");
                return h[i];
            }
        }
        return C19554a.f52884b;
    }

    /* renamed from: b */
    public final void mo51696b() {
        if (this.f52898h != 2 && this.f52898h == 1) {
            C45372t.m143405b("TEHwEncoder", "start encode...");
            this.f52899i = false;
            this.f52891a.start();
            new Thread(this.f52914x).start();
            this.f52898h = 2;
        }
    }

    public C19555b() {
        this.f52912v.start();
        this.f52913w = new Handler(this.f52912v.getLooper());
    }

    /* renamed from: f */
    private int m64431f() {
        String[] supportedTypes;
        if (this.f52898h != 0) {
            return C19554a.f52884b;
        }
        this.f52910t = m64432g();
        if (this.f52910t < 0) {
            return C19554a.f52887e;
        }
        try {
            this.f52891a = MediaCodec.createEncoderByType(this.f52902l);
            MediaCodecInfo codecInfo = this.f52891a.getCodecInfo();
            if (codecInfo.getName().startsWith("OMX.google.")) {
                return C19554a.f52886d;
            }
            for (String str : codecInfo.getSupportedTypes()) {
                StringBuilder sb = new StringBuilder("CodecNames: ");
                sb.append(str);
                C45372t.m143403a("TEHwEncoder", sb.toString());
            }
            this.f52898h = 1;
            return C19554a.f52883a;
        } catch (IOException e) {
            StringBuilder sb2 = new StringBuilder("create Encoder failed: ");
            sb2.append(e.getMessage());
            C45372t.m143409d("TEHwEncoder", sb2.toString());
            return C19554a.f52885c;
        }
    }

    /* renamed from: h */
    private int[] m64433h() {
        MediaCodecInfo mediaCodecInfo;
        C45372t.m143403a("TEHwEncoder", "start == ");
        if (VERSION.SDK_INT >= 21) {
            mediaCodecInfo = m64434i();
        } else {
            mediaCodecInfo = m64435j();
        }
        this.f52903m = mediaCodecInfo;
        C45372t.m143403a("TEHwEncoder", "end == ");
        if (this.f52903m == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder("mMediaCodecInfo name = ");
        sb.append(this.f52903m.getName());
        C45372t.m143403a("TEHwEncoder", sb.toString());
        CodecCapabilities capabilitiesForType = this.f52903m.getCapabilitiesForType(this.f52902l);
        int length = capabilitiesForType.colorFormats.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = capabilitiesForType.colorFormats[i];
        }
        return iArr;
    }

    /* renamed from: i */
    private MediaCodecInfo m64434i() {
        MediaCodecInfo[] codecInfos = new MediaCodecList(1).getCodecInfos();
        if (codecInfos == null || codecInfos.length == 0) {
            return null;
        }
        for (MediaCodecInfo mediaCodecInfo : codecInfos) {
            if (mediaCodecInfo != null && mediaCodecInfo.isEncoder()) {
                String name = mediaCodecInfo.getName();
                if (!name.startsWith("OMX.google.") && !name.startsWith("OMX.Nvidia.") && !name.equals("OMX.TI.DUCATI1.VIDEO.H264E")) {
                    String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
                    for (String equalsIgnoreCase : supportedTypes) {
                        if (equalsIgnoreCase.equalsIgnoreCase(this.f52902l)) {
                            return mediaCodecInfo;
                        }
                    }
                    continue;
                }
            }
        }
        return null;
    }

    /* renamed from: j */
    private MediaCodecInfo m64435j() {
        int codecCount = MediaCodecList.getCodecCount();
        for (int i = 0; i < codecCount; i++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
            if (codecInfoAt.isEncoder()) {
                String name = codecInfoAt.getName();
                if (!name.startsWith("OMX.google.") && !name.startsWith("OMX.Nvidia.") && !name.equals("OMX.TI.DUCATI1.VIDEO.H264E")) {
                    String[] supportedTypes = codecInfoAt.getSupportedTypes();
                    for (String equalsIgnoreCase : supportedTypes) {
                        if (equalsIgnoreCase.equalsIgnoreCase(this.f52902l)) {
                            return codecInfoAt;
                        }
                    }
                    continue;
                }
            }
        }
        return null;
    }

    /* renamed from: d */
    public final void mo51698d() {
        C45372t.m143405b("TEHwEncoder", "release encode...");
        if (this.f52898h != 3) {
            mo51697c();
        }
        if (this.f52891a != null) {
            this.f52891a.release();
        }
        this.f52899i = true;
        this.f52897g.clear();
        this.f52897g = null;
        this.f52894d.clear();
        this.f52894d = null;
        this.f52895e.clear();
        this.f52895e = null;
        this.f52891a = null;
        this.f52913w.removeCallbacksAndMessages(null);
        this.f52912v.quit();
        this.f52913w = null;
        this.f52912v = null;
        this.f52898h = 0;
    }

    /* renamed from: e */
    public final synchronized C19559c mo51699e() {
        int i;
        C19559c cVar = new C19559c();
        if (this.f52895e.isEmpty()) {
            return null;
        }
        try {
            C19558b bVar = (C19558b) this.f52895e.take();
            ByteBuffer outputBuffer = this.f52891a.getOutputBuffer(bVar.f52917a);
            outputBuffer.position(bVar.f52918b.offset);
            outputBuffer.limit(bVar.f52918b.offset + bVar.f52918b.size);
            if (bVar.f52918b.size > 0) {
                cVar.f52921a = new byte[bVar.f52918b.size];
                outputBuffer.get(cVar.f52921a);
            } else if ((bVar.f52918b.flags & 4) == 0) {
                StringBuilder sb = new StringBuilder("frame.mBufferInfo.size <= 0. size:");
                sb.append(bVar.f52918b.size);
                C45372t.m143409d("TEHwEncoder", sb.toString());
            }
            boolean z = true;
            if ((bVar.f52918b.flags & 1) != 0) {
                if (this.f52901k != null && cVar.f52921a != null && cVar.f52921a[4] == this.f52901k[4] && (cVar.f52921a[this.f52901k.length + 4] & 31) == 5) {
                    byte[] bArr = new byte[(cVar.f52921a.length - this.f52901k.length)];
                    System.arraycopy(cVar.f52921a, this.f52901k.length, bArr, 0, bArr.length);
                    cVar.f52921a = bArr;
                }
                i = 1;
            } else {
                i = 0;
            }
            if ((4 & bVar.f52918b.flags) != 0) {
                cVar.f52922b = bVar.f52919c;
            } else {
                cVar.f52922b = bVar.f52918b.presentationTimeUs;
                z = false;
            }
            cVar.f52925e = z;
            cVar.f52924d = i;
            cVar.f52923c = bVar.f52919c;
            this.f52891a.releaseOutputBuffer(bVar.f52917a, false);
            return cVar;
        } catch (InterruptedException e) {
            String str = "TEHwEncoder";
            StringBuilder sb2 = new StringBuilder("get output data is fail: ");
            sb2.append(e.getMessage());
            C45372t.m143409d(str, sb2.toString());
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0061, code lost:
        if (r2.profile < 8) goto L_0x0063;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x004f, code lost:
        if (r2.profile < 2) goto L_0x0063;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0068 A[LOOP:0: B:1:0x0011->B:16:0x0068, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006b A[EDGE_INSN: B:19:0x006b->B:17:0x006b ?: BREAK  , SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.media.MediaCodecInfo.CodecProfileLevel m64429a(int r9) {
        /*
            r8 = this;
            android.media.MediaCodec r0 = r8.f52891a
            android.media.MediaCodecInfo r0 = r0.getCodecInfo()
            java.lang.String r1 = r8.f52902l
            android.media.MediaCodecInfo$CodecCapabilities r0 = r0.getCapabilitiesForType(r1)
            android.media.MediaCodecInfo$CodecProfileLevel[] r0 = r0.profileLevels
            int r1 = r0.length
            r2 = 0
            r3 = 0
        L_0x0011:
            if (r3 >= r1) goto L_0x006b
            r4 = r0[r3]
            java.lang.String r5 = "TEHwEncoder"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Profile = "
            r6.<init>(r7)
            int r7 = r4.profile
            r6.append(r7)
            java.lang.String r7 = ", Level = "
            r6.append(r7)
            int r7 = r4.level
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            com.p280ss.android.vesdk.C45372t.m143403a(r5, r6)
            int r5 = r4.profile
            r6 = 1
            if (r5 != r6) goto L_0x0041
            java.lang.String r2 = "TEHwEncoder"
            java.lang.String r5 = "Support Baseline Profile!"
            com.p280ss.android.vesdk.C45372t.m143403a(r2, r5)
            goto L_0x0063
        L_0x0041:
            int r5 = r4.profile
            r6 = 2
            if (r5 != r6) goto L_0x0052
            java.lang.String r5 = "TEHwEncoder"
            java.lang.String r7 = "Support Main Profile!"
            com.p280ss.android.vesdk.C45372t.m143403a(r5, r7)
            int r5 = r2.profile
            if (r5 >= r6) goto L_0x0064
            goto L_0x0063
        L_0x0052:
            int r5 = r4.profile
            r6 = 8
            if (r5 != r6) goto L_0x0064
            java.lang.String r5 = "TEHwEncoder"
            java.lang.String r7 = "Support High Profile!"
            com.p280ss.android.vesdk.C45372t.m143403a(r5, r7)
            int r5 = r2.profile
            if (r5 >= r6) goto L_0x0064
        L_0x0063:
            r2 = r4
        L_0x0064:
            int r4 = r4.profile
            if (r4 == r9) goto L_0x006b
            int r3 = r3 + 1
            goto L_0x0011
        L_0x006b:
            int r9 = r2.profile
            r8.f52909s = r9
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.p874g.C19555b.m64429a(int):android.media.MediaCodecInfo$CodecProfileLevel");
    }

    /* renamed from: a */
    public final void mo51695a(C19559c cVar, int i) {
        byte[] bArr;
        C19559c cVar2 = cVar;
        int i2 = i;
        this.f52915y++;
        if (cVar2 == null) {
            StringBuilder sb = new StringBuilder("Frame is null, frame number: ");
            sb.append(this.f52915y);
            C45372t.m143409d("TEHwEncoder", sb.toString());
        } else if (!this.f52893c) {
            int pixelStride = this.f52891a.getInputImage(i2).getPlanes()[1].getPixelStride();
            ByteBuffer inputBuffer = this.f52891a.getInputBuffer(i2);
            inputBuffer.clear();
            if (pixelStride == 2) {
                bArr = new byte[cVar2.f52921a.length];
                int i3 = 0;
                int i4 = 0;
                while (i3 < this.f52908r) {
                    int i5 = i4;
                    for (int i6 = 0; i6 < this.f52907q; i6++) {
                        bArr[i5] = cVar2.f52921a[(this.f52907q * i3) + i6];
                        i5++;
                    }
                    i3++;
                    i4 = i5;
                }
                int i7 = 0;
                while (i7 < this.f52908r / 4) {
                    int i8 = i4;
                    for (int i9 = 0; i9 < this.f52907q; i9++) {
                        int i10 = (this.f52907q * this.f52908r) + (this.f52907q * i7) + i9;
                        bArr[i8] = cVar2.f52921a[i10];
                        bArr[i8 + 1] = cVar2.f52921a[i10 + ((this.f52907q * this.f52908r) / 4)];
                        i8 += 2;
                    }
                    i7++;
                    i4 = i8;
                }
            } else {
                bArr = cVar2.f52921a;
            }
            inputBuffer.put(bArr);
            inputBuffer.position(0);
            inputBuffer.limit(bArr.length);
            if (cVar2.f52925e) {
                this.f52891a.queueInputBuffer(i, 0, 0, cVar2.f52922b, 4);
            } else {
                this.f52891a.queueInputBuffer(i, 0, cVar2.f52921a.length, cVar2.f52922b, 0);
            }
            C45372t.m143403a("TEHwEncoder", "Push data to mediacodec.");
        } else {
            C45372t.m143409d("TEHwEncoder", "User texture input.");
        }
    }

    /* renamed from: a */
    public final int mo51694a(byte[] bArr, long j, boolean z) {
        try {
            if (this.f52897g.isEmpty() || this.f52894d.size() > 5) {
                Thread.sleep(50);
                if (!this.f52897g.isEmpty()) {
                    if (this.f52894d.size() > 5) {
                    }
                }
                return C19554a.f52890h;
            }
            byte[] bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            C19559c cVar = new C19559c();
            cVar.f52921a = bArr2;
            cVar.f52922b = j;
            cVar.f52925e = z;
            this.f52894d.put(cVar);
            this.f52896f.put(Long.valueOf(j));
            return C19554a.f52883a;
        } catch (InterruptedException e) {
            StringBuilder sb = new StringBuilder(" input data error: ");
            sb.append(e.getMessage());
            C45372t.m143409d("TEHwEncoder", sb.toString());
            return C19554a.f52884b;
        }
    }

    /* renamed from: a */
    public final int mo51693a(int i, int i2, int i3, boolean z) {
        return m64428a(i, i2, 4000000, 1, 1, false);
    }

    /* renamed from: a */
    private int m64428a(int i, int i2, int i3, int i4, int i5, boolean z) {
        if (VERSION.SDK_INT < 18) {
            return C19554a.f52888f;
        }
        if (i <= 0 || i2 <= 0) {
            return C19554a.f52889g;
        }
        this.f52909s = 1;
        this.f52905o = i3;
        this.f52906p = 1;
        this.f52907q = i;
        this.f52908r = i2;
        this.f52893c = z;
        int f = m64431f();
        if (f < 0) {
            StringBuilder sb = new StringBuilder("create encoder fail : ");
            sb.append(f);
            C45372t.m143409d("TEHwEncoder", sb.toString());
            return f;
        }
        MediaFormat createVideoFormat = MediaFormat.createVideoFormat(this.f52902l, this.f52907q, this.f52908r);
        CodecProfileLevel a = m64429a(1);
        int i6 = this.f52905o;
        if (VERSION.SDK_INT < 24 || a == null) {
            StringBuilder sb2 = new StringBuilder("Do not support profile ");
            sb2.append(1);
            sb2.append(", use baseline");
            C45372t.m143407c("TEHwEncoder", sb2.toString());
            C20479f.m67948a(0, "te_mediacodec_profile", 1);
            C20479f.m67954a("iesve_record_mediacodec_profile", 1);
        } else {
            StringBuilder sb3 = new StringBuilder("Set Profile: ");
            sb3.append(a.profile);
            sb3.append(", Level = ");
            sb3.append(a.level);
            C45372t.m143403a("TEHwEncoder", sb3.toString());
            this.f52909s = a.profile;
            createVideoFormat.setInteger("profile", a.profile);
            createVideoFormat.setInteger("level", a.level);
            int i7 = a.profile;
            if (i7 == 2) {
                C45372t.m143403a("TEHwEncoder", "Set Main Profile");
                this.f52905o = (int) (((float) i6) * 0.85f);
            } else if (i7 == 8) {
                C45372t.m143403a("TEHwEncoder", "Set High Profile");
                this.f52905o = (int) (((float) i6) * 0.75f);
            }
            C20479f.m67948a(0, "te_mediacodec_profile", (long) a.profile);
            C20479f.m67954a("iesve_record_mediacodec_profile", (long) a.profile);
        }
        if (this.f52905o > 12000000) {
            this.f52905o = 12000000;
        }
        StringBuilder sb4 = new StringBuilder("bitrate = ");
        sb4.append((((float) this.f52905o) * 1.0f) / 1000000.0f);
        sb4.append("Mb/s");
        C45372t.m143403a("TEHwEncoder", sb4.toString());
        createVideoFormat.setInteger("bitrate", this.f52905o);
        if (VERSION.SDK_INT >= 21) {
            createVideoFormat.setInteger("bitrate-mode", this.f52906p);
            StringBuilder sb5 = new StringBuilder("Bitrate mode = ");
            sb5.append(this.f52906p);
            C45372t.m143403a("TEHwEncoder", sb5.toString());
            C20479f.m67948a(0, "te_record_mediacodec_rate_control", 1);
            createVideoFormat.setInteger("max-bitrate", i6);
        }
        createVideoFormat.setInteger("color-format", this.f52910t);
        createVideoFormat.setInteger("frame-rate", this.f52904n);
        createVideoFormat.setInteger("i-frame-interval", this.f52911u);
        C20479f.m67948a(0, "te_record_video_encode_gop", (long) (this.f52904n * this.f52911u));
        StringBuilder sb6 = new StringBuilder("initHWEncoder: format = ");
        sb6.append(createVideoFormat);
        C45372t.m143403a("TEHwEncoder", sb6.toString());
        this.f52914x = new C19557a();
        if (VERSION.SDK_INT > 23) {
            this.f52891a.setCallback(this.f52914x, this.f52913w);
        } else {
            this.f52891a.setCallback(this.f52914x);
        }
        this.f52891a.configure(createVideoFormat, null, null, 1);
        if (this.f52893c) {
            this.f52892b = this.f52891a.createInputSurface();
        }
        return C19554a.f52883a;
    }
}

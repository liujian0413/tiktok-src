package com.google.android.gms.internal.ads;

import android.graphics.Point;
import android.media.MediaCodecInfo.AudioCapabilities;
import android.media.MediaCodecInfo.CodecCapabilities;
import android.media.MediaCodecInfo.CodecProfileLevel;
import android.media.MediaCodecInfo.VideoCapabilities;

public final class bou {

    /* renamed from: a */
    public final String f43063a;

    /* renamed from: b */
    public final boolean f43064b;

    /* renamed from: c */
    public final boolean f43065c;

    /* renamed from: d */
    public final boolean f43066d;

    /* renamed from: e */
    private final String f43067e;

    /* renamed from: f */
    private final CodecCapabilities f43068f;

    /* renamed from: a */
    public static bou m49566a(String str) {
        bou bou = new bou(str, null, null, false, false);
        return bou;
    }

    /* renamed from: a */
    public static bou m49567a(String str, String str2, CodecCapabilities codecCapabilities, boolean z, boolean z2) {
        bou bou = new bou(str, str2, codecCapabilities, z, z2);
        return bou;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x005a, code lost:
        if ((com.google.android.gms.internal.ads.bsf.f43399a >= 21 && r4.isFeatureSupported("secure-playback")) != false) goto L_0x005e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0049  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private bou(java.lang.String r2, java.lang.String r3, android.media.MediaCodecInfo.CodecCapabilities r4, boolean r5, boolean r6) {
        /*
            r1 = this;
            r1.<init>()
            java.lang.Object r2 = com.google.android.gms.internal.ads.brr.m49869a(r2)
            java.lang.String r2 = (java.lang.String) r2
            r1.f43063a = r2
            r1.f43067e = r3
            r1.f43068f = r4
            r2 = 1
            r3 = 0
            if (r5 != 0) goto L_0x002a
            if (r4 == 0) goto L_0x002a
            int r5 = com.google.android.gms.internal.ads.bsf.f43399a
            r0 = 19
            if (r5 < r0) goto L_0x0025
            java.lang.String r5 = "adaptive-playback"
            boolean r5 = r4.isFeatureSupported(r5)
            if (r5 == 0) goto L_0x0025
            r5 = 1
            goto L_0x0026
        L_0x0025:
            r5 = 0
        L_0x0026:
            if (r5 == 0) goto L_0x002a
            r5 = 1
            goto L_0x002b
        L_0x002a:
            r5 = 0
        L_0x002b:
            r1.f43064b = r5
            r5 = 21
            if (r4 == 0) goto L_0x0044
            int r0 = com.google.android.gms.internal.ads.bsf.f43399a
            if (r0 < r5) goto L_0x003f
            java.lang.String r0 = "tunneled-playback"
            boolean r0 = r4.isFeatureSupported(r0)
            if (r0 == 0) goto L_0x003f
            r0 = 1
            goto L_0x0040
        L_0x003f:
            r0 = 0
        L_0x0040:
            if (r0 == 0) goto L_0x0044
            r0 = 1
            goto L_0x0045
        L_0x0044:
            r0 = 0
        L_0x0045:
            r1.f43065c = r0
            if (r6 != 0) goto L_0x005e
            if (r4 == 0) goto L_0x005d
            int r6 = com.google.android.gms.internal.ads.bsf.f43399a
            if (r6 < r5) goto L_0x0059
            java.lang.String r5 = "secure-playback"
            boolean r4 = r4.isFeatureSupported(r5)
            if (r4 == 0) goto L_0x0059
            r4 = 1
            goto L_0x005a
        L_0x0059:
            r4 = 0
        L_0x005a:
            if (r4 == 0) goto L_0x005d
            goto L_0x005e
        L_0x005d:
            r2 = 0
        L_0x005e:
            r1.f43066d = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bou.<init>(java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean):void");
    }

    /* renamed from: a */
    public final CodecProfileLevel[] mo41061a() {
        if (this.f43068f == null || this.f43068f.profileLevels == null) {
            return new CodecProfileLevel[0];
        }
        return this.f43068f.profileLevels;
    }

    /* JADX WARNING: Removed duplicated region for block: B:52:0x00c6 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00c7  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo41063b(java.lang.String r11) {
        /*
            r10 = this;
            r0 = 1
            if (r11 == 0) goto L_0x014f
            java.lang.String r1 = r10.f43067e
            if (r1 != 0) goto L_0x0009
            goto L_0x014f
        L_0x0009:
            if (r11 == 0) goto L_0x00c3
            java.lang.String r1 = r11.trim()
            java.lang.String r2 = "avc1"
            boolean r2 = r1.startsWith(r2)
            if (r2 != 0) goto L_0x00c0
            java.lang.String r2 = "avc3"
            boolean r2 = r1.startsWith(r2)
            if (r2 == 0) goto L_0x0021
            goto L_0x00c0
        L_0x0021:
            java.lang.String r2 = "hev1"
            boolean r2 = r1.startsWith(r2)
            if (r2 != 0) goto L_0x00bd
            java.lang.String r2 = "hvc1"
            boolean r2 = r1.startsWith(r2)
            if (r2 == 0) goto L_0x0033
            goto L_0x00bd
        L_0x0033:
            java.lang.String r2 = "vp9"
            boolean r2 = r1.startsWith(r2)
            if (r2 == 0) goto L_0x003f
            java.lang.String r1 = "video/x-vnd.on2.vp9"
            goto L_0x00c4
        L_0x003f:
            java.lang.String r2 = "vp8"
            boolean r2 = r1.startsWith(r2)
            if (r2 == 0) goto L_0x004b
            java.lang.String r1 = "video/x-vnd.on2.vp8"
            goto L_0x00c4
        L_0x004b:
            java.lang.String r2 = "mp4a"
            boolean r2 = r1.startsWith(r2)
            if (r2 == 0) goto L_0x0057
            java.lang.String r1 = "audio/mp4a-latm"
            goto L_0x00c4
        L_0x0057:
            java.lang.String r2 = "ac-3"
            boolean r2 = r1.startsWith(r2)
            if (r2 != 0) goto L_0x00ba
            java.lang.String r2 = "dac3"
            boolean r2 = r1.startsWith(r2)
            if (r2 == 0) goto L_0x0068
            goto L_0x00ba
        L_0x0068:
            java.lang.String r2 = "ec-3"
            boolean r2 = r1.startsWith(r2)
            if (r2 != 0) goto L_0x00b7
            java.lang.String r2 = "dec3"
            boolean r2 = r1.startsWith(r2)
            if (r2 == 0) goto L_0x0079
            goto L_0x00b7
        L_0x0079:
            java.lang.String r2 = "dtsc"
            boolean r2 = r1.startsWith(r2)
            if (r2 != 0) goto L_0x00b4
            java.lang.String r2 = "dtse"
            boolean r2 = r1.startsWith(r2)
            if (r2 == 0) goto L_0x008a
            goto L_0x00b4
        L_0x008a:
            java.lang.String r2 = "dtsh"
            boolean r2 = r1.startsWith(r2)
            if (r2 != 0) goto L_0x00b1
            java.lang.String r2 = "dtsl"
            boolean r2 = r1.startsWith(r2)
            if (r2 == 0) goto L_0x009b
            goto L_0x00b1
        L_0x009b:
            java.lang.String r2 = "opus"
            boolean r2 = r1.startsWith(r2)
            if (r2 == 0) goto L_0x00a6
            java.lang.String r1 = "audio/opus"
            goto L_0x00c4
        L_0x00a6:
            java.lang.String r2 = "vorbis"
            boolean r1 = r1.startsWith(r2)
            if (r1 == 0) goto L_0x00c3
            java.lang.String r1 = "audio/vorbis"
            goto L_0x00c4
        L_0x00b1:
            java.lang.String r1 = "audio/vnd.dts.hd"
            goto L_0x00c4
        L_0x00b4:
            java.lang.String r1 = "audio/vnd.dts"
            goto L_0x00c4
        L_0x00b7:
            java.lang.String r1 = "audio/eac3"
            goto L_0x00c4
        L_0x00ba:
            java.lang.String r1 = "audio/ac3"
            goto L_0x00c4
        L_0x00bd:
            java.lang.String r1 = "video/hevc"
            goto L_0x00c4
        L_0x00c0:
            java.lang.String r1 = "video/avc"
            goto L_0x00c4
        L_0x00c3:
            r1 = 0
        L_0x00c4:
            if (r1 != 0) goto L_0x00c7
            return r0
        L_0x00c7:
            java.lang.String r2 = r10.f43067e
            boolean r2 = r2.equals(r1)
            r3 = 0
            if (r2 != 0) goto L_0x00f9
            java.lang.String r0 = java.lang.String.valueOf(r11)
            int r0 = r0.length()
            int r0 = r0 + 13
            java.lang.String r2 = java.lang.String.valueOf(r1)
            int r2 = r2.length()
            int r0 = r0 + r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            java.lang.String r0 = "codec.mime "
            r2.append(r0)
            r2.append(r11)
            java.lang.String r11 = ", "
            r2.append(r11)
            r2.append(r1)
            return r3
        L_0x00f9:
            android.util.Pair r2 = com.google.android.gms.internal.ads.boy.m49606a(r11)
            if (r2 != 0) goto L_0x0100
            return r0
        L_0x0100:
            android.media.MediaCodecInfo$CodecProfileLevel[] r4 = r10.mo41061a()
            int r5 = r4.length
            r6 = 0
        L_0x0106:
            if (r6 >= r5) goto L_0x0126
            r7 = r4[r6]
            int r8 = r7.profile
            java.lang.Object r9 = r2.first
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            if (r8 != r9) goto L_0x0123
            int r7 = r7.level
            java.lang.Object r8 = r2.second
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            if (r7 < r8) goto L_0x0123
            return r0
        L_0x0123:
            int r6 = r6 + 1
            goto L_0x0106
        L_0x0126:
            java.lang.String r0 = java.lang.String.valueOf(r11)
            int r0 = r0.length()
            int r0 = r0 + 22
            java.lang.String r2 = java.lang.String.valueOf(r1)
            int r2 = r2.length()
            int r0 = r0 + r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            java.lang.String r0 = "codec.profileLevel, "
            r2.append(r0)
            r2.append(r11)
            java.lang.String r11 = ", "
            r2.append(r11)
            r2.append(r1)
            return r3
        L_0x014f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bou.mo41063b(java.lang.String):boolean");
    }

    /* renamed from: a */
    public final boolean mo41060a(int i, int i2, double d) {
        if (this.f43068f == null) {
            return false;
        }
        VideoCapabilities videoCapabilities = this.f43068f.getVideoCapabilities();
        if (videoCapabilities == null) {
            return false;
        }
        if (!m49568a(videoCapabilities, i, i2, d)) {
            if (i >= i2 || !m49568a(videoCapabilities, i2, i, d)) {
                StringBuilder sb = new StringBuilder(69);
                sb.append("sizeAndRate.support, ");
                sb.append(i);
                sb.append("x");
                sb.append(i2);
                sb.append("x");
                sb.append(d);
                return false;
            }
            StringBuilder sb2 = new StringBuilder(69);
            sb2.append("sizeAndRate.rotated, ");
            sb2.append(i);
            sb2.append("x");
            sb2.append(i2);
            sb2.append("x");
            sb2.append(d);
        }
        return true;
    }

    /* renamed from: a */
    public final Point mo41058a(int i, int i2) {
        if (this.f43068f == null) {
            return null;
        }
        VideoCapabilities videoCapabilities = this.f43068f.getVideoCapabilities();
        if (videoCapabilities == null) {
            return null;
        }
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(bsf.m49933a(i, widthAlignment) * widthAlignment, bsf.m49933a(i2, heightAlignment) * heightAlignment);
    }

    /* renamed from: a */
    public final boolean mo41059a(int i) {
        if (this.f43068f == null) {
            return false;
        }
        AudioCapabilities audioCapabilities = this.f43068f.getAudioCapabilities();
        if (audioCapabilities == null) {
            return false;
        }
        if (audioCapabilities.isSampleRateSupported(i)) {
            return true;
        }
        StringBuilder sb = new StringBuilder(31);
        sb.append("sampleRate.support, ");
        sb.append(i);
        return false;
    }

    /* renamed from: b */
    public final boolean mo41062b(int i) {
        if (this.f43068f == null) {
            return false;
        }
        AudioCapabilities audioCapabilities = this.f43068f.getAudioCapabilities();
        if (audioCapabilities == null) {
            return false;
        }
        if (audioCapabilities.getMaxInputChannelCount() >= i) {
            return true;
        }
        StringBuilder sb = new StringBuilder(33);
        sb.append("channelCount.support, ");
        sb.append(i);
        return false;
    }

    /* renamed from: a */
    private static boolean m49568a(VideoCapabilities videoCapabilities, int i, int i2, double d) {
        if (d == -1.0d || d <= 0.0d) {
            return videoCapabilities.isSizeSupported(i, i2);
        }
        return videoCapabilities.areSizeAndRateSupported(i, i2, d);
    }
}

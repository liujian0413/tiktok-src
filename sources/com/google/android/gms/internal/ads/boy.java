package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo.CodecProfileLevel;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseIntArray;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public final class boy {

    /* renamed from: a */
    private static final bou f43109a = bou.m49566a("OMX.google.raw.decoder");

    /* renamed from: b */
    private static final Pattern f43110b = Pattern.compile("^\\D?(\\d+)$");

    /* renamed from: c */
    private static final HashMap<C15577a, List<bou>> f43111c = new HashMap<>();

    /* renamed from: d */
    private static final SparseIntArray f43112d;

    /* renamed from: e */
    private static final SparseIntArray f43113e;

    /* renamed from: f */
    private static final Map<String, Integer> f43114f;

    /* renamed from: g */
    private static int f43115g = -1;

    /* renamed from: com.google.android.gms.internal.ads.boy$a */
    static final class C15577a {

        /* renamed from: a */
        public final String f43116a;

        /* renamed from: b */
        public final boolean f43117b;

        public C15577a(String str, boolean z) {
            this.f43116a = str;
            this.f43117b = z;
        }

        public final int hashCode() {
            return (((this.f43116a == null ? 0 : this.f43116a.hashCode()) + 31) * 31) + (this.f43117b ? 1231 : 1237);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || obj.getClass() != C15577a.class) {
                return false;
            }
            C15577a aVar = (C15577a) obj;
            return TextUtils.equals(this.f43116a, aVar.f43116a) && this.f43117b == aVar.f43117b;
        }
    }

    /* renamed from: a */
    public static bou m49608a() {
        return f43109a;
    }

    /* renamed from: a */
    public static bou m49609a(String str, boolean z) throws zzpj {
        List b = m49612b(str, z);
        if (b.isEmpty()) {
            return null;
        }
        return (bou) b.get(0);
    }

    /* renamed from: b */
    private static synchronized List<bou> m49612b(String str, boolean z) throws zzpj {
        synchronized (boy.class) {
            C15577a aVar = new C15577a(str, z);
            List<bou> list = (List) f43111c.get(aVar);
            if (list != null) {
                return list;
            }
            List a = m49610a(aVar, bsf.f43399a >= 21 ? new bpc(z) : new bpb());
            if (z && a.isEmpty() && 21 <= bsf.f43399a && bsf.f43399a <= 23) {
                a = m49610a(aVar, (bpa) new bpb());
                a.isEmpty();
            }
            List<bou> unmodifiableList = Collections.unmodifiableList(a);
            f43111c.put(aVar, unmodifiableList);
            return unmodifiableList;
        }
    }

    /* renamed from: b */
    public static int m49611b() throws zzpj {
        int i;
        if (f43115g == -1) {
            int i2 = 0;
            bou a = m49609a("video/avc", false);
            if (a != null) {
                CodecProfileLevel[] a2 = a.mo41061a();
                int length = a2.length;
                int i3 = 0;
                while (i2 < length) {
                    switch (a2[i2].level) {
                        case 1:
                        case 2:
                            i = 25344;
                            break;
                        case 8:
                        case 16:
                        case 32:
                            i = 101376;
                            break;
                        case 64:
                            i = 202752;
                            break;
                        case PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH /*128*/:
                        case 256:
                            i = 414720;
                            break;
                        case 512:
                            i = 921600;
                            break;
                        case PreloadTask.BYTE_UNIT_NUMBER /*1024*/:
                            i = 1310720;
                            break;
                        case 2048:
                        case 4096:
                            i = 2097152;
                            break;
                        case VideoCacheReadBuffersizeExperiment.DEFAULT /*8192*/:
                            i = 2228224;
                            break;
                        case 16384:
                            i = 5652480;
                            break;
                        case 32768:
                        case 65536:
                            i = 9437184;
                            break;
                        default:
                            i = -1;
                            break;
                    }
                    i3 = Math.max(i, i3);
                    i2++;
                }
                i2 = Math.max(i3, bsf.f43399a >= 21 ? 345600 : 172800);
            }
            f43115g = i2;
        }
        return f43115g;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0029, code lost:
        if (r3.equals("hev1") != false) goto L_0x0041;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.Pair<java.lang.Integer, java.lang.Integer> m49606a(java.lang.String r9) {
        /*
            r0 = 0
            if (r9 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.lang.String r1 = "\\."
            java.lang.String[] r1 = r9.split(r1)
            r2 = 0
            r3 = r1[r2]
            r4 = -1
            int r5 = r3.hashCode()
            r6 = 3
            r7 = 2
            r8 = 1
            switch(r5) {
                case 3006243: goto L_0x0036;
                case 3006244: goto L_0x002c;
                case 3199032: goto L_0x0023;
                case 3214780: goto L_0x0019;
                default: goto L_0x0018;
            }
        L_0x0018:
            goto L_0x0040
        L_0x0019:
            java.lang.String r2 = "hvc1"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0040
            r2 = 1
            goto L_0x0041
        L_0x0023:
            java.lang.String r5 = "hev1"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x0040
            goto L_0x0041
        L_0x002c:
            java.lang.String r2 = "avc2"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0040
            r2 = 3
            goto L_0x0041
        L_0x0036:
            java.lang.String r2 = "avc1"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0040
            r2 = 2
            goto L_0x0041
        L_0x0040:
            r2 = -1
        L_0x0041:
            switch(r2) {
                case 0: goto L_0x004a;
                case 1: goto L_0x004a;
                case 2: goto L_0x0045;
                case 3: goto L_0x0045;
                default: goto L_0x0044;
            }
        L_0x0044:
            return r0
        L_0x0045:
            android.util.Pair r9 = m49607a(r9, r1)
            return r9
        L_0x004a:
            int r2 = r1.length
            r3 = 4
            if (r2 >= r3) goto L_0x0064
            java.lang.String r1 = "Ignoring malformed HEVC codec string: "
            java.lang.String r9 = java.lang.String.valueOf(r9)
            int r2 = r9.length()
            if (r2 == 0) goto L_0x005e
            r1.concat(r9)
            goto L_0x0063
        L_0x005e:
            java.lang.String r9 = new java.lang.String
            r9.<init>(r1)
        L_0x0063:
            return r0
        L_0x0064:
            java.util.regex.Pattern r2 = f43110b
            r3 = r1[r8]
            java.util.regex.Matcher r2 = r2.matcher(r3)
            boolean r3 = r2.matches()
            if (r3 != 0) goto L_0x0088
            java.lang.String r1 = "Ignoring malformed HEVC codec string: "
            java.lang.String r9 = java.lang.String.valueOf(r9)
            int r2 = r9.length()
            if (r2 == 0) goto L_0x0082
            r1.concat(r9)
            goto L_0x0087
        L_0x0082:
            java.lang.String r9 = new java.lang.String
            r9.<init>(r1)
        L_0x0087:
            return r0
        L_0x0088:
            java.lang.String r9 = r2.group(r8)
            java.lang.String r3 = "1"
            boolean r3 = r3.equals(r9)
            if (r3 == 0) goto L_0x0096
            r7 = 1
            goto L_0x009e
        L_0x0096:
            java.lang.String r3 = "2"
            boolean r3 = r3.equals(r9)
            if (r3 == 0) goto L_0x00ce
        L_0x009e:
            java.util.Map<java.lang.String, java.lang.Integer> r9 = f43114f
            r1 = r1[r6]
            java.lang.Object r9 = r9.get(r1)
            java.lang.Integer r9 = (java.lang.Integer) r9
            if (r9 != 0) goto L_0x00c4
            java.lang.String r9 = "Unknown HEVC level string: "
            java.lang.String r1 = r2.group(r8)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r2 = r1.length()
            if (r2 == 0) goto L_0x00be
            r9.concat(r1)
            goto L_0x00c3
        L_0x00be:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r9)
        L_0x00c3:
            return r0
        L_0x00c4:
            android.util.Pair r0 = new android.util.Pair
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            r0.<init>(r1, r9)
            return r0
        L_0x00ce:
            java.lang.String r1 = "Unknown HEVC profile string: "
            java.lang.String r9 = java.lang.String.valueOf(r9)
            int r2 = r9.length()
            if (r2 == 0) goto L_0x00de
            r1.concat(r9)
            goto L_0x00e3
        L_0x00de:
            java.lang.String r9 = new java.lang.String
            r9.<init>(r1)
        L_0x00e3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.boy.m49606a(java.lang.String):android.util.Pair");
    }

    /* JADX WARNING: Removed duplicated region for block: B:106:0x01b4 A[Catch:{ Exception -> 0x0245 }] */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x0240 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.List<com.google.android.gms.internal.ads.bou> m49610a(com.google.android.gms.internal.ads.boy.C15577a r16, com.google.android.gms.internal.ads.bpa r17) throws com.google.android.gms.internal.ads.zzpj {
        /*
            r1 = r16
            r2 = r17
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ Exception -> 0x0245 }
            r3.<init>()     // Catch:{ Exception -> 0x0245 }
            java.lang.String r4 = r1.f43116a     // Catch:{ Exception -> 0x0245 }
            int r5 = r17.mo41073a()     // Catch:{ Exception -> 0x0245 }
            boolean r6 = r17.mo41076b()     // Catch:{ Exception -> 0x0245 }
            r8 = 0
        L_0x0014:
            if (r8 >= r5) goto L_0x0244
            android.media.MediaCodecInfo r9 = r2.mo41074a(r8)     // Catch:{ Exception -> 0x0245 }
            java.lang.String r10 = r9.getName()     // Catch:{ Exception -> 0x0245 }
            boolean r0 = r9.isEncoder()     // Catch:{ Exception -> 0x0245 }
            if (r0 != 0) goto L_0x01b1
            if (r6 != 0) goto L_0x0030
            java.lang.String r0 = ".secure"
            boolean r0 = r10.endsWith(r0)     // Catch:{ Exception -> 0x0245 }
            if (r0 == 0) goto L_0x0030
            goto L_0x01b1
        L_0x0030:
            int r0 = com.google.android.gms.internal.ads.bsf.f43399a     // Catch:{ Exception -> 0x0245 }
            r12 = 21
            if (r0 >= r12) goto L_0x0068
            java.lang.String r0 = "CIPAACDecoder"
            boolean r0 = r0.equals(r10)     // Catch:{ Exception -> 0x0245 }
            if (r0 != 0) goto L_0x01b1
            java.lang.String r0 = "CIPMP3Decoder"
            boolean r0 = r0.equals(r10)     // Catch:{ Exception -> 0x0245 }
            if (r0 != 0) goto L_0x01b1
            java.lang.String r0 = "CIPVorbisDecoder"
            boolean r0 = r0.equals(r10)     // Catch:{ Exception -> 0x0245 }
            if (r0 != 0) goto L_0x01b1
            java.lang.String r0 = "CIPAMRNBDecoder"
            boolean r0 = r0.equals(r10)     // Catch:{ Exception -> 0x0245 }
            if (r0 != 0) goto L_0x01b1
            java.lang.String r0 = "AACDecoder"
            boolean r0 = r0.equals(r10)     // Catch:{ Exception -> 0x0245 }
            if (r0 != 0) goto L_0x01b1
            java.lang.String r0 = "MP3Decoder"
            boolean r0 = r0.equals(r10)     // Catch:{ Exception -> 0x0245 }
            if (r0 == 0) goto L_0x0068
            goto L_0x01b1
        L_0x0068:
            int r0 = com.google.android.gms.internal.ads.bsf.f43399a     // Catch:{ Exception -> 0x0245 }
            r12 = 18
            if (r0 >= r12) goto L_0x0078
            java.lang.String r0 = "OMX.SEC.MP3.Decoder"
            boolean r0 = r0.equals(r10)     // Catch:{ Exception -> 0x0245 }
            if (r0 == 0) goto L_0x0078
            goto L_0x01b1
        L_0x0078:
            int r0 = com.google.android.gms.internal.ads.bsf.f43399a     // Catch:{ Exception -> 0x0245 }
            if (r0 >= r12) goto L_0x0090
            java.lang.String r0 = "OMX.MTK.AUDIO.DECODER.AAC"
            boolean r0 = r0.equals(r10)     // Catch:{ Exception -> 0x0245 }
            if (r0 == 0) goto L_0x0090
            java.lang.String r0 = "a70"
            java.lang.String r12 = com.google.android.gms.internal.ads.bsf.f43400b     // Catch:{ Exception -> 0x0245 }
            boolean r0 = r0.equals(r12)     // Catch:{ Exception -> 0x0245 }
            if (r0 == 0) goto L_0x0090
            goto L_0x01b1
        L_0x0090:
            int r0 = com.google.android.gms.internal.ads.bsf.f43399a     // Catch:{ Exception -> 0x0245 }
            r12 = 16
            if (r0 != r12) goto L_0x0118
            java.lang.String r0 = "OMX.qcom.audio.decoder.mp3"
            boolean r0 = r0.equals(r10)     // Catch:{ Exception -> 0x0245 }
            if (r0 == 0) goto L_0x0118
            java.lang.String r0 = "dlxu"
            java.lang.String r13 = com.google.android.gms.internal.ads.bsf.f43400b     // Catch:{ Exception -> 0x0245 }
            boolean r0 = r0.equals(r13)     // Catch:{ Exception -> 0x0245 }
            if (r0 != 0) goto L_0x01b1
            java.lang.String r0 = "protou"
            java.lang.String r13 = com.google.android.gms.internal.ads.bsf.f43400b     // Catch:{ Exception -> 0x0245 }
            boolean r0 = r0.equals(r13)     // Catch:{ Exception -> 0x0245 }
            if (r0 != 0) goto L_0x01b1
            java.lang.String r0 = "ville"
            java.lang.String r13 = com.google.android.gms.internal.ads.bsf.f43400b     // Catch:{ Exception -> 0x0245 }
            boolean r0 = r0.equals(r13)     // Catch:{ Exception -> 0x0245 }
            if (r0 != 0) goto L_0x01b1
            java.lang.String r0 = "villeplus"
            java.lang.String r13 = com.google.android.gms.internal.ads.bsf.f43400b     // Catch:{ Exception -> 0x0245 }
            boolean r0 = r0.equals(r13)     // Catch:{ Exception -> 0x0245 }
            if (r0 != 0) goto L_0x01b1
            java.lang.String r0 = "villec2"
            java.lang.String r13 = com.google.android.gms.internal.ads.bsf.f43400b     // Catch:{ Exception -> 0x0245 }
            boolean r0 = r0.equals(r13)     // Catch:{ Exception -> 0x0245 }
            if (r0 != 0) goto L_0x01b1
            java.lang.String r0 = com.google.android.gms.internal.ads.bsf.f43400b     // Catch:{ Exception -> 0x0245 }
            java.lang.String r13 = "gee"
            boolean r0 = r0.startsWith(r13)     // Catch:{ Exception -> 0x0245 }
            if (r0 != 0) goto L_0x01b1
            java.lang.String r0 = "C6602"
            java.lang.String r13 = com.google.android.gms.internal.ads.bsf.f43400b     // Catch:{ Exception -> 0x0245 }
            boolean r0 = r0.equals(r13)     // Catch:{ Exception -> 0x0245 }
            if (r0 != 0) goto L_0x01b1
            java.lang.String r0 = "C6603"
            java.lang.String r13 = com.google.android.gms.internal.ads.bsf.f43400b     // Catch:{ Exception -> 0x0245 }
            boolean r0 = r0.equals(r13)     // Catch:{ Exception -> 0x0245 }
            if (r0 != 0) goto L_0x01b1
            java.lang.String r0 = "C6606"
            java.lang.String r13 = com.google.android.gms.internal.ads.bsf.f43400b     // Catch:{ Exception -> 0x0245 }
            boolean r0 = r0.equals(r13)     // Catch:{ Exception -> 0x0245 }
            if (r0 != 0) goto L_0x01b1
            java.lang.String r0 = "C6616"
            java.lang.String r13 = com.google.android.gms.internal.ads.bsf.f43400b     // Catch:{ Exception -> 0x0245 }
            boolean r0 = r0.equals(r13)     // Catch:{ Exception -> 0x0245 }
            if (r0 != 0) goto L_0x01b1
            java.lang.String r0 = "L36h"
            java.lang.String r13 = com.google.android.gms.internal.ads.bsf.f43400b     // Catch:{ Exception -> 0x0245 }
            boolean r0 = r0.equals(r13)     // Catch:{ Exception -> 0x0245 }
            if (r0 != 0) goto L_0x01b1
            java.lang.String r0 = "SO-02E"
            java.lang.String r13 = com.google.android.gms.internal.ads.bsf.f43400b     // Catch:{ Exception -> 0x0245 }
            boolean r0 = r0.equals(r13)     // Catch:{ Exception -> 0x0245 }
            if (r0 == 0) goto L_0x0118
            goto L_0x01b1
        L_0x0118:
            int r0 = com.google.android.gms.internal.ads.bsf.f43399a     // Catch:{ Exception -> 0x0245 }
            if (r0 != r12) goto L_0x014d
            java.lang.String r0 = "OMX.qcom.audio.decoder.aac"
            boolean r0 = r0.equals(r10)     // Catch:{ Exception -> 0x0245 }
            if (r0 == 0) goto L_0x014d
            java.lang.String r0 = "C1504"
            java.lang.String r12 = com.google.android.gms.internal.ads.bsf.f43400b     // Catch:{ Exception -> 0x0245 }
            boolean r0 = r0.equals(r12)     // Catch:{ Exception -> 0x0245 }
            if (r0 != 0) goto L_0x01b1
            java.lang.String r0 = "C1505"
            java.lang.String r12 = com.google.android.gms.internal.ads.bsf.f43400b     // Catch:{ Exception -> 0x0245 }
            boolean r0 = r0.equals(r12)     // Catch:{ Exception -> 0x0245 }
            if (r0 != 0) goto L_0x01b1
            java.lang.String r0 = "C1604"
            java.lang.String r12 = com.google.android.gms.internal.ads.bsf.f43400b     // Catch:{ Exception -> 0x0245 }
            boolean r0 = r0.equals(r12)     // Catch:{ Exception -> 0x0245 }
            if (r0 != 0) goto L_0x01b1
            java.lang.String r0 = "C1605"
            java.lang.String r12 = com.google.android.gms.internal.ads.bsf.f43400b     // Catch:{ Exception -> 0x0245 }
            boolean r0 = r0.equals(r12)     // Catch:{ Exception -> 0x0245 }
            if (r0 == 0) goto L_0x014d
            goto L_0x01b1
        L_0x014d:
            int r0 = com.google.android.gms.internal.ads.bsf.f43399a     // Catch:{ Exception -> 0x0245 }
            r12 = 19
            if (r0 > r12) goto L_0x0198
            java.lang.String r0 = "OMX.SEC.vp8.dec"
            boolean r0 = r0.equals(r10)     // Catch:{ Exception -> 0x0245 }
            if (r0 == 0) goto L_0x0198
            java.lang.String r0 = "samsung"
            java.lang.String r13 = com.google.android.gms.internal.ads.bsf.f43401c     // Catch:{ Exception -> 0x0245 }
            boolean r0 = r0.equals(r13)     // Catch:{ Exception -> 0x0245 }
            if (r0 == 0) goto L_0x0198
            java.lang.String r0 = com.google.android.gms.internal.ads.bsf.f43400b     // Catch:{ Exception -> 0x0245 }
            java.lang.String r13 = "d2"
            boolean r0 = r0.startsWith(r13)     // Catch:{ Exception -> 0x0245 }
            if (r0 != 0) goto L_0x01b1
            java.lang.String r0 = com.google.android.gms.internal.ads.bsf.f43400b     // Catch:{ Exception -> 0x0245 }
            java.lang.String r13 = "serrano"
            boolean r0 = r0.startsWith(r13)     // Catch:{ Exception -> 0x0245 }
            if (r0 != 0) goto L_0x01b1
            java.lang.String r0 = com.google.android.gms.internal.ads.bsf.f43400b     // Catch:{ Exception -> 0x0245 }
            java.lang.String r13 = "jflte"
            boolean r0 = r0.startsWith(r13)     // Catch:{ Exception -> 0x0245 }
            if (r0 != 0) goto L_0x01b1
            java.lang.String r0 = com.google.android.gms.internal.ads.bsf.f43400b     // Catch:{ Exception -> 0x0245 }
            java.lang.String r13 = "santos"
            boolean r0 = r0.startsWith(r13)     // Catch:{ Exception -> 0x0245 }
            if (r0 != 0) goto L_0x01b1
            java.lang.String r0 = com.google.android.gms.internal.ads.bsf.f43400b     // Catch:{ Exception -> 0x0245 }
            java.lang.String r13 = "t0"
            boolean r0 = r0.startsWith(r13)     // Catch:{ Exception -> 0x0245 }
            if (r0 == 0) goto L_0x0198
            goto L_0x01b1
        L_0x0198:
            int r0 = com.google.android.gms.internal.ads.bsf.f43399a     // Catch:{ Exception -> 0x0245 }
            if (r0 > r12) goto L_0x01af
            java.lang.String r0 = com.google.android.gms.internal.ads.bsf.f43400b     // Catch:{ Exception -> 0x0245 }
            java.lang.String r12 = "jflte"
            boolean r0 = r0.startsWith(r12)     // Catch:{ Exception -> 0x0245 }
            if (r0 == 0) goto L_0x01af
            java.lang.String r0 = "OMX.qcom.video.decoder.vp8"
            boolean r0 = r0.equals(r10)     // Catch:{ Exception -> 0x0245 }
            if (r0 == 0) goto L_0x01af
            goto L_0x01b1
        L_0x01af:
            r0 = 1
            goto L_0x01b2
        L_0x01b1:
            r0 = 0
        L_0x01b2:
            if (r0 == 0) goto L_0x0240
            java.lang.String[] r12 = r9.getSupportedTypes()     // Catch:{ Exception -> 0x0245 }
            int r13 = r12.length     // Catch:{ Exception -> 0x0245 }
            r14 = 0
        L_0x01ba:
            if (r14 >= r13) goto L_0x0240
            r0 = r12[r14]     // Catch:{ Exception -> 0x0245 }
            boolean r15 = r0.equalsIgnoreCase(r4)     // Catch:{ Exception -> 0x0245 }
            if (r15 == 0) goto L_0x023b
            android.media.MediaCodecInfo$CodecCapabilities r0 = r9.getCapabilitiesForType(r0)     // Catch:{ Exception -> 0x022b }
            boolean r15 = r2.mo41075a(r4, r0)     // Catch:{ Exception -> 0x022b }
            int r11 = com.google.android.gms.internal.ads.bsf.f43399a     // Catch:{ Exception -> 0x022b }
            r7 = 22
            if (r11 > r7) goto L_0x01f8
            java.lang.String r7 = com.google.android.gms.internal.ads.bsf.f43402d     // Catch:{ Exception -> 0x022b }
            java.lang.String r11 = "ODROID-XU3"
            boolean r7 = r7.equals(r11)     // Catch:{ Exception -> 0x022b }
            if (r7 != 0) goto L_0x01e6
            java.lang.String r7 = com.google.android.gms.internal.ads.bsf.f43402d     // Catch:{ Exception -> 0x022b }
            java.lang.String r11 = "Nexus 10"
            boolean r7 = r7.equals(r11)     // Catch:{ Exception -> 0x022b }
            if (r7 == 0) goto L_0x01f8
        L_0x01e6:
            java.lang.String r7 = "OMX.Exynos.AVC.Decoder"
            boolean r7 = r7.equals(r10)     // Catch:{ Exception -> 0x022b }
            if (r7 != 0) goto L_0x01f6
            java.lang.String r7 = "OMX.Exynos.AVC.Decoder.secure"
            boolean r7 = r7.equals(r10)     // Catch:{ Exception -> 0x022b }
            if (r7 == 0) goto L_0x01f8
        L_0x01f6:
            r7 = 1
            goto L_0x01f9
        L_0x01f8:
            r7 = 0
        L_0x01f9:
            if (r6 == 0) goto L_0x0202
            boolean r11 = r1.f43117b     // Catch:{ Exception -> 0x022b }
            if (r11 == r15) goto L_0x0200
            goto L_0x0202
        L_0x0200:
            r11 = 0
            goto L_0x0209
        L_0x0202:
            if (r6 != 0) goto L_0x0211
            boolean r11 = r1.f43117b     // Catch:{ Exception -> 0x022b }
            if (r11 != 0) goto L_0x0211
            goto L_0x0200
        L_0x0209:
            com.google.android.gms.internal.ads.bou r0 = com.google.android.gms.internal.ads.bou.m49567a(r10, r4, r0, r7, r11)     // Catch:{ Exception -> 0x022b }
            r3.add(r0)     // Catch:{ Exception -> 0x022b }
            goto L_0x023b
        L_0x0211:
            r11 = 0
            if (r6 != 0) goto L_0x023b
            if (r15 == 0) goto L_0x023b
            java.lang.String r15 = java.lang.String.valueOf(r10)     // Catch:{ Exception -> 0x022b }
            java.lang.String r11 = ".secure"
            java.lang.String r11 = r15.concat(r11)     // Catch:{ Exception -> 0x022b }
            r15 = 1
            com.google.android.gms.internal.ads.bou r0 = com.google.android.gms.internal.ads.bou.m49567a(r11, r4, r0, r7, r15)     // Catch:{ Exception -> 0x0229 }
            r3.add(r0)     // Catch:{ Exception -> 0x0229 }
            return r3
        L_0x0229:
            r0 = move-exception
            goto L_0x022d
        L_0x022b:
            r0 = move-exception
            r15 = 1
        L_0x022d:
            int r7 = com.google.android.gms.internal.ads.bsf.f43399a     // Catch:{ Exception -> 0x0245 }
            r11 = 23
            if (r7 > r11) goto L_0x023a
            boolean r7 = r3.isEmpty()     // Catch:{ Exception -> 0x0245 }
            if (r7 != 0) goto L_0x023a
            goto L_0x023c
        L_0x023a:
            throw r0     // Catch:{ Exception -> 0x0245 }
        L_0x023b:
            r15 = 1
        L_0x023c:
            int r14 = r14 + 1
            goto L_0x01ba
        L_0x0240:
            int r8 = r8 + 1
            goto L_0x0014
        L_0x0244:
            return r3
        L_0x0245:
            r0 = move-exception
            com.google.android.gms.internal.ads.zzpj r1 = new com.google.android.gms.internal.ads.zzpj
            r2 = 0
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.boy.m49610a(com.google.android.gms.internal.ads.boy$a, com.google.android.gms.internal.ads.bpa):java.util.List");
    }

    /* renamed from: a */
    private static Pair<Integer, Integer> m49607a(String str, String[] strArr) {
        Integer num;
        Integer num2;
        if (strArr.length < 2) {
            String str2 = "Ignoring malformed AVC codec string: ";
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2.concat(valueOf);
            } else {
                new String(str2);
            }
            return null;
        }
        try {
            if (strArr[1].length() == 6) {
                Integer valueOf2 = Integer.valueOf(Integer.parseInt(strArr[1].substring(0, 2), 16));
                num = Integer.valueOf(Integer.parseInt(strArr[1].substring(4), 16));
                num2 = valueOf2;
            } else if (strArr.length >= 3) {
                num2 = Integer.valueOf(Integer.parseInt(strArr[1]));
                num = Integer.valueOf(Integer.parseInt(strArr[2]));
            } else {
                String str3 = "Ignoring malformed AVC codec string: ";
                String valueOf3 = String.valueOf(str);
                if (valueOf3.length() != 0) {
                    str3.concat(valueOf3);
                } else {
                    new String(str3);
                }
                return null;
            }
            Integer valueOf4 = Integer.valueOf(f43112d.get(num2.intValue()));
            if (valueOf4 == null) {
                return null;
            }
            Integer valueOf5 = Integer.valueOf(f43113e.get(num.intValue()));
            if (valueOf5 == null) {
                return null;
            }
            return new Pair<>(valueOf4, valueOf5);
        } catch (NumberFormatException unused) {
            String str4 = "Ignoring malformed AVC codec string: ";
            String valueOf6 = String.valueOf(str);
            if (valueOf6.length() != 0) {
                str4.concat(valueOf6);
            } else {
                new String(str4);
            }
            return null;
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f43112d = sparseIntArray;
        sparseIntArray.put(66, 1);
        f43112d.put(77, 2);
        f43112d.put(88, 4);
        f43112d.put(100, 8);
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f43113e = sparseIntArray2;
        sparseIntArray2.put(10, 1);
        f43113e.put(11, 4);
        f43113e.put(12, 8);
        f43113e.put(13, 16);
        f43113e.put(20, 32);
        f43113e.put(21, 64);
        f43113e.put(22, PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);
        f43113e.put(30, 256);
        f43113e.put(31, 512);
        f43113e.put(32, PreloadTask.BYTE_UNIT_NUMBER);
        f43113e.put(40, 2048);
        f43113e.put(41, 4096);
        f43113e.put(42, VideoCacheReadBuffersizeExperiment.DEFAULT);
        f43113e.put(50, 16384);
        f43113e.put(51, 32768);
        f43113e.put(52, 65536);
        HashMap hashMap = new HashMap();
        f43114f = hashMap;
        hashMap.put("L30", Integer.valueOf(1));
        f43114f.put("L60", Integer.valueOf(4));
        f43114f.put("L63", Integer.valueOf(16));
        f43114f.put("L90", Integer.valueOf(64));
        f43114f.put("L93", Integer.valueOf(256));
        f43114f.put("L120", Integer.valueOf(PreloadTask.BYTE_UNIT_NUMBER));
        f43114f.put("L123", Integer.valueOf(4096));
        f43114f.put("L150", Integer.valueOf(16384));
        f43114f.put("L153", Integer.valueOf(65536));
        f43114f.put("L156", Integer.valueOf(262144));
        f43114f.put("L180", Integer.valueOf(1048576));
        f43114f.put("L183", Integer.valueOf(4194304));
        f43114f.put("L186", Integer.valueOf(16777216));
        f43114f.put("H30", Integer.valueOf(2));
        f43114f.put("H60", Integer.valueOf(8));
        f43114f.put("H63", Integer.valueOf(32));
        f43114f.put("H90", Integer.valueOf(PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH));
        f43114f.put("H93", Integer.valueOf(512));
        f43114f.put("H120", Integer.valueOf(2048));
        f43114f.put("H123", Integer.valueOf(VideoCacheReadBuffersizeExperiment.DEFAULT));
        f43114f.put("H150", Integer.valueOf(32768));
        f43114f.put("H153", Integer.valueOf(131072));
        f43114f.put("H156", Integer.valueOf(524288));
        f43114f.put("H180", Integer.valueOf(2097152));
        f43114f.put("H183", Integer.valueOf(8388608));
        f43114f.put("H186", Integer.valueOf(33554432));
    }
}

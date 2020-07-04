package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.google.android.gms.internal.ads.zzpn.zza;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import java.util.ArrayList;
import java.util.List;

final class boc {

    /* renamed from: a */
    private static final int f42948a = bsf.m49946c("vide");

    /* renamed from: b */
    private static final int f42949b = bsf.m49946c("soun");

    /* renamed from: c */
    private static final int f42950c = bsf.m49946c("text");

    /* renamed from: d */
    private static final int f42951d = bsf.m49946c("sbtl");

    /* renamed from: e */
    private static final int f42952e = bsf.m49946c("subt");

    /* renamed from: f */
    private static final int f42953f = bsf.m49946c("clcp");

    /* renamed from: g */
    private static final int f42954g = bsf.m49946c("cenc");

    /* renamed from: h */
    private static final int f42955h = bsf.m49946c("meta");

    /* JADX WARNING: Removed duplicated region for block: B:356:0x061b  */
    /* JADX WARNING: Removed duplicated region for block: B:360:0x065f  */
    /* JADX WARNING: Removed duplicated region for block: B:381:0x06c3 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:382:0x06c4  */
    /* JADX WARNING: Removed duplicated region for block: B:390:0x0633 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01a7  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.ads.boq m49532a(com.google.android.gms.internal.ads.boa r49, com.google.android.gms.internal.ads.bob r50, long r51, com.google.android.gms.internal.ads.zznd r53, boolean r54) throws com.google.android.gms.internal.ads.zzll {
        /*
            r0 = r49
            int r2 = com.google.android.gms.internal.ads.bnz.f42941y
            com.google.android.gms.internal.ads.boa r2 = r0.mo41051e(r2)
            int r3 = com.google.android.gms.internal.ads.bnz.f42860K
            com.google.android.gms.internal.ads.bob r3 = r2.mo41050d(r3)
            com.google.android.gms.internal.ads.bsa r3 = r3.f42947az
            r4 = 16
            r3.mo41223c(r4)
            int r3 = r3.mo41232j()
            int r5 = f42949b
            r6 = 3
            r7 = 4
            r9 = -1
            if (r3 != r5) goto L_0x0022
            r13 = 1
            goto L_0x0042
        L_0x0022:
            int r5 = f42948a
            if (r3 != r5) goto L_0x0028
            r13 = 2
            goto L_0x0042
        L_0x0028:
            int r5 = f42950c
            if (r3 == r5) goto L_0x0041
            int r5 = f42951d
            if (r3 == r5) goto L_0x0041
            int r5 = f42952e
            if (r3 == r5) goto L_0x0041
            int r5 = f42953f
            if (r3 != r5) goto L_0x0039
            goto L_0x0041
        L_0x0039:
            int r5 = f42955h
            if (r3 != r5) goto L_0x003f
            r13 = 4
            goto L_0x0042
        L_0x003f:
            r13 = -1
            goto L_0x0042
        L_0x0041:
            r13 = 3
        L_0x0042:
            r3 = 0
            if (r13 != r9) goto L_0x0046
            return r3
        L_0x0046:
            int r5 = com.google.android.gms.internal.ads.bnz.f42856G
            com.google.android.gms.internal.ads.bob r5 = r0.mo41050d(r5)
            com.google.android.gms.internal.ads.bsa r5 = r5.f42947az
            r11 = 8
            r5.mo41223c(r11)
            int r12 = r5.mo41232j()
            int r12 = com.google.android.gms.internal.ads.bnz.m49520a(r12)
            if (r12 != 0) goto L_0x0060
            r14 = 8
            goto L_0x0062
        L_0x0060:
            r14 = 16
        L_0x0062:
            r5.mo41225d(r14)
            int r14 = r5.mo41232j()
            r5.mo41225d(r7)
            int r15 = r5.f43389b
            if (r12 != 0) goto L_0x0072
            r8 = 4
            goto L_0x0074
        L_0x0072:
            r8 = 8
        L_0x0074:
            r10 = 0
        L_0x0075:
            if (r10 >= r8) goto L_0x0085
            byte[] r3 = r5.f43388a
            int r16 = r15 + r10
            byte r3 = r3[r16]
            if (r3 == r9) goto L_0x0081
            r3 = 0
            goto L_0x0086
        L_0x0081:
            int r10 = r10 + 1
            r3 = 0
            goto L_0x0075
        L_0x0085:
            r3 = 1
        L_0x0086:
            r15 = 0
            r17 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r3 == 0) goto L_0x0095
            r5.mo41225d(r8)
        L_0x0092:
            r9 = r17
            goto L_0x00a7
        L_0x0095:
            if (r12 != 0) goto L_0x009c
            long r19 = r5.mo41230h()
            goto L_0x00a0
        L_0x009c:
            long r19 = r5.mo41236n()
        L_0x00a0:
            int r3 = (r19 > r15 ? 1 : (r19 == r15 ? 0 : -1))
            if (r3 != 0) goto L_0x00a5
            goto L_0x0092
        L_0x00a5:
            r9 = r19
        L_0x00a7:
            r5.mo41225d(r4)
            int r3 = r5.mo41232j()
            int r8 = r5.mo41232j()
            r5.mo41225d(r7)
            int r12 = r5.mo41232j()
            int r5 = r5.mo41232j()
            r7 = 65536(0x10000, float:9.18355E-41)
            r15 = -65536(0xffffffffffff0000, float:NaN)
            if (r3 != 0) goto L_0x00cc
            if (r8 != r7) goto L_0x00cc
            if (r12 != r15) goto L_0x00cc
            if (r5 != 0) goto L_0x00cc
            r3 = 90
            goto L_0x00e3
        L_0x00cc:
            if (r3 != 0) goto L_0x00d7
            if (r8 != r15) goto L_0x00d7
            if (r12 != r7) goto L_0x00d7
            if (r5 != 0) goto L_0x00d7
            r3 = 270(0x10e, float:3.78E-43)
            goto L_0x00e3
        L_0x00d7:
            if (r3 != r15) goto L_0x00e2
            if (r8 != 0) goto L_0x00e2
            if (r12 != 0) goto L_0x00e2
            if (r5 != r15) goto L_0x00e2
            r3 = 180(0xb4, float:2.52E-43)
            goto L_0x00e3
        L_0x00e2:
            r3 = 0
        L_0x00e3:
            com.google.android.gms.internal.ads.boi r5 = new com.google.android.gms.internal.ads.boi
            r5.<init>(r14, r9, r3)
            long r19 = r5.f42978b
            r3 = r50
            com.google.android.gms.internal.ads.bsa r3 = r3.f42947az
            r3.mo41223c(r11)
            int r7 = r3.mo41232j()
            int r7 = com.google.android.gms.internal.ads.bnz.m49520a(r7)
            if (r7 != 0) goto L_0x0100
            r7 = 8
            goto L_0x0102
        L_0x0100:
            r7 = 16
        L_0x0102:
            r3.mo41225d(r7)
            long r7 = r3.mo41230h()
            int r3 = (r19 > r17 ? 1 : (r19 == r17 ? 0 : -1))
            if (r3 != 0) goto L_0x0110
            r18 = r17
            goto L_0x011b
        L_0x0110:
            r21 = 1000000(0xf4240, double:4.940656E-318)
            r23 = r7
            long r9 = com.google.android.gms.internal.ads.bsf.m49936a(r19, r21, r23)
            r18 = r9
        L_0x011b:
            int r3 = com.google.android.gms.internal.ads.bnz.f42942z
            com.google.android.gms.internal.ads.boa r3 = r2.mo41051e(r3)
            int r9 = com.google.android.gms.internal.ads.bnz.f42850A
            com.google.android.gms.internal.ads.boa r3 = r3.mo41051e(r9)
            int r9 = com.google.android.gms.internal.ads.bnz.f42859J
            com.google.android.gms.internal.ads.bob r2 = r2.mo41050d(r9)
            com.google.android.gms.internal.ads.bsa r2 = r2.f42947az
            r2.mo41223c(r11)
            int r9 = r2.mo41232j()
            int r9 = com.google.android.gms.internal.ads.bnz.m49520a(r9)
            if (r9 != 0) goto L_0x013f
            r10 = 8
            goto L_0x0141
        L_0x013f:
            r10 = 16
        L_0x0141:
            r2.mo41225d(r10)
            long r14 = r2.mo41230h()
            if (r9 != 0) goto L_0x014c
            r9 = 4
            goto L_0x014e
        L_0x014c:
            r9 = 8
        L_0x014e:
            r2.mo41225d(r9)
            int r2 = r2.mo41226e()
            int r9 = r2 >> 10
            r9 = r9 & 31
            int r9 = r9 + 96
            char r9 = (char) r9
            int r10 = r2 >> 5
            r10 = r10 & 31
            int r10 = r10 + 96
            char r10 = (char) r10
            r2 = r2 & 31
            int r2 = r2 + 96
            char r2 = (char) r2
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>(r6)
            r12.append(r9)
            r12.append(r10)
            r12.append(r2)
            java.lang.String r2 = r12.toString()
            java.lang.Long r9 = java.lang.Long.valueOf(r14)
            android.util.Pair r2 = android.util.Pair.create(r9, r2)
            int r9 = com.google.android.gms.internal.ads.bnz.f42861L
            com.google.android.gms.internal.ads.bob r3 = r3.mo41050d(r9)
            com.google.android.gms.internal.ads.bsa r3 = r3.f42947az
            int r9 = r5.f42977a
            int r10 = r5.f42979c
            java.lang.Object r12 = r2.second
            java.lang.String r12 = (java.lang.String) r12
            r14 = 12
            r3.mo41223c(r14)
            int r14 = r3.mo41232j()
            com.google.android.gms.internal.ads.bof r15 = new com.google.android.gms.internal.ads.bof
            r15.<init>(r14)
            r6 = 0
        L_0x01a5:
            if (r6 >= r14) goto L_0x064d
            int r4 = r3.f43389b
            int r11 = r3.mo41232j()
            if (r11 <= 0) goto L_0x01b5
            r42 = r7
            r41 = r14
            r14 = 1
            goto L_0x01ba
        L_0x01b5:
            r42 = r7
            r41 = r14
            r14 = 0
        L_0x01ba:
            java.lang.String r7 = "childAtomSize should be positive"
            com.google.android.gms.internal.ads.brr.m49872a(r14, r7)
            int r7 = r3.mo41232j()
            int r8 = com.google.android.gms.internal.ads.bnz.f42918b
            if (r7 == r8) goto L_0x04bd
            int r8 = com.google.android.gms.internal.ads.bnz.f42919c
            if (r7 == r8) goto L_0x04bd
            int r8 = com.google.android.gms.internal.ads.bnz.f42866Q
            if (r7 == r8) goto L_0x04bd
            int r8 = com.google.android.gms.internal.ads.bnz.f42871V
            if (r7 == r8) goto L_0x04bd
            int r8 = com.google.android.gms.internal.ads.bnz.f42920d
            if (r7 == r8) goto L_0x04bd
            int r8 = com.google.android.gms.internal.ads.bnz.f42921e
            if (r7 == r8) goto L_0x04bd
            int r8 = com.google.android.gms.internal.ads.bnz.f42922f
            if (r7 == r8) goto L_0x04bd
            int r8 = com.google.android.gms.internal.ads.bnz.f42912at
            if (r7 == r8) goto L_0x04bd
            int r8 = com.google.android.gms.internal.ads.bnz.f42913au
            if (r7 != r8) goto L_0x01e9
            goto L_0x04bd
        L_0x01e9:
            int r8 = com.google.android.gms.internal.ads.bnz.f42924h
            if (r7 == r8) goto L_0x02c5
            int r8 = com.google.android.gms.internal.ads.bnz.f42867R
            if (r7 == r8) goto L_0x02c5
            int r8 = com.google.android.gms.internal.ads.bnz.f42929m
            if (r7 == r8) goto L_0x02c5
            int r8 = com.google.android.gms.internal.ads.bnz.f42931o
            if (r7 == r8) goto L_0x02c5
            int r8 = com.google.android.gms.internal.ads.bnz.f42933q
            if (r7 == r8) goto L_0x02c5
            int r8 = com.google.android.gms.internal.ads.bnz.f42936t
            if (r7 == r8) goto L_0x02c5
            int r8 = com.google.android.gms.internal.ads.bnz.f42934r
            if (r7 == r8) goto L_0x02c5
            int r8 = com.google.android.gms.internal.ads.bnz.f42935s
            if (r7 == r8) goto L_0x02c5
            int r8 = com.google.android.gms.internal.ads.bnz.f42901ai
            if (r7 == r8) goto L_0x02c5
            int r8 = com.google.android.gms.internal.ads.bnz.f42902aj
            if (r7 == r8) goto L_0x02c5
            int r8 = com.google.android.gms.internal.ads.bnz.f42927k
            if (r7 == r8) goto L_0x02c5
            int r8 = com.google.android.gms.internal.ads.bnz.f42928l
            if (r7 == r8) goto L_0x02c5
            int r8 = com.google.android.gms.internal.ads.bnz.f42925i
            if (r7 == r8) goto L_0x02c5
            int r8 = com.google.android.gms.internal.ads.bnz.f42916ax
            if (r7 != r8) goto L_0x0223
            goto L_0x02c5
        L_0x0223:
            int r8 = com.google.android.gms.internal.ads.bnz.f42870U
            if (r7 == r8) goto L_0x0252
            int r8 = com.google.android.gms.internal.ads.bnz.f42897ae
            if (r7 == r8) goto L_0x0252
            int r8 = com.google.android.gms.internal.ads.bnz.f42898af
            if (r7 == r8) goto L_0x0252
            int r8 = com.google.android.gms.internal.ads.bnz.f42899ag
            if (r7 == r8) goto L_0x0252
            int r8 = com.google.android.gms.internal.ads.bnz.f42900ah
            if (r7 != r8) goto L_0x0238
            goto L_0x0252
        L_0x0238:
            int r8 = com.google.android.gms.internal.ads.bnz.f42915aw
            if (r7 != r8) goto L_0x024e
            java.lang.String r7 = java.lang.Integer.toString(r9)
            java.lang.String r8 = "application/x-camera-motion"
            r44 = r13
            r13 = -1
            r14 = 0
            com.google.android.gms.internal.ads.zzlg r7 = com.google.android.gms.internal.ads.zzlg.m53195a(r7, r8, r14, r13, r14)
            r15.f42966b = r7
            goto L_0x0306
        L_0x024e:
            r44 = r13
            goto L_0x0306
        L_0x0252:
            r44 = r13
            int r8 = r4 + 8
            r13 = 8
            int r8 = r8 + r13
            r3.mo41223c(r8)
            int r8 = com.google.android.gms.internal.ads.bnz.f42870U
            if (r7 != r8) goto L_0x026c
            java.lang.String r7 = "application/ttml+xml"
        L_0x0262:
            r27 = r7
            r34 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x0269:
            r36 = 0
            goto L_0x02a8
        L_0x026c:
            int r8 = com.google.android.gms.internal.ads.bnz.f42897ae
            if (r7 != r8) goto L_0x028c
            java.lang.String r7 = "application/x-quicktime-tx3g"
            int r8 = r11 + -8
            r16 = 8
            int r8 = r8 + -8
            byte[] r13 = new byte[r8]
            r14 = 0
            r3.mo41219a(r13, r14, r8)
            java.util.List r8 = java.util.Collections.singletonList(r13)
            r27 = r7
            r36 = r8
            r34 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L_0x02a8
        L_0x028c:
            int r8 = com.google.android.gms.internal.ads.bnz.f42898af
            if (r7 != r8) goto L_0x0293
            java.lang.String r7 = "application/x-mp4-vtt"
            goto L_0x0262
        L_0x0293:
            int r8 = com.google.android.gms.internal.ads.bnz.f42899ag
            if (r7 != r8) goto L_0x029e
            java.lang.String r7 = "application/ttml+xml"
            r27 = r7
            r34 = 0
            goto L_0x0269
        L_0x029e:
            int r8 = com.google.android.gms.internal.ads.bnz.f42900ah
            if (r7 != r8) goto L_0x02bf
            java.lang.String r7 = "application/x-mp4-cea-608"
            r8 = 1
            r15.f42968d = r8
            goto L_0x0262
        L_0x02a8:
            java.lang.String r26 = java.lang.Integer.toString(r9)
            r28 = 0
            r29 = -1
            r30 = 0
            r32 = -1
            r33 = 0
            r31 = r12
            com.google.android.gms.internal.ads.zzlg r7 = com.google.android.gms.internal.ads.zzlg.m53193a(r26, r27, r28, r29, r30, r31, r32, r33, r34, r36)
            r15.f42966b = r7
            goto L_0x0306
        L_0x02bf:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x02c5:
            r44 = r13
            int r8 = r4 + 8
            r13 = 8
            int r8 = r8 + r13
            r3.mo41223c(r8)
            if (r54 == 0) goto L_0x02da
            int r8 = r3.mo41226e()
            r14 = 6
            r3.mo41225d(r14)
            goto L_0x02de
        L_0x02da:
            r3.mo41225d(r13)
            r8 = 0
        L_0x02de:
            if (r8 == 0) goto L_0x030f
            r13 = 1
            if (r8 != r13) goto L_0x02e4
            goto L_0x030f
        L_0x02e4:
            r13 = 2
            if (r8 != r13) goto L_0x0306
            r8 = 16
            r3.mo41225d(r8)
            long r13 = r3.mo41233k()
            double r13 = java.lang.Double.longBitsToDouble(r13)
            long r13 = java.lang.Math.round(r13)
            int r8 = (int) r13
            int r13 = r3.mo41235m()
            r14 = 20
            r3.mo41225d(r14)
            r14 = r8
            r45 = r13
            goto L_0x0325
        L_0x0306:
            r46 = r2
            r47 = r5
            r48 = r10
        L_0x030c:
            r14 = 3
            goto L_0x0633
        L_0x030f:
            int r13 = r3.mo41226e()
            r14 = 6
            r3.mo41225d(r14)
            int r14 = r3.mo41234l()
            r45 = r13
            r13 = 1
            if (r8 != r13) goto L_0x0325
            r8 = 16
            r3.mo41225d(r8)
        L_0x0325:
            int r8 = r3.f43389b
            int r13 = com.google.android.gms.internal.ads.bnz.f42867R
            if (r7 != r13) goto L_0x0332
            int r7 = m49530a(r3, r4, r11, r15, r6)
            r3.mo41223c(r8)
        L_0x0332:
            int r13 = com.google.android.gms.internal.ads.bnz.f42929m
            if (r7 != r13) goto L_0x0339
            java.lang.String r7 = "audio/ac3"
            goto L_0x0383
        L_0x0339:
            int r13 = com.google.android.gms.internal.ads.bnz.f42931o
            if (r7 != r13) goto L_0x0340
            java.lang.String r7 = "audio/eac3"
            goto L_0x0383
        L_0x0340:
            int r13 = com.google.android.gms.internal.ads.bnz.f42933q
            if (r7 != r13) goto L_0x0347
            java.lang.String r7 = "audio/vnd.dts"
            goto L_0x0383
        L_0x0347:
            int r13 = com.google.android.gms.internal.ads.bnz.f42934r
            if (r7 == r13) goto L_0x0381
            int r13 = com.google.android.gms.internal.ads.bnz.f42935s
            if (r7 != r13) goto L_0x0350
            goto L_0x0381
        L_0x0350:
            int r13 = com.google.android.gms.internal.ads.bnz.f42936t
            if (r7 != r13) goto L_0x0357
            java.lang.String r7 = "audio/vnd.dts.hd;profile=lbr"
            goto L_0x0383
        L_0x0357:
            int r13 = com.google.android.gms.internal.ads.bnz.f42901ai
            if (r7 != r13) goto L_0x035e
            java.lang.String r7 = "audio/3gpp"
            goto L_0x0383
        L_0x035e:
            int r13 = com.google.android.gms.internal.ads.bnz.f42902aj
            if (r7 != r13) goto L_0x0365
            java.lang.String r7 = "audio/amr-wb"
            goto L_0x0383
        L_0x0365:
            int r13 = com.google.android.gms.internal.ads.bnz.f42927k
            if (r7 == r13) goto L_0x037e
            int r13 = com.google.android.gms.internal.ads.bnz.f42928l
            if (r7 != r13) goto L_0x036e
            goto L_0x037e
        L_0x036e:
            int r13 = com.google.android.gms.internal.ads.bnz.f42925i
            if (r7 != r13) goto L_0x0375
            java.lang.String r7 = "audio/mpeg"
            goto L_0x0383
        L_0x0375:
            int r13 = com.google.android.gms.internal.ads.bnz.f42916ax
            if (r7 != r13) goto L_0x037c
            java.lang.String r7 = "audio/alac"
            goto L_0x0383
        L_0x037c:
            r7 = 0
            goto L_0x0383
        L_0x037e:
            java.lang.String r7 = "audio/raw"
            goto L_0x0383
        L_0x0381:
            java.lang.String r7 = "audio/vnd.dts.hd"
        L_0x0383:
            r46 = r2
            r13 = 0
        L_0x0386:
            int r2 = r8 - r4
            if (r2 >= r11) goto L_0x047c
            r3.mo41223c(r8)
            int r2 = r3.mo41232j()
            if (r2 <= 0) goto L_0x0397
            r47 = r5
            r5 = 1
            goto L_0x039a
        L_0x0397:
            r47 = r5
            r5 = 0
        L_0x039a:
            java.lang.String r0 = "childAtomSize should be positive"
            com.google.android.gms.internal.ads.brr.m49872a(r5, r0)
            int r0 = r3.mo41232j()
            int r5 = com.google.android.gms.internal.ads.bnz.f42853D
            if (r0 == r5) goto L_0x040f
            if (r54 == 0) goto L_0x03ae
            int r5 = com.google.android.gms.internal.ads.bnz.f42926j
            if (r0 != r5) goto L_0x03ae
            goto L_0x040f
        L_0x03ae:
            int r5 = com.google.android.gms.internal.ads.bnz.f42930n
            if (r0 != r5) goto L_0x03c4
            int r0 = r8 + 8
            r3.mo41223c(r0)
            java.lang.String r0 = java.lang.Integer.toString(r9)
            r5 = 0
            com.google.android.gms.internal.ads.zzlg r0 = com.google.android.gms.internal.ads.blq.m49254a(r3, r0, r12, r5)
            r15.f42966b = r0
        L_0x03c2:
            r5 = 0
            goto L_0x040a
        L_0x03c4:
            int r5 = com.google.android.gms.internal.ads.bnz.f42932p
            if (r0 != r5) goto L_0x03d9
            int r0 = r8 + 8
            r3.mo41223c(r0)
            java.lang.String r0 = java.lang.Integer.toString(r9)
            r5 = 0
            com.google.android.gms.internal.ads.zzlg r0 = com.google.android.gms.internal.ads.blq.m49255b(r3, r0, r12, r5)
            r15.f42966b = r0
            goto L_0x03c2
        L_0x03d9:
            int r5 = com.google.android.gms.internal.ads.bnz.f42937u
            if (r0 != r5) goto L_0x03fc
            java.lang.String r26 = java.lang.Integer.toString(r9)
            r28 = 0
            r29 = -1
            r30 = -1
            r33 = 0
            r34 = 0
            r35 = 0
            r27 = r7
            r31 = r45
            r32 = r14
            r36 = r12
            com.google.android.gms.internal.ads.zzlg r0 = com.google.android.gms.internal.ads.zzlg.m53192a(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            r15.f42966b = r0
            goto L_0x03c2
        L_0x03fc:
            int r5 = com.google.android.gms.internal.ads.bnz.f42916ax
            if (r0 != r5) goto L_0x03c2
            byte[] r0 = new byte[r2]
            r3.mo41223c(r8)
            r5 = 0
            r3.mo41219a(r0, r5, r2)
            r13 = r0
        L_0x040a:
            r48 = r10
            r1 = -1
            goto L_0x0473
        L_0x040f:
            int r5 = com.google.android.gms.internal.ads.bnz.f42853D
            if (r0 != r5) goto L_0x0418
            r0 = r8
            r48 = r10
        L_0x0416:
            r1 = -1
            goto L_0x0444
        L_0x0418:
            int r0 = r3.f43389b
        L_0x041a:
            int r5 = r0 - r8
            if (r5 >= r2) goto L_0x0440
            r3.mo41223c(r0)
            int r5 = r3.mo41232j()
            if (r5 <= 0) goto L_0x042b
            r48 = r10
            r1 = 1
            goto L_0x042e
        L_0x042b:
            r48 = r10
            r1 = 0
        L_0x042e:
            java.lang.String r10 = "childAtomSize should be positive"
            com.google.android.gms.internal.ads.brr.m49872a(r1, r10)
            int r1 = r3.mo41232j()
            int r10 = com.google.android.gms.internal.ads.bnz.f42853D
            if (r1 != r10) goto L_0x043c
            goto L_0x0416
        L_0x043c:
            int r0 = r0 + r5
            r10 = r48
            goto L_0x041a
        L_0x0440:
            r48 = r10
            r0 = -1
            goto L_0x0416
        L_0x0444:
            if (r0 == r1) goto L_0x0473
            android.util.Pair r0 = m49531a(r3, r0)
            java.lang.Object r5 = r0.first
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r0 = r0.second
            r13 = r0
            byte[] r13 = (byte[]) r13
            java.lang.String r0 = "audio/mp4a-latm"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x0472
            android.util.Pair r0 = com.google.android.gms.internal.ads.brs.m49876a(r13)
            java.lang.Object r7 = r0.first
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            java.lang.Object r0 = r0.second
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r45 = r0
            r14 = r7
        L_0x0472:
            r7 = r5
        L_0x0473:
            int r8 = r8 + r2
            r5 = r47
            r10 = r48
            r0 = r49
            goto L_0x0386
        L_0x047c:
            r47 = r5
            r48 = r10
            r1 = -1
            com.google.android.gms.internal.ads.zzlg r0 = r15.f42966b
            if (r0 != 0) goto L_0x030c
            if (r7 == 0) goto L_0x030c
            java.lang.String r0 = "audio/raw"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x0492
            r33 = 2
            goto L_0x0494
        L_0x0492:
            r33 = -1
        L_0x0494:
            java.lang.String r26 = java.lang.Integer.toString(r9)
            r28 = 0
            r29 = -1
            r30 = -1
            if (r13 != 0) goto L_0x04a3
            r34 = 0
            goto L_0x04a9
        L_0x04a3:
            java.util.List r0 = java.util.Collections.singletonList(r13)
            r34 = r0
        L_0x04a9:
            r35 = 0
            r36 = 0
            r27 = r7
            r31 = r45
            r32 = r14
            r37 = r12
            com.google.android.gms.internal.ads.zzlg r0 = com.google.android.gms.internal.ads.zzlg.m53191a(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            r15.f42966b = r0
            goto L_0x030c
        L_0x04bd:
            r46 = r2
            r47 = r5
            r48 = r10
            r44 = r13
            r1 = -1
            int r0 = r4 + 8
            r2 = 8
            int r0 = r0 + r2
            r3.mo41223c(r0)
            r0 = 16
            r3.mo41225d(r0)
            int r31 = r3.mo41226e()
            int r32 = r3.mo41226e()
            r2 = 1065353216(0x3f800000, float:1.0)
            r5 = 50
            r3.mo41225d(r5)
            int r5 = r3.f43389b
            int r8 = com.google.android.gms.internal.ads.bnz.f42866Q
            if (r7 != r8) goto L_0x04ef
            int r7 = m49530a(r3, r4, r11, r15, r6)
            r3.mo41223c(r5)
        L_0x04ef:
            r10 = 0
            r27 = 0
            r34 = 0
            r36 = 1065353216(0x3f800000, float:1.0)
            r37 = 0
            r38 = -1
        L_0x04fa:
            int r2 = r5 - r4
            if (r2 >= r11) goto L_0x0618
            r3.mo41223c(r5)
            int r2 = r3.f43389b
            int r8 = r3.mo41232j()
            if (r8 != 0) goto L_0x050e
            int r13 = r3.f43389b
            int r13 = r13 - r4
            if (r13 == r11) goto L_0x0618
        L_0x050e:
            if (r8 <= 0) goto L_0x0512
            r13 = 1
            goto L_0x0513
        L_0x0512:
            r13 = 0
        L_0x0513:
            java.lang.String r14 = "childAtomSize should be positive"
            com.google.android.gms.internal.ads.brr.m49872a(r13, r14)
            int r13 = r3.mo41232j()
            int r14 = com.google.android.gms.internal.ads.bnz.f42851B
            if (r13 != r14) goto L_0x0546
            if (r27 != 0) goto L_0x0524
            r13 = 1
            goto L_0x0525
        L_0x0524:
            r13 = 0
        L_0x0525:
            com.google.android.gms.internal.ads.brr.m49873b(r13)
            java.lang.String r13 = "video/avc"
            int r2 = r2 + 8
            r3.mo41223c(r2)
            com.google.android.gms.internal.ads.bsi r2 = com.google.android.gms.internal.ads.bsi.m49949a(r3)
            java.util.List<byte[]> r14 = r2.f43409a
            int r0 = r2.f43410b
            r15.f42967c = r0
            if (r10 != 0) goto L_0x053f
            float r0 = r2.f43411c
            r36 = r0
        L_0x053f:
            r27 = r13
            r34 = r14
        L_0x0543:
            r14 = 3
            goto L_0x0612
        L_0x0546:
            int r0 = com.google.android.gms.internal.ads.bnz.f42852C
            if (r13 != r0) goto L_0x0568
            if (r27 != 0) goto L_0x054e
            r0 = 1
            goto L_0x054f
        L_0x054e:
            r0 = 0
        L_0x054f:
            com.google.android.gms.internal.ads.brr.m49873b(r0)
            java.lang.String r0 = "video/hevc"
            int r2 = r2 + 8
            r3.mo41223c(r2)
            com.google.android.gms.internal.ads.bsn r2 = com.google.android.gms.internal.ads.bsn.m49955a(r3)
            java.util.List<byte[]> r13 = r2.f43420a
            int r2 = r2.f43421b
            r15.f42967c = r2
            r27 = r0
            r34 = r13
            goto L_0x0543
        L_0x0568:
            int r0 = com.google.android.gms.internal.ads.bnz.f42914av
            if (r13 != r0) goto L_0x057e
            if (r27 != 0) goto L_0x0570
            r0 = 1
            goto L_0x0571
        L_0x0570:
            r0 = 0
        L_0x0571:
            com.google.android.gms.internal.ads.brr.m49873b(r0)
            int r0 = com.google.android.gms.internal.ads.bnz.f42912at
            if (r7 != r0) goto L_0x057b
            java.lang.String r0 = "video/x-vnd.on2.vp8"
            goto L_0x058c
        L_0x057b:
            java.lang.String r0 = "video/x-vnd.on2.vp9"
            goto L_0x058c
        L_0x057e:
            int r0 = com.google.android.gms.internal.ads.bnz.f42923g
            if (r13 != r0) goto L_0x058f
            if (r27 != 0) goto L_0x0586
            r0 = 1
            goto L_0x0587
        L_0x0586:
            r0 = 0
        L_0x0587:
            com.google.android.gms.internal.ads.brr.m49873b(r0)
            java.lang.String r0 = "video/3gpp"
        L_0x058c:
            r27 = r0
            goto L_0x0543
        L_0x058f:
            int r0 = com.google.android.gms.internal.ads.bnz.f42853D
            if (r13 != r0) goto L_0x05b0
            if (r27 != 0) goto L_0x0597
            r0 = 1
            goto L_0x0598
        L_0x0597:
            r0 = 0
        L_0x0598:
            com.google.android.gms.internal.ads.brr.m49873b(r0)
            android.util.Pair r0 = m49531a(r3, r2)
            java.lang.Object r2 = r0.first
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r0 = r0.second
            byte[] r0 = (byte[]) r0
            java.util.List r0 = java.util.Collections.singletonList(r0)
            r34 = r0
            r27 = r2
            goto L_0x0543
        L_0x05b0:
            int r0 = com.google.android.gms.internal.ads.bnz.f42869T
            if (r13 != r0) goto L_0x05c8
            int r2 = r2 + 8
            r3.mo41223c(r2)
            int r0 = r3.mo41235m()
            int r2 = r3.mo41235m()
            float r0 = (float) r0
            float r2 = (float) r2
            float r36 = r0 / r2
            r10 = 1
            goto L_0x0543
        L_0x05c8:
            int r0 = com.google.android.gms.internal.ads.bnz.f42910ar
            if (r13 != r0) goto L_0x05f1
            int r0 = r2 + 8
        L_0x05ce:
            int r13 = r0 - r2
            if (r13 >= r8) goto L_0x05ec
            r3.mo41223c(r0)
            int r13 = r3.mo41232j()
            int r14 = r3.mo41232j()
            int r1 = com.google.android.gms.internal.ads.bnz.f42911as
            if (r14 != r1) goto L_0x05e9
            byte[] r1 = r3.f43388a
            int r13 = r13 + r0
            byte[] r0 = java.util.Arrays.copyOfRange(r1, r0, r13)
            goto L_0x05ed
        L_0x05e9:
            int r0 = r0 + r13
            r1 = -1
            goto L_0x05ce
        L_0x05ec:
            r0 = 0
        L_0x05ed:
            r37 = r0
            goto L_0x0543
        L_0x05f1:
            int r0 = com.google.android.gms.internal.ads.bnz.f42909aq
            if (r13 != r0) goto L_0x0543
            int r0 = r3.mo41224d()
            r14 = 3
            r3.mo41225d(r14)
            if (r0 != 0) goto L_0x0612
            int r0 = r3.mo41224d()
            switch(r0) {
                case 0: goto L_0x0610;
                case 1: goto L_0x060d;
                case 2: goto L_0x060a;
                case 3: goto L_0x0607;
                default: goto L_0x0606;
            }
        L_0x0606:
            goto L_0x0612
        L_0x0607:
            r38 = 3
            goto L_0x0612
        L_0x060a:
            r38 = 2
            goto L_0x0612
        L_0x060d:
            r38 = 1
            goto L_0x0612
        L_0x0610:
            r38 = 0
        L_0x0612:
            int r5 = r5 + r8
            r0 = 16
            r1 = -1
            goto L_0x04fa
        L_0x0618:
            r14 = 3
            if (r27 == 0) goto L_0x0633
            java.lang.String r26 = java.lang.Integer.toString(r9)
            r28 = 0
            r29 = -1
            r30 = -1
            r33 = -1082130432(0xffffffffbf800000, float:-1.0)
            r39 = 0
            r40 = 0
            r35 = r48
            com.google.android.gms.internal.ads.zzlg r0 = com.google.android.gms.internal.ads.zzlg.m53190a(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)
            r15.f42966b = r0
        L_0x0633:
            int r4 = r4 + r11
            r3.mo41223c(r4)
            int r6 = r6 + 1
            r14 = r41
            r7 = r42
            r13 = r44
            r2 = r46
            r5 = r47
            r10 = r48
            r0 = r49
            r4 = 16
            r11 = 8
            goto L_0x01a5
        L_0x064d:
            r46 = r2
            r47 = r5
            r42 = r7
            r44 = r13
            int r0 = com.google.android.gms.internal.ads.bnz.f42857H
            r1 = r49
            com.google.android.gms.internal.ads.boa r0 = r1.mo41051e(r0)
            if (r0 == 0) goto L_0x06ba
            int r1 = com.google.android.gms.internal.ads.bnz.f42858I
            com.google.android.gms.internal.ads.bob r0 = r0.mo41050d(r1)
            if (r0 != 0) goto L_0x0668
            goto L_0x06ba
        L_0x0668:
            com.google.android.gms.internal.ads.bsa r0 = r0.f42947az
            r1 = 8
            r0.mo41223c(r1)
            int r1 = r0.mo41232j()
            int r1 = com.google.android.gms.internal.ads.bnz.m49520a(r1)
            int r2 = r0.mo41235m()
            long[] r3 = new long[r2]
            long[] r4 = new long[r2]
            r5 = 0
        L_0x0680:
            if (r5 >= r2) goto L_0x06b3
            r6 = 1
            if (r1 != r6) goto L_0x068a
            long r7 = r0.mo41236n()
            goto L_0x068e
        L_0x068a:
            long r7 = r0.mo41230h()
        L_0x068e:
            r3[r5] = r7
            if (r1 != r6) goto L_0x0697
            long r7 = r0.mo41233k()
            goto L_0x069c
        L_0x0697:
            int r7 = r0.mo41232j()
            long r7 = (long) r7
        L_0x069c:
            r4[r5] = r7
            short r7 = r0.mo41229g()
            if (r7 != r6) goto L_0x06ab
            r7 = 2
            r0.mo41225d(r7)
            int r5 = r5 + 1
            goto L_0x0680
        L_0x06ab:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unsupported media rate."
            r0.<init>(r1)
            throw r0
        L_0x06b3:
            android.util.Pair r0 = android.util.Pair.create(r3, r4)
            r1 = r0
            r0 = 0
            goto L_0x06bf
        L_0x06ba:
            r0 = 0
            android.util.Pair r1 = android.util.Pair.create(r0, r0)
        L_0x06bf:
            com.google.android.gms.internal.ads.zzlg r2 = r15.f42966b
            if (r2 != 0) goto L_0x06c4
            return r0
        L_0x06c4:
            com.google.android.gms.internal.ads.boq r0 = new com.google.android.gms.internal.ads.boq
            int r12 = r47.f42977a
            r2 = r46
            java.lang.Object r2 = r2.first
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            com.google.android.gms.internal.ads.zzlg r4 = r15.f42966b
            int r5 = r15.f42968d
            com.google.android.gms.internal.ads.bos[] r6 = r15.f42965a
            int r7 = r15.f42967c
            java.lang.Object r8 = r1.first
            r24 = r8
            long[] r24 = (long[]) r24
            java.lang.Object r1 = r1.second
            r25 = r1
            long[] r25 = (long[]) r25
            r11 = r0
            r13 = r44
            r14 = r2
            r16 = r42
            r20 = r4
            r21 = r5
            r22 = r6
            r23 = r7
            r11.<init>(r12, r13, r14, r16, r18, r20, r21, r22, r23, r24, r25)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.boc.m49532a(com.google.android.gms.internal.ads.boa, com.google.android.gms.internal.ads.bob, long, com.google.android.gms.internal.ads.zznd, boolean):com.google.android.gms.internal.ads.boq");
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01ab  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.ads.bot m49533a(com.google.android.gms.internal.ads.boq r51, com.google.android.gms.internal.ads.boa r52, com.google.android.gms.internal.ads.bnh r53) throws com.google.android.gms.internal.ads.zzll {
        /*
            r0 = r51
            r1 = r52
            r2 = r53
            int r3 = com.google.android.gms.internal.ads.bnz.f42893aa
            com.google.android.gms.internal.ads.bob r3 = r1.mo41050d(r3)
            if (r3 == 0) goto L_0x0014
            com.google.android.gms.internal.ads.bog r4 = new com.google.android.gms.internal.ads.bog
            r4.<init>(r3)
            goto L_0x0021
        L_0x0014:
            int r3 = com.google.android.gms.internal.ads.bnz.f42894ab
            com.google.android.gms.internal.ads.bob r3 = r1.mo41050d(r3)
            if (r3 == 0) goto L_0x0473
            com.google.android.gms.internal.ads.boh r4 = new com.google.android.gms.internal.ads.boh
            r4.<init>(r3)
        L_0x0021:
            int r3 = r4.mo41053a()
            r5 = 0
            if (r3 != 0) goto L_0x0038
            com.google.android.gms.internal.ads.bot r0 = new com.google.android.gms.internal.ads.bot
            long[] r7 = new long[r5]
            int[] r8 = new int[r5]
            r9 = 0
            long[] r10 = new long[r5]
            int[] r11 = new int[r5]
            r6 = r0
            r6.<init>(r7, r8, r9, r10, r11)
            return r0
        L_0x0038:
            int r6 = com.google.android.gms.internal.ads.bnz.f42895ac
            com.google.android.gms.internal.ads.bob r6 = r1.mo41050d(r6)
            r7 = 1
            if (r6 != 0) goto L_0x0049
            int r6 = com.google.android.gms.internal.ads.bnz.f42896ad
            com.google.android.gms.internal.ads.bob r6 = r1.mo41050d(r6)
            r8 = 1
            goto L_0x004a
        L_0x0049:
            r8 = 0
        L_0x004a:
            com.google.android.gms.internal.ads.bsa r6 = r6.f42947az
            int r9 = com.google.android.gms.internal.ads.bnz.f42875Z
            com.google.android.gms.internal.ads.bob r9 = r1.mo41050d(r9)
            com.google.android.gms.internal.ads.bsa r9 = r9.f42947az
            int r10 = com.google.android.gms.internal.ads.bnz.f42872W
            com.google.android.gms.internal.ads.bob r10 = r1.mo41050d(r10)
            com.google.android.gms.internal.ads.bsa r10 = r10.f42947az
            int r11 = com.google.android.gms.internal.ads.bnz.f42873X
            com.google.android.gms.internal.ads.bob r11 = r1.mo41050d(r11)
            r12 = 0
            if (r11 == 0) goto L_0x0068
            com.google.android.gms.internal.ads.bsa r11 = r11.f42947az
            goto L_0x0069
        L_0x0068:
            r11 = r12
        L_0x0069:
            int r13 = com.google.android.gms.internal.ads.bnz.f42874Y
            com.google.android.gms.internal.ads.bob r1 = r1.mo41050d(r13)
            if (r1 == 0) goto L_0x0074
            com.google.android.gms.internal.ads.bsa r1 = r1.f42947az
            goto L_0x0075
        L_0x0074:
            r1 = r12
        L_0x0075:
            com.google.android.gms.internal.ads.bod r13 = new com.google.android.gms.internal.ads.bod
            r13.<init>(r9, r6, r8)
            r6 = 12
            r10.mo41223c(r6)
            int r8 = r10.mo41235m()
            int r8 = r8 - r7
            int r9 = r10.mo41235m()
            int r14 = r10.mo41235m()
            if (r1 == 0) goto L_0x0096
            r1.mo41223c(r6)
            int r15 = r1.mo41235m()
            goto L_0x0097
        L_0x0096:
            r15 = 0
        L_0x0097:
            r16 = -1
            if (r11 == 0) goto L_0x00ac
            r11.mo41223c(r6)
            int r6 = r11.mo41235m()
            if (r6 <= 0) goto L_0x00aa
            int r12 = r11.mo41235m()
            int r12 = r12 - r7
            goto L_0x00ae
        L_0x00aa:
            r11 = r12
            goto L_0x00ad
        L_0x00ac:
            r6 = 0
        L_0x00ad:
            r12 = -1
        L_0x00ae:
            boolean r17 = r4.mo41055c()
            if (r17 == 0) goto L_0x00c8
            java.lang.String r5 = "audio/raw"
            com.google.android.gms.internal.ads.zzlg r7 = r0.f43042f
            java.lang.String r7 = r7.f45713c
            boolean r5 = r5.equals(r7)
            if (r5 == 0) goto L_0x00c8
            if (r8 != 0) goto L_0x00c8
            if (r15 != 0) goto L_0x00c8
            if (r6 != 0) goto L_0x00c8
            r5 = 1
            goto L_0x00c9
        L_0x00c8:
            r5 = 0
        L_0x00c9:
            r20 = 0
            if (r5 != 0) goto L_0x01ab
            long[] r5 = new long[r3]
            int[] r7 = new int[r3]
            r22 = r6
            long[] r6 = new long[r3]
            r23 = r8
            int[] r8 = new int[r3]
            r29 = r9
            r2 = r14
            r26 = r15
            r24 = r20
            r28 = r22
            r30 = r23
            r9 = 0
            r15 = 0
            r17 = 0
            r27 = 0
            r14 = r12
            r22 = r24
            r12 = 0
        L_0x00ee:
            if (r9 >= r3) goto L_0x0186
        L_0x00f0:
            if (r27 != 0) goto L_0x010c
            boolean r22 = r13.mo41052a()
            com.google.android.gms.internal.ads.brr.m49873b(r22)
            r32 = r2
            r31 = r3
            long r2 = r13.f42959d
            r33 = r2
            int r2 = r13.f42958c
            r27 = r2
            r3 = r31
            r2 = r32
            r22 = r33
            goto L_0x00f0
        L_0x010c:
            r32 = r2
            r31 = r3
            if (r1 == 0) goto L_0x0123
        L_0x0112:
            if (r12 != 0) goto L_0x0121
            if (r26 <= 0) goto L_0x0121
            int r12 = r1.mo41235m()
            int r17 = r1.mo41232j()
            int r26 = r26 + -1
            goto L_0x0112
        L_0x0121:
            int r12 = r12 + -1
        L_0x0123:
            r2 = r17
            r5[r9] = r22
            int r3 = r4.mo41054b()
            r7[r9] = r3
            r3 = r7[r9]
            if (r3 <= r15) goto L_0x0134
            r3 = r7[r9]
            r15 = r3
        L_0x0134:
            r35 = r4
            long r3 = (long) r2
            long r3 = r24 + r3
            r6[r9] = r3
            if (r11 != 0) goto L_0x013f
            r3 = 1
            goto L_0x0140
        L_0x013f:
            r3 = 0
        L_0x0140:
            r8[r9] = r3
            if (r9 != r14) goto L_0x0153
            r3 = 1
            r8[r9] = r3
            int r28 = r28 + -1
            if (r28 <= 0) goto L_0x0153
            int r4 = r11.mo41235m()
            int r4 = r4 - r3
            r36 = r2
            goto L_0x0156
        L_0x0153:
            r36 = r2
            r4 = r14
        L_0x0156:
            r14 = r32
            long r2 = (long) r14
            long r24 = r24 + r2
            int r29 = r29 + -1
            if (r29 != 0) goto L_0x016f
            if (r30 <= 0) goto L_0x016f
            int r2 = r10.mo41235m()
            int r3 = r10.mo41235m()
            int r30 = r30 + -1
            r29 = r2
            r2 = r3
            goto L_0x0170
        L_0x016f:
            r2 = r14
        L_0x0170:
            r3 = r7[r9]
            r37 = r2
            long r2 = (long) r3
            long r22 = r22 + r2
            int r27 = r27 + -1
            int r9 = r9 + 1
            r14 = r4
            r3 = r31
            r4 = r35
            r17 = r36
            r2 = r37
            goto L_0x00ee
        L_0x0186:
            r31 = r3
            if (r12 != 0) goto L_0x018c
            r2 = 1
            goto L_0x018d
        L_0x018c:
            r2 = 0
        L_0x018d:
            com.google.android.gms.internal.ads.brr.m49871a(r2)
        L_0x0190:
            if (r26 <= 0) goto L_0x01a4
            int r2 = r1.mo41235m()
            if (r2 != 0) goto L_0x019a
            r2 = 1
            goto L_0x019b
        L_0x019a:
            r2 = 0
        L_0x019b:
            com.google.android.gms.internal.ads.brr.m49871a(r2)
            r1.mo41232j()
            int r26 = r26 + -1
            goto L_0x0190
        L_0x01a4:
            r10 = r5
            r13 = r6
            r11 = r7
            r14 = r8
            r12 = r15
            goto L_0x0242
        L_0x01ab:
            r31 = r3
            r35 = r4
            int r1 = r13.f42956a
            long[] r1 = new long[r1]
            int r2 = r13.f42956a
            int[] r2 = new int[r2]
        L_0x01b7:
            boolean r3 = r13.mo41052a()
            if (r3 == 0) goto L_0x01ca
            int r3 = r13.f42957b
            long r4 = r13.f42959d
            r1[r3] = r4
            int r3 = r13.f42957b
            int r4 = r13.f42958c
            r2[r3] = r4
            goto L_0x01b7
        L_0x01ca:
            int r3 = r35.mo41054b()
            long r4 = (long) r14
            r6 = 8192(0x2000, float:1.14794E-41)
            int r6 = r6 / r3
            int r7 = r2.length
            r8 = 0
            r9 = 0
        L_0x01d5:
            if (r8 >= r7) goto L_0x01e1
            r10 = r2[r8]
            int r10 = com.google.android.gms.internal.ads.bsf.m49933a(r10, r6)
            int r9 = r9 + r10
            int r8 = r8 + 1
            goto L_0x01d5
        L_0x01e1:
            long[] r11 = new long[r9]
            int[] r12 = new int[r9]
            long[] r14 = new long[r9]
            int[] r15 = new int[r9]
            r7 = 0
            r8 = 0
            r9 = 0
            r13 = 0
        L_0x01ed:
            int r10 = r2.length
            if (r7 >= r10) goto L_0x0229
            r10 = r2[r7]
            r16 = r1[r7]
        L_0x01f4:
            if (r10 <= 0) goto L_0x0222
            int r22 = java.lang.Math.min(r6, r10)
            r11[r9] = r16
            int r23 = r3 * r22
            r12[r9] = r23
            r38 = r1
            r1 = r12[r9]
            int r13 = java.lang.Math.max(r13, r1)
            r39 = r2
            long r1 = (long) r8
            long r1 = r1 * r4
            r14[r9] = r1
            r1 = 1
            r15[r9] = r1
            r1 = r12[r9]
            long r1 = (long) r1
            long r16 = r16 + r1
            int r8 = r8 + r22
            int r10 = r10 - r22
            int r9 = r9 + 1
            r1 = r38
            r2 = r39
            goto L_0x01f4
        L_0x0222:
            r38 = r1
            r39 = r2
            int r7 = r7 + 1
            goto L_0x01ed
        L_0x0229:
            com.google.android.gms.internal.ads.bok r1 = new com.google.android.gms.internal.ads.bok
            r16 = 0
            r10 = r1
            r10.<init>(r11, r12, r13, r14, r15)
            long[] r5 = r1.f42980a
            int[] r7 = r1.f42981b
            int r2 = r1.f42982c
            long[] r6 = r1.f42983d
            int[] r8 = r1.f42984e
            r12 = r2
            r10 = r5
            r13 = r6
            r11 = r7
            r14 = r8
            r24 = r20
        L_0x0242:
            long[] r1 = r0.f43044h
            if (r1 == 0) goto L_0x0462
            boolean r1 = r53.mo41020a()
            if (r1 == 0) goto L_0x024e
            goto L_0x0462
        L_0x024e:
            long[] r1 = r0.f43044h
            int r1 = r1.length
            r4 = 1
            if (r1 != r4) goto L_0x02da
            int r1 = r0.f43038b
            if (r1 != r4) goto L_0x02da
            int r1 = r13.length
            r4 = 2
            if (r1 < r4) goto L_0x02da
            long[] r1 = r0.f43045i
            r4 = 0
            r5 = r1[r4]
            long[] r1 = r0.f43044h
            r32 = r1[r4]
            long r7 = r0.f43039c
            long r2 = r0.f43040d
            r34 = r7
            r36 = r2
            long r1 = com.google.android.gms.internal.ads.bsf.m49936a(r32, r34, r36)
            long r1 = r1 + r5
            r7 = r13[r4]
            int r3 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r3 > 0) goto L_0x02da
            r3 = 1
            r7 = r13[r3]
            int r4 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r4 >= 0) goto L_0x02da
            int r4 = r13.length
            int r4 = r4 - r3
            r3 = r13[r4]
            int r7 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r7 >= 0) goto L_0x02da
            int r3 = (r1 > r24 ? 1 : (r1 == r24 ? 0 : -1))
            if (r3 > 0) goto L_0x02da
            long r32 = r24 - r1
            r1 = 0
            r2 = r13[r1]
            long r22 = r5 - r2
            com.google.android.gms.internal.ads.zzlg r1 = r0.f43042f
            int r1 = r1.f45723m
            long r1 = (long) r1
            long r3 = r0.f43039c
            r24 = r1
            r26 = r3
            long r1 = com.google.android.gms.internal.ads.bsf.m49936a(r22, r24, r26)
            com.google.android.gms.internal.ads.zzlg r3 = r0.f43042f
            int r3 = r3.f45723m
            long r3 = (long) r3
            long r5 = r0.f43039c
            r34 = r3
            r36 = r5
            long r3 = com.google.android.gms.internal.ads.bsf.m49936a(r32, r34, r36)
            int r5 = (r1 > r20 ? 1 : (r1 == r20 ? 0 : -1))
            if (r5 != 0) goto L_0x02b8
            int r5 = (r3 > r20 ? 1 : (r3 == r20 ? 0 : -1))
            if (r5 == 0) goto L_0x02da
        L_0x02b8:
            r5 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 > 0) goto L_0x02da
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 > 0) goto L_0x02da
            int r1 = (int) r1
            r2 = r53
            r2.f42731a = r1
            int r1 = (int) r3
            r2.f42732b = r1
            long r0 = r0.f43039c
            r2 = 1000000(0xf4240, double:4.940656E-318)
            com.google.android.gms.internal.ads.bsf.m49940a(r13, r2, r0)
            com.google.android.gms.internal.ads.bot r0 = new com.google.android.gms.internal.ads.bot
            r9 = r0
            r9.<init>(r10, r11, r12, r13, r14)
            return r0
        L_0x02da:
            long[] r1 = r0.f43044h
            int r1 = r1.length
            r2 = 1
            if (r1 != r2) goto L_0x030f
            long[] r1 = r0.f43044h
            r18 = 0
            r2 = r1[r18]
            int r1 = (r2 > r20 ? 1 : (r2 == r20 ? 0 : -1))
            if (r1 != 0) goto L_0x030f
            r1 = 0
        L_0x02eb:
            int r2 = r13.length
            if (r1 >= r2) goto L_0x0308
            r2 = r13[r1]
            long[] r4 = r0.f43045i
            r5 = r4[r18]
            long r19 = r2 - r5
            r21 = 1000000(0xf4240, double:4.940656E-318)
            long r2 = r0.f43039c
            r23 = r2
            long r2 = com.google.android.gms.internal.ads.bsf.m49936a(r19, r21, r23)
            r13[r1] = r2
            int r1 = r1 + 1
            r18 = 0
            goto L_0x02eb
        L_0x0308:
            com.google.android.gms.internal.ads.bot r0 = new com.google.android.gms.internal.ads.bot
            r9 = r0
            r9.<init>(r10, r11, r12, r13, r14)
            return r0
        L_0x030f:
            int r1 = r0.f43038b
            r2 = 1
            if (r1 != r2) goto L_0x0316
            r1 = 1
            goto L_0x0317
        L_0x0316:
            r1 = 0
        L_0x0317:
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
        L_0x031b:
            long[] r6 = r0.f43044h
            int r6 = r6.length
            r7 = -1
            if (r2 >= r6) goto L_0x0356
            long[] r6 = r0.f43045i
            r40 = r14
            r14 = r6[r2]
            int r6 = (r14 > r7 ? 1 : (r14 == r7 ? 0 : -1))
            if (r6 == 0) goto L_0x0351
            long[] r6 = r0.f43044h
            r22 = r6[r2]
            long r6 = r0.f43039c
            long r8 = r0.f43040d
            r24 = r6
            r26 = r8
            long r6 = com.google.android.gms.internal.ads.bsf.m49936a(r22, r24, r26)
            r8 = 1
            int r9 = com.google.android.gms.internal.ads.bsf.m49944b(r13, r14, r8, r8)
            long r14 = r14 + r6
            r6 = 0
            int r7 = com.google.android.gms.internal.ads.bsf.m49944b(r13, r14, r1, r6)
            int r6 = r7 - r9
            int r4 = r4 + r6
            if (r5 == r9) goto L_0x034e
            r5 = 1
            goto L_0x034f
        L_0x034e:
            r5 = 0
        L_0x034f:
            r3 = r3 | r5
            r5 = r7
        L_0x0351:
            int r2 = r2 + 1
            r14 = r40
            goto L_0x031b
        L_0x0356:
            r40 = r14
            r2 = r31
            if (r4 == r2) goto L_0x035e
            r2 = 1
            goto L_0x035f
        L_0x035e:
            r2 = 0
        L_0x035f:
            r2 = r2 | r3
            if (r2 == 0) goto L_0x0365
            long[] r3 = new long[r4]
            goto L_0x0366
        L_0x0365:
            r3 = r10
        L_0x0366:
            if (r2 == 0) goto L_0x036b
            int[] r5 = new int[r4]
            goto L_0x036c
        L_0x036b:
            r5 = r11
        L_0x036c:
            if (r2 == 0) goto L_0x036f
            r12 = 0
        L_0x036f:
            if (r2 == 0) goto L_0x0374
            int[] r14 = new int[r4]
            goto L_0x0376
        L_0x0374:
            r14 = r40
        L_0x0376:
            long[] r4 = new long[r4]
            r25 = r12
            r15 = r20
            r6 = 0
            r9 = 0
        L_0x037e:
            long[] r12 = r0.f43044h
            int r12 = r12.length
            if (r6 >= r12) goto L_0x042e
            long[] r12 = r0.f43045i
            r7 = r12[r6]
            long[] r12 = r0.f43044h
            r32 = r12[r6]
            r34 = -1
            int r12 = (r7 > r34 ? 1 : (r7 == r34 ? 0 : -1))
            if (r12 == 0) goto L_0x040e
            r41 = r14
            r42 = r15
            long r14 = r0.f43039c
            r45 = r4
            r44 = r5
            long r4 = r0.f43040d
            r26 = r32
            r28 = r14
            r30 = r4
            long r4 = com.google.android.gms.internal.ads.bsf.m49936a(r26, r28, r30)
            long r4 = r4 + r7
            r12 = 1
            int r14 = com.google.android.gms.internal.ads.bsf.m49944b(r13, r7, r12, r12)
            r12 = 0
            int r4 = com.google.android.gms.internal.ads.bsf.m49944b(r13, r4, r1, r12)
            if (r2 == 0) goto L_0x03c8
            int r5 = r4 - r14
            java.lang.System.arraycopy(r10, r14, r3, r9, r5)
            r15 = r44
            java.lang.System.arraycopy(r11, r14, r15, r9, r5)
            r46 = r1
            r1 = r40
            r12 = r41
            java.lang.System.arraycopy(r1, r14, r12, r9, r5)
            goto L_0x03d0
        L_0x03c8:
            r46 = r1
            r1 = r40
            r12 = r41
            r15 = r44
        L_0x03d0:
            r5 = r25
        L_0x03d2:
            if (r14 >= r4) goto L_0x0409
            r22 = 1000000(0xf4240, double:4.940656E-318)
            r47 = r3
            r48 = r4
            long r3 = r0.f43040d
            r20 = r42
            r24 = r3
            long r3 = com.google.android.gms.internal.ads.bsf.m49936a(r20, r22, r24)
            r16 = r13[r14]
            long r20 = r16 - r7
            r49 = r7
            long r7 = r0.f43039c
            r24 = r7
            long r7 = com.google.android.gms.internal.ads.bsf.m49936a(r20, r22, r24)
            long r3 = r3 + r7
            r45[r9] = r3
            if (r2 == 0) goto L_0x03fe
            r3 = r15[r9]
            if (r3 <= r5) goto L_0x03fe
            r5 = r11[r14]
        L_0x03fe:
            int r9 = r9 + 1
            int r14 = r14 + 1
            r3 = r47
            r4 = r48
            r7 = r49
            goto L_0x03d2
        L_0x0409:
            r47 = r3
            r25 = r5
            goto L_0x041a
        L_0x040e:
            r46 = r1
            r47 = r3
            r45 = r4
            r12 = r14
            r42 = r15
            r1 = r40
            r15 = r5
        L_0x041a:
            r3 = 0
            long r3 = r42 + r32
            int r6 = r6 + 1
            r40 = r1
            r14 = r12
            r5 = r15
            r7 = r34
            r1 = r46
            r15 = r3
            r4 = r45
            r3 = r47
            goto L_0x037e
        L_0x042e:
            r47 = r3
            r45 = r4
            r15 = r5
            r12 = r14
            r0 = 0
            r1 = 0
        L_0x0436:
            int r2 = r12.length
            if (r0 >= r2) goto L_0x0448
            if (r1 != 0) goto L_0x0448
            r2 = r12[r0]
            r3 = 1
            r2 = r2 & r3
            if (r2 == 0) goto L_0x0443
            r2 = 1
            goto L_0x0444
        L_0x0443:
            r2 = 0
        L_0x0444:
            r1 = r1 | r2
            int r0 = r0 + 1
            goto L_0x0436
        L_0x0448:
            if (r1 == 0) goto L_0x045a
            com.google.android.gms.internal.ads.bot r0 = new com.google.android.gms.internal.ads.bot
            r22 = r0
            r23 = r47
            r24 = r15
            r26 = r45
            r27 = r12
            r22.<init>(r23, r24, r25, r26, r27)
            return r0
        L_0x045a:
            com.google.android.gms.internal.ads.zzll r0 = new com.google.android.gms.internal.ads.zzll
            java.lang.String r1 = "The edited sample sequence does not contain a sync sample."
            r0.<init>(r1)
            throw r0
        L_0x0462:
            r1 = r14
            long r2 = r0.f43039c
            r4 = 1000000(0xf4240, double:4.940656E-318)
            com.google.android.gms.internal.ads.bsf.m49940a(r13, r4, r2)
            com.google.android.gms.internal.ads.bot r0 = new com.google.android.gms.internal.ads.bot
            r9 = r0
            r14 = r1
            r9.<init>(r10, r11, r12, r13, r14)
            return r0
        L_0x0473:
            com.google.android.gms.internal.ads.zzll r0 = new com.google.android.gms.internal.ads.zzll
            java.lang.String r1 = "Track has no sample table size information"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.boc.m49533a(com.google.android.gms.internal.ads.boq, com.google.android.gms.internal.ads.boa, com.google.android.gms.internal.ads.bnh):com.google.android.gms.internal.ads.bot");
    }

    /* renamed from: a */
    public static zzpn m49534a(bob bob, boolean z) {
        if (z) {
            return null;
        }
        bsa bsa = bob.f42947az;
        bsa.mo41223c(8);
        while (bsa.mo41220b() >= 8) {
            int i = bsa.f43389b;
            int j = bsa.mo41232j();
            if (bsa.mo41232j() == bnz.f42904al) {
                bsa.mo41223c(i);
                int i2 = i + j;
                bsa.mo41225d(12);
                while (true) {
                    if (bsa.f43389b >= i2) {
                        break;
                    }
                    int i3 = bsa.f43389b;
                    int j2 = bsa.mo41232j();
                    if (bsa.mo41232j() == bnz.f42905am) {
                        bsa.mo41223c(i3);
                        int i4 = i3 + j2;
                        bsa.mo41225d(8);
                        ArrayList arrayList = new ArrayList();
                        while (bsa.f43389b < i4) {
                            zza a = bol.m49548a(bsa);
                            if (a != null) {
                                arrayList.add(a);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            return new zzpn((List<? extends zza>) arrayList);
                        }
                    } else {
                        bsa.mo41225d(j2 - 8);
                    }
                }
                return null;
            }
            bsa.mo41225d(j - 8);
        }
        return null;
    }

    /* renamed from: a */
    private static Pair<String, byte[]> m49531a(bsa bsa, int i) {
        bsa.mo41223c(i + 8 + 4);
        bsa.mo41225d(1);
        m49529a(bsa);
        bsa.mo41225d(2);
        int d = bsa.mo41224d();
        if ((d & PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH) != 0) {
            bsa.mo41225d(2);
        }
        if ((d & 64) != 0) {
            bsa.mo41225d(bsa.mo41226e());
        }
        if ((d & 32) != 0) {
            bsa.mo41225d(2);
        }
        bsa.mo41225d(1);
        m49529a(bsa);
        String str = null;
        switch (bsa.mo41224d()) {
            case 32:
                str = "video/mp4v-es";
                break;
            case 33:
                str = "video/avc";
                break;
            case 35:
                str = "video/hevc";
                break;
            case 64:
            case 102:
            case 103:
            case 104:
                str = "audio/mp4a-latm";
                break;
            case 107:
                return Pair.create("audio/mpeg", null);
            case 165:
                str = "audio/ac3";
                break;
            case 166:
                str = "audio/eac3";
                break;
            case 169:
            case 172:
                return Pair.create("audio/vnd.dts", null);
            case 170:
            case 171:
                return Pair.create("audio/vnd.dts.hd", null);
        }
        bsa.mo41225d(12);
        bsa.mo41225d(1);
        int a = m49529a(bsa);
        byte[] bArr = new byte[a];
        bsa.mo41219a(bArr, 0, a);
        return Pair.create(str, bArr);
    }

    /* renamed from: a */
    private static int m49530a(bsa bsa, int i, int i2, bof bof, int i3) {
        Object obj;
        bsa bsa2 = bsa;
        int i4 = bsa2.f43389b;
        while (true) {
            boolean z = false;
            if (i4 - i >= i2) {
                return 0;
            }
            bsa2.mo41223c(i4);
            int j = bsa.mo41232j();
            brr.m49872a(j > 0, "childAtomSize should be positive");
            if (bsa.mo41232j() == bnz.f42862M) {
                int i5 = i4 + 8;
                Pair pair = null;
                Object obj2 = null;
                Object obj3 = null;
                boolean z2 = false;
                while (i5 - i4 < j) {
                    bsa2.mo41223c(i5);
                    int j2 = bsa.mo41232j();
                    int j3 = bsa.mo41232j();
                    if (j3 == bnz.f42868S) {
                        obj2 = Integer.valueOf(bsa.mo41232j());
                    } else if (j3 == bnz.f42863N) {
                        bsa2.mo41225d(4);
                        z2 = bsa.mo41232j() == f42954g;
                    } else if (j3 == bnz.f42864O) {
                        int i6 = i5 + 8;
                        while (true) {
                            if (i6 - i5 >= j2) {
                                obj = null;
                                break;
                            }
                            bsa2.mo41223c(i6);
                            int j4 = bsa.mo41232j();
                            if (bsa.mo41232j() == bnz.f42865P) {
                                bsa2.mo41225d(6);
                                boolean z3 = bsa.mo41224d() == 1;
                                int d = bsa.mo41224d();
                                byte[] bArr = new byte[16];
                                bsa2.mo41219a(bArr, 0, 16);
                                obj = new bos(z3, d, bArr);
                            } else {
                                i6 += j4;
                            }
                        }
                        obj3 = obj;
                    }
                    i5 += j2;
                }
                if (z2) {
                    brr.m49872a(obj2 != null, "frma atom is mandatory");
                    if (obj3 != null) {
                        z = true;
                    }
                    brr.m49872a(z, "schi->tenc atom is mandatory");
                    pair = Pair.create(obj2, obj3);
                }
                if (pair != null) {
                    bof.f42965a[i3] = (bos) pair.second;
                    return ((Integer) pair.first).intValue();
                }
            }
            bof bof2 = bof;
            i4 += j;
        }
    }

    /* renamed from: a */
    private static int m49529a(bsa bsa) {
        int d = bsa.mo41224d();
        int i = d & 127;
        while ((d & PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH) == 128) {
            d = bsa.mo41224d();
            i = (i << 7) | (d & 127);
        }
        return i;
    }
}

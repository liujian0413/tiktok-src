package com.google.android.gms.internal.ads;

import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public final class bjh implements bid {

    /* renamed from: A */
    private int f42269A;

    /* renamed from: B */
    private int f42270B;

    /* renamed from: C */
    private long f42271C;

    /* renamed from: D */
    private boolean f42272D;

    /* renamed from: E */
    private boolean f42273E;

    /* renamed from: F */
    private bif f42274F;

    /* renamed from: a */
    private final bje f42275a;

    /* renamed from: b */
    private final bjg f42276b;

    /* renamed from: c */
    private final bkj f42277c;

    /* renamed from: d */
    private final bkj f42278d;

    /* renamed from: e */
    private final bkj f42279e;

    /* renamed from: f */
    private long f42280f;

    /* renamed from: g */
    private long f42281g;

    /* renamed from: h */
    private long f42282h;

    /* renamed from: i */
    private long f42283i;

    /* renamed from: j */
    private bjk f42284j;

    /* renamed from: k */
    private bjk f42285k;

    /* renamed from: l */
    private bjk f42286l;

    /* renamed from: m */
    private boolean f42287m;

    /* renamed from: n */
    private int f42288n;

    /* renamed from: o */
    private long f42289o;

    /* renamed from: p */
    private boolean f42290p;

    /* renamed from: q */
    private long f42291q;

    /* renamed from: r */
    private long f42292r;

    /* renamed from: s */
    private int f42293s;

    /* renamed from: t */
    private long f42294t;

    /* renamed from: u */
    private bkh f42295u;

    /* renamed from: v */
    private bkh f42296v;

    /* renamed from: w */
    private boolean f42297w;

    /* renamed from: x */
    private int f42298x;

    /* renamed from: y */
    private int f42299y;

    /* renamed from: z */
    private int f42300z;

    public bjh() {
        this(new bja());
    }

    private bjh(bje bje) {
        this.f42280f = -1;
        this.f42281g = -1;
        this.f42282h = 1000000;
        this.f42283i = -1;
        this.f42291q = -1;
        this.f42292r = -1;
        this.f42294t = -1;
        this.f42275a = bje;
        this.f42275a.mo40775a((bjf) new bjj(this));
        this.f42276b = new bjg();
        this.f42277c = new bkj(4);
        this.f42278d = new bkj(ByteBuffer.allocate(4).putInt(-1).array());
        this.f42279e = new bkj(4);
    }

    /* renamed from: a */
    public final void mo40746a(bif bif) {
        this.f42274F = bif;
    }

    /* renamed from: a */
    public final void mo40745a() {
        this.f42294t = -1;
        this.f42299y = 0;
        this.f42275a.mo40774a();
        this.f42276b.mo40786a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x003e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0005 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo40744a(com.google.android.gms.internal.ads.bie r9, com.google.android.gms.internal.ads.bij r10) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r8 = this;
            r0 = 0
            r8.f42272D = r0
            r1 = 1
            r2 = 1
        L_0x0005:
            if (r2 == 0) goto L_0x003f
            boolean r3 = r8.f42272D
            if (r3 != 0) goto L_0x003f
            com.google.android.gms.internal.ads.bje r2 = r8.f42275a
            boolean r2 = r2.mo40776a(r9)
            if (r2 == 0) goto L_0x0005
            long r3 = r9.mo40730a()
            boolean r5 = r8.f42290p
            if (r5 == 0) goto L_0x0027
            r8.f42292r = r3
            long r3 = r8.f42291q
            r10.f42138a = r3
            r8.f42293s = r1
            r8.f42290p = r0
        L_0x0025:
            r3 = 1
            goto L_0x003c
        L_0x0027:
            int r3 = r8.f42293s
            r4 = 2
            if (r3 != r4) goto L_0x003b
            long r3 = r8.f42292r
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x003b
            long r3 = r8.f42292r
            r10.f42138a = r3
            r8.f42292r = r5
            goto L_0x0025
        L_0x003b:
            r3 = 0
        L_0x003c:
            if (r3 == 0) goto L_0x0005
            return r1
        L_0x003f:
            if (r2 == 0) goto L_0x0042
            return r0
        L_0x0042:
            r9 = -1
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bjh.mo40744a(com.google.android.gms.internal.ads.bie, com.google.android.gms.internal.ads.bij):int");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo40791a(int i, long j, long j2) throws zzhk {
        if (i == 160) {
            this.f42273E = false;
        } else if (i == 174) {
            this.f42284j = new bjk();
        } else if (i == 187) {
            this.f42297w = false;
        } else if (i == 19899) {
            this.f42288n = -1;
            this.f42289o = -1;
        } else if (i == 20533) {
            this.f42284j.f42305d = true;
        } else if (i == 25152) {
        } else {
            if (i != 408125543) {
                if (i != 475249515) {
                    if (i == 524531317 && this.f42293s == 0 && this.f42291q != -1) {
                        this.f42290p = true;
                    }
                    return;
                }
                this.f42295u = new bkh();
                this.f42296v = new bkh();
            } else if (this.f42280f == -1) {
                this.f42280f = j;
                this.f42281g = j2;
            } else {
                throw new zzhk("Multiple Segment elements not supported");
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo40787a(int i) throws zzhk {
        bhl bhl;
        bhl bhl2;
        int i2;
        if (i != 160) {
            if (i != 174) {
                if (i != 19899) {
                    if (i != 25152) {
                        if (i != 374648427) {
                            if (i == 475249515 && this.f42293s != 2) {
                                bif bif = this.f42274F;
                                if (this.f42280f == -1) {
                                    throw new zzhk("Segment start/end offsets unknown");
                                } else if (this.f42283i == -1) {
                                    throw new zzhk("Duration unknown");
                                } else if (this.f42295u == null || this.f42296v == null || this.f42295u.f42380a == 0 || this.f42295u.f42380a != this.f42296v.f42380a) {
                                    throw new zzhk("Invalid/missing cue points");
                                } else {
                                    int i3 = this.f42295u.f42380a;
                                    int[] iArr = new int[i3];
                                    long[] jArr = new long[i3];
                                    long[] jArr2 = new long[i3];
                                    long[] jArr3 = new long[i3];
                                    int i4 = 0;
                                    for (int i5 = 0; i5 < i3; i5++) {
                                        jArr3[i5] = this.f42295u.mo40806a(i5);
                                        jArr[i5] = this.f42280f + this.f42296v.mo40806a(i5);
                                    }
                                    while (true) {
                                        i2 = i3 - 1;
                                        if (i4 >= i2) {
                                            break;
                                        }
                                        int i6 = i4 + 1;
                                        iArr[i4] = (int) (jArr[i6] - jArr[i4]);
                                        jArr2[i4] = jArr3[i6] - jArr3[i4];
                                        i4 = i6;
                                    }
                                    iArr[i2] = (int) ((this.f42280f + this.f42281g) - jArr[i2]);
                                    jArr2[i2] = this.f42283i - jArr3[i2];
                                    this.f42295u = null;
                                    this.f42296v = null;
                                    bif.mo40748a((bio) new bhz(iArr, jArr, jArr2, jArr3));
                                    this.f42293s = 2;
                                }
                            }
                        } else if (this.f42286l == null && this.f42285k == null) {
                            throw new zzhk("No valid tracks were found");
                        } else {
                            this.f42274F.mo40750d();
                        }
                    } else if (!this.f42284j.f42305d) {
                        throw new zzhk("Found an unsupported ContentEncoding");
                    } else if (this.f42284j.f42306e != null) {
                        if (!this.f42287m) {
                            this.f42274F.mo40747a((bhv) new bhx("video/webm", this.f42284j.f42306e));
                            this.f42287m = true;
                        }
                    } else {
                        throw new zzhk("Encrypted Track found but ContentEncKeyID was not found");
                    }
                } else if (this.f42288n == -1 || this.f42289o == -1) {
                    throw new zzhk("Mandatory element SeekID or SeekPosition not found");
                } else {
                    if (this.f42288n == 475249515) {
                        this.f42291q = this.f42289o;
                    }
                }
            } else if (this.f42284j.f42303b == -1 || this.f42284j.f42304c == -1) {
                throw new zzhk("Mandatory element TrackNumber or TrackType not found");
            } else if ((this.f42284j.f42304c != 2 || this.f42285k == null) && (this.f42284j.f42304c != 1 || this.f42286l == null)) {
                if (this.f42284j.f42304c == 2 && m48991a(this.f42284j.f42302a)) {
                    this.f42285k = this.f42284j;
                    this.f42285k.f42314m = this.f42274F.mo40749c(this.f42285k.f42303b);
                    bip bip = this.f42285k.f42314m;
                    if (this.f42285k != null && "A_VORBIS".equals(this.f42285k.f42302a)) {
                        bhl2 = bhl.m48812b("audio/vorbis", VideoCacheReadBuffersizeExperiment.DEFAULT, this.f42283i, this.f42285k.f42309h, this.f42285k.f42310i, m48992b());
                    } else if (this.f42285k == null || !"A_OPUS".equals(this.f42285k.f42302a)) {
                        throw new zzhk("Unable to build format");
                    } else {
                        ArrayList arrayList = new ArrayList(3);
                        arrayList.add(this.f42285k.f42311j);
                        arrayList.add(ByteBuffer.allocate(64).putLong(this.f42285k.f42312k).array());
                        arrayList.add(ByteBuffer.allocate(64).putLong(this.f42285k.f42313l).array());
                        bhl2 = bhl.m48812b("audio/opus", 5760, this.f42283i, this.f42285k.f42309h, this.f42285k.f42310i, arrayList);
                    }
                    bip.mo40738a(bhl2);
                } else if (this.f42284j.f42304c == 1 && m48991a(this.f42284j.f42302a)) {
                    this.f42286l = this.f42284j;
                    this.f42286l.f42314m = this.f42274F.mo40749c(this.f42286l.f42303b);
                    bip bip2 = this.f42286l.f42314m;
                    if (this.f42286l != null && "V_VP8".equals(this.f42286l.f42302a)) {
                        bhl = bhl.m48810a("video/x-vnd.on2.vp8", -1, this.f42283i, this.f42286l.f42307f, this.f42286l.f42308g, null);
                    } else if (this.f42286l == null || !"V_VP9".equals(this.f42286l.f42302a)) {
                        throw new zzhk("Unable to build format");
                    } else {
                        bhl = bhl.m48810a("video/x-vnd.on2.vp9", -1, this.f42283i, this.f42286l.f42307f, this.f42286l.f42308g, null);
                    }
                    bip2.mo40738a(bhl);
                }
                this.f42284j = null;
            } else {
                this.f42284j = null;
            }
        } else if (this.f42299y == 2) {
            if (!this.f42273E) {
                this.f42270B |= 1;
            }
            m48990a(((this.f42285k == null || this.f42269A != this.f42285k.f42303b) ? this.f42286l : this.f42285k).f42314m);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo40790a(int i, long j) throws zzhk {
        switch (i) {
            case 131:
                this.f42284j.f42304c = (int) j;
                return;
            case 159:
                this.f42284j.f42309h = (int) j;
                return;
            case 176:
                this.f42284j.f42307f = (int) j;
                return;
            case 179:
                this.f42295u.mo40807a(m48989a(j));
                return;
            case 186:
                this.f42284j.f42308g = (int) j;
                return;
            case 215:
                this.f42284j.f42303b = (int) j;
                return;
            case 231:
                this.f42294t = m48989a(j);
                return;
            case 241:
                if (!this.f42297w) {
                    this.f42296v.mo40807a(j);
                    this.f42297w = true;
                }
                return;
            case 251:
                this.f42273E = true;
                return;
            case 17029:
                if (j < 1 || j > 2) {
                    StringBuilder sb = new StringBuilder(53);
                    sb.append("DocTypeReadVersion ");
                    sb.append(j);
                    sb.append(" not supported");
                    throw new zzhk(sb.toString());
                }
                return;
            case 17143:
                if (j != 1) {
                    StringBuilder sb2 = new StringBuilder(50);
                    sb2.append("EBMLReadVersion ");
                    sb2.append(j);
                    sb2.append(" not supported");
                    throw new zzhk(sb2.toString());
                }
                return;
            case 18401:
                if (j != 5) {
                    StringBuilder sb3 = new StringBuilder(49);
                    sb3.append("ContentEncAlgo ");
                    sb3.append(j);
                    sb3.append(" not supported");
                    throw new zzhk(sb3.toString());
                }
                return;
            case 18408:
                if (j != 1) {
                    StringBuilder sb4 = new StringBuilder(56);
                    sb4.append("AESSettingsCipherMode ");
                    sb4.append(j);
                    sb4.append(" not supported");
                    throw new zzhk(sb4.toString());
                }
                return;
            case 20529:
                if (j != 0) {
                    StringBuilder sb5 = new StringBuilder(55);
                    sb5.append("ContentEncodingOrder ");
                    sb5.append(j);
                    sb5.append(" not supported");
                    throw new zzhk(sb5.toString());
                }
                return;
            case 20530:
                if (j != 1) {
                    StringBuilder sb6 = new StringBuilder(55);
                    sb6.append("ContentEncodingScope ");
                    sb6.append(j);
                    sb6.append(" not supported");
                    throw new zzhk(sb6.toString());
                }
                return;
            case 20531:
                if (j != 1) {
                    StringBuilder sb7 = new StringBuilder(54);
                    sb7.append("ContentEncodingType ");
                    sb7.append(j);
                    sb7.append(" not supported");
                    throw new zzhk(sb7.toString());
                }
                return;
            case 21420:
                this.f42289o = j + this.f42280f;
                return;
            case 22186:
                this.f42284j.f42312k = j;
                return;
            case 22203:
                this.f42284j.f42313l = j;
                return;
            case 2807729:
                this.f42282h = j;
                return;
            default:
                return;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo40788a(int i, double d) {
        if (i == 181) {
            this.f42284j.f42310i = (int) d;
        } else if (i == 17545) {
            this.f42283i = m48989a((long) d);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo40792a(int i, String str) throws zzhk {
        if (i == 134) {
            this.f42284j.f42302a = str;
        } else if (i == 17026 && !"webm".equals(str)) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 22);
            sb.append("DocType ");
            sb.append(str);
            sb.append(" not supported");
            throw new zzhk(sb.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0155  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo40789a(int r17, int r18, com.google.android.gms.internal.ads.bie r19) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = 161(0xa1, float:2.26E-43)
            r5 = 163(0xa3, float:2.28E-43)
            r6 = 4
            r7 = 0
            if (r1 == r4) goto L_0x0071
            if (r1 == r5) goto L_0x0071
            r4 = 18402(0x47e2, float:2.5787E-41)
            if (r1 == r4) goto L_0x0063
            r4 = 21419(0x53ab, float:3.0014E-41)
            if (r1 == r4) goto L_0x0045
            r4 = 25506(0x63a2, float:3.5742E-41)
            if (r1 != r4) goto L_0x002c
            com.google.android.gms.internal.ads.bjk r1 = r0.f42284j
            byte[] r4 = new byte[r2]
            r1.f42311j = r4
            com.google.android.gms.internal.ads.bjk r1 = r0.f42284j
            byte[] r1 = r1.f42311j
            r3.mo40732a(r1, r7, r2)
            return
        L_0x002c:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = 26
            r3.<init>(r4)
            java.lang.String r4 = "Unexpected id: "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        L_0x0045:
            com.google.android.gms.internal.ads.bkj r1 = r0.f42279e
            byte[] r1 = r1.f42382a
            java.util.Arrays.fill(r1, r7)
            com.google.android.gms.internal.ads.bkj r1 = r0.f42279e
            byte[] r1 = r1.f42382a
            int r6 = r6 - r2
            r3.mo40732a(r1, r6, r2)
            com.google.android.gms.internal.ads.bkj r1 = r0.f42279e
            r1.mo40809a(r7)
            com.google.android.gms.internal.ads.bkj r1 = r0.f42279e
            long r1 = r1.mo40814c()
            int r1 = (int) r1
            r0.f42288n = r1
            return
        L_0x0063:
            com.google.android.gms.internal.ads.bjk r1 = r0.f42284j
            byte[] r4 = new byte[r2]
            r1.f42306e = r4
            com.google.android.gms.internal.ads.bjk r1 = r0.f42284j
            byte[] r1 = r1.f42306e
            r3.mo40732a(r1, r7, r2)
            return
        L_0x0071:
            int r4 = r0.f42299y
            r8 = 1
            if (r4 != 0) goto L_0x0087
            com.google.android.gms.internal.ads.bjg r4 = r0.f42276b
            long r9 = r4.mo40785a(r3, r7, r8)
            int r4 = (int) r9
            r0.f42269A = r4
            com.google.android.gms.internal.ads.bjg r4 = r0.f42276b
            int r4 = r4.f42266a
            r0.f42298x = r4
            r0.f42299y = r8
        L_0x0087:
            com.google.android.gms.internal.ads.bjk r4 = r0.f42285k
            if (r4 == 0) goto L_0x009f
            com.google.android.gms.internal.ads.bjk r4 = r0.f42286l
            if (r4 == 0) goto L_0x009f
            com.google.android.gms.internal.ads.bjk r4 = r0.f42285k
            int r4 = r4.f42303b
            int r9 = r0.f42269A
            if (r4 == r9) goto L_0x009f
            com.google.android.gms.internal.ads.bjk r4 = r0.f42286l
            int r4 = r4.f42303b
            int r9 = r0.f42269A
            if (r4 != r9) goto L_0x00bf
        L_0x009f:
            com.google.android.gms.internal.ads.bjk r4 = r0.f42285k
            if (r4 == 0) goto L_0x00af
            com.google.android.gms.internal.ads.bjk r4 = r0.f42286l
            if (r4 != 0) goto L_0x00af
            com.google.android.gms.internal.ads.bjk r4 = r0.f42285k
            int r4 = r4.f42303b
            int r9 = r0.f42269A
            if (r4 != r9) goto L_0x00bf
        L_0x00af:
            com.google.android.gms.internal.ads.bjk r4 = r0.f42285k
            if (r4 != 0) goto L_0x00c9
            com.google.android.gms.internal.ads.bjk r4 = r0.f42286l
            if (r4 == 0) goto L_0x00c9
            com.google.android.gms.internal.ads.bjk r4 = r0.f42286l
            int r4 = r4.f42303b
            int r9 = r0.f42269A
            if (r4 == r9) goto L_0x00c9
        L_0x00bf:
            int r1 = r0.f42298x
            int r1 = r2 - r1
            r3.mo40731a(r1)
            r0.f42299y = r7
            return
        L_0x00c9:
            com.google.android.gms.internal.ads.bjk r4 = r0.f42285k
            if (r4 == 0) goto L_0x00d8
            int r4 = r0.f42269A
            com.google.android.gms.internal.ads.bjk r9 = r0.f42285k
            int r9 = r9.f42303b
            if (r4 != r9) goto L_0x00d8
            com.google.android.gms.internal.ads.bjk r4 = r0.f42285k
            goto L_0x00da
        L_0x00d8:
            com.google.android.gms.internal.ads.bjk r4 = r0.f42286l
        L_0x00da:
            com.google.android.gms.internal.ads.bip r9 = r4.f42314m
            int r10 = r0.f42299y
            if (r10 != r8) goto L_0x0187
            com.google.android.gms.internal.ads.bkj r10 = r0.f42277c
            byte[] r10 = r10.f42382a
            boolean r11 = r4.f42305d
            r12 = 3
            if (r11 == 0) goto L_0x00eb
            r11 = 4
            goto L_0x00ec
        L_0x00eb:
            r11 = 3
        L_0x00ec:
            r3.mo40732a(r10, r7, r11)
            int r13 = r0.f42298x
            int r13 = r13 + r11
            r0.f42298x = r13
            byte r11 = r10[r7]
            r13 = 8
            int r11 = r11 << r13
            byte r14 = r10[r8]
            r14 = r14 & 255(0xff, float:3.57E-43)
            r11 = r11 | r14
            long r14 = r0.f42294t
            long r6 = (long) r11
            long r6 = r0.m48989a(r6)
            long r14 = r14 + r6
            r0.f42271C = r14
            r7 = 2
            byte r6 = r10[r7]
            r6 = r6 & 6
            int r6 = r6 >> r8
            if (r6 != 0) goto L_0x016e
            byte r6 = r10[r7]
            r6 = r6 & r13
            if (r6 != r13) goto L_0x0117
            r6 = 1
            goto L_0x0118
        L_0x0117:
            r6 = 0
        L_0x0118:
            r11 = 128(0x80, float:1.794E-43)
            if (r1 != r5) goto L_0x0123
            byte r14 = r10[r7]
            r14 = r14 & r11
            if (r14 != r11) goto L_0x0123
            r14 = 1
            goto L_0x0124
        L_0x0123:
            r14 = 0
        L_0x0124:
            boolean r15 = r4.f42305d
            if (r15 == 0) goto L_0x0134
            byte r15 = r10[r12]
            r15 = r15 & r11
            if (r15 == r11) goto L_0x0136
            byte r10 = r10[r12]
            r10 = r10 & r8
            if (r10 != r8) goto L_0x0134
            r10 = 1
            goto L_0x013e
        L_0x0134:
            r10 = 0
            goto L_0x013e
        L_0x0136:
            com.google.android.gms.internal.ads.zzhk r1 = new com.google.android.gms.internal.ads.zzhk
            java.lang.String r2 = "Extension bit is set in signal byte"
            r1.<init>(r2)
            throw r1
        L_0x013e:
            if (r6 == 0) goto L_0x0143
            r6 = 134217728(0x8000000, float:3.85186E-34)
            goto L_0x0144
        L_0x0143:
            r6 = 0
        L_0x0144:
            r6 = r6 | r14
            if (r10 == 0) goto L_0x0149
            r11 = 2
            goto L_0x014a
        L_0x0149:
            r11 = 0
        L_0x014a:
            r6 = r6 | r11
            r0.f42270B = r6
            int r6 = r0.f42298x
            int r6 = r2 - r6
            r0.f42300z = r6
            if (r10 == 0) goto L_0x016b
            com.google.android.gms.internal.ads.bkj r6 = r0.f42277c
            byte[] r6 = r6.f42382a
            r10 = 0
            r6[r10] = r13
            com.google.android.gms.internal.ads.bkj r6 = r0.f42277c
            r6.mo40809a(r10)
            com.google.android.gms.internal.ads.bkj r6 = r0.f42277c
            r9.mo40739a(r6, r8)
            int r6 = r0.f42300z
            int r6 = r6 + r8
            r0.f42300z = r6
        L_0x016b:
            r0.f42299y = r7
            goto L_0x0187
        L_0x016e:
            com.google.android.gms.internal.ads.zzhk r1 = new com.google.android.gms.internal.ads.zzhk
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 38
            r2.<init>(r3)
            java.lang.String r3 = "Lacing mode not supported: "
            r2.append(r3)
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0187:
            int r6 = r0.f42298x
            if (r6 >= r2) goto L_0x0199
            int r6 = r0.f42298x
            int r7 = r0.f42298x
            int r7 = r2 - r7
            int r7 = r9.mo40734a(r3, r7)
            int r6 = r6 + r7
            r0.f42298x = r6
            goto L_0x0187
        L_0x0199:
            java.lang.String r2 = "A_VORBIS"
            java.lang.String r3 = r4.f42302a
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x01b4
            com.google.android.gms.internal.ads.bkj r2 = r0.f42278d
            r3 = 0
            r2.mo40809a(r3)
            com.google.android.gms.internal.ads.bkj r2 = r0.f42278d
            r3 = 4
            r9.mo40739a(r2, r3)
            int r2 = r0.f42300z
            int r2 = r2 + r3
            r0.f42300z = r2
        L_0x01b4:
            if (r1 != r5) goto L_0x01b9
            r0.m48990a(r9)
        L_0x01b9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bjh.mo40789a(int, int, com.google.android.gms.internal.ads.bie):void");
    }

    /* renamed from: a */
    private final void m48990a(bip bip) {
        bip.mo40737a(this.f42271C, this.f42270B, this.f42300z, 0, null);
        this.f42299y = 0;
        this.f42272D = true;
    }

    /* renamed from: b */
    private final ArrayList<byte[]> m48992b() throws zzhk {
        try {
            byte[] bArr = this.f42285k.f42311j;
            if (bArr[0] == 2) {
                int i = 1;
                int i2 = 0;
                while (bArr[i] == -1) {
                    i2 += NormalGiftView.ALPHA_255;
                    i++;
                }
                int i3 = i + 1;
                int i4 = i2 + bArr[i];
                int i5 = 0;
                while (bArr[i3] == -1) {
                    i5 += NormalGiftView.ALPHA_255;
                    i3++;
                }
                int i6 = i3 + 1;
                int i7 = i5 + bArr[i3];
                if (bArr[i6] == 1) {
                    byte[] bArr2 = new byte[i4];
                    System.arraycopy(bArr, i6, bArr2, 0, i4);
                    int i8 = i6 + i4;
                    if (bArr[i8] == 3) {
                        int i9 = i8 + i7;
                        if (bArr[i9] == 5) {
                            byte[] bArr3 = new byte[(bArr.length - i9)];
                            System.arraycopy(bArr, i9, bArr3, 0, bArr.length - i9);
                            ArrayList<byte[]> arrayList = new ArrayList<>(2);
                            arrayList.add(bArr2);
                            arrayList.add(bArr3);
                            return arrayList;
                        }
                        throw new zzhk("Error parsing vorbis codec private");
                    }
                    throw new zzhk("Error parsing vorbis codec private");
                }
                throw new zzhk("Error parsing vorbis codec private");
            }
            throw new zzhk("Error parsing vorbis codec private");
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new zzhk("Error parsing vorbis codec private");
        }
    }

    /* renamed from: a */
    private final long m48989a(long j) {
        return TimeUnit.NANOSECONDS.toMicros(j * this.f42282h);
    }

    /* renamed from: a */
    private static boolean m48991a(String str) {
        return "V_VP8".equals(str) || "V_VP9".equals(str) || "A_OPUS".equals(str) || "A_VORBIS".equals(str);
    }
}

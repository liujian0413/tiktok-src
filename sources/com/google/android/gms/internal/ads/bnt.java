package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import com.C1642a;
import com.google.android.gms.internal.ads.zznd.zza;
import com.p280ss.android.ugc.aweme.feed.monitor.C28539a;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;

public final class bnt implements bnd {

    /* renamed from: a */
    private static final bng f42746a = new bnu();

    /* renamed from: b */
    private static final byte[] f42747b = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* renamed from: c */
    private static final byte[] f42748c = {32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32};
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final UUID f42749d = new UUID(72057594037932032L, -9223371306706625679L);

    /* renamed from: A */
    private long f42750A;

    /* renamed from: B */
    private boolean f42751B;

    /* renamed from: C */
    private long f42752C;

    /* renamed from: D */
    private long f42753D;

    /* renamed from: E */
    private long f42754E;

    /* renamed from: F */
    private bru f42755F;

    /* renamed from: G */
    private bru f42756G;

    /* renamed from: H */
    private boolean f42757H;

    /* renamed from: I */
    private int f42758I;

    /* renamed from: J */
    private long f42759J;

    /* renamed from: K */
    private long f42760K;

    /* renamed from: L */
    private int f42761L;

    /* renamed from: M */
    private int f42762M;

    /* renamed from: N */
    private int[] f42763N;

    /* renamed from: O */
    private int f42764O;

    /* renamed from: P */
    private int f42765P;

    /* renamed from: Q */
    private int f42766Q;

    /* renamed from: R */
    private int f42767R;

    /* renamed from: S */
    private boolean f42768S;

    /* renamed from: T */
    private boolean f42769T;

    /* renamed from: U */
    private boolean f42770U;

    /* renamed from: V */
    private boolean f42771V;

    /* renamed from: W */
    private byte f42772W;

    /* renamed from: X */
    private int f42773X;

    /* renamed from: Y */
    private int f42774Y;

    /* renamed from: Z */
    private int f42775Z;

    /* renamed from: aa */
    private boolean f42776aa;

    /* renamed from: ab */
    private boolean f42777ab;

    /* renamed from: ac */
    private bnf f42778ac;

    /* renamed from: e */
    private final bnr f42779e;

    /* renamed from: f */
    private final bny f42780f;

    /* renamed from: g */
    private final SparseArray<bnw> f42781g;

    /* renamed from: h */
    private final boolean f42782h;

    /* renamed from: i */
    private final bsa f42783i;

    /* renamed from: j */
    private final bsa f42784j;

    /* renamed from: k */
    private final bsa f42785k;

    /* renamed from: l */
    private final bsa f42786l;

    /* renamed from: m */
    private final bsa f42787m;

    /* renamed from: n */
    private final bsa f42788n;

    /* renamed from: o */
    private final bsa f42789o;

    /* renamed from: p */
    private final bsa f42790p;

    /* renamed from: q */
    private final bsa f42791q;

    /* renamed from: r */
    private ByteBuffer f42792r;

    /* renamed from: s */
    private long f42793s;

    /* renamed from: t */
    private long f42794t;

    /* renamed from: u */
    private long f42795u;

    /* renamed from: v */
    private long f42796v;

    /* renamed from: w */
    private long f42797w;

    /* renamed from: x */
    private bnw f42798x;

    /* renamed from: y */
    private boolean f42799y;

    /* renamed from: z */
    private int f42800z;

    public bnt() {
        this(0);
    }

    /* renamed from: a */
    static int m49480a(int i) {
        switch (i) {
            case 131:
            case 136:
            case 155:
            case 159:
            case 176:
            case 179:
            case 186:
            case 215:
            case 231:
            case 241:
            case 251:
            case 16980:
            case 17029:
            case 17143:
            case 18401:
            case 18408:
            case 20529:
            case 20530:
            case 21420:
            case 21432:
            case 21680:
            case 21682:
            case 21690:
            case 21930:
            case 21945:
            case 21946:
            case 21947:
            case 21948:
            case 21949:
            case 22186:
            case 22203:
            case 25188:
            case 2352003:
            case 2807729:
                return 2;
            case 134:
            case 17026:
            case 2274716:
                return 3;
            case 160:
            case 174:
            case 183:
            case 187:
            case 224:
            case 225:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 28032:
            case 30320:
            case 290298740:
            case 357149030:
            case 374648427:
            case 408125543:
            case 440786851:
            case 475249515:
            case 524531317:
                return 1;
            case 161:
            case 163:
            case 16981:
            case 18402:
            case 21419:
            case 25506:
            case 30322:
                return 4;
            case 181:
            case 17545:
            case 21969:
            case 21970:
            case 21971:
            case 21972:
            case 21973:
            case 21974:
            case 21975:
            case 21976:
            case 21977:
            case 21978:
                return 5;
            default:
                return 0;
        }
    }

    /* renamed from: b */
    static boolean m49489b(int i) {
        return i == 357149030 || i == 524531317 || i == 475249515 || i == 374648427;
    }

    private bnt(int i) {
        this(new bno(), 0);
    }

    private bnt(bnr bnr, int i) {
        this.f42794t = -1;
        this.f42795u = -9223372036854775807L;
        this.f42796v = -9223372036854775807L;
        this.f42797w = -9223372036854775807L;
        this.f42752C = -1;
        this.f42753D = -1;
        this.f42754E = -9223372036854775807L;
        this.f42779e = bnr;
        this.f42779e.mo41029a((bns) new bnv(this, null));
        this.f42782h = true;
        this.f42780f = new bny();
        this.f42781g = new SparseArray<>();
        this.f42785k = new bsa(4);
        this.f42786l = new bsa(ByteBuffer.allocate(4).putInt(-1).array());
        this.f42787m = new bsa(4);
        this.f42783i = new bsa(brx.f43370a);
        this.f42784j = new bsa(4);
        this.f42788n = new bsa();
        this.f42789o = new bsa();
        this.f42790p = new bsa(8);
        this.f42791q = new bsa();
    }

    /* renamed from: a */
    public final boolean mo41016a(bne bne) throws IOException, InterruptedException {
        return new bnx().mo41046a(bne);
    }

    /* renamed from: a */
    public final void mo41015a(bnf bnf) {
        this.f42778ac = bnf;
    }

    /* renamed from: a */
    public final void mo41014a(long j, long j2) {
        this.f42754E = -9223372036854775807L;
        this.f42758I = 0;
        this.f42779e.mo41028a();
        this.f42780f.mo41048a();
        m49488b();
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x003b A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0005 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo41013a(com.google.android.gms.internal.ads.bne r9, com.google.android.gms.internal.ads.bnj r10) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r8 = this;
            r0 = 0
            r8.f42776aa = r0
            r1 = 1
            r2 = 1
        L_0x0005:
            if (r2 == 0) goto L_0x003c
            boolean r3 = r8.f42776aa
            if (r3 != 0) goto L_0x003c
            com.google.android.gms.internal.ads.bnr r2 = r8.f42779e
            boolean r2 = r2.mo41030a(r9)
            if (r2 == 0) goto L_0x0005
            long r3 = r9.mo41007b()
            boolean r5 = r8.f42751B
            if (r5 == 0) goto L_0x0025
            r8.f42753D = r3
            long r3 = r8.f42752C
            r10.f42733a = r3
            r8.f42751B = r0
        L_0x0023:
            r3 = 1
            goto L_0x0039
        L_0x0025:
            boolean r3 = r8.f42799y
            if (r3 == 0) goto L_0x0038
            long r3 = r8.f42753D
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0038
            long r3 = r8.f42753D
            r10.f42733a = r3
            r8.f42753D = r5
            goto L_0x0023
        L_0x0038:
            r3 = 0
        L_0x0039:
            if (r3 == 0) goto L_0x0005
            return r1
        L_0x003c:
            if (r2 == 0) goto L_0x003f
            return r0
        L_0x003f:
            r9 = -1
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bnt.mo41013a(com.google.android.gms.internal.ads.bne, com.google.android.gms.internal.ads.bnj):int");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo41042a(int i, long j, long j2) throws zzll {
        if (i == 160) {
            this.f42777ab = false;
        } else if (i == 174) {
            this.f42798x = new bnw(null);
        } else if (i == 187) {
            this.f42757H = false;
        } else if (i == 19899) {
            this.f42800z = -1;
            this.f42750A = -1;
        } else if (i != 20533) {
            if (i == 21968) {
                this.f42798x.f42834q = true;
            } else if (i == 25152) {
            } else {
                if (i != 408125543) {
                    if (i == 475249515) {
                        this.f42755F = new bru();
                        this.f42756G = new bru();
                    } else if (i == 524531317 && !this.f42799y) {
                        if (!this.f42782h || this.f42752C == -1) {
                            this.f42778ac.mo41019a(new bnl(this.f42797w));
                            this.f42799y = true;
                            return;
                        }
                        this.f42751B = true;
                    }
                } else if (this.f42794t == -1 || this.f42794t == j) {
                    this.f42794t = j;
                    this.f42793s = j2;
                } else {
                    throw new zzll("Multiple Segment elements not supported");
                }
            }
        } else {
            this.f42798x.f42822e = true;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo41044c(int i) throws zzll {
        bnk bnk;
        int i2;
        int i3 = 0;
        if (i != 160) {
            if (i != 174) {
                if (i != 19899) {
                    if (i != 25152) {
                        if (i != 28032) {
                            if (i == 357149030) {
                                if (this.f42795u == -9223372036854775807L) {
                                    this.f42795u = 1000000;
                                }
                                if (this.f42796v != -9223372036854775807L) {
                                    this.f42797w = m49482a(this.f42796v);
                                    return;
                                }
                            } else if (i != 374648427) {
                                if (i == 475249515 && !this.f42799y) {
                                    bnf bnf = this.f42778ac;
                                    if (this.f42794t == -1 || this.f42797w == -9223372036854775807L || this.f42755F == null || this.f42755F.f43368a == 0 || this.f42756G == null || this.f42756G.f43368a != this.f42755F.f43368a) {
                                        this.f42755F = null;
                                        this.f42756G = null;
                                        bnk = new bnl(this.f42797w);
                                    } else {
                                        int i4 = this.f42755F.f43368a;
                                        int[] iArr = new int[i4];
                                        long[] jArr = new long[i4];
                                        long[] jArr2 = new long[i4];
                                        long[] jArr3 = new long[i4];
                                        for (int i5 = 0; i5 < i4; i5++) {
                                            jArr3[i5] = this.f42755F.mo41213a(i5);
                                            jArr[i5] = this.f42794t + this.f42756G.mo41213a(i5);
                                        }
                                        while (true) {
                                            i2 = i4 - 1;
                                            if (i3 >= i2) {
                                                break;
                                            }
                                            int i6 = i3 + 1;
                                            iArr[i3] = (int) (jArr[i6] - jArr[i3]);
                                            jArr2[i3] = jArr3[i6] - jArr3[i3];
                                            i3 = i6;
                                        }
                                        iArr[i2] = (int) ((this.f42794t + this.f42793s) - jArr[i2]);
                                        jArr2[i2] = this.f42797w - jArr3[i2];
                                        this.f42755F = null;
                                        this.f42756G = null;
                                        bnk = new bnb(iArr, jArr, jArr2, jArr3);
                                    }
                                    bnf.mo41019a(bnk);
                                    this.f42799y = true;
                                    return;
                                }
                            } else if (this.f42781g.size() != 0) {
                                this.f42778ac.mo41018a();
                            } else {
                                throw new zzll("No valid tracks were found");
                            }
                        } else if (this.f42798x.f42822e && this.f42798x.f42823f != null) {
                            throw new zzll("Combining encryption and compression is not supported");
                        }
                    } else if (this.f42798x.f42822e) {
                        if (this.f42798x.f42824g != null) {
                            this.f42798x.f42826i = new zznd(new zza(bkr.f42399b, "video/webm", this.f42798x.f42824g.f42736b));
                            return;
                        }
                        throw new zzll("Encrypted Track found but ContentEncKeyID was not found");
                    }
                } else if (this.f42800z == -1 || this.f42750A == -1) {
                    throw new zzll("Mandatory element SeekID or SeekPosition not found");
                } else if (this.f42800z == 475249515) {
                    this.f42752C = this.f42750A;
                    return;
                }
                return;
            }
            String str = this.f42798x.f42818a;
            if ("V_VP8".equals(str) || "V_VP9".equals(str) || "V_MPEG2".equals(str) || "V_MPEG4/ISO/SP".equals(str) || "V_MPEG4/ISO/ASP".equals(str) || "V_MPEG4/ISO/AP".equals(str) || "V_MPEG4/ISO/AVC".equals(str) || "V_MPEGH/ISO/HEVC".equals(str) || "V_MS/VFW/FOURCC".equals(str) || "V_THEORA".equals(str) || "A_OPUS".equals(str) || "A_VORBIS".equals(str) || "A_AAC".equals(str) || "A_MPEG/L2".equals(str) || "A_MPEG/L3".equals(str) || "A_AC3".equals(str) || "A_EAC3".equals(str) || "A_TRUEHD".equals(str) || "A_DTS".equals(str) || "A_DTS/EXPRESS".equals(str) || "A_DTS/LOSSLESS".equals(str) || "A_FLAC".equals(str) || "A_MS/ACM".equals(str) || "A_PCM/INT/LIT".equals(str) || "S_TEXT/UTF8".equals(str) || "S_VOBSUB".equals(str) || "S_HDMV/PGS".equals(str) || "S_DVBSUB".equals(str)) {
                i3 = 1;
            }
            if (i3 != 0) {
                this.f42798x.mo41045a(this.f42778ac, this.f42798x.f42819b);
                this.f42781g.put(this.f42798x.f42819b, this.f42798x);
            }
            this.f42798x = null;
        } else if (this.f42758I == 2) {
            if (!this.f42777ab) {
                this.f42766Q |= 1;
            }
            m49486a((bnw) this.f42781g.get(this.f42764O), this.f42759J);
            this.f42758I = 0;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo41041a(int i, long j) throws zzll {
        boolean z = false;
        switch (i) {
            case 131:
                this.f42798x.f42820c = (int) j;
                return;
            case 136:
                bnw bnw = this.f42798x;
                if (j == 1) {
                    z = true;
                }
                bnw.f42813L = z;
                return;
            case 155:
                this.f42760K = m49482a(j);
                return;
            case 159:
                this.f42798x.f42808G = (int) j;
                return;
            case 176:
                this.f42798x.f42827j = (int) j;
                return;
            case 179:
                this.f42755F.mo41214a(m49482a(j));
                return;
            case 186:
                this.f42798x.f42828k = (int) j;
                return;
            case 215:
                this.f42798x.f42819b = (int) j;
                return;
            case 231:
                this.f42754E = m49482a(j);
                return;
            case 241:
                if (!this.f42757H) {
                    this.f42756G.mo41214a(j);
                    this.f42757H = true;
                    return;
                }
                break;
            case 251:
                this.f42777ab = true;
                return;
            case 16980:
                if (j != 3) {
                    StringBuilder sb = new StringBuilder(50);
                    sb.append("ContentCompAlgo ");
                    sb.append(j);
                    sb.append(" not supported");
                    throw new zzll(sb.toString());
                }
                break;
            case 17029:
                if (j < 1 || j > 2) {
                    StringBuilder sb2 = new StringBuilder(53);
                    sb2.append("DocTypeReadVersion ");
                    sb2.append(j);
                    sb2.append(" not supported");
                    throw new zzll(sb2.toString());
                }
            case 17143:
                if (j != 1) {
                    StringBuilder sb3 = new StringBuilder(50);
                    sb3.append("EBMLReadVersion ");
                    sb3.append(j);
                    sb3.append(" not supported");
                    throw new zzll(sb3.toString());
                }
                break;
            case 18401:
                if (j != 5) {
                    StringBuilder sb4 = new StringBuilder(49);
                    sb4.append("ContentEncAlgo ");
                    sb4.append(j);
                    sb4.append(" not supported");
                    throw new zzll(sb4.toString());
                }
                break;
            case 18408:
                if (j != 1) {
                    StringBuilder sb5 = new StringBuilder(56);
                    sb5.append("AESSettingsCipherMode ");
                    sb5.append(j);
                    sb5.append(" not supported");
                    throw new zzll(sb5.toString());
                }
                break;
            case 20529:
                if (j != 0) {
                    StringBuilder sb6 = new StringBuilder(55);
                    sb6.append("ContentEncodingOrder ");
                    sb6.append(j);
                    sb6.append(" not supported");
                    throw new zzll(sb6.toString());
                }
                break;
            case 20530:
                if (j != 1) {
                    StringBuilder sb7 = new StringBuilder(55);
                    sb7.append("ContentEncodingScope ");
                    sb7.append(j);
                    sb7.append(" not supported");
                    throw new zzll(sb7.toString());
                }
                break;
            case 21420:
                this.f42750A = j + this.f42794t;
                return;
            case 21432:
                int i2 = (int) j;
                if (i2 == 3) {
                    this.f42798x.f42833p = 1;
                    return;
                } else if (i2 != 15) {
                    switch (i2) {
                        case 0:
                            this.f42798x.f42833p = 0;
                            return;
                        case 1:
                            this.f42798x.f42833p = 2;
                            return;
                        default:
                            return;
                    }
                } else {
                    this.f42798x.f42833p = 3;
                    return;
                }
            case 21680:
                this.f42798x.f42829l = (int) j;
                return;
            case 21682:
                this.f42798x.f42831n = (int) j;
                return;
            case 21690:
                this.f42798x.f42830m = (int) j;
                return;
            case 21930:
                bnw bnw2 = this.f42798x;
                if (j == 1) {
                    z = true;
                }
                bnw2.f42814M = z;
                return;
            case 21945:
                switch ((int) j) {
                    case 1:
                        this.f42798x.f42837t = 2;
                        return;
                    case 2:
                        this.f42798x.f42837t = 1;
                        return;
                    default:
                        return;
                }
            case 21946:
                int i3 = (int) j;
                if (i3 != 1) {
                    if (i3 == 16) {
                        this.f42798x.f42836s = 6;
                        return;
                    } else if (i3 != 18) {
                        switch (i3) {
                            case 6:
                            case 7:
                                break;
                            default:
                                return;
                        }
                    } else {
                        this.f42798x.f42836s = 7;
                        return;
                    }
                }
                this.f42798x.f42836s = 3;
                return;
            case 21947:
                this.f42798x.f42834q = true;
                int i4 = (int) j;
                if (i4 == 1) {
                    this.f42798x.f42835r = 1;
                    return;
                } else if (i4 != 9) {
                    switch (i4) {
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            this.f42798x.f42835r = 2;
                            return;
                        default:
                            return;
                    }
                } else {
                    this.f42798x.f42835r = 6;
                    return;
                }
            case 21948:
                this.f42798x.f42838u = (int) j;
                return;
            case 21949:
                this.f42798x.f42839v = (int) j;
                break;
            case 22186:
                this.f42798x.f42811J = j;
                return;
            case 22203:
                this.f42798x.f42812K = j;
                return;
            case 25188:
                this.f42798x.f42809H = (int) j;
                return;
            case 2352003:
                this.f42798x.f42821d = (int) j;
                return;
            case 2807729:
                this.f42795u = j;
                return;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo41039a(int i, double d) {
        if (i == 181) {
            this.f42798x.f42810I = (int) d;
        } else if (i != 17545) {
            switch (i) {
                case 21969:
                    this.f42798x.f42840w = (float) d;
                    return;
                case 21970:
                    this.f42798x.f42841x = (float) d;
                    return;
                case 21971:
                    this.f42798x.f42842y = (float) d;
                    return;
                case 21972:
                    this.f42798x.f42843z = (float) d;
                    return;
                case 21973:
                    this.f42798x.f42802A = (float) d;
                    return;
                case 21974:
                    this.f42798x.f42803B = (float) d;
                    return;
                case 21975:
                    this.f42798x.f42804C = (float) d;
                    return;
                case 21976:
                    this.f42798x.f42805D = (float) d;
                    return;
                case 21977:
                    this.f42798x.f42806E = (float) d;
                    return;
                case 21978:
                    this.f42798x.f42807F = (float) d;
                    break;
            }
        } else {
            this.f42796v = (long) d;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo41043a(int i, String str) throws zzll {
        if (i != 134) {
            if (i != 17026) {
                if (i == 2274716) {
                    this.f42798x.f42817P = str;
                }
            } else if (!"webm".equals(str) && !"matroska".equals(str)) {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 22);
                sb.append("DocType ");
                sb.append(str);
                sb.append(" not supported");
                throw new zzll(sb.toString());
            }
            return;
        }
        this.f42798x.f42818a = str;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo41040a(int i, int i2, bne bne) throws IOException, InterruptedException {
        byte b;
        int i3 = i;
        int i4 = i2;
        bne bne2 = bne;
        int i5 = 0;
        int i6 = 1;
        if (i3 == 161 || i3 == 163) {
            if (this.f42758I == 0) {
                this.f42764O = (int) this.f42780f.mo41047a(bne2, false, true, 8);
                this.f42765P = this.f42780f.f42847a;
                this.f42760K = -9223372036854775807L;
                this.f42758I = 1;
                this.f42785k.mo41216a();
            }
            bnw bnw = (bnw) this.f42781g.get(this.f42764O);
            if (bnw == null) {
                bne2.mo41008b(i4 - this.f42765P);
                this.f42758I = 0;
                return;
            }
            if (this.f42758I == 1) {
                m49484a(bne2, 3);
                int i7 = (this.f42785k.f43388a[2] & 6) >> 1;
                byte b2 = 255;
                if (i7 == 0) {
                    this.f42762M = 1;
                    this.f42763N = m49487a(this.f42763N, 1);
                    this.f42763N[0] = (i4 - this.f42765P) - 3;
                } else if (i3 == 163) {
                    m49484a(bne2, 4);
                    this.f42762M = (this.f42785k.f43388a[3] & 255) + 1;
                    this.f42763N = m49487a(this.f42763N, this.f42762M);
                    if (i7 == 2) {
                        Arrays.fill(this.f42763N, 0, this.f42762M, ((i4 - this.f42765P) - 4) / this.f42762M);
                    } else if (i7 == 1) {
                        int i8 = 4;
                        int i9 = 0;
                        for (int i10 = 0; i10 < this.f42762M - 1; i10++) {
                            this.f42763N[i10] = 0;
                            do {
                                i8++;
                                m49484a(bne2, i8);
                                b = this.f42785k.f43388a[i8 - 1] & 255;
                                int[] iArr = this.f42763N;
                                iArr[i10] = iArr[i10] + b;
                            } while (b == 255);
                            i9 += this.f42763N[i10];
                        }
                        this.f42763N[this.f42762M - 1] = ((i4 - this.f42765P) - i8) - i9;
                    } else if (i7 == 3) {
                        int i11 = 0;
                        int i12 = 4;
                        int i13 = 0;
                        while (i11 < this.f42762M - i6) {
                            this.f42763N[i11] = i5;
                            i12++;
                            m49484a(bne2, i12);
                            int i14 = i12 - 1;
                            if (this.f42785k.f43388a[i14] != 0) {
                                long j = 0;
                                int i15 = 0;
                                while (true) {
                                    if (i15 >= 8) {
                                        break;
                                    }
                                    int i16 = i6 << (7 - i15);
                                    if ((this.f42785k.f43388a[i14] & i16) != 0) {
                                        i12 += i15;
                                        m49484a(bne2, i12);
                                        long j2 = (long) (this.f42785k.f43388a[i14] & b2 & (i16 ^ -1));
                                        int i17 = i14 + 1;
                                        while (true) {
                                            j = j2;
                                            if (i17 >= i12) {
                                                break;
                                            }
                                            j2 = (j << 8) | ((long) (this.f42785k.f43388a[i17] & b2));
                                            i17++;
                                            b2 = 255;
                                        }
                                        if (i11 > 0) {
                                            j -= (1 << ((i15 * 7) + 6)) - 1;
                                        }
                                    } else {
                                        i15++;
                                        i6 = 1;
                                        b2 = 255;
                                    }
                                }
                                long j3 = j;
                                if (j3 < -2147483648L || j3 > 2147483647L) {
                                    throw new zzll("EBML lacing sample size out of range.");
                                }
                                int i18 = (int) j3;
                                int[] iArr2 = this.f42763N;
                                if (i11 != 0) {
                                    i18 += this.f42763N[i11 - 1];
                                }
                                iArr2[i11] = i18;
                                i13 += this.f42763N[i11];
                                i11++;
                                i5 = 0;
                                i6 = 1;
                                b2 = 255;
                            } else {
                                throw new zzll("No valid varint length mask found");
                            }
                        }
                        this.f42763N[this.f42762M - 1] = ((i4 - this.f42765P) - i12) - i13;
                    } else {
                        StringBuilder sb = new StringBuilder(36);
                        sb.append("Unexpected lacing value: ");
                        sb.append(i7);
                        throw new zzll(sb.toString());
                    }
                } else {
                    throw new zzll("Lacing only supported in SimpleBlocks.");
                }
                this.f42759J = this.f42754E + m49482a((long) ((this.f42785k.f43388a[0] << 8) | (this.f42785k.f43388a[1] & 255)));
                this.f42766Q = ((bnw.f42820c == 2 || (i3 == 163 && (this.f42785k.f43388a[2] & 128) == 128)) ? 1 : 0) | ((this.f42785k.f43388a[2] & 8) == 8 ? Integer.MIN_VALUE : 0);
                this.f42758I = 2;
                this.f42761L = 0;
            }
            if (i3 == 163) {
                while (this.f42761L < this.f42762M) {
                    m49485a(bne2, bnw, this.f42763N[this.f42761L]);
                    m49486a(bnw, this.f42759J + ((long) ((this.f42761L * bnw.f42821d) / 1000)));
                    this.f42761L++;
                }
                this.f42758I = 0;
                return;
            }
            m49485a(bne2, bnw, this.f42763N[0]);
        } else if (i3 == 16981) {
            this.f42798x.f42823f = new byte[i4];
            bne2.mo41009b(this.f42798x.f42823f, 0, i4);
        } else if (i3 == 18402) {
            byte[] bArr = new byte[i4];
            bne2.mo41009b(bArr, 0, i4);
            this.f42798x.f42824g = new bnn(1, bArr);
        } else if (i3 == 21419) {
            Arrays.fill(this.f42787m.f43388a, 0);
            bne2.mo41009b(this.f42787m.f43388a, 4 - i4, i4);
            this.f42787m.mo41223c(0);
            this.f42800z = (int) this.f42787m.mo41230h();
        } else if (i3 == 25506) {
            this.f42798x.f42825h = new byte[i4];
            bne2.mo41009b(this.f42798x.f42825h, 0, i4);
        } else if (i3 == 30322) {
            this.f42798x.f42832o = new byte[i4];
            bne2.mo41009b(this.f42798x.f42832o, 0, i4);
        } else {
            StringBuilder sb2 = new StringBuilder(26);
            sb2.append("Unexpected id: ");
            sb2.append(i3);
            throw new zzll(sb2.toString());
        }
    }

    /* renamed from: a */
    private final void m49486a(bnw bnw, long j) {
        byte[] bArr;
        if ("S_TEXT/UTF8".equals(bnw.f42818a)) {
            byte[] bArr2 = this.f42789o.f43388a;
            long j2 = this.f42760K;
            if (j2 == -9223372036854775807L) {
                bArr = f42748c;
            } else {
                int i = (int) (j2 / 3600000000L);
                long j3 = j2 - (((long) i) * 3600000000L);
                int i2 = (int) (j3 / 60000000);
                long j4 = j3 - ((long) (60000000 * i2));
                int i3 = (int) (j4 / 1000000);
                bArr = bsf.m49945b(C1642a.m8035a(Locale.US, "%02d:%02d:%02d,%03d", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - ((long) (C28539a.f75176k * i3))) / 1000))}));
            }
            System.arraycopy(bArr, 0, bArr2, 19, 12);
            bnw.f42815N.mo41024a(this.f42789o, this.f42789o.f43390c);
            this.f42775Z += this.f42789o.f43390c;
        }
        bnw.f42815N.mo41023a(j, this.f42766Q, this.f42775Z, 0, bnw.f42824g);
        this.f42776aa = true;
        m49488b();
    }

    /* renamed from: b */
    private final void m49488b() {
        this.f42767R = 0;
        this.f42775Z = 0;
        this.f42774Y = 0;
        this.f42768S = false;
        this.f42769T = false;
        this.f42771V = false;
        this.f42773X = 0;
        this.f42772W = 0;
        this.f42770U = false;
        this.f42788n.mo41216a();
    }

    /* renamed from: a */
    private final void m49484a(bne bne, int i) throws IOException, InterruptedException {
        if (this.f42785k.f43390c < i) {
            if (this.f42785k.mo41222c() < i) {
                this.f42785k.mo41218a(Arrays.copyOf(this.f42785k.f43388a, Math.max(this.f42785k.f43388a.length << 1, i)), this.f42785k.f43390c);
            }
            bne.mo41009b(this.f42785k.f43388a, this.f42785k.f43390c, i - this.f42785k.f43390c);
            this.f42785k.mo41221b(i);
        }
    }

    /* renamed from: a */
    private final void m49485a(bne bne, bnw bnw, int i) throws IOException, InterruptedException {
        if ("S_TEXT/UTF8".equals(bnw.f42818a)) {
            int length = f42747b.length + i;
            if (this.f42789o.mo41222c() < length) {
                this.f42789o.f43388a = Arrays.copyOf(f42747b, length + i);
            }
            bne.mo41009b(this.f42789o.f43388a, f42747b.length, i);
            this.f42789o.mo41223c(0);
            this.f42789o.mo41221b(length);
            return;
        }
        bnm bnm = bnw.f42815N;
        if (!this.f42768S) {
            if (bnw.f42822e) {
                this.f42766Q &= -1073741825;
                boolean z = this.f42769T;
                int i2 = PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH;
                if (!z) {
                    bne.mo41009b(this.f42785k.f43388a, 0, 1);
                    this.f42767R++;
                    if ((this.f42785k.f43388a[0] & 128) != 128) {
                        this.f42772W = this.f42785k.f43388a[0];
                        this.f42769T = true;
                    } else {
                        throw new zzll("Extension bit is set in signal byte");
                    }
                }
                if ((this.f42772W & 1) == 1) {
                    boolean z2 = (this.f42772W & 2) == 2;
                    this.f42766Q |= 1073741824;
                    if (!this.f42770U) {
                        bne.mo41009b(this.f42790p.f43388a, 0, 8);
                        this.f42767R += 8;
                        this.f42770U = true;
                        byte[] bArr = this.f42785k.f43388a;
                        if (!z2) {
                            i2 = 0;
                        }
                        bArr[0] = (byte) (i2 | 8);
                        this.f42785k.mo41223c(0);
                        bnm.mo41024a(this.f42785k, 1);
                        this.f42775Z++;
                        this.f42790p.mo41223c(0);
                        bnm.mo41024a(this.f42790p, 8);
                        this.f42775Z += 8;
                    }
                    if (z2) {
                        if (!this.f42771V) {
                            bne.mo41009b(this.f42785k.f43388a, 0, 1);
                            this.f42767R++;
                            this.f42785k.mo41223c(0);
                            this.f42773X = this.f42785k.mo41224d();
                            this.f42771V = true;
                        }
                        int i3 = this.f42773X << 2;
                        this.f42785k.mo41217a(i3);
                        bne.mo41009b(this.f42785k.f43388a, 0, i3);
                        this.f42767R += i3;
                        short s = (short) ((this.f42773X / 2) + 1);
                        int i4 = (s * 6) + 2;
                        if (this.f42792r == null || this.f42792r.capacity() < i4) {
                            this.f42792r = ByteBuffer.allocate(i4);
                        }
                        this.f42792r.position(0);
                        this.f42792r.putShort(s);
                        int i5 = 0;
                        int i6 = 0;
                        while (i5 < this.f42773X) {
                            int m = this.f42785k.mo41235m();
                            if (i5 % 2 == 0) {
                                this.f42792r.putShort((short) (m - i6));
                            } else {
                                this.f42792r.putInt(m - i6);
                            }
                            i5++;
                            i6 = m;
                        }
                        int i7 = (i - this.f42767R) - i6;
                        if (this.f42773X % 2 == 1) {
                            this.f42792r.putInt(i7);
                        } else {
                            this.f42792r.putShort((short) i7);
                            this.f42792r.putInt(0);
                        }
                        this.f42791q.mo41218a(this.f42792r.array(), i4);
                        bnm.mo41024a(this.f42791q, i4);
                        this.f42775Z += i4;
                    }
                }
            } else if (bnw.f42823f != null) {
                this.f42788n.mo41218a(bnw.f42823f, bnw.f42823f.length);
            }
            this.f42768S = true;
        }
        int i8 = i + this.f42788n.f43390c;
        if ("V_MPEG4/ISO/AVC".equals(bnw.f42818a) || "V_MPEGH/ISO/HEVC".equals(bnw.f42818a)) {
            byte[] bArr2 = this.f42784j.f43388a;
            bArr2[0] = 0;
            bArr2[1] = 0;
            bArr2[2] = 0;
            int i9 = bnw.f42816O;
            int i10 = 4 - bnw.f42816O;
            while (this.f42767R < i8) {
                if (this.f42774Y == 0) {
                    int min = Math.min(i9, this.f42788n.mo41220b());
                    bne.mo41009b(bArr2, i10 + min, i9 - min);
                    if (min > 0) {
                        this.f42788n.mo41219a(bArr2, i10, min);
                    }
                    this.f42767R += i9;
                    this.f42784j.mo41223c(0);
                    this.f42774Y = this.f42784j.mo41235m();
                    this.f42783i.mo41223c(0);
                    bnm.mo41024a(this.f42783i, 4);
                    this.f42775Z += 4;
                } else {
                    this.f42774Y -= m49481a(bne, bnm, this.f42774Y);
                }
            }
        } else {
            while (this.f42767R < i8) {
                m49481a(bne, bnm, i8 - this.f42767R);
            }
        }
        if ("A_VORBIS".equals(bnw.f42818a)) {
            this.f42786l.mo41223c(0);
            bnm.mo41024a(this.f42786l, 4);
            this.f42775Z += 4;
        }
    }

    /* renamed from: a */
    private final int m49481a(bne bne, bnm bnm, int i) throws IOException, InterruptedException {
        int i2;
        int b = this.f42788n.mo41220b();
        if (b > 0) {
            i2 = Math.min(i, b);
            bnm.mo41024a(this.f42788n, i2);
        } else {
            i2 = bnm.mo41022a(bne, i, false);
        }
        this.f42767R += i2;
        this.f42775Z += i2;
        return i2;
    }

    /* renamed from: a */
    private final long m49482a(long j) throws zzll {
        if (this.f42795u != -9223372036854775807L) {
            return bsf.m49936a(j, this.f42795u, 1000);
        }
        throw new zzll("Can't scale timecode prior to timecodeScale being set.");
    }

    /* renamed from: a */
    private static int[] m49487a(int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        if (iArr.length >= i) {
            return iArr;
        }
        return new int[Math.max(iArr.length << 1, i)];
    }
}

package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class bit {
    /* renamed from: a */
    public static bix m48963a(bir bir, bis bis) {
        boolean z;
        boolean z2;
        long j;
        long j2;
        int i;
        int i2;
        int i3;
        List list;
        boolean z3;
        bir bir2 = bir;
        bir d = bir2.mo40772d(biq.f42198l);
        bkj bkj = d.mo40771c(biq.f42204r).f42217N;
        bkj.mo40809a(16);
        int d2 = bkj.mo40815d();
        if (d2 != 1936684398 && d2 != 1986618469 && d2 != 1952807028 && d2 != 1953325924) {
            return null;
        }
        bkj bkj2 = bir2.mo40771c(biq.f42202p).f42217N;
        int i4 = 8;
        bkj2.mo40809a(8);
        int a = biq.m48959a(bkj2.mo40815d());
        bkj2.mo40813b(a == 0 ? 8 : 16);
        int d3 = bkj2.mo40815d();
        bkj2.mo40813b(4);
        int i5 = bkj2.f42383b;
        int i6 = a == 0 ? 4 : 8;
        int i7 = 0;
        while (true) {
            z = true;
            if (i7 >= i6) {
                z2 = true;
                break;
            } else if (bkj2.f42382a[i5 + i7] != -1) {
                z2 = false;
                break;
            } else {
                i7++;
            }
        }
        if (z2) {
            bkj2.mo40813b(i6);
            j = -1;
        } else {
            j = a == 0 ? bkj2.mo40814c() : bkj2.mo40819h();
        }
        Pair create = Pair.create(Integer.valueOf(d3), Long.valueOf(j));
        int intValue = ((Integer) create.first).intValue();
        long longValue = ((Long) create.second).longValue();
        bkj bkj3 = bis.f42217N;
        bkj3.mo40809a(8);
        bkj3.mo40813b(biq.m48959a(bkj3.mo40815d()) == 0 ? 8 : 16);
        long c = bkj3.mo40814c();
        if (longValue == -1) {
            j2 = -1;
        } else {
            j2 = bkn.m49085a(longValue, 1000000, c);
        }
        bir d4 = d.mo40772d(biq.f42199m).mo40772d(biq.f42200n);
        bkj bkj4 = d.mo40771c(biq.f42203q).f42217N;
        bkj4.mo40809a(8);
        if (biq.m48959a(bkj4.mo40815d()) != 0) {
            i4 = 16;
        }
        bkj4.mo40813b(i4);
        long c2 = bkj4.mo40814c();
        bkj bkj5 = d4.mo40771c(biq.f42205s).f42217N;
        bkj5.mo40809a(12);
        int d5 = bkj5.mo40815d();
        biu biu = new biu(d5);
        int i8 = 0;
        while (i8 < d5) {
            int i9 = bkj5.f42383b;
            int d6 = bkj5.mo40815d();
            bke.m49059a(d6 > 0, "childAtomSize should be positive");
            int d7 = bkj5.mo40815d();
            if (d7 == biq.f42186a || d7 == biq.f42188b || d7 == biq.f42210x) {
                i2 = d5;
                i = d2;
                i3 = d6;
                bkj5.mo40809a(i9 + 8);
                bkj5.mo40813b(24);
                int b = bkj5.mo40812b();
                int b2 = bkj5.mo40812b();
                bkj5.mo40813b(50);
                int i10 = bkj5.f42383b;
                float f = 1.0f;
                List list2 = null;
                while (i10 - i9 < i3) {
                    bkj5.mo40809a(i10);
                    int i11 = bkj5.f42383b;
                    int d8 = bkj5.mo40815d();
                    if (d8 == 0 && bkj5.f42383b - i9 == i3) {
                        break;
                    }
                    bke.m49059a(d8 > 0, "childAtomSize should be positive");
                    int d9 = bkj5.mo40815d();
                    if (d9 == biq.f42201o) {
                        bkj5.mo40809a(i11 + 8 + 4);
                        int a2 = (bkj5.mo40808a() & 3) + 1;
                        if (a2 != 3) {
                            ArrayList arrayList = new ArrayList();
                            int a3 = bkj5.mo40808a() & 31;
                            for (int i12 = 0; i12 < a3; i12++) {
                                arrayList.add(bkg.m49063a(bkj5));
                            }
                            int a4 = bkj5.mo40808a();
                            for (int i13 = 0; i13 < a4; i13++) {
                                arrayList.add(bkg.m49063a(bkj5));
                            }
                            Pair create2 = Pair.create(arrayList, Integer.valueOf(a2));
                            List list3 = (List) create2.first;
                            biu.f42220c = ((Integer) create2.second).intValue();
                            list2 = list3;
                        } else {
                            throw new IllegalStateException();
                        }
                    } else if (d9 == biq.f42206t) {
                        biu.f42218a[i8] = m48964a(bkj5, i11, d8);
                    } else if (d9 == biq.f42161A) {
                        bkj5.mo40809a(i11 + 8);
                        f = ((float) bkj5.mo40818g()) / ((float) bkj5.mo40818g());
                    }
                    i10 += d8;
                }
                biu.f42219b = bhl.m48809a("video/avc", -1, j2, b, b2, f, list2);
            } else if (d7 == biq.f42190d || d7 == biq.f42211y || d7 == biq.f42191e) {
                i3 = d6;
                bkj5.mo40809a(i9 + 8);
                bkj5.mo40813b(16);
                int b3 = bkj5.mo40812b();
                int b4 = bkj5.mo40812b();
                bkj5.mo40813b(4);
                int f2 = bkj5.mo40817f();
                int i14 = bkj5.f42383b;
                int i15 = b3;
                int i16 = f2;
                byte[] bArr = null;
                while (true) {
                    if (i14 - i9 < i3) {
                        bkj5.mo40809a(i14);
                        int i17 = bkj5.f42383b;
                        int d10 = bkj5.mo40815d();
                        if (d10 > 0) {
                            i2 = d5;
                            i = d2;
                            z3 = true;
                        } else {
                            i2 = d5;
                            i = d2;
                            z3 = false;
                        }
                        bke.m49059a(z3, "childAtomSize should be positive");
                        int d11 = bkj5.mo40815d();
                        if (d7 != biq.f42190d && d7 != biq.f42211y) {
                            if (d7 != biq.f42191e || d11 != biq.f42192f) {
                                if (d7 == biq.f42193g && d11 == biq.f42194h) {
                                    bkj5.mo40809a(i17 + 8);
                                    biu.f42219b = bkd.m49056b(bkj5);
                                    break;
                                }
                            } else {
                                bkj5.mo40809a(i17 + 8);
                                biu.f42219b = bkd.m49055a(bkj5);
                                break;
                            }
                        } else if (d11 == biq.f42189c) {
                            byte[] a5 = m48965a(bkj5, i17);
                            Pair a6 = bkf.m49061a(a5);
                            i16 = ((Integer) a6.first).intValue();
                            i15 = ((Integer) a6.second).intValue();
                            bArr = a5;
                        } else if (d11 == biq.f42206t) {
                            biu.f42218a[i8] = m48964a(bkj5, i17, d10);
                        }
                        i14 += d10;
                        d5 = i2;
                        d2 = i;
                    } else {
                        i2 = d5;
                        i = d2;
                        String str = d7 == biq.f42191e ? "audio/ac3" : d7 == biq.f42193g ? "audio/eac3" : "audio/mp4a-latm";
                        String str2 = str;
                        if (bArr == null) {
                            list = null;
                        } else {
                            list = Collections.singletonList(bArr);
                        }
                        biu.f42219b = bhl.m48812b(str2, b4, j2, i15, i16, list);
                    }
                }
            } else if (d7 == biq.f42162B) {
                biu.f42219b = bhl.m48806a();
                i2 = d5;
                i = d2;
                i3 = d6;
            } else {
                if (d7 == biq.f42165E) {
                    bkj5.mo40809a(i9 + 8);
                    bkj5.mo40813b(24);
                    int b5 = bkj5.mo40812b();
                    int b6 = bkj5.mo40812b();
                    bkj5.mo40813b(50);
                    ArrayList arrayList2 = new ArrayList(z ? 1 : 0);
                    int i18 = bkj5.f42383b;
                    while (i18 - i9 < d6) {
                        bkj5.mo40809a(i18);
                        int i19 = bkj5.f42383b;
                        int d12 = bkj5.mo40815d();
                        if (d12 <= 0) {
                            z = false;
                        }
                        bke.m49059a(z, "childAtomSize should be positive");
                        if (bkj5.mo40815d() == biq.f42189c) {
                            arrayList2.add(m48965a(bkj5, i19));
                        }
                        i18 += d12;
                        z = true;
                    }
                    i3 = d6;
                    biu.f42219b = bhl.m48810a("video/mp4v-es", -1, j2, b5, b6, arrayList2);
                } else {
                    i3 = d6;
                }
                i2 = d5;
                i = d2;
            }
            bkj5.mo40809a(i9 + i3);
            i8++;
            d5 = i2;
            d2 = i;
            z = true;
        }
        int i20 = d2;
        bix bix = new bix(intValue, d2, c2, j2, biu.f42219b, biu.f42218a, biu.f42220c);
        return bix;
    }

    /* renamed from: a */
    private static biy m48964a(bkj bkj, int i, int i2) {
        biy biy;
        int i3 = i + 8;
        biy biy2 = null;
        while (i3 - i < i2) {
            bkj.mo40809a(i3);
            int d = bkj.mo40815d();
            int d2 = bkj.mo40815d();
            if (d2 == biq.f42212z) {
                bkj.mo40815d();
            } else if (d2 == biq.f42207u) {
                bkj.mo40813b(4);
                bkj.mo40815d();
                bkj.mo40815d();
            } else if (d2 == biq.f42208v) {
                int i4 = i3 + 8;
                while (true) {
                    if (i4 - i3 >= d) {
                        biy = null;
                        break;
                    }
                    bkj.mo40809a(i4);
                    int d3 = bkj.mo40815d();
                    if (bkj.mo40815d() == biq.f42209w) {
                        bkj.mo40813b(4);
                        int d4 = bkj.mo40815d();
                        boolean z = true;
                        if ((d4 >> 8) != 1) {
                            z = false;
                        }
                        int i5 = d4 & NormalGiftView.ALPHA_255;
                        byte[] bArr = new byte[16];
                        bkj.mo40811a(bArr, 0, 16);
                        biy = new biy(z, i5, bArr);
                    } else {
                        i4 += d3;
                    }
                }
                biy2 = biy;
            }
            i3 += d;
        }
        return biy2;
    }

    /* renamed from: a */
    private static byte[] m48965a(bkj bkj, int i) {
        bkj.mo40809a(i + 8 + 4);
        bkj.mo40813b(1);
        int a = bkj.mo40808a();
        while (a > 127) {
            a = bkj.mo40808a();
        }
        bkj.mo40813b(2);
        int a2 = bkj.mo40808a();
        if ((a2 & PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH) != 0) {
            bkj.mo40813b(2);
        }
        if ((a2 & 64) != 0) {
            bkj.mo40813b(bkj.mo40812b());
        }
        if ((a2 & 32) != 0) {
            bkj.mo40813b(2);
        }
        bkj.mo40813b(1);
        int a3 = bkj.mo40808a();
        while (a3 > 127) {
            a3 = bkj.mo40808a();
        }
        bkj.mo40813b(13);
        bkj.mo40813b(1);
        int a4 = bkj.mo40808a();
        int i2 = a4 & 127;
        while (a4 > 127) {
            a4 = bkj.mo40808a();
            i2 = (i2 << 8) | (a4 & 127);
        }
        byte[] bArr = new byte[i2];
        bkj.mo40811a(bArr, 0, i2);
        return bArr;
    }
}

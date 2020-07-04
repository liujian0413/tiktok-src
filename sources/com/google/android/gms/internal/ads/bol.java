package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzpn.zza;

final class bol {

    /* renamed from: A */
    private static final int f42985A = bsf.m49946c("sosn");

    /* renamed from: B */
    private static final int f42986B = bsf.m49946c("tvsh");

    /* renamed from: C */
    private static final int f42987C = bsf.m49946c("----");

    /* renamed from: D */
    private static final String[] f42988D = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Negerpunk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop"};

    /* renamed from: a */
    private static final int f42989a = bsf.m49946c("nam");

    /* renamed from: b */
    private static final int f42990b = bsf.m49946c("trk");

    /* renamed from: c */
    private static final int f42991c = bsf.m49946c("cmt");

    /* renamed from: d */
    private static final int f42992d = bsf.m49946c("day");

    /* renamed from: e */
    private static final int f42993e = bsf.m49946c("ART");

    /* renamed from: f */
    private static final int f42994f = bsf.m49946c("too");

    /* renamed from: g */
    private static final int f42995g = bsf.m49946c("alb");

    /* renamed from: h */
    private static final int f42996h = bsf.m49946c("com");

    /* renamed from: i */
    private static final int f42997i = bsf.m49946c("wrt");

    /* renamed from: j */
    private static final int f42998j = bsf.m49946c("lyr");

    /* renamed from: k */
    private static final int f42999k = bsf.m49946c("gen");

    /* renamed from: l */
    private static final int f43000l = bsf.m49946c("covr");

    /* renamed from: m */
    private static final int f43001m = bsf.m49946c("gnre");

    /* renamed from: n */
    private static final int f43002n = bsf.m49946c("grp");

    /* renamed from: o */
    private static final int f43003o = bsf.m49946c("disk");

    /* renamed from: p */
    private static final int f43004p = bsf.m49946c("trkn");

    /* renamed from: q */
    private static final int f43005q = bsf.m49946c("tmpo");

    /* renamed from: r */
    private static final int f43006r = bsf.m49946c("cpil");

    /* renamed from: s */
    private static final int f43007s = bsf.m49946c("aART");

    /* renamed from: t */
    private static final int f43008t = bsf.m49946c("sonm");

    /* renamed from: u */
    private static final int f43009u = bsf.m49946c("soal");

    /* renamed from: v */
    private static final int f43010v = bsf.m49946c("soar");

    /* renamed from: w */
    private static final int f43011w = bsf.m49946c("soaa");

    /* renamed from: x */
    private static final int f43012x = bsf.m49946c("soco");

    /* renamed from: y */
    private static final int f43013y = bsf.m49946c("rtng");

    /* renamed from: z */
    private static final int f43014z = bsf.m49946c("pgap");

    /* renamed from: a */
    public static zza m49548a(bsa bsa) {
        zza zza;
        int j = bsa.f43389b + bsa.mo41232j();
        int j2 = bsa.mo41232j();
        int i = j2 >>> 24;
        zzpr zzpr = null;
        if (i == 169 || i == 65533) {
            int i2 = 16777215 & j2;
            if (i2 == f42991c) {
                int j3 = bsa.mo41232j();
                if (bsa.mo41232j() == bnz.f42908ap) {
                    bsa.mo41225d(8);
                    String e = bsa.mo41227e(j3 - 16);
                    zzpr = new zzpr("und", e, e);
                } else {
                    String str = "Failed to parse comment attribute: ";
                    String valueOf = String.valueOf(bnz.m49522c(j2));
                    if (valueOf.length() != 0) {
                        str.concat(valueOf);
                    } else {
                        new String(str);
                    }
                }
                bsa.mo41223c(j);
                return zzpr;
            }
            if (i2 != f42989a) {
                if (i2 != f42990b) {
                    if (i2 != f42996h) {
                        if (i2 != f42997i) {
                            if (i2 == f42992d) {
                                zzpv a = m49550a(j2, "TDRC", bsa);
                                bsa.mo41223c(j);
                                return a;
                            } else if (i2 == f42993e) {
                                zzpv a2 = m49550a(j2, "TPE1", bsa);
                                bsa.mo41223c(j);
                                return a2;
                            } else if (i2 == f42994f) {
                                zzpv a3 = m49550a(j2, "TSSE", bsa);
                                bsa.mo41223c(j);
                                return a3;
                            } else if (i2 == f42995g) {
                                zzpv a4 = m49550a(j2, "TALB", bsa);
                                bsa.mo41223c(j);
                                return a4;
                            } else if (i2 == f42998j) {
                                zzpv a5 = m49550a(j2, "USLT", bsa);
                                bsa.mo41223c(j);
                                return a5;
                            } else if (i2 == f42999k) {
                                zzpv a6 = m49550a(j2, "TCON", bsa);
                                bsa.mo41223c(j);
                                return a6;
                            } else if (i2 == f43002n) {
                                zzpv a7 = m49550a(j2, "TIT1", bsa);
                                bsa.mo41223c(j);
                                return a7;
                            }
                        }
                    }
                    zzpv a8 = m49550a(j2, "TCOM", bsa);
                    bsa.mo41223c(j);
                    return a8;
                }
            }
            zzpv a9 = m49550a(j2, "TIT2", bsa);
            bsa.mo41223c(j);
            return a9;
        }
        try {
            if (j2 == f43001m) {
                int b = m49551b(bsa);
                String str2 = (b <= 0 || b > f42988D.length) ? null : f42988D[b - 1];
                return str2 != null ? new zzpv("TCON", null, str2) : null;
            } else if (j2 == f43003o) {
                zzpv b2 = m49552b(j2, "TPOS", bsa);
                bsa.mo41223c(j);
                return b2;
            } else if (j2 == f43004p) {
                zzpv b3 = m49552b(j2, "TRCK", bsa);
                bsa.mo41223c(j);
                return b3;
            } else if (j2 == f43005q) {
                zzpu a10 = m49549a(j2, "TBPM", bsa, true, false);
                bsa.mo41223c(j);
                return a10;
            } else if (j2 == f43006r) {
                zzpu a11 = m49549a(j2, "TCMP", bsa, true, true);
                bsa.mo41223c(j);
                return a11;
            } else if (j2 == f43000l) {
                int j4 = bsa.mo41232j();
                if (bsa.mo41232j() == bnz.f42908ap) {
                    int b4 = bnz.m49521b(bsa.mo41232j());
                    String str3 = b4 == 13 ? "image/jpeg" : b4 == 14 ? "image/png" : null;
                    if (str3 != null) {
                        bsa.mo41225d(4);
                        byte[] bArr = new byte[(j4 - 16)];
                        bsa.mo41219a(bArr, 0, bArr.length);
                        zza = new zzpp(str3, null, 3, bArr);
                        bsa.mo41223c(j);
                        return zza;
                    }
                }
                zza = null;
                bsa.mo41223c(j);
                return zza;
            } else if (j2 == f43007s) {
                zzpv a12 = m49550a(j2, "TPE2", bsa);
                bsa.mo41223c(j);
                return a12;
            } else if (j2 == f43008t) {
                zzpv a13 = m49550a(j2, "TSOT", bsa);
                bsa.mo41223c(j);
                return a13;
            } else if (j2 == f43009u) {
                zzpv a14 = m49550a(j2, "TSO2", bsa);
                bsa.mo41223c(j);
                return a14;
            } else if (j2 == f43010v) {
                zzpv a15 = m49550a(j2, "TSOA", bsa);
                bsa.mo41223c(j);
                return a15;
            } else if (j2 == f43011w) {
                zzpv a16 = m49550a(j2, "TSOP", bsa);
                bsa.mo41223c(j);
                return a16;
            } else if (j2 == f43012x) {
                zzpv a17 = m49550a(j2, "TSOC", bsa);
                bsa.mo41223c(j);
                return a17;
            } else if (j2 == f43013y) {
                zzpu a18 = m49549a(j2, "ITUNESADVISORY", bsa, false, false);
                bsa.mo41223c(j);
                return a18;
            } else if (j2 == f43014z) {
                zzpu a19 = m49549a(j2, "ITUNESGAPLESS", bsa, false, true);
                bsa.mo41223c(j);
                return a19;
            } else if (j2 == f42985A) {
                zzpv a20 = m49550a(j2, "TVSHOWSORT", bsa);
                bsa.mo41223c(j);
                return a20;
            } else if (j2 == f42986B) {
                zzpv a21 = m49550a(j2, "TVSHOW", bsa);
                bsa.mo41223c(j);
                return a21;
            } else if (j2 == f42987C) {
                Object obj = null;
                String str4 = null;
                int i3 = -1;
                int i4 = -1;
                while (bsa.f43389b < j) {
                    int i5 = bsa.f43389b;
                    int j5 = bsa.mo41232j();
                    int j6 = bsa.mo41232j();
                    bsa.mo41225d(4);
                    if (j6 == bnz.f42906an) {
                        obj = bsa.mo41227e(j5 - 12);
                    } else if (j6 == bnz.f42907ao) {
                        str4 = bsa.mo41227e(j5 - 12);
                    } else {
                        if (j6 == bnz.f42908ap) {
                            i3 = i5;
                            i4 = j5;
                        }
                        bsa.mo41225d(j5 - 12);
                    }
                }
                if ("com.apple.iTunes".equals(obj) && "iTunSMPB".equals(str4)) {
                    if (i3 != -1) {
                        bsa.mo41223c(i3);
                        bsa.mo41225d(16);
                        zzpr = new zzpr("und", str4, bsa.mo41227e(i4 - 16));
                    }
                }
                bsa.mo41223c(j);
                return zzpr;
            }
        } finally {
            bsa.mo41223c(j);
        }
        String str5 = "Skipped unknown metadata entry: ";
        String valueOf2 = String.valueOf(bnz.m49522c(j2));
        if (valueOf2.length() != 0) {
            str5.concat(valueOf2);
        } else {
            new String(str5);
        }
        bsa.mo41223c(j);
        return null;
    }

    /* renamed from: a */
    private static zzpv m49550a(int i, String str, bsa bsa) {
        int j = bsa.mo41232j();
        if (bsa.mo41232j() == bnz.f42908ap) {
            bsa.mo41225d(8);
            return new zzpv(str, null, bsa.mo41227e(j - 16));
        }
        String str2 = "Failed to parse text attribute: ";
        String valueOf = String.valueOf(bnz.m49522c(i));
        if (valueOf.length() != 0) {
            str2.concat(valueOf);
        } else {
            new String(str2);
        }
        return null;
    }

    /* renamed from: a */
    private static zzpu m49549a(int i, String str, bsa bsa, boolean z, boolean z2) {
        int b = m49551b(bsa);
        if (z2) {
            b = Math.min(1, b);
        }
        if (b < 0) {
            String str2 = "Failed to parse uint8 attribute: ";
            String valueOf = String.valueOf(bnz.m49522c(i));
            if (valueOf.length() != 0) {
                str2.concat(valueOf);
            } else {
                new String(str2);
            }
            return null;
        } else if (z) {
            return new zzpv(str, null, Integer.toString(b));
        } else {
            return new zzpr("und", str, Integer.toString(b));
        }
    }

    /* renamed from: b */
    private static zzpv m49552b(int i, String str, bsa bsa) {
        int j = bsa.mo41232j();
        if (bsa.mo41232j() == bnz.f42908ap && j >= 22) {
            bsa.mo41225d(10);
            int e = bsa.mo41226e();
            if (e > 0) {
                StringBuilder sb = new StringBuilder(11);
                sb.append(e);
                String sb2 = sb.toString();
                int e2 = bsa.mo41226e();
                if (e2 > 0) {
                    String valueOf = String.valueOf(sb2);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 12);
                    sb3.append(valueOf);
                    sb3.append("/");
                    sb3.append(e2);
                    sb2 = sb3.toString();
                }
                return new zzpv(str, null, sb2);
            }
        }
        String str2 = "Failed to parse index/count attribute: ";
        String valueOf2 = String.valueOf(bnz.m49522c(i));
        if (valueOf2.length() != 0) {
            str2.concat(valueOf2);
        } else {
            new String(str2);
        }
        return null;
    }

    /* renamed from: b */
    private static int m49551b(bsa bsa) {
        bsa.mo41225d(4);
        if (bsa.mo41232j() != bnz.f42908ap) {
            return -1;
        }
        bsa.mo41225d(8);
        return bsa.mo41224d();
    }
}

package com.google.android.gms.internal.ads;

import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;

class biq {

    /* renamed from: A */
    public static final int f42161A = bkn.m49089b("pasp");

    /* renamed from: B */
    public static final int f42162B = bkn.m49089b("TTML");

    /* renamed from: C */
    public static final int f42163C = bkn.m49089b("vmhd");

    /* renamed from: D */
    public static final int f42164D = bkn.m49089b("smhd");

    /* renamed from: E */
    public static final int f42165E = bkn.m49089b("mp4v");

    /* renamed from: F */
    public static final int f42166F = bkn.m49089b("stts");

    /* renamed from: G */
    public static final int f42167G = bkn.m49089b("stss");

    /* renamed from: H */
    public static final int f42168H = bkn.m49089b("ctts");

    /* renamed from: I */
    public static final int f42169I = bkn.m49089b("stsc");

    /* renamed from: J */
    public static final int f42170J = bkn.m49089b("stsz");

    /* renamed from: K */
    public static final int f42171K = bkn.m49089b("stco");

    /* renamed from: L */
    public static final int f42172L = bkn.m49089b("co64");

    /* renamed from: N */
    private static final int f42173N = bkn.m49089b("ftyp");

    /* renamed from: O */
    private static final int f42174O = bkn.m49089b("mdat");

    /* renamed from: P */
    private static final int f42175P = bkn.m49089b("tfdt");

    /* renamed from: Q */
    private static final int f42176Q = bkn.m49089b("tfhd");

    /* renamed from: R */
    private static final int f42177R = bkn.m49089b("trex");

    /* renamed from: S */
    private static final int f42178S = bkn.m49089b("trun");

    /* renamed from: T */
    private static final int f42179T = bkn.m49089b("sidx");

    /* renamed from: U */
    private static final int f42180U = bkn.m49089b("moof");

    /* renamed from: V */
    private static final int f42181V = bkn.m49089b("traf");

    /* renamed from: W */
    private static final int f42182W = bkn.m49089b("mvex");

    /* renamed from: X */
    private static final int f42183X = bkn.m49089b("pssh");

    /* renamed from: Y */
    private static final int f42184Y = bkn.m49089b("saiz");

    /* renamed from: Z */
    private static final int f42185Z = bkn.m49089b("uuid");

    /* renamed from: a */
    public static final int f42186a = bkn.m49089b("avc1");

    /* renamed from: aa */
    private static final int f42187aa = bkn.m49089b("senc");

    /* renamed from: b */
    public static final int f42188b = bkn.m49089b("avc3");

    /* renamed from: c */
    public static final int f42189c = bkn.m49089b("esds");

    /* renamed from: d */
    public static final int f42190d = bkn.m49089b("mp4a");

    /* renamed from: e */
    public static final int f42191e = bkn.m49089b("ac-3");

    /* renamed from: f */
    public static final int f42192f = bkn.m49089b("dac3");

    /* renamed from: g */
    public static final int f42193g = bkn.m49089b("ec-3");

    /* renamed from: h */
    public static final int f42194h = bkn.m49089b("dec3");

    /* renamed from: i */
    public static final int f42195i = bkn.m49089b("moov");

    /* renamed from: j */
    public static final int f42196j = bkn.m49089b("mvhd");

    /* renamed from: k */
    public static final int f42197k = bkn.m49089b("trak");

    /* renamed from: l */
    public static final int f42198l = bkn.m49089b("mdia");

    /* renamed from: m */
    public static final int f42199m = bkn.m49089b("minf");

    /* renamed from: n */
    public static final int f42200n = bkn.m49089b("stbl");

    /* renamed from: o */
    public static final int f42201o = bkn.m49089b("avcC");

    /* renamed from: p */
    public static final int f42202p = bkn.m49089b("tkhd");

    /* renamed from: q */
    public static final int f42203q = bkn.m49089b("mdhd");

    /* renamed from: r */
    public static final int f42204r = bkn.m49089b("hdlr");

    /* renamed from: s */
    public static final int f42205s = bkn.m49089b("stsd");

    /* renamed from: t */
    public static final int f42206t = bkn.m49089b("sinf");

    /* renamed from: u */
    public static final int f42207u = bkn.m49089b("schm");

    /* renamed from: v */
    public static final int f42208v = bkn.m49089b("schi");

    /* renamed from: w */
    public static final int f42209w = bkn.m49089b("tenc");

    /* renamed from: x */
    public static final int f42210x = bkn.m49089b("encv");

    /* renamed from: y */
    public static final int f42211y = bkn.m49089b("enca");

    /* renamed from: z */
    public static final int f42212z = bkn.m49089b("frma");

    /* renamed from: M */
    public final int f42213M;

    biq(int i) {
        this.f42213M = i;
    }

    /* renamed from: a */
    public static int m48959a(int i) {
        return (i >> 24) & NormalGiftView.ALPHA_255;
    }

    public String toString() {
        return m48960b(this.f42213M);
    }

    /* renamed from: b */
    public static String m48960b(int i) {
        char c = (char) (i >> 24);
        char c2 = (char) ((i >> 16) & NormalGiftView.ALPHA_255);
        char c3 = (char) ((i >> 8) & NormalGiftView.ALPHA_255);
        char c4 = (char) (i & NormalGiftView.ALPHA_255);
        StringBuilder sb = new StringBuilder(4);
        sb.append(c);
        sb.append(c2);
        sb.append(c3);
        sb.append(c4);
        return sb.toString();
    }
}

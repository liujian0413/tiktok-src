package com.p280ss.android.ugc.aweme.utils;

import android.content.Context;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import com.p280ss.android.vesdk.filterparam.VETransitionFilterParam;
import com.p280ss.ttm.player.MediaPlayer;

/* renamed from: com.ss.android.ugc.aweme.utils.cg */
public final class C43012cg {

    /* renamed from: A */
    private static final int[] f111575A = {f111592p, f111589m};

    /* renamed from: B */
    private static final int[] f111576B = {f111592p, f111591o};

    /* renamed from: a */
    private static final Context f111577a;

    /* renamed from: b */
    private static final int f111578b;

    /* renamed from: c */
    private static final int f111579c = ((int) C43086eb.m136676a(f111577a, 1, 48.0f));

    /* renamed from: d */
    private static final int f111580d = ((int) C43086eb.m136676a(f111577a, 1, 52.0f));

    /* renamed from: e */
    private static final int f111581e = ((int) C43086eb.m136676a(f111577a, 1, 64.0f));

    /* renamed from: f */
    private static final int f111582f = ((int) C43086eb.m136676a(f111577a, 1, 90.0f));

    /* renamed from: g */
    private static final int f111583g = ((int) C43086eb.m136676a(f111577a, 1, 94.0f));

    /* renamed from: h */
    private static final int f111584h = ((int) C43086eb.m136676a(f111577a, 1, 120.0f));

    /* renamed from: i */
    private static final int f111585i = ((int) C43086eb.m136676a(f111577a, 1, 124.0f));

    /* renamed from: j */
    private static final int f111586j = ((int) C43086eb.m136676a(f111577a, 1, 165.0f));

    /* renamed from: k */
    private static final int f111587k = ((int) C43086eb.m136676a(f111577a, 1, 186.0f));

    /* renamed from: l */
    private static final int f111588l = ((int) C43086eb.m136676a(f111577a, 1, 180.0f));

    /* renamed from: m */
    private static final int f111589m = ((int) C43086eb.m136676a(f111577a, 1, 211.0f));

    /* renamed from: n */
    private static final int f111590n = ((int) C43086eb.m136676a(f111577a, 1, 248.0f));

    /* renamed from: o */
    private static final int f111591o = ((int) C43086eb.m136676a(f111577a, 1, 280.0f));

    /* renamed from: p */
    private static final int f111592p = ((int) C43086eb.m136676a(f111577a, 1, 375.0f));

    /* renamed from: q */
    private static final int[] f111593q = {f111578b, f111578b};

    /* renamed from: r */
    private static final int[] f111594r = {f111579c, f111579c};

    /* renamed from: s */
    private static final int[] f111595s = {f111580d, f111580d};

    /* renamed from: t */
    private static final int[] f111596t = {f111581e, f111581e};

    /* renamed from: u */
    private static final int[] f111597u = {f111583g, f111583g};

    /* renamed from: v */
    private static final int[] f111598v = {f111584h, f111584h};

    /* renamed from: w */
    private static final int[] f111599w = {f111585i, f111586j};

    /* renamed from: x */
    private static final int[] f111600x = {f111587k, f111590n};

    /* renamed from: y */
    private static final int[] f111601y = {f111592p, f111582f};

    /* renamed from: z */
    private static final int[] f111602z = {f111592p, f111588l};

    static {
        Context a = C6399b.m19921a();
        f111577a = a;
        f111578b = (int) C43086eb.m136676a(a, 1, 32.0f);
    }

    /* renamed from: a */
    public static int[] m136513a(int i) {
        switch (i) {
            case 100:
            case C34943c.f91128x /*?: ONE_ARG  (wrap: void
  ?: SGET   com.ss.android.ugc.aweme.player.a.c.x int)*/:
                return f111593q;
            case BaseNotice.HASHTAG /*101*/:
                return f111594r;
            case 102:
                return f111597u;
            case C34943c.f91127w /*?: ONE_ARG  (wrap: void
  ?: SGET   com.ss.android.ugc.aweme.player.a.c.w int)*/:
                return f111599w;
            case 201:
                return f111600x;
            case 301:
            case VETransitionFilterParam.TransitionDuration_DEFAULT /*500*/:
                return f111596t;
            case 302:
                return f111598v;
            case 303:
                return f111576B;
            case MediaPlayer.MEDIA_PLAYER_OPTION_USE_CODEC_POOL /*400*/:
                return f111595s;
            case 600:
                return f111602z;
            case 601:
                return f111601y;
            case 700:
                return f111575A;
            default:
                return null;
        }
    }
}

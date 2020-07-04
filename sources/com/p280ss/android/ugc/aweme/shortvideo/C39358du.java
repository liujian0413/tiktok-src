package com.p280ss.android.ugc.aweme.shortvideo;

import com.p280ss.android.ugc.aweme.shortvideo.util.C41530am;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.du */
public final class C39358du {

    /* renamed from: a */
    private int f102240a = -1;

    /* renamed from: a */
    public final int mo97922a(int i, int i2) {
        return m125718a(i, i2, m125719b(i, i2));
    }

    /* renamed from: b */
    private static int m125719b(int i, int i2) {
        if (i == 0) {
            return Math.min((int) (((float) i2) * 0.59f), 59);
        }
        if (i == 2) {
            return 60;
        }
        if (i == 1) {
            return Math.min((int) ((((float) i2) * 0.37f) + 61.0f), 98);
        }
        if (i == 3) {
            return 99;
        }
        return 100;
    }

    /* renamed from: a */
    private int m125718a(int i, int i2, int i3) {
        if (i3 < this.f102240a) {
            StringBuilder sb = new StringBuilder("Error publish progress. step:");
            sb.append(i);
            sb.append(" sdkProgress:");
            sb.append(i2);
            sb.append(" calculateProgress:");
            sb.append(i3);
            sb.append(" lastProgress");
            sb.append(this.f102240a);
            C41530am.m132283b(sb.toString());
            i3 = this.f102240a;
        }
        this.f102240a = i3;
        return i3;
    }
}

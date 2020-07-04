package com.p280ss.android.ugc.aweme.account.base.widget.divider;

import com.p280ss.android.ugc.aweme.account.base.widget.DividerView;
import com.p280ss.android.ugc.aweme.base.mvvm.impl.C23362b;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;

/* renamed from: com.ss.android.ugc.aweme.account.base.widget.divider.DividerViewModel */
public class DividerViewModel extends C23362b<DividerView> {

    /* renamed from: b */
    public static final int f56744b = C23486n.m77122a(0.5d);

    /* renamed from: a */
    public Class f56745a;

    /* renamed from: c */
    public int f56746c;

    /* renamed from: d */
    public int[] f56747d;

    /* renamed from: e */
    public int f56748e;

    /* renamed from: f */
    public int f56749f;

    /* renamed from: g */
    public Orientation f56750g;

    /* renamed from: com.ss.android.ugc.aweme.account.base.widget.divider.DividerViewModel$Factory */
    public static class Factory {

        /* renamed from: com.ss.android.ugc.aweme.account.base.widget.divider.DividerViewModel$Factory$Option */
        public enum Option {
            PLAIN_LINE_HALF,
            PLAIN_LINE_FULL,
            LINE_WITH_PADDING_TOP_10_DP
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.base.widget.divider.DividerViewModel$Orientation */
    public enum Orientation {
        VERTICAL,
        HORIZONTAL
    }

    /* renamed from: a */
    private static void m71227a(int[] iArr) {
        if (iArr != null && iArr.length != 4) {
            throw new IllegalArgumentException("Padding参数须传入长度为4的int数组！");
        }
    }

    public DividerViewModel(int i, Orientation orientation, int i2) {
        this(i, null, i2, 0);
        this.f56750g = orientation;
    }

    private DividerViewModel(int i, int[] iArr, int i2, int i3) {
        this.f56750g = Orientation.VERTICAL;
        m71227a(null);
        this.f56746c = i;
        this.f56747d = null;
        this.f56748e = i2;
        this.f56749f = i3;
    }
}

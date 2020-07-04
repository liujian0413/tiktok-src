package com.p280ss.android.ugc.aweme.base.widget.divider;

import com.p280ss.android.ugc.aweme.base.mvvm.impl.C23362b;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.base.widget.DividerView;

/* renamed from: com.ss.android.ugc.aweme.base.widget.divider.DividerViewModel */
public class DividerViewModel extends C23362b<DividerView> {

    /* renamed from: b */
    public static final int f62028b = C23486n.m77122a(0.5d);

    /* renamed from: a */
    public Class f62029a;

    /* renamed from: c */
    public int f62030c;

    /* renamed from: d */
    public int[] f62031d;

    /* renamed from: e */
    public int f62032e;

    /* renamed from: f */
    public int f62033f;

    /* renamed from: g */
    public Orientation f62034g;

    /* renamed from: com.ss.android.ugc.aweme.base.widget.divider.DividerViewModel$Factory */
    public static class Factory {

        /* renamed from: com.ss.android.ugc.aweme.base.widget.divider.DividerViewModel$Factory$Option */
        public enum Option {
            PLAIN_LINE_HALF,
            PLAIN_LINE_FULL,
            LINE_WITH_PADDING_TOP_10_DP
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.base.widget.divider.DividerViewModel$Orientation */
    public enum Orientation {
        VERTICAL,
        HORIZONTAL
    }

    private DividerViewModel(int i) {
        this(i, null, 0, 0);
    }

    /* renamed from: a */
    private static void m77199a(int[] iArr) {
        if (iArr != null && iArr.length != 4) {
            throw new IllegalArgumentException("Padding参数须传入长度为4的int数组！");
        }
    }

    public DividerViewModel(int i, Orientation orientation) {
        this(i);
        this.f62034g = orientation;
    }

    private DividerViewModel(int i, int[] iArr, int i2, int i3) {
        this.f62034g = Orientation.VERTICAL;
        m77199a(null);
        this.f62030c = i;
        this.f62031d = null;
        this.f62032e = i2;
        this.f62033f = i3;
    }
}

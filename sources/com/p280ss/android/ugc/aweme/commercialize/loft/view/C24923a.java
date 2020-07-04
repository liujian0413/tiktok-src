package com.p280ss.android.ugc.aweme.commercialize.loft.view;

import com.p280ss.android.ugc.aweme.commercialize.loft.view.IntermediateStateViewController.ViewState;
import com.p280ss.android.ugc.aweme.commercialize.loft.view.IntermediateStateViewController.ViewType;

/* renamed from: com.ss.android.ugc.aweme.commercialize.loft.view.a */
public final /* synthetic */ class C24923a {

    /* renamed from: a */
    public static final /* synthetic */ int[] f65742a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f65743b;

    static {
        int[] iArr = new int[ViewState.values().length];
        f65742a = iArr;
        iArr[ViewState.PULL_DOWN_FIRST.ordinal()] = 1;
        f65742a[ViewState.PULL_DOWN_SECOND.ordinal()] = 2;
        f65742a[ViewState.PULL_DOWN_THIRD.ordinal()] = 3;
        f65742a[ViewState.REFRESHING.ordinal()] = 4;
        f65742a[ViewState.CLOSE.ordinal()] = 5;
        f65742a[ViewState.EXPENDING.ordinal()] = 6;
        f65742a[ViewState.EXPENDED.ordinal()] = 7;
        int[] iArr2 = new int[ViewType.values().length];
        f65743b = iArr2;
        iArr2[ViewType.SECOND_LOFT.ordinal()] = 1;
        f65743b[ViewType.DIRECT_OPEN.ordinal()] = 2;
        f65743b[ViewType.VIDEO_PLACEHOLDER.ordinal()] = 3;
    }
}

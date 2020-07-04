package com.p280ss.android.ugc.aweme.shortvideo.upload.speedprobe;

import com.p280ss.android.ugc.aweme.shortvideo.upload.speedprobe.UploadSpeedProbe.State;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.speedprobe.b */
public final /* synthetic */ class C41492b {

    /* renamed from: a */
    public static final /* synthetic */ int[] f107910a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f107911b;

    /* renamed from: c */
    public static final /* synthetic */ int[] f107912c;

    static {
        int[] iArr = new int[State.values().length];
        f107910a = iArr;
        iArr[State.RUNNING.ordinal()] = 1;
        f107910a[State.SUCCESS.ordinal()] = 2;
        f107910a[State.NOT_START.ordinal()] = 3;
        f107910a[State.CANCEL.ordinal()] = 4;
        f107910a[State.FAILED.ordinal()] = 5;
        f107910a[State.TIME_OUT.ordinal()] = 6;
        int[] iArr2 = new int[State.values().length];
        f107911b = iArr2;
        iArr2[State.RUNNING.ordinal()] = 1;
        int[] iArr3 = new int[State.values().length];
        f107912c = iArr3;
        iArr3[State.RUNNING.ordinal()] = 1;
    }
}

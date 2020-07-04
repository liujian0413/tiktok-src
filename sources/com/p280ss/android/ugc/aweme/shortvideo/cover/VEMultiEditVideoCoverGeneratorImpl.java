package com.p280ss.android.ugc.aweme.shortvideo.cover;

import android.arch.lifecycle.C0043i;
import com.p280ss.android.ugc.asve.p754b.C15389d;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cover.VEMultiEditVideoCoverGeneratorImpl */
public class VEMultiEditVideoCoverGeneratorImpl extends VEVideoCoverGeneratorImpl {

    /* renamed from: a */
    public int f100354a;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int[] mo96645a(int i, int i2) {
        int[] iArr = new int[i2];
        int i3 = i / i2;
        for (int i4 = 0; i4 < i2; i4++) {
            iArr[i4] = (i3 * i4) + this.f100354a;
        }
        return iArr;
    }

    public VEMultiEditVideoCoverGeneratorImpl(C15389d dVar, C0043i iVar, int i, int i2, int i3) {
        super(dVar, iVar, i);
        this.f100356b = i2;
        this.f100354a = i3;
    }
}

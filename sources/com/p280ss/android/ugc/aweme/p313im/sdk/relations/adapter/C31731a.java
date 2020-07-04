package com.p280ss.android.ugc.aweme.p313im.sdk.relations.adapter;

import android.text.TextUtils;
import android.widget.SectionIndexer;
import java.util.Arrays;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.adapter.a */
public final class C31731a implements SectionIndexer {

    /* renamed from: a */
    private String[] f83041a;

    /* renamed from: b */
    private int[] f83042b;

    /* renamed from: c */
    private int f83043c;

    public final Object[] getSections() {
        return this.f83041a;
    }

    public final int getPositionForSection(int i) {
        if (i < 0 || i >= this.f83041a.length) {
            return -1;
        }
        return this.f83042b[i];
    }

    public final int getSectionForPosition(int i) {
        if (i < 0 || i >= this.f83043c) {
            return -1;
        }
        int binarySearch = Arrays.binarySearch(this.f83042b, i);
        if (binarySearch >= 0) {
            return binarySearch;
        }
        return (-binarySearch) - 2;
    }

    public C31731a(String[] strArr, int[] iArr) {
        int min = Math.min(strArr.length, iArr.length);
        this.f83041a = strArr;
        this.f83042b = new int[min];
        int i = 0;
        for (int i2 = 0; i2 < min; i2++) {
            if (TextUtils.isEmpty(this.f83041a[i2])) {
                this.f83041a[i2] = " ";
            } else if (!this.f83041a[i2].equals(" ")) {
                String[] strArr2 = this.f83041a;
                strArr2[i2] = strArr2[i2].trim();
            }
            this.f83042b[i2] = i;
            i += iArr[i2];
        }
        this.f83043c = i;
    }
}

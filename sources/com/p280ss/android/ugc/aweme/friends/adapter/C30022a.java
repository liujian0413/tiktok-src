package com.p280ss.android.ugc.aweme.friends.adapter;

import android.text.TextUtils;
import android.widget.SectionIndexer;
import java.util.Arrays;

/* renamed from: com.ss.android.ugc.aweme.friends.adapter.a */
public final class C30022a implements SectionIndexer {

    /* renamed from: a */
    private String[] f78989a;

    /* renamed from: b */
    private int[] f78990b;

    /* renamed from: c */
    private int f78991c;

    public final Object[] getSections() {
        return this.f78989a;
    }

    public final int getPositionForSection(int i) {
        if (i < 0 || i >= this.f78989a.length) {
            return -1;
        }
        return this.f78990b[i];
    }

    /* renamed from: a */
    public final int mo76245a(int i) {
        if (i < 0 || i >= this.f78991c) {
            return -1;
        }
        int a = m98478a(this.f78990b, i);
        if (a >= 0) {
            return a;
        }
        return (-a) - 2;
    }

    public final int getSectionForPosition(int i) {
        if (i < 0 || i >= this.f78991c) {
            return -1;
        }
        int binarySearch = Arrays.binarySearch(this.f78990b, i);
        if (binarySearch >= 0) {
            return binarySearch;
        }
        return (-binarySearch) - 2;
    }

    /* renamed from: a */
    private static int m98478a(int[] iArr, int i) {
        int length = iArr.length - 1;
        int i2 = 0;
        while (i2 <= length) {
            int i3 = (i2 + length) >>> 1;
            if (i < iArr[i3]) {
                length = i3 - 1;
            } else if (i <= iArr[i3]) {
                return i3;
            } else {
                i2 = i3 + 1;
            }
        }
        if (i2 == iArr.length || iArr[i2] > i) {
            return i2 - 1;
        }
        return i2;
    }

    public C30022a(String[] strArr, int[] iArr) {
        int min = Math.min(strArr.length, iArr.length);
        this.f78989a = strArr;
        this.f78990b = new int[min];
        int i = 0;
        for (int i2 = 0; i2 < min; i2++) {
            if (TextUtils.isEmpty(this.f78989a[i2])) {
                this.f78989a[i2] = " ";
            } else if (!this.f78989a[i2].equals(" ")) {
                String[] strArr2 = this.f78989a;
                strArr2[i2] = strArr2[i2].trim();
            }
            this.f78990b[i2] = i;
            i += iArr[i2];
        }
        this.f78991c = i;
    }
}

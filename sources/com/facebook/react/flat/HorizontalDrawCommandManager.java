package com.facebook.react.flat;

import android.util.SparseIntArray;
import java.util.Arrays;

final class HorizontalDrawCommandManager extends ClippingDrawCommandManager {
    /* access modifiers changed from: 0000 */
    public final int commandStartIndex() {
        int binarySearch = Arrays.binarySearch(this.mCommandMaxBottom, (float) this.mClippingRect.left);
        if (binarySearch < 0) {
            return binarySearch ^ -1;
        }
        return binarySearch;
    }

    /* access modifiers changed from: 0000 */
    public final int commandStopIndex(int i) {
        float[] fArr = this.mCommandMinTop;
        int binarySearch = Arrays.binarySearch(fArr, i, fArr.length, (float) this.mClippingRect.right);
        if (binarySearch < 0) {
            return binarySearch ^ -1;
        }
        return binarySearch;
    }

    HorizontalDrawCommandManager(FlatViewGroup flatViewGroup, DrawCommand[] drawCommandArr) {
        super(flatViewGroup, drawCommandArr);
    }

    /* access modifiers changed from: 0000 */
    public final int regionStopIndex(float f, float f2) {
        int binarySearch = Arrays.binarySearch(this.mRegionMinTop, f + 1.0E-4f);
        if (binarySearch < 0) {
            return binarySearch ^ -1;
        }
        return binarySearch;
    }

    /* access modifiers changed from: 0000 */
    public final boolean regionAboveTouch(int i, float f, float f2) {
        if (this.mRegionMaxBottom[i] < f) {
            return true;
        }
        return false;
    }

    public static void fillMaxMinArrays(NodeRegion[] nodeRegionArr, float[] fArr, float[] fArr2) {
        float f = 0.0f;
        for (int i = 0; i < nodeRegionArr.length; i++) {
            f = Math.max(f, nodeRegionArr[i].getTouchableRight());
            fArr[i] = f;
        }
        for (int length = nodeRegionArr.length - 1; length >= 0; length--) {
            f = Math.min(f, nodeRegionArr[length].getTouchableLeft());
            fArr2[length] = f;
        }
    }

    public static void fillMaxMinArrays(DrawCommand[] drawCommandArr, float[] fArr, float[] fArr2, SparseIntArray sparseIntArray) {
        float min;
        float f = 0.0f;
        for (int i = 0; i < drawCommandArr.length; i++) {
            if (drawCommandArr[i] instanceof DrawView) {
                DrawView drawView = drawCommandArr[i];
                sparseIntArray.append(drawView.reactTag, i);
                f = Math.max(f, drawView.mLogicalRight);
            } else {
                f = Math.max(f, drawCommandArr[i].getRight());
            }
            fArr[i] = f;
        }
        for (int length = drawCommandArr.length - 1; length >= 0; length--) {
            if (drawCommandArr[length] instanceof DrawView) {
                min = Math.min(f, drawCommandArr[length].mLogicalLeft);
            } else {
                min = Math.min(f, drawCommandArr[length].getLeft());
            }
            f = min;
            fArr2[length] = f;
        }
    }
}

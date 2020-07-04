package com.p280ss.android.medialib;

import android.media.Image.Plane;
import com.p280ss.android.medialib.camera.C19699j;
import com.p280ss.android.medialib.camera.ImageFrame;
import java.nio.ByteBuffer;

/* renamed from: com.ss.android.medialib.i */
public final class C19724i {

    /* renamed from: a */
    ImageFrame f53487a;

    public C19724i(ImageFrame imageFrame) {
        this.f53487a = imageFrame;
    }

    /* renamed from: a */
    public final boolean mo52428a(int[][] iArr, ByteBuffer[] byteBufferArr) {
        C19699j plane = this.f53487a.getPlane();
        if (plane == null) {
            return false;
        }
        Plane[] planeArr = plane.f53428a;
        if (planeArr == null) {
            return false;
        }
        for (int i = 0; i < planeArr.length; i++) {
            byteBufferArr[i] = planeArr[i].getBuffer();
            iArr[i] = new int[]{byteBufferArr[i].remaining(), planeArr[i].getRowStride(), planeArr[i].getPixelStride()};
        }
        return true;
    }
}

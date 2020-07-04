package com.p280ss.android.vesdk;

import com.p280ss.android.ttve.nativePort.TEVideoUtils;

/* renamed from: com.ss.android.vesdk.VECurveSpeedUtils */
public class VECurveSpeedUtils {
    private static final String TAG = "VECurveSpeedUtils";
    private static final int TIMEBASE = 1000;
    private double mAveSpeed;
    private float[] mCurveSpeedPointX;
    private float[] mCurveSpeedPointY;
    private long mNative;

    public void destroy() {
        if (this.mNative == 0) {
            C45372t.m143409d(TAG, "destroy, mNative == 0");
        } else {
            TEVideoUtils.nativeCurveSpeedDestroy(this.mNative);
        }
    }

    public double getAveCurveSpeed() {
        if (this.mNative == 0) {
            C45372t.m143409d(TAG, "getAveCurveSpeed, mNative == 0");
            return -112.0d;
        }
        this.mAveSpeed = TEVideoUtils.nativeGetAveCurveSpeed(this.mNative);
        return this.mAveSpeed;
    }

    public double getCurveSpeedWithSeqDelta(long j) {
        if (this.mNative != 0) {
            return TEVideoUtils.nativeGetCurveSpeedWithSeqDelta(this.mNative, j * 1000);
        }
        C45372t.m143409d(TAG, "getCurveSpeedWithSeqDelta, mNative == 0");
        return -112.0d;
    }

    public long mapSeqDeltaToTrimDelta(long j) {
        if (this.mNative != 0) {
            return TEVideoUtils.nativeMapSeqDeltaToTrimDelta(this.mNative, j * 1000) / 1000;
        }
        C45372t.m143409d(TAG, "mapSeqDeltaToTrimDelta, mNative == 0");
        return -112;
    }

    public long mapTrimDeltaToSeqDelta(long j) {
        if (this.mNative != 0) {
            return TEVideoUtils.nativeMapTrimDeltaToSeqDelta(this.mNative, j * 1000) / 1000;
        }
        C45372t.m143409d(TAG, "mapTrimDeltaToSeqDelta, mNative == 0");
        return -112;
    }

    public void setSeqDuration(long j) {
        if (this.mNative == 0) {
            C45372t.m143409d(TAG, "mapTrimDeltaToSeqDelta, mNative == 0");
        } else {
            TEVideoUtils.nativeSetSeqDuration(this.mNative, j * 1000);
        }
    }

    public int setCurveSpeed(float[] fArr, float[] fArr2) {
        if (fArr == null || fArr2 == null || fArr.length != fArr2.length || fArr.length < 2) {
            C45372t.m143409d(TAG, "setCurveSpeed,incorrect curve anchors, mNative == 0");
            return -100;
        } else if (this.mNative != 0) {
            return TEVideoUtils.nativeSetCurveSpeedData(this.mNative, fArr, fArr2);
        } else {
            C45372t.m143409d(TAG, "setCurveSpeed, mNative == 0");
            return -112;
        }
    }

    public VECurveSpeedUtils(float[] fArr, float[] fArr2) {
        if (fArr == null || fArr2 == null || fArr.length != fArr2.length || fArr.length < 2) {
            this.mNative = 0;
            C45372t.m143409d(TAG, "incorrect curve anchors, mNative == 0");
            return;
        }
        this.mNative = TEVideoUtils.nativeCreateCurveSpeedUtils(fArr, fArr2);
        this.mCurveSpeedPointX = fArr;
        this.mCurveSpeedPointY = fArr2;
        int curveSpeed = setCurveSpeed(this.mCurveSpeedPointX, this.mCurveSpeedPointY);
        double aveCurveSpeed = getAveCurveSpeed();
        String str = TAG;
        StringBuilder sb = new StringBuilder("VECurveSpeedUtils ret1 ");
        sb.append(curveSpeed);
        sb.append(" ret2 ");
        sb.append(aveCurveSpeed);
        C45372t.m143405b(str, sb.toString());
    }

    public static float[] transferTrimPointXtoSeqPointX(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float[] fArr3 = new float[length];
        int i = 0;
        float f = 0.0f;
        fArr3[0] = 0.0f;
        while (i < length - 1) {
            int i2 = i + 1;
            f += (fArr[i2] - fArr[i]) / ((fArr2[i2] + fArr2[i]) * 0.5f);
            fArr3[i2] = f;
            i = i2;
        }
        for (int i3 = 1; i3 < length; i3++) {
            fArr3[i3] = fArr3[i3] / f;
            StringBuilder sb = new StringBuilder("transferTrimPointXtoSeqPointX SeqPointX[");
            sb.append(i3);
            sb.append("]= ");
            sb.append(fArr3[i3]);
            C45372t.m143405b("TAG", sb.toString());
        }
        return fArr3;
    }
}

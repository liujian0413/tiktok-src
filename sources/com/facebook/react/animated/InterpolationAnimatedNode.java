package com.facebook.react.animated;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;

class InterpolationAnimatedNode extends ValueAnimatedNode {
    private final String mExtrapolateLeft;
    private final String mExtrapolateRight;
    private final double[] mInputRange;
    private final double[] mOutputRange;
    private ValueAnimatedNode mParent;

    public void update() {
        if (this.mParent != null) {
            this.mValue = interpolate(this.mParent.getValue(), this.mInputRange, this.mOutputRange, this.mExtrapolateLeft, this.mExtrapolateRight);
        }
    }

    public void onDetachedFromNode(AnimatedNode animatedNode) {
        if (animatedNode == this.mParent) {
            this.mParent = null;
            return;
        }
        throw new IllegalArgumentException("Invalid parent node provided");
    }

    private static double[] fromDoubleArray(ReadableArray readableArray) {
        double[] dArr = new double[readableArray.size()];
        for (int i = 0; i < dArr.length; i++) {
            dArr[i] = readableArray.getDouble(i);
        }
        return dArr;
    }

    public void onAttachedToNode(AnimatedNode animatedNode) {
        if (this.mParent != null) {
            throw new IllegalStateException("Parent already attached");
        } else if (animatedNode instanceof ValueAnimatedNode) {
            this.mParent = (ValueAnimatedNode) animatedNode;
        } else {
            throw new IllegalArgumentException("Parent is of an invalid type");
        }
    }

    public InterpolationAnimatedNode(ReadableMap readableMap) {
        this.mInputRange = fromDoubleArray(readableMap.getArray("inputRange"));
        this.mOutputRange = fromDoubleArray(readableMap.getArray("outputRange"));
        this.mExtrapolateLeft = readableMap.getString("extrapolateLeft");
        this.mExtrapolateRight = readableMap.getString("extrapolateRight");
    }

    private static int findRangeIndex(double d, double[] dArr) {
        int i = 1;
        while (i < dArr.length - 1 && dArr[i] < d) {
            i++;
        }
        return i - 1;
    }

    static double interpolate(double d, double[] dArr, double[] dArr2, String str, String str2) {
        int findRangeIndex = findRangeIndex(d, dArr);
        int i = findRangeIndex + 1;
        return interpolate(d, dArr[findRangeIndex], dArr[i], dArr2[findRangeIndex], dArr2[i], str, str2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x007d, code lost:
        if (r4.equals("identity") != false) goto L_0x008b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00aa A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static double interpolate(double r13, double r15, double r17, double r19, double r21, java.lang.String r23, java.lang.String r24) {
        /*
            r3 = r23
            r4 = r24
            r6 = 0
            r7 = 2
            r8 = 94742715(0x5a5a8bb, float:1.5578507E-35)
            r9 = -135761730(0xfffffffff7e870be, float:-9.428903E33)
            r10 = -1289044198(0xffffffffb32abf1a, float:-3.9755015E-8)
            r11 = -1
            int r12 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r12 >= 0) goto L_0x005d
            int r5 = r23.hashCode()
            if (r5 == r10) goto L_0x0033
            if (r5 == r9) goto L_0x0029
            if (r5 == r8) goto L_0x001f
            goto L_0x003d
        L_0x001f:
            java.lang.String r5 = "clamp"
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto L_0x003d
            r5 = 1
            goto L_0x003e
        L_0x0029:
            java.lang.String r5 = "identity"
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto L_0x003d
            r5 = 0
            goto L_0x003e
        L_0x0033:
            java.lang.String r5 = "extend"
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto L_0x003d
            r5 = 2
            goto L_0x003e
        L_0x003d:
            r5 = -1
        L_0x003e:
            switch(r5) {
                case 0: goto L_0x005c;
                case 1: goto L_0x005a;
                case 2: goto L_0x005d;
                default: goto L_0x0041;
            }
        L_0x0041:
            com.facebook.react.bridge.JSApplicationIllegalArgumentException r0 = new com.facebook.react.bridge.JSApplicationIllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Invalid extrapolation type "
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r2 = "for left extrapolation"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x005a:
            r0 = r15
            goto L_0x005e
        L_0x005c:
            return r13
        L_0x005d:
            r0 = r13
        L_0x005e:
            int r3 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1))
            if (r3 <= 0) goto L_0x00ab
            int r3 = r24.hashCode()
            if (r3 == r10) goto L_0x0080
            if (r3 == r9) goto L_0x0077
            if (r3 == r8) goto L_0x006d
            goto L_0x008a
        L_0x006d:
            java.lang.String r3 = "clamp"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x008a
            r6 = 1
            goto L_0x008b
        L_0x0077:
            java.lang.String r3 = "identity"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x008a
            goto L_0x008b
        L_0x0080:
            java.lang.String r3 = "extend"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x008a
            r6 = 2
            goto L_0x008b
        L_0x008a:
            r6 = -1
        L_0x008b:
            switch(r6) {
                case 0: goto L_0x00aa;
                case 1: goto L_0x00a7;
                case 2: goto L_0x00ab;
                default: goto L_0x008e;
            }
        L_0x008e:
            com.facebook.react.bridge.JSApplicationIllegalArgumentException r0 = new com.facebook.react.bridge.JSApplicationIllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Invalid extrapolation type "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r2 = "for right extrapolation"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00a7:
            r0 = r17
            goto L_0x00ab
        L_0x00aa:
            return r0
        L_0x00ab:
            r3 = 0
            double r3 = r21 - r19
            double r0 = r0 - r15
            double r3 = r3 * r0
            double r0 = r17 - r15
            double r3 = r3 / r0
            double r0 = r19 + r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.animated.InterpolationAnimatedNode.interpolate(double, double, double, double, double, java.lang.String, java.lang.String):double");
    }
}

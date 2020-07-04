package com.google.common.collect;

/* renamed from: com.google.common.collect.bg */
final class C17761bg {
    /* renamed from: a */
    static int m59065a(Object obj) {
        int i;
        if (obj == null) {
            i = 0;
        } else {
            i = obj.hashCode();
        }
        return m59063a(i);
    }

    /* renamed from: a */
    static int m59063a(int i) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i) * -862048943), 15)) * 461845907);
    }

    /* renamed from: a */
    static int m59064a(int i, double d) {
        int max = Math.max(i, 2);
        int highestOneBit = Integer.highestOneBit(max);
        double d2 = (double) highestOneBit;
        Double.isNaN(d2);
        if (max <= ((int) (d * d2))) {
            return highestOneBit;
        }
        int i2 = highestOneBit << 1;
        if (i2 > 0) {
            return i2;
        }
        return 1073741824;
    }

    /* renamed from: a */
    static boolean m59066a(int i, int i2, double d) {
        double d2 = (double) i;
        double d3 = (double) i2;
        Double.isNaN(d3);
        if (d2 <= d3 * 1.0d || i2 >= 1073741824) {
            return false;
        }
        return true;
    }
}

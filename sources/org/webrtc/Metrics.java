package org.webrtc;

import java.util.HashMap;
import java.util.Map;

public class Metrics {
    public final Map<String, HistogramInfo> map = new HashMap();

    public static class HistogramInfo {
        public final int bucketCount;
        public final int max;
        public final int min;
        public final Map<Integer, Integer> samples = new HashMap();

        public void addSample(int i, int i2) {
            this.samples.put(Integer.valueOf(i), Integer.valueOf(i2));
        }

        public HistogramInfo(int i, int i2, int i3) {
            this.min = i;
            this.max = i2;
            this.bucketCount = i3;
        }
    }

    public static void enable() {
        nativeEnable();
    }

    private static native void nativeEnable();

    private static native Metrics nativeGetAndReset();

    public static Metrics getAndReset() {
        return nativeGetAndReset();
    }

    Metrics() {
    }

    private void add(String str, HistogramInfo histogramInfo) {
        this.map.put(str, histogramInfo);
    }
}

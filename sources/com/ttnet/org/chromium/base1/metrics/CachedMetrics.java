package com.ttnet.org.chromium.base1.metrics;

import com.ttnet.org.chromium.base1.library_loader.LibraryLoader;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class CachedMetrics {

    public static class ActionEvent extends CachedHistogram {
        private int mCount;

        private void recordWithNative() {
            RecordUserAction.record(this.mHistogramName);
        }

        /* access modifiers changed from: protected */
        public void commitAndClear() {
            while (this.mCount > 0) {
                recordWithNative();
                this.mCount--;
            }
        }

        public void record() {
            if (LibraryLoader.isInitialized()) {
                recordWithNative();
            } else {
                this.mCount++;
            }
        }

        public ActionEvent(String str) {
            super(str);
        }
    }

    static abstract class CachedHistogram {
        public static final List<CachedHistogram> sEvents = new ArrayList();
        protected final String mHistogramName;

        /* access modifiers changed from: protected */
        public abstract void commitAndClear();

        protected CachedHistogram(String str) {
            this.mHistogramName = str;
            sEvents.add(this);
        }
    }

    public static class EnumeratedHistogramSample extends CachedHistogram {
        private final int mMaxValue;
        private final List<Integer> mSamples = new ArrayList();

        /* access modifiers changed from: protected */
        public void commitAndClear() {
            for (Integer intValue : this.mSamples) {
                recordWithNative(intValue.intValue());
            }
            this.mSamples.clear();
        }

        private void recordWithNative(int i) {
            RecordHistogram.recordEnumeratedHistogram(this.mHistogramName, i, this.mMaxValue);
        }

        public void record(int i) {
            if (LibraryLoader.isInitialized()) {
                recordWithNative(i);
            } else {
                this.mSamples.add(Integer.valueOf(i));
            }
        }

        public EnumeratedHistogramSample(String str, int i) {
            super(str);
            this.mMaxValue = i;
        }
    }

    public static class SparseHistogramSample extends CachedHistogram {
        private final List<Integer> mSamples = new ArrayList();

        /* access modifiers changed from: protected */
        public void commitAndClear() {
            for (Integer intValue : this.mSamples) {
                recordWithNative(intValue.intValue());
            }
            this.mSamples.clear();
        }

        private void recordWithNative(int i) {
            RecordHistogram.recordSparseSlowlyHistogram(this.mHistogramName, i);
        }

        public SparseHistogramSample(String str) {
            super(str);
        }

        public void record(int i) {
            if (LibraryLoader.isInitialized()) {
                recordWithNative(i);
            } else {
                this.mSamples.add(Integer.valueOf(i));
            }
        }
    }

    public static class TimesHistogramSample extends CachedHistogram {
        private final List<Long> mSamples = new ArrayList();
        private final TimeUnit mTimeUnit;

        /* access modifiers changed from: protected */
        public void commitAndClear() {
            for (Long longValue : this.mSamples) {
                recordWithNative(longValue.longValue());
            }
            this.mSamples.clear();
        }

        private void recordWithNative(long j) {
            RecordHistogram.recordTimesHistogram(this.mHistogramName, j, this.mTimeUnit);
        }

        public void record(long j) {
            if (LibraryLoader.isInitialized()) {
                recordWithNative(j);
            } else {
                this.mSamples.add(Long.valueOf(j));
            }
        }

        public TimesHistogramSample(String str, TimeUnit timeUnit) {
            super(str);
            this.mTimeUnit = timeUnit;
        }
    }

    public static void commitCachedMetrics() {
        for (CachedHistogram commitAndClear : CachedHistogram.sEvents) {
            commitAndClear.commitAndClear();
        }
    }
}

package com.ttnet.org.chromium.base.metrics;

import com.p280ss.android.ugc.aweme.feed.monitor.C28539a;
import com.ttnet.org.chromium.base.library_loader.LibraryLoader;
import java.util.ArrayList;
import java.util.List;

public class CachedMetrics {

    public static class ActionEvent extends CachedMetric {
        private int mCount;

        private void recordWithNative() {
            RecordUserAction.record(this.mName);
        }

        /* access modifiers changed from: protected */
        public void commitAndClear() {
            while (this.mCount > 0) {
                recordWithNative();
                this.mCount--;
            }
        }

        public void record() {
            synchronized (CachedMetric.sMetrics) {
                if (LibraryLoader.getInstance().isInitialized()) {
                    recordWithNative();
                } else {
                    this.mCount++;
                    addToCache();
                }
            }
        }

        public ActionEvent(String str) {
            super(str);
        }
    }

    public static class BooleanHistogramSample extends CachedMetric {
        private final List<Boolean> mSamples = new ArrayList();

        /* access modifiers changed from: protected */
        public void commitAndClear() {
            for (Boolean booleanValue : this.mSamples) {
                recordWithNative(booleanValue.booleanValue());
            }
            this.mSamples.clear();
        }

        private void recordWithNative(boolean z) {
            RecordHistogram.recordBooleanHistogram(this.mName, z);
        }

        public BooleanHistogramSample(String str) {
            super(str);
        }

        public void record(boolean z) {
            synchronized (CachedMetric.sMetrics) {
                if (LibraryLoader.getInstance().isInitialized()) {
                    recordWithNative(z);
                } else {
                    this.mSamples.add(Boolean.valueOf(z));
                    addToCache();
                }
            }
        }
    }

    static abstract class CachedMetric {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        public static final List<CachedMetric> sMetrics = new ArrayList();
        protected boolean mCached;
        protected final String mName;

        /* access modifiers changed from: protected */
        public abstract void commitAndClear();

        static {
            Class<CachedMetrics> cls = CachedMetrics.class;
        }

        /* access modifiers changed from: protected */
        public final void addToCache() {
            if (!this.mCached) {
                sMetrics.add(this);
                this.mCached = true;
            }
        }

        protected CachedMetric(String str) {
            this.mName = str;
        }
    }

    public static class Count1000HistogramSample extends CustomCountHistogramSample {
        public Count1000HistogramSample(String str) {
            super(str, 1, 1000, 50);
        }
    }

    public static class Count100HistogramSample extends CustomCountHistogramSample {
        public Count100HistogramSample(String str) {
            super(str, 1, 100, 50);
        }
    }

    public static class Count1MHistogramSample extends CustomCountHistogramSample {
        public Count1MHistogramSample(String str) {
            super(str, 1, C28539a.f75176k, 50);
        }
    }

    public static class CustomCountHistogramSample extends CachedMetric {
        private final int mMax;
        private final int mMin;
        private final int mNumBuckets;
        private final List<Integer> mSamples = new ArrayList();

        /* access modifiers changed from: protected */
        public void commitAndClear() {
            for (Integer intValue : this.mSamples) {
                recordWithNative(intValue.intValue());
            }
            this.mSamples.clear();
        }

        private void recordWithNative(int i) {
            RecordHistogram.recordCustomCountHistogram(this.mName, i, this.mMin, this.mMax, this.mNumBuckets);
        }

        public void record(int i) {
            synchronized (CachedMetric.sMetrics) {
                if (LibraryLoader.getInstance().isInitialized()) {
                    recordWithNative(i);
                } else {
                    this.mSamples.add(Integer.valueOf(i));
                    addToCache();
                }
            }
        }

        public CustomCountHistogramSample(String str, int i, int i2, int i3) {
            super(str);
            this.mMin = i;
            this.mMax = i2;
            this.mNumBuckets = i3;
        }
    }

    public static class EnumeratedHistogramSample extends CachedMetric {
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
            RecordHistogram.recordEnumeratedHistogram(this.mName, i, this.mMaxValue);
        }

        public void record(int i) {
            synchronized (CachedMetric.sMetrics) {
                if (LibraryLoader.getInstance().isInitialized()) {
                    recordWithNative(i);
                } else {
                    this.mSamples.add(Integer.valueOf(i));
                    addToCache();
                }
            }
        }

        public EnumeratedHistogramSample(String str, int i) {
            super(str);
            this.mMaxValue = i;
        }
    }

    public static class MediumTimesHistogramSample extends TimesHistogramSample {
        public MediumTimesHistogramSample(String str) {
            super(str);
        }

        /* access modifiers changed from: protected */
        public void recordWithNative(long j) {
            RecordHistogram.recordMediumTimesHistogram(this.mName, j);
        }
    }

    public static class SparseHistogramSample extends CachedMetric {
        private final List<Integer> mSamples = new ArrayList();

        /* access modifiers changed from: protected */
        public void commitAndClear() {
            for (Integer intValue : this.mSamples) {
                recordWithNative(intValue.intValue());
            }
            this.mSamples.clear();
        }

        private void recordWithNative(int i) {
            RecordHistogram.recordSparseHistogram(this.mName, i);
        }

        public SparseHistogramSample(String str) {
            super(str);
        }

        public void record(int i) {
            synchronized (CachedMetric.sMetrics) {
                if (LibraryLoader.getInstance().isInitialized()) {
                    recordWithNative(i);
                } else {
                    this.mSamples.add(Integer.valueOf(i));
                    addToCache();
                }
            }
        }
    }

    public static class TimesHistogramSample extends CachedMetric {
        private final List<Long> mSamples = new ArrayList();

        /* access modifiers changed from: protected */
        public void commitAndClear() {
            for (Long longValue : this.mSamples) {
                recordWithNative(longValue.longValue());
            }
            this.mSamples.clear();
        }

        /* access modifiers changed from: protected */
        public void recordWithNative(long j) {
            RecordHistogram.recordTimesHistogram(this.mName, j);
        }

        public TimesHistogramSample(String str) {
            super(str);
        }

        public void record(long j) {
            synchronized (CachedMetric.sMetrics) {
                if (LibraryLoader.getInstance().isInitialized()) {
                    recordWithNative(j);
                } else {
                    this.mSamples.add(Long.valueOf(j));
                    addToCache();
                }
            }
        }
    }

    public static void commitCachedMetrics() {
        synchronized (CachedMetric.sMetrics) {
            for (CachedMetric commitAndClear : CachedMetric.sMetrics) {
                commitAndClear.commitAndClear();
            }
        }
    }
}

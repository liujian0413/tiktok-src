package com.p280ss.avframework.livestreamv2.interact.statistic;

/* renamed from: com.ss.avframework.livestreamv2.interact.statistic.RenderVideoFpsStatistics */
public class RenderVideoFpsStatistics {
    private int mInteractId;
    private long mRenderFrame;
    private long mStartTimestamp;

    /* renamed from: com.ss.avframework.livestreamv2.interact.statistic.RenderVideoFpsStatistics$RenderVideoFpsStatisticsReport */
    public class RenderVideoFpsStatisticsReport {
        private int mFps;
        private int mInteractId;
        private long mSamplingTime;

        public int getFps() {
            return this.mFps;
        }

        public int getInteractId() {
            return this.mInteractId;
        }

        public long getSamplingTime() {
            return this.mSamplingTime;
        }

        RenderVideoFpsStatisticsReport(int i, int i2, long j) {
            this.mInteractId = i;
            this.mFps = i2;
            this.mSamplingTime = j;
        }
    }

    public void rendVideoFrame() {
        if (this.mStartTimestamp == 0) {
            this.mStartTimestamp = System.currentTimeMillis();
        }
        this.mRenderFrame++;
    }

    public RenderVideoFpsStatisticsReport getAvgRenderFps() {
        long currentTimeMillis = System.currentTimeMillis() - this.mStartTimestamp;
        this.mStartTimestamp = System.currentTimeMillis();
        int i = (int) ((this.mRenderFrame * 1000) / currentTimeMillis);
        this.mRenderFrame = 0;
        RenderVideoFpsStatisticsReport renderVideoFpsStatisticsReport = new RenderVideoFpsStatisticsReport(this.mInteractId, i, currentTimeMillis);
        return renderVideoFpsStatisticsReport;
    }

    public RenderVideoFpsStatistics(int i) {
        this.mInteractId = i;
    }
}

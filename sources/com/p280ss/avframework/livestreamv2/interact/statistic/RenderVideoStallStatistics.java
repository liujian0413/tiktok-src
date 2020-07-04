package com.p280ss.avframework.livestreamv2.interact.statistic;

import android.os.Handler;

/* renamed from: com.ss.avframework.livestreamv2.interact.statistic.RenderVideoStallStatistics */
public class RenderVideoStallStatistics {
    private IRenderVideoStallCallback mCallback;
    private long mCurrentTimeStamp;
    private Handler mHandler;
    private boolean mHasReceivedFrame;
    private int mInteractId;
    private boolean mIsStart;
    private long mLastTimeStamp;
    private Runnable mRepeatCheckRenderVideoStall;

    /* renamed from: com.ss.avframework.livestreamv2.interact.statistic.RenderVideoStallStatistics$IRenderVideoStallCallback */
    public interface IRenderVideoStallCallback {
        void onRenderVideoStall(String str, int i);
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void lambda$startStatistics$0$RenderVideoStallStatistics() {
        rendVideoFrameInternal();
        if (this.mIsStart && this.mHandler != null) {
            this.mHandler.postDelayed(this.mRepeatCheckRenderVideoStall, 2000);
        }
    }

    public void rendVideoFrame() {
        if (!this.mHasReceivedFrame) {
            this.mHasReceivedFrame = true;
            this.mCurrentTimeStamp = System.currentTimeMillis();
            this.mLastTimeStamp = this.mCurrentTimeStamp;
        }
        rendVideoFrameInternal();
    }

    public synchronized void startStatistics() {
        this.mIsStart = true;
        this.mRepeatCheckRenderVideoStall = new RenderVideoStallStatistics$$Lambda$0(this);
        this.mRepeatCheckRenderVideoStall.run();
    }

    public synchronized void stopStatistics() {
        this.mIsStart = false;
        if (this.mHandler != null) {
            this.mHandler.removeCallbacks(this.mRepeatCheckRenderVideoStall);
        }
    }

    private synchronized void rendVideoFrameInternal() {
        if (this.mHasReceivedFrame) {
            this.mCurrentTimeStamp = System.currentTimeMillis();
            long j = this.mCurrentTimeStamp - this.mLastTimeStamp;
            if (j > 500 && this.mCallback != null) {
                this.mCallback.onRenderVideoStall(String.valueOf(this.mInteractId), (int) j);
            }
            this.mLastTimeStamp = this.mCurrentTimeStamp;
        }
    }

    public RenderVideoStallStatistics(int i, IRenderVideoStallCallback iRenderVideoStallCallback, Handler handler) {
        this.mInteractId = i;
        this.mCallback = iRenderVideoStallCallback;
        this.mHandler = handler;
    }
}

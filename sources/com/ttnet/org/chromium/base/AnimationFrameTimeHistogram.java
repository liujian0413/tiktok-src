package com.ttnet.org.chromium.base;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeAnimator;
import android.animation.TimeAnimator.TimeListener;

public class AnimationFrameTimeHistogram {
    private final String mHistogramName;
    private final Recorder mRecorder = new Recorder();

    interface Natives {
        void saveHistogram(String str, long[] jArr, int i);
    }

    static class Recorder implements TimeListener {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final TimeAnimator mAnimator;
        private int mFrameTimesCount;
        private long[] mFrameTimesMs;

        static {
            Class<AnimationFrameTimeHistogram> cls = AnimationFrameTimeHistogram.class;
        }

        public void cleanUp() {
            this.mFrameTimesMs = null;
        }

        public int getFrameTimesCount() {
            return this.mFrameTimesCount;
        }

        public long[] getFrameTimesMs() {
            return this.mFrameTimesMs;
        }

        private Recorder() {
            this.mAnimator = new TimeAnimator();
            this.mAnimator.setTimeListener(this);
        }

        public boolean endRecording() {
            boolean isStarted = this.mAnimator.isStarted();
            this.mAnimator.end();
            return isStarted;
        }

        public void startRecording() {
            this.mFrameTimesCount = 0;
            this.mFrameTimesMs = new long[600];
            this.mAnimator.start();
        }

        public void onTimeUpdate(TimeAnimator timeAnimator, long j, long j2) {
            if (this.mFrameTimesCount == this.mFrameTimesMs.length) {
                this.mAnimator.end();
                cleanUp();
                return;
            }
            if (j2 > 0) {
                long[] jArr = this.mFrameTimesMs;
                int i = this.mFrameTimesCount;
                this.mFrameTimesCount = i + 1;
                jArr[i] = j2;
            }
        }
    }

    public void startRecording() {
        this.mRecorder.startRecording();
    }

    public void endRecording() {
        if (this.mRecorder.endRecording()) {
            AnimationFrameTimeHistogramJni.get().saveHistogram(this.mHistogramName, this.mRecorder.getFrameTimesMs(), this.mRecorder.getFrameTimesCount());
        }
        this.mRecorder.cleanUp();
    }

    public static AnimatorListener getAnimatorRecorder(final String str) {
        return new AnimatorListenerAdapter() {
            private final AnimationFrameTimeHistogram mAnimationFrameTimeHistogram = new AnimationFrameTimeHistogram(str);

            public void onAnimationCancel(Animator animator) {
                this.mAnimationFrameTimeHistogram.endRecording();
            }

            public void onAnimationEnd(Animator animator) {
                this.mAnimationFrameTimeHistogram.endRecording();
            }

            public void onAnimationStart(Animator animator) {
                this.mAnimationFrameTimeHistogram.startRecording();
            }
        };
    }

    public AnimationFrameTimeHistogram(String str) {
        this.mHistogramName = str;
    }
}

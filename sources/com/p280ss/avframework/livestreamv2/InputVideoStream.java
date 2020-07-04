package com.p280ss.avframework.livestreamv2;

import android.os.Handler;
import com.p280ss.avframework.capture.video.ExternalVideoCapturer;
import com.p280ss.avframework.capture.video.VideoCapturer.VideoCapturerObserver;
import com.p280ss.avframework.engine.MediaEngineFactory;
import com.p280ss.avframework.engine.VideoTrack;
import com.p280ss.avframework.mixer.VideoMixer.VideoMixerDescription;
import com.p280ss.avframework.utils.AVLog;
import java.nio.ByteBuffer;

/* renamed from: com.ss.avframework.livestreamv2.InputVideoStream */
class InputVideoStream implements VideoCapturerObserver, IInputVideoStream {
    private ExternalVideoCapturer mExternalVideoCapturer;
    private int mFps;
    private Handler mHandler;
    private int mHeight;
    private Observer mObserver;
    private boolean mReportFirstFrame = true;
    private VideoMixerDescription mVideoMixerDescription;
    private VideoTrack mVideoTrack;
    private int mWidth;

    /* renamed from: com.ss.avframework.livestreamv2.InputVideoStream$Observer */
    public interface Observer {
        void onMixerDescriptionChange(InputVideoStream inputVideoStream, VideoMixerDescription videoMixerDescription);

        void releaseInputStream(InputVideoStream inputVideoStream);
    }

    public int fps() {
        return this.mFps;
    }

    public int getHeight() {
        return this.mHeight;
    }

    public VideoMixerDescription getMixerDescription() {
        return this.mVideoMixerDescription;
    }

    public VideoTrack getVideoTrack() {
        return this.mVideoTrack;
    }

    public int getWidth() {
        return this.mWidth;
    }

    public void onVideoCapturerError(int i, Exception exc) {
    }

    public void onVideoCapturerStarted() {
    }

    public void onVideoCapturerStoped() {
    }

    public String name() {
        if (this.mVideoTrack != null) {
            return this.mVideoTrack.mo109133id();
        }
        return "";
    }

    public int stop() {
        if (this.mExternalVideoCapturer != null) {
            this.mExternalVideoCapturer.stop();
        }
        return 0;
    }

    public int start() {
        if (this.mExternalVideoCapturer != null) {
            this.mExternalVideoCapturer.start(this.mWidth, this.mHeight, this.mFps);
        }
        return 0;
    }

    public synchronized void release() {
        if (this.mObserver != null) {
            this.mObserver.releaseInputStream(this);
        }
        if (this.mExternalVideoCapturer != null) {
            this.mExternalVideoCapturer.release();
            this.mExternalVideoCapturer = null;
        }
        if (this.mVideoTrack != null) {
            this.mVideoTrack.release();
            this.mVideoTrack = null;
        }
    }

    public void setMixerDescription(VideoMixerDescription videoMixerDescription) {
        if (videoMixerDescription != null) {
            this.mVideoMixerDescription.copy(videoMixerDescription);
            if (this.mObserver != null) {
                this.mObserver.onMixerDescriptionChange(this, videoMixerDescription);
            }
        }
    }

    public int pushVideoFrame(ByteBuffer byteBuffer, int i, int i2, int i3, long j) {
        if (this.mExternalVideoCapturer != null) {
            return this.mExternalVideoCapturer.pushVideoFrame(byteBuffer, i, i2, i3, j);
        }
        return -1;
    }

    public InputVideoStream(MediaEngineFactory mediaEngineFactory, Handler handler, Observer observer, int i, int i2, int i3) {
        this.mExternalVideoCapturer = new ExternalVideoCapturer(this, handler);
        this.mVideoTrack = mediaEngineFactory.createVideoTrack(this.mExternalVideoCapturer);
        this.mObserver = observer;
        this.mFps = i3;
        this.mWidth = i;
        this.mHeight = i2;
        this.mHandler = handler;
        this.mVideoMixerDescription = new VideoMixerDescription();
    }

    public int pushVideoFrame(int i, boolean z, int i2, int i3, int i4, float[] fArr, long j) {
        int i5 = i2;
        int i6 = i3;
        if (this.mReportFirstFrame) {
            this.mExternalVideoCapturer.adaptOutputFormat(i2, i3, this.mFps);
            this.mReportFirstFrame = false;
            StringBuilder sb = new StringBuilder("Report first video frame at ");
            sb.append(i2);
            sb.append("x");
            sb.append(i3);
            sb.append(" timestamp ");
            sb.append(j);
            AVLog.iod("InputVideoStream", sb.toString());
        } else {
            long j2 = j;
        }
        if (this.mExternalVideoCapturer != null) {
            return this.mExternalVideoCapturer.pushVideoFrame(i, z, i2, i3, i4, fArr, j, null);
        }
        return -1;
    }
}

package com.p280ss.avframework.livestreamv2.core;

import android.content.res.AssetManager;
import android.os.Bundle;
import android.os.Handler;
import android.view.SurfaceView;
import com.p280ss.avframework.livestreamv2.LiveStreamBuilder;
import com.p280ss.avframework.livestreamv2.capture.LiveStreamVideoCapture.Observer;
import com.p280ss.avframework.livestreamv2.control.IVideoCapturerControl;
import com.p280ss.avframework.livestreamv2.control.IVideoCapturerControl.Range;
import com.p280ss.avframework.livestreamv2.filter.IFilterManager;
import com.p280ss.avframework.livestreamv2.filter.IFilterManager.EffectMsgListener;
import com.p280ss.avframework.livestreamv2.filter.IFilterManager.ErrorListener;
import com.p280ss.avframework.livestreamv2.filter.IFilterManager.FaceDetectListener;
import com.p280ss.avframework.livestreamv2.filter.IFilterManager.MicrophoneDetectListener;
import javax.microedition.khronos.egl.EGLContext;

/* renamed from: com.ss.avframework.livestreamv2.core.EffectCameraWrapper */
public abstract class EffectCameraWrapper implements IVideoCapturerControl, IFilterManager {

    /* renamed from: com.ss.avframework.livestreamv2.core.EffectCameraWrapper$FrameListener */
    public interface FrameListener {
        void onFrameAvailable(EGLContext eGLContext, int i, int i2, int i3, int i4, long j, Bundle bundle);
    }

    public abstract void enableMirror(boolean z, boolean z2);

    public abstract void setSurface(SurfaceView surfaceView);

    public abstract void startCapture();

    public abstract void stopCapture();

    public abstract void switchCamera();

    private static EffectCameraWrapper CreateDummy() {
        return new EffectCameraWrapper() {
            public final void cancelAudioFocus() {
            }

            public final int composerAppendNodes(String[] strArr) {
                return 0;
            }

            public final int composerReloadNodes(String[] strArr, int i) {
                return 0;
            }

            public final int composerRemoveNodes(String[] strArr) {
                return 0;
            }

            public final int composerSetMode(int i, int i2) {
                return 0;
            }

            public final int composerSetNodes(String[] strArr, int i) {
                return 0;
            }

            public final int composerUpdateNode(String str, String str2, float f) {
                return 0;
            }

            public final void configEffect(int i, int i2, String str, String str2, boolean z) {
            }

            public final void configEffect(int i, int i2, String str, String str2, boolean z, AssetManager assetManager) {
            }

            public final void configEffect(int i, int i2, String str, String str2, boolean z, Object obj) {
            }

            public final boolean currentSupportISPControl() {
                return false;
            }

            public final void enable(boolean z) {
            }

            public final void enableMirror(boolean z, boolean z2) {
            }

            public final int enableMockFace(boolean z) {
                return 0;
            }

            public final void enableRoi(boolean z) {
            }

            public final void forceOutput2DTex(boolean z) {
            }

            public final String getEffectVersion() {
                return null;
            }

            public final Range getExposureCompensationRange() {
                return null;
            }

            public final String getVersion() {
                return null;
            }

            public final boolean isEnable() {
                return false;
            }

            public final boolean isValid() {
                return false;
            }

            public final String name() {
                return null;
            }

            public final int pauseEffect() {
                return 0;
            }

            public final void processDoubleClickEvent(float f, float f2) {
            }

            public final void processLongPressEvent(float f, float f2) {
            }

            public final void processPanEvent(float f, float f2, float f3, float f4, float f5) {
            }

            public final void processRotationEvent(float f, float f2) {
            }

            public final void processScaleEvent(float f, float f2) {
            }

            public final void processTouchDownEvent(float f, float f2, int i) {
            }

            public final void processTouchEvent(float f, float f2) {
            }

            public final void processTouchUpEvent(float f, float f2, int i) {
            }

            public final void release() {
            }

            public final int resumeEffect() {
                return 0;
            }

            public final int sendEffectMsg(int i, int i2, int i3, String str) {
                return 0;
            }

            public final int setBeautify(String str, float f, float f2) {
                return 0;
            }

            public final int setBeautify(String str, float f, float f2, float f3) {
                return 0;
            }

            public final int setCustomEffect(String str, String str2) {
                return 0;
            }

            public final int setEffect(String str) {
                return 0;
            }

            public final int setEffect(String str, boolean z) {
                return 0;
            }

            public final void setEffectAlgorithmAB(boolean z) {
            }

            public final void setEffectMsgListener(EffectMsgListener effectMsgListener) {
            }

            public final void setErrorListener(ErrorListener errorListener) {
            }

            public final int setExposureCompensation(float f) {
                return 0;
            }

            public final int setFaceAttribute(boolean z) {
                return 0;
            }

            public final void setFaceDetectListener(FaceDetectListener faceDetectListener) {
            }

            public final int setFilter(String str, float f) {
                return 0;
            }

            public final int setFilter(String str, String str2, float f) {
                return 0;
            }

            public final int setFocusAreas(int i, int i2, int i3, int i4) {
                return 0;
            }

            public final void setMicrophoneDetectListener(MicrophoneDetectListener microphoneDetectListener) {
            }

            public final int setReshape(String str, float f, float f2) {
                return 0;
            }

            public final void setSurface(SurfaceView surfaceView) {
            }

            public final void startCapture() {
            }

            public final int startEffectAudio() {
                return 0;
            }

            public final void stopCapture() {
            }

            public final int stopEffectAudio() {
                return 0;
            }

            public final void switchCamera() {
            }

            public final int toggleFlashLight(boolean z) {
                return 0;
            }
        };
    }

    public static EffectCameraWrapper Create(LiveStreamBuilder liveStreamBuilder, Handler handler, Handler handler2, Observer observer, FrameListener frameListener) {
        try {
            return (EffectCameraWrapper) Class.forName("com.ss.avframework.livestreamv2.core.EffectCameraWrapperImpl").getConstructor(new Class[]{LiveStreamBuilder.class, Handler.class, Handler.class, Observer.class, FrameListener.class}).newInstance(new Object[]{liveStreamBuilder, handler, handler2, observer, frameListener});
        } catch (Exception unused) {
            return CreateDummy();
        }
    }
}

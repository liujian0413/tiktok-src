package com.p280ss.android.ttve.nativePort;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.Surface;
import com.p280ss.android.vesdk.C45250aa;
import com.p280ss.android.vesdk.C45255af;
import com.p280ss.android.vesdk.C45372t;
import com.p280ss.android.vesdk.ROTATE_DEGREE;
import com.p280ss.android.vesdk.VEEffectParams;
import com.p280ss.android.vesdk.VEException;
import com.p280ss.android.vesdk.VEGestureType;
import com.p280ss.android.vesdk.VEListener.VEEditorEffectListener;
import com.p280ss.android.vesdk.VEListener.VEInfoStickerBufferListener;
import com.p280ss.android.vesdk.VEMusicSRTEffectParam;
import com.p280ss.android.vesdk.VEStickerAnimator;
import com.p280ss.android.vesdk.VEWaterMarkPosition;
import com.p280ss.android.vesdk.VEWatermarkParam;
import com.p280ss.android.vesdk.VEWatermarkParam.VEWatermarkMask;
import com.p280ss.android.vesdk.clipparam.VEClipAlgorithmParam;
import com.p280ss.android.vesdk.clipparam.VEClipSourceParam;
import com.p280ss.android.vesdk.clipparam.VEClipTimelineParam;
import com.p280ss.android.vesdk.filterparam.VEAmazingFilterParam;
import com.p280ss.android.vesdk.filterparam.VEAudioEffectFilterParam;
import com.p280ss.android.vesdk.filterparam.VEAudioFadeFilterParam;
import com.p280ss.android.vesdk.filterparam.VEAudioVolumeFilterParam;
import com.p280ss.android.vesdk.filterparam.VEBaseAudioFilterParam;
import com.p280ss.android.vesdk.filterparam.VEBaseFilterParam;
import com.p280ss.android.vesdk.filterparam.VEBeautyFilterParam;
import com.p280ss.android.vesdk.filterparam.VECanvasFilterParam;
import com.p280ss.android.vesdk.filterparam.VEColorFilterParam;
import com.p280ss.android.vesdk.filterparam.VEComposerFilterParam;
import com.p280ss.android.vesdk.filterparam.VEEffectFilterParam;
import com.p280ss.android.vesdk.filterparam.VEImageAddFilterParam;
import com.p280ss.android.vesdk.filterparam.VEImageTransformFilterParam;
import com.p280ss.android.vesdk.filterparam.VEReshapeFilterParam;
import com.p280ss.android.vesdk.filterparam.VETransitionFilterParam;
import com.p280ss.android.vesdk.filterparam.VEVideoAjustmentFilterParam;
import com.p280ss.android.vesdk.filterparam.VEVideoCropFilterParam;
import com.p280ss.android.vesdk.filterparam.VEVideoTransformFilterParam;
import com.p280ss.android.vesdk.runtime.VERuntime;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.ss.android.ttve.nativePort.TEInterface */
public final class TEInterface extends TENativeServiceBase {
    private static final int OPTION_UPDATE_ANYTIME = 1;
    private static final int OPTION_UPDATE_BEFORE_PREPARE = 0;
    private static final String TAG = "TEInterface";
    private int mHostTrackIndex = -1;
    private long mNative;

    static {
        TENativeLibsLoader.m67986c();
    }

    private native int nativeAddAudioTrack(long j, String str, int i, int i2, int i3, int i4, boolean z);

    private native int nativeAddAudioTrack2(long j, String str, int i, int i2, int i3, int i4, boolean z, int i5, int i6);

    private native int nativeAddAudioTrackMV(long j, String str, int i, int i2, int i3, int i4, int i5, boolean z);

    private native int nativeAddExternalTrack(long j, String[] strArr, String[] strArr2, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, double d, double d2, double d3, double d4, int i, int i2);

    private native int nativeAddExternalTrackMV(long j, String[] strArr, String[] strArr2, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, double d, double d2, double d3, double d4, int i, int i2);

    private native int nativeAddExternalVideoTrack(long j, String[] strArr, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int i);

    private native int[] nativeAddFilters(long j, int[] iArr, String[] strArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, int[] iArr6);

    private native int nativeAddInfoSticker(long j, String str, String[] strArr);

    private native int nativeAddInfoStickerWithBuffer(long j);

    private native void nativeAddMetaData(long j, String str, String str2);

    private native int nativeAddVideoTrack(long j, String[] strArr, String[] strArr2, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, int i);

    private native int nativeAddVidoeClipWithAlgorithm(long j, String[] strArr);

    private native int nativeAdjustFilterInOut(long j, int i, int i2, int i3);

    private native int nativeAppendComposerNodes(long j, String[] strArr);

    private native int nativeBegin2DBrush(long j);

    private native int nativeBeginInfoStickerPin(long j, int i);

    private native int nativeCancelGetImages(long j);

    private native int nativeCancelInfoStickerPin(long j, int i);

    private native int nativeChangeTransitonAt(long j, int i, VETransitionFilterParam vETransitionFilterParam);

    private native int nativeCheckScoresFile(long j, String str);

    private native void nativeClearDisplay(long j, int i);

    private native int nativeClearFilter(long j);

    private native int nativeControlInfoStickerAnimationPreview(long j, boolean z, int i, int i2);

    private native int nativeCreateCanvasScene(long j, String[] strArr, int[] iArr, int[] iArr2, String[] strArr2, int[] iArr3, int[] iArr4, String[] strArr3, int[] iArr5, int[] iArr6, String[][] strArr4, float[] fArr, int i);

    private native long nativeCreateEngine();

    private native int nativeCreateImageScene(long j, Bitmap[] bitmapArr, int[] iArr, int[] iArr2, String[] strArr, int[] iArr3, int[] iArr4, String[] strArr2, String[][] strArr3, float[] fArr, int[] iArr5, int i);

    private native int nativeCreateScene(long j, String str, String[] strArr, String[] strArr2, String[] strArr3, String[][] strArr4, int i);

    private native int nativeCreateScene2(long j, String[] strArr, int[] iArr, int[] iArr2, String[] strArr2, int[] iArr3, int[] iArr4, String[] strArr3, String[][] strArr4, float[] fArr, float[] fArr2, int[] iArr5, int i);

    private native int nativeCreateSceneMV(long j, String[] strArr, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, String[] strArr2, int[] iArr5, int[] iArr6, int[] iArr7, int[] iArr8, int[] iArr9, String[] strArr3, String[][] strArr4, float[] fArr, int i);

    private native int nativeCreateSceneWithAlgorithm(long j, String[] strArr, int i);

    private native int nativeCreateTimeline(long j);

    private native int nativeDeleteAudioTrack(long j, int i, boolean z);

    private native int nativeDeleteClip(long j, int i, int i2);

    private native int nativeDeleteExternalTrack(long j, int i);

    private native int nativeDeleteExternalVideoTrack(long j, int i);

    private native int nativeDeleteVideoClipWithAlgorithm(long j, int i);

    private native int nativeDestroyEngine(long j);

    private native int nativeEnableEffect(long j, boolean z);

    private native int nativeEnableEffectAmazing(long j, boolean z);

    private static native int nativeEnableEffectCanvas(boolean z);

    private static native int nativeEnableEffectTransiton(boolean z);

    private native int nativeEnableFaceDetect(long j, boolean z);

    private static native int nativeEnableHighSpeed(boolean z);

    private native int nativeEnableImageEditor(long j, boolean z);

    private native int nativeEnd2DBrush(long j, String str);

    private native int nativeExpandTimeline(long j, int i);

    private native int nativeGenAISolve(long j);

    private native int nativeGenRandomSolve(long j);

    private native int nativeGet2DBrushStrokeCount(long j);

    private native List<VEClipAlgorithmParam> nativeGetAllVideoRangeData(long j);

    private native byte[] nativeGetAudioCommonFilterPreprocessResult(long j, long j2);

    private native String nativeGetClipPath(long j, int i);

    private native long nativeGetClipSequenceOut(long j, int i, int i2, int i3);

    private native float nativeGetColorFilterIntensity(long j, String str);

    private native int nativeGetCurPosition(long j);

    private native int nativeGetCurState(long j);

    private native int[] nativeGetDecodeDumpSize(long j, int i, int i2);

    private native int nativeGetDecodeImage(long j, byte[] bArr, int i, int i2);

    private native int[] nativeGetDisplayDumpSize(long j);

    private native int nativeGetDisplayImage(long j, Bitmap bitmap);

    private native int nativeGetDuration(long j);

    private native long nativeGetDurationUs(long j);

    private native int nativeGetExternalTrackFilter(long j, int i);

    private native int nativeGetImages(long j, int[] iArr, int i, int i2, int i3);

    private native float[] nativeGetInfoStickerBoundingBox(long j, int i);

    private native float[] nativeGetInfoStickerBoundingBoxWithoutRotate(long j, int i);

    private native int nativeGetInfoStickerFlip(long j, int i, boolean[] zArr);

    private native int nativeGetInfoStickerPinData(long j, int i, ByteBuffer[] byteBufferArr);

    private native int nativeGetInfoStickerPinState(long j, int i);

    private native int nativeGetInfoStickerPosition(long j, int i, float[] fArr);

    private native float nativeGetInfoStickerRotate(long j, int i);

    private native float nativeGetInfoStickerScale(long j, int i);

    private native boolean nativeGetInfoStickerVisible(long j, int i);

    private native int[] nativeGetInitResolution(long j);

    private native Object nativeGetMVOriginalBackgroundAudio(long j);

    private native String nativeGetMetaData(long j, String str);

    private native int nativeGetProcessedImage(long j, Bitmap bitmap);

    private native int nativeGetRuntimeGLVersion(long j);

    private native Object nativeGetServerAlgorithmConfig(long j);

    private native int nativeGetSrtInfoStickerInitPosition(long j, int i, float[] fArr);

    private native float nativeGetTrackVolume(long j, int i, int i2, int i3);

    private native Object nativeInitMVResources(long j, String str, String[] strArr, String[] strArr2, String str2, int i, int i2, boolean z, boolean z2);

    private native int nativeInsertClip(long j, int i, int i2, VEClipSourceParam vEClipSourceParam, VEClipTimelineParam vEClipTimelineParam);

    private native boolean nativeIsInfoStickerAnimatable(long j, int i);

    private native int nativeLockSeekVideoClip(long j, int i);

    private native int nativeMoveClip(long j, int i, int i2, int i3);

    private native int nativeMoveVideoClipWithAlgorithm(long j, int i, int i2);

    private static native int nativeOpenEditorFpsLog(boolean z);

    private native int nativePause(long j);

    private native int nativePauseEffectAudio(long j, boolean z);

    private native int nativePauseInfoStickerAnimation(long j, boolean z);

    private native int nativePauseSync(long j);

    private native int nativePrepareEngine(long j, int i);

    private native int nativePreprocessAudioTrackForFilter(long j, int i, int i2, String str, byte[] bArr, long[] jArr);

    private native int nativeProcessBingoFrames(long j, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i, int i2, float f, String str);

    private native int nativeProcessLongPressEvent(long j, float f, float f2);

    private native int nativeProcessPanEvent(long j, float f, float f2, float f3, float f4, float f5);

    private native int nativeProcessRotationEvent(long j, float f, float f2);

    private native int nativeProcessScaleEvent(long j, float f, float f2);

    private native int nativeProcessTouchDownEvent(long j, float f, float f2, int i);

    private native int nativeProcessTouchEvent(long j, float f, float f2);

    private native int nativeProcessTouchMoveEvent(long j, float f, float f2);

    private native int nativeProcessTouchUpEvent(long j, float f, float f2, int i);

    private native int nativePushImageToBuffer(long j, String str);

    private native int nativeRefreshCurrentFrame(long j);

    private native int nativeReleaseEngine(long j);

    private native void nativeReleasePreviewSurface(long j);

    private native int nativeReloadComposerNodes(long j, String[] strArr);

    private native int nativeRemoveComposerNodes(long j, String[] strArr);

    private native int nativeRemoveEffectCallback(long j);

    private native int nativeRemoveFilter(long j, int[] iArr);

    private native int nativeRemoveInfoSticker(long j, int i);

    private native int nativeRemoveInfoStickerWithBuffer(long j, int i);

    private native int nativeRemoveMusic(long j, int i);

    private native int nativeReplaceClip(long j, int i, int i2, VEClipSourceParam vEClipSourceParam, VEClipTimelineParam vEClipTimelineParam);

    private native void nativeResetCallback(long j);

    private native int nativeRestore(long j, String str);

    private native int nativeRestoreInfoStickerPinWithJson(long j, int i, ByteBuffer byteBuffer, int i2);

    private native String nativeSave(long j);

    private native int nativeSeek(long j, int i, int i2, int i3, int i4);

    private native int nativeSeekWithTolerance(long j, int i, int i2, int i3, int i4, int i5);

    private native int nativeSet2DBrushCanvasColor(long j, float f);

    private native int nativeSet2DBrushColor(long j, float f, float f2, float f3, float f4);

    private native int nativeSet2DBrushSize(long j, float f);

    private native int nativeSetAIRotation(long j, int i, int i2);

    private native int nativeSetAlgorithmPreConfig(long j, int i, int i2);

    private native int nativeSetAlgorithmSyncAndNum(long j, boolean z, int i);

    private native void nativeSetBackGroundColor(long j, int i);

    private native int nativeSetClientState(long j, int i);

    private native int nativeSetClipAttr(long j, int i, int i2, int i3, String str, String str2);

    private native int nativeSetComposerMode(long j, int i, int i2);

    private native int nativeSetComposerNodes(long j, String[] strArr);

    private native int nativeSetDestroyVersion(long j, boolean z);

    private native void nativeSetDisplayState(long j, float f, float f2, float f3, float f4, int i, int i2, int i3);

    private native int nativeSetDldEnabled(long j, boolean z);

    private native int nativeSetDldThrVal(long j, int i);

    private native int nativeSetDleEnabled(long j, boolean z);

    private native int nativeSetDleEnabledPreview(long j, boolean z);

    private native int nativeSetEffectCacheInt(long j, String str, int i);

    private native int nativeSetEffectCallback(long j, VEEditorEffectListener vEEditorEffectListener);

    private native int nativeSetEffectFontPath(long j, String str, int i);

    private native int nativeSetEffectInputText(long j, String str, int i, int i2, String str2);

    private native int nativeSetEffectMaxMemoryCache(long j, int i);

    private native int nativeSetEffectParams(long j, VEEffectParams vEEffectParams);

    private native void nativeSetEnableMultipleAudioFilter(long j, boolean z);

    private native void nativeSetEnableRemuxVideo(long j, boolean z);

    private native void nativeSetEnableRemuxVideoForRotation(long j, boolean z, boolean z2);

    private native void nativeSetEncoderParallel(long j, boolean z);

    private native void nativeSetExpandLastFrame(long j, boolean z);

    private native int nativeSetExtTrackSeqIn(long j, int i, int i2, int i3);

    private native int nativeSetExternalAlgorithmResult(long j, String str, String str2, String str3);

    private native int nativeSetFilterParam(long j, int i, String str, VEMusicSRTEffectParam vEMusicSRTEffectParam);

    private native int nativeSetFilterParam(long j, int i, String str, VEStickerAnimator vEStickerAnimator);

    private native int nativeSetFilterParam(long j, int i, String str, VEEffectFilterParam vEEffectFilterParam);

    private native int nativeSetFilterParam(long j, int i, String str, String str2);

    private native int nativeSetFilterParam2(long j, int i, String str, byte[] bArr);

    private static native int nativeSetForceDropFrameWithoutAudio(boolean z);

    private static native int nativeSetImageBufferLimit(int i, int i2, int i3);

    private native int nativeSetInfoStickerAnimationParam(long j, int i, boolean z, String str, int i2, String str2, int i3, int i4);

    private native int nativeSetInfoStickerAnimationPreview(long j, int i, boolean z);

    private native int nativeSetInfoStickerBufferCallback(long j, VEInfoStickerBufferListener vEInfoStickerBufferListener);

    private native int nativeSetInfoStickerFlip(long j, int i, boolean z, boolean z2);

    private native int nativeSetInfoStickerRestoreMode(long j, int i);

    private native float nativeSetInfoStickerScale(long j, int i, float f);

    private static native int nativeSetInfoStickerTransEnable(boolean z);

    private native int nativeSetInterimScoresToFile(long j, String str);

    private native int nativeSetMaleMakeupState(long j, boolean z);

    private static native int nativeSetMaxAudioReaderCount(int i);

    private static native int nativeSetMaxSoftwareVideoReaderCount(int i, int i2, int i3, int i4);

    private native int nativeSetMusicAndResult(long j, int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, int i3, int i4);

    private native int nativeSetMusicCropRatio(long j, int i);

    private static native int nativeSetOptVersion(int i);

    private native void nativeSetOption(long j, int i, String str, float f);

    private native void nativeSetOption(long j, int i, String str, long j2);

    private native void nativeSetOption(long j, int i, String str, String str2);

    private native void nativeSetOptionArray(long j, int i, String[] strArr, long[] jArr);

    private native void nativeSetPreviewFps(long j, int i);

    private native int nativeSetPreviewScaleMode(long j, int i);

    private native void nativeSetPreviewSurface(long j, Surface surface);

    private static native int nativeSetRuntimeConfig(String str);

    private native void nativeSetSpeedRatio(long j, float f);

    private native void nativeSetSurfaceSize(long j, int i, int i2);

    private native int nativeSetTimeRange(long j, int i, int i2, int i3);

    private native int nativeSetTrackDurationType(long j, int i, int i2, int i3);

    private native int nativeSetTrackLayer(long j, int i, int i2, int i3);

    private native int nativeSetTrackMinMaxDuration(long j, int i, int i2, int i3, int i4);

    private native boolean nativeSetTrackVolume(long j, int i, int i2, float f);

    private native int nativeSetTransitionAt(long j, int i, long j2, String str);

    private native void nativeSetVideoBackGroundColor(long j, int i);

    private native void nativeSetViewPort(long j, int i, int i2, int i3, int i4);

    private native void nativeSetWaterMark(long j, ArrayList<String[]> arrayList, int i, int i2, int i3, int i4, int i5, long j2, int i6, VEWatermarkMask vEWatermarkMask);

    private native int nativeStart(long j);

    private native int nativeStartEffectMonitor(long j);

    private native int nativeStop(long j);

    private native int nativeStopEffectMonitor(long j);

    private native int nativeSwitchResourceLoadMode(long j, boolean z, int i);

    private native boolean nativeTestSerialization(long j);

    private native int nativeUndo2DBrush(long j);

    private native int nativeUpdateAlgorithmFromNormal(long j);

    private native int nativeUpdateAmazingFilterParam(long j, int i, int i2, VEAmazingFilterParam vEAmazingFilterParam);

    private native int nativeUpdateAudioEffectFilterParam(long j, int i, int i2, VEAudioEffectFilterParam vEAudioEffectFilterParam);

    private native int nativeUpdateAudioFadeFilterParam(long j, int i, int i2, VEAudioFadeFilterParam vEAudioFadeFilterParam);

    private native int nativeUpdateAudioTrack(long j, int i, int i2, int i3, int i4, int i5, boolean z);

    private native int nativeUpdateAudioTrack2(long j, int i, int i2, int i3, int i4, int i5, boolean z, int i6, int i7);

    private native int nativeUpdateAudioVolumeFilterParam(long j, int i, int i2, VEAudioVolumeFilterParam vEAudioVolumeFilterParam);

    private native int nativeUpdateBeautyFilterParam(long j, int i, int i2, VEBeautyFilterParam vEBeautyFilterParam);

    private native int nativeUpdateCanvasFilterParam(long j, int i, int i2, VECanvasFilterParam vECanvasFilterParam);

    private native int nativeUpdateClipsSourceParam(long j, int i, int i2, int[] iArr, VEClipSourceParam[] vEClipSourceParamArr);

    private native int nativeUpdateClipsTimelineParam(long j, int i, int i2, int[] iArr, VEClipTimelineParam[] vEClipTimelineParamArr);

    private native int nativeUpdateColorFilterParam(long j, int i, int i2, VEColorFilterParam vEColorFilterParam);

    private native int nativeUpdateComposerNode(long j, String str, String str2, float f);

    private native int nativeUpdateCropFilterParam(long j, int i, int i2, VEVideoCropFilterParam vEVideoCropFilterParam);

    private native int nativeUpdateEffectComposerParam(long j, int i, int i2, VEComposerFilterParam vEComposerFilterParam);

    private native int nativeUpdateEffectFilterParam(long j, int i, int i2, VEEffectFilterParam vEEffectFilterParam);

    private native int nativeUpdateFilterTime(long j, int i, int i2, int i3, int i4);

    private native int nativeUpdateImageAddFilterParam(long j, int i, int i2, VEImageAddFilterParam vEImageAddFilterParam);

    private native int nativeUpdateImageTransformFilterParam(long j, int i, int i2, VEImageTransformFilterParam vEImageTransformFilterParam);

    private native int nativeUpdateQualityFilterParam(long j, int i, int i2, VEVideoAjustmentFilterParam vEVideoAjustmentFilterParam);

    private native int nativeUpdateReshapeFilterParam(long j, int i, int i2, VEReshapeFilterParam vEReshapeFilterParam);

    private native int nativeUpdateScene(long j, String[] strArr, int[] iArr, int[] iArr2);

    private native int nativeUpdateSceneFileOrder(long j, int[] iArr);

    private native int nativeUpdateSceneTime(long j, boolean[] zArr, int[] iArr, int[] iArr2, int[] iArr3, double[] dArr);

    private native int nativeUpdateTextSticker(long j, int i, String str);

    private native int nativeUpdateTrackClip(long j, int i, int i2, String[] strArr);

    private native int nativeUpdateTrackFilter(long j, int i, int i2, boolean z);

    private native int nativeUpdateTrackFilterDuration(long j, int i, int i2, boolean z, long j2);

    private native int nativeUpdateVideoTransformFilterParam(long j, int i, int i2, VEVideoTransformFilterParam vEVideoTransformFilterParam);

    public final int getHostTrackIndex() {
        return this.mHostTrackIndex;
    }

    public final long getNativeHandler() {
        return this.mNative;
    }

    public final native int nativeSetAudioOffset(long j, int i, int i2);

    public final native String stringFromJNI();

    private TEInterface() {
    }

    public final int cancelGetImages() {
        return nativeCancelGetImages(this.mNative);
    }

    public final boolean testSerialization() {
        return nativeTestSerialization(this.mNative);
    }

    public final void releasePreviewSurface() {
        if (this.mNative != 0) {
            nativeReleasePreviewSurface(this.mNative);
        }
    }

    public final int addInfoStickerWithBuffer() {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeAddInfoStickerWithBuffer(this.mNative);
    }

    public final int begin2DBrush() {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeBegin2DBrush(this.mNative);
    }

    public final int clearFilter() {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeClearFilter(this.mNative);
    }

    public final int createTimeline() {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeCreateTimeline(this.mNative);
    }

    public final int destroyEngine() {
        if (this.mNative == 0) {
            return -112;
        }
        int nativeDestroyEngine = nativeDestroyEngine(this.mNative);
        this.mNative = 0;
        return nativeDestroyEngine;
    }

    public final int genAISolve() {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeGenAISolve(this.mNative);
    }

    public final int get2DBrushStrokeCount() {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeGet2DBrushStrokeCount(this.mNative);
    }

    public final List<VEClipAlgorithmParam> getAllVideoRangeData() {
        if (this.mNative == 0) {
            return null;
        }
        return nativeGetAllVideoRangeData(this.mNative);
    }

    public final int getCurPosition() {
        if (this.mNative == 0) {
            return -1;
        }
        return nativeGetCurPosition(this.mNative);
    }

    public final int getCurState() {
        if (this.mNative == 0) {
            return -1;
        }
        return nativeGetCurState(this.mNative);
    }

    public final int getDuration() {
        if (this.mNative == 0) {
            return -1;
        }
        return nativeGetDuration(this.mNative);
    }

    public final long getDurationUs() {
        if (this.mNative == 0) {
            return -1;
        }
        return nativeGetDurationUs(this.mNative);
    }

    public final Object getMVOriginalBackgroundAudio() {
        if (this.mNative != 0) {
            return nativeGetMVOriginalBackgroundAudio(this.mNative);
        }
        C45372t.m143409d(TAG, "getMVOriginalBackgroundAudio error, mNative == 0");
        return null;
    }

    public final int getRandomSolve() {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeGenRandomSolve(this.mNative);
    }

    public final int getRuntimeGLVersion() {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeGetRuntimeGLVersion(this.mNative);
    }

    public final Object getServerAlgorithmConfig() {
        if (this.mNative != 0) {
            return nativeGetServerAlgorithmConfig(this.mNative);
        }
        C45372t.m143409d(TAG, "getServerAlgorithmConfig error, mNative == 0");
        return null;
    }

    public final int pause() {
        if (this.mNative == 0) {
            return -112;
        }
        return nativePause(this.mNative);
    }

    public final int pauseSync() {
        if (this.mNative == 0) {
            return -112;
        }
        return nativePauseSync(this.mNative);
    }

    public final int refreshCurrentFrame() {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeRefreshCurrentFrame(this.mNative);
    }

    public final int releaseEngine() {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeReleaseEngine(this.mNative);
    }

    public final int removeEffectCallback() {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeRemoveEffectCallback(this.mNative);
    }

    public final String save() {
        if (this.mNative == 0) {
            return null;
        }
        String nativeSave = nativeSave(this.mNative);
        if (TextUtils.isEmpty(nativeSave)) {
            return null;
        }
        return nativeSave;
    }

    public final int start() {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeStart(this.mNative);
    }

    public final int startEffectMonitor() {
        if (this.mNative == 0) {
            return -112;
        }
        nativeStartEffectMonitor(this.mNative);
        return 0;
    }

    public final int stop() {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeStop(this.mNative);
    }

    public final int stopEffectMonitor() {
        if (this.mNative == 0) {
            return -112;
        }
        nativeStopEffectMonitor(this.mNative);
        return 0;
    }

    public final int undo2DBrush() {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeUndo2DBrush(this.mNative);
    }

    public final int updateAlgorithmFromNormal() {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeUpdateAlgorithmFromNormal(this.mNative);
    }

    public static TEInterface createEngine() {
        int i;
        TEInterface tEInterface = new TEInterface();
        if (VERuntime.m143285a().f116767f) {
            i = 3;
        } else {
            i = 2;
        }
        TEGLGlobalContext.nativeSetGLVersion(i);
        TEGLGlobalContext.nativeSetMaxRenderSize(VERuntime.m143285a().f116768g.f116385a, VERuntime.m143285a().f116768g.f116386b);
        long nativeCreateEngine = tEInterface.nativeCreateEngine();
        if (nativeCreateEngine == 0) {
            return null;
        }
        tEInterface.mNative = nativeCreateEngine;
        return tEInterface;
    }

    public final C45250aa getDisplayRect() {
        if (this.mNative == 0) {
            return new C45250aa(0, 0, 0, 0);
        }
        int[] nativeGetDisplayDumpSize = nativeGetDisplayDumpSize(this.mNative);
        return new C45250aa(nativeGetDisplayDumpSize[0], nativeGetDisplayDumpSize[1], nativeGetDisplayDumpSize[2], nativeGetDisplayDumpSize[3]);
    }

    public final int[] getInitResolution() {
        int[] iArr = {-1, -1, -1, -1};
        if (this.mNative == 0) {
            return iArr;
        }
        return nativeGetInitResolution(this.mNative);
    }

    public final void setHostTrackIndex(int i) {
        this.mHostTrackIndex = i;
    }

    public static int enableHighSpeed(boolean z) {
        return nativeEnableHighSpeed(z);
    }

    public static int openEditorFpsLog(boolean z) {
        return nativeOpenEditorFpsLog(z);
    }

    public static int setEnableEffectCanvas(boolean z) {
        return nativeEnableEffectCanvas(z);
    }

    public static int setEnableEffectTransition(boolean z) {
        return nativeEnableEffectTransiton(z);
    }

    public static int setEnableOpt(int i) {
        return nativeSetOptVersion(i);
    }

    public static int setForceDropFrameWithoutAudio(boolean z) {
        return nativeSetForceDropFrameWithoutAudio(z);
    }

    public static int setInfoStickerTransEnable(boolean z) {
        return nativeSetInfoStickerTransEnable(z);
    }

    public static int setMaxAudioReaderCount(int i) {
        return nativeSetMaxAudioReaderCount(i);
    }

    public static int setRuntimeConfig(String str) {
        return nativeSetRuntimeConfig(str);
    }

    public final void clearDisplay(int i) {
        nativeClearDisplay(this.mNative, i);
    }

    public final int expandTimeline(int i) {
        return nativeExpandTimeline(this.mNative, i);
    }

    public final float[] getInfoStickerBoundingBox(int i) throws VEException {
        return getInfoStickerBoundingBox(i, true);
    }

    public final void setCompileFps(int i) {
        setOption(0, "CompileFps", (long) i);
    }

    public final void setCompileHardwareEncodeOptions(int i) {
        setOption(0, "CompileHardwareBitrate", (long) i);
    }

    public final void setCompileType(int i) {
        setOption(0, "CompileType", (long) i);
    }

    public final void setEncGopSize(int i) {
        setOption(0, "video gop size", (long) i);
    }

    public final void setPageMode(int i) {
        setOption(0, "engine page mode", (long) i);
    }

    public final void setScaleMode(int i) {
        setOption(0, "filter mode", (long) i);
    }

    public final void setSpeedMode(int i) {
        setOption(0, "SpeedMode", (long) i);
    }

    public final void enableSimpleProcessor(boolean z) {
        long j;
        String str = "engine processor mode";
        if (z) {
            j = 1;
        } else {
            j = 0;
        }
        setOption(0, str, j);
    }

    public final void setBackGroundColor(int i) {
        if (this.mNative != 0) {
            nativeSetBackGroundColor(this.mNative, i);
        }
    }

    public final void setCompileWatermark(VEWatermarkParam vEWatermarkParam) {
        setOption(0, "CompilePathWatermark", vEWatermarkParam.extFile);
        setOption(0, "CompilePathWavWatermark", "");
    }

    public final void setEnableMultipleAudioFilter(boolean z) {
        if (this.mNative != 0) {
            nativeSetEnableMultipleAudioFilter(this.mNative, z);
        }
    }

    public final void setEnableRemuxVideo(boolean z) {
        if (this.mNative != 0) {
            nativeSetEnableRemuxVideo(this.mNative, z);
        }
    }

    public final void setEncoderParallel(boolean z) {
        if (this.mNative != 0) {
            nativeSetEncoderParallel(this.mNative, z);
        }
    }

    public final void setExpandLastFrame(boolean z) {
        if (this.mNative != 0) {
            nativeSetExpandLastFrame(this.mNative, z);
        }
    }

    public final void setLooping(boolean z) {
        long j;
        if (z) {
            j = 1;
        } else {
            j = 0;
        }
        setOption(1, "engine loop play", j);
    }

    public final void setPreviewSurface(Surface surface) {
        if (this.mNative != 0) {
            nativeSetPreviewSurface(this.mNative, surface);
        }
    }

    public final void setSpeedRatio(float f) {
        if (this.mNative != 0) {
            nativeSetSpeedRatio(this.mNative, f);
        }
    }

    public final void setUseHwEnc(boolean z) {
        long j;
        String str = "HardwareVideo";
        if (z) {
            j = 1;
        } else {
            j = 0;
        }
        setOption(0, str, j);
    }

    public final void setUseLargeMattingModel(boolean z) {
        long j;
        String str = "UseLargeMattingModel";
        if (z) {
            j = 1;
        } else {
            j = 0;
        }
        setOption(0, str, j);
    }

    public final void setVideoBackGroundColor(int i) {
        if (this.mNative != 0) {
            nativeSetVideoBackGroundColor(this.mNative, i);
        }
    }

    public final int addVidoeClipWithAlgorithm(String[] strArr) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeAddVidoeClipWithAlgorithm(this.mNative, strArr);
    }

    public final int appendComposerNodes(String[] strArr) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeAppendComposerNodes(this.mNative, strArr);
    }

    public final int beginInfoStickerPin(int i) {
        if (this.mNative == 0) {
            return -112;
        }
        if (this.mHostTrackIndex < 0) {
            return -105;
        }
        int nativeBeginInfoStickerPin = nativeBeginInfoStickerPin(this.mNative, i);
        if (nativeBeginInfoStickerPin != 0) {
            return -1;
        }
        return nativeBeginInfoStickerPin;
    }

    public final int cancelInfoStickerPin(int i) {
        if (this.mNative == 0) {
            return -112;
        }
        if (this.mHostTrackIndex < 0) {
            return -105;
        }
        int nativeCancelInfoStickerPin = nativeCancelInfoStickerPin(this.mNative, i);
        if (nativeCancelInfoStickerPin != 0) {
            return -1;
        }
        return nativeCancelInfoStickerPin;
    }

    public final int checkScoresFile(String str) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeCheckScoresFile(this.mNative, str);
    }

    public final int deleteExternalVideoTrack(int i) {
        if (this.mNative == 0) {
            return -1;
        }
        return nativeDeleteExternalVideoTrack(this.mNative, i);
    }

    public final int deleteSticker(int i) {
        if (this.mNative == 0) {
            return -112;
        }
        if (i < 0) {
            return -100;
        }
        return nativeDeleteExternalTrack(this.mNative, i);
    }

    public final int deleteVideoClipWithAlgorithm(int i) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeDeleteVideoClipWithAlgorithm(this.mNative, i);
    }

    public final int deleteWatermark(int i) {
        if (this.mNative == 0) {
            return -112;
        }
        if (i < 0) {
            return -100;
        }
        return nativeDeleteExternalTrack(this.mNative, i);
    }

    public final int enableEffect(boolean z) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeEnableEffect(this.mNative, z);
    }

    public final int enableEffectAmazing(boolean z) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeEnableEffectAmazing(this.mNative, z);
    }

    public final int enableFaceDetect(boolean z) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeEnableFaceDetect(this.mNative, z);
    }

    public final int enableImageEditor(boolean z) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeEnableImageEditor(this.mNative, z);
    }

    public final int end2DBrush(String str) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeEnd2DBrush(this.mNative, str);
    }

    public final byte[] getAudioCommonFilterPreprocessResult(long j) {
        if (this.mNative == 0) {
            return null;
        }
        return nativeGetAudioCommonFilterPreprocessResult(this.mNative, j);
    }

    public final String getClipPath(int i) {
        if (this.mNative == 0) {
            return "";
        }
        return nativeGetClipPath(this.mNative, i);
    }

    public final float getColorFilterIntensity(String str) {
        if (this.mNative == 0) {
            return -112.0f;
        }
        return nativeGetColorFilterIntensity(this.mNative, str);
    }

    public final int getDisplayImage(Bitmap bitmap) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeGetDisplayImage(this.mNative, bitmap);
    }

    public final int getInfoStickerPinState(int i) {
        if (this.mNative == 0) {
            return -112;
        }
        if (this.mHostTrackIndex < 0) {
            return -105;
        }
        return nativeGetInfoStickerPinState(this.mNative, i);
    }

    public final float getInfoStickerRotate(int i) {
        if (this.mNative == 0) {
            return -112.0f;
        }
        if (this.mHostTrackIndex < 0) {
            return -105.0f;
        }
        return nativeGetInfoStickerRotate(this.mNative, i);
    }

    public final boolean getInfoStickerVisible(int i) {
        if (this.mNative != 0 && this.mHostTrackIndex >= 0) {
            return nativeGetInfoStickerVisible(this.mNative, i);
        }
        return true;
    }

    public final String getMetaData(String str) {
        if (this.mNative == 0) {
            return "";
        }
        return nativeGetMetaData(this.mNative, str);
    }

    public final int getProcessedImage(Bitmap bitmap) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeGetProcessedImage(this.mNative, bitmap);
    }

    public final int getStickerFilterIndex(int i) {
        if (this.mNative == 0) {
            return -112;
        }
        if (i < 0) {
            return -100;
        }
        return nativeGetExternalTrackFilter(this.mNative, i);
    }

    public final boolean isInfoStickerAnimatable(int i) {
        if (this.mNative != 0 && this.mHostTrackIndex >= 0) {
            return nativeIsInfoStickerAnimatable(this.mNative, i);
        }
        return false;
    }

    public final int lockSeekVideoClip(int i) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeLockSeekVideoClip(this.mNative, i);
    }

    public final int pauseEffectAudio(boolean z) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativePauseEffectAudio(this.mNative, z);
    }

    public final int pauseInfoStickerAnimation(boolean z) {
        if (this.mNative == 0) {
            return -112;
        }
        if (this.mHostTrackIndex < 0) {
            return -105;
        }
        return nativePauseInfoStickerAnimation(this.mNative, z);
    }

    public final int prepareEngine(int i) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativePrepareEngine(this.mNative, i);
    }

    public final int pushImageToBuffer(String str) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativePushImageToBuffer(this.mNative, str);
    }

    public final int reloadComposerNodes(String[] strArr) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeReloadComposerNodes(this.mNative, strArr);
    }

    public final int removeComposerNodes(String[] strArr) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeRemoveComposerNodes(this.mNative, strArr);
    }

    public final int removeFilter(int[] iArr) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeRemoveFilter(this.mNative, iArr);
    }

    public final int removeInfoSticker(int i) {
        if (this.mNative == 0) {
            return -112;
        }
        if (this.mHostTrackIndex < 0) {
            return -105;
        }
        return nativeRemoveInfoSticker(this.mNative, i);
    }

    public final int removeInfoStickerWithBuffer(int i) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeRemoveInfoStickerWithBuffer(this.mNative, i);
    }

    public final int removeMusic(int i) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeRemoveMusic(this.mNative, i);
    }

    public final int restore(String str) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeRestore(this.mNative, str);
    }

    public final int set2DBrushCanvasAlpha(float f) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeSet2DBrushCanvasColor(this.mNative, f);
    }

    public final int set2DBrushSize(float f) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeSet2DBrushSize(this.mNative, f);
    }

    public final int setClientState(int i) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeSetClientState(this.mNative, i);
    }

    public final void setCompileSoftInfo(boolean z) {
        long j = 0;
        if (this.mNative != 0) {
            if (z) {
                j = 1;
            }
            setOption(0, "CompileSoftInfo", j);
        }
    }

    public final int setComposerNodes(String[] strArr) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeSetComposerNodes(this.mNative, strArr);
    }

    public final int setDestroyVersion(boolean z) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeSetDestroyVersion(this.mNative, z);
    }

    public final int setDldEnabled(boolean z) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeSetDldEnabled(this.mNative, z);
    }

    public final int setDldThrVal(int i) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeSetDldThrVal(this.mNative, i);
    }

    public final int setDleEnabled(boolean z) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeSetDleEnabled(this.mNative, z);
    }

    public final int setDleEnabledPreview(boolean z) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeSetDleEnabledPreview(this.mNative, z);
    }

    public final int setEffectCallback(VEEditorEffectListener vEEditorEffectListener) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeSetEffectCallback(this.mNative, vEEditorEffectListener);
    }

    public final int setEffectMaxMemoryCache(int i) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeSetEffectMaxMemoryCache(this.mNative, i);
    }

    public final int setEffectParams(VEEffectParams vEEffectParams) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeSetEffectParams(this.mNative, vEEffectParams);
    }

    public final void setEnableInterLeave(boolean z) {
        long j = 0;
        if (this.mNative != 0) {
            if (z) {
                j = 1;
            }
            setOption(0, "CompileInterleave", j);
        }
    }

    public final int setInfoStickerBufferCallback(VEInfoStickerBufferListener vEInfoStickerBufferListener) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeSetInfoStickerBufferCallback(this.mNative, vEInfoStickerBufferListener);
    }

    public final int setInfoStickerRestoreMode(int i) {
        if (this.mNative == 0) {
            return -112;
        }
        if (this.mHostTrackIndex < 0) {
            return -105;
        }
        int nativeSetInfoStickerRestoreMode = nativeSetInfoStickerRestoreMode(this.mNative, i);
        if (nativeSetInfoStickerRestoreMode != 0) {
            return -1;
        }
        return nativeSetInfoStickerRestoreMode;
    }

    public final int setInterimScoresToFile(String str) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeSetInterimScoresToFile(this.mNative, str);
    }

    public final int setMaleMakeupState(boolean z) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeSetMaleMakeupState(this.mNative, z);
    }

    public final int setMusicCropRatio(int i) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeSetMusicCropRatio(this.mNative, i);
    }

    public final int setPreviewFps(int i) {
        if (this.mNative == 0) {
            return -112;
        }
        nativeSetPreviewFps(this.mNative, i);
        return 0;
    }

    public final int setPreviewScaleMode(int i) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeSetPreviewScaleMode(this.mNative, i);
    }

    public final int updateSceneFileOrder(C45255af afVar) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeUpdateSceneFileOrder(this.mNative, afVar.f116437b);
    }

    public final float getInfoStickerScale(int i) {
        if (this.mNative == 0) {
            return -112.0f;
        }
        if (this.mHostTrackIndex < 0) {
            return -105.0f;
        }
        float nativeGetInfoStickerScale = nativeGetInfoStickerScale(this.mNative, i);
        if (nativeGetInfoStickerScale < 0.0f) {
            return -1.0f;
        }
        return nativeGetInfoStickerScale;
    }

    public final void setUsrRotate(int i) {
        if (i == 0) {
            setOption(0, "usr rotate", 0);
        } else if (i == 90) {
            setOption(0, "usr rotate", 1);
        } else if (i == 180) {
            setOption(0, "usr rotate", 2);
        } else if (i != 270) {
            setOption(0, "usr rotate", 0);
        } else {
            setOption(0, "usr rotate", 3);
        }
    }

    public final int updateSenceTime(C45255af afVar) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeUpdateSceneTime(this.mNative, afVar.f116445j, afVar.f116440e, afVar.f116441f, ROTATE_DEGREE.toIntArray(afVar.f116446k), afVar.f116444i);
    }

    public static TEInterface createEngine(long j) {
        int i;
        TEInterface tEInterface = new TEInterface();
        if (VERuntime.m143285a().f116767f) {
            i = 3;
        } else {
            i = 2;
        }
        TEGLGlobalContext.nativeSetGLVersion(i);
        TEGLGlobalContext.nativeSetMaxRenderSize(VERuntime.m143285a().f116768g.f116385a, VERuntime.m143285a().f116768g.f116386b);
        if (j == 0) {
            return null;
        }
        tEInterface.mNative = j;
        tEInterface.nativeResetCallback(j);
        return tEInterface;
    }

    public final void addMetaData(String str, String str2) {
        if (this.mNative != 0) {
            nativeAddMetaData(this.mNative, str, str2);
        }
    }

    public final void setCompileCommonEncodeOptions(int i, int i2) {
        setOption(0, "CompileBitrateMode", (long) i);
        setOption(0, "CompileEncodeProfile", (long) i2);
    }

    public final void setEngineCompilePath(String str, String str2) {
        setOption(0, "CompilePath", str);
        setOption(0, "CompilePathWav", str2);
    }

    public final void setSurfaceSize(int i, int i2) {
        if (this.mNative != 0) {
            nativeSetSurfaceSize(this.mNative, i, i2);
        }
    }

    public final void setVideoCompileBitrate(int i, int i2) {
        setOption(0, "CompileBitrateMode", (long) i);
        setOption(0, "CompileBitrateValue", (long) i2);
    }

    public final int addInfoSticker(String str, String[] strArr) {
        if (this.mNative == 0) {
            return -112;
        }
        if (this.mHostTrackIndex < 0) {
            return -105;
        }
        return nativeAddInfoSticker(this.mNative, str, strArr);
    }

    public final int changeTransitionAt(int i, VETransitionFilterParam vETransitionFilterParam) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeChangeTransitonAt(this.mNative, i, vETransitionFilterParam);
    }

    public final int createSceneWithAlgorithm(String[] strArr, int i) {
        if (this.mNative == 0) {
            return -112;
        }
        int nativeCreateSceneWithAlgorithm = nativeCreateSceneWithAlgorithm(this.mNative, strArr, i);
        if (nativeCreateSceneWithAlgorithm < 0) {
            return nativeCreateSceneWithAlgorithm;
        }
        this.mHostTrackIndex = nativeCreateSceneWithAlgorithm;
        return 0;
    }

    public final int deleteAudioTrack(int i, boolean z) {
        if (this.mNative == 0) {
            return -1;
        }
        return nativeDeleteAudioTrack(this.mNative, i, z);
    }

    public final int deleteClip(int i, int i2) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeDeleteClip(this.mNative, i, i2);
    }

    public final int enableStickerAnimationPreview(int i, boolean z) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeSetInfoStickerAnimationPreview(this.mNative, i, z);
    }

    public final int getInfoStickerFlip(int i, boolean[] zArr) {
        if (this.mNative == 0) {
            return -112;
        }
        if (this.mHostTrackIndex < 0) {
            return -100;
        }
        int nativeGetInfoStickerFlip = nativeGetInfoStickerFlip(this.mNative, i, zArr);
        if (nativeGetInfoStickerFlip != 0) {
            return -1;
        }
        return nativeGetInfoStickerFlip;
    }

    public final int getInfoStickerPinData(int i, ByteBuffer[] byteBufferArr) {
        if (this.mNative == 0) {
            return -112;
        }
        if (this.mHostTrackIndex < 0) {
            return -105;
        }
        return nativeGetInfoStickerPinData(this.mNative, i, byteBufferArr);
    }

    public final int getInfoStickerPosition(int i, float[] fArr) {
        if (this.mNative == 0) {
            return -112;
        }
        if (this.mHostTrackIndex < 0) {
            return -100;
        }
        int nativeGetInfoStickerPosition = nativeGetInfoStickerPosition(this.mNative, i, fArr);
        if (nativeGetInfoStickerPosition != 0) {
            return -1;
        }
        return nativeGetInfoStickerPosition;
    }

    public final int getSrtInfoStickerInitPosition(int i, float[] fArr) {
        if (this.mNative == 0) {
            return -112;
        }
        if (this.mHostTrackIndex < 0) {
            return -100;
        }
        int nativeGetSrtInfoStickerInitPosition = nativeGetSrtInfoStickerInitPosition(this.mNative, i, fArr);
        if (nativeGetSrtInfoStickerInitPosition != 0) {
            return -1;
        }
        return nativeGetSrtInfoStickerInitPosition;
    }

    public final int moveVideoClipWithAlgorithm(int i, int i2) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeMoveVideoClipWithAlgorithm(this.mNative, i, i2);
    }

    public final int processLongPressEvent(float f, float f2) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeProcessLongPressEvent(this.mNative, f, f2);
    }

    public final int processRotationEvent(float f, float f2) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeProcessRotationEvent(this.mNative, f, f2);
    }

    public final int processScaleEvent(float f, float f2) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeProcessScaleEvent(this.mNative, f, f2);
    }

    public final int processTouchEvent(float f, float f2) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeProcessTouchEvent(this.mNative, f, f2);
    }

    public final int processTouchMoveEvent(float f, float f2) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeProcessTouchMoveEvent(this.mNative, f, f2);
    }

    public final int setAIRotation(int i, int i2) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeSetAIRotation(this.mNative, i, i2);
    }

    public final int setAlgorithmPreConfig(int i, int i2) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeSetAlgorithmPreConfig(this.mNative, i, i2);
    }

    public final void setAlgorithmReplay(int i, String str) {
        if (this.mNative != 0) {
            setOption(0, "AlgorithmReplayMode", (long) i);
            setOption(0, "AlgorithmReplayFilePath", str);
        }
    }

    public final int setAlgorithmSyncAndNum(boolean z, int i) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeSetAlgorithmSyncAndNum(this.mNative, z, i);
    }

    public final int setAudioOffset(int i, int i2) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeSetAudioOffset(this.mNative, i, i2);
    }

    public final int setComposerMode(int i, int i2) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeSetComposerMode(this.mNative, i, i2);
    }

    public final int setEffectCacheInt(String str, int i) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeSetEffectCacheInt(this.mNative, str, i);
    }

    public final int setEffectFontPath(String str, int i) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeSetEffectFontPath(this.mNative, str, i);
    }

    public final void setEnableRemuxVideo(boolean z, boolean z2) {
        if (this.mNative != 0) {
            nativeSetEnableRemuxVideoForRotation(this.mNative, z, z2);
        }
    }

    public final float setInfoStickerScale(int i, float f) {
        if (this.mNative == 0) {
            return -112.0f;
        }
        return nativeSetInfoStickerScale(this.mNative, i, f);
    }

    public final void setMaxWidthHeight(int i, int i2) {
        if (i > 0) {
            setOption(0, "engine max video width", (long) i);
        }
        if (i2 > 0) {
            setOption(0, "engine max video height", (long) i2);
        }
    }

    public final void setWidthHeight(int i, int i2) {
        if (i > 0) {
            setOption(0, "engine video width", (long) i);
        }
        if (i2 > 0) {
            setOption(0, "engine video height", (long) i2);
        }
    }

    public final int switchResourceLoadMode(boolean z, int i) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeSwitchResourceLoadMode(this.mNative, z, i);
    }

    public final int updateTextSticker(int i, String str) {
        if (this.mNative == 0) {
            return -112;
        }
        if (this.mHostTrackIndex < 0) {
            return -100;
        }
        int nativeUpdateTextSticker = nativeUpdateTextSticker(this.mNative, i, str);
        if (nativeUpdateTextSticker != 0) {
            return -1;
        }
        return nativeUpdateTextSticker;
    }

    public final C45250aa getDecodeRect(int i, int i2) {
        if (this.mNative == 0) {
            return new C45250aa(0, 0, 0, 0);
        }
        int[] nativeGetDecodeDumpSize = nativeGetDecodeDumpSize(this.mNative, i, i2);
        return new C45250aa(nativeGetDecodeDumpSize[0], nativeGetDecodeDumpSize[1], nativeGetDecodeDumpSize[2], nativeGetDecodeDumpSize[3]);
    }

    public final int restoreInfoStickerPinWithJson(int i, ByteBuffer byteBuffer) {
        if (this.mNative == 0) {
            return -112;
        }
        if (this.mHostTrackIndex < 0) {
            return -105;
        }
        int nativeRestoreInfoStickerPinWithJson = nativeRestoreInfoStickerPinWithJson(this.mNative, i, byteBuffer, byteBuffer.capacity());
        if (nativeRestoreInfoStickerPinWithJson != 0) {
            return -1;
        }
        return nativeRestoreInfoStickerPinWithJson;
    }

    public final float[] getInfoStickerBoundingBox(int i, boolean z) throws VEException {
        float[] fArr;
        if (this.mNative == 0) {
            throw new VEException(-112, "");
        } else if (this.mHostTrackIndex >= 0) {
            if (z) {
                fArr = nativeGetInfoStickerBoundingBox(this.mNative, i);
            } else {
                fArr = nativeGetInfoStickerBoundingBoxWithoutRotate(this.mNative, i);
            }
            if (fArr[0] == 0.0f) {
                float[] fArr2 = new float[4];
                System.arraycopy(fArr, 1, fArr2, 0, 4);
                return fArr2;
            }
            StringBuilder sb = new StringBuilder("native getInfoStickerBoundingBox failed: ");
            sb.append(fArr[0]);
            sb.append(" index: ");
            sb.append(i);
            throw new VEException(-1, sb.toString());
        } else {
            throw new VEException(-100, "");
        }
    }

    public static int setImageBufferLimit(int i, int i2, int i3) {
        return nativeSetImageBufferLimit(i, i2, i3);
    }

    public final int adjustFilterInOut(int i, int i2, int i3) {
        return nativeAdjustFilterInOut(this.mNative, i, i2, i3);
    }

    public final long getClipSequenceOut(int i, int i2, int i3) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeGetClipSequenceOut(this.mNative, i, i2, i3);
    }

    public final int getDecodeImage(byte[] bArr, int i, int i2) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeGetDecodeImage(this.mNative, bArr, i, i2);
    }

    public final float getTrackVolume(int i, int i2, int i3) {
        if (this.mNative == 0) {
            return 0.0f;
        }
        return nativeGetTrackVolume(this.mNative, i, i2, i3);
    }

    public final int moveClip(int i, int i2, int i3) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeMoveClip(this.mNative, i, i2, i3);
    }

    public final int processTouchDownEvent(float f, float f2, VEGestureType vEGestureType) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeProcessTouchDownEvent(this.mNative, f, f2, vEGestureType.ordinal());
    }

    public final int processTouchUpEvent(float f, float f2, VEGestureType vEGestureType) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeProcessTouchUpEvent(this.mNative, f, f2, vEGestureType.ordinal());
    }

    public final void setAudioCompileSetting(int i, int i2, int i3) {
        if (this.mNative != 0) {
            setOption(0, "AudioSampleRate", (long) i);
            setOption(0, "AudioChannels", (long) i2);
            setOption(0, "AudioBitrate", (long) i3);
        }
    }

    public final int setExtTrackSeqIn(int i, int i2, int i3) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeSetExtTrackSeqIn(this.mNative, i, i2, i3);
    }

    public final int setExternalAlgorithmResult(String str, String str2, String str3) {
        if (this.mNative == 0) {
            C45372t.m143409d(TAG, "setExternalAlgorithmResult error, mNative == 0");
            return -112;
        }
        return nativeSetExternalAlgorithmResult(this.mNative, str, str2, str3);
    }

    public final int setFilterParam(int i, String str, VEMusicSRTEffectParam vEMusicSRTEffectParam) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeSetFilterParam(this.mNative, i, str, vEMusicSRTEffectParam);
    }

    public final void setOption(int i, String str, float f) {
        if (this.mNative != 0) {
            nativeSetOption(this.mNative, i, str, f);
        }
    }

    public final void setResizer(int i, float f, float f2) {
        setOption(0, "filter mode", (long) i);
        setOption(0, "resizer offset x percent", f);
        setOption(0, "resizer offset y percent", f2);
    }

    public final int setTimeRange(int i, int i2, int i3) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeSetTimeRange(this.mNative, i, i2, i3);
    }

    public final int setTrackDurationType(int i, int i2, int i3) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeSetTrackDurationType(this.mNative, i, i2, i3);
    }

    public final int setTrackLayer(int i, int i2, int i3) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeSetTrackLayer(this.mNative, i, i2, i3);
    }

    public final boolean setTrackVolume(int i, int i2, float f) {
        if (this.mNative == 0) {
            return false;
        }
        return nativeSetTrackVolume(this.mNative, i, i2, f);
    }

    public final int setTransitionAt(int i, long j, String str) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeSetTransitionAt(this.mNative, i, j, str);
    }

    public final int updateComposerNode(String str, String str2, float f) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeUpdateComposerNode(this.mNative, str, str2, f);
    }

    public final int updateScene(String[] strArr, int[] iArr, int[] iArr2) {
        if (this.mNative == 0) {
            return -112;
        }
        int nativeUpdateScene = nativeUpdateScene(this.mNative, strArr, iArr, iArr2);
        if (nativeUpdateScene < 0) {
            return nativeUpdateScene;
        }
        this.mHostTrackIndex = nativeUpdateScene;
        return 0;
    }

    public final int updateTrackClips(int i, int i2, String[] strArr) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeUpdateTrackClip(this.mNative, i, i2, strArr);
    }

    public final int updateTrackFilter(int i, int i2, boolean z) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeUpdateTrackFilter(this.mNative, i, i2, z);
    }

    public final int setFilterParam(int i, String str, VEStickerAnimator vEStickerAnimator) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeSetFilterParam(this.mNative, i, str, vEStickerAnimator);
    }

    public final int setInfoStickerFlip(int i, boolean z, boolean z2) {
        if (this.mNative == 0) {
            return -112;
        }
        if (this.mHostTrackIndex < 0) {
            return -100;
        }
        int nativeSetInfoStickerFlip = nativeSetInfoStickerFlip(this.mNative, i, z, z2);
        if (nativeSetInfoStickerFlip != 0) {
            return -1;
        }
        return nativeSetInfoStickerFlip;
    }

    public final void setOption(int i, String str, long j) {
        if (this.mNative != 0) {
            nativeSetOption(this.mNative, i, str, j);
        }
    }

    public final int setFilterParam(int i, String str, VEEffectFilterParam vEEffectFilterParam) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeSetFilterParam(this.mNative, i, str, vEEffectFilterParam);
    }

    public final void setOption(int i, String str, String str2) {
        if (this.mNative != 0) {
            nativeSetOption(this.mNative, i, str, str2);
        }
    }

    public final int setFilterParam(int i, String str, String str2) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeSetFilterParam(this.mNative, i, str, str2);
    }

    public final void setOption(int i, String[] strArr, long[] jArr) {
        if (this.mNative != 0) {
            nativeSetOptionArray(this.mNative, i, strArr, jArr);
        }
    }

    public final int setFilterParam(int i, String str, byte[] bArr) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeSetFilterParam2(this.mNative, i, str, bArr);
    }

    public final int updateFilterParam(int i, int i2, VEBaseFilterParam vEBaseFilterParam) {
        if (this.mNative == 0) {
            return -112;
        }
        int i3 = vEBaseFilterParam.filterType;
        if (i3 != 1) {
            if (i3 != 15) {
                switch (i3) {
                    case 7:
                        return nativeUpdateColorFilterParam(this.mNative, i, i2, (VEColorFilterParam) vEBaseFilterParam);
                    case 8:
                        return nativeUpdateEffectFilterParam(this.mNative, i, i2, (VEEffectFilterParam) vEBaseFilterParam);
                    default:
                        switch (i3) {
                            case 12:
                                return nativeUpdateBeautyFilterParam(this.mNative, i, i2, (VEBeautyFilterParam) vEBaseFilterParam);
                            case 13:
                                return nativeUpdateReshapeFilterParam(this.mNative, i, i2, (VEReshapeFilterParam) vEBaseFilterParam);
                            default:
                                switch (i3) {
                                    case 17:
                                        return nativeUpdateQualityFilterParam(this.mNative, i, i2, (VEVideoAjustmentFilterParam) vEBaseFilterParam);
                                    case 18:
                                        break;
                                    case 19:
                                        return nativeUpdateCropFilterParam(this.mNative, i, i2, (VEVideoCropFilterParam) vEBaseFilterParam);
                                    case 20:
                                        return nativeUpdateImageTransformFilterParam(this.mNative, i, i2, (VEImageTransformFilterParam) vEBaseFilterParam);
                                    case 21:
                                        return nativeUpdateImageAddFilterParam(this.mNative, i, i2, (VEImageAddFilterParam) vEBaseFilterParam);
                                    case 22:
                                        return nativeUpdateAmazingFilterParam(this.mNative, i, i2, (VEAmazingFilterParam) vEBaseFilterParam);
                                    default:
                                        return -100;
                                }
                        }
                }
                return nativeUpdateEffectComposerParam(this.mNative, i, i2, (VEComposerFilterParam) vEBaseFilterParam);
            } else if (vEBaseFilterParam instanceof VEVideoTransformFilterParam) {
                return nativeUpdateVideoTransformFilterParam(this.mNative, i, i2, (VEVideoTransformFilterParam) vEBaseFilterParam);
            } else if (vEBaseFilterParam instanceof VECanvasFilterParam) {
                return nativeUpdateCanvasFilterParam(this.mNative, i, i2, (VECanvasFilterParam) vEBaseFilterParam);
            }
        }
        if (vEBaseFilterParam.filterName.equals(VEBaseAudioFilterParam.AUDIO_VOLUME_FILTER_NAME)) {
            return nativeUpdateAudioVolumeFilterParam(this.mNative, i, i2, (VEAudioVolumeFilterParam) vEBaseFilterParam);
        } else if (vEBaseFilterParam.filterName.equals(VEBaseAudioFilterParam.AUDIO_FADING_TRANSITION_NAME)) {
            return nativeUpdateAudioFadeFilterParam(this.mNative, i, i2, (VEAudioFadeFilterParam) vEBaseFilterParam);
        } else {
            if (vEBaseFilterParam.filterName.equals(VEBaseAudioFilterParam.AUDIO_EFFECT_FILTER_NAME)) {
                return nativeUpdateAudioEffectFilterParam(this.mNative, i, i2, (VEAudioEffectFilterParam) vEBaseFilterParam);
            }
            return nativeUpdateEffectComposerParam(this.mNative, i, i2, (VEComposerFilterParam) vEBaseFilterParam);
        }
    }

    public static int setMaxSoftWareVideoReaderCount(int i, int i2, int i3, int i4) {
        return nativeSetMaxSoftwareVideoReaderCount(i, i2, i3, i4);
    }

    public final int getImages(int[] iArr, int i, int i2, int i3) {
        return nativeGetImages(this.mNative, iArr, i, i2, i3);
    }

    public final int controlStickerAnimationPreview(boolean z, int i, float f, int i2) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeControlInfoStickerAnimationPreview(this.mNative, z, i, i2);
    }

    public final int insertClip(int i, int i2, VEClipSourceParam vEClipSourceParam, VEClipTimelineParam vEClipTimelineParam) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeInsertClip(this.mNative, i, i2, vEClipSourceParam, vEClipTimelineParam);
    }

    public final int replaceClip(int i, int i2, VEClipSourceParam vEClipSourceParam, VEClipTimelineParam vEClipTimelineParam) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeReplaceClip(this.mNative, i, i2, vEClipSourceParam, vEClipTimelineParam);
    }

    public final int seek(int i, int i2, int i3, int i4) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeSeek(this.mNative, i, i2, i3, i4);
    }

    public final int set2DBrushColor(float f, float f2, float f3, float f4) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeSet2DBrushColor(this.mNative, f, f2, f3, f4);
    }

    public final void setCompileSoftwareEncodeOptions(int i, long j, int i2, int i3) {
        setOption(0, "CompileSoftwareCrf", (long) i);
        setOption(0, "CompileSoftwareMaxrate", j);
        setOption(0, "CompileSoftwarePreset", (long) i2);
        setOption(0, "CompileSoftwareQp", (long) i3);
    }

    public final int setEffectInputText(String str, int i, int i2, String str2) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeSetEffectInputText(this.mNative, str, i, i2, str2);
    }

    public final int setTrackMinMaxDuration(int i, int i2, int i3, int i4) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeSetTrackMinMaxDuration(this.mNative, i, i2, i3, i4);
    }

    public final void setViewPort(int i, int i2, int i3, int i4) {
        if (this.mNative != 0) {
            nativeSetViewPort(this.mNative, i, i2, i3, i4);
        }
    }

    public final int updateClipsSourceParam(int i, int i2, int[] iArr, VEClipSourceParam[] vEClipSourceParamArr) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeUpdateClipsSourceParam(this.mNative, i, i2, iArr, vEClipSourceParamArr);
    }

    public final int updateClipsTimelineParam(int i, int i2, int[] iArr, VEClipTimelineParam[] vEClipTimelineParamArr) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeUpdateClipsTimelineParam(this.mNative, i, i2, iArr, vEClipTimelineParamArr);
    }

    public final int updateFilterTime(int i, int i2, int i3, int i4) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeUpdateFilterTime(this.mNative, i, i2, i3, i4);
    }

    public final int updateTrackFilterDuration(int i, int i2, boolean z, long j) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeUpdateTrackFilterDuration(this.mNative, i, i2, z, j);
    }

    public final void setCrop(int i, int i2, int i3, int i4) {
        setOption(1, new String[]{"engine crop x", "engine crop y", "engine crop width", "engine crop height"}, new long[]{(long) i, (long) i2, (long) i3, (long) i4});
    }

    public final void updateResolution(int i, int i2, int i3, int i4) {
        setOption(1, new String[]{"engine preivew width", "engine preivew height", "engine preivew width percent", "engine preivew height percent"}, new long[]{(long) i, (long) i2, (long) i3, (long) i4});
    }

    public final int setClipAttr(int i, int i2, int i3, String str, String str2) {
        return nativeSetClipAttr(this.mNative, i, i2, i3, str, str2);
    }

    public final int preprocessAudioTrackForFilter(int i, int i2, String str, byte[] bArr, long[] jArr) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativePreprocessAudioTrackForFilter(this.mNative, i, i2, str, bArr, jArr);
    }

    public final int processPanEvent(float f, float f2, float f3, float f4, float f5) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeProcessPanEvent(this.mNative, f, f2, f3, f4, f5);
    }

    public final int seekWithTolerance(int i, int i2, int i3, int i4, int i5) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeSeekWithTolerance(this.mNative, i, i2, i3, i4, i5);
    }

    public final int[] addFilters(int[] iArr, String[] strArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5) {
        return addFilters(iArr, strArr, iArr2, iArr3, iArr4, iArr5, null);
    }

    public final int addExternalVideoTrack(String[] strArr, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int i) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeAddExternalVideoTrack(this.mNative, strArr, iArr, iArr2, iArr3, iArr4, i);
    }

    public final int createScene(String str, String[] strArr, String[] strArr2, String[] strArr3, String[][] strArr4, int i) {
        if (this.mNative == 0) {
            return -112;
        }
        int nativeCreateScene = nativeCreateScene(this.mNative, str, strArr, strArr2, strArr3, strArr4, i);
        if (nativeCreateScene < 0) {
            return nativeCreateScene;
        }
        this.mHostTrackIndex = nativeCreateScene;
        return 0;
    }

    public final int processBingoFrames(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i, int i2, float f, String str) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeProcessBingoFrames(this.mNative, byteBuffer, byteBuffer2, i, i2, f, str);
    }

    public final int updateAudioTrack(int i, int i2, int i3, int i4, int i5, boolean z) {
        if (this.mNative == 0) {
            return -1;
        }
        if (i < 0) {
            return -100;
        }
        return nativeUpdateAudioTrack(this.mNative, i, i2, i3, i4, i5, z);
    }

    public final int addAudioTrack(String str, int i, int i2, int i3, int i4, boolean z) {
        if (this.mNative == 0) {
            return -1;
        }
        if (TextUtils.isEmpty(str)) {
            return -100;
        }
        return nativeAddAudioTrack(this.mNative, str, i, i2, i3, i4, z);
    }

    public final void setDisplayState(float f, float f2, float f3, float f4, int i, int i2, boolean z) {
        if (this.mNative != 0) {
            nativeSetDisplayState(this.mNative, f, f2, f3, f4, i, i2, z ? 1 : 0);
        }
    }

    public final int setStickerAnimation(int i, boolean z, String str, int i2, String str2, int i3, int i4) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeSetInfoStickerAnimationParam(this.mNative, i, z, str, i2, str2, i3, i4);
    }

    public final int addAudioTrackForMV(String str, int i, int i2, int i3, int i4, int i5, boolean z) {
        if (this.mNative == 0) {
            return -1;
        }
        if (TextUtils.isEmpty(str)) {
            return -100;
        }
        return nativeAddAudioTrackMV(this.mNative, str, i, i2, i3, i4, i5, z);
    }

    public final int[] addFilters(int[] iArr, String[] strArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, int[] iArr6) {
        if (this.mNative == 0) {
            return new int[]{-1};
        }
        return nativeAddFilters(this.mNative, iArr, strArr, iArr2, iArr3, iArr4, iArr5, iArr6);
    }

    public final int addVideoTrackForMV(String[] strArr, String[] strArr2, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5) {
        if (this.mNative == 0) {
            return -1;
        }
        if (this.mHostTrackIndex < 0) {
            return -105;
        }
        return nativeAddVideoTrack(this.mNative, strArr, strArr2, iArr, iArr2, iArr3, iArr4, iArr5, this.mHostTrackIndex);
    }

    public final Object initMVResources(String str, String[] strArr, String[] strArr2, String str2, int i, int i2, boolean z, boolean z2) {
        return nativeInitMVResources(this.mNative, str, strArr, strArr2, str2, i, i2, z, z2);
    }

    public final int addWaterMark(String[] strArr, String[] strArr2, int[] iArr, int[] iArr2, double d, double d2, double d3, double d4) {
        if (this.mNative == 0) {
            return -112;
        }
        if (this.mHostTrackIndex < 0) {
            return -105;
        }
        return nativeAddExternalTrack(this.mNative, strArr, strArr2, iArr, iArr2, iArr, iArr2, d, d2, d3, d4, 5, this.mHostTrackIndex);
    }

    public final int updateAudioTrack(int i, int i2, int i3, int i4, int i5, boolean z, int i6, int i7) {
        if (this.mNative == 0) {
            return -1;
        }
        if (i < 0) {
            return -100;
        }
        return nativeUpdateAudioTrack2(this.mNative, i, i2, i3, i4, i5, z, i6, i7);
    }

    public final int addAudioTrack(String str, int i, int i2, int i3, int i4, boolean z, int i5, int i6) {
        if (this.mNative == 0) {
            return -1;
        }
        if (TextUtils.isEmpty(str)) {
            return -100;
        }
        return nativeAddAudioTrack2(this.mNative, str, i, i2, i3, i4, z, i5, i6);
    }

    public final void setWaterMark(ArrayList<String[]> arrayList, int i, int i2, int i3, int i4, int i5, long j, VEWaterMarkPosition vEWaterMarkPosition, VEWatermarkMask vEWatermarkMask) {
        if (this.mNative != 0) {
            nativeSetWaterMark(this.mNative, arrayList, i, i2, i3, i4, i5, j, vEWaterMarkPosition.ordinal(), vEWatermarkMask);
        }
    }

    public final int createScene2(String[] strArr, int[] iArr, int[] iArr2, String[] strArr2, int[] iArr3, int[] iArr4, String[] strArr3, String[][] strArr4, float[] fArr, int i) {
        return createScene2(strArr, iArr, iArr2, strArr2, iArr3, iArr4, strArr3, strArr4, fArr, fArr, null, i);
    }

    public final int addSticker(String[] strArr, String[] strArr2, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, double d, double d2, double d3, double d4) {
        if (this.mNative == 0) {
            return -112;
        }
        if (this.mHostTrackIndex < 0) {
            return -105;
        }
        return nativeAddExternalTrack(this.mNative, strArr, strArr2, iArr, iArr2, iArr3, iArr4, d, d2, d3, d4, 0, this.mHostTrackIndex);
    }

    public final int setMusicAndResult(String str, int i, int i2, String str2, String str3, String str4, String str5, String str6, int i3, int i4) {
        if (this.mNative == 0) {
            return -112;
        }
        return nativeSetMusicAndResult(this.mNative, i, i2, str, str2, str3, str4, str5, str6, i3, i4);
    }

    public final int addExternalTrack(String[] strArr, String[] strArr2, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, double d, double d2, double d3, double d4, int i) {
        String[] strArr3 = strArr2;
        int[] iArr5 = iArr;
        int[] iArr6 = iArr;
        int[] iArr7 = iArr2;
        int[] iArr8 = iArr2;
        double d5 = d;
        double d6 = d2;
        double d7 = d3;
        double d8 = d4;
        String[] strArr4 = strArr;
        long j = this.mNative;
        int i2 = this.mHostTrackIndex;
        return nativeAddExternalTrack(j, strArr4, strArr3, iArr5, iArr8, iArr6, iArr7, d5, d6, d7, d8, 5, i2);
    }

    public final int createImageScene(Bitmap[] bitmapArr, int[] iArr, int[] iArr2, String[] strArr, int[] iArr3, int[] iArr4, String[] strArr2, String[][] strArr3, float[] fArr, int[] iArr5, int i) {
        float[] fArr2;
        if (this.mNative == 0) {
            return -112;
        }
        if (fArr == null) {
            float[] fArr3 = new float[bitmapArr.length];
            Arrays.fill(fArr3, 1.0f);
            fArr2 = fArr3;
        } else {
            Bitmap[] bitmapArr2 = bitmapArr;
            fArr2 = fArr;
        }
        int nativeCreateImageScene = nativeCreateImageScene(this.mNative, bitmapArr, iArr, iArr2, strArr, iArr3, iArr4, strArr2, strArr3, fArr2, iArr5, i);
        if (nativeCreateImageScene < 0) {
            return nativeCreateImageScene;
        }
        this.mHostTrackIndex = nativeCreateImageScene;
        return 0;
    }

    public final int createCanvasScene(String[] strArr, int[] iArr, int[] iArr2, String[] strArr2, int[] iArr3, int[] iArr4, String[] strArr3, int[] iArr5, int[] iArr6, String[][] strArr4, float[] fArr, int i) {
        float[] fArr2;
        if (this.mNative == 0) {
            return -112;
        }
        if (fArr == null) {
            float[] fArr3 = new float[strArr.length];
            Arrays.fill(fArr3, 1.0f);
            fArr2 = fArr3;
        } else {
            String[] strArr5 = strArr;
            fArr2 = fArr;
        }
        int nativeCreateCanvasScene = nativeCreateCanvasScene(this.mNative, strArr, iArr, iArr2, strArr2, iArr3, iArr4, strArr3, iArr5, iArr6, strArr4, fArr2, i);
        if (nativeCreateCanvasScene < 0) {
            return nativeCreateCanvasScene;
        }
        this.mHostTrackIndex = nativeCreateCanvasScene;
        return 0;
    }

    public final int createScene2(String[] strArr, int[] iArr, int[] iArr2, String[] strArr2, int[] iArr3, int[] iArr4, String[] strArr3, String[][] strArr4, float[] fArr, float[] fArr2, int[] iArr5, int i) {
        float[] fArr3;
        float[] fArr4;
        String[] strArr5 = strArr2;
        if (this.mNative == 0) {
            return -112;
        }
        if (fArr == null) {
            float[] fArr5 = new float[strArr.length];
            Arrays.fill(fArr5, 1.0f);
            fArr3 = fArr5;
        } else {
            String[] strArr6 = strArr;
            fArr3 = fArr;
        }
        if (fArr2 != null || strArr5 == null) {
            fArr4 = fArr2;
        } else {
            float[] fArr6 = new float[strArr5.length];
            Arrays.fill(fArr6, 1.0f);
            fArr4 = fArr6;
        }
        int nativeCreateScene2 = nativeCreateScene2(this.mNative, strArr, iArr, iArr2, strArr2, iArr3, iArr4, strArr3, strArr4, fArr3, fArr4, iArr5, i);
        if (nativeCreateScene2 < 0) {
            return nativeCreateScene2;
        }
        this.mHostTrackIndex = nativeCreateScene2;
        return 0;
    }

    public final int createScene2(String[] strArr, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, String[] strArr2, int[] iArr5, int[] iArr6, int[] iArr7, int[] iArr8, int[] iArr9, String[] strArr3, String[][] strArr4, float[] fArr, int i) {
        float[] fArr2;
        if (this.mNative == 0) {
            return -112;
        }
        if (fArr == null) {
            float[] fArr3 = new float[strArr.length];
            Arrays.fill(fArr3, 1.0f);
            fArr2 = fArr3;
        } else {
            String[] strArr5 = strArr;
            fArr2 = fArr;
        }
        int nativeCreateSceneMV = nativeCreateSceneMV(this.mNative, strArr, iArr, iArr2, iArr3, iArr4, strArr2, iArr5, iArr6, iArr7, iArr8, iArr9, strArr3, strArr4, fArr2, i);
        if (nativeCreateSceneMV < 0) {
            return nativeCreateSceneMV;
        }
        this.mHostTrackIndex = nativeCreateSceneMV;
        return 0;
    }
}

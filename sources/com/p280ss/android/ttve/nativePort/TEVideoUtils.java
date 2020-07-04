package com.p280ss.android.ttve.nativePort;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.text.TextUtils;
import com.p280ss.android.ttve.model.VEAlgorithmResult;
import com.p280ss.android.ttve.model.VEMusicWaveBean;
import com.p280ss.android.vesdk.C45372t;
import com.p280ss.android.vesdk.VEException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ttve.nativePort.TEVideoUtils */
public final class TEVideoUtils {
    private static long getFrameInterval = 1000;
    private static long mHandler = -1;

    /* renamed from: com.ss.android.ttve.nativePort.TEVideoUtils$CompileProbeListener */
    public interface CompileProbeListener {
        void onCompileProbeResult(int i, int i2, float f);
    }

    /* renamed from: com.ss.android.ttve.nativePort.TEVideoUtils$ExecuteCommandListener */
    public interface ExecuteCommandListener {
        void onProgressChanged(int i);
    }

    public static native void nativeCancelCompileProbe();

    private static native int nativeClearWavSeg(String str, int i, int i2);

    public static native int nativeCompileProbe(String str, String str2, int i, int i2, long j, long j2, int i3, int i4, int i5, long j3, CompileProbeListener compileProbeListener);

    private static native int nativeConcat(String[] strArr, String str);

    public static native int nativeConcatRecordFrag(String[] strArr, long[] jArr, String[] strArr2, long[] jArr2, boolean z, int i, String str, String str2, String str3, String str4);

    public static native long nativeCreateCurveSpeedUtils(float[] fArr, float[] fArr2);

    private static native long nativeCreateGetFrameHandler(String str);

    private static native long nativeCreateHandler();

    private static native long nativeCreateRTAudioWaveformMgr(int i, int i2, float f, int i3);

    public static native void nativeCurveSpeedDestroy(long j);

    private static native int nativeDeleteRTAudioWaveformMgr(long j);

    public static native int nativeDetachAudioFromVideos(String str, String[] strArr, long[] jArr, long[] jArr2, long j, long j2, float[] fArr, int i, int i2, int i3);

    private static native int nativeExecuteFFmpegCommand(String str, ExecuteCommandListener executeCommandListener);

    private static native int nativeExtractVideo(String str, String str2);

    private static native String nativeFindBestRemuxSuffix(String str);

    private static native int nativeGenerateMuteWav(String str, int i, int i2, int i3);

    private static native int nativeGetAudioFileInfo(String str, int[] iArr);

    private static native int nativeGetAudioFileInfoForAllTracks(String str, int[][] iArr);

    private static native VEMusicWaveBean nativeGetAudioWaveData(String str, int i, int i2, int i3, int i4, int i5);

    public static native double nativeGetAveCurveSpeed(long j);

    public static native double nativeGetCurveSpeedWithSeqDelta(long j, long j2);

    private static native void nativeGetDstBitmapSize(long j, int i, int i2, int[] iArr);

    private static native int nativeGetFileAudio(String str, String str2, ArrayList<String> arrayList, boolean z);

    private static native int nativeGetFileInfo(String str, int[] iArr);

    private static native int nativeGetFrameWithHandler(long j, Bitmap bitmap, int i, int i2, int i3, boolean z);

    private static native Object nativeGetMVAlgorithmConfigs(String str, String[] strArr, int i);

    private static native int nativeGetMusicDefaultAlgorithm(String str, String str2);

    private static native VEMusicWaveBean nativeGetResampleMusicWaveData(float[] fArr, int i, int i2);

    private static native int nativeGetVideoFrame(String str, int[] iArr, int i, int i2, boolean z, Object obj);

    private static native int nativeGetVideoFrame2(String str, int[] iArr, int i, int i2, boolean z, Object obj);

    private static native int nativeGetVideoFrameMore(String str, int[] iArr, int i, int i2, boolean z, boolean z2, int i3, boolean z3, Object obj);

    private static native int nativeGetVideoThumb(String str, int i, Object obj, boolean z, int i2, int i3, long j, int i4);

    private static native int nativeInitAlgorithm(long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, long j2, long j3, int i, int i2, int i3);

    private static native long nativeInitResampleContext(int i, int i2, int i3, int i4);

    private static native int nativeIsCanImport(String str);

    private static native int nativeIsCanImportFd(int i, long j, long j2);

    private static native int nativeIsCanTransCode(String str, int i, int i2);

    private static native boolean nativeIsSupportGLES3();

    public static native long nativeMapSeqDeltaToTrimDelta(long j, long j2);

    public static native long nativeMapTrimDeltaToSeqDelta(long j, long j2);

    private static native int nativeMixAudio(ArrayList<String> arrayList, String str, Object obj);

    private static native int nativeMux(String str, String str2, String str3);

    private static native int nativePcmResampleFilter(long j, byte[] bArr, byte[] bArr2, int i, int i2);

    private static native int nativeRTAudioWaveformFinish(long j);

    private static native int nativeRTAudioWaveformGetPoints(long j, float[] fArr, int i, int i2);

    private static native int nativeRTAudioWaveformProcess(long j, float[][] fArr, int i, int i2);

    private static native int nativeRTAudioWaveformReset(long j);

    private static native void nativeRelease(long j);

    private static native void nativeReleaseGetFrameHandler(long j);

    private static native void nativeReleaseResampleContext(long j);

    private static native int nativeReverseAllIFrameVideoAndMuxAudio(String str, String str2, String str3);

    private static native int nativeReverseAllIFrameVideoAndMuxAudio2(String str, String str2, String str3, TEReverseCallback tEReverseCallback);

    private static native int nativeReverseAllIVideo(String str, String str2);

    private static native int nativeReverseAllIVideo2(String str, String str2, TEReverseCallback tEReverseCallback);

    private static native int nativeSaveVideoFrames(String str, int[] iArr, int i, int i2, boolean z, String str2, int i3, int i4);

    private static native int nativeSetC1Param(long j, int i, float f);

    public static native int nativeSetCurveSpeedData(long j, float[] fArr, float[] fArr2);

    private static native int nativeSetFaceClustingParam(long j, int i, float f);

    private static native int nativeSetFaceParam(long j, int i, float f);

    public static native void nativeSetSeqDuration(long j, long j2);

    private static native VEAlgorithmResult nativeStart(long j, String str, boolean z);

    private static native VEAlgorithmResult nativeStartFaceClusting(long j, float[] fArr, int i, int i2);

    private static native VEAlgorithmResult nativeStartSimilarity(long j, byte[][] bArr, int i);

    private static native int nativeTransCodecAudioFile(String str, int i, int i2, String str2, int i3, int i4, int i5);

    private static native int nativeTrimFile(String str, String str2, int[] iArr, int[] iArr2);

    public static boolean isSupportGLES3() {
        return nativeIsSupportGLES3();
    }

    static {
        TENativeLibsLoader.m67986c();
    }

    public static void release() {
        if (mHandler != -1) {
            nativeRelease(mHandler);
            mHandler = -1;
        }
    }

    public static void releaseGetFrameHandler(long j) {
        nativeReleaseGetFrameHandler(j);
    }

    public static void releaseResampleContext(long j) {
        nativeReleaseResampleContext(j);
    }

    public static long createGetFrameHandler(String str) {
        return nativeCreateGetFrameHandler(str);
    }

    public static int deleteRTAudioWaveformMgr(long j) {
        return nativeDeleteRTAudioWaveformMgr(j);
    }

    public static int rtAudioWaveformFinish(long j) {
        return nativeRTAudioWaveformFinish(j);
    }

    public static int rtAudioWaveformReset(long j) {
        return nativeRTAudioWaveformReset(j);
    }

    public static VEAlgorithmResult startSimilarity(byte[][] bArr) {
        return nativeStartSimilarity(mHandler, bArr, bArr.length);
    }

    public static int isCanImport(String str) {
        if (TextUtils.isEmpty(str)) {
            return -100;
        }
        return nativeIsCanImport(str);
    }

    public static String findBestRemuxSuffix(String str) throws VEException {
        if (str.length() > 0) {
            String nativeFindBestRemuxSuffix = nativeFindBestRemuxSuffix(str);
            if (nativeFindBestRemuxSuffix.length() > 0) {
                return nativeFindBestRemuxSuffix;
            }
            throw new VEException(-205, "该文件暂不支持转封装!");
        }
        throw new VEException(-100, "请检查输入参数!");
    }

    public static int concat(String[] strArr, String str) {
        return nativeConcat(strArr, str);
    }

    public static long createCurveSpeedUtils(float[] fArr, float[] fArr2) {
        return nativeCreateCurveSpeedUtils(fArr, fArr2);
    }

    public static int executeFFmpegCommand(String str, ExecuteCommandListener executeCommandListener) {
        return nativeExecuteFFmpegCommand(str, executeCommandListener);
    }

    public static int extractVideo(String str, String str2) {
        return nativeExtractVideo(str, str2);
    }

    public static int getAudioFileInfo(String str, int[] iArr) {
        return nativeGetAudioFileInfo(str, iArr);
    }

    public static int getAudioFileInfoForAllTracks(String str, int[][] iArr) {
        return nativeGetAudioFileInfoForAllTracks(str, iArr);
    }

    public static int getMusicDefaultAlgorithm(String str, String str2) {
        return nativeGetMusicDefaultAlgorithm(str, str2);
    }

    public static int getVideoFileInfo(String str, int[] iArr) {
        return nativeGetFileInfo(str, iArr);
    }

    public static int reverseAllIVideo(String str, String str2) {
        return nativeReverseAllIVideo(str, str2);
    }

    public static int setC1Param(int i, float f) {
        return nativeSetC1Param(mHandler, i, f);
    }

    public static int setFaceClustingParam(int i, float f) {
        return nativeSetFaceClustingParam(mHandler, i, f);
    }

    public static int setFaceParam(int i, float f) {
        return nativeSetFaceParam(mHandler, i, f);
    }

    public static VEAlgorithmResult start(String str, boolean z) {
        return nativeStart(mHandler, str, z);
    }

    public static VEAlgorithmResult startFaceClusting(float[] fArr, int i) {
        return nativeStartFaceClusting(mHandler, fArr, fArr.length, i);
    }

    public static Object getMVAlgorithmConfigs(String str, List<String> list) {
        String[] strArr = new String[list.size()];
        list.toArray(strArr);
        return nativeGetMVAlgorithmConfigs(str, strArr, strArr.length);
    }

    public static int clearWavSeg(String str, int i, int i2) {
        return nativeClearWavSeg(str, i, i2);
    }

    public static VEMusicWaveBean getResampleMusicWaveData(float[] fArr, int i, int i2) {
        return nativeGetResampleMusicWaveData(fArr, i, i2);
    }

    public static int isCanTransCode(String str, int i, int i2) {
        return nativeIsCanTransCode(str, i, i2);
    }

    public static int mixAudio(ArrayList<String> arrayList, String str, Object obj) {
        return nativeMixAudio(arrayList, str, obj);
    }

    public static int mux(String str, String str2, String str3) {
        return nativeMux(str, str2, str3);
    }

    public static int reverseAllIVideoAndMuxAudio(String str, String str2, String str3) {
        return nativeReverseAllIFrameVideoAndMuxAudio(str, str2, str3);
    }

    public static int isCanImportFd(int i, long j, long j2) {
        if (i <= 0) {
            return -100;
        }
        return nativeIsCanImportFd(i, j, j2);
    }

    public static int reverseAllIVideo(String str, String str2, TEReverseCallback tEReverseCallback) {
        return nativeReverseAllIVideo2(str, str2, tEReverseCallback);
    }

    public static long createRTAudioWaveformMgr(int i, int i2, float f, int i3) {
        return nativeCreateRTAudioWaveformMgr(i, i2, f, i3);
    }

    public static int generateMuteWav(String str, int i, int i2, int i3) {
        return nativeGenerateMuteWav(str, i, i2, i3);
    }

    public static int getFileAudio(String str, String str2, ArrayList<String> arrayList, boolean z) {
        return nativeGetFileAudio(str, str2, arrayList, z);
    }

    public static long initResampleContext(int i, int i2, int i3, int i4) {
        return nativeInitResampleContext(i, i2, i3, i4);
    }

    public static int rtAudioWaveformGetPoints(long j, float[] fArr, int i, int i2) {
        return nativeRTAudioWaveformGetPoints(j, fArr, i, i2);
    }

    public static int rtAudioWaveformProcess(long j, float[][] fArr, int i, int i2) {
        return nativeRTAudioWaveformProcess(j, fArr, i, i2);
    }

    public static int trimVideoFile(String str, int[] iArr, String str2, int[] iArr2) {
        return nativeTrimFile(str, str2, iArr, iArr2);
    }

    public static int reverseAllIVideoAndMuxAudio(String str, String str2, String str3, TEReverseCallback tEReverseCallback) {
        return nativeReverseAllIFrameVideoAndMuxAudio2(str, str2, str3, tEReverseCallback);
    }

    public static int pcmResampleFilter(long j, byte[] bArr, byte[] bArr2, int i, int i2) {
        return nativePcmResampleFilter(j, bArr, bArr2, i, i2);
    }

    public static Bitmap getFrameWithHandler(long j, int i, int i2, int i3, boolean z) {
        int[] iArr = new int[2];
        nativeGetDstBitmapSize(j, i2, i3, iArr);
        Bitmap createBitmap = Bitmap.createBitmap(iArr[0], iArr[1], Config.ARGB_8888);
        if (createBitmap == null) {
            return null;
        }
        if (nativeGetFrameWithHandler(j, createBitmap, i, iArr[0], iArr[1], z) != 0) {
            if (createBitmap != null && !createBitmap.isRecycled()) {
                createBitmap.recycle();
            }
            createBitmap = null;
        }
        return createBitmap;
    }

    public static VEMusicWaveBean getAudioWaveData(String str, int i, int i2, int i3, int i4, int i5) {
        return nativeGetAudioWaveData(str, i, i2, i3, i4, i5);
    }

    public static int getVideoFrames(String str, int[] iArr, int i, int i2, boolean z, Object obj) {
        return nativeGetVideoFrame(str, iArr, i, i2, z, obj);
    }

    public static int getVideoFrames2(String str, int[] iArr, int i, int i2, boolean z, Object obj) {
        return nativeGetVideoFrame2(str, iArr, i, i2, z, obj);
    }

    public static int transCodeAudioFile(String str, int i, int i2, String str2, int i3, int i4, int i5) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            return nativeTransCodecAudioFile(str, i, i2, str2, i3, i4, i5);
        }
        return -100;
    }

    public static int getVideoThumb(String str, int i, Object obj, boolean z, int i2, int i3, long j, int i4) {
        return nativeGetVideoThumb(str, i, obj, z, i2, i3, j, i4);
    }

    public static int saveVideoFrames(String str, int[] iArr, int i, int i2, boolean z, String str2, int i3, int i4) {
        return nativeSaveVideoFrames(str, iArr, i, i2, z, str2, i3, i4);
    }

    public static int getVideoFramesMore(String str, int[] iArr, int i, int i2, boolean z, boolean z2, int i3, boolean z3, Object obj) {
        return nativeGetVideoFrameMore(str, iArr, i, i2, z, z2, i3, z3, obj);
    }

    public static int detachAudioFromVideos(String str, String[] strArr, long[] jArr, long[] jArr2, long j, long j2, float[] fArr, int i, int i2, int i3) {
        return nativeDetachAudioFromVideos(str, strArr, jArr, jArr2, j, j2, fArr, i, i2, i3);
    }

    public static int concatRecordFrag(String[] strArr, long[] jArr, String[] strArr2, long[] jArr2, boolean z, int i, String str, String str2, String str3, String str4) {
        if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4) && strArr.length != 0 && jArr.length == strArr.length && strArr.length == strArr2.length && strArr.length == jArr2.length) {
            return nativeConcatRecordFrag(strArr, jArr, strArr2, jArr2, z, i, str, str2, str3, str4);
        }
        C45372t.m143409d("TEVideoUtils", "concatRecordFrag 参数错误");
        return -100;
    }

    public static int initAlgorithm(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, long j, long j2, int i, int i2, int i3) {
        long nativeCreateHandler = nativeCreateHandler();
        mHandler = nativeCreateHandler;
        return nativeInitAlgorithm(nativeCreateHandler, z, z2, z3, z4, z5, z6, j, j2, i, i3, i2);
    }
}

package com.p280ss.android.medialib;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.opengl.EGLContext;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.view.Surface;
import com.bef.effectsdk.message.MessageCenter;
import com.bef.effectsdk.message.MessageCenter.C1944a;
import com.p280ss.android.medialib.camera.ImageFrame;
import com.p280ss.android.medialib.common.C19702a.C19703a;
import com.p280ss.android.medialib.common.C19702a.C19704b;
import com.p280ss.android.medialib.common.C19705b;
import com.p280ss.android.medialib.common.C19706c;
import com.p280ss.android.medialib.log.C19752b;
import com.p280ss.android.medialib.model.C19754b;
import com.p280ss.android.medialib.model.EnigmaResult;
import com.p280ss.android.medialib.model.FaceAttributeInfo;
import com.p280ss.android.medialib.model.FaceDetectInfo;
import com.p280ss.android.medialib.model.SceneDetectInfo;
import com.p280ss.android.medialib.model.SkeletonInfo;
import com.p280ss.android.medialib.p880b.C19621a;
import com.p280ss.android.medialib.p880b.C19622b;
import com.p280ss.android.medialib.p880b.C19623c;
import com.p280ss.android.medialib.p880b.C19624d;
import com.p280ss.android.medialib.p883d.C19718d;
import com.p280ss.android.medialib.p884qr.ScanSettings;
import com.p280ss.android.medialib.presenter.IStickerRequestCallback;
import com.p280ss.android.ttve.monitor.C20479f;
import com.p280ss.android.ttve.nativePort.TENativeLibsLoader;
import com.p280ss.android.vesdk.C45336r;
import com.p280ss.android.vesdk.C45372t;
import com.p280ss.android.vesdk.LandMarkFrame;
import com.p280ss.android.vesdk.VEEffectParams;
import com.p280ss.android.vesdk.model.BefTextLayout;
import com.p280ss.android.vesdk.model.BefTextLayoutResult;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.medialib.FaceBeautyInvoker */
public class FaceBeautyInvoker implements C1944a {
    public static final int INVALID_ENV = -100001;
    public static final int INVALID_HANDLE = -100000;
    private static final String TAG = "FaceBeautyInvoker";
    private static C19613a mRecordStopCallback;
    private static Runnable sDuetCompleteRunable = null;
    private static C19621a sFaceDetectListener;
    private static C1944a sMessageListener;
    private static C19622b sNativeInitListener;
    private static List<C19623c> sSlamDetectListeners = new ArrayList();
    public C19615a mAVCEncoder;
    private C19620b mAVCEncoderInterface = new C19620b() {
        public final int getProfile() {
            return FaceBeautyInvoker.this.mAVCEncoder.f53094g;
        }

        public final void onSwapGlBuffers() {
            if (FaceBeautyInvoker.this.mHandler != 0) {
                FaceBeautyInvoker.this.nativeOnSwapGlBuffers(FaceBeautyInvoker.this.mHandler);
            }
        }

        public final void onUninitHardEncoder() {
            C45372t.m143403a(FaceBeautyInvoker.TAG, "FaceBeautyManager onUninitHardEncoder == enter");
            if (FaceBeautyInvoker.this.mAVCEncoder != null) {
                FaceBeautyInvoker.this.mAVCEncoder.mo52188b();
                FaceBeautyInvoker.this.mAVCEncoder = null;
                C45372t.m143403a(FaceBeautyInvoker.TAG, "====== uninitAVCEncoder ======");
            }
            C45372t.m143403a(FaceBeautyInvoker.TAG, "FaceBeautyManager onUninitHardEncoder == exit");
        }

        public final void setColorFormat(int i) {
            if (FaceBeautyInvoker.this.mHandler != 0) {
                FaceBeautyInvoker.this.nativeSetColorFormat(FaceBeautyInvoker.this.mHandler, i);
            }
        }

        public final void onSetCodecConfig(ByteBuffer byteBuffer) {
            String str = FaceBeautyInvoker.TAG;
            StringBuilder sb = new StringBuilder("onSetCodecConfig: data size = ");
            sb.append(byteBuffer.remaining());
            C45372t.m143405b(str, sb.toString());
            if (FaceBeautyInvoker.this.mHandler != 0) {
                FaceBeautyInvoker.this.nativeSetCodecConfig(FaceBeautyInvoker.this.mHandler, byteBuffer, byteBuffer.remaining());
            }
        }

        public final void onEncoderData(byte[] bArr, int i, boolean z) {
            C45372t.m143405b(FaceBeautyInvoker.TAG, "FaceBeautyManager onEncoderData == enter");
            if (FaceBeautyInvoker.this.mAVCEncoder != null) {
                FaceBeautyInvoker.this.mAVCEncoder.mo52184a(bArr, i, z);
            }
            C45372t.m143405b(FaceBeautyInvoker.TAG, "FaceBeautyManager onEncoderData == exit");
        }

        public final int onEncoderData(int i, int i2, int i3, boolean z) {
            C45372t.m143405b(FaceBeautyInvoker.TAG, "onEncoderData: ...");
            if (FaceBeautyInvoker.this.mAVCEncoder != null) {
                return FaceBeautyInvoker.this.mAVCEncoder.mo52183a(i, i2, i3, z);
            }
            return 0;
        }

        public final void onWriteFile(ByteBuffer byteBuffer, int i, int i2, int i3) {
            if (FaceBeautyInvoker.this.mHandler != 0) {
                FaceBeautyInvoker.this.nativeWriteFile(FaceBeautyInvoker.this.mHandler, byteBuffer, byteBuffer.remaining(), i, i3);
            }
        }

        public final void onWriteFile(ByteBuffer byteBuffer, long j, long j2, int i, int i2) {
            if (FaceBeautyInvoker.this.mHandler != 0) {
                FaceBeautyInvoker.this.nativeWriteFile2(FaceBeautyInvoker.this.mHandler, byteBuffer, byteBuffer.remaining(), j, j2, i2);
            }
        }

        public final Surface onInitHardEncoder(int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
            C45372t.m143403a(FaceBeautyInvoker.TAG, "FaceBeautyManager onInitHardEncoder == enter");
            String str = FaceBeautyInvoker.TAG;
            StringBuilder sb = new StringBuilder("width = ");
            int i7 = i;
            sb.append(i);
            sb.append("\theight = ");
            int i8 = i2;
            sb.append(i2);
            C45372t.m143403a(str, sb.toString());
            if (FaceBeautyInvoker.this.mAVCEncoder == null) {
                FaceBeautyInvoker.this.mAVCEncoder = new C19615a();
            }
            C19615a.m64590a((C19620b) this);
            Surface a = FaceBeautyInvoker.this.mAVCEncoder.mo52185a(i, i2, i3, i4, i5, i6, z);
            if (a == null) {
                FaceBeautyInvoker.this.mAVCEncoder.mo52188b();
                FaceBeautyInvoker.this.mAVCEncoder = null;
                FaceBeautyInvoker.this.setHardEncoderStatus(false);
                return null;
            }
            C45372t.m143409d(FaceBeautyInvoker.TAG, "====== initAVCEncoder succeed ======");
            FaceBeautyInvoker.this.setHardEncoderStatus(true);
            C45372t.m143403a(FaceBeautyInvoker.TAG, "FaceBeautyManager onInitHardEncoder == exit");
            return a;
        }
    };
    private Runnable mDuetCompleteRunable;
    private C19620b mEncoderCaller = this.mAVCEncoderInterface;
    private C19621a mFaceDetectListener;
    public long mHandler = 0;
    private boolean mIsDuringScreenshot;
    private boolean mIsRenderReady = false;
    private List<C45336r> mLandmarkDetectListeners = new ArrayList();
    private C1944a mMessageListener;
    private C19622b mNativeInitListener;
    private C19703a mOpenGLCallback;
    private C19704b mShotScreenCallback;
    private List<C19623c> mSlamDetectListeners = new ArrayList();
    private C19624d mTextureTimeListener;
    private Handler mainHandler = new Handler(Looper.getMainLooper());

    /* renamed from: com.ss.android.medialib.FaceBeautyInvoker$EffectAlgorithmCallback */
    public interface EffectAlgorithmCallback {
        void onResult(int[] iArr, long[] jArr, float f);
    }

    /* renamed from: com.ss.android.medialib.FaceBeautyInvoker$FaceInfoCallback */
    public interface FaceInfoCallback {
        void onResult(FaceAttributeInfo faceAttributeInfo, FaceDetectInfo faceDetectInfo);
    }

    /* renamed from: com.ss.android.medialib.FaceBeautyInvoker$OnARTextBitmapCallback */
    public interface OnARTextBitmapCallback {
        BefTextLayoutResult onResult(String str, BefTextLayout befTextLayout);
    }

    /* renamed from: com.ss.android.medialib.FaceBeautyInvoker$OnARTextContentCallback */
    public interface OnARTextContentCallback {
        void onResult(String[] strArr);
    }

    /* renamed from: com.ss.android.medialib.FaceBeautyInvoker$OnARTextCountCallback */
    public interface OnARTextCountCallback {
        void onResult(int i);
    }

    /* renamed from: com.ss.android.medialib.FaceBeautyInvoker$OnCherEffectParmaCallback */
    public interface OnCherEffectParmaCallback {
        void onCherEffect(String[] strArr, double[] dArr, boolean[] zArr);
    }

    /* renamed from: com.ss.android.medialib.FaceBeautyInvoker$OnFrameCallback */
    public interface OnFrameCallback {
        void onFrame(int i, double d);

        void onFrame(ByteBuffer byteBuffer, int i, int i2, int i3, double d);

        void onInit(EGLContext eGLContext, int i, int i2, int i3, long j);
    }

    /* renamed from: com.ss.android.medialib.FaceBeautyInvoker$OnHandDetectCallback */
    public interface OnHandDetectCallback {
        void onResult(int[] iArr);
    }

    /* renamed from: com.ss.android.medialib.FaceBeautyInvoker$OnPictureCallback */
    public interface OnPictureCallback {
        void onResult(int[] iArr, int i, int i2);
    }

    /* renamed from: com.ss.android.medialib.FaceBeautyInvoker$OnPictureCallbackV2 */
    public interface OnPictureCallbackV2 {
        void onImage(int[] iArr, int i, int i2);

        void onResult(int i, int i2);
    }

    /* renamed from: com.ss.android.medialib.FaceBeautyInvoker$OnPreviewRadioListener */
    public interface OnPreviewRadioListener {
        void onInfo(int i, int i2);
    }

    /* renamed from: com.ss.android.medialib.FaceBeautyInvoker$OnRunningErrorCallback */
    public interface OnRunningErrorCallback {
        public static final int EXT_SHOT_SCREEN_FRAME_CAPTURED = 110;
        public static final int FRAG_HW_ENCODER_ERR = -601;
        public static final int INIT_FRAG_OUTPUT_ERR = -602;
        public static final int TYPE_SHOT_SCREEN = 1030;

        void onError(int i);

        void onInfo(int i, int i2);
    }

    /* renamed from: com.ss.android.medialib.FaceBeautyInvoker$OnSceneDetectCallback */
    public interface OnSceneDetectCallback {
        void onResult(SceneDetectInfo sceneDetectInfo);
    }

    /* renamed from: com.ss.android.medialib.FaceBeautyInvoker$OnSkeletonDetectCallback */
    public interface OnSkeletonDetectCallback {
        void onResult(SkeletonInfo skeletonInfo);
    }

    /* renamed from: com.ss.android.medialib.FaceBeautyInvoker$OnSmartBeautyCallback */
    public interface OnSmartBeautyCallback {
        void onResult(C19754b bVar);
    }

    /* renamed from: com.ss.android.medialib.FaceBeautyInvoker$a */
    public interface C19613a {
        /* renamed from: a */
        void mo52141a();
    }

    public static C19622b getNativeInitListener() {
        return sNativeInitListener;
    }

    private boolean isRenderReady() {
        return this.mIsRenderReady;
    }

    private native int nativeAddPCMData(long j, byte[] bArr, int i);

    private native int nativeBindEffectAudioProcessor(long j, int i, int i2, boolean z);

    private native void nativeCancelAll(long j);

    private native int nativeChangeMusicPath(long j, String str);

    private native void nativeChangeOutputVideoSize(long j, int i, int i2);

    private native void nativeChangePreviewRadioMode(long j, int i);

    private native int nativeChangeSurface(long j, Surface surface);

    private native int[] nativeCheckComposerNodeExclusion(long j, String str, String str2, String str3);

    private native void nativeChooseAreaFromRatio34(long j, float f);

    private native void nativeChooseSlamFace(long j, int i);

    private native int nativeClearFragFile(long j);

    private native int nativeCloseWavFile(long j, boolean z);

    private native int nativeConcat(long j, String str, String str2, int i, String str3, String str4, boolean z);

    private native long nativeCreate();

    private native int nativeDeleteLastFrag(long j);

    private native void nativeEnableAbandonFirstFrame(long j, boolean z);

    private native int nativeEnableBlindWaterMark(long j, boolean z);

    private native void nativeEnableEffect(long j, boolean z);

    private native void nativeEnableEffectBGM(long j, boolean z);

    private native void nativeEnableFaceBeautifyDetect(long j, int i);

    private native void nativeEnableFaceExtInfo(int i);

    private native void nativeEnableLandMark(long j, boolean z);

    private native int nativeEnableLandMarkGps(long j, boolean z);

    private native void nativeEnablePBO(boolean z);

    private native void nativeEnableScan(long j, boolean z, long j2);

    private native void nativeEnableSceneRecognition(long j, boolean z);

    private native void nativeEnableSkeletonDetect(long j, boolean z);

    private native void nativeEnableSmartBeauty(long j, boolean z);

    private native void nativeEnableStickerRecognition(long j, boolean z);

    private native void nativeEnableUse16BitAlign(long j, boolean z);

    private native void nativeEnableWaterMark(long j, boolean z);

    private native int nativeExpandPreviewAndRecordInterval(long j, boolean z);

    private native long nativeGetAudioEndTime(long j);

    private native long nativeGetEndFrameTime(long j);

    private native EnigmaResult nativeGetEnigmaResult(long j);

    private native boolean nativeGetFaceClustingResult(long j);

    private native float nativeGetFilterIntensity(long j, String str);

    private native long nativeGetLastAudioLength(long j);

    private native float nativeGetReactionCamRotation(long j);

    private native int[] nativeGetReactionCameraPosInRecordPixel(long j);

    private native int[] nativeGetReactionCameraPosInViewPixel(long j);

    private native int[] nativeGetReactionPosMarginInViewPixel(long j);

    private native int nativeGetSlamFaceCount(long j);

    private native int nativeHideSlamKeyBoard(long j, boolean z);

    private native int nativeInitAudioConfig(long j, int i, int i2, int i3, int i4);

    private native int nativeInitAudioPlayer(long j, String str, int i, int i2, long j2, boolean z, boolean z2, int i3);

    private native int nativeInitDuet(long j, String str, float f, float f2, float f3, boolean z);

    private native void nativeInitFaceBeautifyDetectExtParam(long j, boolean z, boolean z2, boolean z3);

    private native void nativeInitFaceBeautyDetectExtParam(long j, boolean z);

    private native int nativeInitFaceBeautyPlay(long j, int i, int i2, String str, int i3, int i4, String str2, int i5, boolean z, boolean z2);

    private native int nativeInitFaceBeautyPlayOnlyPreview(long j, ScanSettings scanSettings);

    private native void nativeInitFaceDetectExtParam(long j, int i, boolean z, boolean z2);

    private native void nativeInitHDRNetDetectExtParam(long j, boolean z, String str);

    private native void nativeInitHandDetectExtParam(long j, int i, int i2, int i3);

    private native int nativeInitImageDrawer(long j, int i);

    private native int nativeInitMediaCodecSurface(long j, Surface surface);

    private native int nativeInitReaction(long j, String str);

    private native int nativeInitWavFile(long j, int i, int i2, double d);

    private native boolean nativeIsQualcomm(long j);

    private native boolean nativeIsStickerEnabled(long j);

    private native int nativeMarkPlayDone(long j);

    private native int nativeOnAudioCallback(long j, byte[] bArr, int i);

    private native int nativeOnDrawFrameBuffer(long j, byte[] bArr, int i, int i2, int i3);

    private native int nativeOnDrawFrameBuffer2(long j, ByteBuffer byteBuffer, int[] iArr, ByteBuffer byteBuffer2, int[] iArr2, ByteBuffer byteBuffer3, int[] iArr3, int i, int i2, int i3);

    private native int nativeOnDrawFrameBuffer3(long j, byte[] bArr, int i, int i2, int i3, int i4);

    private native int nativeOnDrawFrameBuffer4(long j, ByteBuffer byteBuffer, int[] iArr, ByteBuffer byteBuffer2, int[] iArr2, ByteBuffer byteBuffer3, int[] iArr3, int i, int i2, int i3, int i4);

    private native int nativeOnFrameAvailable(long j, int i, float[] fArr);

    private native int nativeOnFrameTime(long j, double d);

    private native int nativePauseEffectAudio(long j, boolean z);

    private native boolean nativePosInReactionRegion(long j, int i, int i2);

    private native void nativePreviewVideoBg(long j);

    private native int nativeProcessTouchEvent(long j, float f, float f2);

    private native void nativeRecoverCherEffect(long j, String[] strArr, double[] dArr, boolean[] zArr);

    private native void nativeRegisterCherEffectParamCallback(long j, OnCherEffectParmaCallback onCherEffectParmaCallback);

    private native void nativeRegisterEffectAlgorithmCallback(long j, EffectAlgorithmCallback effectAlgorithmCallback);

    private native void nativeRegisterFaceInfoUpload(long j, boolean z, FaceInfoCallback faceInfoCallback);

    private native void nativeRegisterHandDetectCallback(long j, int[] iArr, OnHandDetectCallback onHandDetectCallback);

    private native void nativeRegisterSceneDetectCallback(long j, OnSceneDetectCallback onSceneDetectCallback);

    private native void nativeRegisterSkeletonDetectCallback(long j, OnSkeletonDetectCallback onSkeletonDetectCallback);

    private native void nativeRegisterSmartBeautyCallback(long j, OnSmartBeautyCallback onSmartBeautyCallback);

    private native int nativeRenderPicture(long j, byte[] bArr, int i, int i2, int i3, OnPictureCallbackV2 onPictureCallbackV2);

    private native int nativeRenderPicture2(long j, ByteBuffer byteBuffer, int[] iArr, ByteBuffer byteBuffer2, int[] iArr2, ByteBuffer byteBuffer3, int[] iArr3, int i, int i2, int i3, int i4, int i5, OnPictureCallbackV2 onPictureCallbackV2);

    private native int nativeRenderPicture3(long j, Bitmap bitmap, int i, int i2, OnPictureCallbackV2 onPictureCallbackV2);

    private native void nativeResetPerfStats(long j);

    private native int nativeResetStartTime(long j, long j2, long j3);

    private native float nativeRotateReactionWindow(long j, float f);

    private native int nativeSave(long j);

    private native int[] nativeScaleReactionWindow(long j, float f);

    private native void nativeSendEffectMonitor(long j);

    private native void nativeSendEffectMsg(long j, int i, long j2, long j3, String str);

    private native void nativeSetAlgorithmChangeMsg(long j, int i, boolean z);

    private native int nativeSetBGMVolume(long j, float f);

    private native int nativeSetBeautyFace(long j, int i, String str);

    private native int nativeSetBeautyFaceIntensity(long j, float f, float f2);

    private native int nativeSetBlindWaterMarkDiffKeys(long j, int i, int i2);

    private native int nativeSetBlindWaterMarkPosition(long j, int i, int i2);

    private native void nativeSetCamPreviewSize(long j, int i, int i2);

    private native void nativeSetCameraClose(long j, boolean z);

    private native void nativeSetCameraFirstFrameOptimize(long j, boolean z);

    private native void nativeSetCustomVideoBg(long j, String str, String str2, String str3, int i, int i2, long j2, boolean z, int i3);

    private native int nativeSetDLEEnable(long j, boolean z);

    private native void nativeSetDetectInterval(long j, int i);

    private native void nativeSetDetectionMode(long j, boolean z);

    private native int nativeSetDeviceRotationWithStamp(long j, float[] fArr, double d);

    private native int nativeSetDoubleFilterNew(long j, String str, String str2, float f, float f2, float f3);

    private native void nativeSetDuetCameraPaused(long j, boolean z);

    private native void nativeSetEffectBuildChainType(long j, int i);

    private native int nativeSetFaceMakeUp(long j, String str, float f, float f2);

    private native int nativeSetFaceMakeUp2(long j, String str);

    private native int nativeSetFilter(long j, String str, String str2, float f);

    private native int nativeSetFilterIntensity(long j, float f);

    private native int nativeSetFilterNew(long j, String str, float f);

    private native int nativeSetFilterPos(long j, float f);

    private native int nativeSetFrameCallback(long j, OnFrameCallback onFrameCallback, boolean z, int i);

    private native int nativeSetHandDetectLowpower(long j, boolean z);

    private native int nativeSetHardEncoderStatus(long j, boolean z);

    private native int nativeSetIntensityByType(long j, int i, float f);

    private native void nativeSetLandMarkInfo(long j, LandMarkFrame landMarkFrame);

    private native void nativeSetMemoryOpt(long j, boolean z);

    private native void nativeSetModeChangeState(long j, int i);

    private native int nativeSetMusicNodes(long j, String str);

    private native int nativeSetMusicTime(long j, long j2, long j3);

    private native void nativeSetNativeLibraryDir(String str);

    private native void nativeSetPaddingBottomInRatio34(long j, float f);

    private native int nativeSetPlayLength(long j, long j2);

    private native void nativeSetPreviewSizeRatio(long j, float f, int i, int i2);

    private native void nativeSetReactionBorderParam(long j, int i, int i2);

    private native boolean nativeSetReactionMaskImage(long j, String str, boolean z);

    private native void nativeSetReactionPosMargin(long j, int i, int i2, int i3, int i4);

    private native void nativeSetRenderCacheString(long j, String str, String str2);

    private native void nativeSetRenderCacheTexture(long j, String str, String str2);

    private native int nativeSetReshape(long j, String str, float f, float f2);

    private native int nativeSetReshapeResource(long j, String str);

    private native int nativeSetRunningErrorCallback(long j, OnRunningErrorCallback onRunningErrorCallback);

    private native void nativeSetScale(long j, float f);

    private native void nativeSetScanArea(long j, float f, float f2, float f3, float f4);

    private native boolean nativeSetSharedTextureStatus(boolean z);

    private native int nativeSetSkinTone(long j, String str);

    private native int nativeSetSlamFace(long j, Bitmap bitmap);

    private native int nativeSetSlamInputText(long j, String str, int i, int i2, String str2);

    private native int nativeSetSticker(long j, Bitmap bitmap, int i, int i2);

    private native int nativeSetStickerPathWithTag(long j, String str, int i, int i2, boolean z, String str2);

    private native int nativeSetStickerPathWithTagSync(long j, String str, int i, int i2, String str2, String[] strArr, float[] fArr);

    private native int nativeSetSwapDuetRegion(long j, boolean z);

    private native int nativeSetSwapReactionRegion(long j, boolean z);

    private native int nativeSetUseMusic(long j, int i);

    private native void nativeSetVideoBgSpeed(long j, double d);

    private native int nativeSetVideoQuality(long j, int i, int i2);

    private native void nativeSetWaterMark(long j, String[] strArr, int i, int i2, int i3, int i4, int i5, int i6, int i7);

    private native void nativeSetWaterMark2(long j, Bitmap bitmap, int i, int i2, int i3, int i4, int i5, int i6, int i7);

    private native int nativeShotHDScreen(long j, String str, int[] iArr, boolean z, int i, OnPictureCallback onPictureCallback, boolean z2, OnPictureCallback onPictureCallback2);

    private native int nativeShotScreen(long j, String str, int[] iArr, boolean z, int i, OnPictureCallback onPictureCallback);

    private native int nativeSlamDeviceConfig(long j, boolean z, boolean z2, boolean z3, boolean z4);

    private native int nativeSlamGetTextBitmap(long j, OnARTextBitmapCallback onARTextBitmapCallback);

    private native int nativeSlamGetTextLimitCount(long j, OnARTextCountCallback onARTextCountCallback);

    private native int nativeSlamGetTextParagraphContent(long j, OnARTextContentCallback onARTextContentCallback);

    private native int nativeSlamProcessDoubleClickEvent(long j, float f, float f2);

    private native int nativeSlamProcessIngestAcc(long j, double d, double d2, double d3, double d4);

    private native int nativeSlamProcessIngestGra(long j, double d, double d2, double d3, double d4);

    private native int nativeSlamProcessIngestGyr(long j, double d, double d2, double d3, double d4);

    private native int nativeSlamProcessIngestOri(long j, double[] dArr, double d);

    private native int nativeSlamProcessPanEvent(long j, float f, float f2, float f3, float f4, float f5);

    private native int nativeSlamProcessRotationEvent(long j, float f, float f2);

    private native int nativeSlamProcessScaleEvent(long j, float f, float f2);

    private native int nativeSlamProcessTouchEvent(long j, float f, float f2);

    private native int nativeSlamProcessTouchEventByType(long j, int i, float f, float f2, int i2);

    private native int nativeSlamSetLanguge(long j, String str);

    private native int nativeSlamSetTextBitmapResult(long j, Bitmap bitmap, int i, int i2, int i3);

    private native int nativeStartPlay(long j, Surface surface, int i, int i2, String str);

    private native int nativeStartPlay2(long j, int i, int i2, int i3, int i4, String str);

    private native int nativeStartRecord(long j, double d, boolean z, int i, int i2, int i3, String str, String str2);

    private native int nativeStopPlay(long j);

    private native int nativeStopRecord(long j, boolean z);

    private native int nativeTryRestore(long j, int i, String str);

    private native void nativeUnRegisterEffectAlgorithmCallback(long j);

    private native void nativeUnRegisterFaceInfoUpload(long j);

    private native int nativeUninitAudioPlayer(long j);

    private native int nativeUninitFaceBeautyPlay(long j);

    private native void nativeUpdateAlgorithmRuntimeParam(long j, int i, float f);

    private native void nativeUpdateReactionBGAlpha(long j, float f);

    private native int[] nativeUpdateReactionCameraPos(long j, int i, int i2, int i3, int i4);

    private native int[] nativeUpdateReactionCameraPosWithRotation(long j, int i, int i2, int i3, int i4, float f);

    private native void nativeUpdateRotation(long j, float f, float f2, float f3);

    private native void nativeUpdateRotationAndFront(long j, int i, boolean z);

    private native void nativeUseLargeMattingModel(long j, boolean z);

    private native void setCaptureMirror(long j, boolean z);

    private native void setCaptureResize(long j, boolean z, int[] iArr, int[] iArr2);

    private native void setImageExposure(long j, float f);

    public void destroyMessageCenter() {
        MessageCenter.removeListener(this);
    }

    public void initMessageCenter() {
        MessageCenter.addListener(this);
    }

    public native int nativeAnimateImageToPreview(long j, String str, String str2, int i);

    public native int nativeAppendComposerNodes(long j, String[] strArr, int i);

    public native void nativeEnable3buffer(long j, boolean z);

    public native int nativeEnableEffectRT(long j, boolean z);

    public native void nativeForceFirstFrameHasEffect(long j, boolean z);

    public native String nativeGetComposerNodePaths(long j);

    public native float nativeGetComposerNodeValue(long j, String str, String str2);

    public native void nativeOnSwapGlBuffers(long j);

    public native boolean nativePreviewDuetVideo(long j);

    public native int nativeReloadComposerNodes(long j, String[] strArr, int i);

    public native int nativeRemoveComposerNodes(long j, String[] strArr, int i);

    public native int nativeReplaceComposerNodes(long j, String[] strArr, int i, String[] strArr2, int i2);

    public native int nativeSetAlgorithmPreConfig(long j, int i, int i2);

    public native int nativeSetClientState(long j, int i);

    public native int nativeSetCodecConfig(long j, ByteBuffer byteBuffer, int i);

    public native int nativeSetColorFormat(long j, int i);

    public native int nativeSetComposerMode(long j, int i, int i2);

    public native int nativeSetComposerNodes(long j, String[] strArr, int i);

    public native int nativeSetComposerResourcePath(long j, String str);

    public native int nativeSetDropFrames(long j, int i);

    public native int nativeSetEffectMaxMemoryCache(long j, int i);

    public native void nativeSetForceAlgorithmCnt(long j, int i);

    public native int nativeSetMaleMakeupState(long j, boolean z);

    public native void nativeSetPreviewDuetVideoPaused(long j, boolean z);

    public native int nativeSetPreviewRadioListener(long j, OnPreviewRadioListener onPreviewRadioListener);

    public native int nativeSetStickerRequestCallback(long j, IStickerRequestCallback iStickerRequestCallback);

    public native int nativeSetVEEffectParams(long j, VEEffectParams vEEffectParams);

    public native int nativeUpdateComposerNode(long j, String str, String str2, float f);

    public native int nativeWriteFile(long j, ByteBuffer byteBuffer, int i, int i2, int i3);

    public native int nativeWriteFile2(long j, ByteBuffer byteBuffer, int i, long j2, long j3, int i2);

    static {
        TENativeLibsLoader.m67988e();
    }

    public static synchronized void clearSlamDetectListener() {
        synchronized (FaceBeautyInvoker.class) {
            sSlamDetectListeners.clear();
        }
    }

    public void cancelAll() {
        if (this.mHandler != 0) {
            nativeCancelAll(this.mHandler);
        }
    }

    public synchronized void clearLandMarkDetectListener() {
        this.mLandmarkDetectListeners.clear();
    }

    public synchronized void clearSlamDetectListener2() {
        this.mSlamDetectListeners.clear();
    }

    public void initHardEncoderInAdvance() {
        if (this.mAVCEncoder == null) {
            this.mAVCEncoder = new C19615a();
        }
    }

    public void onNativeRecordStop() {
        if (mRecordStopCallback != null) {
            mRecordStopCallback.mo52141a();
        }
    }

    public void previewVideoBg() {
        if (this.mHandler != 0) {
            nativePreviewVideoBg(this.mHandler);
        }
    }

    public void releaseEncoder() {
        if (this.mAVCEncoder != null) {
            this.mAVCEncoder.mo52189c();
        }
    }

    public void resetPerfStats() {
        if (this.mHandler != 0) {
            nativeResetPerfStats(this.mHandler);
        }
    }

    public void uninitAudioPlayer() {
        if (this.mHandler != 0) {
            nativeUninitAudioPlayer(this.mHandler);
        }
    }

    private int onNativeCallback_GetHardEncoderProfile() {
        if (this.mEncoderCaller == null) {
            return -1;
        }
        C45372t.m143403a(TAG, "GetHardEncoderProfile");
        return this.mEncoderCaller.getProfile();
    }

    public int clearFragFile() {
        if (this.mHandler == 0) {
            return INVALID_HANDLE;
        }
        return nativeClearFragFile(this.mHandler);
    }

    public void createEncoder() {
        if (this.mAVCEncoder == null) {
            this.mAVCEncoder = new C19615a();
        }
        this.mAVCEncoder.mo52187a();
    }

    public int deleteLastFrag() {
        if (this.mHandler == 0) {
            return INVALID_HANDLE;
        }
        return nativeDeleteLastFrag(this.mHandler);
    }

    public long getAudioEndTime() {
        if (this.mHandler == 0) {
            return -100000;
        }
        return nativeGetAudioEndTime(this.mHandler);
    }

    public String getComposerNodePaths() {
        if (this.mHandler != 0) {
            return nativeGetComposerNodePaths(this.mHandler);
        }
        C45372t.m143409d(TAG, "Native instance handle == 0 invalid.");
        return "";
    }

    public long getEndFrameTime() {
        if (this.mHandler == 0) {
            return -100000;
        }
        return nativeGetEndFrameTime(this.mHandler);
    }

    public EnigmaResult getEnigmaResult() {
        if (this.mHandler != 0) {
            return nativeGetEnigmaResult(this.mHandler);
        }
        C45372t.m143409d(TAG, "invalid handle");
        return null;
    }

    public boolean getFaceClustingResult() {
        if (this.mHandler == 0) {
            return true;
        }
        return nativeGetFaceClustingResult(this.mHandler);
    }

    public long getLastAudioLength() {
        if (this.mHandler == 0) {
            return -100000;
        }
        return nativeGetLastAudioLength(this.mHandler);
    }

    public float getReactionCamRotation() {
        if (this.mHandler == 0) {
            return -100000.0f;
        }
        return nativeGetReactionCamRotation(this.mHandler);
    }

    public int[] getReactionCameraPosInRecordPixel() {
        if (this.mHandler == 0) {
            return null;
        }
        return nativeGetReactionCameraPosInRecordPixel(this.mHandler);
    }

    public int[] getReactionCameraPosInViewPixel() {
        if (this.mHandler == 0) {
            return null;
        }
        return nativeGetReactionCameraPosInViewPixel(this.mHandler);
    }

    public int[] getReactionPosMarginInViewPixel() {
        if (this.mHandler == 0) {
            return null;
        }
        return nativeGetReactionPosMarginInViewPixel(this.mHandler);
    }

    public int getSlamFaceCount() {
        if (this.mHandler != 0) {
            return nativeGetSlamFaceCount(this.mHandler);
        }
        C45372t.m143409d(TAG, "invalid handle");
        return INVALID_HANDLE;
    }

    public boolean isStickerEnabled() {
        if (this.mHandler != 0) {
            return nativeIsStickerEnabled(this.mHandler);
        }
        C45372t.m143409d(TAG, "invalid handle");
        return false;
    }

    public int markPlayDone() {
        if (this.mHandler == 0) {
            return INVALID_HANDLE;
        }
        return nativeMarkPlayDone(this.mHandler);
    }

    public void onDuetVideoComplete() {
        if (this.mDuetCompleteRunable != null) {
            this.mDuetCompleteRunable.run();
        }
        if (sDuetCompleteRunable != null) {
            sDuetCompleteRunable.run();
        }
    }

    public void onNativeCallback_UninitHardEncoder() {
        C45372t.m143403a(TAG, " onUninitHardEncoder == enter");
        if (this.mEncoderCaller != null) {
            this.mEncoderCaller.onUninitHardEncoder();
        }
        C45372t.m143403a(TAG, " onUninitHardEncoder == exit");
    }

    public void onNativeCallback_onOpenGLCreate() {
        C45372t.m143403a(TAG, "onNativeCallback_onOpenGLCreate");
        if (this.mOpenGLCallback != null) {
            this.mOpenGLCallback.mo52265a();
        }
    }

    public void onNativeCallback_onOpenGLDestroy() {
        C45372t.m143403a(TAG, "onNativeCallback_onOpenGLDestroy");
        if (this.mOpenGLCallback != null) {
            this.mOpenGLCallback.mo52266b();
        }
    }

    public int onNativeCallback_onOpenGLRunning() {
        C45372t.m143405b(TAG, "onNativeCallback_onOpenGLRunning");
        if (this.mOpenGLCallback != null) {
            return this.mOpenGLCallback.mo52267c();
        }
        return 0;
    }

    public boolean previewDuetVideo() {
        if (this.mHandler == 0) {
            return false;
        }
        return nativePreviewDuetVideo(this.mHandler);
    }

    public int save() {
        if (this.mHandler == 0) {
            return INVALID_HANDLE;
        }
        return nativeSave(this.mHandler);
    }

    public int stopPlay() {
        this.mIsRenderReady = false;
        if (this.mHandler == 0) {
            return INVALID_HANDLE;
        }
        destroyMessageCenter();
        return nativeStopPlay(this.mHandler);
    }

    public void unRegisterEffectAlgorithmCallback() {
        if (this.mHandler == 0) {
            C45372t.m143409d(TAG, "invalid handle");
        } else {
            nativeUnRegisterEffectAlgorithmCallback(this.mHandler);
        }
    }

    public void unRegisterFaceInfoUpload() {
        if (this.mHandler == 0) {
            C45372t.m143409d(TAG, "invalid handle");
        } else {
            nativeUnRegisterFaceInfoUpload(this.mHandler);
        }
    }

    public int uninitFaceBeautyPlay() {
        int nativeUninitFaceBeautyPlay;
        if (this.mHandler == 0) {
            return INVALID_HANDLE;
        }
        synchronized (this) {
            long j = this.mHandler;
            this.mHandler = 0;
            this.mTextureTimeListener = null;
            this.mShotScreenCallback = null;
            mRecordStopCallback = null;
            this.mNativeInitListener = null;
            this.mFaceDetectListener = null;
            this.mMessageListener = null;
            sMessageListener = null;
            nativeUninitFaceBeautyPlay = nativeUninitFaceBeautyPlay(j);
        }
        return nativeUninitFaceBeautyPlay;
    }

    public static void setDuetVideoCompleteCallback(Runnable runnable) {
        sDuetCompleteRunable = runnable;
    }

    public static void setFaceDetectListener(C19621a aVar) {
        sFaceDetectListener = aVar;
    }

    public static void setNativeInitListener(C19622b bVar) {
        sNativeInitListener = bVar;
    }

    public static void setRecordStopCallback(C19613a aVar) {
        mRecordStopCallback = aVar;
    }

    public void enableFaceExtInfo(int i) {
        nativeEnableFaceExtInfo(i);
    }

    public void setDuetVideoCompleteCallback2(Runnable runnable) {
        this.mDuetCompleteRunable = runnable;
    }

    public void setFaceDetectListener2(C19621a aVar) {
        this.mFaceDetectListener = aVar;
    }

    public void setMessageListenerV2(C1944a aVar) {
        this.mMessageListener = aVar;
    }

    public void setNativeInitListener2(C19622b bVar) {
        this.mNativeInitListener = bVar;
    }

    public void setOnOpenGLCallback(C19703a aVar) {
        this.mOpenGLCallback = aVar;
    }

    public void setTextureTimeListener(C19624d dVar) {
        this.mTextureTimeListener = dVar;
    }

    public void enableFaceBeautifyDetect(int i) {
        nativeEnableFaceBeautifyDetect(this.mHandler, i);
    }

    public void enableSceneRecognition(boolean z) {
        nativeEnableSceneRecognition(this.mHandler, z);
    }

    public void enableSkeletonDetect(boolean z) {
        nativeEnableSkeletonDetect(this.mHandler, z);
    }

    public void enableSmartBeauty(boolean z) {
        nativeEnableSmartBeauty(this.mHandler, z);
    }

    public void enableStickerRecognition(boolean z) {
        nativeEnableStickerRecognition(this.mHandler, z);
    }

    public void setCaptureMirror(boolean z) {
        setCaptureMirror(this.mHandler, z);
    }

    public void setImageExposure(float f) {
        setImageExposure(this.mHandler, f);
    }

    public static synchronized void addSlamDetectListener(C19623c cVar) {
        synchronized (FaceBeautyInvoker.class) {
            if (cVar != null) {
                sSlamDetectListeners.add(cVar);
            }
        }
    }

    public static synchronized void removeSlamDetectListener(C19623c cVar) {
        synchronized (FaceBeautyInvoker.class) {
            sSlamDetectListeners.remove(cVar);
        }
    }

    public static synchronized void setMessageListener(C1944a aVar) {
        synchronized (FaceBeautyInvoker.class) {
            sMessageListener = aVar;
        }
    }

    public static synchronized void setSlamDetectListener(C19623c cVar) {
        synchronized (FaceBeautyInvoker.class) {
            addSlamDetectListener(cVar);
        }
    }

    public synchronized void addLandMarkDetectListener(C45336r rVar) {
        this.mLandmarkDetectListeners.add(rVar);
    }

    public synchronized void addSlamDetectListener2(C19623c cVar) {
        if (cVar != null) {
            this.mSlamDetectListeners.add(cVar);
        }
    }

    public ByteBuffer allocateFrame(int i) {
        return ByteBuffer.allocateDirect(i).order(ByteOrder.LITTLE_ENDIAN);
    }

    public void chooseAreaFromRatio34(float f) {
        if (this.mHandler != 0) {
            nativeChooseAreaFromRatio34(this.mHandler, f);
        }
    }

    public void enable3buffer(boolean z) {
        if (this.mHandler != 0) {
            nativeEnable3buffer(this.mHandler, z);
        }
    }

    public void enableEffectRT(boolean z) {
        if (this.mHandler != 0) {
            nativeEnableEffectRT(this.mHandler, z);
        }
    }

    public void forceFirstFrameHasEffect(boolean z) {
        if (this.mHandler != 0) {
            nativeForceFirstFrameHasEffect(this.mHandler, z);
        }
    }

    public long getTextureDeltaTime(boolean z) {
        if (this.mTextureTimeListener != null) {
            return this.mTextureTimeListener.mo52207a(z);
        }
        return 0;
    }

    public synchronized void removeLandMarkDetectListener(C45336r rVar) {
        this.mLandmarkDetectListeners.remove(rVar);
    }

    public synchronized void removeSlamDetectListener2(C19623c cVar) {
        this.mSlamDetectListeners.remove(cVar);
    }

    public void setCameraClose(boolean z) {
        if (this.mHandler != 0) {
            nativeSetCameraClose(this.mHandler, z);
        }
    }

    public void setDetectionMode(boolean z) {
        if (this.mHandler != 0) {
            nativeSetDetectionMode(this.mHandler, z);
        }
    }

    public void setDeviceRotation(float[] fArr) {
        if (isRenderReady()) {
            setDeviceRotation(fArr, -1.0d);
        }
    }

    public void setDuetCameraPaused(boolean z) {
        if (this.mHandler != 0) {
            nativeSetDuetCameraPaused(this.mHandler, z);
        }
    }

    public void setEffectBuildChainType(int i) {
        if (this.mHandler != 0) {
            nativeSetEffectBuildChainType(this.mHandler, i);
        }
    }

    public void setNativeLibraryDir(String str) {
        if (!TextUtils.isEmpty(str)) {
            nativeSetNativeLibraryDir(str);
        }
    }

    public void setPaddingBottomInRatio34(float f) {
        if (this.mHandler != 0) {
            nativeSetPaddingBottomInRatio34(this.mHandler, f);
        }
    }

    public void setPreviewDuetVideoPaused(boolean z) {
        if (this.mHandler != 0) {
            nativeSetPreviewDuetVideoPaused(this.mHandler, z);
        }
    }

    public void setPreviewRadioListener(OnPreviewRadioListener onPreviewRadioListener) {
        if (this.mHandler != 0) {
            nativeSetPreviewRadioListener(this.mHandler, onPreviewRadioListener);
        }
    }

    public void setRunningErrorCallback(OnRunningErrorCallback onRunningErrorCallback) {
        if (this.mHandler != 0) {
            nativeSetRunningErrorCallback(this.mHandler, onRunningErrorCallback);
        }
    }

    public void setScale(float f) {
        if (this.mHandler != 0) {
            nativeSetScale(this.mHandler, f);
        }
    }

    public void setSwapDuetRegion(boolean z) {
        if (this.mHandler != 0) {
            nativeSetSwapDuetRegion(this.mHandler, z);
        }
    }

    public void setSwapReactionRegion(boolean z) {
        if (this.mHandler != 0) {
            nativeSetSwapReactionRegion(this.mHandler, z);
        }
    }

    public void setVideoBgSpeed(double d) {
        if (this.mHandler != 0) {
            nativeSetVideoBgSpeed(this.mHandler, d);
        }
    }

    public void updateReactionBGAlpha(float f) {
        if (this.mHandler != 0) {
            nativeUpdateReactionBGAlpha(this.mHandler, f);
        }
    }

    public synchronized int changeMusicPath(String str) {
        if (this.mHandler == 0) {
            return INVALID_HANDLE;
        }
        return nativeChangeMusicPath(this.mHandler, str);
    }

    public synchronized void changePreviewRadioMode(int i) {
        if (this.mHandler != 0) {
            nativeChangePreviewRadioMode(this.mHandler, i);
        }
    }

    public synchronized int changeSurface(Surface surface) {
        if (this.mHandler == 0) {
            return INVALID_HANDLE;
        }
        return nativeChangeSurface(this.mHandler, surface);
    }

    public void chooseSlamFace(int i) {
        if (this.mHandler == 0) {
            C45372t.m143409d(TAG, "invalid handle");
        } else {
            nativeChooseSlamFace(this.mHandler, i);
        }
    }

    public int closeWavFile(boolean z) {
        if (this.mHandler == 0) {
            return INVALID_HANDLE;
        }
        int nativeCloseWavFile = nativeCloseWavFile(this.mHandler, z);
        save();
        return nativeCloseWavFile;
    }

    public void enableAbandonFirstFrame(boolean z) {
        if (this.mHandler == 0) {
            C19706c.m64972d(TAG, "invalid handle");
        } else {
            nativeEnableAbandonFirstFrame(this.mHandler, z);
        }
    }

    public int enableBlindWaterMark(boolean z) {
        if (this.mHandler == 0) {
            return INVALID_HANDLE;
        }
        return nativeEnableBlindWaterMark(this.mHandler, z);
    }

    public void enableEffect(boolean z) {
        if (this.mHandler == 0) {
            C45372t.m143409d(TAG, "invalid handle");
        } else {
            nativeEnableEffect(this.mHandler, z);
        }
    }

    public void enableEffectBGM(boolean z) {
        if (this.mHandler == 0) {
            C45372t.m143409d(TAG, "invalid handle");
        } else {
            nativeEnableEffectBGM(this.mHandler, z);
        }
    }

    public void enableLandMark(boolean z) {
        if (this.mHandler == 0) {
            C45372t.m143409d(TAG, "invalid handle");
        } else {
            nativeEnableLandMark(this.mHandler, z);
        }
    }

    public int enableLandMarkGps(boolean z) {
        if (this.mHandler != 0) {
            return nativeEnableLandMarkGps(this.mHandler, z);
        }
        C45372t.m143409d(TAG, "invalid handle");
        return -1;
    }

    public void enablePBO(boolean z) {
        if (this.mHandler == 0) {
            C45372t.m143409d(TAG, "invalid handle");
        }
        nativeEnablePBO(z);
    }

    public void enableWaterMark(boolean z) {
        if (this.mHandler == 0) {
            C45372t.m143409d(TAG, "invalid handle");
        } else {
            nativeEnableWaterMark(this.mHandler, z);
        }
    }

    public float getFilterIntensity(String str) {
        if (this.mHandler == 0) {
            return -100000.0f;
        }
        return nativeGetFilterIntensity(this.mHandler, str);
    }

    public void initFaceBeautyDetectExtParam(boolean z) {
        if (this.mHandler == 0) {
            C19706c.m64972d(TAG, "invalid handle");
        } else {
            nativeInitFaceBeautyDetectExtParam(this.mHandler, z);
        }
    }

    public int initFaceBeautyPlayOnlyPreview(ScanSettings scanSettings) {
        this.mHandler = nativeCreate();
        if (this.mHandler == 0) {
            return INVALID_HANDLE;
        }
        return nativeInitFaceBeautyPlayOnlyPreview(this.mHandler, scanSettings);
    }

    public int initImageDrawer(int i) {
        if (this.mHandler != 0) {
            return nativeInitImageDrawer(this.mHandler, i);
        }
        C45372t.m143409d(TAG, "invalid handle");
        return INVALID_HANDLE;
    }

    public int initMediaCodecSurface(Surface surface) {
        if (this.mHandler != 0) {
            return nativeInitMediaCodecSurface(this.mHandler, surface);
        }
        C45372t.m143409d(TAG, "invalid handle");
        return INVALID_HANDLE;
    }

    public int onDrawFrameTime(double d) {
        if (this.mHandler == 0) {
            return INVALID_HANDLE;
        }
        return nativeOnFrameTime(this.mHandler, d);
    }

    public void pauseEffectAudio(boolean z) {
        if (this.mHandler == 0) {
            C45372t.m143409d(TAG, "invalid handle");
            return;
        }
        if (isRenderReady()) {
            nativePauseEffectAudio(this.mHandler, z);
        }
    }

    public void registerCherEffectParamCallback(OnCherEffectParmaCallback onCherEffectParmaCallback) {
        if (this.mHandler == 0) {
            C45372t.m143409d(TAG, "invalid handle");
        } else {
            nativeRegisterCherEffectParamCallback(this.mHandler, onCherEffectParmaCallback);
        }
    }

    public void registerEffectAlgorithmCallback(EffectAlgorithmCallback effectAlgorithmCallback) {
        if (this.mHandler == 0) {
            C45372t.m143409d(TAG, "invalid handle");
        } else {
            nativeRegisterEffectAlgorithmCallback(this.mHandler, effectAlgorithmCallback);
        }
    }

    public void registerSceneDetectCallback(OnSceneDetectCallback onSceneDetectCallback) {
        if (this.mHandler == 0) {
            C45372t.m143409d(TAG, "invalid handle");
        } else {
            nativeRegisterSceneDetectCallback(this.mHandler, onSceneDetectCallback);
        }
    }

    public void registerSkeletonDetectCallback(OnSkeletonDetectCallback onSkeletonDetectCallback) {
        if (this.mHandler == 0) {
            C45372t.m143409d(TAG, "invalid handle");
        } else {
            nativeRegisterSkeletonDetectCallback(this.mHandler, onSkeletonDetectCallback);
        }
    }

    public void registerSmartBeautyCallback(OnSmartBeautyCallback onSmartBeautyCallback) {
        if (this.mHandler == 0) {
            C45372t.m143409d(TAG, "invalid handle");
        } else {
            nativeRegisterSmartBeautyCallback(this.mHandler, onSmartBeautyCallback);
        }
    }

    public float rotateReactionWindow(float f) {
        if (this.mHandler == 0) {
            return -100000.0f;
        }
        return nativeRotateReactionWindow(this.mHandler, f);
    }

    public int[] scaleReactionWindow(float f) {
        if (this.mHandler == 0) {
            return null;
        }
        return nativeScaleReactionWindow(this.mHandler, f);
    }

    public int setBGMVolume(float f) {
        if (this.mHandler == 0) {
            return INVALID_HANDLE;
        }
        return nativeSetBGMVolume(this.mHandler, f);
    }

    public void setCameraFirstFrameOptimize(boolean z) {
        if (this.mHandler == 0) {
            C19706c.m64972d(TAG, "invalid handle");
        } else {
            nativeSetCameraFirstFrameOptimize(this.mHandler, z);
        }
    }

    public void setClientState(int i) {
        if (this.mHandler == 0) {
            C45372t.m143409d(TAG, "invalid handle");
        }
        nativeSetClientState(this.mHandler, i);
    }

    public int setComposerResourcePath(String str) {
        if (this.mHandler != 0) {
            return nativeSetComposerResourcePath(this.mHandler, str);
        }
        C45372t.m143409d(TAG, "Native instance handle == 0 invalid.");
        return INVALID_HANDLE;
    }

    public void setDLEEnable(boolean z) {
        if (this.mHandler == 0) {
            C19706c.m64972d(TAG, "invalid handle");
        } else {
            nativeSetDLEEnable(this.mHandler, z);
        }
    }

    public void setDetectInterval(int i) {
        if (this.mHandler == 0) {
            C45372t.m143409d(TAG, "invalid handle");
        } else {
            nativeSetDetectInterval(this.mHandler, i);
        }
    }

    public void setDropFrames(int i) {
        if (this.mHandler == 0) {
            C45372t.m143409d(TAG, "invalid handle");
        } else {
            nativeSetDropFrames(this.mHandler, i);
        }
    }

    public int setEffectMaxMemoryCache(int i) {
        if (this.mHandler != 0) {
            return nativeSetEffectMaxMemoryCache(this.mHandler, i);
        }
        C45372t.m143409d(TAG, "invalid handle");
        return INVALID_HANDLE;
    }

    public int setFaceMakeUp(String str) {
        if (this.mHandler != 0) {
            return nativeSetFaceMakeUp2(this.mHandler, str);
        }
        C45372t.m143409d(TAG, "invalid handle");
        return INVALID_HANDLE;
    }

    public int setFilter(String str) {
        if (this.mHandler == 0) {
            return INVALID_HANDLE;
        }
        return nativeSetFilter(this.mHandler, str, str, 1.0f);
    }

    public int setFilterIntensity(float f) {
        if (this.mHandler == 0) {
            return INVALID_HANDLE;
        }
        return nativeSetFilterIntensity(this.mHandler, f);
    }

    public int setFilterPos(float f) {
        if (this.mHandler == 0) {
            return INVALID_HANDLE;
        }
        return nativeSetFilterPos(this.mHandler, f);
    }

    public void setForceAlgorithmCnt(int i) {
        if (this.mHandler == 0) {
            C45372t.m143409d(TAG, "invalid handle");
        } else {
            nativeSetForceAlgorithmCnt(this.mHandler, i);
        }
    }

    public int setHandDetectLowpower(boolean z) {
        if (this.mHandler != 0) {
            return nativeSetHandDetectLowpower(this.mHandler, z);
        }
        C45372t.m143409d(TAG, "invalid handle");
        return INVALID_HANDLE;
    }

    public int setHardEncoderStatus(boolean z) {
        if (this.mHandler == 0) {
            return INVALID_HANDLE;
        }
        return nativeSetHardEncoderStatus(this.mHandler, z);
    }

    public void setLandMarkInfo(LandMarkFrame landMarkFrame) {
        if (this.mHandler != 0 && isRenderReady()) {
            nativeSetLandMarkInfo(this.mHandler, landMarkFrame);
        }
    }

    public int setMaleMakeupState(boolean z) {
        if (this.mHandler == 0) {
            return INVALID_HANDLE;
        }
        return nativeSetMaleMakeupState(this.mHandler, z);
    }

    public void setMemoryOpt(boolean z) {
        if (this.mHandler == 0) {
            C19706c.m64972d(TAG, "invalid handle");
        } else {
            nativeSetMemoryOpt(this.mHandler, z);
        }
    }

    public synchronized void setModeChangeState(int i) {
        if (this.mHandler != 0) {
            nativeSetModeChangeState(this.mHandler, i);
        }
    }

    public int setMusicNodes(String str) {
        if (this.mHandler != 0) {
            return nativeSetMusicNodes(this.mHandler, str);
        }
        C45372t.m143409d(TAG, "invalid handle");
        return INVALID_HANDLE;
    }

    public int setPlayLength(long j) {
        if (this.mHandler == 0) {
            return INVALID_HANDLE;
        }
        return nativeSetPlayLength(this.mHandler, j);
    }

    public int setReshapeResource(String str) {
        if (this.mHandler != 0) {
            return nativeSetReshapeResource(this.mHandler, str);
        }
        C45372t.m143409d(TAG, "invalid handle");
        return INVALID_HANDLE;
    }

    public boolean setSharedTextureStatus(boolean z) {
        if (this.mHandler != 0) {
            return nativeSetSharedTextureStatus(z);
        }
        C45372t.m143409d(TAG, "invalid handle");
        return false;
    }

    public int setSkinTone(String str) {
        if (this.mHandler != 0) {
            return nativeSetSkinTone(this.mHandler, str);
        }
        C45372t.m143409d(TAG, "invalid handle");
        return INVALID_HANDLE;
    }

    public int setSlamFace(Bitmap bitmap) {
        if (this.mHandler != 0) {
            return nativeSetSlamFace(this.mHandler, bitmap);
        }
        C45372t.m143409d(TAG, "invalid handle");
        return INVALID_HANDLE;
    }

    public int setStickerRequestCallback(IStickerRequestCallback iStickerRequestCallback) {
        if (this.mHandler == 0) {
            return INVALID_HANDLE;
        }
        return nativeSetStickerRequestCallback(this.mHandler, iStickerRequestCallback);
    }

    public synchronized void setUseMusic(int i) {
        if (this.mHandler != 0) {
            nativeSetUseMusic(this.mHandler, i);
        }
    }

    public int setVEEffectParams(VEEffectParams vEEffectParams) {
        if (this.mHandler != 0) {
            return nativeSetVEEffectParams(this.mHandler, vEEffectParams);
        }
        C45372t.m143409d(TAG, "invalid handle");
        return INVALID_HANDLE;
    }

    public int slamGetTextBitmap(OnARTextBitmapCallback onARTextBitmapCallback) {
        if (this.mHandler != 0) {
            return nativeSlamGetTextBitmap(this.mHandler, onARTextBitmapCallback);
        }
        C19706c.m64972d(TAG, "invalid handle");
        return INVALID_HANDLE;
    }

    public int slamGetTextLimitCount(OnARTextCountCallback onARTextCountCallback) {
        if (this.mHandler != 0) {
            return nativeSlamGetTextLimitCount(this.mHandler, onARTextCountCallback);
        }
        C45372t.m143409d(TAG, "invalid handle");
        return INVALID_HANDLE;
    }

    public int slamGetTextParagraphContent(OnARTextContentCallback onARTextContentCallback) {
        if (this.mHandler != 0) {
            return nativeSlamGetTextParagraphContent(this.mHandler, onARTextContentCallback);
        }
        C45372t.m143409d(TAG, "invalid handle");
        return INVALID_HANDLE;
    }

    public int slamNotifyHideKeyBoard(boolean z) {
        if (this.mHandler != 0) {
            return nativeHideSlamKeyBoard(this.mHandler, z);
        }
        C45372t.m143409d(TAG, "invalid handle");
        return INVALID_HANDLE;
    }

    public int slamSetLanguge(String str) {
        if (this.mHandler != 0) {
            return nativeSlamSetLanguge(this.mHandler, str);
        }
        C45372t.m143409d(TAG, "invalid handle");
        return INVALID_HANDLE;
    }

    public int stopRecord(boolean z) {
        if (this.mHandler == 0) {
            return INVALID_HANDLE;
        }
        return nativeStopRecord(this.mHandler, z);
    }

    public void useLargeMattingModel(boolean z) {
        if (this.mHandler == 0) {
            C45372t.m143409d(TAG, "invalid handle");
        } else {
            nativeUseLargeMattingModel(this.mHandler, z);
        }
    }

    public synchronized void onNativeCallback_onShotScreen(int i) {
        String str = TAG;
        StringBuilder sb = new StringBuilder("onNativeCallback_onShotScreen: ret = ");
        sb.append(i);
        C45372t.m143403a(str, sb.toString());
        this.mIsDuringScreenshot = false;
        if (this.mShotScreenCallback != null) {
            this.mShotScreenCallback.mo52404a(i);
        }
    }

    private void onNativeCallback_Init(int i) {
        if (i < 0) {
            String str = TAG;
            StringBuilder sb = new StringBuilder("onNativeCallback_Init error = ");
            sb.append(i);
            C45372t.m143409d(str, sb.toString());
        } else {
            this.mIsRenderReady = true;
            String str2 = TAG;
            StringBuilder sb2 = new StringBuilder("onNativeCallback_Init success = ");
            sb2.append(i);
            C45372t.m143403a(str2, sb2.toString());
        }
        if (this.mNativeInitListener != null) {
            this.mNativeInitListener.mo52204a(i);
        }
        if (sNativeInitListener != null) {
            sNativeInitListener.mo52204a(i);
        }
        this.mIsRenderReady = true;
    }

    public void onNativeCallback_onSlamDetect(boolean z) {
        ArrayList<C19623c> arrayList = new ArrayList<>();
        synchronized (FaceBeautyInvoker.class) {
            for (C19623c add : sSlamDetectListeners) {
                arrayList.add(add);
            }
            for (C19623c add2 : this.mSlamDetectListeners) {
                arrayList.add(add2);
            }
        }
        for (C19623c cVar : arrayList) {
            if (cVar != null) {
                cVar.mo52206a(z);
            }
        }
    }

    public int onDrawFrame(ImageFrame imageFrame) {
        if (this.mHandler == 0) {
            return INVALID_HANDLE;
        }
        if (imageFrame.getBuf() != null) {
            nativeOnDrawFrameBuffer(this.mHandler, imageFrame.getBuf(), imageFrame.getBuf().length, imageFrame.getWidth(), imageFrame.getHeight());
        } else if (VERSION.SDK_INT >= 19 && imageFrame.getFormat() == -2) {
            int[][] iArr = (int[][]) Array.newInstance(int.class, new int[]{3, 3});
            ByteBuffer[] byteBufferArr = new ByteBuffer[3];
            if (new C19724i(imageFrame).mo52428a(iArr, byteBufferArr)) {
                return nativeOnDrawFrameBuffer2(this.mHandler, byteBufferArr[0], iArr[0], byteBufferArr[1], iArr[1], byteBufferArr[2], iArr[2], imageFrame.getFormat(), imageFrame.getWidth(), imageFrame.getHeight());
            }
        }
        return -1;
    }

    public void changeOutputVideoSize(int i, int i2) {
        if (this.mHandler != 0) {
            nativeChangeOutputVideoSize(this.mHandler, i, i2);
        }
    }

    public void setCamPreviewSize(int i, int i2) {
        if (this.mHandler != 0) {
            nativeSetCamPreviewSize(this.mHandler, i, i2);
        }
    }

    public void setReactionBorderParam(int i, int i2) {
        if (this.mHandler != 0) {
            nativeSetReactionBorderParam(this.mHandler, i, i2);
        }
    }

    public void updateRotation(int i, boolean z) {
        if (this.mHandler != 0) {
            nativeUpdateRotationAndFront(this.mHandler, i, z);
        }
    }

    public int addPCMData(byte[] bArr, int i) {
        if (this.mHandler == 0) {
            return INVALID_HANDLE;
        }
        return nativeAddPCMData(this.mHandler, bArr, i);
    }

    public int appendComposerNodes(String[] strArr, int i) {
        if (this.mHandler != 0) {
            return nativeAppendComposerNodes(this.mHandler, strArr, i);
        }
        C45372t.m143409d(TAG, "Native instance handle == 0 invalid.");
        return INVALID_HANDLE;
    }

    public void enableScan(boolean z, long j) {
        if (this.mHandler == 0) {
            C45372t.m143409d(TAG, "invalid handle");
            return;
        }
        nativeEnableScan(this.mHandler, z, j);
    }

    public float getComposerNodeValue(String str, String str2) {
        if (this.mHandler != 0) {
            return nativeGetComposerNodeValue(this.mHandler, str, str2);
        }
        C45372t.m143409d(TAG, "Native instance handle == 0 invalid.");
        return -100000.0f;
    }

    public void initHDRNetDetectExtParam(boolean z, String str) {
        if (this.mHandler == 0) {
            C19706c.m64972d(TAG, "invalid handle");
        } else {
            nativeInitHDRNetDetectExtParam(this.mHandler, z, str);
        }
    }

    public void onAudioCallback(byte[] bArr, int i) {
        if (this.mHandler != 0 && isRenderReady()) {
            nativeOnAudioCallback(this.mHandler, bArr, i);
        }
    }

    public int onDrawFrame(int i, float[] fArr) {
        if (this.mHandler == 0) {
            return INVALID_HANDLE;
        }
        return nativeOnFrameAvailable(this.mHandler, i, fArr);
    }

    public void onNativeCallback_onFaceDetect(int i, int i2) {
        String str = TAG;
        StringBuilder sb = new StringBuilder("FaceBeautyInvoker onFaceDetect ");
        sb.append(i2);
        C45372t.m143405b(str, sb.toString());
    }

    public boolean posInReactionRegion(int i, int i2) {
        if (this.mHandler == 0) {
            return false;
        }
        return nativePosInReactionRegion(this.mHandler, i, i2);
    }

    public void registerFaceInfoUpload(boolean z, FaceInfoCallback faceInfoCallback) {
        if (this.mHandler == 0) {
            C45372t.m143409d(TAG, "invalid handle");
        } else {
            nativeRegisterFaceInfoUpload(this.mHandler, z, faceInfoCallback);
        }
    }

    public void registerHandDetectCallback(int[] iArr, OnHandDetectCallback onHandDetectCallback) {
        if (this.mHandler == 0) {
            C45372t.m143409d(TAG, "invalid handle");
        } else {
            nativeRegisterHandDetectCallback(this.mHandler, iArr, onHandDetectCallback);
        }
    }

    public int reloadComposerNodes(String[] strArr, int i) {
        if (this.mHandler != 0) {
            return nativeReloadComposerNodes(this.mHandler, strArr, i);
        }
        C45372t.m143409d(TAG, "Native instance handle == 0 invalid.");
        return INVALID_HANDLE;
    }

    public int removeComposerNodes(String[] strArr, int i) {
        if (this.mHandler != 0) {
            return nativeRemoveComposerNodes(this.mHandler, strArr, i);
        }
        C45372t.m143409d(TAG, "Native instance handle == 0 invalid.");
        return INVALID_HANDLE;
    }

    public int resetStartTime(long j, long j2) {
        if (this.mHandler == 0) {
            return INVALID_HANDLE;
        }
        return nativeResetStartTime(this.mHandler, j, j2);
    }

    public void setAlgorithmChangeMsg(int i, boolean z) {
        if (this.mHandler == 0) {
            C45372t.m143409d(TAG, "invalid handle");
        } else {
            nativeSetAlgorithmChangeMsg(this.mHandler, i, z);
        }
    }

    public int setAlgorithmPreConfig(int i, int i2) {
        if (this.mHandler != 0) {
            return nativeSetAlgorithmPreConfig(this.mHandler, i, i2);
        }
        C45372t.m143409d(TAG, "Native instance handle == 0 invalid.");
        return INVALID_HANDLE;
    }

    public int setBeautyFace(int i, String str) {
        if (this.mHandler != 0) {
            return nativeSetBeautyFace(this.mHandler, i, str);
        }
        C45372t.m143409d(TAG, "invalid handle");
        return INVALID_HANDLE;
    }

    public int setBeautyFaceIntensity(float f, float f2) {
        if (this.mHandler != 0) {
            return nativeSetBeautyFaceIntensity(this.mHandler, f, f2);
        }
        C45372t.m143409d(TAG, "invalid handle");
        return INVALID_HANDLE;
    }

    public int setBlindWaterMarkDiffKeys(int i, int i2) {
        if (this.mHandler == 0) {
            return INVALID_HANDLE;
        }
        return nativeSetBlindWaterMarkDiffKeys(this.mHandler, i, i2);
    }

    public int setBlindWaterMarkPosition(int i, int i2) {
        if (this.mHandler == 0) {
            return INVALID_HANDLE;
        }
        return nativeSetBlindWaterMarkPosition(this.mHandler, i, i2);
    }

    public int setComposerMode(int i, int i2) {
        if (this.mHandler != 0) {
            return nativeSetComposerMode(this.mHandler, i, i2);
        }
        C45372t.m143409d(TAG, "Native instance handle == 0 invalid.");
        return INVALID_HANDLE;
    }

    public int setComposerNodes(String[] strArr, int i) {
        if (this.mHandler != 0) {
            return nativeSetComposerNodes(this.mHandler, strArr, i);
        }
        C45372t.m143409d(TAG, "Native instance handle == 0 invalid.");
        return INVALID_HANDLE;
    }

    public void setDeviceRotation(float[] fArr, double d) {
        if (this.mHandler != 0 && isRenderReady()) {
            nativeSetDeviceRotationWithStamp(this.mHandler, fArr, d);
        }
    }

    public int setFilterNew(String str, float f) {
        if (this.mHandler == 0) {
            return INVALID_HANDLE;
        }
        return nativeSetFilterNew(this.mHandler, str, f);
    }

    public int setIntensityByType(int i, float f) {
        if (this.mHandler != 0) {
            return nativeSetIntensityByType(this.mHandler, i, f);
        }
        C45372t.m143409d(TAG, "invalid handle");
        return INVALID_HANDLE;
    }

    public synchronized int setMusicTime(long j, long j2) {
        if (this.mHandler == 0) {
            return INVALID_HANDLE;
        }
        return nativeSetMusicTime(this.mHandler, j, j2);
    }

    public boolean setReactionMaskImage(String str, boolean z) {
        if (this.mHandler == 0) {
            return false;
        }
        return nativeSetReactionMaskImage(this.mHandler, str, z);
    }

    public void setRenderCacheString(String str, String str2) {
        if (this.mHandler == 0) {
            C45372t.m143409d(TAG, "invalid handle");
        } else {
            nativeSetRenderCacheString(this.mHandler, str, str2);
        }
    }

    public void setRenderCacheTexture(String str, String str2) {
        if (this.mHandler == 0) {
            C45372t.m143409d(TAG, "invalid handle");
        } else {
            nativeSetRenderCacheTexture(this.mHandler, str, str2);
        }
    }

    public int setVideoQuality(int i, int i2) {
        if (this.mHandler == 0) {
            return INVALID_HANDLE;
        }
        return nativeSetVideoQuality(this.mHandler, i, i2);
    }

    public int tryRestore(int i, String str) {
        if (this.mHandler == 0) {
            return INVALID_HANDLE;
        }
        return nativeTryRestore(this.mHandler, i, str);
    }

    public void updateAlgorithmRuntimeParam(int i, float f) {
        if (this.mHandler == 0) {
            C19706c.m64972d(TAG, "invalid handle");
        } else {
            nativeUpdateAlgorithmRuntimeParam(this.mHandler, i, f);
        }
    }

    public int animateImageToPreview(String str, String str2) {
        if (this.mHandler == 0) {
            C45372t.m143409d(TAG, "Native instance handle == 0 invalid.");
            return INVALID_HANDLE;
        }
        return nativeAnimateImageToPreview(this.mHandler, str, str2, C19705b.m64963a(str2));
    }

    public int[] checkComposerNodeExclusion(String str, String str2) {
        if (this.mHandler == 0) {
            C45372t.m143409d(TAG, "Native instance handle == 0 invalid.");
            return new int[]{-1, 0};
        }
        return nativeCheckComposerNodeExclusion(this.mHandler, str, null, str2);
    }

    public void onNativeCallback_InitHardEncoderRet(int i, int i2) {
        C45372t.m143403a(TAG, "onInitHardEncoderRet");
        String str = TAG;
        StringBuilder sb = new StringBuilder("isCPUEncode = ");
        sb.append(i);
        C45372t.m143403a(str, sb.toString());
        if (this.mNativeInitListener != null) {
            this.mNativeInitListener.mo52205a(i, i2);
        }
        if (sNativeInitListener != null) {
            sNativeInitListener.mo52205a(i, i2);
        }
    }

    public void onNativeCallback_onLandMarkDetect(boolean z, boolean z2) {
        ArrayList<C45336r> arrayList = new ArrayList<>();
        synchronized (FaceBeautyInvoker.class) {
            for (C45336r add : this.mLandmarkDetectListeners) {
                arrayList.add(add);
            }
        }
        for (C45336r rVar : arrayList) {
            if (rVar != null) {
                rVar.mo56380a(z, z2);
            }
        }
    }

    public int processTouchEvent(float f, float f2) {
        if (this.mHandler == 0) {
            C45372t.m143409d(TAG, "invalid handle");
            return INVALID_HANDLE;
        } else if (!isRenderReady()) {
            return INVALID_ENV;
        } else {
            return nativeProcessTouchEvent(this.mHandler, f, f2);
        }
    }

    public int slamProcessDoubleClickEvent(float f, float f2) {
        if (this.mHandler == 0) {
            C45372t.m143409d(TAG, "invalid handle");
            return INVALID_HANDLE;
        } else if (!isRenderReady()) {
            return INVALID_ENV;
        } else {
            return nativeSlamProcessDoubleClickEvent(this.mHandler, f, f2);
        }
    }

    public int slamProcessIngestOri(double[] dArr, double d) {
        if (this.mHandler == 0) {
            C45372t.m143409d(TAG, "invalid handle");
            return INVALID_HANDLE;
        } else if (!isRenderReady()) {
            return INVALID_ENV;
        } else {
            return nativeSlamProcessIngestOri(this.mHandler, dArr, d);
        }
    }

    public int slamProcessRotationEvent(float f, float f2) {
        if (this.mHandler == 0) {
            C45372t.m143409d(TAG, "invalid handle");
            return INVALID_HANDLE;
        } else if (!isRenderReady()) {
            return INVALID_ENV;
        } else {
            return nativeSlamProcessRotationEvent(this.mHandler, f, f2);
        }
    }

    public int slamProcessScaleEvent(float f, float f2) {
        if (this.mHandler == 0) {
            C45372t.m143409d(TAG, "invalid handle");
            return INVALID_HANDLE;
        } else if (!isRenderReady()) {
            return INVALID_ENV;
        } else {
            return nativeSlamProcessScaleEvent(this.mHandler, f, f2);
        }
    }

    public int slamProcessTouchEvent(float f, float f2) {
        if (this.mHandler == 0) {
            C45372t.m143409d(TAG, "invalid handle");
            return INVALID_HANDLE;
        } else if (!isRenderReady()) {
            return INVALID_ENV;
        } else {
            return nativeSlamProcessTouchEvent(this.mHandler, f, f2);
        }
    }

    public void onFirstFrameRenderInfo(int i, double d) {
        if (i == 0) {
            double d2 = (double) C19752b.f53602a;
            Double.isNaN(d2);
            C20479f.m67947a(0, "te_preview_first_frame_screen_time", d - d2);
            String str = TAG;
            StringBuilder sb = new StringBuilder("Camera Preview First Frame Cost: ");
            double d3 = (double) C19752b.f53602a;
            Double.isNaN(d3);
            sb.append(d - d3);
            C45372t.m143403a(str, sb.toString());
            return;
        }
        if (i == 1) {
            double d4 = (double) C19752b.f53603b;
            Double.isNaN(d4);
            C20479f.m67947a(0, "te_preview_switch_camera_screen_time", d - d4);
            String str2 = TAG;
            StringBuilder sb2 = new StringBuilder("Camera Change Cost: ");
            double d5 = (double) C19752b.f53603b;
            Double.isNaN(d5);
            sb2.append(d - d5);
            C45372t.m143403a(str2, sb2.toString());
        }
    }

    public int onDrawFrame(ImageFrame imageFrame, int i) {
        if (this.mHandler == 0) {
            return INVALID_HANDLE;
        }
        if (imageFrame.getBuf() != null) {
            nativeOnDrawFrameBuffer3(this.mHandler, imageFrame.getBuf(), imageFrame.getBuf().length, imageFrame.getWidth(), imageFrame.getHeight(), i);
        } else if (VERSION.SDK_INT >= 19 && imageFrame.getFormat() == -2) {
            int[][] iArr = (int[][]) Array.newInstance(int.class, new int[]{3, 3});
            ByteBuffer[] byteBufferArr = new ByteBuffer[3];
            if (new C19724i(imageFrame).mo52428a(iArr, byteBufferArr)) {
                return nativeOnDrawFrameBuffer4(this.mHandler, byteBufferArr[0], iArr[0], byteBufferArr[1], iArr[1], byteBufferArr[2], iArr[2], imageFrame.getFormat(), imageFrame.getWidth(), imageFrame.getHeight(), i);
            }
        }
        return -1;
    }

    public static void onNativeCallback_onMonitorLogFloat(String str, String str2, float f) {
        C20479f.m67959a(str, str2, f);
    }

    public static void onNativeCallback_onMonitorLogInt(String str, String str2, int i) {
        C20479f.m67960a(str, str2, (long) i);
    }

    public int initAudioPlayer(Context context, String str, long j) {
        return initAudioPlayer(context, str, j, false, false);
    }

    public void initReaction(Context context, String str, String str2) {
        if (this.mHandler != 0) {
            nativeInitReaction(this.mHandler, str);
        }
    }

    public void onNativeCallback_encodeData(byte[] bArr, int i, boolean z) {
        if (this.mEncoderCaller != null) {
            this.mEncoderCaller.onEncoderData(bArr, i, z);
        }
    }

    public int onNativeCallback_encodeTexture(int i, int i2, boolean z) {
        if (this.mEncoderCaller != null) {
            return this.mEncoderCaller.onEncoderData(i, i2, 0, z);
        }
        return 0;
    }

    public void setCaptureResize(boolean z, int[] iArr, int[] iArr2) {
        setCaptureResize(this.mHandler, z, iArr, iArr2);
    }

    public int bindEffectAudioProcessor(int i, int i2, boolean z) {
        if (this.mHandler == 0) {
            C45372t.m143409d(TAG, "invalid handle");
            return INVALID_HANDLE;
        }
        return nativeBindEffectAudioProcessor(this.mHandler, i, i2, z);
    }

    public void initFaceBeautifyDetectExtParam(boolean z, boolean z2, boolean z3) {
        if (this.mHandler == 0) {
            C19706c.m64972d(TAG, "invalid handle");
            return;
        }
        nativeInitFaceBeautifyDetectExtParam(this.mHandler, z, z2, z3);
    }

    public void initFaceDetectExtParam(int i, boolean z, boolean z2) {
        if (this.mHandler == 0) {
            C19706c.m64972d(TAG, "invalid handle");
            return;
        }
        nativeInitFaceDetectExtParam(this.mHandler, i, z, z2);
    }

    public void initHandDetectExtParam(int i, int i2, int i3) {
        if (this.mHandler == 0) {
            C19706c.m64972d(TAG, "invalid handle");
            return;
        }
        nativeInitHandDetectExtParam(this.mHandler, i, i2, i3);
    }

    public int initWavFile(int i, int i2, double d) {
        if (this.mHandler == 0) {
            return INVALID_HANDLE;
        }
        return nativeInitWavFile(this.mHandler, i, i2, d);
    }

    public void recoverCherEffect(String[] strArr, double[] dArr, boolean[] zArr) {
        if (this.mHandler == 0) {
            C45372t.m143409d(TAG, "invalid handle");
            return;
        }
        nativeRecoverCherEffect(this.mHandler, strArr, dArr, zArr);
    }

    public int setFrameCallback(OnFrameCallback onFrameCallback, boolean z, int i) {
        if (this.mHandler == 0) {
            return INVALID_HANDLE;
        }
        return nativeSetFrameCallback(this.mHandler, onFrameCallback, z, i);
    }

    public void setPreviewSizeRatio(float f, int i, int i2) {
        if (this.mHandler != 0) {
            nativeSetPreviewSizeRatio(this.mHandler, f, i, i2);
        }
    }

    public int setReshape(String str, float f, float f2) {
        if (this.mHandler == 0) {
            C45372t.m143409d(TAG, "invalid handle");
            return INVALID_HANDLE;
        }
        return nativeSetReshape(this.mHandler, str, f, f2);
    }

    public int setSticker(Bitmap bitmap, int i, int i2) {
        if (this.mHandler == 0) {
            return INVALID_HANDLE;
        }
        return nativeSetSticker(this.mHandler, bitmap, i, i2);
    }

    public int updateComposerNode(String str, String str2, float f) {
        if (this.mHandler == 0) {
            C45372t.m143409d(TAG, "Native instance handle == 0 invalid.");
            return INVALID_HANDLE;
        }
        return nativeUpdateComposerNode(this.mHandler, str, str2, f);
    }

    public void updateRotation(float f, float f2, float f3) {
        if (this.mHandler != 0) {
            nativeUpdateRotation(this.mHandler, f, f2, f3);
        }
    }

    public int setFaceMakeUp(String str, float f, float f2) {
        if (this.mHandler == 0) {
            C45372t.m143409d(TAG, "invalid handle");
            return INVALID_HANDLE;
        }
        return nativeSetFaceMakeUp(this.mHandler, str, f, f2);
    }

    public int setFilter(String str, String str2, float f) {
        if (this.mHandler == 0) {
            return INVALID_HANDLE;
        }
        return nativeSetFilter(this.mHandler, str, str2, f);
    }

    public int[] checkComposerNodeExclusion(String str, String str2, String str3) {
        if (this.mHandler == 0) {
            C45372t.m143409d(TAG, "Native instance handle == 0 invalid.");
            return new int[]{-1, 0};
        }
        return nativeCheckComposerNodeExclusion(this.mHandler, str, str2, str3);
    }

    public int setStickerPath(String str, int i, int i2, boolean z) {
        return setStickerPathWithTag(str, i, i2, false, "");
    }

    public int initAudioConfig(int i, int i2, int i3, int i4) {
        if (this.mHandler == 0) {
            return INVALID_HANDLE;
        }
        return nativeInitAudioConfig(this.mHandler, i, i2, i3, i4);
    }

    public void onMessageReceived(int i, int i2, int i3, String str) {
        synchronized (FaceBeautyInvoker.class) {
            C1944a aVar = this.mMessageListener;
            if (aVar != null) {
                aVar.onMessageReceived(i, i2, i3, str);
            }
            if (sMessageListener != null) {
                sMessageListener.onMessageReceived(i, i2, i3, str);
            }
        }
    }

    public int replaceComposerNodes(String[] strArr, int i, String[] strArr2, int i2) {
        if (this.mHandler == 0) {
            C45372t.m143409d(TAG, "Native instance handle == 0 invalid.");
            return INVALID_HANDLE;
        }
        return nativeReplaceComposerNodes(this.mHandler, strArr, i, strArr2, i2);
    }

    public void sendEffectMsg(int i, long j, long j2, String str) {
        if (this.mHandler == 0) {
            C45372t.m143409d(TAG, "invalid handle");
            return;
        }
        nativeSendEffectMsg(this.mHandler, i, j, j2, str);
    }

    public void setReactionPosMargin(int i, int i2, int i3, int i4) {
        if (this.mHandler != 0) {
            nativeSetReactionPosMargin(this.mHandler, i, i2, i3, i4);
        }
    }

    public void setScanArea(float f, float f2, float f3, float f4) {
        if (this.mHandler == 0) {
            C45372t.m143409d(TAG, "invalid handle");
            return;
        }
        nativeSetScanArea(this.mHandler, f, f2, f3, f4);
    }

    public int slamSetInputText(String str, int i, int i2, String str2) {
        if (this.mHandler == 0) {
            C45372t.m143409d(TAG, "invalid handle");
            return INVALID_HANDLE;
        }
        return nativeSetSlamInputText(this.mHandler, str, i, i2, str2);
    }

    public int slamSetTextBitmapResult(Bitmap bitmap, int i, int i2, int i3) {
        if (this.mHandler == 0) {
            C19706c.m64972d(TAG, "invalid handle");
            return INVALID_HANDLE;
        }
        return nativeSlamSetTextBitmapResult(this.mHandler, bitmap, i, i2, i3);
    }

    public int[] updateReactionCameraPos(int i, int i2, int i3, int i4) {
        if (this.mHandler == 0) {
            return null;
        }
        return nativeUpdateReactionCameraPos(this.mHandler, i, i2, i3, i4);
    }

    public int writeFile(ByteBuffer byteBuffer, int i, int i2, int i3) {
        if (this.mHandler == 0) {
            return INVALID_HANDLE;
        }
        return nativeWriteFile(this.mHandler, byteBuffer, i, i2, i3);
    }

    public int concat(String str, String str2, String str3, String str4) {
        if (this.mHandler == 0) {
            return INVALID_HANDLE;
        }
        return nativeConcat(this.mHandler, str, str2, 0, str3, str4, false);
    }

    public int slamDeviceConfig(boolean z, boolean z2, boolean z3, boolean z4) {
        if (this.mHandler == 0) {
            C45372t.m143409d(TAG, "invalid handle");
            return INVALID_HANDLE;
        } else if (!isRenderReady()) {
            return INVALID_ENV;
        } else {
            return nativeSlamDeviceConfig(this.mHandler, z, z2, z3, z4);
        }
    }

    public int slamProcessIngestAcc(double d, double d2, double d3, double d4) {
        if (this.mHandler == 0) {
            C45372t.m143409d(TAG, "invalid handle");
            return INVALID_HANDLE;
        } else if (!isRenderReady()) {
            return INVALID_ENV;
        } else {
            return nativeSlamProcessIngestAcc(this.mHandler, d, d2, d3, d4);
        }
    }

    public int slamProcessIngestGra(double d, double d2, double d3, double d4) {
        if (this.mHandler == 0) {
            C45372t.m143409d(TAG, "invalid handle");
            return INVALID_HANDLE;
        } else if (!isRenderReady()) {
            return INVALID_ENV;
        } else {
            return nativeSlamProcessIngestGra(this.mHandler, d, d2, d3, d4);
        }
    }

    public int slamProcessIngestGyr(double d, double d2, double d3, double d4) {
        if (this.mHandler == 0) {
            C45372t.m143409d(TAG, "invalid handle");
            return INVALID_HANDLE;
        } else if (!isRenderReady()) {
            return INVALID_ENV;
        } else {
            return nativeSlamProcessIngestGyr(this.mHandler, d, d2, d3, d4);
        }
    }

    public int slamProcessTouchEventByType(int i, float f, float f2, int i2) {
        if (this.mHandler == 0) {
            C45372t.m143409d(TAG, "invalid handle");
            return INVALID_HANDLE;
        } else if (!isRenderReady()) {
            return INVALID_ENV;
        } else {
            return nativeSlamProcessTouchEventByType(this.mHandler, i, f, f2, i2);
        }
    }

    public int startPlay(Surface surface, String str, int i, int i2) {
        if (this.mHandler == 0) {
            return INVALID_HANDLE;
        }
        initMessageCenter();
        return nativeStartPlay(this.mHandler, surface, i, i2, str);
    }

    public void setBeautyFace(int i, String str, float f, float f2) {
        String str2 = TAG;
        StringBuilder sb = new StringBuilder("nativeSetBeautyFace: ");
        sb.append(i);
        C45372t.m143405b(str2, sb.toString());
        if (this.mHandler == 0) {
            C45372t.m143409d(TAG, "invalid handle");
        } else if (i != 3 || C19722g.m65025a(str)) {
            nativeSetBeautyFace(this.mHandler, i, str);
            nativeSetBeautyFaceIntensity(this.mHandler, f, f2);
        } else {
            nativeSetBeautyFace(this.mHandler, 0, "");
            nativeSetBeautyFaceIntensity(this.mHandler, 0.0f, 0.0f);
        }
    }

    public int renderPicture(ImageFrame imageFrame, int i, int i2, OnPictureCallbackV2 onPictureCallbackV2) {
        if (this.mHandler == 0) {
            return INVALID_HANDLE;
        }
        if (imageFrame.getBuf() != null) {
            return nativeRenderPicture(this.mHandler, imageFrame.getBuf(), imageFrame.getBuf().length, i, i2, onPictureCallbackV2);
        } else if (VERSION.SDK_INT < 19 || imageFrame.getFormat() != -2) {
            ImageFrame imageFrame2 = imageFrame;
            if (imageFrame.getBitmap() != null) {
                return nativeRenderPicture3(this.mHandler, imageFrame.getBitmap(), i, i2, onPictureCallbackV2);
            }
            return nativeRenderPicture(this.mHandler, null, 0, 0, 0, null);
        } else {
            int[][] iArr = (int[][]) Array.newInstance(int.class, new int[]{3, 3});
            ByteBuffer[] byteBufferArr = new ByteBuffer[3];
            if (!new C19724i(imageFrame).mo52428a(iArr, byteBufferArr)) {
                return -1;
            }
            return nativeRenderPicture2(this.mHandler, byteBufferArr[0], iArr[0], byteBufferArr[1], iArr[1], byteBufferArr[2], iArr[2], imageFrame.getFormat(), imageFrame.getWidth(), imageFrame.getHeight(), i, i2, onPictureCallbackV2);
        }
    }

    public int startPlay(Surface surface, String str, boolean z, int i, int i2) {
        int startPlay = startPlay(surface, str, i, i2);
        if (startPlay == 0 && z) {
            initHardEncoderInAdvance();
        }
        return startPlay;
    }

    public void initDuet(String str, float f, float f2, float f3, boolean z) {
        if (this.mHandler != 0) {
            nativeInitDuet(this.mHandler, str, f, f2, f3, z);
        }
    }

    public int startPlay(int i, int i2, String str, int i3, int i4) {
        if (this.mHandler == 0) {
            return INVALID_HANDLE;
        }
        initMessageCenter();
        return nativeStartPlay2(this.mHandler, i, i2, i3, i4, str);
    }

    public int[] updateReactionCameraPosWithRotation(int i, int i2, int i3, int i4, float f) {
        if (this.mHandler == 0) {
            return null;
        }
        return nativeUpdateReactionCameraPosWithRotation(this.mHandler, i, i2, i3, i4, f);
    }

    public int setFilterNew(String str, String str2, float f, float f2, float f3) {
        if (this.mHandler == 0) {
            return INVALID_HANDLE;
        }
        return nativeSetDoubleFilterNew(this.mHandler, str, str2, f, f2, f3);
    }

    public int setStickerPathWithTag(String str, int i, int i2, boolean z, String str2) {
        if (this.mHandler == 0) {
            C45372t.m143409d(TAG, "invalid handle");
            return INVALID_HANDLE;
        } else if (!isRenderReady()) {
            return INVALID_ENV;
        } else {
            return nativeSetStickerPathWithTag(this.mHandler, str, i, i2, z, str2);
        }
    }

    public int slamProcessPanEvent(float f, float f2, float f3, float f4, float f5) {
        if (this.mHandler == 0) {
            C45372t.m143409d(TAG, "invalid handle");
            return INVALID_HANDLE;
        } else if (!isRenderReady()) {
            return INVALID_ENV;
        } else {
            return nativeSlamProcessPanEvent(this.mHandler, f, f2, f3, f4, f5);
        }
    }

    public int initAudioPlayer(Context context, String str, long j, boolean z, boolean z2) {
        boolean z3;
        Pair pair;
        int i;
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            z3 = false;
        } else {
            z3 = packageManager.hasSystemFeature("android.hardware.audio.low_latency");
        }
        String str2 = TAG;
        StringBuilder sb = new StringBuilder("has low latency ? ");
        sb.append(z3);
        C45372t.m143405b(str2, sb.toString());
        if (z2) {
            pair = new Pair(Integer.valueOf(0), Integer.valueOf(0));
        } else {
            pair = C19718d.m65016a(context);
        }
        String str3 = TAG;
        StringBuilder sb2 = new StringBuilder("nativeSampleRate ? ");
        sb2.append(pair.first);
        sb2.append(" nativeSamleBufferSize? ");
        sb2.append(pair.second);
        C45372t.m143405b(str3, sb2.toString());
        boolean equals = "SM-A710F".equals(Build.MODEL);
        synchronized (this) {
            if (this.mHandler == 0) {
                return INVALID_HANDLE;
            }
            long j2 = this.mHandler;
            int intValue = ((Integer) pair.first).intValue();
            int intValue2 = ((Integer) pair.second).intValue();
            if (z3) {
                i = 45;
            } else {
                i = -1;
            }
            int nativeInitAudioPlayer = nativeInitAudioPlayer(j2, str, intValue, intValue2, j, z, equals, i);
            return nativeInitAudioPlayer;
        }
    }

    public int concat(String str, String str2, int i, String str3, String str4, boolean z) {
        synchronized (this) {
            if (this.mHandler == 0) {
                return INVALID_HANDLE;
            }
            return nativeConcat(this.mHandler, str, str2, i, str3, str4, z);
        }
    }

    public int setStickerPathWithTagSync(String str, int i, int i2, String str2, String[] strArr, float[] fArr) {
        if (this.mHandler == 0) {
            C45372t.m143409d(TAG, "invalid handle");
            return INVALID_HANDLE;
        } else if (!isRenderReady()) {
            return INVALID_ENV;
        } else {
            return nativeSetStickerPathWithTagSync(this.mHandler, str, i, i2, str2, strArr, fArr);
        }
    }

    public synchronized int shotScreen(String str, int[] iArr, boolean z, int i, OnPictureCallback onPictureCallback, C19704b bVar) {
        if (!this.mIsDuringScreenshot) {
            this.mIsDuringScreenshot = true;
            this.mShotScreenCallback = bVar;
            if (this.mHandler == 0) {
                return INVALID_HANDLE;
            }
            return nativeShotScreen(this.mHandler, str, iArr, z, i, onPictureCallback);
        }
        C45372t.m143407c(TAG, "Last screenshot not complete");
        bVar.mo52404a(-1);
        return -1;
    }

    public int initFaceBeautyPlay(int i, int i2, String str, int i3, int i4, String str2, int i5) {
        return initFaceBeautyPlay(i, i2, str, i3, i4, str2, i5, false);
    }

    public Surface onNativeCallback_InitHardEncoder(int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
        if (this.mEncoderCaller == null) {
            return null;
        }
        C45372t.m143403a(TAG, "InitHardEncoder");
        return this.mEncoderCaller.onInitHardEncoder(i, i2, i3, i4, i5, i6, z);
    }

    public int startRecord(double d, boolean z, float f, int i, int i2, String str, String str2) {
        int i3;
        int i4 = (int) (4000000.0f * f);
        if (i4 > 12000000) {
            i3 = 12000000;
        } else {
            i3 = i4;
        }
        if (this.mHandler == 0) {
            return INVALID_HANDLE;
        }
        return nativeStartRecord(this.mHandler, d, z, i3, i, i2, str, str2);
    }

    public void setCustomVideoBg(Context context, String str, String str2, String str3, long j, boolean z, boolean z2) {
        boolean z3;
        Pair pair;
        int i;
        if (this.mHandler != 0) {
            if (TextUtils.isEmpty(str2)) {
                nativeSetCustomVideoBg(this.mHandler, null, null, null, 0, 0, 0, false, 0);
                return;
            }
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || !packageManager.hasSystemFeature("android.hardware.audio.low_latency")) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (z2) {
                pair = new Pair(Integer.valueOf(0), Integer.valueOf(0));
            } else {
                pair = C19718d.m65016a(context);
            }
            long j2 = this.mHandler;
            int intValue = ((Integer) pair.first).intValue();
            int intValue2 = ((Integer) pair.second).intValue();
            if (z3) {
                i = 45;
            } else {
                i = -1;
            }
            nativeSetCustomVideoBg(j2, str, str2, str3, intValue, intValue2, j, z, i);
        }
    }

    public void setWaterMark(Bitmap bitmap, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        if (this.mHandler == 0) {
            C45372t.m143409d(TAG, "invalid handle");
            return;
        }
        nativeSetWaterMark2(this.mHandler, bitmap, i, i2, i3, i4, i5, i6, i7);
    }

    public synchronized int shotHDScreen(String str, int[] iArr, boolean z, int i, OnPictureCallback onPictureCallback, C19704b bVar, boolean z2, OnPictureCallback onPictureCallback2) {
        C19704b bVar2 = bVar;
        synchronized (this) {
            if (!this.mIsDuringScreenshot) {
                this.mIsDuringScreenshot = true;
                this.mShotScreenCallback = bVar2;
                if (this.mHandler == 0) {
                    return INVALID_HANDLE;
                }
                int nativeShotHDScreen = nativeShotHDScreen(this.mHandler, str, iArr, z, i, onPictureCallback, z2, onPictureCallback2);
                return nativeShotHDScreen;
            }
            C45372t.m143407c(TAG, "Last screenshot not complete");
            bVar2.mo52404a(-1);
            return -1;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0044, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int initFaceBeautyPlay(int r15, int r16, java.lang.String r17, int r18, int r19, java.lang.String r20, int r21, boolean r22) {
        /*
            r14 = this;
            r13 = r14
            long r0 = r14.nativeCreate()
            r13.mHandler = r0
            r0 = 5000(0x1388, float:7.006E-42)
            com.p280ss.android.medialib.C19615a.m64588a(r0)
            monitor-enter(r14)
            long r0 = r13.mHandler     // Catch:{ all -> 0x0045 }
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x001a
            r0 = -100000(0xfffffffffffe7960, float:NaN)
            monitor-exit(r14)     // Catch:{ all -> 0x0045 }
            return r0
        L_0x001a:
            long r2 = r13.mHandler     // Catch:{ all -> 0x0045 }
            r11 = 0
            r1 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            r9 = r20
            r10 = r21
            r12 = r22
            int r0 = r1.nativeInitFaceBeautyPlay(r2, r4, r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0045 }
            if (r0 != 0) goto L_0x0043
            java.lang.String r1 = android.os.Build.MODEL     // Catch:{ all -> 0x0045 }
            java.lang.String r2 = "OPPO R7"
            boolean r1 = r1.contains(r2)     // Catch:{ all -> 0x0045 }
            if (r1 == 0) goto L_0x0043
            long r1 = r13.mHandler     // Catch:{ all -> 0x0045 }
            r3 = 1
            r14.nativeExpandPreviewAndRecordInterval(r1, r3)     // Catch:{ all -> 0x0045 }
        L_0x0043:
            monitor-exit(r14)     // Catch:{ all -> 0x0045 }
            return r0
        L_0x0045:
            r0 = move-exception
            monitor-exit(r14)     // Catch:{ all -> 0x0045 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.medialib.FaceBeautyInvoker.initFaceBeautyPlay(int, int, java.lang.String, int, int, java.lang.String, int, boolean):int");
    }

    public void setWaterMark(String[] strArr, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        if (this.mHandler == 0) {
            C45372t.m143409d(TAG, "invalid handle");
            return;
        }
        nativeSetWaterMark(this.mHandler, strArr, i, i2, i3, i4, i5, i6, i7);
    }
}

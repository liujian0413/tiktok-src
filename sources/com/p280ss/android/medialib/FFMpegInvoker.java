package com.p280ss.android.medialib;

import com.p280ss.android.medialib.FFMpegManager.EncoderListener;
import com.p280ss.android.medialib.model.CoverInfo;
import com.p280ss.android.medialib.model.Segment;
import com.p280ss.android.ttve.nativePort.TENativeLibsLoader;

/* renamed from: com.ss.android.medialib.FFMpegInvoker */
public class FFMpegInvoker {
    C19720e mFFMpagCaller;
    C19723h metaInterface;

    static {
        TENativeLibsLoader.m67988e();
    }

    public native int addFastReverseVideo(String str, String str2);

    public native int addReverseVideo(String str, String str2);

    public native int checkAudioFile(String str);

    public native int checkMp3File(String str);

    public native int checkVideoFile(String str);

    public native CoverInfo getFrameCover(String str, int i, int i2, int i3, int i4);

    public native int[] getFrameThumbnail(int i, int i2);

    public native int[] getOldFrameThumbnail(int i, int i2);

    public native int[] initVideoToGraph(String str, int i, int i2);

    public native int isCanImport(String str, long j, long j2);

    public native int mixAudioFile(String str, double d, String str2, double d2, String str3);

    public native int mixAudioFiles(String str, double d, String[] strArr, int[] iArr, double d2, String str2);

    public void onNativeCallback_MetaData(String str, String str2) {
    }

    public void onNativeCallback_progress(int i) {
    }

    public native int remuxVideo(String str, String str2);

    public native int rencodeAndSplitFile(String str, String str2, String str3, long j, long j2, int i, int i2, int i3, String str4, int i4, String str5, float f, boolean z, boolean z2, int i5, int i6, int i7, int i8, int i9, int i10, int i11, EncoderListener encoderListener);

    public native int rencodeAndSplitMutliFile(Segment[] segmentArr, String str, String str2, String str3, String str4, boolean z, boolean z2, int i, int i2, int i3, int i4, int i5, int i6, int i7, EncoderListener encoderListener);

    public native int rencodeFile(String str, String str2, String str3, long j, long j2, int i);

    public native int rencodeFileFullScreen(String str, String str2, String str3, long j, long j2, int i, int i2, int i3, String str4, int i4, String str5, boolean z, int i5, int i6, int i7, int i8);

    public native int resampleAudioToWav(String str, String str2, long j, long j2);

    public native int resampleAudioToWav2(String str, String str2, long j);

    public native int resampleCycleAudioToWav(String str, String str2, long j, long j2);

    public native void stopGetFrameThumbnail();

    public native int stopReverseVideo();

    public native int uninitVideoToGraph();

    public String onNativeCallback_getMetaKey() {
        if (this.metaInterface != null) {
            return this.metaInterface.mo52427a();
        }
        return null;
    }

    public void setMetaInterface(C19723h hVar) {
        this.metaInterface = hVar;
    }

    public void setmFFMpagCaller(C19720e eVar) {
        this.mFFMpagCaller = eVar;
    }
}

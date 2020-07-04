package com.p280ss.android.medialib.photomovie;

import android.content.Context;
import android.os.Looper;
import android.view.Surface;
import com.p280ss.android.medialib.C19625c;
import com.p280ss.android.medialib.C19713d;
import com.p280ss.android.ttve.nativePort.TENativeLibsLoader;
import com.p280ss.android.vesdk.C45372t;
import com.p280ss.android.vesdk.filterparam.VETransitionFilterParam;
import java.nio.ByteBuffer;

/* renamed from: com.ss.android.medialib.photomovie.PhotoMovie */
public final class PhotoMovie implements C19713d {
    private static final String TAG = "PhotoMovie";
    private static C19756a mPhotoMovieListener;
    protected static volatile PhotoMovie mSingleton;
    private C19625c mAVCEncoderMark;

    /* renamed from: com.ss.android.medialib.photomovie.PhotoMovie$ProgressCallback */
    public interface ProgressCallback {
        void onProgress(int i);
    }

    /* renamed from: com.ss.android.medialib.photomovie.PhotoMovie$a */
    public interface C19756a {
        /* renamed from: a */
        void mo52794a(int i);
    }

    /* renamed from: com.ss.android.medialib.photomovie.PhotoMovie$b */
    public static class C19757b {

        /* renamed from: a */
        public String[] f53619a;

        /* renamed from: b */
        public String f53620b;

        /* renamed from: c */
        public String f53621c;

        /* renamed from: d */
        public String[] f53622d;

        /* renamed from: e */
        public String[] f53623e;

        /* renamed from: f */
        public int[] f53624f;

        /* renamed from: g */
        public int f53625g;

        /* renamed from: h */
        public String f53626h;

        /* renamed from: i */
        public String f53627i;

        /* renamed from: j */
        public float f53628j = 1.0f;

        /* renamed from: k */
        public final C19758a f53629k = new C19758a(1, 2500, VETransitionFilterParam.TransitionDuration_DEFAULT);

        /* renamed from: l */
        public ProgressCallback f53630l;
    }

    static {
        TENativeLibsLoader.m67988e();
    }

    private static native int nativeSynthetise(String[] strArr, String str, String str2, String[] strArr2, String[] strArr3, int[] iArr, int i, String str3, String str4, float f, int i2, int i3, int i4, ProgressCallback progressCallback);

    private native void onWriteFile(byte[] bArr, int i, int i2, int i3, int i4);

    private native int setCodecConfig(byte[] bArr, int i);

    private native int setColorFormat(int i);

    private native int setHardEncoderMarkStatus(boolean z);

    private static native void setMarkParams(String[] strArr, String str, boolean z, int i, int i2, int i3, int i4, int i5, int i6);

    private native void swapGlBuffer();

    public final void onMarkEncoderData(ByteBuffer byteBuffer, int i, boolean z) {
    }

    public final void onMarkEncoderData(byte[] bArr, int i, boolean z) {
    }

    public final void onMarkSwapGlBuffers() {
        swapGlBuffer();
    }

    public PhotoMovie() {
        mSingleton = this;
    }

    public static void onNativeCallback_UninitMarkHardEncoder() {
        if (mSingleton != null) {
            mSingleton.onUninitMarkHardEncoder();
        }
    }

    public static PhotoMovie getInstance() {
        synchronized (PhotoMovie.class) {
            if (mSingleton == null) {
                synchronized (PhotoMovie.class) {
                    if (mSingleton == null) {
                        mSingleton = new PhotoMovie();
                    }
                }
            }
        }
        return mSingleton;
    }

    public final void onUninitMarkHardEncoder() {
        C45372t.m143403a(TAG, "onUninitMarkHardEncoder == enter");
        if (this.mAVCEncoderMark != null) {
            this.mAVCEncoderMark.mo52209a();
            this.mAVCEncoderMark = null;
            C45372t.m143403a(TAG, "====== uninitAVCEncoder ======");
        }
        C45372t.m143403a(TAG, "onUninitMarkHardEncoder == exit");
    }

    public static void setPhotoMovieListener(C19756a aVar) {
        mPhotoMovieListener = aVar;
    }

    public final void setColorFormatMark(int i) {
        setColorFormat(i);
    }

    public static PhotoMoviePlayer createPlayer(Context context) {
        return new PhotoMoviePlayer(context);
    }

    public final void onMarkSetCodecConfig(byte[] bArr) {
        setCodecConfig(bArr, bArr.length);
    }

    public static int calulateDuration(C19757b bVar) {
        if (bVar.f53619a.length == 0) {
            return 0;
        }
        return (bVar.f53619a.length * 2500) - 500;
    }

    public static void onNativeCallback_InitMarkHardEncoderRet(int i) {
        if (mSingleton != null) {
            mSingleton.onInitMarkHardEncoderRet(i);
        }
    }

    public final void onInitMarkHardEncoderRet(int i) {
        if (mPhotoMovieListener != null) {
            mPhotoMovieListener.mo52794a(i);
        }
    }

    public final int synthetise(C19757b bVar) throws IllegalStateException {
        C19757b bVar2 = bVar;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return nativeSynthetise(bVar2.f53619a, bVar2.f53620b, bVar2.f53621c, bVar2.f53622d, bVar2.f53623e, bVar2.f53624f, bVar2.f53625g, bVar2.f53626h, bVar2.f53627i, bVar2.f53628j, bVar2.f53629k.f53633a, bVar2.f53629k.f53634b, bVar2.f53629k.f53635c, bVar2.f53630l);
        }
        throw new IllegalStateException("Don't synthetise photomovie in main thread");
    }

    public final void onMarkWriteFile(byte[] bArr, int i, int i2, int i3) {
        onWriteFile(bArr, bArr.length, i, i2, i3);
        C45372t.m143405b(TAG, "onEncoderData: ...");
    }

    public final Surface onInitMarkHardEncoder(int i, int i2, int i3, int i4, boolean z) {
        return onInitMarkHardEncoder(i, i2, i3, 1, 1, i4, z);
    }

    public static int onNativeCallback_MarkencodeTexture(int i, int i2, int i3, int i4, boolean z) {
        if (mSingleton != null) {
            return mSingleton.onMarkEncodeData(i, i2, i3, i4, z);
        }
        return 0;
    }

    public final int onMarkEncodeData(int i, int i2, int i3, int i4, boolean z) {
        if (this.mAVCEncoderMark != null) {
            return this.mAVCEncoderMark.mo52211b(i, i2, i3, i4, z);
        }
        return 0;
    }

    public final int onMarkEncoderData(int i, int i2, int i3, int i4, boolean z) {
        if (this.mAVCEncoderMark != null) {
            return this.mAVCEncoderMark.mo52211b(i, i2, i3, i4, z);
        }
        return 0;
    }

    public static Surface onNativeCallback_InitMarkHardEncoder(int i, int i2, int i3, int i4, int i5, boolean z) {
        if (mSingleton != null) {
            return mSingleton.onInitMarkHardEncoder(i, i2, i3, i4, i5, z);
        }
        return null;
    }

    public final Surface onInitMarkHardEncoder(int i, int i2, int i3, int i4, int i5, boolean z) {
        if (this.mAVCEncoderMark == null) {
            this.mAVCEncoderMark = new C19625c();
        }
        C19625c.m64619a(this);
        Surface a = this.mAVCEncoderMark.mo52208a(i, i2, i3, 1, z);
        if (a == null) {
            this.mAVCEncoderMark = null;
            setHardEncoderMarkStatus(false);
            return null;
        }
        C45372t.m143403a(TAG, "====== initAVCEncoder succeed ======");
        setHardEncoderMarkStatus(true);
        return a;
    }

    public final Surface onInitMarkHardEncoder(int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
        C45372t.m143403a(TAG, "onInitMarkHardEncoder == enter");
        String str = TAG;
        StringBuilder sb = new StringBuilder("width = ");
        sb.append(i);
        sb.append("\theight = ");
        sb.append(i2);
        C45372t.m143403a(str, sb.toString());
        if (this.mAVCEncoderMark == null) {
            this.mAVCEncoderMark = new C19625c();
        }
        C19625c.m64619a(this);
        Surface a = this.mAVCEncoderMark.mo52208a(i, i2, i3, i6, z);
        if (a == null) {
            this.mAVCEncoderMark = null;
            setHardEncoderMarkStatus(false);
            return null;
        }
        C45372t.m143403a(TAG, "====== initAVCEncoder succeed ======");
        setHardEncoderMarkStatus(true);
        C45372t.m143403a(TAG, "onInitMarkHardEncoder == exit");
        return a;
    }

    public static void onNativeCallback_MarkParam(float f, int i, float f2, float f3, float f4, float f5, float f6, float f7) {
        if (mSingleton != null) {
            mSingleton.onMarkParam(f, i, f2, f3, f4, f5, f6, f7);
        }
    }

    public final void onMarkParam(float f, int i, float f2, float f3, float f4, float f5, float f6, float f7) {
        if (this.mAVCEncoderMark != null) {
            this.mAVCEncoderMark.mo52210a(f, i, f2, f3, f4, f5, f6, f7);
        }
    }

    public final void setMarkParam(String[] strArr, String str, boolean z, int i, int i2, int i3, int i4, int i5, int i6) {
        setMarkParams(strArr, str, z, i, i2, i3, i4, i5, i6);
    }
}

package p1896pl.droidsonroids.gif;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build.VERSION;
import android.system.ErrnoException;
import android.system.Os;
import android.view.Surface;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: pl.droidsonroids.gif.GifInfoHandle */
final class GifInfoHandle {

    /* renamed from: a */
    private volatile long f123518a;

    static {
        C48433d.m150103a();
    }

    GifInfoHandle() {
    }

    private static native void bindSurface(long j, Surface surface, long[] jArr);

    static native int createTempNativeFileDescriptor() throws GifIOException;

    static native int extractNativeFileDescriptor(FileDescriptor fileDescriptor, boolean z) throws GifIOException;

    private static native void free(long j);

    private static native long getAllocationByteCount(long j);

    private static native String getComment(long j);

    private static native int getCurrentFrameIndex(long j);

    private static native int getCurrentLoop(long j);

    private static native int getCurrentPosition(long j);

    private static native int getDuration(long j);

    private static native int getFrameDuration(long j, int i);

    private static native int getHeight(long j);

    private static native int getLoopCount(long j);

    private static native long getMetadataByteCount(long j);

    private static native int getNativeErrorCode(long j);

    private static native int getNumberOfFrames(long j);

    private static native long[] getSavedState(long j);

    private static native long getSourceLength(long j);

    private static native int getWidth(long j);

    private static native void glTexImage2D(long j, int i, int i2);

    private static native void glTexSubImage2D(long j, int i, int i2);

    private static native void initTexImageDescriptor(long j);

    private static native boolean isAnimationCompleted(long j);

    private static native boolean isOpaque(long j);

    static native long openByteArray(byte[] bArr) throws GifIOException;

    static native long openDirectByteBuffer(ByteBuffer byteBuffer) throws GifIOException;

    static native long openFile(String str) throws GifIOException;

    static native long openNativeFileDescriptor(int i, long j) throws GifIOException;

    static native long openStream(InputStream inputStream) throws GifIOException;

    private static native void postUnbindSurface(long j);

    private static native long renderFrame(long j, Bitmap bitmap);

    private static native boolean reset(long j);

    private static native long restoreRemainder(long j);

    private static native int restoreSavedState(long j, long[] jArr, Bitmap bitmap);

    private static native void saveRemainder(long j);

    private static native void seekToFrame(long j, int i, Bitmap bitmap);

    private static native void seekToFrameGL(long j, int i);

    private static native void seekToTime(long j, int i, Bitmap bitmap);

    private static native void setLoopCount(long j, char c);

    private static native void setOptions(long j, char c, boolean z);

    private static native void setSpeedFactor(long j, float f);

    private static native void startDecoderThread(long j);

    private static native void stopDecoderThread(long j);

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final synchronized long mo123196b() {
        return restoreRemainder(this.f123518a);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final synchronized boolean mo123197c() {
        return reset(this.f123518a);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final synchronized void mo123198d() {
        saveRemainder(this.f123518a);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final synchronized int mo123199e() {
        return getLoopCount(this.f123518a);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final synchronized int mo123200f() {
        return getNativeErrorCode(this.f123518a);
    }

    /* access modifiers changed from: protected */
    public final void finalize() throws Throwable {
        try {
            mo123194a();
        } finally {
            super.finalize();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final synchronized int mo123202g() {
        return getDuration(this.f123518a);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public final synchronized int mo123203h() {
        return getCurrentPosition(this.f123518a);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public final synchronized int mo123204i() {
        return getCurrentFrameIndex(this.f123518a);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public final synchronized int mo123205j() {
        return getCurrentLoop(this.f123518a);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public final synchronized long mo123206k() {
        return getAllocationByteCount(this.f123518a);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public final synchronized long mo123207l() {
        return getMetadataByteCount(this.f123518a);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public final synchronized int mo123209n() {
        return getWidth(this.f123518a);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: o */
    public final synchronized int mo123210o() {
        return getHeight(this.f123518a);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: p */
    public final synchronized int mo123211p() {
        return getNumberOfFrames(this.f123518a);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: q */
    public final synchronized boolean mo123212q() {
        return isOpaque(this.f123518a);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public final synchronized boolean mo123208m() {
        boolean z;
        if (this.f123518a == 0) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final synchronized void mo123194a() {
        free(this.f123518a);
        this.f123518a = 0;
    }

    GifInfoHandle(FileDescriptor fileDescriptor) throws GifIOException {
        this.f123518a = m150065a(fileDescriptor, 0, true);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final synchronized long mo123193a(Bitmap bitmap) {
        return renderFrame(this.f123518a, bitmap);
    }

    GifInfoHandle(AssetFileDescriptor assetFileDescriptor) throws IOException {
        try {
            this.f123518a = m150065a(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), false);
        } finally {
            try {
                assetFileDescriptor.close();
            } catch (IOException unused) {
            }
        }
    }

    GifInfoHandle(InputStream inputStream) throws GifIOException {
        if (inputStream.markSupported()) {
            this.f123518a = openStream(inputStream);
            return;
        }
        throw new IllegalArgumentException("InputStream does not support marking");
    }

    GifInfoHandle(String str) throws GifIOException {
        this.f123518a = openFile(str);
    }

    GifInfoHandle(ByteBuffer byteBuffer) throws GifIOException {
        this.f123518a = openDirectByteBuffer(byteBuffer);
    }

    GifInfoHandle(byte[] bArr) throws GifIOException {
        this.f123518a = openByteArray(bArr);
    }

    /* renamed from: a */
    private static int m150064a(FileDescriptor fileDescriptor, boolean z) throws GifIOException, ErrnoException {
        try {
            int createTempNativeFileDescriptor = createTempNativeFileDescriptor();
            Os.dup2(fileDescriptor, createTempNativeFileDescriptor);
            return createTempNativeFileDescriptor;
        } finally {
            if (z) {
                Os.close(fileDescriptor);
            }
        }
    }

    /* renamed from: a */
    static GifInfoHandle m150066a(ContentResolver contentResolver, Uri uri) throws IOException {
        if ("file".equals(uri.getScheme())) {
            return new GifInfoHandle(uri.getPath());
        }
        AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
        if (openAssetFileDescriptor != null) {
            return new GifInfoHandle(openAssetFileDescriptor);
        }
        StringBuilder sb = new StringBuilder("Could not open AssetFileDescriptor for ");
        sb.append(uri);
        throw new IOException(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final synchronized void mo123195a(int i, Bitmap bitmap) {
        seekToTime(this.f123518a, i, bitmap);
    }

    /* renamed from: a */
    private static long m150065a(FileDescriptor fileDescriptor, long j, boolean z) throws GifIOException {
        int i;
        if (VERSION.SDK_INT > 27) {
            try {
                i = m150064a(fileDescriptor, z);
            } catch (Exception e) {
                throw new GifIOException(GifError.OPEN_FAILED.errorCode, e.getMessage());
            }
        } else {
            i = extractNativeFileDescriptor(fileDescriptor, z);
        }
        return openNativeFileDescriptor(i, j);
    }
}

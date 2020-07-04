package com.yqritc.scalablevideoview;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnInfoListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.media.MediaPlayer.OnVideoSizeChangedListener;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import android.view.TextureView.SurfaceTextureListener;
import java.io.FileDescriptor;
import java.io.IOException;
import java.util.Map;

public class ScalableVideoView extends TextureView implements OnVideoSizeChangedListener, SurfaceTextureListener {

    /* renamed from: l */
    public MediaPlayer f121409l;

    /* renamed from: m */
    protected ScalableType f121410m;

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    /* renamed from: c */
    private void m147715c() {
        this.f121409l.stop();
    }

    /* renamed from: d */
    private void m147716d() {
        this.f121409l.reset();
    }

    public int getCurrentPosition() {
        return this.f121409l.getCurrentPosition();
    }

    public int getDuration() {
        return this.f121409l.getDuration();
    }

    public int getVideoHeight() {
        return this.f121409l.getVideoHeight();
    }

    public int getVideoWidth() {
        return this.f121409l.getVideoWidth();
    }

    public boolean isPlaying() {
        return this.f121409l.isPlaying();
    }

    public void pause() {
        this.f121409l.pause();
    }

    public void start() {
        this.f121409l.start();
    }

    /* renamed from: b */
    public final void mo118729b() {
        m147716d();
        this.f121409l.release();
        this.f121409l = null;
    }

    /* renamed from: a */
    private void mo7660a() {
        if (this.f121409l == null) {
            this.f121409l = new MediaPlayer();
            this.f121409l.setOnVideoSizeChangedListener(this);
            setSurfaceTextureListener(this);
            return;
        }
        m147716d();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f121409l != null) {
            if (isPlaying()) {
                m147715c();
            }
            mo118729b();
        }
    }

    public ScalableVideoView(Context context) {
        this(context, null);
    }

    public void seekTo(int i) {
        this.f121409l.seekTo(i);
    }

    public void setLooping(boolean z) {
        this.f121409l.setLooping(z);
    }

    public void setOnCompletionListener(OnCompletionListener onCompletionListener) {
        this.f121409l.setOnCompletionListener(onCompletionListener);
    }

    public void setOnErrorListener(OnErrorListener onErrorListener) {
        this.f121409l.setOnErrorListener(onErrorListener);
    }

    public void setOnInfoListener(OnInfoListener onInfoListener) {
        this.f121409l.setOnInfoListener(onInfoListener);
    }

    public void setAssetData(String str) throws IOException {
        setDataSource(getContext().getAssets().openFd(str));
    }

    public void setDataSource(FileDescriptor fileDescriptor) throws IOException {
        mo7660a();
        this.f121409l.setDataSource(fileDescriptor);
    }

    public void setRawData(int i) throws IOException {
        setDataSource(getResources().openRawResourceFd(i));
    }

    public void setScalableType(ScalableType scalableType) {
        this.f121410m = scalableType;
        m147714a(getVideoWidth(), getVideoHeight());
    }

    private void setDataSource(AssetFileDescriptor assetFileDescriptor) throws IOException {
        mo118728a(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        assetFileDescriptor.close();
    }

    public void setDataSource(String str) throws IOException {
        mo7660a();
        this.f121409l.setDataSource(str);
    }

    /* renamed from: a */
    public final void mo118727a(OnPreparedListener onPreparedListener) throws IllegalStateException {
        this.f121409l.setOnPreparedListener(onPreparedListener);
        this.f121409l.prepareAsync();
    }

    /* renamed from: a */
    public final void mo118724a(float f, float f2) {
        this.f121409l.setVolume(f, f2);
    }

    public ScalableVideoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public final void mo118725a(Context context, Uri uri) throws IOException {
        mo7660a();
        this.f121409l.setDataSource(context, uri);
    }

    /* renamed from: a */
    private void m147714a(int i, int i2) {
        if (i != 0 && i2 != 0) {
            Matrix a = new C47241a(new C47243b(getWidth(), getHeight()), new C47243b(i, i2)).mo118751a(this.f121410m);
            if (a != null) {
                setTransform(a);
            }
        }
    }

    public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        m147714a(i, i2);
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        Surface surface = new Surface(surfaceTexture);
        if (this.f121409l != null) {
            this.f121409l.setSurface(surface);
        }
    }

    public ScalableVideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f121410m = ScalableType.NONE;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.scaleStyle, 0, 0);
            if (obtainStyledAttributes != null) {
                int i2 = obtainStyledAttributes.getInt(0, ScalableType.NONE.ordinal());
                obtainStyledAttributes.recycle();
                this.f121410m = ScalableType.values()[i2];
            }
        }
    }

    /* renamed from: a */
    public final void mo118726a(Context context, Uri uri, Map<String, String> map) throws IOException {
        mo7660a();
        this.f121409l.setDataSource(context, uri, map);
    }

    /* renamed from: a */
    public final void mo118728a(FileDescriptor fileDescriptor, long j, long j2) throws IOException {
        mo7660a();
        this.f121409l.setDataSource(fileDescriptor, j, j2);
    }
}

package com.p280ss.video.rtc.engine;

import android.view.Surface;
import android.view.SurfaceView;
import android.view.TextureView;
import com.p280ss.video.rtc.engine.p1833ui.RenderView;

/* renamed from: com.ss.video.rtc.engine.VideoCanvas */
public class VideoCanvas {
    public boolean isScreen;
    public int renderMode;
    public Surface surface;
    public SurfaceView surfaceView;
    public TextureView textureView;
    public String uid;
    public RenderView view;

    public VideoCanvas() {
    }

    public Object getValidRenderView() {
        if (this.textureView == null && this.surfaceView == null) {
            return this.surface;
        }
        if (this.textureView == null) {
            return this.surfaceView;
        }
        return this.textureView;
    }

    public boolean isValid() {
        if (this.view == null && this.surfaceView == null && this.textureView == null && this.surface == null) {
            return false;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("VideoCanvas{view=");
        sb.append(this.view);
        sb.append(", textureView=");
        sb.append(this.textureView);
        sb.append(", surfaceView=");
        sb.append(this.surfaceView);
        sb.append(", Surface=");
        sb.append(this.surface);
        sb.append(", renderMode=");
        sb.append(this.renderMode);
        sb.append(", uid='");
        sb.append(this.uid);
        sb.append('\'');
        sb.append(", isScreen=");
        sb.append(this.isScreen);
        sb.append('}');
        return sb.toString();
    }

    public void setRenderView(RenderView renderView) {
        this.view = renderView;
    }

    public VideoCanvas(RenderView renderView) {
        this.view = renderView;
        this.renderMode = 1;
    }

    public VideoCanvas(Surface surface2, int i, String str) {
        if (!(surface2 instanceof RenderView)) {
            this.surface = surface2;
            this.renderMode = i;
            this.uid = str;
            return;
        }
        throw new RuntimeException(" Surface should not be RenderView");
    }

    public VideoCanvas(SurfaceView surfaceView2, int i, String str) {
        if (!(surfaceView2 instanceof RenderView)) {
            this.surfaceView = surfaceView2;
            this.renderMode = i;
            this.uid = str;
            return;
        }
        throw new RuntimeException("SurfaceView should not be RenderView");
    }

    public VideoCanvas(TextureView textureView2, int i, String str) {
        if (!(textureView2 instanceof RenderView)) {
            this.textureView = textureView2;
            this.renderMode = i;
            this.uid = str;
            return;
        }
        throw new RuntimeException(" TextureView should not be RenderView");
    }

    public VideoCanvas(RenderView renderView, int i, String str) {
        this.view = renderView;
        this.renderMode = i;
        this.uid = str;
    }
}

package com.p280ss.video.rtc.engine.client;

import android.view.SurfaceHolder.Callback;
import android.view.TextureView.SurfaceTextureListener;
import com.C1642a;
import com.p280ss.video.rtc.engine.VideoCanvas;
import com.p280ss.video.rtc.engine.p1833ui.VideoFrameRender;
import com.p280ss.video.rtc.engine.utils.LogUtil;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.ss.video.rtc.engine.client.VideoCanvasManager */
public class VideoCanvasManager {
    private Map<String, VideoCanvas> mVideoCanvasMap = new HashMap();

    public void release() {
        for (Entry value : this.mVideoCanvasMap.entrySet()) {
            VideoCanvas videoCanvas = (VideoCanvas) value.getValue();
            if (!(videoCanvas == null || videoCanvas.view == null)) {
                videoCanvas.view.release();
            }
        }
    }

    private int getRefCount(Object obj) {
        int i = 0;
        for (VideoCanvas videoCanvas : this.mVideoCanvasMap.values()) {
            if (obj == videoCanvas.textureView || obj == videoCanvas.surfaceView || obj == videoCanvas.surface) {
                i++;
            }
        }
        return i;
    }

    private VideoCanvas getRenderView(Object obj) {
        for (VideoCanvas videoCanvas : this.mVideoCanvasMap.values()) {
            if (obj == videoCanvas.textureView || obj == videoCanvas.surfaceView) {
                return videoCanvas;
            }
            if (obj == videoCanvas.surface) {
                return videoCanvas;
            }
        }
        return null;
    }

    public VideoCanvas get(String str, boolean z) {
        return (VideoCanvas) this.mVideoCanvasMap.get(buildKey(str, z));
    }

    private String buildKey(String str, boolean z) {
        String str2;
        String str3 = "%s:%s";
        Object[] objArr = new Object[2];
        objArr[0] = str;
        if (z) {
            str2 = "screen";
        } else {
            str2 = "video";
        }
        objArr[1] = str2;
        return C1642a.m8034a(str3, objArr);
    }

    public void add(String str, boolean z, VideoCanvas videoCanvas) {
        LogUtil.m145278d("VideoCanvasManager", C1642a.m8034a("call-add uid: %s, isScreen: %s, VideoCanvas: %s", new Object[]{str, Boolean.valueOf(z), videoCanvas}));
        String buildKey = buildKey(str, z);
        checkAndUpdateVideoCanvasState(buildKey, videoCanvas, get(str, z));
        this.mVideoCanvasMap.put(buildKey, videoCanvas);
    }

    private void checkAndUpdateVideoCanvasState(String str, VideoCanvas videoCanvas, VideoCanvas videoCanvas2) {
        int i = 0;
        LogUtil.m145278d("VideoCanvasManager", C1642a.m8034a("call-checkAndUpdateVideoCanvasState, key: %s, currentVideoCanvas: %s, oldVideoCanvas: %s", new Object[]{str, videoCanvas, videoCanvas2}));
        if (!(videoCanvas2 == null || videoCanvas2.view == null)) {
            if (videoCanvas != null && videoCanvas.view != null && videoCanvas.getValidRenderView() == videoCanvas2.getValidRenderView()) {
                LogUtil.m145278d("TAG", "oldView is current view, just break");
            } else if (videoCanvas2.textureView == null && videoCanvas2.surfaceView == null && videoCanvas2.surface == null) {
                StringBuilder sb = new StringBuilder("release:");
                sb.append(videoCanvas2.view.toString());
                LogUtil.m145278d("TAG", sb.toString());
                videoCanvas2.view.release();
            } else {
                i = getRefCount(videoCanvas2.getValidRenderView());
                StringBuilder sb2 = new StringBuilder("oldVideoCanvas.getValidRenderView refCount: ");
                sb2.append(i);
                LogUtil.m145278d("TAG", sb2.toString());
                if (i == 1) {
                    StringBuilder sb3 = new StringBuilder("release:");
                    sb3.append(videoCanvas2.view.toString());
                    LogUtil.m145278d("TAG", sb3.toString());
                    videoCanvas2.view.release();
                }
            }
        }
        if (!(videoCanvas == null || (videoCanvas.textureView == null && videoCanvas.surfaceView == null && videoCanvas.surface == null))) {
            StringBuilder sb4 = new StringBuilder("currentVideoCanvas.getValidRenderView refCount: ");
            sb4.append(i);
            LogUtil.m145278d("TAG", sb4.toString());
            if (getRefCount(videoCanvas.getValidRenderView()) == 0) {
                VideoFrameRender videoFrameRender = new VideoFrameRender("Render");
                if (videoCanvas.textureView != null) {
                    videoFrameRender.setRenderView(videoCanvas.textureView, (SurfaceTextureListener) null);
                } else if (videoCanvas.surfaceView != null) {
                    videoFrameRender.setRenderView(videoCanvas.surfaceView, (Callback) null);
                } else if (videoCanvas.surface != null) {
                    videoFrameRender.setRenderView(videoCanvas.surface);
                }
                LogUtil.m145278d("TAG", "currentVideoCanvas.setRenderView");
                videoCanvas.setRenderView(videoFrameRender);
                return;
            }
            VideoCanvas renderView = getRenderView(videoCanvas.getValidRenderView());
            if (renderView != null) {
                videoCanvas.view = renderView.view;
            }
        }
    }
}

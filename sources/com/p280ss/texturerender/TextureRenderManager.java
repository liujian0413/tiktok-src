package com.p280ss.texturerender;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.ss.texturerender.TextureRenderManager */
public class TextureRenderManager {
    private static TextureRenderManager mManager;
    private ReentrantLock mListLock = new ReentrantLock();
    private List<TextureRenderer> mRenderers = new ArrayList();
    private String mTextureError = null;

    public String getTextureError() {
        return this.mTextureError;
    }

    public synchronized void release() {
        releaseRenderers();
        mManager = null;
    }

    private TextureRenderManager() {
    }

    public static synchronized TextureRenderManager getManager() {
        TextureRenderManager textureRenderManager;
        synchronized (TextureRenderManager.class) {
            if (mManager == null) {
                mManager = new TextureRenderManager();
            }
            textureRenderManager = mManager;
        }
        return textureRenderManager;
    }

    private VideoSurface genRenderSurface() {
        VideoSurface videoSurface;
        VideoTextureRenderer videoTextureRenderer = new VideoTextureRenderer();
        if (videoTextureRenderer.getState() != -1) {
            videoSurface = videoTextureRenderer.genOffscreenSurface();
            if (videoSurface == null) {
                this.mTextureError = videoTextureRenderer.getErrorReason();
                videoTextureRenderer.release();
                return null;
            }
            this.mListLock.lock();
            this.mRenderers.add(videoTextureRenderer);
            this.mListLock.unlock();
        } else {
            this.mTextureError = videoTextureRenderer.getErrorReason();
            videoTextureRenderer.release();
            videoSurface = null;
        }
        return videoSurface;
    }

    private void releaseRenderers() {
        if (this.mRenderers.size() != 0) {
            this.mListLock.lock();
            Iterator it = this.mRenderers.iterator();
            while (it.hasNext()) {
                ((TextureRenderer) it.next()).release();
                it.remove();
            }
            this.mListLock.unlock();
        }
    }

    public synchronized VideoSurface genAvaiableSurface() {
        if (this.mRenderers.size() == 0) {
            return genRenderSurface();
        }
        this.mListLock.lock();
        Iterator it = this.mRenderers.iterator();
        VideoSurface videoSurface = null;
        while (it.hasNext()) {
            TextureRenderer textureRenderer = (TextureRenderer) it.next();
            VideoSurface genOffscreenSurface = textureRenderer.genOffscreenSurface();
            if (genOffscreenSurface == null && textureRenderer.getState() <= 0) {
                textureRenderer.release();
                it.remove();
            } else if (genOffscreenSurface != null) {
                this.mListLock.unlock();
                return genOffscreenSurface;
            }
            videoSurface = genOffscreenSurface;
        }
        this.mListLock.unlock();
        if (videoSurface != null) {
            return null;
        }
        return genRenderSurface();
    }
}

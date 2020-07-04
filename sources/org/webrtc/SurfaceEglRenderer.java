package org.webrtc;

import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import java.util.concurrent.CountDownLatch;
import org.webrtc.EglBase.Context;
import org.webrtc.RendererCommon.GlDrawer;
import org.webrtc.RendererCommon.RendererEvents;

public class SurfaceEglRenderer extends EglRenderer implements Callback {
    private int frameRotation;
    private boolean isFirstFrameRendered;
    private boolean isRenderingPaused;
    private final Object layoutLock = new Object();
    private RendererEvents rendererEvents;
    private int rotatedFrameHeight;
    private int rotatedFrameWidth;

    public void disableFpsReduction() {
        synchronized (this.layoutLock) {
            this.isRenderingPaused = false;
        }
        super.disableFpsReduction();
    }

    public void pauseVideo() {
        synchronized (this.layoutLock) {
            this.isRenderingPaused = true;
        }
        super.pauseVideo();
    }

    public void onFrame(VideoFrame videoFrame) {
        updateFrameDimensionsAndReportEvents(videoFrame);
        super.onFrame(videoFrame);
    }

    public SurfaceEglRenderer(String str) {
        super(str);
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        ThreadUtils.checkIsOnMainThread();
        createEglSurface(surfaceHolder.getSurface());
    }

    private void logD(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.name);
        sb.append(": ");
        sb.append(str);
        Logging.m150047d("SurfaceEglRenderer", sb.toString());
    }

    public void setFpsReduction(float f) {
        boolean z;
        synchronized (this.layoutLock) {
            if (f == 0.0f) {
                z = true;
            } else {
                z = false;
            }
            this.isRenderingPaused = z;
        }
        super.setFpsReduction(f);
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        ThreadUtils.checkIsOnMainThread();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        countDownLatch.getClass();
        releaseEglSurface(SurfaceEglRenderer$$Lambda$0.get$Lambda(countDownLatch));
        ThreadUtils.awaitUninterruptibly(countDownLatch);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x009b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void updateFrameDimensionsAndReportEvents(org.webrtc.VideoFrame r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.layoutLock
            monitor-enter(r0)
            boolean r1 = r5.isRenderingPaused     // Catch:{ all -> 0x009c }
            if (r1 == 0) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x009c }
            return
        L_0x0009:
            boolean r1 = r5.isFirstFrameRendered     // Catch:{ all -> 0x009c }
            if (r1 != 0) goto L_0x001e
            r1 = 1
            r5.isFirstFrameRendered = r1     // Catch:{ all -> 0x009c }
            java.lang.String r1 = "Reporting first rendered frame."
            r5.logD(r1)     // Catch:{ all -> 0x009c }
            org.webrtc.RendererCommon$RendererEvents r1 = r5.rendererEvents     // Catch:{ all -> 0x009c }
            if (r1 == 0) goto L_0x001e
            org.webrtc.RendererCommon$RendererEvents r1 = r5.rendererEvents     // Catch:{ all -> 0x009c }
            r1.onFirstFrameRendered()     // Catch:{ all -> 0x009c }
        L_0x001e:
            int r1 = r5.rotatedFrameWidth     // Catch:{ all -> 0x009c }
            int r2 = r6.getRotatedWidth()     // Catch:{ all -> 0x009c }
            if (r1 != r2) goto L_0x0036
            int r1 = r5.rotatedFrameHeight     // Catch:{ all -> 0x009c }
            int r2 = r6.getRotatedHeight()     // Catch:{ all -> 0x009c }
            if (r1 != r2) goto L_0x0036
            int r1 = r5.frameRotation     // Catch:{ all -> 0x009c }
            int r2 = r6.getRotation()     // Catch:{ all -> 0x009c }
            if (r1 == r2) goto L_0x009a
        L_0x0036:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x009c }
            java.lang.String r2 = "Reporting frame resolution changed to "
            r1.<init>(r2)     // Catch:{ all -> 0x009c }
            org.webrtc.VideoFrame$Buffer r2 = r6.getBuffer()     // Catch:{ all -> 0x009c }
            int r2 = r2.getWidth()     // Catch:{ all -> 0x009c }
            r1.append(r2)     // Catch:{ all -> 0x009c }
            java.lang.String r2 = "x"
            r1.append(r2)     // Catch:{ all -> 0x009c }
            org.webrtc.VideoFrame$Buffer r2 = r6.getBuffer()     // Catch:{ all -> 0x009c }
            int r2 = r2.getHeight()     // Catch:{ all -> 0x009c }
            r1.append(r2)     // Catch:{ all -> 0x009c }
            java.lang.String r2 = " with rotation "
            r1.append(r2)     // Catch:{ all -> 0x009c }
            int r2 = r6.getRotation()     // Catch:{ all -> 0x009c }
            r1.append(r2)     // Catch:{ all -> 0x009c }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x009c }
            r5.logD(r1)     // Catch:{ all -> 0x009c }
            org.webrtc.RendererCommon$RendererEvents r1 = r5.rendererEvents     // Catch:{ all -> 0x009c }
            if (r1 == 0) goto L_0x0088
            org.webrtc.RendererCommon$RendererEvents r1 = r5.rendererEvents     // Catch:{ all -> 0x009c }
            org.webrtc.VideoFrame$Buffer r2 = r6.getBuffer()     // Catch:{ all -> 0x009c }
            int r2 = r2.getWidth()     // Catch:{ all -> 0x009c }
            org.webrtc.VideoFrame$Buffer r3 = r6.getBuffer()     // Catch:{ all -> 0x009c }
            int r3 = r3.getHeight()     // Catch:{ all -> 0x009c }
            int r4 = r6.getRotation()     // Catch:{ all -> 0x009c }
            r1.onFrameResolutionChanged(r2, r3, r4)     // Catch:{ all -> 0x009c }
        L_0x0088:
            int r1 = r6.getRotatedWidth()     // Catch:{ all -> 0x009c }
            r5.rotatedFrameWidth = r1     // Catch:{ all -> 0x009c }
            int r1 = r6.getRotatedHeight()     // Catch:{ all -> 0x009c }
            r5.rotatedFrameHeight = r1     // Catch:{ all -> 0x009c }
            int r6 = r6.getRotation()     // Catch:{ all -> 0x009c }
            r5.frameRotation = r6     // Catch:{ all -> 0x009c }
        L_0x009a:
            monitor-exit(r0)     // Catch:{ all -> 0x009c }
            return
        L_0x009c:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x009c }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.SurfaceEglRenderer.updateFrameDimensionsAndReportEvents(org.webrtc.VideoFrame):void");
    }

    public void init(Context context, int[] iArr, GlDrawer glDrawer) {
        init(context, null, iArr, glDrawer);
    }

    public void init(Context context, RendererEvents rendererEvents2, int[] iArr, GlDrawer glDrawer) {
        ThreadUtils.checkIsOnMainThread();
        this.rendererEvents = rendererEvents2;
        synchronized (this.layoutLock) {
            this.isFirstFrameRendered = false;
            this.rotatedFrameWidth = 0;
            this.rotatedFrameHeight = 0;
            this.frameRotation = 0;
        }
        super.init(context, iArr, glDrawer);
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        ThreadUtils.checkIsOnMainThread();
        StringBuilder sb = new StringBuilder("surfaceChanged: format: ");
        sb.append(i);
        sb.append(" size: ");
        sb.append(i2);
        sb.append("x");
        sb.append(i3);
        logD(sb.toString());
    }
}

package com.p280ss.avframework.livestreamv2.interact.vendor.zego;

import android.os.Handler;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheTTnetProxyTimeoutExperiment;
import com.p280ss.avframework.livestreamv2.interact.callback.EngineCallback;
import com.p280ss.avframework.livestreamv2.interact.model.Config.VideoOutputFormat;
import com.p280ss.avframework.livestreamv2.interact.statistic.LogReporter.LogReportCallback;
import com.p280ss.avframework.livestreamv2.interact.statistic.RenderVideoFpsStatistics;
import com.p280ss.avframework.livestreamv2.interact.statistic.RenderVideoFpsStatistics.RenderVideoFpsStatisticsReport;
import com.p280ss.avframework.livestreamv2.interact.statistic.RenderVideoStallStatistics;
import com.p280ss.avframework.livestreamv2.interact.statistic.RenderVideoStallStatistics.IRenderVideoStallCallback;
import com.p280ss.avframework.livestreamv2.interact.utils.LogUtil;
import com.p280ss.avframework.utils.AVLog;
import com.zego.zegoavkit2.entities.VideoFrame;
import com.zego.zegoavkit2.enums.VideoPixelFormat;
import com.zego.zegoavkit2.videorender.IZegoVideoRenderCallback;
import com.zego.zegoavkit2.videorender.VideoRenderType;
import com.zego.zegoavkit2.videorender.ZegoExternalVideoRender;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.avframework.livestreamv2.interact.vendor.zego.ZegoVideoSink */
public class ZegoVideoSink implements IZegoVideoRenderCallback {
    private boolean isFirstRenderFrame = true;
    private EngineCallback mCallback;
    private Handler mHandler;
    private final Object mInteractFence;
    private List<Integer> mInteractIdList;
    private LogReportCallback mLogReportCallback;
    private Map<Integer, RenderVideoFpsStatistics> mRenderFpsStatisticsMap = new HashMap();
    private Map<Integer, RenderVideoStallStatistics> mRenderStatisticsMap = new HashMap();
    private IRenderVideoStallCallback mRenderVideoStallCallback;
    private volatile boolean started;

    public void stop() {
        this.started = false;
    }

    public void start() {
        this.isFirstRenderFrame = true;
        this.started = true;
    }

    public ArrayList<RenderVideoFpsStatisticsReport> getVideoFpsReport() {
        ArrayList<RenderVideoFpsStatisticsReport> arrayList = new ArrayList<>();
        for (RenderVideoFpsStatistics avgRenderFps : this.mRenderFpsStatisticsMap.values()) {
            RenderVideoFpsStatisticsReport avgRenderFps2 = avgRenderFps.getAvgRenderFps();
            if (avgRenderFps2 != null) {
                arrayList.add(avgRenderFps2);
            }
        }
        return arrayList;
    }

    public void release() {
        if (this.started) {
            stop();
        }
        for (RenderVideoStallStatistics stopStatistics : this.mRenderStatisticsMap.values()) {
            stopStatistics.stopStatistics();
        }
        this.mRenderStatisticsMap.clear();
        this.mRenderFpsStatisticsMap.clear();
        this.mInteractIdList.clear();
        ZegoExternalVideoRender.setVideoRenderCallback(null);
    }

    public static void enableExternalVideoRender(boolean z) {
        VideoRenderType videoRenderType;
        if (z) {
            videoRenderType = VideoRenderType.VIDEO_RENDER_TYPE_EXTERNAL_INTERNAL_YUV;
        } else {
            videoRenderType = VideoRenderType.VIDEO_RENDER_TYPE_NONE;
        }
        ZegoExternalVideoRender.setVideoRenderType(videoRenderType);
    }

    private void onFirstRenderFrameReport(int i) {
        if (this.mLogReportCallback != null) {
            this.mLogReportCallback.onFirstRemoteVideoRender(i);
        }
    }

    private void removeRenderVideoStatistics(int i) {
        ((RenderVideoStallStatistics) this.mRenderStatisticsMap.remove(Integer.valueOf(i))).stopStatistics();
    }

    private void addRenderVideoStatistics(int i) {
        RenderVideoStallStatistics renderVideoStallStatistics = new RenderVideoStallStatistics(i, this.mRenderVideoStallCallback, this.mHandler);
        this.mRenderStatisticsMap.put(Integer.valueOf(i), renderVideoStallStatistics);
        renderVideoStallStatistics.startStatistics();
        this.mRenderFpsStatisticsMap.put(Integer.valueOf(i), new RenderVideoFpsStatistics(i));
    }

    private VideoOutputFormat getZegoVideoOutputFormat(VideoPixelFormat videoPixelFormat) {
        switch (videoPixelFormat) {
            case PIXEL_FORMAT_I420:
                return VideoOutputFormat.PIXEL_FORMAT_I420;
            case PIXEL_FORMAT_NV12:
                return VideoOutputFormat.PIXEL_FORMAT_NV12;
            case PIXEL_FORMAT_NV21:
                return VideoOutputFormat.PIXEL_FORMAT_NV21;
            case PIXEL_FORMAT_RGBA32:
                return VideoOutputFormat.PIXEL_FORMAT_RGBA32;
            case PIXEL_FORMAT_BGRA32:
                return VideoOutputFormat.PIXEL_FORMAT_BGRA32;
            case PIXEL_FORMAT_ARGB32:
                return VideoOutputFormat.PIXEL_FORMAT_ARGB32;
            case PIXEL_FORMAT_ABGR32:
                return VideoOutputFormat.PIXEL_FORMAT_ABGR32;
            default:
                return VideoOutputFormat.PIXEL_FORMAT_UNKNOWN;
        }
    }

    public void onUserJoined(int i) {
        synchronized (this.mInteractFence) {
            for (Integer intValue : this.mInteractIdList) {
                if (intValue.intValue() == i) {
                    return;
                }
            }
            this.mInteractIdList.add(Integer.valueOf(i));
            addRenderVideoStatistics(i);
        }
    }

    public void onUserLeaved(int i) {
        synchronized (this.mInteractFence) {
            Iterator it = this.mInteractIdList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Integer num = (Integer) it.next();
                if (num.intValue() == i) {
                    this.mInteractIdList.remove(num);
                    removeRenderVideoStatistics(i);
                    break;
                }
            }
        }
    }

    public static void enableVideoFrameCallback(boolean z, String str) {
        ZegoExternalVideoRender.enableVideoRender(z, str);
    }

    public void setFlipMode(String str, int i) {
        StringBuilder sb = new StringBuilder("setFlipMode(\"");
        sb.append(str);
        sb.append("\", ");
        sb.append(i);
        sb.append(")");
        AVLog.iow("ZegoVideoSink", sb.toString());
        StringBuilder sb2 = new StringBuilder("setFlipMode(\"");
        sb2.append(str);
        sb2.append("\", ");
        sb2.append(i);
        sb2.append(")");
        LogUtil.m143695w(sb2.toString());
    }

    public void onVideoRenderCallback(VideoFrame videoFrame, VideoPixelFormat videoPixelFormat, String str) {
        int i;
        if (this.started) {
            try {
                if (videoPixelFormat == VideoPixelFormat.PIXEL_FORMAT_I420) {
                    try {
                        i = Integer.valueOf(ZegoEngine.splitInteractIdFromStreamId(str)).intValue();
                    } catch (Exception unused) {
                        i = 0;
                    }
                    synchronized (this.mInteractFence) {
                        if (!this.mInteractIdList.contains(Integer.valueOf(i))) {
                            StringBuilder sb = new StringBuilder("interact id ");
                            sb.append(i);
                            sb.append(" is not in the list.");
                            throw new Exception(sb.toString());
                        }
                    }
                    RenderVideoStallStatistics renderVideoStallStatistics = (RenderVideoStallStatistics) this.mRenderStatisticsMap.get(Integer.valueOf(i));
                    if (renderVideoStallStatistics != null) {
                        renderVideoStallStatistics.rendVideoFrame();
                    }
                    RenderVideoFpsStatistics renderVideoFpsStatistics = (RenderVideoFpsStatistics) this.mRenderFpsStatisticsMap.get(Integer.valueOf(i));
                    if (renderVideoFpsStatistics != null) {
                        renderVideoFpsStatistics.rendVideoFrame();
                    }
                    if (this.isFirstRenderFrame) {
                        this.isFirstRenderFrame = false;
                        onFirstRenderFrameReport(i);
                    }
                    if (this.mCallback != null) {
                        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(((videoFrame.width * videoFrame.height) * 3) / 2);
                        allocateDirect.clear();
                        int[] iArr = {videoFrame.width, videoFrame.width / 2, videoFrame.width / 2};
                        int[] iArr2 = {videoFrame.height, videoFrame.height / 2, videoFrame.height / 2};
                        byte[] array = allocateDirect.array();
                        int arrayOffset = allocateDirect.arrayOffset() + allocateDirect.position();
                        int i2 = 0;
                        while (i2 < 3) {
                            ByteBuffer byteBuffer = videoFrame.byteBuffers[i2];
                            if (byteBuffer != null) {
                                if (videoFrame.strides[i2] == iArr[i2]) {
                                    allocateDirect.put(byteBuffer);
                                } else if (videoFrame.strides[i2] > iArr[i2]) {
                                    int i3 = arrayOffset;
                                    for (int i4 = 0; i4 < iArr2[i2]; i4++) {
                                        byteBuffer.get(array, i3, iArr[i2]);
                                        byteBuffer.position((byteBuffer.position() + videoFrame.strides[i2]) - iArr[i2]);
                                        i3 += iArr[i2];
                                    }
                                    arrayOffset = i3;
                                } else {
                                    StringBuilder sb2 = new StringBuilder("video frame strides[");
                                    sb2.append(i2);
                                    sb2.append("] = ");
                                    sb2.append(videoFrame.strides[i2]);
                                    sb2.append(" is too small");
                                    throw new Exception(sb2.toString());
                                }
                                i2++;
                            } else {
                                StringBuilder sb3 = new StringBuilder("buffer ");
                                sb3.append(i2);
                                sb3.append(" is null.");
                                throw new Exception(sb3.toString());
                            }
                        }
                        this.mCallback.onReceiveVideoBufferFrame(i, allocateDirect, getZegoVideoOutputFormat(videoPixelFormat), videoFrame.width, videoFrame.height, 0, System.currentTimeMillis());
                        return;
                    }
                    return;
                }
                StringBuilder sb4 = new StringBuilder("videoPixelFormat unsupported: ");
                sb4.append(videoPixelFormat);
                throw new Exception(sb4.toString());
            } catch (Exception e) {
                AVLog.logToIODevice2(6, "ZegoVideoSink", e.toString(), null, "ZegoVideoSink.java:onVideoRenderCallback", VideoCacheTTnetProxyTimeoutExperiment.DEFAULT);
                LogUtil.m143692e(e.toString());
            }
        }
    }

    public ZegoVideoSink(EngineCallback engineCallback, IRenderVideoStallCallback iRenderVideoStallCallback, LogReportCallback logReportCallback, Handler handler) {
        ZegoExternalVideoRender.setVideoRenderCallback(this);
        this.mCallback = engineCallback;
        this.mRenderVideoStallCallback = iRenderVideoStallCallback;
        this.mLogReportCallback = logReportCallback;
        this.mHandler = handler;
        this.mInteractIdList = new ArrayList();
        this.mInteractFence = new Object();
    }
}

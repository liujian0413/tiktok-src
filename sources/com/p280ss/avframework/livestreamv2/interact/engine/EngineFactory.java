package com.p280ss.avframework.livestreamv2.interact.engine;

import android.util.Log;
import com.p280ss.avframework.livestreamv2.interact.audio.AudioClientFactory;
import com.p280ss.avframework.livestreamv2.interact.callback.EngineCallback;
import com.p280ss.avframework.livestreamv2.interact.model.Config;
import com.p280ss.avframework.livestreamv2.interact.model.Config.Vendor;
import com.p280ss.avframework.livestreamv2.interact.video.VideoClientFactory;
import com.p280ss.avframework.utils.AVLog;

/* renamed from: com.ss.avframework.livestreamv2.interact.engine.EngineFactory */
public class EngineFactory {
    private static EngineFactory sEngineFactory;
    private Class<?> mAgoraEngine;
    private Class<?> mByteEngine;
    private Class<?> mZegoEngine;

    public static boolean supportsIntereact() {
        return get().support();
    }

    public static EngineFactory get() {
        synchronized (EngineFactory.class) {
            if (sEngineFactory == null) {
                sEngineFactory = new EngineFactory();
            }
        }
        return sEngineFactory;
    }

    public boolean support() {
        if (this.mAgoraEngine == null && this.mZegoEngine == null && this.mByteEngine == null) {
            return false;
        }
        return true;
    }

    public EngineFactory() {
        StringBuilder sb = new StringBuilder();
        try {
            this.mAgoraEngine = Class.forName("com.ss.avframework.livestreamv2.interact.vendor.agora.AgoraEngine");
            sb.append("agora");
        } catch (ClassNotFoundException e) {
            AVLog.m143700w("EngineFactory", Log.getStackTraceString(e));
        }
        try {
            this.mZegoEngine = Class.forName("com.ss.avframework.livestreamv2.interact.vendor.zego.ZegoEngine");
            sb.append("|zego");
        } catch (ClassNotFoundException e2) {
            AVLog.m143700w("EngineFactory", Log.getStackTraceString(e2));
        }
        try {
            this.mByteEngine = Class.forName("com.ss.avframework.livestreamv2.interact.vendor.bytertc.ByteEngine");
            sb.append("|bytertc");
        } catch (ClassNotFoundException e3) {
            AVLog.m143700w("EngineFactory", Log.getStackTraceString(e3));
        }
        StringBuilder sb2 = new StringBuilder("Find intereact: ");
        sb2.append(sb.toString());
        AVLog.iod("EngineFactory", sb2.toString());
    }

    public Engine createEngine(Class<?> cls, Config config, VideoClientFactory videoClientFactory, AudioClientFactory audioClientFactory, EngineCallback engineCallback) {
        if (cls != null) {
            try {
                return (Engine) cls.getConstructor(new Class[]{Config.class, VideoClientFactory.class, AudioClientFactory.class, EngineCallback.class}).newInstance(new Object[]{config, videoClientFactory, audioClientFactory, engineCallback});
            } catch (Throwable th) {
                AVLog.m143700w("EngineFactory", Log.getStackTraceString(th));
            }
        }
        return null;
    }

    public static Engine create(Vendor vendor, Config config, VideoClientFactory videoClientFactory, AudioClientFactory audioClientFactory, EngineCallback engineCallback) {
        Class cls;
        Class<?> cls2;
        Engine engine = null;
        switch (vendor) {
            case AGORA:
                cls2 = get().mAgoraEngine;
                break;
            case BYTE:
                cls2 = get().mByteEngine;
                break;
            case ZEGO:
                cls2 = get().mZegoEngine;
                break;
            default:
                cls = null;
                break;
        }
        cls = cls2;
        if (cls != null) {
            engine = get().createEngine(cls, config, videoClientFactory, audioClientFactory, engineCallback);
        }
        if (engine == null) {
            return new DummyEngine(config, videoClientFactory, audioClientFactory, engineCallback);
        }
        return engine;
    }
}

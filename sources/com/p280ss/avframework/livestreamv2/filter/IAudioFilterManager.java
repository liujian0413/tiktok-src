package com.p280ss.avframework.livestreamv2.filter;

import android.content.Context;
import android.os.Handler;
import android.util.Log;
import com.p280ss.avframework.livestreamv2.audioeffect.AudioEffectProcessor;
import com.p280ss.avframework.livestreamv2.audioeffect.DummyAudioFilterManager;
import com.p280ss.avframework.utils.AVLog;

/* renamed from: com.ss.avframework.livestreamv2.filter.IAudioFilterManager */
public abstract class IAudioFilterManager extends AudioEffectProcessor {
    protected boolean mEnable;

    public boolean isDummy() {
        return true;
    }

    public boolean isEnable() {
        return this.mEnable;
    }

    public abstract String name();

    public void start() {
    }

    public void stop() {
    }

    public void setEnable(boolean z) {
        this.mEnable = z;
    }

    public static IAudioFilterManager create(Context context, Handler handler) {
        try {
            return (IAudioFilterManager) Class.forName("com.ss.avframework.livestreamv2.audioeffect.AudioFilterManager").getMethod("create", new Class[]{Context.class, Handler.class}).invoke(null, new Object[]{context, handler});
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder("Create audio filter failed with using dummy(cause: ");
            sb.append(Log.getStackTraceString(th));
            sb.append(")");
            AVLog.m143700w("IAudioFilterManager", sb.toString());
            return new DummyAudioFilterManager();
        }
    }
}

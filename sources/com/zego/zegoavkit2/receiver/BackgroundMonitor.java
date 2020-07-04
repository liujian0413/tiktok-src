package com.zego.zegoavkit2.receiver;

import android.app.Application;
import android.content.Context;
import com.zego.zegoavkit2.receiver.Background.Binding;
import com.zego.zegoavkit2.receiver.Background.Listener;

public final class BackgroundMonitor implements Listener {
    private Binding mListenerBinding;
    private long mThis;

    static native void onBackgroundStatusChanged(long j, boolean z);

    public final void onBecameBackground() {
        onBackgroundStatusChanged(this.mThis, true);
    }

    public final void onBecameForeground() {
        onBackgroundStatusChanged(this.mThis, false);
    }

    public final boolean isBackground() {
        return Background.get().isBackground();
    }

    public final int uninit() {
        if (this.mListenerBinding != null) {
            this.mListenerBinding.unbind();
        }
        return 0;
    }

    public final void setThis(long j) {
        this.mThis = j;
    }

    public final int init(Context context) {
        if (context == null || !(context instanceof Application)) {
            return -1;
        }
        this.mListenerBinding = Background.get().init((Application) context).addListener(this);
        return 0;
    }
}

package com.bytedance.android.p108b;

import android.content.Context;

/* renamed from: com.bytedance.android.b.a */
public interface C2260a {

    /* renamed from: com.bytedance.android.b.a$a */
    public interface C2261a {
        /* renamed from: a */
        void mo8025a(int i, int i2);

        /* renamed from: a */
        void mo8026a(int i, String str);

        /* renamed from: a */
        void mo8027a(Exception exc);

        /* renamed from: a */
        void mo8028a(Object obj);

        /* renamed from: j */
        void mo8029j();

        /* renamed from: k */
        void mo8030k();

        /* renamed from: l */
        void mo8031l();

        /* renamed from: m */
        void mo8032m();

        /* renamed from: n */
        void mo8033n();
    }

    long getAudioLostFocusTime();

    int getDecodeStatus();

    String getMediaErrorMessage();

    void getVideoSize(int[] iArr);

    boolean hasWarmedUp();

    boolean isVideoHorizontal();

    void onBackground();

    void onForeground();

    void recycle();

    void setAnchorInteractMode(boolean z);

    void setMute(boolean z);

    void setScreenOrientation(boolean z);

    void setSeiOpen(boolean z);

    boolean start();

    boolean startWithNewLivePlayer();

    void stop(boolean z);

    void stopWhenJoinInteract(Context context);

    void stopWhenPlayingOther(Context context);

    void switchResolution(String str);

    boolean tryResumePlay();
}

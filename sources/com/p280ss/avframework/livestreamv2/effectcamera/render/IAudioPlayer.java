package com.p280ss.avframework.livestreamv2.effectcamera.render;

/* renamed from: com.ss.avframework.livestreamv2.effectcamera.render.IAudioPlayer */
public interface IAudioPlayer {

    /* renamed from: com.ss.avframework.livestreamv2.effectcamera.render.IAudioPlayer$IFactory */
    public interface IFactory {
        IAudioPlayer createAudioPlayer();

        void destroyAudioPlayer(IAudioPlayer iAudioPlayer);
    }

    int getCurLoop();

    float getCurrentPlayTime();

    int getLoopCnt();

    float getTotalPlayTime();

    int init();

    boolean isPlaying();

    void pause();

    int release();

    void restartPlay();

    void resume();

    boolean seek(int i);

    void setCurLoopCount(int i);

    void setDataSource(String str);

    void setLoop(int i);

    void setLoop(boolean z);

    boolean setVolume(float f);

    void startPlay();

    void stopPlay();
}

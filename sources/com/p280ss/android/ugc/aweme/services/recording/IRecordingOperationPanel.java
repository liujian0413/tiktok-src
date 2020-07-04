package com.p280ss.android.ugc.aweme.services.recording;

import android.arch.lifecycle.Lifecycle;
import android.support.p022v4.app.C0608j;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.framework.services.IStickerService.FaceSticker;
import com.p280ss.android.ugc.aweme.shortvideo.p1584n.C40187b;
import com.p280ss.android.ugc.aweme.shortvideo.p1584n.C40189d;

/* renamed from: com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel */
public interface IRecordingOperationPanel {
    RemoteImageView backgroundView();

    void closeRecording();

    C40187b filterModule();

    C0608j fragmentManager();

    int getCameraPos();

    Lifecycle getLifecycle();

    void onGameStickerChosen(FaceSticker faceSticker, String str);

    void onHidePanel(String str);

    void onShowPanel(String str);

    void onStickerCancel(FaceSticker faceSticker, String str);

    void onStickerChosen(FaceSticker faceSticker, String str);

    void setCameraPos(int i);

    void updateLiveBackgroundView();

    C40189d videoRecorder();
}

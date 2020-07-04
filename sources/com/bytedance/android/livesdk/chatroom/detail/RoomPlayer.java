package com.bytedance.android.livesdk.chatroom.detail;

import android.content.Context;
import android.text.TextUtils;
import android.view.TextureView;
import com.bytedance.android.live.livepullstream.api.C3450b;
import com.bytedance.android.live.room.C3491h;
import com.bytedance.android.live.room.C3495l;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdkapi.depend.live.ILivePlayController.C9318b;
import com.bytedance.android.livesdkapi.depend.live.ILivePlayController.C9319c;
import com.bytedance.android.livesdkapi.depend.live.ILivePlayController.PlayerMessage;
import com.bytedance.android.livesdkapi.depend.model.live.C9383t.C9384a;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.p108b.C2260a;
import com.bytedance.android.p108b.C2260a.C2261a;

public class RoomPlayer implements C2260a {
    private static final int MASK = 65535;
    private static final int OFFSET = 16;
    private static final String TAG = "RoomPlayer";
    private boolean isBackground;
    private C4317a mAudioFocusController;
    private final C2261a mCallback;
    private final Context mContext;
    private int mDecodeStatus;
    private String mDefaultResolution;
    private C3491h mLivePlayController;
    private String mMediaErrorMessage;
    private String mPullStreamData;
    private C9384a mSrConfig;
    private boolean mStopOnPlayingOther;
    private final LiveMode mStreamType;
    private String mStreamUrl;
    private final TextureView mTextureView;
    private boolean openSEI = true;
    private String sdkParams;

    public int getDecodeStatus() {
        return this.mDecodeStatus;
    }

    public String getMediaErrorMessage() {
        return this.mMediaErrorMessage;
    }

    public boolean hasWarmedUp() {
        return false;
    }

    public void recycle() {
    }

    public long getAudioLostFocusTime() {
        if (this.mAudioFocusController == null) {
            return -1;
        }
        return this.mAudioFocusController.f12540d;
    }

    public boolean isVideoHorizontal() {
        if (this.mLivePlayController == null || !this.mLivePlayController.mo10505a()) {
            return false;
        }
        return true;
    }

    public void onBackground() {
        this.isBackground = true;
        if (this.mAudioFocusController != null) {
            this.mAudioFocusController.mo11994a(true);
        }
    }

    public void onForeground() {
        this.isBackground = false;
        if (this.mAudioFocusController != null) {
            this.mAudioFocusController.mo11994a(false);
            this.mAudioFocusController.mo11993a(this.mContext);
        }
    }

    public boolean tryResumePlay() {
        if (!this.mStopOnPlayingOther) {
            return false;
        }
        this.mStopOnPlayingOther = false;
        if (!TextUtils.isEmpty(this.mPullStreamData)) {
            doStartPlayByMultiPullStreamData();
        } else if (TextUtils.isEmpty(this.mStreamUrl)) {
            return false;
        } else {
            doStartPlayByStreamUrl();
        }
        return true;
    }

    private void doStartPlayByMultiPullStreamData() {
        C9319c a;
        this.isBackground = false;
        this.mAudioFocusController.mo11993a(this.mContext);
        try {
            C3491h hVar = this.mLivePlayController;
            String str = this.mPullStreamData;
            String str2 = this.mDefaultResolution;
            TextureView textureView = this.mTextureView;
            int ordinal = this.mStreamType.ordinal();
            if (this.mSrConfig == null) {
                a = null;
            } else {
                a = C9319c.m27713a().mo22793a(this.mSrConfig.f25798a).mo22795b(this.mSrConfig.f25799b).mo22792a(this.mSrConfig.f25800c).mo22794a();
            }
            hVar.mo21784a(str, str2, textureView, ordinal, a, (C9318b) new C4336k(this));
        } catch (Exception e) {
            this.mCallback.mo8027a(e);
        }
    }

    private void doStartPlayByStreamUrl() {
        C9319c a;
        this.mAudioFocusController.mo11993a(this.mContext);
        try {
            C3491h hVar = this.mLivePlayController;
            String str = this.mStreamUrl;
            TextureView textureView = this.mTextureView;
            int ordinal = this.mStreamType.ordinal();
            if (this.mSrConfig == null) {
                a = null;
            } else {
                a = C9319c.m27713a().mo22793a(this.mSrConfig.f25798a).mo22795b(this.mSrConfig.f25799b).mo22792a(this.mSrConfig.f25800c).mo22794a();
            }
            hVar.mo21783a(str, textureView, ordinal, a, (C9318b) new C4335j(this), this.sdkParams);
        } catch (Exception e) {
            this.mCallback.mo8027a(e);
        }
    }

    public boolean start() {
        if (this.mLivePlayController != null) {
            return true;
        }
        if (!TextUtils.isEmpty(this.mPullStreamData)) {
            this.mLivePlayController = ((C3450b) C3596c.m13172a(C3450b.class)).getLivePlayController();
            this.mLivePlayController.mo10510c(this.openSEI);
            this.mAudioFocusController = new C4317a(this.mLivePlayController);
            doStartPlayByMultiPullStreamData();
        } else if (TextUtils.isEmpty(this.mStreamUrl)) {
            return false;
        } else {
            this.mLivePlayController = ((C3450b) C3596c.m13172a(C3450b.class)).getLivePlayController();
            this.mLivePlayController.mo10510c(this.openSEI);
            this.mAudioFocusController = new C4317a(this.mLivePlayController);
            doStartPlayByStreamUrl();
        }
        return true;
    }

    public boolean startWithNewLivePlayer() {
        if (this.mLivePlayController != null) {
            return true;
        }
        if (TextUtils.isEmpty(this.mPullStreamData) && TextUtils.isEmpty(this.mStreamUrl)) {
            return false;
        }
        this.mLivePlayController = ((C3450b) C3596c.m13172a(C3450b.class)).getLivePlayController();
        this.mLivePlayController.mo21790e();
        this.mLivePlayController.mo10510c(true);
        this.mAudioFocusController = new C4317a(this.mLivePlayController);
        if (!TextUtils.isEmpty(this.mPullStreamData)) {
            doStartPlayByMultiPullStreamData();
        } else {
            doStartPlayByStreamUrl();
        }
        return true;
    }

    public void setSeiOpen(boolean z) {
        this.openSEI = z;
    }

    public void setAnchorInteractMode(boolean z) {
        if (this.mLivePlayController != null) {
            this.mLivePlayController.mo10504a(z);
        }
    }

    public void setMute(boolean z) {
        if (this.mLivePlayController != null) {
            this.mLivePlayController.mo21785a(z, this.mContext);
        }
    }

    public void setScreenOrientation(boolean z) {
        if (this.mLivePlayController != null) {
            this.mLivePlayController.mo10508b(z);
        }
    }

    public void stopWhenJoinInteract(Context context) {
        if (this.mLivePlayController != null) {
            this.mLivePlayController.mo10507b(context);
        }
    }

    public void stopWhenPlayingOther(Context context) {
        if (this.mLivePlayController != null) {
            this.mLivePlayController.mo21794f(context);
        }
    }

    public void switchResolution(String str) {
        if (this.mLivePlayController != null) {
            this.mLivePlayController.mo21782a(str);
        }
    }

    public void getVideoSize(int[] iArr) {
        if (this.mLivePlayController != null && iArr != null) {
            int f = this.mLivePlayController.mo21793f();
            iArr[0] = MASK & f;
            iArr[1] = f >> 16;
        }
    }

    public void stop(boolean z) {
        if (this.mAudioFocusController != null) {
            if (z) {
                this.mAudioFocusController.mo11995b(this.mContext);
            } else {
                this.mAudioFocusController.mo11992a();
            }
            this.mAudioFocusController = null;
        }
        if (this.mLivePlayController != null) {
            this.mLivePlayController.mo10501a(this.mContext);
            if (z) {
                this.mLivePlayController.mo21791e(this.mContext);
            }
            this.mLivePlayController = null;
        }
        this.mDecodeStatus = 0;
        this.mMediaErrorMessage = null;
        this.mStopOnPlayingOther = false;
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void lambda$doStartPlayByMultiPullStreamData$1$RoomPlayer(PlayerMessage playerMessage, Object obj) {
        if (this.mAudioFocusController != null && this.mLivePlayController != null) {
            switch (playerMessage) {
                case COMPLETE_PLAY:
                    this.mCallback.mo8029j();
                    return;
                case MEDIA_ERROR:
                    this.mCallback.mo8029j();
                    if (obj != null) {
                        this.mMediaErrorMessage = obj.toString();
                    }
                    if (this.mDecodeStatus != 1) {
                        this.mDecodeStatus = 2;
                        this.mCallback.mo8026a(PlayerMessage.MEDIA_ERROR.ordinal(), this.mMediaErrorMessage);
                        return;
                    }
                    break;
                case DISPLAYED_PLAY:
                    ((C3495l) C3596c.m13172a(C3495l.class)).cacheObj2Obj(this.mCallback, this.mLivePlayController);
                    this.mDecodeStatus = 1;
                    if (!this.isBackground) {
                        this.mAudioFocusController.mo11993a(this.mContext);
                    }
                    this.mCallback.mo8030k();
                    return;
                case STOP_WHEN_PLAYING_OTHER:
                    this.mStopOnPlayingOther = true;
                    this.mAudioFocusController.mo11995b(this.mContext);
                    return;
                case STOP_WHEN_JOIN_INTERACT:
                    this.mStopOnPlayingOther = true;
                    return;
                case INTERACT_SEI:
                    this.mCallback.mo8028a(obj);
                    return;
                case BUFFERING_START:
                    this.mCallback.mo8031l();
                    return;
                case BUFFERING_END:
                    this.mCallback.mo8032m();
                    return;
                case VIDEO_SIZE_CHANGED:
                    int parseInt = Integer.parseInt((String) obj);
                    this.mCallback.mo8025a(MASK & parseInt, parseInt >> 16);
                    return;
                case PLAYER_DETACHED:
                    this.mCallback.mo8033n();
                    break;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void lambda$doStartPlayByStreamUrl$0$RoomPlayer(PlayerMessage playerMessage, Object obj) {
        if (this.mAudioFocusController != null && this.mLivePlayController != null) {
            switch (playerMessage) {
                case COMPLETE_PLAY:
                    this.mCallback.mo8029j();
                    return;
                case MEDIA_ERROR:
                    this.mCallback.mo8029j();
                    if (obj != null) {
                        this.mMediaErrorMessage = obj.toString();
                    }
                    if (this.mDecodeStatus != 1) {
                        this.mDecodeStatus = 2;
                        this.mCallback.mo8026a(PlayerMessage.MEDIA_ERROR.ordinal(), this.mMediaErrorMessage);
                        return;
                    }
                    break;
                case DISPLAYED_PLAY:
                    ((C3495l) C3596c.m13172a(C3495l.class)).cacheObj2Obj(this.mCallback, this.mLivePlayController);
                    this.mDecodeStatus = 1;
                    this.mAudioFocusController.mo11993a(this.mContext);
                    this.mCallback.mo8030k();
                    return;
                case STOP_WHEN_PLAYING_OTHER:
                    this.mStopOnPlayingOther = true;
                    this.mAudioFocusController.mo11995b(this.mContext);
                    return;
                case STOP_WHEN_JOIN_INTERACT:
                    this.mStopOnPlayingOther = true;
                    return;
                case INTERACT_SEI:
                    this.mCallback.mo8028a(obj);
                    return;
                case BUFFERING_START:
                    this.mCallback.mo8031l();
                    return;
                case BUFFERING_END:
                    this.mCallback.mo8032m();
                    return;
                case VIDEO_SIZE_CHANGED:
                    int parseInt = Integer.parseInt((String) obj);
                    this.mCallback.mo8025a(MASK & parseInt, parseInt >> 16);
                    break;
            }
        }
    }

    public RoomPlayer(String str, LiveMode liveMode, C9384a aVar, TextureView textureView, C2261a aVar2, Context context, String str2) {
        this.mStreamUrl = str;
        this.mSrConfig = aVar;
        this.mStreamType = liveMode;
        this.mTextureView = textureView;
        this.mCallback = aVar2;
        this.mContext = context;
        this.sdkParams = str2;
    }

    public RoomPlayer(String str, String str2, LiveMode liveMode, C9384a aVar, TextureView textureView, C2261a aVar2, Context context) {
        this.mPullStreamData = str;
        this.mDefaultResolution = str2;
        this.mSrConfig = aVar;
        this.mStreamType = liveMode;
        this.mTextureView = textureView;
        this.mCallback = aVar2;
        this.mContext = context;
    }
}

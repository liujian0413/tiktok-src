package com.bytedance.android.livesdk.chatroom.detail;

import android.content.Context;
import android.view.TextureView;
import com.bytedance.android.live.livepullstream.api.C3450b;
import com.bytedance.android.live.room.C3491h;
import com.bytedance.android.live.room.C3495l;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdkapi.depend.live.ILivePlayController.C9318b;
import com.bytedance.android.livesdkapi.depend.live.ILivePlayController.C9319c;
import com.bytedance.android.livesdkapi.depend.live.ILivePlayController.PlayerMessage;
import com.bytedance.android.p108b.C2260a.C2261a;
import com.bytedance.android.p108b.C2262b;
import com.bytedance.android.p108b.C2262b.C2263a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public class RoomPlayer2 implements C2262b {
    private static final int MASK = 65535;
    private static final int OFFSET = 16;
    private static final String TAG = "RoomPlayer";
    public boolean isBackground;
    public C4317a mAudioFocusController;
    private WeakReference<C2261a> mCallbackRef;
    private C2263a mConfig;
    public int mDecodeStatus;
    public boolean mHasAttached = false;
    private boolean mHasWarmedUp = false;
    public C3491h mLivePlayController;
    public String mMediaErrorMessage;
    public List<C4316a> mPendingCallbacks = new ArrayList();
    private C9318b mPlayMessageListener = new C9318b() {
        /* renamed from: a */
        public final void mo11991a(PlayerMessage playerMessage, Object obj) {
            if (RoomPlayer2.this.mAudioFocusController != null && RoomPlayer2.this.mLivePlayController != null) {
                C2261a callback = RoomPlayer2.this.getCallback();
                if (callback == null) {
                    if (!RoomPlayer2.this.mHasAttached) {
                        RoomPlayer2.this.mPendingCallbacks.add(new C4316a(playerMessage, obj));
                    }
                    return;
                }
                switch (C43152.f12534a[playerMessage.ordinal()]) {
                    case 1:
                        callback.mo8029j();
                        return;
                    case 2:
                        callback.mo8029j();
                        if (obj != null) {
                            RoomPlayer2.this.mMediaErrorMessage = obj.toString();
                        }
                        if (RoomPlayer2.this.mDecodeStatus != 1) {
                            RoomPlayer2.this.mDecodeStatus = 2;
                            callback.mo8026a(PlayerMessage.MEDIA_ERROR.ordinal(), RoomPlayer2.this.mMediaErrorMessage);
                            return;
                        }
                        break;
                    case 3:
                        ((C3495l) C3596c.m13172a(C3495l.class)).cacheObj2Obj(callback, RoomPlayer2.this.mLivePlayController);
                        RoomPlayer2.this.mDecodeStatus = 1;
                        if (!RoomPlayer2.this.isBackground) {
                            RoomPlayer2.this.mAudioFocusController.mo11993a(RoomPlayer2.this.getTagContext());
                        }
                        callback.mo8030k();
                        return;
                    case 4:
                        RoomPlayer2.this.mStopOnPlayingOther = true;
                        RoomPlayer2.this.mAudioFocusController.mo11995b(RoomPlayer2.this.getTagContext());
                        return;
                    case 5:
                        RoomPlayer2.this.mStopOnPlayingOther = true;
                        return;
                    case 6:
                        callback.mo8028a(obj);
                        return;
                    case 7:
                        callback.mo8031l();
                        return;
                    case 8:
                        callback.mo8032m();
                        return;
                    case 9:
                        int parseInt = Integer.parseInt((String) obj);
                        callback.mo8025a(RoomPlayer2.MASK & parseInt, parseInt >> 16);
                        return;
                    case 10:
                        callback.mo8033n();
                        break;
                }
            }
        }
    };
    public boolean mStopOnPlayingOther;
    private WeakReference<Context> mTagContextRef;
    private WeakReference<TextureView> mTextureViewRef;
    private long roomId;

    /* renamed from: com.bytedance.android.livesdk.chatroom.detail.RoomPlayer2$2 */
    static /* synthetic */ class C43152 {

        /* renamed from: a */
        static final /* synthetic */ int[] f12534a = new int[PlayerMessage.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|(3:19|20|22)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0056 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0062 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                com.bytedance.android.livesdkapi.depend.live.ILivePlayController$PlayerMessage[] r0 = com.bytedance.android.livesdkapi.depend.live.ILivePlayController.PlayerMessage.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f12534a = r0
                int[] r0 = f12534a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.bytedance.android.livesdkapi.depend.live.ILivePlayController$PlayerMessage r1 = com.bytedance.android.livesdkapi.depend.live.ILivePlayController.PlayerMessage.COMPLETE_PLAY     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f12534a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.bytedance.android.livesdkapi.depend.live.ILivePlayController$PlayerMessage r1 = com.bytedance.android.livesdkapi.depend.live.ILivePlayController.PlayerMessage.MEDIA_ERROR     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f12534a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.bytedance.android.livesdkapi.depend.live.ILivePlayController$PlayerMessage r1 = com.bytedance.android.livesdkapi.depend.live.ILivePlayController.PlayerMessage.DISPLAYED_PLAY     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f12534a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.bytedance.android.livesdkapi.depend.live.ILivePlayController$PlayerMessage r1 = com.bytedance.android.livesdkapi.depend.live.ILivePlayController.PlayerMessage.STOP_WHEN_PLAYING_OTHER     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f12534a     // Catch:{ NoSuchFieldError -> 0x0040 }
                com.bytedance.android.livesdkapi.depend.live.ILivePlayController$PlayerMessage r1 = com.bytedance.android.livesdkapi.depend.live.ILivePlayController.PlayerMessage.STOP_WHEN_JOIN_INTERACT     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r0 = f12534a     // Catch:{ NoSuchFieldError -> 0x004b }
                com.bytedance.android.livesdkapi.depend.live.ILivePlayController$PlayerMessage r1 = com.bytedance.android.livesdkapi.depend.live.ILivePlayController.PlayerMessage.INTERACT_SEI     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                int[] r0 = f12534a     // Catch:{ NoSuchFieldError -> 0x0056 }
                com.bytedance.android.livesdkapi.depend.live.ILivePlayController$PlayerMessage r1 = com.bytedance.android.livesdkapi.depend.live.ILivePlayController.PlayerMessage.BUFFERING_START     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                int[] r0 = f12534a     // Catch:{ NoSuchFieldError -> 0x0062 }
                com.bytedance.android.livesdkapi.depend.live.ILivePlayController$PlayerMessage r1 = com.bytedance.android.livesdkapi.depend.live.ILivePlayController.PlayerMessage.BUFFERING_END     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                int[] r0 = f12534a     // Catch:{ NoSuchFieldError -> 0x006e }
                com.bytedance.android.livesdkapi.depend.live.ILivePlayController$PlayerMessage r1 = com.bytedance.android.livesdkapi.depend.live.ILivePlayController.PlayerMessage.VIDEO_SIZE_CHANGED     // Catch:{ NoSuchFieldError -> 0x006e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                int[] r0 = f12534a     // Catch:{ NoSuchFieldError -> 0x007a }
                com.bytedance.android.livesdkapi.depend.live.ILivePlayController$PlayerMessage r1 = com.bytedance.android.livesdkapi.depend.live.ILivePlayController.PlayerMessage.PLAYER_DETACHED     // Catch:{ NoSuchFieldError -> 0x007a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x007a }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x007a }
            L_0x007a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.detail.RoomPlayer2.C43152.<clinit>():void");
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.detail.RoomPlayer2$a */
    static class C4316a {

        /* renamed from: a */
        PlayerMessage f12535a;

        /* renamed from: b */
        Object f12536b;

        C4316a(PlayerMessage playerMessage, Object obj) {
            this.f12535a = playerMessage;
            this.f12536b = obj;
        }
    }

    public int getDecodeStatus() {
        return this.mDecodeStatus;
    }

    public String getMediaErrorMessage() {
        return this.mMediaErrorMessage;
    }

    public long getRoomId() {
        return this.roomId;
    }

    public boolean hasWarmedUp() {
        return this.mHasWarmedUp;
    }

    public void setSeiOpen(boolean z) {
    }

    public void recycle() {
        C4337l.m14589a().mo12058a((C2262b) this);
    }

    public boolean warmUp() {
        this.mHasWarmedUp = true;
        return start();
    }

    private TextureView getTextureView() {
        if (this.mTextureViewRef == null) {
            return null;
        }
        return (TextureView) this.mTextureViewRef.get();
    }

    public long getAudioLostFocusTime() {
        if (this.mAudioFocusController == null) {
            return -1;
        }
        return this.mAudioFocusController.f12540d;
    }

    public C2261a getCallback() {
        if (this.mCallbackRef == null) {
            return null;
        }
        return (C2261a) this.mCallbackRef.get();
    }

    public Context getTagContext() {
        if (this.mTagContextRef == null) {
            return null;
        }
        return (Context) this.mTagContextRef.get();
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

    public boolean tryResumePlay() {
        if (!this.mStopOnPlayingOther) {
            return false;
        }
        this.mStopOnPlayingOther = false;
        return doStart();
    }

    private boolean doStart() {
        if (this.mConfig.mo8042a()) {
            this.isBackground = false;
            doStartPlayByMultiPullStreamData();
        } else if (!this.mConfig.mo8044b()) {
            return false;
        } else {
            this.isBackground = false;
            doStartPlayByStreamUrl();
        }
        return true;
    }

    public void onForeground() {
        this.isBackground = false;
        if (this.mAudioFocusController != null) {
            this.mAudioFocusController.mo11994a(false);
            this.mAudioFocusController.mo11993a(getTagContext());
        }
    }

    public void release() {
        stop(true);
        this.mAudioFocusController = null;
        this.mLivePlayController = null;
        this.mDecodeStatus = 0;
        this.mMediaErrorMessage = null;
        this.mStopOnPlayingOther = false;
        this.isBackground = false;
        this.mPendingCallbacks.clear();
        this.mHasAttached = false;
        this.mHasWarmedUp = false;
        this.mConfig = null;
        if (this.mTagContextRef != null) {
            this.mTagContextRef.clear();
            this.mTagContextRef = null;
        }
        if (this.mCallbackRef != null) {
            this.mCallbackRef.clear();
            this.mCallbackRef = null;
        }
        if (this.mTextureViewRef != null) {
            this.mTextureViewRef.clear();
            this.mTextureViewRef = null;
        }
    }

    public boolean start() {
        if (this.mLivePlayController != null) {
            return true;
        }
        this.mLivePlayController = ((C3450b) C3596c.m13172a(C3450b.class)).getLivePlayController();
        this.mLivePlayController.mo10510c(this.mConfig.f7539h);
        this.mAudioFocusController = new C4317a(this.mLivePlayController);
        return doStart();
    }

    public boolean startWithNewLivePlayer() {
        if (this.mLivePlayController != null) {
            return true;
        }
        if (this.mConfig.mo8046c()) {
            return false;
        }
        this.mLivePlayController = ((C3450b) C3596c.m13172a(C3450b.class)).getLivePlayController();
        this.mLivePlayController.mo21790e();
        this.mLivePlayController.mo10510c(true);
        this.mAudioFocusController = new C4317a(this.mLivePlayController);
        return doStart();
    }

    private void doStartPlayByMultiPullStreamData() {
        if (this.mConfig != null) {
            C9319c cVar = null;
            try {
                if (this.mConfig.f7538g != null) {
                    cVar = C9319c.m27713a().mo22793a(this.mConfig.f7538g.f25798a).mo22795b(this.mConfig.f7538g.f25799b).mo22792a(this.mConfig.f7538g.f25800c).mo22794a();
                }
                this.mLivePlayController.mo21784a(this.mConfig.f7533b, this.mConfig.f7534c, getTextureView(), this.mConfig.f7537f.ordinal(), cVar, this.mPlayMessageListener);
            } catch (Exception e) {
                C2261a callback = getCallback();
                if (callback != null) {
                    callback.mo8027a(e);
                }
            }
        }
    }

    private void doStartPlayByStreamUrl() {
        if (this.mConfig != null) {
            C9319c cVar = null;
            try {
                if (this.mConfig.f7538g != null) {
                    cVar = C9319c.m27713a().mo22793a(this.mConfig.f7538g.f25798a).mo22795b(this.mConfig.f7538g.f25799b).mo22792a(this.mConfig.f7538g.f25800c).mo22794a();
                }
                this.mLivePlayController.mo21783a(this.mConfig.f7535d, getTextureView(), this.mConfig.f7537f.ordinal(), cVar, this.mPlayMessageListener, this.mConfig.f7536e);
            } catch (Exception e) {
                C2261a callback = getCallback();
                if (callback != null) {
                    callback.mo8027a(e);
                }
            }
        }
    }

    public void setAnchorInteractMode(boolean z) {
        if (this.mLivePlayController != null) {
            this.mLivePlayController.mo10504a(z);
        }
    }

    public void setMute(boolean z) {
        if (this.mLivePlayController != null) {
            this.mLivePlayController.mo21785a(z, getTagContext());
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
                this.mAudioFocusController.mo11995b(getTagContext());
            } else {
                this.mAudioFocusController.mo11992a();
            }
            this.mAudioFocusController = null;
        }
        if (this.mLivePlayController != null) {
            this.mLivePlayController.mo10501a(getTagContext());
            if (z) {
                this.mLivePlayController.mo21791e(getTagContext());
            }
            this.mLivePlayController = null;
        }
        this.mDecodeStatus = 0;
        this.mMediaErrorMessage = null;
        this.mStopOnPlayingOther = false;
    }

    public void initialize(long j, C2263a aVar) {
        this.roomId = j;
        this.mConfig = aVar;
    }

    RoomPlayer2(long j, C2263a aVar) {
        initialize(j, aVar);
    }

    public void attach(Context context, TextureView textureView, C2261a aVar) {
        this.mTagContextRef = new WeakReference<>(context);
        this.mCallbackRef = new WeakReference<>(aVar);
        this.mTextureViewRef = new WeakReference<>(textureView);
        if (this.mLivePlayController != null) {
            this.mLivePlayController.mo10502a(textureView);
        }
        if (this.mAudioFocusController != null) {
            this.mAudioFocusController.mo11993a(context);
        }
        this.mHasAttached = true;
        if (aVar != null) {
            for (C4316a aVar2 : this.mPendingCallbacks) {
                this.mPlayMessageListener.mo11991a(aVar2.f12535a, aVar2.f12536b);
            }
            this.mPendingCallbacks.clear();
        }
    }
}

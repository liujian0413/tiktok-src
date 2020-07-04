package com.bytedance.android.livesdk.chatroom.p209bl;

import android.arch.lifecycle.C0053p;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.android.livesdk.C3916b;
import com.bytedance.android.livesdk.chatroom.event.C4408a;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.gift.effect.p376b.C7963a;
import com.bytedance.android.livesdk.message.model.C8481ah;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.message.C9499a;
import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: com.bytedance.android.livesdk.chatroom.bl.PlatformMessageHelper */
public enum PlatformMessageHelper {
    INSTANCE;
    
    private C4408a bigGiftPlayStateEvent;
    private Runnable followGuideRunnable;
    private Handler mainHandler;
    private boolean sIsBusy;
    private boolean sIsRunning;
    private C4265a sMessageCallback;
    private Queue<C9499a> sMessageQueue;

    /* renamed from: com.bytedance.android.livesdk.chatroom.bl.PlatformMessageHelper$a */
    public interface C4265a {
        /* renamed from: a */
        void mo11955a(C9499a aVar);
    }

    public final void onMessageFinish() {
        this.sIsBusy = false;
        next();
    }

    private boolean canConsume() {
        ((Boolean) LiveConfigSettingKeys.GUIDE_DIALOG_PAUSE_ENABLE.mo10240a()).booleanValue();
        return true;
    }

    private boolean canConsumeFollowGuideMessage() {
        if (this.bigGiftPlayStateEvent == null || this.bigGiftPlayStateEvent.f12816b) {
            return true;
        }
        return false;
    }

    public final void resume() {
        ((Boolean) LiveConfigSettingKeys.GUIDE_DIALOG_PAUSE_ENABLE.mo10240a()).booleanValue();
    }

    public final void stop() {
        this.sMessageCallback = null;
        this.sMessageQueue = null;
        this.sIsRunning = false;
        this.sIsBusy = false;
        if (this.mainHandler != null) {
            this.mainHandler.removeCallbacksAndMessages(null);
        }
        this.mainHandler = null;
        this.followGuideRunnable = null;
    }

    private void next() {
        if (this.sMessageQueue != null && this.sMessageQueue.size() > 0 && this.sMessageCallback != null && this.sIsRunning && !this.sIsBusy && canConsume()) {
            this.sIsBusy = true;
            this.sMessageCallback.mo11955a((C9499a) this.sMessageQueue.poll());
        }
    }

    private boolean hasFollowed(Room room) {
        if (room == null) {
            return false;
        }
        long followStatus = room.getOwner().getFollowInfo().getFollowStatus();
        if (followStatus == 1 || followStatus == 2) {
            return true;
        }
        return false;
    }

    public final void add(C9499a aVar) {
        if (this.sIsRunning && aVar != null && this.sMessageQueue != null) {
            this.sMessageQueue.offer(aVar);
            next();
        }
    }

    public final void start(C4265a aVar) {
        this.sMessageCallback = aVar;
        this.sMessageQueue = new ArrayDeque();
        this.sIsRunning = true;
        this.sIsBusy = false;
        C3916b.m13813a().f11734a.observeForever(new C0053p<Boolean>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onChanged(Boolean bool) {
                if (!bool.booleanValue()) {
                    PlatformMessageHelper.this.resume();
                }
            }
        });
    }

    /* renamed from: addFollowGuideMessage */
    public final void lambda$addFollowGuideMessage$1$PlatformMessageHelper(Room room, C9499a aVar) {
        if (aVar instanceof C8481ah) {
            if (hasFollowed(room)) {
                if (this.mainHandler != null) {
                    this.mainHandler.removeCallbacksAndMessages(null);
                }
                this.followGuideRunnable = null;
                onMessageFinish();
                return;
            }
            C8481ah ahVar = (C8481ah) aVar;
            if (this.sIsRunning && this.sMessageQueue != null) {
                if (this.mainHandler == null) {
                    this.mainHandler = new Handler(Looper.getMainLooper());
                }
                if (this.followGuideRunnable == null) {
                    this.followGuideRunnable = new C4271c(this, room, ahVar);
                }
                if (!canConsumeFollowGuideMessage()) {
                    this.mainHandler.postDelayed(new C4272d(this, room, aVar), 2000);
                } else {
                    this.mainHandler.postDelayed(this.followGuideRunnable, 500);
                }
            }
        }
    }

    public final void setBigGiftPlayStateEvent(boolean z, boolean z2, C7963a aVar) {
        if (this.bigGiftPlayStateEvent == null) {
            this.bigGiftPlayStateEvent = new C4408a(z, z2, aVar);
        }
        this.bigGiftPlayStateEvent.f12815a = z;
        this.bigGiftPlayStateEvent.f12816b = z2;
        this.bigGiftPlayStateEvent.f12817c = aVar;
    }
}

package com.p1843tt.miniapp.manager;

import android.os.Handler;
import android.os.Looper;
import com.p1843tt.miniapp.IWebSocketService;
import com.p1843tt.miniapp.IWebSocketService.IWebSocketServiceListener;
import com.p1843tt.miniapp.model.RequestData;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheTTnetPreloadTimeoutExperiment;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tt.miniapp.manager.UserStatusUpdateManager */
public class UserStatusUpdateManager implements IWebSocketServiceListener {
    public Handler mHandler = new Handler(Looper.getMainLooper());
    public int mHeartBeatInterval = VideoCacheTTnetPreloadTimeoutExperiment.DEFAULT;
    private Runnable mHeartbeatRunnable = new Runnable() {
        public void run() {
            UserStatusUpdateManager.this.ping();
            UserStatusUpdateManager.this.mHandler.postDelayed(this, (long) UserStatusUpdateManager.this.mHeartBeatInterval);
        }
    };
    private Map<String, Boolean> mWhiteList = new ConcurrentHashMap();
    private IWebSocketService service;

    /* renamed from: com.tt.miniapp.manager.UserStatusUpdateManager$Holder */
    static class Holder {
        static final UserStatusUpdateManager mInstance = new UserStatusUpdateManager();

        Holder() {
        }
    }

    public static UserStatusUpdateManager getInstance() {
        return Holder.mInstance;
    }

    public boolean checkIfHandleMsg(int i) {
        return i == 1013;
    }

    public int getHeartBeatInterval() {
        return this.mHeartBeatInterval;
    }

    public void onWebSocketClosed() {
        stopHeartbeat();
    }

    public void onWebSocketConnected() {
        checkInWhitelist();
    }

    private void stopHeartbeat() {
        this.mHandler.removeCallbacks(this.mHeartbeatRunnable);
    }

    private void startHeartbeat() {
        stopHeartbeat();
        this.mHandler.post(this.mHeartbeatRunnable);
    }

    private void checkInWhitelist() {
        if (this.service != null && this.service.isLogin() && this.service.isSettingsEnable() && this.service.isConnected()) {
            this.service.sendMessage(new RequestData("check_in_whitelist").toJsonString());
        }
    }

    public void acceptInvitation() {
        if (this.service != null && this.service.isLogin() && this.service.isConnected()) {
            this.service.sendMessage(new RequestData("accept_invitation").toJsonString());
        }
    }

    public void forceOffline() {
        if (this.service != null && this.service.isLogin() && this.service.isConnected()) {
            this.service.sendMessage(new RequestData("force_offline").toJsonString());
        }
    }

    public boolean isWhite() {
        if (this.mWhiteList.containsKey(this.service.getCurUserId())) {
            return ((Boolean) this.mWhiteList.get(this.service.getCurUserId())).booleanValue();
        }
        return false;
    }

    public void notifyEnterBackground() {
        if (this.service != null && this.service.isLogin() && this.service.isSettingsEnable() && isWhite() && this.service.isConnected()) {
            this.service.sendMessage(new RequestData("enter_background").toJsonString());
        }
    }

    public void notifyEnterForeground() {
        if (this.service != null && this.service.isLogin() && this.service.isSettingsEnable() && isWhite() && this.service.isConnected()) {
            this.service.sendMessage(new RequestData("enter_foreground").toJsonString());
        }
    }

    public void ping() {
        if (this.service != null && this.service.isLogin() && this.service.isSettingsEnable() && isWhite() && this.service.isConnected()) {
            this.service.sendMessage(new RequestData("ping").toJsonString());
        }
    }

    public void setHeartBeatInterval(int i) {
        this.mHeartBeatInterval = i;
    }

    public void registerService(IWebSocketService iWebSocketService) {
        this.service = iWebSocketService;
        this.service.setWebSocketServiceListener(this);
    }

    private void onPongResult(JSONObject jSONObject) {
        if (jSONObject != null) {
            int optInt = jSONObject.optInt("interval");
            if (optInt > 0) {
                this.mHeartBeatInterval = optInt * 1000;
            }
        }
    }

    private void selectHandler(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("command");
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (optString.equals("check_in_whitelist")) {
                onCheckInWhiteListResult(optJSONObject);
            } else if (optString.equals("accept_invitation")) {
                onAcceptInvitationResult(optJSONObject);
            } else {
                if (optString.equals("pong")) {
                    onPongResult(optJSONObject);
                }
            }
        } catch (JSONException unused) {
        }
    }

    private void onAcceptInvitationResult(JSONObject jSONObject) {
        if (jSONObject != null) {
            String optString = jSONObject.optString("user_id");
            boolean z = true;
            if (jSONObject.optInt("status") != 1) {
                z = false;
            }
            this.mWhiteList.put(optString, Boolean.valueOf(z));
            if (z) {
                startHeartbeat();
                if (this.service != null && this.service.isBackground()) {
                    notifyEnterBackground();
                } else if (this.service != null && !this.service.isBackground()) {
                    notifyEnterForeground();
                }
            }
        }
    }

    private void onCheckInWhiteListResult(JSONObject jSONObject) {
        if (jSONObject != null) {
            String optString = jSONObject.optString("user_id");
            boolean z = true;
            if (jSONObject.optInt("status") != 1) {
                z = false;
            }
            this.mWhiteList.put(optString, Boolean.valueOf(z));
            if (z) {
                startHeartbeat();
                if (this.service != null && this.service.isBackground()) {
                    notifyEnterBackground();
                } else if (this.service != null && !this.service.isBackground()) {
                    notifyEnterForeground();
                }
            }
        }
    }

    public boolean onReceiveMsg(int i, int i2, String str) {
        if (!checkIfHandleMsg(i)) {
            return false;
        }
        if (i2 == 1) {
            selectHandler(str);
        }
        return true;
    }
}

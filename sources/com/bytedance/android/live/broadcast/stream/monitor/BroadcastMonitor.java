package com.bytedance.android.live.broadcast.stream.monitor;

public final class BroadcastMonitor {

    public enum Domain {
        API("api"),
        LIVE_SDK("livesdk"),
        AGORA("agora");
        
        public final String value;

        private Domain(String str) {
            this.value = str;
        }
    }
}

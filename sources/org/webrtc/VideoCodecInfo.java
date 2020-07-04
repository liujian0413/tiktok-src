package org.webrtc;

import java.util.Arrays;
import java.util.Locale;
import java.util.Map;

public class VideoCodecInfo {
    public final String name;
    public final Map<String, String> params;
    public final int payload;

    /* access modifiers changed from: 0000 */
    public String getName() {
        return this.name;
    }

    /* access modifiers changed from: 0000 */
    public Map getParams() {
        return this.params;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.name.toUpperCase(Locale.ROOT), this.params});
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VideoCodecInfo)) {
            return false;
        }
        VideoCodecInfo videoCodecInfo = (VideoCodecInfo) obj;
        if (!this.name.equalsIgnoreCase(videoCodecInfo.name) || !this.params.equals(videoCodecInfo.params)) {
            return false;
        }
        return true;
    }

    public VideoCodecInfo(String str, Map<String, String> map) {
        this.name = str;
        this.params = map;
    }

    public VideoCodecInfo(int i, String str, Map<String, String> map) {
        this.payload = i;
        this.name = str;
        this.params = map;
    }
}

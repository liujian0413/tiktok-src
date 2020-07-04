package com.p280ss.ttm.player;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.ttm.player.MediaFormat */
public final class MediaFormat {
    private Map<String, Object> mMap;

    public final Map<String, Object> getValues() {
        return this.mMap;
    }

    public final String toString() {
        return this.mMap.toString();
    }

    public MediaFormat() {
        this.mMap = new HashMap();
    }

    public MediaFormat(Map<String, Object> map) {
        this.mMap = map;
    }

    public final float getFloat(String str) {
        return ((Float) this.mMap.get(str)).floatValue();
    }

    public final int getInteger(String str) {
        return ((Integer) this.mMap.get(str)).intValue();
    }

    public final long getLong(String str) {
        return ((Long) this.mMap.get(str)).longValue();
    }

    public final String getString(String str) {
        return (String) this.mMap.get(str);
    }

    public static final MediaFormat createSubtitleFormat(android.media.MediaFormat mediaFormat) {
        if (mediaFormat == null) {
            return null;
        }
        return createSubtitleFormat(mediaFormat.getInteger("track-id"), mediaFormat.getString("language"));
    }

    public static final MediaFormat createAudioFormat(android.media.MediaFormat mediaFormat) {
        if (mediaFormat == null) {
            return null;
        }
        return createAudioFormat(mediaFormat.getInteger("track-id"), mediaFormat.getInteger("sample-rate"), mediaFormat.getInteger("channel-count"));
    }

    public static final MediaFormat createSubtitleFormat(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return createSubtitleFormat(jSONObject.optInt("track-id"), jSONObject.optString("language"));
    }

    public static final MediaFormat createVideoFormat(android.media.MediaFormat mediaFormat) {
        if (mediaFormat == null) {
            return null;
        }
        return createVideoFormat(mediaFormat.getInteger("track-id"), mediaFormat.getInteger("width"), mediaFormat.getInteger("height"), mediaFormat.getInteger("bitrate"));
    }

    public static final MediaFormat createAudioFormat(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return createAudioFormat(jSONObject.optInt("track-id"), jSONObject.optInt("sample-rate"), jSONObject.optInt("channel-count"));
    }

    public static final MediaFormat createVideoFormat(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return createVideoFormat(jSONObject.optInt("track-id"), jSONObject.optInt("width"), jSONObject.optInt("height"), jSONObject.optInt("bitrate"));
    }

    public final void setString(String str, String str2) {
        this.mMap.put(str, str2);
    }

    public static final MediaFormat createSubtitleFormat(int i, String str) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setInteger("track-id", i);
        mediaFormat.setString("language", str);
        return mediaFormat;
    }

    public final void setFloat(String str, float f) {
        this.mMap.put(str, new Float(f));
    }

    public final void setInteger(String str, int i) {
        this.mMap.put(str, Integer.valueOf(i));
    }

    public final void setLong(String str, long j) {
        this.mMap.put(str, Long.valueOf(j));
    }

    public static final MediaFormat createAudioFormat(int i, int i2, int i3) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setInteger("track-id", i);
        mediaFormat.setInteger("sample-rate", i2);
        mediaFormat.setInteger("channel-count", i3);
        return mediaFormat;
    }

    public static final MediaFormat createVideoFormat(int i, int i2, int i3, int i4) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setInteger("track-id", i);
        mediaFormat.setInteger("width", i2);
        mediaFormat.setInteger("height", i3);
        mediaFormat.setInteger("bitrate", i4);
        return mediaFormat;
    }
}

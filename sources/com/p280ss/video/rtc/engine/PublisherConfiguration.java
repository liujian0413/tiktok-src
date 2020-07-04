package com.p280ss.video.rtc.engine;

import com.p280ss.video.rtc.engine.utils.LogUtil;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.video.rtc.engine.PublisherConfiguration */
public class PublisherConfiguration {
    private JSONObject mJsonObject;

    /* renamed from: com.ss.video.rtc.engine.PublisherConfiguration$Builder */
    public static class Builder {
        public PublisherParameters params = new PublisherParameters();

        public PublisherConfiguration build() {
            return new PublisherConfiguration(this);
        }

        public Builder audioBitrate(int i) {
            this.params.audiobitrate = i;
            return this;
        }

        public Builder audioChannels(int i) {
            this.params.audiochannels = i;
            return this;
        }

        public Builder audioSampleRate(int i) {
            this.params.audiosamplerate = i;
            return this;
        }

        public Builder bitRate(int i) {
            this.params.bitrate = i;
            return this;
        }

        public Builder defaultLayout(int i) {
            this.params.defaultLayout = i;
            return this;
        }

        public Builder extraInfo(String str) {
            this.params.extraInfo = str;
            return this;
        }

        public Builder frameRate(int i) {
            this.params.framerate = i;
            return this;
        }

        public Builder liftCycle(int i) {
            this.params.lifecycle = i;
            return this;
        }

        public Builder owner(boolean z) {
            this.params.owner = z;
            return this;
        }

        public Builder publishUrl(String str) {
            this.params.mosaicStream = str;
            return this;
        }

        public Builder size(int i, int i2) {
            this.params.width = i;
            this.params.height = i2;
            return this;
        }
    }

    public PublisherConfiguration() {
    }

    public boolean validate() {
        if (this.mJsonObject != null) {
            return true;
        }
        return false;
    }

    public String toJsonString() {
        if (validate()) {
            return this.mJsonObject.toString();
        }
        return null;
    }

    private PublisherConfiguration(Builder builder) {
        try {
            this.mJsonObject = new JSONObject();
            this.mJsonObject.put("owner", builder.params.owner);
            this.mJsonObject.put("lifecycle", builder.params.lifecycle);
            this.mJsonObject.put("defaultLayout", builder.params.defaultLayout);
            this.mJsonObject.put("width", builder.params.width);
            this.mJsonObject.put("height", builder.params.height);
            this.mJsonObject.put("framerate", builder.params.framerate);
            this.mJsonObject.put("bitrate", builder.params.bitrate);
            this.mJsonObject.put("mosaicStream", builder.params.mosaicStream);
            this.mJsonObject.put("extraInfo", builder.params.extraInfo);
            this.mJsonObject.put("audiosamplerate", builder.params.audiosamplerate);
            this.mJsonObject.put("audiobitrate", builder.params.audiobitrate);
            this.mJsonObject.put("audiochannels", builder.params.audiochannels);
        } catch (JSONException unused) {
            this.mJsonObject = null;
            LogUtil.m145282w("PublisherConfiguration", "failed to create PublisherConfiguration");
        }
    }
}

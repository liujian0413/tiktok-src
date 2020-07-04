package com.p280ss.video.rtc.engine.live;

import com.p280ss.video.rtc.engine.utils.LogUtil;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.video.rtc.engine.live.LiveTranscoding */
public class LiveTranscoding {
    private String action = "";
    private AudioConfig audio;
    private Layout layout;
    private String url;
    private VideoConfig video;

    /* renamed from: com.ss.video.rtc.engine.live.LiveTranscoding$AACProfile */
    public enum AACProfile {
        LC("LC"),
        MAIN("MAIN"),
        HEV1("HEv1"),
        HEV2("HEv2");
        
        private String AacProfile;

        public final String getValue() {
            return this.AacProfile;
        }

        private AACProfile(String str) {
            this.AacProfile = "LC";
            this.AacProfile = str;
        }
    }

    /* renamed from: com.ss.video.rtc.engine.live.LiveTranscoding$AudioConfig */
    public static class AudioConfig {
        public String aacProfile = AACProfile.LC.getValue();
        public int bitRate = 16000;
        public int channels = 1;
        public String codec = "AAC";
        public int sampleRate = 44100;

        public AudioConfig setBitRate(int i) {
            this.bitRate = i;
            return this;
        }

        public AudioConfig setChannels(int i) {
            this.channels = i;
            return this;
        }

        public AudioConfig setCodec(String str) {
            this.codec = str;
            return this;
        }

        public AudioConfig setSampleRate(int i) {
            this.sampleRate = i;
            return this;
        }

        public AudioConfig setAacProfile(AACProfile aACProfile) {
            this.aacProfile = aACProfile.getValue();
            return this;
        }
    }

    /* renamed from: com.ss.video.rtc.engine.live.LiveTranscoding$Layout */
    public static class Layout {
        public String appData;
        public String backgroundColor;
        public Region[] regions;

        /* renamed from: com.ss.video.rtc.engine.live.LiveTranscoding$Layout$Builder */
        public static class Builder {
            private String appData = "";
            private String backgroundColor = "#000000";
            private ArrayList<Region> regions;

            public Layout builder() {
                Layout layout = new Layout();
                if (this.regions != null) {
                    layout.regions = (Region[]) this.regions.toArray(new Region[this.regions.size()]);
                }
                layout.appData = this.appData;
                layout.backgroundColor = this.backgroundColor;
                return layout;
            }

            public Builder appData(String str) {
                this.appData = str;
                return this;
            }

            public Builder backgroundColor(String str) {
                this.backgroundColor = str;
                return this;
            }

            public Builder addRegoin(Region region) {
                if (this.regions == null) {
                    this.regions = new ArrayList<>();
                }
                this.regions.add(region);
                return this;
            }
        }

        /* renamed from: com.ss.video.rtc.engine.live.LiveTranscoding$Layout$Region */
        public static class Region {
            public double alpha;
            public int contentControl;

            /* renamed from: h */
            public double f118907h;
            public int renderMode;
            public String uid;

            /* renamed from: w */
            public double f118908w;

            /* renamed from: x */
            public double f118909x;

            /* renamed from: y */
            public double f118910y;
            public int zorder;

            public Region alpha(double d) {
                this.alpha = d;
                return this;
            }

            public Region contentControl(int i) {
                this.contentControl = i;
                return this;
            }

            public Region renderMode(int i) {
                this.renderMode = i;
                return this;
            }

            public Region uid(String str) {
                this.uid = str;
                return this;
            }

            public Region zorder(int i) {
                this.zorder = i;
                return this;
            }

            public Region position(double d, double d2) {
                this.f118909x = d;
                this.f118910y = d2;
                return this;
            }

            public Region size(double d, double d2) {
                this.f118908w = d;
                this.f118907h = d2;
                return this;
            }
        }

        public String getAppData() {
            return this.appData;
        }

        public String getBackgroundColor() {
            return this.backgroundColor;
        }

        public Region[] getRegions() {
            return this.regions;
        }

        public String toString() {
            Region[] regionArr;
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject2 = new JSONObject();
            try {
                if (this.regions != null) {
                    for (Region region : this.regions) {
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("uid", region.uid);
                        jSONObject3.put("x", region.f118909x);
                        jSONObject3.put("y", region.f118910y);
                        jSONObject3.put("w", region.f118908w);
                        jSONObject3.put("h", region.f118907h);
                        jSONObject3.put("zorder", region.zorder);
                        jSONObject3.put("alpha", region.alpha);
                        jSONObject3.put("contentControl", region.contentControl);
                        jSONObject3.put("renderMode", region.renderMode);
                        jSONArray.put(jSONObject3);
                    }
                }
                jSONObject.put("canvas", jSONObject2);
                jSONObject.put("regions", jSONArray);
                jSONObject.put("app_data", this.appData);
                return jSONObject.toString();
            } catch (JSONException e) {
                LogUtil.m145283w("LiveTranscoding", "create layout json message happen exception", e);
                return null;
            }
        }

        public void setAppData(String str) {
            this.appData = str;
        }

        public void setBackgroundColor(String str) {
            this.backgroundColor = str;
        }

        public void setRegions(Region[] regionArr) {
            this.regions = regionArr;
        }
    }

    /* renamed from: com.ss.video.rtc.engine.live.LiveTranscoding$VideoConfig */
    public static class VideoConfig {
        public int bitRate = 500000;
        public String codec = "H264";
        public int fps = 30;
        public int gop = 60;
        public int height = 640;
        public boolean lowLatency = true;
        public int width = 360;

        public VideoConfig setBitRate(int i) {
            this.bitRate = i;
            return this;
        }

        public VideoConfig setCodec(String str) {
            this.codec = str;
            return this;
        }

        public VideoConfig setFps(int i) {
            this.fps = i;
            return this;
        }

        public VideoConfig setGop(int i) {
            this.gop = i;
            return this;
        }

        public VideoConfig setHeight(int i) {
            this.height = i;
            return this;
        }

        public VideoConfig setLowLatency(boolean z) {
            this.lowLatency = z;
            return this;
        }

        public VideoConfig setWidth(int i) {
            this.width = i;
            return this;
        }
    }

    public AudioConfig getAudio() {
        return this.audio;
    }

    public Layout getLayout() {
        return this.layout;
    }

    public String getUrl() {
        return this.url;
    }

    public VideoConfig getVideo() {
        return this.video;
    }

    public static LiveTranscoding getDefualtLiveTranscode() {
        VideoConfig videoConfig = new VideoConfig();
        videoConfig.setCodec("H264").setFps(30).setGop(60).setBitRate(500000).setHeight(640).setWidth(360).setLowLatency(true);
        AudioConfig audioConfig = new AudioConfig();
        audioConfig.setCodec("AAC").setSampleRate(44100).setChannels(1).setBitRate(16000).setAacProfile(AACProfile.LC);
        Builder builder = new Builder();
        builder.backgroundColor("#000000").appData("");
        LiveTranscoding liveTranscoding = new LiveTranscoding();
        liveTranscoding.setAudio(audioConfig);
        liveTranscoding.setVideo(videoConfig);
        liveTranscoding.setLayout(builder.builder());
        liveTranscoding.setUrl(null);
        return liveTranscoding;
    }

    public JSONObject getTranscodeMessage() {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject5 = new JSONObject();
        JSONObject jSONObject6 = new JSONObject();
        JSONObject jSONObject7 = new JSONObject();
        try {
            jSONObject.put("codec", this.video.codec);
            jSONObject.put("fps", this.video.fps);
            jSONObject.put("gop", this.video.gop);
            jSONObject.put("lowLatency", this.video.lowLatency);
            jSONObject.put("bitRate", this.video.bitRate);
            jSONObject.put("width", this.video.width);
            jSONObject.put("height", this.video.height);
            jSONObject2.put("codec", this.audio.codec);
            jSONObject2.put("bitRate", this.audio.bitRate);
            jSONObject2.put("sampleRate", this.audio.sampleRate);
            jSONObject2.put("channels", this.audio.channels);
            jSONObject2.put("profile", this.audio.aacProfile);
            jSONObject4.put("bgnd", this.layout.backgroundColor);
            if (this.layout.regions != null) {
                Region[] regionArr = this.layout.regions;
                int length = regionArr.length;
                int i = 0;
                while (i < length) {
                    Region region = regionArr[i];
                    JSONObject jSONObject8 = new JSONObject();
                    jSONObject8.put("uid", region.uid);
                    Region[] regionArr2 = regionArr;
                    int i2 = length;
                    jSONObject8.put("x", region.f118909x);
                    jSONObject8.put("y", region.f118910y);
                    jSONObject8.put("w", region.f118908w);
                    jSONObject8.put("h", region.f118907h);
                    jSONObject8.put("zorder", region.zorder);
                    jSONObject8.put("alpha", region.alpha);
                    jSONObject8.put("contentControl", region.contentControl);
                    jSONObject8.put("renderMode", region.renderMode);
                    jSONArray.put(jSONObject8);
                    i++;
                    regionArr = regionArr2;
                    length = i2;
                }
            }
            jSONObject3.put("canvas", jSONObject4);
            jSONObject3.put("regions", jSONArray);
            jSONObject3.put("app_data", this.layout.appData);
            jSONObject5.put("url", this.url);
            jSONObject6.put("transcode", jSONObject5);
            jSONObject6.put("video", jSONObject);
            jSONObject6.put("audio", jSONObject2);
            jSONObject6.put("layout", jSONObject3);
            jSONObject7.put("type", "transcode");
            jSONObject7.put("action", this.action);
            jSONObject7.put("transcodeMeta", jSONObject6);
            return jSONObject7;
        } catch (JSONException e) {
            LogUtil.m145283w("LiveTranscoding", "get json message happen exception", e);
            return null;
        }
    }

    public void setAction(String str) {
        this.action = str;
    }

    public void setAudio(AudioConfig audioConfig) {
        this.audio = audioConfig;
    }

    public void setLayout(Layout layout2) {
        this.layout = layout2;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public void setVideo(VideoConfig videoConfig) {
        this.video = videoConfig;
    }
}

package com.p280ss.avframework.livestreamv2.interact.model;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.C1642a;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.p280ss.avframework.livestreamv2.utils.UrlUtils;
import com.taobao.android.dexposed.ClassUtils;
import java.util.concurrent.atomic.AtomicInteger;
import javax.microedition.khronos.egl.EGLContext;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.avframework.livestreamv2.interact.model.Config */
public class Config {
    private static final String TAG = "com.ss.avframework.livestreamv2.interact.model.Config";
    private String mAgoraAppId = "";
    private String mAgoraAppKey = "";
    private String mAppChannel;
    private boolean mAutoPlayRemoteAudio;
    private boolean mAutoUpdateSeiForTalk;
    private String mByteAppId = "";
    private String mByteToken = "";
    private String mChannelName = "";
    private Character mCharacter = Character.GUEST;
    private boolean mClientMixStream;
    private Context mContext;
    private String mDeviceId = "";
    private EGLContext mEGLContext;
    private android.opengl.EGLContext mEGLContext14;
    private long mEGLNativeAddr;
    private FrameFormat mFrameFormat = FrameFormat.TEXTURE_2D;
    private Handler mHandler;
    private int mInteractId;
    private InteractMode mInteractMode = InteractMode.NORMAL;
    private String mLogFile;
    private int mLogReportInterval = 5;
    private MixStreamConfig mMixStreamConfig;
    private int mOutPlayerAudioChannel = 1;
    private int mOutPlayerAudioSampleHz = 16000;
    private String mProjectKey = "";
    private JSONObject mRtcExtParams;
    private int mSeiVersion;
    private boolean mTest;
    private Type mType = Type.VIDEO;
    private int mUpdateTalkSeiInterval = 900;
    private long mUserId;
    private Vendor mVendor = Vendor.AGORA;
    private VideoQuality mVideoQuality = VideoQuality.GUEST_NORMAL;
    private int mVolumeCallbackInterval;
    private int mVolumeThreshold;
    private long mZegoAppId;
    private byte[] mZegoSignature;
    private String mZegoThirdPartyToken = "";
    private int mixedStreamDefaultLayout = 3;
    private int mixedStreamLifecycle = 2;

    /* renamed from: com.ss.avframework.livestreamv2.interact.model.Config$AudioProfile */
    public enum AudioProfile {
        LC,
        HE
    }

    /* renamed from: com.ss.avframework.livestreamv2.interact.model.Config$AudioSampleRate */
    public enum AudioSampleRate {
        SAMPLE_RATE_16K,
        SAMPLE_RATE_32K,
        SAMPLE_RATE_44K,
        SAMPLE_RATE_48K
    }

    /* renamed from: com.ss.avframework.livestreamv2.interact.model.Config$Character */
    public enum Character {
        ANCHOR,
        GUEST
    }

    /* renamed from: com.ss.avframework.livestreamv2.interact.model.Config$FrameFormat */
    public enum FrameFormat {
        TEXTURE_2D,
        TEXTURE_OES
    }

    /* renamed from: com.ss.avframework.livestreamv2.interact.model.Config$InteractMode */
    public enum InteractMode {
        PK,
        NORMAL
    }

    /* renamed from: com.ss.avframework.livestreamv2.interact.model.Config$MixStreamConfig */
    public static class MixStreamConfig {
        private int audioBitrate = PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH;
        private int audioChannels = 2;
        private AudioProfile audioProfile = AudioProfile.LC;
        private AudioSampleRate audioSampleRate = AudioSampleRate.SAMPLE_RATE_44K;
        private int backgroundColor;
        private AtomicInteger mPushCount;
        private String mStreamName = "";
        private String mStreamUrl = "";
        private long mStreamUrlPriority;
        private String mStreamUuid;
        private int videoBitrate = 800;
        private VideoCodec videoCodec = VideoCodec.H264;
        private int videoFrameRate = 15;
        private float videoGop = 2.0f;
        private int videoHeight = 640;
        private VideoProfile videoProfile = VideoProfile.HIGH;
        private int videoWidth = 360;

        public int getAudioBitrate() {
            return this.audioBitrate;
        }

        public int getAudioChannels() {
            return this.audioChannels;
        }

        public AudioProfile getAudioProfile() {
            return this.audioProfile;
        }

        public AudioSampleRate getAudioSampleRate() {
            return this.audioSampleRate;
        }

        public int getBackgroundColor() {
            return this.backgroundColor;
        }

        public String getStreamName() {
            return this.mStreamName;
        }

        public int getVideoBitrate() {
            return this.videoBitrate;
        }

        public VideoCodec getVideoCodec() {
            return this.videoCodec;
        }

        public int getVideoFrameRate() {
            return this.videoFrameRate;
        }

        public float getVideoGop() {
            return this.videoGop;
        }

        public int getVideoHeight() {
            return this.videoHeight;
        }

        public int getVideoWidth() {
            return this.videoWidth;
        }

        public void updateStreamUrlPriority() {
            this.mStreamUrlPriority = System.currentTimeMillis();
        }

        public VideoProfile getVideoProfile() {
            if (this.videoCodec == VideoCodec.H265) {
                this.videoProfile = VideoProfile.MAIN;
            }
            return this.videoProfile;
        }

        public void updatePushCount() {
            if (this.mPushCount != null) {
                this.mPushCount.incrementAndGet();
            }
        }

        public int getAudioSampleRateValue() {
            switch (this.audioSampleRate) {
                case SAMPLE_RATE_16K:
                    return 16000;
                case SAMPLE_RATE_32K:
                    return 32000;
                case SAMPLE_RATE_48K:
                    return 48000;
                default:
                    return 44100;
            }
        }

        public String getBackgroundColorString() {
            String a = C1642a.m8034a("%6s", new Object[]{Integer.toHexString(this.backgroundColor).toUpperCase()});
            StringBuilder sb = new StringBuilder("#");
            sb.append(a.replaceAll(" ", "0"));
            return sb.toString();
        }

        public String getStreamUniqueId() {
            if (TextUtils.isEmpty(this.mStreamUuid) || this.mPushCount == null) {
                return "";
            }
            StringBuilder sb = new StringBuilder();
            sb.append(this.mStreamUuid);
            sb.append(ClassUtils.PACKAGE_SEPARATOR);
            sb.append(this.mPushCount.get());
            return sb.toString();
        }

        public String getStreamUrl() {
            String str = this.mStreamUrl;
            if (!TextUtils.isEmpty(str) && this.mStreamUrlPriority != 0) {
                str = UrlUtils.AddParam(str, "pri", String.valueOf(this.mStreamUrlPriority));
            }
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(getStreamUniqueId())) {
                return str;
            }
            return UrlUtils.AddParam(str, "_session_id", getStreamUniqueId());
        }

        public MixStreamConfig setAudioProfile(AudioProfile audioProfile2) {
            this.audioProfile = audioProfile2;
            return this;
        }

        public MixStreamConfig setAudioSampleRate(AudioSampleRate audioSampleRate2) {
            this.audioSampleRate = audioSampleRate2;
            return this;
        }

        public MixStreamConfig setBackgroundColor(int i) {
            this.backgroundColor = i;
            return this;
        }

        public MixStreamConfig setVideoCodec(VideoCodec videoCodec2) {
            this.videoCodec = videoCodec2;
            return this;
        }

        public MixStreamConfig setVideoProfile(VideoProfile videoProfile2) {
            this.videoProfile = videoProfile2;
            return this;
        }

        public MixStreamConfig setAudioBitrate(int i) {
            if (i < 32) {
                i = 32;
            } else if (i > 256) {
                i = 256;
            }
            this.audioBitrate = i;
            return this;
        }

        public MixStreamConfig setAudioChannels(int i) {
            if (!(i == 1 || i == 2)) {
                i = 2;
            }
            this.audioChannels = i;
            return this;
        }

        public MixStreamConfig setStreamUrl(String str) {
            this.mStreamUrl = str;
            this.mStreamName = parseStreamName(str);
            return this;
        }

        public MixStreamConfig setVideoBitrate(int i) {
            if (i < 100) {
                i = 100;
            } else if (i > 5000) {
                i = 5000;
            }
            this.videoBitrate = i;
            return this;
        }

        public MixStreamConfig setVideoFrameRate(int i) {
            if (i < 5) {
                i = 5;
            } else if (i > 50) {
                i = 50;
            }
            this.videoFrameRate = i;
            return this;
        }

        private String parseStreamName(String str) {
            try {
                String DecodeUrl = UrlUtils.DecodeUrl(str);
                int lastIndexOf = DecodeUrl.lastIndexOf(47) + 1;
                int indexOf = DecodeUrl.indexOf(63, lastIndexOf);
                if (indexOf < 0) {
                    indexOf = DecodeUrl.length();
                }
                return DecodeUrl.substring(lastIndexOf, indexOf);
            } catch (Exception unused) {
                return "";
            }
        }

        public MixStreamConfig setVideoGop(float f) {
            if (f < 1.0f) {
                f = 1.0f;
            } else if (f > 10.0f) {
                f = 10.0f;
            }
            this.videoGop = f;
            return this;
        }

        public MixStreamConfig setAudioSampleRate(int i) {
            int[] iArr = {16000, 32000, 44100, 48000};
            AudioSampleRate[] audioSampleRateArr = {AudioSampleRate.SAMPLE_RATE_16K, AudioSampleRate.SAMPLE_RATE_32K, AudioSampleRate.SAMPLE_RATE_44K, AudioSampleRate.SAMPLE_RATE_48K};
            for (int i2 = 0; i2 < 4; i2++) {
                if (i <= iArr[i2]) {
                    this.audioSampleRate = audioSampleRateArr[i2];
                    return this;
                }
            }
            this.audioSampleRate = AudioSampleRate.SAMPLE_RATE_44K;
            return this;
        }

        public MixStreamConfig setBackgroundColor(String str) {
            this.backgroundColor = 0;
            if (!TextUtils.isEmpty(str)) {
                if (str.startsWith("#")) {
                    str = str.substring(1);
                }
                try {
                    this.backgroundColor = Integer.valueOf(str, 16).intValue();
                } catch (Exception unused) {
                }
            }
            return this;
        }

        public void setStreamUniqueIdentifier(String str, AtomicInteger atomicInteger) {
            this.mStreamUuid = str;
            this.mPushCount = atomicInteger;
        }

        public MixStreamConfig setVideoSize(int i, int i2) {
            this.videoWidth = i;
            this.videoHeight = i2;
            return this;
        }
    }

    /* renamed from: com.ss.avframework.livestreamv2.interact.model.Config$Type */
    public enum Type {
        AUDIO,
        VIDEO
    }

    /* renamed from: com.ss.avframework.livestreamv2.interact.model.Config$Vendor */
    public enum Vendor {
        AGORA,
        ZEGO,
        BYTE
    }

    /* renamed from: com.ss.avframework.livestreamv2.interact.model.Config$VideoCodec */
    public enum VideoCodec {
        H264,
        H265
    }

    /* renamed from: com.ss.avframework.livestreamv2.interact.model.Config$VideoOutputFormat */
    public enum VideoOutputFormat {
        PIXEL_FORMAT_UNKNOWN,
        PIXEL_FORMAT_I420,
        PIXEL_FORMAT_NV12,
        PIXEL_FORMAT_NV21,
        PIXEL_FORMAT_BGRA32,
        PIXEL_FORMAT_RGBA32,
        PIXEL_FORMAT_ARGB32,
        PIXEL_FORMAT_ABGR32,
        TEXTURE_2D,
        TEXTURE_OES
    }

    /* renamed from: com.ss.avframework.livestreamv2.interact.model.Config$VideoProfile */
    public enum VideoProfile {
        BASELINE,
        MAIN,
        HIGH
    }

    /* renamed from: com.ss.avframework.livestreamv2.interact.model.Config$VideoQuality */
    public static class VideoQuality {
        public static final VideoQuality ANCHOR_HIGH = new VideoQuality(Config.align16(480), Config.align16(864), 15, 1200);
        public static final VideoQuality ANCHOR_NORMAL = new VideoQuality(Config.align16(360), Config.align16(640), 15, 800);
        public static final VideoQuality GUEST_HIGH = new VideoQuality(Config.align16(240), Config.align16(320), 15, 360);
        public static final VideoQuality GUEST_NORMAL = new VideoQuality(Config.align16(NormalGiftView.ALPHA_180), Config.align16(240), 15, 240);
        public static final VideoQuality MIN = new VideoQuality(16, 16, 15, 50);
        private int mBitrate;
        private int mFps;
        private int mHeight;
        private int mWidth;

        public int getBitrate() {
            return this.mBitrate;
        }

        public int getFps() {
            return this.mFps;
        }

        public int getHeight() {
            return this.mHeight;
        }

        public int getWidth() {
            return this.mWidth;
        }

        VideoQuality(int i, int i2, int i3, int i4) {
            this.mWidth = i;
            this.mHeight = i2;
            this.mFps = i3;
            this.mBitrate = i4;
        }
    }

    public String getAgoraAppId() {
        return this.mAgoraAppId;
    }

    public String getAgoraAppKey() {
        return this.mAgoraAppKey;
    }

    public String getAppChannel() {
        return this.mAppChannel;
    }

    public String getByteAppId() {
        return this.mByteAppId;
    }

    public String getByteToken() {
        return this.mByteToken;
    }

    public String getChannelName() {
        return this.mChannelName;
    }

    public Character getCharacter() {
        return this.mCharacter;
    }

    public Context getContext() {
        return this.mContext;
    }

    public String getDeviceId() {
        return this.mDeviceId;
    }

    public long getEGLNativeAddr() {
        return this.mEGLNativeAddr;
    }

    public FrameFormat getFrameFormat() {
        return this.mFrameFormat;
    }

    public Handler getHandler() {
        return this.mHandler;
    }

    public int getInteractId() {
        return this.mInteractId;
    }

    public InteractMode getInteractMode() {
        return this.mInteractMode;
    }

    public String getLogFile() {
        return this.mLogFile;
    }

    public int getLogReportInterval() {
        return this.mLogReportInterval;
    }

    public MixStreamConfig getMixStreamConfig() {
        return this.mMixStreamConfig;
    }

    public int getMixedStreamDefaultLayout() {
        return this.mixedStreamDefaultLayout;
    }

    public int getMixedStreamLifecycle() {
        return this.mixedStreamLifecycle;
    }

    public int getOutPlayerAudioChannel() {
        return this.mOutPlayerAudioChannel;
    }

    public int getOutPlayerAudioSampleHz() {
        return this.mOutPlayerAudioSampleHz;
    }

    public String getProjectKey() {
        return this.mProjectKey;
    }

    public JSONObject getRtcExtInfo() {
        return this.mRtcExtParams;
    }

    public JSONObject getSdkParams() {
        return null;
    }

    public int getSeiVersion() {
        return this.mSeiVersion;
    }

    public EGLContext getSharedEGLContext() {
        return this.mEGLContext;
    }

    public android.opengl.EGLContext getSharedEGLContext14() {
        return this.mEGLContext14;
    }

    public Type getType() {
        return this.mType;
    }

    public int getUpdateTalkSeiInterval() {
        return this.mUpdateTalkSeiInterval;
    }

    public long getUserId() {
        return this.mUserId;
    }

    public Vendor getVendor() {
        return this.mVendor;
    }

    public int getVolumeCallbackInterval() {
        return this.mVolumeCallbackInterval;
    }

    public long getZegoAppId() {
        return this.mZegoAppId;
    }

    public String getZegoThirdPartyToken() {
        return this.mZegoThirdPartyToken;
    }

    public boolean isAutoUpdateSeiForTalk() {
        return this.mAutoUpdateSeiForTalk;
    }

    public boolean isClientMixStream() {
        return this.mClientMixStream;
    }

    public boolean isTest() {
        return this.mTest;
    }

    public Config setSdkParams(JSONObject jSONObject) {
        return this;
    }

    public byte[] getZegoSignature() {
        if (this.mZegoSignature != null && this.mZegoSignature.length == 0) {
            this.mZegoSignature = null;
        }
        return this.mZegoSignature;
    }

    public boolean isAutoPlayRemoteAudio() {
        if (!this.mClientMixStream || this.mAutoPlayRemoteAudio) {
            return true;
        }
        return false;
    }

    public VideoQuality getVideoQuality() {
        if (Character.ANCHOR != this.mCharacter) {
            return this.mVideoQuality;
        }
        VideoQuality videoQualityFromRtcExtInfo = getVideoQualityFromRtcExtInfo();
        if (videoQualityFromRtcExtInfo != null) {
            return videoQualityFromRtcExtInfo;
        }
        return this.mVideoQuality;
    }

    public int getVolumeThreshold() {
        if (this.mVolumeThreshold > 0) {
            return this.mVolumeThreshold;
        }
        if (this.mVendor == Vendor.ZEGO) {
            return 11;
        }
        return 30;
    }

    public boolean isUseRtcExtParams() {
        if (Character.GUEST == this.mCharacter || this.mRtcExtParams == null) {
            return false;
        }
        return this.mRtcExtParams.has("byte_rtc_ext_info");
    }

    public boolean isUseDefaultSignalingServerFirstFromRtcExt() {
        if (this.mRtcExtParams == null || !this.mRtcExtParams.has("byte_rtc_ext_info")) {
            return false;
        }
        try {
            if (this.mRtcExtParams.getJSONObject("byte_rtc_ext_info").getInt("default_signaling_server_first") == 1) {
                return true;
            }
            return false;
        } catch (JSONException unused) {
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0097 A[Catch:{ Exception -> 0x00ab }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00a1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.p280ss.avframework.livestreamv2.interact.model.Config.VideoQuality getVideoQualityFromRtcExtInfo() {
        /*
            r12 = this;
            org.json.JSONObject r0 = r12.mRtcExtParams
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L_0x00bb
            org.json.JSONObject r0 = r12.mRtcExtParams
            java.lang.String r3 = "remote_push_base"
            boolean r0 = r0.has(r3)
            if (r0 == 0) goto L_0x00bb
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ Exception -> 0x00a6 }
            org.json.JSONObject r3 = r12.mRtcExtParams     // Catch:{ Exception -> 0x00a6 }
            java.lang.String r4 = "remote_push_base"
            java.lang.String r3 = r3.getString(r4)     // Catch:{ Exception -> 0x00a6 }
            r0.<init>(r3)     // Catch:{ Exception -> 0x00a6 }
            java.lang.String r3 = "PushBase"
            boolean r3 = r0.has(r3)     // Catch:{ Exception -> 0x00a6 }
            if (r3 == 0) goto L_0x002c
            java.lang.String r3 = "PushBase"
            org.json.JSONObject r0 = r0.getJSONObject(r3)     // Catch:{ Exception -> 0x00a6 }
            goto L_0x002d
        L_0x002c:
            r0 = r1
        L_0x002d:
            if (r0 == 0) goto L_0x003f
            java.lang.String r3 = "width"
            int r3 = r0.getInt(r3)     // Catch:{ Exception -> 0x00a6 }
            java.lang.String r4 = "height"
            int r0 = r0.getInt(r4)     // Catch:{ Exception -> 0x003c }
            goto L_0x0041
        L_0x003c:
            r0 = 0
            goto L_0x00a8
        L_0x003f:
            r0 = 0
            r3 = 0
        L_0x0041:
            com.ss.avframework.livestreamv2.interact.model.Config$MixStreamConfig r4 = r12.getMixStreamConfig()     // Catch:{ Exception -> 0x00a8 }
            int r4 = r4.getVideoWidth()     // Catch:{ Exception -> 0x00a8 }
            com.ss.avframework.livestreamv2.interact.model.Config$MixStreamConfig r5 = r12.getMixStreamConfig()     // Catch:{ Exception -> 0x00a9 }
            int r5 = r5.getVideoHeight()     // Catch:{ Exception -> 0x00a9 }
            org.json.JSONObject r6 = r12.mRtcExtParams     // Catch:{ Exception -> 0x00aa }
            java.lang.String r7 = "rtc_fps"
            boolean r6 = r6.has(r7)     // Catch:{ Exception -> 0x00aa }
            if (r6 == 0) goto L_0x0064
            org.json.JSONObject r6 = r12.mRtcExtParams     // Catch:{ Exception -> 0x00aa }
            java.lang.String r7 = "rtc_fps"
            int r6 = r6.getInt(r7)     // Catch:{ Exception -> 0x00aa }
            goto L_0x0066
        L_0x0064:
            r6 = 15
        L_0x0066:
            org.json.JSONObject r7 = r12.mRtcExtParams     // Catch:{ Exception -> 0x00ab }
            java.lang.String r8 = "rtc_bitrate_map"
            org.json.JSONObject r7 = r7.getJSONObject(r8)     // Catch:{ Exception -> 0x00ab }
            boolean r8 = r12.isClientMixStream()     // Catch:{ Exception -> 0x00ab }
            if (r8 == 0) goto L_0x0075
            goto L_0x0077
        L_0x0075:
            if (r3 <= r4) goto L_0x007a
        L_0x0077:
            r9 = r0
            r8 = r3
            goto L_0x007c
        L_0x007a:
            r8 = r4
            r9 = r5
        L_0x007c:
            int r10 = r8 / 2
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00ab }
            r11.<init>()     // Catch:{ Exception -> 0x00ab }
            int r10 = r10 / 100
            r11.append(r10)     // Catch:{ Exception -> 0x00ab }
            java.lang.String r10 = "xx"
            r11.append(r10)     // Catch:{ Exception -> 0x00ab }
            java.lang.String r10 = r11.toString()     // Catch:{ Exception -> 0x00ab }
            boolean r11 = r7.has(r10)     // Catch:{ Exception -> 0x00ab }
            if (r11 == 0) goto L_0x00a1
            int r7 = r7.getInt(r10)     // Catch:{ Exception -> 0x00ab }
            int r8 = r8 / 2
            int r9 = r9 / 2
            r2 = r8
            goto L_0x00a3
        L_0x00a1:
            r7 = 0
            r9 = 0
        L_0x00a3:
            r8 = r2
            r2 = r9
            goto L_0x00ad
        L_0x00a6:
            r0 = 0
            r3 = 0
        L_0x00a8:
            r4 = 0
        L_0x00a9:
            r5 = 0
        L_0x00aa:
            r6 = 0
        L_0x00ab:
            r7 = 0
        L_0x00ac:
            r8 = 0
        L_0x00ad:
            if (r7 == 0) goto L_0x00c1
            if (r2 == 0) goto L_0x00c1
            if (r8 == 0) goto L_0x00c1
            com.ss.avframework.livestreamv2.interact.model.Config$VideoQuality r1 = new com.ss.avframework.livestreamv2.interact.model.Config$VideoQuality
            int r7 = r7 / 1000
            r1.<init>(r8, r2, r6, r7)
            goto L_0x00c1
        L_0x00bb:
            r0 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r8 = 0
        L_0x00c1:
            java.lang.String r7 = TAG
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "getVideoQualityFromRtcExtInfo (clientMix:"
            r9.<init>(r10)
            boolean r10 = r12.isClientMixStream()
            r9.append(r10)
            java.lang.String r10 = ",rwidth:"
            r9.append(r10)
            r9.append(r3)
            java.lang.String r3 = ",rheight:"
            r9.append(r3)
            r9.append(r0)
            java.lang.String r0 = ",lwidth:"
            r9.append(r0)
            r9.append(r4)
            java.lang.String r0 = ",lheight:"
            r9.append(r0)
            r9.append(r5)
            java.lang.String r0 = ",twidth:"
            r9.append(r0)
            r9.append(r8)
            java.lang.String r0 = ",theight:"
            r9.append(r0)
            r9.append(r2)
            java.lang.String r0 = ",tbps:"
            r9.append(r0)
            r9.append(r6)
            java.lang.String r0 = ",tfps:"
            r9.append(r0)
            r9.append(r6)
            java.lang.String r0 = r9.toString()
            com.p280ss.avframework.utils.AVLog.ioi(r7, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.avframework.livestreamv2.interact.model.Config.getVideoQualityFromRtcExtInfo():com.ss.avframework.livestreamv2.interact.model.Config$VideoQuality");
    }

    public Config setAgoraAppId(String str) {
        this.mAgoraAppId = str;
        return this;
    }

    public Config setAgoraAppKey(String str) {
        this.mAgoraAppKey = str;
        return this;
    }

    public Config setAppChannel(String str) {
        this.mAppChannel = str;
        return this;
    }

    public Config setAutoPlayRemoteAudio(boolean z) {
        this.mAutoPlayRemoteAudio = z;
        return this;
    }

    public Config setAutoUpdateSeiForTalk(boolean z) {
        this.mAutoUpdateSeiForTalk = z;
        return this;
    }

    public Config setByteAppId(String str) {
        this.mByteAppId = str;
        return this;
    }

    public Config setByteToken(String str) {
        this.mByteToken = str;
        return this;
    }

    public Config setChannelName(String str) {
        this.mChannelName = str;
        return this;
    }

    public Config setCharacter(Character character) {
        this.mCharacter = character;
        return this;
    }

    public Config setClientMixStream(boolean z) {
        this.mClientMixStream = z;
        return this;
    }

    public Config setContext(Context context) {
        this.mContext = context;
        return this;
    }

    public Config setDeviceId(String str) {
        this.mDeviceId = str;
        return this;
    }

    public Config setEGLNativeAddr(long j) {
        this.mEGLNativeAddr = j;
        return this;
    }

    public Config setFrameFormat(FrameFormat frameFormat) {
        this.mFrameFormat = frameFormat;
        return this;
    }

    public Config setHandler(Handler handler) {
        this.mHandler = handler;
        return this;
    }

    public Config setInteractId(int i) {
        this.mInteractId = i;
        return this;
    }

    public Config setInteractMode(InteractMode interactMode) {
        this.mInteractMode = interactMode;
        return this;
    }

    public Config setLogFile(String str) {
        this.mLogFile = str;
        return this;
    }

    public Config setLogReportInterval(int i) {
        this.mLogReportInterval = i;
        return this;
    }

    public Config setMixStreamConfig(MixStreamConfig mixStreamConfig) {
        this.mMixStreamConfig = mixStreamConfig;
        return this;
    }

    public Config setMixedStreamDefaultLayout(int i) {
        this.mixedStreamDefaultLayout = i;
        return this;
    }

    public Config setMixedStreamLifecycle(int i) {
        this.mixedStreamLifecycle = i;
        return this;
    }

    public Config setOutPlayerAudioChannel(int i) {
        this.mOutPlayerAudioChannel = i;
        return this;
    }

    public Config setOutPlayerAudioSampleHz(int i) {
        this.mOutPlayerAudioSampleHz = i;
        return this;
    }

    public Config setProjectKey(String str) {
        this.mProjectKey = str;
        return this;
    }

    public Config setRtcExtInfo(JSONObject jSONObject) {
        this.mRtcExtParams = jSONObject;
        return this;
    }

    public Config setSeiVersion(int i) {
        this.mSeiVersion = i;
        return this;
    }

    public Config setSharedEGLContext(EGLContext eGLContext) {
        this.mEGLContext = eGLContext;
        return this;
    }

    public Config setSharedEGLContext14(android.opengl.EGLContext eGLContext) {
        this.mEGLContext14 = eGLContext;
        return this;
    }

    public Config setTest(boolean z) {
        this.mTest = z;
        return this;
    }

    public Config setType(Type type) {
        this.mType = type;
        return this;
    }

    public Config setUpdateTalkSeiInterval(int i) {
        this.mUpdateTalkSeiInterval = i;
        return this;
    }

    public Config setUserId(long j) {
        this.mUserId = j;
        return this;
    }

    public Config setVendor(Vendor vendor) {
        this.mVendor = vendor;
        return this;
    }

    public Config setVideoQuality(VideoQuality videoQuality) {
        this.mVideoQuality = videoQuality;
        return this;
    }

    public Config setVolumeCallbackInterval(int i) {
        this.mVolumeCallbackInterval = i;
        return this;
    }

    public Config setVolumeThreshold(int i) {
        this.mVolumeThreshold = i;
        return this;
    }

    public Config setZegoAppId(long j) {
        this.mZegoAppId = j;
        return this;
    }

    public Config setZegoSignature(byte[] bArr) {
        this.mZegoSignature = bArr;
        return this;
    }

    public Config setZegoThirdPartyToken(String str) {
        this.mZegoThirdPartyToken = str;
        return this;
    }

    public static int align16(int i) {
        return ((i + 15) / 16) * 16;
    }

    private VideoQuality parseVideoQuality(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            if (!jSONObject.has("width") || !jSONObject.has("height") || !jSONObject.has("fps") || !jSONObject.has("bitrate")) {
                return null;
            }
            return new VideoQuality(jSONObject.getInt("width"), jSONObject.getInt("height"), jSONObject.getInt("fps"), jSONObject.getInt("bitrate") / 1000);
        } catch (JSONException unused) {
            return null;
        }
    }
}

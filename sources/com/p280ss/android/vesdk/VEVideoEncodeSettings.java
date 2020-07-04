package com.p280ss.android.vesdk;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.p280ss.android.medialib.util.VEPlatformUtils;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.p280ss.android.vesdk.settings.VEVideoCompileEncodeSettings;
import com.p280ss.android.vesdk.settings.VEVideoEncodeProfile;
import com.p280ss.android.vesdk.settings.VEVideoHWEncodeSettings;
import com.p280ss.android.vesdk.settings.VEVideoSWEncodeSettings;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.vesdk.VEVideoEncodeSettings */
public class VEVideoEncodeSettings implements Parcelable {
    public static final Creator<VEVideoEncodeSettings> CREATOR = new Creator<VEVideoEncodeSettings>() {
        /* renamed from: a */
        private static VEVideoEncodeSettings[] m142692a(int i) {
            return new VEVideoEncodeSettings[i];
        }

        /* renamed from: a */
        private static VEVideoEncodeSettings m142691a(Parcel parcel) {
            return new VEVideoEncodeSettings(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m142691a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m142692a(i);
        }
    };
    private static final String TAG = "VEVideoEncodeSettings";
    public static final int USAGE_COMPILE = 2;
    public static final int USAGE_IMPORT = 3;
    public static final int USAGE_RECORD = 1;
    public ENCODE_BITRATE_MODE bitrateMode;
    public int bps;
    public COMPILE_TYPE compileType;
    private boolean enableInterLeave;
    public boolean enableRemuxVideo;
    public boolean enableRemuxVideoForRotation;
    public int encodeProfile;
    public int encodeStandard;
    public String externalSettingsJsonStr;
    public int fps;
    public int gopSize;
    public boolean hasBFrame;
    public boolean isOptCrf;
    public boolean isOptCrfRencode;
    public boolean isSupportHWEncoder;
    public String mComment;
    public boolean mCompileSoftInfo;
    public String mDescription;
    public boolean mOptRemuxWithCopy;
    public VEVideoCompileEncodeSettings mVideoCompileEncodeSetting;
    public VEVideoCompileEncodeSettings mVideoWatermarkCompileEncodeSetting;
    public VEWatermarkParam mWatermarkParam;
    public VESize outputSize;
    public int resizeMode;
    public float resizeX;
    public float resizeY;
    public int rotate;
    public float speed;
    public int swCRF;
    public long swMaxrate;
    public int swPreset;
    public int swQP;

    /* renamed from: com.ss.android.vesdk.VEVideoEncodeSettings$COMPILE_TYPE */
    public enum COMPILE_TYPE implements Parcelable {
        COMPILE_TYPE_MP4,
        COMPILE_TYPE_GIF,
        COMPILE_TYPE_HIGH_GIF;
        
        public static final Creator<COMPILE_TYPE> CREATOR = null;

        public final int describeContents() {
            return 0;
        }

        static {
            CREATOR = new Creator<COMPILE_TYPE>() {
                /* renamed from: a */
                private static COMPILE_TYPE[] m142694a(int i) {
                    return new COMPILE_TYPE[i];
                }

                public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                    return m142693a(parcel);
                }

                public final /* synthetic */ Object[] newArray(int i) {
                    return m142694a(i);
                }

                /* renamed from: a */
                private static COMPILE_TYPE m142693a(Parcel parcel) {
                    return COMPILE_TYPE.values()[parcel.readInt()];
                }
            };
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(ordinal());
        }
    }

    /* renamed from: com.ss.android.vesdk.VEVideoEncodeSettings$ENCODE_BITRATE_MODE */
    public enum ENCODE_BITRATE_MODE implements Parcelable {
        ENCODE_BITRATE_ABR,
        ENCODE_BITRATE_CRF,
        ENCODE_BITRATE_QP,
        ENCODE_BITRATE_VBR;
        
        public static final Creator<ENCODE_BITRATE_MODE> CREATOR = null;
        private static final ENCODE_BITRATE_MODE[] values = null;

        public final int describeContents() {
            return 0;
        }

        static {
            values = values();
            CREATOR = new Creator<ENCODE_BITRATE_MODE>() {
                /* renamed from: a */
                private static ENCODE_BITRATE_MODE[] m142696a(int i) {
                    return new ENCODE_BITRATE_MODE[i];
                }

                public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                    return m142695a(parcel);
                }

                public final /* synthetic */ Object[] newArray(int i) {
                    return m142696a(i);
                }

                /* renamed from: a */
                private static ENCODE_BITRATE_MODE m142695a(Parcel parcel) {
                    return ENCODE_BITRATE_MODE.values()[parcel.readInt()];
                }
            };
        }

        public static ENCODE_BITRATE_MODE fromInteger(int i) {
            return values[i];
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(ordinal());
        }
    }

    /* renamed from: com.ss.android.vesdk.VEVideoEncodeSettings$ENCODE_PRESET */
    public enum ENCODE_PRESET implements Parcelable {
        ENCODE_LEVEL_ULTRAFAST,
        ENCODE_LEVEL_SUPERFAST,
        ENCODE_LEVEL_VERYFAST,
        ENCODE_LEVEL_FASTER,
        ENCODE_LEVEL_FAST,
        ENCODE_LEVEL_MEDIUM,
        ENCODE_LEVEL_SLOW,
        ENCODE_LEVEL_SLOWER,
        ENCODE_LEVEL_VERYSLOW,
        ENCODE_LEVEL_PLACEBO;
        
        public static final Creator<ENCODE_PRESET> CREATOR = null;

        public final int describeContents() {
            return 0;
        }

        static {
            CREATOR = new Creator<ENCODE_PRESET>() {
                /* renamed from: a */
                private static ENCODE_PRESET[] m142698a(int i) {
                    return new ENCODE_PRESET[i];
                }

                public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                    return m142697a(parcel);
                }

                public final /* synthetic */ Object[] newArray(int i) {
                    return m142698a(i);
                }

                /* renamed from: a */
                private static ENCODE_PRESET m142697a(Parcel parcel) {
                    return ENCODE_PRESET.values()[parcel.readInt()];
                }
            };
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(ordinal());
        }
    }

    /* renamed from: com.ss.android.vesdk.VEVideoEncodeSettings$ENCODE_PROFILE */
    public enum ENCODE_PROFILE implements Parcelable {
        ENCODE_PROFILE_UNKNOWN,
        ENCODE_PROFILE_BASELINE,
        ENCODE_PROFILE_MAIN,
        ENCODE_PROFILE_HIGH;
        
        public static final Creator<ENCODE_PROFILE> CREATOR = null;

        public final int describeContents() {
            return 0;
        }

        static {
            CREATOR = new Creator<ENCODE_PROFILE>() {
                /* renamed from: a */
                private static ENCODE_PROFILE[] m142700a(int i) {
                    return new ENCODE_PROFILE[i];
                }

                public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                    return m142699a(parcel);
                }

                public final /* synthetic */ Object[] newArray(int i) {
                    return m142700a(i);
                }

                /* renamed from: a */
                private static ENCODE_PROFILE m142699a(Parcel parcel) {
                    return ENCODE_PROFILE.values()[parcel.readInt()];
                }
            };
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(ordinal());
        }
    }

    /* renamed from: com.ss.android.vesdk.VEVideoEncodeSettings$ENCODE_STANDARD */
    public enum ENCODE_STANDARD implements Parcelable {
        ENCODE_STANDARD_H264,
        ENCODE_STANDARD_H265,
        ENCODE_STANDARD_MPEG4;
        
        public static final Creator<ENCODE_STANDARD> CREATOR = null;

        public final int describeContents() {
            return 0;
        }

        static {
            CREATOR = new Creator<ENCODE_STANDARD>() {
                /* renamed from: a */
                private static ENCODE_STANDARD[] m142702a(int i) {
                    return new ENCODE_STANDARD[i];
                }

                public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                    return m142701a(parcel);
                }

                public final /* synthetic */ Object[] newArray(int i) {
                    return m142702a(i);
                }

                /* renamed from: a */
                private static ENCODE_STANDARD m142701a(Parcel parcel) {
                    return ENCODE_STANDARD.values()[parcel.readInt()];
                }
            };
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(ordinal());
        }
    }

    /* renamed from: com.ss.android.vesdk.VEVideoEncodeSettings$VESpeedMode */
    public enum VESpeedMode implements Parcelable {
        SPEED_UNKNOWN,
        SPEED_NORMAL,
        SPEED_LOW,
        SPEED_HIGH;
        
        public static final Creator<VESpeedMode> CREATOR = null;

        public final int describeContents() {
            return 0;
        }

        static {
            CREATOR = new Creator<VESpeedMode>() {
                /* renamed from: a */
                private static VESpeedMode[] m142704a(int i) {
                    return new VESpeedMode[i];
                }

                public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                    return m142703a(parcel);
                }

                public final /* synthetic */ Object[] newArray(int i) {
                    return m142704a(i);
                }

                /* renamed from: a */
                private static VESpeedMode m142703a(Parcel parcel) {
                    return VESpeedMode.values()[parcel.readInt()];
                }
            };
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(ordinal());
        }
    }

    /* renamed from: com.ss.android.vesdk.VEVideoEncodeSettings$a */
    public static class C45244a {

        /* renamed from: a */
        private int f116404a;

        /* renamed from: b */
        private VEVideoEncodeSettings f116405b = new VEVideoEncodeSettings();

        /* renamed from: a */
        public final C45244a mo108160a(boolean z) {
            this.f116405b.enableRemuxVideo = false;
            return this;
        }

        /* renamed from: a */
        public final C45244a mo108161a(boolean z, boolean z2) {
            this.f116405b.enableRemuxVideo = z;
            this.f116405b.enableRemuxVideoForRotation = z2;
            return this;
        }

        /* renamed from: a */
        public final C45244a mo108154a(ENCODE_PRESET encode_preset) {
            this.f116405b.swPreset = encode_preset.ordinal();
            return this;
        }

        /* renamed from: a */
        public final C45244a mo108155a(ENCODE_PROFILE encode_profile) {
            this.f116405b.encodeProfile = encode_profile.ordinal();
            return this;
        }

        /* renamed from: a */
        public final C45244a mo108156a(ENCODE_STANDARD encode_standard) {
            this.f116405b.encodeStandard = encode_standard.ordinal();
            return this;
        }

        /* renamed from: a */
        public final C45244a mo108157a(VEWatermarkParam vEWatermarkParam) {
            this.f116405b.mWatermarkParam = null;
            return this;
        }

        /* renamed from: a */
        public final VEVideoEncodeSettings mo108162a() {
            if (!TextUtils.isEmpty(this.f116405b.externalSettingsJsonStr)) {
                m142706a(this.f116405b.externalSettingsJsonStr, this.f116405b.isOptCrf, this.f116405b.isOptCrfRencode);
            } else {
                m142708b();
            }
            String str = VEVideoEncodeSettings.TAG;
            StringBuilder sb = new StringBuilder("exportVideoEncodeSettings = ");
            sb.append(this.f116405b);
            C45372t.m143409d(str, sb.toString());
            return this.f116405b;
        }

        /* renamed from: a */
        public final C45244a mo108158a(String str) {
            this.f116405b.externalSettingsJsonStr = str;
            return this;
        }

        /* renamed from: a */
        public final C45244a mo108159a(String str, int i, boolean z) {
            this.f116405b.externalSettingsJsonStr = str;
            if (str != null) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    if (jSONObject.getJSONObject("compile") != null && i > 0) {
                        jSONObject.getJSONObject("compile").getJSONObject("sw").put("crf", i);
                        this.f116405b.externalSettingsJsonStr = jSONObject.toString();
                        this.f116405b.isOptCrf = true;
                        this.f116405b.isOptCrfRencode = z;
                    }
                } catch (JSONException e) {
                    String str2 = VEVideoEncodeSettings.TAG;
                    StringBuilder sb = new StringBuilder("external json str parse error : ");
                    sb.append(e.getLocalizedMessage());
                    C45372t.m143409d(str2, sb.toString());
                }
            }
            return this;
        }

        /* renamed from: b */
        private void m142708b() {
            VEVideoCompileEncodeSettings vEVideoCompileEncodeSettings = new VEVideoCompileEncodeSettings();
            vEVideoCompileEncodeSettings.isSupportHWEncoder = this.f116405b.isSupportHWEncoder;
            vEVideoCompileEncodeSettings.useHWEncoder = this.f116405b.isSupportHWEncoder;
            if (vEVideoCompileEncodeSettings.useHWEncoder) {
                vEVideoCompileEncodeSettings.mHWEncodeSetting.mBitrate = (long) this.f116405b.bps;
                vEVideoCompileEncodeSettings.mHWEncodeSetting.mProfile = this.f116405b.encodeProfile;
                vEVideoCompileEncodeSettings.mHWEncodeSetting.mGop = this.f116405b.gopSize;
            } else {
                vEVideoCompileEncodeSettings.mSWEncodeSetting.mBitrateMode = this.f116405b.bitrateMode.ordinal();
                vEVideoCompileEncodeSettings.mSWEncodeSetting.mBps = this.f116405b.bps;
                vEVideoCompileEncodeSettings.mSWEncodeSetting.mCrf = this.f116405b.swCRF;
                vEVideoCompileEncodeSettings.mSWEncodeSetting.mMaxRate = this.f116405b.swMaxrate;
                vEVideoCompileEncodeSettings.mSWEncodeSetting.mPreset = this.f116405b.swPreset;
                vEVideoCompileEncodeSettings.mSWEncodeSetting.mProfile = this.f116405b.encodeProfile;
                vEVideoCompileEncodeSettings.mSWEncodeSetting.mGop = this.f116405b.gopSize;
            }
            this.f116405b.mVideoCompileEncodeSetting = vEVideoCompileEncodeSettings;
            this.f116405b.mVideoWatermarkCompileEncodeSetting = vEVideoCompileEncodeSettings;
        }

        /* renamed from: a */
        public final C45244a mo108147a(float f) {
            this.f116405b.resizeX = 0.0f;
            return this;
        }

        /* renamed from: b */
        public final C45244a mo108163b(float f) {
            this.f116405b.resizeY = 0.0f;
            return this;
        }

        /* renamed from: c */
        public final C45244a mo108168c(boolean z) {
            return mo108166b(z);
        }

        /* renamed from: d */
        public final C45244a mo108170d(boolean z) {
            this.f116405b.mOptRemuxWithCopy = z;
            return this;
        }

        /* renamed from: e */
        public final C45244a mo108171e(int i) {
            this.f116405b.rotate = i;
            return this;
        }

        /* renamed from: f */
        public final C45244a mo108172f(int i) {
            this.f116405b.resizeMode = i;
            return this;
        }

        /* renamed from: g */
        public final C45244a mo108173g(int i) {
            this.f116405b.gopSize = i;
            return this;
        }

        public C45244a(int i) {
            this.f116404a = i;
        }

        /* renamed from: a */
        public final C45244a mo108148a(int i) {
            this.f116405b.fps = i;
            return this;
        }

        /* renamed from: b */
        public final C45244a mo108164b(int i) {
            this.f116405b.bitrateMode = ENCODE_BITRATE_MODE.ENCODE_BITRATE_ABR;
            this.f116405b.bps = i;
            return this;
        }

        /* renamed from: c */
        public final C45244a mo108167c(int i) {
            this.f116405b.bitrateMode = ENCODE_BITRATE_MODE.ENCODE_BITRATE_CRF;
            this.f116405b.swCRF = i;
            return this;
        }

        /* renamed from: d */
        public final C45244a mo108169d(int i) {
            this.f116405b.bitrateMode = ENCODE_BITRATE_MODE.ENCODE_BITRATE_QP;
            this.f116405b.swQP = i;
            return this;
        }

        /* renamed from: b */
        public final C45244a mo108165b(String str) {
            this.f116405b.mDescription = str;
            return this;
        }

        /* renamed from: a */
        public final C45244a mo108150a(long j) {
            this.f116405b.swMaxrate = j;
            return this;
        }

        /* renamed from: b */
        public final C45244a mo108166b(boolean z) {
            this.f116405b.isSupportHWEncoder = z;
            return this;
        }

        /* renamed from: a */
        public final C45244a mo108151a(COMPILE_TYPE compile_type) {
            this.f116405b.compileType = compile_type;
            return this;
        }

        /* renamed from: a */
        private VEVideoCompileEncodeSettings m142705a(JSONObject jSONObject) {
            int i;
            long j;
            int i2;
            int i3;
            int i4;
            VEVideoCompileEncodeSettings vEVideoCompileEncodeSettings = new VEVideoCompileEncodeSettings();
            try {
                vEVideoCompileEncodeSettings.isSupportHWEncoder = this.f116405b.isSupportHWEncoder;
                String string = jSONObject.getString("encode_mode");
                if (!"unknown".equals(string) || this.f116404a != 2) {
                    vEVideoCompileEncodeSettings.useHWEncoder = "hw".equals(string);
                } else {
                    vEVideoCompileEncodeSettings.useHWEncoder = this.f116405b.isSupportHWEncoder;
                }
                String str = "unknown";
                if (!jSONObject.isNull("speed_mode")) {
                    str = jSONObject.getString("speed_mode");
                }
                if ("low".equals(str) && this.f116404a == 2) {
                    vEVideoCompileEncodeSettings.speedMode = VESpeedMode.SPEED_LOW.ordinal();
                } else if ("normal".equals(str) && this.f116404a == 2) {
                    vEVideoCompileEncodeSettings.speedMode = VESpeedMode.SPEED_NORMAL.ordinal();
                } else if (!"high".equals(str) || this.f116404a != 2) {
                    vEVideoCompileEncodeSettings.speedMode = VESpeedMode.SPEED_UNKNOWN.ordinal();
                } else {
                    vEVideoCompileEncodeSettings.speedMode = VESpeedMode.SPEED_HIGH.ordinal();
                }
                vEVideoCompileEncodeSettings.mHWEncodeSetting = m142707b(jSONObject);
                vEVideoCompileEncodeSettings.mSWEncodeSetting.mBitrateMode = ENCODE_BITRATE_MODE.ENCODE_BITRATE_CRF.ordinal();
                VEVideoSWEncodeSettings vEVideoSWEncodeSettings = vEVideoCompileEncodeSettings.mSWEncodeSetting;
                if (this.f116404a != 2 || jSONObject.getJSONObject("sw").getInt("crf") != -1) {
                    i = jSONObject.getJSONObject("sw").getInt("crf");
                } else if (this.f116405b.isSupportHWEncoder) {
                    i = vEVideoCompileEncodeSettings.mSWEncodeSetting.mCrf;
                } else {
                    i = this.f116405b.swCRF;
                }
                vEVideoSWEncodeSettings.mCrf = i;
                VEVideoSWEncodeSettings vEVideoSWEncodeSettings2 = vEVideoCompileEncodeSettings.mSWEncodeSetting;
                if (this.f116404a != 2 || jSONObject.getJSONObject("sw").getInt("maxrate") != -1) {
                    j = (long) jSONObject.getJSONObject("sw").getInt("maxrate");
                } else if (this.f116405b.isSupportHWEncoder) {
                    j = vEVideoCompileEncodeSettings.mSWEncodeSetting.mMaxRate;
                } else {
                    j = this.f116405b.swMaxrate;
                }
                vEVideoSWEncodeSettings2.mMaxRate = j;
                VEVideoSWEncodeSettings vEVideoSWEncodeSettings3 = vEVideoCompileEncodeSettings.mSWEncodeSetting;
                if (this.f116404a != 2 || jSONObject.getJSONObject("sw").getInt("preset") != -1) {
                    i2 = jSONObject.getJSONObject("sw").getInt("preset");
                } else if (this.f116405b.isSupportHWEncoder) {
                    i2 = vEVideoCompileEncodeSettings.mSWEncodeSetting.mPreset;
                } else {
                    i2 = this.f116405b.swPreset;
                }
                vEVideoSWEncodeSettings3.mPreset = i2;
                VEVideoSWEncodeSettings vEVideoSWEncodeSettings4 = vEVideoCompileEncodeSettings.mSWEncodeSetting;
                if (this.f116404a != 2 || !"unknown".equals(jSONObject.getJSONObject("sw").getString("profile"))) {
                    i3 = VEVideoEncodeProfile.valueOfString(jSONObject.getJSONObject("sw").getString("profile")).ordinal();
                } else if (this.f116405b.isSupportHWEncoder) {
                    i3 = vEVideoCompileEncodeSettings.mSWEncodeSetting.mProfile;
                } else {
                    i3 = this.f116405b.encodeProfile;
                }
                vEVideoSWEncodeSettings4.mProfile = i3;
                VEVideoSWEncodeSettings vEVideoSWEncodeSettings5 = vEVideoCompileEncodeSettings.mSWEncodeSetting;
                if (this.f116404a != 2 || jSONObject.getJSONObject("sw").getInt("gop") != -1) {
                    i4 = jSONObject.getJSONObject("sw").getInt("gop");
                } else if (this.f116405b.isSupportHWEncoder) {
                    i4 = vEVideoCompileEncodeSettings.mSWEncodeSetting.mGop;
                } else {
                    i4 = this.f116405b.gopSize;
                }
                vEVideoSWEncodeSettings5.mGop = i4;
            } catch (JSONException e) {
                String str2 = VEVideoEncodeSettings.TAG;
                StringBuilder sb = new StringBuilder("parseJsonToSetting : external json str parse error : ");
                sb.append(e.getLocalizedMessage());
                C45372t.m143409d(str2, sb.toString());
            }
            return vEVideoCompileEncodeSettings;
        }

        /* renamed from: b */
        private VEVideoHWEncodeSettings m142707b(JSONObject jSONObject) {
            long j;
            int i;
            int i2;
            double d;
            double d2;
            long j2;
            long j3;
            long j4;
            long j5;
            VEVideoHWEncodeSettings vEVideoHWEncodeSettings = new VEVideoHWEncodeSettings();
            try {
                if (this.f116404a != 2 || jSONObject.getJSONObject("hw").getInt("bitrate") != -1) {
                    j = (long) jSONObject.getJSONObject("hw").getInt("bitrate");
                } else if (this.f116405b.isSupportHWEncoder) {
                    j = (long) this.f116405b.bps;
                } else {
                    j = vEVideoHWEncodeSettings.mBitrate;
                }
                vEVideoHWEncodeSettings.mBitrate = j;
                if (!jSONObject.getJSONObject("hw").isNull("platform")) {
                    switch (VEPlatformUtils.m65370a()) {
                        case PLATFORM_QCOM:
                            if (!jSONObject.getJSONObject("hw").getJSONObject("platform").isNull("qcom") && !jSONObject.getJSONObject("hw").getJSONObject("platform").getJSONObject("qcom").isNull("bitrate")) {
                                if (this.f116404a == 2 && jSONObject.getJSONObject("hw").getJSONObject("platform").getJSONObject("qcom").getInt("bitrate") == -1) {
                                    j2 = vEVideoHWEncodeSettings.mBitrate;
                                } else {
                                    j2 = (long) jSONObject.getJSONObject("hw").getJSONObject("platform").getJSONObject("qcom").getInt("bitrate");
                                }
                                vEVideoHWEncodeSettings.mBitrate = j2;
                                break;
                            }
                            break;
                        case PLATFORM_MTK:
                            if (!jSONObject.getJSONObject("hw").getJSONObject("platform").isNull("mtk") && !jSONObject.getJSONObject("hw").getJSONObject("platform").getJSONObject("mtk").isNull("bitrate")) {
                                if (this.f116404a == 2 && jSONObject.getJSONObject("hw").getJSONObject("platform").getJSONObject("mtk").getInt("bitrate") == -1) {
                                    j3 = vEVideoHWEncodeSettings.mBitrate;
                                } else {
                                    j3 = (long) jSONObject.getJSONObject("hw").getJSONObject("platform").getJSONObject("mtk").getInt("bitrate");
                                }
                                vEVideoHWEncodeSettings.mBitrate = j3;
                                break;
                            }
                            break;
                        case PLATFORM_HISI:
                            if (!jSONObject.getJSONObject("hw").getJSONObject("platform").isNull("hisi") && !jSONObject.getJSONObject("hw").getJSONObject("platform").getJSONObject("hisi").isNull("bitrate")) {
                                if (this.f116404a == 2 && jSONObject.getJSONObject("hw").getJSONObject("platform").getJSONObject("hisi").getInt("bitrate") == -1) {
                                    j4 = vEVideoHWEncodeSettings.mBitrate;
                                } else {
                                    j4 = (long) jSONObject.getJSONObject("hw").getJSONObject("platform").getJSONObject("hisi").getInt("bitrate");
                                }
                                vEVideoHWEncodeSettings.mBitrate = j4;
                                break;
                            }
                            break;
                        case PLATFORM_EXYNOS:
                            if (!jSONObject.getJSONObject("hw").getJSONObject("platform").isNull("exynos") && !jSONObject.getJSONObject("hw").getJSONObject("platform").getJSONObject("exynos").isNull("bitrate")) {
                                if (this.f116404a == 2 && jSONObject.getJSONObject("hw").getJSONObject("platform").getJSONObject("exynos").getInt("bitrate") == -1) {
                                    j5 = vEVideoHWEncodeSettings.mBitrate;
                                } else {
                                    j5 = (long) jSONObject.getJSONObject("hw").getJSONObject("platform").getJSONObject("exynos").getInt("bitrate");
                                }
                                vEVideoHWEncodeSettings.mBitrate = j5;
                                break;
                            }
                            break;
                    }
                }
                if (this.f116404a != 2 || !"unknown".equals(jSONObject.getJSONObject("hw").getString("profile"))) {
                    i = VEVideoEncodeProfile.valueOfString(jSONObject.getJSONObject("hw").getString("profile")).ordinal();
                } else if (this.f116405b.isSupportHWEncoder) {
                    i = this.f116405b.encodeProfile;
                } else {
                    i = vEVideoHWEncodeSettings.mProfile;
                }
                vEVideoHWEncodeSettings.mProfile = i;
                if (!jSONObject.getJSONObject("hw").isNull("hp_bitrate_ratio")) {
                    if (this.f116404a == 2 && jSONObject.getJSONObject("hw").getDouble("hp_bitrate_ratio") == -1.0d) {
                        d2 = vEVideoHWEncodeSettings.mHp_bitrate_ratio;
                    } else {
                        d2 = jSONObject.getJSONObject("hw").getDouble("hp_bitrate_ratio");
                    }
                    vEVideoHWEncodeSettings.mHp_bitrate_ratio = d2;
                }
                if (!jSONObject.getJSONObject("hw").isNull("sd_bitrate_ratio")) {
                    if (this.f116404a == 2 && jSONObject.getJSONObject("hw").getDouble("sd_bitrate_ratio") == -1.0d) {
                        d = vEVideoHWEncodeSettings.mSd_bitrate_ratio;
                    } else {
                        d = jSONObject.getJSONObject("hw").getDouble("sd_bitrate_ratio");
                    }
                    vEVideoHWEncodeSettings.mSd_bitrate_ratio = d;
                }
                if (this.f116404a != 2 || jSONObject.getJSONObject("hw").getInt("gop") != -1) {
                    i2 = jSONObject.getJSONObject("hw").getInt("gop");
                } else if (this.f116405b.isSupportHWEncoder) {
                    i2 = this.f116405b.gopSize;
                } else {
                    i2 = vEVideoHWEncodeSettings.mGop;
                }
                vEVideoHWEncodeSettings.mGop = i2;
            } catch (JSONException e) {
                String str = VEVideoEncodeSettings.TAG;
                StringBuilder sb = new StringBuilder("parseJsonToHwCompileSetting : external json str parse error : ");
                sb.append(e.getLocalizedMessage());
                C45372t.m143409d(str, sb.toString());
            }
            return vEVideoHWEncodeSettings;
        }

        /* renamed from: a */
        public final C45244a mo108152a(ENCODE_BITRATE_MODE encode_bitrate_mode) {
            this.f116405b.bitrateMode = encode_bitrate_mode;
            return this;
        }

        /* renamed from: a */
        public final C45244a mo108149a(int i, int i2) {
            this.f116405b.outputSize.f116385a = i;
            this.f116405b.outputSize.f116386b = i2;
            return this;
        }

        /* renamed from: a */
        public final C45244a mo108153a(ENCODE_BITRATE_MODE encode_bitrate_mode, int i) {
            this.f116405b.bitrateMode = encode_bitrate_mode;
            switch (encode_bitrate_mode) {
                case ENCODE_BITRATE_ABR:
                    this.f116405b.bps = i;
                    break;
                case ENCODE_BITRATE_CRF:
                    this.f116405b.swCRF = i;
                    break;
                case ENCODE_BITRATE_QP:
                    this.f116405b.swQP = i;
                    break;
                case ENCODE_BITRATE_VBR:
                    this.f116405b.bps = i;
                    break;
                default:
                    StringBuilder sb = new StringBuilder("CompileTime BUG. Unhandled enum value ");
                    sb.append(encode_bitrate_mode.toString());
                    throw new IllegalStateException(sb.toString());
            }
            return this;
        }

        /* renamed from: a */
        private void m142706a(String str, boolean z, boolean z2) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                JSONObject jSONObject2 = jSONObject.getJSONObject("compile");
                this.f116405b.mVideoCompileEncodeSetting = m142705a(jSONObject2);
                if (this.f116405b.mVideoCompileEncodeSetting != null) {
                    this.f116405b.mVideoCompileEncodeSetting.isOptCrf = z;
                    this.f116405b.mVideoCompileEncodeSetting.isCrfRencode = z2;
                }
                JSONObject jSONObject3 = jSONObject.getJSONObject("watermark_compile");
                this.f116405b.mVideoWatermarkCompileEncodeSetting = m142705a(jSONObject3);
                if (this.f116405b.mVideoWatermarkCompileEncodeSetting != null) {
                    this.f116405b.mVideoWatermarkCompileEncodeSetting.isOptCrf = false;
                    this.f116405b.mVideoWatermarkCompileEncodeSetting.isCrfRencode = false;
                }
            } catch (JSONException e) {
                String str2 = VEVideoEncodeSettings.TAG;
                StringBuilder sb = new StringBuilder("external json str parse error : ");
                sb.append(e.getLocalizedMessage());
                C45372t.m143409d(str2, sb.toString());
            }
        }
    }

    public int describeContents() {
        return 0;
    }

    public ENCODE_BITRATE_MODE getBitrateMode() {
        return this.bitrateMode;
    }

    public int getBps() {
        return this.bps;
    }

    public String getComment() {
        return this.mComment;
    }

    public COMPILE_TYPE getCompileType() {
        return this.compileType;
    }

    public String getDescription() {
        return this.mDescription;
    }

    public int getEncodeProfile() {
        return this.encodeProfile;
    }

    public int getFps() {
        return this.fps;
    }

    public int getGopSize() {
        return this.gopSize;
    }

    public int getResizeMode() {
        return this.resizeMode;
    }

    public float getResizeX() {
        return this.resizeX;
    }

    public float getResizeY() {
        return this.resizeY;
    }

    public int getRotate() {
        return this.rotate;
    }

    public float getSpeed() {
        return this.speed;
    }

    public int getSwCRF() {
        return this.swCRF;
    }

    public long getSwMaxRate() {
        return this.swMaxrate;
    }

    public int getSwPreset() {
        return this.swPreset;
    }

    public int getSwQP() {
        return this.swQP;
    }

    public VEVideoCompileEncodeSettings getVideoCompileEncodeSetting() {
        return this.mVideoCompileEncodeSetting;
    }

    public VESize getVideoRes() {
        return this.outputSize;
    }

    public VEVideoCompileEncodeSettings getWatermarkCompileEncodeSetting() {
        return this.mVideoWatermarkCompileEncodeSetting;
    }

    public VEWatermarkParam getWatermarkParam() {
        return this.mWatermarkParam;
    }

    public boolean isCompileSoftInfo() {
        return this.mCompileSoftInfo;
    }

    public boolean isEnableInterLeave() {
        return this.enableInterLeave;
    }

    public boolean isEnableRemuxVideo() {
        return this.enableRemuxVideo;
    }

    public boolean isEnableRemuxVideoForRotation() {
        return this.enableRemuxVideoForRotation;
    }

    public boolean isOptRemuxWithCopy() {
        return this.mOptRemuxWithCopy;
    }

    public boolean isSupportHwEnc() {
        return this.isSupportHWEncoder;
    }

    public int getBitrateValue() {
        switch (this.bitrateMode) {
            case ENCODE_BITRATE_ABR:
                return getBps();
            case ENCODE_BITRATE_CRF:
                return getSwCRF();
            case ENCODE_BITRATE_QP:
                return getSwQP();
            case ENCODE_BITRATE_VBR:
                return getBps();
            default:
                throw new IllegalStateException("CompileTime BUG by SDK. Unhandled ENCODE_BITRATE_MODE enum value.");
        }
    }

    private VEVideoEncodeSettings() {
        this.resizeMode = 2;
        this.speed = 1.0f;
        this.outputSize = new VESize(576, PreloadTask.BYTE_UNIT_NUMBER);
        this.externalSettingsJsonStr = null;
        this.bitrateMode = ENCODE_BITRATE_MODE.ENCODE_BITRATE_ABR;
        this.bps = 4194304;
        this.swCRF = 15;
        this.swQP = 15;
        this.fps = -1;
        this.gopSize = 60;
        this.swPreset = ENCODE_PRESET.ENCODE_LEVEL_ULTRAFAST.ordinal();
        this.encodeStandard = ENCODE_STANDARD.ENCODE_STANDARD_H264.ordinal();
        this.encodeProfile = ENCODE_PROFILE.ENCODE_PROFILE_UNKNOWN.ordinal();
        this.swMaxrate = 15000000;
        this.hasBFrame = false;
        this.outputSize.f116385a = 576;
        this.outputSize.f116386b = PreloadTask.BYTE_UNIT_NUMBER;
        this.fps = -1;
        this.bps = 4194304;
        this.isSupportHWEncoder = true;
        this.compileType = COMPILE_TYPE.COMPILE_TYPE_MP4;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("VEVideoEncodeSettings{compileType=");
        sb.append(this.compileType);
        sb.append(", rotate=");
        sb.append(this.rotate);
        sb.append(", resizeMode=");
        sb.append(this.resizeMode);
        sb.append(", resizeX=");
        sb.append(this.resizeX);
        sb.append(", resizeY=");
        sb.append(this.resizeY);
        sb.append(", speed=");
        sb.append(this.speed);
        sb.append(", outputSize=");
        sb.append(this.outputSize);
        sb.append(", bitrateMode=");
        sb.append(this.bitrateMode);
        sb.append(", bps=");
        sb.append(this.bps);
        sb.append(", swCRF=");
        sb.append(this.swCRF);
        sb.append(", swQP=");
        sb.append(this.swQP);
        sb.append(", fps=");
        sb.append(this.fps);
        sb.append(", gopSize=");
        sb.append(this.gopSize);
        sb.append(", swPreset=");
        sb.append(this.swPreset);
        sb.append(", encodeStandard=");
        sb.append(this.encodeStandard);
        sb.append(", encodeProfile=");
        sb.append(this.encodeProfile);
        sb.append(", swMaxrate=");
        sb.append(this.swMaxrate);
        sb.append(", isSupportHWEncoder=");
        sb.append(this.isSupportHWEncoder);
        sb.append(", enableRemuxVideo=");
        sb.append(this.enableRemuxVideo);
        sb.append(", enableRemuxVideoForRotation=");
        sb.append(this.enableRemuxVideoForRotation);
        sb.append(", enableInterLeave=");
        sb.append(this.enableInterLeave);
        sb.append(", hasBFrame=");
        sb.append(this.hasBFrame);
        sb.append(", mWatermarkParam=");
        sb.append(this.mWatermarkParam);
        sb.append(", mVideoWatermarkCompileEncodeSetting=");
        sb.append(this.mVideoWatermarkCompileEncodeSetting);
        sb.append(", mVideoCompileEncodeSetting=");
        sb.append(this.mVideoCompileEncodeSetting);
        sb.append(", mOptRemuxWithCopy=");
        sb.append(this.mOptRemuxWithCopy);
        sb.append(", mDescripiton=");
        sb.append(this.mDescription);
        sb.append(", mComment=");
        sb.append(this.mComment);
        sb.append('}');
        return sb.toString();
    }

    public void setCompileType(COMPILE_TYPE compile_type) {
        this.compileType = compile_type;
    }

    public void setEnableInterLeave(boolean z) {
        this.enableInterLeave = z;
    }

    public void setEnableRemuxVideo(boolean z) {
        this.enableRemuxVideo = z;
    }

    public void setFps(int i) {
        this.fps = i;
    }

    public void setGopSize(int i) {
        this.gopSize = i;
    }

    public void setResizeMode(int i) {
        this.resizeMode = i;
    }

    public void setResizeX(float f) {
        this.resizeX = f;
    }

    public void setResizeY(float f) {
        this.resizeY = f;
    }

    public void setRotate(int i) {
        this.rotate = i;
    }

    public void setSpeed(float f) {
        this.speed = f;
    }

    public void setSupportHwEnc(boolean z) {
        this.isSupportHWEncoder = z;
    }

    public void setBps(int i) {
        this.bitrateMode = ENCODE_BITRATE_MODE.ENCODE_BITRATE_VBR;
        this.bps = i;
    }

    public void setEncodeProfile(ENCODE_PROFILE encode_profile) {
        this.encodeProfile = encode_profile.ordinal();
    }

    public void setQP(int i) {
        this.bitrateMode = ENCODE_BITRATE_MODE.ENCODE_BITRATE_QP;
        this.swQP = i;
    }

    public void setSWCRF(int i) {
        this.bitrateMode = ENCODE_BITRATE_MODE.ENCODE_BITRATE_CRF;
        this.swCRF = i;
    }

    public void setSwPreset(ENCODE_PRESET encode_preset) {
        this.swPreset = encode_preset.ordinal();
    }

    public boolean setWatermark(VEWatermarkParam vEWatermarkParam) {
        if (vEWatermarkParam == null) {
            this.mWatermarkParam = null;
        } else if (vEWatermarkParam.images == null) {
            return false;
        } else {
            this.mWatermarkParam = vEWatermarkParam;
        }
        return true;
    }

    protected VEVideoEncodeSettings(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        this.resizeMode = 2;
        this.speed = 1.0f;
        this.outputSize = new VESize(576, PreloadTask.BYTE_UNIT_NUMBER);
        this.externalSettingsJsonStr = null;
        this.bitrateMode = ENCODE_BITRATE_MODE.ENCODE_BITRATE_ABR;
        this.bps = 4194304;
        this.swCRF = 15;
        this.swQP = 15;
        this.fps = -1;
        this.gopSize = 60;
        this.swPreset = ENCODE_PRESET.ENCODE_LEVEL_ULTRAFAST.ordinal();
        this.encodeStandard = ENCODE_STANDARD.ENCODE_STANDARD_H264.ordinal();
        this.encodeProfile = ENCODE_PROFILE.ENCODE_PROFILE_UNKNOWN.ordinal();
        this.swMaxrate = 15000000;
        boolean z7 = false;
        this.hasBFrame = false;
        this.compileType = (COMPILE_TYPE) parcel.readParcelable(COMPILE_TYPE.class.getClassLoader());
        this.rotate = parcel.readInt();
        this.resizeMode = parcel.readInt();
        this.resizeX = parcel.readFloat();
        this.resizeY = parcel.readFloat();
        this.speed = parcel.readFloat();
        this.outputSize = (VESize) parcel.readParcelable(VESize.class.getClassLoader());
        this.bitrateMode = (ENCODE_BITRATE_MODE) parcel.readParcelable(ENCODE_BITRATE_MODE.class.getClassLoader());
        this.bps = parcel.readInt();
        this.fps = parcel.readInt();
        this.swCRF = parcel.readInt();
        this.swQP = parcel.readInt();
        this.gopSize = parcel.readInt();
        this.swPreset = parcel.readInt();
        this.encodeStandard = parcel.readInt();
        this.encodeProfile = parcel.readInt();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.isSupportHWEncoder = z;
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.enableRemuxVideo = z2;
        if (parcel.readByte() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.enableRemuxVideoForRotation = z3;
        if (parcel.readByte() != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.enableInterLeave = z4;
        if (parcel.readByte() != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        this.hasBFrame = z5;
        this.swMaxrate = parcel.readLong();
        this.mWatermarkParam = (VEWatermarkParam) parcel.readParcelable(VEWatermarkParam.class.getClassLoader());
        this.mVideoWatermarkCompileEncodeSetting = (VEVideoCompileEncodeSettings) parcel.readParcelable(VEVideoCompileEncodeSettings.class.getClassLoader());
        this.mVideoCompileEncodeSetting = (VEVideoCompileEncodeSettings) parcel.readParcelable(VEVideoCompileEncodeSettings.class.getClassLoader());
        this.externalSettingsJsonStr = parcel.readString();
        if (parcel.readByte() != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        this.mOptRemuxWithCopy = z6;
        this.mDescription = parcel.readString();
        this.mComment = parcel.readString();
        if (parcel.readByte() != 0) {
            z7 = true;
        }
        this.mCompileSoftInfo = z7;
    }

    public void setEnableRemuxVideo(boolean z, boolean z2) {
        this.enableRemuxVideo = z;
        this.enableRemuxVideoForRotation = z2;
    }

    public void setVideoRes(int i, int i2) {
        this.outputSize.f116385a = i;
        this.outputSize.f116386b = i2;
    }

    public void setVideoBitrate(ENCODE_BITRATE_MODE encode_bitrate_mode, int i) {
        this.bitrateMode = encode_bitrate_mode;
        switch (this.bitrateMode) {
            case ENCODE_BITRATE_ABR:
                this.bps = i;
                return;
            case ENCODE_BITRATE_CRF:
                this.swCRF = i;
                return;
            case ENCODE_BITRATE_QP:
                this.swQP = i;
                return;
            case ENCODE_BITRATE_VBR:
                this.bps = i;
                return;
            default:
                throw new IllegalStateException("CompileTime BUG by sdk. Unhandled bitrateMode");
        }
    }

    public VEVideoEncodeSettings(VESize vESize, boolean z) {
        this.resizeMode = 2;
        this.speed = 1.0f;
        this.outputSize = new VESize(576, PreloadTask.BYTE_UNIT_NUMBER);
        this.externalSettingsJsonStr = null;
        this.bitrateMode = ENCODE_BITRATE_MODE.ENCODE_BITRATE_ABR;
        this.bps = 4194304;
        this.swCRF = 15;
        this.swQP = 15;
        this.fps = -1;
        this.gopSize = 60;
        this.swPreset = ENCODE_PRESET.ENCODE_LEVEL_ULTRAFAST.ordinal();
        this.encodeStandard = ENCODE_STANDARD.ENCODE_STANDARD_H264.ordinal();
        this.encodeProfile = ENCODE_PROFILE.ENCODE_PROFILE_UNKNOWN.ordinal();
        this.swMaxrate = 15000000;
        this.hasBFrame = false;
        this.outputSize = vESize;
        this.isSupportHWEncoder = z;
        this.compileType = COMPILE_TYPE.COMPILE_TYPE_MP4;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.compileType, i);
        parcel.writeInt(this.rotate);
        parcel.writeInt(this.resizeMode);
        parcel.writeFloat(this.resizeX);
        parcel.writeFloat(this.resizeY);
        parcel.writeFloat(this.speed);
        parcel.writeParcelable(this.outputSize, i);
        parcel.writeParcelable(this.bitrateMode, i);
        parcel.writeInt(this.bps);
        parcel.writeInt(this.fps);
        parcel.writeInt(this.swCRF);
        parcel.writeInt(this.swQP);
        parcel.writeInt(this.gopSize);
        parcel.writeInt(this.swPreset);
        parcel.writeInt(this.encodeStandard);
        parcel.writeInt(this.encodeProfile);
        parcel.writeByte(this.isSupportHWEncoder ? (byte) 1 : 0);
        parcel.writeByte(this.enableRemuxVideo ? (byte) 1 : 0);
        parcel.writeByte(this.enableRemuxVideoForRotation ? (byte) 1 : 0);
        parcel.writeByte(this.enableInterLeave ? (byte) 1 : 0);
        parcel.writeByte(this.hasBFrame ? (byte) 1 : 0);
        parcel.writeLong(this.swMaxrate);
        parcel.writeParcelable(this.mWatermarkParam, i);
        parcel.writeParcelable(this.mVideoWatermarkCompileEncodeSetting, i);
        parcel.writeParcelable(this.mVideoCompileEncodeSetting, i);
        parcel.writeString(this.externalSettingsJsonStr);
        parcel.writeByte(this.mOptRemuxWithCopy ? (byte) 1 : 0);
        parcel.writeString(this.mDescription);
        parcel.writeString(this.mComment);
        parcel.writeByte(this.mCompileSoftInfo ? (byte) 1 : 0);
    }

    public VEVideoEncodeSettings(VESize vESize, boolean z, int i, int i2) {
        this.resizeMode = 2;
        this.speed = 1.0f;
        this.outputSize = new VESize(576, PreloadTask.BYTE_UNIT_NUMBER);
        this.externalSettingsJsonStr = null;
        this.bitrateMode = ENCODE_BITRATE_MODE.ENCODE_BITRATE_ABR;
        this.bps = 4194304;
        this.swCRF = 15;
        this.swQP = 15;
        this.fps = -1;
        this.gopSize = 60;
        this.swPreset = ENCODE_PRESET.ENCODE_LEVEL_ULTRAFAST.ordinal();
        this.encodeStandard = ENCODE_STANDARD.ENCODE_STANDARD_H264.ordinal();
        this.encodeProfile = ENCODE_PROFILE.ENCODE_PROFILE_UNKNOWN.ordinal();
        this.swMaxrate = 15000000;
        this.hasBFrame = false;
        this.outputSize = vESize;
        this.isSupportHWEncoder = z;
        this.fps = i;
        this.gopSize = i2;
        this.compileType = COMPILE_TYPE.COMPILE_TYPE_MP4;
    }

    public VEVideoEncodeSettings(VESize vESize, boolean z, int i, int i2, int i3, int i4, boolean z2) {
        this.resizeMode = 2;
        this.speed = 1.0f;
        this.outputSize = new VESize(576, PreloadTask.BYTE_UNIT_NUMBER);
        this.externalSettingsJsonStr = null;
        this.bitrateMode = ENCODE_BITRATE_MODE.ENCODE_BITRATE_ABR;
        this.bps = 4194304;
        this.swCRF = 15;
        this.swQP = 15;
        this.fps = -1;
        this.gopSize = 60;
        this.swPreset = ENCODE_PRESET.ENCODE_LEVEL_ULTRAFAST.ordinal();
        this.encodeStandard = ENCODE_STANDARD.ENCODE_STANDARD_H264.ordinal();
        this.encodeProfile = ENCODE_PROFILE.ENCODE_PROFILE_UNKNOWN.ordinal();
        this.swMaxrate = 15000000;
        this.hasBFrame = false;
        this.outputSize = vESize;
        this.isSupportHWEncoder = z;
        this.fps = i;
        this.gopSize = i2;
        this.bps = i3;
        this.swPreset = i4;
        this.hasBFrame = z2;
        this.compileType = COMPILE_TYPE.COMPILE_TYPE_MP4;
    }
}

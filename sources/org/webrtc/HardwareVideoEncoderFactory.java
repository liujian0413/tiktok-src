package org.webrtc;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.os.Build.VERSION;
import com.p280ss.android.ugc.aweme.services.IAVService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.webrtc.EglBase14.Context;

public class HardwareVideoEncoderFactory implements VideoEncoderFactory {
    private static final List<String> H264_HW_EXCEPTION_MODELS = Arrays.asList(new String[]{"SAMSUNG-SGH-I337", "Nexus 7", "Nexus 4"});
    private final Predicate<MediaCodecInfo> codecAllowedPredicate;
    private final boolean enableH264HighProfile;
    private final boolean enableIntelVp8Encoder;
    private final Context sharedContext;

    public VideoCodecInfo[] getSupportedCodecs() {
        if (VERSION.SDK_INT < 19) {
            return new VideoCodecInfo[0];
        }
        ArrayList arrayList = new ArrayList();
        VideoCodecType[] videoCodecTypeArr = {VideoCodecType.VP8, VideoCodecType.VP9, VideoCodecType.H264};
        for (int i = 0; i < 3; i++) {
            VideoCodecType videoCodecType = videoCodecTypeArr[i];
            MediaCodecInfo findCodecForType = findCodecForType(videoCodecType);
            if (findCodecForType != null) {
                String name = videoCodecType.name();
                if (videoCodecType == VideoCodecType.H264 && isH264HighProfileSupported(findCodecForType)) {
                    arrayList.add(new VideoCodecInfo(name, MediaCodecUtils.getCodecProperties(videoCodecType, true)));
                }
                arrayList.add(new VideoCodecInfo(name, MediaCodecUtils.getCodecProperties(videoCodecType, false)));
            }
        }
        return (VideoCodecInfo[]) arrayList.toArray(new VideoCodecInfo[arrayList.size()]);
    }

    private boolean isH264HighProfileSupported(MediaCodecInfo mediaCodecInfo) {
        if (!this.enableH264HighProfile || VERSION.SDK_INT <= 23) {
            return false;
        }
        return true;
    }

    private boolean isMediaCodecAllowed(MediaCodecInfo mediaCodecInfo) {
        if (this.codecAllowedPredicate == null) {
            return true;
        }
        return this.codecAllowedPredicate.test(mediaCodecInfo);
    }

    private boolean isHardwareSupportedInCurrentSdkVp9(MediaCodecInfo mediaCodecInfo) {
        String name = mediaCodecInfo.getName();
        if ((name.startsWith("OMX.qcom.") || name.startsWith("OMX.Exynos.")) && VERSION.SDK_INT >= 24) {
            return true;
        }
        return false;
    }

    private MediaCodecInfo findCodecForType(VideoCodecType videoCodecType) {
        MediaCodecInfo mediaCodecInfo;
        for (int i = 0; i < MediaCodecList.getCodecCount(); i++) {
            try {
                mediaCodecInfo = MediaCodecList.getCodecInfoAt(i);
            } catch (IllegalArgumentException e) {
                Logging.m150049e("HardwareVideoEncoderFactory", "Cannot retrieve encoder codec info", e);
                mediaCodecInfo = null;
            }
            if (mediaCodecInfo != null && mediaCodecInfo.isEncoder() && isSupportedCodec(mediaCodecInfo, videoCodecType)) {
                return mediaCodecInfo;
            }
        }
        return null;
    }

    private int getKeyFrameIntervalSec(VideoCodecType videoCodecType) {
        switch (videoCodecType) {
            case VP8:
            case VP9:
                return 100;
            case H264:
                return 20;
            case H265:
                return 20;
            default:
                StringBuilder sb = new StringBuilder("Unsupported VideoCodecType ");
                sb.append(videoCodecType);
                throw new IllegalArgumentException(sb.toString());
        }
    }

    private boolean isHardwareSupportedInCurrentSdkH264(MediaCodecInfo mediaCodecInfo) {
        if (H264_HW_EXCEPTION_MODELS.contains(Build.MODEL)) {
            return false;
        }
        String name = mediaCodecInfo.getName();
        if (name.startsWith("OMX.qcom.")) {
            if (VERSION.SDK_INT >= 19) {
                return true;
            }
            return false;
        } else if (name.startsWith("OMX.Exynos.")) {
            if (VERSION.SDK_INT >= 21) {
                return true;
            }
            return false;
        } else if (VERSION.SDK_INT >= 21) {
            return true;
        } else {
            return false;
        }
    }

    private boolean isHardwareSupportedInCurrentSdkH265(MediaCodecInfo mediaCodecInfo) {
        String name = mediaCodecInfo.getName();
        if ((!name.startsWith("OMX.qcom.") || VERSION.SDK_INT < 19) && (!name.startsWith("OMX.Exynos.") || VERSION.SDK_INT < 21)) {
            return false;
        }
        return true;
    }

    private boolean isHardwareSupportedInCurrentSdkVp8(MediaCodecInfo mediaCodecInfo) {
        String name = mediaCodecInfo.getName();
        if ((!name.startsWith("OMX.qcom.") || VERSION.SDK_INT < 19) && ((!name.startsWith("OMX.Exynos.") || VERSION.SDK_INT < 23) && (!name.startsWith("OMX.Intel.") || VERSION.SDK_INT < 21 || !this.enableIntelVp8Encoder))) {
            return false;
        }
        return true;
    }

    public VideoEncoder createEncoder(VideoCodecInfo videoCodecInfo) {
        if (VERSION.SDK_INT < 19) {
            return null;
        }
        VideoCodecType valueOf = VideoCodecType.valueOf(videoCodecInfo.name);
        MediaCodecInfo findCodecForType = findCodecForType(valueOf);
        if (findCodecForType == null) {
            return null;
        }
        String name = findCodecForType.getName();
        String mimeType = valueOf.mimeType();
        Integer selectColorFormat = MediaCodecUtils.selectColorFormat(MediaCodecUtils.TEXTURE_COLOR_FORMATS, findCodecForType.getCapabilitiesForType(mimeType));
        Integer selectColorFormat2 = MediaCodecUtils.selectColorFormat(MediaCodecUtils.ENCODER_COLOR_FORMATS, findCodecForType.getCapabilitiesForType(mimeType));
        if (valueOf == VideoCodecType.H264) {
            boolean isSameH264Profile = H264Utils.isSameH264Profile(videoCodecInfo.params, MediaCodecUtils.getCodecProperties(valueOf, true));
            boolean isSameH264Profile2 = H264Utils.isSameH264Profile(videoCodecInfo.params, MediaCodecUtils.getCodecProperties(valueOf, false));
            if (!isSameH264Profile && !isSameH264Profile2) {
                return null;
            }
            if (isSameH264Profile && !isH264HighProfileSupported(findCodecForType)) {
                return null;
            }
        }
        HardwareVideoEncoder hardwareVideoEncoder = new HardwareVideoEncoder(new MediaCodecWrapperFactoryImpl(), name, valueOf, selectColorFormat, selectColorFormat2, videoCodecInfo.params, getKeyFrameIntervalSec(valueOf), getForcedKeyFrameIntervalMs(valueOf, name), createBitrateAdjuster(valueOf, name), this.sharedContext);
        return hardwareVideoEncoder;
    }

    public HardwareVideoEncoderFactory(boolean z, boolean z2) {
        this(null, z, z2);
    }

    private BitrateAdjuster createBitrateAdjuster(VideoCodecType videoCodecType, String str) {
        if (!str.startsWith("OMX.Exynos.")) {
            return new BaseBitrateAdjuster();
        }
        if (videoCodecType == VideoCodecType.VP8) {
            return new DynamicBitrateAdjuster();
        }
        return new FramerateBitrateAdjuster();
    }

    private int getForcedKeyFrameIntervalMs(VideoCodecType videoCodecType, String str) {
        if (videoCodecType == VideoCodecType.VP8 && str.startsWith("OMX.qcom.")) {
            if (VERSION.SDK_INT == 21 || VERSION.SDK_INT == 22) {
                return IAVService.MUSIC_LENGTH_FOR_COPYRIGHT;
            }
            if (VERSION.SDK_INT == 23) {
                return 20000;
            }
            if (VERSION.SDK_INT > 23) {
                return IAVService.MUSIC_LENGTH_FOR_COPYRIGHT;
            }
        }
        return 0;
    }

    private boolean isHardwareSupportedInCurrentSdk(MediaCodecInfo mediaCodecInfo, VideoCodecType videoCodecType) {
        switch (videoCodecType) {
            case VP8:
                return isHardwareSupportedInCurrentSdkVp8(mediaCodecInfo);
            case VP9:
                return isHardwareSupportedInCurrentSdkVp9(mediaCodecInfo);
            case H264:
                return isHardwareSupportedInCurrentSdkH264(mediaCodecInfo);
            case H265:
                return isHardwareSupportedInCurrentSdkH265(mediaCodecInfo);
            default:
                return false;
        }
    }

    private boolean isSupportedCodec(MediaCodecInfo mediaCodecInfo, VideoCodecType videoCodecType) {
        if (!MediaCodecUtils.codecSupportsType(mediaCodecInfo, videoCodecType)) {
            return false;
        }
        try {
            if (MediaCodecUtils.selectColorFormat(MediaCodecUtils.ENCODER_COLOR_FORMATS, mediaCodecInfo.getCapabilitiesForType(videoCodecType.mimeType())) != null && isHardwareSupportedInCurrentSdk(mediaCodecInfo, videoCodecType) && isMediaCodecAllowed(mediaCodecInfo)) {
                return true;
            }
            return false;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public HardwareVideoEncoderFactory(EglBase.Context context, boolean z, boolean z2) {
        this(context, z, z2, null);
    }

    public HardwareVideoEncoderFactory(EglBase.Context context, boolean z, boolean z2, Predicate<MediaCodecInfo> predicate) {
        if (context instanceof Context) {
            this.sharedContext = (Context) context;
        } else {
            Logging.m150051w("HardwareVideoEncoderFactory", "No shared EglBase.Context.  Encoders will not use texture mode.");
            this.sharedContext = null;
        }
        this.enableIntelVp8Encoder = z;
        this.enableH264HighProfile = z2;
        this.codecAllowedPredicate = predicate;
    }
}

package org.webrtc;

import android.media.MediaCodecInfo;
import java.util.Arrays;
import org.webrtc.EglBase.Context;

public class HardwareVideoDecoderFactory extends MediaCodecVideoDecoderFactory {
    private static final Predicate<MediaCodecInfo> defaultAllowedPredicate = new Predicate<MediaCodecInfo>() {
        private String[] prefixBlacklist;

        public Predicate and(Predicate predicate) {
            return Predicate$$CC.and(this, predicate);
        }

        public Predicate negate() {
            return Predicate$$CC.negate(this);
        }

        /* renamed from: or */
        public Predicate mo122514or(Predicate predicate) {
            return Predicate$$CC.m150059or(this, predicate);
        }

        {
            String[] strArr = MediaCodecUtils.SOFTWARE_IMPLEMENTATION_PREFIXES;
            this.prefixBlacklist = (String[]) Arrays.copyOf(strArr, strArr.length);
        }

        public boolean test(MediaCodecInfo mediaCodecInfo) {
            String name = mediaCodecInfo.getName();
            for (String startsWith : this.prefixBlacklist) {
                if (name.startsWith(startsWith)) {
                    return false;
                }
            }
            return true;
        }
    };

    public HardwareVideoDecoderFactory() {
        this(null);
    }

    public /* bridge */ /* synthetic */ VideoCodecInfo[] getSupportedCodecs() {
        return super.getSupportedCodecs();
    }

    public /* bridge */ /* synthetic */ VideoDecoder createDecoder(VideoCodecInfo videoCodecInfo) {
        return super.createDecoder(videoCodecInfo);
    }

    public HardwareVideoDecoderFactory(Context context) {
        this(context, null);
    }

    public HardwareVideoDecoderFactory(Context context, Predicate<MediaCodecInfo> predicate) {
        Predicate<MediaCodecInfo> predicate2;
        if (predicate == null) {
            predicate2 = defaultAllowedPredicate;
        } else {
            predicate2 = predicate.and(defaultAllowedPredicate);
        }
        super(context, predicate2);
    }
}

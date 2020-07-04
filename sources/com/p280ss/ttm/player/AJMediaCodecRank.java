package com.p280ss.ttm.player;

import android.media.MediaCodecInfo;
import android.text.TextUtils;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: com.ss.ttm.player.AJMediaCodecRank */
public class AJMediaCodecRank {
    private static Map<String, Integer> mTestHWCodecs;
    public String mCodecType;
    public MediaCodecInfo mMediaCodecInfo;
    public int mRank;

    private static Map<String, Integer> getTestHWcodecs() {
        if (mTestHWCodecs != null) {
            return mTestHWCodecs;
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        mTestHWCodecs = treeMap;
        treeMap.put("OMX.qcom.video.decoder.avc", Integer.valueOf(100));
        mTestHWCodecs.put("OMX.qcom.video.decoder.hevc", Integer.valueOf(100));
        mTestHWCodecs.put("OMX.qcom.video.decoder.hevcswvdec", Integer.valueOf(20));
        mTestHWCodecs.put("OMX.MTK.VIDEO.DECODER.HEVC", Integer.valueOf(100));
        mTestHWCodecs.put("OMX.MTK.VIDEO.DECODER.AVC", Integer.valueOf(100));
        mTestHWCodecs.put("OMX.Nvidia.h264.decode", Integer.valueOf(100));
        mTestHWCodecs.put("OMX.Intel.hw_vd.h264", Integer.valueOf(100));
        mTestHWCodecs.put("OMX.Intel.VideoDecoder.AVC", Integer.valueOf(99));
        mTestHWCodecs.put("OMX.SEC.avc.dec", Integer.valueOf(100));
        mTestHWCodecs.put("OMX.SEC.AVC.Decoder", Integer.valueOf(99));
        mTestHWCodecs.put("OMX.SEC.avcdec", Integer.valueOf(98));
        mTestHWCodecs.put("OMX.SEC.avc.sw.dec", Integer.valueOf(20));
        mTestHWCodecs.put("OMX.SEC.hevc.sw.dec", Integer.valueOf(20));
        mTestHWCodecs.put("OMX.Exynos.avc.dec", Integer.valueOf(100));
        mTestHWCodecs.put("OMX.Exynos.AVC.Decoder", Integer.valueOf(99));
        mTestHWCodecs.put("OMX.TI.DUCATI1.VIDEO.DECODER", Integer.valueOf(100));
        mTestHWCodecs.put("OMX.rk.video_decoder.avc", Integer.valueOf(100));
        mTestHWCodecs.put("OMX.amlogic.avc.decoder.awesome", Integer.valueOf(100));
        mTestHWCodecs.put("OMX.MARVELL.VIDEO.HW.CODA7542DECODER", Integer.valueOf(100));
        mTestHWCodecs.put("OMX.brcm.video.h264.hw.decoder", Integer.valueOf(40));
        mTestHWCodecs.put("OMX.k3.video.decoder.avc", Integer.valueOf(40));
        mTestHWCodecs.put("OMX.IMG.MSVDX.Decoder.AVC", Integer.valueOf(100));
        mTestHWCodecs.put("OMX.hisi.video.decoder.avc", Integer.valueOf(100));
        mTestHWCodecs.put("OMX.hisi.video.decoder.hevc", Integer.valueOf(100));
        mTestHWCodecs.put("OMX.MARVELL.VIDEO.H264DECODER", Integer.valueOf(20));
        mTestHWCodecs.put("OMX.sprd.soft.h264.decoder", Integer.valueOf(20));
        return mTestHWCodecs;
    }

    public static AJMediaCodecRank setupRank(MediaCodecInfo mediaCodecInfo, String str) {
        if (mediaCodecInfo == null) {
            return null;
        }
        String name = mediaCodecInfo.getName();
        if (TextUtils.isEmpty(name)) {
            return null;
        }
        Integer num = (Integer) getTestHWcodecs().get(name);
        int i = 60;
        if (num != null) {
            i = num.intValue();
        } else {
            try {
                if (mediaCodecInfo.getCapabilitiesForType(str) != null) {
                    i = 70;
                }
            } catch (Exception unused) {
            }
        }
        AJMediaCodecRank aJMediaCodecRank = new AJMediaCodecRank();
        aJMediaCodecRank.mMediaCodecInfo = mediaCodecInfo;
        aJMediaCodecRank.mCodecType = str;
        aJMediaCodecRank.mRank = i;
        return aJMediaCodecRank;
    }
}

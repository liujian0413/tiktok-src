package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecInfo.CodecCapabilities;
import android.media.MediaCodecInfo.CodecProfileLevel;
import android.media.MediaCodecInfo.VideoCapabilities;
import android.media.MediaCodecList;
import android.os.Build.VERSION;
import android.util.Range;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@C6505uv
public final class aez {

    /* renamed from: a */
    private static Map<String, List<Map<String, Object>>> f40126a = new HashMap();

    /* renamed from: b */
    private static List<MediaCodecInfo> f40127b;

    /* renamed from: c */
    private static final Object f40128c = new Object();

    /* renamed from: a */
    public static List<Map<String, Object>> m45711a(String str) {
        CodecProfileLevel[] codecProfileLevelArr;
        synchronized (f40128c) {
            if (f40126a.containsKey(str)) {
                List<Map<String, Object>> list = (List) f40126a.get(str);
                return list;
            }
            try {
                synchronized (f40128c) {
                    if (f40127b == null) {
                        if (VERSION.SDK_INT >= 21) {
                            f40127b = Arrays.asList(new MediaCodecList(0).getCodecInfos());
                        } else if (VERSION.SDK_INT >= 16) {
                            int codecCount = MediaCodecList.getCodecCount();
                            f40127b = new ArrayList(codecCount);
                            for (int i = 0; i < codecCount; i++) {
                                f40127b.add(MediaCodecList.getCodecInfoAt(i));
                            }
                        } else {
                            f40127b = Collections.emptyList();
                        }
                    }
                }
                ArrayList arrayList = new ArrayList();
                for (MediaCodecInfo mediaCodecInfo : f40127b) {
                    if (!mediaCodecInfo.isEncoder() && Arrays.asList(mediaCodecInfo.getSupportedTypes()).contains(str)) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("codecName", mediaCodecInfo.getName());
                        CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
                        ArrayList arrayList2 = new ArrayList();
                        for (CodecProfileLevel codecProfileLevel : capabilitiesForType.profileLevels) {
                            arrayList2.add(new Integer[]{Integer.valueOf(codecProfileLevel.profile), Integer.valueOf(codecProfileLevel.level)});
                        }
                        hashMap.put("profileLevels", arrayList2);
                        if (VERSION.SDK_INT >= 21) {
                            VideoCapabilities videoCapabilities = capabilitiesForType.getVideoCapabilities();
                            hashMap.put("bitRatesBps", m45712a(videoCapabilities.getBitrateRange()));
                            hashMap.put("widthAlignment", Integer.valueOf(videoCapabilities.getWidthAlignment()));
                            hashMap.put("heightAlignment", Integer.valueOf(videoCapabilities.getHeightAlignment()));
                            hashMap.put("frameRates", m45712a(videoCapabilities.getSupportedFrameRates()));
                            hashMap.put("widths", m45712a(videoCapabilities.getSupportedWidths()));
                            hashMap.put("heights", m45712a(videoCapabilities.getSupportedHeights()));
                        }
                        if (VERSION.SDK_INT >= 23) {
                            hashMap.put("instancesLimit", Integer.valueOf(capabilitiesForType.getMaxSupportedInstances()));
                        }
                        arrayList.add(hashMap);
                    }
                }
                f40126a.put(str, arrayList);
                return arrayList;
            } catch (LinkageError | RuntimeException e) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("error", e.getClass().getSimpleName());
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(hashMap2);
                f40126a.put(str, arrayList3);
                return arrayList3;
            }
        }
    }

    /* renamed from: a */
    private static Integer[] m45712a(Range<Integer> range) {
        return new Integer[]{(Integer) range.getLower(), (Integer) range.getUpper()};
    }
}

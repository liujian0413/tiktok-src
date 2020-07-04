package com.p280ss.android.vesdk;

/* renamed from: com.ss.android.vesdk.VEAlgorithmUtils */
public final class VEAlgorithmUtils {

    /* renamed from: a */
    public static long f116073a = 2097152;

    /* renamed from: b */
    public static long f116074b = 127;

    /* renamed from: c */
    public static long f116075c = 262144;

    /* renamed from: d */
    public static long f116076d = 524288;

    /* renamed from: e */
    public static long f116077e = 1;

    /* renamed from: f */
    public static long f116078f = 2;

    /* renamed from: g */
    public static int f116079g = 1;

    /* renamed from: h */
    private static String f116080h = "VEAlgorithmUtils";

    /* renamed from: com.ss.android.vesdk.VEAlgorithmUtils$AfterEffectParamType */
    public enum AfterEffectParamType {
        AfterEffectSummaryMode,
        AfterEffectSampleMaxNum,
        AfterEffectSampleFPS,
        AfterEffectSampleMaxCover,
        AfterEffectUseFaceAttr
    }

    /* renamed from: com.ss.android.vesdk.VEAlgorithmUtils$C1ParamType */
    public enum C1ParamType {
        USE_VIDEO_MODE(1),
        USE_MultiLabels(2);
        
        private int value;

        public final int value() {
            return this.value;
        }

        private C1ParamType(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.android.vesdk.VEAlgorithmUtils$FaceClustingParamType */
    public enum FaceClustingParamType {
        RecognitionfThreshold(1),
        FeatureDim(2),
        ClustingThreshold(3),
        LinkageType(4),
        DistanceType(5),
        HP1(6),
        HP2(7),
        HP3(8),
        HP4(9),
        ClustingThreshold2(10),
        BatchSize(11),
        MaxMergeRound(12);
        
        private int value;

        public final int value() {
            return this.value;
        }

        private FaceClustingParamType(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.android.vesdk.VEAlgorithmUtils$FaceParamType */
    public enum FaceParamType {
        FACE_DETECT_INTERVAL(1),
        MAX_FACE_NUM(2),
        MIN_DETECT_LEVEL(3),
        BASE_SMOOTH_LEVEL(4),
        EXTRA_SMOOTH_LEVEL(5),
        MASK_SMOOTH_TYPE(6);
        
        private int value;

        public final int value() {
            return this.value;
        }

        private FaceParamType(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.android.vesdk.VEAlgorithmUtils$SimilarityParamType */
    public enum SimilarityParamType {
        THRES
    }
}

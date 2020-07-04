package com.p280ss.android.medialib.config;

import com.p280ss.android.ttve.nativePort.TENativeLibsLoader;

/* renamed from: com.ss.android.medialib.config.GPUModelDetector */
public class GPUModelDetector {

    /* renamed from: a */
    private static final GPUModelDetector f53454a = new GPUModelDetector();

    /* renamed from: com.ss.android.medialib.config.GPUModelDetector$ENvGpuModel */
    public enum ENvGpuModel {
        Unknown,
        Adreno,
        Mali,
        PowerVR,
        Intel,
        NVIDIA,
        Vivante,
        VideoCore
    }

    /* renamed from: com.ss.android.medialib.config.GPUModelDetector$ENvGpuSubModel */
    public enum ENvGpuSubModel {
        Unknown,
        Adreno,
        Mali,
        Mali_MP,
        Mali_T,
        PowerVR_SGX,
        PowerVR_SGX_MP,
        PowerVR_SGX_MP2,
        PowerVR_Rogue_Han,
        PowerVR_Rogue_Hood,
        PowerVR_Rogue_Marlowe,
        PowerVR_Rogue_G,
        Intel_HD_Graphics,
        NVIDIA_Tegra,
        NVIDIA_Tegra_X1,
        NVIDIA_AP,
        Vivante_GC,
        VideoCore_IV_HW
    }

    private GPUModelDetector() {
    }

    public static native String nativeGetGLVersion();

    public static native String nativeGetGPURenderer();

    static {
        TENativeLibsLoader.m67988e();
    }
}

package com.p280ss.android.ttve.monitor;

import com.p280ss.android.ttve.nativePort.TEGPUInfoReader;
import java.util.regex.Pattern;

/* renamed from: com.ss.android.ttve.monitor.GPUModelDetector */
public final class GPUModelDetector {

    /* renamed from: a */
    private static final GPUModelDetector f55301a = new GPUModelDetector();

    /* renamed from: b */
    private ENvGpuModel f55302b;

    /* renamed from: c */
    private ENvGpuSubModel f55303c;

    /* renamed from: d */
    private int f55304d;

    /* renamed from: com.ss.android.ttve.monitor.GPUModelDetector$ENvGpuModel */
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

    /* renamed from: com.ss.android.ttve.monitor.GPUModelDetector$ENvGpuSubModel */
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

    /* renamed from: com.ss.android.ttve.monitor.GPUModelDetector$a */
    public class C20468a {

        /* renamed from: a */
        public ENvGpuModel f55305a;

        /* renamed from: b */
        public ENvGpuSubModel f55306b;

        /* renamed from: c */
        public int f55307c;

        public C20468a(ENvGpuModel eNvGpuModel, ENvGpuSubModel eNvGpuSubModel, int i) {
            this.f55305a = eNvGpuModel;
            this.f55306b = eNvGpuSubModel;
            this.f55307c = i;
        }
    }

    private GPUModelDetector() {
    }

    /* renamed from: a */
    public static GPUModelDetector m67889a() {
        return f55301a;
    }

    /* renamed from: c */
    public static String m67893c() {
        return TEGPUInfoReader.nativeGetGLVersion();
    }

    /* renamed from: b */
    public final C20468a mo55136b() {
        return m67888a(TEGPUInfoReader.nativeGetGPURenderer());
    }

    /* renamed from: d */
    private static int m67896d(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    /* renamed from: f */
    private void m67899f(String[] strArr) {
        if (strArr.length >= 2) {
            this.f55303c = ENvGpuSubModel.Vivante_GC;
            this.f55304d = m67896d(m67894c(strArr[0]));
        }
    }

    /* renamed from: h */
    private void m67901h(String[] strArr) {
        if (strArr.length >= 3 && strArr[1].equalsIgnoreCase("IV") && strArr[2].equalsIgnoreCase("HW")) {
            this.f55303c = ENvGpuSubModel.VideoCore_IV_HW;
        }
    }

    /* renamed from: a */
    private void m67890a(String[] strArr) {
        int length = strArr.length;
        if (length >= 2) {
            if (strArr[1].equalsIgnoreCase("(TM)")) {
                if (length == 3 && m67892b(strArr[2])) {
                    this.f55303c = ENvGpuSubModel.Adreno;
                    this.f55304d = m67896d(strArr[2]);
                }
            } else if (m67892b(strArr[1])) {
                this.f55303c = ENvGpuSubModel.Adreno;
                this.f55304d = m67896d(strArr[1]);
            }
        }
    }

    /* renamed from: b */
    private static boolean m67892b(String str) {
        if (Pattern.compile("-?[0-9]+.?[0-9]+").matcher(str).matches() || Pattern.compile("[0-9]+").matcher(str).matches()) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private String m67894c(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            String valueOf = String.valueOf(str.charAt(i));
            if (m67892b(valueOf)) {
                sb.append(valueOf);
            }
        }
        return sb.toString();
    }

    /* renamed from: d */
    private void m67897d(String[] strArr) {
        int length = strArr.length;
        if (length >= 3 && strArr[1].equalsIgnoreCase("HD") && strArr[2].equalsIgnoreCase("Graphics")) {
            this.f55303c = ENvGpuSubModel.Intel_HD_Graphics;
            if (length == 4 && m67892b(strArr[3])) {
                this.f55304d = m67896d(strArr[3]);
            }
        }
    }

    /* renamed from: e */
    private void m67898e(String[] strArr) {
        int length = strArr.length;
        if (length >= 2) {
            if (!strArr[1].equalsIgnoreCase("Tegra")) {
                if (strArr[1].equalsIgnoreCase("AP")) {
                    this.f55303c = ENvGpuSubModel.NVIDIA_AP;
                }
            } else if (length < 3 || !strArr[2].equalsIgnoreCase("X1")) {
                this.f55303c = ENvGpuSubModel.NVIDIA_Tegra;
            } else {
                this.f55303c = ENvGpuSubModel.NVIDIA_Tegra_X1;
            }
        }
    }

    /* renamed from: g */
    private void m67900g(String[] strArr) {
        if (strArr.length >= 2 && !strArr[1].equalsIgnoreCase("GC")) {
            this.f55303c = ENvGpuSubModel.Vivante_GC;
            this.f55304d = m67896d(m67894c(strArr[1]));
        }
    }

    /* renamed from: b */
    private void m67891b(String[] strArr) {
        int length = strArr.length;
        if (length >= 2) {
            if (m67892b(strArr[1])) {
                if (length == 2) {
                    this.f55303c = ENvGpuSubModel.Mali;
                } else if (length == 3 && strArr[2].equalsIgnoreCase("MP")) {
                    this.f55303c = ENvGpuSubModel.Mali_MP;
                }
                this.f55304d = m67896d(strArr[1]);
                return;
            }
            if (length == 2 && strArr[1] != null && strArr[1].trim().length() > 0 && strArr[1].charAt(0) == 'T') {
                String substring = strArr[1].substring(1);
                if (m67892b(substring)) {
                    this.f55303c = ENvGpuSubModel.Mali_T;
                    this.f55304d = m67896d(substring);
                }
            }
        }
    }

    /* renamed from: a */
    private C20468a m67888a(String str) {
        if (str != null && str.trim().length() > 0) {
            this.f55302b = ENvGpuModel.Unknown;
            this.f55303c = ENvGpuSubModel.Unknown;
            this.f55304d = 0;
            String[] split = str.split("[-\\s+]");
            if (split.length > 0) {
                String trim = split[0].trim();
                if (trim.equalsIgnoreCase("Adreno")) {
                    this.f55302b = ENvGpuModel.Adreno;
                    m67890a(split);
                } else if (trim.equalsIgnoreCase("Mali")) {
                    this.f55302b = ENvGpuModel.Mali;
                    m67891b(split);
                } else if (trim.equalsIgnoreCase("PowerVR")) {
                    this.f55302b = ENvGpuModel.PowerVR;
                    m67895c(split);
                } else if (trim.equalsIgnoreCase("Intel") || trim.equalsIgnoreCase("Intel(R)")) {
                    this.f55302b = ENvGpuModel.Intel;
                    m67897d(split);
                } else if (trim.equalsIgnoreCase("NVIDIA")) {
                    this.f55302b = ENvGpuModel.Intel;
                    m67898e(split);
                } else if (trim.equalsIgnoreCase("Vivante")) {
                    this.f55302b = ENvGpuModel.Vivante;
                    m67900g(split);
                } else if (trim.equalsIgnoreCase("GC1000")) {
                    this.f55302b = ENvGpuModel.Vivante;
                    m67899f(split);
                } else if (trim.equalsIgnoreCase("VideoCore")) {
                    this.f55302b = ENvGpuModel.VideoCore;
                    m67901h(split);
                }
            }
        }
        return new C20468a(this.f55302b, this.f55303c, this.f55304d);
    }

    /* renamed from: c */
    private void m67895c(String[] strArr) {
        int length = strArr.length;
        if (length >= 2) {
            if (strArr[1].equalsIgnoreCase("SGX")) {
                if (length == 3) {
                    if (strArr[2].substring(strArr[2].length() - 2).equalsIgnoreCase("MP")) {
                        String substring = strArr[2].substring(0, strArr[2].length() - 2);
                        if (m67892b(substring)) {
                            this.f55303c = ENvGpuSubModel.PowerVR_SGX_MP;
                            this.f55304d = m67896d(substring);
                        }
                    } else if (strArr[2].substring(strArr[2].length() - 3).equalsIgnoreCase("MP2")) {
                        String substring2 = strArr[2].substring(0, strArr[2].length() - 3);
                        if (m67892b(substring2)) {
                            this.f55303c = ENvGpuSubModel.PowerVR_SGX_MP2;
                            this.f55304d = m67896d(substring2);
                        }
                    } else if (m67892b(strArr[2])) {
                        this.f55303c = ENvGpuSubModel.PowerVR_SGX;
                        this.f55304d = m67896d(strArr[2]);
                    }
                }
            } else if (strArr[1].equalsIgnoreCase("Rogue") && length == 3) {
                if (strArr[2].equalsIgnoreCase("Han")) {
                    this.f55303c = ENvGpuSubModel.PowerVR_Rogue_Han;
                } else if (strArr[2].equalsIgnoreCase("Hood")) {
                    this.f55303c = ENvGpuSubModel.PowerVR_Rogue_Hood;
                } else if (strArr[2].equalsIgnoreCase("Marlowe")) {
                    this.f55303c = ENvGpuSubModel.PowerVR_Rogue_Marlowe;
                } else if (strArr[2].startsWith("G")) {
                    String substring3 = strArr[2].substring(1);
                    if (m67892b(substring3)) {
                        this.f55303c = ENvGpuSubModel.PowerVR_Rogue_G;
                        this.f55304d = m67896d(substring3);
                    }
                }
            }
        }
    }
}

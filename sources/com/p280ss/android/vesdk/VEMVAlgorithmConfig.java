package com.p280ss.android.vesdk;

/* renamed from: com.ss.android.vesdk.VEMVAlgorithmConfig */
public class VEMVAlgorithmConfig {
    public AlgorithmInfo[] infos;

    /* renamed from: com.ss.android.vesdk.VEMVAlgorithmConfig$AlgorithmInfo */
    public class AlgorithmInfo {
        public AlgorithmItem[] items;
        public String photoPath;

        /* renamed from: com.ss.android.vesdk.VEMVAlgorithmConfig$AlgorithmInfo$AlgorithmItem */
        public class AlgorithmItem {
            public String algorithmName;
            public String algorithmParamJson;
            public boolean isNeedServerExecute;

            public AlgorithmItem(AlgorithmInfo algorithmInfo, String str, boolean z) {
                this(str, z, null);
            }

            public AlgorithmItem(String str, boolean z, String str2) {
                this.algorithmName = str;
                this.isNeedServerExecute = z;
                this.algorithmParamJson = str2;
            }
        }

        public AlgorithmInfo() {
        }
    }
}

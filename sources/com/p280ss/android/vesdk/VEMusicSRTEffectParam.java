package com.p280ss.android.vesdk;

/* renamed from: com.ss.android.vesdk.VEMusicSRTEffectParam */
public class VEMusicSRTEffectParam {
    private String mEffectResourcePath;
    private int mFontFaceIndex;
    private String mFontTTFPath;
    public C45227a mGetMusicProgressInvoker;
    private boolean mParamUpdated;
    private C45228b[] mSrtData;

    /* renamed from: com.ss.android.vesdk.VEMusicSRTEffectParam$a */
    public interface C45227a {
        /* renamed from: a */
        float mo108045a();
    }

    /* renamed from: com.ss.android.vesdk.VEMusicSRTEffectParam$b */
    public static class C45228b {

        /* renamed from: a */
        public String f116361a;

        /* renamed from: b */
        public int f116362b;

        /* renamed from: c */
        public int f116363c;

        /* renamed from: d */
        public int f116364d;
    }

    private VEMusicSRTEffectParam() {
    }

    public String getEffectResPath() {
        return this.mEffectResourcePath;
    }

    public int getFontFaceIndex() {
        return this.mFontFaceIndex;
    }

    public String getFontTTFPath() {
        return this.mFontTTFPath;
    }

    private boolean getParamUpdated() {
        if (!this.mParamUpdated) {
            return false;
        }
        this.mParamUpdated = false;
        return true;
    }

    public float getMusicProgress() {
        if (this.mGetMusicProgressInvoker != null) {
            return this.mGetMusicProgressInvoker.mo108045a();
        }
        return 0.0f;
    }

    public int[][] getSrtData() {
        int[][] iArr = new int[this.mSrtData.length][];
        for (int i = 0; i < this.mSrtData.length; i++) {
            iArr[i] = convertDataToUnicode32(this.mSrtData[i]);
        }
        return iArr;
    }

    private int[] convertDataToUnicode32(C45228b bVar) {
        int codePointCount = bVar.f116361a.codePointCount(0, bVar.f116361a.length());
        int[] iArr = new int[(codePointCount + 3)];
        iArr[0] = bVar.f116364d;
        iArr[1] = bVar.f116362b;
        iArr[2] = bVar.f116363c;
        for (int i = 0; i < codePointCount; i++) {
            iArr[i + 3] = bVar.f116361a.codePointAt(i);
        }
        return iArr;
    }

    public void updateEffectResPath(C45228b[] bVarArr, String str, String str2, int i, C45227a aVar) {
        this.mSrtData = bVarArr;
        this.mFontTTFPath = str2;
        this.mEffectResourcePath = str;
        this.mFontFaceIndex = i;
        this.mGetMusicProgressInvoker = aVar;
        this.mParamUpdated = true;
    }

    public VEMusicSRTEffectParam(C45228b[] bVarArr, String str, String str2, int i, C45227a aVar) {
        this.mSrtData = bVarArr;
        this.mFontTTFPath = str2;
        this.mEffectResourcePath = str;
        this.mFontFaceIndex = i;
        this.mGetMusicProgressInvoker = aVar;
        this.mParamUpdated = true;
    }
}

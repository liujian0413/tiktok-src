package com.p280ss.android.ugc.aweme.shortvideo;

import java.io.File;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.SynthetiseResult */
public final class SynthetiseResult implements Cloneable {
    public static final int FLAG_VESDK_COMPILER = 1;
    public float audioLength;
    public String cpuName;
    public int draftHardEncode;
    public int effect;
    public int[] effectArray;
    public String fastImportResolution;
    public double fileFps;
    public int filterIndex;
    public int flags;
    public String gpuName;
    public boolean hasSubtitle;
    public String inputVideoFile;
    public boolean isEnableFpsSet;
    public boolean isFastImport;
    public boolean isFromDraft;
    public int isMusic;
    public boolean isNewFramework;
    public int musicType;
    public boolean needRecode = true;
    public String outputFile;
    public String outputWavFile;
    public int ret;
    public String reverseFile;
    public int segmentCount;
    public int specialPoints;
    public int synthetiseCPUEncode;
    public List<String> texts;
    public int unableRemuxCode;
    public int videoHeight;
    public float videoLength;
    public int videoWidth;

    public final SynthetiseResult clone() {
        try {
            return (SynthetiseResult) super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new AssertionError();
        }
    }

    public final int getReportHardEncode() {
        return ((this.synthetiseCPUEncode ^ 1) * 10) + this.draftHardEncode;
    }

    public final boolean isUsingVECompiler() {
        if ((this.flags & 1) == 1) {
            return true;
        }
        return false;
    }

    public final String toString() {
        try {
            StringBuilder sb = new StringBuilder("SynthetiseResult{ret=");
            sb.append(this.ret);
            sb.append(", draftHardEncode=");
            sb.append(this.draftHardEncode);
            sb.append(", synthetiseCPUEncode=");
            sb.append(this.synthetiseCPUEncode);
            sb.append(", inputVideoFile='");
            sb.append(this.inputVideoFile);
            sb.append('\'');
            sb.append(",length=");
            sb.append(new File(this.inputVideoFile).length());
            sb.append(", reverseFile='");
            sb.append(this.reverseFile);
            sb.append('\'');
            sb.append(",length=");
            sb.append(new File(this.reverseFile).length());
            sb.append(", outputWavFile='");
            sb.append(this.outputWavFile);
            sb.append('\'');
            sb.append(",length=");
            sb.append(new File(this.outputWavFile).length());
            sb.append(", isMusic=");
            sb.append(this.isMusic);
            sb.append(", outputFile='");
            sb.append(this.outputFile);
            sb.append('\'');
            sb.append(",length=");
            sb.append(new File(this.outputFile).length());
            sb.append(", effect=");
            sb.append(this.effect);
            sb.append(", specialPoints=");
            sb.append(this.specialPoints);
            sb.append(", filterIndex=");
            sb.append(this.filterIndex);
            sb.append(", musicType=");
            sb.append(this.musicType);
            sb.append(", videoWidth=");
            sb.append(this.videoWidth);
            sb.append(", videoHeight=");
            sb.append(this.videoHeight);
            sb.append(", effectArray=");
            sb.append(Arrays.toString(this.effectArray));
            sb.append(", isFromDraft=");
            sb.append(this.isFromDraft);
            sb.append(", cpuName=");
            sb.append(this.cpuName);
            sb.append(", gpuName=");
            sb.append(this.gpuName);
            sb.append(", fileFps=");
            sb.append(this.fileFps);
            sb.append(", flags=");
            sb.append(this.flags);
            sb.append(", isEnableFpsSet=");
            sb.append(this.isEnableFpsSet);
            sb.append(", audioLength=");
            sb.append(this.audioLength);
            sb.append(", videoLength=");
            sb.append(this.videoLength);
            sb.append(", texts=");
            sb.append(this.texts);
            sb.append(", isFastImport");
            sb.append(this.isFastImport);
            sb.append(", isNewFramework");
            sb.append(this.isNewFramework);
            sb.append(", hasSubtitle");
            sb.append(this.hasSubtitle);
            sb.append(", unableRemuxCode");
            sb.append(this.unableRemuxCode);
            sb.append('}');
            return sb.toString();
        } catch (NullPointerException unused) {
            StringBuilder sb2 = new StringBuilder("SynthetiseResult{ret=");
            sb2.append(this.ret);
            sb2.append(", draftHardEncode=");
            sb2.append(this.draftHardEncode);
            sb2.append(", synthetiseCPUEncode=");
            sb2.append(this.synthetiseCPUEncode);
            sb2.append(", inputVideoFile='");
            sb2.append(this.inputVideoFile);
            sb2.append('\'');
            sb2.append(", reverseFile='");
            sb2.append(this.reverseFile);
            sb2.append('\'');
            sb2.append(", outputWavFile='");
            sb2.append(this.outputWavFile);
            sb2.append('\'');
            sb2.append(", isMusic=");
            sb2.append(this.isMusic);
            sb2.append(", outputFile='");
            sb2.append(this.outputFile);
            sb2.append('\'');
            sb2.append(", effect=");
            sb2.append(this.effect);
            sb2.append(", specialPoints=");
            sb2.append(this.specialPoints);
            sb2.append(", filterIndex=");
            sb2.append(this.filterIndex);
            sb2.append(", musicType=");
            sb2.append(this.musicType);
            sb2.append(", videoWidth=");
            sb2.append(this.videoWidth);
            sb2.append(", videoHeight=");
            sb2.append(this.videoHeight);
            sb2.append(", effectArray=");
            sb2.append(Arrays.toString(this.effectArray));
            sb2.append(", isFromDraft=");
            sb2.append(this.isFromDraft);
            sb2.append(", cpuName=");
            sb2.append(this.cpuName);
            sb2.append(", gpuName=");
            sb2.append(this.gpuName);
            sb2.append(", fileFps=");
            sb2.append(this.fileFps);
            sb2.append(", flags=");
            sb2.append(this.flags);
            sb2.append(", isEnableFpsSet=");
            sb2.append(this.isEnableFpsSet);
            sb2.append(", audioLength=");
            sb2.append(this.audioLength);
            sb2.append(", videoLength=");
            sb2.append(this.videoLength);
            sb2.append(", texts=");
            sb2.append(this.texts);
            sb2.append(", isFastImport");
            sb2.append(this.isFastImport);
            sb2.append(", isNewFramework");
            sb2.append(this.isNewFramework);
            sb2.append(", hasSubtitle");
            sb2.append(this.hasSubtitle);
            sb2.append(", unableRemuxCode");
            sb2.append(this.unableRemuxCode);
            sb2.append('}');
            return sb2.toString();
        }
    }
}

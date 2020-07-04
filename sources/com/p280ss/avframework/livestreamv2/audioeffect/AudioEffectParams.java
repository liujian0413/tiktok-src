package com.p280ss.avframework.livestreamv2.audioeffect;

import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;

/* renamed from: com.ss.avframework.livestreamv2.audioeffect.AudioEffectParams */
public class AudioEffectParams {
    public int blockSize = PreloadTask.BYTE_UNIT_NUMBER;
    public float centtone;
    public boolean formatShiftOn = true;
    public float octave;
    public int phaseAdjustMethod;
    public int phaseResetMode;
    public int pitchTunerMode;
    public float semitone;
    public boolean smoothOn;
    public float speedRatio = 1.0f;
    public int transientDetectMode;
    public int windowMode;

    public String getParamsAsString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.formatShiftOn ? 1 : 0);
        sb.append(",");
        sb.append(this.smoothOn ? 1 : 0);
        sb.append(",");
        sb.append(this.transientDetectMode);
        sb.append(",");
        sb.append(this.phaseResetMode);
        sb.append(",");
        sb.append(this.phaseAdjustMethod);
        sb.append(",");
        sb.append(this.windowMode);
        sb.append(",");
        sb.append(this.pitchTunerMode);
        sb.append(",");
        sb.append(this.blockSize);
        sb.append(",");
        sb.append(this.centtone);
        sb.append(",");
        sb.append(this.semitone);
        sb.append(",");
        sb.append(this.octave);
        sb.append(",");
        sb.append(this.speedRatio);
        return sb.toString();
    }
}

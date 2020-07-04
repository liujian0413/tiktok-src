package com.p280ss.avframework.livestreamv2.audioeffect;

/* renamed from: com.ss.avframework.livestreamv2.audioeffect.ReverbParams */
public class ReverbParams {
    public float dry = 0.5f;
    public float dryGainDB;
    public boolean dryOnly;
    public boolean enable = true;
    public float hfDamping = 0.5f;
    public float roomSize = 0.6f;
    public float stereoDepth = 1.0f;
    public int weightId;
    public float wet = 0.5f;
    public float wetGainDB;
    public boolean wetOnly;

    /* renamed from: com.ss.avframework.livestreamv2.audioeffect.ReverbParams$Presets */
    public static class Presets {
        public static final ReverbParams CRISTAL = new ReverbParams();
        public static final ReverbParams KTV = new ReverbParams();
        public static final ReverbParams NONE = new ReverbParams();
        public static final ReverbParams POP = new ReverbParams();
        public static final ReverbParams ROCK = new ReverbParams();

        static {
            NONE.enable = false;
            KTV.roomSize = 0.71f;
            KTV.hfDamping = 0.23f;
            KTV.stereoDepth = 0.7f;
            KTV.dry = 2.0f;
            KTV.wet = 0.66f;
            KTV.dryGainDB = 0.0f;
            KTV.wetGainDB = 0.0f;
            KTV.dryOnly = false;
            KTV.wetOnly = false;
            KTV.weightId = 2;
            POP.roomSize = 0.47f;
            POP.hfDamping = 0.3f;
            POP.stereoDepth = 0.6f;
            POP.dry = 2.0f;
            POP.wet = 0.51f;
            POP.dryGainDB = 0.0f;
            POP.wetGainDB = 0.0f;
            POP.dryOnly = false;
            POP.wetOnly = false;
            POP.weightId = 0;
            ROCK.roomSize = 0.9f;
            ROCK.hfDamping = 0.14f;
            ROCK.stereoDepth = 0.79f;
            ROCK.dry = 2.0f;
            ROCK.wet = 0.65f;
            ROCK.dryGainDB = 0.0f;
            ROCK.wetGainDB = 0.0f;
            ROCK.dryOnly = false;
            ROCK.wetOnly = false;
            ROCK.weightId = 4;
            CRISTAL.roomSize = 1.35f;
            CRISTAL.hfDamping = 0.18f;
            CRISTAL.stereoDepth = 0.74f;
            CRISTAL.dry = 1.51f;
            CRISTAL.wet = 0.48f;
            CRISTAL.dryGainDB = -1.0f;
            CRISTAL.wetGainDB = 2.0f;
            CRISTAL.dryOnly = false;
            CRISTAL.wetOnly = false;
            CRISTAL.weightId = 4;
        }
    }

    public ReverbParams copy() {
        ReverbParams reverbParams = new ReverbParams();
        reverbParams.enable = this.enable;
        reverbParams.roomSize = this.roomSize;
        reverbParams.hfDamping = this.hfDamping;
        reverbParams.stereoDepth = this.stereoDepth;
        reverbParams.dry = this.dry;
        reverbParams.wet = this.wet;
        reverbParams.dryGainDB = this.dryGainDB;
        reverbParams.wetGainDB = this.wetGainDB;
        reverbParams.dryOnly = this.dryOnly;
        reverbParams.wetOnly = this.wetOnly;
        reverbParams.weightId = this.weightId;
        return reverbParams;
    }

    public String getParamsAsString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.enable ? 1 : 0);
        sb.append(",");
        sb.append(this.roomSize);
        sb.append(",");
        sb.append(this.hfDamping);
        sb.append(",");
        sb.append(this.stereoDepth);
        sb.append(",");
        sb.append(this.dry);
        sb.append(",");
        sb.append(this.wet);
        sb.append(",");
        sb.append(this.dryGainDB);
        sb.append(",");
        sb.append(this.wetGainDB);
        sb.append(",");
        sb.append(this.dryOnly ? 1 : 0);
        sb.append(",");
        sb.append(this.wetOnly ? 1 : 0);
        sb.append(",");
        sb.append(this.weightId);
        return sb.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ReverbParams{enable=");
        sb.append(this.enable);
        sb.append(", roomSize=");
        sb.append(this.roomSize);
        sb.append(", hfDamping=");
        sb.append(this.hfDamping);
        sb.append(", stereoDepth=");
        sb.append(this.stereoDepth);
        sb.append(", dry=");
        sb.append(this.dry);
        sb.append(", wet=");
        sb.append(this.wet);
        sb.append(", dryGainDB=");
        sb.append(this.dryGainDB);
        sb.append(", wetGainDB=");
        sb.append(this.wetGainDB);
        sb.append(", dryOnly=");
        sb.append(this.dryOnly);
        sb.append(", wetOnly=");
        sb.append(this.wetOnly);
        sb.append(", weightId=");
        sb.append(this.weightId);
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ReverbParams)) {
            return false;
        }
        ReverbParams reverbParams = (ReverbParams) obj;
        if (this.roomSize == reverbParams.roomSize && this.hfDamping == reverbParams.hfDamping && this.stereoDepth == reverbParams.stereoDepth && this.dry == reverbParams.dry && this.wet == reverbParams.wet && this.dryGainDB == reverbParams.dryGainDB && this.wetGainDB == reverbParams.wetGainDB && this.dryOnly == reverbParams.dryOnly && this.wetOnly == reverbParams.wetOnly && this.weightId == reverbParams.weightId && this.enable == reverbParams.enable) {
            return true;
        }
        return false;
    }

    public static ReverbParams fromString(String str) {
        boolean z;
        boolean z2;
        String[] split = str.split(",");
        try {
            ReverbParams reverbParams = new ReverbParams();
            boolean z3 = false;
            if (Integer.parseInt(split[0]) == 1) {
                z = true;
            } else {
                z = false;
            }
            reverbParams.enable = z;
            reverbParams.roomSize = Float.parseFloat(split[1]);
            reverbParams.hfDamping = Float.parseFloat(split[2]);
            reverbParams.stereoDepth = Float.parseFloat(split[3]);
            reverbParams.dry = Float.parseFloat(split[4]);
            reverbParams.wet = Float.parseFloat(split[5]);
            reverbParams.dryGainDB = Float.parseFloat(split[6]);
            reverbParams.wetGainDB = Float.parseFloat(split[7]);
            if (Integer.parseInt(split[8]) == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            reverbParams.dryOnly = z2;
            if (Integer.parseInt(split[9]) == 1) {
                z3 = true;
            }
            reverbParams.wetOnly = z3;
            reverbParams.weightId = Integer.parseInt(split[10]);
            return reverbParams;
        } catch (Exception unused) {
            return null;
        }
    }
}

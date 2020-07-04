package com.p280ss.avframework.livestreamv2.audioeffect;

/* renamed from: com.ss.avframework.livestreamv2.audioeffect.Reverb2Params */
public class Reverb2Params {
    public float bassb;
    public float basslpf = 1050.0f;
    public float damplpf = 18000.0f;
    public float delay;
    public float dry;
    public boolean enable = true;
    public boolean enableExciter = true;
    public float ereffactor = 1.0f;
    public float erefwet;
    public float erefwidth;
    public float ertolate;
    public float inputlpf = 18000.0f;
    public float outputlpf = 18000.0f;
    public int oversamplefactor = 1;
    public int rate = 44100;
    public float rt60 = 0.1f;
    public float spin;
    public float wander = 0.1f;
    public float wet;
    public float width;

    /* renamed from: com.ss.avframework.livestreamv2.audioeffect.Reverb2Params$Presets */
    public static class Presets {
        public static final Reverb2Params CRISTAL = new Reverb2Params();
        public static final Reverb2Params KTV = new Reverb2Params();
        public static final Reverb2Params NONE = new Reverb2Params();
        public static final Reverb2Params POP = new Reverb2Params();
        public static final Reverb2Params ROCK = new Reverb2Params();

        static {
            NONE.enable = false;
            POP.rate = 44100;
            POP.oversamplefactor = 2;
            POP.ertolate = 0.25f;
            POP.erefwet = -26.0f;
            POP.dry = -10.0f;
            POP.ereffactor = 0.9f;
            POP.erefwidth = -0.68f;
            POP.width = 0.22f;
            POP.wet = -11.66f;
            POP.wander = 0.18f;
            POP.bassb = 0.07f;
            POP.spin = 4.57f;
            POP.inputlpf = 18000.0f;
            POP.basslpf = 93.0f;
            POP.damplpf = 14570.0f;
            POP.outputlpf = 17140.0f;
            POP.rt60 = 3.9999998f;
            POP.delay = 0.19f;
            KTV.rate = 44100;
            KTV.oversamplefactor = 2;
            KTV.ertolate = 0.1f;
            KTV.erefwet = -28.0f;
            KTV.dry = -7.0f;
            KTV.ereffactor = 1.3199999f;
            KTV.erefwidth = 0.110000014f;
            KTV.width = 0.42f;
            KTV.wet = -15.0f;
            KTV.wander = 0.38f;
            KTV.bassb = 0.075f;
            KTV.spin = 7.3f;
            KTV.inputlpf = 9560.001f;
            KTV.basslpf = 136.0f;
            KTV.damplpf = 11690.0f;
            KTV.outputlpf = 7100.0f;
            KTV.rt60 = 3.9f;
            KTV.delay = -0.42000002f;
            ROCK.rate = 44100;
            ROCK.oversamplefactor = 2;
            ROCK.ertolate = 0.0f;
            ROCK.erefwet = -26.0f;
            ROCK.dry = -8.0f;
            ROCK.ereffactor = 1.36f;
            ROCK.erefwidth = 1.0f;
            ROCK.width = 0.81f;
            ROCK.wet = -22.0f;
            ROCK.wander = 0.495f;
            ROCK.bassb = 0.02f;
            ROCK.spin = 7.0f;
            ROCK.inputlpf = 18000.0f;
            ROCK.basslpf = 84.0f;
            ROCK.damplpf = 18000.0f;
            ROCK.outputlpf = 18000.0f;
            ROCK.rt60 = 3.9f;
            ROCK.delay = -0.00999999f;
            CRISTAL.rate = 44100;
            CRISTAL.oversamplefactor = 2;
            CRISTAL.ertolate = 0.0f;
            CRISTAL.erefwet = -42.0f;
            CRISTAL.dry = -19.0f;
            CRISTAL.ereffactor = 0.5f;
            CRISTAL.erefwidth = 1.0f;
            CRISTAL.width = 0.81f;
            CRISTAL.wet = -12.0f;
            CRISTAL.wander = 0.17f;
            CRISTAL.bassb = 0.0f;
            CRISTAL.spin = 0.0f;
            CRISTAL.inputlpf = 5890.0f;
            CRISTAL.basslpf = 143.0f;
            CRISTAL.damplpf = 5690.0f;
            CRISTAL.outputlpf = 7650.0f;
            CRISTAL.rt60 = 3.6f;
            CRISTAL.delay = 0.5f;
        }

        public static Reverb2Params fromValue(int i) {
            switch (i) {
                case 1:
                    return KTV;
                case 2:
                    return CRISTAL;
                case 3:
                    return POP;
                case 4:
                    return ROCK;
                default:
                    return NONE;
            }
        }
    }

    public Reverb2Params copy() {
        return fromString(getParamsAsString());
    }

    public String getParamsAsString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.enableExciter ? 1 : 0);
        sb.append(",");
        sb.append(this.enable ? 1 : 0);
        sb.append(",");
        sb.append(this.rate);
        sb.append(",");
        sb.append(this.oversamplefactor);
        sb.append(",");
        sb.append(this.ertolate);
        sb.append(",");
        sb.append(this.erefwet);
        sb.append(",");
        sb.append(this.dry);
        sb.append(",");
        sb.append(this.ereffactor);
        sb.append(",");
        sb.append(this.erefwidth);
        sb.append(",");
        sb.append(this.width);
        sb.append(",");
        sb.append(this.wet);
        sb.append(",");
        sb.append(this.wander);
        sb.append(",");
        sb.append(this.bassb);
        sb.append(",");
        sb.append(this.spin);
        sb.append(",");
        sb.append(this.inputlpf);
        sb.append(",");
        sb.append(this.basslpf);
        sb.append(",");
        sb.append(this.damplpf);
        sb.append(",");
        sb.append(this.outputlpf);
        sb.append(",");
        sb.append(this.rt60);
        sb.append(",");
        sb.append(this.delay);
        return sb.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Reverb2Params{enableExciter=");
        sb.append(this.enableExciter);
        sb.append("enable=");
        sb.append(this.enable);
        sb.append("rate=");
        sb.append(this.rate);
        sb.append(", oversamplefactor=");
        sb.append(this.oversamplefactor);
        sb.append(", ertolate=");
        sb.append(this.ertolate);
        sb.append(", erefwet=");
        sb.append(this.erefwet);
        sb.append(", dry=");
        sb.append(this.dry);
        sb.append(", ereffactor=");
        sb.append(this.ereffactor);
        sb.append(", erefwidth=");
        sb.append(this.erefwidth);
        sb.append(", width=");
        sb.append(this.width);
        sb.append(", wet=");
        sb.append(this.wet);
        sb.append(", wander=");
        sb.append(this.wander);
        sb.append(", bassb=");
        sb.append(this.bassb);
        sb.append(", spin=");
        sb.append(this.spin);
        sb.append(", inputlpf=");
        sb.append(this.inputlpf);
        sb.append(", basslpf=");
        sb.append(this.basslpf);
        sb.append(", damplpf=");
        sb.append(this.damplpf);
        sb.append(", outputlpf=");
        sb.append(this.outputlpf);
        sb.append(", rt60=");
        sb.append(this.rt60);
        sb.append(", delay=");
        sb.append(this.delay);
        sb.append('}');
        return sb.toString();
    }

    public static Reverb2Params fromString(String str) {
        boolean z;
        String[] split = str.split(",");
        try {
            Reverb2Params reverb2Params = new Reverb2Params();
            boolean z2 = false;
            if (Integer.parseInt(split[0]) == 1) {
                z = true;
            } else {
                z = false;
            }
            reverb2Params.enableExciter = z;
            if (Integer.parseInt(split[1]) == 1) {
                z2 = true;
            }
            reverb2Params.enable = z2;
            reverb2Params.rate = Integer.parseInt(split[2]);
            reverb2Params.oversamplefactor = Integer.parseInt(split[3]);
            reverb2Params.ertolate = Float.parseFloat(split[4]);
            reverb2Params.erefwet = Float.parseFloat(split[5]);
            reverb2Params.dry = Float.parseFloat(split[6]);
            reverb2Params.ereffactor = Float.parseFloat(split[7]);
            reverb2Params.erefwidth = Float.parseFloat(split[8]);
            reverb2Params.width = Float.parseFloat(split[9]);
            reverb2Params.wet = Float.parseFloat(split[10]);
            reverb2Params.wander = Float.parseFloat(split[11]);
            reverb2Params.bassb = Float.parseFloat(split[12]);
            reverb2Params.spin = Float.parseFloat(split[13]);
            reverb2Params.inputlpf = Float.parseFloat(split[14]);
            reverb2Params.basslpf = Float.parseFloat(split[15]);
            reverb2Params.damplpf = Float.parseFloat(split[16]);
            reverb2Params.outputlpf = Float.parseFloat(split[17]);
            reverb2Params.rt60 = Float.parseFloat(split[18]);
            reverb2Params.delay = Float.parseFloat(split[19]);
            return reverb2Params;
        } catch (Exception unused) {
            return null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Reverb2Params reverb2Params = (Reverb2Params) obj;
        if (this.enableExciter == reverb2Params.enableExciter && this.enable == reverb2Params.enable && this.rate == reverb2Params.rate && this.oversamplefactor == reverb2Params.oversamplefactor && Float.compare(reverb2Params.ertolate, this.ertolate) == 0 && Float.compare(reverb2Params.erefwet, this.erefwet) == 0 && Float.compare(reverb2Params.dry, this.dry) == 0 && Float.compare(reverb2Params.ereffactor, this.ereffactor) == 0 && Float.compare(reverb2Params.erefwidth, this.erefwidth) == 0 && Float.compare(reverb2Params.width, this.width) == 0 && Float.compare(reverb2Params.wet, this.wet) == 0 && Float.compare(reverb2Params.wander, this.wander) == 0 && Float.compare(reverb2Params.bassb, this.bassb) == 0 && Float.compare(reverb2Params.spin, this.spin) == 0 && Float.compare(reverb2Params.inputlpf, this.inputlpf) == 0 && Float.compare(reverb2Params.basslpf, this.basslpf) == 0 && Float.compare(reverb2Params.damplpf, this.damplpf) == 0 && Float.compare(reverb2Params.outputlpf, this.outputlpf) == 0 && Float.compare(reverb2Params.rt60, this.rt60) == 0 && Float.compare(reverb2Params.delay, this.delay) == 0) {
            return true;
        }
        return false;
    }
}

package com.p280ss.android.vesdk.clipparam;

/* renamed from: com.ss.android.vesdk.clipparam.VEAlgorithmPath */
public class VEAlgorithmPath {
    public static int BEATES_FILE_BEATS_A0 = 2;
    public static int BEATES_FILE_CUSTOM = 3;
    public static int BEATES_FILE_DEFAULT = 0;
    public static int BEATES_FILE_SERVER_C = 1;
    public static int INTMODE_ONSET = 0;
    public static int MODE_SUCCESSIVELY = 1;
    String downBeatsPath;
    String manMadePath;
    int mode = INTMODE_ONSET;
    String noStrengthBeatsPath;
    String onlineBeatsPath;
    int type;
    String veBeatsPath;

    public String getDownBeatsPath() {
        return this.downBeatsPath;
    }

    public String getManMadePath() {
        return this.manMadePath;
    }

    public int getMode() {
        return this.mode;
    }

    public String getNoStrengthBeatsPath() {
        return this.noStrengthBeatsPath;
    }

    public String getOnlineBeatsPath() {
        return this.onlineBeatsPath;
    }

    public int getType() {
        return this.type;
    }

    public String getVeBeatsPath() {
        return this.veBeatsPath;
    }

    public String toString() {
        String str = "";
        if (this.veBeatsPath != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" veBeatsPath: ");
            sb.append(this.veBeatsPath);
            str = sb.toString();
        }
        if (this.downBeatsPath != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(" downBeatsPath: ");
            sb2.append(this.downBeatsPath);
            str = sb2.toString();
        }
        if (this.noStrengthBeatsPath != null) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            sb3.append(" noStrengthBeatsPath: ");
            sb3.append(this.noStrengthBeatsPath);
            str = sb3.toString();
        }
        if (this.onlineBeatsPath != null) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str);
            sb4.append(" onlineBeatsPath: ");
            sb4.append(this.onlineBeatsPath);
            str = sb4.toString();
        }
        if (this.manMadePath != null) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append(str);
            sb5.append(" manMadePath: ");
            sb5.append(this.manMadePath);
            str = sb5.toString();
        }
        StringBuilder sb6 = new StringBuilder();
        sb6.append(str);
        sb6.append(" mode: ");
        sb6.append(this.mode);
        String sb7 = sb6.toString();
        StringBuilder sb8 = new StringBuilder();
        sb8.append(sb7);
        sb8.append(" type: ");
        sb8.append(this.type);
        return sb8.toString();
    }

    public void setDownBeatsPath(String str) {
        this.downBeatsPath = str;
    }

    public void setManMadePath(String str) {
        this.manMadePath = str;
    }

    public void setMode(int i) {
        this.mode = i;
    }

    public void setNoStrengthBeatsPath(String str) {
        this.noStrengthBeatsPath = str;
    }

    public void setOnlineBeatsPath(String str) {
        this.onlineBeatsPath = str;
    }

    public void setType(int i) {
        this.type = i;
    }

    public void setVeBeatsPath(String str) {
        this.veBeatsPath = str;
    }
}

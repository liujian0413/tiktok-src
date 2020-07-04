package com.p280ss.android.ugc.aweme.shortvideo;

import android.text.TextUtils;
import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.video.C7276d;
import java.io.Serializable;
import kotlin.jvm.internal.C7571f;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.StickPointMusicAlg */
public final class StickPointMusicAlg implements Serializable {
    public static int BEATES_FILE_BEATS_A0 = 2;
    public static int BEATES_FILE_CUSTOM = 3;
    public static int BEATES_FILE_DEFAULT;
    public static int BEATES_FILE_SERVER_C = 1;
    public static final C38407a Companion = new C38407a(null);
    @C6593c(mo15949a = "alg_type")
    private int algType = BEATES_FILE_DEFAULT;
    @C6593c(mo15949a = "defaultlocal_path")
    private String defaultLocalPath;
    @C6593c(mo15949a = "defaultlocal_url")
    private String defaultLocalUrl;
    @C6593c(mo15949a = "downbeats_path")
    private String downBeatsPath;
    @C6593c(mo15949a = "downbeats_url")
    private String downBeatsUrl;
    @C6593c(mo15949a = "manmodebeats_path")
    private String manModeBeatsPath;
    @C6593c(mo15949a = "manmodebeats_url")
    private String manModeBeatsUrl;
    @C6593c(mo15949a = "max_seg")
    private int maxSeg;
    @C6593c(mo15949a = "min_seg")
    private int minSeg;
    @C6593c(mo15949a = "music_id")
    private String musicId;
    @C6593c(mo15949a = "nostrengthbeats_path")
    private String noStrengthBeatsPath;
    @C6593c(mo15949a = "nostrengthbeats_url")
    private String noStrengthBeatsUrl;
    @C6593c(mo15949a = "vebeats_path")
    private String veBeatsPath;
    @C6593c(mo15949a = "vebeats_url")
    private String veBeatsUrl;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.StickPointMusicAlg$a */
    public static final class C38407a {
        private C38407a() {
        }

        public /* synthetic */ C38407a(C7571f fVar) {
            this();
        }
    }

    public final int getAlgType() {
        return this.algType;
    }

    public final String getDefaultLocalPath() {
        return this.defaultLocalPath;
    }

    public final String getDefaultLocalUrl() {
        return this.defaultLocalUrl;
    }

    public final String getDownBeatsPath() {
        return this.downBeatsPath;
    }

    public final String getDownBeatsUrl() {
        return this.downBeatsUrl;
    }

    public final String getManModeBeatsPath() {
        return this.manModeBeatsPath;
    }

    public final String getManModeBeatsUrl() {
        return this.manModeBeatsUrl;
    }

    public final int getMaxSeg() {
        return this.maxSeg;
    }

    public final int getMinSeg() {
        return this.minSeg;
    }

    public final String getMusicId() {
        return this.musicId;
    }

    public final String getNoStrengthBeatsPath() {
        return this.noStrengthBeatsPath;
    }

    public final String getNoStrengthBeatsUrl() {
        return this.noStrengthBeatsUrl;
    }

    public final String getVeBeatsPath() {
        return this.veBeatsPath;
    }

    public final String getVeBeatsUrl() {
        return this.veBeatsUrl;
    }

    public final boolean existOnSetAlgFile() {
        return C7276d.m22812b(this.veBeatsPath);
    }

    public final boolean hasOnSetAlgUrl() {
        if (!TextUtils.isEmpty(this.veBeatsUrl)) {
            return true;
        }
        return false;
    }

    public final boolean isSuccessivelyAlgType() {
        if (this.algType == BEATES_FILE_SERVER_C || this.algType == BEATES_FILE_BEATS_A0 || this.algType == BEATES_FILE_CUSTOM) {
            return true;
        }
        return false;
    }

    public final boolean existSuccessivelyAlgFile() {
        if (this.algType == BEATES_FILE_BEATS_A0) {
            return C7276d.m22812b(this.veBeatsPath);
        }
        if (this.algType == BEATES_FILE_SERVER_C) {
            return C7276d.m22812b(this.downBeatsPath);
        }
        if (this.algType == BEATES_FILE_CUSTOM) {
            return C7276d.m22812b(this.manModeBeatsPath);
        }
        return false;
    }

    public final boolean hasSuccessivelyAlgUrl() {
        if (this.algType == BEATES_FILE_BEATS_A0) {
            if (!TextUtils.isEmpty(this.veBeatsUrl)) {
                return true;
            }
            return false;
        } else if (this.algType == BEATES_FILE_SERVER_C) {
            if (!TextUtils.isEmpty(this.downBeatsUrl)) {
                return true;
            }
            return false;
        } else if (this.algType != BEATES_FILE_CUSTOM || TextUtils.isEmpty(this.manModeBeatsUrl)) {
            return false;
        } else {
            return true;
        }
    }

    public final void setAlgType(int i) {
        this.algType = i;
    }

    public final void setDefaultLocalPath(String str) {
        this.defaultLocalPath = str;
    }

    public final void setDefaultLocalUrl(String str) {
        this.defaultLocalUrl = str;
    }

    public final void setDownBeatsPath(String str) {
        this.downBeatsPath = str;
    }

    public final void setDownBeatsUrl(String str) {
        this.downBeatsUrl = str;
    }

    public final void setManModeBeatsPath(String str) {
        this.manModeBeatsPath = str;
    }

    public final void setManModeBeatsUrl(String str) {
        this.manModeBeatsUrl = str;
    }

    public final void setMaxSeg(int i) {
        this.maxSeg = i;
    }

    public final void setMinSeg(int i) {
        this.minSeg = i;
    }

    public final void setMusicId(String str) {
        this.musicId = str;
    }

    public final void setNoStrengthBeatsPath(String str) {
        this.noStrengthBeatsPath = str;
    }

    public final void setNoStrengthBeatsUrl(String str) {
        this.noStrengthBeatsUrl = str;
    }

    public final void setVeBeatsPath(String str) {
        this.veBeatsPath = str;
    }

    public final void setVeBeatsUrl(String str) {
        this.veBeatsUrl = str;
    }
}

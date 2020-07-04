package com.p280ss.android.ugc.aweme.services.publish;

import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.services.publish.PublishOutput */
public final class PublishOutput {
    private final String creationId;
    private final String filePath;
    private final boolean isCommercialMusic;
    private final boolean isOriginalSound;
    private final String musicId;

    public static /* synthetic */ PublishOutput copy$default(PublishOutput publishOutput, String str, String str2, String str3, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = publishOutput.creationId;
        }
        if ((i & 2) != 0) {
            str2 = publishOutput.filePath;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            str3 = publishOutput.musicId;
        }
        String str5 = str3;
        if ((i & 8) != 0) {
            z = publishOutput.isCommercialMusic;
        }
        boolean z3 = z;
        if ((i & 16) != 0) {
            z2 = publishOutput.isOriginalSound;
        }
        return publishOutput.copy(str, str4, str5, z3, z2);
    }

    public static /* synthetic */ void filePath$annotations() {
    }

    public final String component1() {
        return this.creationId;
    }

    public final String component2() {
        return this.filePath;
    }

    public final String component3() {
        return this.musicId;
    }

    public final boolean component4() {
        return this.isCommercialMusic;
    }

    public final boolean component5() {
        return this.isOriginalSound;
    }

    public final PublishOutput copy(String str, String str2, String str3, boolean z, boolean z2) {
        PublishOutput publishOutput = new PublishOutput(str, str2, str3, z, z2);
        return publishOutput;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PublishOutput) {
                PublishOutput publishOutput = (PublishOutput) obj;
                if (C7573i.m23585a((Object) this.creationId, (Object) publishOutput.creationId) && C7573i.m23585a((Object) this.filePath, (Object) publishOutput.filePath) && C7573i.m23585a((Object) this.musicId, (Object) publishOutput.musicId)) {
                    if (this.isCommercialMusic == publishOutput.isCommercialMusic) {
                        if (this.isOriginalSound == publishOutput.isOriginalSound) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final String getCreationId() {
        return this.creationId;
    }

    public final String getFilePath() {
        return this.filePath;
    }

    public final String getMusicId() {
        return this.musicId;
    }

    public final int hashCode() {
        String str = this.creationId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.filePath;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.musicId;
        if (str3 != null) {
            i = str3.hashCode();
        }
        int i2 = (hashCode2 + i) * 31;
        boolean z = this.isCommercialMusic;
        if (z) {
            z = true;
        }
        int i3 = (i2 + (z ? 1 : 0)) * 31;
        boolean z2 = this.isOriginalSound;
        if (z2) {
            z2 = true;
        }
        return i3 + (z2 ? 1 : 0);
    }

    public final boolean isCommercialMusic() {
        return this.isCommercialMusic;
    }

    public final boolean isOriginalSound() {
        return this.isOriginalSound;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PublishOutput(creationId=");
        sb.append(this.creationId);
        sb.append(", filePath=");
        sb.append(this.filePath);
        sb.append(", musicId=");
        sb.append(this.musicId);
        sb.append(", isCommercialMusic=");
        sb.append(this.isCommercialMusic);
        sb.append(", isOriginalSound=");
        sb.append(this.isOriginalSound);
        sb.append(")");
        return sb.toString();
    }

    public PublishOutput(String str, String str2, String str3, boolean z, boolean z2) {
        this.creationId = str;
        this.filePath = str2;
        this.musicId = str3;
        this.isCommercialMusic = z;
        this.isOriginalSound = z2;
    }

    public /* synthetic */ PublishOutput(String str, String str2, String str3, boolean z, boolean z2, int i, C7571f fVar) {
        boolean z3;
        boolean z4;
        if ((i & 8) != 0) {
            z3 = false;
        } else {
            z3 = z;
        }
        if ((i & 16) != 0) {
            z4 = true;
        } else {
            z4 = z2;
        }
        this(str, str2, str3, z3, z4);
    }
}

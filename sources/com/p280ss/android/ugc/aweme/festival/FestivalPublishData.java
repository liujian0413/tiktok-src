package com.p280ss.android.ugc.aweme.festival;

import com.google.gson.p276a.C6593c;
import java.io.Serializable;
import java.util.Arrays;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.festival.FestivalPublishData */
public final class FestivalPublishData implements Serializable {
    @C6593c(mo15949a = "audio_path")
    private final String audioPath;
    @C6593c(mo15949a = "challenge_id")
    private final String challengeId;
    @C6593c(mo15949a = "diamond_game_id")
    private final String diamondGameId;
    @C6593c(mo15949a = "video_size")
    private final int[] videoSize;
    @C6593c(mo15949a = "watermark")
    private final String watermark;

    public static /* synthetic */ FestivalPublishData copy$default(FestivalPublishData festivalPublishData, String str, String str2, String str3, String str4, int[] iArr, int i, Object obj) {
        if ((i & 1) != 0) {
            str = festivalPublishData.diamondGameId;
        }
        if ((i & 2) != 0) {
            str2 = festivalPublishData.challengeId;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = festivalPublishData.audioPath;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = festivalPublishData.watermark;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            iArr = festivalPublishData.videoSize;
        }
        return festivalPublishData.copy(str, str5, str6, str7, iArr);
    }

    public final String component1() {
        return this.diamondGameId;
    }

    public final String component2() {
        return this.challengeId;
    }

    public final String component3() {
        return this.audioPath;
    }

    public final String component4() {
        return this.watermark;
    }

    public final int[] component5() {
        return this.videoSize;
    }

    public final FestivalPublishData copy(String str, String str2, String str3, String str4, int[] iArr) {
        C7573i.m23587b(str, "diamondGameId");
        C7573i.m23587b(iArr, "videoSize");
        FestivalPublishData festivalPublishData = new FestivalPublishData(str, str2, str3, str4, iArr);
        return festivalPublishData;
    }

    public final String getAudioPath() {
        return this.audioPath;
    }

    public final String getChallengeId() {
        return this.challengeId;
    }

    public final String getDiamondGameId() {
        return this.diamondGameId;
    }

    public final int[] getVideoSize() {
        return this.videoSize;
    }

    public final String getWatermark() {
        return this.watermark;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FestivalPublishData(diamondGameId=");
        sb.append(this.diamondGameId);
        sb.append(", challengeId=");
        sb.append(this.challengeId);
        sb.append(", audioPath=");
        sb.append(this.audioPath);
        sb.append(", watermark=");
        sb.append(this.watermark);
        sb.append(", videoSize=");
        sb.append(Arrays.toString(this.videoSize));
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int i;
        int i2;
        int hashCode = this.diamondGameId.hashCode() * 31;
        String str = this.challengeId;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 31;
        String str2 = this.audioPath;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        String str3 = this.watermark;
        if (str3 != null) {
            i3 = str3.hashCode();
        }
        return ((i5 + i3) * 31) + Arrays.hashCode(this.videoSize);
    }

    public final boolean equals(Object obj) {
        Class cls;
        if (this == obj) {
            return true;
        }
        Class cls2 = getClass();
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!C7573i.m23585a((Object) cls2, (Object) cls)) {
            return false;
        }
        if (obj != null) {
            FestivalPublishData festivalPublishData = (FestivalPublishData) obj;
            if (!(!C7573i.m23585a((Object) this.diamondGameId, (Object) festivalPublishData.diamondGameId)) && !(!C7573i.m23585a((Object) this.challengeId, (Object) festivalPublishData.challengeId)) && !(!C7573i.m23585a((Object) this.audioPath, (Object) festivalPublishData.audioPath)) && !(!C7573i.m23585a((Object) this.watermark, (Object) festivalPublishData.watermark)) && Arrays.equals(this.videoSize, festivalPublishData.videoSize)) {
                return true;
            }
            return false;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.festival.FestivalPublishData");
    }

    public FestivalPublishData(String str, String str2, String str3, String str4, int[] iArr) {
        C7573i.m23587b(str, "diamondGameId");
        C7573i.m23587b(iArr, "videoSize");
        this.diamondGameId = str;
        this.challengeId = str2;
        this.audioPath = str3;
        this.watermark = str4;
        this.videoSize = iArr;
    }

    public /* synthetic */ FestivalPublishData(String str, String str2, String str3, String str4, int[] iArr, int i, C7571f fVar) {
        if ((i & 16) != 0) {
            iArr = new int[]{720, 1280};
        }
        this(str, str2, str3, str4, iArr);
    }
}

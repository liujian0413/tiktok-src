package com.p280ss.android.ugc.aweme.shortvideo.model;

import android.text.TextUtils;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.p280ss.android.ugc.aweme.shortvideo.AVMusic;
import com.p280ss.android.ugc.aweme.shortvideo.ClientCherEffectParam;
import com.p280ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.TimeSpeedModelExtension;
import com.p280ss.android.ugc.aweme.shortvideo.reaction.ReactionParams;
import com.p280ss.android.ugc.aweme.sticker.StickerInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.model.RecordScene */
public class RecordScene {
    public UrlModel audioTrack;
    public String challengeStr;
    public ClientCherEffectParam cherEffectParam;
    public String creationId;
    public String duetAudioPath;
    public String duetVideoPath;
    public ExtractFramesModel extractFramesModel;
    public int faceBeauty;
    public String filterIds;
    public String filterLabels;
    public int hardEncode;
    public long maxDuration;
    public String mp4Path;
    public AVMusic musicModel;
    public String musicPath;
    public int musicStart;
    public String poiContextStr;
    public ReactionParams reactionParams;
    public int recordMode;
    public int shootMode;
    public Map<String, Object> videoRecordMetadata;
    public ArrayList<TimeSpeedModelExtension> videoSegments;

    public boolean isSegmentsNotValid() {
        return C6307b.m19566a((Collection<T>) this.videoSegments);
    }

    public AVChallenge getChallengeFromStr() {
        if (TextUtils.isEmpty(this.challengeStr)) {
            return null;
        }
        SimpleAVChallenge deserializeFromJson = SimpleAVChallenge.deserializeFromJson(this.challengeStr);
        if (deserializeFromJson == null) {
            return null;
        }
        return deserializeFromJson.parse2AVChallenge();
    }

    public boolean isDuetMode() {
        if (!C6319n.m19593a(this.duetVideoPath) || !C6319n.m19593a(this.duetAudioPath)) {
            return true;
        }
        return false;
    }

    public boolean isReactionMode() {
        if (this.reactionParams == null || C6319n.m19593a(this.reactionParams.videoPath)) {
            return false;
        }
        return true;
    }

    public RecordScene audioTrack(UrlModel urlModel) {
        this.audioTrack = urlModel;
        return this;
    }

    public RecordScene creationId(String str) {
        this.creationId = str;
        return this;
    }

    public RecordScene faceBeauty(int i) {
        this.faceBeauty = i;
        return this;
    }

    public RecordScene hardEncode(int i) {
        this.hardEncode = i;
        return this;
    }

    public RecordScene maxDuration(long j) {
        this.maxDuration = j;
        return this;
    }

    public RecordScene mp4Path(String str) {
        this.mp4Path = str;
        return this;
    }

    public RecordScene musicModel(AVMusic aVMusic) {
        this.musicModel = aVMusic;
        return this;
    }

    public RecordScene musicPath(String str) {
        this.musicPath = str;
        return this;
    }

    public RecordScene musicStart(int i) {
        this.musicStart = i;
        return this;
    }

    public RecordScene reactionParams(ReactionParams reactionParams2) {
        this.reactionParams = reactionParams2;
        return this;
    }

    public RecordScene recordMode(int i) {
        this.recordMode = i;
        return this;
    }

    public RecordScene videoSegment(String str) {
        this.videoSegments = ShortVideoContext.m122682a(str);
        return this;
    }

    public static String challenge2str(AVChallenge aVChallenge) {
        if (aVChallenge == null) {
            return "";
        }
        return SimpleAVChallenge.serializeToStr(SimpleAVChallenge.fromAVChallenge(aVChallenge));
    }

    public static ClientCherEffectParam getCherEffectParam(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return (ClientCherEffectParam) C35563c.f93239b.mo15974a(str, ClientCherEffectParam.class);
        } catch (Exception unused) {
            return null;
        }
    }

    public static ReactionParams string2ReactionParams(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (ReactionParams) C35563c.f93239b.mo15974a(str, ReactionParams.class);
    }

    public static String getFirstStickerMusicIds(ArrayList<TimeSpeedModelExtension> arrayList) {
        if (C6307b.m19566a((Collection<T>) arrayList)) {
            return null;
        }
        List stickerMusicIds = ((TimeSpeedModelExtension) arrayList.get(0)).getStickerMusicIds();
        if (C6307b.m19566a((Collection<T>) stickerMusicIds)) {
            return null;
        }
        return C35563c.f93239b.mo15979b((Object) stickerMusicIds);
    }

    public static String getStickerIdsByModel(ArrayList<TimeSpeedModelExtension> arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((TimeSpeedModelExtension) it.next()).getStickerId());
        }
        arrayList2.removeAll(Collections.singleton(null));
        return join(arrayList2, ",");
    }

    public static boolean isChangeSpeed(ArrayList<TimeSpeedModelExtension> arrayList) {
        if (C6307b.m19566a((Collection<T>) arrayList)) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            TimeSpeedModelExtension timeSpeedModelExtension = (TimeSpeedModelExtension) it.next();
            if (0.6d <= timeSpeedModelExtension.getSpeed()) {
                if (timeSpeedModelExtension.getSpeed() > 1.5d) {
                }
            }
            return true;
        }
        return false;
    }

    public static String getCameraIdsStringByModel(ArrayList<TimeSpeedModelExtension> arrayList) {
        if (C6307b.m19566a((Collection<T>) arrayList)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            TimeSpeedModelExtension timeSpeedModelExtension = (TimeSpeedModelExtension) it.next();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(timeSpeedModelExtension.getCameraId());
            sb2.append(",");
            sb.append(sb2.toString());
        }
        String sb3 = sb.toString();
        return sb3.substring(0, sb3.length() - 1);
    }

    public static String getSpeedStringByModel(ArrayList<TimeSpeedModelExtension> arrayList) {
        if (C6307b.m19566a((Collection<T>) arrayList)) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            TimeSpeedModelExtension timeSpeedModelExtension = (TimeSpeedModelExtension) it.next();
            if (timeSpeedModelExtension.getSpeed() > 0.2d && timeSpeedModelExtension.getSpeed() < 0.4d) {
                sb.append("1,");
            } else if (timeSpeedModelExtension.getSpeed() > 0.4d && timeSpeedModelExtension.getSpeed() < 0.6d) {
                sb.append("2,");
            } else if (0.6d < timeSpeedModelExtension.getSpeed() && timeSpeedModelExtension.getSpeed() < 1.5d) {
                sb.append("3,");
            } else if (timeSpeedModelExtension.getSpeed() == 1.5d) {
                sb.append("6,");
            } else if (1.5d < timeSpeedModelExtension.getSpeed() && timeSpeedModelExtension.getSpeed() < 2.5d) {
                sb.append("4,");
            } else if (2.5d < timeSpeedModelExtension.getSpeed() && timeSpeedModelExtension.getSpeed() < 3.5d) {
                sb.append("5,");
            }
        }
        String sb2 = sb.toString();
        return sb2.substring(0, sb2.length() - 1);
    }

    public static StickerInfo getStickerInfo(ArrayList<TimeSpeedModelExtension> arrayList) {
        StickerInfo stickerInfo = new StickerInfo();
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            TimeSpeedModelExtension timeSpeedModelExtension = (TimeSpeedModelExtension) it.next();
            if (!timeSpeedModelExtension.getPropSource().isEmpty()) {
                arrayList2.add(timeSpeedModelExtension.getPropSource());
            }
            if (!timeSpeedModelExtension.getGradeKey().isEmpty()) {
                StringBuilder sb = new StringBuilder();
                sb.append(timeSpeedModelExtension.getStickerId());
                sb.append(":");
                sb.append(timeSpeedModelExtension.getGradeKey());
                arrayList3.add(sb.toString());
            }
        }
        arrayList2.removeAll(Collections.singleton(null));
        arrayList3.removeAll(Collections.singleton(null));
        stickerInfo.setPropSource(join(arrayList2, ","));
        stickerInfo.setGradeKey(join(arrayList3, ","));
        return stickerInfo;
    }

    public static String join(List<String> list, String str) {
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (String str2 : list) {
            if (z) {
                z = false;
            } else {
                sb.append(str);
            }
            sb.append(str2);
        }
        return sb.toString();
    }
}

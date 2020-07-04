package com.p280ss.android.ugc.gamora.recorder;

import android.content.Intent;
import com.bytedance.jedi.arch.C11670t;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.p280ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.p280ss.android.ugc.aweme.tools.C42581q;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.p280ss.android.ugc.gamora.bottomtab.C43865a;
import com.p280ss.android.ugc.gamora.jedi.C44403b;
import com.p280ss.android.ugc.gamora.jedi.C44409e;
import com.p280ss.android.ugc.gamora.jedi.C44412h;
import com.p280ss.android.ugc.gamora.jedi.C44413i;
import kotlin.Triple;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.gamora.recorder.RecordViewState */
public final class RecordViewState implements C11670t {
    private final boolean beauty;
    private final C44409e bottomTab;
    private final C43865a bottomTabChange;
    private final Boolean chooseMusicEnable;
    private final C42581q commerceTag;
    private final Boolean countDown;
    private final C44412h filter;
    private final Boolean moreCommands;
    private final Boolean musicCut;
    private final C44403b<Triple<Integer, Integer, Intent>> onActivityResult;
    private final Boolean recordContentShow;
    private final C44413i<Boolean> relayout;
    private final Integer showLiveTag;
    private final Integer speedGroup;
    private final FaceStickerBean stickerToLive;
    private final C44413i<Boolean> topMargin;

    public RecordViewState() {
        this(null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, 65535, null);
    }

    public static /* synthetic */ RecordViewState copy$default(RecordViewState recordViewState, Boolean bool, Integer num, Boolean bool2, Boolean bool3, C42581q qVar, C44412h hVar, boolean z, C44409e eVar, C44413i iVar, C44413i iVar2, Boolean bool4, C44403b bVar, C43865a aVar, Boolean bool5, Integer num2, FaceStickerBean faceStickerBean, int i, Object obj) {
        RecordViewState recordViewState2 = recordViewState;
        int i2 = i;
        return recordViewState.copy((i2 & 1) != 0 ? recordViewState2.moreCommands : bool, (i2 & 2) != 0 ? recordViewState2.speedGroup : num, (i2 & 4) != 0 ? recordViewState2.musicCut : bool2, (i2 & 8) != 0 ? recordViewState2.countDown : bool3, (i2 & 16) != 0 ? recordViewState2.commerceTag : qVar, (i2 & 32) != 0 ? recordViewState2.filter : hVar, (i2 & 64) != 0 ? recordViewState2.beauty : z, (i2 & PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH) != 0 ? recordViewState2.bottomTab : eVar, (i2 & 256) != 0 ? recordViewState2.relayout : iVar, (i2 & 512) != 0 ? recordViewState2.topMargin : iVar2, (i2 & PreloadTask.BYTE_UNIT_NUMBER) != 0 ? recordViewState2.recordContentShow : bool4, (i2 & 2048) != 0 ? recordViewState2.onActivityResult : bVar, (i2 & 4096) != 0 ? recordViewState2.bottomTabChange : aVar, (i2 & VideoCacheReadBuffersizeExperiment.DEFAULT) != 0 ? recordViewState2.chooseMusicEnable : bool5, (i2 & 16384) != 0 ? recordViewState2.showLiveTag : num2, (i2 & 32768) != 0 ? recordViewState2.stickerToLive : faceStickerBean);
    }

    public final Boolean component1() {
        return this.moreCommands;
    }

    public final C44413i<Boolean> component10() {
        return this.topMargin;
    }

    public final Boolean component11() {
        return this.recordContentShow;
    }

    public final C44403b<Triple<Integer, Integer, Intent>> component12() {
        return this.onActivityResult;
    }

    public final C43865a component13() {
        return this.bottomTabChange;
    }

    public final Boolean component14() {
        return this.chooseMusicEnable;
    }

    public final Integer component15() {
        return this.showLiveTag;
    }

    public final FaceStickerBean component16() {
        return this.stickerToLive;
    }

    public final Integer component2() {
        return this.speedGroup;
    }

    public final Boolean component3() {
        return this.musicCut;
    }

    public final Boolean component4() {
        return this.countDown;
    }

    public final C42581q component5() {
        return this.commerceTag;
    }

    public final C44412h component6() {
        return this.filter;
    }

    public final boolean component7() {
        return this.beauty;
    }

    public final C44409e component8() {
        return this.bottomTab;
    }

    public final C44413i<Boolean> component9() {
        return this.relayout;
    }

    public final RecordViewState copy(Boolean bool, Integer num, Boolean bool2, Boolean bool3, C42581q qVar, C44412h hVar, boolean z, C44409e eVar, C44413i<Boolean> iVar, C44413i<Boolean> iVar2, Boolean bool4, C44403b<? extends Triple<Integer, Integer, ? extends Intent>> bVar, C43865a aVar, Boolean bool5, Integer num2, FaceStickerBean faceStickerBean) {
        RecordViewState recordViewState = new RecordViewState(bool, num, bool2, bool3, qVar, hVar, z, eVar, iVar, iVar2, bool4, bVar, aVar, bool5, num2, faceStickerBean);
        return recordViewState;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof RecordViewState) {
                RecordViewState recordViewState = (RecordViewState) obj;
                if (C7573i.m23585a((Object) this.moreCommands, (Object) recordViewState.moreCommands) && C7573i.m23585a((Object) this.speedGroup, (Object) recordViewState.speedGroup) && C7573i.m23585a((Object) this.musicCut, (Object) recordViewState.musicCut) && C7573i.m23585a((Object) this.countDown, (Object) recordViewState.countDown) && C7573i.m23585a((Object) this.commerceTag, (Object) recordViewState.commerceTag) && C7573i.m23585a((Object) this.filter, (Object) recordViewState.filter)) {
                    if (!(this.beauty == recordViewState.beauty) || !C7573i.m23585a((Object) this.bottomTab, (Object) recordViewState.bottomTab) || !C7573i.m23585a((Object) this.relayout, (Object) recordViewState.relayout) || !C7573i.m23585a((Object) this.topMargin, (Object) recordViewState.topMargin) || !C7573i.m23585a((Object) this.recordContentShow, (Object) recordViewState.recordContentShow) || !C7573i.m23585a((Object) this.onActivityResult, (Object) recordViewState.onActivityResult) || !C7573i.m23585a((Object) this.bottomTabChange, (Object) recordViewState.bottomTabChange) || !C7573i.m23585a((Object) this.chooseMusicEnable, (Object) recordViewState.chooseMusicEnable) || !C7573i.m23585a((Object) this.showLiveTag, (Object) recordViewState.showLiveTag) || !C7573i.m23585a((Object) this.stickerToLive, (Object) recordViewState.stickerToLive)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final boolean getBeauty() {
        return this.beauty;
    }

    public final C44409e getBottomTab() {
        return this.bottomTab;
    }

    public final C43865a getBottomTabChange() {
        return this.bottomTabChange;
    }

    public final Boolean getChooseMusicEnable() {
        return this.chooseMusicEnable;
    }

    public final C42581q getCommerceTag() {
        return this.commerceTag;
    }

    public final Boolean getCountDown() {
        return this.countDown;
    }

    public final C44412h getFilter() {
        return this.filter;
    }

    public final Boolean getMoreCommands() {
        return this.moreCommands;
    }

    public final Boolean getMusicCut() {
        return this.musicCut;
    }

    public final C44403b<Triple<Integer, Integer, Intent>> getOnActivityResult() {
        return this.onActivityResult;
    }

    public final Boolean getRecordContentShow() {
        return this.recordContentShow;
    }

    public final C44413i<Boolean> getRelayout() {
        return this.relayout;
    }

    public final Integer getShowLiveTag() {
        return this.showLiveTag;
    }

    public final Integer getSpeedGroup() {
        return this.speedGroup;
    }

    public final FaceStickerBean getStickerToLive() {
        return this.stickerToLive;
    }

    public final C44413i<Boolean> getTopMargin() {
        return this.topMargin;
    }

    public final int hashCode() {
        Boolean bool = this.moreCommands;
        int i = 0;
        int hashCode = (bool != null ? bool.hashCode() : 0) * 31;
        Integer num = this.speedGroup;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        Boolean bool2 = this.musicCut;
        int hashCode3 = (hashCode2 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        Boolean bool3 = this.countDown;
        int hashCode4 = (hashCode3 + (bool3 != null ? bool3.hashCode() : 0)) * 31;
        C42581q qVar = this.commerceTag;
        int hashCode5 = (hashCode4 + (qVar != null ? qVar.hashCode() : 0)) * 31;
        C44412h hVar = this.filter;
        int hashCode6 = (hashCode5 + (hVar != null ? hVar.hashCode() : 0)) * 31;
        boolean z = this.beauty;
        if (z) {
            z = true;
        }
        int i2 = (hashCode6 + (z ? 1 : 0)) * 31;
        C44409e eVar = this.bottomTab;
        int hashCode7 = (i2 + (eVar != null ? eVar.hashCode() : 0)) * 31;
        C44413i<Boolean> iVar = this.relayout;
        int hashCode8 = (hashCode7 + (iVar != null ? iVar.hashCode() : 0)) * 31;
        C44413i<Boolean> iVar2 = this.topMargin;
        int hashCode9 = (hashCode8 + (iVar2 != null ? iVar2.hashCode() : 0)) * 31;
        Boolean bool4 = this.recordContentShow;
        int hashCode10 = (hashCode9 + (bool4 != null ? bool4.hashCode() : 0)) * 31;
        C44403b<Triple<Integer, Integer, Intent>> bVar = this.onActivityResult;
        int hashCode11 = (hashCode10 + (bVar != null ? bVar.hashCode() : 0)) * 31;
        C43865a aVar = this.bottomTabChange;
        int hashCode12 = (hashCode11 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        Boolean bool5 = this.chooseMusicEnable;
        int hashCode13 = (hashCode12 + (bool5 != null ? bool5.hashCode() : 0)) * 31;
        Integer num2 = this.showLiveTag;
        int hashCode14 = (hashCode13 + (num2 != null ? num2.hashCode() : 0)) * 31;
        FaceStickerBean faceStickerBean = this.stickerToLive;
        if (faceStickerBean != null) {
            i = faceStickerBean.hashCode();
        }
        return hashCode14 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RecordViewState(moreCommands=");
        sb.append(this.moreCommands);
        sb.append(", speedGroup=");
        sb.append(this.speedGroup);
        sb.append(", musicCut=");
        sb.append(this.musicCut);
        sb.append(", countDown=");
        sb.append(this.countDown);
        sb.append(", commerceTag=");
        sb.append(this.commerceTag);
        sb.append(", filter=");
        sb.append(this.filter);
        sb.append(", beauty=");
        sb.append(this.beauty);
        sb.append(", bottomTab=");
        sb.append(this.bottomTab);
        sb.append(", relayout=");
        sb.append(this.relayout);
        sb.append(", topMargin=");
        sb.append(this.topMargin);
        sb.append(", recordContentShow=");
        sb.append(this.recordContentShow);
        sb.append(", onActivityResult=");
        sb.append(this.onActivityResult);
        sb.append(", bottomTabChange=");
        sb.append(this.bottomTabChange);
        sb.append(", chooseMusicEnable=");
        sb.append(this.chooseMusicEnable);
        sb.append(", showLiveTag=");
        sb.append(this.showLiveTag);
        sb.append(", stickerToLive=");
        sb.append(this.stickerToLive);
        sb.append(")");
        return sb.toString();
    }

    public RecordViewState(Boolean bool, Integer num, Boolean bool2, Boolean bool3, C42581q qVar, C44412h hVar, boolean z, C44409e eVar, C44413i<Boolean> iVar, C44413i<Boolean> iVar2, Boolean bool4, C44403b<? extends Triple<Integer, Integer, ? extends Intent>> bVar, C43865a aVar, Boolean bool5, Integer num2, FaceStickerBean faceStickerBean) {
        this.moreCommands = bool;
        this.speedGroup = num;
        this.musicCut = bool2;
        this.countDown = bool3;
        this.commerceTag = qVar;
        this.filter = hVar;
        this.beauty = z;
        this.bottomTab = eVar;
        this.relayout = iVar;
        this.topMargin = iVar2;
        this.recordContentShow = bool4;
        this.onActivityResult = bVar;
        this.bottomTabChange = aVar;
        this.chooseMusicEnable = bool5;
        this.showLiveTag = num2;
        this.stickerToLive = faceStickerBean;
    }

    public /* synthetic */ RecordViewState(Boolean bool, Integer num, Boolean bool2, Boolean bool3, C42581q qVar, C44412h hVar, boolean z, C44409e eVar, C44413i iVar, C44413i iVar2, Boolean bool4, C44403b bVar, C43865a aVar, Boolean bool5, Integer num2, FaceStickerBean faceStickerBean, int i, C7571f fVar) {
        Boolean bool6;
        Integer num3;
        Boolean bool7;
        Boolean bool8;
        C42581q qVar2;
        C44412h hVar2;
        boolean z2;
        C44409e eVar2;
        C44413i iVar3;
        C44413i iVar4;
        Boolean bool9;
        C44403b bVar2;
        C43865a aVar2;
        Boolean bool10;
        Integer num4;
        FaceStickerBean faceStickerBean2;
        int i2 = i;
        if ((i2 & 1) != 0) {
            bool6 = null;
        } else {
            bool6 = bool;
        }
        if ((i2 & 2) != 0) {
            num3 = null;
        } else {
            num3 = num;
        }
        if ((i2 & 4) != 0) {
            bool7 = null;
        } else {
            bool7 = bool2;
        }
        if ((i2 & 8) != 0) {
            bool8 = null;
        } else {
            bool8 = bool3;
        }
        if ((i2 & 16) != 0) {
            qVar2 = null;
        } else {
            qVar2 = qVar;
        }
        if ((i2 & 32) != 0) {
            hVar2 = null;
        } else {
            hVar2 = hVar;
        }
        if ((i2 & 64) != 0) {
            z2 = false;
        } else {
            z2 = z;
        }
        if ((i2 & PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH) != 0) {
            eVar2 = null;
        } else {
            eVar2 = eVar;
        }
        if ((i2 & 256) != 0) {
            iVar3 = null;
        } else {
            iVar3 = iVar;
        }
        if ((i2 & 512) != 0) {
            iVar4 = null;
        } else {
            iVar4 = iVar2;
        }
        if ((i2 & PreloadTask.BYTE_UNIT_NUMBER) != 0) {
            bool9 = null;
        } else {
            bool9 = bool4;
        }
        if ((i2 & 2048) != 0) {
            bVar2 = null;
        } else {
            bVar2 = bVar;
        }
        if ((i2 & 4096) != 0) {
            aVar2 = null;
        } else {
            aVar2 = aVar;
        }
        if ((i2 & VideoCacheReadBuffersizeExperiment.DEFAULT) != 0) {
            bool10 = null;
        } else {
            bool10 = bool5;
        }
        if ((i2 & 16384) != 0) {
            num4 = null;
        } else {
            num4 = num2;
        }
        if ((i2 & 32768) != 0) {
            faceStickerBean2 = null;
        } else {
            faceStickerBean2 = faceStickerBean;
        }
        this(bool6, num3, bool7, bool8, qVar2, hVar2, z2, eVar2, iVar3, iVar4, bool9, bVar2, aVar2, bool10, num4, faceStickerBean2);
    }
}

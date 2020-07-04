package com.p280ss.android.ugc.aweme.services.publish;

import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.C0063u;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.aweme.services.publish.ExtensionDataRepo */
public final class ExtensionDataRepo extends C0063u {
    private C7561a<C7581n> addStarAtlasTag = ExtensionDataRepo$addStarAtlasTag$1.INSTANCE;
    private final C0052o<Boolean> anchorState;
    private final C0052o<Boolean> goodsState;
    private final C0052o<Boolean> i18nPrivacy;
    private final C0052o<Boolean> i18nStarAtlasClosed;
    private IPermissionAction iPermissionAction;
    private final C0052o<Boolean> isGoodsAdd;
    private final C0052o<Boolean> isPoiAdd;
    private final C0052o<Boolean> linkState;
    private final C0052o<Boolean> locationActivityVisible;
    private final C0052o<Boolean> locationState;
    private C7561a<C7581n> recordLinkAction = ExtensionDataRepo$recordLinkAction$1.INSTANCE;
    private C7561a<C7581n> removeStarAtlasTag = ExtensionDataRepo$removeStarAtlasTag$1.INSTANCE;
    private C7561a<C7581n> resetAnchor = ExtensionDataRepo$resetAnchor$1.INSTANCE;
    private C7561a<C7581n> resetGoodsAction = ExtensionDataRepo$resetGoodsAction$1.INSTANCE;
    private C7561a<C7581n> resetLinkAction = ExtensionDataRepo$resetLinkAction$1.INSTANCE;
    private C7561a<C7581n> resetPoiAction = ExtensionDataRepo$resetPoiAction$1.INSTANCE;
    private C7562b<? super String, C7581n> restoreGoodsPublishModel = ExtensionDataRepo$restoreGoodsPublishModel$1.INSTANCE;
    private C7561a<C7581n> revertLinkAction = ExtensionDataRepo$revertLinkAction$1.INSTANCE;
    private C7562b<? super String, C7581n> setPoiActivity = ExtensionDataRepo$setPoiActivity$1.INSTANCE;
    private C7562b<? super Integer, Boolean> showPermissionAction;
    private final C0052o<Boolean> starAtlasState;
    private C0052o<AnchorTransData> updateAnchor = new C0052o<>();
    private C7562b<? super String, C7581n> updateLink = ExtensionDataRepo$updateLink$1.INSTANCE;
    private C7562b<? super String, C7581n> updatePoiContext = ExtensionDataRepo$updatePoiContext$1.INSTANCE;
    private final C0052o<Boolean> withStarAtlasAnchor;
    private final C0052o<Boolean> withStarAtlasOrderGoods;
    private final C0052o<Boolean> withStarAtlasOrderLink;
    private final C0052o<Boolean> withStarAtlasOrderPoi;

    public final C7561a<C7581n> getAddStarAtlasTag() {
        return this.addStarAtlasTag;
    }

    public final C0052o<Boolean> getAnchorState() {
        return this.anchorState;
    }

    public final C0052o<Boolean> getGoodsState() {
        return this.goodsState;
    }

    public final C0052o<Boolean> getI18nPrivacy() {
        return this.i18nPrivacy;
    }

    public final C0052o<Boolean> getI18nStarAtlasClosed() {
        return this.i18nStarAtlasClosed;
    }

    public final IPermissionAction getIPermissionAction() {
        return this.iPermissionAction;
    }

    public final C0052o<Boolean> getLinkState() {
        return this.linkState;
    }

    public final C0052o<Boolean> getLocationActivityVisible() {
        return this.locationActivityVisible;
    }

    public final C0052o<Boolean> getLocationState() {
        return this.locationState;
    }

    public final C7561a<C7581n> getRecordLinkAction() {
        return this.recordLinkAction;
    }

    public final C7561a<C7581n> getRemoveStarAtlasTag() {
        return this.removeStarAtlasTag;
    }

    public final C7561a<C7581n> getResetAnchor() {
        return this.resetAnchor;
    }

    public final C7561a<C7581n> getResetGoodsAction() {
        return this.resetGoodsAction;
    }

    public final C7561a<C7581n> getResetLinkAction() {
        return this.resetLinkAction;
    }

    public final C7561a<C7581n> getResetPoiAction() {
        return this.resetPoiAction;
    }

    public final C7562b<String, C7581n> getRestoreGoodsPublishModel() {
        return this.restoreGoodsPublishModel;
    }

    public final C7561a<C7581n> getRevertLinkAction() {
        return this.revertLinkAction;
    }

    public final C7562b<String, C7581n> getSetPoiActivity() {
        return this.setPoiActivity;
    }

    public final C7562b<Integer, Boolean> getShowPermissionAction() {
        return this.showPermissionAction;
    }

    public final C0052o<Boolean> getStarAtlasState() {
        return this.starAtlasState;
    }

    public final C0052o<AnchorTransData> getUpdateAnchor() {
        return this.updateAnchor;
    }

    public final C7562b<String, C7581n> getUpdateLink() {
        return this.updateLink;
    }

    public final C7562b<String, C7581n> getUpdatePoiContext() {
        return this.updatePoiContext;
    }

    public final C0052o<Boolean> getWithStarAtlasAnchor() {
        return this.withStarAtlasAnchor;
    }

    public final C0052o<Boolean> getWithStarAtlasOrderGoods() {
        return this.withStarAtlasOrderGoods;
    }

    public final C0052o<Boolean> getWithStarAtlasOrderLink() {
        return this.withStarAtlasOrderLink;
    }

    public final C0052o<Boolean> getWithStarAtlasOrderPoi() {
        return this.withStarAtlasOrderPoi;
    }

    public final C0052o<Boolean> isGoodsAdd() {
        return this.isGoodsAdd;
    }

    public final C0052o<Boolean> isPoiAdd() {
        return this.isPoiAdd;
    }

    public ExtensionDataRepo() {
        C0052o<Boolean> oVar = new C0052o<>();
        oVar.setValue(Boolean.valueOf(false));
        this.isGoodsAdd = oVar;
        C0052o<Boolean> oVar2 = new C0052o<>();
        oVar2.setValue(Boolean.valueOf(false));
        this.isPoiAdd = oVar2;
        C0052o<Boolean> oVar3 = new C0052o<>();
        oVar3.setValue(Boolean.valueOf(false));
        this.withStarAtlasOrderPoi = oVar3;
        C0052o<Boolean> oVar4 = new C0052o<>();
        oVar4.setValue(Boolean.valueOf(false));
        this.withStarAtlasOrderGoods = oVar4;
        C0052o<Boolean> oVar5 = new C0052o<>();
        oVar5.setValue(Boolean.valueOf(false));
        this.withStarAtlasOrderLink = oVar5;
        C0052o<Boolean> oVar6 = new C0052o<>();
        oVar6.setValue(Boolean.valueOf(false));
        this.withStarAtlasAnchor = oVar6;
        C0052o<Boolean> oVar7 = new C0052o<>();
        oVar7.setValue(Boolean.valueOf(true));
        this.i18nPrivacy = oVar7;
        C0052o<Boolean> oVar8 = new C0052o<>();
        oVar8.setValue(Boolean.valueOf(true));
        this.i18nStarAtlasClosed = oVar8;
        C0052o<Boolean> oVar9 = new C0052o<>();
        oVar9.setValue(Boolean.valueOf(true));
        this.starAtlasState = oVar9;
        C0052o<Boolean> oVar10 = new C0052o<>();
        oVar10.setValue(Boolean.valueOf(true));
        this.locationState = oVar10;
        C0052o<Boolean> oVar11 = new C0052o<>();
        oVar11.setValue(Boolean.valueOf(true));
        this.goodsState = oVar11;
        C0052o<Boolean> oVar12 = new C0052o<>();
        oVar12.setValue(Boolean.valueOf(true));
        this.linkState = oVar12;
        C0052o<Boolean> oVar13 = new C0052o<>();
        oVar13.setValue(Boolean.valueOf(false));
        this.locationActivityVisible = oVar13;
        C0052o<Boolean> oVar14 = new C0052o<>();
        oVar14.setValue(Boolean.valueOf(true));
        this.anchorState = oVar14;
    }

    public final void setIPermissionAction(IPermissionAction iPermissionAction2) {
        this.iPermissionAction = iPermissionAction2;
    }

    public final void setShowPermissionAction(C7562b<? super Integer, Boolean> bVar) {
        this.showPermissionAction = bVar;
    }

    public final void setAddStarAtlasTag(C7561a<C7581n> aVar) {
        C7573i.m23587b(aVar, "<set-?>");
        this.addStarAtlasTag = aVar;
    }

    public final void setRecordLinkAction(C7561a<C7581n> aVar) {
        C7573i.m23587b(aVar, "<set-?>");
        this.recordLinkAction = aVar;
    }

    public final void setRemoveStarAtlasTag(C7561a<C7581n> aVar) {
        C7573i.m23587b(aVar, "<set-?>");
        this.removeStarAtlasTag = aVar;
    }

    public final void setResetAnchor(C7561a<C7581n> aVar) {
        C7573i.m23587b(aVar, "<set-?>");
        this.resetAnchor = aVar;
    }

    public final void setResetGoodsAction(C7561a<C7581n> aVar) {
        C7573i.m23587b(aVar, "<set-?>");
        this.resetGoodsAction = aVar;
    }

    public final void setResetLinkAction(C7561a<C7581n> aVar) {
        C7573i.m23587b(aVar, "<set-?>");
        this.resetLinkAction = aVar;
    }

    public final void setResetPoiAction(C7561a<C7581n> aVar) {
        C7573i.m23587b(aVar, "<set-?>");
        this.resetPoiAction = aVar;
    }

    public final void setRestoreGoodsPublishModel(C7562b<? super String, C7581n> bVar) {
        C7573i.m23587b(bVar, "<set-?>");
        this.restoreGoodsPublishModel = bVar;
    }

    public final void setRevertLinkAction(C7561a<C7581n> aVar) {
        C7573i.m23587b(aVar, "<set-?>");
        this.revertLinkAction = aVar;
    }

    public final void setSetPoiActivity(C7562b<? super String, C7581n> bVar) {
        C7573i.m23587b(bVar, "<set-?>");
        this.setPoiActivity = bVar;
    }

    public final void setUpdateAnchor(C0052o<AnchorTransData> oVar) {
        C7573i.m23587b(oVar, "<set-?>");
        this.updateAnchor = oVar;
    }

    public final void setUpdateLink(C7562b<? super String, C7581n> bVar) {
        C7573i.m23587b(bVar, "<set-?>");
        this.updateLink = bVar;
    }

    public final void setUpdatePoiContext(C7562b<? super String, C7581n> bVar) {
        C7573i.m23587b(bVar, "<set-?>");
        this.updatePoiContext = bVar;
    }
}

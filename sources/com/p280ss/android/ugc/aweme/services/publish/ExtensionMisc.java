package com.p280ss.android.ugc.aweme.services.publish;

import com.p280ss.android.ugc.aweme.draft.model.DefaultSelectStickerPoi;
import com.p280ss.android.ugc.aweme.port.p1479in.C35541ai.C35542a;
import com.p280ss.android.ugc.aweme.shortvideo.edit.MicroAppModel;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.services.publish.ExtensionMisc */
public final class ExtensionMisc {
    private final String candidateLog;
    private final DefaultSelectStickerPoi defaultSelectStickerPoi;
    private final ExtensionDataRepo extensionDataRepo;
    private final MobParam mobParam;
    private final String poiContext;
    private final C35542a publishExtensionDataContainer;
    private final MicroAppModel transMicroAppInfo;

    public static /* synthetic */ ExtensionMisc copy$default(ExtensionMisc extensionMisc, String str, DefaultSelectStickerPoi defaultSelectStickerPoi2, String str2, MicroAppModel microAppModel, C35542a aVar, ExtensionDataRepo extensionDataRepo2, MobParam mobParam2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = extensionMisc.candidateLog;
        }
        if ((i & 2) != 0) {
            defaultSelectStickerPoi2 = extensionMisc.defaultSelectStickerPoi;
        }
        DefaultSelectStickerPoi defaultSelectStickerPoi3 = defaultSelectStickerPoi2;
        if ((i & 4) != 0) {
            str2 = extensionMisc.poiContext;
        }
        String str3 = str2;
        if ((i & 8) != 0) {
            microAppModel = extensionMisc.transMicroAppInfo;
        }
        MicroAppModel microAppModel2 = microAppModel;
        if ((i & 16) != 0) {
            aVar = extensionMisc.publishExtensionDataContainer;
        }
        C35542a aVar2 = aVar;
        if ((i & 32) != 0) {
            extensionDataRepo2 = extensionMisc.extensionDataRepo;
        }
        ExtensionDataRepo extensionDataRepo3 = extensionDataRepo2;
        if ((i & 64) != 0) {
            mobParam2 = extensionMisc.mobParam;
        }
        return extensionMisc.copy(str, defaultSelectStickerPoi3, str3, microAppModel2, aVar2, extensionDataRepo3, mobParam2);
    }

    public final String component1() {
        return this.candidateLog;
    }

    public final DefaultSelectStickerPoi component2() {
        return this.defaultSelectStickerPoi;
    }

    public final String component3() {
        return this.poiContext;
    }

    public final MicroAppModel component4() {
        return this.transMicroAppInfo;
    }

    public final C35542a component5() {
        return this.publishExtensionDataContainer;
    }

    public final ExtensionDataRepo component6() {
        return this.extensionDataRepo;
    }

    public final MobParam component7() {
        return this.mobParam;
    }

    public final ExtensionMisc copy(String str, DefaultSelectStickerPoi defaultSelectStickerPoi2, String str2, MicroAppModel microAppModel, C35542a aVar, ExtensionDataRepo extensionDataRepo2, MobParam mobParam2) {
        ExtensionDataRepo extensionDataRepo3 = extensionDataRepo2;
        C7573i.m23587b(extensionDataRepo2, "extensionDataRepo");
        MobParam mobParam3 = mobParam2;
        C7573i.m23587b(mobParam3, "mobParam");
        ExtensionMisc extensionMisc = new ExtensionMisc(str, defaultSelectStickerPoi2, str2, microAppModel, aVar, extensionDataRepo3, mobParam3);
        return extensionMisc;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004c, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.mobParam, (java.lang.Object) r3.mobParam) != false) goto L_0x0051;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0051
            boolean r0 = r3 instanceof com.p280ss.android.ugc.aweme.services.publish.ExtensionMisc
            if (r0 == 0) goto L_0x004f
            com.ss.android.ugc.aweme.services.publish.ExtensionMisc r3 = (com.p280ss.android.ugc.aweme.services.publish.ExtensionMisc) r3
            java.lang.String r0 = r2.candidateLog
            java.lang.String r1 = r3.candidateLog
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x004f
            com.ss.android.ugc.aweme.draft.model.DefaultSelectStickerPoi r0 = r2.defaultSelectStickerPoi
            com.ss.android.ugc.aweme.draft.model.DefaultSelectStickerPoi r1 = r3.defaultSelectStickerPoi
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x004f
            java.lang.String r0 = r2.poiContext
            java.lang.String r1 = r3.poiContext
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x004f
            com.ss.android.ugc.aweme.shortvideo.edit.MicroAppModel r0 = r2.transMicroAppInfo
            com.ss.android.ugc.aweme.shortvideo.edit.MicroAppModel r1 = r3.transMicroAppInfo
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x004f
            com.ss.android.ugc.aweme.port.in.ai$a r0 = r2.publishExtensionDataContainer
            com.ss.android.ugc.aweme.port.in.ai$a r1 = r3.publishExtensionDataContainer
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x004f
            com.ss.android.ugc.aweme.services.publish.ExtensionDataRepo r0 = r2.extensionDataRepo
            com.ss.android.ugc.aweme.services.publish.ExtensionDataRepo r1 = r3.extensionDataRepo
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x004f
            com.ss.android.ugc.aweme.services.publish.MobParam r0 = r2.mobParam
            com.ss.android.ugc.aweme.services.publish.MobParam r3 = r3.mobParam
            boolean r3 = kotlin.jvm.internal.C7573i.m23585a(r0, r3)
            if (r3 == 0) goto L_0x004f
            goto L_0x0051
        L_0x004f:
            r3 = 0
            return r3
        L_0x0051:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.services.publish.ExtensionMisc.equals(java.lang.Object):boolean");
    }

    public final String getCandidateLog() {
        return this.candidateLog;
    }

    public final DefaultSelectStickerPoi getDefaultSelectStickerPoi() {
        return this.defaultSelectStickerPoi;
    }

    public final ExtensionDataRepo getExtensionDataRepo() {
        return this.extensionDataRepo;
    }

    public final MobParam getMobParam() {
        return this.mobParam;
    }

    public final String getPoiContext() {
        return this.poiContext;
    }

    public final C35542a getPublishExtensionDataContainer() {
        return this.publishExtensionDataContainer;
    }

    public final MicroAppModel getTransMicroAppInfo() {
        return this.transMicroAppInfo;
    }

    public final int hashCode() {
        String str = this.candidateLog;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        DefaultSelectStickerPoi defaultSelectStickerPoi2 = this.defaultSelectStickerPoi;
        int hashCode2 = (hashCode + (defaultSelectStickerPoi2 != null ? defaultSelectStickerPoi2.hashCode() : 0)) * 31;
        String str2 = this.poiContext;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        MicroAppModel microAppModel = this.transMicroAppInfo;
        int hashCode4 = (hashCode3 + (microAppModel != null ? microAppModel.hashCode() : 0)) * 31;
        C35542a aVar = this.publishExtensionDataContainer;
        int hashCode5 = (hashCode4 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        ExtensionDataRepo extensionDataRepo2 = this.extensionDataRepo;
        int hashCode6 = (hashCode5 + (extensionDataRepo2 != null ? extensionDataRepo2.hashCode() : 0)) * 31;
        MobParam mobParam2 = this.mobParam;
        if (mobParam2 != null) {
            i = mobParam2.hashCode();
        }
        return hashCode6 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExtensionMisc(candidateLog=");
        sb.append(this.candidateLog);
        sb.append(", defaultSelectStickerPoi=");
        sb.append(this.defaultSelectStickerPoi);
        sb.append(", poiContext=");
        sb.append(this.poiContext);
        sb.append(", transMicroAppInfo=");
        sb.append(this.transMicroAppInfo);
        sb.append(", publishExtensionDataContainer=");
        sb.append(this.publishExtensionDataContainer);
        sb.append(", extensionDataRepo=");
        sb.append(this.extensionDataRepo);
        sb.append(", mobParam=");
        sb.append(this.mobParam);
        sb.append(")");
        return sb.toString();
    }

    public ExtensionMisc(String str, DefaultSelectStickerPoi defaultSelectStickerPoi2, String str2, MicroAppModel microAppModel, C35542a aVar, ExtensionDataRepo extensionDataRepo2, MobParam mobParam2) {
        C7573i.m23587b(extensionDataRepo2, "extensionDataRepo");
        C7573i.m23587b(mobParam2, "mobParam");
        this.candidateLog = str;
        this.defaultSelectStickerPoi = defaultSelectStickerPoi2;
        this.poiContext = str2;
        this.transMicroAppInfo = microAppModel;
        this.publishExtensionDataContainer = aVar;
        this.extensionDataRepo = extensionDataRepo2;
        this.mobParam = mobParam2;
    }
}

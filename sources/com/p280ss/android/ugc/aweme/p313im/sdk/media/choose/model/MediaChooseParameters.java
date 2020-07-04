package com.p280ss.android.ugc.aweme.p313im.sdk.media.choose.model;

import com.p280ss.android.ugc.aweme.p313im.sdk.media.model.MediaModel;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.model.MediaChooseParameters */
public final class MediaChooseParameters implements Serializable {
    public static final C31401a Companion = new C31401a(null);
    public static final C7541d DEFAULT$delegate = C7546e.m23569a(C31402b.f82251a);
    private final int chooseType;
    private final ArrayList<MediaModel> selectedList;
    private final boolean sendRaw;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.model.MediaChooseParameters$a */
    public static final class C31401a {

        /* renamed from: a */
        static final /* synthetic */ C7595j[] f82250a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C31401a.class), "DEFAULT", "getDEFAULT()Lcom/ss/android/ugc/aweme/im/sdk/media/choose/model/MediaChooseParameters;"))};

        private C31401a() {
        }

        /* renamed from: a */
        public static MediaChooseParameters m102170a() {
            return (MediaChooseParameters) MediaChooseParameters.DEFAULT$delegate.getValue();
        }

        public /* synthetic */ C31401a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.model.MediaChooseParameters$b */
    static final class C31402b extends Lambda implements C7561a<MediaChooseParameters> {

        /* renamed from: a */
        public static final C31402b f82251a = new C31402b();

        C31402b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return m102171a();
        }

        /* renamed from: a */
        private static MediaChooseParameters m102171a() {
            return new MediaChooseParameters(1, false, new ArrayList());
        }
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.ArrayList, code=java.util.ArrayList<com.ss.android.ugc.aweme.im.sdk.media.model.MediaModel>, for r3v0, types: [java.util.ArrayList] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.p280ss.android.ugc.aweme.p313im.sdk.media.choose.model.MediaChooseParameters copy$default(com.p280ss.android.ugc.aweme.p313im.sdk.media.choose.model.MediaChooseParameters r0, int r1, boolean r2, java.util.ArrayList<com.p280ss.android.ugc.aweme.p313im.sdk.media.model.MediaModel> r3, int r4, java.lang.Object r5) {
        /*
            r5 = r4 & 1
            if (r5 == 0) goto L_0x0006
            int r1 = r0.chooseType
        L_0x0006:
            r5 = r4 & 2
            if (r5 == 0) goto L_0x000c
            boolean r2 = r0.sendRaw
        L_0x000c:
            r4 = r4 & 4
            if (r4 == 0) goto L_0x0012
            java.util.ArrayList<com.ss.android.ugc.aweme.im.sdk.media.model.MediaModel> r3 = r0.selectedList
        L_0x0012:
            com.ss.android.ugc.aweme.im.sdk.media.choose.model.MediaChooseParameters r0 = r0.copy(r1, r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p313im.sdk.media.choose.model.MediaChooseParameters.copy$default(com.ss.android.ugc.aweme.im.sdk.media.choose.model.MediaChooseParameters, int, boolean, java.util.ArrayList, int, java.lang.Object):com.ss.android.ugc.aweme.im.sdk.media.choose.model.MediaChooseParameters");
    }

    public static final MediaChooseParameters getDEFAULT() {
        return C31401a.m102170a();
    }

    public final int component1() {
        return this.chooseType;
    }

    public final boolean component2() {
        return this.sendRaw;
    }

    public final ArrayList<MediaModel> component3() {
        return this.selectedList;
    }

    public final MediaChooseParameters copy(int i, boolean z, ArrayList<MediaModel> arrayList) {
        C7573i.m23587b(arrayList, "selectedList");
        return new MediaChooseParameters(i, z, arrayList);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MediaChooseParameters) {
                MediaChooseParameters mediaChooseParameters = (MediaChooseParameters) obj;
                if (this.chooseType == mediaChooseParameters.chooseType) {
                    if (!(this.sendRaw == mediaChooseParameters.sendRaw) || !C7573i.m23585a((Object) this.selectedList, (Object) mediaChooseParameters.selectedList)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int getChooseType() {
        return this.chooseType;
    }

    public final ArrayList<MediaModel> getSelectedList() {
        return this.selectedList;
    }

    public final boolean getSendRaw() {
        return this.sendRaw;
    }

    public final int hashCode() {
        int i = this.chooseType * 31;
        boolean z = this.sendRaw;
        if (z) {
            z = true;
        }
        int i2 = (i + (z ? 1 : 0)) * 31;
        ArrayList<MediaModel> arrayList = this.selectedList;
        return i2 + (arrayList != null ? arrayList.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaChooseParameters(chooseType=");
        sb.append(this.chooseType);
        sb.append(", sendRaw=");
        sb.append(this.sendRaw);
        sb.append(", selectedList=");
        sb.append(this.selectedList);
        sb.append(")");
        return sb.toString();
    }

    public final boolean isImageOrGif() {
        if ((this.chooseType & 1) != 0 || supportGif()) {
            return true;
        }
        return false;
    }

    public final boolean isImageVideoMix() {
        if ((this.chooseType & 1) == 0 || (this.chooseType & 16) == 0) {
            return false;
        }
        return true;
    }

    public final boolean supportGif() {
        if ((this.chooseType & 256) != 0) {
            return true;
        }
        return false;
    }

    public MediaChooseParameters(int i, boolean z, ArrayList<MediaModel> arrayList) {
        C7573i.m23587b(arrayList, "selectedList");
        this.chooseType = i;
        this.sendRaw = z;
        this.selectedList = arrayList;
    }
}

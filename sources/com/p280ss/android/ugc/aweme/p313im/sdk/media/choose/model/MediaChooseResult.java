package com.p280ss.android.ugc.aweme.p313im.sdk.media.choose.model;

import com.p280ss.android.ugc.aweme.p313im.sdk.media.model.MediaModel;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.model.MediaChooseResult */
public final class MediaChooseResult implements Serializable {
    private final ArrayList<MediaModel> selectedList;
    private final boolean sendRaw;

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.ArrayList, code=java.util.ArrayList<com.ss.android.ugc.aweme.im.sdk.media.model.MediaModel>, for r2v0, types: [java.util.ArrayList] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.p280ss.android.ugc.aweme.p313im.sdk.media.choose.model.MediaChooseResult copy$default(com.p280ss.android.ugc.aweme.p313im.sdk.media.choose.model.MediaChooseResult r0, boolean r1, java.util.ArrayList<com.p280ss.android.ugc.aweme.p313im.sdk.media.model.MediaModel> r2, int r3, java.lang.Object r4) {
        /*
            r4 = r3 & 1
            if (r4 == 0) goto L_0x0006
            boolean r1 = r0.sendRaw
        L_0x0006:
            r3 = r3 & 2
            if (r3 == 0) goto L_0x000c
            java.util.ArrayList<com.ss.android.ugc.aweme.im.sdk.media.model.MediaModel> r2 = r0.selectedList
        L_0x000c:
            com.ss.android.ugc.aweme.im.sdk.media.choose.model.MediaChooseResult r0 = r0.copy(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p313im.sdk.media.choose.model.MediaChooseResult.copy$default(com.ss.android.ugc.aweme.im.sdk.media.choose.model.MediaChooseResult, boolean, java.util.ArrayList, int, java.lang.Object):com.ss.android.ugc.aweme.im.sdk.media.choose.model.MediaChooseResult");
    }

    public final boolean component1() {
        return this.sendRaw;
    }

    public final ArrayList<MediaModel> component2() {
        return this.selectedList;
    }

    public final MediaChooseResult copy(boolean z, ArrayList<MediaModel> arrayList) {
        C7573i.m23587b(arrayList, "selectedList");
        return new MediaChooseResult(z, arrayList);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MediaChooseResult) {
                MediaChooseResult mediaChooseResult = (MediaChooseResult) obj;
                if (!(this.sendRaw == mediaChooseResult.sendRaw) || !C7573i.m23585a((Object) this.selectedList, (Object) mediaChooseResult.selectedList)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final ArrayList<MediaModel> getSelectedList() {
        return this.selectedList;
    }

    public final boolean getSendRaw() {
        return this.sendRaw;
    }

    public final int hashCode() {
        boolean z = this.sendRaw;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        ArrayList<MediaModel> arrayList = this.selectedList;
        return i + (arrayList != null ? arrayList.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaChooseResult(sendRaw=");
        sb.append(this.sendRaw);
        sb.append(", selectedList=");
        sb.append(this.selectedList);
        sb.append(")");
        return sb.toString();
    }

    public MediaChooseResult(boolean z, ArrayList<MediaModel> arrayList) {
        C7573i.m23587b(arrayList, "selectedList");
        this.sendRaw = z;
        this.selectedList = arrayList;
    }
}

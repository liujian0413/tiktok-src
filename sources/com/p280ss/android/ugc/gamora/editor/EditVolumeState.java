package com.p280ss.android.ugc.gamora.editor;

import com.bytedance.jedi.arch.C11670t;
import kotlin.jvm.internal.C7571f;

/* renamed from: com.ss.android.ugc.gamora.editor.EditVolumeState */
public final class EditVolumeState implements C11670t {
    private final String musicTitle;
    private final Integer musicVolume;
    private final String voiceTitle;

    public EditVolumeState() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ EditVolumeState copy$default(EditVolumeState editVolumeState, String str, String str2, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = editVolumeState.musicTitle;
        }
        if ((i & 2) != 0) {
            str2 = editVolumeState.voiceTitle;
        }
        if ((i & 4) != 0) {
            num = editVolumeState.musicVolume;
        }
        return editVolumeState.copy(str, str2, num);
    }

    public final String component1() {
        return this.musicTitle;
    }

    public final String component2() {
        return this.voiceTitle;
    }

    public final Integer component3() {
        return this.musicVolume;
    }

    public final EditVolumeState copy(String str, String str2, Integer num) {
        return new EditVolumeState(str, str2, num);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.musicVolume, (java.lang.Object) r3.musicVolume) != false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0029
            boolean r0 = r3 instanceof com.p280ss.android.ugc.gamora.editor.EditVolumeState
            if (r0 == 0) goto L_0x0027
            com.ss.android.ugc.gamora.editor.EditVolumeState r3 = (com.p280ss.android.ugc.gamora.editor.EditVolumeState) r3
            java.lang.String r0 = r2.musicTitle
            java.lang.String r1 = r3.musicTitle
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = r2.voiceTitle
            java.lang.String r1 = r3.voiceTitle
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.lang.Integer r0 = r2.musicVolume
            java.lang.Integer r3 = r3.musicVolume
            boolean r3 = kotlin.jvm.internal.C7573i.m23585a(r0, r3)
            if (r3 == 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r3 = 0
            return r3
        L_0x0029:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.gamora.editor.EditVolumeState.equals(java.lang.Object):boolean");
    }

    public final String getMusicTitle() {
        return this.musicTitle;
    }

    public final Integer getMusicVolume() {
        return this.musicVolume;
    }

    public final String getVoiceTitle() {
        return this.voiceTitle;
    }

    public final int hashCode() {
        String str = this.musicTitle;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.voiceTitle;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Integer num = this.musicVolume;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EditVolumeState(musicTitle=");
        sb.append(this.musicTitle);
        sb.append(", voiceTitle=");
        sb.append(this.voiceTitle);
        sb.append(", musicVolume=");
        sb.append(this.musicVolume);
        sb.append(")");
        return sb.toString();
    }

    public EditVolumeState(String str, String str2, Integer num) {
        this.musicTitle = str;
        this.voiceTitle = str2;
        this.musicVolume = num;
    }

    public /* synthetic */ EditVolumeState(String str, String str2, Integer num, int i, C7571f fVar) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            num = null;
        }
        this(str, str2, num);
    }
}

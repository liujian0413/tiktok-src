package com.p280ss.android.ugc.aweme.tools;

/* renamed from: com.ss.android.ugc.aweme.tools.ap */
public final class C42149ap implements C42155av {

    /* renamed from: a */
    public RecordingSpeed f109674a;

    /* renamed from: b */
    public int f109675b;

    public final String toString() {
        StringBuilder sb = new StringBuilder("StartRecordingCommandEvent{speed=");
        sb.append(this.f109674a);
        sb.append('}');
        return sb.toString();
    }

    public C42149ap(RecordingSpeed recordingSpeed) {
        this.f109674a = recordingSpeed;
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.net.Uri;
import java.io.FileDescriptor;
import java.io.IOException;
import java.util.Map;

public final class bgo implements bho {

    /* renamed from: a */
    private final Context f41914a;

    /* renamed from: b */
    private final Uri f41915b;

    /* renamed from: c */
    private final Map<String, String> f41916c;

    /* renamed from: d */
    private final FileDescriptor f41917d;

    /* renamed from: e */
    private final long f41918e;

    /* renamed from: f */
    private final long f41919f;

    /* renamed from: g */
    private MediaExtractor f41920g;

    /* renamed from: h */
    private bhp[] f41921h;

    /* renamed from: i */
    private boolean f41922i;

    /* renamed from: j */
    private int f41923j;

    /* renamed from: k */
    private int[] f41924k;

    /* renamed from: l */
    private boolean[] f41925l;

    /* renamed from: m */
    private long f41926m;

    public bgo(Context context, Uri uri, Map<String, String> map, int i) {
        bke.m49060b(bkn.f42386a >= 16);
        this.f41923j = 2;
        this.f41914a = (Context) bke.m49057a(context);
        this.f41915b = (Uri) bke.m49057a(uri);
        this.f41916c = null;
        this.f41917d = null;
        this.f41918e = 0;
        this.f41919f = 0;
    }

    /* renamed from: b */
    public final boolean mo40641b(long j) {
        return true;
    }

    /* renamed from: a */
    public final boolean mo40638a(long j) throws IOException {
        if (!this.f41922i) {
            this.f41920g = new MediaExtractor();
            if (this.f41914a != null) {
                this.f41920g.setDataSource(this.f41914a, this.f41915b, null);
            } else {
                this.f41920g.setDataSource(null, 0, 0);
            }
            this.f41924k = new int[this.f41920g.getTrackCount()];
            this.f41925l = new boolean[this.f41924k.length];
            this.f41921h = new bhp[this.f41924k.length];
            for (int i = 0; i < this.f41924k.length; i++) {
                MediaFormat trackFormat = this.f41920g.getTrackFormat(i);
                this.f41921h[i] = new bhp(trackFormat.getString("mime"), trackFormat.containsKey("durationUs") ? trackFormat.getLong("durationUs") : -1);
            }
            this.f41922i = true;
        }
        return true;
    }

    /* renamed from: a */
    public final int mo40634a() {
        bke.m49060b(this.f41922i);
        return this.f41924k.length;
    }

    /* renamed from: a */
    public final bhp mo40636a(int i) {
        bke.m49060b(this.f41922i);
        return this.f41921h[i];
    }

    /* renamed from: a */
    public final void mo40637a(int i, long j) {
        bke.m49060b(this.f41922i);
        boolean z = false;
        bke.m49060b(this.f41924k[i] == 0);
        this.f41924k[i] = 1;
        this.f41920g.selectTrack(i);
        if (j != 0) {
            z = true;
        }
        m48693a(j, z);
    }

    /* renamed from: a */
    public final int mo40635a(int i, long j, bhm bhm, bhn bhn, boolean z) {
        bke.m49060b(this.f41922i);
        bke.m49060b(this.f41924k[i] != 0);
        if (this.f41925l[i]) {
            this.f41925l[i] = false;
            return -5;
        } else if (z) {
            return -2;
        } else {
            if (this.f41924k[i] != 2) {
                bhm.f42025a = bhl.m48807a(this.f41920g.getTrackFormat(i));
                bhw bhw = null;
                if (bkn.f42386a >= 18) {
                    Map psshInfo = this.f41920g.getPsshInfo();
                    if (psshInfo != null && !psshInfo.isEmpty()) {
                        bhw = new bhw("video/mp4");
                        bhw.mo40723a(psshInfo);
                    }
                }
                bhm.f42026b = bhw;
                this.f41924k[i] = 2;
                return -4;
            }
            int sampleTrackIndex = this.f41920g.getSampleTrackIndex();
            if (sampleTrackIndex == i) {
                if (bhn.f42028b != null) {
                    int position = bhn.f42028b.position();
                    bhn.f42029c = this.f41920g.readSampleData(bhn.f42028b, position);
                    bhn.f42028b.position(position + bhn.f42029c);
                } else {
                    bhn.f42029c = 0;
                }
                bhn.f42031e = this.f41920g.getSampleTime();
                bhn.f42030d = this.f41920g.getSampleFlags() & 3;
                if (bhn.mo40695a()) {
                    bhn.f42027a.mo40604a(this.f41920g);
                }
                this.f41926m = -1;
                this.f41920g.advance();
                return -3;
            } else if (sampleTrackIndex < 0) {
                return -1;
            } else {
                return -2;
            }
        }
    }

    /* renamed from: b */
    public final void mo40640b(int i) {
        bke.m49060b(this.f41922i);
        bke.m49060b(this.f41924k[i] != 0);
        this.f41920g.unselectTrack(i);
        this.f41925l[i] = false;
        this.f41924k[i] = 0;
    }

    /* renamed from: c */
    public final void mo40643c(long j) {
        bke.m49060b(this.f41922i);
        m48693a(j, false);
    }

    /* renamed from: b */
    public final long mo40639b() {
        bke.m49060b(this.f41922i);
        long cachedDuration = this.f41920g.getCachedDuration();
        if (cachedDuration == -1) {
            return -1;
        }
        long sampleTime = this.f41920g.getSampleTime();
        if (sampleTime == -1) {
            return -3;
        }
        return sampleTime + cachedDuration;
    }

    /* renamed from: c */
    public final void mo40642c() {
        bke.m49060b(this.f41923j > 0);
        int i = this.f41923j - 1;
        this.f41923j = i;
        if (i == 0 && this.f41920g != null) {
            this.f41920g.release();
            this.f41920g = null;
        }
    }

    /* renamed from: a */
    private final void m48693a(long j, boolean z) {
        if (z || this.f41926m != j) {
            this.f41926m = j;
            this.f41920g.seekTo(j, 0);
            for (int i = 0; i < this.f41924k.length; i++) {
                if (this.f41924k[i] != 0) {
                    this.f41925l[i] = true;
                }
            }
        }
    }
}

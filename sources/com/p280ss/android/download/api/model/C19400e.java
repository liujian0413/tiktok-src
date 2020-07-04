package com.p280ss.android.download.api.model;

import android.text.TextUtils;
import com.p280ss.android.socialbase.downloader.exception.BaseException;
import com.p280ss.android.socialbase.downloader.model.DownloadInfo;
import java.util.Arrays;

/* renamed from: com.ss.android.download.api.model.e */
public final class C19400e {

    /* renamed from: a */
    public long f52499a = -1;

    /* renamed from: b */
    public int f52500b = -1;

    /* renamed from: c */
    public long f52501c = -1;

    /* renamed from: d */
    public long f52502d = -1;

    /* renamed from: e */
    public String f52503e;

    /* renamed from: f */
    public int f52504f;

    /* renamed from: g */
    public boolean f52505g;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f52499a), Integer.valueOf(this.f52500b), Long.valueOf(this.f52501c), this.f52503e});
    }

    /* renamed from: a */
    public final void mo51415a(DownloadInfo downloadInfo) {
        if (downloadInfo != null) {
            this.f52499a = (long) downloadInfo.getId();
            this.f52500b = downloadInfo.getStatus();
            this.f52502d = downloadInfo.getCurBytes();
            this.f52501c = downloadInfo.getTotalBytes();
            this.f52503e = downloadInfo.getTargetFilePath();
            BaseException failedException = downloadInfo.getFailedException();
            if (failedException != null) {
                this.f52504f = failedException.getErrorCode();
            } else {
                this.f52504f = 0;
            }
            this.f52505g = downloadInfo.isOnlyWifi();
        }
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (!(obj instanceof C19400e) || obj == null) {
            return super.equals(obj);
        }
        C19400e eVar = (C19400e) obj;
        if (this.f52499a == eVar.f52499a) {
            z = true;
        } else {
            z = false;
        }
        if (this.f52500b == eVar.f52500b) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.f52501c == eVar.f52501c) {
            z3 = true;
        } else {
            z3 = false;
        }
        if ((!TextUtils.isEmpty(this.f52503e) || !TextUtils.isEmpty(eVar.f52503e)) && (TextUtils.isEmpty(this.f52503e) || TextUtils.isEmpty(eVar.f52503e) || !this.f52503e.equals(eVar.f52503e))) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (!z || !z2 || !z3 || !z4) {
            return false;
        }
        return true;
    }
}

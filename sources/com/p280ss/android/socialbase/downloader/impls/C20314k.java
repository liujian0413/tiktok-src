package com.p280ss.android.socialbase.downloader.impls;

import android.text.TextUtils;
import android.util.SparseArray;
import com.p280ss.android.socialbase.downloader.constants.C20195c;
import com.p280ss.android.socialbase.downloader.downloader.C20285j;
import com.p280ss.android.socialbase.downloader.model.DownloadChunk;
import com.p280ss.android.socialbase.downloader.model.DownloadInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.socialbase.downloader.impls.k */
public final class C20314k implements C20285j {

    /* renamed from: a */
    public final SparseArray<DownloadInfo> f54877a = new SparseArray<>();

    /* renamed from: b */
    public final SparseArray<List<DownloadChunk>> f54878b = new SparseArray<>();

    /* renamed from: a */
    public final void mo54044a(int i, int i2, int i3, int i4) {
    }

    /* renamed from: b */
    public final void mo54056b(int i, List<DownloadChunk> list) {
    }

    /* renamed from: b */
    public final void mo54057b(DownloadChunk downloadChunk) {
    }

    /* renamed from: d */
    public final boolean mo54066d() {
        return false;
    }

    /* renamed from: e */
    public final boolean mo54067e() {
        return false;
    }

    /* renamed from: a */
    public final synchronized void mo54049a(DownloadChunk downloadChunk) {
        int i = downloadChunk.f54919a;
        List list = (List) this.f54878b.get(i);
        if (list == null) {
            list = new ArrayList();
            this.f54878b.put(i, list);
        }
        list.add(downloadChunk);
    }

    /* renamed from: a */
    public final boolean mo54051a(DownloadInfo downloadInfo) {
        boolean z = true;
        if (downloadInfo == null) {
            return true;
        }
        synchronized (this.f54877a) {
            if (this.f54877a.get(downloadInfo.getId()) == null) {
                z = false;
            }
            this.f54877a.put(downloadInfo.getId(), downloadInfo);
        }
        return z;
    }

    /* renamed from: b */
    public final void mo54055b() {
        synchronized (this.f54877a) {
            this.f54877a.clear();
            this.f54878b.clear();
        }
    }

    /* renamed from: c */
    public final void mo54063c(DownloadInfo downloadInfo) {
        mo54051a(downloadInfo);
    }

    /* renamed from: f */
    public final boolean mo54069f(int i) {
        mo54068e(i);
        mo54065d(i);
        return true;
    }

    /* renamed from: a */
    public final DownloadInfo mo54038a(int i) {
        DownloadInfo b = mo54052b(i);
        if (b != null) {
            b.setStatus(2);
        }
        return b;
    }

    /* renamed from: c */
    public final List<DownloadChunk> mo54060c(int i) {
        return (List) this.f54878b.get(i);
    }

    /* renamed from: e */
    public final boolean mo54068e(int i) {
        synchronized (this.f54877a) {
            this.f54877a.remove(i);
        }
        return true;
    }

    /* renamed from: g */
    public final DownloadInfo mo54070g(int i) {
        DownloadInfo b = mo54052b(i);
        if (b != null) {
            b.setStatus(5);
            b.setFirstDownload(false);
        }
        return b;
    }

    /* renamed from: h */
    public final DownloadInfo mo54071h(int i) {
        DownloadInfo b = mo54052b(i);
        if (b != null) {
            b.setStatus(1);
        }
        return b;
    }

    /* renamed from: i */
    public final DownloadInfo mo54072i(int i) {
        DownloadInfo b = mo54052b(i);
        if (b != null) {
            b.setStatus(-7);
        }
        return b;
    }

    /* renamed from: b */
    public final DownloadInfo mo54052b(int i) {
        DownloadInfo downloadInfo;
        synchronized (this.f54877a) {
            try {
                downloadInfo = (DownloadInfo) this.f54877a.get(i);
            } catch (Exception unused) {
                downloadInfo = null;
            }
        }
        return downloadInfo;
    }

    /* renamed from: d */
    public final synchronized void mo54065d(int i) {
        this.f54878b.remove(i);
    }

    /* renamed from: b */
    public final List<DownloadInfo> mo54054b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this.f54877a) {
            if (this.f54877a.size() == 0) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < this.f54877a.size(); i++) {
                DownloadInfo downloadInfo = (DownloadInfo) this.f54877a.get(this.f54877a.keyAt(i));
                if (downloadInfo != null && !TextUtils.isEmpty(downloadInfo.getMimeType()) && downloadInfo.getMimeType().equals(str) && downloadInfo.getStatus() == -3) {
                    arrayList.add(downloadInfo);
                }
            }
            return arrayList;
        }
    }

    /* renamed from: c */
    public final List<DownloadInfo> mo54061c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this.f54877a) {
            if (this.f54877a.size() == 0) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < this.f54877a.size(); i++) {
                DownloadInfo downloadInfo = (DownloadInfo) this.f54877a.get(this.f54877a.keyAt(i));
                if (downloadInfo != null && !TextUtils.isEmpty(downloadInfo.getMimeType()) && downloadInfo.getMimeType().equals(str) && C20195c.m66510f(downloadInfo.getStatus())) {
                    arrayList.add(downloadInfo);
                }
            }
            return arrayList;
        }
    }

    /* renamed from: a */
    public final List<DownloadInfo> mo54042a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this.f54877a) {
            if (this.f54877a.size() == 0) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < this.f54877a.size(); i++) {
                DownloadInfo downloadInfo = (DownloadInfo) this.f54877a.get(this.f54877a.keyAt(i));
                if (downloadInfo != null && !TextUtils.isEmpty(downloadInfo.getMimeType()) && downloadInfo.getMimeType().equals(str) && C20195c.m66511g(downloadInfo.getStatus())) {
                    arrayList.add(downloadInfo);
                }
            }
            return arrayList;
        }
    }

    /* renamed from: d */
    public final DownloadInfo mo54064d(int i, long j) {
        DownloadInfo b = mo54052b(i);
        if (b != null) {
            b.setCurBytes(j, false);
            b.setStatus(-2);
        }
        return b;
    }

    /* renamed from: a */
    public final DownloadInfo mo54039a(int i, int i2) {
        DownloadInfo b = mo54052b(i);
        if (b != null) {
            b.setChunkCount(i2);
        }
        return b;
    }

    /* renamed from: c */
    public final DownloadInfo mo54059c(int i, long j) {
        DownloadInfo b = mo54052b(i);
        if (b != null) {
            b.setCurBytes(j, false);
            b.setStatus(-3);
            b.setFirstDownload(false);
            b.setFirstSuccess(false);
        }
        return b;
    }

    /* renamed from: a */
    public final DownloadInfo mo54040a(int i, long j) {
        DownloadInfo b = mo54052b(i);
        if (b != null) {
            b.setCurBytes(j, false);
            if (!(b.getStatus() == -3 || b.getStatus() == -2 || C20195c.m66511g(b.getStatus()) || b.getStatus() == -4)) {
                b.setStatus(4);
            }
        }
        return b;
    }

    /* renamed from: b */
    public final DownloadInfo mo54053b(int i, long j) {
        DownloadInfo b = mo54052b(i);
        if (b != null) {
            b.setCurBytes(j, false);
            b.setStatus(-1);
            b.setFirstDownload(false);
        }
        return b;
    }

    /* renamed from: a */
    public final void mo54047a(int i, List<DownloadChunk> list) {
        if (list != null) {
            mo54065d(i);
            for (DownloadChunk downloadChunk : list) {
                if (downloadChunk != null) {
                    mo54049a(downloadChunk);
                    if (downloadChunk.mo54548f()) {
                        for (DownloadChunk a : downloadChunk.f54925g) {
                            mo54049a(a);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo54046a(int i, int i2, long j) {
        List<DownloadChunk> c = mo54060c(i);
        if (c != null) {
            for (DownloadChunk downloadChunk : c) {
                if (downloadChunk != null && downloadChunk.f54923e == i2) {
                    downloadChunk.mo54537a(j);
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public final DownloadInfo mo54041a(int i, long j, String str, String str2) {
        DownloadInfo b = mo54052b(i);
        if (b != null) {
            b.setTotalBytes(j);
            b.seteTag(str);
            if (TextUtils.isEmpty(b.getName()) && !TextUtils.isEmpty(str2)) {
                b.setName(str2);
            }
            b.setStatus(3);
        }
        return b;
    }

    /* renamed from: a */
    public final void mo54045a(int i, int i2, int i3, long j) {
        List c = mo54060c(i);
        if (c != null) {
            Iterator it = c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                DownloadChunk downloadChunk = (DownloadChunk) it.next();
                if (downloadChunk != null && downloadChunk.f54923e == i3 && !downloadChunk.mo54548f()) {
                    if (downloadChunk.f54925g != null) {
                        for (DownloadChunk downloadChunk2 : downloadChunk.f54925g) {
                            if (downloadChunk2 != null && downloadChunk2.f54923e == i2) {
                                downloadChunk2.mo54537a(j);
                            }
                        }
                        return;
                    }
                }
            }
        }
    }
}

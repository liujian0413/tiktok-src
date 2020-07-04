package com.p280ss.android.socialbase.downloader.utils;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.SparseArray;
import com.p280ss.android.socialbase.downloader.constants.ListenerType;
import com.p280ss.android.socialbase.downloader.depend.C20208ab;
import com.p280ss.android.socialbase.downloader.depend.C20208ab.C20209a;
import com.p280ss.android.socialbase.downloader.depend.C20211ac;
import com.p280ss.android.socialbase.downloader.depend.C20212b;
import com.p280ss.android.socialbase.downloader.depend.C20214d;
import com.p280ss.android.socialbase.downloader.depend.C20214d.C20215a;
import com.p280ss.android.socialbase.downloader.depend.C20217e;
import com.p280ss.android.socialbase.downloader.depend.C20217e.C20218a;
import com.p280ss.android.socialbase.downloader.depend.C20220f;
import com.p280ss.android.socialbase.downloader.depend.C20220f.C20221a;
import com.p280ss.android.socialbase.downloader.depend.C20223g;
import com.p280ss.android.socialbase.downloader.depend.C20223g.C20224a;
import com.p280ss.android.socialbase.downloader.depend.C20226h;
import com.p280ss.android.socialbase.downloader.depend.C20226h.C20227a;
import com.p280ss.android.socialbase.downloader.depend.C20229i;
import com.p280ss.android.socialbase.downloader.depend.C20229i.C20230a;
import com.p280ss.android.socialbase.downloader.depend.C20233k;
import com.p280ss.android.socialbase.downloader.depend.C20233k.C20234a;
import com.p280ss.android.socialbase.downloader.depend.C20236l;
import com.p280ss.android.socialbase.downloader.depend.C20236l.C20237a;
import com.p280ss.android.socialbase.downloader.depend.C20239m;
import com.p280ss.android.socialbase.downloader.depend.C20240n;
import com.p280ss.android.socialbase.downloader.depend.C20241o;
import com.p280ss.android.socialbase.downloader.depend.C20242p;
import com.p280ss.android.socialbase.downloader.depend.C20242p.C20243a;
import com.p280ss.android.socialbase.downloader.depend.C20245q;
import com.p280ss.android.socialbase.downloader.depend.C20245q.C20246a;
import com.p280ss.android.socialbase.downloader.depend.C20248r;
import com.p280ss.android.socialbase.downloader.depend.C20249s;
import com.p280ss.android.socialbase.downloader.depend.C20250t;
import com.p280ss.android.socialbase.downloader.depend.C20251u;
import com.p280ss.android.socialbase.downloader.depend.C20251u.C20252a;
import com.p280ss.android.socialbase.downloader.depend.C20254v;
import com.p280ss.android.socialbase.downloader.depend.C20256x;
import com.p280ss.android.socialbase.downloader.depend.C20256x.C20257a;
import com.p280ss.android.socialbase.downloader.depend.C20259y;
import com.p280ss.android.socialbase.downloader.depend.C20260z;
import com.p280ss.android.socialbase.downloader.depend.C20260z.C20261a;
import com.p280ss.android.socialbase.downloader.depend.IDownloadDepend;
import com.p280ss.android.socialbase.downloader.depend.IDownloadListener;
import com.p280ss.android.socialbase.downloader.depend.IDownloadMonitorDepend;
import com.p280ss.android.socialbase.downloader.downloader.C20281h;
import com.p280ss.android.socialbase.downloader.downloader.C20292q;
import com.p280ss.android.socialbase.downloader.exception.BaseException;
import com.p280ss.android.socialbase.downloader.model.C20337a;
import com.p280ss.android.socialbase.downloader.model.C20337a.C20338a;
import com.p280ss.android.socialbase.downloader.model.DownloadInfo;
import com.p280ss.android.socialbase.downloader.model.DownloadTask;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.socialbase.downloader.utils.f */
public final class C20360f {

    /* renamed from: a */
    public static Handler f55037a = new Handler(Looper.getMainLooper());

    /* renamed from: a */
    public static C20337a m67635a(final DownloadTask downloadTask) {
        if (downloadTask == null) {
            return null;
        }
        return new C20338a() {
            /* renamed from: a */
            public final DownloadInfo mo54879a() throws RemoteException {
                return downloadTask.getDownloadInfo();
            }

            /* renamed from: b */
            public final C20214d mo54880b() throws RemoteException {
                return C20360f.m67611a(downloadTask.getChunkStrategy());
            }

            /* renamed from: c */
            public final C20251u mo54882c() throws RemoteException {
                return C20360f.m67627a(downloadTask.getNotificationEventListener());
            }

            /* renamed from: d */
            public final C20256x mo54883d() throws RemoteException {
                return C20360f.m67629a(downloadTask.getNotificationClickCallback());
            }

            /* renamed from: e */
            public final C20223g mo54884e() throws RemoteException {
                return C20360f.m67614a(downloadTask.getInterceptor());
            }

            /* renamed from: f */
            public final C20217e mo54885f() throws RemoteException {
                return C20360f.m67612a(downloadTask.getDepend());
            }

            /* renamed from: g */
            public final C20245q mo54886g() throws RemoteException {
                return C20360f.m67623a(downloadTask.getForbiddenHandler());
            }

            /* renamed from: h */
            public final C20260z mo54887h() throws RemoteException {
                return C20360f.m67631a(downloadTask.getRetryDelayTimeCalculator());
            }

            /* renamed from: i */
            public final C20236l mo54888i() throws RemoteException {
                return C20360f.m67618a(downloadTask.getDiskSpaceHandler());
            }

            /* renamed from: j */
            public final C20229i mo54889j() throws RemoteException {
                return C20360f.m67616a(downloadTask.getMonitorDepend());
            }

            /* renamed from: k */
            public final C20220f mo54890k() throws RemoteException {
                return C20360f.m67613a(downloadTask.getFileUriProvider());
            }

            /* renamed from: a */
            public final int mo54877a(int i) throws RemoteException {
                return downloadTask.getDownloadListenerSize(C20359e.m67587c(i));
            }

            /* renamed from: b */
            public final C20226h mo54881b(int i) throws RemoteException {
                boolean z;
                IDownloadListener singleDownloadListener = downloadTask.getSingleDownloadListener(C20359e.m67587c(i));
                if (i == ListenerType.SUB.ordinal()) {
                    z = false;
                } else {
                    z = true;
                }
                return C20360f.m67615a(singleDownloadListener, z);
            }

            /* renamed from: a */
            public final C20226h mo54878a(int i, int i2) throws RemoteException {
                boolean z;
                IDownloadListener downloadListenerByIndex = downloadTask.getDownloadListenerByIndex(C20359e.m67587c(i), i2);
                if (i == ListenerType.SUB.ordinal()) {
                    z = false;
                } else {
                    z = true;
                }
                return C20360f.m67615a(downloadListenerByIndex, z);
            }
        };
    }

    /* renamed from: a */
    public static C20226h m67615a(final IDownloadListener iDownloadListener, final boolean z) {
        if (iDownloadListener == null) {
            return null;
        }
        return new C20227a() {
            /* renamed from: a */
            public final int mo54153a() throws RemoteException {
                return iDownloadListener.hashCode();
            }

            /* renamed from: a */
            public final void mo54154a(final DownloadInfo downloadInfo) throws RemoteException {
                if (z) {
                    C20360f.f55037a.post(new Runnable() {
                        public final void run() {
                            iDownloadListener.onPrepare(downloadInfo);
                        }
                    });
                } else {
                    iDownloadListener.onPrepare(downloadInfo);
                }
            }

            /* renamed from: b */
            public final void mo54156b(final DownloadInfo downloadInfo) throws RemoteException {
                if (z) {
                    C20360f.f55037a.post(new Runnable() {
                        public final void run() {
                            iDownloadListener.onStart(downloadInfo);
                        }
                    });
                } else {
                    iDownloadListener.onStart(downloadInfo);
                }
            }

            /* renamed from: c */
            public final void mo54158c(final DownloadInfo downloadInfo) throws RemoteException {
                if (z) {
                    C20360f.f55037a.post(new Runnable() {
                        public final void run() {
                            iDownloadListener.onProgress(downloadInfo);
                        }
                    });
                } else {
                    iDownloadListener.onProgress(downloadInfo);
                }
            }

            /* renamed from: d */
            public final void mo54160d(final DownloadInfo downloadInfo) throws RemoteException {
                if (z) {
                    C20360f.f55037a.post(new Runnable() {
                        public final void run() {
                            iDownloadListener.onPause(downloadInfo);
                        }
                    });
                } else {
                    iDownloadListener.onPause(downloadInfo);
                }
            }

            /* renamed from: e */
            public final void mo54161e(final DownloadInfo downloadInfo) throws RemoteException {
                if (z) {
                    C20360f.f55037a.post(new Runnable() {
                        public final void run() {
                            iDownloadListener.onSuccessed(downloadInfo);
                        }
                    });
                } else {
                    iDownloadListener.onSuccessed(downloadInfo);
                }
            }

            /* renamed from: f */
            public final void mo54162f(final DownloadInfo downloadInfo) throws RemoteException {
                if (z) {
                    C20360f.f55037a.post(new Runnable() {
                        public final void run() {
                            iDownloadListener.onCanceled(downloadInfo);
                        }
                    });
                } else {
                    iDownloadListener.onCanceled(downloadInfo);
                }
            }

            /* renamed from: g */
            public final void mo54163g(final DownloadInfo downloadInfo) throws RemoteException {
                if (z) {
                    C20360f.f55037a.post(new Runnable() {
                        public final void run() {
                            iDownloadListener.onFirstStart(downloadInfo);
                        }
                    });
                } else {
                    iDownloadListener.onFirstStart(downloadInfo);
                }
            }

            /* renamed from: h */
            public final void mo54164h(final DownloadInfo downloadInfo) throws RemoteException {
                if (z) {
                    C20360f.f55037a.post(new Runnable() {
                        public final void run() {
                            iDownloadListener.onFirstSuccess(downloadInfo);
                        }
                    });
                } else {
                    iDownloadListener.onFirstSuccess(downloadInfo);
                }
            }

            /* renamed from: a */
            public final void mo54155a(final DownloadInfo downloadInfo, final BaseException baseException) throws RemoteException {
                if (z) {
                    C20360f.f55037a.post(new Runnable() {
                        public final void run() {
                            iDownloadListener.onFailed(downloadInfo, baseException);
                        }
                    });
                } else {
                    iDownloadListener.onFailed(downloadInfo, baseException);
                }
            }

            /* renamed from: b */
            public final void mo54157b(final DownloadInfo downloadInfo, final BaseException baseException) throws RemoteException {
                if (z) {
                    C20360f.f55037a.post(new Runnable() {
                        public final void run() {
                            iDownloadListener.onRetry(downloadInfo, baseException);
                        }
                    });
                } else {
                    iDownloadListener.onRetry(downloadInfo, baseException);
                }
            }

            /* renamed from: c */
            public final void mo54159c(final DownloadInfo downloadInfo, final BaseException baseException) throws RemoteException {
                if (z) {
                    C20360f.f55037a.post(new Runnable() {
                        public final void run() {
                            iDownloadListener.onRetryDelay(downloadInfo, baseException);
                        }
                    });
                } else {
                    iDownloadListener.onRetryDelay(downloadInfo, baseException);
                }
            }
        };
    }

    /* renamed from: a */
    public static C20251u m67627a(final C20254v vVar) {
        if (vVar == null) {
            return null;
        }
        return new C20252a() {
            /* renamed from: a */
            public final String mo54194a() throws RemoteException {
                return vVar.mo53942a();
            }

            /* renamed from: a */
            public final boolean mo54196a(boolean z) throws RemoteException {
                return vVar.mo53944a(z);
            }

            /* renamed from: a */
            public final void mo54195a(int i, DownloadInfo downloadInfo, String str, String str2) throws RemoteException {
                vVar.mo53943a(i, downloadInfo, str, str2);
            }
        };
    }

    /* renamed from: a */
    public static C20256x m67629a(final C20259y yVar) {
        if (yVar == null) {
            return null;
        }
        return new C20257a() {
            /* renamed from: a */
            public final boolean mo54200a(DownloadInfo downloadInfo) throws RemoteException {
                return yVar.mo51644a(downloadInfo);
            }

            /* renamed from: b */
            public final boolean mo54201b(DownloadInfo downloadInfo) throws RemoteException {
                return yVar.mo51645b(downloadInfo);
            }
        };
    }

    /* renamed from: a */
    public static C20260z m67631a(final C20292q qVar) {
        if (qVar == null) {
            return null;
        }
        return new C20261a() {
            /* renamed from: a */
            public final long mo54205a(int i, int i2) throws RemoteException {
                return qVar.mo54462a(i, i2);
            }
        };
    }

    /* renamed from: a */
    public static C20245q m67623a(final C20249s sVar) {
        if (sVar == null) {
            return null;
        }
        return new C20246a() {
            /* renamed from: a */
            public final boolean mo54188a(C20242p pVar) throws RemoteException {
                return sVar.mo54192a(C20360f.m67624a(pVar));
            }
        };
    }

    /* renamed from: a */
    public static C20248r m67624a(final C20242p pVar) {
        if (pVar == null) {
            return null;
        }
        return new C20248r() {
            /* renamed from: a */
            public final boolean mo54128a() {
                try {
                    return pVar.mo54184a();
                } catch (RemoteException unused) {
                    return false;
                }
            }

            /* renamed from: a */
            public final void mo54110a(List<String> list) {
                try {
                    pVar.mo54183a(list);
                } catch (RemoteException unused) {
                }
            }
        };
    }

    /* renamed from: a */
    public static C20236l m67618a(final C20240n nVar) {
        if (nVar == null) {
            return null;
        }
        return new C20237a() {
            /* renamed from: a */
            public final boolean mo54178a(long j, long j2, C20233k kVar) throws RemoteException {
                return nVar.mo51539a(j, j2, C20360f.m67619a(kVar));
            }
        };
    }

    /* renamed from: a */
    public static C20239m m67619a(final C20233k kVar) {
        if (kVar == null) {
            return null;
        }
        return new C20239m() {
            /* renamed from: a */
            public final void mo54111a() {
                try {
                    kVar.mo54174a();
                } catch (RemoteException unused) {
                }
            }
        };
    }

    /* renamed from: a */
    public static C20229i m67616a(final IDownloadMonitorDepend iDownloadMonitorDepend) {
        if (iDownloadMonitorDepend == null) {
            return null;
        }
        return new C20230a() {
            /* renamed from: a */
            public final String mo54168a() throws RemoteException {
                return iDownloadMonitorDepend.getEventPage();
            }

            /* renamed from: b */
            public final int[] mo54170b() throws RemoteException {
                if (iDownloadMonitorDepend instanceof C20212b) {
                    return ((C20212b) iDownloadMonitorDepend).mo54136a();
                }
                return null;
            }

            /* renamed from: a */
            public final void mo54169a(String str) throws RemoteException {
                if (!TextUtils.isEmpty(str)) {
                    try {
                        iDownloadMonitorDepend.monitorLogSend(new JSONObject(str));
                    } catch (JSONException unused) {
                    }
                }
            }
        };
    }

    /* renamed from: a */
    public static C20223g m67614a(final C20250t tVar) {
        if (tVar == null) {
            return null;
        }
        return new C20224a() {
            /* renamed from: a */
            public final boolean mo54149a() throws RemoteException {
                return tVar.mo54193a();
            }
        };
    }

    /* renamed from: a */
    public static DownloadTask m67634a(C20337a aVar) {
        if (aVar == null) {
            return null;
        }
        try {
            DownloadTask downloadTask = new DownloadTask(aVar.mo54879a());
            downloadTask.chunkStategy(m67632a(aVar.mo54880b())).notificationEventListener(m67628a(aVar.mo54882c())).interceptor(m67626a(aVar.mo54884e())).depend(m67606a(aVar.mo54885f())).monitorDepend(m67608a(aVar.mo54889j())).forbiddenHandler(m67625a(aVar.mo54886g())).diskSpaceHandler(m67620a(aVar.mo54888i())).fileUriProvider(m67621a(aVar.mo54890k())).notificationClickCallback(m67630a(aVar.mo54883d())).retryDelayTimeCalculator(m67633a(aVar.mo54887h()));
            C20226h b = aVar.mo54881b(ListenerType.MAIN.ordinal());
            if (b != null) {
                downloadTask.mainThreadListenerWithHashCode(b.hashCode(), m67607a(b));
            }
            C20226h b2 = aVar.mo54881b(ListenerType.SUB.ordinal());
            if (b2 != null) {
                downloadTask.subThreadListenerWithHashCode(b2.hashCode(), m67607a(b2));
            }
            C20226h b3 = aVar.mo54881b(ListenerType.NOTIFICATION.ordinal());
            if (b3 != null) {
                downloadTask.notificationListenerWithHashCode(b3.hashCode(), m67607a(b3));
            }
            m67636a(downloadTask, aVar, ListenerType.MAIN);
            m67636a(downloadTask, aVar, ListenerType.SUB);
            m67636a(downloadTask, aVar, ListenerType.NOTIFICATION);
            return downloadTask;
        } catch (RemoteException unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static void m67636a(DownloadTask downloadTask, C20337a aVar, ListenerType listenerType) throws RemoteException {
        SparseArray sparseArray = new SparseArray();
        for (int i = 0; i < aVar.mo54877a(listenerType.ordinal()); i++) {
            C20226h a = aVar.mo54878a(listenerType.ordinal(), i);
            if (a != null) {
                sparseArray.put(a.mo54153a(), m67607a(a));
            }
        }
        downloadTask.setDownloadListeners(sparseArray, listenerType);
    }

    /* renamed from: a */
    public static C20254v m67628a(final C20251u uVar) {
        if (uVar == null) {
            return null;
        }
        return new C20254v() {
            /* renamed from: a */
            public final String mo53942a() {
                try {
                    return uVar.mo54194a();
                } catch (RemoteException unused) {
                    return null;
                }
            }

            /* renamed from: a */
            public final boolean mo53944a(boolean z) {
                try {
                    return uVar.mo54196a(z);
                } catch (RemoteException unused) {
                    return false;
                }
            }

            /* renamed from: a */
            public final void mo53943a(int i, DownloadInfo downloadInfo, String str, String str2) {
                try {
                    uVar.mo54195a(i, downloadInfo, str, str2);
                } catch (RemoteException unused) {
                }
            }
        };
    }

    /* renamed from: a */
    public static C20259y m67630a(final C20256x xVar) {
        if (xVar == null) {
            return null;
        }
        return new C20259y() {
            /* renamed from: a */
            public final boolean mo51644a(DownloadInfo downloadInfo) {
                try {
                    return xVar.mo54200a(downloadInfo);
                } catch (RemoteException unused) {
                    return false;
                }
            }

            /* renamed from: b */
            public final boolean mo51645b(DownloadInfo downloadInfo) {
                try {
                    return xVar.mo54201b(downloadInfo);
                } catch (RemoteException unused) {
                    return false;
                }
            }
        };
    }

    /* renamed from: a */
    private static C20281h m67632a(final C20214d dVar) {
        if (dVar == null) {
            return null;
        }
        return new C20281h() {
            /* renamed from: a */
            public final int mo51487a(long j) {
                try {
                    return dVar.mo54137a(j);
                } catch (RemoteException unused) {
                    return 0;
                }
            }
        };
    }

    /* renamed from: a */
    private static C20249s m67625a(final C20245q qVar) {
        if (qVar == null) {
            return null;
        }
        return new C20249s() {
            /* renamed from: a */
            public final boolean mo54192a(C20248r rVar) {
                try {
                    return qVar.mo54188a(C20360f.m67622a(rVar));
                } catch (RemoteException unused) {
                    return false;
                }
            }
        };
    }

    /* renamed from: a */
    public static C20242p m67622a(final C20248r rVar) {
        if (rVar == null) {
            return null;
        }
        return new C20243a() {
            /* renamed from: a */
            public final boolean mo54184a() {
                return rVar.mo54128a();
            }

            /* renamed from: a */
            public final void mo54183a(List<String> list) {
                rVar.mo54110a(list);
            }
        };
    }

    /* renamed from: a */
    private static C20240n m67620a(final C20236l lVar) {
        if (lVar == null) {
            return null;
        }
        return new C20240n() {
            /* renamed from: a */
            public final boolean mo51539a(long j, long j2, C20239m mVar) {
                try {
                    return lVar.mo54178a(j, j2, C20360f.m67617a(mVar));
                } catch (RemoteException unused) {
                    return false;
                }
            }
        };
    }

    /* renamed from: a */
    public static C20233k m67617a(final C20239m mVar) {
        if (mVar == null) {
            return null;
        }
        return new C20234a() {
            /* renamed from: a */
            public final void mo54174a() throws RemoteException {
                mVar.mo54111a();
            }
        };
    }

    /* renamed from: a */
    private static C20292q m67633a(final C20260z zVar) {
        if (zVar == null) {
            return null;
        }
        return new C20292q() {
            /* renamed from: a */
            public final long mo54462a(int i, int i2) {
                try {
                    return zVar.mo54205a(i, i2);
                } catch (RemoteException unused) {
                    return 0;
                }
            }
        };
    }

    /* renamed from: a */
    private static C20250t m67626a(final C20223g gVar) {
        if (gVar == null) {
            return null;
        }
        return new C20250t() {
            /* renamed from: a */
            public final boolean mo54193a() {
                try {
                    return gVar.mo54149a();
                } catch (RemoteException unused) {
                    return false;
                }
            }
        };
    }

    /* renamed from: a */
    public static C20241o m67621a(final C20220f fVar) {
        if (fVar == null) {
            return null;
        }
        return new C20241o() {
            /* renamed from: a */
            public final Uri mo54182a(String str, String str2) {
                try {
                    return fVar.mo54145a(str, str2);
                } catch (RemoteException unused) {
                    return null;
                }
            }
        };
    }

    /* renamed from: a */
    private static IDownloadDepend m67606a(final C20217e eVar) {
        if (eVar == null) {
            return null;
        }
        return new IDownloadDepend() {
            public final void monitorLogSend(DownloadInfo downloadInfo, BaseException baseException, int i) {
                if (downloadInfo != null) {
                    try {
                        eVar.mo54141a(downloadInfo, baseException, i);
                    } catch (RemoteException unused) {
                    }
                }
            }
        };
    }

    /* renamed from: a */
    public static IDownloadListener m67607a(final C20226h hVar) {
        if (hVar == null) {
            return null;
        }
        return new IDownloadListener() {
            public final void onCanceled(DownloadInfo downloadInfo) {
                try {
                    hVar.mo54162f(downloadInfo);
                } catch (RemoteException unused) {
                }
            }

            public final void onFirstStart(DownloadInfo downloadInfo) {
                try {
                    hVar.mo54163g(downloadInfo);
                } catch (RemoteException unused) {
                }
            }

            public final void onFirstSuccess(DownloadInfo downloadInfo) {
                try {
                    hVar.mo54164h(downloadInfo);
                } catch (RemoteException unused) {
                }
            }

            public final void onPause(DownloadInfo downloadInfo) {
                try {
                    hVar.mo54160d(downloadInfo);
                } catch (RemoteException unused) {
                }
            }

            public final void onPrepare(DownloadInfo downloadInfo) {
                try {
                    hVar.mo54154a(downloadInfo);
                } catch (RemoteException unused) {
                }
            }

            public final void onProgress(DownloadInfo downloadInfo) {
                try {
                    hVar.mo54158c(downloadInfo);
                } catch (RemoteException unused) {
                }
            }

            public final void onStart(DownloadInfo downloadInfo) {
                try {
                    hVar.mo54156b(downloadInfo);
                } catch (RemoteException unused) {
                }
            }

            public final void onSuccessed(DownloadInfo downloadInfo) {
                try {
                    hVar.mo54161e(downloadInfo);
                } catch (RemoteException unused) {
                }
            }

            public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
                try {
                    hVar.mo54155a(downloadInfo, baseException);
                } catch (RemoteException unused) {
                }
            }

            public final void onRetry(DownloadInfo downloadInfo, BaseException baseException) {
                try {
                    hVar.mo54157b(downloadInfo, baseException);
                } catch (RemoteException unused) {
                }
            }

            public final void onRetryDelay(DownloadInfo downloadInfo, BaseException baseException) {
                try {
                    hVar.mo54159c(downloadInfo, baseException);
                } catch (RemoteException unused) {
                }
            }
        };
    }

    /* renamed from: a */
    private static IDownloadMonitorDepend m67608a(final C20229i iVar) {
        if (iVar == null) {
            return null;
        }
        return new C20212b() {
            /* renamed from: a */
            public final int[] mo54136a() {
                try {
                    return iVar.mo54170b();
                } catch (RemoteException unused) {
                    return null;
                }
            }

            public final String getEventPage() {
                try {
                    return iVar.mo54168a();
                } catch (RemoteException unused) {
                    return "";
                }
            }

            public final void monitorLogSend(JSONObject jSONObject) {
                if (jSONObject != null) {
                    try {
                        iVar.mo54169a(jSONObject.toString());
                    } catch (RemoteException unused) {
                    }
                }
            }
        };
    }

    /* renamed from: a */
    public static C20208ab m67609a(final C20211ac acVar) {
        if (acVar == null) {
            return null;
        }
        return new C20209a() {
            /* renamed from: a */
            public final void mo54131a(int i, int i2) {
                acVar.mo54135a(i, i2);
            }
        };
    }

    /* renamed from: a */
    public static C20211ac m67610a(final C20208ab abVar) {
        if (abVar == null) {
            return null;
        }
        return new C20211ac() {
            /* renamed from: a */
            public final void mo54135a(int i, int i2) {
                try {
                    abVar.mo54131a(i, i2);
                } catch (RemoteException unused) {
                }
            }
        };
    }

    /* renamed from: a */
    public static C20214d m67611a(final C20281h hVar) {
        if (hVar == null) {
            return null;
        }
        return new C20215a() {
            /* renamed from: a */
            public final int mo54137a(long j) throws RemoteException {
                return hVar.mo51487a(j);
            }
        };
    }

    /* renamed from: a */
    public static C20217e m67612a(final IDownloadDepend iDownloadDepend) {
        if (iDownloadDepend == null) {
            return null;
        }
        return new C20218a() {
            /* renamed from: a */
            public final void mo54141a(DownloadInfo downloadInfo, BaseException baseException, int i) throws RemoteException {
                iDownloadDepend.monitorLogSend(downloadInfo, baseException, i);
            }
        };
    }

    /* renamed from: a */
    public static C20220f m67613a(final C20241o oVar) {
        if (oVar == null) {
            return null;
        }
        return new C20221a() {
            /* renamed from: a */
            public final Uri mo54145a(String str, String str2) throws RemoteException {
                return oVar.mo54182a(str, str2);
            }
        };
    }
}

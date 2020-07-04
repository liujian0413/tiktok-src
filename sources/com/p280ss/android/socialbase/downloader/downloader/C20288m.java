package com.p280ss.android.socialbase.downloader.downloader;

import android.app.Notification;
import com.p280ss.android.socialbase.downloader.constants.ListenerType;
import com.p280ss.android.socialbase.downloader.depend.C20211ac;
import com.p280ss.android.socialbase.downloader.depend.C20241o;
import com.p280ss.android.socialbase.downloader.depend.C20254v;
import com.p280ss.android.socialbase.downloader.depend.C20259y;
import com.p280ss.android.socialbase.downloader.depend.IDownloadListener;
import com.p280ss.android.socialbase.downloader.model.DownloadChunk;
import com.p280ss.android.socialbase.downloader.model.DownloadInfo;
import com.p280ss.android.socialbase.downloader.model.DownloadTask;
import java.util.List;

/* renamed from: com.ss.android.socialbase.downloader.downloader.m */
public interface C20288m {
    /* renamed from: a */
    int mo54403a(String str, String str2);

    /* renamed from: a */
    List<DownloadInfo> mo54404a(String str);

    /* renamed from: a */
    void mo54405a();

    /* renamed from: a */
    void mo54406a(int i);

    /* renamed from: a */
    void mo54407a(int i, int i2);

    /* renamed from: a */
    void mo54408a(int i, int i2, int i3, int i4);

    /* renamed from: a */
    void mo54409a(int i, int i2, int i3, long j);

    /* renamed from: a */
    void mo54410a(int i, int i2, long j);

    /* renamed from: a */
    void mo54411a(int i, int i2, IDownloadListener iDownloadListener, ListenerType listenerType, boolean z);

    /* renamed from: a */
    void mo54412a(int i, Notification notification);

    /* renamed from: a */
    void mo54413a(int i, C20254v vVar);

    /* renamed from: a */
    void mo54414a(int i, List<DownloadChunk> list);

    /* renamed from: a */
    void mo54415a(int i, boolean z);

    /* renamed from: a */
    void mo54416a(C20211ac acVar);

    /* renamed from: a */
    void mo54417a(DownloadChunk downloadChunk);

    /* renamed from: a */
    void mo54418a(DownloadTask downloadTask);

    /* renamed from: a */
    void mo54419a(List<String> list);

    /* renamed from: a */
    void mo54420a(boolean z, boolean z2);

    /* renamed from: a */
    boolean mo54421a(DownloadInfo downloadInfo);

    /* renamed from: b */
    DownloadInfo mo54422b(String str, String str2);

    /* renamed from: b */
    List<DownloadInfo> mo54423b(String str);

    /* renamed from: b */
    void mo54424b(int i);

    /* renamed from: b */
    void mo54425b(int i, int i2, IDownloadListener iDownloadListener, ListenerType listenerType, boolean z);

    /* renamed from: b */
    void mo54426b(int i, List<DownloadChunk> list);

    /* renamed from: b */
    void mo54427b(DownloadInfo downloadInfo);

    /* renamed from: b */
    void mo54428b(DownloadTask downloadTask);

    /* renamed from: b */
    boolean mo54429b();

    /* renamed from: c */
    List<DownloadInfo> mo54430c(String str);

    /* renamed from: c */
    boolean mo54431c();

    /* renamed from: c */
    boolean mo54432c(int i);

    /* renamed from: c */
    boolean mo54433c(DownloadInfo downloadInfo);

    /* renamed from: d */
    List<DownloadInfo> mo54434d(String str);

    /* renamed from: d */
    void mo54435d();

    /* renamed from: d */
    void mo54436d(int i);

    /* renamed from: e */
    void mo54437e(int i);

    /* renamed from: e */
    boolean mo54438e();

    /* renamed from: f */
    long mo54439f(int i);

    /* renamed from: f */
    void mo54440f();

    /* renamed from: g */
    int mo54441g(int i);

    /* renamed from: g */
    boolean mo54442g();

    /* renamed from: h */
    boolean mo54443h(int i);

    /* renamed from: i */
    DownloadInfo mo54444i(int i);

    /* renamed from: j */
    List<DownloadChunk> mo54445j(int i);

    /* renamed from: k */
    void mo54446k(int i);

    /* renamed from: l */
    void mo54447l(int i);

    /* renamed from: m */
    void mo54448m(int i);

    /* renamed from: n */
    boolean mo54449n(int i);

    /* renamed from: o */
    int mo54450o(int i);

    /* renamed from: p */
    boolean mo54451p(int i);

    /* renamed from: q */
    void mo54452q(int i);

    /* renamed from: r */
    boolean mo54453r(int i);

    /* renamed from: s */
    C20254v mo54454s(int i);

    /* renamed from: t */
    C20259y mo54455t(int i);

    /* renamed from: u */
    C20241o mo54456u(int i);
}

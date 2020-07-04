package com.bytedance.android.livesdk.widget.p429a;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Environment;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.p147c.C3166a;
import com.bytedance.android.live.core.utils.C3388h;
import com.bytedance.android.live.core.utils.C3391k;
import com.bytedance.android.live.core.widget.LiveEditText;
import com.bytedance.android.live.core.widget.LiveTextView;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.model.C4912j;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.p428w.C9171h.C9174b;
import com.bytedance.android.livesdk.p428w.C9171h.C9174b.C9175a;
import com.p280ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.p280ss.android.socialbase.downloader.downloader.Downloader;
import com.p280ss.android.socialbase.downloader.exception.BaseException;
import com.p280ss.android.socialbase.downloader.model.DownloadInfo;
import com.p280ss.android.socialbase.downloader.model.DownloadTask;
import java.io.File;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import p346io.reactivex.C7319aa;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7498y;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p348d.C7328l;
import p346io.reactivex.p351i.C7333a;
import p346io.reactivex.p354j.C7486b;

/* renamed from: com.bytedance.android.livesdk.widget.a.a */
public final class C9225a implements C3391k {

    /* renamed from: a */
    public C7486b<C9230b> f25317a;

    /* renamed from: b */
    public Map<String, C9230b> f25318b;

    /* renamed from: c */
    public boolean f25319c;

    /* renamed from: d */
    private File f25320d;

    /* renamed from: e */
    private boolean f25321e;

    /* renamed from: com.bytedance.android.livesdk.widget.a.a$a */
    public static final class C9229a implements C9174b<C3391k> {
        /* renamed from: a */
        public final C9175a<C3391k> mo11528a(C9175a<C3391k> aVar) {
            return aVar.mo22388a(new C9225a()).mo22387a();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.widget.a.a$b */
    static final class C9230b {

        /* renamed from: a */
        public Typeface f25326a;

        /* renamed from: b */
        public String f25327b;

        private C9230b(String str, Typeface typeface) {
            this.f25326a = typeface;
            this.f25327b = str;
        }
    }

    private C9225a() {
        this.f25317a = C7486b.m23223a();
        this.f25318b = new ConcurrentHashMap();
    }

    /* renamed from: d */
    private void m27479d() {
        File[] listFiles = this.f25320d.listFiles();
        if (listFiles == null) {
            mo22687c();
        } else {
            C7492s.m23293a((T[]) listFiles).mo19304b(C7333a.m23044b()).mo19291a(C9233d.f25330a).mo19317d(C9234e.f25331a).mo19294a(C47549a.m148327a()).mo19189a((C7498y<? super T>) new C7498y<C9230b>() {
                public final void onSubscribe(C7321c cVar) {
                }

                public final void onComplete() {
                    C9225a.this.mo22687c();
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public void onNext(C9230b bVar) {
                    C9225a.this.f25317a.onNext(bVar);
                }

                public final void onError(Throwable th) {
                    C9225a.this.mo22687c();
                }
            });
        }
    }

    /* renamed from: b */
    public final C7319aa<Typeface> mo10286b() {
        String str = ((C4912j) LiveConfigSettingKeys.LIVE_CUSTOM_FONT_CONFIG.mo10240a()).f14041a;
        C9230b bVar = (C9230b) this.f25318b.get(str);
        if (bVar != null) {
            return C7319aa.m22930a(bVar.f25326a).mo19127a(C47549a.m148327a());
        }
        return this.f25317a.mo19291a((C7328l<? super T>) new C9231b<Object>(str)).mo19317d(C9232c.f25329a).mo19324f().mo19135b(C7333a.m23044b()).mo19127a(C47549a.m148327a());
    }

    /* renamed from: a */
    public final void mo10285a() {
        if (!this.f25321e) {
            LiveTextView.setFontManager(this);
            LiveEditText.setFontManager(this);
            LiveTextView.setEnableHostTypeface(true);
            LiveEditText.setEnableHostTypeface(true);
            this.f25320d = new File(m27476a(TTLiveSDKContext.getHostService().mo22360a().context()));
            if (C3388h.m12605a(this.f25320d)) {
                this.f25317a.mo19304b(C7333a.m23044b()).mo19294a(C47549a.m148327a()).mo19189a((C7498y<? super T>) new C7498y<C9230b>() {
                    public final void onComplete() {
                    }

                    public final void onError(Throwable th) {
                    }

                    public final void onSubscribe(C7321c cVar) {
                    }

                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public void onNext(C9230b bVar) {
                        C9225a.this.f25318b.put(bVar.f25327b, bVar);
                    }
                });
                m27479d();
                this.f25321e = true;
            }
        }
    }

    /* renamed from: c */
    public final void mo22687c() {
        if (!this.f25319c) {
            C4912j jVar = (C4912j) LiveConfigSettingKeys.LIVE_CUSTOM_FONT_CONFIG.mo10240a();
            final String str = jVar.f14041a;
            if (!TextUtils.isEmpty(str) && this.f25318b.get(str) == null) {
                ImageModel imageModel = jVar.f14042b;
                if (imageModel != null) {
                    String str2 = null;
                    Iterator it = imageModel.getUrls().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        String str3 = (String) it.next();
                        if (!TextUtils.isEmpty(str3)) {
                            str2 = str3;
                            break;
                        }
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        this.f25319c = true;
                        DownloadTask url = Downloader.with(TTLiveSDKContext.getHostService().mo22360a().context()).url(str2);
                        StringBuilder sb = new StringBuilder();
                        sb.append(str);
                        sb.append(".ttf");
                        url.name(sb.toString()).savePath(this.f25320d.getAbsolutePath()).mainThreadListener(new AbsDownloadListener() {
                            public final void onSuccessed(DownloadInfo downloadInfo) {
                                super.onSuccessed(downloadInfo);
                                C9225a.this.f25319c = false;
                                C7492s.m23290a((Callable<? extends T>) new C9235f<Object>(downloadInfo)).mo19304b(C7333a.m23044b()).mo19294a(C47549a.m148327a()).mo19280a((C7326g<? super T>) new C9236g<Object>(this, str), C9237h.f25335a);
                            }

                            public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
                                super.onFailed(downloadInfo, baseException);
                                C9225a.this.f25319c = false;
                                C3166a.m11963b("LiveFontManager", (Throwable) baseException);
                            }

                            /* access modifiers changed from: 0000 */
                            /* renamed from: a */
                            public final /* synthetic */ void mo22688a(String str, Typeface typeface) throws Exception {
                                StringBuilder sb = new StringBuilder("font download succeed: ");
                                sb.append(str);
                                C3166a.m11961b("LiveFontManager", sb.toString());
                                C9225a.this.f25317a.onNext(new C9230b(str, typeface));
                            }
                        }).download();
                    }
                }
            }
        }
    }

    /* renamed from: b */
    static final /* synthetic */ boolean m27478b(File file) throws Exception {
        if (!file.isDirectory()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final Typeface mo10284a(int i) {
        return TTLiveSDKContext.getHostService().mo22362c().getHostTypeface(i);
    }

    /* renamed from: a */
    static final /* synthetic */ C9230b m27475a(File file) throws Exception {
        return new C9230b(file.getName().replace(".ttf", ""), Typeface.createFromFile(file));
    }

    /* renamed from: a */
    private static String m27476a(Context context) {
        File externalCacheDir = context.getExternalCacheDir();
        if (externalCacheDir != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(externalCacheDir.getAbsolutePath());
            sb.append("/fonts");
            return sb.toString();
        }
        String absolutePath = Environment.getExternalStorageDirectory().getAbsolutePath();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(absolutePath);
        sb2.append("/Android/data/");
        sb2.append(context.getPackageName());
        sb2.append("/cache/fonts");
        return sb2.toString();
    }
}

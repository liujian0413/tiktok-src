package com.p280ss.android.ugc.aweme.feed.preload;

import android.text.TextUtils;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.ugc.aweme.network.C10944e;
import com.p280ss.android.ugc.aweme.base.p1062f.C23338f;
import com.p280ss.android.ugc.aweme.feed.experiment.C28344a;
import com.p280ss.android.ugc.aweme.feed.experiment.FeedCacheEnabledExperiment;
import com.p280ss.android.ugc.aweme.feed.model.FeedItemList;
import com.p280ss.android.ugc.aweme.utils.C42973bg;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;

/* renamed from: com.ss.android.ugc.aweme.feed.preload.g */
public final class C28661g extends C28653a<FeedItemList> {

    /* renamed from: b */
    private static Integer f75512b;

    /* renamed from: c */
    private int f75513c;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo73715a(Object obj) throws Exception {
    }

    /* renamed from: f */
    private static int m94296f() {
        if (f75512b == null) {
            f75512b = Integer.valueOf(C28344a.m93113d() * 60 * 60 * 1000);
        }
        return f75512b.intValue();
    }

    /* renamed from: i */
    private static void m94299i() {
        File file = new File(C6399b.m19921a().getFilesDir(), "key_cold_start_feed_list");
        if (file.exists()) {
            file.delete();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public FeedItemList mo73714a() throws Exception {
        System.currentTimeMillis();
        String h = m94298h();
        if (TextUtils.isEmpty(h)) {
            return null;
        }
        FeedItemList feedItemList = (FeedItemList) C10944e.m32113a().mo15974a(h, FeedItemList.class);
        feedItemList.isFromLocalCache = true;
        this.f75513c = feedItemList.getItems().size();
        return feedItemList;
    }

    /* renamed from: e */
    public final boolean mo73723e() {
        if (C6399b.m19944t()) {
            return C6384b.m19835a().mo15292a(FeedCacheEnabledExperiment.class, true, "is_feed_load_cache", C6384b.m19835a().mo15295d().is_feed_load_cache, true);
        }
        return false;
    }

    /* renamed from: h */
    private String m94298h() {
        ByteArrayOutputStream byteArrayOutputStream;
        FileInputStream fileInputStream;
        long currentTimeMillis = System.currentTimeMillis();
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        if (currentTimeMillis - C23338f.m76562a().mo60621a("last_feed_cached_time", currentTimeMillis) > ((long) m94296f())) {
            m94299i();
            return null;
        }
        try {
            File file = new File(C6399b.m19921a().getFilesDir(), "key_cold_start_feed_list");
            if (!file.exists()) {
                C42973bg.m136425a((Closeable) null);
                C42973bg.m136425a((Closeable) null);
                return null;
            }
            fileInputStream = new FileInputStream(file);
            try {
                byte[] bArr = new byte[PreloadTask.BYTE_UNIT_NUMBER];
                byteArrayOutputStream = new ByteArrayOutputStream();
                while (true) {
                    try {
                        int read = fileInputStream.read(bArr);
                        if (read != -1) {
                            byteArrayOutputStream.write(bArr, 0, read);
                        } else {
                            String str = new String(byteArrayOutputStream.toByteArray());
                            C42973bg.m136425a((Closeable) fileInputStream);
                            C42973bg.m136425a((Closeable) byteArrayOutputStream);
                            return str;
                        }
                    } catch (Exception unused) {
                        C42973bg.m136425a((Closeable) fileInputStream);
                        C42973bg.m136425a((Closeable) byteArrayOutputStream);
                        return null;
                    } catch (Throwable th) {
                        th = th;
                        byteArrayOutputStream2 = byteArrayOutputStream;
                        C42973bg.m136425a((Closeable) fileInputStream);
                        C42973bg.m136425a((Closeable) byteArrayOutputStream2);
                        throw th;
                    }
                }
            } catch (Exception unused2) {
                byteArrayOutputStream = null;
                C42973bg.m136425a((Closeable) fileInputStream);
                C42973bg.m136425a((Closeable) byteArrayOutputStream);
                return null;
            } catch (Throwable th2) {
                th = th2;
                C42973bg.m136425a((Closeable) fileInputStream);
                C42973bg.m136425a((Closeable) byteArrayOutputStream2);
                throw th;
            }
        } catch (Exception unused3) {
            fileInputStream = null;
            byteArrayOutputStream = null;
            C42973bg.m136425a((Closeable) fileInputStream);
            C42973bg.m136425a((Closeable) byteArrayOutputStream);
            return null;
        } catch (Throwable th3) {
            th = th3;
            fileInputStream = null;
            C42973bg.m136425a((Closeable) fileInputStream);
            C42973bg.m136425a((Closeable) byteArrayOutputStream2);
            throw th;
        }
    }
}

package com.p280ss.android.download;

import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.media.MediaScannerConnection;
import android.media.MediaScannerConnection.MediaScannerConnectionClient;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.p280ss.android.download.p861b.C19405c.C19406a;
import java.util.HashMap;

/* renamed from: com.ss.android.download.g */
public final class C19426g implements MediaScannerConnectionClient, C6310a {

    /* renamed from: a */
    protected final C6309f f52576a = new C6309f(Looper.getMainLooper(), this);

    /* renamed from: b */
    private final Context f52577b;

    /* renamed from: c */
    private final MediaScannerConnection f52578c;

    /* renamed from: d */
    private HashMap<String, C19427a> f52579d = new HashMap<>();

    /* renamed from: com.ss.android.download.g$a */
    static class C19427a {

        /* renamed from: a */
        public final long f52580a;

        /* renamed from: b */
        public final String f52581b;

        /* renamed from: c */
        public final String f52582c;

        /* renamed from: d */
        public final long f52583d = SystemClock.elapsedRealtime();

        /* renamed from: a */
        public final void mo51461a(MediaScannerConnection mediaScannerConnection) {
            mediaScannerConnection.scanFile(this.f52581b, this.f52582c);
        }

        public C19427a(long j, String str, String str2) {
            this.f52580a = j;
            this.f52581b = str;
            this.f52582c = str2;
        }
    }

    /* renamed from: a */
    public final void mo51457a() {
        this.f52578c.disconnect();
    }

    public final void onMediaScannerConnected() {
        synchronized (this.f52578c) {
            for (C19427a a : this.f52579d.values()) {
                a.mo51461a(this.f52578c);
            }
        }
    }

    public C19426g(Context context) {
        this.f52577b = context;
        this.f52578c = new MediaScannerConnection(context, this);
    }

    /* renamed from: a */
    public final void mo51458a(DownloadInfo downloadInfo) {
        synchronized (this.f52578c) {
            C19427a aVar = new C19427a(downloadInfo.f52326a, downloadInfo.f52330e, downloadInfo.f52331f);
            this.f52579d.put(aVar.f52581b, aVar);
            if (this.f52578c.isConnected()) {
                aVar.mo51461a(this.f52578c);
            } else {
                this.f52578c.connect();
            }
        }
    }

    public final void handleMsg(Message message) {
        C19427a aVar;
        if (message != null) {
            Bundle data = message.getData();
            if (data != null) {
                String string = data.getString("path");
                String string2 = data.getString("uri");
                if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                    Uri parse = Uri.parse(string2);
                    synchronized (this.f52578c) {
                        aVar = (C19427a) this.f52579d.remove(string);
                    }
                    if (aVar != null) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("scanned", Integer.valueOf(1));
                        if (parse != null) {
                            contentValues.put("mediaprovider_uri", parse.toString());
                        }
                        if (C19422f.m63833a(this.f52577b).mo51449a(ContentUris.withAppendedId(C19406a.f52513a, aVar.f52580a), contentValues, (String) null, (String[]) null) == 0 && this.f52577b != null) {
                            this.f52577b.getContentResolver().delete(parse, null, null);
                        }
                    }
                }
            }
        }
    }

    public final void onScanCompleted(String str, Uri uri) {
        Message obtainMessage = this.f52576a.obtainMessage();
        Bundle bundle = new Bundle();
        bundle.putString("path", str);
        bundle.putString("uri", uri.toString());
        obtainMessage.setData(bundle);
        this.f52576a.sendMessage(obtainMessage);
    }
}

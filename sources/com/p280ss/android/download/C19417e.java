package com.p280ss.android.download;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.AsyncTask;
import android.os.AsyncTask.Status;
import android.text.TextUtils;
import com.bytedance.common.utility.p254b.C9709a;
import com.bytedance.common.utility.p481c.C9721b;
import com.p280ss.android.ugc.aweme.p340x.C7285c;

/* renamed from: com.ss.android.download.e */
public final class C19417e {

    /* renamed from: a */
    static String f52558a;

    /* renamed from: b */
    private static AsyncTask<Void, Integer, Void> f52559b;

    /* renamed from: c */
    private static AsyncTask<Void, Integer, Void> f52560c;

    /* renamed from: com.ss.android.download.e$a */
    public interface C19420a {
        /* renamed from: a */
        void mo51446a(SharedPreferences sharedPreferences);
    }

    /* renamed from: com.ss.android.download.e$b */
    public interface C19421b {
        /* renamed from: a */
        void mo51445a(Editor editor);
    }

    /* renamed from: a */
    public static void m63825a(final Context context, final C19420a aVar) {
        if (!TextUtils.isEmpty(f52558a)) {
            if (!(f52560c == null || f52560c.getStatus() == Status.FINISHED)) {
                f52560c.cancel(true);
            }
            try {
                C194192 r0 = new AsyncTask<Void, Integer, Void>() {
                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public Void doInBackground(Void... voidArr) {
                        synchronized (C19417e.f52558a) {
                            SharedPreferences a = C7285c.m22838a(context, C19417e.f52558a, 0);
                            if (aVar != null) {
                                aVar.mo51446a(a);
                            }
                        }
                        return null;
                    }
                };
                f52560c = r0;
                C9709a.m28647a(r0, new Void[0]);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m63826a(Context context, final C19421b bVar) {
        if (!TextUtils.isEmpty(f52558a)) {
            if (!(f52559b == null || f52559b.getStatus() == Status.FINISHED)) {
                f52559b.cancel(true);
            }
            final Context applicationContext = context.getApplicationContext();
            try {
                C194181 r0 = new AsyncTask<Void, Integer, Void>() {
                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public Void doInBackground(Void... voidArr) {
                        synchronized (C19417e.f52558a) {
                            Editor edit = C7285c.m22838a(applicationContext, C19417e.f52558a, 0).edit();
                            if (bVar != null) {
                                bVar.mo51445a(edit);
                            }
                            C9721b.m28656a(edit);
                        }
                        return null;
                    }
                };
                f52559b = r0;
                C9709a.m28647a(r0, new Void[0]);
            } catch (Throwable unused) {
            }
        }
    }
}

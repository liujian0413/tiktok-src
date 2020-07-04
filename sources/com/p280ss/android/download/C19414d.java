package com.p280ss.android.download;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.SystemClock;
import android.support.p022v4.app.NotificationCompat.C0575b;
import android.text.TextUtils;
import android.widget.RemoteViews;
import com.bytedance.common.utility.C6319n;
import com.bytedance.ies.uikit.p578c.C11014a;
import com.p280ss.android.download.C19410c.C19412b;
import com.p280ss.android.download.C19417e.C19420a;
import com.p280ss.android.download.C19417e.C19421b;
import com.p280ss.android.download.p861b.C19405c.C19406a;
import com.p280ss.android.download.p861b.C19408e;
import com.p280ss.android.download.p861b.C19409f;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: com.ss.android.download.d */
public final class C19414d {

    /* renamed from: b */
    public static final Object f52543b = new Object();

    /* renamed from: i */
    private static C19414d f52544i;

    /* renamed from: a */
    public final Set<String> f52545a = new HashSet();

    /* renamed from: c */
    private Map<Long, WeakHashMap<Object, Boolean>> f52546c = new ConcurrentHashMap();

    /* renamed from: d */
    private Map<Long, String> f52547d = new ConcurrentHashMap();

    /* renamed from: e */
    private Map<Long, JSONObject> f52548e = new ConcurrentHashMap();

    /* renamed from: f */
    private Map<Long, C19412b> f52549f = new ConcurrentHashMap();

    /* renamed from: g */
    private final Context f52550g;

    /* renamed from: h */
    private final NotificationManager f52551h;

    /* renamed from: j */
    private final HashMap<String, Long> f52552j = new HashMap<>();

    /* renamed from: k */
    private final C19408e f52553k = new C19408e();

    /* renamed from: l */
    private final C19408e f52554l = new C19408e();

    /* renamed from: a */
    private static boolean m63802a(int i) {
        return i == 1 || i == 3;
    }

    /* renamed from: b */
    private static boolean m63807b(int i) {
        return i == 1 || i == 0;
    }

    /* renamed from: a */
    public final void mo51437a() {
        synchronized (f52543b) {
            Iterator it = this.f52545a.iterator();
            while (it.hasNext()) {
                this.f52551h.cancel((String) it.next(), 0);
                it.remove();
            }
        }
    }

    /* renamed from: a */
    public final void mo51438a(long j, long j2) {
        synchronized (this.f52553k) {
            if (j2 != 0) {
                try {
                    this.f52553k.mo51424a(j, j2);
                    this.f52554l.mo51424a(j, SystemClock.elapsedRealtime());
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                this.f52553k.mo51425b(j);
                this.f52554l.mo51425b(j);
            }
        }
    }

    /* renamed from: a */
    public final void mo51442a(Collection<DownloadInfo> collection) {
        synchronized (this.f52552j) {
            if (C19431j.m63893b()) {
                m63806b(collection);
            }
        }
    }

    /* renamed from: a */
    public final void mo51441a(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f52551h.cancel(str, 0);
            synchronized (f52543b) {
                if (this.f52545a.contains(str)) {
                    this.f52545a.remove(str);
                    m63809c();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo51440a(DownloadInfo downloadInfo) {
        if (downloadInfo.f52348w && mo51443a(downloadInfo.f52326a)) {
            downloadInfo.f52335j = 490;
            m63801a(downloadInfo, 3, 0);
        }
    }

    /* renamed from: a */
    public final boolean mo51443a(long j) {
        JSONObject jSONObject = (JSONObject) this.f52548e.get(Long.valueOf(j));
        if (jSONObject != null && jSONObject.optBoolean("bind_app", false)) {
            return true;
        }
        String str = (String) this.f52547d.get(Long.valueOf(j));
        if (C6319n.m19593a(str)) {
            return false;
        }
        String[] split = str.split("##");
        return split != null && split.length > 0 && "bind_app".equals(split[0]);
    }

    /* renamed from: a */
    private static boolean m63803a(int i, int i2) {
        return (i == 199 || i == 198) && m63802a(i2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo51439a(Context context, long j) {
        boolean a = C19422f.m63833a(context).mo51451a(ContentUris.withAppendedId(C19406a.f52513a, j), (String[]) null, (String) null, (String[]) null, (String) null);
        try {
            a = a.moveToFirst();
            if (a) {
                int a2 = m63795a(a, "status");
                int a3 = m63795a(a, "visibility");
                if (a != null) {
                    try {
                        a.close();
                    } catch (Exception unused) {
                    }
                }
                m63800a(context, j, a2, a3);
                m63799a(j, a2, a3);
                return;
            }
            if (a != null) {
                try {
                    a.close();
                } catch (Exception unused2) {
                }
            }
        } catch (Exception unused3) {
            if (a != null) {
                try {
                    a.close();
                } catch (Exception unused4) {
                }
            }
        } finally {
            if (a != null) {
                try {
                    a.close();
                } catch (Exception unused5) {
                }
            }
        }
    }

    /* renamed from: d */
    private void m63811d() {
        try {
            C19417e.m63825a(this.f52550g, (C19420a) new C19420a() {
                /* renamed from: a */
                public final void mo51446a(SharedPreferences sharedPreferences) {
                    String[] split = sharedPreferences.getString("notifs_string", "").split("\\|");
                    if (split != null) {
                        synchronized (C19414d.f52543b) {
                            for (int i = 0; i < split.length; i++) {
                                if (TextUtils.isEmpty(split[i])) {
                                    C19414d.this.f52545a.add(split[i]);
                                }
                            }
                        }
                    }
                }
            });
        } catch (Exception unused) {
        }
    }

    /* renamed from: c */
    private void m63809c() {
        if (this.f52545a != null) {
            try {
                StringBuilder sb = new StringBuilder();
                synchronized (f52543b) {
                    int i = 0;
                    for (String str : this.f52545a) {
                        if (i != this.f52545a.size() - 1) {
                            sb.append(str);
                            sb.append("|");
                        } else {
                            sb.append(str);
                        }
                        i++;
                    }
                }
                final String sb2 = sb.toString();
                C19417e.m63826a(this.f52550g, (C19421b) new C19421b() {
                    /* renamed from: a */
                    public final void mo51445a(Editor editor) {
                        editor.putString("notifs_string", sb2);
                    }
                });
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: b */
    public final void mo51444b() {
        synchronized (this.f52553k) {
            for (int i = 0; i < this.f52553k.f52520a; i++) {
                SystemClock.elapsedRealtime();
            }
        }
    }

    /* renamed from: b */
    private static int m63804b(String str) {
        return Integer.parseInt(str.substring(0, str.indexOf(58)));
    }

    /* renamed from: c */
    private static boolean m63810c(DownloadInfo downloadInfo) {
        return m63803a(downloadInfo.f52335j, downloadInfo.f52333h);
    }

    /* renamed from: f */
    private static boolean m63814f(DownloadInfo downloadInfo) {
        return m63808b(downloadInfo.f52335j, downloadInfo.f52333h);
    }

    /* renamed from: a */
    public static synchronized C19414d m63796a(Context context) {
        C19414d dVar;
        synchronized (C19414d.class) {
            if (f52544i == null) {
                f52544i = new C19414d(context);
            }
            dVar = f52544i;
        }
        return dVar;
    }

    /* renamed from: d */
    private static boolean m63812d(DownloadInfo downloadInfo) {
        if (downloadInfo.f52335j != 192 || !m63807b(downloadInfo.f52333h)) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    private static boolean m63813e(DownloadInfo downloadInfo) {
        if ((downloadInfo.f52335j == 196 || downloadInfo.f52335j == 193 || downloadInfo.f52335j == 194 || downloadInfo.f52335j == 195) && m63807b(downloadInfo.f52333h)) {
            return true;
        }
        return false;
    }

    private C19414d(Context context) {
        this.f52550g = context.getApplicationContext();
        this.f52551h = (NotificationManager) this.f52550g.getSystemService("notification");
        m63811d();
    }

    /* renamed from: b */
    static String m63805b(DownloadInfo downloadInfo) {
        if (m63813e(downloadInfo)) {
            StringBuilder sb = new StringBuilder("2:");
            sb.append(downloadInfo.f52326a);
            return sb.toString();
        } else if (m63812d(downloadInfo)) {
            StringBuilder sb2 = new StringBuilder("1:");
            sb2.append(downloadInfo.f52326a);
            return sb2.toString();
        } else if (!m63810c(downloadInfo) && !m63814f(downloadInfo)) {
            return null;
        } else {
            StringBuilder sb3 = new StringBuilder("3:");
            sb3.append(downloadInfo.f52326a);
            return sb3.toString();
        }
    }

    /* renamed from: b */
    private void m63806b(Collection<DownloadInfo> collection) {
        int i;
        long j;
        long j2;
        int i2;
        Iterator it;
        int i3;
        long j3;
        int i4;
        CharSequence charSequence;
        CharSequence charSequence2;
        Notification notification;
        int i5;
        String str;
        String str2;
        String str3;
        String string;
        long j4;
        long j5;
        long j6;
        CharSequence charSequence3;
        CharSequence charSequence4;
        int i6;
        int i7;
        String str4;
        Resources resources = this.f52550g.getResources();
        HashMap hashMap = new HashMap();
        Iterator it2 = collection.iterator();
        while (true) {
            i = 3;
            j = 0;
            if (!it2.hasNext()) {
                break;
            }
            DownloadInfo downloadInfo = (DownloadInfo) it2.next();
            String b = m63805b(downloadInfo);
            if (b != null) {
                hashMap.put(b, downloadInfo);
            } else if (C19406a.m63755c(downloadInfo.f52335j)) {
                m63801a(downloadInfo, 3, 0);
            }
        }
        Iterator it3 = hashMap.keySet().iterator();
        while (it3.hasNext()) {
            String str5 = (String) it3.next();
            int b2 = m63804b(str5);
            DownloadInfo downloadInfo2 = (DownloadInfo) hashMap.get(str5);
            C0575b bVar = new C0575b(this.f52550g);
            if (this.f52552j.containsKey(str5)) {
                j2 = ((Long) this.f52552j.get(str5)).longValue();
            } else {
                j2 = System.currentTimeMillis();
                this.f52552j.put(str5, Long.valueOf(j2));
            }
            if (b2 == 1) {
                i2 = 17301633;
            } else if (b2 == 2) {
                m63801a(downloadInfo2, 2, j);
                i2 = 17301642;
            } else if (b2 == i) {
                m63801a(downloadInfo2, i, j);
                i2 = 17301634;
            } else {
                i2 = 0;
            }
            if (b2 == 1 || b2 == 2) {
                bVar.mo2524a(PendingIntent.getService(this.f52550g, 0, new Intent("android.ss.intent.action.DOWNLOAD_DELETE", ContentUris.withAppendedId(C19406a.f52513a, downloadInfo2.f52326a), this.f52550g, DownloadHandlerService.class), 134217728));
                if (b2 == 1) {
                    bVar.mo2532a(true);
                } else {
                    bVar.mo2539b(true);
                }
            } else if (b2 == i) {
                Uri withAppendedId = ContentUris.withAppendedId(C19406a.f52513a, downloadInfo2.f52326a);
                bVar.mo2539b(true);
                if (C19406a.m63754b(downloadInfo2.f52335j) || m63810c(downloadInfo2)) {
                    str4 = "android.ss.intent.action.DOWNLOAD_DELETE";
                } else {
                    str4 = "android.ss.intent.action.DOWNLOAD_OPEN";
                }
                Intent intent = new Intent(str4, withAppendedId, this.f52550g, DownloadHandlerService.class);
                intent.putExtra("extra_click_download_ids", downloadInfo2.f52326a);
                bVar.mo2524a(PendingIntent.getService(this.f52550g, 0, intent, 134217728));
                bVar.mo2536b(PendingIntent.getService(this.f52550g, 0, new Intent("android.ss.intent.action.DOWNLOAD_HIDE", withAppendedId, this.f52550g, DownloadHandlerService.class), 0));
            }
            Intent intent2 = new Intent("android.ss.intent.action.DOWNLOAD_CLICK", ContentUris.withAppendedId(C19406a.f52513a, downloadInfo2.f52326a), this.f52550g, DownloadHandlerService.class);
            intent2.putExtra("extra_click_download_ids", downloadInfo2.f52326a);
            intent2.putExtra("extra_notification_tag", str5);
            if (b2 == 1) {
                synchronized (this.f52553k) {
                    if (downloadInfo2.f52344s != -1) {
                        j5 = downloadInfo2.f52345t + 0;
                        i3 = b2;
                        j4 = downloadInfo2.f52344s + 0;
                        j6 = this.f52553k.mo51423a(downloadInfo2.f52326a) + 0;
                    } else {
                        i3 = b2;
                        j6 = 0;
                        j5 = 0;
                        j4 = 0;
                    }
                }
                j3 = 0;
                if (j4 > 0) {
                    i7 = (int) ((100 * j5) / j4);
                    it = it3;
                    String string2 = resources.getString(R.string.avo, new Object[]{Integer.valueOf(i7)});
                    if (j6 > 0) {
                        charSequence3 = string2;
                        i6 = 1;
                        charSequence4 = resources.getString(R.string.avp, new Object[]{m63797a(resources, ((j4 - j5) * 1000) / j6)});
                    } else {
                        charSequence3 = string2;
                        i6 = 1;
                        charSequence4 = null;
                    }
                } else {
                    it = it3;
                    i6 = 1;
                    i7 = 0;
                    charSequence4 = null;
                    charSequence3 = null;
                }
                m63801a(downloadInfo2, i6, j6);
                i4 = i7;
                charSequence = charSequence4;
                charSequence2 = charSequence3;
            } else {
                it = it3;
                i3 = b2;
                j3 = 0;
                charSequence2 = null;
                charSequence = null;
                i4 = 0;
            }
            bVar.mo2523a(j2);
            int i8 = i2;
            bVar.mo2519a(i8);
            if (VERSION.SDK_INT <= 8) {
                bVar.mo2530a(m63798a(resources, downloadInfo2));
                bVar.mo2537b(charSequence2);
                int i9 = i3;
                if (i9 == 1) {
                    if (!TextUtils.isEmpty(downloadInfo2.f52315B)) {
                        bVar.mo2542c((CharSequence) downloadInfo2.f52315B);
                    } else {
                        bVar.mo2542c(charSequence);
                    }
                    bVar.mo2521a(100, i4, false);
                } else if (i9 == 2) {
                    bVar.mo2537b((CharSequence) resources.getString(R.string.cpu));
                } else if (i9 == 3) {
                    if (C19406a.m63754b(downloadInfo2.f52335j) || m63810c(downloadInfo2)) {
                        if (m63810c(downloadInfo2)) {
                            bVar.mo2537b(resources.getText(R.string.cos));
                        } else {
                            bVar.mo2537b(resources.getText(R.string.col));
                        }
                    } else if (C19406a.m63753a(downloadInfo2.f52335j)) {
                        if (C19409f.m63770a(this.f52550g, downloadInfo2.f52330e)) {
                            bVar.mo2537b(resources.getText(R.string.coj));
                        } else {
                            bVar.mo2537b(resources.getText(R.string.coi));
                        }
                    }
                }
                notification = bVar.mo2534b();
            } else {
                int i10 = i3;
                RemoteViews remoteViews = new RemoteViews(this.f52550g.getPackageName(), R.layout.lq);
                if (VERSION.SDK_INT > 20) {
                    try {
                        if (C11014a.m32282a(this.f52550g)) {
                            remoteViews.setInt(R.id.cwi, "setBackgroundColor", this.f52550g.getResources().getColor(R.color.a1k));
                        }
                    } catch (Throwable unused) {
                    }
                }
                remoteViews.setProgressBar(R.id.aas, 100, i4, false);
                remoteViews.setImageViewResource(R.id.ax9, i8);
                remoteViews.setOnClickPendingIntent(R.id.a2, PendingIntent.getService(this.f52550g, 0, intent2, 134217728));
                remoteViews.setTextViewText(R.id.a7e, m63798a(resources, downloadInfo2));
                String str6 = "";
                String str7 = "";
                String str8 = "";
                if (i10 == 1) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(C6319n.m19589a(downloadInfo2.f52345t));
                    sb.append("/");
                    sb.append(C6319n.m19589a(downloadInfo2.f52344s));
                    str6 = sb.toString();
                    str7 = this.f52550g.getResources().getString(R.string.cot);
                    str8 = this.f52550g.getResources().getString(R.string.cop);
                    remoteViews.setViewVisibility(R.id.aas, 0);
                    remoteViews.setViewVisibility(R.id.aay, 8);
                    remoteViews.setViewVisibility(R.id.ab1, 0);
                    if (VERSION.SDK_INT < 11 || mo51443a(downloadInfo2.f52326a)) {
                        remoteViews.setViewVisibility(R.id.a2, 8);
                    } else {
                        remoteViews.setViewVisibility(R.id.a2, 0);
                    }
                } else if (i10 == 2) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(C6319n.m19589a(downloadInfo2.f52345t));
                    sb2.append("/");
                    sb2.append(C6319n.m19589a(downloadInfo2.f52344s));
                    str6 = sb2.toString();
                    str7 = this.f52550g.getResources().getString(R.string.cop);
                    str8 = this.f52550g.getResources().getString(R.string.cor);
                    remoteViews.setViewVisibility(R.id.aas, 8);
                    remoteViews.setViewVisibility(R.id.aay, 8);
                    remoteViews.setViewVisibility(R.id.ab1, 0);
                    if (VERSION.SDK_INT < 11 || mo51443a(downloadInfo2.f52326a)) {
                        remoteViews.setViewVisibility(R.id.a2, 8);
                    } else {
                        remoteViews.setViewVisibility(R.id.a2, 0);
                    }
                } else if (i10 == 3) {
                    if (C19406a.m63754b(downloadInfo2.f52335j) || m63810c(downloadInfo2)) {
                        str3 = "";
                        remoteViews.setViewVisibility(R.id.aaz, 8);
                        if (m63810c(downloadInfo2)) {
                            string = this.f52550g.getResources().getString(R.string.cos);
                        } else {
                            string = this.f52550g.getResources().getString(R.string.col);
                        }
                        str = this.f52550g.getResources().getString(R.string.coq);
                        str8 = str;
                        str7 = str2;
                        str6 = str3;
                    } else if (C19406a.m63753a(downloadInfo2.f52335j)) {
                        str3 = C6319n.m19589a(downloadInfo2.f52344s);
                        if (C19409f.m63770a(this.f52550g, downloadInfo2.f52330e)) {
                            str2 = this.f52550g.getResources().getString(R.string.coj);
                        } else {
                            str2 = this.f52550g.getResources().getString(R.string.coi);
                        }
                        str = this.f52550g.getResources().getString(R.string.f124307com);
                        str8 = str;
                        str7 = str2;
                        str6 = str3;
                    }
                    remoteViews.setViewVisibility(R.id.aas, 8);
                    remoteViews.setViewVisibility(R.id.aay, 0);
                    remoteViews.setViewVisibility(R.id.ab1, 8);
                    i5 = R.id.a2;
                    remoteViews.setViewVisibility(R.id.a2, 8);
                    remoteViews.setTextViewText(R.id.aau, str6);
                    remoteViews.setTextViewText(R.id.aav, str7);
                    remoteViews.setTextViewText(R.id.aaz, str6);
                    remoteViews.setTextViewText(R.id.ab0, str7);
                    remoteViews.setTextViewText(i5, str8);
                    notification = bVar.mo2534b();
                    notification.contentView = remoteViews;
                }
                i5 = R.id.a2;
                remoteViews.setTextViewText(R.id.aau, str6);
                remoteViews.setTextViewText(R.id.aav, str7);
                remoteViews.setTextViewText(R.id.aaz, str6);
                remoteViews.setTextViewText(R.id.ab0, str7);
                remoteViews.setTextViewText(i5, str8);
                notification = bVar.mo2534b();
                notification.contentView = remoteViews;
            }
            synchronized (f52543b) {
                if (!this.f52545a.contains(str5)) {
                    this.f52545a.add(str5);
                    m63809c();
                }
            }
            try {
                this.f52551h.notify(str5, 0, notification);
            } catch (Throwable unused2) {
            }
            j = j3;
            it3 = it;
            i = 3;
        }
        Iterator it4 = this.f52552j.keySet().iterator();
        while (it4.hasNext()) {
            String str9 = (String) it4.next();
            if (!hashMap.containsKey(str9)) {
                this.f52551h.cancel(str9, 0);
                synchronized (f52543b) {
                    if (this.f52545a.contains(str9)) {
                        this.f52545a.remove(str9);
                        m63809c();
                    }
                }
                it4.remove();
            }
        }
    }

    /* renamed from: a */
    public static int m63795a(Cursor cursor, String str) {
        return cursor.getInt(cursor.getColumnIndexOrThrow(str));
    }

    /* renamed from: a */
    private static CharSequence m63798a(Resources resources, DownloadInfo downloadInfo) {
        if (!TextUtils.isEmpty(downloadInfo.f52314A)) {
            return downloadInfo.f52314A;
        }
        return resources.getString(R.string.avu);
    }

    /* renamed from: b */
    private static boolean m63808b(int i, int i2) {
        if (!C19406a.m63755c(i) || !m63802a(i2)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static CharSequence m63797a(Resources resources, long j) {
        if (j >= 3600000) {
            return resources.getString(R.string.awv, new Object[]{Integer.valueOf((int) ((j + 1800000) / 3600000))});
        } else if (j >= 60000) {
            return resources.getString(R.string.aww, new Object[]{Integer.valueOf((int) ((j + 30000) / 60000))});
        } else {
            return resources.getString(R.string.awx, new Object[]{Integer.valueOf((int) ((j + 500) / 1000))});
        }
    }

    /* renamed from: a */
    private void m63799a(long j, int i, int i2) {
        if (m63808b(i, i2)) {
            StringBuilder sb = new StringBuilder("3:");
            sb.append(j);
            mo51441a(sb.toString());
        }
    }

    /* renamed from: a */
    private void m63801a(DownloadInfo downloadInfo, int i, long j) {
        if (this.f52546c.get(Long.valueOf(downloadInfo.f52326a)) != null) {
            Map map = (Map) this.f52546c.get(Long.valueOf(downloadInfo.f52326a));
            C19412b bVar = (C19412b) this.f52549f.get(Long.valueOf(downloadInfo.f52326a));
            if (bVar == null) {
                C19410c a = C19410c.m63772a(this.f52550g);
                a.getClass();
                bVar = new C19412b();
                this.f52549f.put(Long.valueOf(downloadInfo.f52326a), bVar);
            }
            bVar.f52531a = downloadInfo.f52326a;
            bVar.f52532b = C19410c.m63771a(downloadInfo.f52335j);
            bVar.f52533c = downloadInfo.f52344s;
            bVar.f52534d = downloadInfo.f52345t;
            bVar.f52535e = downloadInfo.f52330e;
            if (map != null) {
                try {
                    if (!map.isEmpty()) {
                        Iterator it = map.keySet().iterator();
                        while (it.hasNext()) {
                            it.next();
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    private static void m63800a(Context context, long j, int i, int i2) {
        if (m63808b(i, i2) || m63803a(i, i2)) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("visibility", Integer.valueOf(C34943c.f91127w));
            contentValues.put("visibility", Integer.valueOf(0));
            C19422f.m63833a(context).mo51449a(ContentUris.withAppendedId(C19406a.f52513a, j), contentValues, (String) null, (String[]) null);
        }
    }
}

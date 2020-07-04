package com.p280ss.android.ugc.aweme.share.command;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.net.Uri;
import android.support.p022v4.content.C0683b;
import android.text.TextUtils;
import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.common.applog.TeaAgent;
import com.p280ss.android.common.util.C19290j;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.app.C22689a;
import com.p280ss.android.ugc.aweme.app.C23060u;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import com.p280ss.android.ugc.aweme.qrcode.C37018b;
import com.p280ss.android.ugc.aweme.qrcode.C37018b.C37021a;
import com.p280ss.android.ugc.aweme.qrcode.p1498d.C37073c;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLDecoder;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.HttpUrl;

/* renamed from: com.ss.android.ugc.aweme.share.command.e */
public final class C38012e {

    /* renamed from: a */
    private static boolean f98943a = false;

    /* renamed from: b */
    private static int f98944b = 2437;

    /* renamed from: c */
    private static int f98945c = 3000;

    /* renamed from: d */
    private static int f98946d = 1243;

    /* renamed from: com.ss.android.ugc.aweme.share.command.e$a */
    public interface C38018a {
        /* renamed from: a */
        void mo95583a(String str, int i);
    }

    /* renamed from: a */
    public static boolean m121340a() {
        return f98943a;
    }

    /* renamed from: a */
    public static void m121339a(boolean z) {
        f98943a = z;
    }

    /* renamed from: a */
    public static void m121338a(Context context) {
        final ClipboardManager clipboardManager = (ClipboardManager) context.getSystemService("clipboard");
        if (clipboardManager != null) {
            C6726a.m20844b(new Runnable() {
                public final void run() {
                    clipboardManager.setPrimaryClip(ClipData.newPlainText("", ""));
                }
            });
        }
    }

    /* renamed from: e */
    private static boolean m121346e(String str) {
        if (str.contains("microapp") || str.contains("microgame")) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    static final /* synthetic */ String m121345d(String str) throws Exception {
        String str2;
        for (String str3 : (Set) C23060u.m75742a().mo60078h().mo59877d()) {
            HttpUrl parse = HttpUrl.parse(str);
            if (parse != null) {
                str2 = parse.host;
            } else {
                str2 = null;
            }
            if (TextUtils.equals(str2, str3)) {
                return str;
            }
        }
        if (C37073c.m119201a(str)) {
            return m121342b(str);
        }
        return "";
    }

    /* renamed from: a */
    public static String m121337a(String str) {
        Matcher matcher = Pattern.compile("https?://[-A-Za-z0-9+&@#/%?=~_|!:,.;]+[-A-Za-z0-9+&@#/%=~_|]").matcher(str);
        if (!matcher.find()) {
            return "";
        }
        C1592h a = C1592h.m7855a((Callable<TResult>) new C38019f<TResult>(matcher.group()), (Executor) C1592h.f5957a);
        try {
            a.mo6892g();
            return (String) a.mo6890e();
        } catch (InterruptedException unused) {
            return "";
        }
    }

    /* renamed from: b */
    public static String m121342b(String str) {
        C19290j jVar = new C19290j(str);
        jVar.mo51188a(C22689a.f60407a, C6861a.m21337f().getCurUserId());
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(jVar.mo51184a()).openConnection();
            httpURLConnection.setRequestMethod("HEAD");
            C38020g.m121352a(httpURLConnection, "accept", "*/*");
            C38020g.m121352a(httpURLConnection, "connection", "Keep-Alive");
            httpURLConnection.setInstanceFollowRedirects(false);
            return httpURLConnection.getHeaderField("Location");
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: c */
    public static String m121344c(String str) {
        Uri uri;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (!m121346e(str)) {
            return str;
        }
        Uri parse = Uri.parse(str);
        String queryParameter = parse.getQueryParameter("android_scheme");
        if (TextUtils.isEmpty(queryParameter)) {
            queryParameter = parse.getQueryParameter("ios_scheme");
        }
        if (TextUtils.isEmpty(queryParameter)) {
            return str;
        }
        try {
            uri = Uri.parse(URLDecoder.decode(str, "UTF8"));
        } catch (UnsupportedEncodingException unused) {
            uri = parse;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(queryParameter);
        sb.append("&app_id=");
        sb.append(uri.getQueryParameter("app_id"));
        sb.append("&token=");
        sb.append(uri.getQueryParameter("token"));
        sb.append("&channel=");
        sb.append(uri.getQueryParameter("channel"));
        sb.append("&iid=");
        sb.append(uri.getQueryParameter("iid"));
        return sb.toString();
    }

    /* renamed from: a */
    public static String m121336a(final Context context, final C38018a aVar) {
        if (C0683b.m2909b(context, "android.permission.READ_EXTERNAL_STORAGE") != 0) {
            return "";
        }
        C1592h b = C1592h.m7855a((Callable<TResult>) new Callable<String>() {
            public final /* synthetic */ Object call() throws Exception {
                return m121350a();
            }

            /* JADX WARNING: Removed duplicated region for block: B:21:0x0045  */
            /* JADX WARNING: Removed duplicated region for block: B:26:0x004d  */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            private static java.lang.String m121350a() throws java.lang.Exception {
                /*
                    r0 = 0
                    com.ss.android.ugc.aweme.app.AwemeApplication r1 = com.p280ss.android.ugc.aweme.app.AwemeApplication.m21341a()     // Catch:{ Exception -> 0x0049, all -> 0x0042 }
                    android.content.ContentResolver r2 = r1.getContentResolver()     // Catch:{ Exception -> 0x0049, all -> 0x0042 }
                    android.net.Uri r3 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI     // Catch:{ Exception -> 0x0049, all -> 0x0042 }
                    r1 = 1
                    java.lang.String[] r4 = new java.lang.String[r1]     // Catch:{ Exception -> 0x0049, all -> 0x0042 }
                    r1 = 0
                    java.lang.String r5 = "_data"
                    r4[r1] = r5     // Catch:{ Exception -> 0x0049, all -> 0x0042 }
                    r5 = 0
                    r6 = 0
                    java.lang.String r7 = "_id DESC"
                    android.database.Cursor r1 = r2.query(r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x0049, all -> 0x0042 }
                    if (r1 == 0) goto L_0x003a
                    boolean r0 = r1.moveToFirst()     // Catch:{ Exception -> 0x0038, all -> 0x0033 }
                    if (r0 == 0) goto L_0x003a
                    java.lang.String r0 = "_data"
                    int r0 = r1.getColumnIndexOrThrow(r0)     // Catch:{ Exception -> 0x0038, all -> 0x0033 }
                    java.lang.String r0 = r1.getString(r0)     // Catch:{ Exception -> 0x0038, all -> 0x0033 }
                    if (r1 == 0) goto L_0x0032
                    r1.close()
                L_0x0032:
                    return r0
                L_0x0033:
                    r0 = move-exception
                    r8 = r1
                    r1 = r0
                    r0 = r8
                    goto L_0x0043
                L_0x0038:
                    r0 = r1
                    goto L_0x0049
                L_0x003a:
                    if (r1 == 0) goto L_0x003f
                    r1.close()
                L_0x003f:
                    java.lang.String r0 = ""
                    return r0
                L_0x0042:
                    r1 = move-exception
                L_0x0043:
                    if (r0 == 0) goto L_0x0048
                    r0.close()
                L_0x0048:
                    throw r1
                L_0x0049:
                    java.lang.String r1 = ""
                    if (r0 == 0) goto L_0x0050
                    r0.close()
                L_0x0050:
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.share.command.C38012e.C380162.m121350a():java.lang.String");
            }
        }, (Executor) C1592h.f5957a).mo6879b((C1591g<TResult, C1592h<TContinuationResult>>) new C1591g<String, C1592h<String>>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public C1592h<String> then(final C1592h<String> hVar) throws Exception {
                return C1592h.m7855a((Callable<TResult>) new Callable<String>() {
                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public String call() {
                        if (TextUtils.isEmpty((CharSequence) hVar.mo6890e()) || C38012e.m121341a(context, (String) hVar.mo6890e())) {
                            if (aVar != null) {
                                aVar.mo95583a("", 0);
                            }
                            return "";
                        }
                        C38012e.m121343b(context, (String) hVar.mo6890e());
                        new C37018b().mo93454a((String) hVar.mo6890e(), new C37021a() {
                            /* renamed from: a */
                            public final void mo93456a(int i, String str) {
                                String c = C38012e.m121344c(C38012e.m121337a(str));
                                if (!TextUtils.isEmpty(c)) {
                                    if (TextUtils.equals(TeaAgent.getInstallId(), Uri.parse(c).getQueryParameter("iid"))) {
                                        c = "";
                                    }
                                } else {
                                    c = "";
                                }
                                if (aVar != null) {
                                    aVar.mo95583a(c, i);
                                }
                            }
                        });
                        return null;
                    }
                }, (Executor) C1592h.f5957a);
            }
        });
        try {
            b.mo6892g();
            return (String) b.mo6890e();
        } catch (InterruptedException unused) {
            return "";
        }
    }

    /* renamed from: a */
    public static boolean m121341a(Context context, String str) {
        File file = new File(str);
        if (!file.exists() || System.currentTimeMillis() - file.lastModified() > 1800000) {
            return true;
        }
        Options options = new Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        if (C6399b.m19947w()) {
            if (options.outHeight > f98945c || options.outWidth > f98946d) {
                return true;
            }
        } else if (options.outHeight > f98944b || options.outWidth > f98946d) {
            return true;
        }
        String string = C7285c.m22838a(context.getApplicationContext(), "share_command", 0).getString("img_command_list", null);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (!TextUtils.isEmpty(string)) {
            linkedHashSet.addAll(Arrays.asList(string.split(",")));
        }
        if (linkedHashSet.contains(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static void m121343b(Context context, String str) {
        SharedPreferences a = C7285c.m22838a(context.getApplicationContext(), "share_command", 0);
        String string = a.getString("img_command_list", null);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (!TextUtils.isEmpty(string)) {
            linkedHashSet.addAll(Arrays.asList(string.split(",")));
        }
        if (linkedHashSet.size() >= 5) {
            Iterator it = linkedHashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String str2 = (String) it.next();
                if (str2 != null) {
                    linkedHashSet.remove(str2);
                    break;
                }
            }
        }
        linkedHashSet.add(str);
        StringBuilder sb = new StringBuilder();
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            sb.append(",");
        }
        a.edit().putString("img_command_list", sb.toString()).apply();
    }
}

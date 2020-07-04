package com.p280ss.android.ugc.aweme.profile.util;

import android.app.Activity;
import android.content.ContentUris;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Environment;
import android.os.Message;
import android.provider.MediaStore.Images.Media;
import android.support.p022v4.app.ActivityCompat;
import android.support.p022v4.app.Fragment;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a.C10741a;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.uikit.dialog.C11029b.C11030a;
import com.p280ss.android.common.p288d.C19282c;
import com.p280ss.android.http.legacy.p296a.C19565e;
import com.p280ss.android.newmedia.C19929d;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.p999aj.C22477b;
import com.p280ss.android.ugc.aweme.p999aj.C22477b.C22480b;
import com.p280ss.android.ugc.aweme.profile.experiment.UploadAvatarSwitch2TTUpload;
import com.p280ss.android.ugc.aweme.profile.model.AvatarUri;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.p1487ui.DmtStatusViewDialog;
import com.p280ss.android.ugc.aweme.profile.service.C36074j;
import com.p280ss.android.ugc.aweme.ttuploader.C42636e;
import com.p280ss.android.ugc.aweme.ttuploader.C42636e.C42638b;
import com.p280ss.android.ugc.aweme.utils.C42969bc;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import com.p280ss.android.ugc.aweme.utils.permission.C43162f;
import com.p280ss.android.ugc.aweme.video.C7276d;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.zhihu.matisse.C47321a;
import com.zhihu.matisse.MimeType;
import com.zhihu.matisse.internal.entity.C47336b;
import com.zhihu.matisse.internal.entity.Item;
import com.zhihu.matisse.p1853a.C47322a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;
import java.io.IOException;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.profile.util.q */
public class C36749q {

    /* renamed from: a */
    private DmtStatusViewDialog f96462a;

    /* renamed from: b */
    public final Activity f96463b;

    /* renamed from: c */
    protected final Resources f96464c;

    /* renamed from: d */
    protected final Fragment f96465d;

    /* renamed from: e */
    public final String f96466e;

    /* renamed from: f */
    protected final String f96467f;

    /* renamed from: g */
    public final C6309f f96468g;

    /* renamed from: h */
    public final C36758a f96469h;

    /* renamed from: i */
    public int f96470i = 1;

    /* renamed from: com.ss.android.ugc.aweme.profile.util.q$a */
    public interface C36758a {
        /* renamed from: a */
        void mo64749a(String str);

        /* renamed from: b */
        void mo64751b();
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.util.q$b */
    public static class C36759b extends C47322a {
        /* renamed from: a */
        public final C47336b mo61511a(Context context, Item item) {
            String a = C19929d.m65756a(context, item.f121436c);
            if (C6319n.m19593a(a)) {
                return new C47336b(1, context.getString(R.string.cu2));
            }
            File file = new File(a);
            if (!file.exists()) {
                return new C47336b(1, context.getString(R.string.cu2));
            }
            if (C36761s.m118495a(file.getAbsolutePath(), 250, 250)) {
                return new C47336b(1, context.getString(R.string.cu9));
            }
            return null;
        }
    }

    /* renamed from: d */
    public static int m118468d(int i) {
        switch (i) {
            case 1:
                return 10006;
            case 2:
                return 10007;
            case 3:
                return 10008;
            case 5:
                return 10010;
            case 6:
                return 10013;
            default:
                return 10003;
        }
    }

    /* renamed from: e */
    public static int m118469e(int i) {
        if (i == 0) {
            return 10004;
        }
        if (i != 3) {
            return i != 5 ? 10004 : 10011;
        }
        return 10009;
    }

    /* renamed from: a */
    public final void mo93076a(int i, Activity activity, View view, User user, String str) {
        String[] a = m118466a(this.f96464c, 0, 1, 3, 4);
        C11030a aVar = new C11030a(this.f96463b);
        final int i2 = i;
        final Activity activity2 = activity;
        final View view2 = view;
        final String str2 = str;
        final User user2 = user;
        C367523 r3 = new OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                if (TextUtils.isEmpty(C36749q.this.f96466e)) {
                    C10761a.m31399c((Context) C36749q.this.f96463b, (int) R.string.djg).mo25750a();
                    C6921a.m21559a((Throwable) new Exception("SD card 不可用"));
                    return;
                }
                switch (i) {
                    case 0:
                        C36749q.this.mo93088g(i2);
                        return;
                    case 1:
                        C36749q.this.mo93083c(i2);
                        return;
                    case 2:
                        C36074j.f94315a.startHeaderDetailActivity(activity2, view2, str2, user2);
                        return;
                    default:
                        C19282c.m63182a(C36749q.this.f96463b, "live_image_popup", "cancel");
                        return;
                }
            }
        };
        aVar.mo26643a((CharSequence[]) a, (OnClickListener) r3).mo26644a().show();
    }

    /* renamed from: a */
    public boolean mo80258a(int i, int i2, Intent intent) {
        Uri uri;
        Uri uri2;
        if (i == 10004 || i == 10009 || i == 10011) {
            C36074j.f94315a.getNotificationManagerHandleSystemCamera().invoke(Boolean.valueOf(false));
        }
        if (i2 != -1) {
            return false;
        }
        if (i != 10003 && i != 10008 && i != 10006 && i != 10010) {
            if (i == 10007) {
                if (intent == null) {
                    return false;
                }
                List a = C47321a.m147751a(intent);
                if (a == null || a.isEmpty()) {
                    uri2 = intent.getData();
                } else {
                    uri2 = (Uri) a.get(0);
                }
                String a2 = C19929d.m65756a((Context) this.f96463b, uri2);
                if (C6319n.m19593a(a2)) {
                    C9738o.m28694a((Context) this.f96463b, (int) R.drawable.wt, (int) R.string.cty);
                    return false;
                } else if (!new File(a2).exists()) {
                    C9738o.m28694a((Context) this.f96463b, (int) R.drawable.wt, (int) R.string.cty);
                    return false;
                } else if (this.f96469h != null) {
                    this.f96469h.mo64749a(a2);
                }
            } else if (i == 10004 || i == 10009 || i == 10011) {
                try {
                    m118464a(m118467c(mo80259b()), true, i);
                    return true;
                } catch (Exception unused) {
                }
            } else if (i != 10002 || intent == null) {
                return false;
            } else {
                Uri data = intent.getData();
                if (data == null) {
                    return false;
                }
                String a3 = C19929d.m65756a((Context) this.f96463b, data);
                if (a3 == null) {
                    return false;
                }
                File file = new File(a3);
                if (!file.exists()) {
                    return false;
                }
                if (C36761s.m118495a(file.getAbsolutePath(), 250, 250)) {
                    C10761a.m31399c((Context) this.f96463b, (int) R.string.cu9).mo25750a();
                    return true;
                }
                if (this.f96469h != null) {
                    this.f96469h.mo64749a(file.getAbsolutePath());
                }
                return true;
            }
            return false;
        } else if (intent == null) {
            return false;
        } else {
            List a4 = C47321a.m147751a(intent);
            if (a4 == null || a4.isEmpty()) {
                uri = intent.getData();
            } else {
                uri = (Uri) a4.get(0);
            }
            String a5 = C19929d.m65756a((Context) this.f96463b, uri);
            if (C6319n.m19593a(a5)) {
                C9738o.m28694a((Context) this.f96463b, (int) R.drawable.wt, (int) R.string.cty);
                return false;
            } else if (!new File(a5).exists()) {
                C9738o.m28694a((Context) this.f96463b, (int) R.drawable.wt, (int) R.string.cty);
                return false;
            } else {
                if ("file".equals(uri.getScheme())) {
                    uri = m118459a((Context) this.f96463b, a5);
                }
                m118464a(uri, false, i);
                return true;
            }
        }
    }

    /* renamed from: a */
    public final void mo93079a(String str, List<C19565e> list) {
        if (this.f96469h != null) {
            this.f96469h.mo64751b();
        }
        mo93077a(0, str, list);
    }

    /* renamed from: a */
    public final void mo93077a(int i, final String str, final List<C19565e> list) {
        if (!C6384b.m19835a().mo15292a(UploadAvatarSwitch2TTUpload.class, true, "upload_avatar_switch_to_ttupload", C6384b.m19835a().mo15295d().upload_avatar_switch_to_ttupload, false) || list != null) {
            C6726a.m20843a(new Runnable() {
                public final void run() {
                    File file;
                    int i;
                    try {
                        file = new File(str);
                    } catch (Exception e) {
                        C6921a.m21559a((Throwable) e);
                        file = null;
                    }
                    if (file == null || !file.exists() || file.length() <= 4194304) {
                        i = 4194304;
                    } else {
                        StringBuilder sb = new StringBuilder("upload file size: ");
                        sb.append(file.length());
                        C6921a.m21555a(sb.toString());
                        i = (((int) (file.length() / 1024)) + 1) * PreloadTask.BYTE_UNIT_NUMBER;
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(Api.f60503c);
                    sb2.append("?uid=");
                    sb2.append(C6861a.m21337f().getCurUserId());
                    C6861a.m21337f().uploadAvatar(C36749q.this.f96468g, sb2.toString(), i, str, list);
                }
            }, i);
        } else {
            C42636e.m135451a().mo104251a(str, 2, false, (C42638b) new C42638b() {
                /* renamed from: a */
                public final void mo91621a(String str) {
                    Message obtainMessage = C36749q.this.f96468g.obtainMessage(111);
                    obtainMessage.obj = new Exception(str);
                    C36749q.this.f96468g.sendMessage(obtainMessage);
                }

                /* renamed from: a */
                public final void mo91620a(UrlModel urlModel) {
                    Message obtainMessage = C36749q.this.f96468g.obtainMessage(111);
                    AvatarUri avatarUri = new AvatarUri();
                    avatarUri.uri = urlModel.getUri();
                    avatarUri.urlList = urlModel.getUrlList();
                    obtainMessage.obj = avatarUri;
                    C36749q.this.f96468g.sendMessage(obtainMessage);
                }
            });
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo93078a(DialogInterface dialogInterface, int i) {
        try {
            StringBuilder sb = new StringBuilder("package:");
            sb.append(this.f96463b.getPackageName());
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.parse(sb.toString()));
            intent.addFlags(268435456);
            this.f96463b.startActivity(intent);
        } catch (Exception unused) {
            C42969bc.m136401a(this.f96463b);
        }
    }

    /* renamed from: f */
    public final String mo93086f() {
        return mo80259b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public String mo80259b() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f96466e);
        sb.append("/");
        sb.append(this.f96467f);
        return sb.toString();
    }

    /* renamed from: d */
    public final void mo93084d() {
        if (this.f96462a == null) {
            this.f96462a = new DmtStatusViewDialog(this.f96463b);
            this.f96462a.setCancelable(false);
        }
        this.f96462a.show();
    }

    /* renamed from: e */
    public final void mo93085e() {
        if (this.f96462a != null && this.f96462a.isShowing()) {
            this.f96462a.dismiss();
        }
    }

    /* renamed from: c */
    public final void mo93082c() {
        new C11030a(this.f96463b).mo26643a((CharSequence[]) this.f96464c.getStringArray(R.array.u), (OnClickListener) new OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                if (TextUtils.isEmpty(C36749q.this.f96466e)) {
                    C10761a.m31399c((Context) C36749q.this.f96463b, (int) R.string.djg).mo25750a();
                } else if (i != 0) {
                    C19282c.m63182a(C36749q.this.f96463b, "live_image_popup", "cancel");
                } else {
                    C36749q.this.mo93083c(1);
                }
            }
        }).mo26644a().show();
    }

    /* renamed from: h */
    public final void mo93089h(int i) {
        m118462a(i, mo80259b());
    }

    /* renamed from: a */
    private static File m118460a(Context context) {
        File externalCacheDir = context.getExternalCacheDir();
        if (externalCacheDir == null) {
            return Environment.getExternalStorageDirectory();
        }
        return externalCacheDir;
    }

    /* renamed from: c */
    public final void mo93083c(final int i) {
        try {
            C22477b.m74364a(this.f96463b, new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, new C22480b() {
                /* renamed from: a */
                public final void mo53549a(String[] strArr, int[] iArr) {
                    if (iArr != null && iArr.length > 0 && iArr[0] == 0) {
                        C19282c.m63182a(C36749q.this.f96463b, "live_image_popup", "album");
                        C36749q.this.mo93087f(C36749q.m118468d(i));
                    } else if (!C6399b.m19944t() || ActivityCompat.m2242a(C36749q.this.f96463b, "android.permission.READ_EXTERNAL_STORAGE")) {
                        C10761a.m31410e((Context) C36749q.this.f96463b, C36749q.this.f96463b.getString(R.string.ct5)).mo25750a();
                    } else {
                        C36749q.this.mo93075a((int) R.string.e9o, (int) R.string.wl);
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    private File mo80257a(String str) {
        if (!C7276d.m22825f() || !C7276d.m22826g() || TextUtils.isEmpty(str)) {
            return null;
        }
        File file = new File(m118460a((Context) this.f96463b), str);
        C7276d.m22805a(file);
        return file;
    }

    /* renamed from: c */
    private Uri m118467c(String str) {
        File file = new File(str);
        if (!file.exists()) {
            try {
                File file2 = new File(this.f96466e);
                if (!file2.exists()) {
                    file2.mkdirs();
                }
                file.createNewFile();
            } catch (IOException unused) {
                return null;
            }
        }
        return Uri.fromFile(file);
    }

    /* renamed from: b */
    public final void mo93080b(int i) {
        m118463a(i, m118466a(this.f96464c, 0, 1, 4));
    }

    /* renamed from: b */
    public final void mo93081b(String str) {
        if (this.f96469h != null) {
            this.f96469h.mo64751b();
        }
        mo93084d();
        m118462a(0, str);
    }

    /* renamed from: g */
    public final void mo93088g(final int i) {
        if (C43162f.m136886a()) {
            C22477b.m74364a(this.f96463b, new String[]{"android.permission.CAMERA"}, new C22480b() {
                /* renamed from: a */
                public final void mo53549a(String[] strArr, int[] iArr) {
                    if (iArr != null && iArr.length > 0 && iArr[0] == 0) {
                        C19282c.m63182a(C36749q.this.f96463b, "live_image_popup", "take_photo");
                        C36074j.f94315a.getStartCameraActivity().invoke(C36749q.this.f96463b, C36749q.this.f96465d, Integer.valueOf(C36749q.m118469e(i)), C36749q.this.f96466e, C36749q.this.f96467f);
                    } else if (!C6399b.m19944t() || ActivityCompat.m2242a(C36749q.this.f96463b, "android.permission.CAMERA")) {
                        C10761a.m31410e((Context) C36749q.this.f96463b, C36749q.this.f96463b.getString(R.string.ct3)).mo25750a();
                    } else {
                        C36749q.this.mo93075a((int) R.string.e9n, (int) R.string.wk);
                    }
                }
            });
        } else if (C43162f.m136885a(this.f96463b) != -1) {
            C19282c.m63182a(this.f96463b, "live_image_popup", "take_photo");
            C36074j.f94315a.getStartCameraActivity().invoke(this.f96463b, this.f96465d, Integer.valueOf(m118469e(i)), this.f96466e, this.f96467f);
        } else if (!C6399b.m19944t() || ActivityCompat.m2242a(this.f96463b, "android.permission.CAMERA")) {
            C10761a.m31410e((Context) this.f96463b, this.f96463b.getString(R.string.ct3)).mo25750a();
        } else {
            mo93075a((int) R.string.e9n, (int) R.string.wk);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final void mo93087f(int i) {
        C19282c.m63182a(this.f96463b, "live_image_popup", "album");
        try {
            if (this.f96465d != null) {
                C47321a.m147749a(this.f96465d).mo119331a(MimeType.ofImage()).mo119336a(true).mo119338b(false).mo119337b(this.f96470i).mo119339c(-1).mo119334a((int) R.style.gv).mo119333a(0.85f).mo119335a((C47322a) new C36759b()).mo119342e(i);
            } else {
                C47321a.m147748a(this.f96463b).mo119331a(MimeType.ofImage()).mo119336a(true).mo119338b(false).mo119337b(this.f96470i).mo119339c(-1).mo119334a((int) R.style.gv).mo119333a(0.85f).mo119335a((C47322a) new C36759b()).mo119342e(i);
            }
        } catch (Exception e) {
            C6921a.m21554a(e);
            C19929d.m65758a(this.f96463b, this.f96465d, i);
        }
    }

    /* renamed from: a */
    public static String[] m118466a(Resources resources, short... sArr) {
        return m118465a(resources, (int) R.array.f, sArr);
    }

    /* renamed from: a */
    private void m118462a(int i, final String str) {
        C6726a.m20843a(new Runnable() {
            public final void run() {
                StringBuilder sb = new StringBuilder();
                sb.append(Api.f60503c);
                sb.append("?uid=");
                sb.append(C6861a.m21337f().getCurUserId());
                String sb2 = sb.toString();
                if (C43122ff.m136784o(C6861a.m21337f().getCurUser())) {
                    C6861a.m21337f().uploadCommerceHeadImage(C36749q.this.f96468g, sb2, 4194304, str, "1");
                } else {
                    C6861a.m21337f().uploadCover(C36749q.this.f96468g, sb2, 4194304, str);
                }
            }
        }, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003b, code lost:
        if (r8 != null) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0049, code lost:
        if (r8 != null) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004b, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004e, code lost:
        return null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0044  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.net.Uri m118459a(android.content.Context r8, java.lang.String r9) {
        /*
            boolean r0 = com.bytedance.common.utility.C6319n.m19593a(r9)
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            android.content.ContentResolver r2 = r8.getContentResolver()     // Catch:{ Exception -> 0x0048, all -> 0x0041 }
            java.lang.String r5 = "_data= ?"
            r8 = 1
            java.lang.String[] r6 = new java.lang.String[r8]     // Catch:{ Exception -> 0x0048, all -> 0x0041 }
            r0 = 0
            r6[r0] = r9     // Catch:{ Exception -> 0x0048, all -> 0x0041 }
            java.lang.String[] r4 = new java.lang.String[r8]     // Catch:{ Exception -> 0x0048, all -> 0x0041 }
            java.lang.String r8 = "_id"
            r4[r0] = r8     // Catch:{ Exception -> 0x0048, all -> 0x0041 }
            android.net.Uri r3 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI     // Catch:{ Exception -> 0x0048, all -> 0x0041 }
            r7 = 0
            android.database.Cursor r8 = r2.query(r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x0048, all -> 0x0041 }
            boolean r9 = r8.moveToFirst()     // Catch:{ Exception -> 0x0049, all -> 0x003e }
            if (r9 == 0) goto L_0x003b
            java.lang.String r9 = r8.getString(r0)     // Catch:{ Exception -> 0x0049, all -> 0x003e }
            android.net.Uri r0 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI     // Catch:{ Exception -> 0x0049, all -> 0x003e }
            long r2 = java.lang.Long.parseLong(r9)     // Catch:{ Exception -> 0x0049, all -> 0x003e }
            android.net.Uri r9 = android.content.ContentUris.withAppendedId(r0, r2)     // Catch:{ Exception -> 0x0049, all -> 0x003e }
            if (r8 == 0) goto L_0x003a
            r8.close()
        L_0x003a:
            return r9
        L_0x003b:
            if (r8 == 0) goto L_0x004e
            goto L_0x004b
        L_0x003e:
            r9 = move-exception
            r1 = r8
            goto L_0x0042
        L_0x0041:
            r9 = move-exception
        L_0x0042:
            if (r1 == 0) goto L_0x0047
            r1.close()
        L_0x0047:
            throw r9
        L_0x0048:
            r8 = r1
        L_0x0049:
            if (r8 == 0) goto L_0x004e
        L_0x004b:
            r8.close()
        L_0x004e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.profile.util.C36749q.m118459a(android.content.Context, java.lang.String):android.net.Uri");
    }

    /* renamed from: a */
    private void m118463a(final int i, String[] strArr) {
        new C11030a(this.f96463b).mo26643a((CharSequence[]) strArr, (OnClickListener) new OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                if (TextUtils.isEmpty(C36749q.this.f96466e)) {
                    C10761a.m31399c((Context) C36749q.this.f96463b, (int) R.string.djg).mo25750a();
                    C6921a.m21559a((Throwable) new Exception("SD card 不可用"));
                    return;
                }
                switch (i) {
                    case 0:
                        C36749q.this.mo93088g(i);
                        return;
                    case 1:
                        C36749q.this.mo93083c(i);
                        return;
                    default:
                        C19282c.m63182a(C36749q.this.f96463b, "live_image_popup", "cancel");
                        return;
                }
            }
        }).mo26644a().show();
    }

    /* renamed from: a */
    public final void mo93075a(int i, int i2) {
        new C10741a(this.f96463b).mo25649a(i).mo25657b(i2).mo25658b((int) R.string.w_, (OnClickListener) null).mo25650a((int) R.string.bbw, (OnClickListener) new C36760r(this)).mo25656a().mo25637a();
    }

    /* renamed from: a */
    private void m118464a(Uri uri, boolean z, int i) {
        Context context;
        boolean z2;
        float f;
        float b;
        if (uri != null) {
            if (!z) {
                String lastPathSegment = uri.getLastPathSegment();
                if (VERSION.SDK_INT >= 19 && !C6319n.m19593a(lastPathSegment) && lastPathSegment.contains(":")) {
                    lastPathSegment = lastPathSegment.split(":")[1];
                }
                try {
                    uri = ContentUris.withAppendedId(Media.EXTERNAL_CONTENT_URI, Long.parseLong(lastPathSegment));
                } catch (NumberFormatException unused) {
                }
            }
            if (this.f96465d != null) {
                context = this.f96465d.getContext();
            } else {
                context = this.f96463b;
            }
            if (context != null) {
                String a = C19929d.m65756a((Context) this.f96463b, uri);
                if (i == 10003 || i == 10004) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2 || i == 10009 || i == 10008 || i == 10010 || i == 10011) {
                    f = 1.0f;
                } else {
                    f = 0.5625f;
                }
                if (Math.abs(f - 1.0f) < Float.MIN_NORMAL) {
                    b = C9738o.m28708b(context, 30.0f);
                } else {
                    b = C9738o.m28708b(context, 16.0f);
                }
                int i2 = (int) b;
                if (C6399b.m19944t()) {
                    i2 = (int) C9738o.m28708b(context, 16.0f);
                }
                int i3 = i2;
                if (this.f96465d == null) {
                    C36074j.f94315a.gotoCropActivity(this.f96463b, a, z2, f, i3, 10002, 250, 250);
                } else {
                    C36074j.f94315a.gotoCropActivity(this.f96465d, a, z2, f, i3, 10002, 250, 250);
                }
            }
        }
    }

    /* renamed from: a */
    private static String[] m118465a(Resources resources, int i, short... sArr) {
        String[] stringArray = resources.getStringArray(R.array.f);
        String[] strArr = new String[sArr.length];
        for (int i2 = 0; i2 < sArr.length; i2++) {
            strArr[i2] = stringArray[sArr[i2]];
        }
        return strArr;
    }

    public C36749q(Activity activity, Fragment fragment, C6309f fVar, C36758a aVar) {
        this.f96463b = activity;
        this.f96465d = fragment;
        this.f96468g = fVar;
        this.f96469h = aVar;
        File a = mo80257a("head");
        if (a != null) {
            this.f96466e = a.getPath();
        } else {
            this.f96466e = "";
        }
        this.f96467f = "head.data";
        this.f96464c = this.f96463b.getResources();
    }
}

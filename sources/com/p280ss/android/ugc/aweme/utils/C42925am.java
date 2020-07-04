package com.p280ss.android.ugc.aweme.utils;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Build.VERSION;
import android.support.p022v4.content.C0683b;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a.C10741a;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.base.p1062f.C23336d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.friends.model.DouyinContactModel;
import com.p280ss.android.ugc.aweme.friends.p1285ui.ContactsActivity;
import com.p280ss.android.ugc.aweme.main.C32981dh;
import com.p280ss.android.ugc.aweme.p999aj.C22477b;
import com.p280ss.android.ugc.aweme.utils.permission.C43152a;
import com.p280ss.android.ugc.aweme.utils.permission.C43152a.C43154a;
import com.p280ss.android.ugc.aweme.utils.permission.PermissionStateReporter;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.utils.am */
public final class C42925am {

    /* renamed from: a */
    public static final String[] f111456a = {"android.permission.READ_CONTACTS"};

    /* renamed from: com.ss.android.ugc.aweme.utils.am$a */
    public interface C42929a {
        /* renamed from: a */
        void mo71408a();

        /* renamed from: b */
        void mo71409b();
    }

    /* renamed from: a */
    public static List<DouyinContactModel> m136270a(Context context) {
        return m136269a(context, null, false).f111453a;
    }

    /* renamed from: c */
    public static boolean m136275c(Context context) {
        if (C0683b.m2909b(context, "android.permission.READ_CONTACTS") != -1) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static void m136274b(Context context) {
        if (C21115b.m71197a().isLogin()) {
            if (!((Boolean) SharePrefCache.inst().getIsContactDialogShown().mo59877d()).booleanValue() && !((Boolean) SharePrefCache.inst().getIsOldUser().mo59877d()).booleanValue()) {
                m136276d(context);
            }
            if (((Boolean) SharePrefCache.inst().getIsOldUser().mo59877d()).booleanValue() && !((Boolean) SharePrefCache.inst().getIsContactsUploaded().mo59877d()).booleanValue() && !((Boolean) SharePrefCache.inst().getIsContactDialogShown().mo59877d()).booleanValue()) {
                m136276d(context);
            }
        }
    }

    /* renamed from: d */
    private static void m136276d(final Context context) {
        if ((context == null || !(context instanceof Activity) || !((Activity) context).isFinishing()) && !TimeLockRuler.isTeenModeON()) {
            new C10741a(context).mo25663c(R.drawable.a5p).mo25649a((int) R.string.b6x).mo25657b((int) R.string.ao_).mo25651a((int) R.string.up, (OnClickListener) new OnClickListener() {
                public final void onClick(final DialogInterface dialogInterface, int i) {
                    C6907h.onEvent(MobClick.obtain().setEventName("friend_alert").setLabelName("submit"));
                    if (VERSION.SDK_INT < 23) {
                        context.startActivity(ContactsActivity.m98571a(context, null, false));
                        dialogInterface.dismiss();
                    } else if (context instanceof Activity) {
                        if (!C43152a.m136871a((Context) (Activity) context, C42925am.f111456a)) {
                            C43152a.m136867a((Activity) context, 0, C42925am.f111456a, (C43154a) new C43154a() {
                                /* renamed from: b */
                                public final void mo71376b() {
                                    dialogInterface.dismiss();
                                }

                                /* renamed from: a */
                                public final void mo71375a() {
                                    context.startActivity(ContactsActivity.m98571a(context, null, true));
                                    dialogInterface.dismiss();
                                }
                            });
                            return;
                        }
                        context.startActivity(ContactsActivity.m98571a(context, null, false));
                        dialogInterface.dismiss();
                    }
                }
            }, true).mo25658b((int) R.string.w_, (OnClickListener) new OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    C6907h.onEvent(MobClick.obtain().setEventName("friend_alert").setLabelName("cancel"));
                }
            }).mo25656a().mo25638b().setCanceledOnTouchOutside(false);
            C6907h.onEvent(MobClick.obtain().setEventName("friend_alert").setLabelName("show"));
            SharePrefCache.inst().getIsContactDialogShown().mo59871a(Boolean.valueOf(true));
        }
    }

    /* renamed from: a */
    public static void m136271a(Activity activity, C42929a aVar) {
        C22477b.m74364a(activity, new String[]{"android.permission.READ_CONTACTS"}, new C42930an(aVar, activity));
    }

    /* renamed from: a */
    private static int[] m136273a(String[] strArr, int[] iArr) {
        boolean z;
        if (strArr == null || iArr == null) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            return null;
        }
        int min = Math.min(strArr.length, iArr.length);
        int[] iArr2 = new int[min];
        int i = 0;
        for (int i2 = 0; i2 < min; i2++) {
            iArr2[i2] = i;
            i += iArr[i2];
        }
        return iArr2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0211, code lost:
        r12 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0212, code lost:
        switch(r12) {
            case 0: goto L_0x02f8;
            case 1: goto L_0x02ea;
            case 2: goto L_0x02c8;
            case 3: goto L_0x02b7;
            case 4: goto L_0x02a6;
            case 5: goto L_0x0294;
            case 6: goto L_0x0276;
            case 7: goto L_0x0266;
            case 8: goto L_0x0235;
            case 9: goto L_0x0219;
            default: goto L_0x0215;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0215, code lost:
        r34 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0219, code lost:
        r34 = r8;
        r31 = r2.getString(r2.getColumnIndex("data2"));
        r30 = r2.getString(r2.getColumnIndex("data3"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0235, code lost:
        r34 = r8;
        r7.put(android.provider.ContactsContract.CommonDataKinds.Im.getProtocolLabel(r36.getResources(), r2.getInt(r2.getColumnIndex("data5")), r2.getString(r2.getColumnIndex("data6"))).toString(), r2.getString(r2.getColumnIndex("data1")));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0266, code lost:
        r8 = r2.getString(r2.getColumnIndex("data1"));
        r15 = r32;
        r12 = r33;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0276, code lost:
        r34 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0283, code lost:
        if (r2.getInt(r2.getColumnIndex("data2")) != 3) goto L_0x031e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0285, code lost:
        r12 = r2.getString(r2.getColumnIndex("data1"));
        r15 = r32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0294, code lost:
        r34 = r8;
        r6.add(r2.getString(r2.getColumnIndex("data1")));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x02a6, code lost:
        r34 = r8;
        r5.add(r2.getString(r2.getColumnIndex("data1")));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x02b7, code lost:
        r34 = r8;
        r4.add(r2.getString(r2.getColumnIndex("data1")));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x02c8, code lost:
        r34 = r8;
        r1 = r2.getString(r2.getColumnIndex("data1"));
        r9 = r2.getString(r2.getColumnIndex("data5"));
        r13 = r2.getString(r2.getColumnIndex("data4"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x02ea, code lost:
        r34 = r8;
        r14 = r2.getString(r2.getColumnIndex("data1"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x02f8, code lost:
        r34 = r8;
        r8 = r2.getString(r2.getColumnIndex("data1"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0309, code lost:
        if (android.text.TextUtils.isEmpty(r8) != false) goto L_0x031e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x030b, code lost:
        r8 = com.p280ss.android.ugc.aweme.login.utils.PhoneNumberUtil.m105815b(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0313, code lost:
        if (r3.contains(r8) != false) goto L_0x031e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0315, code lost:
        r3.add(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x03c9, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x03ca, code lost:
        r4 = r26;
        r6 = r27;
        r3 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x03d2, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x03d3, code lost:
        r4 = r26;
        r6 = r27;
        r3 = r28;
        r1 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x040e, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0413, code lost:
        r2 = r21 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0416, code lost:
        if (r3.length <= r2) goto L_0x042b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0420, code lost:
        if (r4.f111454b.length > r2) goto L_0x0422;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x0422, code lost:
        r11.section = r4.f111454b[r2];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x042b, code lost:
        r0 = r4.f111454b[r21];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0442, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x0447, code lost:
        r2 = r21 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x044a, code lost:
        if (r3.length <= r2) goto L_0x045c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x0453, code lost:
        if (r4.f111454b.length > r2) goto L_0x0455;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0455, code lost:
        r11.section = r4.f111454b[r2];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x045c, code lost:
        r11.section = r4.f111454b[r21];
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x03c9 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:63:0x0170] */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x040e  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0413  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x0442  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x0447  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.p280ss.android.ugc.aweme.utils.C42924al m136269a(android.content.Context r36, java.lang.String r37, boolean r38) {
        /*
            com.ss.android.ugc.aweme.utils.al r1 = new com.ss.android.ugc.aweme.utils.al
            r1.<init>()
            android.content.ContentResolver r8 = r36.getContentResolver()
            android.net.Uri r0 = android.provider.ContactsContract.Contacts.CONTENT_URI
            r9 = 21
            if (r38 == 0) goto L_0x0023
            int r2 = android.os.Build.VERSION.SDK_INT
            if (r2 < r9) goto L_0x0023
            android.net.Uri$Builder r0 = r0.buildUpon()
            java.lang.String r2 = "android.provider.extra.ADDRESS_BOOK_INDEX"
            java.lang.String r3 = "true"
            android.net.Uri$Builder r0 = r0.appendQueryParameter(r2, r3)
            android.net.Uri r0 = r0.build()
        L_0x0023:
            r3 = r0
            r4 = 0
            r5 = 0
            r6 = 0
            r2 = r8
            r7 = r37
            android.database.Cursor r10 = r2.query(r3, r4, r5, r6, r7)
            if (r10 != 0) goto L_0x0031
            return r1
        L_0x0031:
            int r0 = r10.getCount()
            if (r0 != 0) goto L_0x003b
            r10.close()
            return r1
        L_0x003b:
            android.os.Bundle r0 = r10.getExtras()
            int r2 = android.os.Build.VERSION.SDK_INT
            if (r2 < r9) goto L_0x0064
            java.lang.String r2 = "android.provider.extra.ADDRESS_BOOK_INDEX_TITLES"
            boolean r2 = r0.containsKey(r2)
            if (r2 == 0) goto L_0x0064
            java.lang.String r2 = "android.provider.extra.ADDRESS_BOOK_INDEX_COUNTS"
            boolean r2 = r0.containsKey(r2)
            if (r2 == 0) goto L_0x0064
            java.lang.String r2 = "android.provider.extra.ADDRESS_BOOK_INDEX_TITLES"
            java.lang.String[] r2 = r0.getStringArray(r2)
            java.lang.String r3 = "android.provider.extra.ADDRESS_BOOK_INDEX_COUNTS"
            int[] r0 = r0.getIntArray(r3)
            r1.f111454b = r2
            r1.f111455c = r0
            goto L_0x0066
        L_0x0064:
            r0 = 0
            r2 = 0
        L_0x0066:
            int[] r9 = m136273a(r2, r0)
            java.util.ArrayList r12 = new java.util.ArrayList
            int r0 = r10.getCount()
            r12.<init>(r0)
            r1.f111453a = r12
            r13 = 7
            java.lang.String[] r14 = new java.lang.String[r13]
            java.lang.String r0 = "data1"
            r15 = 0
            r14[r15] = r0
            java.lang.String r0 = "data2"
            r16 = 1
            r14[r16] = r0
            java.lang.String r0 = "data3"
            r17 = 2
            r14[r17] = r0
            java.lang.String r0 = "data4"
            r7 = 3
            r14[r7] = r0
            java.lang.String r0 = "data5"
            r18 = 4
            r14[r18] = r0
            java.lang.String r0 = "data6"
            r19 = 5
            r14[r19] = r0
            java.lang.String r0 = "mimetype"
            r20 = 6
            r14[r20] = r0
            r6 = 0
            r21 = 0
        L_0x00a3:
            boolean r0 = r10.moveToNext()
            if (r0 == 0) goto L_0x0463
            com.ss.android.ugc.aweme.friends.model.DouyinContactModel r5 = new com.ss.android.ugc.aweme.friends.model.DouyinContactModel
            r5.<init>()
            java.lang.String r0 = "_id"
            int r0 = r10.getColumnIndex(r0)     // Catch:{ Exception -> 0x03ff, all -> 0x03f9 }
            long r2 = r10.getLong(r0)     // Catch:{ Exception -> 0x03ff, all -> 0x03f9 }
            android.net.Uri r0 = android.provider.ContactsContract.Contacts.CONTENT_URI     // Catch:{ Exception -> 0x03ff, all -> 0x03f9 }
            android.net.Uri r0 = android.content.ContentUris.withAppendedId(r0, r2)     // Catch:{ Exception -> 0x03ff, all -> 0x03f9 }
            java.lang.String r2 = "entities"
            android.net.Uri r3 = android.net.Uri.withAppendedPath(r0, r2)     // Catch:{ Exception -> 0x03ff, all -> 0x03f9 }
            r0 = 0
            r22 = 0
            r23 = 0
            r2 = r8
            r4 = r14
            r11 = r5
            r5 = r0
            r13 = r6
            r6 = r22
            r15 = 3
            r7 = r23
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x03f1, all -> 0x03ec }
            if (r2 != 0) goto L_0x0102
            if (r2 == 0) goto L_0x00de
            r2.close()
        L_0x00de:
            if (r9 == 0) goto L_0x00fe
            int r0 = r9.length
            int r2 = r21 + 1
            if (r0 <= r2) goto L_0x00f8
            r0 = r9[r2]
            if (r13 >= r0) goto L_0x00ea
            goto L_0x00f8
        L_0x00ea:
            java.lang.String[] r0 = r1.f111454b
            int r0 = r0.length
            if (r0 <= r2) goto L_0x00f5
            java.lang.String[] r0 = r1.f111454b
            r0 = r0[r2]
            r11.section = r0
        L_0x00f5:
            r21 = r2
            goto L_0x00fe
        L_0x00f8:
            java.lang.String[] r0 = r1.f111454b
            r0 = r0[r21]
        L_0x00fc:
            r11.section = r0
        L_0x00fe:
            int r6 = r13 + 1
            goto L_0x043a
        L_0x0102:
            int r0 = r2.getCount()     // Catch:{ Exception -> 0x03e2, all -> 0x03dc }
            if (r0 != 0) goto L_0x012d
            r2.close()     // Catch:{ Exception -> 0x03e2, all -> 0x03dc }
            if (r2 == 0) goto L_0x0110
            r2.close()
        L_0x0110:
            if (r9 == 0) goto L_0x00fe
            int r0 = r9.length
            int r2 = r21 + 1
            if (r0 <= r2) goto L_0x0128
            r0 = r9[r2]
            if (r13 >= r0) goto L_0x011c
            goto L_0x0128
        L_0x011c:
            java.lang.String[] r0 = r1.f111454b
            int r0 = r0.length
            if (r0 <= r2) goto L_0x00f5
            java.lang.String[] r0 = r1.f111454b
            r0 = r0[r2]
            r11.section = r0
            goto L_0x00f5
        L_0x0128:
            java.lang.String[] r0 = r1.f111454b
            r0 = r0[r21]
            goto L_0x00fc
        L_0x012d:
            java.lang.String r0 = "display_name"
            int r0 = r10.getColumnIndex(r0)     // Catch:{ Exception -> 0x03e2, all -> 0x03dc }
            java.lang.String r0 = r10.getString(r0)     // Catch:{ Exception -> 0x03e2, all -> 0x03dc }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ Exception -> 0x03e2, all -> 0x03dc }
            r3.<init>()     // Catch:{ Exception -> 0x03e2, all -> 0x03dc }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ Exception -> 0x03e2, all -> 0x03dc }
            r4.<init>()     // Catch:{ Exception -> 0x03e2, all -> 0x03dc }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ Exception -> 0x03e2, all -> 0x03dc }
            r5.<init>()     // Catch:{ Exception -> 0x03e2, all -> 0x03dc }
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ Exception -> 0x03e2, all -> 0x03dc }
            r6.<init>()     // Catch:{ Exception -> 0x03e2, all -> 0x03dc }
            java.util.HashMap r7 = new java.util.HashMap     // Catch:{ Exception -> 0x03e2, all -> 0x03dc }
            r7.<init>()     // Catch:{ Exception -> 0x03e2, all -> 0x03dc }
            java.lang.String r15 = "photo_uri"
            int r15 = r10.getColumnIndex(r15)     // Catch:{ Exception -> 0x03e2, all -> 0x03dc }
            java.lang.String r15 = r10.getString(r15)     // Catch:{ Exception -> 0x03e2, all -> 0x03dc }
            r26 = r1
            r24 = r8
            r28 = r9
            r29 = r12
            r27 = r13
            r25 = r14
            r1 = 0
            r8 = 0
            r9 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r30 = 0
            r31 = 0
        L_0x0170:
            boolean r22 = r2.moveToNext()     // Catch:{ Exception -> 0x03d2, all -> 0x03c9 }
            if (r22 == 0) goto L_0x0326
            r32 = r15
            java.lang.String r15 = "mimetype"
            int r15 = r2.getColumnIndex(r15)     // Catch:{ Exception -> 0x03d2, all -> 0x03c9 }
            java.lang.String r15 = r2.getString(r15)     // Catch:{ Exception -> 0x03d2, all -> 0x03c9 }
            boolean r22 = com.bytedance.common.utility.C6319n.m19593a(r15)     // Catch:{ Exception -> 0x03d2, all -> 0x03c9 }
            if (r22 != 0) goto L_0x0319
            r22 = -1
            int r23 = r15.hashCode()     // Catch:{ Exception -> 0x03d2, all -> 0x03c9 }
            switch(r23) {
                case -1569536764: goto L_0x0205;
                case -1328682538: goto L_0x01f9;
                case -1079224304: goto L_0x01ec;
                case -1079210633: goto L_0x01e0;
                case 3430506: goto L_0x01d4;
                case 456415478: goto L_0x01c8;
                case 684173810: goto L_0x01bc;
                case 689862072: goto L_0x01b0;
                case 950831081: goto L_0x01a2;
                case 2034973555: goto L_0x0195;
                default: goto L_0x0191;
            }     // Catch:{ Exception -> 0x03d2, all -> 0x03c9 }
        L_0x0191:
            r33 = r12
            goto L_0x0211
        L_0x0195:
            r33 = r12
            java.lang.String r12 = "vnd.android.cursor.item/nickname"
            boolean r12 = r15.equals(r12)     // Catch:{ Exception -> 0x03d2, all -> 0x03c9 }
            if (r12 == 0) goto L_0x0211
            r12 = 1
            goto L_0x0212
        L_0x01a2:
            r33 = r12
            java.lang.String r12 = "vnd.android.cursor.item/im"
            boolean r12 = r15.equals(r12)     // Catch:{ Exception -> 0x03d2, all -> 0x03c9 }
            if (r12 == 0) goto L_0x0211
            r12 = 8
            goto L_0x0212
        L_0x01b0:
            r33 = r12
            java.lang.String r12 = "vnd.android.cursor.item/organization"
            boolean r12 = r15.equals(r12)     // Catch:{ Exception -> 0x03d2, all -> 0x03c9 }
            if (r12 == 0) goto L_0x0211
            r12 = 2
            goto L_0x0212
        L_0x01bc:
            r33 = r12
            java.lang.String r12 = "vnd.android.cursor.item/phone_v2"
            boolean r12 = r15.equals(r12)     // Catch:{ Exception -> 0x03d2, all -> 0x03c9 }
            if (r12 == 0) goto L_0x0211
            r12 = 0
            goto L_0x0212
        L_0x01c8:
            r33 = r12
            java.lang.String r12 = "vnd.android.cursor.item/website"
            boolean r12 = r15.equals(r12)     // Catch:{ Exception -> 0x03d2, all -> 0x03c9 }
            if (r12 == 0) goto L_0x0211
            r12 = 5
            goto L_0x0212
        L_0x01d4:
            r33 = r12
            java.lang.String r12 = "vnd.android.cursor.item/sip_address"
            boolean r12 = r15.equals(r12)     // Catch:{ Exception -> 0x03d2, all -> 0x03c9 }
            if (r12 == 0) goto L_0x0211
            r12 = 4
            goto L_0x0212
        L_0x01e0:
            r33 = r12
            java.lang.String r12 = "vnd.android.cursor.item/note"
            boolean r12 = r15.equals(r12)     // Catch:{ Exception -> 0x03d2, all -> 0x03c9 }
            if (r12 == 0) goto L_0x0211
            r12 = 7
            goto L_0x0212
        L_0x01ec:
            r33 = r12
            java.lang.String r12 = "vnd.android.cursor.item/name"
            boolean r12 = r15.equals(r12)     // Catch:{ Exception -> 0x03d2, all -> 0x03c9 }
            if (r12 == 0) goto L_0x0211
            r12 = 9
            goto L_0x0212
        L_0x01f9:
            r33 = r12
            java.lang.String r12 = "vnd.android.cursor.item/contact_event"
            boolean r12 = r15.equals(r12)     // Catch:{ Exception -> 0x03d2, all -> 0x03c9 }
            if (r12 == 0) goto L_0x0211
            r12 = 6
            goto L_0x0212
        L_0x0205:
            r33 = r12
            java.lang.String r12 = "vnd.android.cursor.item/email_v2"
            boolean r12 = r15.equals(r12)     // Catch:{ Exception -> 0x03d2, all -> 0x03c9 }
            if (r12 == 0) goto L_0x0211
            r12 = 3
            goto L_0x0212
        L_0x0211:
            r12 = -1
        L_0x0212:
            switch(r12) {
                case 0: goto L_0x02f8;
                case 1: goto L_0x02ea;
                case 2: goto L_0x02c8;
                case 3: goto L_0x02b7;
                case 4: goto L_0x02a6;
                case 5: goto L_0x0294;
                case 6: goto L_0x0276;
                case 7: goto L_0x0266;
                case 8: goto L_0x0235;
                case 9: goto L_0x0219;
                default: goto L_0x0215;
            }     // Catch:{ Exception -> 0x03d2, all -> 0x03c9 }
        L_0x0215:
            r34 = r8
            goto L_0x031d
        L_0x0219:
            java.lang.String r12 = "data2"
            int r12 = r2.getColumnIndex(r12)     // Catch:{ Exception -> 0x03d2, all -> 0x03c9 }
            java.lang.String r12 = r2.getString(r12)     // Catch:{ Exception -> 0x03d2, all -> 0x03c9 }
            java.lang.String r15 = "data3"
            int r15 = r2.getColumnIndex(r15)     // Catch:{ Exception -> 0x03d2, all -> 0x03c9 }
            java.lang.String r15 = r2.getString(r15)     // Catch:{ Exception -> 0x03d2, all -> 0x03c9 }
            r34 = r8
            r31 = r12
            r30 = r15
            goto L_0x031d
        L_0x0235:
            java.lang.String r12 = "data5"
            int r12 = r2.getColumnIndex(r12)     // Catch:{ Exception -> 0x03d2, all -> 0x03c9 }
            int r12 = r2.getInt(r12)     // Catch:{ Exception -> 0x03d2, all -> 0x03c9 }
            java.lang.String r15 = "data6"
            int r15 = r2.getColumnIndex(r15)     // Catch:{ Exception -> 0x03d2, all -> 0x03c9 }
            java.lang.String r15 = r2.getString(r15)     // Catch:{ Exception -> 0x03d2, all -> 0x03c9 }
            r34 = r8
            android.content.res.Resources r8 = r36.getResources()     // Catch:{ Exception -> 0x03d2, all -> 0x03c9 }
            java.lang.CharSequence r8 = android.provider.ContactsContract.CommonDataKinds.Im.getProtocolLabel(r8, r12, r15)     // Catch:{ Exception -> 0x03d2, all -> 0x03c9 }
            java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x03d2, all -> 0x03c9 }
            java.lang.String r12 = "data1"
            int r12 = r2.getColumnIndex(r12)     // Catch:{ Exception -> 0x03d2, all -> 0x03c9 }
            java.lang.String r12 = r2.getString(r12)     // Catch:{ Exception -> 0x03d2, all -> 0x03c9 }
            r7.put(r8, r12)     // Catch:{ Exception -> 0x03d2, all -> 0x03c9 }
            goto L_0x031d
        L_0x0266:
            java.lang.String r8 = "data1"
            int r8 = r2.getColumnIndex(r8)     // Catch:{ Exception -> 0x03d2, all -> 0x03c9 }
            java.lang.String r8 = r2.getString(r8)     // Catch:{ Exception -> 0x03d2, all -> 0x03c9 }
            r15 = r32
            r12 = r33
            goto L_0x0170
        L_0x0276:
            r34 = r8
            java.lang.String r8 = "data2"
            int r8 = r2.getColumnIndex(r8)     // Catch:{ Exception -> 0x03d2, all -> 0x03c9 }
            int r8 = r2.getInt(r8)     // Catch:{ Exception -> 0x03d2, all -> 0x03c9 }
            r12 = 3
            if (r8 != r12) goto L_0x031e
            java.lang.String r8 = "data1"
            int r8 = r2.getColumnIndex(r8)     // Catch:{ Exception -> 0x03d2, all -> 0x03c9 }
            java.lang.String r8 = r2.getString(r8)     // Catch:{ Exception -> 0x03d2, all -> 0x03c9 }
            r12 = r8
            r15 = r32
            goto L_0x0322
        L_0x0294:
            r34 = r8
            r12 = 3
            java.lang.String r8 = "data1"
            int r8 = r2.getColumnIndex(r8)     // Catch:{ Exception -> 0x03d2, all -> 0x03c9 }
            java.lang.String r8 = r2.getString(r8)     // Catch:{ Exception -> 0x03d2, all -> 0x03c9 }
            r6.add(r8)     // Catch:{ Exception -> 0x03d2, all -> 0x03c9 }
            goto L_0x031e
        L_0x02a6:
            r34 = r8
            r12 = 3
            java.lang.String r8 = "data1"
            int r8 = r2.getColumnIndex(r8)     // Catch:{ Exception -> 0x03d2, all -> 0x03c9 }
            java.lang.String r8 = r2.getString(r8)     // Catch:{ Exception -> 0x03d2, all -> 0x03c9 }
            r5.add(r8)     // Catch:{ Exception -> 0x03d2, all -> 0x03c9 }
            goto L_0x031e
        L_0x02b7:
            r34 = r8
            r12 = 3
            java.lang.String r8 = "data1"
            int r8 = r2.getColumnIndex(r8)     // Catch:{ Exception -> 0x03d2, all -> 0x03c9 }
            java.lang.String r8 = r2.getString(r8)     // Catch:{ Exception -> 0x03d2, all -> 0x03c9 }
            r4.add(r8)     // Catch:{ Exception -> 0x03d2, all -> 0x03c9 }
            goto L_0x031e
        L_0x02c8:
            r34 = r8
            r12 = 3
            java.lang.String r1 = "data1"
            int r1 = r2.getColumnIndex(r1)     // Catch:{ Exception -> 0x03d2, all -> 0x03c9 }
            java.lang.String r1 = r2.getString(r1)     // Catch:{ Exception -> 0x03d2, all -> 0x03c9 }
            java.lang.String r8 = "data5"
            int r8 = r2.getColumnIndex(r8)     // Catch:{ Exception -> 0x03d2, all -> 0x03c9 }
            java.lang.String r9 = r2.getString(r8)     // Catch:{ Exception -> 0x03d2, all -> 0x03c9 }
            java.lang.String r8 = "data4"
            int r8 = r2.getColumnIndex(r8)     // Catch:{ Exception -> 0x03d2, all -> 0x03c9 }
            java.lang.String r13 = r2.getString(r8)     // Catch:{ Exception -> 0x03d2, all -> 0x03c9 }
            goto L_0x031e
        L_0x02ea:
            r34 = r8
            r12 = 3
            java.lang.String r8 = "data1"
            int r8 = r2.getColumnIndex(r8)     // Catch:{ Exception -> 0x03d2, all -> 0x03c9 }
            java.lang.String r14 = r2.getString(r8)     // Catch:{ Exception -> 0x03d2, all -> 0x03c9 }
            goto L_0x031e
        L_0x02f8:
            r34 = r8
            r12 = 3
            java.lang.String r8 = "data1"
            int r8 = r2.getColumnIndex(r8)     // Catch:{ Exception -> 0x03d2, all -> 0x03c9 }
            java.lang.String r8 = r2.getString(r8)     // Catch:{ Exception -> 0x03d2, all -> 0x03c9 }
            boolean r15 = android.text.TextUtils.isEmpty(r8)     // Catch:{ Exception -> 0x03d2, all -> 0x03c9 }
            if (r15 != 0) goto L_0x031e
            java.lang.String r8 = com.p280ss.android.ugc.aweme.login.utils.PhoneNumberUtil.m105815b(r8)     // Catch:{ Exception -> 0x03d2, all -> 0x03c9 }
            boolean r15 = r3.contains(r8)     // Catch:{ Exception -> 0x03d2, all -> 0x03c9 }
            if (r15 != 0) goto L_0x031e
            r3.add(r8)     // Catch:{ Exception -> 0x03d2, all -> 0x03c9 }
            goto L_0x031e
        L_0x0319:
            r34 = r8
            r33 = r12
        L_0x031d:
            r12 = 3
        L_0x031e:
            r15 = r32
            r12 = r33
        L_0x0322:
            r8 = r34
            goto L_0x0170
        L_0x0326:
            r34 = r8
            r33 = r12
            r32 = r15
            r12 = 3
            int r8 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x03d2, all -> 0x03c9 }
            r15 = 18
            if (r8 < r15) goto L_0x0354
            java.lang.String r8 = "contact_last_updated_timestamp"
            int r8 = r10.getColumnIndex(r8)     // Catch:{ Exception -> 0x03d2, all -> 0x03c9 }
            r35 = r13
            long r12 = r10.getLong(r8)     // Catch:{ Exception -> 0x03d2, all -> 0x03c9 }
            java.util.Date r8 = new java.util.Date     // Catch:{ Exception -> 0x03d2, all -> 0x03c9 }
            r8.<init>(r12)     // Catch:{ Exception -> 0x03d2, all -> 0x03c9 }
            java.text.SimpleDateFormat r12 = new java.text.SimpleDateFormat     // Catch:{ Exception -> 0x03d2, all -> 0x03c9 }
            java.lang.String r13 = "yyyy-MM-dd hh:mm:ss"
            java.util.Locale r15 = java.util.Locale.getDefault()     // Catch:{ Exception -> 0x03d2, all -> 0x03c9 }
            r12.<init>(r13, r15)     // Catch:{ Exception -> 0x03d2, all -> 0x03c9 }
            java.lang.String r8 = r12.format(r8)     // Catch:{ Exception -> 0x03d2, all -> 0x03c9 }
            goto L_0x0357
        L_0x0354:
            r35 = r13
            r8 = 0
        L_0x0357:
            r11.nickName = r14     // Catch:{ Exception -> 0x03d2, all -> 0x03c9 }
            r11.name = r0     // Catch:{ Exception -> 0x03d2, all -> 0x03c9 }
            r13 = r35
            r11.jobDesc = r13     // Catch:{ Exception -> 0x03d2, all -> 0x03c9 }
            r11.organization = r1     // Catch:{ Exception -> 0x03d2, all -> 0x03c9 }
            r11.department = r9     // Catch:{ Exception -> 0x03d2, all -> 0x03c9 }
            r11.emails = r4     // Catch:{ Exception -> 0x03d2, all -> 0x03c9 }
            r11.urls = r6     // Catch:{ Exception -> 0x03d2, all -> 0x03c9 }
            r0 = r34
            r11.note = r0     // Catch:{ Exception -> 0x03d2, all -> 0x03c9 }
            r0 = r33
            r11.birthday = r0     // Catch:{ Exception -> 0x03d2, all -> 0x03c9 }
            r11.addresses = r5     // Catch:{ Exception -> 0x03d2, all -> 0x03c9 }
            r11.instantMessageAddresses = r7     // Catch:{ Exception -> 0x03d2, all -> 0x03c9 }
            r11.modificationDate = r8     // Catch:{ Exception -> 0x03d2, all -> 0x03c9 }
            r11.phoneNumber = r3     // Catch:{ Exception -> 0x03d2, all -> 0x03c9 }
            r0 = r32
            r11.mImageUrl = r0     // Catch:{ Exception -> 0x03d2, all -> 0x03c9 }
            r0 = r30
            r11.familyName = r0     // Catch:{ Exception -> 0x03d2, all -> 0x03c9 }
            r0 = r31
            r11.givenName = r0     // Catch:{ Exception -> 0x03d2, all -> 0x03c9 }
            r1 = r29
            r1.add(r11)     // Catch:{ Exception -> 0x03c0, all -> 0x03c9 }
            if (r2 == 0) goto L_0x038d
            r2.close()
        L_0x038d:
            if (r28 == 0) goto L_0x03b8
            r3 = r28
            int r0 = r3.length
            int r2 = r21 + 1
            if (r0 <= r2) goto L_0x03ae
            r0 = r3[r2]
            r6 = r27
            if (r6 >= r0) goto L_0x039f
            r4 = r26
            goto L_0x03b2
        L_0x039f:
            r4 = r26
            java.lang.String[] r0 = r4.f111454b
            int r0 = r0.length
            if (r0 <= r2) goto L_0x0428
            java.lang.String[] r0 = r4.f111454b
            r0 = r0[r2]
            r11.section = r0
            goto L_0x0428
        L_0x03ae:
            r4 = r26
            r6 = r27
        L_0x03b2:
            java.lang.String[] r0 = r4.f111454b
            r0 = r0[r21]
            goto L_0x042f
        L_0x03b8:
            r4 = r26
            r6 = r27
            r3 = r28
            goto L_0x0431
        L_0x03c0:
            r0 = move-exception
            r4 = r26
            r6 = r27
            r3 = r28
            goto L_0x0409
        L_0x03c9:
            r0 = move-exception
            r4 = r26
            r6 = r27
            r3 = r28
            goto L_0x0440
        L_0x03d2:
            r0 = move-exception
            r4 = r26
            r6 = r27
            r3 = r28
            r1 = r29
            goto L_0x0409
        L_0x03dc:
            r0 = move-exception
            r4 = r1
            r3 = r9
            r6 = r13
            goto L_0x0440
        L_0x03e2:
            r0 = move-exception
            r4 = r1
            r24 = r8
            r3 = r9
            r1 = r12
            r6 = r13
            r25 = r14
            goto L_0x0409
        L_0x03ec:
            r0 = move-exception
            r4 = r1
            r3 = r9
            r6 = r13
            goto L_0x03fd
        L_0x03f1:
            r0 = move-exception
            r4 = r1
            r24 = r8
            r3 = r9
            r1 = r12
            r6 = r13
            goto L_0x0406
        L_0x03f9:
            r0 = move-exception
            r4 = r1
            r11 = r5
            r3 = r9
        L_0x03fd:
            r2 = 0
            goto L_0x0440
        L_0x03ff:
            r0 = move-exception
            r4 = r1
            r11 = r5
            r24 = r8
            r3 = r9
            r1 = r12
        L_0x0406:
            r25 = r14
            r2 = 0
        L_0x0409:
            com.bytedance.p066a.p067a.p070b.p072b.C2077a.m9160a(r0)     // Catch:{ all -> 0x043f }
            if (r2 == 0) goto L_0x0411
            r2.close()
        L_0x0411:
            if (r3 == 0) goto L_0x0431
            int r0 = r3.length
            int r2 = r21 + 1
            if (r0 <= r2) goto L_0x042b
            r0 = r3[r2]
            if (r6 >= r0) goto L_0x041d
            goto L_0x042b
        L_0x041d:
            java.lang.String[] r0 = r4.f111454b
            int r0 = r0.length
            if (r0 <= r2) goto L_0x0428
            java.lang.String[] r0 = r4.f111454b
            r0 = r0[r2]
            r11.section = r0
        L_0x0428:
            r21 = r2
            goto L_0x0431
        L_0x042b:
            java.lang.String[] r0 = r4.f111454b
            r0 = r0[r21]
        L_0x042f:
            r11.section = r0
        L_0x0431:
            int r6 = r6 + 1
            r12 = r1
            r9 = r3
            r1 = r4
            r8 = r24
            r14 = r25
        L_0x043a:
            r7 = 3
            r13 = 7
            r15 = 0
            goto L_0x00a3
        L_0x043f:
            r0 = move-exception
        L_0x0440:
            if (r2 == 0) goto L_0x0445
            r2.close()
        L_0x0445:
            if (r3 == 0) goto L_0x0462
            int r1 = r3.length
            int r2 = r21 + 1
            if (r1 <= r2) goto L_0x045c
            r1 = r3[r2]
            if (r6 < r1) goto L_0x045c
            java.lang.String[] r1 = r4.f111454b
            int r1 = r1.length
            if (r1 <= r2) goto L_0x0462
            java.lang.String[] r1 = r4.f111454b
            r1 = r1[r2]
            r11.section = r1
            goto L_0x0462
        L_0x045c:
            java.lang.String[] r1 = r4.f111454b
            r1 = r1[r21]
            r11.section = r1
        L_0x0462:
            throw r0
        L_0x0463:
            r4 = r1
            r10.close()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.utils.C42925am.m136269a(android.content.Context, java.lang.String, boolean):com.ss.android.ugc.aweme.utils.al");
    }

    /* renamed from: a */
    static final /* synthetic */ void m136272a(C42929a aVar, Activity activity, String[] strArr, int[] iArr) {
        if (aVar != null && iArr != null && iArr.length > 0) {
            if (iArr[0] == 0) {
                aVar.mo71408a();
                PermissionStateReporter.m136859d().mo104772e();
                return;
            }
            aVar.mo71409b();
            ((C32981dh) C23336d.m76560a(activity, C32981dh.class)).mo60487b(true);
        }
    }
}

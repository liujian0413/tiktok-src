package com.p280ss.android.ugc.aweme.i18n.draftcompat;

import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.bytedance.common.utility.p482io.C9734a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.draft.model.C27309a;
import com.p280ss.android.ugc.aweme.draft.model.C27311c;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.i18n.draftcompat.CleanUpHelper.CompatEnums;
import com.p280ss.android.ugc.aweme.metrics.C33251av;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.services.IShortVideoConfig;
import com.p280ss.android.ugc.aweme.video.C7276d;
import java.io.File;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.ss.android.ugc.aweme.i18n.draftcompat.c */
public class C30453c {

    /* renamed from: a */
    private static C30453c f80023a;

    /* renamed from: b */
    private SQLiteDatabase f80024b;

    /* renamed from: c */
    private Set<Long> f80025c = new HashSet();

    /* renamed from: d */
    private String f80026d;

    /* renamed from: e */
    private int f80027e = 0;

    /* renamed from: f */
    private int f80028f = 0;

    /* renamed from: g */
    private int f80029g = 0;

    /* renamed from: d */
    private static SharedPreferences m99478d() {
        return C7285c.m22838a(C6399b.m19921a(), "USER_PROFILE", 0);
    }

    /* renamed from: a */
    public static C30453c m99472a() {
        if (f80023a == null) {
            synchronized (C30453c.class) {
                if (f80023a == null) {
                    f80023a = new C30453c();
                }
            }
        }
        return f80023a;
    }

    /* renamed from: c */
    private Long m99477c() {
        Long l = null;
        if (m99478d().contains("CURRENT_USER_ID")) {
            long j = m99478d().getLong("CURRENT_USER_ID", -1);
            if (j > 0) {
                l = Long.valueOf(j);
            }
        }
        if (l == null || l.longValue() <= 0) {
            StringBuilder sb = new StringBuilder("invalid old musical.ly userId: ");
            sb.append(l);
            m99473a(false, sb.toString());
        }
        return l;
    }

    /* renamed from: b */
    public final void mo80129b() {
        Cursor cursor;
        Cursor cursor2;
        boolean z;
        if (C21115b.m71197a().isLogin() && C6399b.m19921a().getDatabasePath("musically.db").exists() && !CleanUpHelper.m99459b()) {
            if (TextUtils.isEmpty(C21115b.m71197a().getCurUserId())) {
                StringBuilder sb = new StringBuilder("got login but invalid userId: ");
                sb.append(C21115b.m71197a().getCurUserId());
                m99473a(false, sb.toString());
            }
            String absolutePath = C6399b.m19921a().getDatabasePath("musically.db").getAbsolutePath();
            StringBuilder sb2 = new StringBuilder();
            try {
                this.f80024b = SQLiteDatabase.openDatabase(absolutePath, null, 0);
                this.f80026d = String.valueOf(this.f80024b.getVersion());
                cursor = this.f80024b.query("T_PREVIEW_DATA_MODEL", new String[]{"MUSICAL_ID", "SEGMENTS", "LOCAL_MOVIE_URL", "MIX_AUDIO_PATH"}, null, null, null, null, null);
            } catch (Exception e) {
                StringBuilder sb3 = new StringBuilder("not found T_PREVIEW_DATA_MODEL: ");
                sb3.append(e.getMessage());
                sb3.append(" ; ");
                sb2.append(sb3.toString());
                cursor = null;
            }
            if (this.f80024b != null) {
                try {
                    Long c = m99477c();
                    if (c == null) {
                        cursor2 = this.f80024b.query("T_MUSICAL", new String[]{"LOCAL_MOVIE_URL", "TRACK_ID", "TRACK_SOURCE", "FOREIGN_TRACK_ID", "CAPTION", "id"}, "MUSICAL_SOURCE=? and STATUS=?", new String[]{"MLLocal", "0"}, null, null, null);
                    } else {
                        cursor2 = this.f80024b.query("T_MUSICAL", new String[]{"LOCAL_MOVIE_URL", "TRACK_ID", "TRACK_SOURCE", "FOREIGN_TRACK_ID", "CAPTION", "id"}, "MUSICAL_SOURCE=? and STATUS=? and AUTH_ID=?", new String[]{"MLLocal", "0", String.valueOf(c)}, null, null, null);
                    }
                } catch (Exception e2) {
                    StringBuilder sb4 = new StringBuilder("not found T_MUSICAL: ");
                    sb4.append(e2.getMessage());
                    sb4.append("; ");
                    sb2.append(sb4.toString());
                    m99473a(false, sb2.toString());
                    return;
                }
            } else {
                cursor2 = null;
            }
            if (!m99474a(cursor, true) || !m99474a(cursor2, false)) {
                z = false;
            } else {
                z = true;
            }
            try {
                this.f80024b.close();
                this.f80024b = null;
            } catch (Exception unused) {
            }
            if (z) {
                CleanUpHelper.m99456a(CompatEnums.COMPAT_DRAFT);
                if (C7276d.m22816c(absolutePath)) {
                    m99473a(true, (String) null);
                    return;
                }
                sb2.append("transform drafts succeed but remove old db file failed ");
                m99473a(false, sb2.toString());
                return;
            }
            sb2.append("save new drafts failed");
            m99473a(false, sb2.toString());
        }
    }

    /* renamed from: a */
    private boolean m99475a(C30451b bVar) {
        System.currentTimeMillis();
        IShortVideoConfig shortVideoConfig = ((IAVService) ServiceManager.get().getService(IAVService.class)).shortVideoConfig();
        C9734a.m28684b(shortVideoConfig.compatMusDraftDir());
        if (!C7276d.m22812b(bVar.f80020b)) {
            this.f80028f++;
            return true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(shortVideoConfig.compatMusDraftDir());
        sb.append(new File(bVar.f80020b).getName());
        String sb2 = sb.toString();
        String str = bVar.f80019a;
        if (!C7276d.m22812b(str)) {
            this.f80027e++;
            return true;
        }
        C7276d.m22820d(bVar.f80020b, sb2);
        this.f80029g++;
        return m99476a(str, sb2, bVar.f80021c);
    }

    /* renamed from: a */
    private boolean m99474a(Cursor cursor, boolean z) {
        boolean z2 = true;
        if (cursor != null && cursor.getCount() >= 0) {
            while (cursor.moveToNext()) {
                C30451b a = C30451b.m99468a(this.f80024b, cursor, z);
                if (!(a == null || a.f80022d == null)) {
                    if (z) {
                        this.f80025c.add(a.f80022d);
                    } else if (this.f80025c.contains(a.f80022d)) {
                    }
                }
                if (a != null && !m99475a(a)) {
                    z2 = false;
                }
            }
            try {
                cursor.close();
            } catch (Exception unused) {
            }
        }
        return z2;
    }

    /* renamed from: a */
    private void m99473a(boolean z, String str) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder(", oldDbVersion: ");
        sb2.append(this.f80026d);
        sb.append(sb2.toString());
        StringBuilder sb3 = new StringBuilder(", lostVideo: ");
        sb3.append(this.f80027e);
        sb.append(sb3.toString());
        StringBuilder sb4 = new StringBuilder(", lostAudio: ");
        sb4.append(this.f80028f);
        sb.append(sb4.toString());
        StringBuilder sb5 = new StringBuilder(", succeedCount, ");
        sb5.append(this.f80029g);
        sb.append(sb5.toString());
        if (z) {
            new C33251av().mo85155a("draft").mo85156b(sb.toString()).mo85154a(1).mo85252e();
            return;
        }
        C33251av a = new C33251av().mo85155a("draft").mo85154a(0);
        StringBuilder sb6 = new StringBuilder();
        sb6.append(str);
        sb6.append(sb.toString());
        a.mo85156b(sb6.toString()).mo85252e();
    }

    /* renamed from: a */
    private static boolean m99476a(String str, String str2, String str3) {
        C27311c cVar = new C27311c();
        cVar.mo70240c(str);
        cVar.f72039h = str2;
        C27309a aVar = new C27309a();
        aVar.f71933a = str3;
        cVar.f72033b = aVar;
        cVar.f72036e = null;
        cVar.f72041j = 50;
        cVar.f72040i = 50;
        cVar.f72045n = 0;
        cVar.f72018F = System.currentTimeMillis();
        cVar.f72017E = C21115b.m71197a().getCurUserId();
        cVar.f72013A = 0;
        cVar.f72015C = 60000;
        cVar.mo70257g(-1);
        SharePrefCache.inst().getIsAwemePrivate().mo59871a(Boolean.valueOf(false));
        if (((IAVService) ServiceManager.get().getService(IAVService.class)).draftService().save(cVar) <= 0) {
            return false;
        }
        return true;
    }
}

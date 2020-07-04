package com.p280ss.android.ugc.aweme.tools.policysecurity;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.io.Closeable;
import java.util.ArrayList;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.p1884io.C47973b;

/* renamed from: com.ss.android.ugc.aweme.tools.policysecurity.b */
public final class C42579b extends SQLiteOpenHelper {

    /* renamed from: a */
    public static C42579b f110725a;

    /* renamed from: b */
    public static final C42580a f110726b = new C42580a(null);

    /* renamed from: com.ss.android.ugc.aweme.tools.policysecurity.b$a */
    public static final class C42580a {
        private C42580a() {
        }

        public /* synthetic */ C42580a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static C42579b m135303a(Context context) {
            C7573i.m23587b(context, "context");
            if (C42579b.f110725a == null) {
                Context applicationContext = context.getApplicationContext();
                C7573i.m23582a((Object) applicationContext, "context.applicationContext");
                C42579b.f110725a = new C42579b(applicationContext);
            }
            C42579b bVar = C42579b.f110725a;
            if (bVar != null) {
                return bVar;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.tools.policysecurity.OriginalSoundSQLiteHelper");
        }
    }

    /* renamed from: a */
    public static final C42579b m135298a(Context context) {
        return C42580a.m135303a(context);
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        C7573i.m23587b(sQLiteDatabase, "db");
    }

    /* renamed from: a */
    public final ArrayList<OriginalSoundUploadTask> mo104184a() {
        Throwable th;
        ArrayList<OriginalSoundUploadTask> arrayList = new ArrayList<>();
        Closeable query = getReadableDatabase().query("OriginalSound", new String[]{"aweme_id", "vid", "audio_path", "update_time"}, null, null, null, null, null);
        try {
            Cursor cursor = (Cursor) query;
            while (cursor.moveToNext()) {
                String string = cursor.getString(cursor.getColumnIndex("aweme_id"));
                C7573i.m23582a((Object) string, "it.getString(it.getColumnIndex(AWEME_ID))");
                String string2 = cursor.getString(cursor.getColumnIndex("vid"));
                C7573i.m23582a((Object) string2, "it.getString(it.getColumnIndex(VID))");
                String string3 = cursor.getString(cursor.getColumnIndex("audio_path"));
                C7573i.m23582a((Object) string3, "it.getString(it.getColumnIndex(AUDIO_PATH))");
                OriginalSoundUploadTask originalSoundUploadTask = new OriginalSoundUploadTask(string, string2, string3, cursor.getLong(cursor.getColumnIndex("update_time")));
                arrayList.add(originalSoundUploadTask);
            }
            C47973b.m148917a(query, null);
            return arrayList;
        } catch (Throwable th2) {
            C47973b.m148917a(query, th);
            throw th2;
        }
    }

    public C42579b(Context context) {
        C7573i.m23587b(context, "context");
        super(context, "OriginalSound", null, 1);
    }

    /* renamed from: b */
    public final void mo104187b(OriginalSoundUploadTask originalSoundUploadTask) {
        C7573i.m23587b(originalSoundUploadTask, "task");
        mo104185a(originalSoundUploadTask);
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        C7573i.m23587b(sQLiteDatabase, "db");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `OriginalSound` (\n\t`aweme_id`\tTEXT NOT NULL PRIMARY KEY UNIQUE,\n\t`vid`\tTEXT NOT NULL,\n\t`audio_path`\tTEXT NOT NULL,\n\t`audio_vid`\tTEXT,\n\t`update_time`\tLONG NOT NULL\n);");
    }

    /* renamed from: a */
    public final void mo104186a(String str) {
        C7573i.m23587b(str, "awemeId");
        getWritableDatabase().delete("OriginalSound", "aweme_id = ?", new String[]{str});
    }

    /* renamed from: a */
    public final void mo104185a(OriginalSoundUploadTask originalSoundUploadTask) {
        C7573i.m23587b(originalSoundUploadTask, "originalSoundUploadTask");
        ContentValues contentValues = new ContentValues();
        contentValues.put("aweme_id", originalSoundUploadTask.f110720b);
        contentValues.put("vid", originalSoundUploadTask.f110721c);
        contentValues.put("audio_path", originalSoundUploadTask.f110722d);
        contentValues.put("audio_vid", originalSoundUploadTask.f110719a);
        contentValues.put("update_time", Long.valueOf(originalSoundUploadTask.f110723e));
        getWritableDatabase().replace("OriginalSound", null, contentValues);
    }
}

package com.p280ss.android.ugc.aweme.tools.extract.upload;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.tools.extract.upload.a */
public class C42339a extends SQLiteOpenHelper {

    /* renamed from: a */
    private static C42339a f110129a;

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    /* renamed from: a */
    public final List<C42340b> mo103819a() {
        ArrayList arrayList = new ArrayList();
        Cursor query = getReadableDatabase().query("frames_table", new String[]{"aweme_id", "video_id", "zip_uri", "zip_path", "extract_model", "update_time"}, null, null, null, null, null);
        while (query.moveToNext()) {
            C42340b bVar = new C42340b(query.getString(query.getColumnIndex("aweme_id")), query.getString(query.getColumnIndex("video_id")), query.getString(query.getColumnIndex("zip_uri")), query.getString(query.getColumnIndex("zip_path")), ExtractFramesModel.string2Model(query.getString(query.getColumnIndex("extract_model"))), query.getLong(query.getColumnIndex("update_time")));
            arrayList.add(bVar);
        }
        query.close();
        return arrayList;
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `frames_table` (\n\t`aweme_id`\tTEXT NOT NULL PRIMARY KEY UNIQUE,\n\t`video_id`\tTEXT NOT NULL,\n\t`zip_uri`\tTEXT NOT NULL,\n\t`zip_path`\tTEXT NOT NULL,\n\t`extract_model`\tTEXT NOT NULL,\n\t`update_time`\tLONG NOT NULL\n);");
    }

    /* renamed from: a */
    public final void mo103821a(String str) {
        if (!TextUtils.isEmpty(str)) {
            getWritableDatabase().delete("frames_table", "aweme_id = ?", new String[]{str});
        }
    }

    /* renamed from: a */
    public static C42339a m134629a(Context context) {
        if (f110129a == null) {
            synchronized (C42339a.class) {
                if (f110129a == null) {
                    f110129a = new C42339a(context.getApplicationContext(), "frames_table", null, 1);
                }
            }
        }
        return f110129a;
    }

    /* renamed from: a */
    public final void mo103820a(C42340b bVar) {
        if (bVar.f110134e == null) {
            mo103821a(bVar.f110130a);
            return;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("aweme_id", bVar.f110130a);
        contentValues.put("video_id", bVar.f110131b);
        contentValues.put("zip_uri", bVar.f110132c);
        contentValues.put("zip_path", bVar.f110133d);
        contentValues.put("extract_model", bVar.f110134e.toString());
        contentValues.put("update_time", Long.valueOf(System.currentTimeMillis()));
        getWritableDatabase().replace("frames_table", null, contentValues);
    }

    private C42339a(Context context, String str, CursorFactory cursorFactory, int i) {
        super(context, str, null, 1);
    }
}

package com.p280ss.android.ugc.aweme.shortvideo.sticker.p1602d;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore.Images.Media;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.utils.C42973bg;
import com.p280ss.android.ugc.aweme.utils.C43055dg;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.d.a */
public final class C40532a {

    /* renamed from: a */
    private static final String[] f105335a = {"_data", "date_added"};

    /* renamed from: b */
    private static void m129593b(Cursor cursor) {
        if (cursor != null) {
            cursor.close();
        }
    }

    /* renamed from: a */
    private static C40544e m129591a(Cursor cursor) {
        C40544e eVar = new C40544e();
        eVar.f105358a = cursor.getString(0);
        if (C42973bg.m136427a(eVar.f105358a)) {
            eVar.f105359b = Math.max(cursor.getLong(1), new File(eVar.f105358a).lastModified());
        } else {
            eVar.f105359b = cursor.getLong(1);
        }
        return eVar;
    }

    /* renamed from: a */
    public static List<C40544e> m129592a(long j, long j2, String str, int i) {
        C43055dg.m136598a();
        ArrayList arrayList = new ArrayList();
        String str2 = "_data like ? ";
        ArrayList arrayList2 = new ArrayList();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("%");
        arrayList2.add(sb.toString());
        if (j > 0 && j2 > 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            sb2.append("AND date_added NOT BETWEEN ? AND ? ");
            str2 = sb2.toString();
            arrayList2.add(String.valueOf(j));
            arrayList2.add(String.valueOf(j2));
        } else if (j > 0 || j2 > 0) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str2);
            sb3.append("ANDdate_added > ?");
            str2 = sb3.toString();
            arrayList2.add(String.valueOf(Math.max(j, j2)));
        }
        String str3 = str2;
        String[] strArr = new String[arrayList2.size()];
        arrayList2.toArray(strArr);
        ContentResolver contentResolver = C35574k.m114861b().getContentResolver();
        Uri uri = Media.EXTERNAL_CONTENT_URI;
        String[] strArr2 = f105335a;
        StringBuilder sb4 = new StringBuilder("date_added DESC LIMIT ");
        sb4.append(1000);
        Cursor query = contentResolver.query(uri, strArr2, str3, strArr, sb4.toString());
        if (query != null) {
            while (query.moveToNext()) {
                try {
                    arrayList.add(m129591a(query));
                } finally {
                    m129593b(query);
                }
            }
        }
        return arrayList;
    }
}

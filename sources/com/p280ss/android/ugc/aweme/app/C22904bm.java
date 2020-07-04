package com.p280ss.android.ugc.aweme.app;

import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.C6307b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.app.bm */
public final class C22904bm<T> extends C22903bl<List<T>> {

    /* renamed from: d */
    private Class<T> f60632d;

    /* renamed from: e */
    public final List<T> mo59877d() {
        String string = m75371a().getString(this.f60630b, "");
        if (TextUtils.isEmpty(string)) {
            return (List) this.f60629a;
        }
        String[] split = string.split(",");
        ArrayList arrayList = new ArrayList(split.length);
        for (String str : split) {
            if (this.f60632d == String.class) {
                arrayList.add(str);
            } else if (this.f60632d == Integer.class) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str)));
            } else if (this.f60632d == Float.class) {
                arrayList.add(Float.valueOf(Float.parseFloat(str)));
            } else if (this.f60632d == Long.class) {
                arrayList.add(Long.valueOf(Long.parseLong(str)));
            } else if (this.f60632d == Boolean.class) {
                arrayList.add(Boolean.valueOf(Boolean.parseBoolean(str)));
            } else {
                StringBuilder sb = new StringBuilder("un support type: ");
                sb.append(this.f60632d.getName());
                throw new RuntimeException(sb.toString());
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo59870a(Editor editor, List<T> list) {
        if (C6307b.m19566a((Collection<T>) list)) {
            editor.remove(this.f60630b);
        } else {
            editor.putString(this.f60630b, TextUtils.join(",", list));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo59872a(List<T> list, boolean z) {
        Editor edit = m75371a().edit();
        if (C6307b.m19566a((Collection<T>) list)) {
            edit.remove(this.f60630b);
        } else {
            edit.putString(this.f60630b, TextUtils.join(",", list));
        }
        edit.apply();
    }

    public C22904bm(Class<T> cls, String str, List<T> list) {
        super(str, list);
        this.f60632d = cls;
    }
}

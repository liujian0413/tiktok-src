package com.google.android.gms.internal.ads;

import android.content.SharedPreferences.Editor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONObject;

@C6505uv
/* renamed from: com.google.android.gms.internal.ads.br */
public final class C15580br {

    /* renamed from: a */
    private final Collection<C15573bl<?>> f43301a = new ArrayList();

    /* renamed from: b */
    private final Collection<C15573bl<String>> f43302b = new ArrayList();

    /* renamed from: c */
    private final Collection<C15573bl<String>> f43303c = new ArrayList();

    /* renamed from: a */
    public final void mo41183a(C15573bl blVar) {
        this.f43301a.add(blVar);
    }

    /* renamed from: b */
    public final void mo41185b(C15573bl<String> blVar) {
        this.f43302b.add(blVar);
    }

    /* renamed from: c */
    public final void mo41186c(C15573bl<String> blVar) {
        this.f43303c.add(blVar);
    }

    /* renamed from: a */
    public final void mo41182a(Editor editor, int i, JSONObject jSONObject) {
        for (C15573bl blVar : this.f43301a) {
            if (blVar.f42433a == 1) {
                blVar.mo40871a(editor, blVar.mo40870a(jSONObject));
            }
        }
        if (jSONObject != null) {
            editor.putString("flag_configuration", jSONObject.toString());
        } else {
            afm.m45779c("Flag Json is null.");
        }
    }

    /* renamed from: a */
    public final List<String> mo41181a() {
        ArrayList arrayList = new ArrayList();
        for (C15573bl a : this.f43302b) {
            String str = (String) bym.m50299d().mo41272a(a);
            if (str != null) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public final List<String> mo41184b() {
        List<String> a = mo41181a();
        for (C15573bl a2 : this.f43303c) {
            String str = (String) bym.m50299d().mo41272a(a2);
            if (str != null) {
                a.add(str);
            }
        }
        return a;
    }
}

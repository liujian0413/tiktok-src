package com.p280ss.android.ugc.aweme.setting.p336a;

import com.google.gson.p276a.C6593c;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* renamed from: com.ss.android.ugc.aweme.setting.a.g */
public final class C37538g {

    /* renamed from: a */
    public static LinkedHashMap<String, ArrayList<C37538g>> f97915a = new LinkedHashMap<>();

    /* renamed from: b */
    public static ArrayList<C37538g> f97916b = new ArrayList<>();

    /* renamed from: c */
    public Field f97917c;

    /* renamed from: d */
    public C7204b f97918d;

    /* renamed from: e */
    public C7206i f97919e;

    /* renamed from: f */
    public ArrayList<String> f97920f = new ArrayList<>();

    /* renamed from: g */
    public String f97921g;

    /* renamed from: h */
    private C7205f f97922h;

    /* renamed from: i */
    private Object f97923i;

    /* renamed from: a */
    private String m120253a() {
        return this.f97922h.mo18698a();
    }

    /* renamed from: a */
    public static C37538g m120252a(Field field, Object obj) {
        if (field.getAnnotation(Deprecated.class) != null) {
            return null;
        }
        if (field.getAnnotation(C7205f.class) == null) {
            f97916b.add(new C37538g(field, obj));
            return null;
        }
        C37538g gVar = new C37538g(field, obj);
        String a = gVar.m120253a();
        if (!f97915a.containsKey(a)) {
            f97915a.put(a, new ArrayList());
        }
        ((ArrayList) f97915a.get(a)).add(gVar);
        f97916b.add(gVar);
        return gVar;
    }

    private C37538g(Field field, Object obj) {
        String str;
        this.f97917c = field;
        this.f97923i = obj;
        field.setAccessible(true);
        this.f97922h = (C7205f) field.getAnnotation(C7205f.class);
        this.f97920f.add(field.getName().toLowerCase());
        this.f97921g = field.getName();
        C6593c cVar = (C6593c) field.getAnnotation(C6593c.class);
        if (cVar != null) {
            this.f97920f.add(cVar.mo15949a().toLowerCase());
        }
        this.f97918d = (C7204b) field.getAnnotation(C7204b.class);
        if (this.f97918d != null) {
            this.f97920f.add(this.f97918d.mo18697b().toLowerCase());
            this.f97920f.add(this.f97918d.mo18696a().toLowerCase());
            try {
                if (((Boolean) field.get(obj)).booleanValue()) {
                    str = this.f97918d.mo18696a();
                } else {
                    str = this.f97918d.mo18697b();
                }
                this.f97921g = str;
            } catch (Exception unused) {
            }
        }
        this.f97919e = (C7206i) field.getAnnotation(C7206i.class);
        if (this.f97919e != null) {
            this.f97920f.add(this.f97919e.mo18699a());
            this.f97921g = this.f97919e.mo18699a();
        }
        if (this.f97919e != null) {
            StringBuilder sb = new StringBuilder("1");
            sb.append(this.f97921g.trim().toLowerCase());
            this.f97921g = sb.toString();
            return;
        }
        StringBuilder sb2 = new StringBuilder("0");
        sb2.append(this.f97921g.trim().toLowerCase());
        this.f97921g = sb2.toString();
    }
}

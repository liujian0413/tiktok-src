package com.bytedance.scene.navigation;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.scene.C12629j;
import com.bytedance.scene.C12640l;
import com.bytedance.scene.utlity.SceneInstanceUtility;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.scene.navigation.h */
final class C12668h {

    /* renamed from: a */
    private List<Record> f33633a = new ArrayList();

    /* renamed from: c */
    public final List<Record> mo31114c() {
        return new ArrayList(this.f33633a);
    }

    C12668h() {
    }

    /* renamed from: b */
    public final boolean mo31113b() {
        if (this.f33633a.size() > 1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final Record mo31107a() {
        if (this.f33633a.size() > 0) {
            return (Record) this.f33633a.get(this.f33633a.size() - 1);
        }
        return null;
    }

    /* renamed from: a */
    public final void mo31111a(Record record) {
        this.f33633a.add(record);
    }

    /* renamed from: b */
    public final void mo31112b(Record record) {
        this.f33633a.remove(record);
    }

    /* renamed from: a */
    public final void mo31110a(Bundle bundle) {
        bundle.putParcelableArrayList("bd-scene-nav:record_stack", new ArrayList(this.f33633a));
    }

    /* renamed from: a */
    public final Record mo31108a(C12629j jVar) {
        for (Record record : this.f33633a) {
            if (record.f33566a == jVar) {
                return record;
            }
        }
        return null;
    }

    /* renamed from: a */
    public final void mo31109a(Context context, Bundle bundle, C12640l lVar) {
        C12629j jVar;
        this.f33633a = new ArrayList(bundle.getParcelableArrayList("bd-scene-nav:record_stack"));
        for (int i = 0; i < this.f33633a.size(); i++) {
            Record record = (Record) this.f33633a.get(i);
            if (i != 0 || lVar == null) {
                jVar = null;
            } else {
                jVar = lVar.mo31032a(context.getClassLoader(), record.f33572g, null);
                if (!(jVar == null || jVar.f33524c == null)) {
                    throw new IllegalArgumentException("SceneComponentFactory instantiateScene return Scene already has a parent");
                }
            }
            if (jVar == null) {
                jVar = SceneInstanceUtility.m36886a(context, record.f33572g, null);
            }
            record.f33566a = jVar;
        }
    }
}

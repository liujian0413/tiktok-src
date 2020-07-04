package com.bytedance.scene.group;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.bytedance.scene.C12629j;
import com.bytedance.scene.utlity.SceneInstanceUtility;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.bytedance.scene.group.a */
final class C12603a {

    /* renamed from: a */
    private List<GroupRecord> f33448a = new ArrayList();

    /* renamed from: b */
    public final List<GroupRecord> mo30918b() {
        return Collections.unmodifiableList(this.f33448a);
    }

    C12603a() {
    }

    /* renamed from: a */
    public final List<C12629j> mo30914a() {
        ArrayList arrayList = new ArrayList();
        for (GroupRecord groupRecord : this.f33448a) {
            arrayList.add(groupRecord.f33437b);
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: a */
    public final void mo30917a(GroupRecord groupRecord) {
        this.f33448a.add(groupRecord);
    }

    /* renamed from: a */
    public final void mo30916a(Bundle bundle) {
        bundle.putParcelableArrayList("bd-scene-nav:group_stack", new ArrayList(this.f33448a));
    }

    /* renamed from: b */
    public final void mo30919b(GroupRecord groupRecord) {
        this.f33448a.remove(groupRecord);
    }

    /* renamed from: a */
    public final GroupRecord mo30911a(View view) {
        for (GroupRecord groupRecord : this.f33448a) {
            if (view.equals(groupRecord.f33437b.f33523b)) {
                return groupRecord;
            }
        }
        return null;
    }

    /* renamed from: a */
    public final GroupRecord mo30912a(C12629j jVar) {
        for (GroupRecord groupRecord : this.f33448a) {
            if (groupRecord.f33437b == jVar) {
                return groupRecord;
            }
        }
        return null;
    }

    /* renamed from: a */
    public final GroupRecord mo30913a(String str) {
        for (GroupRecord groupRecord : this.f33448a) {
            if (str.equals(groupRecord.f33438c)) {
                return groupRecord;
            }
        }
        return null;
    }

    /* renamed from: a */
    public final void mo30915a(Context context, Bundle bundle) {
        if (this.f33448a == null || this.f33448a.size() <= 0) {
            this.f33448a = new ArrayList(bundle.getParcelableArrayList("bd-scene-nav:group_stack"));
            for (GroupRecord groupRecord : this.f33448a) {
                groupRecord.f33437b = SceneInstanceUtility.m36886a(context, groupRecord.f33441f, null);
            }
            return;
        }
        throw new IllegalStateException("mSceneList size is not zero, Scene is added before restore");
    }
}

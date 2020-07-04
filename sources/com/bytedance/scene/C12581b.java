package com.bytedance.scene;

import android.app.Activity;
import android.content.res.Resources.NotFoundException;
import android.view.View;

/* renamed from: com.bytedance.scene.b */
public final class C12581b implements C12703x {

    /* renamed from: a */
    private final Activity f33402a;

    C12581b(Activity activity) {
        this.f33402a = activity;
    }

    /* renamed from: a */
    public final <T extends View> T mo30855a(int i) {
        T findViewById = this.f33402a.findViewById(i);
        if (findViewById != null) {
            return findViewById;
        }
        try {
            String resourceName = this.f33402a.getResources().getResourceName(i);
            StringBuilder sb = new StringBuilder(" ");
            sb.append(resourceName);
            sb.append(" view not found");
            throw new IllegalArgumentException(sb.toString());
        } catch (NotFoundException unused) {
            StringBuilder sb2 = new StringBuilder(" ");
            sb2.append(i);
            sb2.append(" view not found");
            throw new IllegalArgumentException(sb2.toString());
        }
    }
}

package com.p280ss.android.ugc.aweme.p998ai;

import android.view.View;
import android.view.ViewParent;
import com.bytedance.ies.ugc.appcontext.C6399b;
import java.util.WeakHashMap;

/* renamed from: com.ss.android.ugc.aweme.ai.a */
public abstract class C22475a<PARAM_TYPE, SUB> {

    /* renamed from: b */
    protected WeakHashMap<View, PARAM_TYPE> f59923b = new WeakHashMap<>();

    /* renamed from: a */
    public final PARAM_TYPE mo59054a(View view) {
        PARAM_TYPE param_type = this.f59923b.get(view);
        int i = 0;
        while (view.getId() != 16908290) {
            if (i <= 30) {
                param_type = this.f59923b.get(view);
                if (param_type != null) {
                    break;
                }
                ViewParent parent = view.getParent();
                if (!(parent instanceof View)) {
                    break;
                }
                view = (View) parent;
                i++;
            } else if (!C6399b.m19928c()) {
                return null;
            } else {
                throw new RuntimeException("View层级好深啊");
            }
        }
        return param_type;
    }

    /* renamed from: a */
    public final SUB mo59055a(View view, PARAM_TYPE param_type) {
        this.f59923b.put(view, param_type);
        return this;
    }
}

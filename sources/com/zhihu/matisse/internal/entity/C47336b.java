package com.zhihu.matisse.internal.entity;

import android.content.Context;
import android.support.p022v4.app.FragmentActivity;
import android.widget.Toast;
import com.zhihu.matisse.internal.p1856ui.widget.IncapableDialog;

/* renamed from: com.zhihu.matisse.internal.entity.b */
public final class C47336b {

    /* renamed from: a */
    private int f121442a;

    /* renamed from: b */
    private String f121443b;

    /* renamed from: c */
    private String f121444c;

    public C47336b(String str) {
        this.f121444c = str;
    }

    public C47336b(int i, String str) {
        this.f121442a = 1;
        this.f121444c = str;
    }

    /* renamed from: a */
    public static void m147801a(Context context, C47336b bVar) {
        if (bVar != null) {
            switch (bVar.f121442a) {
                case 1:
                    IncapableDialog.m147907a(bVar.f121443b, bVar.f121444c).show(((FragmentActivity) context).getSupportFragmentManager(), IncapableDialog.class.getName());
                    return;
                case 2:
                    return;
                default:
                    C47337c.m147802a(Toast.makeText(context, bVar.f121444c, 0));
                    return;
            }
        }
    }
}

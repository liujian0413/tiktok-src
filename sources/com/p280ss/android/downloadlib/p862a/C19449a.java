package com.p280ss.android.downloadlib.p862a;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.graphics.drawable.Drawable;
import android.widget.Toast;
import com.p280ss.android.download.api.model.C19394c;
import com.p280ss.android.download.api.p857a.C19379h;

/* renamed from: com.ss.android.downloadlib.a.a */
public final class C19449a implements C19379h {
    /* renamed from: a */
    public final Dialog mo51364a(C19394c cVar) {
        return m63980b(cVar);
    }

    /* renamed from: b */
    private static Dialog m63980b(final C19394c cVar) {
        if (cVar == null) {
            return null;
        }
        AlertDialog show = new Builder(cVar.f52450a).setTitle(cVar.f52451b).setMessage(cVar.f52452c).setPositiveButton(cVar.f52453d, new OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                if (cVar.f52457h != null) {
                    cVar.f52457h.mo51398a(dialogInterface);
                }
            }
        }).setNegativeButton(cVar.f52454e, new OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                if (cVar.f52457h != null) {
                    cVar.f52457h.mo51399b(dialogInterface);
                }
            }
        }).show();
        show.setCanceledOnTouchOutside(cVar.f52455f);
        show.setOnCancelListener(new OnCancelListener() {
            public final void onCancel(DialogInterface dialogInterface) {
                if (cVar.f52457h != null) {
                    cVar.f52457h.mo51400c(dialogInterface);
                }
            }
        });
        if (cVar.f52456g != null) {
            show.setIcon(cVar.f52456g);
        }
        return show;
    }

    /* renamed from: a */
    public final void mo51365a(Context context, String str, Drawable drawable, int i) {
        C19453b.m63983a(Toast.makeText(context, str, 0));
    }
}

package com.p1848vk.sdk.dialogs;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.graphics.Bitmap;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.p1848vk.sdk.api.C47121c;
import com.p1848vk.sdk.api.httpClient.C47135a;
import com.p1848vk.sdk.api.httpClient.C47147f;
import com.p1848vk.sdk.api.httpClient.C47147f.C47150a;
import com.p1848vk.sdk.api.httpClient.VKAbstractOperation;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.vk.sdk.dialogs.a */
public class C47228a {

    /* renamed from: d */
    static final /* synthetic */ boolean f121380d = (!C47228a.class.desiredAssertionStatus());

    /* renamed from: a */
    public final C47121c f121381a;

    /* renamed from: b */
    public ImageView f121382b;

    /* renamed from: c */
    public ProgressBar f121383c;

    /* renamed from: e */
    private EditText f121384e;

    /* renamed from: f */
    private float f121385f;

    /* renamed from: a */
    public final void mo118704a() {
        String str;
        C47121c cVar = this.f121381a;
        if (this.f121384e.getText() != null) {
            str = this.f121384e.getText().toString();
        } else {
            str = "";
        }
        cVar.mo118414a(str);
    }

    /* renamed from: b */
    public final void mo118706b() {
        C47147f fVar = new C47147f(this.f121381a.f120928i);
        fVar.f120968f = this.f121385f;
        fVar.mo118436a(new C47150a() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void mo118401a(C47147f fVar, C47121c cVar) {
                C47228a.this.mo118706b();
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void mo118402a(C47147f fVar, Bitmap bitmap) {
                C47228a.this.f121382b.setImageBitmap(bitmap);
                C47228a.this.f121382b.setVisibility(0);
                C47228a.this.f121383c.setVisibility(8);
            }
        });
        C47135a.m147382a((VKAbstractOperation) fVar);
    }

    public C47228a(C47121c cVar) {
        this.f121381a = cVar;
    }

    /* renamed from: a */
    public final void mo118705a(Context context, OnDismissListener onDismissListener) {
        View inflate = View.inflate(context, R.layout.b57, null);
        if (f121380d || inflate != null) {
            this.f121384e = (EditText) inflate.findViewById(R.id.t2);
            this.f121382b = (ImageView) inflate.findViewById(R.id.ay5);
            this.f121383c = (ProgressBar) inflate.findViewById(R.id.ckz);
            this.f121385f = context.getResources().getDisplayMetrics().density;
            final AlertDialog create = new Builder(context).setView(inflate).create();
            this.f121384e.setOnFocusChangeListener(new OnFocusChangeListener() {
                public final void onFocusChange(View view, boolean z) {
                    if (z) {
                        create.getWindow().setSoftInputMode(5);
                    }
                }
            });
            this.f121384e.setOnEditorActionListener(new OnEditorActionListener() {
                public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                    if (i != 4) {
                        return false;
                    }
                    C47228a.this.mo118704a();
                    create.dismiss();
                    return true;
                }
            });
            create.setButton(-2, context.getString(17039370), new OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    C47228a.this.mo118704a();
                    dialogInterface.dismiss();
                }
            });
            create.setOnCancelListener(new OnCancelListener() {
                public final void onCancel(DialogInterface dialogInterface) {
                    create.dismiss();
                    C47228a.this.f121381a.f120922c.mo118399g();
                }
            });
            create.setOnDismissListener(onDismissListener);
            mo118706b();
            create.show();
            return;
        }
        throw new AssertionError();
    }
}

package com.p280ss.android.socialbase.appdownloader.p902a;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.widget.Button;
import com.p280ss.android.socialbase.appdownloader.depend.AbsDownloadAlertDialogBuilder;
import com.p280ss.android.socialbase.appdownloader.depend.IDownloadAlertDialog;
import com.p280ss.android.socialbase.appdownloader.depend.IDownloadAlertDialogBuilder;

/* renamed from: com.ss.android.socialbase.appdownloader.a.a */
public final class C20159a extends AbsDownloadAlertDialogBuilder {

    /* renamed from: a */
    private Builder f54563a;

    /* renamed from: com.ss.android.socialbase.appdownloader.a.a$a */
    static class C20160a implements IDownloadAlertDialog {

        /* renamed from: a */
        private AlertDialog f54564a;

        public final void dismiss() {
            if (this.f54564a != null) {
                this.f54564a.dismiss();
            }
        }

        public final boolean isShowing() {
            if (this.f54564a != null) {
                return this.f54564a.isShowing();
            }
            return false;
        }

        public final void show() {
            if (this.f54564a != null) {
                this.f54564a.show();
            }
        }

        public C20160a(Builder builder) {
            if (builder != null) {
                this.f54564a = builder.show();
            }
        }

        public final Button getButton(int i) {
            if (this.f54564a != null) {
                return this.f54564a.getButton(i);
            }
            return null;
        }
    }

    public final IDownloadAlertDialog show() {
        return new C20160a(this.f54563a);
    }

    public C20159a(Context context) {
        this.f54563a = new Builder(context);
    }

    public final IDownloadAlertDialogBuilder setMessage(String str) {
        if (this.f54563a != null) {
            this.f54563a.setMessage(str);
        }
        return this;
    }

    public final IDownloadAlertDialogBuilder setOnCancelListener(OnCancelListener onCancelListener) {
        if (this.f54563a != null) {
            this.f54563a.setOnCancelListener(onCancelListener);
        }
        return this;
    }

    public final IDownloadAlertDialogBuilder setTitle(int i) {
        if (this.f54563a != null) {
            this.f54563a.setTitle(i);
        }
        return this;
    }

    public final IDownloadAlertDialogBuilder setNegativeButton(int i, OnClickListener onClickListener) {
        if (this.f54563a != null) {
            this.f54563a.setNegativeButton(i, onClickListener);
        }
        return this;
    }

    public final IDownloadAlertDialogBuilder setPositiveButton(int i, OnClickListener onClickListener) {
        if (this.f54563a != null) {
            this.f54563a.setPositiveButton(i, onClickListener);
        }
        return this;
    }

    public final IDownloadAlertDialogBuilder setNegativeButton(CharSequence charSequence, OnClickListener onClickListener) {
        if (this.f54563a != null) {
            this.f54563a.setNegativeButton(charSequence, onClickListener);
        }
        return this;
    }

    public final IDownloadAlertDialogBuilder setPositiveButton(CharSequence charSequence, OnClickListener onClickListener) {
        if (this.f54563a != null) {
            this.f54563a.setPositiveButton(charSequence, onClickListener);
        }
        return this;
    }
}

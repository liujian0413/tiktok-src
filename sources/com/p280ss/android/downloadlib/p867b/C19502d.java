package com.p280ss.android.downloadlib.p867b;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.graphics.drawable.Drawable;
import android.widget.Button;
import com.p280ss.android.download.api.model.C19394c.C19396a;
import com.p280ss.android.download.api.model.C19394c.C19397b;
import com.p280ss.android.downloadlib.addownload.C19491j;
import com.p280ss.android.downloadlib.p868c.C19523h;
import com.p280ss.android.socialbase.appdownloader.depend.AbsAppDownloadDepend;
import com.p280ss.android.socialbase.appdownloader.depend.IDownloadAlertDialog;
import com.p280ss.android.socialbase.appdownloader.depend.IDownloadAlertDialogBuilder;

/* renamed from: com.ss.android.downloadlib.b.d */
public class C19502d extends AbsAppDownloadDepend {

    /* renamed from: a */
    public static String f52797a = "d";

    /* renamed from: com.ss.android.downloadlib.b.d$a */
    static class C19505a implements IDownloadAlertDialog {

        /* renamed from: a */
        private Dialog f52805a;

        public final Button getButton(int i) {
            return null;
        }

        public final void dismiss() {
            if (this.f52805a != null) {
                C19506e.m64273a(this.f52805a);
            }
        }

        public final boolean isShowing() {
            if (this.f52805a != null) {
                return this.f52805a.isShowing();
            }
            return false;
        }

        public final void show() {
            if (this.f52805a != null) {
                this.f52805a.show();
            }
        }

        public C19505a(Dialog dialog) {
            if (dialog != null) {
                this.f52805a = dialog;
                show();
            }
        }
    }

    public boolean getAllowBootReceiver() {
        return true;
    }

    public boolean getAllowNetwork(Context context) {
        return true;
    }

    public boolean needClearWhenTaskReset() {
        return C19523h.m64317a();
    }

    public IDownloadAlertDialogBuilder getThemedAlertDlgBuilder(final Context context) {
        return new IDownloadAlertDialogBuilder() {

            /* renamed from: a */
            public OnClickListener f52798a;

            /* renamed from: b */
            public OnClickListener f52799b;

            /* renamed from: c */
            public OnCancelListener f52800c;

            /* renamed from: f */
            private C19396a f52803f = new C19396a(context);

            public final IDownloadAlertDialogBuilder setIcon(int i) {
                return this;
            }

            public final IDownloadAlertDialog show() {
                this.f52803f.mo51391a((C19397b) new C19397b() {
                    /* renamed from: a */
                    public final void mo51398a(DialogInterface dialogInterface) {
                        if (C195031.this.f52798a != null) {
                            C195031.this.f52798a.onClick(dialogInterface, -1);
                        }
                    }

                    /* renamed from: b */
                    public final void mo51399b(DialogInterface dialogInterface) {
                        if (C195031.this.f52799b != null) {
                            C195031.this.f52799b.onClick(dialogInterface, -2);
                        }
                    }

                    /* renamed from: c */
                    public final void mo51400c(DialogInterface dialogInterface) {
                        if (C195031.this.f52800c != null && dialogInterface != null) {
                            C195031.this.f52800c.onCancel(dialogInterface);
                        }
                    }
                });
                this.f52803f.mo51389a(3);
                return new C19505a(C19491j.m64223d().mo51364a(this.f52803f.mo51394a()));
            }

            public final IDownloadAlertDialogBuilder setOnCancelListener(OnCancelListener onCancelListener) {
                this.f52800c = onCancelListener;
                return this;
            }

            public final IDownloadAlertDialogBuilder setCanceledOnTouchOutside(boolean z) {
                this.f52803f.mo51393a(z);
                return this;
            }

            public final IDownloadAlertDialogBuilder setIcon(Drawable drawable) {
                this.f52803f.mo51390a(drawable);
                return this;
            }

            public final IDownloadAlertDialogBuilder setMessage(String str) {
                this.f52803f.mo51395b(str);
                return this;
            }

            public final IDownloadAlertDialogBuilder setTitle(int i) {
                this.f52803f.mo51392a(context.getResources().getString(i));
                return this;
            }

            public final IDownloadAlertDialogBuilder setNegativeButton(CharSequence charSequence, OnClickListener onClickListener) {
                this.f52803f.mo51397d((String) charSequence);
                this.f52799b = onClickListener;
                return this;
            }

            public final IDownloadAlertDialogBuilder setPositiveButton(CharSequence charSequence, OnClickListener onClickListener) {
                this.f52803f.mo51396c((String) charSequence);
                this.f52798a = onClickListener;
                return this;
            }

            public final IDownloadAlertDialogBuilder setNegativeButton(int i, OnClickListener onClickListener) {
                this.f52803f.mo51397d(context.getResources().getString(i));
                this.f52799b = onClickListener;
                return this;
            }

            public final IDownloadAlertDialogBuilder setPositiveButton(int i, OnClickListener onClickListener) {
                this.f52803f.mo51396c(context.getResources().getString(i));
                this.f52798a = onClickListener;
                return this;
            }
        };
    }
}

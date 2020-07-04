package com.p280ss.android.socialbase.appdownloader.depend;

import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.graphics.drawable.Drawable;

/* renamed from: com.ss.android.socialbase.appdownloader.depend.IDownloadAlertDialogBuilder */
public interface IDownloadAlertDialogBuilder {
    IDownloadAlertDialogBuilder setCanceledOnTouchOutside(boolean z);

    IDownloadAlertDialogBuilder setIcon(int i);

    IDownloadAlertDialogBuilder setIcon(Drawable drawable);

    IDownloadAlertDialogBuilder setMessage(String str);

    IDownloadAlertDialogBuilder setNegativeButton(int i, OnClickListener onClickListener);

    IDownloadAlertDialogBuilder setNegativeButton(CharSequence charSequence, OnClickListener onClickListener);

    IDownloadAlertDialogBuilder setOnCancelListener(OnCancelListener onCancelListener);

    IDownloadAlertDialogBuilder setPositiveButton(int i, OnClickListener onClickListener);

    IDownloadAlertDialogBuilder setPositiveButton(CharSequence charSequence, OnClickListener onClickListener);

    IDownloadAlertDialogBuilder setTitle(int i);

    IDownloadAlertDialog show();
}

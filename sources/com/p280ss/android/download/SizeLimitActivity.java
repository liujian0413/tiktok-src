package com.p280ss.android.download;

import android.app.Activity;
import android.app.Dialog;
import android.content.ContentValues;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.text.format.Formatter;
import com.bytedance.ies.uikit.dialog.C11029b.C11030a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.LinkedList;
import java.util.Queue;

/* renamed from: com.ss.android.download.SizeLimitActivity */
public class SizeLimitActivity extends Activity implements OnClickListener {

    /* renamed from: a */
    private Dialog f52370a;

    /* renamed from: b */
    private Queue<Intent> f52371b = new LinkedList();

    /* renamed from: c */
    private Uri f52372c;

    /* renamed from: d */
    private Intent f52373d;

    /* renamed from: b */
    private void m63538b() {
        this.f52370a = null;
        this.f52372c = null;
        m63536a();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        Intent intent = getIntent();
        if (intent != null) {
            this.f52371b.add(intent);
            setIntent(null);
            m63536a();
        }
        if (this.f52370a != null && !this.f52370a.isShowing()) {
            this.f52370a.show();
        }
    }

    /* renamed from: a */
    private void m63536a() {
        if (this.f52370a == null) {
            if (this.f52371b.isEmpty()) {
                finish();
                return;
            }
            this.f52373d = (Intent) this.f52371b.poll();
            this.f52372c = this.f52373d.getData();
            if (this.f52372c == null) {
                m63538b();
                return;
            }
            Cursor a = C19422f.m63833a(getApplicationContext()).mo51451a(this.f52372c, (String[]) null, (String) null, (String[]) null, (String) null);
            try {
                if (!a.moveToFirst()) {
                    m63538b();
                    if (a != null) {
                        try {
                            a.close();
                        } catch (Exception unused) {
                            return;
                        }
                    }
                    return;
                }
                m63537a(a);
                if (a != null) {
                    try {
                        a.close();
                    } catch (Exception unused2) {
                    }
                }
            } catch (Exception unused3) {
                if (a != null) {
                    try {
                        a.close();
                    } catch (Exception unused4) {
                    }
                }
            } finally {
                if (a != null) {
                    try {
                        a.close();
                    } catch (Exception unused5) {
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    /* renamed from: a */
    private void m63537a(Cursor cursor) {
        String formatFileSize = Formatter.formatFileSize(this, (long) cursor.getInt(cursor.getColumnIndexOrThrow("total_bytes")));
        String string = getString(R.string.vk);
        boolean z = this.f52373d.getExtras().getBoolean("isWifiRequired");
        C11030a b = C19431j.m63891b((Context) this);
        if (z) {
            b.mo26634a((int) R.string.fsm).mo26647b((CharSequence) getString(R.string.fsl, new Object[]{formatFileSize, string})).mo26635a((int) R.string.vk, (OnClickListener) this).mo26646b((int) R.string.vf, (OnClickListener) this);
        } else {
            b.mo26634a((int) R.string.fsk).mo26647b((CharSequence) getString(R.string.fsj, new Object[]{formatFileSize, string})).mo26635a((int) R.string.vl, (OnClickListener) this).mo26646b((int) R.string.vk, (OnClickListener) this);
        }
        this.f52370a = b.mo26636a((OnCancelListener) new OnCancelListener() {
            public final void onCancel(DialogInterface dialogInterface) {
                SizeLimitActivity.this.finish();
            }
        }).mo26649b();
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        boolean z = this.f52373d.getExtras().getBoolean("isWifiRequired");
        if (z && i == -2) {
            C19422f.m63833a(getApplicationContext()).mo51450a(this.f52372c, (String) null, (String[]) null);
        } else if (!z && i == -1) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("bypass_recommended_size_limit", Boolean.valueOf(true));
            C19422f.m63833a(getApplicationContext()).mo51449a(this.f52372c, contentValues, (String) null, (String[]) null);
        }
        m63538b();
    }
}

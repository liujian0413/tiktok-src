package android.support.p022v4.widget;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/* renamed from: android.support.v4.widget.SimpleCursorAdapter */
public class SimpleCursorAdapter extends ResourceCursorAdapter {

    /* renamed from: l */
    protected int[] f3528l;

    /* renamed from: m */
    protected int[] f3529m;

    /* renamed from: n */
    public int f3530n;

    /* renamed from: o */
    public C1018a f3531o;

    /* renamed from: p */
    public C1019b f3532p;

    /* renamed from: q */
    String[] f3533q;

    /* renamed from: android.support.v4.widget.SimpleCursorAdapter$a */
    public interface C1018a {
        /* renamed from: a */
        CharSequence mo3977a(Cursor cursor);
    }

    /* renamed from: android.support.v4.widget.SimpleCursorAdapter$b */
    public interface C1019b {
        /* renamed from: a */
        boolean mo3978a(View view, Cursor cursor, int i);
    }

    /* renamed from: b */
    public final Cursor mo3816b(Cursor cursor) {
        m4414a(cursor, this.f3533q);
        return super.mo3816b(cursor);
    }

    /* renamed from: c */
    public final CharSequence mo3819c(Cursor cursor) {
        if (this.f3531o != null) {
            return this.f3531o.mo3977a(cursor);
        }
        if (this.f3530n >= 0) {
            return cursor.getString(this.f3530n);
        }
        return super.mo3819c(cursor);
    }

    /* renamed from: a */
    private static void m4416a(TextView textView, String str) {
        textView.setText(str);
    }

    /* renamed from: a */
    private static void m4415a(ImageView imageView, String str) {
        try {
            imageView.setImageResource(Integer.parseInt(str));
        } catch (NumberFormatException unused) {
            imageView.setImageURI(Uri.parse(str));
        }
    }

    /* renamed from: a */
    private void m4414a(Cursor cursor, String[] strArr) {
        if (cursor != null) {
            int length = strArr.length;
            if (this.f3528l == null || this.f3528l.length != length) {
                this.f3528l = new int[length];
            }
            for (int i = 0; i < length; i++) {
                this.f3528l[i] = cursor.getColumnIndexOrThrow(strArr[i]);
            }
            return;
        }
        this.f3528l = null;
    }

    /* renamed from: a */
    public final void mo3815a(View view, Context context, Cursor cursor) {
        boolean z;
        C1019b bVar = this.f3532p;
        int length = this.f3529m.length;
        int[] iArr = this.f3528l;
        int[] iArr2 = this.f3529m;
        for (int i = 0; i < length; i++) {
            View findViewById = view.findViewById(iArr2[i]);
            if (findViewById != null) {
                if (bVar != null) {
                    z = bVar.mo3978a(findViewById, cursor, iArr[i]);
                } else {
                    z = false;
                }
                if (!z) {
                    String string = cursor.getString(iArr[i]);
                    if (string == null) {
                        string = "";
                    }
                    if (findViewById instanceof TextView) {
                        m4416a((TextView) findViewById, string);
                    } else if (findViewById instanceof ImageView) {
                        m4415a((ImageView) findViewById, string);
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append(findViewById.getClass().getName());
                        sb.append(" is not a  view that can be bounds by this SimpleCursorAdapter");
                        throw new IllegalStateException(sb.toString());
                    }
                } else {
                    continue;
                }
            }
        }
    }
}

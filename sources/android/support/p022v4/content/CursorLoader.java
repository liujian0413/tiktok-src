package android.support.p022v4.content;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.support.p022v4.content.C0685d.C0686a;
import android.support.p022v4.p027os.C0879b;
import android.support.p022v4.p027os.OperationCanceledException;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Arrays;

/* renamed from: android.support.v4.content.CursorLoader */
public class CursorLoader extends AsyncTaskLoader<Cursor> {

    /* renamed from: f */
    final C0686a f2596f = new C0686a<>();

    /* renamed from: g */
    public Uri f2597g;

    /* renamed from: h */
    public String[] f2598h;

    /* renamed from: i */
    public String f2599i;

    /* renamed from: j */
    public String[] f2600j;

    /* renamed from: k */
    public String f2601k;

    /* renamed from: l */
    Cursor f2602l;

    /* renamed from: m */
    C0879b f2603m;

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo2793j() {
        mo2824m();
    }

    /* renamed from: f */
    public final void mo2784f() {
        super.mo2784f();
        synchronized (this) {
            if (this.f2603m != null) {
                this.f2603m.mo3280c();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo2792i() {
        if (this.f2602l != null) {
            mo2790b(this.f2602l);
        }
        if (mo2829r() || this.f2602l == null) {
            mo2825n();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final void mo2794k() {
        super.mo2794k();
        mo2793j();
        if (this.f2602l != null && !this.f2602l.isClosed()) {
            this.f2602l.close();
        }
        this.f2602l = null;
    }

    /* renamed from: h */
    public Cursor mo2782d() {
        Cursor a;
        synchronized (this) {
            if (!mo2785g()) {
                this.f2603m = new C0879b();
            } else {
                throw new OperationCanceledException();
            }
        }
        try {
            a = C0682a.m2902a(this.f2629p.getContentResolver(), this.f2597g, this.f2598h, this.f2599i, this.f2600j, this.f2601k, this.f2603m);
            if (a != null) {
                a.getCount();
                a.registerContentObserver(this.f2596f);
            }
            synchronized (this) {
                this.f2603m = null;
            }
            return a;
        } catch (RuntimeException e) {
            a.close();
            throw e;
        } catch (Throwable th) {
            synchronized (this) {
                this.f2603m = null;
                throw th;
            }
        }
    }

    /* renamed from: a */
    public final /* synthetic */ void mo2777a(Object obj) {
        m2875b((Cursor) obj);
    }

    /* renamed from: b */
    private static void m2875b(Cursor cursor) {
        if (cursor != null && !cursor.isClosed()) {
            cursor.close();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo2790b(Cursor cursor) {
        if (this.f2632s) {
            if (cursor != null) {
                cursor.close();
            }
            return;
        }
        Cursor cursor2 = this.f2602l;
        this.f2602l = cursor;
        if (this.f2630q) {
            super.mo2790b(cursor);
        }
        if (!(cursor2 == null || cursor2 == cursor || cursor2.isClosed())) {
            cursor2.close();
        }
    }

    /* renamed from: a */
    public final void mo2778a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.mo2778a(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("mUri=");
        printWriter.println(this.f2597g);
        printWriter.print(str);
        printWriter.print("mProjection=");
        printWriter.println(Arrays.toString(this.f2598h));
        printWriter.print(str);
        printWriter.print("mSelection=");
        printWriter.println(this.f2599i);
        printWriter.print(str);
        printWriter.print("mSelectionArgs=");
        printWriter.println(Arrays.toString(this.f2600j));
        printWriter.print(str);
        printWriter.print("mSortOrder=");
        printWriter.println(this.f2601k);
        printWriter.print(str);
        printWriter.print("mCursor=");
        printWriter.println(this.f2602l);
        printWriter.print(str);
        printWriter.print("mContentChanged=");
        printWriter.println(this.f2633t);
    }

    public CursorLoader(Context context, Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        super(context);
        this.f2597g = uri;
        this.f2598h = strArr;
        this.f2599i = str;
        this.f2600j = strArr2;
        this.f2601k = str2;
    }
}

package android.support.p022v4.widget;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.FilterQueryProvider;
import android.widget.Filterable;

/* renamed from: android.support.v4.widget.CursorAdapter */
public abstract class CursorAdapter extends BaseAdapter implements C1045a, Filterable {

    /* renamed from: a */
    protected boolean f3453a;

    /* renamed from: b */
    protected boolean f3454b;

    /* renamed from: c */
    protected Cursor f3455c;

    /* renamed from: d */
    protected Context f3456d;

    /* renamed from: e */
    protected int f3457e;

    /* renamed from: f */
    protected C1003a f3458f;

    /* renamed from: g */
    protected DataSetObserver f3459g;

    /* renamed from: h */
    protected C1044f f3460h;

    /* renamed from: i */
    public FilterQueryProvider f3461i;

    /* renamed from: android.support.v4.widget.CursorAdapter$a */
    class C1003a extends ContentObserver {
        public final boolean deliverSelfNotifications() {
            return true;
        }

        public final void onChange(boolean z) {
            CursorAdapter.this.mo3818b();
        }

        C1003a() {
            super(new Handler());
        }
    }

    /* renamed from: android.support.v4.widget.CursorAdapter$b */
    class C1004b extends DataSetObserver {
        public final void onChanged() {
            CursorAdapter.this.f3453a = true;
            CursorAdapter.this.notifyDataSetChanged();
        }

        public final void onInvalidated() {
            CursorAdapter.this.f3453a = false;
            CursorAdapter.this.notifyDataSetInvalidated();
        }

        C1004b() {
        }
    }

    /* renamed from: a */
    public final Cursor mo3811a() {
        return this.f3455c;
    }

    /* renamed from: a */
    public abstract View mo3813a(Context context, Cursor cursor, ViewGroup viewGroup);

    /* renamed from: a */
    public abstract void mo3815a(View view, Context context, Cursor cursor);

    public boolean hasStableIds() {
        return true;
    }

    public Filter getFilter() {
        if (this.f3460h == null) {
            this.f3460h = new C1044f(this);
        }
        return this.f3460h;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo3818b() {
        if (this.f3454b && this.f3455c != null && !this.f3455c.isClosed()) {
            this.f3453a = this.f3455c.requery();
        }
    }

    public int getCount() {
        if (!this.f3453a || this.f3455c == null) {
            return 0;
        }
        return this.f3455c.getCount();
    }

    /* renamed from: a */
    public Cursor mo3812a(CharSequence charSequence) {
        if (this.f3461i != null) {
            return this.f3461i.runQuery(charSequence);
        }
        return this.f3455c;
    }

    /* renamed from: c */
    public CharSequence mo3819c(Cursor cursor) {
        if (cursor == null) {
            return "";
        }
        return cursor.toString();
    }

    /* renamed from: a */
    public void mo3814a(Cursor cursor) {
        Cursor b = mo3816b(cursor);
        if (b != null) {
            b.close();
        }
    }

    public Object getItem(int i) {
        if (!this.f3453a || this.f3455c == null) {
            return null;
        }
        this.f3455c.moveToPosition(i);
        return this.f3455c;
    }

    public long getItemId(int i) {
        if (!this.f3453a || this.f3455c == null || !this.f3455c.moveToPosition(i)) {
            return 0;
        }
        return this.f3455c.getLong(this.f3457e);
    }

    /* renamed from: b */
    public Cursor mo3816b(Cursor cursor) {
        if (cursor == this.f3455c) {
            return null;
        }
        Cursor cursor2 = this.f3455c;
        if (cursor2 != null) {
            if (this.f3458f != null) {
                cursor2.unregisterContentObserver(this.f3458f);
            }
            if (this.f3459g != null) {
                cursor2.unregisterDataSetObserver(this.f3459g);
            }
        }
        this.f3455c = cursor;
        if (cursor != null) {
            if (this.f3458f != null) {
                cursor.registerContentObserver(this.f3458f);
            }
            if (this.f3459g != null) {
                cursor.registerDataSetObserver(this.f3459g);
            }
            this.f3457e = cursor.getColumnIndexOrThrow("_id");
            this.f3453a = true;
            notifyDataSetChanged();
        } else {
            this.f3457e = -1;
            this.f3453a = false;
            notifyDataSetInvalidated();
        }
        return cursor2;
    }

    /* renamed from: b */
    public View mo3817b(Context context, Cursor cursor, ViewGroup viewGroup) {
        return mo3813a(context, cursor, viewGroup);
    }

    public CursorAdapter(Context context, Cursor cursor, boolean z) {
        int i;
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        m4291a(context, cursor, i);
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.f3453a) {
            return null;
        }
        this.f3455c.moveToPosition(i);
        if (view == null) {
            view = mo3817b(this.f3456d, this.f3455c, viewGroup);
        }
        mo3815a(view, this.f3456d, this.f3455c);
        return view;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.f3453a) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        } else if (this.f3455c.moveToPosition(i)) {
            if (view == null) {
                view = mo3813a(this.f3456d, this.f3455c, viewGroup);
            }
            mo3815a(view, this.f3456d, this.f3455c);
            return view;
        } else {
            StringBuilder sb = new StringBuilder("couldn't move cursor to position ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: a */
    private void m4291a(Context context, Cursor cursor, int i) {
        int i2;
        boolean z = false;
        if ((i & 1) == 1) {
            i |= 2;
            this.f3454b = true;
        } else {
            this.f3454b = false;
        }
        if (cursor != null) {
            z = true;
        }
        this.f3455c = cursor;
        this.f3453a = z;
        this.f3456d = context;
        if (z) {
            i2 = cursor.getColumnIndexOrThrow("_id");
        } else {
            i2 = -1;
        }
        this.f3457e = i2;
        if ((i & 2) == 2) {
            this.f3458f = new C1003a();
            this.f3459g = new C1004b();
        } else {
            this.f3458f = null;
            this.f3459g = null;
        }
        if (z) {
            if (this.f3458f != null) {
                cursor.registerContentObserver(this.f3458f);
            }
            if (this.f3459g != null) {
                cursor.registerDataSetObserver(this.f3459g);
            }
        }
    }
}

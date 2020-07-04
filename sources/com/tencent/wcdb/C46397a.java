package com.tencent.wcdb;

import android.content.ContentResolver;
import android.database.CharArrayBuffer;
import android.database.ContentObservable;
import android.database.ContentObserver;
import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.net.Uri;
import android.os.Bundle;
import com.tencent.wcdb.support.Log;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tencent.wcdb.a */
public abstract class C46397a implements C46431e {

    /* renamed from: a */
    protected HashMap<Long, Map<String, Object>> f119450a = new HashMap<>();

    /* renamed from: b */
    protected int f119451b = -1;

    /* renamed from: c */
    protected int f119452c = -1;

    /* renamed from: d */
    protected Long f119453d = null;

    /* renamed from: e */
    protected boolean f119454e;

    /* renamed from: f */
    protected ContentResolver f119455f;

    /* renamed from: g */
    private Uri f119456g;

    /* renamed from: h */
    private final Object f119457h = new Object();

    /* renamed from: i */
    private ContentObserver f119458i;

    /* renamed from: j */
    private boolean f119459j;

    /* renamed from: k */
    private final DataSetObservable f119460k = new DataSetObservable();

    /* renamed from: l */
    private final ContentObservable f119461l = new ContentObservable();

    /* renamed from: m */
    private Bundle f119462m = Bundle.EMPTY;

    /* renamed from: com.tencent.wcdb.a$a */
    protected static class C46398a extends ContentObserver {

        /* renamed from: a */
        WeakReference<C46397a> f119463a;

        public final boolean deliverSelfNotifications() {
            return false;
        }

        public C46398a(C46397a aVar) {
            super(null);
            this.f119463a = new WeakReference<>(aVar);
        }

        public final void onChange(boolean z) {
            C46397a aVar = (C46397a) this.f119463a.get();
            if (aVar != null) {
                aVar.mo115366a(false);
            }
        }
    }

    /* renamed from: a */
    public boolean mo115367a(int i, int i2) {
        return true;
    }

    public void deactivate() {
        mo115365a();
    }

    public abstract String[] getColumnNames();

    public abstract int getCount();

    public Bundle getExtras() {
        return this.f119462m;
    }

    public abstract long getLong(int i);

    public Uri getNotificationUri() {
        return this.f119456g;
    }

    public final int getPosition() {
        return this.f119451b;
    }

    public abstract String getString(int i);

    public int getType(int i) {
        return 3;
    }

    public boolean getWantsAllOnMoveCalls() {
        return false;
    }

    public boolean isClosed() {
        return this.f119454e;
    }

    public int getColumnCount() {
        return getColumnNames().length;
    }

    public final boolean moveToFirst() {
        return moveToPosition(0);
    }

    public void close() {
        this.f119454e = true;
        this.f119461l.unregisterAll();
        mo115365a();
    }

    public final boolean isBeforeFirst() {
        if (getCount() == 0 || this.f119451b == -1) {
            return true;
        }
        return false;
    }

    public final boolean isFirst() {
        if (this.f119451b != 0 || getCount() == 0) {
            return false;
        }
        return true;
    }

    public final boolean isLast() {
        int count = getCount();
        if (this.f119451b != count - 1 || count == 0) {
            return false;
        }
        return true;
    }

    public final boolean moveToLast() {
        return moveToPosition(getCount() - 1);
    }

    public final boolean moveToNext() {
        return moveToPosition(this.f119451b + 1);
    }

    public final boolean moveToPrevious() {
        return moveToPosition(this.f119451b - 1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo115365a() {
        if (this.f119458i != null) {
            this.f119455f.unregisterContentObserver(this.f119458i);
            this.f119459j = false;
        }
        this.f119460k.notifyInvalidated();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo115368b() {
        if (-1 == this.f119451b || getCount() == this.f119451b) {
            throw new CursorIndexOutOfBoundsException(this.f119451b, getCount());
        }
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        if (this.f119458i != null && this.f119459j) {
            this.f119455f.unregisterContentObserver(this.f119458i);
        }
        try {
            if (!this.f119454e) {
                close();
            }
        } catch (Exception unused) {
        }
    }

    public final boolean isAfterLast() {
        if (getCount() == 0 || this.f119451b == getCount()) {
            return true;
        }
        return false;
    }

    public boolean requery() {
        if (this.f119458i != null && !this.f119459j) {
            this.f119455f.registerContentObserver(this.f119456g, true, this.f119458i);
            this.f119459j = true;
        }
        this.f119460k.notifyChanged();
        return true;
    }

    public Bundle respond(Bundle bundle) {
        return Bundle.EMPTY;
    }

    public byte[] getBlob(int i) {
        throw new UnsupportedOperationException("getBlob is not supported");
    }

    public String getColumnName(int i) {
        return getColumnNames()[i];
    }

    public final boolean move(int i) {
        return moveToPosition(this.f119451b + i);
    }

    public void registerContentObserver(ContentObserver contentObserver) {
        this.f119461l.registerObserver(contentObserver);
    }

    public void registerDataSetObserver(DataSetObserver dataSetObserver) {
        this.f119460k.registerObserver(dataSetObserver);
    }

    public void setExtras(Bundle bundle) {
        if (bundle == null) {
            bundle = Bundle.EMPTY;
        }
        this.f119462m = bundle;
    }

    public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        this.f119460k.unregisterObserver(dataSetObserver);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo115366a(boolean z) {
        synchronized (this.f119457h) {
            this.f119461l.dispatchChange(false);
        }
    }

    public void unregisterContentObserver(ContentObserver contentObserver) {
        if (!this.f119454e) {
            this.f119461l.unregisterObserver(contentObserver);
        }
    }

    public int getColumnIndexOrThrow(String str) {
        int columnIndex = getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        StringBuilder sb = new StringBuilder("column '");
        sb.append(str);
        sb.append("' does not exist");
        throw new IllegalArgumentException(sb.toString());
    }

    public int getColumnIndex(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf != -1) {
            Exception exc = new Exception();
            StringBuilder sb = new StringBuilder("requesting column name with table name -- ");
            sb.append(str);
            Log.m146011a("Cursor", sb.toString(), exc);
            str = str.substring(lastIndexOf + 1);
        }
        String[] columnNames = getColumnNames();
        int length = columnNames.length;
        for (int i = 0; i < length; i++) {
            if (columnNames[i].equalsIgnoreCase(str)) {
                return i;
            }
        }
        return -1;
    }

    public boolean moveToPosition(int i) {
        int count = getCount();
        if (i >= count) {
            this.f119451b = count;
            return false;
        } else if (i < 0) {
            this.f119451b = -1;
            return false;
        } else if (i == this.f119451b) {
            return true;
        } else {
            mo115367a(this.f119451b, i);
            this.f119451b = i;
            if (this.f119452c != -1) {
                this.f119453d = Long.valueOf(getLong(this.f119452c));
            }
            return true;
        }
    }

    public void copyStringToBuffer(int i, CharArrayBuffer charArrayBuffer) {
        String string = getString(i);
        if (string != null) {
            char[] cArr = charArrayBuffer.data;
            if (cArr == null || cArr.length < string.length()) {
                charArrayBuffer.data = string.toCharArray();
            } else {
                string.getChars(0, string.length(), cArr, 0);
            }
            charArrayBuffer.sizeCopied = string.length();
            return;
        }
        charArrayBuffer.sizeCopied = 0;
    }

    public void setNotificationUri(ContentResolver contentResolver, Uri uri) {
        synchronized (this.f119457h) {
            this.f119456g = uri;
            this.f119455f = contentResolver;
            if (this.f119458i != null) {
                this.f119455f.unregisterContentObserver(this.f119458i);
            }
            this.f119458i = new C46398a(this);
            this.f119455f.registerContentObserver(this.f119456g, true, this.f119458i);
            this.f119459j = true;
        }
    }
}

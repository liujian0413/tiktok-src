package com.zhihu.matisse.p1857ui;

import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.support.p029v7.app.ActionBar;
import android.support.p029v7.app.AppCompatActivity;
import android.support.p029v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.CursorAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.zhihu.matisse.internal.entity.Album;
import com.zhihu.matisse.internal.entity.C47338d;
import com.zhihu.matisse.internal.entity.Item;
import com.zhihu.matisse.internal.model.AlbumCollection;
import com.zhihu.matisse.internal.model.AlbumCollection.C47341a;
import com.zhihu.matisse.internal.model.C47343a;
import com.zhihu.matisse.internal.p1855a.C47328b;
import com.zhihu.matisse.internal.p1855a.C47329c;
import com.zhihu.matisse.internal.p1855a.C47330d;
import com.zhihu.matisse.internal.p1856ui.AlbumPreviewActivity;
import com.zhihu.matisse.internal.p1856ui.MediaSelectionFragment;
import com.zhihu.matisse.internal.p1856ui.MediaSelectionFragment.C47346a;
import com.zhihu.matisse.internal.p1856ui.SelectedPreviewActivity;
import com.zhihu.matisse.internal.p1856ui.adapter.AlbumMediaAdapter.C47353b;
import com.zhihu.matisse.internal.p1856ui.adapter.AlbumMediaAdapter.C47355d;
import com.zhihu.matisse.internal.p1856ui.adapter.AlbumMediaAdapter.C47356e;
import com.zhihu.matisse.internal.p1856ui.adapter.C47358a;
import com.zhihu.matisse.internal.p1856ui.widget.C47364a;
import com.zhihu.matisse.internal.p1856ui.widget.CheckRadioView;
import com.zhihu.matisse.internal.p1856ui.widget.IncapableDialog;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.zhihu.matisse.ui.MatisseActivity */
public class MatisseActivity extends AppCompatActivity implements OnClickListener, OnItemSelectedListener, C47341a, C47346a, C47353b, C47355d, C47356e {

    /* renamed from: a */
    public final AlbumCollection f121569a = new AlbumCollection();

    /* renamed from: b */
    public C47364a f121570b;

    /* renamed from: c */
    private C47328b f121571c;

    /* renamed from: d */
    private C47343a f121572d = new C47343a(this);

    /* renamed from: e */
    private C47338d f121573e;

    /* renamed from: f */
    private C47358a f121574f;

    /* renamed from: g */
    private TextView f121575g;

    /* renamed from: h */
    private TextView f121576h;

    /* renamed from: i */
    private View f121577i;

    /* renamed from: j */
    private View f121578j;

    /* renamed from: k */
    private LinearLayout f121579k;

    /* renamed from: l */
    private CheckRadioView f121580l;

    /* renamed from: m */
    private boolean f121581m;

    /* renamed from: a */
    public final void mo119452a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        C47368a.m147932a(this, context);
    }

    /* renamed from: b */
    public final C47343a mo119406b() {
        return this.f121572d;
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    /* renamed from: a */
    public final void mo119372a() {
        this.f121574f.swapCursor(null);
    }

    public void onBackPressed() {
        setResult(0);
        super.onBackPressed();
    }

    /* renamed from: d */
    public final void mo119416d() {
        if (this.f121571c != null) {
            this.f121571c.mo119344a(this, 24);
        }
    }

    /* renamed from: c */
    public final void mo119405c() {
        m147921e();
        if (this.f121573e.f121461q != null) {
            this.f121572d.mo119387c();
            this.f121572d.mo119390d();
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.f121569a.mo119367a();
        this.f121573e.f121465u = null;
        this.f121573e.f121461q = null;
    }

    /* renamed from: g */
    private int m147923g() {
        int f = this.f121572d.mo119393f();
        int i = 0;
        for (int i2 = 0; i2 < f; i2++) {
            Item item = (Item) this.f121572d.mo119384b().get(i2);
            if (item.mo119354b() && C47330d.m147777a(item.f121437d) > ((float) this.f121573e.f121464t)) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: e */
    private void m147921e() {
        int f = this.f121572d.mo119393f();
        if (f == 0) {
            this.f121575g.setEnabled(false);
            this.f121576h.setEnabled(false);
            this.f121576h.setText(getString(R.string.c8_));
        } else if (f != 1 || !this.f121573e.mo119363c()) {
            this.f121575g.setEnabled(true);
            this.f121576h.setEnabled(true);
            this.f121576h.setText(getString(R.string.c89, new Object[]{Integer.valueOf(f)}));
        } else {
            this.f121575g.setEnabled(true);
            this.f121576h.setText(R.string.c8_);
            this.f121576h.setEnabled(true);
        }
        if (this.f121573e.f121462r) {
            this.f121579k.setVisibility(0);
            m147922f();
            return;
        }
        this.f121579k.setVisibility(4);
    }

    /* renamed from: f */
    private void m147922f() {
        this.f121580l.setChecked(this.f121581m);
        if (m147923g() > 0 && this.f121581m) {
            IncapableDialog.m147907a("", getString(R.string.c8g, new Object[]{Integer.valueOf(this.f121573e.f121464t)})).show(getSupportFragmentManager(), IncapableDialog.class.getName());
            this.f121580l.setChecked(false);
            this.f121581m = false;
        }
    }

    /* renamed from: a */
    public final void mo119373a(final Cursor cursor) {
        this.f121574f.swapCursor(cursor);
        new Handler(Looper.getMainLooper()).post(new Runnable() {
            public final void run() {
                if (!cursor.isClosed()) {
                    cursor.moveToPosition(MatisseActivity.this.f121569a.f121475a);
                    MatisseActivity.this.f121570b.mo119445a(MatisseActivity.this, MatisseActivity.this.f121569a.f121475a);
                    Album a = Album.m147787a(cursor);
                    if (a.mo119347b() && C47338d.m147803a().f121455k) {
                        a.mo119346a();
                    }
                    MatisseActivity.this.mo119453a(a);
                }
            }
        });
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f121572d.mo119385b(bundle);
        this.f121569a.mo119371b(bundle);
        bundle.putBoolean("checkState", this.f121581m);
    }

    /* renamed from: a */
    public final void mo119453a(Album album) {
        if (!album.mo119347b() || !album.mo119348c()) {
            this.f121577i.setVisibility(0);
            this.f121578j.setVisibility(8);
            getSupportFragmentManager().mo2645a().mo2600b(R.id.a19, MediaSelectionFragment.m147870a(album), MediaSelectionFragment.class.getSimpleName()).mo2606d();
            return;
        }
        this.f121577i.setVisibility(8);
        this.f121578j.setVisibility(0);
    }

    public void onClick(View view) {
        if (view.getId() == R.id.si) {
            Intent intent = new Intent(this, SelectedPreviewActivity.class);
            intent.putExtra("extra_default_bundle", this.f121572d.mo119380a());
            intent.putExtra("extra_result_original_enable", this.f121581m);
            startActivityForResult(intent, 23);
        } else if (view.getId() == R.id.se) {
            Intent intent2 = new Intent();
            intent2.putParcelableArrayListExtra("extra_result_selection", (ArrayList) this.f121572d.mo119387c());
            intent2.putStringArrayListExtra("extra_result_selection_path", (ArrayList) this.f121572d.mo119390d());
            intent2.putExtra("extra_result_original_enable", this.f121581m);
            setResult(-1, intent2);
            finish();
        } else {
            if (view.getId() == R.id.c9k) {
                int g = m147923g();
                if (g > 0) {
                    IncapableDialog.m147907a("", getString(R.string.c8f, new Object[]{Integer.valueOf(g), Integer.valueOf(this.f121573e.f121464t)})).show(getSupportFragmentManager(), IncapableDialog.class.getName());
                    return;
                }
                this.f121581m = !this.f121581m;
                this.f121580l.setChecked(this.f121581m);
            }
        }
    }

    public void onCreate(Bundle bundle) {
        this.f121573e = C47338d.m147803a();
        setTheme(this.f121573e.f121448d);
        super.onCreate(bundle);
        if (!this.f121573e.f121460p) {
            setResult(0);
            finish();
            return;
        }
        setContentView((int) R.layout.d5);
        if (this.f121573e.mo119364d()) {
            setRequestedOrientation(this.f121573e.f121449e);
        }
        if (this.f121573e.f121455k) {
            this.f121571c = new C47328b(this);
            if (this.f121573e.f121456l != null) {
                this.f121571c.f121423a = this.f121573e.f121456l;
            } else {
                throw new RuntimeException("Don't forget to set CaptureStrategy.");
            }
        }
        Toolbar toolbar = (Toolbar) findViewById(R.id.dl8);
        setSupportActionBar(toolbar);
        ActionBar supportActionBar = getSupportActionBar();
        supportActionBar.mo4175b(false);
        supportActionBar.mo4171a(true);
        Drawable navigationIcon = toolbar.getNavigationIcon();
        TypedArray obtainStyledAttributes = getTheme().obtainStyledAttributes(new int[]{R.attr.aj});
        int color = obtainStyledAttributes.getColor(0, 0);
        obtainStyledAttributes.recycle();
        navigationIcon.setColorFilter(color, Mode.SRC_IN);
        this.f121575g = (TextView) findViewById(R.id.si);
        this.f121576h = (TextView) findViewById(R.id.se);
        this.f121575g.setOnClickListener(this);
        this.f121576h.setOnClickListener(this);
        this.f121577i = findViewById(R.id.a19);
        this.f121578j = findViewById(R.id.aee);
        this.f121579k = (LinearLayout) findViewById(R.id.c9k);
        this.f121580l = (CheckRadioView) findViewById(R.id.c9j);
        this.f121579k.setOnClickListener(this);
        this.f121572d.mo119381a(bundle);
        if (bundle != null) {
            this.f121581m = bundle.getBoolean("checkState");
        }
        m147921e();
        this.f121574f = new C47358a(this, null, false);
        this.f121570b = new C47364a(this);
        this.f121570b.f121565c = this;
        this.f121570b.mo119448a((TextView) findViewById(R.id.d2j));
        this.f121570b.mo119446a(findViewById(R.id.dl8));
        this.f121570b.mo119447a((CursorAdapter) this.f121574f);
        this.f121569a.mo119369a((FragmentActivity) this, (C47341a) this);
        this.f121569a.mo119368a(bundle);
        this.f121569a.mo119370b();
    }

    /* renamed from: a */
    public final void mo119403a(Album album, Item item, int i) {
        Intent intent = new Intent(this, AlbumPreviewActivity.class);
        intent.putExtra("extra_album", album);
        intent.putExtra("extra_item", item);
        intent.putExtra("extra_default_bundle", this.f121572d.mo119380a());
        intent.putExtra("extra_result_original_enable", this.f121581m);
        startActivityForResult(intent, 23);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1) {
            if (i == 23) {
                Bundle bundleExtra = intent.getBundleExtra("extra_result_bundle");
                ArrayList parcelableArrayList = bundleExtra.getParcelableArrayList("state_selection");
                this.f121581m = intent.getBooleanExtra("extra_result_original_enable", false);
                int i3 = bundleExtra.getInt("state_collection_type", 0);
                if (intent.getBooleanExtra("extra_result_apply", false)) {
                    Intent intent2 = new Intent();
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    if (parcelableArrayList != null) {
                        Iterator it = parcelableArrayList.iterator();
                        while (it.hasNext()) {
                            Item item = (Item) it.next();
                            arrayList.add(item.f121436c);
                            arrayList2.add(C47329c.m147772a(this, item.f121436c));
                        }
                    }
                    intent2.putParcelableArrayListExtra("extra_result_selection", arrayList);
                    intent2.putStringArrayListExtra("extra_result_selection_path", arrayList2);
                    intent2.putExtra("extra_result_original_enable", this.f121581m);
                    setResult(-1, intent2);
                    finish();
                } else {
                    this.f121572d.mo119382a(parcelableArrayList, i3);
                    Fragment a = getSupportFragmentManager().mo2644a(MediaSelectionFragment.class.getSimpleName());
                    if (a instanceof MediaSelectionFragment) {
                        ((MediaSelectionFragment) a).mo119404b();
                    }
                    m147921e();
                }
            } else if (i == 24) {
                Uri uri = this.f121571c.f121424b;
                String str = this.f121571c.f121425c;
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(uri);
                ArrayList arrayList4 = new ArrayList();
                arrayList4.add(str);
                Intent intent3 = new Intent();
                intent3.putParcelableArrayListExtra("extra_result_selection", arrayList3);
                intent3.putStringArrayListExtra("extra_result_selection_path", arrayList4);
                setResult(-1, intent3);
                if (VERSION.SDK_INT < 21) {
                    revokeUriPermission(uri, 3);
                }
                finish();
            }
        }
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        this.f121569a.f121475a = i;
        this.f121574f.getCursor().moveToPosition(i);
        Album a = Album.m147787a(this.f121574f.getCursor());
        if (a.mo119347b() && C47338d.m147803a().f121455k) {
            a.mo119346a();
        }
        mo119453a(a);
    }
}

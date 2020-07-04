package cat.ereza.customactivityoncrash.activity;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import cat.ereza.customactivityoncrash.CustomActivityOnCrash;
import cat.ereza.customactivityoncrash.CustomActivityOnCrash.EventListener;
import com.zhiliaoapp.musically.df_live_zego_link.R;

public final class DefaultErrorActivity extends Activity {
    /* renamed from: a */
    public final void mo6968a() {
        String a = CustomActivityOnCrash.m7901a((Context) this, getIntent());
        if (VERSION.SDK_INT >= 11) {
            ((ClipboardManager) getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(getString(R.string.amc), a));
        } else {
            ((android.text.ClipboardManager) getSystemService("clipboard")).setText(a);
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.j3);
        Button button = (Button) findViewById(R.id.a5r);
        final Class d = CustomActivityOnCrash.m7919d(getIntent());
        final EventListener e = CustomActivityOnCrash.m7921e(getIntent());
        if (d != null) {
            button.setText(R.string.ami);
            button.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    CustomActivityOnCrash.m7907a(DefaultErrorActivity.this, new Intent(DefaultErrorActivity.this, d), e);
                }
            });
        } else {
            button.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    CustomActivityOnCrash.m7908a((Activity) DefaultErrorActivity.this, e);
                }
            });
        }
        Button button2 = (Button) findViewById(R.id.a5q);
        if (CustomActivityOnCrash.m7912a(getIntent())) {
            button2.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    ((TextView) new Builder(DefaultErrorActivity.this).setTitle(R.string.amg).setMessage(CustomActivityOnCrash.m7901a((Context) DefaultErrorActivity.this, DefaultErrorActivity.this.getIntent())).setPositiveButton(R.string.amd, null).setNeutralButton(R.string.amf, new DialogInterface.OnClickListener() {
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            DefaultErrorActivity.this.mo6968a();
                            C1615a.m7930a(Toast.makeText(DefaultErrorActivity.this, R.string.ame, 0));
                        }
                    }).show().findViewById(16908299)).setTextSize(0, DefaultErrorActivity.this.getResources().getDimension(R.dimen.ed));
                }
            });
        } else {
            button2.setVisibility(8);
        }
        int b = CustomActivityOnCrash.m7914b(getIntent());
        ImageView imageView = (ImageView) findViewById(R.id.a5p);
        if (VERSION.SDK_INT >= 21) {
            imageView.setImageDrawable(getResources().getDrawable(b, getTheme()));
        } else {
            imageView.setImageDrawable(getResources().getDrawable(b));
        }
    }
}

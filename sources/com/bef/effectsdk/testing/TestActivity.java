package com.bef.effectsdk.testing;

import android.app.Activity;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.method.ScrollingMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import android.widget.Toast;
import com.C1642a;
import java.util.Locale;

public class TestActivity extends Activity implements OnClickListener {

    /* renamed from: a */
    public TextView f6982a;

    /* renamed from: b */
    public TextView f6983b;

    /* renamed from: c */
    public boolean f6984c;

    public void onClick(View view) {
        if (this.f6984c) {
            Toast.makeText(this, "Unit testing is running", 1);
            return;
        }
        this.f6984c = true;
        new Thread(new Runnable() {
            public final void run() {
                final TestResult testResult;
                try {
                    testResult = UnitTest.RunAllTests();
                } catch (Throwable unused) {
                    testResult = null;
                }
                TestActivity.this.f6982a.post(new Runnable() {
                    public final void run() {
                        TestActivity.this.f6984c = false;
                        if (testResult == null) {
                            TestActivity.this.f6982a.setText("Current libeffect.so is not support unit test");
                            return;
                        }
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        spannableStringBuilder.append(new SpannableString(C1642a.m8035a(Locale.US, "tests: %d\n", new Object[]{Integer.valueOf(testResult.reportable_test_count)})));
                        SpannableString spannableString = new SpannableString(C1642a.m8035a(Locale.US, "failures: %d\n", new Object[]{Integer.valueOf(testResult.failed_test_count)}));
                        if (testResult.failed_test_count > 0) {
                            spannableString.setSpan(new ForegroundColorSpan(-65536), 0, spannableString.length(), 33);
                        }
                        spannableStringBuilder.append(spannableString);
                        TestActivity.this.f6983b.setText(spannableStringBuilder);
                        TestActivity.this.f6982a.setText(testResult.report);
                    }
                });
            }
        }).start();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new LayoutParams(-1, -1));
        setContentView(linearLayout);
        Button button = new Button(this);
        MarginLayoutParams marginLayoutParams = new MarginLayoutParams(-1, -2);
        marginLayoutParams.setMargins(20, 0, 20, 0);
        button.setPadding(20, 50, 20, 50);
        button.setLayoutParams(marginLayoutParams);
        button.setText("Run All Tests");
        button.setOnClickListener(this);
        linearLayout.addView(button);
        this.f6983b = new TextView(this);
        this.f6983b.setTextSize(20.0f);
        this.f6983b.setLayoutParams(marginLayoutParams);
        linearLayout.addView(this.f6983b);
        this.f6982a = new TextView(this);
        this.f6982a.setMovementMethod(new ScrollingMovementMethod());
        this.f6982a.setLayoutParams(new LayoutParams(-1, -1));
        linearLayout.addView(this.f6982a);
    }
}

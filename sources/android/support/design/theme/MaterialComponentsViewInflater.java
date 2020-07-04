package android.support.design.theme;

import android.content.Context;
import android.support.design.button.MaterialButton;
import android.support.p029v7.app.AppCompatViewInflater;
import android.support.p029v7.widget.AppCompatButton;
import android.util.AttributeSet;

public class MaterialComponentsViewInflater extends AppCompatViewInflater {
    public AppCompatButton createButton(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }
}

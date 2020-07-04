package com.p280ss.android.vesdk;

import java.util.ArrayList;

/* renamed from: com.ss.android.vesdk.VEEffectParams */
public class VEEffectParams {
    public static int EFFECT_TYPE_APPEND_COMPOSER_WITH_TAG = 2;
    public static int EFFECT_TYPE_RELOAD_COMPOSER_WITH_TAG = 1;
    public static int EFFECT_TYPE_REPLACE_COMPOSER_WITH_TAG = 3;
    public static int EFFECT_TYPE_SET_COMPOSER_WITH_TAG;
    public int TYPE;
    public ArrayList<Boolean> boolArrayValue = new ArrayList<>();
    public boolean boolValueOne;
    public boolean boolValueThree;
    public boolean boolValueTwo;
    public ArrayList<Float> floatArrayValue = new ArrayList<>();
    public float floatValueOne;
    public float floatValueThree;
    public float floatValueTwo;
    public ArrayList<Integer> intArrayValue = new ArrayList<>();
    public int intValueOne;
    public int intValueThree;
    public int intValueTwo;
    public ArrayList<String> stringArrayOne = new ArrayList<>();
    public ArrayList<String> stringArrayThree = new ArrayList<>();
    public ArrayList<String> stringArrayTwo = new ArrayList<>();
    public String stringValueOne = "";
    public String stringValueThree = "";
    public String stringValueTwo = "";

    public String toString() {
        StringBuilder sb = new StringBuilder("type:");
        sb.append(this.TYPE);
        sb.append(" int1: ");
        sb.append(this.intValueOne);
        sb.append(" int2: ");
        sb.append(this.intValueTwo);
        sb.append(" int3: ");
        sb.append(this.intValueThree);
        sb.append(" float1: ");
        sb.append(this.floatValueOne);
        sb.append(" float2: ");
        sb.append(this.floatValueTwo);
        sb.append(" float3: ");
        sb.append(this.floatValueThree);
        sb.append(" bool1: ");
        sb.append(this.boolValueOne);
        sb.append(" bool2: ");
        sb.append(this.boolValueTwo);
        sb.append(" bool3: ");
        sb.append(this.boolValueThree);
        sb.append(" string1: ");
        sb.append(this.stringValueOne);
        sb.append(" string2: ");
        sb.append(this.stringValueTwo);
        sb.append(" string3: ");
        sb.append(this.stringValueThree);
        sb.append(" intA: ");
        sb.append(this.intArrayValue.toString());
        sb.append(" floatA: ");
        sb.append(this.floatArrayValue.toString());
        sb.append(" boolA: ");
        sb.append(this.boolArrayValue.toString());
        sb.append(" stringA1: ");
        sb.append(this.stringArrayOne.toString());
        sb.append(" stringA2: ");
        sb.append(this.stringArrayTwo.toString());
        sb.append(" stringA3: ");
        sb.append(this.stringArrayThree.toString());
        return sb.toString();
    }
}

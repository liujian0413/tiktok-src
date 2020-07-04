package com.p280ss.android.medialib.model;

/* renamed from: com.ss.android.medialib.model.FaceAttribute */
public class FaceAttribute {
    public static final int EXPRESSION_NUM = 7;
    public static final int RACIAL_NUM = 4;
    float age;
    float angryScore;
    float arousal;
    float attractive;
    float blurScore;
    float boyProb;
    float[] expProbs;
    int expType;
    float happyScore;
    float illumination;
    float lipstickProb;
    float maskProb;
    float mustacheProb;
    float quality;
    float[] racialProbs;
    int racialType;
    float realFaceProb;
    float sadScore;
    float surpriseScore;
    float valence;
    float wearGlassProb;
    float wearHatProb;
    float wearSunglassProb;

    public static int getExpressionNum() {
        return 7;
    }

    public static int getRacialNum() {
        return 4;
    }

    public float getAge() {
        return this.age;
    }

    public float getAngryScore() {
        return this.angryScore;
    }

    public float getArousal() {
        return this.arousal;
    }

    public float getAttractive() {
        return this.attractive;
    }

    public float getBlurScore() {
        return this.blurScore;
    }

    public float getBoyProb() {
        return this.boyProb;
    }

    public float[] getExpProbs() {
        return this.expProbs;
    }

    public int getExpType() {
        return this.expType;
    }

    public float getHappyScore() {
        return this.happyScore;
    }

    public float getIllumination() {
        return this.illumination;
    }

    public float getLipstickProb() {
        return this.lipstickProb;
    }

    public float getMaskProb() {
        return this.maskProb;
    }

    public float getMustacheProb() {
        return this.mustacheProb;
    }

    public float getQuality() {
        return this.quality;
    }

    public float[] getRacialProbs() {
        return this.racialProbs;
    }

    public int getRacialType() {
        return this.racialType;
    }

    public float getRealFaceProb() {
        return this.realFaceProb;
    }

    public float getSadScore() {
        return this.sadScore;
    }

    public float getSurpriseScore() {
        return this.surpriseScore;
    }

    public float getValence() {
        return this.valence;
    }

    public float getWearGlassProb() {
        return this.wearGlassProb;
    }

    public float getWearHatProb() {
        return this.wearHatProb;
    }

    public float getWearSunglassProb() {
        return this.wearSunglassProb;
    }

    public void setAge(float f) {
        this.age = f;
    }

    public void setAngryScore(float f) {
        this.angryScore = f;
    }

    public void setArousal(float f) {
        this.arousal = f;
    }

    public void setAttractive(float f) {
        this.attractive = f;
    }

    public void setBlurScore(float f) {
        this.blurScore = f;
    }

    public void setBoyProb(float f) {
        this.boyProb = f;
    }

    public void setExpProbs(float[] fArr) {
        this.expProbs = fArr;
    }

    public void setExpType(int i) {
        this.expType = i;
    }

    public void setHappyScore(float f) {
        this.happyScore = f;
    }

    public void setIllumination(float f) {
        this.illumination = f;
    }

    public void setLipstickProb(float f) {
        this.lipstickProb = f;
    }

    public void setMaskProb(float f) {
        this.maskProb = f;
    }

    public void setMustacheProb(float f) {
        this.mustacheProb = f;
    }

    public void setQuality(float f) {
        this.quality = f;
    }

    public void setRacialProbs(float[] fArr) {
        this.racialProbs = fArr;
    }

    public void setRacialType(int i) {
        this.racialType = i;
    }

    public void setRealFaceProb(float f) {
        this.realFaceProb = f;
    }

    public void setSadScore(float f) {
        this.sadScore = f;
    }

    public void setSurpriseScore(float f) {
        this.surpriseScore = f;
    }

    public void setValence(float f) {
        this.valence = f;
    }

    public void setWearGlassProb(float f) {
        this.wearGlassProb = f;
    }

    public void setWearHatProb(float f) {
        this.wearHatProb = f;
    }

    public void setWearSunglassProb(float f) {
        this.wearSunglassProb = f;
    }
}

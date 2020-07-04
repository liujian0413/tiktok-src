package com.p280ss.android.ttve.model;

import java.util.ArrayList;

/* renamed from: com.ss.android.ttve.model.VEAlgorithmResult */
public class VEAlgorithmResult {
    public static final String[] tags = {"baby", "beach", "building", "car", "cartoon", "cat", "dog", "flower", "food", "group", "hill", "indoor", "lake", "nightscape", "selfie", "sky", "statue", "street", "sunset", "text", "tree", "others"};
    private C1CategoryItem[] categoryItems;
    private int[] cluster_ids;
    private ArrayList<ArrayList<Integer>> clusters;
    private int errorCode;
    private int faceCount;
    private float[] faceFeatures;
    private float face_score;
    private byte[] featureByte;
    private float quality_score;
    private float score;
    private float sharpness_score;
    private float similarityScore;

    /* renamed from: com.ss.android.ttve.model.VEAlgorithmResult$C1CategoryItem */
    public static class C1CategoryItem {
        private float prob;
        private boolean satisfied;
        private String tag;

        public C1CategoryItem() {
        }

        public float getProb() {
            return this.prob;
        }

        public String getTag() {
            return this.tag;
        }

        public boolean isSatisfied() {
            return this.satisfied;
        }

        public void setProb(float f) {
            this.prob = f;
        }

        public void setSatisfied(boolean z) {
            this.satisfied = z;
        }

        public void setTag(String str) {
            this.tag = str;
        }

        public C1CategoryItem(float f, boolean z, int i) {
            setProb(f);
            setSatisfied(z);
            this.tag = VEAlgorithmResult.tags[i];
        }
    }

    public C1CategoryItem[] getCategoryItems() {
        return this.categoryItems;
    }

    public int[] getClusterIDs() {
        return this.cluster_ids;
    }

    public ArrayList<ArrayList<Integer>> getClusters() {
        return this.clusters;
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    public int getFaceCount() {
        return this.faceCount;
    }

    public float[] getFaceFeatures() {
        return this.faceFeatures;
    }

    public float getFaceScore() {
        return this.face_score;
    }

    public byte[] getFeatureByte() {
        return this.featureByte;
    }

    public float getQualityScore() {
        return this.quality_score;
    }

    public float getScore() {
        return this.score;
    }

    public float getSharpnessScore() {
        return this.sharpness_score;
    }

    public float getSimilarityScore() {
        return this.similarityScore;
    }

    public void setCategoryItems(C1CategoryItem[] c1CategoryItemArr) {
        this.categoryItems = c1CategoryItemArr;
    }

    public void setClusterIDs(int[] iArr) {
        this.cluster_ids = iArr;
    }

    public void setClusters(ArrayList<ArrayList<Integer>> arrayList) {
        this.clusters = arrayList;
    }

    public void setErrorCode(int i) {
        this.errorCode = i;
    }

    public void setFaceCount(int i) {
        this.faceCount = i;
    }

    public void setFaceFeatures(float[] fArr) {
        this.faceFeatures = fArr;
    }

    public void setFaceScore(float f) {
        this.face_score = f;
    }

    public void setFeatureByte(byte[] bArr) {
        this.featureByte = bArr;
    }

    public void setQualityScore(float f) {
        this.quality_score = f;
    }

    public void setScore(float f) {
        this.score = f;
    }

    public void setSharpnessScore(float f) {
        this.sharpness_score = f;
    }

    public void setSimilarityScore(float f) {
        this.similarityScore = f;
    }
}

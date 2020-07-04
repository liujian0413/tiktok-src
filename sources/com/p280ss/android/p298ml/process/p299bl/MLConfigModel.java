package com.p280ss.android.p298ml.process.p299bl;

import com.google.gson.p276a.C6593c;
import java.util.List;

/* renamed from: com.ss.android.ml.process.bl.MLConfigModel */
public class MLConfigModel {
    public static final String MODEL_TYPE_JPMML = "pmml";
    public static final String MODEL_TYPE_TF = "tf";
    @C6593c(mo15949a = "output")
    public AfOPModel afOPModel;
    @C6593c(mo15949a = "enable_gpu")
    public boolean enableGPU;
    @C6593c(mo15949a = "enable_nn_api")
    public boolean enableNNApi;
    @C6593c(mo15949a = "feature_list")
    public List<String> inputFeatureList;
    @C6593c(mo15949a = "input_type")
    public String inputType;
    @C6593c(mo15949a = "model_type")
    public String modelType;
    @C6593c(mo15949a = "num_threads")
    public int numThreads;
    @C6593c(mo15949a = "intput")
    public List<PreOPModel> preOPModelList;
}

// Copyright 2024 Xiaomi Corporation

package com.k2fsa.sherpa.onnx;

public class OfflineRecognizerConfig {
    private final FeatureConfig featConfig;
    private final OfflineModelConfig modelConfig;
    private final HomophoneReplacerConfig hr;
    private final String decodingMethod;
    private final int maxActivePaths;
    private final String hotwordsFile;
    private final float hotwordsScore;
    private final String ruleFsts;
    private final String ruleFars;
    private final float blankPenalty;

    private OfflineRecognizerConfig(Builder builder) {
        this.featConfig = builder.featConfig;
        this.modelConfig = builder.modelConfig;
        this.hr = builder.hr;
        this.decodingMethod = builder.decodingMethod;
        this.maxActivePaths = builder.maxActivePaths;
        this.hotwordsFile = builder.hotwordsFile;
        this.hotwordsScore = builder.hotwordsScore;
        this.ruleFsts = builder.ruleFsts;
        this.ruleFars = builder.ruleFars;
        this.blankPenalty = builder.blankPenalty;
    }

    public static Builder builder() {
        return new Builder();
    }

    public OfflineModelConfig getModelConfig() {
        return modelConfig;
    }

    public static class Builder {
        private FeatureConfig featConfig = FeatureConfig.builder().build();
        private OfflineModelConfig modelConfig = OfflineModelConfig.builder().build();
        private HomophoneReplacerConfig hr = HomophoneReplacerConfig.builder().build();
        private String decodingMethod = "greedy_search";
        private int maxActivePaths = 4;
        private String hotwordsFile = "";
        private float hotwordsScore = 1.5f;
        private String ruleFsts = "";
        private String ruleFars = "";
        private float blankPenalty = 0.0f;

        public OfflineRecognizerConfig build() {
            return new OfflineRecognizerConfig(this);
        }

        public Builder setFeatureConfig(FeatureConfig featConfig) {
            this.featConfig = featConfig;
            return this;
        }

        public Builder setOfflineModelConfig(OfflineModelConfig modelConfig) {
            this.modelConfig = modelConfig;
            return this;
        }

        public Builder setHr(HomophoneReplacerConfig hr) {
            this.hr = hr;
            return this;
        }

        public Builder setDecodingMethod(String decodingMethod) {
            this.decodingMethod = decodingMethod;
            return this;
        }

        public Builder setMaxActivePaths(int maxActivePaths) {
            this.maxActivePaths = maxActivePaths;
            return this;
        }

        public Builder setHotwordsFile(String hotwordsFile) {
            this.hotwordsFile = hotwordsFile;
            return this;
        }

        public Builder setHotwordsScore(float hotwordsScore) {
            this.hotwordsScore = hotwordsScore;
            return this;
        }

        public Builder setRuleFsts(String ruleFsts) {
            this.ruleFsts = ruleFsts;
            return this;
        }

        public Builder setRuleFars(String ruleFars) {
            this.ruleFars = ruleFars;
            return this;
        }

        public Builder setBlankPenalty(float blankPenalty) {
            this.blankPenalty = blankPenalty;
            return this;
        }
    }
}

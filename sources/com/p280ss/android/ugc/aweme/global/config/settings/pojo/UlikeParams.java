package com.p280ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.ies.settings.C10938a;
import com.bytedance.ies.settings.C10939b;
import com.bytedance.ies.settings.MissingRequiredFieldsException;
import com.squareup.wire.DefaultValueProtoAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireFieldNoEnum;
import java.io.IOException;
import okio.ByteString;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.UlikeParams */
public final class UlikeParams extends Message<UlikeParams, Builder> {
    public static final DefaultValueProtoAdapter<UlikeParams> ADAPTER = new ProtoAdapter_UlikeParams();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = 0, tag = 10)
    public final Boolean enable_beauty_makeup;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = 0, tag = 11)
    public final Boolean enable_beauty_sharpen;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", label = 0, tag = 9)
    public final Float ulike_blusher_default_value;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", label = 0, tag = 6)
    public final Float ulike_eyes_default_value;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", label = 0, tag = 7)
    public final Float ulike_eyes_max_value;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", label = 0, tag = 8)
    public final Float ulike_lip_default_value;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", label = 0, tag = 4)
    public final Float ulike_shape_default_value;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", label = 0, tag = 5)
    public final Float ulike_shape_max_value;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", label = 0, tag = 1)
    public final Float ulike_sharpen_default_value;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", label = 0, tag = 2)
    public final Float ulike_smooth_default_value;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", label = 0, tag = 3)
    public final Float ulike_smooth_max_value;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.UlikeParams$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<UlikeParams, Builder> {
        public Boolean enable_beauty_makeup;
        public Boolean enable_beauty_sharpen;
        public Float ulike_blusher_default_value;
        public Float ulike_eyes_default_value;
        public Float ulike_eyes_max_value;
        public Float ulike_lip_default_value;
        public Float ulike_shape_default_value;
        public Float ulike_shape_max_value;
        public Float ulike_sharpen_default_value;
        public Float ulike_smooth_default_value;
        public Float ulike_smooth_max_value;

        public final UlikeParams build() {
            if (this.ulike_sharpen_default_value == null || this.ulike_smooth_default_value == null || this.ulike_smooth_max_value == null || this.ulike_shape_default_value == null || this.ulike_shape_max_value == null || this.ulike_eyes_default_value == null || this.ulike_eyes_max_value == null || this.ulike_lip_default_value == null || this.ulike_blusher_default_value == null || this.enable_beauty_makeup == null || this.enable_beauty_sharpen == null) {
                throw C10939b.m32101a(this.ulike_sharpen_default_value, "ulike_sharpen_default_value", this.ulike_smooth_default_value, "ulike_smooth_default_value", this.ulike_smooth_max_value, "ulike_smooth_max_value", this.ulike_shape_default_value, "ulike_shape_default_value", this.ulike_shape_max_value, "ulike_shape_max_value", this.ulike_eyes_default_value, "ulike_eyes_default_value", this.ulike_eyes_max_value, "ulike_eyes_max_value", this.ulike_lip_default_value, "ulike_lip_default_value", this.ulike_blusher_default_value, "ulike_blusher_default_value", this.enable_beauty_makeup, "enable_beauty_makeup", this.enable_beauty_sharpen, "enable_beauty_sharpen");
            }
            UlikeParams ulikeParams = new UlikeParams(this.ulike_sharpen_default_value, this.ulike_smooth_default_value, this.ulike_smooth_max_value, this.ulike_shape_default_value, this.ulike_shape_max_value, this.ulike_eyes_default_value, this.ulike_eyes_max_value, this.ulike_lip_default_value, this.ulike_blusher_default_value, this.enable_beauty_makeup, this.enable_beauty_sharpen, super.buildUnknownFields());
            return ulikeParams;
        }

        public final Builder enable_beauty_makeup(Boolean bool) {
            this.enable_beauty_makeup = bool;
            return this;
        }

        public final Builder enable_beauty_sharpen(Boolean bool) {
            this.enable_beauty_sharpen = bool;
            return this;
        }

        public final Builder ulike_blusher_default_value(Float f) {
            this.ulike_blusher_default_value = f;
            return this;
        }

        public final Builder ulike_eyes_default_value(Float f) {
            this.ulike_eyes_default_value = f;
            return this;
        }

        public final Builder ulike_eyes_max_value(Float f) {
            this.ulike_eyes_max_value = f;
            return this;
        }

        public final Builder ulike_lip_default_value(Float f) {
            this.ulike_lip_default_value = f;
            return this;
        }

        public final Builder ulike_shape_default_value(Float f) {
            this.ulike_shape_default_value = f;
            return this;
        }

        public final Builder ulike_shape_max_value(Float f) {
            this.ulike_shape_max_value = f;
            return this;
        }

        public final Builder ulike_sharpen_default_value(Float f) {
            this.ulike_sharpen_default_value = f;
            return this;
        }

        public final Builder ulike_smooth_default_value(Float f) {
            this.ulike_smooth_default_value = f;
            return this;
        }

        public final Builder ulike_smooth_max_value(Float f) {
            this.ulike_smooth_max_value = f;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.UlikeParams$ProtoAdapter_UlikeParams */
    static final class ProtoAdapter_UlikeParams extends DefaultValueProtoAdapter<UlikeParams> {
        public final UlikeParams redact(UlikeParams ulikeParams) {
            return ulikeParams;
        }

        public ProtoAdapter_UlikeParams() {
            super(FieldEncoding.LENGTH_DELIMITED, UlikeParams.class);
        }

        public final UlikeParams decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (UlikeParams) null);
        }

        public final int encodedSize(UlikeParams ulikeParams) {
            return ProtoAdapter.FLOAT.encodedSizeWithTag(1, ulikeParams.ulike_sharpen_default_value) + ProtoAdapter.FLOAT.encodedSizeWithTag(2, ulikeParams.ulike_smooth_default_value) + ProtoAdapter.FLOAT.encodedSizeWithTag(3, ulikeParams.ulike_smooth_max_value) + ProtoAdapter.FLOAT.encodedSizeWithTag(4, ulikeParams.ulike_shape_default_value) + ProtoAdapter.FLOAT.encodedSizeWithTag(5, ulikeParams.ulike_shape_max_value) + ProtoAdapter.FLOAT.encodedSizeWithTag(6, ulikeParams.ulike_eyes_default_value) + ProtoAdapter.FLOAT.encodedSizeWithTag(7, ulikeParams.ulike_eyes_max_value) + ProtoAdapter.FLOAT.encodedSizeWithTag(8, ulikeParams.ulike_lip_default_value) + ProtoAdapter.FLOAT.encodedSizeWithTag(9, ulikeParams.ulike_blusher_default_value) + ProtoAdapter.BOOL.encodedSizeWithTag(10, ulikeParams.enable_beauty_makeup) + ProtoAdapter.BOOL.encodedSizeWithTag(11, ulikeParams.enable_beauty_sharpen) + ulikeParams.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, UlikeParams ulikeParams) throws IOException {
            ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 1, ulikeParams.ulike_sharpen_default_value);
            ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 2, ulikeParams.ulike_smooth_default_value);
            ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 3, ulikeParams.ulike_smooth_max_value);
            ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 4, ulikeParams.ulike_shape_default_value);
            ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 5, ulikeParams.ulike_shape_max_value);
            ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 6, ulikeParams.ulike_eyes_default_value);
            ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 7, ulikeParams.ulike_eyes_max_value);
            ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 8, ulikeParams.ulike_lip_default_value);
            ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 9, ulikeParams.ulike_blusher_default_value);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 10, ulikeParams.enable_beauty_makeup);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 11, ulikeParams.enable_beauty_sharpen);
            protoWriter.writeBytes(ulikeParams.unknownFields());
        }

        public final UlikeParams decode(ProtoReader protoReader, UlikeParams ulikeParams) throws IOException {
            Builder builder;
            UlikeParams ulikeParams2 = (UlikeParams) C10938a.m32097a().mo26425a(UlikeParams.class, ulikeParams);
            if (ulikeParams2 != null) {
                builder = ulikeParams2.newBuilder();
            } else {
                builder = new Builder();
            }
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.ulike_sharpen_default_value((Float) ProtoAdapter.FLOAT.decode(protoReader));
                            break;
                        case 2:
                            builder.ulike_smooth_default_value((Float) ProtoAdapter.FLOAT.decode(protoReader));
                            break;
                        case 3:
                            builder.ulike_smooth_max_value((Float) ProtoAdapter.FLOAT.decode(protoReader));
                            break;
                        case 4:
                            builder.ulike_shape_default_value((Float) ProtoAdapter.FLOAT.decode(protoReader));
                            break;
                        case 5:
                            builder.ulike_shape_max_value((Float) ProtoAdapter.FLOAT.decode(protoReader));
                            break;
                        case 6:
                            builder.ulike_eyes_default_value((Float) ProtoAdapter.FLOAT.decode(protoReader));
                            break;
                        case 7:
                            builder.ulike_eyes_max_value((Float) ProtoAdapter.FLOAT.decode(protoReader));
                            break;
                        case 8:
                            builder.ulike_lip_default_value((Float) ProtoAdapter.FLOAT.decode(protoReader));
                            break;
                        case 9:
                            builder.ulike_blusher_default_value((Float) ProtoAdapter.FLOAT.decode(protoReader));
                            break;
                        case 10:
                            builder.enable_beauty_makeup((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 11:
                            builder.enable_beauty_sharpen((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                break;
                            } catch (MissingRequiredFieldsException e) {
                                if (ulikeParams2 != null) {
                                    break;
                                } else {
                                    throw e;
                                }
                            }
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                }
            }
        }
    }

    public final Boolean getEnableBeautyMakeup() {
        return this.enable_beauty_makeup;
    }

    public final Boolean getEnableBeautySharpen() {
        return this.enable_beauty_sharpen;
    }

    public final Float getUlikeBlusherDefaultValue() {
        return this.ulike_blusher_default_value;
    }

    public final Float getUlikeEyesDefaultValue() {
        return this.ulike_eyes_default_value;
    }

    public final Float getUlikeEyesMaxValue() {
        return this.ulike_eyes_max_value;
    }

    public final Float getUlikeLipDefaultValue() {
        return this.ulike_lip_default_value;
    }

    public final Float getUlikeShapeDefaultValue() {
        return this.ulike_shape_default_value;
    }

    public final Float getUlikeShapeMaxValue() {
        return this.ulike_shape_max_value;
    }

    public final Float getUlikeSharpenDefaultValue() {
        return this.ulike_sharpen_default_value;
    }

    public final Float getUlikeSmoothDefaultValue() {
        return this.ulike_smooth_default_value;
    }

    public final Float getUlikeSmoothMaxValue() {
        return this.ulike_smooth_max_value;
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.ulike_sharpen_default_value = this.ulike_sharpen_default_value;
        builder.ulike_smooth_default_value = this.ulike_smooth_default_value;
        builder.ulike_smooth_max_value = this.ulike_smooth_max_value;
        builder.ulike_shape_default_value = this.ulike_shape_default_value;
        builder.ulike_shape_max_value = this.ulike_shape_max_value;
        builder.ulike_eyes_default_value = this.ulike_eyes_default_value;
        builder.ulike_eyes_max_value = this.ulike_eyes_max_value;
        builder.ulike_lip_default_value = this.ulike_lip_default_value;
        builder.ulike_blusher_default_value = this.ulike_blusher_default_value;
        builder.enable_beauty_makeup = this.enable_beauty_makeup;
        builder.enable_beauty_sharpen = this.enable_beauty_sharpen;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = (((((((((((((((((((((unknownFields().hashCode() * 37) + this.ulike_sharpen_default_value.hashCode()) * 37) + this.ulike_smooth_default_value.hashCode()) * 37) + this.ulike_smooth_max_value.hashCode()) * 37) + this.ulike_shape_default_value.hashCode()) * 37) + this.ulike_shape_max_value.hashCode()) * 37) + this.ulike_eyes_default_value.hashCode()) * 37) + this.ulike_eyes_max_value.hashCode()) * 37) + this.ulike_lip_default_value.hashCode()) * 37) + this.ulike_blusher_default_value.hashCode()) * 37) + this.enable_beauty_makeup.hashCode()) * 37) + this.enable_beauty_sharpen.hashCode();
        this.hashCode = hashCode;
        return hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", ulike_sharpen_default_value=");
        sb.append(this.ulike_sharpen_default_value);
        sb.append(", ulike_smooth_default_value=");
        sb.append(this.ulike_smooth_default_value);
        sb.append(", ulike_smooth_max_value=");
        sb.append(this.ulike_smooth_max_value);
        sb.append(", ulike_shape_default_value=");
        sb.append(this.ulike_shape_default_value);
        sb.append(", ulike_shape_max_value=");
        sb.append(this.ulike_shape_max_value);
        sb.append(", ulike_eyes_default_value=");
        sb.append(this.ulike_eyes_default_value);
        sb.append(", ulike_eyes_max_value=");
        sb.append(this.ulike_eyes_max_value);
        sb.append(", ulike_lip_default_value=");
        sb.append(this.ulike_lip_default_value);
        sb.append(", ulike_blusher_default_value=");
        sb.append(this.ulike_blusher_default_value);
        sb.append(", enable_beauty_makeup=");
        sb.append(this.enable_beauty_makeup);
        sb.append(", enable_beauty_sharpen=");
        sb.append(this.enable_beauty_sharpen);
        StringBuilder replace = sb.replace(0, 2, "UlikeParams{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UlikeParams)) {
            return false;
        }
        UlikeParams ulikeParams = (UlikeParams) obj;
        if (!unknownFields().equals(ulikeParams.unknownFields()) || !this.ulike_sharpen_default_value.equals(ulikeParams.ulike_sharpen_default_value) || !this.ulike_smooth_default_value.equals(ulikeParams.ulike_smooth_default_value) || !this.ulike_smooth_max_value.equals(ulikeParams.ulike_smooth_max_value) || !this.ulike_shape_default_value.equals(ulikeParams.ulike_shape_default_value) || !this.ulike_shape_max_value.equals(ulikeParams.ulike_shape_max_value) || !this.ulike_eyes_default_value.equals(ulikeParams.ulike_eyes_default_value) || !this.ulike_eyes_max_value.equals(ulikeParams.ulike_eyes_max_value) || !this.ulike_lip_default_value.equals(ulikeParams.ulike_lip_default_value) || !this.ulike_blusher_default_value.equals(ulikeParams.ulike_blusher_default_value) || !this.enable_beauty_makeup.equals(ulikeParams.enable_beauty_makeup) || !this.enable_beauty_sharpen.equals(ulikeParams.enable_beauty_sharpen)) {
            return false;
        }
        return true;
    }

    public UlikeParams(Float f, Float f2, Float f3, Float f4, Float f5, Float f6, Float f7, Float f8, Float f9, Boolean bool, Boolean bool2) {
        this(f, f2, f3, f4, f5, f6, f7, f8, f9, bool, bool2, ByteString.EMPTY);
    }

    public UlikeParams(Float f, Float f2, Float f3, Float f4, Float f5, Float f6, Float f7, Float f8, Float f9, Boolean bool, Boolean bool2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.ulike_sharpen_default_value = f;
        this.ulike_smooth_default_value = f2;
        this.ulike_smooth_max_value = f3;
        this.ulike_shape_default_value = f4;
        this.ulike_shape_max_value = f5;
        this.ulike_eyes_default_value = f6;
        this.ulike_eyes_max_value = f7;
        this.ulike_lip_default_value = f8;
        this.ulike_blusher_default_value = f9;
        this.enable_beauty_makeup = bool;
        this.enable_beauty_sharpen = bool2;
    }
}

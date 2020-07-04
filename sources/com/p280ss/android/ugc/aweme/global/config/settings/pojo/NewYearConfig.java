package com.p280ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.ies.NullValueException;
import com.bytedance.ies.settings.C10938a;
import com.bytedance.ies.settings.MissingRequiredFieldsException;
import com.squareup.wire.DefaultValueProtoAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireFieldNoEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.NewYearConfig */
public final class NewYearConfig extends Message<NewYearConfig, Builder> {
    public static final DefaultValueProtoAdapter<NewYearConfig> ADAPTER = new ProtoAdapter_NewYearConfig();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 5)
    public final Integer auto_fold_vv_count;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 7)
    public final Boolean disabled;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 4)
    public final Integer max_amount;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String newyear_test_domain;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 1)
    public final Boolean newyear_test_switch;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 3)
    public final Boolean show_newyear_fresh_button;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 6)
    public final String token;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.NewYearConfig$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<NewYearConfig, Builder> {
        public Integer auto_fold_vv_count;
        public Boolean disabled;
        public Integer max_amount;
        public String newyear_test_domain;
        public Boolean newyear_test_switch;
        public Boolean show_newyear_fresh_button;
        public String token;

        public final NewYearConfig build() {
            NewYearConfig newYearConfig = new NewYearConfig(this.newyear_test_switch, this.newyear_test_domain, this.show_newyear_fresh_button, this.max_amount, this.auto_fold_vv_count, this.token, this.disabled, super.buildUnknownFields());
            return newYearConfig;
        }

        public final Builder auto_fold_vv_count(Integer num) {
            this.auto_fold_vv_count = num;
            return this;
        }

        public final Builder disabled(Boolean bool) {
            this.disabled = bool;
            return this;
        }

        public final Builder max_amount(Integer num) {
            this.max_amount = num;
            return this;
        }

        public final Builder newyear_test_domain(String str) {
            this.newyear_test_domain = str;
            return this;
        }

        public final Builder newyear_test_switch(Boolean bool) {
            this.newyear_test_switch = bool;
            return this;
        }

        public final Builder show_newyear_fresh_button(Boolean bool) {
            this.show_newyear_fresh_button = bool;
            return this;
        }

        public final Builder token(String str) {
            this.token = str;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.NewYearConfig$ProtoAdapter_NewYearConfig */
    static final class ProtoAdapter_NewYearConfig extends DefaultValueProtoAdapter<NewYearConfig> {
        public final NewYearConfig redact(NewYearConfig newYearConfig) {
            return newYearConfig;
        }

        public ProtoAdapter_NewYearConfig() {
            super(FieldEncoding.LENGTH_DELIMITED, NewYearConfig.class);
        }

        public final NewYearConfig decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (NewYearConfig) null);
        }

        public final int encodedSize(NewYearConfig newYearConfig) {
            return ProtoAdapter.BOOL.encodedSizeWithTag(1, newYearConfig.newyear_test_switch) + ProtoAdapter.STRING.encodedSizeWithTag(2, newYearConfig.newyear_test_domain) + ProtoAdapter.BOOL.encodedSizeWithTag(3, newYearConfig.show_newyear_fresh_button) + ProtoAdapter.INT32.encodedSizeWithTag(4, newYearConfig.max_amount) + ProtoAdapter.INT32.encodedSizeWithTag(5, newYearConfig.auto_fold_vv_count) + ProtoAdapter.STRING.encodedSizeWithTag(6, newYearConfig.token) + ProtoAdapter.BOOL.encodedSizeWithTag(7, newYearConfig.disabled) + newYearConfig.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, NewYearConfig newYearConfig) throws IOException {
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, newYearConfig.newyear_test_switch);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, newYearConfig.newyear_test_domain);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, newYearConfig.show_newyear_fresh_button);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, newYearConfig.max_amount);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, newYearConfig.auto_fold_vv_count);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, newYearConfig.token);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 7, newYearConfig.disabled);
            protoWriter.writeBytes(newYearConfig.unknownFields());
        }

        public final NewYearConfig decode(ProtoReader protoReader, NewYearConfig newYearConfig) throws IOException {
            Builder builder;
            NewYearConfig newYearConfig2 = (NewYearConfig) C10938a.m32097a().mo26425a(NewYearConfig.class, newYearConfig);
            if (newYearConfig2 != null) {
                builder = newYearConfig2.newBuilder();
            } else {
                builder = new Builder();
            }
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.newyear_test_switch((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 2:
                            builder.newyear_test_domain((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            builder.show_newyear_fresh_button((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 4:
                            builder.max_amount((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 5:
                            builder.auto_fold_vv_count((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 6:
                            builder.token((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 7:
                            builder.disabled((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                break;
                            } catch (MissingRequiredFieldsException e) {
                                if (newYearConfig2 != null) {
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

    public final Integer getAutoFoldVvCount() throws NullValueException {
        if (this.auto_fold_vv_count != null) {
            return this.auto_fold_vv_count;
        }
        throw new NullValueException();
    }

    public final Boolean getDisabled() throws NullValueException {
        if (this.disabled != null) {
            return this.disabled;
        }
        throw new NullValueException();
    }

    public final Integer getMaxAmount() throws NullValueException {
        if (this.max_amount != null) {
            return this.max_amount;
        }
        throw new NullValueException();
    }

    public final String getNewyearTestDomain() throws NullValueException {
        if (this.newyear_test_domain != null) {
            return this.newyear_test_domain;
        }
        throw new NullValueException();
    }

    public final Boolean getNewyearTestSwitch() throws NullValueException {
        if (this.newyear_test_switch != null) {
            return this.newyear_test_switch;
        }
        throw new NullValueException();
    }

    public final Boolean getShowNewyearFreshButton() throws NullValueException {
        if (this.show_newyear_fresh_button != null) {
            return this.show_newyear_fresh_button;
        }
        throw new NullValueException();
    }

    public final String getToken() throws NullValueException {
        if (this.token != null) {
            return this.token;
        }
        throw new NullValueException();
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.newyear_test_switch = this.newyear_test_switch;
        builder.newyear_test_domain = this.newyear_test_domain;
        builder.show_newyear_fresh_button = this.show_newyear_fresh_button;
        builder.max_amount = this.max_amount;
        builder.auto_fold_vv_count = this.auto_fold_vv_count;
        builder.token = this.token;
        builder.disabled = this.disabled;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = this.hashCode;
        if (i7 != 0) {
            return i7;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i8 = 0;
        if (this.newyear_test_switch != null) {
            i = this.newyear_test_switch.hashCode();
        } else {
            i = 0;
        }
        int i9 = (hashCode + i) * 37;
        if (this.newyear_test_domain != null) {
            i2 = this.newyear_test_domain.hashCode();
        } else {
            i2 = 0;
        }
        int i10 = (i9 + i2) * 37;
        if (this.show_newyear_fresh_button != null) {
            i3 = this.show_newyear_fresh_button.hashCode();
        } else {
            i3 = 0;
        }
        int i11 = (i10 + i3) * 37;
        if (this.max_amount != null) {
            i4 = this.max_amount.hashCode();
        } else {
            i4 = 0;
        }
        int i12 = (i11 + i4) * 37;
        if (this.auto_fold_vv_count != null) {
            i5 = this.auto_fold_vv_count.hashCode();
        } else {
            i5 = 0;
        }
        int i13 = (i12 + i5) * 37;
        if (this.token != null) {
            i6 = this.token.hashCode();
        } else {
            i6 = 0;
        }
        int i14 = (i13 + i6) * 37;
        if (this.disabled != null) {
            i8 = this.disabled.hashCode();
        }
        int i15 = i14 + i8;
        this.hashCode = i15;
        return i15;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.newyear_test_switch != null) {
            sb.append(", newyear_test_switch=");
            sb.append(this.newyear_test_switch);
        }
        if (this.newyear_test_domain != null) {
            sb.append(", newyear_test_domain=");
            sb.append(this.newyear_test_domain);
        }
        if (this.show_newyear_fresh_button != null) {
            sb.append(", show_newyear_fresh_button=");
            sb.append(this.show_newyear_fresh_button);
        }
        if (this.max_amount != null) {
            sb.append(", max_amount=");
            sb.append(this.max_amount);
        }
        if (this.auto_fold_vv_count != null) {
            sb.append(", auto_fold_vv_count=");
            sb.append(this.auto_fold_vv_count);
        }
        if (this.token != null) {
            sb.append(", token=");
            sb.append(this.token);
        }
        if (this.disabled != null) {
            sb.append(", disabled=");
            sb.append(this.disabled);
        }
        StringBuilder replace = sb.replace(0, 2, "NewYearConfig{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NewYearConfig)) {
            return false;
        }
        NewYearConfig newYearConfig = (NewYearConfig) obj;
        if (!unknownFields().equals(newYearConfig.unknownFields()) || !Internal.equals(this.newyear_test_switch, newYearConfig.newyear_test_switch) || !Internal.equals(this.newyear_test_domain, newYearConfig.newyear_test_domain) || !Internal.equals(this.show_newyear_fresh_button, newYearConfig.show_newyear_fresh_button) || !Internal.equals(this.max_amount, newYearConfig.max_amount) || !Internal.equals(this.auto_fold_vv_count, newYearConfig.auto_fold_vv_count) || !Internal.equals(this.token, newYearConfig.token) || !Internal.equals(this.disabled, newYearConfig.disabled)) {
            return false;
        }
        return true;
    }

    public NewYearConfig(Boolean bool, String str, Boolean bool2, Integer num, Integer num2, String str2, Boolean bool3) {
        this(bool, str, bool2, num, num2, str2, bool3, ByteString.EMPTY);
    }

    public NewYearConfig(Boolean bool, String str, Boolean bool2, Integer num, Integer num2, String str2, Boolean bool3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.newyear_test_switch = bool;
        this.newyear_test_domain = str;
        this.show_newyear_fresh_button = bool2;
        this.max_amount = num;
        this.auto_fold_vv_count = num2;
        this.token = str2;
        this.disabled = bool3;
    }
}

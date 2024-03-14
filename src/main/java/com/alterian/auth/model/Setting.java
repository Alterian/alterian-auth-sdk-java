/*
 * Authentication API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 6.35.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.alterian.auth.model;

import java.util.Objects;
import com.alterian.auth.model.SettingAppliesTo;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.alterian.auth.JSON;

/**
 * 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class Setting {
  public static final String SERIALIZED_NAME_I_D = "ID";
  @SerializedName(SERIALIZED_NAME_I_D)
  private Integer ID;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_APPLIES_TO = "AppliesTo";
  @SerializedName(SERIALIZED_NAME_APPLIES_TO)
  private SettingAppliesTo appliesTo;

  public static final String SERIALIZED_NAME_IS_SYSTEM = "IsSystem";
  @SerializedName(SERIALIZED_NAME_IS_SYSTEM)
  private Boolean isSystem;

  public static final String SERIALIZED_NAME_VALUE = "Value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public Setting() {
  }

  public Setting ID(Integer ID) {
    this.ID = ID;
    return this;
  }

   /**
   * Id of the setting
   * @return ID
  **/
  @javax.annotation.Nullable
  public Integer getID() {
    return ID;
  }

  public void setID(Integer ID) {
    this.ID = ID;
  }


  public Setting name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the setting, must be unique
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public Setting appliesTo(SettingAppliesTo appliesTo) {
    this.appliesTo = appliesTo;
    return this;
  }

   /**
   * Get appliesTo
   * @return appliesTo
  **/
  @javax.annotation.Nullable
  public SettingAppliesTo getAppliesTo() {
    return appliesTo;
  }

  public void setAppliesTo(SettingAppliesTo appliesTo) {
    this.appliesTo = appliesTo;
  }


  public Setting isSystem(Boolean isSystem) {
    this.isSystem = isSystem;
    return this;
  }

   /**
   * Is this a system setting?  if so, any attempts to modify it will result in an AccessDenied error.  You can create a setting with IsSystem but, once created, you will not be able to change it [or delete it]
   * @return isSystem
  **/
  @javax.annotation.Nullable
  public Boolean getIsSystem() {
    return isSystem;
  }

  public void setIsSystem(Boolean isSystem) {
    this.isSystem = isSystem;
  }


  public Setting value(String value) {
    this.value = value;
    return this;
  }

   /**
   * This is only filled in with a call to @see(GetSettingsValues).  It is ignored when creating settings
   * @return value
  **/
  @javax.annotation.Nullable
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Setting setting = (Setting) o;
    return Objects.equals(this.ID, setting.ID) &&
        Objects.equals(this.name, setting.name) &&
        Objects.equals(this.appliesTo, setting.appliesTo) &&
        Objects.equals(this.isSystem, setting.isSystem) &&
        Objects.equals(this.value, setting.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ID, name, appliesTo, isSystem, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Setting {\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    appliesTo: ").append(toIndentedString(appliesTo)).append("\n");
    sb.append("    isSystem: ").append(toIndentedString(isSystem)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("ID");
    openapiFields.add("Name");
    openapiFields.add("AppliesTo");
    openapiFields.add("IsSystem");
    openapiFields.add("Value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Setting
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Setting.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Setting is not found in the empty JSON string", Setting.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Setting.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Setting` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("Name") != null && !jsonObj.get("Name").isJsonNull()) && !jsonObj.get("Name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Name").toString()));
      }
      // validate the optional field `AppliesTo`
      if (jsonObj.get("AppliesTo") != null && !jsonObj.get("AppliesTo").isJsonNull()) {
        SettingAppliesTo.validateJsonElement(jsonObj.get("AppliesTo"));
      }
      if ((jsonObj.get("Value") != null && !jsonObj.get("Value").isJsonNull()) && !jsonObj.get("Value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Value").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Setting.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Setting' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Setting> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Setting.class));

       return (TypeAdapter<T>) new TypeAdapter<Setting>() {
           @Override
           public void write(JsonWriter out, Setting value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Setting read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Setting given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Setting
  * @throws IOException if the JSON string is invalid with respect to Setting
  */
  public static Setting fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Setting.class);
  }

 /**
  * Convert an instance of Setting to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

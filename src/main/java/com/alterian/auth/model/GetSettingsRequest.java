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
import com.alterian.auth.model.APICursor;
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
 * GetSettingsRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class GetSettingsRequest {
  public static final String SERIALIZED_NAME_APPLIES_TO = "AppliesTo";
  @SerializedName(SERIALIZED_NAME_APPLIES_TO)
  private SettingAppliesTo appliesTo;

  public static final String SERIALIZED_NAME_CURSOR = "Cursor";
  @SerializedName(SERIALIZED_NAME_CURSOR)
  private APICursor cursor;

  public GetSettingsRequest() {
  }

  public GetSettingsRequest appliesTo(SettingAppliesTo appliesTo) {
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


  public GetSettingsRequest cursor(APICursor cursor) {
    this.cursor = cursor;
    return this;
  }

   /**
   * Get cursor
   * @return cursor
  **/
  @javax.annotation.Nullable
  public APICursor getCursor() {
    return cursor;
  }

  public void setCursor(APICursor cursor) {
    this.cursor = cursor;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetSettingsRequest getSettingsRequest = (GetSettingsRequest) o;
    return Objects.equals(this.appliesTo, getSettingsRequest.appliesTo) &&
        Objects.equals(this.cursor, getSettingsRequest.cursor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appliesTo, cursor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetSettingsRequest {\n");
    sb.append("    appliesTo: ").append(toIndentedString(appliesTo)).append("\n");
    sb.append("    cursor: ").append(toIndentedString(cursor)).append("\n");
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
    openapiFields.add("AppliesTo");
    openapiFields.add("Cursor");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to GetSettingsRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetSettingsRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetSettingsRequest is not found in the empty JSON string", GetSettingsRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetSettingsRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetSettingsRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `AppliesTo`
      if (jsonObj.get("AppliesTo") != null && !jsonObj.get("AppliesTo").isJsonNull()) {
        SettingAppliesTo.validateJsonElement(jsonObj.get("AppliesTo"));
      }
      // validate the optional field `Cursor`
      if (jsonObj.get("Cursor") != null && !jsonObj.get("Cursor").isJsonNull()) {
        APICursor.validateJsonElement(jsonObj.get("Cursor"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetSettingsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetSettingsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetSettingsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetSettingsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<GetSettingsRequest>() {
           @Override
           public void write(JsonWriter out, GetSettingsRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetSettingsRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetSettingsRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetSettingsRequest
  * @throws IOException if the JSON string is invalid with respect to GetSettingsRequest
  */
  public static GetSettingsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetSettingsRequest.class);
  }

 /**
  * Convert an instance of GetSettingsRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


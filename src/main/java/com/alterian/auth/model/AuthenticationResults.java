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
import com.alterian.auth.model.Applications;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

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
public class AuthenticationResults {
  public static final String SERIALIZED_NAME_TOKEN = "Token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private UUID token;

  public static final String SERIALIZED_NAME_LOGIN_I_D = "LoginID";
  @SerializedName(SERIALIZED_NAME_LOGIN_I_D)
  private UUID loginID;

  public static final String SERIALIZED_NAME_SITES = "Sites";
  @SerializedName(SERIALIZED_NAME_SITES)
  private Map<String, Applications> sites = new HashMap<>();

  public static final String SERIALIZED_NAME_PASSWORD_EXPIRED = "PasswordExpired";
  @SerializedName(SERIALIZED_NAME_PASSWORD_EXPIRED)
  private Boolean passwordExpired;

  public AuthenticationResults() {
  }

  public AuthenticationResults token(UUID token) {
    this.token = token;
    return this;
  }

   /**
   * 
   * @return token
  **/
  @javax.annotation.Nullable
  public UUID getToken() {
    return token;
  }

  public void setToken(UUID token) {
    this.token = token;
  }


  public AuthenticationResults loginID(UUID loginID) {
    this.loginID = loginID;
    return this;
  }

   /**
   * 
   * @return loginID
  **/
  @javax.annotation.Nullable
  public UUID getLoginID() {
    return loginID;
  }

  public void setLoginID(UUID loginID) {
    this.loginID = loginID;
  }


  public AuthenticationResults sites(Map<String, Applications> sites) {
    this.sites = sites;
    return this;
  }

  public AuthenticationResults putSitesItem(String key, Applications sitesItem) {
    if (this.sites == null) {
      this.sites = new HashMap<>();
    }
    this.sites.put(key, sitesItem);
    return this;
  }

   /**
   * 
   * @return sites
  **/
  @javax.annotation.Nullable
  public Map<String, Applications> getSites() {
    return sites;
  }

  public void setSites(Map<String, Applications> sites) {
    this.sites = sites;
  }


  public AuthenticationResults passwordExpired(Boolean passwordExpired) {
    this.passwordExpired = passwordExpired;
    return this;
  }

   /**
   * 
   * @return passwordExpired
  **/
  @javax.annotation.Nullable
  public Boolean getPasswordExpired() {
    return passwordExpired;
  }

  public void setPasswordExpired(Boolean passwordExpired) {
    this.passwordExpired = passwordExpired;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthenticationResults authenticationResults = (AuthenticationResults) o;
    return Objects.equals(this.token, authenticationResults.token) &&
        Objects.equals(this.loginID, authenticationResults.loginID) &&
        Objects.equals(this.sites, authenticationResults.sites) &&
        Objects.equals(this.passwordExpired, authenticationResults.passwordExpired);
  }

  @Override
  public int hashCode() {
    return Objects.hash(token, loginID, sites, passwordExpired);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthenticationResults {\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    loginID: ").append(toIndentedString(loginID)).append("\n");
    sb.append("    sites: ").append(toIndentedString(sites)).append("\n");
    sb.append("    passwordExpired: ").append(toIndentedString(passwordExpired)).append("\n");
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
    openapiFields.add("Token");
    openapiFields.add("LoginID");
    openapiFields.add("Sites");
    openapiFields.add("PasswordExpired");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AuthenticationResults
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AuthenticationResults.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AuthenticationResults is not found in the empty JSON string", AuthenticationResults.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AuthenticationResults.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AuthenticationResults` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("Token") != null && !jsonObj.get("Token").isJsonNull()) && !jsonObj.get("Token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Token").toString()));
      }
      if ((jsonObj.get("LoginID") != null && !jsonObj.get("LoginID").isJsonNull()) && !jsonObj.get("LoginID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `LoginID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("LoginID").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AuthenticationResults.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AuthenticationResults' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AuthenticationResults> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AuthenticationResults.class));

       return (TypeAdapter<T>) new TypeAdapter<AuthenticationResults>() {
           @Override
           public void write(JsonWriter out, AuthenticationResults value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AuthenticationResults read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AuthenticationResults given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AuthenticationResults
  * @throws IOException if the JSON string is invalid with respect to AuthenticationResults
  */
  public static AuthenticationResults fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AuthenticationResults.class);
  }

 /**
  * Convert an instance of AuthenticationResults to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

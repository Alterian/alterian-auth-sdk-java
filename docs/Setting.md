

# Setting



## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ID** | **Integer** | Id of the setting |  [optional] |
|**name** | **String** | Name of the setting, must be unique |  [optional] |
|**appliesTo** | **SettingAppliesTo** |  |  [optional] |
|**isSystem** | **Boolean** | Is this a system setting?  if so, any attempts to modify it will result in an AccessDenied error.  You can create a setting with IsSystem but, once created, you will not be able to change it [or delete it] |  [optional] |
|**value** | **String** | This is only filled in with a call to @see(GetSettingsValues).  It is ignored when creating settings |  [optional] |




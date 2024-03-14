

# UpdateLoginExRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**externalAuthentication** | **Boolean** | Should this login be exteral authenticated |  [optional] |
|**loginId** | **UUID** | Id of the login |  [optional] |
|**name** | **String** | Name of the login |  [optional] |
|**newPassword** | **String** | If you want to reset the password, provide it here.  If ExternalAuth is true, this property is ignored. |  [optional] |
|**settings** | [**List&lt;SettingValue&gt;**](SettingValue.md) | Settings to apply to the login |  [optional] |




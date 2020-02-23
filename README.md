# profile-repository

开箱即用的用户profile的存储解决方案，提供绝大多数用户的属性支持。

## 使用方式

该项目维护了一个Profile对象，该对象存储着用户档案中几乎所有的属性。
使用时只需要根据主键取出Profile对象，使用一个或多个其中的属性即可。
  
## 接口

项目使用dubbo作为rpc接口。
您可以在很短的时间内在linux系统中运行该项目，并且通过dubbo对该项目进行远程调用。

## 支持的用户档案属性列表

|字段名称|属性|
|---|---|
|sn|姓|
|givenName|名|
|initials|英文缩写|
|displayName|显示名称|
|telephoneNumber|手机号|
|wwwHomepage|个人主页|
|email|电子邮箱号|
|country|国家|
|province|省|
|city|市|
|street|街道|
|consigneeAddress|收件地址|
|faxNumber|传真号码|
|identityCardNumber|身份证号码|
|identityCardType|身份证类型|
|remark|备注|
  
  




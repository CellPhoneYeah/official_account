package com.shotacon.wx.config.constant;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class WxConfig {

	@Value("${wx.token}")
	private String token;
	@Value("${wx.appid}")
	private String appid;
	@Value("${wx.appsecret}")
	private String appsecret;
	@Value("${wx.encodingAESKey}")
	private String encodingAESKey;

}
